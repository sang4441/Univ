window.Club = Backbone.Model.extend({
	urlRoot: "api/clubs",
	defaults: {
		"id": null,
	    "name":  ""
	  }
});

window.ClubCollection = Backbone.Collection.extend({
	model: Club,
	url: "api/clubs"
});