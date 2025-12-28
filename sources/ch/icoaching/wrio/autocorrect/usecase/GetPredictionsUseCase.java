package ch.icoaching.wrio.autocorrect.usecase;

import android.view.inputmethod.EditorInfo;
import c.C0490c;
import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.input.j;
import i2.C0680a;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;

public final class GetPredictionsUseCase extends CoroutineUseCase {

    /* renamed from: e  reason: collision with root package name */
    private final EditorInfo f9329e;

    /* renamed from: f  reason: collision with root package name */
    private final j f9330f;

    /* renamed from: g  reason: collision with root package name */
    private final ch.icoaching.typewise.b f9331g;

    /* renamed from: h  reason: collision with root package name */
    private final c f9332h;

    /* renamed from: i  reason: collision with root package name */
    private final C0680a f9333i;

    /* renamed from: j  reason: collision with root package name */
    private final ch.icoaching.wrio.tutorialmode.a f9334j;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f9335a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9336b;

        public a(String str, int i4) {
            o.e(str, "fullInputText");
            this.f9335a = str;
            this.f9336b = i4;
        }

        public final int a() {
            return this.f9336b;
        }

        public final String b() {
            return this.f9335a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return o.a(this.f9335a, aVar.f9335a) && this.f9336b == aVar.f9336b;
        }

        public int hashCode() {
            return (this.f9335a.hashCode() * 31) + this.f9336b;
        }

        public String toString() {
            return "Request(fullInputText=" + this.f9335a + ", cursorPosition=" + this.f9336b + ')';
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f9337a;

        /* renamed from: b  reason: collision with root package name */
        private final String f9338b;

        /* renamed from: c  reason: collision with root package name */
        private final String f9339c;

        /* renamed from: d  reason: collision with root package name */
        private final List f9340d;

        public b(int i4, String str, String str2, List list) {
            o.e(str, "prefix");
            o.e(str2, "textBeforeCursor");
            o.e(list, "predictionCandidates");
            this.f9337a = i4;
            this.f9338b = str;
            this.f9339c = str2;
            this.f9340d = list;
        }

        public final int a() {
            return this.f9337a;
        }

        public final List b() {
            return this.f9340d;
        }

        public final String c() {
            return this.f9338b;
        }

        public final String d() {
            return this.f9339c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f9337a == bVar.f9337a && o.a(this.f9338b, bVar.f9338b) && o.a(this.f9339c, bVar.f9339c) && o.a(this.f9340d, bVar.f9340d);
        }

        public int hashCode() {
            return (((((this.f9337a * 31) + this.f9338b.hashCode()) * 31) + this.f9339c.hashCode()) * 31) + this.f9340d.hashCode();
        }

        public String toString() {
            return "Response(offset=" + this.f9337a + ", prefix=" + this.f9338b + ", textBeforeCursor=" + this.f9339c + ", predictionCandidates=" + this.f9340d + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetPredictionsUseCase(EditorInfo editorInfo, j jVar, ch.icoaching.typewise.b bVar, c cVar, C0680a aVar, ch.icoaching.wrio.tutorialmode.a aVar2, D d4, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        super(d4, coroutineDispatcher, coroutineDispatcher2);
        o.e(editorInfo, "editorInfo");
        o.e(jVar, "inputSession");
        o.e(bVar, "predictions");
        o.e(cVar, "languageSettings");
        o.e(aVar, "defaultSharedPreferences");
        o.e(aVar2, "tutorialModeCompat");
        o.e(d4, "coroutineScope");
        o.e(coroutineDispatcher, "mainDispatcher");
        o.e(coroutineDispatcher2, "backgroundDispatcher");
        this.f9329e = editorInfo;
        this.f9330f = jVar;
        this.f9331g = bVar;
        this.f9332h = cVar;
        this.f9333i = aVar;
        this.f9334j = aVar2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0104 A[LOOP:0: B:26:0x00fe->B:28:0x0104, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(int r19, java.lang.String r20, java.lang.String r21, kotlin.coroutines.c r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r9 = r20
            r10 = r21
            r2 = r22
            boolean r3 = r2 instanceof ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$findPredictions$1
            if (r3 == 0) goto L_0x001e
            r3 = r2
            ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$findPredictions$1 r3 = (ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$findPredictions$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001e
            int r4 = r4 - r5
            r3.label = r4
        L_0x001c:
            r8 = r3
            goto L_0x0024
        L_0x001e:
            ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$findPredictions$1 r3 = new ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$findPredictions$1
            r3.<init>(r0, r2)
            goto L_0x001c
        L_0x0024:
            java.lang.Object r2 = r8.result
            java.lang.Object r11 = kotlin.coroutines.intrinsics.a.f()
            int r3 = r8.label
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x004f
            if (r3 == r5) goto L_0x004b
            if (r3 != r4) goto L_0x0043
            int r1 = r8.I$0
            java.lang.Object r3 = r8.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r8.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.f.b(r2)
            goto L_0x00dd
        L_0x0043:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004b:
            kotlin.f.b(r2)
            goto L_0x0068
        L_0x004f:
            kotlin.f.b(r2)
            ch.icoaching.wrio.util.d r2 = new ch.icoaching.wrio.util.d
            android.view.inputmethod.EditorInfo r3 = r0.f9329e
            r2.<init>(r3)
            boolean r2 = r2.c()
            if (r2 == 0) goto L_0x0069
            r8.label = r5
            java.lang.Object r2 = r0.j(r1, r9, r10, r8)
            if (r2 != r11) goto L_0x0068
            return r11
        L_0x0068:
            return r2
        L_0x0069:
            ch.icoaching.wrio.logging.Log r12 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "findPredictions() :: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = ", '"
            r2.append(r3)
            r3 = 0
            java.lang.CharSequence r3 = ch.icoaching.wrio.I.b(r9, r3, r5, r3)
            r2.append(r3)
            java.lang.String r3 = "', "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r14 = r2.toString()
            r16 = 4
            r17 = 0
            java.lang.String r13 = "GetPredictionsUseCase"
            r15 = 0
            ch.icoaching.wrio.logging.Log.d(r12, r13, r14, r15, r16, r17)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            ch.icoaching.wrio.tutorialmode.a r3 = r0.f9334j
            java.lang.String r3 = r3.b()
            r2.add(r3)
            ch.icoaching.wrio.data.c r3 = r0.f9332h
            java.util.List r3 = r3.j()
            r2.addAll(r3)
            ch.icoaching.wrio.data.c r3 = r0.f9332h
            java.util.List r3 = r3.g()
            r2.addAll(r3)
            java.util.List r7 = kotlin.collections.C0718m.B0(r2)
            ch.icoaching.typewise.b r2 = r0.f9331g
            ch.icoaching.wrio.tutorialmode.a r3 = r0.f9334j
            java.lang.String r6 = r3.b()
            r8.L$0 = r9
            r8.L$1 = r10
            r8.I$0 = r1
            r8.label = r4
            java.lang.String r4 = ""
            r5 = 0
            r3 = r20
            java.lang.Object r2 = r2.e(r3, r4, r5, r6, r7, r8)
            if (r2 != r11) goto L_0x00db
            return r11
        L_0x00db:
            r4 = r9
            r3 = r10
        L_0x00dd:
            ch.icoaching.typewise.predictions.PredictionsResult r2 = (ch.icoaching.typewise.predictions.PredictionsResult) r2
            ch.icoaching.wrio.logging.Log r5 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "findPredictions() :: candidates = "
            r6.append(r7)
            java.util.List r7 = r2.a()
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = kotlin.collections.C0718m.t(r7, r9)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x00fe:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x012a
            java.lang.Object r9 = r7.next()
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate r9 = (ch.icoaching.typewise.predictions.PredictionsResult.Candidate) r9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r9.f()
            r10.append(r11)
            java.lang.String r11 = " -> "
            r10.append(r11)
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Source r9 = r9.e()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.add(r9)
            goto L_0x00fe
        L_0x012a:
            r6.append(r8)
            java.lang.String r7 = ", tfCandidates = "
            r6.append(r7)
            java.util.Set r7 = r2.b()
            r6.append(r7)
            java.lang.String r7 = r6.toString()
            r9 = 4
            r10 = 0
            java.lang.String r6 = "GetPredictionsUseCase"
            r8 = 0
            ch.icoaching.wrio.logging.Log.d(r5, r6, r7, r8, r9, r10)
            ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$b r5 = new ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$b
            java.util.List r2 = r2.a()
            r5.<init>(r1, r3, r4, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase.f(int, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    private final String i(a aVar) {
        if (aVar.b().length() <= 0 || aVar.b().length() < aVar.a()) {
            return "";
        }
        String substring = aVar.b().substring(0, aVar.a());
        o.d(substring, "substring(...)");
        return substring;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.String} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b2 A[LOOP:0: B:16:0x00ac->B:18:0x00b2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(int r11, java.lang.String r12, java.lang.String r13, kotlin.coroutines.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$findSpecialPredictions$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$findSpecialPredictions$1 r0 = (ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$findSpecialPredictions$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$findSpecialPredictions$1 r0 = new ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$findSpecialPredictions$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            int r11 = r0.I$0
            java.lang.Object r12 = r0.L$1
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r0.L$0
            java.lang.String r12 = (java.lang.String) r12
            kotlin.f.b(r14)
            goto L_0x008b
        L_0x0034:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003c:
            kotlin.f.b(r14)
            ch.icoaching.wrio.logging.Log r4 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r2 = "findSpecialPredictions() :: "
            r14.append(r2)
            r14.append(r11)
            java.lang.String r2 = ", '"
            r14.append(r2)
            r2 = 0
            java.lang.CharSequence r2 = ch.icoaching.wrio.I.b(r12, r2, r3, r2)
            r14.append(r2)
            java.lang.String r2 = "', "
            r14.append(r2)
            r14.append(r13)
            java.lang.String r6 = r14.toString()
            r8 = 4
            r9 = 0
            java.lang.String r5 = "GetPredictionsUseCase"
            r7 = 0
            ch.icoaching.wrio.logging.Log.d(r4, r5, r6, r7, r8, r9)
            ch.icoaching.typewise.b r14 = r10.f9331g
            ch.icoaching.wrio.util.d r2 = new ch.icoaching.wrio.util.d
            android.view.inputmethod.EditorInfo r4 = r10.f9329e
            r2.<init>(r4)
            ch.icoaching.typewise.text.TypewiseInputType r2 = r2.a()
            r0.L$0 = r12
            r0.L$1 = r13
            r0.I$0 = r11
            r0.label = r3
            java.lang.Object r14 = r14.d(r12, r2, r0)
            if (r14 != r1) goto L_0x008b
            return r1
        L_0x008b:
            ch.icoaching.typewise.predictions.PredictionsResult r14 = (ch.icoaching.typewise.predictions.PredictionsResult) r14
            ch.icoaching.wrio.logging.Log r0 = ch.icoaching.wrio.logging.Log.f10572a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "findSpecialPredictions() :: candidates = "
            r1.append(r2)
            java.util.List r2 = r14.a()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.C0718m.t(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x00ac:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00d8
            java.lang.Object r4 = r2.next()
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate r4 = (ch.icoaching.typewise.predictions.PredictionsResult.Candidate) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r4.f()
            r5.append(r6)
            java.lang.String r6 = " -> "
            r5.append(r6)
            ch.icoaching.typewise.predictions.PredictionsResult$Candidate$Source r4 = r4.e()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.add(r4)
            goto L_0x00ac
        L_0x00d8:
            r1.append(r3)
            java.lang.String r2 = ", tfCandidates = "
            r1.append(r2)
            java.util.Set r2 = r14.b()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r4 = 4
            r5 = 0
            java.lang.String r1 = "GetPredictionsUseCase"
            r3 = 0
            ch.icoaching.wrio.logging.Log.d(r0, r1, r2, r3, r4, r5)
            ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$b r0 = new ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$b
            java.util.List r14 = r14.a()
            r0.<init>(r11, r13, r12, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase.j(int, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    private final boolean l() {
        if (this.f9333i.m0() || !this.f9330f.a() || !C0490c.d()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase.a r12, kotlin.coroutines.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$doWork$1 r0 = (ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$doWork$1 r0 = new ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$doWork$1
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.f.b(r13)     // Catch:{ Exception -> 0x002a }
            goto L_0x0091
        L_0x002a:
            r12 = move-exception
            goto L_0x0092
        L_0x002c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0034:
            kotlin.f.b(r13)
            boolean r13 = r11.l()
            if (r13 != 0) goto L_0x004a
            ch.icoaching.wrio.logging.Log r5 = ch.icoaching.wrio.logging.Log.f10572a
            r9 = 4
            r10 = 0
            java.lang.String r6 = "GetPredictionsUseCase"
            java.lang.String r7 = "doWork() :: Not allowed"
            r8 = 0
            ch.icoaching.wrio.logging.Log.d(r5, r6, r7, r8, r9, r10)
            return r4
        L_0x004a:
            java.lang.String r13 = r11.i(r12)     // Catch:{ Exception -> 0x002a }
            E0.o r2 = E0.s.d(r13)     // Catch:{ Exception -> 0x002a }
            ch.icoaching.wrio.logging.Log r5 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ Exception -> 0x002a }
            java.lang.String r6 = "GetPredictionsUseCase"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002a }
            r7.<init>()     // Catch:{ Exception -> 0x002a }
            java.lang.String r8 = "doWork() :: '"
            r7.append(r8)     // Catch:{ Exception -> 0x002a }
            r7.append(r2)     // Catch:{ Exception -> 0x002a }
            java.lang.String r8 = "', '"
            r7.append(r8)     // Catch:{ Exception -> 0x002a }
            java.lang.CharSequence r8 = ch.icoaching.wrio.I.b(r13, r4, r3, r4)     // Catch:{ Exception -> 0x002a }
            r7.append(r8)     // Catch:{ Exception -> 0x002a }
            r8 = 39
            r7.append(r8)     // Catch:{ Exception -> 0x002a }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x002a }
            r9 = 4
            r10 = 0
            r8 = 0
            ch.icoaching.wrio.logging.Log.d(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x002a }
            int r12 = r12.a()     // Catch:{ Exception -> 0x002a }
            java.lang.Object r2 = r2.b()     // Catch:{ Exception -> 0x002a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x002a }
            r0.label = r3     // Catch:{ Exception -> 0x002a }
            java.lang.Object r13 = r11.f(r12, r13, r2, r0)     // Catch:{ Exception -> 0x002a }
            if (r13 != r1) goto L_0x0091
            return r1
        L_0x0091:
            return r13
        L_0x0092:
            r12.printStackTrace()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase.a(ch.icoaching.wrio.autocorrect.usecase.GetPredictionsUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}
