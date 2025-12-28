package h0;

import androidx.work.m;
import androidx.work.s;
import java.util.HashMap;
import java.util.Map;
import l0.v;

/* renamed from: h0.a  reason: case insensitive filesystem */
public class C0659a {

    /* renamed from: d  reason: collision with root package name */
    static final String f13619d = m.i("DelayedWorkTracker");

    /* renamed from: a  reason: collision with root package name */
    final C0660b f13620a;

    /* renamed from: b  reason: collision with root package name */
    private final s f13621b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f13622c = new HashMap();

    /* renamed from: h0.a$a  reason: collision with other inner class name */
    class C0189a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f13623a;

        C0189a(v vVar) {
            this.f13623a = vVar;
        }

        public void run() {
            m e4 = m.e();
            String str = C0659a.f13619d;
            e4.a(str, "Scheduling work " + this.f13623a.f14470a);
            C0659a.this.f13620a.d(this.f13623a);
        }
    }

    public C0659a(C0660b bVar, s sVar) {
        this.f13620a = bVar;
        this.f13621b = sVar;
    }

    public void a(v vVar) {
        Runnable runnable = (Runnable) this.f13622c.remove(vVar.f14470a);
        if (runnable != null) {
            this.f13621b.b(runnable);
        }
        C0189a aVar = new C0189a(vVar);
        this.f13622c.put(vVar.f14470a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.f13621b.a(vVar.c() - currentTimeMillis, aVar);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.f13622c.remove(str);
        if (runnable != null) {
            this.f13621b.b(runnable);
        }
    }
}
