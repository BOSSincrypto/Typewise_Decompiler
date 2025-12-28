package com.getcapacitor;

import android.content.Context;
import android.content.res.AssetManager;
import com.getcapacitor.util.JSONUtils;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class CapConfig {
    private static final String LOG_BEHAVIOR_DEBUG = "debug";
    private static final String LOG_BEHAVIOR_NONE = "none";
    private static final String LOG_BEHAVIOR_PRODUCTION = "production";
    private boolean allowMixedContent;
    private String[] allowNavigation;
    private String androidScheme;
    private String appendedUserAgentString;
    private String backgroundColor;
    private boolean captureInput;
    private JSONObject configJSON;
    private String errorPath;
    private String hostname;
    private boolean html5mode;
    private boolean initialFocus;
    private boolean loggingEnabled;
    private int minWebViewVersion;
    private String overriddenUserAgentString;
    private Map<String, PluginConfig> pluginsConfiguration;
    private String serverUrl;
    private String startPath;
    private boolean useLegacyBridge;
    private boolean webContentsDebuggingEnabled;

    public static class Builder {
        /* access modifiers changed from: private */
        public boolean allowMixedContent = false;
        /* access modifiers changed from: private */
        public String[] allowNavigation;
        /* access modifiers changed from: private */
        public String androidScheme = Bridge.CAPACITOR_HTTP_SCHEME;
        /* access modifiers changed from: private */
        public String appendedUserAgentString;
        /* access modifiers changed from: private */
        public String backgroundColor;
        /* access modifiers changed from: private */
        public boolean captureInput = false;
        private Context context;
        /* access modifiers changed from: private */
        public String errorPath;
        /* access modifiers changed from: private */
        public String hostname = "localhost";
        /* access modifiers changed from: private */
        public boolean html5mode = true;
        /* access modifiers changed from: private */
        public boolean initialFocus = false;
        /* access modifiers changed from: private */
        public boolean loggingEnabled = true;
        /* access modifiers changed from: private */
        public int minWebViewVersion = 60;
        /* access modifiers changed from: private */
        public String overriddenUserAgentString;
        /* access modifiers changed from: private */
        public Map<String, PluginConfig> pluginsConfiguration = new HashMap();
        /* access modifiers changed from: private */
        public String serverUrl;
        /* access modifiers changed from: private */
        public String startPath = null;
        /* access modifiers changed from: private */
        public boolean useLegacyBridge = false;
        /* access modifiers changed from: private */
        public Boolean webContentsDebuggingEnabled = null;

        public Builder(Context context2) {
            this.context = context2;
        }

        public CapConfig create() {
            boolean z3;
            if (this.webContentsDebuggingEnabled == null) {
                if ((this.context.getApplicationInfo().flags & 2) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.webContentsDebuggingEnabled = Boolean.valueOf(z3);
            }
            return new CapConfig(this);
        }

        public Builder setAllowMixedContent(boolean z3) {
            this.allowMixedContent = z3;
            return this;
        }

        public Builder setAllowNavigation(String[] strArr) {
            this.allowNavigation = strArr;
            return this;
        }

        public Builder setAndroidScheme(String str) {
            this.androidScheme = str;
            return this;
        }

        public Builder setAppendedUserAgentString(String str) {
            this.appendedUserAgentString = str;
            return this;
        }

        public Builder setBackgroundColor(String str) {
            this.backgroundColor = str;
            return this;
        }

        public Builder setCaptureInput(boolean z3) {
            this.captureInput = z3;
            return this;
        }

        public Builder setErrorPath(String str) {
            this.errorPath = str;
            return this;
        }

        public Builder setHTML5mode(boolean z3) {
            this.html5mode = z3;
            return this;
        }

        public Builder setHostname(String str) {
            this.hostname = str;
            return this;
        }

        public Builder setInitialFocus(boolean z3) {
            this.initialFocus = z3;
            return this;
        }

        public Builder setLoggingEnabled(boolean z3) {
            this.loggingEnabled = z3;
            return this;
        }

        public Builder setOverriddenUserAgentString(String str) {
            this.overriddenUserAgentString = str;
            return this;
        }

        public Builder setPluginsConfiguration(JSONObject jSONObject) {
            this.pluginsConfiguration = CapConfig.deserializePluginsConfig(jSONObject);
            return this;
        }

        public Builder setServerUrl(String str) {
            this.serverUrl = str;
            return this;
        }

        public Builder setStartPath(String str) {
            this.startPath = str;
            return this;
        }

        public Builder setUseLegacyBridge(boolean z3) {
            this.useLegacyBridge = z3;
            return this;
        }

        public Builder setWebContentsDebuggingEnabled(boolean z3) {
            this.webContentsDebuggingEnabled = Boolean.valueOf(z3);
            return this;
        }
    }

    private void deserializeConfig(Context context) {
        boolean z3;
        if (context == null || (context.getApplicationInfo().flags & 2) == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.html5mode = JSONUtils.getBoolean(this.configJSON, "server.html5mode", this.html5mode);
        this.serverUrl = JSONUtils.getString(this.configJSON, "server.url", (String) null);
        this.hostname = JSONUtils.getString(this.configJSON, "server.hostname", this.hostname);
        this.errorPath = JSONUtils.getString(this.configJSON, "server.errorPath", (String) null);
        String string = JSONUtils.getString(this.configJSON, "server.androidScheme", this.androidScheme);
        if (validateScheme(string)) {
            this.androidScheme = string;
        }
        this.allowNavigation = JSONUtils.getArray(this.configJSON, "server.allowNavigation", (String[]) null);
        JSONObject jSONObject = this.configJSON;
        this.overriddenUserAgentString = JSONUtils.getString(jSONObject, "android.overrideUserAgent", JSONUtils.getString(jSONObject, "overrideUserAgent", (String) null));
        JSONObject jSONObject2 = this.configJSON;
        this.appendedUserAgentString = JSONUtils.getString(jSONObject2, "android.appendUserAgent", JSONUtils.getString(jSONObject2, "appendUserAgent", (String) null));
        JSONObject jSONObject3 = this.configJSON;
        this.backgroundColor = JSONUtils.getString(jSONObject3, "android.backgroundColor", JSONUtils.getString(jSONObject3, "backgroundColor", (String) null));
        JSONObject jSONObject4 = this.configJSON;
        this.allowMixedContent = JSONUtils.getBoolean(jSONObject4, "android.allowMixedContent", JSONUtils.getBoolean(jSONObject4, "allowMixedContent", this.allowMixedContent));
        this.minWebViewVersion = JSONUtils.getInt(this.configJSON, "android.minWebViewVersion", 60);
        this.captureInput = JSONUtils.getBoolean(this.configJSON, "android.captureInput", this.captureInput);
        this.useLegacyBridge = JSONUtils.getBoolean(this.configJSON, "android.useLegacyBridge", this.useLegacyBridge);
        this.webContentsDebuggingEnabled = JSONUtils.getBoolean(this.configJSON, "android.webContentsDebuggingEnabled", z3);
        JSONObject jSONObject5 = this.configJSON;
        String string2 = JSONUtils.getString(jSONObject5, "android.loggingBehavior", JSONUtils.getString(jSONObject5, "loggingBehavior", (String) null));
        if (string2 == null) {
            JSONObject jSONObject6 = this.configJSON;
            if (JSONUtils.getBoolean(jSONObject6, "android.hideLogs", JSONUtils.getBoolean(jSONObject6, "hideLogs", false))) {
                string2 = "none";
            } else {
                string2 = LOG_BEHAVIOR_DEBUG;
            }
        }
        String lowerCase = string2.toLowerCase(Locale.ROOT);
        lowerCase.hashCode();
        if (lowerCase.equals("none")) {
            this.loggingEnabled = false;
        } else if (!lowerCase.equals(LOG_BEHAVIOR_PRODUCTION)) {
            this.loggingEnabled = z3;
        } else {
            this.loggingEnabled = true;
        }
        this.initialFocus = JSONUtils.getBoolean(this.configJSON, "android.initialFocus", this.initialFocus);
        this.pluginsConfiguration = deserializePluginsConfig(JSONUtils.getObject(this.configJSON, "plugins"));
    }

    /* access modifiers changed from: private */
    public static Map<String, PluginConfig> deserializePluginsConfig(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, new PluginConfig(jSONObject.getJSONObject(next)));
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        return hashMap;
    }

    private void loadConfigFromAssets(AssetManager assetManager, String str) {
        if (str == null) {
            str = "";
        } else if (str.charAt(str.length() - 1) != '/') {
            str = str + "/";
        }
        try {
            this.configJSON = new JSONObject(FileUtils.readFileFromAssets(assetManager, str + "capacitor.config.json"));
        } catch (IOException e4) {
            Logger.error("Unable to load capacitor.config.json. Run npx cap copy first", e4);
        } catch (JSONException e5) {
            Logger.error("Unable to parse capacitor.config.json. Make sure it's valid json", e5);
        }
    }

    private void loadConfigFromFile(String str) {
        if (str == null) {
            str = "";
        } else if (str.charAt(str.length() - 1) != '/') {
            str = str + "/";
        }
        try {
            this.configJSON = new JSONObject(FileUtils.readFileFromDisk(new File(str + "capacitor.config.json")));
        } catch (JSONException e4) {
            Logger.error("Unable to parse capacitor.config.json. Make sure it's valid json", e4);
        } catch (IOException e5) {
            Logger.error("Unable to load capacitor.config.json.", e5);
        }
    }

    public static CapConfig loadDefault(Context context) {
        CapConfig capConfig = new CapConfig();
        if (context == null) {
            Logger.error("Capacitor Config could not be created from file. Context must not be null.");
            return capConfig;
        }
        capConfig.loadConfigFromAssets(context.getAssets(), (String) null);
        capConfig.deserializeConfig(context);
        return capConfig;
    }

    public static CapConfig loadFromAssets(Context context, String str) {
        CapConfig capConfig = new CapConfig();
        if (context == null) {
            Logger.error("Capacitor Config could not be created from file. Context must not be null.");
            return capConfig;
        }
        capConfig.loadConfigFromAssets(context.getAssets(), str);
        capConfig.deserializeConfig(context);
        return capConfig;
    }

    public static CapConfig loadFromFile(Context context, String str) {
        CapConfig capConfig = new CapConfig();
        if (context == null) {
            Logger.error("Capacitor Config could not be created from file. Context must not be null.");
            return capConfig;
        }
        capConfig.loadConfigFromFile(str);
        capConfig.deserializeConfig(context);
        return capConfig;
    }

    private boolean validateScheme(String str) {
        if (!Arrays.asList(new String[]{"file", "ftp", "ftps", "ws", "wss", "about", "blob", "data"}).contains(str)) {
            return true;
        }
        Logger.warn(str + " is not an allowed scheme.  Defaulting to http.");
        return false;
    }

    public String[] getAllowNavigation() {
        return this.allowNavigation;
    }

    public String getAndroidScheme() {
        return this.androidScheme;
    }

    public String getAppendedUserAgentString() {
        return this.appendedUserAgentString;
    }

    @Deprecated
    public String[] getArray(String str) {
        return JSONUtils.getArray(this.configJSON, str, (String[]) null);
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Deprecated
    public boolean getBoolean(String str, boolean z3) {
        return JSONUtils.getBoolean(this.configJSON, str, z3);
    }

    public String getErrorPath() {
        return this.errorPath;
    }

    public String getHostname() {
        return this.hostname;
    }

    @Deprecated
    public int getInt(String str, int i4) {
        return JSONUtils.getInt(this.configJSON, str, i4);
    }

    public int getMinWebViewVersion() {
        int i4 = this.minWebViewVersion;
        if (i4 >= 55) {
            return i4;
        }
        Logger.warn("Specified minimum webview version is too low, defaulting to 55");
        return 55;
    }

    @Deprecated
    public JSONObject getObject(String str) {
        try {
            return this.configJSON.getJSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getOverriddenUserAgentString() {
        return this.overriddenUserAgentString;
    }

    public PluginConfig getPluginConfiguration(String str) {
        PluginConfig pluginConfig = this.pluginsConfiguration.get(str);
        if (pluginConfig == null) {
            return new PluginConfig(new JSONObject());
        }
        return pluginConfig;
    }

    public String getServerUrl() {
        return this.serverUrl;
    }

    public String getStartPath() {
        return this.startPath;
    }

    @Deprecated
    public String getString(String str) {
        return JSONUtils.getString(this.configJSON, str, (String) null);
    }

    public boolean isHTML5Mode() {
        return this.html5mode;
    }

    public boolean isInitialFocus() {
        return this.initialFocus;
    }

    public boolean isInputCaptured() {
        return this.captureInput;
    }

    public boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }

    public boolean isMixedContentAllowed() {
        return this.allowMixedContent;
    }

    public boolean isUsingLegacyBridge() {
        return this.useLegacyBridge;
    }

    public boolean isWebContentsDebuggingEnabled() {
        return this.webContentsDebuggingEnabled;
    }

    private CapConfig() {
        this.html5mode = true;
        this.hostname = "localhost";
        this.androidScheme = Bridge.CAPACITOR_HTTP_SCHEME;
        this.allowMixedContent = false;
        this.captureInput = false;
        this.webContentsDebuggingEnabled = false;
        this.loggingEnabled = true;
        this.initialFocus = true;
        this.useLegacyBridge = false;
        this.minWebViewVersion = 60;
        this.pluginsConfiguration = null;
        this.configJSON = new JSONObject();
    }

    @Deprecated
    public String[] getArray(String str, String[] strArr) {
        return JSONUtils.getArray(this.configJSON, str, strArr);
    }

    @Deprecated
    public String getString(String str, String str2) {
        return JSONUtils.getString(this.configJSON, str, str2);
    }

    @Deprecated
    public CapConfig(AssetManager assetManager, JSONObject jSONObject) {
        this.html5mode = true;
        this.hostname = "localhost";
        this.androidScheme = Bridge.CAPACITOR_HTTP_SCHEME;
        this.allowMixedContent = false;
        this.captureInput = false;
        this.webContentsDebuggingEnabled = false;
        this.loggingEnabled = true;
        this.initialFocus = true;
        this.useLegacyBridge = false;
        this.minWebViewVersion = 60;
        this.pluginsConfiguration = null;
        this.configJSON = new JSONObject();
        if (jSONObject != null) {
            this.configJSON = jSONObject;
        } else {
            loadConfigFromAssets(assetManager, (String) null);
        }
        deserializeConfig((Context) null);
    }

    private CapConfig(Builder builder) {
        this.html5mode = true;
        this.hostname = "localhost";
        this.androidScheme = Bridge.CAPACITOR_HTTP_SCHEME;
        this.allowMixedContent = false;
        this.captureInput = false;
        this.webContentsDebuggingEnabled = false;
        this.loggingEnabled = true;
        this.initialFocus = true;
        this.useLegacyBridge = false;
        this.minWebViewVersion = 60;
        this.pluginsConfiguration = null;
        this.configJSON = new JSONObject();
        this.html5mode = builder.html5mode;
        this.serverUrl = builder.serverUrl;
        this.hostname = builder.hostname;
        if (validateScheme(builder.androidScheme)) {
            this.androidScheme = builder.androidScheme;
        }
        this.allowNavigation = builder.allowNavigation;
        this.overriddenUserAgentString = builder.overriddenUserAgentString;
        this.appendedUserAgentString = builder.appendedUserAgentString;
        this.backgroundColor = builder.backgroundColor;
        this.allowMixedContent = builder.allowMixedContent;
        this.captureInput = builder.captureInput;
        this.webContentsDebuggingEnabled = builder.webContentsDebuggingEnabled.booleanValue();
        this.loggingEnabled = builder.loggingEnabled;
        this.initialFocus = builder.initialFocus;
        this.useLegacyBridge = builder.useLegacyBridge;
        this.minWebViewVersion = builder.minWebViewVersion;
        this.errorPath = builder.errorPath;
        this.startPath = builder.startPath;
        this.pluginsConfiguration = builder.pluginsConfiguration;
    }
}
