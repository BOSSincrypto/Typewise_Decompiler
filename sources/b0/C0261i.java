package B0;

import kotlin.jvm.internal.o;

/* renamed from: B0.i  reason: case insensitive filesystem */
final class C0261i implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    private final Float f116a;

    /* renamed from: b  reason: collision with root package name */
    private final String f117b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f118c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f119d;

    public C0261i(Float f4, String str, Integer num, Integer num2) {
        this.f116a = f4;
        this.f117b = str;
        this.f118c = num;
        this.f119d = num2;
    }

    /* renamed from: a */
    public int compareTo(C0261i iVar) {
        int i4;
        int i5;
        int i6;
        String str;
        o.e(iVar, "other");
        Float f4 = this.f116a;
        if (f4 == null && iVar.f116a != null) {
            i4 = -1;
        } else if (f4 != null && iVar.f116a == null) {
            i4 = 1;
        } else if (f4 == null || iVar.f116a == null) {
            i4 = 0;
        } else {
            i4 = Float.compare(f4.floatValue(), iVar.f116a.floatValue());
        }
        if (i4 != 0) {
            return i4;
        }
        String str2 = this.f117b;
        if (str2 == null && iVar.f117b != null) {
            i5 = -1;
        } else if (str2 != null && iVar.f117b == null) {
            i5 = 1;
        } else if (str2 == null || (str = iVar.f117b) == null) {
            i5 = 0;
        } else {
            i5 = str2.compareTo(str);
        }
        if (i5 != 0) {
            return i5;
        }
        Integer num = this.f118c;
        if (num == null && iVar.f118c != null) {
            i6 = -1;
        } else if (num != null && iVar.f118c == null) {
            i6 = 1;
        } else if (num == null || iVar.f118c == null) {
            i6 = 0;
        } else {
            i6 = o.f(num.intValue(), iVar.f118c.intValue());
        }
        if (i6 != 0) {
            return i6;
        }
        Integer num2 = this.f119d;
        if (num2 == null && iVar.f119d != null) {
            return -1;
        }
        if (num2 != null && iVar.f119d == null) {
            return 1;
        }
        if (num2 == null || iVar.f119d == null) {
            return 0;
        }
        return o.f(num2.intValue(), iVar.f119d.intValue());
    }

    public final Float b() {
        return this.f116a;
    }

    public final Integer c() {
        return this.f119d;
    }

    public final String d() {
        return this.f117b;
    }

    public final Integer e() {
        return this.f118c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0261i)) {
            return false;
        }
        C0261i iVar = (C0261i) obj;
        if (o.a(this.f116a, iVar.f116a) && o.a(this.f117b, iVar.f117b) && o.a(this.f118c, iVar.f118c) && o.a(this.f119d, iVar.f119d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i6;
        Float f4 = this.f116a;
        int i7 = 0;
        if (f4 == null) {
            i4 = 0;
        } else {
            i4 = f4.hashCode();
        }
        int i8 = i4 * 31;
        String str = this.f117b;
        if (str == null) {
            i5 = 0;
        } else {
            i5 = str.hashCode();
        }
        int i9 = (i8 + i5) * 31;
        Integer num = this.f118c;
        if (num == null) {
            i6 = 0;
        } else {
            i6 = num.hashCode();
        }
        int i10 = (i9 + i6) * 31;
        Integer num2 = this.f119d;
        if (num2 != null) {
            i7 = num2.hashCode();
        }
        return i10 + i7;
    }

    public String toString() {
        Float f4 = this.f116a;
        String str = this.f117b;
        Integer num = this.f118c;
        Integer num2 = this.f119d;
        return "SortByScoreItemForSorting(bestScore=" + f4 + ", bestSuggestion=" + str + ", whichSplit=" + num + ", bestSpaceSplitIndex=" + num2 + ")";
    }
}
