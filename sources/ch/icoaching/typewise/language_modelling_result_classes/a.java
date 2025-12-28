package ch.icoaching.typewise.language_modelling_result_classes;

import androidx.work.c;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.uuid.Uuid;

public final class a implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    private final String f8821a;

    /* renamed from: b  reason: collision with root package name */
    private final float f8822b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8823c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8824d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8825e;

    /* renamed from: f  reason: collision with root package name */
    private Float f8826f;

    /* renamed from: g  reason: collision with root package name */
    private final Map f8827g;

    /* renamed from: h  reason: collision with root package name */
    private final Float f8828h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f8829i;

    /* renamed from: j  reason: collision with root package name */
    private final Float f8830j;

    /* renamed from: k  reason: collision with root package name */
    private final Float f8831k;

    public a(String str, float f4, int i4, String str2, String str3, Float f5, Map map, Float f6, boolean z3, Float f7, Float f8) {
        o.e(str, "prediction");
        o.e(str2, "source");
        o.e(str3, "modelUniqueIdentifier");
        this.f8821a = str;
        this.f8822b = f4;
        this.f8823c = i4;
        this.f8824d = str2;
        this.f8825e = str3;
        this.f8826f = f5;
        this.f8827g = map;
        this.f8828h = f6;
        this.f8829i = z3;
        this.f8830j = f7;
        this.f8831k = f8;
    }

    public static /* synthetic */ a c(a aVar, String str, float f4, int i4, String str2, String str3, Float f5, Map map, Float f6, boolean z3, Float f7, Float f8, int i5, Object obj) {
        a aVar2 = aVar;
        int i6 = i5;
        return aVar.b((i6 & 1) != 0 ? aVar2.f8821a : str, (i6 & 2) != 0 ? aVar2.f8822b : f4, (i6 & 4) != 0 ? aVar2.f8823c : i4, (i6 & 8) != 0 ? aVar2.f8824d : str2, (i6 & 16) != 0 ? aVar2.f8825e : str3, (i6 & 32) != 0 ? aVar2.f8826f : f5, (i6 & 64) != 0 ? aVar2.f8827g : map, (i6 & Uuid.SIZE_BITS) != 0 ? aVar2.f8828h : f6, (i6 & 256) != 0 ? aVar2.f8829i : z3, (i6 & 512) != 0 ? aVar2.f8830j : f7, (i6 & 1024) != 0 ? aVar2.f8831k : f8);
    }

    /* renamed from: a */
    public int compareTo(a aVar) {
        float f4;
        float f5;
        o.e(aVar, "other");
        if (!o() || !aVar.o()) {
            f4 = this.f8822b;
            f5 = aVar.f8822b;
        } else {
            Float f6 = this.f8826f;
            o.b(f6);
            f4 = f6.floatValue();
            Float f7 = aVar.f8826f;
            o.b(f7);
            f5 = f7.floatValue();
        }
        return Float.compare(f4, f5);
    }

    public final a b(String str, float f4, int i4, String str2, String str3, Float f5, Map map, Float f6, boolean z3, Float f7, Float f8) {
        o.e(str, "prediction");
        String str4 = str2;
        o.e(str4, "source");
        String str5 = str3;
        o.e(str5, "modelUniqueIdentifier");
        return new a(str, f4, i4, str4, str5, f5, map, f6, z3, f7, f8);
    }

    public final Map d() {
        return this.f8827g;
    }

    public final Float e() {
        return this.f8831k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return o.a(this.f8821a, aVar.f8821a) && Float.compare(this.f8822b, aVar.f8822b) == 0 && this.f8823c == aVar.f8823c && o.a(this.f8824d, aVar.f8824d) && o.a(this.f8825e, aVar.f8825e) && o.a(this.f8826f, aVar.f8826f) && o.a(this.f8827g, aVar.f8827g) && o.a(this.f8828h, aVar.f8828h) && this.f8829i == aVar.f8829i && o.a(this.f8830j, aVar.f8830j) && o.a(this.f8831k, aVar.f8831k);
    }

    public final Float f() {
        return this.f8830j;
    }

    public final String g() {
        return this.f8825e;
    }

    public final int h() {
        return this.f8823c;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        int i7;
        int hashCode = ((((((((this.f8821a.hashCode() * 31) + Float.floatToIntBits(this.f8822b)) * 31) + this.f8823c) * 31) + this.f8824d.hashCode()) * 31) + this.f8825e.hashCode()) * 31;
        Float f4 = this.f8826f;
        int i8 = 0;
        if (f4 == null) {
            i4 = 0;
        } else {
            i4 = f4.hashCode();
        }
        int i9 = (hashCode + i4) * 31;
        Map map = this.f8827g;
        if (map == null) {
            i5 = 0;
        } else {
            i5 = map.hashCode();
        }
        int i10 = (i9 + i5) * 31;
        Float f5 = this.f8828h;
        if (f5 == null) {
            i6 = 0;
        } else {
            i6 = f5.hashCode();
        }
        int a4 = (((i10 + i6) * 31) + c.a(this.f8829i)) * 31;
        Float f6 = this.f8830j;
        if (f6 == null) {
            i7 = 0;
        } else {
            i7 = f6.hashCode();
        }
        int i11 = (a4 + i7) * 31;
        Float f7 = this.f8831k;
        if (f7 != null) {
            i8 = f7.hashCode();
        }
        return i11 + i8;
    }

    public final String i() {
        return this.f8821a;
    }

    public final Float j() {
        return this.f8826f;
    }

    public final float k() {
        return this.f8822b;
    }

    public final String l() {
        return this.f8824d;
    }

    public final int m() {
        return -this.f8823c;
    }

    public final boolean n() {
        return this.f8821a.length() <= this.f8823c;
    }

    public final boolean o() {
        return this.f8826f != null;
    }

    public final int p() {
        return this.f8821a.length() - this.f8823c;
    }

    public String toString() {
        int m4 = m();
        String str = this.f8821a;
        Float f4 = this.f8826f;
        float f5 = this.f8822b;
        String str2 = this.f8824d;
        return "LMInferenceSingleResult(" + m4 + " |" + str + "| " + f4 + " | " + f5 + " | " + str2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(java.lang.String r16, float r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.Float r21, java.util.Map r22, java.lang.Float r23, boolean r24, java.lang.Float r25, java.lang.Float r26, int r27, kotlin.jvm.internal.i r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r9 = r2
            goto L_0x000b
        L_0x0009:
            r9 = r21
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0011
            r10 = r2
            goto L_0x0013
        L_0x0011:
            r10 = r22
        L_0x0013:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0019
            r11 = r2
            goto L_0x001b
        L_0x0019:
            r11 = r23
        L_0x001b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0022
            r1 = 0
            r12 = r1
            goto L_0x0024
        L_0x0022:
            r12 = r24
        L_0x0024:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x002a
            r13 = r2
            goto L_0x002c
        L_0x002a:
            r13 = r25
        L_0x002c:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0032
            r14 = r2
            goto L_0x0034
        L_0x0032:
            r14 = r26
        L_0x0034:
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling_result_classes.a.<init>(java.lang.String, float, int, java.lang.String, java.lang.String, java.lang.Float, java.util.Map, java.lang.Float, boolean, java.lang.Float, java.lang.Float, int, kotlin.jvm.internal.i):void");
    }
}
