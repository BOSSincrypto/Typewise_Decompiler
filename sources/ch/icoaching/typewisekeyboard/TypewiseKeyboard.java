package ch.icoaching.typewisekeyboard;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public class TypewiseKeyboard extends CordovaPlugin {
    private static final String GET_ENABLED_KEYBOARDS = "getEnabledKeyboards";
    private static final String KEYBOARD_ACTIVE = "getActiveKeyboard";
    private static final String KEYBOARD_ENABLED = "isKeyboardEnabled";

    /* renamed from: cordova  reason: collision with root package name */
    private CordovaInterface f8954cordova;

    private String getActiveKeyboard() {
        return Settings.Secure.getString(this.f8954cordova.getContext().getContentResolver(), "default_input_method");
    }

    private JSONArray getEnabledKeyboards() {
        JSONArray jSONArray = new JSONArray();
        for (InputMethodInfo packageName : ((InputMethodManager) this.f8954cordova.getContext().getSystemService("input_method")).getEnabledInputMethodList()) {
            jSONArray.put(packageName.getPackageName());
        }
        return jSONArray;
    }

    private boolean isKeyboardEnabled(String[] strArr) {
        if (!(strArr == null || strArr.length == 0)) {
            List<InputMethodInfo> enabledInputMethodList = ((InputMethodManager) this.f8954cordova.getContext().getSystemService("input_method")).getEnabledInputMethodList();
            HashSet hashSet = new HashSet(Arrays.asList(strArr));
            for (InputMethodInfo packageName : enabledInputMethodList) {
                if (hashSet.contains(packageName.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isWrioActive() {
        return "ch.icoaching.wrio/.Wrio".equals(Settings.Secure.getString(this.f8954cordova.getContext().getContentResolver(), "default_input_method"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isWrioEnabled() {
        /*
            r4 = this;
            org.apache.cordova.CordovaInterface r0 = r4.f8954cordova
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            java.util.List r0 = r0.getEnabledInputMethodList()
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003c
            java.lang.Object r1 = r0.next()
            android.view.inputmethod.InputMethodInfo r1 = (android.view.inputmethod.InputMethodInfo) r1
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "ch.icoaching.wrio"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x003a
            java.lang.String r2 = "ch.icoaching.typewise"
            java.lang.String r1 = r1.getPackageName()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0016
        L_0x003a:
            r0 = 1
            return r0
        L_0x003c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewisekeyboard.TypewiseKeyboard.isWrioEnabled():boolean");
    }

    private boolean openImeSettings() {
        Context context = this.f8954cordova.getContext();
        if (context == null) {
            return false;
        }
        context.startActivity(new Intent("android.settings.INPUT_METHOD_SETTINGS"));
        return true;
    }

    private boolean showImePicker() {
        InputMethodManager inputMethodManager;
        Context context = this.f8954cordova.getContext();
        if (context == null || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
            return false;
        }
        inputMethodManager.showInputMethodPicker();
        return true;
    }

    private String[] toStringArray(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new String[0];
        }
        try {
            String[] strArr = new String[jSONArray.length()];
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                strArr[i4] = jSONArray.getString(i4);
            }
            return strArr;
        } catch (JSONException e4) {
            e4.printStackTrace();
            return new String[0];
        }
    }

    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        if ("isWrioEnabled".equals(str)) {
            try {
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, isWrioEnabled()));
            } catch (NullPointerException unused) {
                callbackContext.error("null");
            }
            return true;
        } else if (KEYBOARD_ENABLED.equals(str)) {
            try {
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, isKeyboardEnabled(toStringArray(jSONArray))));
            } catch (NullPointerException unused2) {
                callbackContext.error("null");
            }
            return true;
        } else if (GET_ENABLED_KEYBOARDS.equals(str)) {
            try {
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, getEnabledKeyboards().toString()));
            } catch (NullPointerException unused3) {
                callbackContext.error("null");
            }
            return true;
        } else if (KEYBOARD_ACTIVE.equals(str)) {
            try {
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, getActiveKeyboard()));
            } catch (NullPointerException unused4) {
                callbackContext.error("null");
            }
            return true;
        } else if ("isWrioActive".equals(str)) {
            try {
                callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, isWrioActive()));
            } catch (NullPointerException unused5) {
                callbackContext.error("null");
            }
            return true;
        } else if ("openImeSettings".equals(str)) {
            if (openImeSettings()) {
                callbackContext.success();
            } else {
                callbackContext.error("null");
            }
            return true;
        } else if (!"showImePicker".equals(str)) {
            return false;
        } else {
            if (showImePicker()) {
                callbackContext.success();
            } else {
                callbackContext.error("null");
            }
            return true;
        }
    }

    public void initialize(CordovaInterface cordovaInterface, CordovaWebView cordovaWebView) {
        super.initialize(cordovaInterface, cordovaWebView);
        this.f8954cordova = cordovaInterface;
    }
}
