package com.ibm.icu.impl;

import Z1.c;
import java.io.IOException;
import java.util.Locale;
import java.util.MissingResourceException;

public final class q {

    /* renamed from: n  reason: collision with root package name */
    public static final q f12941n;

    /* renamed from: o  reason: collision with root package name */
    private static final String[] f12942o = {"unassigned", "uppercase letter", "lowercase letter", "titlecase letter", "modifier letter", "other letter", "non spacing mark", "enclosing mark", "combining spacing mark", "decimal digit number", "letter number", "other number", "space separator", "line separator", "paragraph separator", "control", "format", "private use area", "surrogate", "dash punctuation", "start punctuation", "end punctuation", "connector punctuation", "other punctuation", "math symbol", "currency symbol", "modifier symbol", "other symbol", "initial punctuation", "final punctuation", "noncharacter", "lead surrogate", "trail surrogate"};

    /* renamed from: a  reason: collision with root package name */
    public int f12943a = 0;

    /* renamed from: b  reason: collision with root package name */
    int f12944b = 0;

    /* renamed from: c  reason: collision with root package name */
    private char[] f12945c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f12946d;

    /* renamed from: e  reason: collision with root package name */
    private char[] f12947e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f12948f;

    /* renamed from: g  reason: collision with root package name */
    private a[] f12949g;

    /* renamed from: h  reason: collision with root package name */
    private char[] f12950h = new char[33];

    /* renamed from: i  reason: collision with root package name */
    private char[] f12951i = new char[33];

    /* renamed from: j  reason: collision with root package name */
    private int[] f12952j = new int[8];

    /* renamed from: k  reason: collision with root package name */
    private int[] f12953k = new int[8];

    /* renamed from: l  reason: collision with root package name */
    private StringBuffer f12954l = new StringBuffer();

    /* renamed from: m  reason: collision with root package name */
    private int[] f12955m = new int[2];

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private int f12956a;

        /* renamed from: b  reason: collision with root package name */
        private int f12957b;

        /* renamed from: c  reason: collision with root package name */
        private byte f12958c;

        /* renamed from: d  reason: collision with root package name */
        private byte f12959d;

        /* renamed from: e  reason: collision with root package name */
        private char[] f12960e;

        /* renamed from: f  reason: collision with root package name */
        private String f12961f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f12962g;

        /* renamed from: h  reason: collision with root package name */
        private StringBuffer f12963h = new StringBuffer();

        /* renamed from: i  reason: collision with root package name */
        private int[] f12964i = new int[256];

        a() {
        }

        private boolean a(int[] iArr, int i4, String str, int i5) {
            int length = this.f12960e.length;
            if (iArr == null || i4 != length) {
                return false;
            }
            int i6 = length - 1;
            int i7 = 0;
            for (int i8 = 0; i8 <= i6; i8++) {
                char c4 = this.f12960e[i8];
                i7 = t.d(this.f12962g, i7, iArr[i8]);
                i5 = t.a(str, this.f12962g, i5, i7);
                if (i5 < 0) {
                    return false;
                }
                if (i8 != i6) {
                    i7 = t.d(this.f12962g, i7, c4 - iArr[i8]);
                }
            }
            if (i5 != str.length()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
            r1 = r1 + 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int b(java.lang.String r11) {
            /*
                r10 = this;
                java.lang.String r0 = r10.f12961f
                int r0 = r0.length()
                int r1 = r11.length()
                r2 = -1
                if (r1 < r0) goto L_0x006a
                java.lang.String r1 = r10.f12961f
                r3 = 0
                java.lang.String r4 = r11.substring(r3, r0)
                boolean r1 = r1.equals(r4)
                if (r1 != 0) goto L_0x001b
                goto L_0x006a
            L_0x001b:
                byte r1 = r10.f12958c
                if (r1 == 0) goto L_0x0057
                r4 = 1
                if (r1 == r4) goto L_0x0023
                goto L_0x006a
            L_0x0023:
                int r1 = r10.f12956a
            L_0x0025:
                int r5 = r10.f12957b
                if (r1 > r5) goto L_0x006a
                int r5 = r10.f12956a
                int r5 = r1 - r5
                int[] r6 = r10.f12964i
                monitor-enter(r6)
                byte r7 = r10.f12959d     // Catch:{ all -> 0x0043 }
                int r7 = r7 - r4
            L_0x0033:
                if (r7 <= 0) goto L_0x0045
                char[] r8 = r10.f12960e     // Catch:{ all -> 0x0043 }
                char r8 = r8[r7]     // Catch:{ all -> 0x0043 }
                r8 = r8 & 255(0xff, float:3.57E-43)
                int r9 = r5 % r8
                r6[r7] = r9     // Catch:{ all -> 0x0043 }
                int r5 = r5 / r8
                int r7 = r7 + -1
                goto L_0x0033
            L_0x0043:
                r11 = move-exception
                goto L_0x0055
            L_0x0045:
                r6[r3] = r5     // Catch:{ all -> 0x0043 }
                byte r5 = r10.f12959d     // Catch:{ all -> 0x0043 }
                boolean r5 = r10.a(r6, r5, r11, r0)     // Catch:{ all -> 0x0043 }
                if (r5 == 0) goto L_0x0051
                monitor-exit(r6)     // Catch:{ all -> 0x0043 }
                return r1
            L_0x0051:
                monitor-exit(r6)     // Catch:{ all -> 0x0043 }
                int r1 = r1 + 1
                goto L_0x0025
            L_0x0055:
                monitor-exit(r6)     // Catch:{ all -> 0x0043 }
                throw r11
            L_0x0057:
                java.lang.String r11 = r11.substring(r0)     // Catch:{ NumberFormatException -> 0x006a }
                r0 = 16
                int r11 = java.lang.Integer.parseInt(r11, r0)     // Catch:{ NumberFormatException -> 0x006a }
                int r0 = r10.f12956a     // Catch:{ NumberFormatException -> 0x006a }
                if (r0 > r11) goto L_0x006a
                int r0 = r10.f12957b     // Catch:{ NumberFormatException -> 0x006a }
                if (r11 > r0) goto L_0x006a
                return r11
            L_0x006a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.q.a.b(java.lang.String):int");
        }

        /* access modifiers changed from: package-private */
        public boolean c(char[] cArr) {
            if (cArr.length != this.f12959d) {
                return false;
            }
            this.f12960e = cArr;
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean d(byte[] bArr) {
            this.f12962g = bArr;
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean e(int i4, int i5, byte b4, byte b5) {
            if (i4 < 0 || i4 > i5 || i5 > 1114111) {
                return false;
            }
            if (b4 != 0 && b4 != 1) {
                return false;
            }
            this.f12956a = i4;
            this.f12957b = i5;
            this.f12958c = b4;
            this.f12959d = b5;
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean f(String str) {
            if (str == null || str.length() <= 0) {
                return false;
            }
            this.f12961f = str;
            return true;
        }
    }

    static {
        try {
            f12941n = new q();
        } catch (IOException unused) {
            throw new MissingResourceException("Could not construct UCharacterName. Missing unames.icu", "", "");
        }
    }

    private q() {
        new r(d.o("unames.icu")).b(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r4 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int b(java.lang.String r7, int r8) {
        /*
            r0 = 0
            char r1 = r7.charAt(r0)
            r2 = 60
            if (r1 != r2) goto L_0x005e
            r1 = 2
            r2 = -1
            if (r8 != r1) goto L_0x005d
            int r8 = r7.length()
            r1 = 1
            int r8 = r8 - r1
            char r3 = r7.charAt(r8)
            r4 = 62
            if (r3 != r4) goto L_0x005d
            r3 = 45
            int r3 = r7.lastIndexOf(r3)
            if (r3 < 0) goto L_0x005d
            int r4 = r3 + 1
            int r5 = r8 - r4
            if (r5 < r1) goto L_0x005d
            r6 = 8
            if (r6 >= r5) goto L_0x002e
            goto L_0x005d
        L_0x002e:
            java.lang.String r8 = r7.substring(r4, r8)     // Catch:{ NumberFormatException -> 0x005d }
            r4 = 16
            int r8 = java.lang.Integer.parseInt(r8, r4)     // Catch:{ NumberFormatException -> 0x005d }
            if (r8 < 0) goto L_0x005d
            r4 = 1114111(0x10ffff, float:1.561202E-39)
            if (r4 >= r8) goto L_0x0040
            goto L_0x005d
        L_0x0040:
            int r4 = f(r8)
            java.lang.String r7 = r7.substring(r1, r3)
            java.lang.String[] r1 = f12942o
            int r1 = r1.length
        L_0x004b:
            if (r0 >= r1) goto L_0x005d
            java.lang.String[] r3 = f12942o
            r3 = r3[r0]
            int r3 = r7.compareTo(r3)
            if (r3 != 0) goto L_0x005a
            if (r4 != r0) goto L_0x005d
            return r8
        L_0x005a:
            int r0 = r0 + 1
            goto L_0x004b
        L_0x005d:
            return r2
        L_0x005e:
            r7 = -2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.q.b(java.lang.String, int):int");
    }

    private int c(int i4, char[] cArr, String str, int i5) {
        int a4;
        String str2 = str;
        int i6 = i5;
        int length = str.length();
        int i7 = i4;
        int i8 = 0;
        while (true) {
            int i9 = -1;
            if (i8 > 32) {
                return -1;
            }
            char c4 = cArr[i8];
            int i10 = c4;
            if (i6 != 0) {
                int i11 = 2;
                i10 = c4;
                if (i6 != 2) {
                    if (i6 != 4) {
                        i11 = i6;
                    }
                    i10 = c4;
                    do {
                        int c5 = t.c(this.f12948f, i7, i10, (byte) 59) + i7;
                        i10 -= c5 - i7;
                        i11--;
                        i7 = c5;
                    } while (i11 > 0);
                }
            }
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 && i13 != i9 && i13 < length) {
                byte[] bArr = this.f12948f;
                byte b4 = bArr[i7 + i12];
                int i14 = i12 + 1;
                char[] cArr2 = this.f12945c;
                if (b4 >= cArr2.length) {
                    int i15 = i13 + 1;
                    if (str2.charAt(i13) != (b4 & 255)) {
                        i13 = i9;
                    } else {
                        i13 = i15;
                    }
                    i12 = i14;
                } else {
                    char c6 = b4 & 255;
                    char c7 = cArr2[c6];
                    if (c7 == 65534) {
                        c7 = cArr2[(b4 << 8) | (bArr[i14 + i7] & 255)];
                        i12 += 2;
                    } else {
                        i12 = i14;
                    }
                    if (c7 == 65535) {
                        int i16 = i13 + 1;
                        if (str2.charAt(i13) != c6) {
                            i9 = -1;
                            i13 = -1;
                        } else {
                            a4 = i16;
                        }
                    } else {
                        a4 = t.a(str2, this.f12946d, i13, c7);
                    }
                    i9 = -1;
                }
            }
            if (!(length == i13 && (i12 == i10 || this.f12948f[i12 + i7] == 59))) {
                i7 += i10;
                i8++;
            }
        }
        return i8;
    }

    private synchronized int d(String str, int i4) {
        for (int i5 = 0; i5 < this.f12943a; i5++) {
            int c4 = c(e(i5, this.f12950h, this.f12951i), this.f12951i, str, i4);
            if (c4 != -1) {
                return (this.f12947e[i5 * this.f12944b] << 5) | c4;
            }
        }
        return -1;
    }

    private static int f(int i4) {
        if (t.b(i4)) {
            return 30;
        }
        int m4 = c.m(i4);
        if (m4 != 18) {
            return m4;
        }
        if (i4 <= 56319) {
            return 31;
        }
        return 32;
    }

    public int a(int i4, String str) {
        int i5;
        if (i4 >= 4 || str == null || str.length() == 0) {
            return -1;
        }
        Locale locale = Locale.ENGLISH;
        int b4 = b(str.toLowerCase(locale), i4);
        if (b4 >= -1) {
            return b4;
        }
        String upperCase = str.toUpperCase(locale);
        if (i4 == 0 || i4 == 2) {
            a[] aVarArr = this.f12949g;
            if (aVarArr != null) {
                i5 = aVarArr.length;
            } else {
                i5 = 0;
            }
            for (int i6 = i5 - 1; i6 >= 0; i6--) {
                int b5 = this.f12949g[i6].b(upperCase);
                if (b5 >= 0) {
                    return b5;
                }
            }
        }
        if (i4 != 2) {
            return d(upperCase, i4);
        }
        int d4 = d(upperCase, 0);
        if (d4 == -1) {
            return d(upperCase, 3);
        }
        return d4;
    }

    public int e(int i4, char[] cArr, char[] cArr2) {
        int i5 = i4 * this.f12944b;
        char[] cArr3 = this.f12947e;
        int e4 = t.e(cArr3[i5 + 1], cArr3[i5 + 2]);
        int i6 = 0;
        cArr[0] = 0;
        char c4 = 65535;
        while (i6 < 32) {
            byte b4 = this.f12948f[e4];
            for (int i7 = 4; i7 >= 0; i7 -= 4) {
                byte b5 = (byte) ((b4 >> i7) & 15);
                if (c4 != 65535 || b5 <= 11) {
                    if (c4 != 65535) {
                        cArr2[i6] = (char) ((c4 | b5) + 12);
                    } else {
                        cArr2[i6] = (char) b5;
                    }
                    if (i6 < 32) {
                        cArr[i6 + 1] = (char) (cArr[i6] + cArr2[i6]);
                    }
                    i6++;
                    c4 = 65535;
                } else {
                    c4 = (char) ((b5 - 12) << 4);
                }
            }
            e4++;
        }
        return e4;
    }

    /* access modifiers changed from: package-private */
    public boolean g(a[] aVarArr) {
        if (aVarArr == null || aVarArr.length == 0) {
            return false;
        }
        this.f12949g = aVarArr;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean h(char[] cArr, byte[] bArr) {
        if (cArr == null || bArr == null || cArr.length <= 0 || bArr.length <= 0) {
            return false;
        }
        this.f12947e = cArr;
        this.f12948f = bArr;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean i(int i4, int i5) {
        if (i4 <= 0 || i5 <= 0) {
            return false;
        }
        this.f12943a = i4;
        this.f12944b = i5;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean j(char[] cArr, byte[] bArr) {
        if (cArr == null || bArr == null || cArr.length <= 0 || bArr.length <= 0) {
            return false;
        }
        this.f12945c = cArr;
        this.f12946d = bArr;
        return true;
    }
}
