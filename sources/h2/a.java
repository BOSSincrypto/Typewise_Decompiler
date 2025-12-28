package H2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f532a;

    /* renamed from: b  reason: collision with root package name */
    private List f533b = C0718m.j();

    /* renamed from: c  reason: collision with root package name */
    private final List f534c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final Set f535d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private final List f536e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List f537f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final List f538g = new ArrayList();

    public a(String str) {
        o.e(str, "serialName");
        this.f532a = str;
    }

    public static /* synthetic */ void b(a aVar, String str, f fVar, List list, boolean z3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            list = C0718m.j();
        }
        if ((i4 & 8) != 0) {
            z3 = false;
        }
        aVar.a(str, fVar, list, z3);
    }

    public final void a(String str, f fVar, List list, boolean z3) {
        o.e(str, "elementName");
        o.e(fVar, "descriptor");
        o.e(list, "annotations");
        if (this.f535d.add(str)) {
            this.f534c.add(str);
            this.f536e.add(fVar);
            this.f537f.add(list);
            this.f538g.add(Boolean.valueOf(z3));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + this.f532a).toString());
    }

    public final List c() {
        return this.f533b;
    }

    public final List d() {
        return this.f537f;
    }

    public final List e() {
        return this.f536e;
    }

    public final List f() {
        return this.f534c;
    }

    public final List g() {
        return this.f538g;
    }

    public final void h(List list) {
        o.e(list, "<set-?>");
        this.f533b = list;
    }
}
