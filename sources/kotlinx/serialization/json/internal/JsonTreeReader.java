package kotlinx.serialization.json.internal;

import H2.f;
import K2.B;
import K2.C0342b;
import K2.C0346f;
import K2.D;
import K2.h;
import K2.u;
import K2.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.a;
import kotlin.coroutines.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.C0791a;
import l2.q;

public final class JsonTreeReader {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0762a f14359a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14360b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14361c;

    /* renamed from: d  reason: collision with root package name */
    private int f14362d;

    public JsonTreeReader(C0346f fVar, C0762a aVar) {
        o.e(fVar, "configuration");
        o.e(aVar, "lexer");
        this.f14359a = aVar;
        this.f14360b = fVar.q();
        this.f14361c = fVar.d();
    }

    /* access modifiers changed from: private */
    public final h f() {
        boolean z3;
        byte j4 = this.f14359a.j();
        if (this.f14359a.F() != 4) {
            ArrayList arrayList = new ArrayList();
            while (this.f14359a.e()) {
                arrayList.add(e());
                j4 = this.f14359a.j();
                if (j4 != 4) {
                    C0762a aVar = this.f14359a;
                    if (j4 == 9) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i4 = aVar.f14379a;
                    if (!z3) {
                        C0762a.x(aVar, "Expected end of the array or comma", i4, (String) null, 4, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (j4 == 8) {
                this.f14359a.k((byte) 9);
            } else if (j4 == 4) {
                if (this.f14361c) {
                    this.f14359a.k((byte) 9);
                } else {
                    x.g(this.f14359a, "array");
                    throw new KotlinNothingValueException();
                }
            }
            return new C0342b(arrayList);
        }
        C0762a.x(this.f14359a, "Unexpected leading comma", 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    private final h g() {
        return (h) a.b(new C0791a(new JsonTreeReader$readDeepRecursive$1(this, (c<? super JsonTreeReader$readDeepRecursive$1>) null)), q.f14567a);
    }

    private final h h() {
        String str;
        byte k4 = this.f14359a.k((byte) 6);
        if (this.f14359a.F() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.f14359a.e()) {
                    break;
                }
                if (this.f14360b) {
                    str = this.f14359a.q();
                } else {
                    str = this.f14359a.o();
                }
                this.f14359a.k((byte) 5);
                linkedHashMap.put(str, e());
                k4 = this.f14359a.j();
                if (k4 != 4) {
                    if (k4 != 7) {
                        C0762a.x(this.f14359a, "Expected end of the object or comma", 0, (String) null, 6, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (k4 == 6) {
                this.f14359a.k((byte) 7);
            } else if (k4 == 4) {
                if (this.f14361c) {
                    this.f14359a.k((byte) 7);
                } else {
                    x.h(this.f14359a, (String) null, 1, (Object) null);
                    throw new KotlinNothingValueException();
                }
            }
            return new B(linkedHashMap);
        }
        C0762a.x(this.f14359a, "Unexpected leading comma", 0, (String) null, 6, (Object) null);
        throw new KotlinNothingValueException();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(l2.C0792b r21, kotlin.coroutines.c r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof kotlinx.serialization.json.internal.JsonTreeReader$readObject$2
            if (r2 == 0) goto L_0x0017
            r2 = r1
            kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 r2 = (kotlinx.serialization.json.internal.JsonTreeReader$readObject$2) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            kotlinx.serialization.json.internal.JsonTreeReader$readObject$2 r2 = new kotlinx.serialization.json.internal.JsonTreeReader$readObject$2
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r2.label
            r5 = 6
            r6 = 7
            r7 = 4
            r8 = 1
            if (r4 == 0) goto L_0x0048
            if (r4 != r8) goto L_0x0040
            java.lang.Object r4 = r2.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r9 = r2.L$2
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9
            java.lang.Object r10 = r2.L$1
            kotlinx.serialization.json.internal.JsonTreeReader r10 = (kotlinx.serialization.json.internal.JsonTreeReader) r10
            java.lang.Object r11 = r2.L$0
            l2.b r11 = (l2.C0792b) r11
            kotlin.f.b(r1)
            goto L_0x00a0
        L_0x0040:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0048:
            kotlin.f.b(r1)
            kotlinx.serialization.json.internal.a r1 = r0.f14359a
            byte r1 = r1.k(r5)
            kotlinx.serialization.json.internal.a r4 = r0.f14359a
            byte r4 = r4.F()
            if (r4 == r7) goto L_0x00ee
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r10 = r0
            r9 = r4
            r4 = r2
            r2 = r1
            r1 = r21
        L_0x0064:
            kotlinx.serialization.json.internal.a r11 = r10.f14359a
            boolean r11 = r11.e()
            if (r11 == 0) goto L_0x00c8
            boolean r2 = r10.f14360b
            if (r2 == 0) goto L_0x0077
            kotlinx.serialization.json.internal.a r2 = r10.f14359a
            java.lang.String r2 = r2.q()
            goto L_0x007d
        L_0x0077:
            kotlinx.serialization.json.internal.a r2 = r10.f14359a
            java.lang.String r2 = r2.o()
        L_0x007d:
            kotlinx.serialization.json.internal.a r11 = r10.f14359a
            r12 = 5
            r11.k(r12)
            l2.q r11 = l2.q.f14567a
            r4.L$0 = r1
            r4.L$1 = r10
            r4.L$2 = r9
            r4.L$3 = r2
            r4.label = r8
            java.lang.Object r11 = r1.a(r11, r4)
            if (r11 != r3) goto L_0x0096
            return r3
        L_0x0096:
            r18 = r11
            r11 = r1
            r1 = r18
            r19 = r4
            r4 = r2
            r2 = r19
        L_0x00a0:
            K2.h r1 = (K2.h) r1
            r9.put(r4, r1)
            kotlinx.serialization.json.internal.a r1 = r10.f14359a
            byte r1 = r1.j()
            if (r1 == r7) goto L_0x00c4
            if (r1 != r6) goto L_0x00b1
            r2 = r1
            goto L_0x00c8
        L_0x00b1:
            kotlinx.serialization.json.internal.a r12 = r10.f14359a
            r16 = 6
            r17 = 0
            java.lang.String r13 = "Expected end of the object or comma"
            r14 = 0
            r15 = 0
            kotlinx.serialization.json.internal.C0762a.x(r12, r13, r14, r15, r16, r17)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
        L_0x00c4:
            r4 = r2
            r2 = r1
            r1 = r11
            goto L_0x0064
        L_0x00c8:
            if (r2 != r5) goto L_0x00d0
            kotlinx.serialization.json.internal.a r1 = r10.f14359a
            r1.k(r6)
            goto L_0x00e8
        L_0x00d0:
            if (r2 != r7) goto L_0x00e8
            boolean r1 = r10.f14361c
            if (r1 == 0) goto L_0x00dc
            kotlinx.serialization.json.internal.a r1 = r10.f14359a
            r1.k(r6)
            goto L_0x00e8
        L_0x00dc:
            kotlinx.serialization.json.internal.a r1 = r10.f14359a
            r2 = 0
            kotlinx.serialization.json.internal.x.h(r1, r2, r8, r2)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
        L_0x00e8:
            K2.B r1 = new K2.B
            r1.<init>(r9)
            return r1
        L_0x00ee:
            kotlinx.serialization.json.internal.a r2 = r0.f14359a
            r6 = 6
            r7 = 0
            java.lang.String r3 = "Unexpected leading comma"
            r4 = 0
            r5 = 0
            kotlinx.serialization.json.internal.C0762a.x(r2, r3, r4, r5, r6, r7)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonTreeReader.i(l2.b, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final D j(boolean z3) {
        String q4;
        if (this.f14360b || !z3) {
            q4 = this.f14359a.q();
        } else {
            q4 = this.f14359a.o();
        }
        String str = q4;
        if (z3 || !o.a(str, "null")) {
            return new u(str, z3, (f) null, 4, (i) null);
        }
        return y.INSTANCE;
    }

    public final h e() {
        h hVar;
        byte F3 = this.f14359a.F();
        if (F3 == 1) {
            return j(true);
        }
        if (F3 == 0) {
            return j(false);
        }
        if (F3 == 6) {
            int i4 = this.f14362d + 1;
            this.f14362d = i4;
            if (i4 == 200) {
                hVar = g();
            } else {
                hVar = h();
            }
            this.f14362d--;
            return hVar;
        } else if (F3 == 8) {
            return f();
        } else {
            C0762a.x(this.f14359a, "Cannot read Json element because of unexpected " + C0763b.c(F3), 0, (String) null, 6, (Object) null);
            throw new KotlinNothingValueException();
        }
    }
}
