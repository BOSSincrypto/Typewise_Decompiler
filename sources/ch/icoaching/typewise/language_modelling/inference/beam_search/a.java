package ch.icoaching.typewise.language_modelling.inference.beam_search;

import D0.C;
import D0.D;
import D0.E;
import D0.J;
import D0.d0;
import ch.icoaching.typewise.language_modelling.inference.beam_search.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class a implements e {

    /* renamed from: h  reason: collision with root package name */
    public static final C0141a f8445h = new C0141a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final E f8446a;

    /* renamed from: b  reason: collision with root package name */
    private final List f8447b;

    /* renamed from: c  reason: collision with root package name */
    private final E f8448c;

    /* renamed from: d  reason: collision with root package name */
    private final E f8449d;

    /* renamed from: e  reason: collision with root package name */
    private final E f8450e;

    /* renamed from: f  reason: collision with root package name */
    private final E f8451f;

    /* renamed from: g  reason: collision with root package name */
    private final E f8452g;

    /* renamed from: ch.icoaching.typewise.language_modelling.inference.beam_search.a$a  reason: collision with other inner class name */
    public static final class C0141a {
        private C0141a() {
        }

        public final a a(int i4) {
            int i5 = i4;
            E.a aVar = E.f232d;
            E X3 = C.X(aVar.c(), C0718m.m(Integer.valueOf(i4), 0));
            List e4 = C0718m.e(C.p0(aVar.a(), C0718m.m(Integer.valueOf(i4), 0)));
            E p02 = C.p0(aVar.a(), C0718m.m(Integer.valueOf(i4), 0));
            ArrayList arrayList = new ArrayList(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                arrayList.add(Float.valueOf(0.0f));
            }
            E q02 = C.q0(arrayList);
            ArrayList arrayList2 = new ArrayList(i5);
            for (int i7 = 0; i7 < i5; i7++) {
                arrayList2.add(Float.valueOf(0.0f));
            }
            E q03 = C.q0(arrayList2);
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i8 = 0; i8 < i5; i8++) {
                arrayList3.add(0);
            }
            return new a(X3, e4, p02, q02, q03, C.x0(arrayList3), C.z(0));
        }

        public final Pair b(E e4, E e5) {
            o.e(e4, "scores");
            o.e(e5, "nIndicesToSelect");
            int intValue = ((Number) e4.i().get(1)).intValue();
            E p02 = C.p0(e4, C0718m.e(-1));
            E e6 = (E) d0.o(p02, C.u0(C.z(((Number) p02.i().get(0)).intValue()), e5).k(), false).component2();
            return new Pair(d0.k(e6, C.z(intValue)), d0.s(e6, C.z(intValue)));
        }

        public /* synthetic */ C0141a(i iVar) {
            this();
        }
    }

    public a(E e4, List list, E e5, E e6, E e7, E e8, E e9) {
        o.e(e4, "tokens");
        o.e(list, "states");
        o.e(e5, "lls");
        o.e(e6, "scores");
        o.e(e8, "numberOfStopTokensFound");
        o.e(e9, "nTemporarilyClosedBeams");
        this.f8446a = e4;
        this.f8447b = list;
        this.f8448c = e5;
        this.f8449d = e6;
        this.f8450e = e7;
        this.f8451f = e8;
        this.f8452g = e9;
    }

    public E a() {
        return this.f8446a;
    }

    public E b() {
        return J.s(h(), C.z(((Number) f().i().get(0)).intValue()));
    }

    public E c() {
        return this.f8449d;
    }

    public E d() {
        return this.f8451f;
    }

    public int e() {
        return e.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return o.a(this.f8446a, aVar.f8446a) && o.a(this.f8447b, aVar.f8447b) && o.a(this.f8448c, aVar.f8448c) && o.a(this.f8449d, aVar.f8449d) && o.a(this.f8450e, aVar.f8450e) && o.a(this.f8451f, aVar.f8451f) && o.a(this.f8452g, aVar.f8452g);
    }

    public E f() {
        return this.f8448c;
    }

    public E g() {
        return this.f8450e;
    }

    public E h() {
        return this.f8452g;
    }

    public int hashCode() {
        int hashCode = ((((((this.f8446a.hashCode() * 31) + this.f8447b.hashCode()) * 31) + this.f8448c.hashCode()) * 31) + this.f8449d.hashCode()) * 31;
        E e4 = this.f8450e;
        return ((((hashCode + (e4 == null ? 0 : e4.hashCode())) * 31) + this.f8451f.hashCode()) * 31) + this.f8452g.hashCode();
    }

    public boolean isEmpty() {
        return e.a.b(this);
    }

    public List j() {
        return this.f8447b;
    }

    public a k(E e4, E e5) {
        o.e(e4, "mask");
        o.e(e5, "newNumberOfStopTokensFound");
        E m02 = C.m0(a(), e4, (Integer) null, 4, (Object) null);
        List<E> j4 = j();
        ArrayList arrayList = new ArrayList(C0718m.t(j4, 10));
        for (E O3 : j4) {
            arrayList.add(C.O(O3, e4, (Integer) null, 4, (Object) null));
        }
        return new a(m02, arrayList, C.O(f(), e4, (Integer) null, 4, (Object) null), C.O(c(), e4, (Integer) null, 4, (Object) null), D.a(g(), e4), C.m0(e5, e4, (Integer) null, 4, (Object) null), h());
    }

    public String toString() {
        E e4 = this.f8446a;
        List list = this.f8447b;
        E e5 = this.f8448c;
        E e6 = this.f8449d;
        E e7 = this.f8450e;
        E e8 = this.f8451f;
        E e9 = this.f8452g;
        return "BeamCollection(tokens=" + e4 + ", states=" + list + ", lls=" + e5 + ", scores=" + e6 + ", beamEditDistances=" + e7 + ", numberOfStopTokensFound=" + e8 + ", nTemporarilyClosedBeams=" + e9 + ")";
    }
}
