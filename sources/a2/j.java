package a2;

public abstract class j {
    private static int a(String str, int i4, char c4) {
        char charAt;
        char charAt2;
        if (c4 > 57343) {
            return c4;
        }
        if (c4 <= 56319) {
            int i5 = i4 + 1;
            if (str.length() != i5 && (charAt2 = str.charAt(i5)) >= 56320 && charAt2 <= 57343) {
                return Character.toCodePoint(c4, charAt2);
            }
        } else {
            int i6 = i4 - 1;
            if (i6 >= 0 && (charAt = str.charAt(i6)) >= 55296 && charAt <= 56319) {
                return Character.toCodePoint(charAt, c4);
            }
        }
        return c4;
    }

    public static int b(String str, int i4) {
        char charAt = str.charAt(i4);
        if (charAt < 55296) {
            return charAt;
        }
        return a(str, i4, charAt);
    }

    public static int c(char[] cArr, int i4, int i5, int i6) {
        int i7 = i6 + i4;
        if (i7 < i4 || i7 >= i5) {
            throw new ArrayIndexOutOfBoundsException(i7);
        }
        char c4 = cArr[i7];
        if (!h(c4)) {
            return c4;
        }
        if (c4 <= 56319) {
            int i8 = i7 + 1;
            if (i8 >= i5) {
                return c4;
            }
            char c5 = cArr[i8];
            if (i(c5)) {
                return Character.toCodePoint(c4, c5);
            }
        } else if (i7 == i4) {
            return c4;
        } else {
            char c6 = cArr[i7 - 1];
            if (g(c6)) {
                return Character.toCodePoint(c6, c4);
            }
        }
        return c4;
    }

    public static int d(int i4) {
        if (i4 < 65536) {
            return 1;
        }
        return 2;
    }

    public static char e(int i4) {
        if (i4 >= 65536) {
            return (char) ((i4 >> 10) + 55232);
        }
        return 0;
    }

    public static char f(int i4) {
        if (i4 >= 65536) {
            return (char) ((i4 & 1023) + 56320);
        }
        return (char) i4;
    }

    public static boolean g(int i4) {
        if ((i4 & -1024) == 55296) {
            return true;
        }
        return false;
    }

    public static boolean h(int i4) {
        if ((i4 & -2048) == 55296) {
            return true;
        }
        return false;
    }

    public static boolean i(int i4) {
        if ((i4 & -1024) == 56320) {
            return true;
        }
        return false;
    }

    private static String j(int i4) {
        if (i4 < 65536) {
            return String.valueOf((char) i4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(e(i4));
        sb.append(f(i4));
        return sb.toString();
    }

    public static String k(int i4) {
        if (i4 >= 0 && i4 <= 1114111) {
            return j(i4);
        }
        throw new IllegalArgumentException("Illegal codepoint");
    }
}
