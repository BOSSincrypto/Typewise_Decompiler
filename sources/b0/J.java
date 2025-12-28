package B0;

import F2.m;
import H2.f;
import I2.c;
import I2.d;
import I2.e;
import J2.C0;
import J2.C0300f;
import J2.C0317n0;
import J2.C0326s0;
import J2.C0329u;
import J2.F;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0012\"B;\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001f¨\u0006%"}, d2 = {"LB0/J;", "", "", "seen0", "", "", "means", "stds", "LJ2/C0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/List;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "a", "(LB0/J;LI2/d;LH2/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "getMeans$annotations", "()V", "b", "d", "getStds$annotations", "typewise-autocorrect-library-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
@m
public final class J {

    /* renamed from: c  reason: collision with root package name */
    public static final b f69c = new b((i) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final F2.b[] f70d;

    /* renamed from: a  reason: collision with root package name */
    private final List f71a;

    /* renamed from: b  reason: collision with root package name */
    private final List f72b;

    public /* synthetic */ class a implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final a f73a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f74b;

        static {
            a aVar = new a();
            f73a = aVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.autocorrection.helpers.NormalizerData", aVar, 2);
            s0Var.p("means", false);
            s0Var.p("stds", false);
            f74b = s0Var;
        }

        private a() {
        }

        public final f a() {
            return f74b;
        }

        public final F2.b[] c() {
            F2.b[] b4 = J.f70d;
            return new F2.b[]{b4[0], b4[1]};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* renamed from: f */
        public final J b(e eVar) {
            int i4;
            List list;
            List list2;
            o.e(eVar, "decoder");
            f fVar = f74b;
            c d4 = eVar.d(fVar);
            F2.b[] b4 = J.f70d;
            if (d4.p()) {
                list = (List) d4.E(fVar, 0, b4[0], (Object) null);
                list2 = (List) d4.E(fVar, 1, b4[1], (Object) null);
                i4 = 3;
            } else {
                boolean z3 = true;
                int i5 = 0;
                List list3 = null;
                List list4 = null;
                while (z3) {
                    int e4 = d4.e(fVar);
                    if (e4 == -1) {
                        z3 = false;
                    } else if (e4 == 0) {
                        list4 = (List) d4.E(fVar, 0, b4[0], list4);
                        i5 |= 1;
                    } else if (e4 == 1) {
                        list3 = (List) d4.E(fVar, 1, b4[1], list3);
                        i5 |= 2;
                    } else {
                        throw new UnknownFieldException(e4);
                    }
                }
                list2 = list3;
                list = list4;
                i4 = i5;
            }
            d4.c(fVar);
            return new J(i4, list, list2, (C0) null);
        }

        /* renamed from: g */
        public final void e(I2.f fVar, J j4) {
            o.e(fVar, "encoder");
            o.e(j4, "value");
            f fVar2 = f74b;
            d d4 = fVar.d(fVar2);
            J.a(j4, d4, fVar2);
            d4.c(fVar2);
        }
    }

    public static final class b {
        private b() {
        }

        public final F2.b serializer() {
            return a.f73a;
        }

        public /* synthetic */ b(i iVar) {
            this();
        }
    }

    static {
        C0329u uVar = C0329u.f745a;
        f70d = new F2.b[]{new C0300f(uVar), new C0300f(uVar)};
    }

    public /* synthetic */ J(int i4, List list, List list2, C0 c02) {
        if (3 != (i4 & 3)) {
            C0317n0.a(i4, 3, a.f73a.a());
        }
        this.f71a = list;
        this.f72b = list2;
    }

    public static final /* synthetic */ void a(J j4, d dVar, f fVar) {
        F2.b[] bVarArr = f70d;
        dVar.f(fVar, 0, bVarArr[0], j4.f71a);
        dVar.f(fVar, 1, bVarArr[1], j4.f72b);
    }

    public final List c() {
        return this.f71a;
    }

    public final List d() {
        return this.f72b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j4 = (J) obj;
        if (o.a(this.f71a, j4.f71a) && o.a(this.f72b, j4.f72b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f71a.hashCode() * 31) + this.f72b.hashCode();
    }

    public String toString() {
        List list = this.f71a;
        List list2 = this.f72b;
        return "NormalizerData(means=" + list + ", stds=" + list2 + ")";
    }
}
