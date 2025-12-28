package ch.icoaching.wrio.language;

import c.C0489b;
import ch.icoaching.wrio.tutorialmode.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final C0489b f10566a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10567b;

    public c(C0489b bVar, a aVar) {
        o.e(bVar, "databaseHandler");
        o.e(aVar, "tutorialModeCompat");
        this.f10566a = bVar;
        this.f10567b = aVar;
    }

    public List e(String str, boolean z3) {
        int i4;
        boolean z4;
        o.b(str);
        Locale locale = Locale.getDefault();
        o.d(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        o.d(lowerCase, "toLowerCase(...)");
        int length = lowerCase.length() - 1;
        int i5 = 0;
        boolean z5 = false;
        while (i5 <= length) {
            if (!z5) {
                i4 = i5;
            } else {
                i4 = length;
            }
            if (o.f(lowerCase.charAt(i4), 32) <= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z5) {
                if (!z4) {
                    z5 = true;
                } else {
                    i5++;
                }
            } else if (!z4) {
                break;
            } else {
                length--;
            }
        }
        String obj = lowerCase.subSequence(i5, length + 1).toString();
        ArrayList arrayList = new ArrayList(this.f10567b.a());
        if (z3) {
            arrayList.add("user_specific");
        }
        List v3 = this.f10566a.v(obj, arrayList);
        o.d(v3, "getLanguageCounterData(...)");
        return v3;
    }
}
