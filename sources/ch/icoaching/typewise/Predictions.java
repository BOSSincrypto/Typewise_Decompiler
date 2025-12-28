package ch.icoaching.typewise;

import D0.C0269e;
import D0.N;
import D0.e0;
import ch.icoaching.typewise.predictions.PredictionsResult;
import ch.icoaching.typewise.text.TypewiseInputType;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.sync.b;
import kotlinx.coroutines.sync.c;
import l2.q;
import u2.C0906a;
import z0.C0967a;
import z0.C0968b;
import z0.C0969c;

public final class Predictions implements b {

    /* renamed from: m  reason: collision with root package name */
    public static final Companion f7781m = new Companion((i) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a f7782a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C0967a f7783b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C0906a f7784c;

    /* renamed from: d  reason: collision with root package name */
    private final C0906a f7785d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public e0 f7786e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C0269e f7787f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C0969c f7788g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final N f7789h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C0968b f7790i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public String f7791j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public boolean f7792k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final b f7793l = c.b(false, 1, (Object) null);

    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object b(java.lang.String r21, ch.icoaching.typewise.a r22, D0.C0266b r23, ch.icoaching.typewise.word_lists.b r24, ch.icoaching.typewise.word_lists.b r25, u2.l r26, kotlin.coroutines.c r27) {
            /*
                r20 = this;
                r0 = r27
                boolean r1 = r0 instanceof ch.icoaching.typewise.Predictions$Companion$createLanguageModellingLibrary$1
                if (r1 == 0) goto L_0x0018
                r1 = r0
                ch.icoaching.typewise.Predictions$Companion$createLanguageModellingLibrary$1 r1 = (ch.icoaching.typewise.Predictions$Companion$createLanguageModellingLibrary$1) r1
                int r2 = r1.f7800g
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L_0x0018
                int r2 = r2 - r3
                r1.f7800g = r2
                r2 = r20
            L_0x0016:
                r8 = r1
                goto L_0x0020
            L_0x0018:
                ch.icoaching.typewise.Predictions$Companion$createLanguageModellingLibrary$1 r1 = new ch.icoaching.typewise.Predictions$Companion$createLanguageModellingLibrary$1
                r2 = r20
                r1.<init>(r2, r0)
                goto L_0x0016
            L_0x0020:
                java.lang.Object r0 = r8.f7798e
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r3 = r8.f7800g
                r4 = 1
                if (r3 == 0) goto L_0x004d
                if (r3 != r4) goto L_0x0045
                java.lang.Object r1 = r8.f7797d
                kotlinx.coroutines.CoroutineDispatcher r1 = (kotlinx.coroutines.CoroutineDispatcher) r1
                java.lang.Object r3 = r8.f7796c
                s0.c r3 = (s0.C0893c) r3
                java.lang.Object r4 = r8.f7795b
                ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrary$a r4 = (ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrary.a) r4
                java.lang.Object r5 = r8.f7794a
                D0.b r5 = (D0.C0266b) r5
                kotlin.f.b(r0)
                r13 = r1
                r12 = r3
                r11 = r4
                r15 = r5
                goto L_0x009b
            L_0x0045:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x004d:
                kotlin.f.b(r0)
                ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrary$a r0 = ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrary.f8580c
                ch.icoaching.typewise.file_handling.ConfigHolder r3 = r22.b()
                s0.c r9 = r3.e()
                java.util.List r10 = kotlin.collections.C0718m.e(r21)
                java.util.List r11 = kotlin.collections.C0718m.j()
                r18 = 252(0xfc, float:3.53E-43)
                r19 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                s0.c r9 = s0.C0893c.c(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                kotlinx.coroutines.CoroutineDispatcher r10 = r22.d()
                java.util.List r5 = kotlin.collections.C0718m.e(r21)
                r11 = r23
                r8.f7794a = r11
                r8.f7795b = r0
                r8.f7796c = r9
                r8.f7797d = r10
                r8.f7800g = r4
                r3 = r22
                r4 = r5
                r5 = r24
                r6 = r25
                r7 = r26
                java.lang.Object r3 = r3.f(r4, r5, r6, r7, r8)
                if (r3 != r1) goto L_0x0096
                return r1
            L_0x0096:
                r12 = r9
                r13 = r10
                r15 = r11
                r11 = r0
                r0 = r3
            L_0x009b:
                r14 = r0
                ch.icoaching.typewise.word_lists.c r14 = (ch.icoaching.typewise.word_lists.c) r14
                r18 = 0
                r19 = 0
                r16 = 0
                r17 = 0
                ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrary r0 = r11.a(r12, r13, r14, r15, r16, r17, r18, r19)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.Predictions.Companion.b(java.lang.String, ch.icoaching.typewise.a, D0.b, ch.icoaching.typewise.word_lists.b, ch.icoaching.typewise.word_lists.b, u2.l, kotlin.coroutines.c):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x010c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x010d A[PHI: r3 
          PHI: (r3v2 java.lang.Object) = (r3v6 java.lang.Object), (r3v1 java.lang.Object) binds: [B:24:0x010a, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE], RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object c(java.lang.String r21, java.util.List r22, java.util.List r23, ch.icoaching.typewise.a r24, z0.C0967a r25, kotlin.coroutines.c r26) {
            /*
                r20 = this;
                r8 = r21
                r0 = r22
                r1 = r23
                r2 = r25
                r3 = r26
                boolean r4 = r3 instanceof ch.icoaching.typewise.Predictions$Companion$getTypewiseLMCapitalizationInference$1
                if (r4 == 0) goto L_0x0020
                r4 = r3
                ch.icoaching.typewise.Predictions$Companion$getTypewiseLMCapitalizationInference$1 r4 = (ch.icoaching.typewise.Predictions$Companion$getTypewiseLMCapitalizationInference$1) r4
                int r5 = r4.f7804d
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = r5 & r6
                if (r7 == 0) goto L_0x0020
                int r5 = r5 - r6
                r4.f7804d = r5
                r9 = r20
            L_0x001e:
                r10 = r4
                goto L_0x0028
            L_0x0020:
                ch.icoaching.typewise.Predictions$Companion$getTypewiseLMCapitalizationInference$1 r4 = new ch.icoaching.typewise.Predictions$Companion$getTypewiseLMCapitalizationInference$1
                r9 = r20
                r4.<init>(r9, r3)
                goto L_0x001e
            L_0x0028:
                java.lang.Object r3 = r10.f7802b
                java.lang.Object r11 = kotlin.coroutines.intrinsics.a.f()
                int r4 = r10.f7804d
                r12 = 0
                r13 = 2
                r5 = 1
                if (r4 == 0) goto L_0x004f
                if (r4 == r5) goto L_0x0046
                if (r4 != r13) goto L_0x003e
                kotlin.f.b(r3)
                goto L_0x010d
            L_0x003e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0046:
                java.lang.Object r0 = r10.f7801a
                java.lang.String r0 = (java.lang.String) r0
                kotlin.f.b(r3)
                goto L_0x00ed
            L_0x004f:
                kotlin.f.b(r3)
                D0.f0$a r3 = D0.f0.f272e
                ch.icoaching.typewise.file_handling.ConfigHolder r4 = r24.b()
                D0.f0 r3 = r3.a(r4, r8, r0, r1)
                ch.icoaching.typewise.e r4 = ch.icoaching.typewise.e.f8233a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "getTypewiseLMCapitalizationInference() :: '"
                r6.append(r7)
                r6.append(r8)
                java.lang.String r7 = "' | "
                r6.append(r7)
                r6.append(r3)
                java.lang.String r16 = r6.toString()
                r18 = 4
                r19 = 0
                java.lang.String r15 = "Predictions"
                r17 = 0
                r14 = r4
                ch.icoaching.typewise.e.b(r14, r15, r16, r17, r18, r19)
                if (r3 != 0) goto L_0x00c0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "getTypewiseLMCapitalizationInference() :: Couldn't create ModelAndIndices for language: '"
                r2.append(r3)
                r2.append(r8)
                java.lang.String r3 = "', assetsLanguages: '"
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "', downloadedLanguages: '"
                r2.append(r0)
                r2.append(r1)
                java.lang.String r0 = "'."
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1 = 4
                r2 = 0
                java.lang.String r3 = "Predictions"
                r5 = 0
                r21 = r4
                r22 = r3
                r23 = r0
                r24 = r5
                r25 = r1
                r26 = r2
                ch.icoaching.typewise.e.l(r21, r22, r23, r24, r25, r26)
                return r12
            L_0x00c0:
                D0.b r4 = new D0.b
                android.content.Context r0 = r24.a()
                r4.<init>(r0, r3)
                ch.icoaching.typewise.word_lists.b r6 = r2.b(r8)
                ch.icoaching.typewise.word_lists.b r7 = r2.a(r8)
                ch.icoaching.typewise.Predictions$Companion$getTypewiseLMCapitalizationInference$languageModelingLibrary$1 r14 = new ch.icoaching.typewise.Predictions$Companion$getTypewiseLMCapitalizationInference$languageModelingLibrary$1
                r14.<init>(r2)
                r10.f7801a = r8
                r10.f7804d = r5
                r0 = r20
                r1 = r21
                r2 = r24
                r3 = r4
                r4 = r6
                r5 = r7
                r6 = r14
                r7 = r10
                java.lang.Object r3 = r0.b(r1, r2, r3, r4, r5, r6, r7)
                if (r3 != r11) goto L_0x00ec
                return r11
            L_0x00ec:
                r0 = r8
            L_0x00ed:
                ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrary r3 = (ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrary) r3
                ch.icoaching.typewise.language_modelling.language_modelling_library.a r1 = r3.a()
                r10.f7801a = r12
                r10.f7804d = r13
                r2 = 2
                r3 = 0
                r4 = 0
                r21 = r1
                r22 = r0
                r23 = r4
                r24 = r10
                r25 = r2
                r26 = r3
                java.lang.Object r3 = ch.icoaching.typewise.language_modelling.language_modelling_library.a.C0144a.a(r21, r22, r23, r24, r25, r26)
                if (r3 != r11) goto L_0x010d
                return r11
            L_0x010d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.Predictions.Companion.c(java.lang.String, java.util.List, java.util.List, ch.icoaching.typewise.a, z0.a, kotlin.coroutines.c):java.lang.Object");
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public Predictions(a aVar, C0967a aVar2, C0906a aVar3, C0906a aVar4) {
        o.e(aVar, "aiLibrary");
        o.e(aVar2, "predictionsDatabaseRepository");
        o.e(aVar3, "limitSuggestionsCount");
        o.e(aVar4, "isUserSpecificOrSwissGermanLanguage");
        this.f7782a = aVar;
        this.f7783b = aVar2;
        this.f7784c = aVar3;
        this.f7785d = aVar4;
        this.f7787f = new C0269e(new Predictions$predictorSpecial$1(aVar2));
        this.f7788g = new C0969c(new Predictions$predictorUniGrams$1(aVar2));
        this.f7789h = new N(new Predictions$predictorWordList$1(aVar2));
        this.f7790i = new C0968b(new Predictions$predictorBiGrams$1(aVar2));
    }

    /* access modifiers changed from: private */
    public final boolean A(Set set) {
        return (set.size() == 2 || set.size() > 4) && ((Boolean) this.f7784c.invoke()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final PredictionsResult x(List list, List list2, Set set) {
        if (!list2.isEmpty()) {
            list.addAll(list2);
        }
        if (((Boolean) this.f7785d.invoke()).booleanValue()) {
            set.clear();
        }
        e eVar = e.f8233a;
        e.b(eVar, "Predictions", "finishSession() :: Predictions final: " + list, (Throwable) null, 4, (Object) null);
        return new PredictionsResult(list, set);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.util.List} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(java.lang.String r11, java.util.List r12, java.util.List r13, kotlin.coroutines.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof ch.icoaching.typewise.Predictions$initializePredictorsHelperNotSynchronized$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            ch.icoaching.typewise.Predictions$initializePredictorsHelperNotSynchronized$1 r0 = (ch.icoaching.typewise.Predictions$initializePredictorsHelperNotSynchronized$1) r0
            int r1 = r0.f7837g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7837g = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.Predictions$initializePredictorsHelperNotSynchronized$1 r0 = new ch.icoaching.typewise.Predictions$initializePredictorsHelperNotSynchronized$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f7835e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f7837g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r11 = r0.f7831a
            ch.icoaching.typewise.Predictions r11 = (ch.icoaching.typewise.Predictions) r11
            kotlin.f.b(r14)
            goto L_0x00bf
        L_0x0031:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0039:
            java.lang.Object r11 = r0.f7834d
            r13 = r11
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r11 = r0.f7833c
            r12 = r11
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r11 = r0.f7832b
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r2 = r0.f7831a
            ch.icoaching.typewise.Predictions r2 = (ch.icoaching.typewise.Predictions) r2
            kotlin.f.b(r14)
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r2
            goto L_0x006f
        L_0x0053:
            kotlin.f.b(r14)
            D0.e0 r14 = r10.f7786e
            if (r14 == 0) goto L_0x006b
            r0.f7831a = r10
            r0.f7832b = r11
            r0.f7833c = r12
            r0.f7834d = r13
            r0.f7837g = r4
            java.lang.Object r14 = r14.c(r0)
            if (r14 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
        L_0x006f:
            r2 = 0
            r11.f7786e = r2
            D0.f0$a r4 = D0.f0.f272e
            ch.icoaching.typewise.a r5 = r11.f7782a
            ch.icoaching.typewise.file_handling.ConfigHolder r5 = r5.b()
            D0.f0 r13 = r4.a(r5, r12, r13, r14)
            ch.icoaching.typewise.e r4 = ch.icoaching.typewise.e.f8233a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r5 = "initializePredictorsHelperNotSynchronized() :: '"
            r14.append(r5)
            r14.append(r12)
            java.lang.String r5 = "' | "
            r14.append(r5)
            r14.append(r13)
            java.lang.String r6 = r14.toString()
            r8 = 4
            r9 = 0
            java.lang.String r5 = "Predictions"
            r7 = 0
            ch.icoaching.typewise.e.b(r4, r5, r6, r7, r8, r9)
            if (r13 == 0) goto L_0x00c8
            ch.icoaching.typewise.a r14 = r11.f7782a
            kotlinx.coroutines.CoroutineDispatcher r14 = r14.d()
            ch.icoaching.typewise.Predictions$initializePredictorsHelperNotSynchronized$languageModellingLibrary$1 r4 = new ch.icoaching.typewise.Predictions$initializePredictorsHelperNotSynchronized$languageModellingLibrary$1
            r4.<init>(r11, r13, r12, r2)
            r0.f7831a = r11
            r0.f7832b = r2
            r0.f7833c = r2
            r0.f7834d = r2
            r0.f7837g = r3
            java.lang.Object r14 = kotlinx.coroutines.C0738g.e(r14, r4, r0)
            if (r14 != r1) goto L_0x00bf
            return r1
        L_0x00bf:
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrary r14 = (ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrary) r14
            D0.e0 r12 = new D0.e0
            r12.<init>(r14)
            r11.f7786e = r12
        L_0x00c8:
            l2.q r11 = l2.q.f14567a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.Predictions.y(java.lang.String, java.util.List, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final boolean z(String str) {
        return str != null && str.length() == 0;
    }

    public void c(String str) {
        o.e(str, "word");
        e eVar = e.f8233a;
        e.b(eVar, "Predictions", "removeBiGram() :: '" + str + "'", (Throwable) null, 4, (Object) null);
        if (this.f7792k) {
            this.f7790i.c(str);
        }
    }

    public Object d(String str, TypewiseInputType typewiseInputType, kotlin.coroutines.c cVar) {
        return C0738g.e(this.f7782a.d(), new Predictions$findPredictionsSpecial$2(str, typewiseInputType, this, (kotlin.coroutines.c) null), cVar);
    }

    public Object e(String str, String str2, boolean z3, String str3, List list, kotlin.coroutines.c cVar) {
        return C0738g.e(this.f7782a.d(), new Predictions$findPredictions$2(str, str2, str3, this, z3, list, (kotlin.coroutines.c) null), cVar);
    }

    public Object f(String str, List list, List list2, kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f7782a.e(), new Predictions$reinitialize$2(str, list, list2, this, (kotlin.coroutines.c) null), cVar);
        return e4 == a.f() ? e4 : q.f14567a;
    }

    public Object g(kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f7782a.e(), new Predictions$destroy$2(this, (kotlin.coroutines.c) null), cVar);
        return e4 == a.f() ? e4 : q.f14567a;
    }
}
