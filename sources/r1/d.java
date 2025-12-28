package r1;

import com.capacitorjs.plugins.statusbar.StatusBarPlugin;
import com.getcapacitor.PluginCall;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StatusBarPlugin f16044a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f16045b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ PluginCall f16046c;

    public /* synthetic */ d(StatusBarPlugin statusBarPlugin, String str, PluginCall pluginCall) {
        this.f16044a = statusBarPlugin;
        this.f16045b = str;
        this.f16046c = pluginCall;
    }

    public final void run() {
        this.f16044a.lambda$setStyle$0(this.f16045b, this.f16046c);
    }
}
