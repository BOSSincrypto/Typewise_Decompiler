package org.apache.cordova;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.TelephonyManager;
import java.util.HashMap;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CoreAndroid extends CordovaPlugin {
    public static final String PLUGIN_NAME = "CoreAndroid";
    protected static final String TAG = "CordovaApp";
    private CallbackContext messageChannel;
    private final Object messageChannelLock = new Object();
    private PluginResult pendingPause;
    private PluginResult pendingResume;
    private BroadcastReceiver telephonyReceiver;

    public static Object getBuildConfigValue(Context context, String str) {
        try {
            return Class.forName(context.getClass().getPackage().getName() + ".BuildConfig").getField(str).get((Object) null);
        } catch (ClassNotFoundException e4) {
            LOG.d(TAG, "Unable to get the BuildConfig, is this built with ANT?");
            e4.printStackTrace();
            return null;
        } catch (NoSuchFieldException unused) {
            LOG.d(TAG, str + " is not a valid field. Check your build.gradle");
            return null;
        } catch (IllegalAccessException e5) {
            LOG.d(TAG, "Illegal Access Exception: Let's print a stack trace.");
            e5.printStackTrace();
            return null;
        } catch (NullPointerException e6) {
            LOG.d(TAG, "Null Pointer Exception: Let's print a stack trace.");
            e6.printStackTrace();
            return null;
        }
    }

    private void initTelephonyReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        this.telephonyReceiver = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                if (intent != null && intent.getAction().equals("android.intent.action.PHONE_STATE") && intent.hasExtra("state")) {
                    String stringExtra = intent.getStringExtra("state");
                    if (stringExtra.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                        LOG.i(CoreAndroid.TAG, "Telephone RINGING");
                        CoreAndroid.this.webView.getPluginManager().postMessage("telephone", "ringing");
                    } else if (stringExtra.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                        LOG.i(CoreAndroid.TAG, "Telephone OFFHOOK");
                        CoreAndroid.this.webView.getPluginManager().postMessage("telephone", "offhook");
                    } else if (stringExtra.equals(TelephonyManager.EXTRA_STATE_IDLE)) {
                        LOG.i(CoreAndroid.TAG, "Telephone IDLE");
                        CoreAndroid.this.webView.getPluginManager().postMessage("telephone", "idle");
                    }
                }
            }
        };
        this.webView.getContext().registerReceiver(this.telephonyReceiver, intentFilter);
    }

    private void sendEventMessage(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (JSONException e4) {
            LOG.e(TAG, "Failed to create event message", (Throwable) e4);
        }
        PluginResult pluginResult = new PluginResult(PluginResult.Status.OK, jSONObject);
        if (this.messageChannel == null) {
            LOG.i(TAG, "Request to send event before messageChannel initialised: " + str);
            if ("pause".equals(str)) {
                this.pendingPause = pluginResult;
            } else if ("resume".equals(str)) {
                this.pendingPause = null;
            }
        } else {
            sendEventMessage(pluginResult);
        }
    }

    public void backHistory() {
        this.f15693cordova.getActivity().runOnUiThread(new Runnable() {
            public void run() {
                CoreAndroid.this.webView.backHistory();
            }
        });
    }

    public void clearCache() {
        this.f15693cordova.getActivity().runOnUiThread(new Runnable() {
            public void run() {
                CoreAndroid.this.webView.clearCache();
            }
        });
    }

    public void clearHistory() {
        this.f15693cordova.getActivity().runOnUiThread(new Runnable() {
            public void run() {
                CoreAndroid.this.webView.clearHistory();
            }
        });
    }

    public boolean execute(String str, JSONArray jSONArray, CallbackContext callbackContext) {
        PluginResult.Status status = PluginResult.Status.OK;
        try {
            if (str.equals("clearCache")) {
                clearCache();
            } else if (str.equals("show")) {
                this.f15693cordova.getActivity().runOnUiThread(new Runnable() {
                    public void run() {
                        CoreAndroid.this.webView.getPluginManager().postMessage("spinner", "stop");
                    }
                });
            } else if (str.equals("loadUrl")) {
                loadUrl(jSONArray.getString(0), jSONArray.optJSONObject(1));
            } else if (!str.equals("cancelLoadUrl")) {
                if (str.equals("clearHistory")) {
                    clearHistory();
                } else if (str.equals("backHistory")) {
                    backHistory();
                } else if (str.equals("overrideButton")) {
                    overrideButton(jSONArray.getString(0), jSONArray.getBoolean(1));
                } else if (str.equals("overrideBackbutton")) {
                    overrideBackbutton(jSONArray.getBoolean(0));
                } else if (str.equals("exitApp")) {
                    exitApp();
                } else if (str.equals("messageChannel")) {
                    synchronized (this.messageChannelLock) {
                        this.messageChannel = callbackContext;
                        PluginResult pluginResult = this.pendingPause;
                        if (pluginResult != null) {
                            sendEventMessage(pluginResult);
                            this.pendingPause = null;
                        }
                        PluginResult pluginResult2 = this.pendingResume;
                        if (pluginResult2 != null) {
                            sendEventMessage(pluginResult2);
                            this.pendingResume = null;
                        }
                    }
                    return true;
                }
            }
            callbackContext.sendPluginResult(new PluginResult(status, ""));
            return true;
        } catch (JSONException unused) {
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.JSON_EXCEPTION));
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void exitApp() {
        this.webView.getPluginManager().postMessage("exit", (Object) null);
    }

    public void fireJavascriptEvent(String str) {
        sendEventMessage(str);
    }

    public boolean isBackbuttonOverridden() {
        return this.webView.isButtonPlumbedToJs(4);
    }

    public void loadUrl(String str, JSONObject jSONObject) {
        boolean z3;
        boolean z4;
        LOG.d("App", "App.loadUrl(" + str + "," + jSONObject + ")");
        HashMap hashMap = new HashMap();
        int i4 = 0;
        if (jSONObject != null) {
            JSONArray names = jSONObject.names();
            int i5 = 0;
            z4 = false;
            z3 = false;
            while (i4 < names.length()) {
                String string = names.getString(i4);
                if (string.equals("wait")) {
                    i5 = jSONObject.getInt(string);
                } else if (string.equalsIgnoreCase("openexternal")) {
                    z4 = jSONObject.getBoolean(string);
                } else if (string.equalsIgnoreCase("clearhistory")) {
                    z3 = jSONObject.getBoolean(string);
                } else {
                    Object obj = jSONObject.get(string);
                    if (obj != null) {
                        if (obj.getClass().equals(String.class)) {
                            hashMap.put(string, (String) obj);
                        } else if (obj.getClass().equals(Boolean.class)) {
                            hashMap.put(string, (Boolean) obj);
                        } else if (obj.getClass().equals(Integer.class)) {
                            hashMap.put(string, (Integer) obj);
                        }
                    }
                }
                i4++;
            }
            i4 = i5;
        } else {
            z4 = false;
            z3 = false;
        }
        if (i4 > 0) {
            try {
                synchronized (this) {
                    wait((long) i4);
                }
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
        }
        this.webView.showWebPage(str, z4, z3, hashMap);
    }

    public void onDestroy() {
        this.webView.getContext().unregisterReceiver(this.telephonyReceiver);
    }

    public void overrideBackbutton(boolean z3) {
        LOG.i("App", "WARNING: Back Button Default Behavior will be overridden.  The backbutton event will be fired!");
        this.webView.setButtonPlumbedToJs(4, z3);
    }

    public void overrideButton(String str, boolean z3) {
        LOG.i("App", "WARNING: Volume Button Default Behavior will be overridden.  The volume event will be fired!");
        if (str.equals("volumeup")) {
            this.webView.setButtonPlumbedToJs(24, z3);
        } else if (str.equals("volumedown")) {
            this.webView.setButtonPlumbedToJs(25, z3);
        } else if (str.equals("menubutton")) {
            this.webView.setButtonPlumbedToJs(82, z3);
        }
    }

    public void pluginInitialize() {
        initTelephonyReceiver();
    }

    public void sendResumeEvent(PluginResult pluginResult) {
        synchronized (this.messageChannelLock) {
            try {
                if (this.messageChannel != null) {
                    sendEventMessage(pluginResult);
                } else {
                    this.pendingResume = pluginResult;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void sendEventMessage(PluginResult pluginResult) {
        pluginResult.setKeepCallback(true);
        CallbackContext callbackContext = this.messageChannel;
        if (callbackContext != null) {
            callbackContext.sendPluginResult(pluginResult);
        }
    }
}
