package com.verso.cordova.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public class Clipboard extends CordovaPlugin {
    private static final String actionClear = "clear";
    private static final String actionCopy = "copy";
    private static final String actionPaste = "paste";

    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f15693cordova.getActivity().getSystemService("clipboard");
        if (str.equals(actionCopy)) {
            try {
                String string = jSONArray.getString(0);
                clipboardManager.setPrimaryClip(ClipData.newPlainText("Text", string));
                callbackContext.success(string);
                return true;
            } catch (JSONException unused) {
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.JSON_EXCEPTION));
            } catch (Exception e4) {
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, e4.toString()));
            }
        } else {
            String str2 = "";
            if (str.equals(actionPaste)) {
                try {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null) {
                        str2 = primaryClip.getItemAt(0).getText().toString();
                    }
                    callbackContext.success(str2);
                    return true;
                } catch (Exception e5) {
                    callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, e5.toString()));
                }
            } else {
                if (str.equals(actionClear)) {
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(str2, str2));
                        callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK));
                        return true;
                    } catch (Exception e6) {
                        callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, e6.toString()));
                    }
                }
                return false;
            }
        }
    }
}
