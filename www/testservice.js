var testservice = {
    createEvent: function(){
    cordova.exec(
        function(winParam) { alert("success"); },
        function(error) { alert("error"); },
        "TestService",
        "action",
        ["2", "8"]
        );
    }
};
module.exports = testservice;