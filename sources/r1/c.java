package r1;

import com.capacitorjs.plugins.statusbar.StatusBarPlugin;
import com.getcapacitor.PluginCall;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StatusBarPlugin f16042a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PluginCall f16043b;

    public /* synthetic */ c(StatusBarPlugin statusBarPlugin, PluginCall pluginCall) {
        this.f16042a = statusBarPlugin;
        this.f16043b = pluginCall;
    }

    public final void run() {
        this.f16042a.lambda$hide$2(this.f16043b);
    }
}
