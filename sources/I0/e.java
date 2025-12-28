package i0;

import androidx.work.m;
import j0.C0684a;
import j0.C0685b;
import j0.C0686c;
import j0.d;
import j0.f;
import j0.g;
import j0.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import l0.v;
import l2.q;

public final class e implements d, C0686c.a {

    /* renamed from: a  reason: collision with root package name */
    private final c f13668a;

    /* renamed from: b  reason: collision with root package name */
    private final C0686c[] f13669b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f13670c;

    public e(c cVar, C0686c[] cVarArr) {
        o.e(cVarArr, "constraintControllers");
        this.f13668a = cVar;
        this.f13669b = cVarArr;
        this.f13670c = new Object();
    }

    public void a(Iterable iterable) {
        o.e(iterable, "workSpecs");
        synchronized (this.f13670c) {
            try {
                for (C0686c g4 : this.f13669b) {
                    g4.g((C0686c.a) null);
                }
                for (C0686c e4 : this.f13669b) {
                    e4.e(iterable);
                }
                for (C0686c g5 : this.f13669b) {
                    g5.g(this);
                }
                q qVar = q.f14567a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(List list) {
        o.e(list, "workSpecs");
        synchronized (this.f13670c) {
            try {
                ArrayList<v> arrayList = new ArrayList<>();
                for (Object next : list) {
                    if (e(((v) next).f14470a)) {
                        arrayList.add(next);
                    }
                }
                for (v vVar : arrayList) {
                    m e4 = m.e();
                    String a4 = f.f13671a;
                    e4.a(a4, "Constraints met for " + vVar);
                }
                c cVar = this.f13668a;
                if (cVar != null) {
                    cVar.e(arrayList);
                    q qVar = q.f14567a;
                }
            } finally {
            }
        }
    }

    public void c(List list) {
        o.e(list, "workSpecs");
        synchronized (this.f13670c) {
            c cVar = this.f13668a;
            if (cVar != null) {
                cVar.c(list);
                q qVar = q.f14567a;
            }
        }
    }

    public void d() {
        synchronized (this.f13670c) {
            try {
                for (C0686c f4 : this.f13669b) {
                    f4.f();
                }
                q qVar = q.f14567a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(String str) {
        boolean z3;
        C0686c cVar;
        o.e(str, "workSpecId");
        synchronized (this.f13670c) {
            try {
                C0686c[] cVarArr = this.f13669b;
                int length = cVarArr.length;
                z3 = false;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        cVar = null;
                        break;
                    }
                    cVar = cVarArr[i4];
                    if (cVar.d(str)) {
                        break;
                    }
                    i4++;
                }
                if (cVar != null) {
                    m.e().a(f.f13671a, "Work " + str + " constrained by " + cVar.getClass().getSimpleName());
                }
                if (cVar == null) {
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(k0.o oVar, c cVar) {
        this(cVar, new C0686c[]{new C0684a(oVar.a()), new C0685b(oVar.b()), new h(oVar.d()), new d(oVar.c()), new g(oVar.c()), new f(oVar.c()), new j0.e(oVar.c())});
        o.e(oVar, "trackers");
    }
}
