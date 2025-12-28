package ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches;

import D0.C;
import D0.E;
import J2.C0300f;
import J2.C0311k0;
import J2.G0;
import K2.C0341a;
import ch.icoaching.typewise.global_cache.GlobalCache;
import ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import t0.c;

public abstract class ProbsAndStatePriorApproach extends d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f8458f = new a((i) null);

    public static final class a {
        private a() {
        }

        public final String a(Pair pair) {
            o.e(pair, "probsAndStates");
            String t02 = C.t0((E) pair.getFirst());
            Iterable<E> iterable = (Iterable) pair.getSecond();
            ArrayList arrayList = new ArrayList(C0718m.t(iterable, 10));
            for (E t03 : iterable) {
                arrayList.add(C.t0(t03));
            }
            Pair pair2 = new Pair(t02, arrayList);
            C0341a c4 = c.f16361a.c();
            c4.a();
            G0 g02 = G0.f622a;
            return c4.b(new C0311k0(g02, new C0300f(g02)), pair2);
        }

        public final Pair b(String str) {
            o.e(str, "value");
            C0341a c4 = c.f16361a.c();
            c4.a();
            G0 g02 = G0.f622a;
            Pair pair = (Pair) c4.c(new C0311k0(g02, new C0300f(g02)), str);
            E Z3 = C.Z((String) pair.getFirst());
            Iterable<String> iterable = (Iterable) pair.getSecond();
            ArrayList arrayList = new ArrayList(C0718m.t(iterable, 10));
            for (String Z4 : iterable) {
                arrayList.add(C.Z(Z4));
            }
            return new Pair(Z3, arrayList);
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProbsAndStatePriorApproach(ch.icoaching.typewise.language_modelling.preprocessing.c cVar, StatefulLanguageModel statefulLanguageModel, int i4, boolean z3) {
        super(cVar, statefulLanguageModel, i4, z3);
        o.e(cVar, "pp");
        o.e(statefulLanguageModel, "model");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object j(ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach r5, java.lang.String r6, java.lang.String r7, kotlin.Pair r8, kotlin.coroutines.c r9) {
        /*
            boolean r0 = r9 instanceof ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach$encodeMissingPartOfContext$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach$encodeMissingPartOfContext$1 r0 = (ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach$encodeMissingPartOfContext$1) r0
            int r1 = r0.f8463e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8463e = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach$encodeMissingPartOfContext$1 r0 = new ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach$encodeMissingPartOfContext$1
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f8461c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8463e
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r5 = r0.f8460b
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.f8459a
            ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach r5 = (ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach) r5
            kotlin.f.b(r9)
            goto L_0x0085
        L_0x0032:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003a:
            kotlin.f.b(r9)
            int r9 = r7.length()
            r2 = 2
            r4 = 0
            java.lang.String r9 = E0.s.o(r6, r9, r4, r2, r4)
            ch.icoaching.typewise.language_modelling.preprocessing.c r2 = r5.e()
            java.lang.String r7 = r2.d(r7, r9)
            int r9 = r7.length()
            if (r9 != 0) goto L_0x0056
            return r8
        L_0x0056:
            ch.icoaching.typewise.language_modelling.preprocessing.c r9 = r5.e()
            ch.icoaching.typewise.language_modelling.preprocessing.c r2 = r5.e()
            java.util.List r7 = r2.f(r7)
            java.util.List r7 = r9.j(r7)
            java.util.List r7 = kotlin.collections.C0718m.e(r7)
            D0.E r7 = D0.C.D0(r7)
            java.lang.Object r8 = r8.getSecond()
            java.util.List r8 = (java.util.List) r8
            ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel r9 = r5.d()
            r0.f8459a = r5
            r0.f8460b = r6
            r0.f8463e = r3
            java.lang.Object r9 = r9.g(r7, r8, r0)
            if (r9 != r1) goto L_0x0085
            return r1
        L_0x0085:
            kotlin.Pair r9 = (kotlin.Pair) r9
            java.lang.Object r7 = r9.component1()
            D0.E r7 = (D0.E) r7
            java.lang.Object r8 = r9.component2()
            java.util.List r8 = (java.util.List) r8
            r5.o(r6, r7, r8)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r7, r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach.j(ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach, java.lang.String, java.lang.String, kotlin.Pair, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object k(ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach r5, java.lang.String r6, kotlin.coroutines.c r7) {
        /*
            boolean r0 = r7 instanceof ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach$handleCacheMiss$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach$handleCacheMiss$1 r0 = (ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach$handleCacheMiss$1) r0
            int r1 = r0.f8468e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8468e = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach$handleCacheMiss$1 r0 = new ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach$handleCacheMiss$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f8466c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8468e
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r5 = r0.f8465b
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.f8464a
            ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach r5 = (ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach) r5
            kotlin.f.b(r7)
            goto L_0x006e
        L_0x0032:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003a:
            kotlin.f.b(r7)
            ch.icoaching.typewise.language_modelling.preprocessing.c r7 = r5.e()
            int r2 = r5.f()
            boolean r4 = r5.c()
            java.util.List r7 = r7.g(r6, r2, r4)
            ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel r2 = r5.d()
            java.util.List r7 = kotlin.collections.C0718m.e(r7)
            D0.E r7 = D0.C.D0(r7)
            ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel r4 = r5.d()
            java.util.List r4 = r4.j(r3)
            r0.f8464a = r5
            r0.f8465b = r6
            r0.f8468e = r3
            java.lang.Object r7 = r2.g(r7, r4, r0)
            if (r7 != r1) goto L_0x006e
            return r1
        L_0x006e:
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r0 = r7.getFirst()
            D0.E r0 = (D0.E) r0
            java.lang.Object r1 = r7.getSecond()
            java.util.List r1 = (java.util.List) r1
            r5.o(r6, r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach.k(ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.ProbsAndStatePriorApproach, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final String n(Object obj) {
        o.e(obj, "it");
        return GlobalCache.f8267c.a((Pair) obj);
    }

    /* access modifiers changed from: private */
    public static final Object p(Object obj) {
        o.e(obj, "it");
        return f8458f.a((Pair) obj);
    }

    public Object l(String str, String str2, Pair pair, kotlin.coroutines.c cVar) {
        return j(this, str, str2, pair, cVar);
    }

    public Object m(String str, kotlin.coroutines.c cVar) {
        return k(this, str, cVar);
    }

    public final void o(String str, E e4, List list) {
        o.e(str, "context");
        o.e(e4, "probs");
        o.e(list, "states");
        ch.icoaching.typewise.global_cache.a.a().h(new Pair(g(), str), new Pair(e4, list), new b(), new c());
    }
}
