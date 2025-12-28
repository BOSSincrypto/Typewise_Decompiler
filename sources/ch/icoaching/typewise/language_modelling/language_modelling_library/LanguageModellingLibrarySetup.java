package ch.icoaching.typewise.language_modelling.language_modelling_library;

import D0.Q;
import D0.T;
import D0.g0;
import ch.icoaching.typewise.e;
import ch.icoaching.typewise.language_detection.LanguageDetectionHelper;
import ch.icoaching.typewise.language_modelling.inference.Inference;
import ch.icoaching.typewise.language_modelling.inference.InferenceRepository;
import ch.icoaching.typewise.word_lists.c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;
import s0.C0893c;
import v0.C0921b;

public class LanguageModellingLibrarySetup implements a {

    /* renamed from: s  reason: collision with root package name */
    public static final a f8594s = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final List f8595a;

    /* renamed from: b  reason: collision with root package name */
    private final List f8596b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8597c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8598d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f8599e;

    /* renamed from: f  reason: collision with root package name */
    private final c f8600f;

    /* renamed from: g  reason: collision with root package name */
    private final Q f8601g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f8602h;

    /* renamed from: i  reason: collision with root package name */
    private final Integer f8603i;

    /* renamed from: j  reason: collision with root package name */
    private final Float f8604j;

    /* renamed from: k  reason: collision with root package name */
    private final ch.icoaching.typewise.language_detection.a f8605k;

    /* renamed from: l  reason: collision with root package name */
    private final InferenceRepository f8606l;

    /* renamed from: m  reason: collision with root package name */
    private final Set f8607m;

    /* renamed from: n  reason: collision with root package name */
    private final List f8608n;

    /* renamed from: o  reason: collision with root package name */
    private final Map f8609o;

    /* renamed from: p  reason: collision with root package name */
    private final Map f8610p;

    /* renamed from: q  reason: collision with root package name */
    private final Map f8611q;

    /* renamed from: r  reason: collision with root package name */
    private Map f8612r;

    public static final class a {
        private a() {
        }

        public final LanguageModellingLibrarySetup a(C0893c cVar, c cVar2, Q q4, Integer num, Integer num2, Float f4, Map map) {
            Map map2;
            o.e(cVar, "settings");
            o.e(cVar2, "wordListRepository");
            o.e(q4, "platformDependencies");
            Map h4 = cVar.h();
            if (h4 != null) {
                map2 = C0921b.c(h4);
            } else {
                map2 = null;
            }
            return new LanguageModellingLibrarySetup(cVar.g(), cVar.i(), cVar.e(), cVar.j(), cVar.d(), C0921b.a(map2, map), cVar.f(), cVar.k(), cVar2, q4, num, num2, f4);
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public LanguageModellingLibrarySetup(List list, List list2, String str, boolean z3, Map map, Map map2, List list3, boolean z4, c cVar, Q q4, Integer num, Integer num2, Float f4) {
        List list4 = list;
        List list5 = list2;
        String str2 = str;
        boolean z5 = z3;
        Map map3 = map;
        c cVar2 = cVar;
        Q q5 = q4;
        o.e(list4, "standardLanguagesDefault");
        o.e(list5, "toBeRecognizedOnlyLanguagesDefault");
        o.e(str2, "noisyPrefixTechnique");
        o.e(map3, "languageToModelNames");
        o.e(cVar2, "wordListRepository");
        o.e(q5, "platformDependencies");
        this.f8595a = list4;
        this.f8596b = list5;
        this.f8597c = str2;
        this.f8598d = z5;
        this.f8599e = map3;
        this.f8600f = cVar2;
        this.f8601g = q5;
        this.f8602h = num;
        this.f8603i = num2;
        this.f8604j = f4;
        this.f8605k = new LanguageDetectionHelper(false, list, list2, list3 == null ? C0718m.j() : list3, z4, 0.0f, cVar, 32, (i) null);
        this.f8606l = T.a();
        this.f8607m = C0718m.F0(list2);
        this.f8608n = C0718m.i0(list, list2);
        this.f8609o = new LinkedHashMap();
        this.f8610p = new LinkedHashMap();
        this.f8611q = new LinkedHashMap();
        g0.a().b(z5);
        this.f8612r = map2 == null ? D.h() : map2;
        i(map2 == null ? D.h() : map2);
        k();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object b(ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup r10, java.lang.String r11, kotlin.coroutines.c r12) {
        /*
            boolean r0 = r12 instanceof ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$getCachedSentenceInference$1
            if (r0 == 0) goto L_0x0014
            r0 = r12
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$getCachedSentenceInference$1 r0 = (ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$getCachedSentenceInference$1) r0
            int r1 = r0.f8617e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f8617e = r1
        L_0x0012:
            r9 = r0
            goto L_0x001a
        L_0x0014:
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$getCachedSentenceInference$1 r0 = new ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$getCachedSentenceInference$1
            r0.<init>(r10, r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r12 = r9.f8615c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r9.f8617e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 == r3) goto L_0x0033
            if (r1 != r2) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0033:
            java.lang.Object r10 = r9.f8614b
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r9.f8613a
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup r10 = (ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup) r10
            kotlin.f.b(r12)
            goto L_0x00a0
        L_0x0040:
            kotlin.f.b(r12)
            java.util.Map r12 = r10.f8609o
            boolean r12 = r12.containsKey(r11)
            if (r12 != 0) goto L_0x00c4
            java.util.Map r12 = r10.f8599e
            java.lang.Object r12 = r12.get(r11)
            kotlin.jvm.internal.o.b(r12)
            s0.c$b r12 = (s0.C0893c.b) r12
            java.lang.String r4 = r12.b()
            if (r4 == 0) goto L_0x0078
            ch.icoaching.typewise.language_modelling.inference.InferenceRepository r1 = r10.f8606l
            ch.icoaching.typewise.word_lists.c r12 = r10.f8600f
            D0.Q r5 = r10.f8601g
            java.lang.Integer r6 = r10.f8602h
            java.lang.Integer r7 = r10.f8603i
            java.lang.Float r8 = r10.f8604j
            r9.f8613a = r10
            r9.f8614b = r11
            r9.f8617e = r3
            r3 = 0
            r2 = r4
            r4 = r12
            java.lang.Object r12 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L_0x00a0
            return r0
        L_0x0078:
            s0.c$b$a r1 = r12.a()
            if (r1 == 0) goto L_0x00a8
            ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination$Companion r1 = ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination.f8492p
            s0.c$b$a r12 = r12.a()
            kotlin.jvm.internal.o.b(r12)
            ch.icoaching.typewise.word_lists.c r4 = r10.f8600f
            D0.Q r5 = r10.f8601g
            java.lang.Integer r6 = r10.f8602h
            java.lang.Integer r7 = r10.f8603i
            java.lang.Float r8 = r10.f8604j
            r9.f8613a = r10
            r9.f8614b = r11
            r9.f8617e = r2
            r2 = r12
            r3 = r11
            java.lang.Object r12 = r1.c(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L_0x00a0
            return r0
        L_0x00a0:
            ch.icoaching.typewise.language_modelling.inference.Inference r12 = (ch.icoaching.typewise.language_modelling.inference.Inference) r12
            java.util.Map r0 = r10.f8609o
            r0.put(r11, r12)
            goto L_0x00c4
        L_0x00a8:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "No sentence completion model name or combination model settings declared for language '"
            r12.append(r0)
            r12.append(r11)
            java.lang.String r11 = "'."
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L_0x00c4:
            java.util.Map r10 = r10.f8609o
            java.lang.Object r10 = r10.get(r11)
            kotlin.jvm.internal.o.b(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup.b(ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    static /* synthetic */ Object c(LanguageModellingLibrarySetup languageModellingLibrarySetup, String str, boolean z3, kotlin.coroutines.c cVar) {
        String str2;
        if (z3) {
            str2 = languageModellingLibrarySetup.f8597c;
        } else {
            str2 = null;
        }
        String str3 = str2;
        Object obj = languageModellingLibrarySetup.f8599e.get(str);
        o.b(obj);
        return languageModellingLibrarySetup.f8606l.a(((C0893c.b) obj).c(), str3, languageModellingLibrarySetup.f8600f, languageModellingLibrarySetup.f8601g, languageModellingLibrarySetup.f8602h, languageModellingLibrarySetup.f8603i, languageModellingLibrarySetup.f8604j, cVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(kotlin.coroutines.c r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preloadNNModels$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preloadNNModels$1 r2 = (ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preloadNNModels$1) r2
            int r3 = r2.f8626e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f8626e = r3
            goto L_0x001c
        L_0x0017:
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preloadNNModels$1 r2 = new ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preloadNNModels$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f8624c
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r2.f8626e
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x004f
            if (r4 == r6) goto L_0x0042
            if (r4 != r5) goto L_0x003a
            java.lang.Object r4 = r2.f8623b
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r7 = r2.f8622a
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup r7 = (ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup) r7
            kotlin.f.b(r1)
            r1 = r4
            r4 = r7
            goto L_0x0059
        L_0x003a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0042:
            java.lang.Object r4 = r2.f8623b
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r7 = r2.f8622a
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup r7 = (ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup) r7
            kotlin.f.b(r1)
            r15 = r7
            goto L_0x009a
        L_0x004f:
            kotlin.f.b(r1)
            java.util.List r1 = r0.f8595a
            java.util.Iterator r1 = r1.iterator()
            r4 = r0
        L_0x0059:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00bb
            java.lang.Object r7 = r1.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            ch.icoaching.typewise.e r9 = ch.icoaching.typewise.e.f8233a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "preloadNNModels() :: Preloading completion model for language '"
            r7.append(r10)
            r7.append(r8)
            java.lang.String r10 = "' and running two warmup requests."
            r7.append(r10)
            java.lang.String r11 = r7.toString()
            r13 = 4
            r14 = 0
            java.lang.String r10 = "LanguageModellingLibrarySetup"
            r12 = 0
            ch.icoaching.typewise.e.b(r9, r10, r11, r12, r13, r14)
            r2.f8622a = r4
            r2.f8623b = r1
            r2.f8626e = r6
            r11 = 2
            r9 = 0
            r7 = r4
            r10 = r2
            java.lang.Object r7 = ch.icoaching.typewise.language_modelling.language_modelling_library.a.C0144a.a(r7, r8, r9, r10, r11, r12)
            if (r7 != r3) goto L_0x0097
            return r3
        L_0x0097:
            r15 = r4
            r4 = r1
            r1 = r7
        L_0x009a:
            r7 = r1
            ch.icoaching.typewise.language_modelling.inference.b r7 = (ch.icoaching.typewise.language_modelling.inference.b) r7
            r2.f8622a = r15
            r2.f8623b = r4
            r2.f8626e = r5
            r14 = 30
            r1 = 0
            java.lang.String r8 = ""
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = r2
            r16 = r15
            r15 = r1
            java.lang.Object r1 = ch.icoaching.typewise.language_modelling.inference.a.a(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r1 != r3) goto L_0x00b7
            return r3
        L_0x00b7:
            r1 = r4
            r4 = r16
            goto L_0x0059
        L_0x00bb:
            l2.q r1 = l2.q.f14567a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup.m(kotlin.coroutines.c):java.lang.Object");
    }

    static /* synthetic */ Object n(LanguageModellingLibrarySetup languageModellingLibrarySetup, kotlin.coroutines.c cVar) {
        Object b4 = languageModellingLibrarySetup.f8606l.b(cVar);
        if (b4 == kotlin.coroutines.intrinsics.a.f()) {
            return b4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(kotlin.coroutines.c r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preloadSentenceModels$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preloadSentenceModels$1 r2 = (ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preloadSentenceModels$1) r2
            int r3 = r2.f8631e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f8631e = r3
            goto L_0x001c
        L_0x0017:
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preloadSentenceModels$1 r2 = new ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preloadSentenceModels$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f8629c
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r2.f8631e
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x004f
            if (r4 == r6) goto L_0x0042
            if (r4 != r5) goto L_0x003a
            java.lang.Object r4 = r2.f8628b
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r7 = r2.f8627a
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup r7 = (ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup) r7
            kotlin.f.b(r1)
            r1 = r4
            r4 = r7
            goto L_0x0059
        L_0x003a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0042:
            java.lang.Object r4 = r2.f8628b
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r7 = r2.f8627a
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup r7 = (ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup) r7
            kotlin.f.b(r1)
            r15 = r7
            goto L_0x0095
        L_0x004f:
            kotlin.f.b(r1)
            java.util.List r1 = r0.f8595a
            java.util.Iterator r1 = r1.iterator()
            r4 = r0
        L_0x0059:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00b6
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            ch.icoaching.typewise.e r8 = ch.icoaching.typewise.e.f8233a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "preloadSentenceModels() :: Preloading sentence completion model for language '"
            r9.append(r10)
            r9.append(r7)
            java.lang.String r10 = "'."
            r9.append(r10)
            java.lang.String r10 = r9.toString()
            r12 = 4
            r13 = 0
            java.lang.String r9 = "LanguageModellingLibrarySetup"
            r11 = 0
            ch.icoaching.typewise.e.b(r8, r9, r10, r11, r12, r13)
            r2.f8627a = r4
            r2.f8628b = r1
            r2.f8631e = r6
            java.lang.Object r7 = r4.h(r7, r2)
            if (r7 != r3) goto L_0x0092
            return r3
        L_0x0092:
            r15 = r4
            r4 = r1
            r1 = r7
        L_0x0095:
            r7 = r1
            ch.icoaching.typewise.language_modelling.inference.b r7 = (ch.icoaching.typewise.language_modelling.inference.b) r7
            r2.f8627a = r15
            r2.f8628b = r4
            r2.f8631e = r5
            r14 = 30
            r1 = 0
            java.lang.String r8 = "This is a warmup req"
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = r2
            r16 = r15
            r15 = r1
            java.lang.Object r1 = ch.icoaching.typewise.language_modelling.inference.a.a(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r1 != r3) goto L_0x00b2
            return r3
        L_0x00b2:
            r1 = r4
            r4 = r16
            goto L_0x0059
        L_0x00b6:
            l2.q r1 = l2.q.f14567a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup.o(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object p(ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup r6, kotlin.coroutines.c r7) {
        /*
            boolean r0 = r7 instanceof ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preload$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preload$1 r0 = (ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preload$1) r0
            int r1 = r0.f8621d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8621d = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preload$1 r0 = new ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preload$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f8619b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8621d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.f.b(r7)
            goto L_0x006c
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            java.lang.Object r6 = r0.f8618a
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup r6 = (ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup) r6
            kotlin.f.b(r7)
            goto L_0x0060
        L_0x003f:
            java.lang.Object r6 = r0.f8618a
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup r6 = (ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup) r6
            kotlin.f.b(r7)
            goto L_0x0055
        L_0x0047:
            kotlin.f.b(r7)
            r0.f8618a = r6
            r0.f8621d = r5
            java.lang.Object r7 = r6.q(r0)
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r0.f8618a = r6
            r0.f8621d = r4
            java.lang.Object r7 = r6.m(r0)
            if (r7 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r7 = 0
            r0.f8618a = r7
            r0.f8621d = r3
            java.lang.Object r6 = r6.o(r0)
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            l2.q r6 = l2.q.f14567a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup.p(ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q(kotlin.coroutines.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preloadWordLists$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preloadWordLists$1 r0 = (ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preloadWordLists$1) r0
            int r1 = r0.f8636e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8636e = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preloadWordLists$1 r0 = new ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup$preloadWordLists$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f8634c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8636e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r2 = r0.f8633b
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f8632a
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup r4 = (ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup) r4
            kotlin.f.b(r9)
            goto L_0x0076
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003c:
            java.lang.Object r2 = r0.f8633b
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r5 = r0.f8632a
            ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup r5 = (ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup) r5
            kotlin.f.b(r9)
            goto L_0x0052
        L_0x0048:
            kotlin.f.b(r9)
            java.util.List r9 = r8.f8595a
            java.util.Iterator r2 = r9.iterator()
            r5 = r8
        L_0x0052:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x006f
            java.lang.Object r9 = r2.next()
            java.lang.String r9 = (java.lang.String) r9
            ch.icoaching.typewise.word_lists.c r6 = r5.f8600f
            ch.icoaching.typewise.word_lists.WordListKind r7 = ch.icoaching.typewise.word_lists.WordListKind.COMBINED
            r0.f8632a = r5
            r0.f8633b = r2
            r0.f8636e = r4
            java.lang.Object r9 = r6.d(r9, r7, r0)
            if (r9 != r1) goto L_0x0052
            return r1
        L_0x006f:
            java.util.List r9 = r5.f8596b
            java.util.Iterator r2 = r9.iterator()
            r4 = r5
        L_0x0076:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0093
            java.lang.Object r9 = r2.next()
            java.lang.String r9 = (java.lang.String) r9
            ch.icoaching.typewise.word_lists.c r5 = r4.f8600f
            ch.icoaching.typewise.word_lists.WordListKind r6 = ch.icoaching.typewise.word_lists.WordListKind.COMBINED
            r0.f8632a = r4
            r0.f8633b = r2
            r0.f8636e = r3
            java.lang.Object r9 = r5.d(r9, r6, r0)
            if (r9 != r1) goto L_0x0076
            return r1
        L_0x0093:
            l2.q r9 = l2.q.f14567a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.language_modelling_library.LanguageModellingLibrarySetup.q(kotlin.coroutines.c):java.lang.Object");
    }

    public ch.icoaching.typewise.language_detection.a a() {
        return this.f8605k;
    }

    public Object d(kotlin.coroutines.c cVar) {
        return n(this, cVar);
    }

    public Object e(String str, boolean z3, kotlin.coroutines.c cVar) {
        return c(this, str, z3, cVar);
    }

    public Object f(kotlin.coroutines.c cVar) {
        return p(this, cVar);
    }

    public Object h(String str, kotlin.coroutines.c cVar) {
        return b(this, str, cVar);
    }

    public final void i(Map map) {
        o.e(map, "value");
        Inference.f8354k.c(map);
        this.f8612r = map;
        e eVar = e.f8233a;
        e.b(eVar, "LanguageModellingLibrarySetup", "Set toBeFilteredOutFullPredictions to " + map, (Throwable) null, 4, (Object) null);
    }

    public void k() {
        if (!C0718m.V(this.f8595a, this.f8607m).isEmpty()) {
            throw new IllegalArgumentException("The standard languages and the to-be-recognized-only languages are not disjoint");
        } else if (!C0718m.h0(this.f8595a, this.f8599e.keySet()).isEmpty()) {
            List list = this.f8595a;
            Set keySet = this.f8599e.keySet();
            throw new IllegalArgumentException("The standard languages (" + list + ") must all be in the lang to model names declared in languageModellingSettings (" + keySet + ")");
        }
    }
}
