package androidx.core.os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

final class h implements i {

    /* renamed from: c  reason: collision with root package name */
    private static final Locale[] f5015c = new Locale[0];

    /* renamed from: d  reason: collision with root package name */
    private static final Locale f5016d = new Locale("en", "XA");

    /* renamed from: e  reason: collision with root package name */
    private static final Locale f5017e = new Locale("ar", "XB");

    /* renamed from: f  reason: collision with root package name */
    private static final Locale f5018f = g.b("en-Latn");

    /* renamed from: a  reason: collision with root package name */
    private final Locale[] f5019a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5020b;

    h(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f5019a = f5015c;
            this.f5020b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        while (i4 < localeArr.length) {
            Locale locale = localeArr[i4];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    c(sb, locale2);
                    if (i4 < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
                i4++;
            } else {
                throw new NullPointerException("list[" + i4 + "] is null");
            }
        }
        this.f5019a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f5020b = sb.toString();
    }

    static void c(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    public String a() {
        return this.f5020b;
    }

    public Object b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        Locale[] localeArr = ((h) obj).f5019a;
        if (this.f5019a.length != localeArr.length) {
            return false;
        }
        int i4 = 0;
        while (true) {
            Locale[] localeArr2 = this.f5019a;
            if (i4 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i4].equals(localeArr[i4])) {
                return false;
            }
            i4++;
        }
    }

    public Locale get(int i4) {
        if (i4 >= 0) {
            Locale[] localeArr = this.f5019a;
            if (i4 < localeArr.length) {
                return localeArr[i4];
            }
        }
        return null;
    }

    public int hashCode() {
        int i4 = 1;
        for (Locale hashCode : this.f5019a) {
            i4 = (i4 * 31) + hashCode.hashCode();
        }
        return i4;
    }

    public boolean isEmpty() {
        if (this.f5019a.length == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return this.f5019a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i4 = 0;
        while (true) {
            Locale[] localeArr = this.f5019a;
            if (i4 < localeArr.length) {
                sb.append(localeArr[i4]);
                if (i4 < this.f5019a.length - 1) {
                    sb.append(',');
                }
                i4++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
