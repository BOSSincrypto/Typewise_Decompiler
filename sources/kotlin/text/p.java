package kotlin.text;

import kotlin.jvm.internal.o;
import u2.l;

abstract class p {
    public static void a(Appendable appendable, Object obj, l lVar) {
        boolean z3;
        o.e(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null) {
            z3 = true;
        } else {
            z3 = obj instanceof CharSequence;
        }
        if (z3) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }
}
