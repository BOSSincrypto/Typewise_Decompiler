package ch.icoaching.wrio.personalization.dictionary;

import ch.icoaching.typewise.text.TypewiseInputType;
import d2.C0640a;
import kotlin.jvm.internal.o;

public abstract class a {
    /* access modifiers changed from: private */
    public static final String b(TypewiseInputType typewiseInputType, String str) {
        if (typewiseInputType != TypewiseInputType.EMAIL) {
            return str;
        }
        String a4 = new C0640a().a(str);
        o.b(a4);
        return a4;
    }
}
