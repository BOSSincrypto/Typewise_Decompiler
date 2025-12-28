package D0;

import F2.m;
import H2.f;
import I2.c;
import I2.d;
import I2.e;
import J2.C0;
import J2.C0300f;
import J2.C0317n0;
import J2.C0326s0;
import J2.E;
import J2.F;
import J2.K;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 $2\u00020\u0001:\u0002\u0013#B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001e\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010 ¨\u0006&"}, d2 = {"LD0/c;", "", "", "", "shape", "", "data", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "a", "(LD0/c;LI2/d;LH2/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "getShape$annotations", "()V", "b", "c", "getData$annotations", "typewise-autocorrect-library-predictions-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
@m
/* renamed from: D0.c  reason: case insensitive filesystem */
public final class C0267c {

    /* renamed from: c  reason: collision with root package name */
    public static final b f264c = new b((i) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final F2.b[] f265d = {new C0300f(K.f636a), new C0300f(E.f616a)};

    /* renamed from: a  reason: collision with root package name */
    private final List f266a;

    /* renamed from: b  reason: collision with root package name */
    private final List f267b;

    /* renamed from: D0.c$a */
    public /* synthetic */ class a implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final a f268a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f269b;

        static {
            a aVar = new a();
            f268a = aVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.tf.SerializableTensorOfFloats", aVar, 2);
            s0Var.p("shape", false);
            s0Var.p("data", false);
            f269b = s0Var;
        }

        private a() {
        }

        public final f a() {
            return f269b;
        }

        public final F2.b[] c() {
            F2.b[] b4 = C0267c.f265d;
            return new F2.b[]{b4[0], b4[1]};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* renamed from: f */
        public final C0267c b(e eVar) {
            int i4;
            List list;
            List list2;
            o.e(eVar, "decoder");
            f fVar = f269b;
            c d4 = eVar.d(fVar);
            F2.b[] b4 = C0267c.f265d;
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
            return new C0267c(i4, list, list2, (C0) null);
        }

        /* renamed from: g */
        public final void e(I2.f fVar, C0267c cVar) {
            o.e(fVar, "encoder");
            o.e(cVar, "value");
            f fVar2 = f269b;
            d d4 = fVar.d(fVar2);
            C0267c.a(cVar, d4, fVar2);
            d4.c(fVar2);
        }
    }

    /* renamed from: D0.c$b */
    public static final class b {
        private b() {
        }

        public final F2.b serializer() {
            return a.f268a;
        }

        public /* synthetic */ b(i iVar) {
            this();
        }
    }

    public /* synthetic */ C0267c(int i4, List list, List list2, C0 c02) {
        if (3 != (i4 & 3)) {
            C0317n0.a(i4, 3, a.f268a.a());
        }
        this.f266a = list;
        this.f267b = list2;
    }

    public static final /* synthetic */ void a(C0267c cVar, d dVar, f fVar) {
        F2.b[] bVarArr = f265d;
        dVar.f(fVar, 0, bVarArr[0], cVar.f266a);
        dVar.f(fVar, 1, bVarArr[1], cVar.f267b);
    }

    public final List c() {
        return this.f267b;
    }

    public final List d() {
        return this.f266a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0267c)) {
            return false;
        }
        C0267c cVar = (C0267c) obj;
        if (o.a(this.f266a, cVar.f266a) && o.a(this.f267b, cVar.f267b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f266a.hashCode() * 31) + this.f267b.hashCode();
    }

    public String toString() {
        List list = this.f266a;
        List list2 = this.f267b;
        return "SerializableTensorOfFloats(shape=" + list + ", data=" + list2 + ")";
    }

    public C0267c(List list, List list2) {
        o.e(list, "shape");
        o.e(list2, "data");
        this.f266a = list;
        this.f267b = list2;
    }
}
