package kotlin.text;

/* renamed from: kotlin.text.c  reason: case insensitive filesystem */
abstract class C0723c extends C0722b {
    public static final boolean g(char c4, char c5, boolean z3) {
        if (c4 == c5) {
            return true;
        }
        if (!z3) {
            return false;
        }
        char upperCase = Character.toUpperCase(c4);
        char upperCase2 = Character.toUpperCase(c5);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static String h(char c4) {
        return E.a(c4);
    }
}
