package kotlinx.serialization.json.internal;

import F2.a;
import H2.d;
import H2.e;
import H2.f;
import H2.m;
import H2.n;
import I2.c;
import J2.C0292b;
import J2.C0293b0;
import K2.B;
import K2.C0341a;
import K2.C0342b;
import K2.C0346f;
import K2.D;
import K2.g;
import K2.h;
import K2.u;
import K2.y;
import L2.b;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.r;
import kotlin.text.o;
import kotlinx.serialization.SerializationException;

/* renamed from: kotlinx.serialization.json.internal.c  reason: case insensitive filesystem */
abstract class C0764c extends C0293b0 implements g {

    /* renamed from: c  reason: collision with root package name */
    private final C0341a f14383c;

    /* renamed from: d  reason: collision with root package name */
    private final h f14384d;

    /* renamed from: e  reason: collision with root package name */
    private final String f14385e;

    /* renamed from: f  reason: collision with root package name */
    protected final C0346f f14386f;

    public /* synthetic */ C0764c(C0341a aVar, h hVar, String str, i iVar) {
        this(aVar, hVar, str);
    }

    private final Void B0(D d4, String str, String str2) {
        StringBuilder sb;
        String str3;
        if (o.G(str, "i", false, 2, (Object) null)) {
            sb = new StringBuilder();
            str3 = "an ";
        } else {
            sb = new StringBuilder();
            str3 = "a ";
        }
        sb.append(str3);
        sb.append(str);
        String sb2 = sb.toString();
        throw x.e(-1, "Failed to parse literal '" + d4 + "' as " + sb2 + " value at element: " + A0(str2), m0().toString());
    }

    public final String A0(String str) {
        kotlin.jvm.internal.o.e(str, "currentTag");
        return i0() + '.' + str;
    }

    public b a() {
        return b().a();
    }

    public C0341a b() {
        return this.f14383c;
    }

    public void c(f fVar) {
        kotlin.jvm.internal.o.e(fVar, "descriptor");
    }

    public c d(f fVar) {
        kotlin.jvm.internal.o.e(fVar, "descriptor");
        h m02 = m0();
        m c4 = fVar.c();
        Class<C0342b> cls = C0342b.class;
        if (kotlin.jvm.internal.o.a(c4, n.b.f576a) || (c4 instanceof d)) {
            C0341a b4 = b();
            String b5 = fVar.b();
            if (m02 instanceof C0342b) {
                return new F(b4, (C0342b) m02);
            }
            throw x.e(-1, "Expected " + r.b(cls).b() + ", but had " + r.b(m02.getClass()).b() + " as the serialized body of " + b5 + " at element: " + i0(), m02.toString());
        }
        Class<B> cls2 = B.class;
        if (kotlin.jvm.internal.o.a(c4, n.c.f577a)) {
            C0341a b6 = b();
            f a4 = S.a(fVar.i(0), b6.a());
            m c5 = a4.c();
            if ((c5 instanceof e) || kotlin.jvm.internal.o.a(c5, m.b.f574a)) {
                C0341a b7 = b();
                String b8 = fVar.b();
                if (m02 instanceof B) {
                    return new G(b7, (B) m02);
                }
                throw x.e(-1, "Expected " + r.b(cls2).b() + ", but had " + r.b(m02.getClass()).b() + " as the serialized body of " + b8 + " at element: " + i0(), m02.toString());
            } else if (b6.d().c()) {
                C0341a b9 = b();
                String b10 = fVar.b();
                if (m02 instanceof C0342b) {
                    return new F(b9, (C0342b) m02);
                }
                throw x.e(-1, "Expected " + r.b(cls).b() + ", but had " + r.b(m02.getClass()).b() + " as the serialized body of " + b10 + " at element: " + i0(), m02.toString());
            } else {
                throw x.c(a4);
            }
        } else {
            C0341a b11 = b();
            String b12 = fVar.b();
            if (m02 instanceof B) {
                return new E(b11, (B) m02, this.f14385e, (f) null, 8, (i) null);
            }
            throw x.e(-1, "Expected " + r.b(cls2).b() + ", but had " + r.b(m02.getClass()).b() + " as the serialized body of " + b12 + " at element: " + i0(), m02.toString());
        }
    }

    /* access modifiers changed from: protected */
    public String e0(String str, String str2) {
        kotlin.jvm.internal.o.e(str, "parentName");
        kotlin.jvm.internal.o.e(str2, "childName");
        return str2;
    }

    public I2.e g(f fVar) {
        kotlin.jvm.internal.o.e(fVar, "descriptor");
        if (Y() != null) {
            return super.g(fVar);
        }
        return new B(b(), z0(), this.f14385e).g(fVar);
    }

    public boolean j() {
        return !(m0() instanceof y);
    }

    /* access modifiers changed from: protected */
    public abstract h l0(String str);

    /* access modifiers changed from: protected */
    public final h m0() {
        h l02;
        String str = (String) Y();
        if (str == null || (l02 = l0(str)) == null) {
            return z0();
        }
        return l02;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public boolean N(String str) {
        kotlin.jvm.internal.o.e(str, "tag");
        h l02 = l0(str);
        if (l02 instanceof D) {
            D d4 = (D) l02;
            try {
                Boolean c4 = K2.i.c(d4);
                if (c4 != null) {
                    return c4.booleanValue();
                }
                B0(d4, "boolean", str);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                B0(d4, "boolean", str);
                throw new KotlinNothingValueException();
            }
        } else {
            throw x.e(-1, "Expected " + r.b(D.class).b() + ", but had " + r.b(l02.getClass()).b() + " as the serialized body of " + "boolean" + " at element: " + A0(str), l02.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public byte O(String str) {
        Byte b4;
        kotlin.jvm.internal.o.e(str, "tag");
        h l02 = l0(str);
        if (l02 instanceof D) {
            D d4 = (D) l02;
            try {
                int g4 = K2.i.g(d4);
                if (-128 > g4 || g4 > 127) {
                    b4 = null;
                } else {
                    b4 = Byte.valueOf((byte) g4);
                }
                if (b4 != null) {
                    return b4.byteValue();
                }
                B0(d4, "byte", str);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                B0(d4, "byte", str);
                throw new KotlinNothingValueException();
            }
        } else {
            throw x.e(-1, "Expected " + r.b(D.class).b() + ", but had " + r.b(l02.getClass()).b() + " as the serialized body of " + "byte" + " at element: " + A0(str), l02.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public char P(String str) {
        kotlin.jvm.internal.o.e(str, "tag");
        h l02 = l0(str);
        if (l02 instanceof D) {
            D d4 = (D) l02;
            try {
                return o.V0(d4.b());
            } catch (IllegalArgumentException unused) {
                B0(d4, "char", str);
                throw new KotlinNothingValueException();
            }
        } else {
            throw x.e(-1, "Expected " + r.b(D.class).b() + ", but had " + r.b(l02.getClass()).b() + " as the serialized body of " + "char" + " at element: " + A0(str), l02.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public double Q(String str) {
        kotlin.jvm.internal.o.e(str, "tag");
        h l02 = l0(str);
        if (l02 instanceof D) {
            D d4 = (D) l02;
            try {
                double e4 = K2.i.e(d4);
                if (b().d().b() || (!Double.isInfinite(e4) && !Double.isNaN(e4))) {
                    return e4;
                }
                throw x.a(Double.valueOf(e4), str, m0().toString());
            } catch (IllegalArgumentException unused) {
                B0(d4, "double", str);
                throw new KotlinNothingValueException();
            }
        } else {
            throw x.e(-1, "Expected " + r.b(D.class).b() + ", but had " + r.b(l02.getClass()).b() + " as the serialized body of " + "double" + " at element: " + A0(str), l02.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public int R(String str, f fVar) {
        kotlin.jvm.internal.o.e(str, "tag");
        kotlin.jvm.internal.o.e(fVar, "enumDescriptor");
        C0341a b4 = b();
        h j02 = l0(str);
        String b5 = fVar.b();
        if (j02 instanceof D) {
            return z.k(fVar, b4, ((D) j02).b(), (String) null, 4, (Object) null);
        }
        throw x.e(-1, "Expected " + r.b(D.class).b() + ", but had " + r.b(j02.getClass()).b() + " as the serialized body of " + b5 + " at element: " + A0(str), j02.toString());
    }

    public h s() {
        return m0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public float S(String str) {
        kotlin.jvm.internal.o.e(str, "tag");
        h l02 = l0(str);
        if (l02 instanceof D) {
            D d4 = (D) l02;
            try {
                float f4 = K2.i.f(d4);
                if (b().d().b() || (!Float.isInfinite(f4) && !Float.isNaN(f4))) {
                    return f4;
                }
                throw x.a(Float.valueOf(f4), str, m0().toString());
            } catch (IllegalArgumentException unused) {
                B0(d4, "float", str);
                throw new KotlinNothingValueException();
            }
        } else {
            throw x.e(-1, "Expected " + r.b(D.class).b() + ", but had " + r.b(l02.getClass()).b() + " as the serialized body of " + "float" + " at element: " + A0(str), l02.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public I2.e T(String str, f fVar) {
        kotlin.jvm.internal.o.e(str, "tag");
        kotlin.jvm.internal.o.e(fVar, "inlineDescriptor");
        if (!L.b(fVar)) {
            return super.T(str, fVar);
        }
        C0341a b4 = b();
        h j02 = l0(str);
        String b5 = fVar.b();
        if (j02 instanceof D) {
            return new w(N.a(b4, ((D) j02).b()), b());
        }
        throw x.e(-1, "Expected " + r.b(D.class).b() + ", but had " + r.b(j02.getClass()).b() + " as the serialized body of " + b5 + " at element: " + A0(str), j02.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public int U(String str) {
        kotlin.jvm.internal.o.e(str, "tag");
        h l02 = l0(str);
        if (l02 instanceof D) {
            D d4 = (D) l02;
            try {
                return K2.i.g(d4);
            } catch (IllegalArgumentException unused) {
                B0(d4, "int", str);
                throw new KotlinNothingValueException();
            }
        } else {
            throw x.e(-1, "Expected " + r.b(D.class).b() + ", but had " + r.b(l02.getClass()).b() + " as the serialized body of " + "int" + " at element: " + A0(str), l02.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public long V(String str) {
        kotlin.jvm.internal.o.e(str, "tag");
        h l02 = l0(str);
        if (l02 instanceof D) {
            D d4 = (D) l02;
            try {
                return K2.i.j(d4);
            } catch (IllegalArgumentException unused) {
                B0(d4, "long", str);
                throw new KotlinNothingValueException();
            }
        } else {
            throw x.e(-1, "Expected " + r.b(D.class).b() + ", but had " + r.b(l02.getClass()).b() + " as the serialized body of " + "long" + " at element: " + A0(str), l02.toString());
        }
    }

    public Object w(a aVar) {
        String str;
        D h4;
        kotlin.jvm.internal.o.e(aVar, "deserializer");
        if (!(aVar instanceof C0292b) || b().d().p()) {
            return aVar.b(this);
        }
        C0292b bVar = (C0292b) aVar;
        String c4 = H.c(bVar.a(), b());
        h s4 = s();
        String b4 = bVar.a().b();
        if (s4 instanceof B) {
            B b5 = (B) s4;
            h hVar = (h) b5.get(c4);
            if (hVar == null || (h4 = K2.i.h(hVar)) == null) {
                str = null;
            } else {
                str = K2.i.d(h4);
            }
            try {
                a a4 = F2.g.a((C0292b) aVar, this, str);
                kotlin.jvm.internal.o.c(a4, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return Q.a(b(), c4, b5, a4);
            } catch (SerializationException e4) {
                String message = e4.getMessage();
                kotlin.jvm.internal.o.b(message);
                throw x.e(-1, message, b5.toString());
            }
        } else {
            throw x.e(-1, "Expected " + r.b(B.class).b() + ", but had " + r.b(s4.getClass()).b() + " as the serialized body of " + b4 + " at element: " + i0(), s4.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public short W(String str) {
        Short sh;
        kotlin.jvm.internal.o.e(str, "tag");
        h l02 = l0(str);
        if (l02 instanceof D) {
            D d4 = (D) l02;
            try {
                int g4 = K2.i.g(d4);
                if (-32768 > g4 || g4 > 32767) {
                    sh = null;
                } else {
                    sh = Short.valueOf((short) g4);
                }
                if (sh != null) {
                    return sh.shortValue();
                }
                B0(d4, "short", str);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                B0(d4, "short", str);
                throw new KotlinNothingValueException();
            }
        } else {
            throw x.e(-1, "Expected " + r.b(D.class).b() + ", but had " + r.b(l02.getClass()).b() + " as the serialized body of " + "short" + " at element: " + A0(str), l02.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public String X(String str) {
        kotlin.jvm.internal.o.e(str, "tag");
        h l02 = l0(str);
        if (l02 instanceof D) {
            D d4 = (D) l02;
            if (d4 instanceof u) {
                u uVar = (u) d4;
                if (uVar.d() || b().d().q()) {
                    return uVar.b();
                }
                throw x.e(-1, "String literal for key '" + str + "' should be quoted at element: " + A0(str) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", m0().toString());
            }
            throw x.e(-1, "Expected string value for a non-null key '" + str + "', got null literal instead at element: " + A0(str), m0().toString());
        }
        throw x.e(-1, "Expected " + r.b(D.class).b() + ", but had " + r.b(l02.getClass()).b() + " as the serialized body of " + "string" + " at element: " + A0(str), l02.toString());
    }

    /* access modifiers changed from: protected */
    public final String y0() {
        return this.f14385e;
    }

    public abstract h z0();

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0764c(C0341a aVar, h hVar, String str, int i4, i iVar) {
        this(aVar, hVar, (i4 & 4) != 0 ? null : str, (i) null);
    }

    private C0764c(C0341a aVar, h hVar, String str) {
        this.f14383c = aVar;
        this.f14384d = hVar;
        this.f14385e = str;
        this.f14386f = b().d();
    }
}
