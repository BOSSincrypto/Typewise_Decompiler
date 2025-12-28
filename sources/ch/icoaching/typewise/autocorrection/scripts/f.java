package ch.icoaching.typewise.autocorrection.scripts;

import C0.c;
import E0.s;
import ch.icoaching.typewise.autocorrection.helpers.correction_choices.CorrectionChoices;
import com.getcapacitor.Bridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Triple;
import kotlin.collections.C0718m;
import kotlin.collections.L;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import r0.d;

public class f {

    /* renamed from: o  reason: collision with root package name */
    public static final a f8068o = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private String f8069a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8070b;

    /* renamed from: c  reason: collision with root package name */
    private Set f8071c = L.h(" ", " ", "\\", "/", "+", "=", "&", "-", "\n", "\r");

    /* renamed from: d  reason: collision with root package name */
    private final Set f8072d = L.h('!', '?', '.', 10, 13);

    /* renamed from: e  reason: collision with root package name */
    private Set f8073e = L.h('\"', '\'', '(', '[', '{', 161, 191, 8222, 8216, 8217, 171, 187, '<', '>', '-', 8211, '*');

    /* renamed from: f  reason: collision with root package name */
    private final Set f8074f = L.h('\'', '\"', ')', ']', '}', ',', ';', '.', ':', '!', '?', 8220, 8221, 8216, 8217, 171, 187, '<', '>', 8230, 8594, 8592, 8596, 8658, 8656, 8660, 8804, 8805, 8800, 8776, 8605, 8604, 8211, 8212, '*');

    /* renamed from: g  reason: collision with root package name */
    private final Set f8075g;

    /* renamed from: h  reason: collision with root package name */
    private final Set f8076h;

    /* renamed from: i  reason: collision with root package name */
    private Set f8077i;

    /* renamed from: j  reason: collision with root package name */
    private Set f8078j;

    /* renamed from: k  reason: collision with root package name */
    private Regex f8079k;

    /* renamed from: l  reason: collision with root package name */
    private final Regex f8080l;

    /* renamed from: m  reason: collision with root package name */
    private final Regex f8081m;

    /* renamed from: n  reason: collision with root package name */
    private final c f8082n;

    public static final class a {
        private a() {
        }

        public final String a(String str) {
            o.e(str, "stringIn");
            String str2 = str;
            String substring = str.substring(Math.max(kotlin.text.o.b0(str2, " ", 0, false, 6, (Object) null), kotlin.text.o.b0(str2, "\n", 0, false, 6, (Object) null)) + 1);
            o.d(substring, "substring(...)");
            return substring;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public f(String str, boolean z3, boolean z4) {
        Regex regex;
        this.f8069a = str;
        this.f8070b = z3;
        Set h4 = L.h(' ', '\\', '/', '+', '=', ',', '\"', ']', '}', '>', ')', '&', '-', 8594, 8592, 8596, 8658, 8656, 8660, 8804, 8805, 8800, 8776, 8605, 8604, 8211, 8212);
        this.f8075g = h4;
        this.f8076h = L.h("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "#", " ");
        this.f8077i = L.e();
        this.f8078j = L.e();
        this.f8079k = new Regex(" |\\\\|\\/|\\+|=|&|-|\\n|\\r");
        this.f8080l = new Regex(C0718m.Z(h4, "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new e(), 30, (Object) null));
        if (!z4) {
            regex = new Regex("[^-'’a-zÀ-ÿžàấӑāąăćčĉđďệēęėěĝģğĥīįıĵķŀɫļĺľłńňņn̈ởōœőơřŕśšŝşșțťţűūųůưŭżź.,?!¡¿]");
        }
        this.f8081m = regex;
        this.f8082n = new c();
        j();
    }

    public static /* synthetic */ d A(f fVar, String str, boolean z3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                z3 = true;
            }
            return fVar.z(str, z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stripWord");
    }

    public static /* synthetic */ boolean d(f fVar, String str, int i4, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 2) != 0) {
                i4 = 4;
            }
            if ((i6 & 4) != 0) {
                i5 = 25;
            }
            return fVar.c(str, i4, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkForFirstLineNames");
    }

    /* access modifiers changed from: private */
    public static final CharSequence h(char c4) {
        return Regex.Companion.c(String.valueOf(c4));
    }

    public static /* synthetic */ Triple u(f fVar, String str, boolean z3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                z3 = true;
            }
            return fVar.t(str, z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stripBeginning");
    }

    public final boolean b(String str) {
        o.e(str, "stringInput");
        for (int i4 = 0; i4 < str.length(); i4++) {
            if (n(String.valueOf(str.charAt(i4)))) {
                return true;
            }
        }
        return false;
    }

    public boolean c(String str, int i4, int i5) {
        o.e(str, "stringIn");
        String[] s4 = s(s.o(str, (-i5) * i4, (Integer) null, 2, (Object) null));
        ArrayList arrayList = new ArrayList();
        for (String str2 : s4) {
            if (str2.length() > 0) {
                arrayList.add(str2);
            }
        }
        int size = arrayList.size();
        return size > 1 && size <= i4 && (!kotlin.text.o.L(str, "\n", false, 2, (Object) null) || kotlin.text.o.T0(str) == 10) && s.i((String) C0718m.b0(arrayList));
    }

    public boolean e(String str) {
        o.e(str, "stringIn");
        Regex regex = this.f8081m;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        return regex.containsMatchIn(lowerCase);
    }

    public final Set f() {
        return this.f8073e;
    }

    public final String g(String str, int i4) {
        o.e(str, "stringInput");
        String obj = kotlin.text.o.M0(this.f8080l.replace((CharSequence) s.n(str, 0, Integer.valueOf(i4)), " ")).toString();
        if (obj.length() <= 0) {
            return obj;
        }
        return obj + " ";
    }

    public final Set i() {
        return this.f8078j;
    }

    public final void j() {
        Set h4;
        String str = this.f8069a;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3241) {
                if (hashCode != 3276) {
                    if (hashCode == 3371 && str.equals("it")) {
                        h4 = L.h("dell'", "Dell'", "DELL'", "nell'", "Nell'", "NELL'", "all'", "All'", "ALL'", "sull'", "Sull'", "SULL'", "coll'", "Coll'", "COLL'", "gl'", "Gl'", "GL'", "l'", "L'", "m'", "M'", "un'", "Un'", "UN'");
                    } else {
                        return;
                    }
                } else if (str.equals("fr")) {
                    h4 = L.h("l'", "L'", "c'", "C'", "d'", "D'", "s'", "S'", "n'", "N'", "j'", "J'", "m'", "M'", "t'", "T'", "qu'", "Qu'", "QU'");
                } else {
                    return;
                }
                this.f8077i = h4;
            } else if (str.equals("en")) {
                this.f8078j = L.h("'s", "'S");
            }
        }
    }

    public final List k(String str, int i4, int i5) {
        o.e(str, "stringIn");
        ArrayList arrayList = new ArrayList();
        List<Number> l4 = l(str, i4, i5);
        int i6 = 0;
        for (Number intValue : l4) {
            int i7 = i6 + 1;
            int intValue2 = intValue.intValue();
            String substring = i6 == l4.size() + -1 ? str.substring(intValue2) : str.substring(intValue2, ((Number) l4.get(i7)).intValue() - 1);
            o.d(substring, "substring(...)");
            arrayList.add(substring);
            i6 = i7;
        }
        return arrayList;
    }

    public List l(String str, int i4, int i5) {
        o.e(str, "stringIn");
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            if (this.f8071c.contains(String.valueOf(str.charAt((str.length() - i6) - 1)))) {
                arrayList.add(Integer.valueOf(str.length() - i6));
                i7++;
            }
            if (i6 <= i5 && i7 != i4) {
                i6++;
            } else if (arrayList.size() <= 0) {
                return C0718m.e(0);
            } else {
                C0718m.I(arrayList);
                return arrayList;
            }
        }
        arrayList.add(0);
        C0718m.I(arrayList);
        return arrayList;
    }

    public final Set m() {
        return this.f8077i;
    }

    public boolean n(String str) {
        o.e(str, "text");
        if (this.f8071c.contains(str)) {
            return true;
        }
        return this.f8082n.a(str);
    }

    public boolean o(String str) {
        o.e(str, "stringIn");
        if (str.length() == 0) {
            return false;
        }
        String lowerCase = f8068o.a(kotlin.text.o.R0(str, 1)).toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        String g4 = A(this, lowerCase, false, 2, (Object) null).g();
        return kotlin.text.o.G(g4, "www", false, 2, (Object) null) || kotlin.text.o.G(g4, Bridge.CAPACITOR_HTTP_SCHEME, false, 2, (Object) null);
    }

    public final boolean p(String str) {
        o.e(str, "context");
        return this.f8082n.b(str);
    }

    public final CorrectionChoices q(String str) {
        o.e(str, "stringIn");
        String c4 = this.f8082n.c(str);
        if (c4.length() == 0 || !this.f8071c.contains(String.valueOf(kotlin.text.o.T0(c4)))) {
            return CorrectionChoices.NO_TRIGGER;
        }
        if (c4.length() > 1 && this.f8071c.contains(String.valueOf(s.l(c4, -2)))) {
            return CorrectionChoices.MULTI_TRIGGER;
        }
        if (o(str)) {
            return CorrectionChoices.URL_FOUND;
        }
        return (this.f8070b || !d(this, str, 0, 0, 6, (Object) null)) ? CorrectionChoices.SINGLE_TRIGGER : CorrectionChoices.FIRST_LINE_NAME;
    }

    public final void r(String str) {
        o.e(str, "language");
        this.f8069a = str;
    }

    public String[] s(String str) {
        o.e(str, "text");
        return this.f8082n.d(str);
    }

    public Triple t(String str, boolean z3) {
        String str2;
        o.e(str, "word");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (!this.f8073e.contains(Character.valueOf(charAt))) {
                break;
            }
            sb.append(charAt);
        }
        String substring = str.substring(sb.length());
        o.d(substring, "substring(...)");
        if (z3) {
            String sb2 = sb.toString();
            o.d(sb2, "toString(...)");
            Triple x3 = x(substring, sb2);
            sb = new StringBuilder((String) x3.getSecond());
            String str3 = (String) x3.getFirst();
            str2 = (String) x3.getThird();
            substring = str3;
        } else {
            str2 = null;
        }
        return new Triple(substring, sb.toString(), str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.Triple v(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r0 = "word"
            kotlin.jvm.internal.o.e(r6, r0)
            int r0 = r6.length()
            r1 = -1
            r2 = r1
        L_0x000b:
            int r3 = java.lang.Math.abs(r2)
            int r4 = r0 + 1
            if (r3 >= r4) goto L_0x0027
            java.util.Set r3 = r5.f8074f
            char r4 = E0.s.l(r6, r2)
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x0024
            goto L_0x0027
        L_0x0024:
            int r2 = r2 + -1
            goto L_0x000b
        L_0x0027:
            r0 = 0
            if (r2 >= r1) goto L_0x003b
            int r2 = r2 + 1
            r1 = 2
            java.lang.String r1 = E0.s.o(r6, r2, r0, r1, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            java.lang.String r6 = E0.s.n(r6, r3, r2)
            goto L_0x003d
        L_0x003b:
            java.lang.String r1 = ""
        L_0x003d:
            if (r7 == 0) goto L_0x0058
            kotlin.Triple r6 = r5.w(r6, r1)
            java.lang.Object r7 = r6.getFirst()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r6.getSecond()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r6 = r6.getThird()
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
            r6 = r7
        L_0x0058:
            kotlin.Triple r7 = new kotlin.Triple
            r7.<init>(r6, r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.scripts.f.v(java.lang.String, boolean):kotlin.Triple");
    }

    public final Triple w(String str, String str2) {
        o.e(str, "word");
        o.e(str2, "endSpecial");
        for (String str3 : this.f8078j) {
            if (kotlin.text.o.u(str, str3, false, 2, (Object) null)) {
                return new Triple(s.n(str, 0, Integer.valueOf(-str3.length())), str3 + str2, str3);
            }
        }
        return new Triple(str, str2, null);
    }

    public final Triple x(String str, String str2) {
        o.e(str, "word");
        o.e(str2, "beginSpecial");
        String str3 = "";
        loop0:
        while (true) {
            Set<String> set = this.f8077i;
            if ((set instanceof Collection) && set.isEmpty()) {
                break;
            }
            for (String G3 : set) {
                if (kotlin.text.o.G(str, G3, false, 2, (Object) null)) {
                    Iterator it = this.f8077i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str4 = (String) it.next();
                        if (kotlin.text.o.G(str, str4, false, 2, (Object) null)) {
                            str2 = str2 + str4;
                            str3 = str3 + str4;
                            str = str.substring(str4.length());
                            o.d(str, "substring(...)");
                            break;
                        }
                    }
                }
            }
            break loop0;
        }
        if (str3.length() == 0) {
            str3 = null;
        }
        return new Triple(str, str2, str3);
    }

    public final String y(String str) {
        o.e(str, "context");
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < str.length(); i6++) {
            boolean n4 = n(String.valueOf(str.charAt(i6)));
            if (z3) {
                i5 = n4 ? i5 + 1 : 0;
            } else if (n4) {
                i4++;
            } else {
                z3 = true;
            }
        }
        return s.n(str, i4, Integer.valueOf(str.length() - i5));
    }

    public d z(String str, boolean z3) {
        o.e(str, "word");
        Triple t4 = t(str, z3);
        Triple v3 = v((String) t4.getFirst(), z3);
        String lowerCase = ((String) v3.getFirst()).toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        return new d((String) v3.getFirst(), lowerCase, (String) t4.getSecond(), (String) v3.getSecond(), (String) t4.getThird(), (String) v3.getThird());
    }
}
