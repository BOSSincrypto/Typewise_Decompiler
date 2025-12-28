package kotlinx.serialization.json.internal;

/* renamed from: kotlinx.serialization.json.internal.b  reason: case insensitive filesystem */
public abstract class C0763b {
    public static final byte a(char c4) {
        if (c4 < '~') {
            return C0768g.f14393c[c4];
        }
        return 0;
    }

    public static final char b(int i4) {
        if (i4 < 117) {
            return C0768g.f14392b[i4];
        }
        return 0;
    }

    public static final String c(byte b4) {
        if (b4 == 1) {
            return "quotation mark '\"'";
        }
        if (b4 == 2) {
            return "string escape sequence '\\'";
        }
        if (b4 == 4) {
            return "comma ','";
        }
        if (b4 == 5) {
            return "colon ':'";
        }
        if (b4 == 6) {
            return "start of the object '{'";
        }
        if (b4 == 7) {
            return "end of the object '}'";
        }
        if (b4 == 8) {
            return "start of the array '['";
        }
        if (b4 == 9) {
            return "end of the array ']'";
        }
        if (b4 == 10) {
            return "end of the input";
        }
        if (b4 == Byte.MAX_VALUE) {
            return "invalid token";
        }
        return "valid token";
    }
}
