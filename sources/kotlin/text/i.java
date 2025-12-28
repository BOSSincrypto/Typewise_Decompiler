package kotlin.text;

import kotlin.jvm.internal.o;
import kotlin.uuid.Uuid;

public abstract class i {
    /* access modifiers changed from: private */
    public static final boolean b(String str) {
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (o.f(charAt, Uuid.SIZE_BITS) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }
}
