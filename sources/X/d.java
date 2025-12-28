package X;

import kotlin.jvm.internal.o;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f1906a = new String[0];

    public static final void a(StringBuilder sb, int i4) {
        o.e(sb, "builder");
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append("?");
            if (i5 < i4 - 1) {
                sb.append(",");
            }
        }
    }

    public static final StringBuilder b() {
        return new StringBuilder();
    }
}
