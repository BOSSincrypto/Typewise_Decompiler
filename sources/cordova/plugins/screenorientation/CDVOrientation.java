package cordova.plugins.screenorientation;

import androidx.appcompat.app.C0370d;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;

public class CDVOrientation extends CordovaPlugin {
    private boolean a(JSONArray jSONArray, CallbackContext callbackContext) {
        jSONArray.optString(0);
        String optString = jSONArray.optString(1);
        StringBuilder sb = new StringBuilder();
        sb.append("Requested ScreenOrientation: ");
        sb.append(optString);
        C0370d activity = this.f15693cordova.getActivity();
        if (optString.equals("any")) {
            activity.setRequestedOrientation(-1);
        } else if (optString.equals("landscape-primary")) {
            activity.setRequestedOrientation(0);
        } else if (optString.equals("portrait-primary")) {
            activity.setRequestedOrientation(1);
        } else if (optString.equals("landscape")) {
            activity.setRequestedOrientation(6);
        } else if (optString.equals("portrait")) {
            activity.setRequestedOrientation(7);
        } else if (optString.equals("landscape-secondary")) {
            activity.setRequestedOrientation(8);
        } else if (optString.equals("portrait-secondary")) {
            activity.setRequestedOrientation(9);
        }
        callbackContext.success();
        return true;
    }

    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        StringBuilder sb = new StringBuilder();
        sb.append("execute action: ");
        sb.append(str);
        if (str.equals("screenOrientation")) {
            return a(jSONArray, callbackContext);
        }
        callbackContext.error("action not recognised");
        return false;
    }
}
