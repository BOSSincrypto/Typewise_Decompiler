package Y1;

import Z1.c;
import a2.j;
import com.ibm.icu.util.ICUUncheckedIOException;
import com.ibm.icu.util.ULocale;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;

public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public static String f2094a = System.getProperty("line.separator");

    /* renamed from: b  reason: collision with root package name */
    static final char[] f2095b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f2096c = {'a', 7, 'b', 8, 'e', 27, 'f', 12, 'n', 10, 'r', 13, 't', 9, 'v', 11};

    /* renamed from: d  reason: collision with root package name */
    static final char[] f2097d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    private static final int a(int i4) {
        if (i4 >= 48 && i4 <= 57) {
            return i4 - 48;
        }
        if (i4 >= 65 && i4 <= 70) {
            return i4 - 55;
        }
        if (i4 < 97 || i4 > 102) {
            return -1;
        }
        return i4 - 87;
    }

    private static final int b(int i4) {
        if (i4 < 48 || i4 > 55) {
            return -1;
        }
        return i4 - 48;
    }

    private static int c(int i4, int i5) {
        return (i4 << 8) | i5;
    }

    private static int d(int i4, int i5, int i6) {
        return c(i4, i6 - i5);
    }

    public static int e(int i4) {
        return i4 >> 8;
    }

    public static Appendable f(Appendable appendable, int i4) {
        try {
            appendable.append('\\');
            if ((-65536 & i4) != 0) {
                appendable.append('U');
                char[] cArr = f2097d;
                appendable.append(cArr[(i4 >> 28) & 15]);
                appendable.append(cArr[(i4 >> 24) & 15]);
                appendable.append(cArr[(i4 >> 20) & 15]);
                appendable.append(cArr[(i4 >> 16) & 15]);
            } else {
                appendable.append(ULocale.UNICODE_LOCALE_EXTENSION);
            }
            char[] cArr2 = f2097d;
            appendable.append(cArr2[(i4 >> 12) & 15]);
            appendable.append(cArr2[(i4 >> 8) & 15]);
            appendable.append(cArr2[(i4 >> 4) & 15]);
            appendable.append(cArr2[i4 & 15]);
            return appendable;
        } catch (IOException e4) {
            throw new ICUUncheckedIOException((Throwable) e4);
        }
    }

    public static final String g(String str) {
        boolean z3;
        String str2;
        int i4;
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        while (i5 < str.length()) {
            int codePointAt = Character.codePointAt(str, i5);
            i5 += j.d(codePointAt);
            if (codePointAt < 32 || codePointAt > 127) {
                if (codePointAt <= 65535) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    str2 = "\\u";
                } else {
                    str2 = "\\U";
                }
                sb.append(str2);
                long j4 = (long) codePointAt;
                if (z3) {
                    i4 = 4;
                } else {
                    i4 = 8;
                }
                sb.append(h(j4, i4));
            } else if (codePointAt == 92) {
                sb.append("\\\\");
            } else {
                sb.append((char) codePointAt);
            }
        }
        return sb.toString();
    }

    public static String h(long j4, int i4) {
        boolean z3;
        if (j4 == Long.MIN_VALUE) {
            return "-8000000000000000";
        }
        if (j4 < 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            j4 = -j4;
        }
        String upperCase = Long.toString(j4, 16).toUpperCase(Locale.ENGLISH);
        if (upperCase.length() < i4) {
            upperCase = "0000000000000000".substring(upperCase.length(), i4) + upperCase;
        }
        if (!z3) {
            return upperCase;
        }
        return '-' + upperCase;
    }

    public static boolean i(int i4) {
        if (i4 < 32 || i4 > 126) {
            return true;
        }
        return false;
    }

    public static String j(CharSequence charSequence, Iterable iterable) {
        if (charSequence == null || iterable == null) {
            throw new NullPointerException("Delimiter or elements is null");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        boolean z3 = true;
        while (it.hasNext()) {
            CharSequence charSequence2 = (CharSequence) it.next();
            if (charSequence2 != null) {
                if (!z3) {
                    sb.append(charSequence);
                } else {
                    z3 = false;
                }
                sb.append(charSequence2);
            }
        }
        return sb.toString();
    }

    public static int k(int i4) {
        return i4 & 255;
    }

    public static final boolean l(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return false;
    }

    public static boolean m(int i4) {
        if (i4 < 32) {
            return true;
        }
        if (i4 <= 126) {
            return false;
        }
        if (i4 <= 159) {
            return true;
        }
        if (i4 < 55296) {
            return false;
        }
        if (i4 <= 57343 || ((64976 <= i4 && i4 <= 65007) || (i4 & 65534) == 65534 || i4 > 1114111)) {
            return true;
        }
        return false;
    }

    public static int n(CharSequence charSequence, int i4) {
        return o(charSequence, i4, charSequence.length());
    }

    private static int o(CharSequence charSequence, int i4, int i5) {
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        if (i4 < 0 || i4 >= i5) {
            return -1;
        }
        int i10 = i4 + 1;
        int charAt = charSequence.charAt(i4);
        int i11 = 8;
        int i12 = 0;
        int i13 = 4;
        if (charAt == 85) {
            i8 = 0;
            i6 = 0;
            z3 = false;
            i7 = 4;
            i13 = 8;
        } else if (charAt == 117) {
            i8 = 0;
            i6 = 0;
            z3 = false;
            i11 = 4;
            i7 = 4;
        } else if (charAt != 120) {
            i8 = b(charAt);
            if (i8 >= 0) {
                i13 = 3;
                i7 = 3;
                i11 = 1;
                i6 = 1;
                z3 = false;
            } else {
                i8 = 0;
                i11 = 0;
                i6 = 0;
                z3 = false;
                i7 = 4;
                i13 = 0;
            }
        } else if (i10 >= i5 || charSequence.charAt(i10) != '{') {
            i8 = 0;
            i6 = 0;
            z3 = false;
            i7 = 4;
            i13 = 2;
            i11 = 1;
        } else {
            i10 = i4 + 2;
            z3 = true;
            i8 = 0;
            i6 = 0;
            i7 = 4;
            i13 = 8;
            i11 = 1;
        }
        if (i11 != 0) {
            while (i10 < i5 && i6 < i13) {
                charAt = charSequence.charAt(i10);
                if (i7 == 3) {
                    i9 = b(charAt);
                } else {
                    i9 = a(charAt);
                }
                if (i9 < 0) {
                    break;
                }
                i8 = (i8 << i7) | i9;
                i10++;
                i6++;
            }
            if (i6 < i11) {
                return -1;
            }
            if (z3) {
                if (charAt != 125) {
                    return -1;
                }
                i10++;
            }
            if (i8 < 0 || i8 >= 1114112) {
                return -1;
            }
            if (i10 < i5 && j.g(i8)) {
                int i14 = i10 + 1;
                int charAt2 = charSequence.charAt(i10);
                if (charAt2 == 92 && i14 < i5) {
                    int i15 = i10 + 12;
                    if (i15 <= i5) {
                        i5 = i15;
                    }
                    int o4 = o(charSequence, i14, i5);
                    if (o4 >= 0) {
                        charAt2 = o4 >> 8;
                        i14 += o4 & 255;
                    }
                }
                if (j.i(charAt2)) {
                    i8 = c.r(i8, charAt2);
                    i10 = i14;
                }
            }
            return d(i8, i4, i10);
        }
        while (true) {
            char[] cArr = f2096c;
            if (i12 >= cArr.length) {
                break;
            }
            char c4 = cArr[i12];
            if (charAt == c4) {
                return d(cArr[i12 + 1], i4, i10);
            }
            if (charAt < c4) {
                break;
            }
            i12 += 2;
        }
        if (charAt != 99 || i10 >= i5) {
            if (j.g(charAt) && i10 < i5) {
                char charAt3 = charSequence.charAt(i10);
                if (j.i(charAt3)) {
                    i10++;
                    charAt = c.r(charAt, charAt3);
                }
            }
            return d(charAt, i4, i10);
        }
        int codePointAt = Character.codePointAt(charSequence, i10);
        return d(codePointAt & 31, i4, i10 + Character.charCount(codePointAt));
    }
}
