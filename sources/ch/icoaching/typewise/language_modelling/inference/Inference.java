package ch.icoaching.typewise.language_modelling.inference;

import D0.L;
import D0.U;
import D0.V;
import D0.h0;
import E0.r;
import ch.icoaching.typewise.e;
import ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult;
import ch.icoaching.typewise.word_lists.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.collections.B;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.random.Random;
import y0.C0946c;
import z2.d;

public abstract class Inference implements b {

    /* renamed from: k  reason: collision with root package name */
    public static final a f8354k = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static Map f8355l;

    /* renamed from: a  reason: collision with root package name */
    private final String f8356a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8357b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8358c;

    /* renamed from: d  reason: collision with root package name */
    private Integer f8359d;

    /* renamed from: e  reason: collision with root package name */
    private Float f8360e;

    /* renamed from: f  reason: collision with root package name */
    private final Float f8361f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f8362g;

    /* renamed from: h  reason: collision with root package name */
    private final Boolean f8363h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f8364i;

    /* renamed from: j  reason: collision with root package name */
    private final c f8365j;

    public static abstract class InferenceCompanion {
        public final r a(String str) {
            o.e(str, "stringDeclaration");
            U u3 = U.f249a;
            return new r(u3.f(str), u3.d(str), u3.g(str), Boolean.valueOf(u3.e(str)));
        }

        public abstract Inference b(h0 h0Var, V v3, ch.icoaching.typewise.language_modelling.preprocessing.a aVar, c cVar);

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: ch.icoaching.typewise.word_lists.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: D0.h0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object c(java.lang.String r5, D0.h0 r6, ch.icoaching.typewise.word_lists.c r7, D0.Q r8, kotlin.coroutines.c r9) {
            /*
                r4 = this;
                boolean r0 = r9 instanceof ch.icoaching.typewise.language_modelling.inference.Inference$InferenceCompanion$getInstance$1
                if (r0 == 0) goto L_0x0013
                r0 = r9
                ch.icoaching.typewise.language_modelling.inference.Inference$InferenceCompanion$getInstance$1 r0 = (ch.icoaching.typewise.language_modelling.inference.Inference$InferenceCompanion$getInstance$1) r0
                int r1 = r0.f8371f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8371f = r1
                goto L_0x0018
            L_0x0013:
                ch.icoaching.typewise.language_modelling.inference.Inference$InferenceCompanion$getInstance$1 r0 = new ch.icoaching.typewise.language_modelling.inference.Inference$InferenceCompanion$getInstance$1
                r0.<init>(r4, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f8369d
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.f8371f
                r3 = 1
                if (r2 == 0) goto L_0x003f
                if (r2 != r3) goto L_0x0037
                java.lang.Object r5 = r0.f8368c
                r7 = r5
                ch.icoaching.typewise.word_lists.c r7 = (ch.icoaching.typewise.word_lists.c) r7
                java.lang.Object r5 = r0.f8367b
                r6 = r5
                D0.h0 r6 = (D0.h0) r6
                java.lang.Object r5 = r0.f8366a
                ch.icoaching.typewise.language_modelling.inference.Inference$InferenceCompanion r5 = (ch.icoaching.typewise.language_modelling.inference.Inference.InferenceCompanion) r5
                kotlin.f.b(r9)
                goto L_0x0056
            L_0x0037:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x003f:
                kotlin.f.b(r9)
                ch.icoaching.typewise.language_modelling.modelling.ModelRepository r9 = D0.g0.a()
                r0.f8366a = r4
                r0.f8367b = r6
                r0.f8368c = r7
                r0.f8371f = r3
                java.lang.Object r9 = r9.a(r5, r6, r8, r0)
                if (r9 != r1) goto L_0x0055
                return r1
            L_0x0055:
                r5 = r4
            L_0x0056:
                kotlin.Pair r9 = (kotlin.Pair) r9
                java.lang.Object r8 = r9.component1()
                D0.V r8 = (D0.V) r8
                java.lang.Object r9 = r9.component2()
                ch.icoaching.typewise.language_modelling.preprocessing.a r9 = (ch.icoaching.typewise.language_modelling.preprocessing.a) r9
                ch.icoaching.typewise.language_modelling.inference.Inference r5 = r5.b(r6, r8, r9, r7)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.Inference.InferenceCompanion.c(java.lang.String, D0.h0, ch.icoaching.typewise.word_lists.c, D0.Q, kotlin.coroutines.c):java.lang.Object");
        }
    }

    public static final class a {
        private a() {
        }

        public final Map a() {
            Map i4 = Inference.f8355l;
            if (i4 != null) {
                return D.q(i4);
            }
            return null;
        }

        public final Pair b(h0.c cVar, ch.icoaching.typewise.language_modelling.preprocessing.c cVar2) {
            o.e(cVar, "inferenceConfig");
            o.e(cVar2, "pp");
            List o4 = cVar.o();
            o.b(o4);
            ArrayList<String> arrayList = new ArrayList<>();
            for (Object next : o4) {
                if (cVar2.m().containsKey((String) next)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C0718m.t(arrayList, 10));
            for (String str : arrayList) {
                Object obj = cVar2.m().get(str);
                o.b(obj);
                arrayList2.add(Integer.valueOf(((Number) obj).intValue()));
            }
            z2.c j4 = d.j(0, cVar2.o());
            ArrayList arrayList3 = new ArrayList(C0718m.t(j4, 10));
            Iterator it = j4.iterator();
            while (it.hasNext()) {
                Object obj2 = cVar2.k().get(Integer.valueOf(((B) it).b()));
                o.b(obj2);
                arrayList3.add(Boolean.valueOf(C0946c.r((String) obj2, arrayList)));
            }
            return new Pair(arrayList2, arrayList3);
        }

        public final void c(Map map) {
            o.e(map, "toBeFilteredOutFullPredictions");
            Inference.f8355l = map;
        }

        public final boolean d(String str) {
            o.e(str, "stringDeclaration");
            return kotlin.text.o.L(str, "filtblocklst", false, 2, (Object) null);
        }

        public final boolean e(String str) {
            o.e(str, "stringDeclaration");
            return kotlin.text.o.L(str, "filtnotwordlst", false, 2, (Object) null);
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public Inference(String str, boolean z3, boolean z4, Integer num, Float f4, Float f5, boolean z5, Boolean bool, boolean z6, c cVar) {
        int i4;
        o.e(str, "languageCode");
        o.e(cVar, "wordListRepository");
        this.f8356a = str;
        this.f8357b = z3;
        this.f8358c = z4;
        this.f8359d = num;
        this.f8360e = f4;
        this.f8361f = f5;
        this.f8362g = z5;
        this.f8363h = bool;
        this.f8364i = z6;
        this.f8365j = cVar;
        if (num != null) {
            o.b(num);
            i4 = num.intValue() + 1;
        } else {
            i4 = 0;
        }
        e eVar = e.f8233a;
        Integer num2 = this.f8359d;
        Float f6 = this.f8360e;
        e.b(eVar, "Inference", "init() :: filterSavingLessThanNChar = " + num2 + ", meaning completions of " + i4 + " char will be filtered out, filterProbLowerThan = " + f6 + ", filterScoreLowerThan = " + f5, (Throwable) null, 4, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object e(ch.icoaching.typewise.language_modelling.inference.Inference r13, java.lang.String r14, java.lang.String r15, java.lang.Float r16, java.lang.Integer r17, java.lang.String r18, kotlin.coroutines.c r19) {
        /*
            r7 = r13
            r0 = r19
            boolean r1 = r0 instanceof ch.icoaching.typewise.language_modelling.inference.Inference$predictCompletions$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            ch.icoaching.typewise.language_modelling.inference.Inference$predictCompletions$1 r1 = (ch.icoaching.typewise.language_modelling.inference.Inference$predictCompletions$1) r1
            int r2 = r1.f8384f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f8384f = r2
        L_0x0015:
            r8 = r1
            goto L_0x001d
        L_0x0017:
            ch.icoaching.typewise.language_modelling.inference.Inference$predictCompletions$1 r1 = new ch.icoaching.typewise.language_modelling.inference.Inference$predictCompletions$1
            r1.<init>(r13, r0)
            goto L_0x0015
        L_0x001d:
            java.lang.Object r0 = r8.f8382d
            java.lang.Object r9 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r8.f8384f
            r10 = 2
            r2 = 1
            if (r1 == 0) goto L_0x004b
            if (r1 == r2) goto L_0x0039
            if (r1 != r10) goto L_0x0031
            kotlin.f.b(r0)
            goto L_0x007d
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            java.lang.Object r1 = r8.f8381c
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.f8380b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r8.f8379a
            ch.icoaching.typewise.language_modelling.inference.Inference r3 = (ch.icoaching.typewise.language_modelling.inference.Inference) r3
            kotlin.f.b(r0)
            r12 = r1
            r11 = r2
            goto L_0x006b
        L_0x004b:
            kotlin.f.b(r0)
            r8.f8379a = r7
            r11 = r14
            r8.f8380b = r11
            r12 = r18
            r8.f8381c = r12
            r8.f8384f = r2
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r8
            java.lang.Object r0 = r0.b(r1, r2, r3, r4, r5, r6)
            if (r0 != r9) goto L_0x006a
            return r9
        L_0x006a:
            r3 = r7
        L_0x006b:
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r0 = (ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult) r0
            r1 = 0
            r8.f8379a = r1
            r8.f8380b = r1
            r8.f8381c = r1
            r8.f8384f = r10
            java.lang.Object r0 = r3.g(r0, r11, r12, r8)
            if (r0 != r9) goto L_0x007d
            return r9
        L_0x007d:
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r0 = (ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.Inference.e(ch.icoaching.typewise.language_modelling.inference.Inference, java.lang.String, java.lang.String, java.lang.Float, java.lang.Integer, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    static /* synthetic */ Object f(Inference inference, String str, String str2, kotlin.coroutines.c cVar) {
        String b4 = kotlin.jvm.internal.r.b(inference.getClass()).b();
        throw new NotImplementedError("getScoreOfCompletion() not implemented for " + b4);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r18, java.lang.String r19, java.lang.String r20, kotlin.coroutines.c r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r21
            boolean r2 = r1 instanceof ch.icoaching.typewise.language_modelling.inference.Inference$postProcessInferenceResult$1
            if (r2 == 0) goto L_0x0018
            r2 = r1
            ch.icoaching.typewise.language_modelling.inference.Inference$postProcessInferenceResult$1 r2 = (ch.icoaching.typewise.language_modelling.inference.Inference$postProcessInferenceResult$1) r2
            int r3 = r2.f8378g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.f8378g = r3
        L_0x0016:
            r8 = r2
            goto L_0x001e
        L_0x0018:
            ch.icoaching.typewise.language_modelling.inference.Inference$postProcessInferenceResult$1 r2 = new ch.icoaching.typewise.language_modelling.inference.Inference$postProcessInferenceResult$1
            r2.<init>(r0, r1)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r1 = r8.f8376e
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.f()
            int r3 = r8.f8378g
            r4 = 3
            r11 = 2
            r12 = 1
            r13 = 0
            if (r3 == 0) goto L_0x006c
            if (r3 == r12) goto L_0x005c
            if (r3 == r11) goto L_0x0047
            if (r3 != r4) goto L_0x003f
            java.lang.Object r2 = r8.f8373b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r8.f8372a
            ch.icoaching.typewise.language_modelling.inference.Inference r3 = (ch.icoaching.typewise.language_modelling.inference.Inference) r3
            kotlin.f.b(r1)
            goto L_0x0108
        L_0x003f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            java.lang.Object r3 = r8.f8375d
            ch.icoaching.typewise.word_lists.WordList r3 = (ch.icoaching.typewise.word_lists.WordList) r3
            java.lang.Object r5 = r8.f8374c
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r5 = (ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult) r5
            java.lang.Object r6 = r8.f8373b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r8.f8372a
            ch.icoaching.typewise.language_modelling.inference.Inference r7 = (ch.icoaching.typewise.language_modelling.inference.Inference) r7
            kotlin.f.b(r1)
            goto L_0x00d5
        L_0x005c:
            java.lang.Object r3 = r8.f8374c
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r3 = (ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult) r3
            java.lang.Object r5 = r8.f8373b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r8.f8372a
            ch.icoaching.typewise.language_modelling.inference.Inference r6 = (ch.icoaching.typewise.language_modelling.inference.Inference) r6
            kotlin.f.b(r1)
            goto L_0x00a7
        L_0x006c:
            kotlin.f.b(r1)
            boolean r1 = r18.isEmpty()
            if (r1 == 0) goto L_0x0076
            return r18
        L_0x0076:
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r1 = r18.t(r19, r20)
            boolean r3 = r0.f8357b
            if (r3 == 0) goto L_0x0082
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r1 = r1.e()
        L_0x0082:
            r3 = r1
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x008a
            return r3
        L_0x008a:
            boolean r1 = r0.f8358c
            if (r1 == 0) goto L_0x00b0
            ch.icoaching.typewise.word_lists.c r1 = r0.f8365j
            java.lang.String r5 = r0.f8356a
            ch.icoaching.typewise.word_lists.WordListKind r6 = ch.icoaching.typewise.word_lists.WordListKind.COMBINED
            r8.f8372a = r0
            r7 = r19
            r8.f8373b = r7
            r8.f8374c = r3
            r8.f8378g = r12
            java.lang.Object r1 = r1.d(r5, r6, r8)
            if (r1 != r2) goto L_0x00a5
            return r2
        L_0x00a5:
            r6 = r0
            r5 = r7
        L_0x00a7:
            ch.icoaching.typewise.word_lists.WordList r1 = (ch.icoaching.typewise.word_lists.WordList) r1
            r7 = r6
            r16 = r3
            r3 = r1
            r1 = r16
            goto L_0x00b6
        L_0x00b0:
            r7 = r19
            r1 = r3
            r5 = r7
            r3 = r13
            r7 = r0
        L_0x00b6:
            boolean r6 = r7.f8362g
            if (r6 == 0) goto L_0x00e0
            ch.icoaching.typewise.word_lists.c r6 = r7.f8365j
            java.lang.String r9 = r7.f8356a
            r8.f8372a = r7
            r8.f8373b = r5
            r8.f8374c = r1
            r8.f8375d = r3
            r8.f8378g = r11
            java.lang.Object r6 = r6.b(r9, r8)
            if (r6 != r2) goto L_0x00cf
            return r2
        L_0x00cf:
            r16 = r5
            r5 = r1
            r1 = r6
            r6 = r16
        L_0x00d5:
            ch.icoaching.typewise.word_lists.WordList r1 = (ch.icoaching.typewise.word_lists.WordList) r1
            r14 = r6
            r15 = r7
            r16 = r3
            r3 = r1
            r1 = r5
            r5 = r16
            goto L_0x00e4
        L_0x00e0:
            r14 = r5
            r15 = r7
            r5 = r3
            r3 = r13
        L_0x00e4:
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r3 = r1.d(r5, r3)
            boolean r1 = r15.f8364i
            if (r1 == 0) goto L_0x010d
            java.lang.String r1 = r15.f8356a
            ch.icoaching.typewise.word_lists.c r7 = r15.f8365j
            r8.f8372a = r15
            r8.f8373b = r14
            r8.f8374c = r13
            r8.f8375d = r13
            r8.f8378g = r4
            r9 = 4
            r10 = 0
            r6 = 0
            r4 = r1
            r5 = r14
            java.lang.Object r1 = ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult.h(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r1 != r2) goto L_0x0106
            return r2
        L_0x0106:
            r2 = r14
            r3 = r15
        L_0x0108:
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r1 = (ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult) r1
            r14 = r2
            r15 = r3
            r3 = r1
        L_0x010d:
            ch.icoaching.typewise.language_modelling.inference.Inference$a r1 = f8354k
            java.util.Map r1 = r1.a()
            if (r1 == 0) goto L_0x0123
            java.lang.String r2 = r15.f8356a
            java.lang.Object r1 = r1.get(r2)
            v0.a r1 = (v0.C0920a) r1
            if (r1 == 0) goto L_0x0123
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r3 = r3.f(r1, r14)
        L_0x0123:
            java.lang.Boolean r1 = r15.f8363h
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.a.a(r12)
            boolean r1 = kotlin.jvm.internal.o.a(r1, r2)
            if (r1 == 0) goto L_0x0134
            r1 = 0
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r3 = ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult.l(r3, r14, r1, r11, r13)
        L_0x0134:
            java.lang.Integer r1 = r15.f8359d
            if (r1 == 0) goto L_0x0143
            kotlin.jvm.internal.o.b(r1)
            int r1 = r1.intValue()
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r3 = r3.m(r1)
        L_0x0143:
            java.lang.Float r1 = r15.f8360e
            if (r1 == 0) goto L_0x0152
            kotlin.jvm.internal.o.b(r1)
            float r1 = r1.floatValue()
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r3 = r3.j(r1)
        L_0x0152:
            java.lang.Float r1 = r15.f8361f
            if (r1 == 0) goto L_0x015e
            float r1 = r1.floatValue()
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r3 = r3.n(r1)
        L_0x015e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.Inference.g(ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public Object a(String str, String str2, Float f4, Integer num, String str3, kotlin.coroutines.c cVar) {
        return e(this, str, str2, f4, num, str3, cVar);
    }

    public Object c(String str, String str2, kotlin.coroutines.c cVar) {
        return f(this, str, str2, cVar);
    }

    public abstract Object h(kotlin.coroutines.c cVar);

    public final void j(String str, LMInferenceResult lMInferenceResult, String str2, String str3, float f4) {
        o.e(str, "context");
        o.e(lMInferenceResult, "completionResult");
        if (Random.Default.nextFloat() < f4) {
            if (str2 == null) {
                str2 = L.b(str, false, 2, (Object) null);
            }
            e eVar = e.f8233a;
            String b4 = kotlin.jvm.internal.r.b(getClass()).b();
            e.b(eVar, "Inference", "\n[" + b4 + "] |context|+|prior|+|ground truth| = |" + str + "|+|" + str2 + "|+ |" + str3 + "|\n", (Throwable) null, 4, (Object) null);
            for (ch.icoaching.typewise.language_modelling_result_classes.a b5 : lMInferenceResult.q()) {
                e.b(e.f8233a, "Inference", b5, (Throwable) null, 4, (Object) null);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Inference(java.lang.String r14, boolean r15, boolean r16, java.lang.Integer r17, java.lang.Float r18, java.lang.Float r19, boolean r20, java.lang.Boolean r21, boolean r22, ch.icoaching.typewise.word_lists.c r23, int r24, kotlin.jvm.internal.i r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0009
            r1 = 1
            r4 = r1
            goto L_0x000a
        L_0x0009:
            r4 = r15
        L_0x000a:
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r16
        L_0x0013:
            r1 = r0 & 8
            r3 = 0
            if (r1 == 0) goto L_0x001a
            r6 = r3
            goto L_0x001c
        L_0x001a:
            r6 = r17
        L_0x001c:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0022
            r7 = r3
            goto L_0x0024
        L_0x0022:
            r7 = r18
        L_0x0024:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002a
            r8 = r3
            goto L_0x002c
        L_0x002a:
            r8 = r19
        L_0x002c:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0032
            r9 = r2
            goto L_0x0034
        L_0x0032:
            r9 = r20
        L_0x0034:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003c
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r10 = r1
            goto L_0x003e
        L_0x003c:
            r10 = r21
        L_0x003e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0044
            r11 = r2
            goto L_0x0046
        L_0x0044:
            r11 = r22
        L_0x0046:
            r2 = r13
            r3 = r14
            r12 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.Inference.<init>(java.lang.String, boolean, boolean, java.lang.Integer, java.lang.Float, java.lang.Float, boolean, java.lang.Boolean, boolean, ch.icoaching.typewise.word_lists.c, int, kotlin.jvm.internal.i):void");
    }
}
