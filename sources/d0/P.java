package D0;

import kotlin.jvm.internal.o;
import kotlin.text.Regex;

public class P extends O {

    /* renamed from: e  reason: collision with root package name */
    private final Regex f248e = new Regex("\n+");

    public String a(String str) {
        o.e(str, "text");
        return this.f248e.replace((CharSequence) super.a(str), "\n");
    }

    public String f(String str, String str2) {
        o.e(str, "context");
        o.e(str2, "missingPart");
        if (str.length() <= 0) {
            return str2;
        }
        if (kotlin.text.o.T0(str) == ' ') {
            return kotlin.text.o.P0(str2, ' ');
        } else if (kotlin.text.o.T0(str) != 10) {
            return str2;
        } else {
            return kotlin.text.o.P0(str2, 10);
        }
    }
}
