Backbone.View.prototype.close = function () {
    console.log('Closing view ' + this);
    if (this.beforeClose) {
        this.beforeClose();
    }
    this.remove();
    this.unbind();
};

var AppRouter = Backbone.Router.extend({

    initialize: function() {
        console.log("123");
    },

	routes: {
        "about"          : "about",
        "event"         :  "event",
        "image"         :  "image",
        "chat"          :  "chat",
        "members"       :  "members"
	},

    about: function() {
        console.log('about');
    },

    event: function() {
        console.log('event');
    },

    image: function() {
        console.log('image');
    },

    chat: function() {
        console.log('chat');
    },

    members: function() {
        console.log('members');
    }
});

app = new AppRouter();
Backbone.history.start();

