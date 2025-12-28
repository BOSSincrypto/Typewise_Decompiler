package Z1;

public abstract class a {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: int} */
    /* JADX WARNING: type inference failed for: r5v1, types: [char] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] a(java.lang.CharSequence r9) {
        /*
            int r0 = r9.length()
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0009:
            int r5 = r9.length()
            if (r3 >= r5) goto L_0x003d
            char r5 = r9.charAt(r3)
            r6 = 56320(0xdc00, float:7.8921E-41)
            if (r5 < r6) goto L_0x0035
            r6 = 57343(0xdfff, float:8.0355E-41)
            if (r5 > r6) goto L_0x0035
            if (r3 == 0) goto L_0x0035
            int r6 = r4 + -1
            r7 = r1[r6]
            char r7 = (char) r7
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r8) goto L_0x0035
            r8 = 56319(0xdbff, float:7.892E-41)
            if (r7 > r8) goto L_0x0035
            int r5 = java.lang.Character.toCodePoint(r7, r5)
            r1[r6] = r5
            goto L_0x003a
        L_0x0035:
            int r6 = r4 + 1
            r1[r4] = r5
            r4 = r6
        L_0x003a:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x003d:
            if (r4 != r0) goto L_0x0040
            return r1
        L_0x0040:
            int[] r9 = new int[r4]
            java.lang.System.arraycopy(r1, r2, r9, r2, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.a.a(java.lang.CharSequence):int[]");
    }

    public static int b(CharSequence charSequence, int i4) {
        int charAt;
        if (i4 < 0 || i4 > 1114111) {
            throw new IllegalArgumentException();
        }
        int length = charSequence.length();
        if (length == 0) {
            return -1;
        }
        char charAt2 = charSequence.charAt(0);
        int i5 = i4 - 65536;
        if (i5 < 0) {
            int i6 = charAt2 - i4;
            if (i6 != 0) {
                return i6;
            }
            return length - 1;
        }
        int i7 = charAt2 - ((char) ((i5 >>> 10) + 55296));
        if (i7 != 0) {
            return i7;
        }
        if (length <= 1 || (charAt = charSequence.charAt(1) - ((char) ((i5 & 1023) + 56320))) == 0) {
            return length - 2;
        }
        return charAt;
    }

    public static int c(CharSequence charSequence) {
        boolean z3;
        int length = charSequence.length();
        boolean z4 = true;
        if (length < 1 || length > 2) {
            return Integer.MAX_VALUE;
        }
        int codePointAt = Character.codePointAt(charSequence, 0);
        if (codePointAt < 65536) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (length != 1) {
            z4 = false;
        }
        if (z3 == z4) {
            return codePointAt;
        }
        return Integer.MAX_VALUE;
    }
}
