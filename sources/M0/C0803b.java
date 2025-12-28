package m0;

import androidx.work.WorkInfo;
import androidx.work.impl.F;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.o;
import androidx.work.impl.t;
import androidx.work.impl.u;
import androidx.work.o;
import java.util.LinkedList;
import java.util.UUID;
import l0.C0785b;
import l0.w;

/* renamed from: m0.b  reason: case insensitive filesystem */
public abstract class C0803b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final o f14602a = new o();

    /* renamed from: m0.b$a */
    class a extends C0803b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ F f14603b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UUID f14604c;

        a(F f4, UUID uuid) {
            this.f14603b = f4;
            this.f14604c = uuid;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public void g() {
            WorkDatabase u3 = this.f14603b.u();
            u3.e();
            try {
                a(this.f14603b, this.f14604c.toString());
                u3.B();
                u3.i();
                f(this.f14603b);
            } catch (Throwable th) {
                u3.i();
                throw th;
            }
        }
    }

    /* renamed from: m0.b$b  reason: collision with other inner class name */
    class C0207b extends C0803b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ F f14605b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f14606c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f14607d;

        C0207b(F f4, String str, boolean z3) {
            this.f14605b = f4;
            this.f14606c = str;
            this.f14607d = z3;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            WorkDatabase u3 = this.f14605b.u();
            u3.e();
            try {
                for (String a4 : u3.J().f(this.f14606c)) {
                    a(this.f14605b, a4);
                }
                u3.B();
                u3.i();
                if (this.f14607d) {
                    f(this.f14605b);
                }
            } catch (Throwable th) {
                u3.i();
                throw th;
            }
        }
    }

    public static C0803b b(UUID uuid, F f4) {
        return new a(f4, uuid);
    }

    public static C0803b c(String str, F f4, boolean z3) {
        return new C0207b(f4, str, z3);
    }

    private void e(WorkDatabase workDatabase, String str) {
        w J3 = workDatabase.J();
        C0785b E3 = workDatabase.E();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo.State i4 = J3.i(str2);
            if (!(i4 == WorkInfo.State.SUCCEEDED || i4 == WorkInfo.State.FAILED)) {
                J3.o(WorkInfo.State.CANCELLED, str2);
            }
            linkedList.addAll(E3.d(str2));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(F f4, String str) {
        e(f4.u(), str);
        f4.r().r(str);
        for (t a4 : f4.s()) {
            a4.a(str);
        }
    }

    public androidx.work.o d() {
        return this.f14602a;
    }

    /* access modifiers changed from: package-private */
    public void f(F f4) {
        u.b(f4.n(), f4.u(), f4.s());
    }

    /* access modifiers changed from: package-private */
    public abstract void g();

    public void run() {
        try {
            g();
            this.f14602a.a(androidx.work.o.f7433a);
        } catch (Throwable th) {
            this.f14602a.a(new o.b.a(th));
        }
    }
}
