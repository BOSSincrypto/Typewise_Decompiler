package ch.icoaching.wrio;

import android.graphics.Color;
import kotlin.jvm.internal.o;
import w2.C0930a;

/* renamed from: ch.icoaching.wrio.l  reason: case insensitive filesystem */
public abstract class C0548l {
    public static final int a(int i4, float f4) {
        return Color.argb(C0930a.b(((float) Color.alpha(i4)) * f4), Color.red(i4), Color.green(i4), Color.blue(i4));
    }

    public static final int b(String str) {
        o.e(str, "<this>");
        int length = str.length();
        if (length == 7) {
            return Color.parseColor(str);
        }
        if (length == 9) {
            StringBuilder sb = new StringBuilder(9);
            sb.append('#');
            sb.append(str.charAt(7));
            sb.append(str.charAt(8));
            sb.append(str.charAt(1));
            sb.append(str.charAt(2));
            sb.append(str.charAt(3));
            sb.append(str.charAt(4));
            sb.append(str.charAt(5));
            sb.append(str.charAt(6));
            String sb2 = sb.toString();
            o.d(sb2, "toString(...)");
            return Color.parseColor(sb2);
        }
        throw new IllegalStateException("Can't convert '" + str + "' to a color");
    }
}
