package ch.icoaching.typewise.language_modelling.modelling.sentence_completion;

import D0.l0;
import D0.m0;
import E0.s;
import J2.G0;
import J2.K;
import J2.O;
import K2.C0341a;
import ch.icoaching.typewise.global_cache.GlobalCache;
import ch.icoaching.typewise.language_modelling.modelling.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.collections.L;
import kotlin.coroutines.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;
import y0.C0946c;

public final class SentenceCompletionNaiveModel extends e {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f8725f = new Companion((i) null);

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8726d;

    /* renamed from: e  reason: collision with root package name */
    private final e f8727e;

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ Object a(Companion companion, String str, String str2, String str3, String str4, boolean z3, c cVar, int i4, Object obj) {
            if ((i4 & 8) != 0) {
                str4 = "memory";
            }
            String str5 = str4;
            if ((i4 & 16) != 0) {
                z3 = true;
            }
            return companion.b(str, str2, str3, str5, z3, cVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object b(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14, kotlin.coroutines.c r15) {
            /*
                r9 = this;
                boolean r0 = r15 instanceof ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel$Companion$invoke$1
                if (r0 == 0) goto L_0x0013
                r0 = r15
                ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel$Companion$invoke$1 r0 = (ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel$Companion$invoke$1) r0
                int r1 = r0.f8735h
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8735h = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel$Companion$invoke$1 r0 = new ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel$Companion$invoke$1
                r0.<init>(r9, r15)
            L_0x0018:
                java.lang.Object r15 = r0.f8733f
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.f8735h
                r3 = 1
                if (r2 == 0) goto L_0x004b
                if (r2 != r3) goto L_0x0043
                boolean r14 = r0.f8732e
                java.lang.Object r10 = r0.f8731d
                r13 = r10
                java.lang.String r13 = (java.lang.String) r13
                java.lang.Object r10 = r0.f8730c
                r12 = r10
                java.lang.String r12 = (java.lang.String) r12
                java.lang.Object r10 = r0.f8729b
                r11 = r10
                java.lang.String r11 = (java.lang.String) r11
                java.lang.Object r10 = r0.f8728a
                java.lang.String r10 = (java.lang.String) r10
                kotlin.f.b(r15)
            L_0x003d:
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r7 = r14
                goto L_0x0063
            L_0x0043:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L_0x004b:
                kotlin.f.b(r15)
                ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory$Companion r15 = ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceDBInMemory.f8743d
                r0.f8728a = r10
                r0.f8729b = r11
                r0.f8730c = r12
                r0.f8731d = r13
                r0.f8732e = r14
                r0.f8735h = r3
                java.lang.Object r15 = r15.a(r11, r12, r0)
                if (r15 != r1) goto L_0x003d
                return r1
            L_0x0063:
                r8 = r15
                ch.icoaching.typewise.language_modelling.modelling.sentence_completion.e r8 = (ch.icoaching.typewise.language_modelling.modelling.sentence_completion.e) r8
                ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel r10 = new ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel
                r2 = r10
                r2.<init>(r3, r4, r5, r6, r7, r8)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel.Companion.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
        }

        public final List c(List list, float f4) {
            o.e(list, "runningPredictionInfos");
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                l0 l0Var = (l0) next;
                int c4 = l0Var.c();
                Object obj = l0Var.d().c().get(Float.valueOf(f4));
                o.b(obj);
                if (c4 >= ((Number) obj).intValue()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public final boolean d(String str, int i4, String str2, m0 m0Var) {
            Set h4;
            o.e(str, "context");
            o.e(str2, "sentence");
            o.e(m0Var, "sentenceDescription");
            if (str.length() == 0 || str2.charAt(0) != str.charAt(i4)) {
                return false;
            }
            PositionFilter b4 = m0Var.b();
            if (i4 == 0) {
                return true;
            }
            Integer a4 = C0946c.a(str, i4);
            if (a4 != null) {
                char charAt = str.charAt(a4.intValue());
                if (charAt == 10) {
                    h4 = L.h(PositionFilter.BEGINNING_OF_PARAGRAPH, PositionFilter.BEGINNING_OF_SENTENCE, PositionFilter.ANYWHERE);
                } else if (C0946c.d().contains(Character.valueOf(charAt))) {
                    h4 = L.h(PositionFilter.BEGINNING_OF_SENTENCE, PositionFilter.ANYWHERE);
                } else if (str.charAt(i4 - 1) != ' ') {
                    return false;
                } else {
                    if (b4 == PositionFilter.ANYWHERE) {
                        return true;
                    }
                    return false;
                }
                return C0718m.L(h4, b4);
            } else if (b4 == PositionFilter.BEGINNING_OF_EMAIL) {
                return true;
            } else {
                return false;
            }
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f8736a;

        /* renamed from: b  reason: collision with root package name */
        private final int f8737b;

        /* renamed from: c  reason: collision with root package name */
        private final Map f8738c;

        public a(String str, int i4, Map map) {
            o.e(str, "contextShortened");
            o.e(map, "runningPreds");
            this.f8736a = str;
            this.f8737b = i4;
            this.f8738c = map;
        }

        public final int a() {
            return this.f8737b;
        }

        public final String b() {
            return this.f8736a;
        }

        public final Map c() {
            return this.f8738c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return o.a(this.f8736a, aVar.f8736a) && this.f8737b == aVar.f8737b && o.a(this.f8738c, aVar.f8738c);
        }

        public int hashCode() {
            return (((this.f8736a.hashCode() * 31) + this.f8737b) * 31) + this.f8738c.hashCode();
        }

        public String toString() {
            String str = this.f8736a;
            int i4 = this.f8737b;
            Map map = this.f8738c;
            return "FetchCacheOrDefaultResult(contextShortened=" + str + ", charIndex=" + i4 + ", runningPreds=" + map + ")";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SentenceCompletionNaiveModel(String str, String str2, String str3, String str4, boolean z3, e eVar) {
        super(str, str2);
        o.e(str, "kind");
        o.e(str2, "path");
        o.e(str3, "checkpointHash");
        o.e(str4, "dbImplementation");
        o.e(eVar, "db");
        this.f8726d = z3;
        this.f8727e = eVar;
        String lowerCase = str4.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        if (!o.a(lowerCase, "memory")) {
            throw new IllegalArgumentException(("No db implementation found for '" + str4 + "'").toString());
        }
    }

    /* access modifiers changed from: private */
    public static final Object k(Object obj) {
        o.e(obj, "it");
        C0341a c4 = t0.c.f16361a.c();
        c4.a();
        return c4.c(new O(G0.f622a, K.f636a), (String) obj);
    }

    /* access modifiers changed from: private */
    public static final Object l(Map map, Object obj) {
        o.e(obj, "it");
        C0341a c4 = t0.c.f16361a.c();
        c4.a();
        return c4.b(new O(G0.f622a, K.f636a), map);
    }

    /* access modifiers changed from: private */
    public static final String p(Object obj) {
        o.e(obj, "it");
        return GlobalCache.f8267c.a((Pair) obj);
    }

    private final String r(String str) {
        String obj = kotlin.text.o.O0(str).toString();
        if (!this.f8726d) {
            return obj;
        }
        String lowerCase = obj.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r4, kotlin.coroutines.c r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel$loadWeights$1
            if (r4 == 0) goto L_0x0013
            r4 = r5
            ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel$loadWeights$1 r4 = (ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel$loadWeights$1) r4
            int r0 = r4.f8742d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r4.f8742d = r0
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel$loadWeights$1 r4 = new ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel$loadWeights$1
            r4.<init>(r3, r5)
        L_0x0018:
            java.lang.Object r5 = r4.f8740b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.f8742d
            r2 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            java.lang.Object r4 = r4.f8739a
            ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel r4 = (ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel) r4
            kotlin.f.b(r5)
            goto L_0x0046
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.f.b(r5)
            ch.icoaching.typewise.language_modelling.modelling.sentence_completion.e r5 = r3.f8727e
            r4.f8739a = r3
            r4.f8742d = r2
            java.lang.Object r4 = r5.c(r4)
            if (r4 != r0) goto L_0x0045
            return r0
        L_0x0045:
            r4 = r3
        L_0x0046:
            r4.s()
            l2.q r4 = l2.q.f14567a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel.a(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public Object b(c cVar) {
        return q.f14567a;
    }

    public String d() {
        Map k4 = this.f8727e.k();
        return "SentenceCompletionNaiveModel\nStats from the database: " + k4;
    }

    public final a j(String str) {
        int i4;
        Map map;
        o.e(str, "preprocessedFullContext");
        Pair f4 = GlobalCache.f(ch.icoaching.typewise.global_cache.a.a(), c(), str, new d(), (Object) null, 8, (Object) null);
        String str2 = (String) f4.component1();
        Object component2 = f4.component2();
        ch.icoaching.typewise.e eVar = ch.icoaching.typewise.e.f8233a;
        ch.icoaching.typewise.e.b(eVar, "SentenceCompletionNaiveModel", "fetchCacheOrDefault() :: cache = " + component2, (Throwable) null, 4, (Object) null);
        if (component2 == null) {
            str = s.o(str, -this.f8727e.f(), (Integer) null, 2, (Object) null);
            map = D.h();
            i4 = 0;
        } else {
            i4 = str2.length();
            map = (Map) component2;
        }
        return new a(str, i4, map);
    }

    public final List m(String str, List list) {
        String str2 = str;
        o.e(str2, "context");
        o.e(list, "respectingMinLengthPreds");
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((l0) it.next()).d().a();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            l0 l0Var = (l0) it2.next();
            int a4 = l0Var.a();
            m0 b4 = l0Var.b();
            String o4 = s.o(str2, -a4, (Integer) null, 2, (Object) null);
            String o5 = s.o(b4.d(), a4, (Integer) null, 2, (Object) null);
            ch.icoaching.typewise.language_modelling_result_classes.a aVar = r5;
            ch.icoaching.typewise.language_modelling_result_classes.a aVar2 = new ch.icoaching.typewise.language_modelling_result_classes.a(o4 + o5, ((float) b4.a()) / ((float) i4), a4, "naive", c(), (Float) null, (Map) null, (Float) null, false, (Float) null, (Float) null, 2016, (i) null);
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public final List n(List list, float f4) {
        o.e(list, "inputs");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map q4 = q(str);
            ArrayList arrayList2 = new ArrayList(q4.size());
            for (Map.Entry entry : q4.entrySet()) {
                arrayList2.add(new l0(((Number) entry.getValue()).intValue(), this.f8727e.b((String) entry.getKey())));
            }
            arrayList.add(m(str, f8725f.c(arrayList2, f4)));
        }
        return arrayList;
    }

    public final void o(String str, Map map) {
        o.e(str, "lowerFullContext");
        o.e(map, "runningPreds");
        ch.icoaching.typewise.global_cache.a.a().h(new Pair(c(), str), map, new b(), new c(map));
    }

    public final Map q(String str) {
        int i4;
        o.e(str, "context");
        String r4 = r(str);
        a j4 = j(r4);
        String b4 = j4.b();
        Map s4 = D.s(j4.c());
        for (int a4 = j4.a(); a4 < b4.length(); a4++) {
            Iterator it = this.f8727e.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str2 = (String) pair.component1();
                m0 m0Var = (m0) pair.component2();
                if (str2.length() + a4 <= b4.length()) {
                    break;
                }
                e(f() + 1);
                if (s4.keySet().contains(str2)) {
                    Object obj = s4.get(str2);
                    o.b(obj);
                    int intValue = ((Number) obj).intValue();
                    if (intValue >= str2.length() || str2.charAt(intValue) != b4.charAt(a4)) {
                        s4.remove(str2);
                    } else {
                        i4 = Integer.valueOf(intValue + 1);
                    }
                } else if (f8725f.d(b4, a4, str2, m0Var)) {
                    i4 = 1;
                }
                s4.put(str2, i4);
            }
        }
        o(r4, s4);
        return s4;
    }

    public final void s() {
        if (this.f8726d) {
            List<String> j4 = this.f8727e.j();
            if (!(j4 instanceof Collection) || !j4.isEmpty()) {
                for (String f4 : j4) {
                    if (!s.f(f4)) {
                        throw new RuntimeException("You declared lowercaseBeforeMatching = true, but the model contains some sentences that are uppercase");
                    }
                }
            }
        }
        if (!this.f8726d) {
            List<String> j5 = this.f8727e.j();
            if (!(j5 instanceof Collection) || !j5.isEmpty()) {
                for (String f5 : j5) {
                    if (!s.f(f5)) {
                        return;
                    }
                }
            }
            throw new RuntimeException("You declared lowercaseBeforeMatching = false, but the model contains all lowercase sentences");
        }
    }
}
