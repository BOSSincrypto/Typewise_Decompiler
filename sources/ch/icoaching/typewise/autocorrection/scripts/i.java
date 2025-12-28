package ch.icoaching.typewise.autocorrection.scripts;

import B0.C0259g;
import B0.E;
import B0.F;
import B0.G;
import B0.o;
import B0.q;
import B0.r;
import B0.t;
import B0.u;
import E0.p;
import E0.s;
import ch.icoaching.typewise.autocorrection.resources.IDictionaryRepository;
import ch.icoaching.typewise.e;
import ch.icoaching.typewise.file_handling.ConfigHolder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.collections.L;
import kotlin.jvm.internal.o;
import l2.g;
import r0.f;

public final class i {

    /* renamed from: t  reason: collision with root package name */
    public static final a f8092t = new a((kotlin.jvm.internal.i) null);

    /* renamed from: a  reason: collision with root package name */
    private final IDictionaryRepository f8093a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8094b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f8095c;

    /* renamed from: d  reason: collision with root package name */
    private final float f8096d;

    /* renamed from: e  reason: collision with root package name */
    private final f f8097e;

    /* renamed from: f  reason: collision with root package name */
    private String f8098f;

    /* renamed from: g  reason: collision with root package name */
    private final ConfigHolder f8099g;

    /* renamed from: h  reason: collision with root package name */
    private G f8100h;

    /* renamed from: i  reason: collision with root package name */
    private float f8101i;

    /* renamed from: j  reason: collision with root package name */
    private C0259g f8102j;

    /* renamed from: k  reason: collision with root package name */
    private E f8103k;

    /* renamed from: l  reason: collision with root package name */
    private final double f8104l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f8105m;

    /* renamed from: n  reason: collision with root package name */
    private final double f8106n;

    /* renamed from: o  reason: collision with root package name */
    private final float f8107o;

    /* renamed from: p  reason: collision with root package name */
    private final Map f8108p = D.j(g.a("de", C0718m.m("", "s")), g.a("de-ch", C0718m.m("", "s")), g.a("nl", C0718m.m("", "s", "e")));

    /* renamed from: q  reason: collision with root package name */
    private final Set f8109q = j();

    /* renamed from: r  reason: collision with root package name */
    private final q f8110r;

    /* renamed from: s  reason: collision with root package name */
    private final float f8111s;

    public static final class a {
        private a() {
        }

        public final float a(int i4, float f4) {
            return i4 > 0 ? Math.min((float) i4, f4) : f4;
        }

        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f8112a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f8113b;

        public b(boolean z3, boolean z4) {
            this.f8112a = z3;
            this.f8113b = z4;
        }

        public final boolean a() {
            return this.f8112a;
        }

        public final boolean b() {
            return this.f8113b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f8112a == bVar.f8112a && this.f8113b == bVar.f8113b;
        }

        public int hashCode() {
            return (androidx.work.c.a(this.f8112a) * 31) + androidx.work.c.a(this.f8113b);
        }

        public String toString() {
            boolean z3 = this.f8112a;
            boolean z4 = this.f8113b;
            return "EarlyExitOnlyConsiderFullWordsResult(earlyExit=" + z3 + ", onlyConsiderFullWords=" + z4 + ")";
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final t f8114a;

        /* renamed from: b  reason: collision with root package name */
        private final float f8115b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f8116c;

        public c(t tVar, float f4, boolean z3) {
            o.e(tVar, "suggestedWordsAndFeatures");
            this.f8114a = tVar;
            this.f8115b = f4;
            this.f8116c = z3;
        }

        public final boolean a() {
            return this.f8116c;
        }

        public final float b() {
            return this.f8115b;
        }

        public final t c() {
            return this.f8114a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return o.a(this.f8114a, cVar.f8114a) && Float.compare(this.f8115b, cVar.f8115b) == 0 && this.f8116c == cVar.f8116c;
        }

        public int hashCode() {
            return (((this.f8114a.hashCode() * 31) + Float.floatToIntBits(this.f8115b)) * 31) + androidx.work.c.a(this.f8116c);
        }

        public String toString() {
            t tVar = this.f8114a;
            float f4 = this.f8115b;
            boolean z3 = this.f8116c;
            return "GetSuggestionsWithContextResult(suggestedWordsAndFeatures=" + tVar + ", minimumDistance=" + f4 + ", earlyExit=" + z3 + ")";
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final u f8117a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f8118b;

        public d(u uVar, boolean z3) {
            o.e(uVar, "suggestionInput");
            this.f8117a = uVar;
            this.f8118b = z3;
        }

        public final u a() {
            return this.f8117a;
        }

        public final boolean b() {
            return this.f8118b;
        }

        public final u c() {
            return this.f8117a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return o.a(this.f8117a, dVar.f8117a) && this.f8118b == dVar.f8118b;
        }

        public int hashCode() {
            return (this.f8117a.hashCode() * 31) + androidx.work.c.a(this.f8118b);
        }

        public String toString() {
            u uVar = this.f8117a;
            boolean z3 = this.f8118b;
            return "SuggestionsMultipleWordsResult(suggestionInput=" + uVar + ", earlyExit=" + z3 + ")";
        }
    }

    public i(IDictionaryRepository iDictionaryRepository, int i4, Map map, float f4, f fVar, String str, ConfigHolder configHolder) {
        o.e(iDictionaryRepository, "dictionaryRepository");
        o.e(map, "keyPositions");
        o.e(fVar, "triggerHelper");
        o.e(str, "language");
        o.e(configHolder, "configHolder");
        this.f8093a = iDictionaryRepository;
        this.f8094b = i4;
        this.f8095c = map;
        this.f8096d = f4;
        this.f8097e = fVar;
        this.f8098f = str;
        this.f8099g = configHolder;
        this.f8101i = configHolder.c().e().j().p();
        this.f8104l = configHolder.c().e().j().f();
        this.f8105m = configHolder.c().e().j().b();
        this.f8106n = configHolder.c().e().j().e();
        this.f8107o = configHolder.c().e().j().u();
        this.f8110r = new q(map, f4, configHolder);
        this.f8111s = configHolder.c().e().j().p();
    }

    private final b c(String str, List list, String str2, int i4) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            String substring = str2.substring(0, i4);
            o.d(substring, "substring(...)");
            String substring2 = str2.substring(i4 + 1);
            o.d(substring2, "substring(...)");
            if (((double) substring.length()) >= this.f8106n && ((double) substring2.length()) >= this.f8106n) {
                if (o.a(substring + str3 + substring2, str)) {
                    if (this.f8105m || !l(C0718m.m(substring, substring2))) {
                        return new b(false, true);
                    }
                    return new b(true, false);
                }
            }
        }
        return new b(false, false);
    }

    private final b d(List list, String str) {
        List list2 = (List) this.f8108p.get(this.f8098f);
        if (list2 == null || (list.size() == 1 && ((B0.o) list.get(0)).a() == -1.0f)) {
            return new b(false, false);
        }
        return e(list, str, list2);
    }

    private final b e(List list, String str, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            B0.o oVar = (B0.o) it.next();
            int V3 = kotlin.text.o.V(oVar.f(), " ", 0, false, 6, (Object) null);
            if (V3 != -1) {
                b c4 = c(str, list2, oVar.f(), V3);
                boolean a4 = c4.a();
                boolean b4 = c4.b();
                if (a4) {
                    return new b(true, false);
                }
                if (b4) {
                    return new b(false, true);
                }
            }
        }
        return new b(false, false);
    }

    public static /* synthetic */ d h(i iVar, u uVar, float f4, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            z3 = true;
        }
        return iVar.g(uVar, f4, i4, z3);
    }

    private final Set j() {
        float f4 = this.f8096d * this.f8107o;
        HashSet hashSet = new HashSet();
        if (this.f8095c.containsKey("spacer") && this.f8095c.containsKey("spacel")) {
            Object obj = this.f8095c.get("spacer");
            o.b(obj);
            p pVar = (p) obj;
            Object obj2 = this.f8095c.get("spacel");
            o.b(obj2);
            p pVar2 = (p) obj2;
            for (Map.Entry entry : this.f8095c.entrySet()) {
                String str = (String) entry.getKey();
                p pVar3 = (p) entry.getValue();
                if (!L.h("spacel", "spacer", " ").contains(str) && (s.b(str) || L.h(".", "?").contains(str))) {
                    p.a aVar = p.f385c;
                    float a4 = aVar.a(pVar3, pVar);
                    float a5 = aVar.a(pVar3, pVar2);
                    if (a4 <= f4 || a5 <= f4) {
                        hashSet.add(str);
                    }
                }
            }
        } else if (this.f8095c.containsKey("space_rect_l") && this.f8095c.containsKey("space_rect_r")) {
            p pVar4 = (p) this.f8095c.get("space_rect_l");
            if (pVar4 == null) {
                pVar4 = new p(0.0f, 0.0f);
            }
            p pVar5 = (p) this.f8095c.get("space_rect_r");
            if (pVar5 == null) {
                pVar5 = new p(0.0f, 0.0f);
            }
            for (Map.Entry entry2 : this.f8095c.entrySet()) {
                String str2 = (String) entry2.getKey();
                p pVar6 = (p) entry2.getValue();
                if (!L.h("space_rect_r", "spacel", " ").contains(str2) && s.b(str2) && pVar6.a() >= pVar4.a() && pVar6.a() <= pVar5.a() && Math.abs(pVar6.b() - pVar4.b()) <= f4) {
                    hashSet.add(str2);
                }
            }
        } else if (this.f8095c.containsKey("spacer")) {
            Object obj3 = this.f8095c.get("spacer");
            o.b(obj3);
            p pVar7 = (p) obj3;
            for (Map.Entry entry3 : this.f8095c.entrySet()) {
                String str3 = (String) entry3.getKey();
                p pVar8 = (p) entry3.getValue();
                if (!L.h("spacer", "spacel", " ").contains(str3) && ((s.b(str3) || L.h(".", "?").contains(str3)) && p.f385c.a(pVar8, pVar7) <= f4)) {
                    hashSet.add(str3);
                }
            }
        } else if (this.f8095c.containsKey("spacel")) {
            Object obj4 = this.f8095c.get("spacel");
            o.b(obj4);
            p pVar9 = (p) obj4;
            for (Map.Entry entry4 : this.f8095c.entrySet()) {
                String str4 = (String) entry4.getKey();
                p pVar10 = (p) entry4.getValue();
                if (!L.h("spacer", "spacel", " ").contains(str4) && ((s.b(str4) || L.h(".", "?").contains(str4)) && p.f385c.a(pVar10, pVar9) <= f4)) {
                    hashSet.add(str4);
                }
            }
        } else if (!C0718m.V(L.h("space_1", "space_2", "space_3", "space_4", "space_5", "space_6", "space_7"), this.f8095c.keySet()).isEmpty()) {
            Object obj5 = this.f8095c.get("space_1");
            o.b(obj5);
            p pVar11 = (p) obj5;
            for (Map.Entry entry5 : this.f8095c.entrySet()) {
                String str5 = (String) entry5.getKey();
                p pVar12 = (p) entry5.getValue();
                if (!kotlin.text.o.L(str5, "space", false, 2, (Object) null) && s.b(str5) && Math.abs(pVar12.b() - pVar11.b()) <= f4) {
                    hashSet.add(str5);
                }
            }
        }
        if (hashSet.isEmpty()) {
            e.b(e.f8233a, "GetSuggestionsAndFeatures", "No space neighbours", (Throwable) null, 4, (Object) null);
        }
        return hashSet;
    }

    private final boolean l(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f h4 = this.f8093a.h((String) it.next(), this.f8098f);
            if (h4 != null) {
                if (((double) h4.c()) < ((double) Math.max(h4.a(), Math.max(h4.c(), h4.b()))) / this.f8104l) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean o(String str) {
        if (kotlin.text.o.L(str, " ", false, 2, (Object) null)) {
            str = str.substring(kotlin.text.o.b0(str, " ", 0, false, 6, (Object) null) + 1);
            o.d(str, "substring(...)");
        }
        return this.f8093a.m(str, this.f8098f);
    }

    public final t a(u uVar) {
        boolean z3;
        o.e(uVar, "suggestionInput");
        C0259g gVar = this.f8102j;
        if (gVar != null) {
            t c4 = uVar.g().c();
            List D02 = C0718m.D0(c4.c());
            List D03 = C0718m.D0(c4.a());
            List D04 = C0718m.D0(c4.b());
            r0.c f4 = uVar.f();
            if (!this.f8097e.b(f4.b()) && !D02.contains(f4.b())) {
                float f5 = this.f8110r.f(f4, f4, uVar.h());
                r0.e j4 = this.f8093a.j(f4, uVar.e().d(), this.f8098f);
                if (j4.b() != -2 || j4.c() > 0 || this.f8093a.m(f4.b(), this.f8098f)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                D03.add(0, gVar.h(o.a.a(B0.o.f148f, f4.b(), 0.0f, C0718m.e(j4), f4.d(), 0, 16, (Object) null), uVar.e(), f5, f4.b(), z3, f4.c(), f4.a()));
                D02.add(0, f4.b());
                D04.add(0, -1);
            }
            return new t(D02, D03, D04);
        }
        throw new RuntimeException("Tools are not loaded");
    }

    public final u b(B0.o oVar, u uVar, r0.e eVar, boolean z3) {
        kotlin.jvm.internal.o.e(oVar, "suggestion");
        kotlin.jvm.internal.o.e(uVar, "suggestionInput");
        kotlin.jvm.internal.o.e(eVar, "previousWordData");
        C0259g gVar = this.f8102j;
        if (gVar != null) {
            r g4 = uVar.g();
            int a4 = g4.a();
            List D02 = C0718m.D0(g4.c().c());
            List D03 = C0718m.D0(g4.c().a());
            List D04 = C0718m.D0(g4.c().b());
            int b4 = g4.b();
            if (((float) a4) > oVar.a() && oVar.a() >= 0.0f) {
                a4 = (int) ((float) Math.ceil((double) oVar.a()));
            }
            int i4 = a4;
            String f4 = oVar.f();
            r0.c a5 = r0.c.f16009f.a(f4, oVar.g(), uVar.f().c(), uVar.f().a());
            D02.add(f4);
            D03.add(gVar.h(oVar, eVar, this.f8110r.f(uVar.f(), a5, uVar.h()), uVar.f().b(), z3, uVar.f().c(), uVar.f().a()));
            D04.add(Integer.valueOf(oVar.e()));
            return u.a(uVar, (r0.c) null, (r0.e) null, (String) null, new r(new t(D02, D03, D04), i4, b4 + 1), (List) null, (String) null, (String) null, 119, (Object) null);
        }
        throw new RuntimeException("Tools are not loaded");
    }

    public final c f(r0.c cVar, String str, List list, int i4, int i5, String str2, String str3) {
        Integer num;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int V3;
        String str4 = str;
        int i9 = i4;
        kotlin.jvm.internal.o.e(cVar, "singleWord");
        kotlin.jvm.internal.o.e(str4, "context");
        kotlin.jvm.internal.o.e(list, "touchPoints");
        k(cVar.b(), i5);
        n();
        r rVar = new r(new t(new ArrayList(), new ArrayList(), new ArrayList()), (int) ((float) Math.ceil((double) (this.f8111s + ((float) 1)))), 0);
        r0.d A3 = f.A(this.f8097e, (String) C0718m.b0(i(str4)), false, 2, (Object) null);
        u m4 = m(new u(cVar, this.f8093a.k(r0.c.f16009f.a(A3.h(), A3.h(), A3.c(), A3.e()), this.f8098f), str, rVar, list, str2, str3));
        float f4 = this.f8101i;
        if (i9 > 0) {
            f4 = f8092t.a(m4.g().a(), f4);
            if (cVar.b().length() > 3 && m4.g().a() > 0) {
                z3 = false;
                i6 = 2;
                num = null;
                i7 = 1;
                i8 = i9;
                d h4 = h(this, m4, f4, 1, false, 8, (Object) null);
                m4 = h4.a();
                boolean b4 = h4.b();
                if (b4) {
                    return new c(m4.g().c(), (float) m4.g().a(), b4);
                }
                if (i8 > 1 && cVar.b().length() > 6 && m4.g().a() > 0) {
                    m4 = h(this, m4, f4, 2, false, 8, (Object) null).c();
                }
                V3 = kotlin.text.o.V(cVar.b(), " ", 0, false, 6, (Object) null);
                if (this.f8099g.c().e().j().y() && V3 > 0 && V3 < m4.f().b().length() - i7 && cVar.b().length() > 4 && m4.g().a() > 0) {
                    String n4 = s.n(cVar.b(), z3 ? 1 : 0, Integer.valueOf(V3));
                    String o4 = s.o(cVar.b(), V3 + i7, num, i6, num);
                    if (!this.f8093a.m(n4, this.f8098f) || !this.f8093a.m(o4, this.f8098f)) {
                        m4 = g(m4, f8092t.a(m4.g().a(), f4), i8, z3).c();
                    }
                }
                return new c(a(m4), (float) m4.g().a(), z3);
            }
        }
        z3 = false;
        i6 = 2;
        num = null;
        i7 = 1;
        i8 = i9;
        V3 = kotlin.text.o.V(cVar.b(), " ", 0, false, 6, (Object) null);
        String n42 = s.n(cVar.b(), z3 ? 1 : 0, Integer.valueOf(V3));
        String o42 = s.o(cVar.b(), V3 + i7, num, i6, num);
        m4 = g(m4, f8092t.a(m4.g().a(), f4), i8, z3).c();
        return new c(a(m4), (float) m4.g().a(), z3);
    }

    public final d g(u uVar, float f4, int i4, boolean z3) {
        F f5;
        kotlin.jvm.internal.o.e(uVar, "suggestionInput");
        G g4 = this.f8100h;
        if (g4 != null) {
            r0.c f6 = uVar.f();
            r0.e e4 = uVar.e();
            if (z3) {
                f5 = G.o(g4, f6, e4, f4, (Integer) null, i4, 8, (Object) null);
            } else {
                f5 = G.p(g4, f6, e4, f4, (Integer) null, 8, (Object) null);
            }
            String b4 = uVar.f().b();
            boolean m4 = this.f8093a.m(b4, this.f8098f);
            b d4 = d(f5.c(), b4);
            boolean a4 = d4.a();
            boolean b5 = d4.b();
            if (a4) {
                return new d(uVar, true);
            }
            if (!(f5.c().size() == 1 && ((B0.o) f5.c().get(0)).a() == -1.0f) && !b5) {
                for (B0.o b6 : f5.c()) {
                    uVar = b(b6, uVar, f5.a(), m4);
                }
            }
            return new d(uVar, false);
        }
        throw new RuntimeException("Tools are not loaded");
    }

    public final List i(String str) {
        kotlin.jvm.internal.o.e(str, "context");
        List m4 = C0718m.m("", this.f8099g.c().e().i().d());
        if (str.length() <= 0 || this.f8097e.p(str)) {
            return m4;
        }
        String[] s4 = this.f8097e.s(this.f8097e.y(str));
        if (s4.length == 1) {
            return C0718m.m(this.f8099g.c().e().i().d(), C0713h.U(s4));
        } else if (s4.length > 1) {
            return C0718m.m(s4[s4.length - 2], C0713h.U(s4));
        } else {
            e.l(e.f8233a, "GetSuggestionsAndFeatures", "getPreviousWordFromContext() :: Context splitting incorrect", (Throwable) null, 4, (Object) null);
            return m4;
        }
    }

    public final void k(String str, int i4) {
        float min;
        float f4;
        kotlin.jvm.internal.o.e(str, "currentWord");
        int length = str.length();
        if (length < 3) {
            min = Math.min(this.f8111s, (float) i4);
            f4 = 1.0f;
        } else if (length < 6) {
            min = Math.min(this.f8111s, (float) i4);
            f4 = 2.0f;
        } else {
            min = Math.min(this.f8111s, (float) i4);
            f4 = 3.0f;
        }
        this.f8101i = Math.min(f4, min);
    }

    public final u m(u uVar) {
        kotlin.jvm.internal.o.e(uVar, "suggestionInput");
        E e4 = this.f8103k;
        if (e4 != null) {
            F f4 = E.f(e4, uVar.f(), uVar.e(), (Integer) null, (Float) null, uVar.d(), uVar.c(), 12, (Object) null);
            boolean o4 = o(uVar.f().b());
            for (B0.o oVar : f4.c()) {
                if (!this.f8097e.b(oVar.f()) || !kotlin.jvm.internal.o.a(oVar.f(), uVar.f().b())) {
                    uVar = b(oVar, uVar, uVar.e(), o4);
                }
            }
            return uVar;
        }
        throw new RuntimeException("Tools are not loaded");
    }

    public final void n() {
        this.f8102j = new C0259g(this.f8093a, this.f8099g.c().e(), this.f8098f);
        this.f8103k = new E(this.f8101i, 2, this.f8093a, this.f8110r, this.f8098f, this.f8099g);
        this.f8100h = new G(this.f8111s, this.f8094b, this.f8093a, this.f8110r, this.f8109q, this.f8098f, this.f8099g);
    }

    public final void p(String str) {
        kotlin.jvm.internal.o.e(str, "language");
        this.f8098f = str;
    }
}
