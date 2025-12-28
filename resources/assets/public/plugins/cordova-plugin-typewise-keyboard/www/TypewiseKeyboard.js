cordova.define("cordova-plugin-typewise-keyboard.TypewiseKeyboard", function(require, exports, module) { 
var exec = require('cordova/exec');

var PLUGIN_NAME = "TypewiseKeyboard"; // This is just for code completion uses.

var TypewiseKeyboard = function() {};

//ios and android supported methods
TypewiseKeyboard.getEnabledKeyboards = function(onSuccess, onError) {
   exec(onSuccess, onError, PLUGIN_NAME, "getEnabledKeyboards", []);
};

TypewiseKeyboard.openIosSettings = function(onSuccess, onError) {
    exec(onSuccess, onError, PLUGIN_NAME, "openIosSettings", []);
 };

//just android supported methods
TypewiseKeyboard.isWrioEnabled = function(onSuccess, onError) {
    exec(onSuccess, onError, PLUGIN_NAME, "isWrioEnabled", []);
};

TypewiseKeyboard.isKeyboardEnabled = function(onSuccess, onError) {
    exec(onSuccess, onError, PLUGIN_NAME, "isKeyboardEnabled", []);
};

TypewiseKeyboard.getActiveKeyboard = function(onSuccess, onError) {
    exec(onSuccess, onError, PLUGIN_NAME, "getActiveKeyboard", []);
};

TypewiseKeyboard.isWrioActive = function(onSuccess, onError) {
    exec(onSuccess, onError, PLUGIN_NAME, "isWrioActive", []);
};

TypewiseKeyboard.openImeSettings = function(onSuccess, onError) {
    exec(onSuccess, onError, PLUGIN_NAME, "openImeSettings", []);
};

TypewiseKeyboard.showImePicker = function(onSuccess, onError) {
    exec(onSuccess, onError, PLUGIN_NAME, "showImePicker", []);
};
module.exports = TypewiseKeyboard;
});