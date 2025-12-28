package kotlinx.serialization.json.internal;

import H2.f;
import H2.m;
import I2.c;
import I2.e;
import J2.C0292b;
import K2.B;
import K2.C0341a;
import K2.C0346f;
import K2.D;
import K2.g;
import K2.h;
import K2.i;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;

public class J extends I2.a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final C0341a f14347a;

    /* renamed from: b  reason: collision with root package name */
    private final WriteMode f14348b;

    /* renamed from: c  reason: collision with root package name */
    public final C0762a f14349c;

    /* renamed from: d  reason: collision with root package name */
    private final L2.b f14350d;

    /* renamed from: e  reason: collision with root package name */
    private int f14351e = -1;

    /* renamed from: f  reason: collision with root package name */
    private a f14352f;

    /* renamed from: g  reason: collision with root package name */
    private final C0346f f14353g;

    /* renamed from: h  reason: collision with root package name */
    private final JsonElementMarker f14354h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f14355a;

        public a(String str) {
            this.f14355a = str;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14356a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                kotlinx.serialization.json.internal.WriteMode[] r0 = kotlinx.serialization.json.internal.WriteMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.serialization.json.internal.WriteMode r1 = kotlinx.serialization.json.internal.WriteMode.LIST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlinx.serialization.json.internal.WriteMode r1 = kotlinx.serialization.json.internal.WriteMode.MAP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlinx.serialization.json.internal.WriteMode r1 = kotlinx.serialization.json.internal.WriteMode.POLY_OBJ     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                kotlinx.serialization.json.internal.WriteMode r1 = kotlinx.serialization.json.internal.WriteMode.OBJ     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f14356a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.J.b.<clinit>():void");
        }
    }

    public J(C0341a aVar, WriteMode writeMode, C0762a aVar2, f fVar, a aVar3) {
        JsonElementMarker jsonElementMarker;
        o.e(aVar, "json");
        o.e(writeMode, "mode");
        o.e(aVar2, "lexer");
        o.e(fVar, "descriptor");
        this.f14347a = aVar;
        this.f14348b = writeMode;
        this.f14349c = aVar2;
        this.f14350d = aVar.a();
        this.f14352f = aVar3;
        C0346f d4 = aVar.d();
        this.f14353g = d4;
        if (d4.j()) {
            jsonElementMarker = null;
        } else {
            jsonElementMarker = new JsonElementMarker(fVar);
        }
        this.f14354h = jsonElementMarker;
    }

    private final void K() {
        if (this.f14349c.F() == 4) {
            C0762a.x(this.f14349c, "Unexpected leading comma", 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    private final boolean L(f fVar, int i4) {
        String G3;
        boolean z3;
        C0341a aVar = this.f14347a;
        boolean j4 = fVar.j(i4);
        f i5 = fVar.i(i4);
        if (j4 && !i5.g() && this.f14349c.N(true)) {
            return true;
        }
        if (o.a(i5.c(), m.b.f574a) && ((!i5.g() || !this.f14349c.N(false)) && (G3 = this.f14349c.G(this.f14353g.q())) != null)) {
            int i6 = z.i(i5, aVar, G3);
            if (aVar.d().j() || !i5.g()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i6 == -3 && (j4 || z3)) {
                this.f14349c.o();
                return true;
            }
        }
        return false;
    }

    private final int M() {
        boolean M3 = this.f14349c.M();
        if (this.f14349c.e()) {
            int i4 = this.f14351e;
            if (i4 == -1 || M3) {
                int i5 = i4 + 1;
                this.f14351e = i5;
                return i5;
            }
            C0762a.x(this.f14349c, "Expected end of the array or comma", 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        } else if (!M3 || this.f14347a.d().d()) {
            return -1;
        } else {
            x.g(this.f14349c, "array");
            throw new KotlinNothingValueException();
        }
    }

    private final int N() {
        boolean z3;
        int i4 = this.f14351e;
        boolean z4 = false;
        if (i4 % 2 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            this.f14349c.l(':');
        } else if (i4 != -1) {
            z4 = this.f14349c.M();
        }
        if (this.f14349c.e()) {
            if (z3) {
                if (this.f14351e == -1) {
                    C0762a aVar = this.f14349c;
                    int i5 = aVar.f14379a;
                    if (z4) {
                        C0762a.x(aVar, "Unexpected leading comma", i5, (String) null, 4, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    C0762a aVar2 = this.f14349c;
                    int i6 = aVar2.f14379a;
                    if (!z4) {
                        C0762a.x(aVar2, "Expected comma after the key-value pair", i6, (String) null, 4, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            int i7 = this.f14351e + 1;
            this.f14351e = i7;
            return i7;
        } else if (!z4 || this.f14347a.d().d()) {
            return -1;
        } else {
            x.h(this.f14349c, (String) null, 1, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    private final int O(f fVar) {
        int i4;
        boolean z3;
        boolean M3 = this.f14349c.M();
        while (true) {
            boolean z4 = true;
            if (this.f14349c.e()) {
                String P3 = P();
                this.f14349c.l(':');
                i4 = z.i(fVar, this.f14347a, P3);
                if (i4 == -3) {
                    z3 = false;
                } else if (!this.f14353g.g() || !L(fVar, i4)) {
                    JsonElementMarker jsonElementMarker = this.f14354h;
                } else {
                    z3 = this.f14349c.M();
                    z4 = false;
                }
                if (z4) {
                    M3 = Q(P3);
                } else {
                    M3 = z3;
                }
            } else if (!M3 || this.f14347a.d().d()) {
                JsonElementMarker jsonElementMarker2 = this.f14354h;
                if (jsonElementMarker2 != null) {
                    return jsonElementMarker2.d();
                }
                return -1;
            } else {
                x.h(this.f14349c, (String) null, 1, (Object) null);
                throw new KotlinNothingValueException();
            }
        }
        JsonElementMarker jsonElementMarker3 = this.f14354h;
        if (jsonElementMarker3 != null) {
            jsonElementMarker3.c(i4);
        }
        return i4;
    }

    private final String P() {
        if (this.f14353g.q()) {
            return this.f14349c.r();
        }
        return this.f14349c.i();
    }

    private final boolean Q(String str) {
        if (this.f14353g.k() || S(this.f14352f, str)) {
            this.f14349c.I(this.f14353g.q());
        } else {
            this.f14349c.A(str);
        }
        return this.f14349c.M();
    }

    private final void R(f fVar) {
        do {
        } while (e(fVar) != -1);
    }

    private final boolean S(a aVar, String str) {
        if (aVar == null || !o.a(aVar.f14355a, str)) {
            return false;
        }
        aVar.f14355a = null;
        return true;
    }

    public Void A() {
        return null;
    }

    public short B() {
        long m4 = this.f14349c.m();
        short s4 = (short) ((int) m4);
        if (m4 == ((long) s4)) {
            return s4;
        }
        C0762a aVar = this.f14349c;
        C0762a.x(aVar, "Failed to parse short for input '" + m4 + '\'', 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public String C() {
        if (this.f14353g.q()) {
            return this.f14349c.r();
        }
        return this.f14349c.o();
    }

    public float D() {
        C0762a aVar = this.f14349c;
        String q4 = aVar.q();
        try {
            float parseFloat = Float.parseFloat(q4);
            if (this.f14347a.d().b() || (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat))) {
                return parseFloat;
            }
            x.k(this.f14349c, Float.valueOf(parseFloat));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            C0762a.x(aVar, "Failed to parse type '" + "float" + "' for input '" + q4 + '\'', 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public Object E(f fVar, int i4, F2.a aVar, Object obj) {
        boolean z3;
        o.e(fVar, "descriptor");
        o.e(aVar, "deserializer");
        if (this.f14348b == WriteMode.MAP && (i4 & 1) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f14349c.f14380b.d();
        }
        Object E3 = super.E(fVar, i4, aVar, obj);
        if (z3) {
            this.f14349c.f14380b.f(E3);
        }
        return E3;
    }

    public int F(f fVar) {
        o.e(fVar, "enumDescriptor");
        C0341a aVar = this.f14347a;
        String C3 = C();
        return z.j(fVar, aVar, C3, " at path " + this.f14349c.f14380b.a());
    }

    public double G() {
        C0762a aVar = this.f14349c;
        String q4 = aVar.q();
        try {
            double parseDouble = Double.parseDouble(q4);
            if (this.f14347a.d().b() || (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble))) {
                return parseDouble;
            }
            x.k(this.f14349c, Double.valueOf(parseDouble));
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            C0762a.x(aVar, "Failed to parse type '" + "double" + "' for input '" + q4 + '\'', 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    public L2.b a() {
        return this.f14350d;
    }

    public final C0341a b() {
        return this.f14347a;
    }

    public void c(f fVar) {
        o.e(fVar, "descriptor");
        if (this.f14347a.d().k() && fVar.d() == 0) {
            R(fVar);
        }
        if (!this.f14349c.M() || this.f14347a.d().d()) {
            this.f14349c.l(this.f14348b.end);
            this.f14349c.f14380b.b();
            return;
        }
        x.g(this.f14349c, "");
        throw new KotlinNothingValueException();
    }

    public c d(f fVar) {
        o.e(fVar, "descriptor");
        WriteMode b4 = S.b(this.f14347a, fVar);
        this.f14349c.f14380b.c(fVar);
        this.f14349c.l(b4.begin);
        K();
        int i4 = b.f14356a[b4.ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            return new J(this.f14347a, b4, this.f14349c, fVar, this.f14352f);
        } else if (this.f14348b == b4 && this.f14347a.d().j()) {
            return this;
        } else {
            return new J(this.f14347a, b4, this.f14349c, fVar, this.f14352f);
        }
    }

    public int e(f fVar) {
        int i4;
        o.e(fVar, "descriptor");
        int i5 = b.f14356a[this.f14348b.ordinal()];
        if (i5 == 2) {
            i4 = N();
        } else if (i5 != 4) {
            i4 = M();
        } else {
            i4 = O(fVar);
        }
        if (this.f14348b != WriteMode.MAP) {
            this.f14349c.f14380b.g(i4);
        }
        return i4;
    }

    public long f() {
        return this.f14349c.m();
    }

    public e g(f fVar) {
        o.e(fVar, "descriptor");
        if (L.b(fVar)) {
            return new w(this.f14349c, this.f14347a);
        }
        return super.g(fVar);
    }

    public boolean h() {
        return this.f14349c.g();
    }

    public boolean j() {
        boolean z3;
        JsonElementMarker jsonElementMarker = this.f14354h;
        if (jsonElementMarker != null) {
            z3 = jsonElementMarker.b();
        } else {
            z3 = false;
        }
        if (z3 || C0762a.O(this.f14349c, false, 1, (Object) null)) {
            return false;
        }
        return true;
    }

    public char l() {
        String q4 = this.f14349c.q();
        if (q4.length() == 1) {
            return q4.charAt(0);
        }
        C0762a aVar = this.f14349c;
        C0762a.x(aVar, "Expected single char, but got '" + q4 + '\'', 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public h s() {
        return new JsonTreeReader(this.f14347a.d(), this.f14349c).e();
    }

    public int t() {
        long m4 = this.f14349c.m();
        int i4 = (int) m4;
        if (m4 == ((long) i4)) {
            return i4;
        }
        C0762a aVar = this.f14349c;
        C0762a.x(aVar, "Failed to parse int for input '" + m4 + '\'', 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    public Object w(F2.a aVar) {
        B b4;
        String str;
        D h4;
        o.e(aVar, "deserializer");
        try {
            if (aVar instanceof C0292b) {
                if (!this.f14347a.d().p()) {
                    String c4 = H.c(((C0292b) aVar).a(), this.f14347a);
                    String E3 = this.f14349c.E(c4, this.f14353g.q());
                    if (E3 == null) {
                        if (aVar instanceof C0292b) {
                            if (!b().d().p()) {
                                String c5 = H.c(((C0292b) aVar).a(), b());
                                h s4 = s();
                                String b5 = ((C0292b) aVar).a().b();
                                if (s4 instanceof B) {
                                    b4 = (B) s4;
                                    h hVar = (h) b4.get(c5);
                                    if (hVar == null || (h4 = i.h(hVar)) == null) {
                                        str = null;
                                    } else {
                                        str = i.d(h4);
                                    }
                                    F2.a a4 = F2.g.a((C0292b) aVar, this, str);
                                    o.c(a4, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                                    return Q.a(b(), c5, b4, a4);
                                }
                                throw x.e(-1, "Expected " + r.b(B.class).b() + ", but had " + r.b(s4.getClass()).b() + " as the serialized body of " + b5 + " at element: " + this.f14349c.f14380b.a(), s4.toString());
                            }
                        }
                        return aVar.b(this);
                    }
                    F2.a a5 = F2.g.a((C0292b) aVar, this, E3);
                    o.c(a5, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                    this.f14352f = new a(c4);
                    return a5.b(this);
                }
            }
            return aVar.b(this);
        } catch (SerializationException e4) {
            String message = e4.getMessage();
            o.b(message);
            String n02 = kotlin.text.o.n0(kotlin.text.o.J0(message, 10, (String) null, 2, (Object) null), ".");
            String message2 = e4.getMessage();
            o.b(message2);
            C0762a.x(this.f14349c, n02, 0, kotlin.text.o.B0(message2, 10, ""), 2, (Object) null);
            throw new KotlinNothingValueException();
        } catch (SerializationException e5) {
            String message3 = e5.getMessage();
            o.b(message3);
            throw x.e(-1, message3, b4.toString());
        } catch (MissingFieldException e6) {
            String message4 = e6.getMessage();
            o.b(message4);
            if (kotlin.text.o.L(message4, "at path", false, 2, (Object) null)) {
                throw e6;
            }
            throw new MissingFieldException(e6.getMissingFields(), e6.getMessage() + " at path: " + this.f14349c.f14380b.a(), e6);
        }
    }

    public byte y() {
        long m4 = this.f14349c.m();
        byte b4 = (byte) ((int) m4);
        if (m4 == ((long) b4)) {
            return b4;
        }
        C0762a aVar = this.f14349c;
        C0762a.x(aVar, "Failed to parse byte for input '" + m4 + '\'', 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }
}
