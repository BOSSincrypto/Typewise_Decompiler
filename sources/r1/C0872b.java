package r1;

import com.capacitorjs.plugins.statusbar.StatusBarPlugin;
import com.getcapacitor.PluginCall;

/* renamed from: r1.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0872b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StatusBarPlugin f16039a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f16040b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ PluginCall f16041c;

    public /* synthetic */ C0872b(StatusBarPlugin statusBarPlugin, String str, PluginCall pluginCall) {
        this.f16039a = statusBarPlugin;
        this.f16040b = str;
        this.f16041c = pluginCall;
    }

    public final void run() {
        this.f16039a.lambda$setBackgroundColor$1(this.f16040b, this.f16041c);
    }
}
