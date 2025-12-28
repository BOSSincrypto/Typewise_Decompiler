package ch.icoaching.typewise.language_modelling.inference;

import kotlin.coroutines.c;

public abstract /* synthetic */ class a {
    public static /* synthetic */ Object a(b bVar, String str, String str2, Float f4, Integer num, String str3, c cVar, int i4, Object obj) {
        String str4;
        Float f5;
        Integer num2;
        String str5;
        if (obj == null) {
            if ((i4 & 2) != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if ((i4 & 4) != 0) {
                f5 = null;
            } else {
                f5 = f4;
            }
            if ((i4 & 8) != 0) {
                num2 = null;
            } else {
                num2 = num;
            }
            if ((i4 & 16) != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            return bVar.a(str, str4, f5, num2, str5, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: predictCompletions");
    }
}
