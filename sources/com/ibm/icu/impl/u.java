package com.ibm.icu.impl;

import com.ibm.icu.impl.d;
import com.ibm.icu.util.BytesTrie;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.MissingResourceException;

public final class u {

    /* renamed from: d  reason: collision with root package name */
    private static final b f13042d = new b();

    /* renamed from: e  reason: collision with root package name */
    public static final u f13043e;

    /* renamed from: a  reason: collision with root package name */
    private int[] f13044a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f13045b;

    /* renamed from: c  reason: collision with root package name */
    private String f13046c;

    private static final class b implements d.b {
        private b() {
        }

        public boolean a(byte[] bArr) {
            if (bArr[0] == 2) {
                return true;
            }
            return false;
        }
    }

    static {
        try {
            f13043e = new u();
        } catch (IOException e4) {
            MissingResourceException missingResourceException = new MissingResourceException("Could not construct UPropertyAliases. Missing pnames.icu", "", "");
            missingResourceException.initCause(e4);
            throw missingResourceException;
        }
    }

    private u() {
        l(d.o("pnames.icu"));
    }

    private static int a(int i4) {
        return (65 > i4 || i4 > 90) ? i4 : i4 + 32;
    }

    public static int b(String str, String str2) {
        boolean z3;
        int i4 = 0;
        int i5 = 0;
        char c4 = 0;
        char c5 = 0;
        while (true) {
            if (i4 < str.length()) {
                c4 = str.charAt(i4);
                if (!(c4 == ' ' || c4 == '-' || c4 == '_')) {
                    switch (c4) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                    }
                }
                i4++;
            }
            while (i5 < str2.length()) {
                c5 = str2.charAt(i5);
                if (!(c5 == ' ' || c5 == '-' || c5 == '_')) {
                    switch (c5) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                    }
                }
                i5++;
            }
            boolean z4 = true;
            if (i4 == str.length()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i5 != str2.length()) {
                z4 = false;
            }
            if (z3) {
                if (z4) {
                    return 0;
                }
                c4 = 0;
            } else if (z4) {
                c5 = 0;
            }
            int a4 = a(c4) - a(c5);
            if (a4 != 0) {
                return a4;
            }
            i4++;
            i5++;
        }
    }

    private boolean c(BytesTrie bytesTrie, CharSequence charSequence) {
        BytesTrie.Result result = BytesTrie.Result.NO_VALUE;
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char charAt = charSequence.charAt(i4);
            if (!(charAt == '-' || charAt == '_' || charAt == ' ' || (9 <= charAt && charAt <= 13))) {
                if (!result.hasNext()) {
                    return false;
                }
                result = bytesTrie.p(a(charAt));
            }
        }
        return result.hasValue();
    }

    private int d(int i4) {
        int i5 = this.f13044a[0];
        int i6 = 1;
        while (i5 > 0) {
            int[] iArr = this.f13044a;
            int i7 = iArr[i6];
            int i8 = iArr[i6 + 1];
            int i9 = i6 + 2;
            if (i4 < i7) {
                break;
            } else if (i4 < i8) {
                return i9 + ((i4 - i7) * 2);
            } else {
                i6 = i9 + ((i8 - i7) * 2);
                i5--;
            }
        }
        return 0;
    }

    private int e(int i4, int i5) {
        if (i4 == 0) {
            return 0;
        }
        int i6 = i4 + 1;
        int i7 = i4 + 2;
        int i8 = this.f13044a[i6];
        if (i8 >= 16) {
            int i9 = (i8 + i7) - 16;
            int i10 = i7;
            do {
                int[] iArr = this.f13044a;
                int i11 = iArr[i10];
                if (i5 < i11) {
                    break;
                } else if (i5 == i11) {
                    return iArr[(i9 + i10) - i7];
                } else {
                    i10++;
                }
            } while (i10 < i9);
        } else {
            while (i8 > 0) {
                int[] iArr2 = this.f13044a;
                int i12 = iArr2[i7];
                int i13 = iArr2[i7 + 1];
                int i14 = i7 + 2;
                if (i5 < i12) {
                    break;
                } else if (i5 < i13) {
                    return iArr2[(i14 + i5) - i12];
                } else {
                    i7 = i14 + (i13 - i12);
                    i8--;
                }
            }
        }
        return 0;
    }

    private String f(int i4, int i5) {
        int i6;
        int i7 = i4 + 1;
        char charAt = this.f13046c.charAt(i4);
        if (i5 < 0 || charAt <= i5) {
            throw new IllegalIcuArgumentException("Invalid property (value) name choice");
        }
        while (i5 > 0) {
            while (true) {
                i6 = i7 + 1;
                if (this.f13046c.charAt(i7) == 0) {
                    break;
                }
                i7 = i6;
            }
            i5--;
            i7 = i6;
        }
        int i8 = i7;
        while (this.f13046c.charAt(i8) != 0) {
            i8++;
        }
        if (i7 == i8) {
            return null;
        }
        return this.f13046c.substring(i7, i8);
    }

    private int h(int i4, CharSequence charSequence) {
        BytesTrie bytesTrie = new BytesTrie(this.f13045b, i4);
        if (c(bytesTrie, charSequence)) {
            return bytesTrie.l();
        }
        return -1;
    }

    private void l(ByteBuffer byteBuffer) {
        d.s(byteBuffer, 1886282093, f13042d);
        int i4 = byteBuffer.getInt() / 4;
        if (i4 >= 8) {
            int[] iArr = new int[i4];
            iArr[0] = i4 * 4;
            for (int i5 = 1; i5 < i4; i5++) {
                iArr[i5] = byteBuffer.getInt();
            }
            int i6 = iArr[0];
            int i7 = iArr[1];
            this.f13044a = d.n(byteBuffer, (i7 - i6) / 4, 0);
            int i8 = iArr[2];
            byte[] bArr = new byte[(i8 - i7)];
            this.f13045b = bArr;
            byteBuffer.get(bArr);
            int i9 = iArr[3] - i8;
            StringBuilder sb = new StringBuilder(i9);
            for (int i10 = 0; i10 < i9; i10++) {
                sb.append((char) byteBuffer.get());
            }
            this.f13046c = sb.toString();
            return;
        }
        throw new IOException("pnames.icu: not enough indexes");
    }

    public int g(CharSequence charSequence) {
        return h(0, charSequence);
    }

    public int i(int i4, CharSequence charSequence) {
        int d4 = d(i4);
        if (d4 != 0) {
            int[] iArr = this.f13044a;
            int i5 = iArr[d4 + 1];
            if (i5 != 0) {
                return h(iArr[i5], charSequence);
            }
            throw new IllegalArgumentException("Property " + i4 + " (0x" + Integer.toHexString(i4) + ") does not have named values");
        }
        throw new IllegalArgumentException("Invalid property enum " + i4 + " (0x" + Integer.toHexString(i4) + ")");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r1 = r2.f13044a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int j(int r3, java.lang.CharSequence r4) {
        /*
            r2 = this;
            int r3 = r2.d(r3)
            r0 = -1
            if (r3 != 0) goto L_0x0008
            return r0
        L_0x0008:
            int[] r1 = r2.f13044a
            int r3 = r3 + 1
            r3 = r1[r3]
            if (r3 != 0) goto L_0x0011
            return r0
        L_0x0011:
            r3 = r1[r3]
            int r3 = r2.h(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.u.j(int, java.lang.CharSequence):int");
    }

    public String k(int i4, int i5, int i6) {
        int d4 = d(i4);
        if (d4 != 0) {
            int e4 = e(this.f13044a[d4 + 1], i5);
            if (e4 != 0) {
                return f(e4, i6);
            }
            throw new IllegalArgumentException("Property " + i4 + " (0x" + Integer.toHexString(i4) + ") does not have named values");
        }
        throw new IllegalArgumentException("Invalid property enum " + i4 + " (0x" + Integer.toHexString(i4) + ")");
    }
}
