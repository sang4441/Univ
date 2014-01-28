//window.SignUpView = Backbone.View.extend({
//
//    tagName: "div",
//
//    initialize: function() {
//    	console.log("here");
//        this.template = _.template(tpl.get('sign-up'));
//		this.model.bind("change", this.render, this);
//    },
//
//    render: function(eventName) {
//		$(this.el).html(this.template(this.model.toJSON()));
//		return this;
//    }
//});

window.SignUpView = Backbone.View.extend({

    tagName: "div",

    initialize: function() {
        this.template = _.template(tpl.get('sign-up'));
    },

    render: function(eventName) {
		$(this.el).html(this.template);
		return this;
    }
});
