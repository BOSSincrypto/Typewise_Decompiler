package r1;

import com.capacitorjs.plugins.statusbar.StatusBarPlugin;
import com.getcapacitor.PluginCall;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StatusBarPlugin f16047a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Boolean f16048b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ PluginCall f16049c;

    public /* synthetic */ e(StatusBarPlugin statusBarPlugin, Boolean bool, PluginCall pluginCall) {
        this.f16047a = statusBarPlugin;
        this.f16048b = bool;
        this.f16049c = pluginCall;
    }

    public final void run() {
        this.f16047a.lambda$setOverlaysWebView$4(this.f16048b, this.f16049c);
    }
}
