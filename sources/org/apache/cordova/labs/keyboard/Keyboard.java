package org.apache.cordova.labs.keyboard;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;

public class Keyboard extends CordovaPlugin {
    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        View view;
        InputMethodManager inputMethodManager = (InputMethodManager) this.f15693cordova.getActivity().getSystemService("input_method");
        try {
            view = (View) this.webView.getClass().getMethod("getView", (Class[]) null).invoke(this.webView, (Object[]) null);
        } catch (Exception unused) {
            view = (View) this.webView;
        }
        if ("show".equals(str)) {
            inputMethodManager.showSoftInput(view, 0);
            callbackContext.success();
            return true;
        } else if ("hide".equals(str)) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            callbackContext.success();
            return true;
        } else {
            callbackContext.error(str + " is not a supported action");
            return false;
        }
    }
}
