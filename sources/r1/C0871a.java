package r1;

import com.capacitorjs.plugins.statusbar.StatusBarPlugin;
import com.getcapacitor.PluginCall;

/* renamed from: r1.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0871a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StatusBarPlugin f16037a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PluginCall f16038b;

    public /* synthetic */ C0871a(StatusBarPlugin statusBarPlugin, PluginCall pluginCall) {
        this.f16037a = statusBarPlugin;
        this.f16038b = pluginCall;
    }

    public final void run() {
        this.f16037a.lambda$show$3(this.f16038b);
    }
}
