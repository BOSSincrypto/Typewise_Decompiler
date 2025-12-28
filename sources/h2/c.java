package H2;

import java.util.List;
import kotlin.jvm.internal.o;

final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final f f539a;

    /* renamed from: b  reason: collision with root package name */
    public final A2.c f540b;

    /* renamed from: c  reason: collision with root package name */
    private final String f541c;

    public c(f fVar, A2.c cVar) {
        o.e(fVar, "original");
        o.e(cVar, "kClass");
        this.f539a = fVar;
        this.f540b = cVar;
        this.f541c = fVar.b() + '<' + cVar.b() + '>';
    }

    public int a(String str) {
        o.e(str, "name");
        return this.f539a.a(str);
    }

    public String b() {
        return this.f541c;
    }

    public m c() {
        return this.f539a.c();
    }

    public int d() {
        return this.f539a.d();
    }

    public String e(int i4) {
        return this.f539a.e(i4);
    }

    public boolean equals(Object obj) {
        c cVar;
        if (obj instanceof c) {
            cVar = (c) obj;
        } else {
            cVar = null;
        }
        if (cVar != null && o.a(this.f539a, cVar.f539a) && o.a(cVar.f540b, this.f540b)) {
            return true;
        }
        return false;
    }

    public boolean g() {
        return this.f539a.g();
    }

    public List getAnnotations() {
        return this.f539a.getAnnotations();
    }

    public List h(int i4) {
        return this.f539a.h(i4);
    }

    public int hashCode() {
        return (this.f540b.hashCode() * 31) + b().hashCode();
    }

    public f i(int i4) {
        return this.f539a.i(i4);
    }

    public boolean isInline() {
        return this.f539a.isInline();
    }

    public boolean j(int i4) {
        return this.f539a.j(i4);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f540b + ", original: " + this.f539a + ')';
    }
}
