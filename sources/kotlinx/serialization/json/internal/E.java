package kotlinx.serialization.json.internal;

import H2.d;
import H2.f;
import H2.m;
import I2.c;
import J2.L;
import K2.B;
import K2.C0341a;
import K2.D;
import K2.F;
import K2.h;
import K2.y;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;

class E extends C0764c {

    /* renamed from: g  reason: collision with root package name */
    private final B f14333g;

    /* renamed from: h  reason: collision with root package name */
    private final f f14334h;

    /* renamed from: i  reason: collision with root package name */
    private int f14335i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f14336j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(C0341a aVar, B b4, String str, f fVar, int i4, i iVar) {
        this(aVar, b4, (i4 & 4) != 0 ? null : str, (i4 & 8) != 0 ? null : fVar);
    }

    private final boolean C0(f fVar, int i4) {
        boolean z3;
        if (b().d().j() || fVar.j(i4) || !fVar.i(i4).g()) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f14336j = z3;
        return z3;
    }

    private final boolean D0(f fVar, int i4, String str) {
        D d4;
        boolean z3;
        C0341a b4 = b();
        boolean j4 = fVar.j(i4);
        f i5 = fVar.i(i4);
        if (j4 && !i5.g() && (l0(str) instanceof y)) {
            return true;
        }
        if (o.a(i5.c(), m.b.f574a) && (!i5.g() || !(l0(str) instanceof y))) {
            h l02 = l0(str);
            String str2 = null;
            if (l02 instanceof D) {
                d4 = (D) l02;
            } else {
                d4 = null;
            }
            if (d4 != null) {
                str2 = K2.i.d(d4);
            }
            if (str2 != null) {
                int i6 = z.i(i5, b4, str2);
                if (b4.d().j() || !i5.g()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (i6 == -3 && (j4 || z3)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: E0 */
    public B z0() {
        return this.f14333g;
    }

    public void c(f fVar) {
        Set set;
        Set set2;
        o.e(fVar, "descriptor");
        if (!this.f14386f.k() && !(fVar.c() instanceof d)) {
            z.m(fVar, b());
            if (!this.f14386f.o()) {
                set = L.a(fVar);
            } else {
                Set a4 = L.a(fVar);
                Map map = (Map) F.a(b()).a(fVar, z.g());
                if (map != null) {
                    set2 = map.keySet();
                } else {
                    set2 = null;
                }
                if (set2 == null) {
                    set2 = kotlin.collections.L.e();
                }
                set = kotlin.collections.L.j(a4, set2);
            }
            for (String str : z0().keySet()) {
                if (!set.contains(str) && !o.a(str, y0())) {
                    throw x.f(str, z0().toString());
                }
            }
        }
    }

    public c d(f fVar) {
        o.e(fVar, "descriptor");
        if (fVar != this.f14334h) {
            return super.d(fVar);
        }
        C0341a b4 = b();
        h m02 = m0();
        String b5 = this.f14334h.b();
        if (m02 instanceof B) {
            return new E(b4, (B) m02, y0(), this.f14334h);
        }
        throw x.e(-1, "Expected " + r.b(B.class).b() + ", but had " + r.b(m02.getClass()).b() + " as the serialized body of " + b5 + " at element: " + i0(), m02.toString());
    }

    public int e(f fVar) {
        o.e(fVar, "descriptor");
        while (this.f14335i < fVar.d()) {
            int i4 = this.f14335i;
            this.f14335i = i4 + 1;
            String g02 = Z(fVar, i4);
            int i5 = this.f14335i - 1;
            this.f14336j = false;
            if ((z0().containsKey(g02) || C0(fVar, i5)) && (!this.f14386f.g() || !D0(fVar, i5, g02))) {
                return i5;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public String f0(f fVar, int i4) {
        Object obj;
        o.e(fVar, "descriptor");
        z.m(fVar, b());
        String e4 = fVar.e(i4);
        if (!this.f14386f.o() || z0().keySet().contains(e4)) {
            return e4;
        }
        Map e5 = z.e(b(), fVar);
        Iterator it = z0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer num = (Integer) e5.get((String) obj);
            if (num != null && num.intValue() == i4) {
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            return str;
        }
        return e4;
    }

    public boolean j() {
        if (this.f14336j || !super.j()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public h l0(String str) {
        o.e(str, "tag");
        return (h) kotlin.collections.D.i(z0(), str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E(C0341a aVar, B b4, String str, f fVar) {
        super(aVar, b4, str, (i) null);
        o.e(aVar, "json");
        o.e(b4, "value");
        this.f14333g = b4;
        this.f14334h = fVar;
    }
}
