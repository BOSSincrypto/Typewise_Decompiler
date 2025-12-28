package D0;

import E0.s;
import ch.icoaching.typewise.text.TypewiseInputType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import u2.p;

/* renamed from: D0.e  reason: case insensitive filesystem */
public final class C0269e {

    /* renamed from: a  reason: collision with root package name */
    private final p f270a;

    public C0269e(p pVar) {
        o.e(pVar, "getSpecialFieldValues");
        this.f270a = pVar;
    }

    private final String a(String str, String str2) {
        if (kotlin.text.o.X(str) || str.length() > str2.length()) {
            return str2;
        }
        String substring = str2.substring(str.length());
        o.d(substring, "substring(...)");
        return substring;
    }

    public final List b(String str, TypewiseInputType typewiseInputType) {
        int i4;
        boolean z3;
        o.e(str, "textBefore");
        ArrayList arrayList = new ArrayList();
        String c4 = s.c(str);
        p pVar = this.f270a;
        int length = c4.length() - 1;
        int i5 = 0;
        boolean z4 = false;
        while (i5 <= length) {
            if (!z4) {
                i4 = i5;
            } else {
                i4 = length;
            }
            if (o.f(c4.charAt(i4), 32) <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z4) {
                if (!z3) {
                    z4 = true;
                } else {
                    i5++;
                }
            } else if (!z3) {
                break;
            } else {
                length--;
            }
        }
        for (String a4 : (List) pVar.invoke(c4.subSequence(i5, length + 1).toString(), typewiseInputType)) {
            arrayList.add(a(c4, a4));
        }
        return arrayList;
    }
}
