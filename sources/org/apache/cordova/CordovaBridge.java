package org.apache.cordova;

import java.security.SecureRandom;
import org.json.JSONArray;
import org.json.JSONException;

public class CordovaBridge {
    private static final String LOG_TAG = "CordovaBridge";
    private volatile int expectedBridgeSecret = -1;
    private NativeToJsMessageQueue jsMessageQueue;
    private PluginManager pluginManager;

    public CordovaBridge(PluginManager pluginManager2, NativeToJsMessageQueue nativeToJsMessageQueue) {
        this.pluginManager = pluginManager2;
        this.jsMessageQueue = nativeToJsMessageQueue;
    }

    private boolean verifySecret(String str, int i4) {
        if (!this.jsMessageQueue.isBridgeEnabled()) {
            if (i4 == -1) {
                LOG.d(LOG_TAG, str + " call made before bridge was enabled.");
                return false;
            }
            LOG.d(LOG_TAG, "Ignoring " + str + " from previous page load.");
            return false;
        } else if (this.expectedBridgeSecret >= 0 && i4 == this.expectedBridgeSecret) {
            return true;
        } else {
            LOG.e(LOG_TAG, "Bridge access attempt with wrong secret token, possibly from malicious code. Disabling exec() bridge!");
            clearBridgeSecret();
            throw new IllegalAccessException();
        }
    }

    /* access modifiers changed from: package-private */
    public void clearBridgeSecret() {
        this.expectedBridgeSecret = -1;
    }

    /* access modifiers changed from: package-private */
    public int generateBridgeSecret() {
        this.expectedBridgeSecret = new SecureRandom().nextInt(Integer.MAX_VALUE);
        return this.expectedBridgeSecret;
    }

    public boolean isSecretEstablished() {
        if (this.expectedBridgeSecret != -1) {
            return true;
        }
        return false;
    }

    public String jsExec(int i4, String str, String str2, String str3, String str4) {
        String str5;
        if (!verifySecret("exec()", i4)) {
            return null;
        }
        if (str4 == null) {
            return "@Null arguments.";
        }
        this.jsMessageQueue.setPaused(true);
        try {
            CordovaResourceApi.jsThread = Thread.currentThread();
            this.pluginManager.exec(str, str2, str3, str4);
            str5 = this.jsMessageQueue.popAndEncode(false);
        } catch (Throwable th) {
            this.jsMessageQueue.setPaused(false);
            throw th;
        }
        this.jsMessageQueue.setPaused(false);
        return str5;
    }

    public String jsRetrieveJsMessages(int i4, boolean z3) {
        if (!verifySecret("retrieveJsMessages()", i4)) {
            return null;
        }
        return this.jsMessageQueue.popAndEncode(z3);
    }

    public void jsSetNativeToJsBridgeMode(int i4, int i5) {
        if (verifySecret("setNativeToJsBridgeMode()", i4)) {
            this.jsMessageQueue.setBridgeMode(i5);
        }
    }

    public String promptOnJsPrompt(String str, String str2, String str3) {
        if (str3 != null && str3.startsWith("gap:")) {
            try {
                JSONArray jSONArray = new JSONArray(str3.substring(4));
                String jsExec = jsExec(jSONArray.getInt(0), jSONArray.getString(1), jSONArray.getString(2), jSONArray.getString(3), str2);
                if (jsExec == null) {
                    return "";
                }
                return jsExec;
            } catch (JSONException e4) {
                e4.printStackTrace();
                return "";
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return "";
            }
        } else if (str3 != null && str3.startsWith("gap_bridge_mode:")) {
            try {
                jsSetNativeToJsBridgeMode(Integer.parseInt(str3.substring(16)), Integer.parseInt(str2));
            } catch (NumberFormatException e6) {
                e6.printStackTrace();
            } catch (IllegalAccessException e7) {
                e7.printStackTrace();
            }
            return "";
        } else if (str3 != null && str3.startsWith("gap_poll:")) {
            try {
                String jsRetrieveJsMessages = jsRetrieveJsMessages(Integer.parseInt(str3.substring(9)), "1".equals(str2));
                if (jsRetrieveJsMessages == null) {
                    return "";
                }
                return jsRetrieveJsMessages;
            } catch (IllegalAccessException e8) {
                e8.printStackTrace();
                return "";
            }
        } else if (str3 == null || !str3.startsWith("gap_init:")) {
            return null;
        } else {
            if (this.pluginManager.shouldAllowBridgeAccess(str)) {
                this.jsMessageQueue.setBridgeMode(Integer.parseInt(str3.substring(9)));
                int generateBridgeSecret = generateBridgeSecret();
                return "" + generateBridgeSecret;
            }
            LOG.e(LOG_TAG, "gap_init called from restricted origin: " + str);
            return "";
        }
    }

    public void reset() {
        this.jsMessageQueue.reset();
        clearBridgeSecret();
    }
}
