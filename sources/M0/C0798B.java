package m0;

import android.content.Context;
import android.os.Build;
import androidx.work.g;
import androidx.work.h;
import androidx.work.l;
import androidx.work.m;
import l0.v;
import n0.c;

/* renamed from: m0.B  reason: case insensitive filesystem */
public class C0798B implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    static final String f14573g = m.i("WorkForegroundRunnable");

    /* renamed from: a  reason: collision with root package name */
    final androidx.work.impl.utils.futures.a f14574a = androidx.work.impl.utils.futures.a.t();

    /* renamed from: b  reason: collision with root package name */
    final Context f14575b;

    /* renamed from: c  reason: collision with root package name */
    final v f14576c;

    /* renamed from: d  reason: collision with root package name */
    final l f14577d;

    /* renamed from: e  reason: collision with root package name */
    final h f14578e;

    /* renamed from: f  reason: collision with root package name */
    final c f14579f;

    /* renamed from: m0.B$a */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.a f14580a;

        a(androidx.work.impl.utils.futures.a aVar) {
            this.f14580a = aVar;
        }

        public void run() {
            if (!C0798B.this.f14574a.isCancelled()) {
                try {
                    g gVar = (g) this.f14580a.get();
                    if (gVar != null) {
                        m e4 = m.e();
                        String str = C0798B.f14573g;
                        e4.a(str, "Updating notification for " + C0798B.this.f14576c.f14472c);
                        C0798B b4 = C0798B.this;
                        b4.f14574a.r(b4.f14578e.a(b4.f14575b, b4.f14577d.f(), gVar));
                        return;
                    }
                    throw new IllegalStateException("Worker was marked important (" + C0798B.this.f14576c.f14472c + ") but did not provide ForegroundInfo");
                } catch (Throwable th) {
                    C0798B.this.f14574a.q(th);
                }
            }
        }
    }

    public C0798B(Context context, v vVar, l lVar, h hVar, c cVar) {
        this.f14575b = context;
        this.f14576c = vVar;
        this.f14577d = lVar;
        this.f14578e = hVar;
        this.f14579f = cVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(androidx.work.impl.utils.futures.a aVar) {
        if (!this.f14574a.isCancelled()) {
            aVar.r(this.f14577d.d());
        } else {
            aVar.cancel(true);
        }
    }

    public X1.a b() {
        return this.f14574a;
    }

    public void run() {
        if (!this.f14576c.f14486q || Build.VERSION.SDK_INT >= 31) {
            this.f14574a.p((Object) null);
            return;
        }
        androidx.work.impl.utils.futures.a t4 = androidx.work.impl.utils.futures.a.t();
        this.f14579f.a().execute(new C0797A(this, t4));
        t4.a(new a(t4), this.f14579f.a());
    }
}
