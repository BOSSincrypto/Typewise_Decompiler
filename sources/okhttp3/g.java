package okhttp3;

import com.silkimen.http.HttpRequest;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final String f15197a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f15198b;

    public g(String str, Map map) {
        String str2;
        o.e(str, "scheme");
        o.e(map, "authParams");
        this.f15197a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (str3 == null) {
                str2 = null;
            } else {
                Locale locale = Locale.US;
                o.d(locale, "US");
                str2 = str3.toLowerCase(locale);
                o.d(str2, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(str2, str4);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        o.d(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f15198b = unmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.f15198b.get(HttpRequest.PARAM_CHARSET);
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                o.d(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        o.d(charset, "ISO_8859_1");
        return charset;
    }

    public final String b() {
        return (String) this.f15198b.get("realm");
    }

    public final String c() {
        return this.f15197a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (!o.a(gVar.f15197a, this.f15197a) || !o.a(gVar.f15198b, this.f15198b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f15197a.hashCode()) * 31) + this.f15198b.hashCode();
    }

    public String toString() {
        return this.f15197a + " authParams=" + this.f15198b;
    }
}
