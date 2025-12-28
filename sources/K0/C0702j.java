package k0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.m;
import i0.C0678b;
import kotlin.jvm.internal.o;
import m0.C0814m;
import m0.C0817p;
import n0.c;

/* renamed from: k0.j  reason: case insensitive filesystem */
public final class C0702j extends C0700h {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final ConnectivityManager f13793f;

    /* renamed from: g  reason: collision with root package name */
    private final a f13794g = new a(this);

    /* renamed from: k0.j$a */
    public static final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0702j f13795a;

        a(C0702j jVar) {
            this.f13795a = jVar;
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            o.e(network, "network");
            o.e(networkCapabilities, "capabilities");
            m e4 = m.e();
            String b4 = C0703k.f13796a;
            e4.a(b4, "Network capabilities changed: " + networkCapabilities);
            C0702j jVar = this.f13795a;
            jVar.g(C0703k.c(jVar.f13793f));
        }

        public void onLost(Network network) {
            o.e(network, "network");
            m.e().a(C0703k.f13796a, "Network connection lost");
            C0702j jVar = this.f13795a;
            jVar.g(C0703k.c(jVar.f13793f));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0702j(Context context, c cVar) {
        super(context, cVar);
        o.e(context, "context");
        o.e(cVar, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        o.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f13793f = (ConnectivityManager) systemService;
    }

    public void h() {
        try {
            m.e().a(C0703k.f13796a, "Registering network callback");
            C0817p.a(this.f13793f, this.f13794g);
        } catch (IllegalArgumentException e4) {
            m.e().d(C0703k.f13796a, "Received exception while registering network callback", e4);
        } catch (SecurityException e5) {
            m.e().d(C0703k.f13796a, "Received exception while registering network callback", e5);
        }
    }

    public void i() {
        try {
            m.e().a(C0703k.f13796a, "Unregistering network callback");
            C0814m.c(this.f13793f, this.f13794g);
        } catch (IllegalArgumentException e4) {
            m.e().d(C0703k.f13796a, "Received exception while unregistering network callback", e4);
        } catch (SecurityException e5) {
            m.e().d(C0703k.f13796a, "Received exception while unregistering network callback", e5);
        }
    }

    /* renamed from: k */
    public C0678b e() {
        return C0703k.c(this.f13793f);
    }
}
