package com.capacitorjs.plugins.keyboard;

import android.os.Handler;
import android.os.Looper;
import com.capacitorjs.plugins.keyboard.Keyboard;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "Keyboard")
public class KeyboardPlugin extends Plugin {
    private Keyboard implementation;

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$hide$3(PluginCall pluginCall) {
        if (!this.implementation.hide()) {
            pluginCall.reject("Can't close keyboard, not currently focused");
        } else {
            pluginCall.resolve();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$load$0() {
        Keyboard keyboard = new Keyboard(getActivity(), getConfig().getBoolean("resizeOnFullScreen", false));
        this.implementation = keyboard;
        keyboard.setKeyboardEventListener(new d(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$show$1(PluginCall pluginCall) {
        this.implementation.show();
        pluginCall.resolve();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$show$2(PluginCall pluginCall) {
        new Handler(Looper.getMainLooper()).postDelayed(new g(this, pluginCall), 350);
    }

    @PluginMethod
    public void getResizeMode(PluginCall pluginCall) {
        pluginCall.unimplemented();
    }

    /* access modifiers changed from: protected */
    public void handleOnDestroy() {
        this.implementation.setKeyboardEventListener((Keyboard.KeyboardEventListener) null);
    }

    @PluginMethod
    public void hide(PluginCall pluginCall) {
        execute(new f(this, pluginCall));
    }

    public void load() {
        execute(new e(this));
    }

    /* access modifiers changed from: package-private */
    public void onKeyboardEvent(String str, int i4) {
        JSObject jSObject = new JSObject();
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -662060934:
                if (str.equals("keyboardDidHide")) {
                    c4 = 0;
                    break;
                }
                break;
            case -661733835:
                if (str.equals("keyboardDidShow")) {
                    c4 = 1;
                    break;
                }
                break;
            case -34092741:
                if (str.equals("keyboardWillHide")) {
                    c4 = 2;
                    break;
                }
                break;
            case -33765642:
                if (str.equals("keyboardWillShow")) {
                    c4 = 3;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
            case 2:
                this.bridge.triggerWindowJSEvent(str);
                notifyListeners(str, jSObject);
                return;
            case 1:
            case 3:
                this.bridge.triggerWindowJSEvent(str, "{ 'keyboardHeight': " + i4 + " }");
                jSObject.put("keyboardHeight", i4);
                notifyListeners(str, jSObject);
                return;
            default:
                return;
        }
    }

    @PluginMethod
    public void setAccessoryBarVisible(PluginCall pluginCall) {
        pluginCall.unimplemented();
    }

    @PluginMethod
    public void setResizeMode(PluginCall pluginCall) {
        pluginCall.unimplemented();
    }

    @PluginMethod
    public void setScroll(PluginCall pluginCall) {
        pluginCall.unimplemented();
    }

    @PluginMethod
    public void setStyle(PluginCall pluginCall) {
        pluginCall.unimplemented();
    }

    @PluginMethod
    public void show(PluginCall pluginCall) {
        execute(new c(this, pluginCall));
    }
}
