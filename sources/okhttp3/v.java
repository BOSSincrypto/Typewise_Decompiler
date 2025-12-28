package okhttp3;

import com.silkimen.http.HttpRequest;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import p2.C0854c;

public final class v {

    /* renamed from: e  reason: collision with root package name */
    public static final a f15509e = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f15510f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f15511g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    private final String f15512a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15513b;

    /* renamed from: c  reason: collision with root package name */
    private final String f15514c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f15515d;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final v a(String str) {
            o.e(str, "<this>");
            Matcher matcher = v.f15510f.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                o.d(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                o.d(locale, "US");
                String lowerCase = group.toLowerCase(locale);
                o.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                o.d(group2, "typeSubtype.group(2)");
                o.d(locale, "US");
                String lowerCase2 = group2.toLowerCase(locale);
                o.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = v.f15511g.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (kotlin.text.o.G(group4, "'", false, 2, (Object) null) && kotlin.text.o.u(group4, "'", false, 2, (Object) null) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                o.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        o.d(substring, "this as java.lang.String).substring(startIndex)");
                        sb.append(substring);
                        sb.append("\" for: \"");
                        sb.append(str);
                        sb.append('\"');
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    return new v(str, lowerCase, lowerCase2, (String[]) array, (i) null);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        public final v b(String str) {
            o.e(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ v(String str, String str2, String str3, String[] strArr, i iVar) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset d(v vVar, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = null;
        }
        return vVar.c(charset);
    }

    public static final v e(String str) {
        return f15509e.a(str);
    }

    public final Charset c(Charset charset) {
        String f4 = f(HttpRequest.PARAM_CHARSET);
        if (f4 == null) {
            return charset;
        }
        try {
            return Charset.forName(f4);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v) || !o.a(((v) obj).f15512a, this.f15512a)) {
            return false;
        }
        return true;
    }

    public final String f(String str) {
        o.e(str, "name");
        int i4 = 0;
        int b4 = C0854c.b(0, this.f15515d.length - 1, 2);
        if (b4 < 0) {
            return null;
        }
        while (true) {
            int i5 = i4 + 2;
            if (kotlin.text.o.v(this.f15515d[i4], str, true)) {
                return this.f15515d[i4 + 1];
            }
            if (i4 == b4) {
                return null;
            }
            i4 = i5;
        }
    }

    public final String g() {
        return this.f15513b;
    }

    public int hashCode() {
        return this.f15512a.hashCode();
    }

    public String toString() {
        return this.f15512a;
    }

    private v(String str, String str2, String str3, String[] strArr) {
        this.f15512a = str;
        this.f15513b = str2;
        this.f15514c = str3;
        this.f15515d = strArr;
    }
}
