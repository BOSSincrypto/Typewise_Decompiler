package com.capacitorjs.plugins.browser;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import com.getcapacitor.JSObject;
import com.getcapacitor.Logger;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.util.WebColor;

@CapacitorPlugin(name = "Browser")
public class BrowserPlugin extends Plugin {
    private Browser implementation;

    @PluginMethod
    public void close(PluginCall pluginCall) {
        pluginCall.unimplemented();
    }

    /* access modifiers changed from: protected */
    public void handleOnPause() {
        this.implementation.unbindService();
    }

    /* access modifiers changed from: protected */
    public void handleOnResume() {
        if (!this.implementation.bindService()) {
            Logger.error(getLogTag(), "Error binding to custom tabs service", (Throwable) null);
        }
    }

    public void load() {
        Browser browser = new Browser(getContext());
        this.implementation = browser;
        browser.setBrowserEventListener(new b(this));
    }

    /* access modifiers changed from: package-private */
    public void onBrowserEvent(int i4) {
        if (i4 == 1) {
            notifyListeners("browserPageLoaded", (JSObject) null);
        } else if (i4 == 2) {
            notifyListeners("browserFinished", (JSObject) null);
        }
    }

    @PluginMethod
    public void open(PluginCall pluginCall) {
        Integer num;
        String string = pluginCall.getString("url");
        if (string == null) {
            pluginCall.reject("Must provide a URL to open");
        } else if (string.isEmpty()) {
            pluginCall.reject("URL must not be empty");
        } else {
            try {
                Uri parse = Uri.parse(string);
                String string2 = pluginCall.getString("toolbarColor");
                if (string2 != null) {
                    try {
                        num = Integer.valueOf(WebColor.parseColor(string2));
                    } catch (IllegalArgumentException unused) {
                        Logger.error(getLogTag(), "Invalid color provided for toolbarColor. Using default", (Throwable) null);
                    }
                    this.implementation.open(parse, num);
                    pluginCall.resolve();
                }
                num = null;
                try {
                    this.implementation.open(parse, num);
                    pluginCall.resolve();
                } catch (ActivityNotFoundException e4) {
                    Logger.error(getLogTag(), e4.getLocalizedMessage(), (Throwable) null);
                    pluginCall.reject("Unable to display URL");
                }
            } catch (Exception e5) {
                pluginCall.reject(e5.getLocalizedMessage());
            }
        }
    }
}
