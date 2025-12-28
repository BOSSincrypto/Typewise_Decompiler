package Y1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private char[] f2030a;

    /* renamed from: b  reason: collision with root package name */
    private int f2031b;

    /* renamed from: c  reason: collision with root package name */
    private StringBuilder f2032c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2033d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2034e;

    /* renamed from: f  reason: collision with root package name */
    Map f2035f;

    /* renamed from: g  reason: collision with root package name */
    String f2036g;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    public m(String str) {
        this(str, false);
    }

    private int A() {
        char c4;
        int length = this.f2032c.length();
        Map i4 = i();
        if (i4.isEmpty()) {
            return length;
        }
        boolean z3 = true;
        for (Map.Entry entry : i4.entrySet()) {
            if (z3) {
                c4 = '@';
            } else {
                c4 = ';';
            }
            b(c4);
            c((String) entry.getKey());
            b('=');
            c((String) entry.getValue());
            z3 = false;
        }
        if (!z3) {
            return length + 1;
        }
        return length;
    }

    private int B() {
        String h4;
        int length = this.f2032c.length();
        if (r()) {
            b(com.ibm.icu.impl.locale.a.i(this.f2030a[0]));
            b('-');
            this.f2031b = 2;
        }
        while (true) {
            char x3 = x();
            if (w(x3)) {
                break;
            }
            b(com.ibm.icu.impl.locale.a.i(x3));
        }
        this.f2031b--;
        if (this.f2032c.length() - length == 3 && (h4 = n.h(o(0))) != null) {
            F(0, h4);
        }
        return 0;
    }

    private int C() {
        if (d()) {
            return this.f2032c.length();
        }
        int i4 = this.f2031b;
        this.f2031b = i4 + 1;
        int length = this.f2032c.length();
        boolean z3 = true;
        while (true) {
            char x3 = x();
            if (w(x3) || !com.ibm.icu.impl.locale.a.c(x3)) {
                int i5 = this.f2031b - 1;
                this.f2031b = i5;
            } else if (z3) {
                a();
                b(com.ibm.icu.impl.locale.a.l(x3));
                z3 = false;
            } else {
                b(com.ibm.icu.impl.locale.a.i(x3));
            }
        }
        int i52 = this.f2031b - 1;
        this.f2031b = i52;
        if (i52 - i4 == 5) {
            return length + 1;
        }
        this.f2031b = i4;
        StringBuilder sb = this.f2032c;
        sb.delete(length, sb.length());
        return length;
    }

    private int D() {
        int length = this.f2032c.length();
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = false;
        while (true) {
            char x3 = x();
            if (x3 == 65535) {
                break;
            }
            if (x3 == '.') {
                z6 = true;
            } else if (x3 != '@') {
                char c4 = '_';
                if (z3) {
                    if (!(x3 == '_' || x3 == '-')) {
                        this.f2031b--;
                    }
                } else if (!z6) {
                    if (z4) {
                        if (z5 && !this.f2034e) {
                            a();
                            length++;
                        }
                        a();
                        if (z5) {
                            length++;
                            z4 = false;
                            z5 = false;
                        } else {
                            z4 = false;
                        }
                    }
                    char l4 = com.ibm.icu.impl.locale.a.l(x3);
                    if (!(l4 == '-' || l4 == ',')) {
                        c4 = l4;
                    }
                    b(c4);
                }
            } else if (s()) {
                break;
            } else {
                z4 = true;
                z3 = false;
                z6 = false;
            }
            z3 = false;
        }
        this.f2031b--;
        return length;
    }

    private void E() {
        this.f2031b = 0;
        this.f2032c = new StringBuilder(this.f2030a.length + 5);
    }

    private void F(int i4, String str) {
        StringBuilder sb = this.f2032c;
        sb.delete(i4, sb.length());
        this.f2032c.insert(i4, str);
    }

    private void I(String str, String str2, boolean z3) {
        if (str != null) {
            String j4 = com.ibm.icu.impl.locale.a.j(str.trim());
            if (j4.length() != 0) {
                if (str2 != null) {
                    str2 = str2.trim();
                    if (str2.length() == 0) {
                        throw new IllegalArgumentException("value must not be empty");
                    }
                }
                Map i4 = i();
                if (i4.isEmpty()) {
                    if (str2 != null) {
                        TreeMap treeMap = new TreeMap(g());
                        this.f2035f = treeMap;
                        treeMap.put(j4, str2.trim());
                    }
                } else if (!z3 && i4.containsKey(j4)) {
                } else {
                    if (str2 != null) {
                        i4.put(j4, str2);
                        return;
                    }
                    i4.remove(j4);
                    if (i4.isEmpty()) {
                        this.f2035f = Collections.emptyMap();
                    }
                }
            } else {
                throw new IllegalArgumentException("keyword must not be empty");
            }
        } else if (z3) {
            this.f2035f = Collections.emptyMap();
        }
    }

    private boolean J() {
        int i4 = this.f2031b;
        while (true) {
            char[] cArr = this.f2030a;
            if (i4 >= cArr.length) {
                return false;
            }
            if (cArr[i4] != '@') {
                i4++;
            } else if (this.f2033d) {
                int i5 = i4 + 1;
                int i6 = i5;
                while (true) {
                    char[] cArr2 = this.f2030a;
                    if (i6 >= cArr2.length) {
                        return false;
                    }
                    if (cArr2[i6] == '=') {
                        this.f2031b = i5;
                        return true;
                    }
                    i6++;
                }
            } else {
                int i7 = i4 + 1;
                if (i7 >= cArr.length) {
                    return false;
                }
                this.f2031b = i7;
                return true;
            }
        }
    }

    private void K() {
        if (!d()) {
            char[] cArr = this.f2030a;
            int i4 = this.f2031b;
            char c4 = cArr[i4];
            if (c4 == '_' || c4 == '-') {
                this.f2031b = i4 + 1;
            }
            int i5 = this.f2031b;
            N();
            int i6 = this.f2031b - i5;
            if (i6 < 2 || i6 > 3) {
                this.f2031b = i5;
            }
        }
    }

    private void L() {
        if (r()) {
            this.f2031b = 2;
        }
        N();
    }

    private void M() {
        char x3;
        if (!d()) {
            int i4 = this.f2031b;
            this.f2031b = i4 + 1;
            do {
                x3 = x();
                if (w(x3) || !com.ibm.icu.impl.locale.a.c(x3)) {
                    int i5 = this.f2031b - 1;
                    this.f2031b = i5;
                }
                x3 = x();
                break;
            } while (!com.ibm.icu.impl.locale.a.c(x3));
            int i52 = this.f2031b - 1;
            this.f2031b = i52;
            if (i52 - i4 != 5) {
                this.f2031b = i4;
            }
        }
    }

    private void N() {
        do {
        } while (!w(x()));
        this.f2031b--;
    }

    private void a() {
        b('_');
    }

    private void b(char c4) {
        this.f2032c.append(c4);
    }

    private void c(String str) {
        this.f2032c.append(str);
    }

    private boolean d() {
        int i4 = this.f2031b;
        char[] cArr = this.f2030a;
        if (i4 >= cArr.length || v(cArr[i4])) {
            return true;
        }
        return false;
    }

    private Comparator g() {
        return new a();
    }

    private String h() {
        int i4 = this.f2031b;
        do {
        } while (!u(x()));
        int i5 = this.f2031b - 1;
        this.f2031b = i5;
        return com.ibm.icu.impl.locale.a.j(new String(this.f2030a, i4, i5 - i4).trim());
    }

    private String o(int i4) {
        return this.f2032c.substring(i4);
    }

    private String p() {
        int i4 = this.f2031b;
        do {
        } while (!t(x()));
        int i5 = this.f2031b - 1;
        this.f2031b = i5;
        return new String(this.f2030a, i4, i5 - i4).trim();
    }

    private boolean r() {
        char[] cArr = this.f2030a;
        if (cArr.length <= 2) {
            return false;
        }
        char c4 = cArr[1];
        if (c4 != '-' && c4 != '_') {
            return false;
        }
        char c5 = cArr[0];
        if (c5 == 'x' || c5 == 'X' || c5 == 'i' || c5 == 'I') {
            return true;
        }
        return false;
    }

    private boolean s() {
        int i4 = this.f2031b;
        while (true) {
            char[] cArr = this.f2030a;
            if (i4 >= cArr.length) {
                return false;
            }
            if (cArr[i4] == '=') {
                return true;
            }
            i4++;
        }
    }

    private static boolean t(char c4) {
        if (c4 == 65535 || c4 == ';') {
            return true;
        }
        return false;
    }

    private static boolean u(char c4) {
        if (c4 == 65535 || c4 == '=') {
            return true;
        }
        return false;
    }

    private boolean v(char c4) {
        if (c4 == '@' || c4 == 65535 || c4 == '.') {
            return true;
        }
        return false;
    }

    private boolean w(char c4) {
        if (c4 == '_' || c4 == '-' || v(c4)) {
            return true;
        }
        return false;
    }

    private char x() {
        int i4 = this.f2031b;
        char[] cArr = this.f2030a;
        if (i4 == cArr.length) {
            this.f2031b = i4 + 1;
            return 65535;
        }
        this.f2031b = i4 + 1;
        return cArr[i4];
    }

    private int z() {
        String i4;
        if (d()) {
            return this.f2032c.length();
        }
        int i5 = this.f2031b;
        this.f2031b = i5 + 1;
        int length = this.f2032c.length();
        boolean z3 = true;
        while (true) {
            char x3 = x();
            if (w(x3)) {
                break;
            }
            if (z3) {
                this.f2034e = true;
                a();
                length++;
                z3 = false;
            }
            b(com.ibm.icu.impl.locale.a.l(x3));
        }
        this.f2031b--;
        int length2 = this.f2032c.length() - length;
        if (length2 == 0) {
            return length;
        }
        if (length2 < 2 || length2 > 3) {
            this.f2031b = i5;
            int i6 = length - 1;
            StringBuilder sb = this.f2032c;
            sb.delete(i6, sb.length());
            this.f2034e = false;
            return i6;
        } else if (length2 != 3 || (i4 = n.i(o(length))) == null) {
            return length;
        } else {
            F(length, i4);
            return length;
        }
    }

    public void G(String str) {
        this.f2036g = str;
    }

    public void H(String str, String str2) {
        I(str, str2, true);
    }

    public String e() {
        String str = this.f2036g;
        if (str != null) {
            return str;
        }
        y();
        return o(0);
    }

    public String f() {
        E();
        L();
        M();
        return o(z());
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.Map] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r3 != false) goto L_0x0045;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map i() {
        /*
            r4 = this;
            java.util.Map r0 = r4.f2035f
            if (r0 != 0) goto L_0x0056
            boolean r0 = r4.J()
            r1 = 0
            if (r0 == 0) goto L_0x004d
        L_0x000b:
            java.lang.String r0 = r4.h()
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0016
            goto L_0x004d
        L_0x0016:
            char r2 = r4.x()
            r3 = 61
            if (r2 == r3) goto L_0x0024
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r0) goto L_0x0045
            goto L_0x004d
        L_0x0024:
            java.lang.String r2 = r4.p()
            int r3 = r2.length()
            if (r3 != 0) goto L_0x002f
            goto L_0x0045
        L_0x002f:
            if (r1 != 0) goto L_0x003b
            java.util.TreeMap r1 = new java.util.TreeMap
            java.util.Comparator r3 = r4.g()
            r1.<init>(r3)
            goto L_0x0042
        L_0x003b:
            boolean r3 = r1.containsKey(r0)
            if (r3 == 0) goto L_0x0042
            goto L_0x0045
        L_0x0042:
            r1.put(r0, r2)
        L_0x0045:
            char r0 = r4.x()
            r2 = 59
            if (r0 == r2) goto L_0x000b
        L_0x004d:
            if (r1 == 0) goto L_0x0050
            goto L_0x0054
        L_0x0050:
            java.util.Map r1 = java.util.Collections.emptyMap()
        L_0x0054:
            r4.f2035f = r1
        L_0x0056:
            java.util.Map r0 = r4.f2035f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.m.i():java.util.Map");
    }

    public String j(String str) {
        Map i4 = i();
        if (i4.isEmpty()) {
            return null;
        }
        return (String) i4.get(com.ibm.icu.impl.locale.a.j(str.trim()));
    }

    public Iterator k() {
        Map i4 = i();
        if (i4.isEmpty()) {
            return null;
        }
        return i4.keySet().iterator();
    }

    public String l() {
        E();
        return o(B());
    }

    public String m() {
        y();
        A();
        return o(0);
    }

    public String n() {
        E();
        L();
        return o(C());
    }

    public String q() {
        E();
        L();
        M();
        K();
        return o(D());
    }

    public void y() {
        String str = this.f2036g;
        if (str != null) {
            F(0, str);
            return;
        }
        E();
        B();
        C();
        z();
        D();
        int length = this.f2032c.length();
        if (length > 0) {
            int i4 = length - 1;
            if (this.f2032c.charAt(i4) == '_') {
                this.f2032c.deleteCharAt(i4);
            }
        }
    }

    public m(String str, boolean z3) {
        char[] charArray = str.toCharArray();
        this.f2030a = charArray;
        this.f2031b = 0;
        this.f2032c = new StringBuilder(charArray.length + 5);
        this.f2033d = z3;
    }
}
