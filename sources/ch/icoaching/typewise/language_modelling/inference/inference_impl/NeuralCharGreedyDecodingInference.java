package ch.icoaching.typewise.language_modelling.inference.inference_impl;

import D0.C;
import D0.E;
import D0.J;
import D0.U;
import D0.V;
import D0.h0;
import E0.r;
import ch.icoaching.typewise.e;
import ch.icoaching.typewise.language_modelling.inference.Inference;
import ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.KeepEncodingFromInWordCachingPriorApproach;
import ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt;
import ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel;
import ch.icoaching.typewise.language_modelling.preprocessing.PreprocessingCharTW;
import ch.icoaching.typewise.language_modelling.preprocessing.c;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;
import y0.C0945b;

public final class NeuralCharGreedyDecodingInference extends Inference {

    /* renamed from: A  reason: collision with root package name */
    public static final a f8525A = new a((i) null);

    /* renamed from: m  reason: collision with root package name */
    private final c f8526m;

    /* renamed from: n  reason: collision with root package name */
    private final StatefulLanguageModel f8527n;

    /* renamed from: o  reason: collision with root package name */
    private final int f8528o;

    /* renamed from: p  reason: collision with root package name */
    private final List f8529p;

    /* renamed from: q  reason: collision with root package name */
    private final float f8530q;

    /* renamed from: r  reason: collision with root package name */
    private Float f8531r;

    /* renamed from: s  reason: collision with root package name */
    private final Set f8532s;

    /* renamed from: t  reason: collision with root package name */
    private final KeepEncodingFromInWordCachingPriorApproach f8533t;

    /* renamed from: u  reason: collision with root package name */
    private E f8534u;

    /* renamed from: v  reason: collision with root package name */
    private Set f8535v;

    /* renamed from: w  reason: collision with root package name */
    private final int f8536w;

    /* renamed from: x  reason: collision with root package name */
    private final E f8537x;

    /* renamed from: y  reason: collision with root package name */
    private Float f8538y;

    /* renamed from: z  reason: collision with root package name */
    private float f8539z;

    public static final class a extends Inference.InferenceCompanion {
        private a() {
        }

        /* renamed from: d */
        public NeuralCharGreedyDecodingInference b(h0 h0Var, V v3, ch.icoaching.typewise.language_modelling.preprocessing.a aVar, ch.icoaching.typewise.word_lists.c cVar) {
            boolean z3;
            V v4 = v3;
            ch.icoaching.typewise.language_modelling.preprocessing.a aVar2 = aVar;
            o.e(h0Var, "config");
            o.e(v4, "model");
            o.e(cVar, "wordListRepository");
            if (!(v4 instanceof StatefulLanguageModel)) {
                throw new IllegalArgumentException("NeuralCharGreedyDecodingInference requires a stateful model");
            } else if (aVar2 instanceof PreprocessingCharTW) {
                String j4 = h0Var.a().j();
                String h4 = ModelsFilesHandlingKt.h(h0Var);
                Inference.a aVar3 = Inference.f8354k;
                boolean e4 = aVar3.e(j4);
                if (!e4) {
                    e.l(e.f8233a, "NeuralCharGreedyDecodingInference", "Using neural sentence inference with greedy decoding but not filtering out the results that aren't in dictionary", (Throwable) null, 4, (Object) null);
                }
                Boolean g4 = h0Var.a().g();
                o.b(g4);
                boolean booleanValue = g4.booleanValue();
                r a4 = a(j4);
                Integer num = (Integer) a4.a();
                Float f4 = (Float) a4.b();
                Float f5 = (Float) a4.c();
                boolean booleanValue2 = ((Boolean) a4.d()).booleanValue();
                U u3 = U.f249a;
                int a5 = U.a(u3, j4, 0, 2, (Object) null);
                int a6 = ModelsFilesHandlingKt.a(h0Var);
                Pair b4 = aVar3.b(h0Var.a(), (c) aVar2);
                List list = (List) b4.component1();
                List list2 = (List) b4.component2();
                if (h0Var.a().f() == null) {
                    boolean d4 = aVar3.d(j4);
                    if (d4) {
                        e.b(e.f8233a, "NeuralCharGreedyDecodingInference", "Filtering out predictions in blocklist for neural char greedy decoding", (Throwable) null, 4, (Object) null);
                    } else {
                        e.b(e.f8233a, "NeuralCharGreedyDecodingInference", "Not filtering out predictions in blocklist for neural char greedy decoding", (Throwable) null, 4, (Object) null);
                    }
                    boolean c4 = u3.c(j4);
                    if (c4) {
                        e.b(e.f8233a, "NeuralCharGreedyDecodingInference", "Filtering out predictions after names for neural char greedy decoding", (Throwable) null, 4, (Object) null);
                    } else {
                        e.b(e.f8233a, "NeuralCharGreedyDecodingInference", "Not filtering out predictions after names for neural char greedy decoding", (Throwable) null, 4, (Object) null);
                    }
                    PreprocessingCharTW preprocessingCharTW = (PreprocessingCharTW) aVar2;
                    StatefulLanguageModel statefulLanguageModel = (StatefulLanguageModel) v4;
                    Integer n4 = h0Var.a().n();
                    o.b(n4);
                    int intValue = n4.intValue();
                    List h5 = h0Var.a().h();
                    if (h5 == null) {
                        h5 = C0718m.j();
                    }
                    Boolean e5 = h0Var.a().e();
                    if (e5 != null) {
                        z3 = e5.booleanValue();
                    } else {
                        z3 = true;
                    }
                    return new NeuralCharGreedyDecodingInference(h4, preprocessingCharTW, statefulLanguageModel, a5, a6, list, list2, h5, intValue, z3, C0945b.a(j4, 1.0f), num, f4, f5, booleanValue, e4, d4, booleanValue2, c4, cVar);
                }
                throw new IllegalArgumentException("append_stop_token_to_pred not supported anymore");
            } else {
                throw new IllegalArgumentException("NeuralCharGreedyDecodingInference requires a PreprocessingCharTW instance");
            }
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f8540a;

        /* renamed from: b  reason: collision with root package name */
        private final E f8541b;

        /* renamed from: c  reason: collision with root package name */
        private final int f8542c;

        /* renamed from: d  reason: collision with root package name */
        private final E f8543d;

        /* renamed from: e  reason: collision with root package name */
        private final E f8544e;

        public b(int i4, E e4, int i5, E e5, E e6) {
            o.e(e4, "bestTokenProb");
            o.e(e5, "stopTokensThisProbsTotal");
            o.e(e6, "maxRunningProb");
            this.f8540a = i4;
            this.f8541b = e4;
            this.f8542c = i5;
            this.f8543d = e5;
            this.f8544e = e6;
        }

        public final int a() {
            return this.f8540a;
        }

        public final E b() {
            return this.f8541b;
        }

        public final int c() {
            return this.f8542c;
        }

        public final E d() {
            return this.f8543d;
        }

        public final E e() {
            return this.f8544e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f8540a == bVar.f8540a && o.a(this.f8541b, bVar.f8541b) && this.f8542c == bVar.f8542c && o.a(this.f8543d, bVar.f8543d) && o.a(this.f8544e, bVar.f8544e);
        }

        public int hashCode() {
            return (((((((this.f8540a * 31) + this.f8541b.hashCode()) * 31) + this.f8542c) * 31) + this.f8543d.hashCode()) * 31) + this.f8544e.hashCode();
        }

        public String toString() {
            int i4 = this.f8540a;
            E e4 = this.f8541b;
            int i5 = this.f8542c;
            E e5 = this.f8543d;
            E e6 = this.f8544e;
            return "ComputeProbsInfoResult(bestTokenId=" + i4 + ", bestTokenProb=" + e4 + ", bestStopToken=" + i5 + ", stopTokensThisProbsTotal=" + e5 + ", maxRunningProb=" + e6 + ")";
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NeuralCharGreedyDecodingInference(java.lang.String r17, ch.icoaching.typewise.language_modelling.preprocessing.c r18, ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel r19, int r20, int r21, java.util.List r22, java.util.List r23, java.util.List r24, int r25, boolean r26, float r27, java.lang.Integer r28, java.lang.Float r29, java.lang.Float r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, ch.icoaching.typewise.word_lists.c r36) {
        /*
            r16 = this;
            r11 = r16
            r12 = r18
            r13 = r19
            r14 = r24
            java.lang.String r0 = "languageCode"
            r1 = r17
            kotlin.jvm.internal.o.e(r1, r0)
            java.lang.String r0 = "pp"
            kotlin.jvm.internal.o.e(r12, r0)
            java.lang.String r0 = "lm"
            kotlin.jvm.internal.o.e(r13, r0)
            java.lang.String r0 = "stopIndices"
            r15 = r22
            kotlin.jvm.internal.o.e(r15, r0)
            java.lang.String r0 = "validForPredictionIndicesMask"
            r10 = r23
            kotlin.jvm.internal.o.e(r10, r0)
            java.lang.String r0 = "endOfSequenceTokens"
            kotlin.jvm.internal.o.e(r14, r0)
            java.lang.String r0 = "wordListRepository"
            r9 = r36
            kotlin.jvm.internal.o.e(r9, r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r34)
            r5 = 0
            r0 = r16
            r2 = r31
            r3 = r32
            r4 = r28
            r6 = r30
            r7 = r33
            r9 = r35
            r10 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f8526m = r12
            r11.f8527n = r13
            r0 = r20
            r11.f8528o = r0
            r11.f8529p = r14
            r0 = r27
            r11.f8530q = r0
            r0 = r29
            r11.f8531r = r0
            java.util.Set r0 = kotlin.collections.C0718m.F0(r22)
            r11.f8532s = r0
            ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.KeepEncodingFromInWordCachingPriorApproach r0 = new ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.KeepEncodingFromInWordCachingPriorApproach
            r1 = r25
            r2 = r26
            r0.<init>(r12, r13, r1, r2)
            r11.f8533t = r0
            int r0 = r18.o()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        L_0x0078:
            if (r2 >= r0) goto L_0x008e
            java.util.Set r3 = r11.f8532s
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r3 = r3.contains(r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1.add(r3)
            int r2 = r2 + 1
            goto L_0x0078
        L_0x008e:
            D0.E r0 = D0.C.a0(r1)
            r11.f8534u = r0
            ch.icoaching.typewise.language_modelling.preprocessing.c r0 = r11.f8526m
            java.util.List r1 = r11.f8529p
            java.util.List r0 = r0.j(r1)
            java.util.Set r0 = kotlin.collections.C0718m.F0(r0)
            r11.f8535v = r0
            int r0 = r11.f8528o
            int r0 = r0 * r21
            r11.f8536w = r0
            D0.E r0 = D0.C.a0(r23)
            r11.f8537x = r0
            java.lang.Float r0 = r11.f8531r
            if (r0 == 0) goto L_0x00e4
            r11.f8538y = r0
            ch.icoaching.typewise.e r1 = ch.icoaching.typewise.e.f8233a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Filtering prob <= "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " and not passing it higher in the hierarchy"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 4
            r3 = 0
            java.lang.String r4 = "NeuralCharGreedyDecodingInference"
            r5 = 0
            r17 = r1
            r18 = r4
            r19 = r0
            r20 = r5
            r21 = r2
            r22 = r3
            ch.icoaching.typewise.e.b(r17, r18, r19, r20, r21, r22)
            r0 = 0
            r11.f8531r = r0
            goto L_0x00ec
        L_0x00e4:
            float r0 = r11.f8539z
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r11.f8538y = r0
        L_0x00ec:
            r16.o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.inference_impl.NeuralCharGreedyDecodingInference.<init>(java.lang.String, ch.icoaching.typewise.language_modelling.preprocessing.c, ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel, int, int, java.util.List, java.util.List, java.util.List, int, boolean, float, java.lang.Integer, java.lang.Float, java.lang.Float, boolean, boolean, boolean, boolean, boolean, ch.icoaching.typewise.word_lists.c):void");
    }

    private final void o() {
        if (!this.f8535v.isEmpty() && this.f8526m.l()) {
            throw new IllegalArgumentException("During training all stop tokens were mapped to space, but now you have defined endOfSequenceTokens, which will probably be never predicted");
        } else if (this.f8526m.n().contains("\n") && !this.f8529p.contains("\n")) {
            e.l(e.f8233a, "NeuralCharGreedyDecodingInference", "You have newline in the vocabulary, but not in the end of sequence tokens, this means predictions may contain a new line", (Throwable) null, 4, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.String r26, java.lang.String r27, java.lang.Float r28, java.lang.Integer r29, java.lang.String r30, kotlin.coroutines.c r31) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r31
            boolean r3 = r2 instanceof ch.icoaching.typewise.language_modelling.inference.inference_impl.NeuralCharGreedyDecodingInference$predictCompletionsImpl$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            ch.icoaching.typewise.language_modelling.inference.inference_impl.NeuralCharGreedyDecodingInference$predictCompletionsImpl$1 r3 = (ch.icoaching.typewise.language_modelling.inference.inference_impl.NeuralCharGreedyDecodingInference$predictCompletionsImpl$1) r3
            int r4 = r3.f8558n
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f8558n = r4
            goto L_0x001e
        L_0x0019:
            ch.icoaching.typewise.language_modelling.inference.inference_impl.NeuralCharGreedyDecodingInference$predictCompletionsImpl$1 r3 = new ch.icoaching.typewise.language_modelling.inference.inference_impl.NeuralCharGreedyDecodingInference$predictCompletionsImpl$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f8556l
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.f()
            int r5 = r3.f8558n
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0086
            if (r5 == r7) goto L_0x0069
            if (r5 != r6) goto L_0x0061
            int r1 = r3.f8555k
            int r5 = r3.f8554j
            int r9 = r3.f8553i
            int r10 = r3.f8552h
            java.lang.Object r11 = r3.f8551g
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r3.f8550f
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r3.f8549e
            D0.E r13 = (D0.E) r13
            java.lang.Object r14 = r3.f8548d
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r3.f8547c
            java.lang.Float r15 = (java.lang.Float) r15
            java.lang.Object r6 = r3.f8546b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r3.f8545a
            ch.icoaching.typewise.language_modelling.inference.inference_impl.NeuralCharGreedyDecodingInference r7 = (ch.icoaching.typewise.language_modelling.inference.inference_impl.NeuralCharGreedyDecodingInference) r7
            kotlin.f.b(r2)
            r8 = r4
            r17 = r9
            r0 = r12
            r9 = r15
            r12 = 2
            r15 = r10
            r10 = r14
            r14 = r11
            goto L_0x01de
        L_0x0061:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0069:
            int r1 = r3.f8552h
            java.lang.Object r5 = r3.f8548d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r3.f8547c
            java.lang.Float r6 = (java.lang.Float) r6
            java.lang.Object r7 = r3.f8546b
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r3.f8545a
            ch.icoaching.typewise.language_modelling.inference.inference_impl.NeuralCharGreedyDecodingInference r9 = (ch.icoaching.typewise.language_modelling.inference.inference_impl.NeuralCharGreedyDecodingInference) r9
            kotlin.f.b(r2)
            r23 = r6
            r6 = r1
            r1 = r7
            r7 = r9
            r9 = r23
            goto L_0x00b4
        L_0x0086:
            kotlin.f.b(r2)
            r2 = 0
            r5 = 1
            java.lang.String r2 = y0.C0946c.i(r1, r8, r5, r2)
            ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel r6 = r0.f8527n
            int r6 = r6.f()
            ch.icoaching.typewise.language_modelling.inference.beam_search.caching_prior_approaches.KeepEncodingFromInWordCachingPriorApproach r7 = r0.f8533t
            r3.f8545a = r0
            r3.f8546b = r1
            r9 = r28
            r3.f8547c = r9
            r3.f8548d = r2
            r3.f8552h = r6
            r3.f8558n = r5
            java.lang.String r5 = ""
            java.lang.Object r5 = r7.b(r1, r5, r8, r3)
            if (r5 != r4) goto L_0x00ae
            return r4
        L_0x00ae:
            r7 = r0
            r23 = r5
            r5 = r2
            r2 = r23
        L_0x00b4:
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r10 = r2.component1()
            D0.E r10 = (D0.E) r10
            java.lang.Object r2 = r2.component2()
            java.util.List r2 = (java.util.List) r2
            D0.E r11 = r10.b(r8)
            r12 = 1065353216(0x3f800000, float:1.0)
            D0.E r12 = D0.C.y(r12)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r15 = r7.f8536w
            r17 = r8
            r16 = r10
            r10 = r5
            r5 = r17
            r23 = r6
            r6 = r1
            r1 = r15
            r15 = r23
            r24 = r13
            r13 = r12
            r12 = r24
        L_0x00ea:
            if (r5 >= r1) goto L_0x0202
            ch.icoaching.typewise.language_modelling.inference.inference_impl.NeuralCharGreedyDecodingInference$b r11 = r7.l(r11, r13)
            int r8 = r11.a()
            D0.E r0 = r11.b()
            int r18 = r11.c()
            r26 = r9
            D0.E r9 = r11.d()
            D0.E r11 = r11.e()
            r28 = r10
            java.lang.Float r10 = r7.f8538y
            kotlin.jvm.internal.o.b(r10)
            float r10 = r10.floatValue()
            D0.E r10 = D0.C.y(r10)
            int r10 = r11.compareTo(r10)
            if (r10 > 0) goto L_0x0121
            r4 = r26
        L_0x011d:
            r2 = r14
            r5 = r15
            goto L_0x0205
        L_0x0121:
            java.util.Set r10 = r7.f8532s
            r31 = r11
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.a.d(r8)
            boolean r10 = r10.contains(r11)
            if (r10 != 0) goto L_0x0135
            int r9 = r0.compareTo(r9)
            if (r9 >= 0) goto L_0x0138
        L_0x0135:
            r11 = r26
            goto L_0x014c
        L_0x0138:
            r21 = r1
            r31 = r2
            r19 = r4
            r22 = r5
            r1 = r13
            r2 = r14
            r5 = r15
            r9 = r17
            r4 = r26
            r26 = r28
            r28 = r12
            goto L_0x0184
        L_0x014c:
            r9 = r7
            r26 = r28
            r10 = r6
            r20 = r31
            r19 = r4
            r4 = r11
            r11 = r26
            r28 = r12
            r12 = r16
            r21 = r1
            r1 = r13
            r13 = r2
            r31 = r2
            r2 = r14
            r14 = r28
            r22 = r5
            r5 = r15
            r15 = r18
            r16 = r20
            r18 = r8
            kotlin.Pair r9 = r9.m(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r10 = r9.component1()
            ch.icoaching.typewise.language_modelling_result_classes.a r10 = (ch.icoaching.typewise.language_modelling_result_classes.a) r10
            java.lang.Object r9 = r9.component2()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r2.add(r10)
        L_0x0184:
            D0.E r13 = D0.J.u(r1, r0)
            boolean r0 = r7.n(r8, r13, r9)
            if (r0 == 0) goto L_0x0190
            goto L_0x0205
        L_0x0190:
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.d(r8)
            r1 = r28
            r1.add(r0)
            ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel r0 = r7.f8527n
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.a.d(r8)
            java.util.List r8 = kotlin.collections.C0718m.e(r8)
            java.util.List r8 = kotlin.collections.C0718m.e(r8)
            D0.E r8 = D0.C.D0(r8)
            r3.f8545a = r7
            r3.f8546b = r6
            r3.f8547c = r4
            r10 = r26
            r3.f8548d = r10
            r3.f8549e = r13
            r3.f8550f = r1
            r3.f8551g = r2
            r3.f8552h = r5
            r3.f8553i = r9
            r11 = r22
            r3.f8554j = r11
            r15 = r21
            r3.f8555k = r15
            r12 = 2
            r3.f8558n = r12
            r14 = r31
            java.lang.Object r0 = r0.g(r8, r14, r3)
            r8 = r19
            if (r0 != r8) goto L_0x01d5
            return r8
        L_0x01d5:
            r14 = r2
            r17 = r9
            r2 = r0
            r0 = r1
            r9 = r4
            r1 = r15
            r15 = r5
            r5 = r11
        L_0x01de:
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r4 = r2.component1()
            D0.E r4 = (D0.E) r4
            java.lang.Object r2 = r2.component2()
            java.util.List r2 = (java.util.List) r2
            r11 = 0
            D0.E r16 = r4.b(r11)
            r18 = 1
            int r5 = r5 + 1
            r12 = r0
            r0 = r25
            r23 = r16
            r16 = r4
            r4 = r8
            r8 = r11
            r11 = r23
            goto L_0x00ea
        L_0x0202:
            r4 = r9
            goto L_0x011d
        L_0x0205:
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r0 = new ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult
            ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel r1 = r7.f8527n
            int r1 = r1.f()
            int r18 = r1 - r5
            r20 = 4
            r21 = 0
            r19 = 0
            r16 = r0
            r17 = r2
            r16.<init>(r17, r18, r19, r20, r21)
            if (r4 == 0) goto L_0x0223
            float r1 = r4.floatValue()
            goto L_0x0225
        L_0x0223:
            float r1 = r7.f8530q
        L_0x0225:
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r0 = r0.s(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.inference_impl.NeuralCharGreedyDecodingInference.b(java.lang.String, java.lang.String, java.lang.Float, java.lang.Integer, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public Object h(kotlin.coroutines.c cVar) {
        Object b4 = this.f8527n.b(cVar);
        if (b4 == kotlin.coroutines.intrinsics.a.f()) {
            return b4;
        }
        return q.f14567a;
    }

    public final b l(E e4, E e5) {
        o.e(e4, "thisProbs");
        o.e(e5, "runningProb");
        E J3 = C.J(this.f8537x, e4, C.y(this.f8539z));
        int k4 = C.T(J3, (Integer) null, 2, (Object) null).k();
        E b4 = e4.b(k4);
        E J4 = C.J(this.f8534u, J3, C.y(0.0f));
        int k5 = C.T(J4, (Integer) null, 2, (Object) null).k();
        E o02 = C.o0(J4, (Integer) null, false, 6, (Object) null);
        return new b(k4, b4, k5, o02, J.u(e5, C.i0(o02, b4)));
    }

    public final Pair m(String str, String str2, E e4, List list, List list2, int i4, E e5, int i5, int i6) {
        int i7;
        String str3 = str;
        String str4 = str2;
        E e6 = e4;
        List list3 = list;
        List list4 = list2;
        o.e(str3, "context");
        o.e(str4, "prior");
        o.e(e6, "probs");
        o.e(list3, "states");
        o.e(list4, "tokenIds");
        o.e(e5, "maxRunningProb");
        if (i6 == i4) {
            i7 = i5 + 1;
        } else {
            i7 = i5;
        }
        c cVar = this.f8526m;
        String e7 = cVar.e(cVar.i(list4));
        if (e7.length() == 0) {
            KeepEncodingFromInWordCachingPriorApproach keepEncodingFromInWordCachingPriorApproach = this.f8533t;
            keepEncodingFromInWordCachingPriorApproach.o(str3 + e7, e6, list3);
        }
        return new Pair(new ch.icoaching.typewise.language_modelling_result_classes.a(str4 + e7, e5.j(), str2.length(), "neural_char_gr_dec", this.f8527n.c(), (Float) null, (Map) null, (Float) null, false, (Float) null, (Float) null, 2016, (i) null), Integer.valueOf(i7));
    }

    public final boolean n(int i4, E e4, int i5) {
        o.e(e4, "runningProb");
        if (this.f8535v.contains(Integer.valueOf(i4))) {
            return true;
        }
        Float f4 = this.f8538y;
        o.b(f4);
        if (e4.compareTo(C.y(f4.floatValue())) > 0 && i5 < this.f8528o) {
            return false;
        }
        return true;
    }
}
