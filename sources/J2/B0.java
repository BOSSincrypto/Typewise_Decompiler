package J2;

import H2.f;
import H2.m;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

public final class B0 implements f, C0314m {

    /* renamed from: a  reason: collision with root package name */
    private final f f608a;

    /* renamed from: b  reason: collision with root package name */
    private final String f609b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f610c;

    public B0(f fVar) {
        o.e(fVar, "original");
        this.f608a = fVar;
        this.f609b = fVar.b() + '?';
        this.f610c = C0315m0.a(fVar);
    }

    public int a(String str) {
        o.e(str, "name");
        return this.f608a.a(str);
    }

    public String b() {
        return this.f609b;
    }

    public m c() {
        return this.f608a.c();
    }

    public int d() {
        return this.f608a.d();
    }

    public String e(int i4) {
        return this.f608a.e(i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof B0) && o.a(this.f608a, ((B0) obj).f608a)) {
            return true;
        }
        return false;
    }

    public Set f() {
        return this.f610c;
    }

    public boolean g() {
        return true;
    }

    public List getAnnotations() {
        return this.f608a.getAnnotations();
    }

    public List h(int i4) {
        return this.f608a.h(i4);
    }

    public int hashCode() {
        return this.f608a.hashCode() * 31;
    }

    public f i(int i4) {
        return this.f608a.i(i4);
    }

    public boolean isInline() {
        return this.f608a.isInline();
    }

    public boolean j(int i4) {
        return this.f608a.j(i4);
    }

    public final f k() {
        return this.f608a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f608a);
        sb.append('?');
        return sb.toString();
    }
}
