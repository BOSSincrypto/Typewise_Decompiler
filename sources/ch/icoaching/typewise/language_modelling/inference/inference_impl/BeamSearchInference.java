package ch.icoaching.typewise.language_modelling.inference.inference_impl;

import D0.C0270f;
import D0.F;
import D0.U;
import D0.h0;
import D0.k0;
import E0.s;
import ch.icoaching.typewise.language_modelling.inference.Inference;
import ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher;
import ch.icoaching.typewise.language_modelling.inference.beam_search.d;
import ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel;
import ch.icoaching.typewise.language_modelling.preprocessing.c;
import ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult;
import ch.icoaching.typewise.language_modelling_result_classes.PriorReInjectionStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;

public abstract class BeamSearchInference extends Inference {

    /* renamed from: r  reason: collision with root package name */
    public static final a f8478r = new a((i) null);

    /* renamed from: m  reason: collision with root package name */
    private final BeamSearcher f8479m;

    /* renamed from: n  reason: collision with root package name */
    private final d f8480n;

    /* renamed from: o  reason: collision with root package name */
    private final PriorReInjectionStrategy f8481o;

    /* renamed from: p  reason: collision with root package name */
    private final String f8482p;

    /* renamed from: q  reason: collision with root package name */
    private final C0270f f8483q;

    public static final class a {

        /* renamed from: ch.icoaching.typewise.language_modelling.inference.inference_impl.BeamSearchInference$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0142a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f8484a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    ch.icoaching.typewise.language_modelling_result_classes.PriorReInjectionStrategy[] r0 = ch.icoaching.typewise.language_modelling_result_classes.PriorReInjectionStrategy.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    ch.icoaching.typewise.language_modelling_result_classes.PriorReInjectionStrategy r1 = ch.icoaching.typewise.language_modelling_result_classes.PriorReInjectionStrategy.SUBSTITUTE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    ch.icoaching.typewise.language_modelling_result_classes.PriorReInjectionStrategy r1 = ch.icoaching.typewise.language_modelling_result_classes.PriorReInjectionStrategy.PREPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f8484a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.inference_impl.BeamSearchInference.a.C0142a.<clinit>():void");
            }
        }

        private a() {
        }

        /* access modifiers changed from: private */
        public final LMInferenceResult b(List list, String str, PriorReInjectionStrategy priorReInjectionStrategy, String str2, String str3, int i4) {
            ArrayList arrayList = new ArrayList(C0718m.t(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(BeamSearchInference.f8478r.c((BeamSearcher.b) it.next(), str, priorReInjectionStrategy, str2, str3));
            }
            return new LMInferenceResult(arrayList, i4, (List) null, 4, (i) null);
        }

        private final ch.icoaching.typewise.language_modelling_result_classes.a c(BeamSearcher.b bVar, String str, PriorReInjectionStrategy priorReInjectionStrategy, String str2, String str3) {
            String o4;
            StringBuilder sb;
            String sb2;
            String str4 = str;
            int i4 = C0142a.f8484a[priorReInjectionStrategy.ordinal()];
            if (i4 == 1) {
                o4 = s.o(bVar.c(), str.length(), (Integer) null, 2, (Object) null);
                sb = new StringBuilder();
                sb.append(str4);
                sb.append(o4);
                sb2 = sb.toString();
            } else if (i4 != 2) {
                sb2 = bVar.c();
            } else {
                o4 = bVar.c();
                sb = new StringBuilder();
                sb.append(str4);
                sb.append(o4);
                sb2 = sb.toString();
            }
            return new ch.icoaching.typewise.language_modelling_result_classes.a(sb2, bVar.e(), str.length(), str2, str3, bVar.d(), (Map) null, (Float) null, false, (Float) null, (Float) null, 1984, (i) null);
        }

        public final Triple d(h0.c cVar, c cVar2, StatefulLanguageModel statefulLanguageModel, F f4, k0 k0Var) {
            boolean z3;
            h0.c cVar3 = cVar;
            o.e(cVar, "inferenceConfig");
            c cVar4 = cVar2;
            o.e(cVar2, "pp");
            StatefulLanguageModel statefulLanguageModel2 = statefulLanguageModel;
            o.e(statefulLanguageModel, "lm");
            o.e(f4, "cachingPriorApproachType");
            o.e(k0Var, "runningBeamsScorer");
            String j4 = cVar.j();
            Float c4 = k0.f328i.c(U.f249a.g(j4));
            int a4 = BeamSearcher.f8407j.a(j4);
            Integer n4 = cVar.n();
            o.b(n4);
            int intValue = n4.intValue();
            Boolean e4 = cVar.e();
            if (e4 != null) {
                z3 = e4.booleanValue();
            } else {
                z3 = true;
            }
            BeamSearcher beamSearcher = new BeamSearcher(cVar2, statefulLanguageModel, f4, a4, k0Var, intValue, z3, c4);
            d a5 = d.f8474a.a(cVar);
            Boolean g4 = cVar.g();
            o.b(g4);
            g4.booleanValue();
            return new Triple(beamSearcher, a5, g4);
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BeamSearchInference(java.lang.String r20, ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher r21, ch.icoaching.typewise.language_modelling.inference.beam_search.d r22, ch.icoaching.typewise.language_modelling_result_classes.PriorReInjectionStrategy r23, java.lang.String r24, boolean r25, boolean r26, java.lang.Integer r27, java.lang.Float r28, boolean r29, D0.C0270f r30, ch.icoaching.typewise.word_lists.c r31) {
        /*
            r19 = this;
            r13 = r19
            r14 = r21
            r15 = r22
            r12 = r23
            r11 = r24
            r10 = r30
            java.lang.String r0 = "languageCode"
            r1 = r20
            kotlin.jvm.internal.o.e(r1, r0)
            java.lang.String r0 = "beamSearcher"
            kotlin.jvm.internal.o.e(r14, r0)
            java.lang.String r0 = "finalBeamScorer"
            kotlin.jvm.internal.o.e(r15, r0)
            java.lang.String r0 = "priorReInjectionStrategy"
            kotlin.jvm.internal.o.e(r12, r0)
            java.lang.String r0 = "sourceName"
            kotlin.jvm.internal.o.e(r11, r0)
            java.lang.String r0 = "beamSearchInferenceDecodingStrategyMixin"
            kotlin.jvm.internal.o.e(r10, r0)
            java.lang.String r0 = "wordListRepository"
            r9 = r31
            kotlin.jvm.internal.o.e(r9, r0)
            r16 = 384(0x180, float:5.38E-43)
            r17 = 0
            r5 = 0
            r8 = 0
            r18 = 0
            r0 = r19
            r2 = r25
            r3 = r26
            r4 = r27
            r6 = r28
            r7 = r29
            r9 = r18
            r10 = r31
            r11 = r16
            r12 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.f8479m = r14
            r13.f8480n = r15
            r0 = r23
            r13.f8481o = r0
            r0 = r24
            r13.f8482p = r0
            r0 = r30
            r13.f8483q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.inference_impl.BeamSearchInference.<init>(java.lang.String, ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher, ch.icoaching.typewise.language_modelling.inference.beam_search.d, ch.icoaching.typewise.language_modelling_result_classes.PriorReInjectionStrategy, java.lang.String, boolean, boolean, java.lang.Integer, java.lang.Float, boolean, D0.f, ch.icoaching.typewise.word_lists.c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object l(ch.icoaching.typewise.language_modelling.inference.inference_impl.BeamSearchInference r11, java.lang.String r12, java.lang.String r13, java.lang.Float r14, java.lang.Integer r15, java.lang.String r16, kotlin.coroutines.c r17) {
        /*
            r0 = r11
            r1 = r17
            boolean r2 = r1 instanceof ch.icoaching.typewise.language_modelling.inference.inference_impl.BeamSearchInference$predictCompletionsImpl$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            ch.icoaching.typewise.language_modelling.inference.inference_impl.BeamSearchInference$predictCompletionsImpl$1 r2 = (ch.icoaching.typewise.language_modelling.inference.inference_impl.BeamSearchInference$predictCompletionsImpl$1) r2
            int r3 = r2.f8491g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.f8491g = r3
            goto L_0x001b
        L_0x0016:
            ch.icoaching.typewise.language_modelling.inference.inference_impl.BeamSearchInference$predictCompletionsImpl$1 r2 = new ch.icoaching.typewise.language_modelling.inference.inference_impl.BeamSearchInference$predictCompletionsImpl$1
            r2.<init>(r11, r1)
        L_0x001b:
            java.lang.Object r1 = r2.f8489e
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r2.f8491g
            r5 = 1
            if (r4 == 0) goto L_0x0049
            if (r4 != r5) goto L_0x0041
            java.lang.Object r0 = r2.f8488d
            D0.M r0 = (D0.M) r0
            java.lang.Object r3 = r2.f8487c
            java.lang.Float r3 = (java.lang.Float) r3
            java.lang.Object r4 = r2.f8486b
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.f8485a
            ch.icoaching.typewise.language_modelling.inference.inference_impl.BeamSearchInference r2 = (ch.icoaching.typewise.language_modelling.inference.inference_impl.BeamSearchInference) r2
            kotlin.f.b(r1)
            r9 = r3
            r10 = r1
            r1 = r0
            r0 = r2
            r2 = r10
            goto L_0x0072
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            kotlin.f.b(r1)
            D0.f r1 = r0.f8483q
            r4 = r12
            D0.M r1 = r1.c(r12)
            ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher r4 = r0.f8479m
            java.lang.String r6 = r1.a()
            java.lang.String r7 = r1.b()
            r2.f8485a = r0
            r8 = r13
            r2.f8486b = r8
            r9 = r14
            r2.f8487c = r9
            r2.f8488d = r1
            r2.f8491g = r5
            r5 = r15
            java.lang.Object r2 = r4.f(r6, r7, r15, r2)
            if (r2 != r3) goto L_0x0071
            return r3
        L_0x0071:
            r4 = r8
        L_0x0072:
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r3 = r2.component1()
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r2.component2()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            ch.icoaching.typewise.language_modelling.inference.beam_search.d r5 = r0.f8480n
            java.util.List r3 = r5.b(r3, r9)
            ch.icoaching.typewise.language_modelling.inference.inference_impl.BeamSearchInference$a r5 = f8478r
            java.lang.String r6 = r1.c()
            ch.icoaching.typewise.language_modelling_result_classes.PriorReInjectionStrategy r7 = r0.f8481o
            java.lang.String r8 = r0.f8482p
            ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher r9 = r0.f8479m
            ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel r9 = r9.j()
            java.lang.String r9 = r9.c()
            r11 = r5
            r12 = r3
            r13 = r6
            r14 = r7
            r15 = r8
            r16 = r9
            r17 = r2
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r2 = r11.b(r12, r13, r14, r15, r16, r17)
            java.lang.String r3 = r1.a()
            java.lang.String r1 = r1.a()
            r5 = 953267991(0x38d1b717, float:1.0E-4)
            r11 = r0
            r12 = r3
            r13 = r2
            r14 = r1
            r15 = r4
            r16 = r5
            r11.j(r12, r13, r14, r15, r16)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.inference_impl.BeamSearchInference.l(ch.icoaching.typewise.language_modelling.inference.inference_impl.BeamSearchInference, java.lang.String, java.lang.String, java.lang.Float, java.lang.Integer, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    static /* synthetic */ Object m(BeamSearchInference beamSearchInference, kotlin.coroutines.c cVar) {
        Object b4 = beamSearchInference.f8479m.j().b(cVar);
        if (b4 == kotlin.coroutines.intrinsics.a.f()) {
            return b4;
        }
        return q.f14567a;
    }

    public Object b(String str, String str2, Float f4, Integer num, String str3, kotlin.coroutines.c cVar) {
        return l(this, str, str2, f4, num, str3, cVar);
    }

    public Object h(kotlin.coroutines.c cVar) {
        return m(this, cVar);
    }
}
