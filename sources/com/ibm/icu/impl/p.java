package com.ibm.icu.impl;

import a2.j;
import com.ibm.icu.impl.Trie2;
import com.ibm.icu.impl.d;
import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.ICUUncheckedIOException;
import com.ibm.icu.util.ULocale;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

public final class p {

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f12930e = {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 3, 4, 4, 5, 4, 5, 5, 6, 4, 5, 5, 6, 5, 6, 6, 7, 1, 2, 2, 3, 2, 3, 3, 4, 2, 3, 3, 4, 3, 4, 4, 5, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 3, 4, 4, 5, 4, 5, 5, 6, 4, 5, 5, 6, 5, 6, 6, 7, 2, 3, 3, 4, 3, 4, 4, 5, 3, 4, 4, 5, 4, 5, 5, 6, 3, 4, 4, 5, 4, 5, 5, 6, 4, 5, 5, 6, 5, 6, 6, 7, 3, 4, 4, 5, 4, 5, 5, 6, 4, 5, 5, 6, 5, 6, 6, 7, 4, 5, 5, 6, 5, 6, 6, 7, 5, 6, 6, 7, 6, 7, 7, 8};

    /* renamed from: f  reason: collision with root package name */
    public static final StringBuilder f12931f = new StringBuilder();

    /* renamed from: g  reason: collision with root package name */
    public static final p f12932g;

    /* renamed from: a  reason: collision with root package name */
    private int[] f12933a;

    /* renamed from: b  reason: collision with root package name */
    private String f12934b;

    /* renamed from: c  reason: collision with root package name */
    private char[] f12935c;

    /* renamed from: d  reason: collision with root package name */
    private m f12936d;

    public interface b {
        void a(int i4);

        int next();
    }

    private static final class c implements d.b {
        private c() {
        }

        public boolean a(byte[] bArr) {
            if (bArr[0] == 4) {
                return true;
            }
            return false;
        }
    }

    static final class d {

        /* renamed from: a  reason: collision with root package name */
        static final byte[] f12937a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 0, 32, 32, 32, 32, 32, 32, 32, Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, Byte.MIN_VALUE, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, Byte.MIN_VALUE, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, -121, 1, 0, 1, 0, 1, 0, Byte.MIN_VALUE};

        /* renamed from: b  reason: collision with root package name */
        static final byte[] f12938b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 32, 32, 32, 32, 32, 32, 32, Byte.MIN_VALUE, Byte.MIN_VALUE, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, Byte.MIN_VALUE, Byte.MIN_VALUE, 32, 32, 32, 32, 32, 32, 32, 32, 32, 0, 32, 32, 32, 32, 32, 32, 32, Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, Byte.MIN_VALUE, 0, 1, 0, 1, 0, Byte.MIN_VALUE, 0, Byte.MIN_VALUE, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, Byte.MIN_VALUE, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, -121, 1, 0, 1, 0, 1, 0, Byte.MIN_VALUE};

        /* renamed from: c  reason: collision with root package name */
        static final byte[] f12939c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Byte.MIN_VALUE, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, 0, -32, -32, -32, -32, -32, -32, -32, 121, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, Byte.MIN_VALUE, 0, -1, 0, -1, 0, -1, 0, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, Byte.MIN_VALUE, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, 0, -1, 0, -1, Byte.MIN_VALUE};

        /* renamed from: d  reason: collision with root package name */
        static final byte[] f12940d = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -32, -32, -32, -32, -32, -32, -32, -32, Byte.MIN_VALUE, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Byte.MIN_VALUE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Byte.MIN_VALUE, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, 0, -32, -32, -32, -32, -32, -32, -32, 121, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, Byte.MIN_VALUE, 0, -1, 0, -1, 0, -1, 0, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, Byte.MIN_VALUE, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, 0, -1, 0, -1, Byte.MIN_VALUE};
    }

    static {
        try {
            f12932g = new p();
        } catch (IOException e4) {
            throw new ICUUncheckedIOException((Throwable) e4);
        }
    }

    private p() {
        A(d.o("ucase.icu"));
    }

    private final void A(ByteBuffer byteBuffer) {
        d.s(byteBuffer, 1665225541, new c());
        int i4 = byteBuffer.getInt();
        if (i4 >= 16) {
            int[] iArr = new int[i4];
            this.f12933a = iArr;
            iArr[0] = i4;
            for (int i5 = 1; i5 < i4; i5++) {
                this.f12933a[i5] = byteBuffer.getInt();
            }
            m n4 = m.n(byteBuffer);
            this.f12936d = n4;
            int i6 = this.f12933a[2];
            int o4 = n4.o();
            if (o4 <= i6) {
                d.u(byteBuffer, i6 - o4);
                int i7 = this.f12933a[3];
                if (i7 > 0) {
                    this.f12934b = d.p(byteBuffer, i7, 0);
                }
                int i8 = this.f12933a[4];
                if (i8 > 0) {
                    this.f12935c = d.i(byteBuffer, i8, 0);
                    return;
                }
                return;
            }
            throw new IOException("ucase.icu: not enough bytes for the trie");
        }
        throw new IOException("indexes[0] too small in ucase.icu");
    }

    private static final byte B(int i4, int i5) {
        return f12930e[i4 & ((1 << i5) - 1)];
    }

    private final int C(String str, int i4, int i5) {
        int length = str.length();
        int i6 = i5 - length;
        int i7 = 0;
        while (true) {
            int i8 = i7 + 1;
            char charAt = str.charAt(i7);
            char[] cArr = this.f12935c;
            int i9 = i4 + 1;
            char c4 = cArr[i4];
            if (c4 == 0) {
                return 1;
            }
            int i10 = charAt - c4;
            if (i10 != 0) {
                return i10;
            }
            length--;
            if (length > 0) {
                i7 = i8;
                i4 = i9;
            } else if (i6 == 0 || cArr[i9] == 0) {
                return 0;
            } else {
                return -i6;
            }
        }
    }

    private final int H(int i4, b bVar, Appendable appendable, int i5, boolean z3) {
        int i6;
        String str;
        String str2;
        int f4 = this.f12936d.f(i4);
        if (z(f4)) {
            int h4 = h(f4);
            int i7 = h4 + 1;
            char charAt = this.f12934b.charAt(h4);
            int i8 = 3;
            if ((charAt & 16384) != 0) {
                if (i5 == 2 && i4 == 105) {
                    return 304;
                }
                if (i5 == 3 && i4 == 775 && v(bVar)) {
                    return 0;
                }
                if (i4 == 1415) {
                    if (i5 == 6) {
                        if (z3) {
                            str2 = "ԵՎ";
                        } else {
                            str2 = "Եվ";
                        }
                        try {
                            appendable.append(str2);
                        } catch (IOException e4) {
                            throw new ICUUncheckedIOException((Throwable) e4);
                        }
                    } else {
                        if (z3) {
                            str = "ԵՒ";
                        } else {
                            str = "Եւ";
                        }
                        appendable.append(str);
                    }
                    return 2;
                }
            } else if (q(charAt, 7)) {
                long j4 = j(charAt, 7, i7);
                int i9 = (int) j4;
                int i10 = 65535 & i9;
                int i11 = ((int) (j4 >> 32)) + 1 + (i9 & 15) + ((i10 >> 4) & 15);
                int i12 = i10 >> 8;
                if (!z3) {
                    i11 += i12 & 15;
                    i12 = i10 >> 12;
                }
                int i13 = i12 & 15;
                if (i13 != 0) {
                    try {
                        appendable.append(this.f12934b, i11, i11 + i13);
                        return i13;
                    } catch (IOException e5) {
                        throw new ICUUncheckedIOException((Throwable) e5);
                    }
                }
            }
            if (!q(charAt, 4) || n(f4) != 1) {
                if (z3 || !q(charAt, 3)) {
                    if (!q(charAt, 2)) {
                        return ~i4;
                    }
                    i8 = 2;
                }
                i6 = i(charAt, i8, i7);
            } else {
                int i14 = i(charAt, 4, i7);
                if ((charAt & 1024) == 0) {
                    return i4 + i14;
                }
                return i4 - i14;
            }
        } else if (n(f4) == 1) {
            i6 = f(f4) + i4;
        } else {
            i6 = i4;
        }
        if (i6 == i4) {
            return ~i6;
        }
        return i6;
    }

    public static final int d(ULocale uLocale) {
        return e(uLocale.getLanguage());
    }

    private static final int e(String str) {
        if (str.length() == 2) {
            if (str.equals("en") || str.charAt(0) > 't') {
                return 1;
            }
            if (str.equals("tr") || str.equals("az")) {
                return 2;
            }
            if (str.equals("el")) {
                return 4;
            }
            if (str.equals("lt")) {
                return 3;
            }
            if (str.equals("nl")) {
                return 5;
            }
            if (str.equals("hy")) {
                return 6;
            }
        } else if (str.length() == 3) {
            if (str.equals("tur") || str.equals("aze")) {
                return 2;
            }
            if (str.equals("ell")) {
                return 4;
            }
            if (str.equals("lit")) {
                return 3;
            }
            if (str.equals("nld")) {
                return 5;
            }
            if (str.equals("hye")) {
                return 6;
            }
        }
        return 1;
    }

    static final int f(int i4) {
        return ((short) i4) >> 7;
    }

    private static final int h(int i4) {
        return i4 >> 4;
    }

    private final int i(int i4, int i5, int i6) {
        if ((i4 & 256) == 0) {
            return this.f12934b.charAt(i6 + B(i4, i5));
        }
        int B3 = i6 + (B(i4, i5) * 2);
        return (this.f12934b.charAt(B3) << 16) | this.f12934b.charAt(B3 + 1);
    }

    private final long j(int i4, int i5, int i6) {
        int i7;
        long j4;
        if ((i4 & 256) == 0) {
            i7 = i6 + B(i4, i5);
            j4 = (long) this.f12934b.charAt(i7);
        } else {
            int B3 = i6 + (B(i4, i5) * 2);
            int i8 = B3 + 1;
            i7 = i8;
            j4 = (((long) this.f12934b.charAt(B3)) << 16) | ((long) this.f12934b.charAt(i8));
        }
        return j4 | (((long) i7) << 32);
    }

    static m k() {
        return f12932g.f12936d;
    }

    private static final int m(int i4) {
        return i4 & 7;
    }

    static final int n(int i4) {
        return i4 & 3;
    }

    private static final boolean q(int i4, int i5) {
        return (i4 & (1 << i5)) != 0;
    }

    private final boolean s(b bVar, int i4) {
        if (bVar == null) {
            return false;
        }
        bVar.a(i4);
        while (true) {
            int next = bVar.next();
            if (next < 0) {
                break;
            }
            int o4 = o(next);
            if ((o4 & 4) == 0) {
                if (o4 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean t(b bVar) {
        int next;
        if (bVar == null) {
            return false;
        }
        bVar.a(1);
        do {
            next = bVar.next();
            if (next < 0) {
                break;
            } else if (next == 775) {
                return true;
            }
        } while (g(next) == 96);
        return false;
    }

    private final boolean u(b bVar) {
        int g4;
        if (bVar == null) {
            return false;
        }
        bVar.a(1);
        do {
            int next = bVar.next();
            if (next < 0) {
                break;
            }
            g4 = g(next);
            if (g4 == 64) {
                return true;
            }
        } while (g4 == 96);
        return false;
    }

    private final boolean v(b bVar) {
        int g4;
        if (bVar == null) {
            return false;
        }
        bVar.a(-1);
        do {
            int next = bVar.next();
            if (next < 0) {
                break;
            }
            g4 = g(next);
            if (g4 == 32) {
                return true;
            }
        } while (g4 == 96);
        return false;
    }

    private final boolean w(b bVar) {
        int next;
        if (bVar == null) {
            return false;
        }
        bVar.a(-1);
        do {
            next = bVar.next();
            if (next < 0) {
                break;
            } else if (next == 73) {
                return true;
            }
        } while (g(next) == 96);
        return false;
    }

    static final boolean y(int i4) {
        return (i4 & 2) != 0;
    }

    static final boolean z(int i4) {
        return (i4 & 8) != 0;
    }

    public final int D(int i4, Appendable appendable, int i5) {
        int i6;
        int f4 = this.f12936d.f(i4);
        if (z(f4)) {
            int h4 = h(f4);
            int i7 = h4 + 1;
            char charAt = this.f12934b.charAt(h4);
            int i8 = 1;
            if ((32768 & charAt) != 0) {
                if ((i5 & 7) == 0) {
                    if (i4 == 73) {
                        return 105;
                    }
                    if (i4 == 304) {
                        try {
                            appendable.append("i̇");
                            return 2;
                        } catch (IOException e4) {
                            throw new ICUUncheckedIOException((Throwable) e4);
                        }
                    }
                } else if (i4 == 73) {
                    return 305;
                } else {
                    if (i4 == 304) {
                        return 105;
                    }
                }
            } else if (q(charAt, 7)) {
                long j4 = j(charAt, 7, i7);
                int i9 = (int) j4;
                int i10 = ((int) (j4 >> 32)) + 1 + (i9 & 15);
                int i11 = ((65535 & i9) >> 4) & 15;
                if (i11 != 0) {
                    try {
                        appendable.append(this.f12934b, i10, i10 + i11);
                        return i11;
                    } catch (IOException e5) {
                        throw new ICUUncheckedIOException((Throwable) e5);
                    }
                }
            }
            if ((charAt & 512) != 0) {
                return ~i4;
            }
            if (!q(charAt, 4) || !y(f4)) {
                if (!q(charAt, 1)) {
                    i8 = 0;
                    if (!q(charAt, 0)) {
                        return ~i4;
                    }
                }
                i6 = i(charAt, i8, i7);
            } else {
                int i12 = i(charAt, 4, i7);
                if ((charAt & 1024) == 0) {
                    return i4 + i12;
                }
                return i4 - i12;
            }
        } else if (y(f4)) {
            i6 = f(f4) + i4;
        } else {
            i6 = i4;
        }
        if (i6 == i4) {
            return ~i6;
        }
        return i6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E(int r18, com.ibm.icu.impl.p.b r19, java.lang.Appendable r20, int r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            com.ibm.icu.impl.m r5 = r1.f12936d
            int r5 = r5.f(r0)
            boolean r6 = z(r5)
            if (r6 != 0) goto L_0x0023
            boolean r2 = y(r5)
            if (r2 == 0) goto L_0x0128
            int r2 = f(r5)
            int r2 = r2 + r0
            goto L_0x0129
        L_0x0023:
            int r6 = h(r5)
            java.lang.String r7 = r1.f12934b
            int r8 = r6 + 1
            char r6 = r7.charAt(r6)
            r7 = r6 & 16384(0x4000, float:2.2959E-41)
            r10 = 0
            if (r7 == 0) goto L_0x00de
            java.lang.String r7 = "i̇"
            r11 = 73
            r12 = 3
            if (r4 != r12) goto L_0x0058
            r14 = 296(0x128, float:4.15E-43)
            r15 = 205(0xcd, float:2.87E-43)
            r9 = 204(0xcc, float:2.86E-43)
            r12 = 302(0x12e, float:4.23E-43)
            r13 = 74
            if (r0 == r11) goto L_0x004b
            if (r0 == r13) goto L_0x004b
            if (r0 != r12) goto L_0x0051
        L_0x004b:
            boolean r16 = r1.u(r2)
            if (r16 != 0) goto L_0x005a
        L_0x0051:
            if (r0 == r9) goto L_0x005a
            if (r0 == r15) goto L_0x005a
            if (r0 != r14) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r9 = 2
            goto L_0x0097
        L_0x005a:
            if (r0 == r11) goto L_0x008c
            if (r0 == r13) goto L_0x0085
            if (r0 == r9) goto L_0x007e
            if (r0 == r15) goto L_0x0077
            if (r0 == r14) goto L_0x0070
            if (r0 == r12) goto L_0x0067
            return r10
        L_0x0067:
            java.lang.String r0 = "į̇"
            r3.append(r0)     // Catch:{ IOException -> 0x006e }
            r0 = 2
            return r0
        L_0x006e:
            r0 = move-exception
            goto L_0x0091
        L_0x0070:
            java.lang.String r0 = "i̇̃"
            r3.append(r0)     // Catch:{ IOException -> 0x006e }
            r0 = 3
            return r0
        L_0x0077:
            r0 = 3
            java.lang.String r2 = "i̇́"
            r3.append(r2)     // Catch:{ IOException -> 0x006e }
            return r0
        L_0x007e:
            r0 = 3
            java.lang.String r2 = "i̇̀"
            r3.append(r2)     // Catch:{ IOException -> 0x006e }
            return r0
        L_0x0085:
            java.lang.String r0 = "j̇"
            r3.append(r0)     // Catch:{ IOException -> 0x006e }
            r9 = 2
            return r9
        L_0x008c:
            r9 = 2
            r3.append(r7)     // Catch:{ IOException -> 0x006e }
            return r9
        L_0x0091:
            com.ibm.icu.util.ICUUncheckedIOException r2 = new com.ibm.icu.util.ICUUncheckedIOException
            r2.<init>((java.lang.Throwable) r0)
            throw r2
        L_0x0097:
            r12 = 304(0x130, float:4.26E-43)
            if (r4 != r9) goto L_0x00a0
            if (r0 != r12) goto L_0x00a0
            r0 = 105(0x69, float:1.47E-43)
            return r0
        L_0x00a0:
            if (r4 != r9) goto L_0x00ad
            r13 = 775(0x307, float:1.086E-42)
            if (r0 != r13) goto L_0x00ad
            boolean r13 = r1.w(r2)
            if (r13 == 0) goto L_0x00ad
            return r10
        L_0x00ad:
            if (r4 != r9) goto L_0x00ba
            if (r0 != r11) goto L_0x00ba
            boolean r4 = r1.t(r2)
            if (r4 != 0) goto L_0x00ba
            r0 = 305(0x131, float:4.27E-43)
            return r0
        L_0x00ba:
            if (r0 != r12) goto L_0x00c9
            r3.append(r7)     // Catch:{ IOException -> 0x00c1 }
            r0 = 2
            return r0
        L_0x00c1:
            r0 = move-exception
            r2 = r0
            com.ibm.icu.util.ICUUncheckedIOException r0 = new com.ibm.icu.util.ICUUncheckedIOException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x00c9:
            r3 = 931(0x3a3, float:1.305E-42)
            if (r0 != r3) goto L_0x0104
            r3 = 1
            boolean r3 = r1.s(r2, r3)
            if (r3 != 0) goto L_0x0104
            r3 = -1
            boolean r2 = r1.s(r2, r3)
            if (r2 == 0) goto L_0x0104
            r0 = 962(0x3c2, float:1.348E-42)
            return r0
        L_0x00de:
            r2 = 7
            boolean r4 = q(r6, r2)
            if (r4 == 0) goto L_0x0104
            long r11 = r1.j(r6, r2, r8)
            int r2 = (int) r11
            r2 = r2 & 15
            if (r2 == 0) goto L_0x0104
            r0 = 32
            long r4 = r11 >> r0
            int r0 = (int) r4
            r4 = 1
            int r0 = r0 + r4
            java.lang.String r4 = r1.f12934b     // Catch:{ IOException -> 0x00fd }
            int r5 = r0 + r2
            r3.append(r4, r0, r5)     // Catch:{ IOException -> 0x00fd }
            return r2
        L_0x00fd:
            r0 = move-exception
            com.ibm.icu.util.ICUUncheckedIOException r2 = new com.ibm.icu.util.ICUUncheckedIOException
            r2.<init>((java.lang.Throwable) r0)
            throw r2
        L_0x0104:
            r2 = 4
            boolean r3 = q(r6, r2)
            if (r3 == 0) goto L_0x011d
            boolean r3 = y(r5)
            if (r3 == 0) goto L_0x011d
            int r2 = r1.i(r6, r2, r8)
            r3 = r6 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L_0x011b
            int r0 = r0 + r2
            goto L_0x011c
        L_0x011b:
            int r0 = r0 - r2
        L_0x011c:
            return r0
        L_0x011d:
            boolean r2 = q(r6, r10)
            if (r2 == 0) goto L_0x0128
            int r2 = r1.i(r6, r10, r8)
            goto L_0x0129
        L_0x0128:
            r2 = r0
        L_0x0129:
            if (r2 != r0) goto L_0x012c
            int r2 = ~r2
        L_0x012c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.p.E(int, com.ibm.icu.impl.p$b, java.lang.Appendable, int):int");
    }

    public final int F(int i4, b bVar, Appendable appendable, int i5) {
        return H(i4, bVar, appendable, i5, false);
    }

    public final int G(int i4, b bVar, Appendable appendable, int i5) {
        return H(i4, bVar, appendable, i5, true);
    }

    public final void a(int i4, UnicodeSet unicodeSet) {
        int i5;
        int i6;
        int f4;
        if (i4 == 73) {
            unicodeSet.l(105);
        } else if (i4 == 105) {
            unicodeSet.l(73);
        } else if (i4 == 304) {
            unicodeSet.o("i̇");
        } else if (i4 != 305) {
            int f5 = this.f12936d.f(i4);
            if (z(f5)) {
                int h4 = h(f5);
                int i7 = h4 + 1;
                char charAt = this.f12934b.charAt(h4);
                int i8 = 0;
                for (int i9 = 0; i9 <= 3; i9++) {
                    if (q(charAt, i9)) {
                        i4 = i(charAt, i9, i7);
                        unicodeSet.l(i4);
                    }
                }
                if (q(charAt, 4)) {
                    int i10 = i(charAt, 4, i7);
                    if ((charAt & 1024) == 0) {
                        i6 = i4 + i10;
                    } else {
                        i6 = i4 - i10;
                    }
                    unicodeSet.l(i6);
                }
                if (q(charAt, 6)) {
                    long j4 = j(charAt, 6, i7);
                    i8 = ((int) (j4 >> 32)) + 1;
                    i5 = ((int) j4) & 15;
                } else {
                    i5 = 0;
                }
                if (q(charAt, 7)) {
                    long j5 = j(charAt, 7, i7);
                    int i11 = (int) j5;
                    int i12 = 65535 & i11;
                    int i13 = ((int) (j5 >> 32)) + 1 + (i11 & 15);
                    int i14 = (i12 >> 4) & 15;
                    if (i14 != 0) {
                        int i15 = i14 + i13;
                        unicodeSet.o(this.f12934b.substring(i13, i15));
                        i13 = i15;
                    }
                    i8 = (i12 >> 12) + i13 + ((i12 >> 8) & 15);
                }
                int i16 = i5 + i8;
                while (i8 < i16) {
                    int codePointAt = this.f12934b.codePointAt(i8);
                    unicodeSet.l(codePointAt);
                    i8 += j.d(codePointAt);
                }
            } else if (n(f5) != 0 && (f4 = f(f5)) != 0) {
                unicodeSet.l(i4 + f4);
            }
        }
    }

    public final void b(UnicodeSet unicodeSet) {
        Iterator it = this.f12936d.iterator();
        while (it.hasNext()) {
            Trie2.c cVar = (Trie2.c) it.next();
            if (!cVar.f12586d) {
                unicodeSet.l(cVar.f12583a);
            } else {
                return;
            }
        }
    }

    public final boolean c(String str, UnicodeSet unicodeSet) {
        int length;
        char c4;
        if (this.f12935c == null || str == null || (length = str.length()) <= 1) {
            return false;
        }
        char[] cArr = this.f12935c;
        char c5 = cArr[0];
        char c6 = cArr[1];
        char c7 = cArr[2];
        if (length > c7) {
            return false;
        }
        char c8 = 0;
        char c9 = c5;
        while (c8 < c9) {
            int i4 = (c8 + c9) / 2;
            int i5 = i4 + 1;
            int i6 = i5 * c6;
            int C3 = C(str, i6, c7);
            if (C3 == 0) {
                int i7 = c7;
                while (i7 < c6) {
                    char[] cArr2 = this.f12935c;
                    if (cArr2[i6 + i7] == 0) {
                        break;
                    }
                    int c10 = j.c(cArr2, i6, cArr2.length, i7);
                    unicodeSet.l(c10);
                    a(c10, unicodeSet);
                    i7 += j.d(c10);
                }
                return true;
            }
            if (C3 < 0) {
                c4 = i4;
            } else {
                c8 = i5;
                c4 = c9;
            }
            c9 = c4;
        }
        return false;
    }

    public final int g(int i4) {
        int f4 = this.f12936d.f(i4);
        if (!z(f4)) {
            return f4 & 96;
        }
        return (this.f12934b.charAt(h(f4)) >> 7) & 96;
    }

    public final int l(int i4) {
        return n(this.f12936d.f(i4));
    }

    public final int o(int i4) {
        return m(this.f12936d.f(i4));
    }

    public final boolean p(int i4, int i5) {
        if (i5 != 22) {
            if (i5 == 27) {
                return x(i4);
            }
            if (i5 != 30) {
                if (i5 == 34) {
                    return r(i4);
                }
                if (i5 != 55) {
                    switch (i5) {
                        case 49:
                            if (l(i4) != 0) {
                                return true;
                            }
                            return false;
                        case 50:
                            if ((o(i4) >> 2) != 0) {
                                return true;
                            }
                            return false;
                        case 51:
                            StringBuilder sb = f12931f;
                            sb.setLength(0);
                            if (E(i4, (b) null, sb, 1) >= 0) {
                                return true;
                            }
                            return false;
                        case 52:
                            StringBuilder sb2 = f12931f;
                            sb2.setLength(0);
                            if (G(i4, (b) null, sb2, 1) >= 0) {
                                return true;
                            }
                            return false;
                        case 53:
                            StringBuilder sb3 = f12931f;
                            sb3.setLength(0);
                            if (F(i4, (b) null, sb3, 1) >= 0) {
                                return true;
                            }
                            return false;
                        default:
                            return false;
                    }
                } else {
                    StringBuilder sb4 = f12931f;
                    sb4.setLength(0);
                    if (E(i4, (b) null, sb4, 1) >= 0 || G(i4, (b) null, sb4, 1) >= 0 || F(i4, (b) null, sb4, 1) >= 0) {
                        return true;
                    }
                    return false;
                }
            } else if (2 == l(i4)) {
                return true;
            } else {
                return false;
            }
        } else if (1 == l(i4)) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean r(int i4) {
        int f4 = this.f12936d.f(i4);
        if (!z(f4)) {
            if ((f4 & 16) != 0) {
                return true;
            }
            return false;
        } else if ((this.f12934b.charAt(h(f4)) & 2048) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean x(int i4) {
        if (g(i4) == 32) {
            return true;
        }
        return false;
    }
}
