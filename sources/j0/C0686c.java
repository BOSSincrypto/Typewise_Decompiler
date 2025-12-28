package j0;

import i0.C0677a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k0.C0700h;
import kotlin.jvm.internal.o;
import l0.v;

/* renamed from: j0.c  reason: case insensitive filesystem */
public abstract class C0686c implements C0677a {

    /* renamed from: a  reason: collision with root package name */
    private final C0700h f13739a;

    /* renamed from: b  reason: collision with root package name */
    private final List f13740b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List f13741c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private Object f13742d;

    /* renamed from: e  reason: collision with root package name */
    private a f13743e;

    /* renamed from: j0.c$a */
    public interface a {
        void b(List list);

        void c(List list);
    }

    public C0686c(C0700h hVar) {
        o.e(hVar, "tracker");
        this.f13739a = hVar;
    }

    private final void h(a aVar, Object obj) {
        if (!this.f13740b.isEmpty() && aVar != null) {
            if (obj == null || c(obj)) {
                aVar.c(this.f13740b);
            } else {
                aVar.b(this.f13740b);
            }
        }
    }

    public void a(Object obj) {
        this.f13742d = obj;
        h(this.f13743e, obj);
    }

    public abstract boolean b(v vVar);

    public abstract boolean c(Object obj);

    public final boolean d(String str) {
        o.e(str, "workSpecId");
        Object obj = this.f13742d;
        if (obj == null || !c(obj) || !this.f13741c.contains(str)) {
            return false;
        }
        return true;
    }

    public final void e(Iterable iterable) {
        o.e(iterable, "workSpecs");
        this.f13740b.clear();
        this.f13741c.clear();
        Collection collection = this.f13740b;
        for (Object next : iterable) {
            if (b((v) next)) {
                collection.add(next);
            }
        }
        Collection collection2 = this.f13741c;
        for (v vVar : this.f13740b) {
            collection2.add(vVar.f14470a);
        }
        if (this.f13740b.isEmpty()) {
            this.f13739a.f(this);
        } else {
            this.f13739a.c(this);
        }
        h(this.f13743e, this.f13742d);
    }

    public final void f() {
        if (!this.f13740b.isEmpty()) {
            this.f13740b.clear();
            this.f13739a.f(this);
        }
    }

    public final void g(a aVar) {
        if (this.f13743e != aVar) {
            this.f13743e = aVar;
            h(aVar, this.f13742d);
        }
    }
}
