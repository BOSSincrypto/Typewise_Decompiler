package com.ibm.icu.impl;

import a2.C0359a;
import a2.C0361c;
import com.ibm.icu.impl.p;
import com.ibm.icu.util.ICUUncheckedIOException;
import com.ibm.icu.util.ULocale;
import java.io.IOException;
import java.text.CharacterIterator;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final m f12601a = p.k();

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private static final char[] f12602a = {880, 880, 882, 882, 0, 0, 886, 886, 0, 0, 890, 1021, 1022, 1023, 0, 895, 0, 0, 0, 0, 0, 0, 21393, 0, 21397, 21399, 21401, 0, 21407, 0, 21413, 21417, 54169, 5009, 914, 915, 916, 5013, 918, 5015, 920, 5017, 922, 923, 924, 925, 926, 5023, 928, 929, 0, 931, 932, 5029, 934, 935, 936, 5033, 37785, 37797, 21393, 21397, 21399, 21401, 54181, 5009, 914, 915, 916, 5013, 918, 5015, 920, 5017, 922, 923, 924, 925, 926, 5023, 928, 929, 931, 931, 932, 5029, 934, 935, 936, 5033, 37785, 37797, 21407, 21413, 21417, 975, 914, 920, 978, 17362, 33746, 934, 928, 975, 984, 984, 986, 986, 988, 988, 990, 990, 992, 992, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 922, 929, 1017, 895, 1012, 5013, 0, 1015, 1015, 1017, 1018, 1018, 1020, 1021, 1022, 1023};

        /* renamed from: b  reason: collision with root package name */
        private static final char[] f12603b = {5009, 5009, 21393, 21393, 21393, 21393, 21393, 21393, 5009, 5009, 21393, 21393, 21393, 21393, 21393, 21393, 5013, 5013, 21397, 21397, 21397, 21397, 0, 0, 5013, 5013, 21397, 21397, 21397, 21397, 0, 0, 5015, 5015, 21399, 21399, 21399, 21399, 21399, 21399, 5015, 5015, 21399, 21399, 21399, 21399, 21399, 21399, 5017, 5017, 21401, 21401, 21401, 21401, 21401, 21401, 5017, 5017, 21401, 21401, 21401, 21401, 21401, 21401, 5023, 5023, 21407, 21407, 21407, 21407, 0, 0, 5023, 5023, 21407, 21407, 21407, 21407, 0, 0, 5029, 5029, 21413, 21413, 21413, 21413, 21413, 21413, 0, 5029, 0, 21413, 0, 21413, 0, 21413, 5033, 5033, 21417, 21417, 21417, 21417, 21417, 21417, 5033, 5033, 21417, 21417, 21417, 21417, 21417, 21417, 21393, 21393, 21397, 21397, 21399, 21399, 21401, 21401, 21407, 21407, 21413, 21413, 21417, 21417, 0, 0, 13201, 13201, 29585, 29585, 29585, 29585, 29585, 29585, 13201, 13201, 29585, 29585, 29585, 29585, 29585, 29585, 13207, 13207, 29591, 29591, 29591, 29591, 29591, 29591, 13207, 13207, 29591, 29591, 29591, 29591, 29591, 29591, 13225, 13225, 29609, 29609, 29609, 29609, 29609, 29609, 13225, 13225, 29609, 29609, 29609, 29609, 29609, 29609, 5009, 5009, 29585, 13201, 29585, 0, 21393, 29585, 5009, 5009, 21393, 21393, 13201, 0, 5017, 0, 0, 0, 29591, 13207, 29591, 0, 21399, 29591, 21397, 21397, 21399, 21399, 13207, 0, 0, 0, 5017, 5017, 54169, 54169, 0, 0, 21401, 54169, 5017, 5017, 21401, 21401, 0, 0, 0, 0, 5029, 5029, 54181, 54181, 929, 929, 21413, 54181, 5029, 5029, 21413, 21413, 929, 0, 0, 0, 0, 0, 29609, 13225, 29609, 0, 21417, 29609, 21407, 21407, 21417, 21417, 13225, 0, 0, 0};

        private static final int b(int i4) {
            if (i4 == 774) {
                return 131072;
            }
            if (i4 == 776) {
                return 65536;
            }
            if (i4 == 785) {
                return 16384;
            }
            if (i4 == 787 || i4 == 788) {
                return 131072;
            }
            switch (i4) {
                case 768:
                case 769:
                case 770:
                case 771:
                    return 16384;
                case 772:
                    return 131072;
                default:
                    switch (i4) {
                        case 834:
                            return 16384;
                        case 835:
                            return 131072;
                        case 836:
                            return 81920;
                        case 837:
                            return 8192;
                        default:
                            return 0;
                    }
            }
        }

        private static final int c(int i4) {
            if (i4 >= 880 && 8486 >= i4 && (1023 >= i4 || i4 >= 7936)) {
                if (i4 <= 1023) {
                    return f12602a[i4 - 880];
                }
                if (i4 <= 8191) {
                    return f12603b[i4 - 7936];
                }
                if (i4 == 8486) {
                    return 5033;
                }
            }
            return 0;
        }

        private static boolean d(CharSequence charSequence, int i4) {
            while (true) {
                if (i4 >= charSequence.length()) {
                    break;
                }
                int codePointAt = Character.codePointAt(charSequence, i4);
                int o4 = p.f12932g.o(codePointAt);
                if ((o4 & 4) != 0) {
                    i4 += Character.charCount(codePointAt);
                } else if (o4 != 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x011e A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x00d3  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x00ea  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x00f5  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0102  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.Appendable e(int r17, java.lang.CharSequence r18, java.lang.Appendable r19, a2.C0361c r20) {
            /*
                r0 = r17
                r1 = r18
                r2 = r19
                r3 = r20
                r5 = 0
                r6 = 0
            L_0x000a:
                int r7 = r18.length()
                if (r5 >= r7) goto L_0x012e
                int r7 = java.lang.Character.codePointAt(r1, r5)
                int r8 = java.lang.Character.charCount(r7)
                int r8 = r8 + r5
                com.ibm.icu.impl.p r9 = com.ibm.icu.impl.p.f12932g
                int r10 = r9.o(r7)
                r11 = r10 & 4
                if (r11 == 0) goto L_0x0026
                r10 = r6 & 1
                goto L_0x002b
            L_0x0026:
                if (r10 == 0) goto L_0x002a
                r10 = 1
                goto L_0x002b
            L_0x002a:
                r10 = 0
            L_0x002b:
                int r11 = c(r7)
                if (r11 <= 0) goto L_0x0122
                r7 = r11 & 1023(0x3ff, float:1.434E-42)
                r9 = r11 & 4096(0x1000, float:5.74E-42)
                r13 = 32768(0x8000, float:4.5918E-41)
                r14 = 933(0x3a5, float:1.307E-42)
                r15 = 921(0x399, float:1.29E-42)
                if (r9 == 0) goto L_0x0047
                r9 = r6 & 2
                if (r9 == 0) goto L_0x0047
                if (r7 == r15) goto L_0x0046
                if (r7 != r14) goto L_0x0047
            L_0x0046:
                r11 = r11 | r13
            L_0x0047:
                r9 = r11 & 8192(0x2000, float:1.14794E-41)
                if (r9 == 0) goto L_0x004d
                r9 = 1
                goto L_0x004e
            L_0x004d:
                r9 = 0
            L_0x004e:
                int r4 = r18.length()
                if (r8 >= r4) goto L_0x0068
                char r4 = r1.charAt(r8)
                int r4 = b(r4)
                if (r4 == 0) goto L_0x0068
                r11 = r11 | r4
                r4 = r4 & 8192(0x2000, float:1.14794E-41)
                if (r4 == 0) goto L_0x0065
                int r9 = r9 + 1
            L_0x0065:
                int r8 = r8 + 1
                goto L_0x004e
            L_0x0068:
                r4 = 53248(0xd000, float:7.4616E-41)
                r4 = r4 & r11
                r12 = 20480(0x5000, float:2.8699E-41)
                if (r4 != r12) goto L_0x0072
                r10 = r10 | 2
            L_0x0072:
                r4 = 919(0x397, float:1.288E-42)
                if (r7 != r4) goto L_0x008e
                r4 = r11 & 16384(0x4000, float:2.2959E-41)
                if (r4 == 0) goto L_0x008e
                if (r9 != 0) goto L_0x008e
                r4 = r6 & 1
                if (r4 != 0) goto L_0x008e
                boolean r4 = d(r1, r8)
                if (r4 != 0) goto L_0x008e
                if (r5 != r8) goto L_0x008c
                r7 = 905(0x389, float:1.268E-42)
            L_0x008a:
                r4 = 0
                goto L_0x00a1
            L_0x008c:
                r4 = 1
                goto L_0x00a1
            L_0x008e:
                r4 = r11 & r13
                if (r4 == 0) goto L_0x008a
                r4 = -98305(0xfffffffffffe7fff, float:NaN)
                if (r7 != r15) goto L_0x009b
                r11 = r11 & r4
                r7 = 938(0x3aa, float:1.314E-42)
                goto L_0x008a
            L_0x009b:
                if (r7 != r14) goto L_0x008a
                r11 = r11 & r4
                r7 = 939(0x3ab, float:1.316E-42)
                goto L_0x008a
            L_0x00a1:
                r6 = 769(0x301, float:1.078E-42)
                r12 = 776(0x308, float:1.087E-42)
                r13 = 98304(0x18000, float:1.37753E-40)
                if (r3 != 0) goto L_0x00b0
                r14 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r14 != 0) goto L_0x00b0
            L_0x00ae:
                r12 = 1
                goto L_0x0100
            L_0x00b0:
                char r14 = r1.charAt(r5)
                if (r14 != r7) goto L_0x00bb
                if (r9 <= 0) goto L_0x00b9
                goto L_0x00bb
            L_0x00b9:
                r14 = 0
                goto L_0x00bc
            L_0x00bb:
                r14 = 1
            L_0x00bc:
                int r15 = r5 + 1
                r16 = r11 & r13
                if (r16 == 0) goto L_0x00d1
                if (r15 >= r8) goto L_0x00cd
                char r15 = r1.charAt(r15)
                if (r15 == r12) goto L_0x00cb
                goto L_0x00cd
            L_0x00cb:
                r15 = 0
                goto L_0x00ce
            L_0x00cd:
                r15 = 1
            L_0x00ce:
                r14 = r14 | r15
                int r15 = r5 + 2
            L_0x00d1:
                if (r4 == 0) goto L_0x00e2
                if (r15 >= r8) goto L_0x00de
                char r12 = r1.charAt(r15)
                if (r12 == r6) goto L_0x00dc
                goto L_0x00de
            L_0x00dc:
                r12 = 0
                goto L_0x00df
            L_0x00de:
                r12 = 1
            L_0x00df:
                r14 = r14 | r12
                int r15 = r15 + 1
            L_0x00e2:
                int r12 = r8 - r5
                int r15 = r15 - r5
                int r15 = r15 + r9
                if (r12 == r15) goto L_0x00ea
                r5 = 1
                goto L_0x00eb
            L_0x00ea:
                r5 = 0
            L_0x00eb:
                r5 = r5 | r14
                if (r5 == 0) goto L_0x00f5
                if (r3 == 0) goto L_0x00f3
                r3.a(r12, r15)
            L_0x00f3:
                r12 = r5
                goto L_0x0100
            L_0x00f5:
                if (r3 == 0) goto L_0x00fa
                r3.b(r12)
            L_0x00fa:
                r5 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r5 != 0) goto L_0x00ff
                goto L_0x00ae
            L_0x00ff:
                r12 = 0
            L_0x0100:
                if (r12 == 0) goto L_0x011e
                char r5 = (char) r7
                r2.append(r5)
                r5 = r11 & r13
                if (r5 == 0) goto L_0x010f
                r5 = 776(0x308, float:1.087E-42)
                r2.append(r5)
            L_0x010f:
                if (r4 == 0) goto L_0x0114
                r2.append(r6)
            L_0x0114:
                if (r9 <= 0) goto L_0x011e
                r4 = 921(0x399, float:1.29E-42)
                r2.append(r4)
                int r9 = r9 + -1
                goto L_0x0114
            L_0x011e:
                r5 = r8
                r6 = r10
                goto L_0x000a
            L_0x0122:
                r4 = 0
                r6 = 4
                int r4 = r9.G(r7, r4, r2, r6)
                int r5 = r8 - r5
                com.ibm.icu.impl.a.c(r4, r2, r5, r0, r3)
                goto L_0x011e
            L_0x012e:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.a.b.e(int, java.lang.CharSequence, java.lang.Appendable, a2.c):java.lang.Appendable");
        }
    }

    private static final class d extends C0359a {

        /* renamed from: f  reason: collision with root package name */
        private int f12610f;

        private d() {
        }

        private static void v() {
            throw new UnsupportedOperationException("should not occur");
        }

        public int b() {
            return 0;
        }

        public int c(int i4) {
            v();
            return 0;
        }

        public CharacterIterator l() {
            v();
            return null;
        }

        public int o() {
            return this.f12610f;
        }

        public int p(int i4) {
            v();
            return 0;
        }

        public int r() {
            v();
            return 0;
        }

        public void t(String str) {
            this.f12610f = str.length();
        }

        public void u(CharacterIterator characterIterator) {
            this.f12610f = characterIterator.getEndIndex();
        }
    }

    private static int b(Appendable appendable, int i4) {
        if (i4 <= 65535) {
            appendable.append((char) i4);
            return 1;
        }
        appendable.append((char) ((i4 >> 10) + 55232));
        appendable.append((char) ((i4 & 1023) + 56320));
        return 2;
    }

    /* access modifiers changed from: private */
    public static void c(int i4, Appendable appendable, int i5, int i6, C0361c cVar) {
        if (i4 < 0) {
            if (cVar != null) {
                cVar.b(i5);
            }
            if ((i6 & 16384) == 0) {
                b(appendable, ~i4);
            }
        } else if (i4 > 31) {
            int b4 = b(appendable, i4);
            if (cVar != null) {
                cVar.a(i5, b4);
            }
        } else if (cVar != null) {
            cVar.a(i5, i4);
        }
    }

    private static final void d(CharSequence charSequence, int i4, int i5, Appendable appendable, int i6, C0361c cVar) {
        if (i5 > 0) {
            if (cVar != null) {
                cVar.b(i5);
            }
            if ((i6 & 16384) == 0) {
                appendable.append(charSequence, i4, i5 + i4);
            }
        }
    }

    private static String e(CharSequence charSequence, StringBuilder sb, C0361c cVar) {
        if (!cVar.f()) {
            return charSequence.toString();
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() + cVar.h());
        C0361c.b d4 = cVar.d();
        while (d4.c()) {
            if (d4.a()) {
                int h4 = d4.h();
                sb2.append(sb, h4, d4.b() + h4);
            } else {
                int i4 = d4.i();
                sb2.append(charSequence, i4, d4.f() + i4);
            }
        }
        return sb2.toString();
    }

    public static Appendable f(int i4, CharSequence charSequence, Appendable appendable, C0361c cVar) {
        if (cVar != null) {
            try {
                cVar.i();
            } catch (IOException e4) {
                throw new ICUUncheckedIOException((Throwable) e4);
            }
        }
        i(-1, i4, charSequence, 0, charSequence.length(), (c) null, appendable, cVar);
        return appendable;
    }

    public static String g(int i4, CharSequence charSequence) {
        if (charSequence.length() > 100 || (i4 & 16384) != 0) {
            return ((StringBuilder) f(i4, charSequence, new StringBuilder(charSequence.length()), (C0361c) null)).toString();
        }
        if (charSequence.length() == 0) {
            return charSequence.toString();
        }
        C0361c cVar = new C0361c();
        return e(charSequence, (StringBuilder) f(i4 | 16384, charSequence, new StringBuilder(), cVar), cVar);
    }

    public static C0359a h(ULocale uLocale, int i4, C0359a aVar) {
        int i5 = i4 & 224;
        if (i5 != 0 && aVar != null) {
            throw new IllegalArgumentException("titlecasing iterator option together with an explicit iterator");
        } else if (aVar != null) {
            return aVar;
        } else {
            if (i5 == 0) {
                return C0359a.n(uLocale);
            }
            if (i5 == 32) {
                return new d();
            }
            if (i5 == 64) {
                return C0359a.j(uLocale);
            }
            throw new IllegalArgumentException("unknown titlecasing iterator option");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void i(int r16, int r17, java.lang.CharSequence r18, int r19, int r20, com.ibm.icu.impl.a.c r21, java.lang.Appendable r22, a2.C0361c r23) {
        /*
            r0 = r16
            r7 = r17
            r8 = r18
            r9 = r20
            r10 = r22
            r11 = r23
            r12 = 1
            if (r0 == r12) goto L_0x0021
            if (r0 < 0) goto L_0x0018
            r1 = 2
            if (r0 == r1) goto L_0x001d
            r1 = 3
            if (r0 == r1) goto L_0x001d
            goto L_0x0021
        L_0x0018:
            r1 = r7 & 7
            if (r1 != 0) goto L_0x001d
            goto L_0x0021
        L_0x001d:
            byte[] r1 = com.ibm.icu.impl.p.d.f12938b
        L_0x001f:
            r13 = r1
            goto L_0x0024
        L_0x0021:
            byte[] r1 = com.ibm.icu.impl.p.d.f12937a
            goto L_0x001f
        L_0x0024:
            r2 = r19
            r14 = r2
            r15 = r21
        L_0x0029:
            if (r14 < r9) goto L_0x003b
            int r3 = r14 - r2
            r0 = r18
            r1 = r2
            r2 = r3
            r3 = r22
            r4 = r17
            r5 = r23
            d(r0, r1, r2, r3, r4, r5)
            return
        L_0x003b:
            char r1 = r8.charAt(r14)
            r3 = 383(0x17f, float:5.37E-43)
            if (r1 >= r3) goto L_0x004f
            byte r3 = r13[r1]
            r4 = -128(0xffffffffffffff80, float:NaN)
            if (r3 != r4) goto L_0x004a
            goto L_0x0061
        L_0x004a:
            int r14 = r14 + 1
            if (r3 != 0) goto L_0x00c6
            goto L_0x0029
        L_0x004f:
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r3) goto L_0x0055
            goto L_0x0061
        L_0x0055:
            com.ibm.icu.impl.m r3 = f12601a
            int r3 = r3.g(r1)
            boolean r4 = com.ibm.icu.impl.p.z(r3)
            if (r4 == 0) goto L_0x00b6
        L_0x0061:
            int r3 = r14 + 1
            boolean r4 = java.lang.Character.isHighSurrogate(r1)
            if (r4 == 0) goto L_0x007b
            if (r3 >= r9) goto L_0x007b
            char r4 = r8.charAt(r3)
            boolean r5 = java.lang.Character.isLowSurrogate(r4)
            if (r5 == 0) goto L_0x007b
            int r1 = java.lang.Character.toCodePoint(r1, r4)
            int r3 = r14 + 2
        L_0x007b:
            r5 = r1
            r6 = r3
            int r3 = r14 - r2
            r1 = r18
            r4 = r22
            r12 = r5
            r5 = r17
            r9 = r6
            r6 = r23
            d(r1, r2, r3, r4, r5, r6)
            if (r0 < 0) goto L_0x00a0
            if (r15 != 0) goto L_0x0096
            com.ibm.icu.impl.a$c r15 = new com.ibm.icu.impl.a$c
            r15.<init>(r8, r14, r9)
            goto L_0x0099
        L_0x0096:
            r15.h(r14, r9)
        L_0x0099:
            com.ibm.icu.impl.p r1 = com.ibm.icu.impl.p.f12932g
            int r1 = r1.E(r12, r15, r10, r0)
            goto L_0x00a6
        L_0x00a0:
            com.ibm.icu.impl.p r1 = com.ibm.icu.impl.p.f12932g
            int r1 = r1.D(r12, r10, r7)
        L_0x00a6:
            if (r1 < 0) goto L_0x00af
            int r6 = r9 - r14
            c(r1, r10, r6, r7, r11)
            r2 = r9
            goto L_0x00b0
        L_0x00af:
            r2 = r14
        L_0x00b0:
            r14 = r9
            r12 = 1
            r9 = r20
            goto L_0x0029
        L_0x00b6:
            int r14 = r14 + 1
            boolean r4 = com.ibm.icu.impl.p.y(r3)
            if (r4 == 0) goto L_0x00c4
            int r3 = com.ibm.icu.impl.p.f(r3)
            if (r3 != 0) goto L_0x00c6
        L_0x00c4:
            r1 = 1
            goto L_0x00e6
        L_0x00c6:
            int r1 = r1 + r3
            char r9 = (char) r1
            int r1 = r14 + -1
            int r3 = r1 - r2
            r1 = r18
            r4 = r22
            r5 = r17
            r6 = r23
            d(r1, r2, r3, r4, r5, r6)
            r10.append(r9)
            r1 = 1
            if (r11 == 0) goto L_0x00e0
            r11.a(r1, r1)
        L_0x00e0:
            r9 = r20
            r12 = r1
            r2 = r14
            goto L_0x0029
        L_0x00e6:
            r9 = r20
            r12 = r1
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.a.i(int, int, java.lang.CharSequence, int, int, com.ibm.icu.impl.a$c, java.lang.Appendable, a2.c):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x001a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void j(int r16, int r17, java.lang.CharSequence r18, java.lang.Appendable r19, a2.C0361c r20) {
        /*
            r0 = r16
            r7 = r18
            r8 = r19
            r9 = r20
            r1 = 2
            if (r0 != r1) goto L_0x000f
            byte[] r1 = com.ibm.icu.impl.p.d.f12940d
        L_0x000d:
            r10 = r1
            goto L_0x0012
        L_0x000f:
            byte[] r1 = com.ibm.icu.impl.p.d.f12939c
            goto L_0x000d
        L_0x0012:
            int r11 = r18.length()
            r1 = 0
            r2 = 0
            r12 = r1
            r13 = r2
        L_0x001a:
            r2 = r12
        L_0x001b:
            if (r12 < r11) goto L_0x002d
            int r3 = r12 - r2
            r0 = r18
            r1 = r2
            r2 = r3
            r3 = r19
            r4 = r17
            r5 = r20
            d(r0, r1, r2, r3, r4, r5)
            return
        L_0x002d:
            char r1 = r7.charAt(r12)
            r3 = 383(0x17f, float:5.37E-43)
            r14 = 1
            if (r1 >= r3) goto L_0x0046
            byte r3 = r10[r1]
            r4 = -128(0xffffffffffffff80, float:NaN)
            if (r3 != r4) goto L_0x003d
            goto L_0x0058
        L_0x003d:
            int r12 = r12 + 1
            if (r3 != 0) goto L_0x0042
            goto L_0x001b
        L_0x0042:
            r15 = r17
            goto L_0x00b6
        L_0x0046:
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r3) goto L_0x004c
            goto L_0x0058
        L_0x004c:
            com.ibm.icu.impl.m r3 = f12601a
            int r3 = r3.g(r1)
            boolean r4 = com.ibm.icu.impl.p.z(r3)
            if (r4 == 0) goto L_0x00a4
        L_0x0058:
            int r3 = r12 + 1
            boolean r4 = java.lang.Character.isHighSurrogate(r1)
            if (r4 == 0) goto L_0x0072
            if (r3 >= r11) goto L_0x0072
            char r4 = r7.charAt(r3)
            boolean r5 = java.lang.Character.isLowSurrogate(r4)
            if (r5 == 0) goto L_0x0072
            int r1 = java.lang.Character.toCodePoint(r1, r4)
            int r3 = r12 + 2
        L_0x0072:
            r15 = r1
            r14 = r3
            if (r13 != 0) goto L_0x007d
            com.ibm.icu.impl.a$c r1 = new com.ibm.icu.impl.a$c
            r1.<init>(r7, r12, r14)
            r13 = r1
            goto L_0x0080
        L_0x007d:
            r13.h(r12, r14)
        L_0x0080:
            int r3 = r12 - r2
            r1 = r18
            r4 = r19
            r5 = r17
            r6 = r20
            d(r1, r2, r3, r4, r5, r6)
            com.ibm.icu.impl.p r1 = com.ibm.icu.impl.p.f12932g
            int r1 = r1.G(r15, r13, r8, r0)
            if (r1 < 0) goto L_0x009e
            int r2 = r14 - r12
            r15 = r17
            c(r1, r8, r2, r15, r9)
            r2 = r14
            goto L_0x00a1
        L_0x009e:
            r15 = r17
            r2 = r12
        L_0x00a1:
            r12 = r14
            goto L_0x001b
        L_0x00a4:
            r15 = r17
            int r12 = r12 + 1
            int r4 = com.ibm.icu.impl.p.n(r3)
            if (r4 != r14) goto L_0x001b
            int r3 = com.ibm.icu.impl.p.f(r3)
            if (r3 != 0) goto L_0x00b6
            goto L_0x001b
        L_0x00b6:
            int r1 = r1 + r3
            char r6 = (char) r1
            int r1 = r12 + -1
            int r3 = r1 - r2
            r1 = r18
            r4 = r19
            r5 = r17
            r14 = r6
            r6 = r20
            d(r1, r2, r3, r4, r5, r6)
            r8.append(r14)
            if (r9 == 0) goto L_0x001a
            r1 = 1
            r9.a(r1, r1)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.a.j(int, int, java.lang.CharSequence, java.lang.Appendable, a2.c):void");
    }

    private static boolean k(int i4) {
        int o4 = s.f12970k.o(i4);
        if (((1 << o4) & 251792942) != 0) {
            return true;
        }
        if (o4 != 4 || p.f12932g.l(i4) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int l(java.lang.CharSequence r16, int r17, int r18, int r19, java.lang.Appendable r20, int r21, a2.C0361c r22) {
        /*
            r6 = r16
            r7 = r18
            r0 = r19
            r8 = r22
            int r1 = r7 + 1
            char r2 = r6.charAt(r7)
            r3 = 73
            r4 = 769(0x301, float:1.078E-42)
            r5 = 0
            r9 = 1
            r10 = r17
            if (r10 != r3) goto L_0x002c
            if (r2 != r4) goto L_0x0029
            if (r1 != r0) goto L_0x001d
            return r7
        L_0x001d:
            int r2 = r7 + 2
            char r1 = r6.charAt(r1)
            r3 = r9
            r10 = r3
            r15 = r2
            r2 = r1
            r1 = r15
            goto L_0x002e
        L_0x0029:
            r3 = r5
            r10 = r3
            goto L_0x002e
        L_0x002c:
            r3 = r5
            r10 = r9
        L_0x002e:
            r11 = 106(0x6a, float:1.49E-43)
            r12 = 74
            if (r2 != r11) goto L_0x0036
            r11 = r9
            goto L_0x003b
        L_0x0036:
            if (r2 != r12) goto L_0x0092
            int r3 = r3 + 1
            r11 = r5
        L_0x003b:
            if (r10 == 0) goto L_0x0055
            if (r1 == r0) goto L_0x0054
            int r2 = r1 + 1
            char r1 = r6.charAt(r1)
            if (r1 == r4) goto L_0x0048
            goto L_0x0054
        L_0x0048:
            if (r11 == 0) goto L_0x004e
            r10 = r2
            r14 = r3
            r13 = r9
            goto L_0x0057
        L_0x004e:
            int r3 = r3 + 1
            r10 = r2
        L_0x0051:
            r14 = r3
            r13 = r5
            goto L_0x0057
        L_0x0054:
            return r7
        L_0x0055:
            r10 = r1
            goto L_0x0051
        L_0x0057:
            if (r10 >= r0) goto L_0x0068
            int r0 = java.lang.Character.codePointAt(r6, r10)
            int r0 = Z1.c.m(r0)
            int r0 = r9 << r0
            r0 = r0 & 448(0x1c0, float:6.28E-43)
            if (r0 == 0) goto L_0x0068
            return r7
        L_0x0068:
            r0 = r16
            r1 = r18
            r2 = r14
            r3 = r20
            r4 = r21
            r5 = r22
            d(r0, r1, r2, r3, r4, r5)
            int r0 = r7 + r14
            if (r11 == 0) goto L_0x0084
            r3.append(r12)
            if (r8 == 0) goto L_0x0082
            r8.a(r9, r9)
        L_0x0082:
            int r0 = r0 + 1
        L_0x0084:
            r1 = r0
            r0 = r16
            r2 = r13
            r3 = r20
            r4 = r21
            r5 = r22
            d(r0, r1, r2, r3, r4, r5)
            return r10
        L_0x0092:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.a.l(java.lang.CharSequence, int, int, int, java.lang.Appendable, int, a2.c):int");
    }

    public static Appendable m(int i4, int i5, CharSequence charSequence, Appendable appendable, C0361c cVar) {
        if (cVar != null) {
            try {
                cVar.i();
            } catch (IOException e4) {
                throw new ICUUncheckedIOException((Throwable) e4);
            }
        }
        i(i4, i5, charSequence, 0, charSequence.length(), (c) null, appendable, cVar);
        return appendable;
    }

    public static String n(int i4, int i5, CharSequence charSequence) {
        if (charSequence.length() > 100 || (i5 & 16384) != 0) {
            return ((StringBuilder) m(i4, i5, charSequence, new StringBuilder(charSequence.length()), (C0361c) null)).toString();
        }
        if (charSequence.length() == 0) {
            return charSequence.toString();
        }
        C0361c cVar = new C0361c();
        return e(charSequence, (StringBuilder) m(i4, i5 | 16384, charSequence, new StringBuilder(), cVar), cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f A[Catch:{ IOException -> 0x000e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Appendable o(int r19, int r20, a2.C0359a r21, java.lang.CharSequence r22, java.lang.Appendable r23, a2.C0361c r24) {
        /*
            r0 = r19
            r9 = r20
            r10 = r23
            r11 = r24
            if (r11 == 0) goto L_0x0011
            r24.i()     // Catch:{ IOException -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r0 = move-exception
            goto L_0x00fa
        L_0x0011:
            com.ibm.icu.impl.a$c r12 = new com.ibm.icu.impl.a$c     // Catch:{ IOException -> 0x000e }
            r13 = r22
            r12.<init>(r13)     // Catch:{ IOException -> 0x000e }
            int r14 = r22.length()     // Catch:{ IOException -> 0x000e }
            r15 = 1
            r16 = 0
            r1 = r15
            r2 = r16
        L_0x0022:
            if (r2 >= r14) goto L_0x00f9
            if (r1 == 0) goto L_0x002d
            int r1 = r21.b()     // Catch:{ IOException -> 0x000e }
            r17 = r16
            goto L_0x0034
        L_0x002d:
            int r3 = r21.o()     // Catch:{ IOException -> 0x000e }
            r17 = r1
            r1 = r3
        L_0x0034:
            r3 = -1
            if (r1 == r3) goto L_0x003c
            if (r1 <= r14) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r8 = r1
            goto L_0x003d
        L_0x003c:
            r8 = r14
        L_0x003d:
            if (r2 >= r8) goto L_0x00f1
            r12.i(r8)     // Catch:{ IOException -> 0x000e }
            int r1 = r12.g()     // Catch:{ IOException -> 0x000e }
            r3 = r9 & 512(0x200, float:7.175E-43)
            if (r3 != 0) goto L_0x0086
            r3 = r9 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0050
            r3 = r15
            goto L_0x0052
        L_0x0050:
            r3 = r16
        L_0x0052:
            if (r3 == 0) goto L_0x005d
            com.ibm.icu.impl.p r4 = com.ibm.icu.impl.p.f12932g     // Catch:{ IOException -> 0x000e }
            int r4 = r4.l(r1)     // Catch:{ IOException -> 0x000e }
            if (r4 != 0) goto L_0x006a
            goto L_0x0063
        L_0x005d:
            boolean r4 = k(r1)     // Catch:{ IOException -> 0x000e }
            if (r4 != 0) goto L_0x006a
        L_0x0063:
            int r1 = r12.g()     // Catch:{ IOException -> 0x000e }
            if (r1 < 0) goto L_0x006a
            goto L_0x0052
        L_0x006a:
            r7 = r1
            int r6 = r12.d()     // Catch:{ IOException -> 0x000e }
            if (r2 >= r6) goto L_0x0081
            int r3 = r6 - r2
            r1 = r22
            r4 = r23
            r5 = r20
            r18 = r6
            r6 = r24
            d(r1, r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x000e }
            goto L_0x0083
        L_0x0081:
            r18 = r6
        L_0x0083:
            r1 = r7
            r2 = r18
        L_0x0086:
            if (r2 >= r8) goto L_0x00f1
            com.ibm.icu.impl.p r3 = com.ibm.icu.impl.p.f12932g     // Catch:{ IOException -> 0x000e }
            int r1 = r3.F(r1, r12, r10, r0)     // Catch:{ IOException -> 0x000e }
            int r3 = r12.b()     // Catch:{ IOException -> 0x000e }
            c(r1, r10, r3, r9, r11)     // Catch:{ IOException -> 0x000e }
            int r3 = r2 + 1
            if (r3 >= r8) goto L_0x00c0
            r2 = 5
            if (r0 != r2) goto L_0x00c0
            if (r1 >= 0) goto L_0x009f
            int r1 = ~r1     // Catch:{ IOException -> 0x000e }
        L_0x009f:
            r2 = r1
            r1 = 73
            if (r2 == r1) goto L_0x00af
            r1 = 205(0xcd, float:2.87E-43)
            if (r2 != r1) goto L_0x00a9
            goto L_0x00af
        L_0x00a9:
            int r1 = r12.c()     // Catch:{ IOException -> 0x000e }
        L_0x00ad:
            r4 = r1
            goto L_0x00c5
        L_0x00af:
            r1 = r22
            r4 = r8
            r5 = r23
            r6 = r20
            r7 = r24
            int r1 = l(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x000e }
            r12.e(r1)     // Catch:{ IOException -> 0x000e }
            goto L_0x00ad
        L_0x00c0:
            int r1 = r12.c()     // Catch:{ IOException -> 0x000e }
            goto L_0x00ad
        L_0x00c5:
            if (r4 >= r8) goto L_0x00f1
            r1 = r9 & 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L_0x00dd
            r1 = r19
            r2 = r20
            r3 = r22
            r5 = r8
            r6 = r12
            r7 = r23
            r18 = r8
            r8 = r24
            i(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ IOException -> 0x000e }
            goto L_0x00ed
        L_0x00dd:
            r18 = r8
            int r3 = r18 - r4
            r1 = r22
            r2 = r4
            r4 = r23
            r5 = r20
            r6 = r24
            d(r1, r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x000e }
        L_0x00ed:
            r12.f()     // Catch:{ IOException -> 0x000e }
            goto L_0x00f3
        L_0x00f1:
            r18 = r8
        L_0x00f3:
            r1 = r17
            r2 = r18
            goto L_0x0022
        L_0x00f9:
            return r10
        L_0x00fa:
            com.ibm.icu.util.ICUUncheckedIOException r1 = new com.ibm.icu.util.ICUUncheckedIOException
            r1.<init>((java.lang.Throwable) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ibm.icu.impl.a.o(int, int, a2.a, java.lang.CharSequence, java.lang.Appendable, a2.c):java.lang.Appendable");
    }

    public static String p(int i4, int i5, C0359a aVar, CharSequence charSequence) {
        if (charSequence.length() > 100 || (i5 & 16384) != 0) {
            return ((StringBuilder) o(i4, i5, aVar, charSequence, new StringBuilder(charSequence.length()), (C0361c) null)).toString();
        } else if (charSequence.length() == 0) {
            return charSequence.toString();
        } else {
            C0361c cVar = new C0361c();
            return e(charSequence, (StringBuilder) o(i4, i5 | 16384, aVar, charSequence, new StringBuilder(), cVar), cVar);
        }
    }

    public static Appendable q(int i4, int i5, CharSequence charSequence, Appendable appendable, C0361c cVar) {
        if (cVar != null) {
            try {
                cVar.i();
            } catch (IOException e4) {
                throw new ICUUncheckedIOException((Throwable) e4);
            }
        }
        if (i4 == 4) {
            return b.e(i5, charSequence, appendable, cVar);
        }
        j(i4, i5, charSequence, appendable, cVar);
        return appendable;
    }

    public static String r(int i4, int i5, CharSequence charSequence) {
        if (charSequence.length() > 100 || (i5 & 16384) != 0) {
            return ((StringBuilder) q(i4, i5, charSequence, new StringBuilder(charSequence.length()), (C0361c) null)).toString();
        }
        if (charSequence.length() == 0) {
            return charSequence.toString();
        }
        C0361c cVar = new C0361c();
        return e(charSequence, (StringBuilder) q(i4, i5 | 16384, charSequence, new StringBuilder(), cVar), cVar);
    }

    public static final class c implements p.b {

        /* renamed from: a  reason: collision with root package name */
        protected CharSequence f12604a;

        /* renamed from: b  reason: collision with root package name */
        protected int f12605b;

        /* renamed from: c  reason: collision with root package name */
        protected int f12606c;

        /* renamed from: d  reason: collision with root package name */
        protected int f12607d;

        /* renamed from: e  reason: collision with root package name */
        protected int f12608e;

        /* renamed from: f  reason: collision with root package name */
        protected int f12609f;

        public c(CharSequence charSequence) {
            this.f12604a = charSequence;
            this.f12606c = charSequence.length();
            this.f12605b = 0;
            this.f12608e = 0;
            this.f12607d = 0;
            this.f12609f = 0;
        }

        public void a(int i4) {
            if (i4 > 0) {
                this.f12609f = 1;
                this.f12605b = this.f12608e;
            } else if (i4 < 0) {
                this.f12609f = -1;
                this.f12605b = this.f12607d;
            } else {
                this.f12609f = 0;
                this.f12605b = 0;
            }
        }

        public int b() {
            return this.f12608e - this.f12607d;
        }

        public int c() {
            return this.f12608e;
        }

        public int d() {
            return this.f12607d;
        }

        public void e(int i4) {
            this.f12608e = i4;
            this.f12607d = i4;
        }

        public void f() {
            int i4 = this.f12606c;
            this.f12608e = i4;
            this.f12607d = i4;
        }

        public int g() {
            int i4 = this.f12608e;
            this.f12607d = i4;
            if (i4 >= this.f12606c) {
                return -1;
            }
            int codePointAt = Character.codePointAt(this.f12604a, i4);
            this.f12608e += Character.charCount(codePointAt);
            return codePointAt;
        }

        public void h(int i4, int i5) {
            this.f12607d = i4;
            this.f12608e = i5;
            this.f12609f = 0;
        }

        public void i(int i4) {
            if (i4 < 0 || i4 > this.f12604a.length()) {
                this.f12606c = this.f12604a.length();
            } else {
                this.f12606c = i4;
            }
        }

        public int next() {
            int i4;
            if (this.f12609f > 0 && this.f12605b < this.f12604a.length()) {
                int codePointAt = Character.codePointAt(this.f12604a, this.f12605b);
                this.f12605b += Character.charCount(codePointAt);
                return codePointAt;
            } else if (this.f12609f >= 0 || (i4 = this.f12605b) <= 0) {
                return -1;
            } else {
                int codePointBefore = Character.codePointBefore(this.f12604a, i4);
                this.f12605b -= Character.charCount(codePointBefore);
                return codePointBefore;
            }
        }

        public c(CharSequence charSequence, int i4, int i5) {
            this.f12604a = charSequence;
            this.f12605b = 0;
            this.f12606c = charSequence.length();
            this.f12607d = i4;
            this.f12608e = i5;
            this.f12609f = 0;
        }
    }
}
