package B0;

import kotlin.jvm.internal.o;

/* renamed from: B0.h  reason: case insensitive filesystem */
final class C0260h implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    private final double f111a;

    /* renamed from: b  reason: collision with root package name */
    private final String f112b;

    /* renamed from: c  reason: collision with root package name */
    private final Float f113c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f114d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f115e;

    public C0260h(double d4, String str, Float f4, Integer num, Integer num2) {
        this.f111a = d4;
        this.f112b = str;
        this.f113c = f4;
        this.f114d = num;
        this.f115e = num2;
    }

    /* renamed from: a */
    public int compareTo(C0260h hVar) {
        o.e(hVar, "other");
        return Double.compare(this.f111a, hVar.f111a);
    }

    public final Float b() {
        return this.f113c;
    }

    public final Integer c() {
        return this.f115e;
    }

    public final String d() {
        return this.f112b;
    }

    public final Integer e() {
        return this.f114d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0260h)) {
            return false;
        }
        C0260h hVar = (C0260h) obj;
        if (Double.compare(this.f111a, hVar.f111a) == 0 && o.a(this.f112b, hVar.f112b) && o.a(this.f113c, hVar.f113c) && o.a(this.f114d, hVar.f114d) && o.a(this.f115e, hVar.f115e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        int a4 = Double.doubleToLongBits(this.f111a) * 31;
        String str = this.f112b;
        int i7 = 0;
        if (str == null) {
            i4 = 0;
        } else {
            i4 = str.hashCode();
        }
        int i8 = (a4 + i4) * 31;
        Float f4 = this.f113c;
        if (f4 == null) {
            i5 = 0;
        } else {
            i5 = f4.hashCode();
        }
        int i9 = (i8 + i5) * 31;
        Integer num = this.f114d;
        if (num == null) {
            i6 = 0;
        } else {
            i6 = num.hashCode();
        }
        int i10 = (i9 + i6) * 31;
        Integer num2 = this.f115e;
        if (num2 != null) {
            i7 = num2.hashCode();
        }
        return i10 + i7;
    }

    public String toString() {
        double d4 = this.f111a;
        String str = this.f112b;
        Float f4 = this.f113c;
        Integer num = this.f114d;
        Integer num2 = this.f115e;
        return "SortByEditDistanceItemForSorting(editDistance=" + d4 + ", bestSuggestion=" + str + ", bestScore=" + f4 + ", whichSplit=" + num + ", bestSpaceSplitIndex=" + num2 + ")";
    }
}
