var testservice = {
    createEvent: function(){
    cordova.exec(
        function(winParam) { alert("success"); },
        functon(error) { alert("error"); },
        "TestService",
        "action",
        ["2", "8"]
        );
    }
};
module.exports = testplugin;