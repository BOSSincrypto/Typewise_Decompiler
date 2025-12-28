package ch.icoaching.typewise.language_modelling.inference;

import D0.C0265a;
import D0.Q;
import D0.h0;
import ch.icoaching.typewise.e;
import ch.icoaching.typewise.language_modelling.inference.Inference;
import ch.icoaching.typewise.language_modelling.inference.inference_impl.NeuralCharGreedyDecodingInference;
import ch.icoaching.typewise.language_modelling.inference.inference_impl.beam_search_inferences_impl.CharacterLevelBeamSearchInference;
import ch.icoaching.typewise.word_lists.c;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;

public abstract class InferenceInstantiatorKt {
    public static final Inference.InferenceCompanion a(h0 h0Var) {
        Inference.InferenceCompanion inferenceCompanion;
        int i4;
        Object obj;
        String str;
        String str2;
        o.e(h0Var, "config");
        String j4 = h0Var.a().j();
        e eVar = e.f8233a;
        e.b(eVar, "InferenceInstantiator", "getInferenceProcessorClass() :: Using inference technique: " + j4, (Throwable) null, 4, (Object) null);
        String d4 = h0Var.f().d();
        if (kotlin.text.o.L(j4, "beam-search", false, 2, (Object) null)) {
            if (!C0718m.m("character", "sub-word").contains(d4)) {
                throw new IllegalArgumentException("Beam search for word level makes no sense at this point");
            } else if (!kotlin.text.o.L(j4, "noisy_prefix", false, 2, (Object) null)) {
                inferenceCompanion = CharacterLevelBeamSearchInference.f8559t;
                if (!kotlin.text.o.L(j4, "sentence", false, 2, (Object) null)) {
                    return inferenceCompanion;
                }
                i4 = 4;
                obj = null;
                str = "InferenceInstantiator";
                str2 = "getInferenceProcessorClass() :: Declaring sentence-beam-search is deprecated, please just declare beam-search";
            } else if (!o.a(d4, "character")) {
                throw new IllegalArgumentException("Noisy prefix search for now only possible at char level");
            } else {
                throw new IllegalStateException("Noisy prefix not implemented yet! Please use another inference technique.");
            }
        } else if (kotlin.text.o.L(j4, "greedy", false, 2, (Object) null)) {
            inferenceCompanion = NeuralCharGreedyDecodingInference.f8525A;
            if (!kotlin.text.o.L(j4, "sentence", false, 2, (Object) null)) {
                return inferenceCompanion;
            }
            i4 = 4;
            obj = null;
            str = "InferenceInstantiator";
            str2 = "getInferenceProcessorClass() :: Declaring sentence-greedy is deprecated, please just declare greedy";
        } else if (kotlin.text.o.G(j4, "sentence", false, 2, (Object) null)) {
            return C0265a.f256q;
        } else {
            throw new IllegalArgumentException("Unknown inference technique " + j4);
        }
        e.l(eVar, str, str2, (Throwable) null, i4, obj);
        return inferenceCompanion;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0192 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0193 A[PHI: r2 
      PHI: (r2v2 java.lang.Object) = (r2v6 java.lang.Object), (r2v1 java.lang.Object) binds: [B:38:0x0190, B:10:0x002e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(java.lang.String r28, D0.h0 r29, ch.icoaching.typewise.language_modelling.inference.c r30, ch.icoaching.typewise.word_lists.c r31, D0.Q r32, java.lang.Integer r33, java.lang.Integer r34, java.lang.Float r35, kotlin.coroutines.c r36) {
        /*
            r0 = r28
            r1 = r32
            r2 = r36
            boolean r3 = r2 instanceof ch.icoaching.typewise.language_modelling.inference.InferenceInstantiatorKt$getInferenceProcessorInstance$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            ch.icoaching.typewise.language_modelling.inference.InferenceInstantiatorKt$getInferenceProcessorInstance$1 r3 = (ch.icoaching.typewise.language_modelling.inference.InferenceInstantiatorKt$getInferenceProcessorInstance$1) r3
            int r4 = r3.f8393i
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f8393i = r4
            goto L_0x001e
        L_0x0019:
            ch.icoaching.typewise.language_modelling.inference.InferenceInstantiatorKt$getInferenceProcessorInstance$1 r3 = new ch.icoaching.typewise.language_modelling.inference.InferenceInstantiatorKt$getInferenceProcessorInstance$1
            r3.<init>(r2)
        L_0x001e:
            java.lang.Object r2 = r3.f8392h
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.f()
            int r5 = r3.f8393i
            r6 = 1
            r7 = 2
            if (r5 == 0) goto L_0x0062
            if (r5 == r6) goto L_0x003b
            if (r5 != r7) goto L_0x0033
            kotlin.f.b(r2)
            goto L_0x0193
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            java.lang.Object r0 = r3.f8391g
            java.lang.Float r0 = (java.lang.Float) r0
            java.lang.Object r1 = r3.f8390f
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r5 = r3.f8389e
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r6 = r3.f8388d
            D0.Q r6 = (D0.Q) r6
            java.lang.Object r8 = r3.f8387c
            ch.icoaching.typewise.word_lists.c r8 = (ch.icoaching.typewise.word_lists.c) r8
            java.lang.Object r9 = r3.f8386b
            ch.icoaching.typewise.language_modelling.inference.c r9 = (ch.icoaching.typewise.language_modelling.inference.c) r9
            java.lang.Object r10 = r3.f8385a
            java.lang.String r10 = (java.lang.String) r10
            kotlin.f.b(r2)
            r26 = r2
            r2 = r0
            r0 = r1
            r1 = r6
            r6 = r26
            goto L_0x0094
        L_0x0062:
            kotlin.f.b(r2)
            if (r29 != 0) goto L_0x0097
            r3.f8385a = r0
            r2 = r30
            r3.f8386b = r2
            r5 = r31
            r3.f8387c = r5
            r3.f8388d = r1
            r8 = r33
            r3.f8389e = r8
            r9 = r34
            r3.f8390f = r9
            r10 = r35
            r3.f8391g = r10
            r3.f8393i = r6
            java.lang.Object r6 = ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt.c(r0, r1, r3)
            if (r6 != r4) goto L_0x0088
            return r4
        L_0x0088:
            r26 = r10
            r10 = r0
            r0 = r9
            r9 = r2
            r2 = r26
            r27 = r8
            r8 = r5
            r5 = r27
        L_0x0094:
            D0.h0 r6 = (D0.h0) r6
            goto L_0x00af
        L_0x0097:
            r2 = r30
            r5 = r31
            r8 = r33
            r9 = r34
            r10 = r35
            r6 = r29
            r26 = r10
            r10 = r0
            r0 = r9
            r9 = r2
            r2 = r26
            r27 = r8
            r8 = r5
            r5 = r27
        L_0x00af:
            if (r9 == 0) goto L_0x00f4
            ch.icoaching.typewise.language_modelling.inference.c$a r11 = r9.a()
            java.lang.String r11 = r11.a()
            if (r11 == 0) goto L_0x00f4
            D0.h0$c r12 = r6.a()
            ch.icoaching.typewise.language_modelling.inference.c$a r9 = r9.a()
            java.lang.String r14 = r9.a()
            r24 = 2045(0x7fd, float:2.866E-42)
            r25 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            D0.h0$c r9 = D0.h0.c.a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r11 = 5
            r12 = 0
            r14 = 0
            r28 = r6
            r29 = r13
            r30 = r9
            r31 = r14
            r32 = r11
            r33 = r12
            D0.h0 r6 = D0.h0.c(r28, r29, r30, r31, r32, r33)
        L_0x00f4:
            D0.h0$c r9 = r6.a()
            java.lang.String r9 = r9.j()
            if (r5 == 0) goto L_0x0108
            java.lang.String r5 = r5.toString()
            java.lang.String r11 = "multiword"
            java.lang.String r9 = d(r9, r11, r5)
        L_0x0108:
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "filtshorter"
            java.lang.String r9 = d(r9, r5, r0)
        L_0x0114:
            r0 = 0
            if (r2 == 0) goto L_0x013b
            java.lang.String r2 = r2.toString()
            r5 = 46
            r11 = 0
            boolean r5 = kotlin.text.o.K(r2, r5, r11, r7, r0)
            if (r5 != 0) goto L_0x0135
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = ".0"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
        L_0x0135:
            java.lang.String r5 = "filtprob"
            java.lang.String r9 = d(r9, r5, r2)
        L_0x013b:
            r13 = r9
            D0.h0$c r11 = r6.a()
            r23 = 2045(0x7fd, float:2.866E-42)
            r24 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            D0.h0$c r2 = D0.h0.c.a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r5 = 5
            r9 = 0
            r11 = 0
            r28 = r6
            r29 = r11
            r30 = r2
            r31 = r12
            r32 = r5
            r33 = r9
            D0.h0 r2 = D0.h0.c(r28, r29, r30, r31, r32, r33)
            ch.icoaching.typewise.language_modelling.inference.Inference$InferenceCompanion r5 = a(r2)
            r3.f8385a = r0
            r3.f8386b = r0
            r3.f8387c = r0
            r3.f8388d = r0
            r3.f8389e = r0
            r3.f8390f = r0
            r3.f8391g = r0
            r3.f8393i = r7
            r28 = r5
            r29 = r10
            r30 = r2
            r31 = r8
            r32 = r1
            r33 = r3
            java.lang.Object r2 = r28.c(r29, r30, r31, r32, r33)
            if (r2 != r4) goto L_0x0193
            return r4
        L_0x0193:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.InferenceInstantiatorKt.b(java.lang.String, D0.h0, ch.icoaching.typewise.language_modelling.inference.c, ch.icoaching.typewise.word_lists.c, D0.Q, java.lang.Integer, java.lang.Integer, java.lang.Float, kotlin.coroutines.c):java.lang.Object");
    }

    public static /* synthetic */ Object c(String str, h0 h0Var, c cVar, c cVar2, Q q4, Integer num, Integer num2, Float f4, kotlin.coroutines.c cVar3, int i4, Object obj) {
        h0 h0Var2;
        c cVar4;
        if ((i4 & 2) != 0) {
            h0Var2 = null;
        } else {
            h0Var2 = h0Var;
        }
        if ((i4 & 4) != 0) {
            cVar4 = null;
        } else {
            cVar4 = cVar;
        }
        return b(str, h0Var2, cVar4, cVar2, q4, num, num2, f4, cVar3);
    }

    private static final String d(String str, String str2, String str3) {
        String sb;
        StringBuilder sb2;
        String str4;
        int V3 = kotlin.text.o.V(str, str2, 0, false, 6, (Object) null);
        if (V3 > -1) {
            int U3 = kotlin.text.o.U(str, '-', V3, false, 4, (Object) null);
            if (V3 > -1) {
                sb2 = new StringBuilder(str.length() + 2);
                String substring = str.substring(0, V3);
                o.d(substring, "substring(...)");
                sb2.append(substring);
                sb2.append(str2 + str3);
                str4 = str.substring(U3);
                o.d(str4, "substring(...)");
            } else {
                sb2 = new StringBuilder(str.length() + 2);
                String substring2 = str.substring(0, V3);
                o.d(substring2, "substring(...)");
                sb2.append(substring2);
                str4 = str2 + str3;
            }
            sb2.append(str4);
            sb = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder(str.length() + str2.length() + 3);
            sb3.append(str);
            sb3.append("-" + str2 + str3);
            sb = sb3.toString();
        }
        o.b(sb);
        return sb;
    }
}
