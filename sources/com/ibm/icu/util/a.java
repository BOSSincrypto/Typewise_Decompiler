package com.ibm.icu.util;

import a2.j;
import com.ibm.icu.util.BytesTrie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a implements Cloneable, Iterable {

    /* renamed from: e  reason: collision with root package name */
    private static BytesTrie.Result[] f13279e = {BytesTrie.Result.INTERMEDIATE_VALUE, BytesTrie.Result.FINAL_VALUE};

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f13280a;

    /* renamed from: b  reason: collision with root package name */
    private int f13281b;

    /* renamed from: c  reason: collision with root package name */
    private int f13282c;

    /* renamed from: d  reason: collision with root package name */
    private int f13283d = -1;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f13284a;

        /* renamed from: b  reason: collision with root package name */
        public int f13285b;

        private b() {
        }
    }

    public static final class c implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private CharSequence f13286a;

        /* renamed from: b  reason: collision with root package name */
        private int f13287b;

        /* renamed from: c  reason: collision with root package name */
        private int f13288c;

        /* renamed from: d  reason: collision with root package name */
        private int f13289d;

        /* renamed from: e  reason: collision with root package name */
        private int f13290e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f13291f;

        /* renamed from: g  reason: collision with root package name */
        private StringBuilder f13292g;

        /* renamed from: h  reason: collision with root package name */
        private int f13293h;

        /* renamed from: i  reason: collision with root package name */
        private b f13294i;

        /* renamed from: j  reason: collision with root package name */
        private ArrayList f13295j;

        private int a(int i4, int i5) {
            boolean z3;
            while (i5 > 5) {
                int i6 = i4 + 1;
                int i7 = i5 >> 1;
                this.f13295j.add(Long.valueOf((((long) a.y(this.f13286a, i6)) << 32) | ((long) ((i5 - i7) << 16)) | ((long) this.f13292g.length())));
                i4 = a.r(this.f13286a, i6);
                i5 = i7;
            }
            int i8 = i4 + 1;
            char charAt = this.f13286a.charAt(i4);
            int i9 = i4 + 2;
            char charAt2 = this.f13286a.charAt(i8);
            if ((32768 & charAt2) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            char c4 = charAt2 & 32767;
            int d4 = a.w(this.f13286a, i9, c4);
            int b4 = a.A(i9, c4);
            this.f13295j.add(Long.valueOf((((long) b4) << 32) | ((long) ((i5 - 1) << 16)) | ((long) this.f13292g.length())));
            this.f13292g.append(charAt);
            if (!z3) {
                return b4 + d4;
            }
            this.f13287b = -1;
            b bVar = this.f13294i;
            bVar.f13284a = this.f13292g;
            bVar.f13285b = d4;
            return -1;
        }

        private b c() {
            this.f13287b = -1;
            b bVar = this.f13294i;
            bVar.f13284a = this.f13292g;
            bVar.f13285b = -1;
            return bVar;
        }

        /* renamed from: b */
        public b next() {
            int i4;
            int i5;
            int i6 = this.f13287b;
            if (i6 < 0) {
                if (!this.f13295j.isEmpty()) {
                    ArrayList arrayList = this.f13295j;
                    long longValue = ((Long) arrayList.remove(arrayList.size() - 1)).longValue();
                    int i7 = (int) longValue;
                    int i8 = (int) (longValue >> 32);
                    this.f13292g.setLength(65535 & i7);
                    int i9 = i7 >>> 16;
                    if (i9 > 1) {
                        i6 = a(i8, i9);
                        if (i6 < 0) {
                            return this.f13294i;
                        }
                    } else {
                        this.f13292g.append(this.f13286a.charAt(i8));
                        i6 = i8 + 1;
                    }
                } else {
                    throw new NoSuchElementException();
                }
            }
            if (this.f13289d >= 0) {
                return c();
            }
            while (true) {
                int i10 = i4 + 1;
                char charAt = this.f13286a.charAt(i4);
                if (charAt >= '@') {
                    boolean z3 = false;
                    if (this.f13291f) {
                        i10 = a.z(i10, charAt);
                        charAt &= '?';
                        this.f13291f = false;
                    } else {
                        if ((32768 & charAt) != 0) {
                            z3 = true;
                        }
                        if (z3) {
                            this.f13294i.f13285b = a.w(this.f13286a, i10, charAt & 32767);
                        } else {
                            this.f13294i.f13285b = a.v(this.f13286a, i10, charAt);
                        }
                        if (z3 || (this.f13293h > 0 && this.f13292g.length() == this.f13293h)) {
                            this.f13287b = -1;
                        } else {
                            this.f13287b = i4;
                            this.f13291f = true;
                        }
                        b bVar = this.f13294i;
                        bVar.f13284a = this.f13292g;
                        return bVar;
                    }
                }
                if (this.f13293h > 0 && this.f13292g.length() == this.f13293h) {
                    return c();
                }
                if (charAt < '0') {
                    if (charAt == 0) {
                        char charAt2 = this.f13286a.charAt(i10);
                        i10++;
                        charAt = charAt2;
                    }
                    i4 = a(i10, charAt + 1);
                    if (i4 < 0) {
                        return this.f13294i;
                    }
                } else {
                    int i11 = charAt - '/';
                    if (this.f13293h <= 0 || this.f13292g.length() + i11 <= (i5 = this.f13293h)) {
                        int i12 = i11 + i10;
                        this.f13292g.append(this.f13286a, i10, i12);
                        i4 = i12;
                    } else {
                        StringBuilder sb = this.f13292g;
                        sb.append(this.f13286a, i10, (i5 + i10) - sb.length());
                        return c();
                    }
                }
            }
        }

        public boolean hasNext() {
            if (this.f13287b >= 0 || !this.f13295j.isEmpty()) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(CharSequence charSequence, int i4, int i5, int i6) {
            this.f13292g = new StringBuilder();
            this.f13294i = new b();
            this.f13295j = new ArrayList();
            this.f13286a = charSequence;
            this.f13288c = i4;
            this.f13287b = i4;
            this.f13290e = i5;
            this.f13289d = i5;
            this.f13293h = i6;
            if (i5 >= 0) {
                int i7 = i5 + 1;
                i6 = (i6 <= 0 || i7 <= i6) ? i7 : i6;
                this.f13292g.append(charSequence, i4, i4 + i6);
                this.f13287b += i6;
                this.f13289d -= i6;
            }
        }
    }

    public a(CharSequence charSequence, int i4) {
        this.f13280a = charSequence;
        this.f13281b = i4;
        this.f13282c = i4;
    }

    /* access modifiers changed from: private */
    public static int A(int i4, int i5) {
        if (i5 >= 16384) {
            return i5 < 32767 ? i4 + 1 : i4 + 2;
        }
        return i4;
    }

    private static int B(CharSequence charSequence, int i4) {
        return A(i4 + 1, charSequence.charAt(i4) & 32767);
    }

    private void C() {
        this.f13282c = -1;
    }

    private BytesTrie.Result k(int i4, int i5, int i6) {
        BytesTrie.Result result;
        if (i5 == 0) {
            i5 = this.f13280a.charAt(i4);
            i4++;
        }
        int i7 = i5 + 1;
        while (i7 > 5) {
            int i8 = r5 + 1;
            if (i6 < this.f13280a.charAt(r5)) {
                i7 >>= 1;
                r5 = r(this.f13280a, i8);
            } else {
                i7 -= i7 >> 1;
                r5 = y(this.f13280a, i8);
            }
        }
        do {
            int i9 = r5 + 1;
            if (i6 == this.f13280a.charAt(r5)) {
                char charAt = this.f13280a.charAt(i9);
                if ((32768 & charAt) != 0) {
                    result = BytesTrie.Result.FINAL_VALUE;
                } else {
                    int i10 = r5 + 2;
                    if (charAt >= 16384) {
                        if (charAt < 32767) {
                            charAt = ((charAt - 16384) << 16) | this.f13280a.charAt(i10);
                            i10 = r5 + 3;
                        } else {
                            charAt = (this.f13280a.charAt(i10) << 16) | this.f13280a.charAt(r5 + 3);
                            i10 = r5 + 4;
                        }
                    }
                    i9 = i10 + charAt;
                    char charAt2 = this.f13280a.charAt(i9);
                    if (charAt2 >= '@') {
                        result = f13279e[charAt2 >> 15];
                    } else {
                        result = BytesTrie.Result.NO_VALUE;
                    }
                }
                this.f13282c = i9;
                return result;
            }
            i7--;
            r5 = B(this.f13280a, i9);
        } while (i7 > 1);
        int i11 = r5 + 1;
        if (i6 == this.f13280a.charAt(r5)) {
            this.f13282c = i11;
            char charAt3 = this.f13280a.charAt(i11);
            if (charAt3 >= '@') {
                return f13279e[charAt3 >> 15];
            }
            return BytesTrie.Result.NO_VALUE;
        }
        C();
        return BytesTrie.Result.NO_MATCH;
    }

    /* access modifiers changed from: private */
    public static int r(CharSequence charSequence, int i4) {
        int i5 = i4 + 1;
        char charAt = charSequence.charAt(i4);
        if (charAt >= 64512) {
            if (charAt == 65535) {
                charAt = (charSequence.charAt(i5) << 16) | charSequence.charAt(i4 + 2);
                i5 = i4 + 3;
            } else {
                charAt = ((charAt - 64512) << 16) | charSequence.charAt(i5);
                i5 = i4 + 2;
            }
        }
        return i5 + charAt;
    }

    private BytesTrie.Result u(int i4, int i5) {
        char charAt;
        int i6 = i4 + 1;
        char charAt2 = this.f13280a.charAt(i4);
        while (charAt2 >= '0') {
            if (charAt2 < '@') {
                int i7 = i6 + 1;
                if (i5 == this.f13280a.charAt(i6)) {
                    int i8 = charAt2 - '1';
                    this.f13283d = i8;
                    this.f13282c = i7;
                    if (i8 >= 0 || (charAt = this.f13280a.charAt(i7)) < '@') {
                        return BytesTrie.Result.NO_VALUE;
                    }
                    return f13279e[charAt >> 15];
                }
            } else if ((32768 & charAt2) == 0) {
                i6 = z(i6, charAt2);
                charAt2 &= '?';
            }
            C();
            return BytesTrie.Result.NO_MATCH;
        }
        return k(i6, charAt2, i5);
    }

    /* access modifiers changed from: private */
    public static int v(CharSequence charSequence, int i4, int i5) {
        int charAt;
        char charAt2;
        if (i5 < 16448) {
            return (i5 >> 6) - 1;
        }
        if (i5 < 32704) {
            charAt = ((i5 & 32704) - 16448) << 10;
            charAt2 = charSequence.charAt(i4);
        } else {
            charAt = charSequence.charAt(i4) << 16;
            charAt2 = charSequence.charAt(i4 + 1);
        }
        return charAt2 | charAt;
    }

    /* access modifiers changed from: private */
    public static int w(CharSequence charSequence, int i4, int i5) {
        int charAt;
        char charAt2;
        if (i5 < 16384) {
            return i5;
        }
        if (i5 < 32767) {
            charAt = (i5 - 16384) << 16;
            charAt2 = charSequence.charAt(i4);
        } else {
            charAt = charSequence.charAt(i4) << 16;
            charAt2 = charSequence.charAt(i4 + 1);
        }
        return charAt | charAt2;
    }

    /* access modifiers changed from: private */
    public static int y(CharSequence charSequence, int i4) {
        int i5 = i4 + 1;
        char charAt = charSequence.charAt(i4);
        if (charAt < 64512) {
            return i5;
        }
        if (charAt == 65535) {
            return i4 + 3;
        }
        return i4 + 2;
    }

    /* access modifiers changed from: private */
    public static int z(int i4, int i5) {
        if (i5 >= 16448) {
            return i5 < 32704 ? i4 + 1 : i4 + 2;
        }
        return i4;
    }

    /* renamed from: l */
    public a clone() {
        return (a) super.clone();
    }

    public BytesTrie.Result n(int i4) {
        this.f13283d = -1;
        return u(this.f13281b, i4);
    }

    public BytesTrie.Result o(int i4) {
        if (i4 <= 65535) {
            return n(i4);
        }
        if (n(j.e(i4)).hasNext()) {
            return s(j.f(i4));
        }
        return BytesTrie.Result.NO_MATCH;
    }

    public int p() {
        int i4 = this.f13282c;
        int i5 = i4 + 1;
        char charAt = this.f13280a.charAt(i4);
        if ((32768 & charAt) != 0) {
            return w(this.f13280a, i5, charAt & 32767);
        }
        return v(this.f13280a, i5, charAt);
    }

    /* renamed from: q */
    public c iterator() {
        return new c(this.f13280a, this.f13282c, this.f13283d, 0);
    }

    public BytesTrie.Result s(int i4) {
        char charAt;
        int i5 = this.f13282c;
        if (i5 < 0) {
            return BytesTrie.Result.NO_MATCH;
        }
        int i6 = this.f13283d;
        if (i6 < 0) {
            return u(i5, i4);
        }
        int i7 = i5 + 1;
        if (i4 == this.f13280a.charAt(i5)) {
            int i8 = i6 - 1;
            this.f13283d = i8;
            this.f13282c = i7;
            if (i8 >= 0 || (charAt = this.f13280a.charAt(i7)) < '@') {
                return BytesTrie.Result.NO_VALUE;
            }
            return f13279e[charAt >> 15];
        }
        C();
        return BytesTrie.Result.NO_MATCH;
    }

    public BytesTrie.Result t(int i4) {
        if (i4 <= 65535) {
            return s(i4);
        }
        if (s(j.e(i4)).hasNext()) {
            return s(j.f(i4));
        }
        return BytesTrie.Result.NO_MATCH;
    }

    public a x() {
        this.f13282c = this.f13281b;
        this.f13283d = -1;
        return this;
    }
}
