package ch.icoaching.wrio.logging;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.o;

public abstract class a {
    /* access modifiers changed from: private */
    public static final String c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        o.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    /* access modifiers changed from: private */
    public static final String d(int i4) {
        switch (i4) {
            case 2:
                return "V/";
            case 3:
                return "D/";
            case 4:
                return "I/";
            case 5:
                return "W/";
            case 6:
                return "E/";
            case 7:
                return "A/";
            default:
                return "";
        }
    }
}
