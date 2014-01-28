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

    },

	routes: {
		"category/:id"	: "getClubList",
		"signup"		: "signup",
		"create_group"	: "createGroup"
	},

//	list: function() {
//        this.before();
//  	},

	getClubList: function(id) {
		 if (this.clubList) {
           if (callback) callback();
       } else {
           this.clubList = new ClubCollection();
           this.clubList.url='api/clubs/'+id;
           this.clubList.fetch({success: function() {
        	   console.log("fetch succeeded");
        	   $('#content').html( new ClubListView({model: app.clubList}).render().el );
           }});
       }
//		console.log(id);
//        this.before(function() {
//			var wine = app.clubList.get(id);
//			console.log(wine);
//		    app.showView( '#content', new WineView({model: wine}) );
//        });
  	},
  	
  	signup: function() {
  		app.showView('#content', new SignUpView());
  	},
  	
  	createGroup: function() {
  		app.showView('#content', new CreateGroupView());
  	},

    showView: function(selector, view) {
        if (this.currentView)
            this.currentView.close();
        $(selector).html(view.render().el);
        this.currentView = view;
        return view;
    }
});

tpl.loadTemplates(['club-list', 'sign-up', 'tmp', 'create-group'], function() {
    app = new AppRouter();
    Backbone.history.start();
});