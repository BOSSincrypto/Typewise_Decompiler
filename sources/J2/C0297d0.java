package J2;

import H2.f;
import H2.m;
import H2.n;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.o;

/* renamed from: J2.d0  reason: case insensitive filesystem */
public final class C0297d0 implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final C0297d0 f692a = new C0297d0();

    /* renamed from: b  reason: collision with root package name */
    private static final m f693b = n.d.f578a;

    /* renamed from: c  reason: collision with root package name */
    private static final String f694c = "kotlin.Nothing";

    private C0297d0() {
    }

    private final Void f() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public int a(String str) {
        o.e(str, "name");
        f();
        throw new KotlinNothingValueException();
    }

    public String b() {
        return f694c;
    }

    public m c() {
        return f693b;
    }

    public int d() {
        return 0;
    }

    public String e(int i4) {
        f();
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public boolean g() {
        return f.a.c(this);
    }

    public List getAnnotations() {
        return f.a.a(this);
    }

    public List h(int i4) {
        f();
        throw new KotlinNothingValueException();
    }

    public int hashCode() {
        return b().hashCode() + (c().hashCode() * 31);
    }

    public f i(int i4) {
        f();
        throw new KotlinNothingValueException();
    }

    public boolean isInline() {
        return f.a.b(this);
    }

    public boolean j(int i4) {
        f();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
