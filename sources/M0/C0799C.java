package m0;

import android.content.Context;
import androidx.work.g;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.b;
import androidx.work.m;
import java.util.UUID;
import l0.v;
import l0.w;
import l0.y;
import n0.c;

/* renamed from: m0.C  reason: case insensitive filesystem */
public class C0799C implements h {

    /* renamed from: d  reason: collision with root package name */
    private static final String f14582d = m.i("WMFgUpdater");

    /* renamed from: a  reason: collision with root package name */
    private final c f14583a;

    /* renamed from: b  reason: collision with root package name */
    final androidx.work.impl.foreground.a f14584b;

    /* renamed from: c  reason: collision with root package name */
    final w f14585c;

    /* renamed from: m0.C$a */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.a f14586a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UUID f14587b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f14588c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f14589d;

        a(androidx.work.impl.utils.futures.a aVar, UUID uuid, g gVar, Context context) {
            this.f14586a = aVar;
            this.f14587b = uuid;
            this.f14588c = gVar;
            this.f14589d = context;
        }

        public void run() {
            try {
                if (!this.f14586a.isCancelled()) {
                    String uuid = this.f14587b.toString();
                    v l4 = C0799C.this.f14585c.l(uuid);
                    if (l4 == null || l4.f14471b.isFinished()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C0799C.this.f14584b.d(uuid, this.f14588c);
                    this.f14589d.startService(b.d(this.f14589d, y.a(l4), this.f14588c));
                }
                this.f14586a.p((Object) null);
            } catch (Throwable th) {
                this.f14586a.q(th);
            }
        }
    }

    public C0799C(WorkDatabase workDatabase, androidx.work.impl.foreground.a aVar, c cVar) {
        this.f14584b = aVar;
        this.f14583a = cVar;
        this.f14585c = workDatabase.J();
    }

    public X1.a a(Context context, UUID uuid, g gVar) {
        androidx.work.impl.utils.futures.a t4 = androidx.work.impl.utils.futures.a.t();
        this.f14583a.c(new a(t4, uuid, gVar, context));
        return t4;
    }
}
