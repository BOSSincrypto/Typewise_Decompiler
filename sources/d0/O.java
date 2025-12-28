package D0;

import java.util.Locale;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public class O extends i0 {
    public O() {
        super(false, 1, (i) null);
    }

    public String b(String str, int i4, boolean z3) {
        o.e(str, "text");
        String c4 = c(kotlin.text.o.O0(a(str)).toString(), Integer.valueOf(i4));
        if (!z3) {
            return c4;
        }
        String lowerCase = c4.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public String d(String str, String str2, boolean z3) {
        o.e(str, "context");
        o.e(str2, "missingPart");
        if (str2.length() == 0) {
            return "";
        }
        String a4 = a(f(str, str2));
        if (z3) {
            a4 = a4.toLowerCase(Locale.ROOT);
            o.d(a4, "toLowerCase(...)");
        }
        if (kotlin.text.o.O0(str).toString().length() == 0) {
            return kotlin.text.o.O0(a4).toString();
        }
        return a4;
    }

    public String f(String str, String str2) {
        o.e(str, "context");
        o.e(str2, "missingPart");
        if (str.length() <= 0 || kotlin.text.o.T0(str) != ' ') {
            return str2;
        }
        return kotlin.text.o.P0(str2, ' ');
    }
}
