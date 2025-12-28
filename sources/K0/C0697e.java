package k0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.m;
import kotlin.jvm.internal.o;
import n0.c;

/* renamed from: k0.e  reason: case insensitive filesystem */
public abstract class C0697e extends C0700h {

    /* renamed from: f  reason: collision with root package name */
    private final BroadcastReceiver f13782f = new a(this);

    /* renamed from: k0.e$a */
    public static final class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0697e f13783a;

        a(C0697e eVar) {
            this.f13783a = eVar;
        }

        public void onReceive(Context context, Intent intent) {
            o.e(context, "context");
            o.e(intent, "intent");
            this.f13783a.k(intent);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0697e(Context context, c cVar) {
        super(context, cVar);
        o.e(context, "context");
        o.e(cVar, "taskExecutor");
    }

    public void h() {
        m e4 = m.e();
        String a4 = C0698f.f13784a;
        e4.a(a4, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f13782f, j());
    }

    public void i() {
        m e4 = m.e();
        String a4 = C0698f.f13784a;
        e4.a(a4, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f13782f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}
