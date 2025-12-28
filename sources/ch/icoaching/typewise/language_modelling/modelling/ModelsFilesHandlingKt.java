package ch.icoaching.typewise.language_modelling.modelling;

import D0.Q;
import D0.h0;
import E0.d;
import ch.icoaching.typewise.e;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public abstract class ModelsFilesHandlingKt {
    public static final int a(h0 h0Var) {
        o.e(h0Var, "config");
        Integer l4 = h0Var.a().l();
        if (l4 != null) {
            return l4.intValue();
        }
        throw new IllegalArgumentException("Please update the new naming convention in config.json of model. Change max_len to max_steps_per_single_word, paying attention when converting max_len of models that were used for multi-words");
    }

    public static final h0 b(String str, List list, String str2, boolean z3) {
        o.e(str, "language");
        o.e(list, "modelNames");
        o.e(str2, "inferenceTechnique");
        if (kotlin.text.o.t0(str2, new String[]{"--"}, false, 0, 6, (Object) null).size() - 1 == list.size()) {
            String str3 = str;
            h0.c cVar = r1;
            h0.d dVar = new h0.d("sentence_completion_combination", (Integer) null, (Integer) null, (String) null, (Boolean) null, (String) null, "combination", list, 62, (i) null);
            h0.c cVar2 = new h0.c(str3, str2, (Integer) null, (Integer) null, (Boolean) null, (List) null, (List) null, (String) null, (Boolean) null, (Boolean) null, Boolean.valueOf(z3), 1020, (i) null);
            return new h0(dVar, cVar, new h0.e(str3, Boolean.FALSE, "sentence", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 1016, (i) null));
        }
        throw new IllegalArgumentException("The number of models and the number of inference techniques should be the same.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(java.lang.String r4, D0.Q r5, kotlin.coroutines.c r6) {
        /*
            boolean r0 = r6 instanceof ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt$loadConfigOfModel$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt$loadConfigOfModel$1 r0 = (ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt$loadConfigOfModel$1) r0
            int r1 = r0.f8675b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8675b = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt$loadConfigOfModel$1 r0 = new ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt$loadConfigOfModel$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f8674a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8675b
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.f.b(r6)
            goto L_0x0054
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.f.b(r6)
            java.util.Map r4 = g(r4, r5)
            java.lang.String r5 = "config"
            java.lang.Object r4 = r4.get(r5)
            kotlin.jvm.internal.o.b(r4)
            java.lang.String r4 = (java.lang.String) r4
            ch.icoaching.typewise.file_handling.b r5 = ch.icoaching.typewise.file_handling.b.f8265a
            ch.icoaching.typewise.file_handling.FileIO$Scope r6 = ch.icoaching.typewise.file_handling.FileIO.Scope.PREDICTION
            ch.icoaching.typewise.file_handling.FileIO r5 = r5.a(r6)
            r0.f8675b = r3
            java.lang.Object r6 = r5.a(r4, r0)
            if (r6 != r1) goto L_0x0054
            return r1
        L_0x0054:
            java.lang.String r6 = (java.lang.String) r6
            t0.c r4 = t0.c.f16361a
            K2.a r4 = r4.c()
            r4.a()
            D0.h0$b r5 = D0.h0.f278d
            F2.b r5 = r5.serializer()
            java.lang.Object r4 = r4.c(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt.c(java.lang.String, D0.Q, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(java.lang.String r17, D0.h0 r18, boolean r19, boolean r20, D0.Q r21, kotlin.coroutines.c r22) {
        /*
            r0 = r17
            r1 = r21
            r2 = r22
            boolean r3 = r2 instanceof ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt$getModelAndPP$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt$getModelAndPP$1 r3 = (ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt$getModelAndPP$1) r3
            int r4 = r3.f8673h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f8673h = r4
            goto L_0x001e
        L_0x0019:
            ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt$getModelAndPP$1 r3 = new ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt$getModelAndPP$1
            r3.<init>(r2)
        L_0x001e:
            java.lang.Object r2 = r3.f8672g
            java.lang.Object r13 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r3.f8673h
            java.lang.String r14 = "'."
            r15 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r12 = 0
            if (r4 == 0) goto L_0x0092
            if (r4 == r8) goto L_0x007b
            if (r4 == r7) goto L_0x0061
            if (r4 == r6) goto L_0x0058
            if (r4 == r5) goto L_0x004f
            if (r4 != r15) goto L_0x0047
            java.lang.Object r0 = r3.f8667b
            ch.icoaching.typewise.language_modelling.preprocessing.a r0 = (ch.icoaching.typewise.language_modelling.preprocessing.a) r0
            java.lang.Object r1 = r3.f8666a
            D0.V r1 = (D0.V) r1
            kotlin.f.b(r2)
            goto L_0x01cf
        L_0x0047:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004f:
            boolean r0 = r3.f8670e
            kotlin.f.b(r2)
            r1 = r0
            r0 = r12
            goto L_0x0173
        L_0x0058:
            boolean r0 = r3.f8670e
            kotlin.f.b(r2)
            r1 = r2
            r2 = r12
            goto L_0x0118
        L_0x0061:
            boolean r0 = r3.f8671f
            boolean r1 = r3.f8670e
            java.lang.Object r4 = r3.f8669d
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r3.f8668c
            D0.h0 r7 = (D0.h0) r7
            java.lang.Object r8 = r3.f8667b
            D0.Q r8 = (D0.Q) r8
            java.lang.Object r9 = r3.f8666a
            java.lang.String r9 = (java.lang.String) r9
            kotlin.f.b(r2)
            r2 = r8
            goto L_0x00e5
        L_0x007b:
            boolean r0 = r3.f8671f
            boolean r1 = r3.f8670e
            java.lang.Object r4 = r3.f8667b
            D0.Q r4 = (D0.Q) r4
            java.lang.Object r8 = r3.f8666a
            java.lang.String r8 = (java.lang.String) r8
            kotlin.f.b(r2)
            r16 = r4
            r4 = r0
            r0 = r8
            r8 = r2
            r2 = r16
            goto L_0x00b1
        L_0x0092:
            kotlin.f.b(r2)
            if (r18 != 0) goto L_0x00b4
            r3.f8666a = r0
            r3.f8667b = r1
            r2 = r19
            r3.f8670e = r2
            r4 = r20
            r3.f8671f = r4
            r3.f8673h = r8
            java.lang.Object r8 = c(r0, r1, r3)
            if (r8 != r13) goto L_0x00ac
            return r13
        L_0x00ac:
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x00b1:
            D0.h0 r8 = (D0.h0) r8
            goto L_0x00bf
        L_0x00b4:
            r2 = r19
            r4 = r20
            r8 = r18
            r16 = r2
            r2 = r1
            r1 = r16
        L_0x00bf:
            D0.h0$d r9 = r8.e()
            java.lang.String r9 = r9.e()
            if (r9 == 0) goto L_0x0209
            r3.f8666a = r0
            r3.f8667b = r2
            r3.f8668c = r8
            r3.f8669d = r9
            r3.f8670e = r1
            r3.f8671f = r4
            r3.f8673h = r7
            java.lang.Object r7 = ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingPlatformSpecificKt.b(r0, r2, r3)
            if (r7 != r13) goto L_0x00de
            return r13
        L_0x00de:
            r7 = r8
            r16 = r9
            r9 = r0
            r0 = r4
            r4 = r16
        L_0x00e5:
            java.lang.String r8 = "neural"
            boolean r8 = kotlin.jvm.internal.o.a(r4, r8)
            if (r8 == 0) goto L_0x012b
            if (r0 == 0) goto L_0x00f3
            java.lang.String r0 = "tf_lite"
            r8 = r0
            goto L_0x00f4
        L_0x00f3:
            r8 = r12
        L_0x00f4:
            r3.f8666a = r12
            r3.f8667b = r12
            r3.f8668c = r12
            r3.f8669d = r12
            r3.f8670e = r1
            r3.f8673h = r6
            r11 = 8
            r0 = 0
            r10 = 0
            r4 = r9
            r5 = r7
            r6 = r1
            r7 = r10
            r9 = r2
            r10 = r3
            r2 = r12
            r12 = r0
            java.lang.Object r0 = f(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r13) goto L_0x0113
            return r13
        L_0x0113:
            r16 = r1
            r1 = r0
            r0 = r16
        L_0x0118:
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r4 = r1.getFirst()
            D0.V r4 = (D0.V) r4
            java.lang.Object r1 = r1.getSecond()
            r12 = r1
            ch.icoaching.typewise.language_modelling.preprocessing.a r12 = (ch.icoaching.typewise.language_modelling.preprocessing.a) r12
            r1 = r0
            r0 = r2
            r2 = r4
            goto L_0x0176
        L_0x012b:
            r0 = r12
            java.lang.String r6 = "sentence_completion_naive"
            boolean r6 = kotlin.jvm.internal.o.a(r4, r6)
            if (r6 == 0) goto L_0x01ef
            ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel$Companion r4 = ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel.f8725f
            D0.h0$d r6 = r7.e()
            java.lang.String r6 = r6.e()
            java.util.Map r2 = g(r9, r2)
            java.lang.String r8 = "checkpoint"
            java.lang.Object r2 = r2.get(r8)
            kotlin.jvm.internal.o.b(r2)
            java.lang.String r2 = (java.lang.String) r2
            D0.h0$d r7 = r7.e()
            java.lang.String r7 = r7.c()
            kotlin.jvm.internal.o.b(r7)
            r3.f8666a = r0
            r3.f8667b = r0
            r3.f8668c = r0
            r3.f8669d = r0
            r3.f8670e = r1
            r3.f8673h = r5
            r11 = 24
            r12 = 0
            r8 = 0
            r9 = 0
            r5 = r6
            r6 = r2
            r10 = r3
            java.lang.Object r2 = ch.icoaching.typewise.language_modelling.modelling.sentence_completion.SentenceCompletionNaiveModel.Companion.a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r2 != r13) goto L_0x0173
            return r13
        L_0x0173:
            D0.V r2 = (D0.V) r2
            r12 = r0
        L_0x0176:
            ch.icoaching.typewise.e r4 = ch.icoaching.typewise.e.f8233a
            java.lang.Class r5 = r2.getClass()
            A2.c r5 = kotlin.jvm.internal.r.b(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "getModelAndPP() :: Using model class '"
            r6.append(r7)
            r6.append(r5)
            r6.append(r14)
            java.lang.String r5 = r6.toString()
            r6 = 4
            r7 = 0
            java.lang.String r8 = "ModelsFilesHandling"
            r9 = 0
            r17 = r4
            r18 = r8
            r19 = r5
            r20 = r9
            r21 = r6
            r22 = r7
            ch.icoaching.typewise.e.b(r17, r18, r19, r20, r21, r22)
            if (r1 == 0) goto L_0x01cd
            r1 = 4
            r5 = 0
            java.lang.String r6 = "ModelsFilesHandling"
            java.lang.String r7 = "getModelAndPP() :: Loading the weights from disk."
            r8 = 0
            r17 = r4
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r1
            r22 = r5
            ch.icoaching.typewise.e.f(r17, r18, r19, r20, r21, r22)
            r3.f8666a = r2
            r3.f8667b = r12
            r3.f8673h = r15
            java.lang.Object r0 = r2.a(r0, r3)
            if (r0 != r13) goto L_0x01cd
            return r13
        L_0x01cd:
            r1 = r2
            r0 = r12
        L_0x01cf:
            ch.icoaching.typewise.e r2 = ch.icoaching.typewise.e.f8233a
            java.lang.String r3 = r1.d()
            r4 = 4
            r5 = 0
            java.lang.String r6 = "ModelsFilesHandling"
            r7 = 0
            r17 = r2
            r18 = r6
            r19 = r3
            r20 = r7
            r21 = r4
            r22 = r5
            ch.icoaching.typewise.e.b(r17, r18, r19, r20, r21, r22)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r1, r0)
            return r2
        L_0x01ef:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unrecognized model type '"
            r1.append(r2)
            r1.append(r4)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0209:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Please declare a model kind inside the model part of the config.json of the model (2022)."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt.d(java.lang.String, D0.h0, boolean, boolean, D0.Q, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: D0.Q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(java.lang.String r6, D0.h0 r7, boolean r8, boolean r9, java.lang.String r10, D0.Q r11, kotlin.coroutines.c r12) {
        /*
            boolean r8 = r12 instanceof ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt$getKindNeuralModel$1
            if (r8 == 0) goto L_0x0013
            r8 = r12
            ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt$getKindNeuralModel$1 r8 = (ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt$getKindNeuralModel$1) r8
            int r9 = r8.f8665g
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r9 & r0
            if (r1 == 0) goto L_0x0013
            int r9 = r9 - r0
            r8.f8665g = r9
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt$getKindNeuralModel$1 r8 = new ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt$getKindNeuralModel$1
            r8.<init>(r12)
        L_0x0018:
            java.lang.Object r9 = r8.f8664f
            java.lang.Object r12 = kotlin.coroutines.intrinsics.a.f()
            int r0 = r8.f8665g
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0077
            if (r0 == r3) goto L_0x005d
            if (r0 == r2) goto L_0x004d
            if (r0 != r1) goto L_0x0045
            java.lang.Object r6 = r8.f8663e
            D0.h0$c r6 = (D0.h0.c) r6
            java.lang.Object r7 = r8.f8662d
            D0.h0 r7 = (D0.h0) r7
            java.lang.Object r10 = r8.f8661c
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r11 = r8.f8660b
            D0.Q r11 = (D0.Q) r11
            java.lang.Object r8 = r8.f8659a
            java.lang.String r8 = (java.lang.String) r8
            kotlin.f.b(r9)
            goto L_0x00cd
        L_0x0045:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x004d:
            java.lang.Object r6 = r8.f8661c
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r7 = r8.f8660b
            D0.Q r7 = (D0.Q) r7
            java.lang.Object r10 = r8.f8659a
            java.lang.String r10 = (java.lang.String) r10
            kotlin.f.b(r9)
            goto L_0x00a9
        L_0x005d:
            java.lang.Object r6 = r8.f8663e
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r7 = r8.f8662d
            r11 = r7
            D0.Q r11 = (D0.Q) r11
            java.lang.Object r7 = r8.f8661c
            r10 = r7
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r7 = r8.f8660b
            D0.h0 r7 = (D0.h0) r7
            java.lang.Object r0 = r8.f8659a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.f.b(r9)
            goto L_0x0093
        L_0x0077:
            kotlin.f.b(r9)
            java.util.Map r9 = g(r6, r11)
            r8.f8659a = r6
            r8.f8660b = r7
            r8.f8661c = r10
            r8.f8662d = r11
            r8.f8663e = r9
            r8.f8665g = r3
            java.lang.Object r0 = ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingPlatformSpecificKt.b(r6, r11, r8)
            if (r0 != r12) goto L_0x0091
            return r12
        L_0x0091:
            r0 = r6
            r6 = r9
        L_0x0093:
            if (r7 != 0) goto L_0x00ad
            r8.f8659a = r10
            r8.f8660b = r11
            r8.f8661c = r6
            r8.f8662d = r4
            r8.f8663e = r4
            r8.f8665g = r2
            java.lang.Object r9 = c(r0, r11, r8)
            if (r9 != r12) goto L_0x00a8
            return r12
        L_0x00a8:
            r7 = r11
        L_0x00a9:
            D0.h0 r9 = (D0.h0) r9
            r11 = r7
            r7 = r9
        L_0x00ad:
            D0.h0$c r9 = r7.a()
            D0.h0$e r0 = r7.f()
            r8.f8659a = r10
            r8.f8660b = r11
            r8.f8661c = r6
            r8.f8662d = r7
            r8.f8663e = r9
            r8.f8665g = r1
            java.lang.Object r8 = ch.icoaching.typewise.language_modelling.preprocessing.b.a(r0, r11, r8)
            if (r8 != r12) goto L_0x00c8
            return r12
        L_0x00c8:
            r5 = r10
            r10 = r6
            r6 = r9
            r9 = r8
            r8 = r5
        L_0x00cd:
            ch.icoaching.typewise.language_modelling.preprocessing.a r9 = (ch.icoaching.typewise.language_modelling.preprocessing.a) r9
            boolean r12 = r9 instanceof ch.icoaching.typewise.language_modelling.preprocessing.c
            if (r12 == 0) goto L_0x00f6
            if (r8 != 0) goto L_0x00ec
            java.lang.String r6 = r6.i()
            if (r6 == 0) goto L_0x00e6
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r4 = r6.toLowerCase(r8)
            java.lang.String r6 = "toLowerCase(...)"
            kotlin.jvm.internal.o.d(r4, r6)
        L_0x00e6:
            if (r4 != 0) goto L_0x00eb
            java.lang.String r8 = "tf"
            goto L_0x00ec
        L_0x00eb:
            r8 = r4
        L_0x00ec:
            ch.icoaching.typewise.language_modelling.modelling.StatefulLanguageModel r6 = ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingPlatformSpecificKt.a(r8, r10, r7, r11)
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r6, r9)
            return r7
        L_0x00f6:
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r7 = "Please use a preprocessing with vocab for typewise neural lm (type == neural)."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt.e(java.lang.String, D0.h0, boolean, boolean, java.lang.String, D0.Q, kotlin.coroutines.c):java.lang.Object");
    }

    public static /* synthetic */ Object f(String str, h0 h0Var, boolean z3, boolean z4, String str2, Q q4, c cVar, int i4, Object obj) {
        h0 h0Var2;
        boolean z5;
        boolean z6;
        String str3;
        if ((i4 & 2) != 0) {
            h0Var2 = null;
        } else {
            h0Var2 = h0Var;
        }
        if ((i4 & 4) != 0) {
            z5 = true;
        } else {
            z5 = z3;
        }
        if ((i4 & 8) != 0) {
            z6 = false;
        } else {
            z6 = z4;
        }
        if ((i4 & 16) != 0) {
            str3 = null;
        } else {
            str3 = str2;
        }
        return e(str, h0Var2, z5, z6, str3, q4, cVar);
    }

    public static final Map g(String str, Q q4) {
        o.e(str, "name");
        o.e(q4, "platformDependencies");
        return d.b(str, q4.a());
    }

    public static final String h(h0 h0Var) {
        o.e(h0Var, "config");
        String k4 = h0Var.a().k();
        if (k4 == null) {
            k4 = h0Var.f().c();
            if (k4 != null) {
                e.l(e.f8233a, "ModelsFilesHandling", "Please move the declaration of the lang_code from preprocessing to inference.", (Throwable) null, 4, (Object) null);
            } else {
                throw new Exception("Please declare a lang_code in the inference of model config.json (2022).");
            }
        }
        return k4;
    }
}
