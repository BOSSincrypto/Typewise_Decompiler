package D0;

import E0.m;
import ch.icoaching.typewise.language_modelling.inference.beam_search.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.B;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import z2.c;

public class k0 {

    /* renamed from: i  reason: collision with root package name */
    public static final a f328i = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static float f329j = Float.NEGATIVE_INFINITY;

    /* renamed from: a  reason: collision with root package name */
    private final List f330a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f331b;

    /* renamed from: c  reason: collision with root package name */
    private final int f332c;

    /* renamed from: d  reason: collision with root package name */
    private E f333d;

    /* renamed from: e  reason: collision with root package name */
    private final E f334e;

    /* renamed from: f  reason: collision with root package name */
    private final Set f335f;

    /* renamed from: g  reason: collision with root package name */
    private int f336g;

    /* renamed from: h  reason: collision with root package name */
    private E f337h;

    public static final class a {
        private a() {
        }

        public final float a() {
            return k0.f329j;
        }

        public final E b(E e4, E e5) {
            o.e(e4, "oldLls");
            o.e(e5, "candidateLls");
            return J.r(C.n0(e4, 1, true), e5);
        }

        public final Float c(Float f4) {
            if (f4 == null) {
                return null;
            }
            return Float.valueOf((float) Math.log((double) f4.floatValue()));
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public k0(List list, List list2, int i4, boolean z3, int i5) {
        o.e(list, "stopIndices");
        o.e(list2, "validForPredictionIndicesMask");
        this.f330a = list;
        this.f331b = z3;
        this.f332c = i5;
        this.f333d = C.a0(list2);
        this.f334e = C.x0(list);
        this.f335f = C0718m.F0(list);
        this.f336g = i4 * i5;
        c k4 = C0718m.k(list2);
        ArrayList arrayList = new ArrayList(C0718m.t(k4, 10));
        Iterator it = k4.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(this.f335f.contains(Integer.valueOf(((B) it).b()))));
        }
        this.f337h = C.a0(arrayList);
    }

    public static /* synthetic */ Pair d(k0 k0Var, e eVar, boolean z3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                z3 = false;
            }
            return k0Var.f(eVar, z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkTerminatedBeams");
    }

    private final Pair j(e eVar, E e4, String str) {
        if (this.f332c <= 1) {
            e4 = b(e4);
        }
        return new Pair(f328i.b(eVar.f(), e4), null);
    }

    public final E b(E e4) {
        o.e(e4, "scores");
        E J3 = C.J(this.f337h, e4, C.y(f329j));
        return C.J(C.D(C.S(J3, -1), ((Number) m.e(J3.i(), -1)).intValue(), 0, 0, (Integer) null, 28, (Object) null), e4, C.J(this.f337h, C.y(f329j), e4));
    }

    public Pair c(E e4, String str) {
        o.e(e4, "lls");
        o.e(str, "prior");
        E h4 = h(e4);
        if (this.f332c <= 1) {
            h4 = b(h4);
        }
        return new Pair(h4, null);
    }

    public final Pair e(e eVar, E e4, String str) {
        o.e(eVar, "runningBeams");
        o.e(e4, "candidateLls");
        o.e(str, "completePossiblyNoisyLowerCasedPrior");
        return j(eVar, h(e4), str);
    }

    public Pair f(e eVar, boolean z3) {
        o.e(eVar, "runningBeams");
        E i4 = i(eVar, z3);
        E s4 = J.s(eVar.d(), i4);
        E F3 = C.F(s4, C.z(this.f332c));
        E e4 = J.e(i4, F3);
        E e5 = J.e(i4, d0.r(F3));
        E r4 = d0.r(e4);
        ch.icoaching.typewise.language_modelling.inference.beam_search.a k4 = eVar.k(e4, s4);
        ch.icoaching.typewise.language_modelling.inference.beam_search.a k5 = eVar.k(e5, s4);
        return new Pair(eVar.k(r4, s4), C0718m.m(k5, k4));
    }

    public boolean g(int i4) {
        return this.f335f.contains(Integer.valueOf(i4));
    }

    public E h(E e4) {
        o.e(e4, "scores");
        return C.J(this.f333d, e4, C.y(f329j));
    }

    public E i(e eVar, boolean z3) {
        o.e(eVar, "runningBeams");
        if (!z3 || this.f331b) {
            return C.V(J.t(J.l(eVar.a()), this.f334e), -1, false, 4, (Object) null);
        }
        return C.Z0(C0718m.e(Integer.valueOf(eVar.e())));
    }

    public final boolean k() {
        return this.f331b;
    }

    public final int l() {
        return this.f336g;
    }

    public final int m() {
        return this.f332c;
    }

    public final List n() {
        return this.f330a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(List list, List list2, int i4, boolean z3, int i5, int i6, i iVar) {
        this(list, list2, i4, (i6 & 8) != 0 ? true : z3, (i6 & 16) != 0 ? 1 : i5);
    }
}
