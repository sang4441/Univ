var groupId = document.URL.match(/(\d*)#/)[1];
var GroupEventModel = Backbone.Model.extend({
});
var GroupEventCollection = Backbone.Collection.extend({
    model: GroupEventModel,

    url: '/Univ/group/'+groupId+'/event'
});
var GroupEventList = Backbone.View.extend({
    el: '.content-right',

    events: {
        'click #create-event' : 'eventForm'
    },

    initialize: function() {
        var self = this;
        $(this.el).empty();
        $(this.el).append(tpl.get('group/event_header'));

        this.groupEventCollection = new GroupEventCollection();
        this.groupEventCollection.fetch({
            success: function() {
                self.render();
            },
            error: function(model, xhr, options) {
                console.log(xhr.status);
            }
        });
    },

    render: function() {
        var self = this;
        var template = Handlebars.compile(tpl.get('group/event'));
        this.groupEventCollection.each(function(event) {
            var monthNames = [ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" ];
            var event_date = new Date(event.get('date_event'));
            if (event_date > new Date()) {
                event.set('event_passed', false);
            } else {
                event.set('event_passed', true);
            }
            event.set('month', monthNames[event_date.getMonth()]);
            event.set('year', event_date.getFullYear()-2000);
            event.set('day', event_date.getDate());
            event.set('day_suffix', self.findDaySuffix(event_date.getDate()));
            event.set('time', self.findTime(event_date.getHours(), event_date.getMinutes()));
            var html = template(event.attributes);
            $(self.el).append(html);
        });
    },

    findDaySuffix: function(day) {
        if (day % 10 == 1 && day % 100 != 11)
            return "st";
        else if (day % 10 == 2 && day % 100 != 12)
            return "nd";
        else if (day % 10 == 3 && day % 100 != 13)
            return "rd";
        else
            return "th";
    },

    findTime: function(hour, minute) {
        if (minute == 0) {
            minute = "";
        } else {
            minute = ":"+minute;
        }
        if (hour > 12) {
            return (hour-12) + minute + "pm";
        }  else {
            return hour + ":" + minute + "am";
        }
    },

    eventForm: function() {
        $.colorbox({href:"/Univ/create_event_form/"+groupId});
    }
});

var GroupPostModel = Backbone.Model.extend({
    urlRoot: '/Univ/create_post'
});
var GroupPostCollection = Backbone.Collection.extend({
    model: GroupPostModel,

    url: '/Univ/group/'+groupId+'/chat'
});
var GroupPostList = Backbone.View.extend({
    el: '.content-right',

    events: {
        'click #post-input-button' : 'postInput'
    },

    initialize: function() {
        var self = this;
        $(this.el).empty();
        $(this.el).append(tpl.get('chat/post_input'));
        this.GroupPostCollection = new GroupPostCollection();
        this.GroupPostCollection.fetch({
            success: function() {
                self.render();
            },
            error: function(model, xhr, options) {
                console.log(xhr.status);
            }
        });
    },

    render: function() {
        var self = this;
        $('#post-container').empty();
        var template = Handlebars.compile(tpl.get('chat/post'));
        this.GroupPostCollection.each(function(post) {

//            post.set('timeAgoParsed', ));
            var html = template(post.attributes);
            $('#post-container').append(html);
        });
    },

//    parseTimeAgo: function(timemilliseconds, dateCreated) {
//        var seconds = parseInt((timemilliseconds / 1000));
//        var minutes = parseInt((timemilliseconds / (1000*60)));
//        var hours = parseInt((timemilliseconds / (1000*60*60)));
//        var days = parseInt((timemilliseconds / (1000*60*60*24)));
//        var weeks = parseInt((timemilliseconds / (1000*60*60*24*7)));
//
//        var parsedTime;
//
//        if (days > 30) {
//            return dateCreated.getMonth() + '/' + dateCreated.getDate();
//        }
//        if (days > 0) {
//            parsedTime = days + "day";
//        } else if (hours > 0) {
//            parsedTime = hours + "hour";
//        } else if (minutes > 0) {
//            parsedTime = minutes + "minute"
//        } else if (seconds > 0)  {
//            parsedTime = seconds + "second"
//        }
//        if (parsedTime > 0) {
//            parsedTime = parsedTime + "s";
//        }
//        return parsedTime;
//
//    },

    postInput: function() {

        var self = this;
        var input = $("textarea#post-input-content").val();
        var postModel = new GroupPostModel({
            group_id  : groupId,
            date_created : new Date(),
            content     :  input
        });
        postModel.save(null, {
            success: function(res, xhr) {
                $("textarea#post-input-content").attr("value", "");
                self.GroupPostCollection.add(postModel, {at:0});
                self.render();
            },
        error: function(model, xhr, options) {
            console.log("error");
        }
        });
    }
});


var AppRouter = Backbone.Router.extend({
    routes: {
        "about"          : "about",
        "event"         :  "event",
        "image"         :  "image",
        "chat"          :  "chat",
        "members"       :  "members"
    },
    about: function() {
        console.log("about!");
    },
    event: function() {
        console.log("Event!!!!");
        var groupEventList = new GroupEventList();
    },
    image: function() {
        console.log("Image!");
    },
    chat: function() {
        console.log("Chat!");
        var groupPostList = new GroupPostList();
    },
    members: function() {
        console.log("Members!");
    }
});


tpl.loadTemplates(['group/event', 'group/event_header', 'chat/post_input', 'chat/post'], function() {
    app = new AppRouter();
    Backbone.history.start();
});
