package kotlinx.serialization.json.internal;

import F2.n;
import H2.f;
import I2.b;
import I2.d;
import K2.C0341a;
import K2.C0346f;
import K2.r;
import kotlin.jvm.internal.o;

public final class K extends b implements r {

    /* renamed from: a  reason: collision with root package name */
    private final C0769h f14363a;

    /* renamed from: b  reason: collision with root package name */
    private final C0341a f14364b;

    /* renamed from: c  reason: collision with root package name */
    private final WriteMode f14365c;

    /* renamed from: d  reason: collision with root package name */
    private final r[] f14366d;

    /* renamed from: e  reason: collision with root package name */
    private final L2.b f14367e;

    /* renamed from: f  reason: collision with root package name */
    private final C0346f f14368f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f14369g;

    /* renamed from: h  reason: collision with root package name */
    private String f14370h;

    /* renamed from: i  reason: collision with root package name */
    private String f14371i;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14372a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
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
                f14372a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.K.a.<clinit>():void");
        }
    }

    public K(C0769h hVar, C0341a aVar, WriteMode writeMode, r[] rVarArr) {
        o.e(hVar, "composer");
        o.e(aVar, "json");
        o.e(writeMode, "mode");
        this.f14363a = hVar;
        this.f14364b = aVar;
        this.f14365c = writeMode;
        this.f14366d = rVarArr;
        this.f14367e = b().a();
        this.f14368f = b().d();
        int ordinal = writeMode.ordinal();
        if (rVarArr != null) {
            r rVar = rVarArr[ordinal];
            if (rVar != null || rVar != this) {
                rVarArr[ordinal] = this;
            }
        }
    }

    private final void I(String str, String str2) {
        this.f14363a.c();
        F(str);
        this.f14363a.f(':');
        this.f14363a.p();
        F(str2);
    }

    public void B(long j4) {
        if (this.f14369g) {
            F(String.valueOf(j4));
        } else {
            this.f14363a.j(j4);
        }
    }

    public void C(char c4) {
        F(String.valueOf(c4));
    }

    public void F(String str) {
        o.e(str, "value");
        this.f14363a.n(str);
    }

    public boolean G(f fVar, int i4) {
        o.e(fVar, "descriptor");
        int i5 = a.f14372a[this.f14365c.ordinal()];
        if (i5 != 1) {
            boolean z3 = false;
            if (i5 != 2) {
                if (i5 != 3) {
                    if (!this.f14363a.a()) {
                        this.f14363a.f(',');
                    }
                    this.f14363a.c();
                    F(z.h(fVar, b(), i4));
                    this.f14363a.f(':');
                    this.f14363a.p();
                } else {
                    if (i4 == 0) {
                        this.f14369g = true;
                    }
                    if (i4 == 1) {
                        this.f14363a.f(',');
                        this.f14363a.p();
                        this.f14369g = false;
                    }
                }
            } else if (!this.f14363a.a()) {
                if (i4 % 2 == 0) {
                    this.f14363a.f(',');
                    this.f14363a.c();
                    z3 = true;
                } else {
                    this.f14363a.f(':');
                    this.f14363a.p();
                }
                this.f14369g = z3;
            } else {
                this.f14369g = true;
                this.f14363a.c();
            }
        } else {
            if (!this.f14363a.a()) {
                this.f14363a.f(',');
            }
            this.f14363a.c();
        }
        return true;
    }

    public L2.b a() {
        return this.f14367e;
    }

    public C0341a b() {
        return this.f14364b;
    }

    public void c(f fVar) {
        o.e(fVar, "descriptor");
        if (this.f14365c.end != 0) {
            this.f14363a.q();
            this.f14363a.d();
            this.f14363a.f(this.f14365c.end);
        }
    }

    public d d(f fVar) {
        r rVar;
        o.e(fVar, "descriptor");
        WriteMode b4 = S.b(b(), fVar);
        char c4 = b4.begin;
        if (c4 != 0) {
            this.f14363a.f(c4);
            this.f14363a.b();
        }
        String str = this.f14370h;
        if (str != null) {
            String str2 = this.f14371i;
            if (str2 == null) {
                str2 = fVar.b();
            }
            I(str, str2);
            this.f14370h = null;
            this.f14371i = null;
        }
        if (this.f14365c == b4) {
            return this;
        }
        r[] rVarArr = this.f14366d;
        if (rVarArr == null || (rVar = rVarArr[b4.ordinal()]) == null) {
            return new K(this.f14363a, b(), b4, this.f14366d);
        }
        return rVar;
    }

    public void e(f fVar, int i4) {
        o.e(fVar, "enumDescriptor");
        F(fVar.e(i4));
    }

    public void i() {
        this.f14363a.k("null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (kotlin.jvm.internal.o.a(r1, H2.n.d.f578a) == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (b().d().f() != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(F2.n r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.o.e(r4, r0)
            K2.a r0 = r3.b()
            K2.f r0 = r0.d()
            boolean r0 = r0.p()
            if (r0 == 0) goto L_0x0018
            r4.e(r3, r5)
            goto L_0x00cd
        L_0x0018:
            boolean r0 = r4 instanceof J2.C0292b
            if (r0 == 0) goto L_0x002d
            K2.a r1 = r3.b()
            K2.f r1 = r1.d()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.f()
            kotlinx.serialization.json.ClassDiscriminatorMode r2 = kotlinx.serialization.json.ClassDiscriminatorMode.NONE
            if (r1 == r2) goto L_0x0075
            goto L_0x0062
        L_0x002d:
            K2.a r1 = r3.b()
            K2.f r1 = r1.d()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.f()
            int[] r2 = kotlinx.serialization.json.internal.H.a.f14344a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L_0x0075
            r2 = 2
            if (r1 == r2) goto L_0x0075
            r2 = 3
            if (r1 != r2) goto L_0x006f
            H2.f r1 = r4.a()
            H2.m r1 = r1.c()
            H2.n$a r2 = H2.n.a.f575a
            boolean r2 = kotlin.jvm.internal.o.a(r1, r2)
            if (r2 != 0) goto L_0x0062
            H2.n$d r2 = H2.n.d.f578a
            boolean r1 = kotlin.jvm.internal.o.a(r1, r2)
            if (r1 == 0) goto L_0x0075
        L_0x0062:
            H2.f r1 = r4.a()
            K2.a r2 = r3.b()
            java.lang.String r1 = kotlinx.serialization.json.internal.H.c(r1, r2)
            goto L_0x0076
        L_0x006f:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L_0x0075:
            r1 = 0
        L_0x0076:
            if (r0 == 0) goto L_0x00bc
            r0 = r4
            J2.b r0 = (J2.C0292b) r0
            if (r5 == 0) goto L_0x0098
            F2.n r0 = F2.g.b(r0, r3, r5)
            if (r1 == 0) goto L_0x0086
            kotlinx.serialization.json.internal.H.d(r4, r0, r1)
        L_0x0086:
            H2.f r4 = r0.a()
            H2.m r4 = r4.c()
            kotlinx.serialization.json.internal.H.b(r4)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>"
            kotlin.jvm.internal.o.c(r0, r4)
            r4 = r0
            goto L_0x00bc
        L_0x0098:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Value for serializer "
            r4.append(r5)
            H2.f r5 = r0.a()
            r4.append(r5)
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L_0x00bc:
            if (r1 == 0) goto L_0x00ca
            H2.f r0 = r4.a()
            java.lang.String r0 = r0.b()
            r3.f14370h = r1
            r3.f14371i = r0
        L_0x00ca:
            r4.e(r3, r5)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.K.k(F2.n, java.lang.Object):void");
    }

    public void l(double d4) {
        if (this.f14369g) {
            F(String.valueOf(d4));
        } else {
            this.f14363a.g(d4);
        }
        if (this.f14368f.b()) {
            return;
        }
        if (Double.isInfinite(d4) || Double.isNaN(d4)) {
            throw x.b(Double.valueOf(d4), this.f14363a.f14394a.toString());
        }
    }

    public void m(short s4) {
        if (this.f14369g) {
            F(String.valueOf(s4));
        } else {
            this.f14363a.l(s4);
        }
    }

    public boolean n(f fVar, int i4) {
        o.e(fVar, "descriptor");
        return this.f14368f.i();
    }

    public void o(f fVar, int i4, n nVar, Object obj) {
        o.e(fVar, "descriptor");
        o.e(nVar, "serializer");
        if (obj != null || this.f14368f.j()) {
            super.o(fVar, i4, nVar, obj);
        }
    }

    public void q(byte b4) {
        if (this.f14369g) {
            F(String.valueOf(b4));
        } else {
            this.f14363a.e(b4);
        }
    }

    public void r(boolean z3) {
        if (this.f14369g) {
            F(String.valueOf(z3));
        } else {
            this.f14363a.m(z3);
        }
    }

    public I2.f s(f fVar) {
        o.e(fVar, "descriptor");
        if (L.b(fVar)) {
            C0769h hVar = this.f14363a;
            if (!(hVar instanceof C0778q)) {
                hVar = new C0778q(hVar.f14394a, this.f14369g);
            }
            return new K(hVar, b(), this.f14365c, (r[]) null);
        } else if (L.a(fVar)) {
            C0769h hVar2 = this.f14363a;
            if (!(hVar2 instanceof C0770i)) {
                hVar2 = new C0770i(hVar2.f14394a, this.f14369g);
            }
            return new K(hVar2, b(), this.f14365c, (r[]) null);
        } else if (this.f14370h == null) {
            return super.s(fVar);
        } else {
            this.f14371i = fVar.b();
            return this;
        }
    }

    public void u(int i4) {
        if (this.f14369g) {
            F(String.valueOf(i4));
        } else {
            this.f14363a.i(i4);
        }
    }

    public void y(float f4) {
        if (this.f14369g) {
            F(String.valueOf(f4));
        } else {
            this.f14363a.h(f4);
        }
        if (this.f14368f.b()) {
            return;
        }
        if (Float.isInfinite(f4) || Float.isNaN(f4)) {
            throw x.b(Float.valueOf(f4), this.f14363a.f14394a.toString());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public K(v vVar, C0341a aVar, WriteMode writeMode, r[] rVarArr) {
        this(C0779s.a(vVar, aVar), aVar, writeMode, rVarArr);
        o.e(vVar, "output");
        o.e(aVar, "json");
        o.e(writeMode, "mode");
        o.e(rVarArr, "modeReuseCache");
    }
}
