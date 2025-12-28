package ch.icoaching.wrio.input;

import ch.icoaching.wrio.Y;
import ch.icoaching.wrio.Z;
import ch.icoaching.wrio.r;
import ch.icoaching.wrio.util.Pair;
import e3.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import l2.q;

public final class g implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Map f9781a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f9782b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map f9783c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map f9784d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map f9785e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final Map f9786f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final Map f9787g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private final Map f9788h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private final Set f9789i = new HashSet();

    /* renamed from: j  reason: collision with root package name */
    private final Map f9790j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private final Map f9791k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    private final Map f9792l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    private final Object f9793m = new Object();

    public Integer A(String str, int i4) {
        o.e(str, "word");
        return (Integer) Y.b(this.f9783c, str, Integer.valueOf(i4));
    }

    public Integer B(String str, int i4) {
        o.e(str, "word");
        return (Integer) Y.b(this.f9782b, str, Integer.valueOf(i4));
    }

    public Integer C(String str, int i4) {
        o.e(str, "word");
        return (Integer) Y.b(this.f9786f, str, Integer.valueOf(i4));
    }

    public void D(String str, int i4) {
        if (str != null) {
            Locale locale = Locale.getDefault();
            o.d(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            o.d(lowerCase, "toLowerCase(...)");
            String d4 = Z.d(lowerCase);
            synchronized (this.f9793m) {
                try {
                    for (Pair pair : (List) Y.b(this.f9791k, d4, new ArrayList())) {
                        Integer num = (Integer) this.f9792l.get(pair);
                        if (num != null && num.intValue() >= i4) {
                            this.f9792l.put(pair, Integer.valueOf(num.intValue() - i4));
                        }
                    }
                    for (Pair pair2 : (List) Y.b(this.f9790j, d4, new ArrayList())) {
                        Integer num2 = (Integer) this.f9792l.get(pair2);
                        if (num2 != null && num2.intValue() >= i4) {
                            this.f9792l.put(pair2, Integer.valueOf(num2.intValue() - i4));
                        }
                    }
                    q qVar = q.f14567a;
                } finally {
                }
            }
        }
    }

    public void E(String str, int i4) {
        if (str != null) {
            Locale locale = Locale.getDefault();
            o.d(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            o.d(lowerCase, "toLowerCase(...)");
            String d4 = Z.d(lowerCase);
            this.f9784d.put(d4, Integer.valueOf(((Integer) Y.b(this.f9784d, d4, 0)).intValue() + i4));
        }
    }

    public void F(String str, int i4) {
        if (str != null) {
            Locale locale = Locale.getDefault();
            o.d(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            o.d(lowerCase, "toLowerCase(...)");
            String d4 = Z.d(lowerCase);
            this.f9786f.put(d4, Integer.valueOf(((Integer) Y.b(this.f9786f, d4, 0)).intValue() + i4));
        }
    }

    public Set a() {
        Set F02;
        synchronized (this.f9793m) {
            F02 = C0718m.F0(this.f9792l.entrySet());
            q qVar = q.f14567a;
        }
        return F02;
    }

    public List b() {
        return C0718m.B0(this.f9789i);
    }

    public void c() {
        this.f9787g.clear();
        this.f9784d.clear();
        this.f9785e.clear();
        this.f9786f.clear();
        this.f9781a.clear();
        this.f9782b.clear();
        this.f9783c.clear();
        this.f9788h.clear();
        this.f9789i.clear();
        synchronized (this.f9793m) {
            this.f9792l.clear();
            q qVar = q.f14567a;
        }
    }

    public void d() {
        r.a(this.f9781a);
        r.a(this.f9782b);
        r.a(this.f9783c);
        r.a(this.f9784d);
        r.a(this.f9785e);
        r.a(this.f9786f);
        r.a(this.f9787g);
    }

    public void e(String str, boolean z3) {
        s(str, z3, 1);
    }

    public void f(String str, String str2, int i4) {
        if (str != null && str2 != null) {
            Locale locale = Locale.getDefault();
            o.d(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            o.d(lowerCase, "toLowerCase(...)");
            String d4 = Z.d(lowerCase);
            Locale locale2 = Locale.getDefault();
            o.d(locale2, "getDefault(...)");
            String lowerCase2 = str2.toLowerCase(locale2);
            o.d(lowerCase2, "toLowerCase(...)");
            String d5 = Z.d(lowerCase2);
            Pair pair = new Pair(d4, d5);
            synchronized (this.f9793m) {
                try {
                    this.f9792l.put(pair, Integer.valueOf(((Integer) Y.b(this.f9792l, pair, 0)).intValue() + i4));
                    Object b4 = Y.b(this.f9791k, d4, new ArrayList());
                    o.d(b4, "fallbackGet(...)");
                    List list = (List) b4;
                    if (list.isEmpty()) {
                        this.f9791k.put(d4, list);
                    }
                    list.add(pair);
                    Object b5 = Y.b(this.f9790j, d5, new ArrayList());
                    o.d(b5, "fallbackGet(...)");
                    List list2 = (List) b5;
                    if (list2.isEmpty()) {
                        this.f9790j.put(d5, list2);
                    }
                    list2.add(pair);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ int g(String str, int i4) {
        return y(str, i4).intValue();
    }

    public void h(String str) {
        F(str, 1);
    }

    public void i(String str) {
        m(str, 1);
    }

    public void j(String str, String str2) {
        f(str, str2, 1);
    }

    public /* bridge */ /* synthetic */ int k(String str, int i4) {
        return w(str, i4).intValue();
    }

    public void l(String str) {
        E(str, 1);
    }

    public void m(String str, int i4) {
        if (str != null) {
            Locale locale = Locale.getDefault();
            o.d(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            o.d(lowerCase, "toLowerCase(...)");
            String d4 = Z.d(lowerCase);
            this.f9785e.put(d4, Integer.valueOf(((Integer) Y.b(this.f9785e, d4, 0)).intValue() + i4));
        }
    }

    public Set n(String str) {
        o.e(str, "currentText");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(h.b(this.f9787g, str));
        linkedHashSet.addAll(h.b(this.f9784d, str));
        ArrayList arrayList = new ArrayList();
        for (Object next : linkedHashSet) {
            if (!this.f9789i.contains((String) next)) {
                arrayList.add(next);
            }
        }
        return C0718m.F0(arrayList);
    }

    public /* bridge */ /* synthetic */ int o(String str, int i4) {
        return x(str, i4).intValue();
    }

    public /* bridge */ /* synthetic */ int p(String str, int i4) {
        return z(str, i4).intValue();
    }

    public /* bridge */ /* synthetic */ int q(String str, int i4) {
        return A(str, i4).intValue();
    }

    public void r(String str) {
        if (str != null) {
            Set set = this.f9789i;
            Locale locale = Locale.getDefault();
            o.d(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            o.d(lowerCase, "toLowerCase(...)");
            set.add(lowerCase);
        }
    }

    public void s(String str, boolean z3, int i4) {
        if (str != null && str.length() != 0) {
            Locale locale = Locale.getDefault();
            o.d(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            o.d(lowerCase, "toLowerCase(...)");
            String d4 = Z.d(lowerCase);
            this.f9787g.put(d4, Integer.valueOf(((Integer) Y.b(this.f9787g, d4, 0)).intValue() + i4));
            if (!z3) {
                return;
            }
            if (Z.c(c.o(Z.d(str), "-", ""))) {
                this.f9781a.put(d4, Integer.valueOf(((Integer) Y.b(this.f9781a, d4, 0)).intValue() + i4));
            } else if (o.a(c.a(d4), str)) {
                this.f9782b.put(d4, Integer.valueOf(((Integer) Y.b(this.f9782b, d4, 0)).intValue() + i4));
            } else {
                String d5 = Z.d(str);
                this.f9788h.put(d4, d5);
                if (o.a(d5, (String) Y.b(this.f9788h, d4, d5))) {
                    this.f9783c.put(d4, Integer.valueOf(((Integer) Y.b(this.f9783c, d4, 0)).intValue() + i4));
                    return;
                }
                this.f9783c.put(d4, Integer.valueOf(i4));
            }
        }
    }

    public void t(String str) {
        D(str, 1);
    }

    public /* bridge */ /* synthetic */ int u(String str, int i4) {
        return B(str, i4).intValue();
    }

    public /* bridge */ /* synthetic */ int v(String str, int i4) {
        return C(str, i4).intValue();
    }

    public Integer w(String str, int i4) {
        o.e(str, "word");
        return (Integer) Y.b(this.f9785e, str, Integer.valueOf(i4));
    }

    public Integer x(String str, int i4) {
        o.e(str, "word");
        return (Integer) Y.b(this.f9784d, str, Integer.valueOf(i4));
    }

    public Integer y(String str, int i4) {
        o.e(str, "word");
        return (Integer) Y.b(this.f9787g, str, Integer.valueOf(i4));
    }

    public Integer z(String str, int i4) {
        o.e(str, "word");
        return (Integer) Y.b(this.f9781a, str, Integer.valueOf(i4));
    }

    public String c(String str) {
        o.e(str, "word");
        return (String) this.f9788h.get(str);
    }
}
