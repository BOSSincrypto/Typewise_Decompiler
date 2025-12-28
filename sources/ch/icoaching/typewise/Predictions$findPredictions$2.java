package ch.icoaching.typewise;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.typewise.Predictions$findPredictions$2", f = "Predictions.kt", l = {165}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Lch/icoaching/typewise/predictions/PredictionsResult;", "<anonymous>", "(Lkotlinx/coroutines/D;)Lch/icoaching/typewise/predictions/PredictionsResult;"}, k = 3, mv = {2, 0, 0})
final class Predictions$findPredictions$2 extends SuspendLambda implements p {

    /* renamed from: a  reason: collision with root package name */
    Object f7809a;

    /* renamed from: b  reason: collision with root package name */
    Object f7810b;

    /* renamed from: c  reason: collision with root package name */
    Object f7811c;

    /* renamed from: d  reason: collision with root package name */
    Object f7812d;

    /* renamed from: e  reason: collision with root package name */
    Object f7813e;

    /* renamed from: f  reason: collision with root package name */
    Object f7814f;

    /* renamed from: g  reason: collision with root package name */
    Object f7815g;

    /* renamed from: h  reason: collision with root package name */
    Object f7816h;

    /* renamed from: i  reason: collision with root package name */
    long f7817i;

    /* renamed from: j  reason: collision with root package name */
    int f7818j;

    /* renamed from: k  reason: collision with root package name */
    private /* synthetic */ Object f7819k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ String f7820l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ String f7821m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ String f7822n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ Predictions f7823o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ boolean f7824p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ List f7825q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Predictions$findPredictions$2(String str, String str2, String str3, Predictions predictions, boolean z3, List list, c cVar) {
        super(2, cVar);
        this.f7820l = str;
        this.f7821m = str2;
        this.f7822n = str3;
        this.f7823o = predictions;
        this.f7824p = z3;
        this.f7825q = list;
    }

    /* renamed from: a */
    public final Object invoke(D d4, c cVar) {
        return ((Predictions$findPredictions$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }

    public final c create(Object obj, c cVar) {
        Predictions$findPredictions$2 predictions$findPredictions$2 = new Predictions$findPredictions$2(this.f7820l, this.f7821m, this.f7822n, this.f7823o, this.f7824p, this.f7825q, cVar);
        predictions$findPredictions$2.f7819k = obj;
        return predictions$findPredictions$2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: kotlinx.coroutines.D} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.util.LinkedHashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.util.TreeSet} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0392  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            r34 = this;
            r7 = r34
            java.lang.Object r8 = kotlin.coroutines.intrinsics.a.f()
            int r0 = r7.f7818j
            java.lang.String r10 = "ms, predictions: "
            r11 = 60
            r12 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 != r12) goto L_0x0040
            long r0 = r7.f7817i
            java.lang.Object r2 = r7.f7816h
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r7.f7815g
            java.util.Set r3 = (java.util.Set) r3
            java.lang.Object r4 = r7.f7814f
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r7.f7813e
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r7.f7812d
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r8 = r7.f7811c
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Object r13 = r7.f7810b
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r7.f7809a
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r7.f7819k
            kotlinx.coroutines.D r15 = (kotlinx.coroutines.D) r15
            kotlin.f.b(r35)
            r17 = r0
            r0 = r35
            goto L_0x025c
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            kotlin.f.b(r35)
            java.lang.Object r0 = r7.f7819k
            r15 = r0
            kotlinx.coroutines.D r15 = (kotlinx.coroutines.D) r15
            java.lang.String r0 = r7.f7820l
            java.lang.String r1 = r7.f7821m
            E0.j r0 = E0.s.k(r0, r1, r11)
            java.lang.String r14 = r0.a()
            java.lang.String r13 = r0.b()
            ch.icoaching.typewise.e r16 = ch.icoaching.typewise.e.f8233a
            java.lang.String r0 = r7.f7822n
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "findPredictions() :: Language = '"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "', Before: '"
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = "'"
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            r4 = 4
            r5 = 0
            java.lang.String r1 = "Predictions"
            r3 = 0
            r0 = r16
            ch.icoaching.typewise.e.b(r0, r1, r2, r3, r4, r5)
            ch.icoaching.typewise.Predictions r0 = r7.f7823o
            boolean r0 = r0.f7792k
            if (r0 != 0) goto L_0x00a2
            ch.icoaching.typewise.predictions.PredictionsResult r0 = new ch.icoaching.typewise.predictions.PredictionsResult
            java.util.List r1 = kotlin.collections.C0718m.j()
            java.util.Set r2 = kotlin.collections.L.e()
            r0.<init>(r1, r2)
            return r0
        L_0x00a2:
            r0 = 0
            r1 = 0
            java.lang.String r0 = y0.C0946c.i(r14, r0, r12, r1)
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            kotlin.jvm.internal.u r1 = kotlin.jvm.internal.u.f13912a
            java.util.Comparator r1 = kotlin.text.o.w(r1)
            r2.<init>(r1)
            kotlin.coroutines.CoroutineContext r1 = r15.g()
            kotlinx.coroutines.g0$b r9 = kotlinx.coroutines.g0.f14139t
            kotlin.coroutines.CoroutineContext$a r1 = r1.get(r9)
            kotlinx.coroutines.g0 r1 = (kotlinx.coroutines.g0) r1
            if (r1 == 0) goto L_0x00e9
            boolean r1 = r1.isCancelled()
            if (r1 != r12) goto L_0x00e9
            ch.icoaching.typewise.predictions.PredictionsResult r0 = new ch.icoaching.typewise.predictions.PredictionsResult
            java.util.List r1 = kotlin.collections.C0718m.j()
            java.util.Set r2 = kotlin.collections.L.e()
            r0.<init>(r1, r2)
            return r0
        L_0x00e9:
            long r17 = android.os.SystemClock.elapsedRealtime()
            ch.icoaching.typewise.Predictions r1 = r7.f7823o
            z0.b r1 = r1.f7790i
            boolean r9 = r7.f7824p
            java.lang.String r11 = r7.f7822n
            r19 = 0
            r20 = 4
            r21 = r2
            r2 = r14
            r22 = r3
            r3 = r9
            r9 = r4
            r4 = r11
            r11 = r5
            r5 = r19
            r23 = r6
            r6 = r20
            java.util.List r6 = r1.a(r2, r3, r4, r5, r6)
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r17
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "findPredictions() :: BiGram calculation "
            r3.append(r4)
            r3.append(r1)
            r3.append(r10)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            r4 = 4
            r5 = 0
            java.lang.String r1 = "Predictions"
            r3 = 0
            r24 = r0
            r0 = r16
            ch.icoaching.typewise.e.b(r0, r1, r2, r3, r4, r5)
            java.util.List r0 = kotlin.collections.C0718m.v0(r6, r12)
            java.util.List r6 = kotlin.collections.C0718m.M(r6, r12)
            java.util.Iterator r0 = r0.iterator()
        L_0x0143:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01d5
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r24
            r2.append(r5)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            ch.icoaching.typewise.Predictions r3 = r7.f7823o
            boolean r1 = r3.z(r1)
            if (r1 != 0) goto L_0x01c0
            r4 = r21
            boolean r1 = r4.contains(r2)
            if (r1 == 0) goto L_0x0175
            r21 = r4
            r24 = r5
            goto L_0x0143
        L_0x0175:
            r3 = r23
            r3.add(r2)
            r4.add(r2)
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate r1 = new ch.icoaching.typewise.predictions.PredictionsResult$Candidate
            int r12 = r5.length()
            int r12 = -r12
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Type r29 = ch.icoaching.typewise.predictions.PredictionsResult.Candidate.Type.PREDICTION
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Source r30 = ch.icoaching.typewise.predictions.PredictionsResult.Candidate.Source.BIGRAM
            r35 = r0
            ch.icoaching.typewise.Predictions r0 = r7.f7823o
            boolean r32 = r0.A(r3)
            r27 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r31 = ""
            r26 = -1082130432(0xffffffffbf800000, float:-1.0)
            r24 = r1
            r25 = r2
            r28 = r12
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32)
            boolean r0 = r1.h()
            if (r0 == 0) goto L_0x01c5
            ch.icoaching.typewise.Predictions r0 = r7.f7823o
            u2.a r0 = r0.f7784c
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01c5
            r9.add(r1)
            r0 = r35
            r23 = r3
            r21 = r4
        L_0x01c0:
            r24 = r5
        L_0x01c2:
            r12 = 1
            goto L_0x0143
        L_0x01c5:
            r12 = r22
            r12.add(r1)
            r0 = r35
            r23 = r3
            r21 = r4
            r24 = r5
            r22 = r12
            goto L_0x01c2
        L_0x01d5:
            r4 = r21
            r12 = r22
            r3 = r23
            r5 = r24
            kotlin.coroutines.CoroutineContext r0 = r15.g()
            kotlinx.coroutines.g0$b r1 = kotlinx.coroutines.g0.f14139t
            kotlin.coroutines.CoroutineContext$a r0 = r0.get(r1)
            kotlinx.coroutines.g0 r0 = (kotlinx.coroutines.g0) r0
            if (r0 == 0) goto L_0x0200
            boolean r0 = r0.isCancelled()
            r1 = 1
            if (r0 != r1) goto L_0x0200
            ch.icoaching.typewise.predictions.PredictionsResult r0 = new ch.icoaching.typewise.predictions.PredictionsResult
            java.util.List r1 = kotlin.collections.C0718m.j()
            java.util.Set r2 = kotlin.collections.L.e()
            r0.<init>(r1, r2)
            return r0
        L_0x0200:
            int r0 = r3.size()
            r1 = 60
            if (r0 != r1) goto L_0x020f
            ch.icoaching.typewise.Predictions r0 = r7.f7823o
            ch.icoaching.typewise.predictions.PredictionsResult r0 = r0.x(r12, r9, r11)
            return r0
        L_0x020f:
            ch.icoaching.typewise.Predictions r0 = r7.f7823o
            D0.e0 r0 = r0.f7786e
            if (r0 == 0) goto L_0x0375
            long r1 = android.os.SystemClock.elapsedRealtime()
            r7.f7819k = r15
            r7.f7809a = r14
            r7.f7810b = r5
            r7.f7811c = r3
            r7.f7812d = r11
            r7.f7813e = r9
            r7.f7814f = r12
            r7.f7815g = r4
            r7.f7816h = r6
            r7.f7817i = r1
            r17 = r1
            r1 = 1
            r7.f7818j = r1
            r19 = 4
            r20 = 0
            r21 = 0
            r1 = r14
            r2 = r13
            r13 = r3
            r3 = r21
            r21 = r4
            r4 = r34
            r22 = r5
            r5 = r19
            r19 = r6
            r6 = r20
            java.lang.Object r0 = D0.e0.a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L_0x0252
            return r8
        L_0x0252:
            r5 = r9
            r6 = r11
            r4 = r12
            r8 = r13
            r2 = r19
            r3 = r21
            r13 = r22
        L_0x025c:
            D0.K r0 = (D0.K) r0
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r0 = r0.a()
            java.util.List r0 = r0.q()
            ch.icoaching.typewise.e r19 = ch.icoaching.typewise.e.f8233a
            long r11 = android.os.SystemClock.elapsedRealtime()
            long r11 = r11 - r17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r9 = "findPredictions() :: TensorFlow calculation "
            r1.append(r9)
            r1.append(r11)
            r1.append(r10)
            r1.append(r0)
            java.lang.String r21 = r1.toString()
            r23 = 4
            r24 = 0
            java.lang.String r20 = "Predictions"
            r22 = 0
            ch.icoaching.typewise.e.b(r19, r20, r21, r22, r23, r24)
            int r1 = r8.size()
            java.util.Iterator r0 = r0.iterator()
            r9 = r1
        L_0x0299:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0339
            java.lang.Object r11 = r0.next()
            ch.icoaching.typewise.language_modelling_result_classes.a r11 = (ch.icoaching.typewise.language_modelling_result_classes.a) r11
            boolean r12 = r7.f7824p
            if (r12 == 0) goto L_0x02b4
            java.lang.String r12 = r11.i()
            java.lang.String r12 = E0.s.a(r12)
        L_0x02b1:
            r35 = r0
            goto L_0x02b9
        L_0x02b4:
            java.lang.String r12 = r11.i()
            goto L_0x02b1
        L_0x02b9:
            ch.icoaching.typewise.Predictions r0 = r7.f7823o
            boolean r0 = r0.z(r12)
            if (r0 != 0) goto L_0x0336
            boolean r0 = r3.contains(r12)
            if (r0 != 0) goto L_0x0336
            int r0 = r9 - r1
            r17 = r1
            r1 = 4
            if (r0 >= r1) goto L_0x0330
            int r0 = r8.size()
            r1 = 60
            if (r0 != r1) goto L_0x02d7
            goto L_0x0330
        L_0x02d7:
            int r9 = r9 + 1
            r8.add(r12)
            r3.add(r12)
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate r0 = new ch.icoaching.typewise.predictions.PredictionsResult$Candidate
            java.lang.Float r1 = r11.j()
            if (r1 == 0) goto L_0x02ee
            float r1 = r1.floatValue()
        L_0x02eb:
            r21 = r1
            goto L_0x02f1
        L_0x02ee:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x02eb
        L_0x02f1:
            float r22 = r11.k()
            int r23 = r11.m()
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Type r24 = ch.icoaching.typewise.predictions.PredictionsResult.Candidate.Type.PREDICTION
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Source r25 = ch.icoaching.typewise.predictions.PredictionsResult.Candidate.Source.NEURAL_NETWORK
            java.lang.String r26 = r11.g()
            ch.icoaching.typewise.Predictions r1 = r7.f7823o
            boolean r27 = r1.A(r8)
            r19 = r0
            r20 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r1 = r0.h()
            if (r1 == 0) goto L_0x032a
            ch.icoaching.typewise.Predictions r1 = r7.f7823o
            u2.a r1 = r1.f7784c
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x032a
            r5.add(r0)
            goto L_0x0330
        L_0x032a:
            r6.add(r12)
            r4.add(r0)
        L_0x0330:
            r0 = r35
            r1 = r17
            goto L_0x0299
        L_0x0336:
            r17 = r1
            goto L_0x0330
        L_0x0339:
            kotlin.coroutines.CoroutineContext r0 = r15.g()
            kotlinx.coroutines.g0$b r1 = kotlinx.coroutines.g0.f14139t
            kotlin.coroutines.CoroutineContext$a r0 = r0.get(r1)
            kotlinx.coroutines.g0 r0 = (kotlinx.coroutines.g0) r0
            if (r0 == 0) goto L_0x035c
            boolean r0 = r0.isCancelled()
            r1 = 1
            if (r0 != r1) goto L_0x035c
            ch.icoaching.typewise.predictions.PredictionsResult r0 = new ch.icoaching.typewise.predictions.PredictionsResult
            java.util.List r1 = kotlin.collections.C0718m.j()
            java.util.Set r2 = kotlin.collections.L.e()
            r0.<init>(r1, r2)
            return r0
        L_0x035c:
            int r0 = r8.size()
            r1 = 60
            if (r0 != r1) goto L_0x036b
            ch.icoaching.typewise.Predictions r0 = r7.f7823o
            ch.icoaching.typewise.predictions.PredictionsResult r0 = r0.x(r4, r5, r6)
            return r0
        L_0x036b:
            r0 = r13
            r33 = r6
            r6 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r33
            goto L_0x0384
        L_0x0375:
            r13 = r3
            r21 = r4
            r22 = r5
            r19 = r6
            r4 = r9
            r5 = r11
            r3 = r12
            r8 = r13
            r2 = r21
            r0 = r22
        L_0x0384:
            int r1 = r8.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x038c:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x0402
            java.lang.Object r9 = r6.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            ch.icoaching.typewise.Predictions r12 = r7.f7823o
            boolean r9 = r12.z(r9)
            if (r9 != 0) goto L_0x038c
            boolean r9 = r2.contains(r11)
            if (r9 != 0) goto L_0x038c
            r9 = 60
            if (r1 != r9) goto L_0x03ba
            goto L_0x038c
        L_0x03ba:
            int r1 = r1 + 1
            r8.add(r11)
            r2.add(r11)
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate r9 = new ch.icoaching.typewise.predictions.PredictionsResult$Candidate
            int r12 = r0.length()
            int r12 = -r12
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Type r24 = ch.icoaching.typewise.predictions.PredictionsResult.Candidate.Type.PREDICTION
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Source r25 = ch.icoaching.typewise.predictions.PredictionsResult.Candidate.Source.BIGRAM
            ch.icoaching.typewise.Predictions r13 = r7.f7823o
            boolean r27 = r13.A(r8)
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r26 = ""
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            r19 = r9
            r20 = r11
            r23 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r11 = r9.h()
            if (r11 == 0) goto L_0x03fe
            ch.icoaching.typewise.Predictions r11 = r7.f7823o
            u2.a r11 = r11.f7784c
            java.lang.Object r11 = r11.invoke()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x03fe
            r4.add(r9)
            goto L_0x038c
        L_0x03fe:
            r3.add(r9)
            goto L_0x038c
        L_0x0402:
            kotlin.coroutines.CoroutineContext r1 = r15.g()
            kotlinx.coroutines.g0$b r6 = kotlinx.coroutines.g0.f14139t
            kotlin.coroutines.CoroutineContext$a r1 = r1.get(r6)
            kotlinx.coroutines.g0 r1 = (kotlinx.coroutines.g0) r1
            if (r1 == 0) goto L_0x0425
            boolean r1 = r1.isCancelled()
            r6 = 1
            if (r1 != r6) goto L_0x0425
            ch.icoaching.typewise.predictions.PredictionsResult r0 = new ch.icoaching.typewise.predictions.PredictionsResult
            java.util.List r1 = kotlin.collections.C0718m.j()
            java.util.Set r2 = kotlin.collections.L.e()
            r0.<init>(r1, r2)
            return r0
        L_0x0425:
            int r1 = r8.size()
            r6 = 60
            if (r1 != r6) goto L_0x0434
            ch.icoaching.typewise.Predictions r0 = r7.f7823o
            ch.icoaching.typewise.predictions.PredictionsResult r0 = r0.x(r3, r4, r5)
            return r0
        L_0x0434:
            int r1 = r8.size()
            if (r1 >= r6) goto L_0x04f5
            long r11 = android.os.SystemClock.elapsedRealtime()
            ch.icoaching.typewise.Predictions r1 = r7.f7823o
            z0.c r1 = r1.f7788g
            boolean r6 = r7.f7824p
            java.lang.String r9 = r7.f7822n
            r13 = 4
            java.util.List r1 = r1.a(r14, r6, r9, r13)
            ch.icoaching.typewise.e r19 = ch.icoaching.typewise.e.f8233a
            long r17 = android.os.SystemClock.elapsedRealtime()
            long r11 = r17 - r11
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "findPredictions() :: UniGram calculation "
            r6.append(r9)
            r6.append(r11)
            r6.append(r10)
            r6.append(r1)
            java.lang.String r21 = r6.toString()
            r23 = 4
            r24 = 0
            java.lang.String r20 = "Predictions"
            r22 = 0
            ch.icoaching.typewise.e.b(r19, r20, r21, r22, r23, r24)
            int r6 = r8.size()
            java.util.Iterator r1 = r1.iterator()
        L_0x047f:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x04f5
            java.lang.Object r9 = r1.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            ch.icoaching.typewise.Predictions r12 = r7.f7823o
            boolean r9 = r12.z(r9)
            if (r9 != 0) goto L_0x047f
            boolean r9 = r2.contains(r11)
            if (r9 != 0) goto L_0x047f
            r9 = 60
            if (r6 != r9) goto L_0x04ad
            goto L_0x047f
        L_0x04ad:
            int r6 = r6 + 1
            r8.add(r11)
            r2.add(r11)
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate r9 = new ch.icoaching.typewise.predictions.PredictionsResult$Candidate
            int r12 = r0.length()
            int r12 = -r12
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Type r24 = ch.icoaching.typewise.predictions.PredictionsResult.Candidate.Type.PREDICTION
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Source r25 = ch.icoaching.typewise.predictions.PredictionsResult.Candidate.Source.UNIGRAM
            ch.icoaching.typewise.Predictions r13 = r7.f7823o
            boolean r27 = r13.A(r8)
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r26 = ""
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            r19 = r9
            r20 = r11
            r23 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r11 = r9.h()
            if (r11 == 0) goto L_0x04f1
            ch.icoaching.typewise.Predictions r11 = r7.f7823o
            u2.a r11 = r11.f7784c
            java.lang.Object r11 = r11.invoke()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x04f1
            r4.add(r9)
            goto L_0x047f
        L_0x04f1:
            r3.add(r9)
            goto L_0x047f
        L_0x04f5:
            kotlin.coroutines.CoroutineContext r1 = r15.g()
            kotlinx.coroutines.g0$b r6 = kotlinx.coroutines.g0.f14139t
            kotlin.coroutines.CoroutineContext$a r1 = r1.get(r6)
            kotlinx.coroutines.g0 r1 = (kotlinx.coroutines.g0) r1
            if (r1 == 0) goto L_0x0518
            boolean r1 = r1.isCancelled()
            r6 = 1
            if (r1 != r6) goto L_0x0518
            ch.icoaching.typewise.predictions.PredictionsResult r0 = new ch.icoaching.typewise.predictions.PredictionsResult
            java.util.List r1 = kotlin.collections.C0718m.j()
            java.util.Set r2 = kotlin.collections.L.e()
            r0.<init>(r1, r2)
            return r0
        L_0x0518:
            int r1 = r8.size()
            r6 = 60
            if (r1 != r6) goto L_0x0527
            ch.icoaching.typewise.Predictions r0 = r7.f7823o
            ch.icoaching.typewise.predictions.PredictionsResult r0 = r0.x(r3, r4, r5)
            return r0
        L_0x0527:
            int r1 = r8.size()
            if (r1 >= r6) goto L_0x05db
            long r11 = android.os.SystemClock.elapsedRealtime()
            ch.icoaching.typewise.Predictions r1 = r7.f7823o
            D0.N r1 = r1.f7789h
            boolean r6 = r7.f7824p
            java.util.List r9 = r7.f7825q
            r13 = 4
            java.util.List r1 = r1.b(r14, r6, r13, r9)
            ch.icoaching.typewise.e r19 = ch.icoaching.typewise.e.f8233a
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r13 = r13 - r11
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "findPredictions() :: Wordlist calculation "
            r6.append(r9)
            r6.append(r13)
            r6.append(r10)
            r6.append(r1)
            java.lang.String r21 = r6.toString()
            r23 = 4
            r24 = 0
            java.lang.String r20 = "Predictions"
            r22 = 0
            ch.icoaching.typewise.e.b(r19, r20, r21, r22, r23, r24)
            int r6 = r8.size()
            java.util.Iterator r1 = r1.iterator()
        L_0x0571:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x05db
            java.lang.Object r9 = r1.next()
            java.lang.String r9 = (java.lang.String) r9
            ch.icoaching.typewise.Predictions r10 = r7.f7823o
            boolean r10 = r10.z(r9)
            if (r10 != 0) goto L_0x05d8
            boolean r10 = r2.contains(r9)
            if (r10 != 0) goto L_0x05d8
            r10 = 60
            if (r6 != r10) goto L_0x0590
            goto L_0x0571
        L_0x0590:
            int r6 = r6 + 1
            r8.add(r9)
            r2.add(r9)
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate r11 = new ch.icoaching.typewise.predictions.PredictionsResult$Candidate
            int r12 = r0.length()
            int r12 = -r12
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Type r24 = ch.icoaching.typewise.predictions.PredictionsResult.Candidate.Type.PREDICTION
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Source r25 = ch.icoaching.typewise.predictions.PredictionsResult.Candidate.Source.WORDLIST
            ch.icoaching.typewise.Predictions r13 = r7.f7823o
            boolean r27 = r13.A(r8)
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r26 = ""
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            r19 = r11
            r20 = r9
            r23 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r9 = r11.h()
            if (r9 == 0) goto L_0x05d4
            ch.icoaching.typewise.Predictions r9 = r7.f7823o
            u2.a r9 = r9.f7784c
            java.lang.Object r9 = r9.invoke()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x05d4
            r4.add(r11)
            goto L_0x0571
        L_0x05d4:
            r3.add(r11)
            goto L_0x0571
        L_0x05d8:
            r10 = 60
            goto L_0x0571
        L_0x05db:
            kotlin.coroutines.CoroutineContext r0 = r15.g()
            kotlinx.coroutines.g0$b r1 = kotlinx.coroutines.g0.f14139t
            kotlin.coroutines.CoroutineContext$a r0 = r0.get(r1)
            kotlinx.coroutines.g0 r0 = (kotlinx.coroutines.g0) r0
            if (r0 == 0) goto L_0x05fe
            boolean r0 = r0.isCancelled()
            r1 = 1
            if (r0 != r1) goto L_0x05fe
            ch.icoaching.typewise.predictions.PredictionsResult r0 = new ch.icoaching.typewise.predictions.PredictionsResult
            java.util.List r1 = kotlin.collections.C0718m.j()
            java.util.Set r2 = kotlin.collections.L.e()
            r0.<init>(r1, r2)
            return r0
        L_0x05fe:
            ch.icoaching.typewise.Predictions r0 = r7.f7823o
            ch.icoaching.typewise.predictions.PredictionsResult r0 = r0.x(r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.Predictions$findPredictions$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
