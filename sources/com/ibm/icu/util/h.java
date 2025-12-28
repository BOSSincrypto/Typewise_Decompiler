package com.ibm.icu.util;

import java.util.concurrent.ConcurrentHashMap;

public final class h implements Comparable {

    /* renamed from: A  reason: collision with root package name */
    public static final h f13333A = c(6, 1, 0, 0);

    /* renamed from: B  reason: collision with root package name */
    public static final h f13334B = c(6, 2, 0, 0);

    /* renamed from: C  reason: collision with root package name */
    public static final h f13335C = c(6, 3, 0, 0);

    /* renamed from: D  reason: collision with root package name */
    public static final h f13336D = c(7, 0, 0, 0);

    /* renamed from: E  reason: collision with root package name */
    public static final h f13337E = c(8, 0, 0, 0);

    /* renamed from: F  reason: collision with root package name */
    public static final h f13338F = c(9, 0, 0, 0);

    /* renamed from: G  reason: collision with root package name */
    public static final h f13339G = c(10, 0, 0, 0);

    /* renamed from: H  reason: collision with root package name */
    public static final h f13340H = c(11, 0, 0, 0);

    /* renamed from: I  reason: collision with root package name */
    public static final h f13341I = c(12, 0, 0, 0);

    /* renamed from: J  reason: collision with root package name */
    public static final h f13342J = c(12, 1, 0, 0);

    /* renamed from: K  reason: collision with root package name */
    public static final h f13343K = c(13, 0, 0, 0);

    /* renamed from: L  reason: collision with root package name */
    public static final h f13344L;

    /* renamed from: M  reason: collision with root package name */
    public static final h f13345M;

    /* renamed from: N  reason: collision with root package name */
    public static final h f13346N;

    /* renamed from: O  reason: collision with root package name */
    public static final h f13347O = b(9);

    /* renamed from: P  reason: collision with root package name */
    public static final h f13348P = b(9);

    /* renamed from: Q  reason: collision with root package name */
    public static final h f13349Q = b(1);

    /* renamed from: R  reason: collision with root package name */
    private static final h f13350R;

    /* renamed from: S  reason: collision with root package name */
    private static final ConcurrentHashMap f13351S = new ConcurrentHashMap();

    /* renamed from: T  reason: collision with root package name */
    private static volatile String f13352T = null;

    /* renamed from: b  reason: collision with root package name */
    public static final h f13353b = c(1, 0, 0, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final h f13354c = c(1, 0, 1, 0);

    /* renamed from: d  reason: collision with root package name */
    public static final h f13355d = c(1, 1, 0, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final h f13356e = c(1, 1, 5, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final h f13357f = c(2, 0, 0, 0);

    /* renamed from: g  reason: collision with root package name */
    public static final h f13358g = c(2, 1, 2, 0);

    /* renamed from: h  reason: collision with root package name */
    public static final h f13359h = c(2, 1, 5, 0);

    /* renamed from: i  reason: collision with root package name */
    public static final h f13360i = c(2, 1, 8, 0);

    /* renamed from: j  reason: collision with root package name */
    public static final h f13361j = c(2, 1, 9, 0);

    /* renamed from: k  reason: collision with root package name */
    public static final h f13362k = c(3, 0, 0, 0);

    /* renamed from: l  reason: collision with root package name */
    public static final h f13363l = c(3, 0, 1, 0);

    /* renamed from: m  reason: collision with root package name */
    public static final h f13364m = c(3, 1, 0, 0);

    /* renamed from: n  reason: collision with root package name */
    public static final h f13365n = c(3, 1, 1, 0);

    /* renamed from: o  reason: collision with root package name */
    public static final h f13366o = c(3, 2, 0, 0);

    /* renamed from: p  reason: collision with root package name */
    public static final h f13367p = c(4, 0, 0, 0);

    /* renamed from: q  reason: collision with root package name */
    public static final h f13368q = c(4, 0, 1, 0);

    /* renamed from: v  reason: collision with root package name */
    public static final h f13369v = c(4, 1, 0, 0);

    /* renamed from: w  reason: collision with root package name */
    public static final h f13370w = c(5, 0, 0, 0);

    /* renamed from: x  reason: collision with root package name */
    public static final h f13371x = c(5, 1, 0, 0);

    /* renamed from: y  reason: collision with root package name */
    public static final h f13372y = c(5, 2, 0, 0);

    /* renamed from: z  reason: collision with root package name */
    public static final h f13373z = c(6, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private int f13374a;

    static {
        h c4 = c(14, 0, 0, 0);
        f13344L = c4;
        h c5 = c(71, 1, 0, 0);
        f13345M = c5;
        f13346N = c5;
        f13350R = c4;
    }

    private h(int i4) {
        this.f13374a = i4;
    }

    public static h b(int i4) {
        return c(i4, 0, 0, 0);
    }

    public static h c(int i4, int i5, int i6, int i7) {
        if (i4 < 0 || i4 > 255 || i5 < 0 || i5 > 255 || i6 < 0 || i6 > 255 || i7 < 0 || i7 > 255) {
            throw new IllegalArgumentException("Invalid version number: Version number may be negative or greater than 255");
        }
        int e4 = e(i4, i5, i6, i7);
        Integer valueOf = Integer.valueOf(e4);
        ConcurrentHashMap concurrentHashMap = f13351S;
        h hVar = (h) concurrentHashMap.get(valueOf);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(e4);
        h hVar3 = (h) concurrentHashMap.putIfAbsent(valueOf, hVar2);
        if (hVar3 != null) {
            return hVar3;
        }
        return hVar2;
    }

    public static h d(String str) {
        int length = str.length();
        int[] iArr = {0, 0, 0, 0};
        int i4 = 0;
        int i5 = 0;
        while (i4 < 4 && i5 < length) {
            char charAt = str.charAt(i5);
            if (charAt == '.') {
                i4++;
            } else {
                char c4 = (char) (charAt - '0');
                if (c4 < 0 || c4 > 9) {
                    throw new IllegalArgumentException("Invalid version number: Version number may be negative or greater than 255");
                }
                int i6 = iArr[i4] * 10;
                iArr[i4] = i6;
                iArr[i4] = i6 + c4;
            }
            i5++;
        }
        if (i5 == length) {
            for (int i7 = 0; i7 < 4; i7++) {
                int i8 = iArr[i7];
                if (i8 < 0 || i8 > 255) {
                    throw new IllegalArgumentException("Invalid version number: Version number may be negative or greater than 255");
                }
            }
            return c(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        throw new IllegalArgumentException("Invalid version number: String '" + str + "' exceeds version format");
    }

    private static int e(int i4, int i5, int i6, int i7) {
        return (i4 << 24) | (i5 << 16) | (i6 << 8) | i7;
    }

    /* renamed from: a */
    public int compareTo(h hVar) {
        int i4 = this.f13374a;
        int i5 = hVar.f13374a;
        int i6 = (i4 >>> 1) - (i5 >>> 1);
        if (i6 != 0) {
            return i6;
        }
        return (i4 & 1) - (i5 & 1);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int f() {
        return (this.f13374a >> 24) & 255;
    }

    public int g() {
        return this.f13374a & 255;
    }

    public int h() {
        return (this.f13374a >> 8) & 255;
    }

    public int hashCode() {
        return this.f13374a;
    }

    public int i() {
        return (this.f13374a >> 16) & 255;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(7);
        sb.append(f());
        sb.append('.');
        sb.append(i());
        sb.append('.');
        sb.append(h());
        sb.append('.');
        sb.append(g());
        return sb.toString();
    }
}
