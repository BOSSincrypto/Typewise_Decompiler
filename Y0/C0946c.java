package y0;

import B2.h;
import E0.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.collections.L;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import u2.l;

/* renamed from: y0.c  reason: case insensitive filesystem */
public abstract class C0946c {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f16455a = L.h('!', '(', ')', '{', '}', '[', ']', '|', ':', ';', '\"', '.', '?');

    /* renamed from: b  reason: collision with root package name */
    private static final Set f16456b = L.h('!', '.', '?', 10, 13);

    /* renamed from: c  reason: collision with root package name */
    private static final List f16457c = C0718m.m("'", "-");

    /* renamed from: d  reason: collision with root package name */
    private static final Regex f16458d = new Regex("([0-9]{1,2}[\\.\\- ]([0-9]{1,2}|[A-Za-zÀ-ÖØ-öø-ÿ]*)[\\.\\- ]([0-9]{4}|[0-9]{2}))");

    /* renamed from: e  reason: collision with root package name */
    private static final Regex f16459e = new Regex("((https?:\\/\\/)|(www\\.)){1}[-a-zA-Z0-9@:%._\\+~#=\\u2011]{2,256}\\.[a-z]{2,4}\\b([-a-zA-Z0-9@:%_\\+.~#?&\\/\\/=\\u2011]*)");

    /* renamed from: f  reason: collision with root package name */
    private static final Regex f16460f = new Regex("[\\u2011\\w.+-]+@[\\u2011\\w\\.-]+\\.\\w+");

    /* renamed from: g  reason: collision with root package name */
    private static final Regex f16461g = new Regex("\\p{L}+(?:[-']\\p{L}+)+|(?<!')\\p{L}+'|\\p{L}+");

    /* renamed from: h  reason: collision with root package name */
    private static final Regex f16462h = new Regex("\\p{L}+(?:[-']\\p{L}+)+|(?<!')\\p{L}+'|\\p{L}+|[^\\p{L}\\s]+|\\r\\n|\\r|\\n");

    /* renamed from: i  reason: collision with root package name */
    private static final Regex f16463i = new Regex("&nbsp;|[\\t\\u000B\\f\\u00a0\\u1680\\u2000\\u2001\\u2002\\u2003\\u2004\\u2005\\u2006\\u2007\\u2008\\u2009\\u200a\\u2028\\u2029\\u3000]");

    /* renamed from: j  reason: collision with root package name */
    private static final Regex f16464j = new Regex("[\\r\\u200b\\u200c\\u200d\\ufeff]");

    public static final Integer a(String str, int i4) {
        o.e(str, "text");
        if (i4 < 0 || i4 > str.length()) {
            return null;
        }
        int i5 = i4 - 1;
        while (i5 >= 0 && str.charAt(i5) == ' ') {
            i5--;
        }
        if (i5 == -1) {
            return null;
        }
        return Integer.valueOf(i5);
    }

    public static final Pair b(String str, boolean z3) {
        o.e(str, "context");
        String o4 = s.o(str, -200, (Integer) null, 2, (Object) null);
        List m4 = m(o4, z3);
        if (m4.isEmpty() || ((Number) ((Pair) C0718m.b0(m4)).getSecond()).intValue() < o4.length()) {
            return new Pair(str, "");
        }
        int length = (str.length() - o4.length()) + ((Number) ((Pair) C0718m.b0(m4)).getFirst()).intValue();
        return new Pair(s.n(str, 0, Integer.valueOf(length)), s.o(str, length, (Integer) null, 2, (Object) null));
    }

    public static /* synthetic */ Pair c(String str, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = true;
        }
        return b(str, z3);
    }

    public static final Set d() {
        return f16455a;
    }

    public static final Regex e() {
        return f16460f;
    }

    public static final String f(String str, int i4) {
        int i5;
        String str2 = str;
        o.e(str2, "context");
        String str3 = (String) C0718m.b0(kotlin.text.o.t0((CharSequence) C0718m.b0(kotlin.text.o.t0((CharSequence) C0718m.b0(kotlin.text.o.t0((CharSequence) C0718m.b0(kotlin.text.o.t0((CharSequence) C0718m.b0(kotlin.text.o.t0(str2, new String[]{"\n"}, false, 0, 6, (Object) null)), new String[]{"."}, false, 0, 6, (Object) null)), new String[]{"!"}, false, 0, 6, (Object) null)), new String[]{"?"}, false, 0, 6, (Object) null)), new String[]{":"}, false, 0, 6, (Object) null));
        int i6 = 0;
        if (!kotlin.text.o.u(str3, " ", false, 2, (Object) null)) {
            i5 = i4 + 1;
        } else {
            i5 = i4;
        }
        ArrayList arrayList = new ArrayList();
        for (String str4 : C0718m.k0(kotlin.text.o.t0(str3, new String[]{" "}, false, 0, 6, (Object) null))) {
            if (!o.a(str4, "")) {
                i6++;
            }
            arrayList.add(str4);
            if (i6 == i5) {
                break;
            }
        }
        return C0718m.Z(C0718m.k0(arrayList), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
    }

    public static final int g(String str) {
        o.e(str, "<this>");
        int length = str.length();
        while (true) {
            length--;
            if (-1 >= length) {
                return -1;
            }
            if (f16456b.contains(Character.valueOf(str.charAt(length)))) {
                return length;
            }
        }
    }

    public static final String h(String str, boolean z3) {
        o.e(str, "<this>");
        return (String) b(str, z3).getSecond();
    }

    public static /* synthetic */ String i(String str, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = true;
        }
        return h(str, z3);
    }

    public static final Regex j() {
        return f16459e;
    }

    public static final Set k() {
        return f16456b;
    }

    public static final Regex l() {
        return f16461g;
    }

    public static final List m(String str, boolean z3) {
        Regex regex;
        o.e(str, "text");
        if (z3) {
            regex = f16461g;
        } else {
            regex = f16462h;
        }
        List<kotlin.text.l> o4 = h.o(Regex.findAll$default(regex, str, 0, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C0718m.t(o4, 10));
        for (kotlin.text.l lVar : o4) {
            arrayList.add(new Pair(Integer.valueOf(lVar.b().b()), Integer.valueOf(lVar.b().c() + 1)));
        }
        return arrayList;
    }

    public static /* synthetic */ List n(String str, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = true;
        }
        return m(str, z3);
    }

    public static final boolean o(String str) {
        o.e(str, "<this>");
        if (str.length() == 0 || !Character.isLetter(str.charAt(0)) || !Character.isUpperCase(str.charAt(0))) {
            return false;
        }
        String substring = str.substring(1);
        o.d(substring, "substring(...)");
        int length = substring.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = substring.charAt(i4);
            if (Character.isLetter(charAt) && Character.isUpperCase(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean p(String str) {
        o.e(str, "char");
        if (Character.isLetter(str.charAt(0)) || f16457c.contains(str)) {
            return true;
        }
        return false;
    }

    public static final boolean q(String str, List list) {
        o.e(str, "char");
        o.e(list, "stopTokens");
        if (p(str) || list.contains(str)) {
            return true;
        }
        return false;
    }

    public static final boolean r(String str, List list) {
        o.e(str, "token");
        o.e(list, "stopTokens");
        for (int i4 = 0; i4 < str.length(); i4++) {
            if (!q(String.valueOf(str.charAt(i4)), list)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean s(String str) {
        o.e(str, "<this>");
        List n4 = n(str, false, 2, (Object) null);
        if (n4.size() == 1 && ((Number) ((Pair) n4.get(0)).getFirst()).intValue() == 0 && ((Number) ((Pair) n4.get(0)).getSecond()).intValue() == str.length()) {
            return true;
        }
        return false;
    }

    public static final String t(String str) {
        o.e(str, "text");
        return u(x(str));
    }

    public static final String u(String str) {
        o.e(str, "text");
        return f16464j.replace((CharSequence) str, "");
    }

    public static final String v(String str, List list, String str2) {
        o.e(str, "text");
        o.e(list, "regexes");
        o.e(str2, "replacement");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            str = ((Regex) it.next()).replace((CharSequence) str, str2);
        }
        return str;
    }

    public static /* synthetic */ String w(String str, List list, String str2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str2 = "";
        }
        return v(str, list, str2);
    }

    public static final String x(String str) {
        o.e(str, "text");
        return f16463i.replace((CharSequence) str, " ");
    }
}
