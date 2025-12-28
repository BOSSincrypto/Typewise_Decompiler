package J2;

import F2.b;
import H2.f;
import H2.m;
import H2.n;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.c;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import z2.d;

/* renamed from: J2.s0  reason: case insensitive filesystem */
public class C0326s0 implements f, C0314m {

    /* renamed from: a  reason: collision with root package name */
    private final String f732a;

    /* renamed from: b  reason: collision with root package name */
    private final F f733b;

    /* renamed from: c  reason: collision with root package name */
    private final int f734c;

    /* renamed from: d  reason: collision with root package name */
    private int f735d;

    /* renamed from: e  reason: collision with root package name */
    private final String[] f736e;

    /* renamed from: f  reason: collision with root package name */
    private final List[] f737f;

    /* renamed from: g  reason: collision with root package name */
    private List f738g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f739h;

    /* renamed from: i  reason: collision with root package name */
    private Map f740i;

    /* renamed from: j  reason: collision with root package name */
    private final l2.f f741j;

    /* renamed from: k  reason: collision with root package name */
    private final l2.f f742k;

    /* renamed from: l  reason: collision with root package name */
    private final l2.f f743l;

    public C0326s0(String str, F f4, int i4) {
        o.e(str, "serialName");
        this.f732a = str;
        this.f733b = f4;
        this.f734c = i4;
        this.f735d = -1;
        String[] strArr = new String[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            strArr[i5] = "[UNINITIALIZED]";
        }
        this.f736e = strArr;
        int i6 = this.f734c;
        this.f737f = new List[i6];
        this.f739h = new boolean[i6];
        this.f740i = D.h();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f741j = c.a(lazyThreadSafetyMode, new C0321p0(this));
        this.f742k = c.a(lazyThreadSafetyMode, new C0323q0(this));
        this.f743l = c.a(lazyThreadSafetyMode, new C0324r0(this));
    }

    /* access modifiers changed from: private */
    public static final int o(C0326s0 s0Var) {
        return C0328t0.a(s0Var, s0Var.u());
    }

    public static /* synthetic */ void q(C0326s0 s0Var, String str, boolean z3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                z3 = false;
            }
            s0Var.p(str, z3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
    }

    private final Map r() {
        HashMap hashMap = new HashMap();
        int length = this.f736e.length;
        for (int i4 = 0; i4 < length; i4++) {
            hashMap.put(this.f736e[i4], Integer.valueOf(i4));
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static final b[] s(C0326s0 s0Var) {
        b[] c4;
        F f4 = s0Var.f733b;
        if (f4 == null || (c4 = f4.c()) == null) {
            return C0330u0.f747a;
        }
        return c4;
    }

    private final b[] t() {
        return (b[]) this.f741j.getValue();
    }

    private final int v() {
        return ((Number) this.f743l.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public static final CharSequence y(C0326s0 s0Var, int i4) {
        return s0Var.e(i4) + ": " + s0Var.i(i4).b();
    }

    /* access modifiers changed from: private */
    public static final f[] z(C0326s0 s0Var) {
        ArrayList arrayList;
        b[] d4;
        F f4 = s0Var.f733b;
        if (f4 == null || (d4 = f4.d()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(d4.length);
            for (b a4 : d4) {
                arrayList.add(a4.a());
            }
        }
        return C0315m0.b(arrayList);
    }

    public int a(String str) {
        o.e(str, "name");
        Integer num = (Integer) this.f740i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public String b() {
        return this.f732a;
    }

    public m c() {
        return n.a.f575a;
    }

    public final int d() {
        return this.f734c;
    }

    public String e(int i4) {
        return this.f736e[i4];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0326s0) {
            f fVar = (f) obj;
            if (o.a(b(), fVar.b()) && Arrays.equals(u(), ((C0326s0) obj).u()) && d() == fVar.d()) {
                int d4 = d();
                int i4 = 0;
                while (i4 < d4) {
                    if (o.a(i(i4).b(), fVar.i(i4).b()) && o.a(i(i4).c(), fVar.i(i4).c())) {
                        i4++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public Set f() {
        return this.f740i.keySet();
    }

    public boolean g() {
        return f.a.c(this);
    }

    public List getAnnotations() {
        List list = this.f738g;
        if (list == null) {
            return C0718m.j();
        }
        return list;
    }

    public List h(int i4) {
        List list = this.f737f[i4];
        if (list == null) {
            return C0718m.j();
        }
        return list;
    }

    public int hashCode() {
        return v();
    }

    public f i(int i4) {
        return t()[i4].a();
    }

    public boolean isInline() {
        return f.a.b(this);
    }

    public boolean j(int i4) {
        return this.f739h[i4];
    }

    public final void p(String str, boolean z3) {
        o.e(str, "name");
        String[] strArr = this.f736e;
        int i4 = this.f735d + 1;
        this.f735d = i4;
        strArr[i4] = str;
        this.f739h[i4] = z3;
        this.f737f[i4] = null;
        if (i4 == this.f734c - 1) {
            this.f740i = r();
        }
    }

    public String toString() {
        z2.c j4 = d.j(0, this.f734c);
        return C0718m.Z(j4, ", ", b() + '(', ")", 0, (CharSequence) null, new C0319o0(this), 24, (Object) null);
    }

    public final f[] u() {
        return (f[]) this.f742k.getValue();
    }

    public final void w(Annotation annotation) {
        o.e(annotation, "annotation");
        List list = this.f737f[this.f735d];
        if (list == null) {
            list = new ArrayList(1);
            this.f737f[this.f735d] = list;
        }
        list.add(annotation);
    }

    public final void x(Annotation annotation) {
        o.e(annotation, "a");
        if (this.f738g == null) {
            this.f738g = new ArrayList(1);
        }
        List list = this.f738g;
        o.b(list);
        list.add(annotation);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0326s0(String str, F f4, int i4, int i5, i iVar) {
        this(str, (i5 & 2) != 0 ? null : f4, i4);
    }
}
