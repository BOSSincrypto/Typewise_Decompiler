package k0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import androidx.work.m;
import i0.C0678b;
import kotlin.jvm.internal.o;
import n0.c;

public final class l extends C0697e {

    /* renamed from: g  reason: collision with root package name */
    private final ConnectivityManager f13797g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Context context, c cVar) {
        super(context, cVar);
        o.e(context, "context");
        o.e(cVar, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        o.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f13797g = (ConnectivityManager) systemService;
    }

    public IntentFilter j() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    public void k(Intent intent) {
        o.e(intent, "intent");
        if (o.a(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            m.e().a(C0703k.f13796a, "Network broadcast received");
            g(C0703k.c(this.f13797g));
        }
    }

    /* renamed from: l */
    public C0678b e() {
        return C0703k.c(this.f13797g);
    }
}
