

//define([
//    'jquery',
//    'underscore',
//    'backbone'
//], function($, _, Backbone){
//    var ProjectListView = Backbone.View.extend({
//
//    });
//    return ProjectListView;
//});



//
//
//window.SignUpView = Backbone.View.extend({
//
//    tagName: "div",
//
//    initialize: function() {
//        this.template = _.template(tpl.get('sign-up'));
//    },
//
//    render: function(eventName) {
//		$(this.el).html(this.template);
//		return this;
//    }
//});
//
//window.ClubListView = Backbone.View.extend({
//
//    tagName: "div", // Not required since 'div' is the default if no el or tagName specified
//
//    initialize: function() {
//        this.template = _.template(tpl.get('club-list'));
//		this.model.bind("change", this.render, this);
//    },
//
//    render: function(eventName) {
//		$(this.el).html(this.template(this.model.toJSON()));
//		return this;
//    }
//});
//
