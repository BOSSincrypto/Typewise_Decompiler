package i2;

import android.content.res.Resources;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;

/* renamed from: i2.b  reason: case insensitive filesystem */
public abstract class C0681b {
    public static final List a(List list) {
        String str;
        o.e(list, "languageCodes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (o.a(str2, "system")) {
                Locale locale = Resources.getSystem().getConfiguration().locale;
                String language = locale.getLanguage();
                String country = locale.getCountry();
                o.d(country, "getCountry(...)");
                String lowerCase = country.toLowerCase(Locale.ROOT);
                o.d(lowerCase, "toLowerCase(...)");
                if (language != null) {
                    int hashCode = language.hashCode();
                    if (hashCode == 3201) {
                        str = "de";
                        if (language.equals(str)) {
                            if (o.a(lowerCase, "ch")) {
                                str2 = "de-ch";
                            }
                        }
                    } else if (hashCode == 3241) {
                        str = "en";
                        if (language.equals(str)) {
                            if (o.a(lowerCase, "gb")) {
                                str2 = "en-gb";
                            }
                        }
                    } else if (hashCode == 3276) {
                        str = "fr";
                        if (language.equals(str)) {
                            if (o.a(lowerCase, "ca")) {
                                str2 = "fr-ca";
                            } else if (o.a(lowerCase, "ch")) {
                                str2 = "fr-ch";
                            }
                        }
                    } else if (hashCode == 3518) {
                        str = "nl";
                        if (language.equals(str)) {
                            if (o.a(lowerCase, "be")) {
                                str2 = "nl-be";
                            }
                        }
                    }
                    str2 = str;
                }
                o.b(language);
                str2 = language;
            }
            linkedHashSet.add(str2);
        }
        return C0718m.B0(linkedHashSet);
    }
}
