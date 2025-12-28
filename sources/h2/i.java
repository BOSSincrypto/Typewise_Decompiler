package H2;

import H2.f;
import J2.C0314m;
import J2.C0315m0;
import J2.C0328t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.c;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.collections.y;
import kotlin.jvm.internal.o;
import l2.f;
import l2.g;
import z2.d;

public final class i implements f, C0314m {

    /* renamed from: a  reason: collision with root package name */
    private final String f555a;

    /* renamed from: b  reason: collision with root package name */
    private final m f556b;

    /* renamed from: c  reason: collision with root package name */
    private final int f557c;

    /* renamed from: d  reason: collision with root package name */
    private final List f558d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f559e;

    /* renamed from: f  reason: collision with root package name */
    private final String[] f560f;

    /* renamed from: g  reason: collision with root package name */
    private final f[] f561g;

    /* renamed from: h  reason: collision with root package name */
    private final List[] f562h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean[] f563i;

    /* renamed from: j  reason: collision with root package name */
    private final Map f564j;

    /* renamed from: k  reason: collision with root package name */
    private final f[] f565k;

    /* renamed from: l  reason: collision with root package name */
    private final f f566l;

    public i(String str, m mVar, int i4, List list, a aVar) {
        o.e(str, "serialName");
        o.e(mVar, "kind");
        o.e(list, "typeParameters");
        o.e(aVar, "builder");
        this.f555a = str;
        this.f556b = mVar;
        this.f557c = i4;
        this.f558d = aVar.c();
        this.f559e = C0718m.z0(aVar.f());
        String[] strArr = (String[]) aVar.f().toArray(new String[0]);
        this.f560f = strArr;
        this.f561g = C0315m0.b(aVar.e());
        this.f562h = (List[]) aVar.d().toArray(new List[0]);
        this.f563i = C0718m.w0(aVar.g());
        Iterable<y> f02 = C0713h.f0(strArr);
        ArrayList arrayList = new ArrayList(C0718m.t(f02, 10));
        for (y yVar : f02) {
            arrayList.add(g.a(yVar.b(), Integer.valueOf(yVar.a())));
        }
        this.f564j = D.o(arrayList);
        this.f565k = C0315m0.b(list);
        this.f566l = c.b(new g(this));
    }

    /* access modifiers changed from: private */
    public static final int m(i iVar) {
        return C0328t0.a(iVar, iVar.f565k);
    }

    private final int n() {
        return ((Number) this.f566l.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public static final CharSequence o(i iVar, int i4) {
        return iVar.e(i4) + ": " + iVar.i(i4).b();
    }

    public int a(String str) {
        o.e(str, "name");
        Integer num = (Integer) this.f564j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public String b() {
        return this.f555a;
    }

    public m c() {
        return this.f556b;
    }

    public int d() {
        return this.f557c;
    }

    public String e(int i4) {
        return this.f560f[i4];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            f fVar = (f) obj;
            if (o.a(b(), fVar.b()) && Arrays.equals(this.f565k, ((i) obj).f565k) && d() == fVar.d()) {
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
        return this.f559e;
    }

    public boolean g() {
        return f.a.c(this);
    }

    public List getAnnotations() {
        return this.f558d;
    }

    public List h(int i4) {
        return this.f562h[i4];
    }

    public int hashCode() {
        return n();
    }

    public f i(int i4) {
        return this.f561g[i4];
    }

    public boolean isInline() {
        return f.a.b(this);
    }

    public boolean j(int i4) {
        return this.f563i[i4];
    }

    public String toString() {
        z2.c j4 = d.j(0, d());
        return C0718m.Z(j4, ", ", b() + '(', ")", 0, (CharSequence) null, new h(this), 24, (Object) null);
    }
}
