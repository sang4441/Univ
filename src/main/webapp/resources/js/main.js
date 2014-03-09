require.config({
    paths: {
        jquery: '/Univ/resources/lib/jquery-1.7.1.min',
        underscore: '/Univ/resources/lib/underscore-min',
        backbone: '/Univ/resources/lib/backbone-min'
    }
});

require([
    'group'
], function(Group){
    console.log("main.js");
    Group.initialize();
});

