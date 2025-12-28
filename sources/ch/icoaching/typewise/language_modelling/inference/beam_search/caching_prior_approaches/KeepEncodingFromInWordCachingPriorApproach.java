package ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches;

import ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel;
import ch.icoaching.typewise.language_modelling.preprocessing.c;
import kotlin.jvm.internal.o;

public class KeepEncodingFromInWordCachingPriorApproach extends ProbsAndStatePriorApproach {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeepEncodingFromInWordCachingPriorApproach(c cVar, StatefulLanguageModel statefulLanguageModel, int i4, boolean z3) {
        super(cVar, statefulLanguageModel, i4, z3);
        o.e(cVar, "pp");
        o.e(statefulLanguageModel, "model");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object r(ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.KeepEncodingFromInWordCachingPriorApproach r11, java.lang.String r12, java.lang.String r13, boolean r14, kotlin.coroutines.c r15) {
        /*
            boolean r13 = r15 instanceof ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.KeepEncodingFromInWordCachingPriorApproach$getProbabilitiesAndStateFromText$1
            if (r13 == 0) goto L_0x0013
            r13 = r15
            ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.KeepEncodingFromInWordCachingPriorApproach$getProbabilitiesAndStateFromText$1 r13 = (ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.KeepEncodingFromInWordCachingPriorApproach$getProbabilitiesAndStateFromText$1) r13
            int r0 = r13.f8457d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r13.f8457d = r0
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.KeepEncodingFromInWordCachingPriorApproach$getProbabilitiesAndStateFromText$1 r13 = new ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.KeepEncodingFromInWordCachingPriorApproach$getProbabilitiesAndStateFromText$1
            r13.<init>(r11, r15)
        L_0x0018:
            java.lang.Object r15 = r13.f8455b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r13.f8457d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0037
            if (r1 == r3) goto L_0x0031
            if (r1 != r2) goto L_0x0029
            goto L_0x0031
        L_0x0029:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0031:
            boolean r14 = r13.f8454a
            kotlin.f.b(r15)
            goto L_0x006d
        L_0x0037:
            kotlin.f.b(r15)
            ch.icoaching.typewise.global_cache.GlobalCache r4 = ch.icoaching.typewise.global_cache.a.a()
            java.lang.String r5 = r11.g()
            ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.a r7 = new ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.a
            r7.<init>()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r12
            kotlin.Pair r15 = ch.icoaching.typewise.global_cache.GlobalCache.f(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r15.component1()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r15 = r15.component2()
            if (r15 != 0) goto L_0x0067
            r13.f8454a = r14
            r13.f8457d = r3
            java.lang.Object r15 = r11.m(r12, r13)
            if (r15 != r0) goto L_0x006d
            return r0
        L_0x0067:
            boolean r3 = kotlin.jvm.internal.o.a(r1, r12)
            if (r3 == 0) goto L_0x0070
        L_0x006d:
            kotlin.Pair r15 = (kotlin.Pair) r15
            goto L_0x007d
        L_0x0070:
            kotlin.Pair r15 = (kotlin.Pair) r15
            r13.f8454a = r14
            r13.f8457d = r2
            java.lang.Object r15 = r11.l(r12, r1, r15, r13)
            if (r15 != r0) goto L_0x006d
            return r0
        L_0x007d:
            java.lang.Object r11 = r15.component1()
            D0.E r11 = (D0.E) r11
            java.lang.Object r12 = r15.component2()
            java.util.List r12 = (java.util.List) r12
            if (r14 == 0) goto L_0x00b4
            r13 = 0
            D0.E r11 = r11.b(r13)
            java.util.ArrayList r14 = new java.util.ArrayList
            r15 = 10
            int r15 = kotlin.collections.C0718m.t(r12, r15)
            r14.<init>(r15)
            java.util.Iterator r12 = r12.iterator()
        L_0x009f:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x00b3
            java.lang.Object r15 = r12.next()
            D0.E r15 = (D0.E) r15
            D0.E r15 = r15.b(r13)
            r14.add(r15)
            goto L_0x009f
        L_0x00b3:
            r12 = r14
        L_0x00b4:
            kotlin.Pair r13 = new kotlin.Pair
            r13.<init>(r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.KeepEncodingFromInWordCachingPriorApproach.r(ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.KeepEncodingFromInWordCachingPriorApproach, java.lang.String, java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final Object s(Object obj) {
        o.e(obj, "it");
        return ProbsAndStatePriorApproach.f8458f.b((String) obj);
    }

    public Object b(String str, String str2, boolean z3, kotlin.coroutines.c cVar) {
        return r(this, str, str2, z3, cVar);
    }
}
