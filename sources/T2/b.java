package T2;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.u;

public abstract class b {
    public static final String b(long j4) {
        String str;
        if (j4 <= -999500000) {
            str = ((j4 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j4 <= -999500) {
            str = ((j4 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j4 <= 0) {
            str = ((j4 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j4 < 999500) {
            str = ((j4 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j4 < 999500000) {
            str = ((j4 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j4 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        u uVar = u.f13912a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        o.d(format, "format(format, *args)");
        return format;
    }

    /* access modifiers changed from: private */
    public static final void c(a aVar, d dVar, String str) {
        Logger a4 = e.f1471h.a();
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.f());
        sb.append(' ');
        u uVar = u.f13912a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        o.d(format, "format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.b());
        a4.fine(sb.toString());
    }
}
