package ch.icoaching.typewise.language_modelling.inference.inference_impl.beam_search_inferences_impl;

import D0.U;
import D0.V;
import D0.h0;
import D0.k0;
import androidx.work.c;
import ch.icoaching.typewise.e;
import ch.icoaching.typewise.language_modelling.inference.Inference;
import ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher;
import ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.KeepEncodingFromInWordCachingPriorApproach;
import ch.icoaching.typewise.language_modelling.inference.beam_search.d;
import ch.icoaching.typewise.language_modelling.inference.inference_impl.BeamSearchInference;
import ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt;
import ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class CharacterLevelBeamSearchInference extends BeamSearchInference {

    /* renamed from: t  reason: collision with root package name */
    public static final a f8559t = new a((i) null);

    /* renamed from: s  reason: collision with root package name */
    private final BeamSearcher f8560s;

    public static final class a extends Inference.InferenceCompanion {

        /* renamed from: ch.icoaching.typewise.language_modelling.inference.inference_impl.beam_search_inferences_impl.CharacterLevelBeamSearchInference$a$a  reason: collision with other inner class name */
        public static final class C0143a {

            /* renamed from: a  reason: collision with root package name */
            private final String f8561a;

            /* renamed from: b  reason: collision with root package name */
            private final BeamSearcher f8562b;

            /* renamed from: c  reason: collision with root package name */
            private final d f8563c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f8564d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f8565e;

            /* renamed from: f  reason: collision with root package name */
            private final Integer f8566f;

            /* renamed from: g  reason: collision with root package name */
            private final Float f8567g;

            /* renamed from: h  reason: collision with root package name */
            private final boolean f8568h;

            public C0143a(String str, BeamSearcher beamSearcher, d dVar, boolean z3, boolean z4, Integer num, Float f4, boolean z5) {
                o.e(str, "languageCode");
                o.e(beamSearcher, "beamSearcher");
                o.e(dVar, "finalBeamScorer");
                this.f8561a = str;
                this.f8562b = beamSearcher;
                this.f8563c = dVar;
                this.f8564d = z3;
                this.f8565e = z4;
                this.f8566f = num;
                this.f8567g = f4;
                this.f8568h = z5;
            }

            public final String a() {
                return this.f8561a;
            }

            public final BeamSearcher b() {
                return this.f8562b;
            }

            public final d c() {
                return this.f8563c;
            }

            public final boolean d() {
                return this.f8564d;
            }

            public final boolean e() {
                return this.f8565e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0143a)) {
                    return false;
                }
                C0143a aVar = (C0143a) obj;
                return o.a(this.f8561a, aVar.f8561a) && o.a(this.f8562b, aVar.f8562b) && o.a(this.f8563c, aVar.f8563c) && this.f8564d == aVar.f8564d && this.f8565e == aVar.f8565e && o.a(this.f8566f, aVar.f8566f) && o.a(this.f8567g, aVar.f8567g) && this.f8568h == aVar.f8568h;
            }

            public final Integer f() {
                return this.f8566f;
            }

            public final Float g() {
                return this.f8567g;
            }

            public final boolean h() {
                return this.f8568h;
            }

            public int hashCode() {
                int hashCode = ((((((((this.f8561a.hashCode() * 31) + this.f8562b.hashCode()) * 31) + this.f8563c.hashCode()) * 31) + c.a(this.f8564d)) * 31) + c.a(this.f8565e)) * 31;
                Integer num = this.f8566f;
                int i4 = 0;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Float f4 = this.f8567g;
                if (f4 != null) {
                    i4 = f4.hashCode();
                }
                return ((hashCode2 + i4) * 31) + c.a(this.f8568h);
            }

            public String toString() {
                String str = this.f8561a;
                BeamSearcher beamSearcher = this.f8562b;
                d dVar = this.f8563c;
                boolean z3 = this.f8564d;
                boolean z4 = this.f8565e;
                Integer num = this.f8566f;
                Float f4 = this.f8567g;
                boolean z5 = this.f8568h;
                return "GetAllInitParamsResult(languageCode=" + str + ", beamSearcher=" + beamSearcher + ", finalBeamScorer=" + dVar + ", doFilterEmptyPredictions=" + z3 + ", filterPredictionsNotInWordList=" + z4 + ", filterSavingLessThanNChar=" + num + ", filterScoreLowerThan=" + f4 + ", filterPredictionsInBlocklist=" + z5 + ")";
            }
        }

        private a() {
        }

        /* access modifiers changed from: private */
        public static final ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.d f(ch.icoaching.typewise.language_modelling.preprocessing.c cVar, StatefulLanguageModel statefulLanguageModel, int i4, boolean z3) {
            o.e(cVar, "ppLocal");
            o.e(statefulLanguageModel, "modelLocal");
            return new KeepEncodingFromInWordCachingPriorApproach(cVar, statefulLanguageModel, i4, z3);
        }

        public final k0 e(String str, List list, List list2, int i4) {
            o.e(str, "inferenceStrDeclaration");
            o.e(list, "stopIndicesInVocab");
            o.e(list2, "validForPredictionIndicesMask");
            return new k0(list, list2, i4, false, U.a(U.f249a, str, 0, 2, (Object) null), 8, (i) null);
        }

        public final C0143a g(h0 h0Var, StatefulLanguageModel statefulLanguageModel, ch.icoaching.typewise.language_modelling.preprocessing.c cVar) {
            ch.icoaching.typewise.language_modelling.preprocessing.c cVar2 = cVar;
            o.e(h0Var, "config");
            StatefulLanguageModel statefulLanguageModel2 = statefulLanguageModel;
            o.e(statefulLanguageModel2, "model");
            o.e(cVar2, "pp");
            h0.c a4 = h0Var.a();
            String j4 = a4.j();
            Inference.a aVar = Inference.f8354k;
            Pair b4 = aVar.b(a4, cVar2);
            Triple d4 = BeamSearchInference.f8478r.d(a4, cVar2, statefulLanguageModel2, new a(), e(j4, (List) b4.component1(), (List) b4.component2(), ModelsFilesHandlingKt.a(h0Var)));
            BeamSearcher beamSearcher = (BeamSearcher) d4.component1();
            d dVar = (d) d4.component2();
            boolean booleanValue = ((Boolean) d4.component3()).booleanValue();
            boolean e4 = aVar.e(j4);
            if (e4) {
                e.b(e.f8233a, "CharacterLevelBeamSearchInference", "Filtering words not in the wordlist for char level beam search", (Throwable) null, 4, (Object) null);
            } else {
                e.l(e.f8233a, "CharacterLevelBeamSearchInference", "NOT filtering words not in the wordlist for char level beam search", (Throwable) null, 4, (Object) null);
            }
            String h4 = ModelsFilesHandlingKt.h(h0Var);
            U u3 = U.f249a;
            Integer f4 = u3.f(j4);
            Float g4 = u3.g(j4);
            boolean d5 = aVar.d(j4);
            if (d5) {
                e.b(e.f8233a, "CharacterLevelBeamSearchInference", "Filtering words in the blocklist for char level beam search", (Throwable) null, 4, (Object) null);
            } else {
                e.b(e.f8233a, "CharacterLevelBeamSearchInference", "NOT filtering words in the blocklist for char level beam search", (Throwable) null, 4, (Object) null);
            }
            return new C0143a(h4, beamSearcher, dVar, booleanValue, e4, f4, g4, d5);
        }

        /* renamed from: h */
        public CharacterLevelBeamSearchInference b(h0 h0Var, V v3, ch.icoaching.typewise.language_modelling.preprocessing.a aVar, ch.icoaching.typewise.word_lists.c cVar) {
            o.e(h0Var, "config");
            o.e(v3, "model");
            o.e(cVar, "wordListRepository");
            if (!(v3 instanceof StatefulLanguageModel)) {
                throw new IllegalArgumentException("CharacterLevelBeamSearchInference requires a stateful model.");
            } else if (aVar == null || !(aVar instanceof ch.icoaching.typewise.language_modelling.preprocessing.c)) {
                throw new IllegalArgumentException("CharacterLevelBeamSearchInference requires a PreprocessingWithVocab instance.");
            } else {
                C0143a g4 = g(h0Var, (StatefulLanguageModel) v3, (ch.icoaching.typewise.language_modelling.preprocessing.c) aVar);
                return new CharacterLevelBeamSearchInference(g4.a(), g4.b(), g4.c(), g4.d(), g4.e(), g4.f(), g4.g(), g4.h(), cVar);
            }
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CharacterLevelBeamSearchInference(java.lang.String r15, ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher r16, ch.icoaching.typewise.language_modelling.inference.beam_search.d r17, boolean r18, boolean r19, java.lang.Integer r20, java.lang.Float r21, boolean r22, ch.icoaching.typewise.word_lists.c r23) {
        /*
            r14 = this;
            r13 = r16
            java.lang.String r0 = "languageCode"
            r1 = r15
            kotlin.jvm.internal.o.e(r15, r0)
            java.lang.String r0 = "beamSearcher"
            kotlin.jvm.internal.o.e(r13, r0)
            java.lang.String r0 = "finalBeamScorer"
            r3 = r17
            kotlin.jvm.internal.o.e(r3, r0)
            java.lang.String r0 = "wordListRepository"
            r12 = r23
            kotlin.jvm.internal.o.e(r12, r0)
            ch.icoaching.typewise.language_modelling_result_classes.PriorReInjectionStrategy r4 = ch.icoaching.typewise.language_modelling_result_classes.PriorReInjectionStrategy.PREPEND
            D0.S r11 = new D0.S
            r11.<init>()
            java.lang.String r5 = "char_level_neural"
            r0 = r14
            r2 = r16
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.f8560s = r13
            ch.icoaching.typewise.language_modelling.preprocessing.c r1 = r16.k()
            java.util.List r1 = r1.n()
            java.lang.String r2 = "\n"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x005a
            D0.k0 r1 = r16.l()
            int r1 = r1.m()
            r2 = 1
            if (r1 > r2) goto L_0x0052
            goto L_0x005a
        L_0x0052:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Newline is not allowed in the vocab for beam search at char level when predicting more than one word, please use greedy decoding instead."
            r1.<init>(r2)
            throw r1
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.inference_impl.beam_search_inferences_impl.CharacterLevelBeamSearchInference.<init>(java.lang.String, ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher, ch.icoaching.typewise.language_modelling.inference.beam_search.d, boolean, boolean, java.lang.Integer, java.lang.Float, boolean, ch.icoaching.typewise.word_lists.c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x01a2 A[LOOP:0: B:26:0x019c->B:28:0x01a2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.String r21, java.lang.String r22, kotlin.coroutines.c r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r23
            r2 = 0
            r3 = 2
            r4 = 1
            boolean r5 = r1 instanceof ch.icoaching.typewise.language_modelling.inference.inference_impl.beam_search_inferences_impl.CharacterLevelBeamSearchInference$getScoreOfCompletion$1
            if (r5 == 0) goto L_0x001a
            r5 = r1
            ch.icoaching.typewise.language_modelling.inference.inference_impl.beam_search_inferences_impl.CharacterLevelBeamSearchInference$getScoreOfCompletion$1 r5 = (ch.icoaching.typewise.language_modelling.inference.inference_impl.beam_search_inferences_impl.CharacterLevelBeamSearchInference$getScoreOfCompletion$1) r5
            int r6 = r5.f8579k
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001a
            int r6 = r6 - r7
            r5.f8579k = r6
            goto L_0x001f
        L_0x001a:
            ch.icoaching.typewise.language_modelling.inference.inference_impl.beam_search_inferences_impl.CharacterLevelBeamSearchInference$getScoreOfCompletion$1 r5 = new ch.icoaching.typewise.language_modelling.inference.inference_impl.beam_search_inferences_impl.CharacterLevelBeamSearchInference$getScoreOfCompletion$1
            r5.<init>(r0, r1)
        L_0x001f:
            java.lang.Object r1 = r5.f8577i
            java.lang.Object r13 = kotlin.coroutines.intrinsics.a.f()
            int r6 = r5.f8579k
            if (r6 == 0) goto L_0x0073
            if (r6 == r4) goto L_0x0059
            if (r6 != r3) goto L_0x0051
            int r6 = r5.f8576h
            java.lang.Object r7 = r5.f8575g
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r5.f8574f
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r5.f8573e
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r5.f8572d
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r5.f8571c
            ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel r11 = (ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel) r11
            java.lang.Object r12 = r5.f8570b
            ch.icoaching.typewise.language_modelling.preprocessing.c r12 = (ch.icoaching.typewise.language_modelling.preprocessing.c) r12
            java.lang.Object r14 = r5.f8569a
            ch.icoaching.typewise.language_modelling.inference.inference_impl.beam_search_inferences_impl.CharacterLevelBeamSearchInference r14 = (ch.icoaching.typewise.language_modelling.inference.inference_impl.beam_search_inferences_impl.CharacterLevelBeamSearchInference) r14
            kotlin.f.b(r1)
            r15 = r14
            goto L_0x0176
        L_0x0051:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0059:
            int r6 = r5.f8576h
            java.lang.Object r7 = r5.f8573e
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r5.f8572d
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r5.f8571c
            ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel r9 = (ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel) r9
            java.lang.Object r10 = r5.f8570b
            ch.icoaching.typewise.language_modelling.preprocessing.c r10 = (ch.icoaching.typewise.language_modelling.preprocessing.c) r10
            java.lang.Object r11 = r5.f8569a
            ch.icoaching.typewise.language_modelling.inference.inference_impl.beam_search_inferences_impl.CharacterLevelBeamSearchInference r11 = (ch.icoaching.typewise.language_modelling.inference.inference_impl.beam_search_inferences_impl.CharacterLevelBeamSearchInference) r11
            kotlin.f.b(r1)
            goto L_0x00ce
        L_0x0073:
            kotlin.f.b(r1)
            ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher r1 = r0.f8560s
            ch.icoaching.typewise.language_modelling.preprocessing.c r1 = r1.k()
            ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher r6 = r0.f8560s
            ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel r14 = r6.j()
            int r15 = r14.f()
            r6 = r22
            java.lang.String r6 = r1.b(r6)
            java.util.List r6 = r1.f(r6)
            java.util.List r12 = r1.j(r6)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher r6 = r0.f8560s
            ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.d r6 = r6.i()
            r5.f8569a = r0
            r5.f8570b = r1
            r5.f8571c = r14
            r5.f8572d = r12
            r5.f8573e = r11
            r5.f8576h = r15
            r5.f8579k = r4
            r16 = 2
            r17 = 0
            r8 = 0
            r9 = 0
            r7 = r21
            r10 = r5
            r18 = r11
            r11 = r16
            r16 = r12
            r12 = r17
            java.lang.Object r6 = ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.d.a(r6, r7, r8, r9, r10, r11, r12)
            if (r6 != r13) goto L_0x00c5
            return r13
        L_0x00c5:
            r11 = r0
            r10 = r1
            r1 = r6
            r9 = r14
            r6 = r15
            r8 = r16
            r7 = r18
        L_0x00ce:
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r12 = r1.component1()
            D0.E r12 = (D0.E) r12
            java.lang.Object r1 = r1.component2()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r8 = r8.iterator()
            r19 = r10
            r10 = r7
            r7 = r8
            r8 = r15
            r15 = r11
            r11 = r9
            r9 = r14
            r14 = r12
            r12 = r19
        L_0x00f5:
            boolean r16 = r7.hasNext()
            if (r16 == 0) goto L_0x018d
            java.lang.Object r16 = r7.next()
            java.lang.Number r16 = (java.lang.Number) r16
            int r3 = r16.intValue()
            D0.E r4 = r14.b(r2)
            D0.E r4 = r4.b(r3)
            float r4 = r4.j()
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.a.c(r4)
            r10.add(r4)
            D0.E r4 = r14.b(r2)
            r0 = 2
            r2 = 0
            D0.E r2 = D0.C.T(r4, r2, r0, r2)
            int r0 = r2.k()
            java.util.Map r2 = r12.k()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.d(r0)
            java.lang.Object r2 = r2.get(r4)
            kotlin.jvm.internal.o.b(r2)
            r9.add(r2)
            r2 = 0
            D0.E r4 = r14.b(r2)
            D0.E r0 = r4.b(r0)
            float r0 = r0.j()
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.a.c(r0)
            r8.add(r0)
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.d(r3)
            java.util.List r0 = kotlin.collections.C0718m.e(r0)
            java.util.List r0 = kotlin.collections.C0718m.e(r0)
            D0.E r0 = D0.C.D0(r0)
            r5.f8569a = r15
            r5.f8570b = r12
            r5.f8571c = r11
            r5.f8572d = r10
            r5.f8573e = r9
            r5.f8574f = r8
            r5.f8575g = r7
            r5.f8576h = r6
            r2 = 2
            r5.f8579k = r2
            java.lang.Object r1 = r11.g(r0, r1, r5)
            if (r1 != r13) goto L_0x0176
            return r13
        L_0x0176:
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r0 = r1.getFirst()
            r14 = r0
            D0.E r14 = (D0.E) r14
            java.lang.Object r0 = r1.getSecond()
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            r0 = r20
            r2 = 0
            r3 = 2
            r4 = 1
            goto L_0x00f5
        L_0x018d:
            ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher r0 = r15.f8560s
            D0.k0 r0 = r0.l()
            java.util.List r0 = r0.n()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x019c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01bb
            java.lang.Object r2 = r0.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = 0
            D0.E r4 = r14.b(r3)
            D0.E r2 = r4.b(r2)
            float r2 = r2.j()
            float r1 = r1 + r2
            goto L_0x019c
        L_0x01bb:
            r3 = 0
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.a.c(r1)
            r10.add(r0)
            D0.E r0 = r14.b(r3)
            r1 = 0
            r2 = 2
            D0.E r0 = D0.C.T(r0, r1, r2, r1)
            int r0 = r0.k()
            java.util.Map r1 = r12.k()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r0)
            java.lang.Object r1 = r1.get(r2)
            kotlin.jvm.internal.o.b(r1)
            r9.add(r1)
            D0.E r1 = r14.b(r3)
            D0.E r0 = r1.b(r0)
            float r0 = r0.j()
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.a.c(r0)
            r8.add(r0)
            java.util.Iterator r0 = r10.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0263
            java.lang.Object r1 = r0.next()
        L_0x0204:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0220
            java.lang.Object r2 = r0.next()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = r1 * r2
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.a.c(r1)
            goto L_0x0204
        L_0x0220:
            java.lang.Number r1 = (java.lang.Number) r1
            float r0 = r1.floatValue()
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.a.c(r0)
            int r1 = r11.f()
            int r1 = r1 - r6
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.d(r1)
            java.lang.String r2 = "nr_calls"
            kotlin.Pair r1 = l2.g.a(r2, r1)
            java.lang.String r2 = "tokens_probs"
            kotlin.Pair r2 = l2.g.a(r2, r10)
            java.lang.String r3 = "max_tokens"
            kotlin.Pair r3 = l2.g.a(r3, r9)
            java.lang.String r4 = "max_probs"
            kotlin.Pair r4 = l2.g.a(r4, r8)
            r5 = 4
            kotlin.Pair[] r5 = new kotlin.Pair[r5]
            r6 = 0
            r5[r6] = r1
            r1 = 1
            r5[r1] = r2
            r1 = 2
            r5[r1] = r3
            r1 = 3
            r5[r1] = r4
            java.util.Map r1 = kotlin.collections.D.j(r5)
            kotlin.Pair r0 = l2.g.a(r0, r1)
            return r0
        L_0x0263:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Empty collection can't be reduced."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.inference_impl.beam_search_inferences_impl.CharacterLevelBeamSearchInference.c(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
