package m0;

import androidx.work.m;
import androidx.work.s;
import java.util.HashMap;
import java.util.Map;

/* renamed from: m0.E  reason: case insensitive filesystem */
public class C0801E {

    /* renamed from: e  reason: collision with root package name */
    private static final String f14594e = m.i("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    final s f14595a;

    /* renamed from: b  reason: collision with root package name */
    final Map f14596b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map f14597c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final Object f14598d = new Object();

    /* renamed from: m0.E$a */
    public interface a {
        void a(l0.m mVar);
    }

    /* renamed from: m0.E$b */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final C0801E f14599a;

        /* renamed from: b  reason: collision with root package name */
        private final l0.m f14600b;

        b(C0801E e4, l0.m mVar) {
            this.f14599a = e4;
            this.f14600b = mVar;
        }

        public void run() {
            synchronized (this.f14599a.f14598d) {
                try {
                    if (((b) this.f14599a.f14596b.remove(this.f14600b)) != null) {
                        a aVar = (a) this.f14599a.f14597c.remove(this.f14600b);
                        if (aVar != null) {
                            aVar.a(this.f14600b);
                        }
                    } else {
                        m.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f14600b}));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C0801E(s sVar) {
        this.f14595a = sVar;
    }

    public void a(l0.m mVar, long j4, a aVar) {
        synchronized (this.f14598d) {
            m e4 = m.e();
            String str = f14594e;
            e4.a(str, "Starting timer for " + mVar);
            b(mVar);
            b bVar = new b(this, mVar);
            this.f14596b.put(mVar, bVar);
            this.f14597c.put(mVar, aVar);
            this.f14595a.a(j4, bVar);
        }
    }

    public void b(l0.m mVar) {
        synchronized (this.f14598d) {
            try {
                if (((b) this.f14596b.remove(mVar)) != null) {
                    m e4 = m.e();
                    String str = f14594e;
                    e4.a(str, "Stopping timer for " + mVar);
                    this.f14597c.remove(mVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
