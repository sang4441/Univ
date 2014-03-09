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
            console.log(event);
            var html = template(event.attributes);
            $(self.el).append(html);
        });
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
            var html = template(post.attributes);
            $('#post-container').append(html);
        });
    },

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
