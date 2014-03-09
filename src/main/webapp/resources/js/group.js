define([
    'router'
], function(Router){
    var initialize = function(){
        console.log("group.js");
        Router.initialize();
    }

    return {
        initialize: initialize
    };
});

//
//var AppRouter = Backbone.Router.extend({
//
//    initialize: function() {
//        console.log("123");
//    },
//
//    routes: {
//        "about"          : "about",
//        "event"         :  "event",
//        "image"         :  "image",
//        "chat"          :  "chat",
//        "members"       :  "members"
//    },
//
//    about: function() {
//        console.log('about');
//    },
//
//    event: function() {
//        console.log('event');
//    },
//
//    image: function() {
//        console.log('image');
//    },
//
//    chat: function() {
//        console.log('chat');
//    },
//
//    members: function() {
//        console.log('members');
//    }
//});
//
//app = new AppRouter();
//Backbone.history.start();

/**
 * Created by kimsanghwan on 3/8/2014.
 */
/**
 * Created by kimsanghwan on 3/8/2014.
 */
