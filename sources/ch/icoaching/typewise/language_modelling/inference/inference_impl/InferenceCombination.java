package ch.icoaching.typewise.language_modelling.inference.inference_impl;

import D0.Q;
import ch.icoaching.typewise.language_modelling.inference.Inference;
import ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt;
import ch.icoaching.typewise.word_lists.c;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import l2.q;
import s0.C0893c;
import u2.l;

public final class InferenceCombination extends Inference {

    /* renamed from: p  reason: collision with root package name */
    public static final Companion f8492p = new Companion((i) null);

    /* renamed from: m  reason: collision with root package name */
    private final List f8493m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f8494n;

    /* renamed from: o  reason: collision with root package name */
    private final c f8495o;

    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0169  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x016e  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(D0.h0 r26, ch.icoaching.typewise.word_lists.c r27, D0.Q r28, java.lang.Integer r29, java.lang.Integer r30, java.lang.Float r31, kotlin.coroutines.c r32) {
            /*
                r25 = this;
                r0 = r32
                boolean r1 = r0 instanceof ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination$Companion$getInstance$2
                if (r1 == 0) goto L_0x0017
                r1 = r0
                ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination$Companion$getInstance$2 r1 = (ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination$Companion$getInstance$2) r1
                int r2 = r1.f8507l
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L_0x0017
                int r2 = r2 - r3
                r1.f8507l = r2
                r2 = r25
                goto L_0x001e
            L_0x0017:
                ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination$Companion$getInstance$2 r1 = new ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination$Companion$getInstance$2
                r2 = r25
                r1.<init>(r2, r0)
            L_0x001e:
                java.lang.Object r0 = r1.f8505j
                java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
                int r4 = r1.f8507l
                r5 = 1
                if (r4 == 0) goto L_0x0066
                if (r4 != r5) goto L_0x005e
                java.lang.Object r4 = r1.f8504i
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r6 = r1.f8503h
                java.util.List r6 = (java.util.List) r6
                java.lang.Object r7 = r1.f8502g
                D0.h0$c r7 = (D0.h0.c) r7
                java.lang.Object r8 = r1.f8501f
                java.lang.Float r8 = (java.lang.Float) r8
                java.lang.Object r9 = r1.f8500e
                java.lang.Integer r9 = (java.lang.Integer) r9
                java.lang.Object r10 = r1.f8499d
                java.lang.Integer r10 = (java.lang.Integer) r10
                java.lang.Object r11 = r1.f8498c
                D0.Q r11 = (D0.Q) r11
                java.lang.Object r12 = r1.f8497b
                ch.icoaching.typewise.word_lists.c r12 = (ch.icoaching.typewise.word_lists.c) r12
                java.lang.Object r13 = r1.f8496a
                D0.h0 r13 = (D0.h0) r13
                kotlin.f.b(r0)
                r22 = r9
                r14 = r10
                r15 = r11
                r11 = r1
                r10 = r4
                r4 = r6
                r9 = r7
                r1 = r12
                r12 = r8
                goto L_0x0147
            L_0x005e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0066:
                kotlin.f.b(r0)
                D0.h0$c r0 = r26.a()
                ch.icoaching.typewise.e r6 = ch.icoaching.typewise.e.f8233a
                java.lang.String r4 = r0.j()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "Loading combination model with inference technique: "
                r7.append(r8)
                r7.append(r4)
                java.lang.String r8 = r7.toString()
                r10 = 4
                r11 = 0
                java.lang.String r7 = "InferenceCombination"
                r9 = 0
                ch.icoaching.typewise.e.b(r6, r7, r8, r9, r10, r11)
                java.lang.String r12 = r0.j()
                java.lang.String r4 = "--"
                java.lang.String[] r13 = new java.lang.String[]{r4}
                r16 = 6
                r17 = 0
                r14 = 0
                r15 = 0
                java.util.List r4 = kotlin.text.o.t0(r12, r13, r14, r15, r16, r17)
                r6 = 2
                r7 = 0
                java.util.List r4 = E0.m.h(r4, r5, r7, r6, r7)
                D0.h0$d r6 = r26.e()
                java.util.List r6 = r6.f()
                kotlin.jvm.internal.o.b(r6)
                int r7 = r4.size()
                int r8 = r6.size()
                if (r7 != r8) goto L_0x017f
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.List r4 = kotlin.collections.C0718m.J0(r6, r4)
                java.util.Iterator r4 = r4.iterator()
                r15 = r28
                r14 = r29
                r13 = r30
                r12 = r31
                r9 = r0
                r11 = r1
                r10 = r4
                r4 = r7
                r0 = r26
                r1 = r27
            L_0x00d8:
                boolean r6 = r10.hasNext()
                if (r6 == 0) goto L_0x0150
                java.lang.Object r6 = r10.next()
                kotlin.Pair r6 = (kotlin.Pair) r6
                java.lang.Object r7 = r6.component1()
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r6 = r6.component2()
                java.lang.String r6 = (java.lang.String) r6
                ch.icoaching.typewise.language_modelling.inference.c r8 = new ch.icoaching.typewise.language_modelling.inference.c
                ch.icoaching.typewise.language_modelling.inference.c$a r5 = new ch.icoaching.typewise.language_modelling.inference.c$a
                r5.<init>(r6)
                r8.<init>(r5)
                r11.f8496a = r0
                r11.f8497b = r1
                r11.f8498c = r15
                r11.f8499d = r14
                r11.f8500e = r13
                r11.f8501f = r12
                r11.f8502g = r9
                r11.f8503h = r4
                r11.f8504i = r10
                r5 = 1
                r11.f8507l = r5
                r16 = 2
                r17 = 0
                r18 = 0
                r6 = r7
                r7 = r18
                r18 = r9
                r9 = r1
                r19 = r10
                r10 = r15
                r20 = r11
                r11 = r14
                r21 = r12
                r12 = r13
                r22 = r13
                r13 = r21
                r23 = r14
                r14 = r20
                r24 = r15
                r15 = r16
                r16 = r17
                java.lang.Object r6 = ch.icoaching.typewise.language_modelling.inference.InferenceInstantiatorKt.c(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                if (r6 != r3) goto L_0x0139
                return r3
            L_0x0139:
                r13 = r0
                r0 = r6
                r9 = r18
                r10 = r19
                r11 = r20
                r12 = r21
                r14 = r23
                r15 = r24
            L_0x0147:
                ch.icoaching.typewise.language_modelling.inference.Inference r0 = (ch.icoaching.typewise.language_modelling.inference.Inference) r0
                r4.add(r0)
                r0 = r13
                r13 = r22
                goto L_0x00d8
            L_0x0150:
                r18 = r9
                java.lang.Boolean r3 = r18.g()
                kotlin.jvm.internal.o.b(r3)
                boolean r3 = r3.booleanValue()
                ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination r5 = new ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination
                java.lang.String r0 = ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt.h(r0)
                java.lang.Boolean r6 = r18.m()
                if (r6 == 0) goto L_0x016e
                boolean r6 = r6.booleanValue()
                goto L_0x016f
            L_0x016e:
                r6 = 0
            L_0x016f:
                r26 = r5
                r27 = r0
                r28 = r4
                r29 = r3
                r30 = r6
                r31 = r1
                r26.<init>(r27, r28, r29, r30, r31)
                return r5
            L_0x017f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Please declare for each model its own inference technique, split by two hyphens --"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination.Companion.a(D0.h0, ch.icoaching.typewise.word_lists.c, D0.Q, java.lang.Integer, java.lang.Integer, java.lang.Float, kotlin.coroutines.c):java.lang.Object");
        }

        public final Object c(C0893c.b.a aVar, String str, c cVar, Q q4, Integer num, Integer num2, Float f4, kotlin.coroutines.c cVar2) {
            boolean z3;
            List B02 = C0718m.B0(aVar.b().keySet());
            String str2 = "combination--" + C0718m.Z(aVar.b().values(), "--", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
            Boolean c4 = aVar.c();
            if (c4 != null) {
                z3 = c4.booleanValue();
            } else {
                z3 = false;
            }
            String str3 = str;
            return a(ModelsFilesHandlingKt.b(str, B02, str2, z3), cVar, q4, num, num2, f4, cVar2);
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InferenceCombination(java.lang.String r17, java.util.List r18, boolean r19, boolean r20, ch.icoaching.typewise.word_lists.c r21) {
        /*
            r16 = this;
            r13 = r16
            r14 = r18
            r15 = r21
            java.lang.String r0 = "languageCode"
            r1 = r17
            kotlin.jvm.internal.o.e(r1, r0)
            java.lang.String r0 = "inferences"
            kotlin.jvm.internal.o.e(r14, r0)
            java.lang.String r0 = "wordListRepository"
            kotlin.jvm.internal.o.e(r15, r0)
            r11 = 384(0x180, float:5.38E-43)
            r12 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r0 = r16
            r2 = r19
            r10 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.f8493m = r14
            r0 = r20
            r13.f8494n = r0
            r13.f8495o = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination.<init>(java.lang.String, java.util.List, boolean, boolean, ch.icoaching.typewise.word_lists.c):void");
    }

    public Object b(String str, String str2, Float f4, Integer num, String str3, kotlin.coroutines.c cVar) {
        return this.f8494n ? m(str, f4, str3, cVar) : l(str, f4, str3, cVar);
    }

    public Object h(kotlin.coroutines.c cVar) {
        return q.f14567a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.String r23, java.lang.Float r24, java.lang.String r25, kotlin.coroutines.c r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r26
            boolean r2 = r1 instanceof ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination$predictCompletionsImplFirstRes$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination$predictCompletionsImplFirstRes$1 r2 = (ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination$predictCompletionsImplFirstRes$1) r2
            int r3 = r2.f8515h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f8515h = r3
            goto L_0x001c
        L_0x0017:
            ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination$predictCompletionsImplFirstRes$1 r2 = new ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination$predictCompletionsImplFirstRes$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f8513f
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r2.f8515h
            r5 = 1
            if (r4 == 0) goto L_0x004a
            if (r4 != r5) goto L_0x0042
            int r4 = r2.f8512e
            java.lang.Object r6 = r2.f8511d
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r2.f8510c
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r2.f8509b
            java.lang.Float r8 = (java.lang.Float) r8
            java.lang.Object r9 = r2.f8508a
            java.lang.String r9 = (java.lang.String) r9
            kotlin.f.b(r1)
            r15 = r2
            r13 = r6
            r2 = r8
            goto L_0x0095
        L_0x0042:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004a:
            kotlin.f.b(r1)
            java.util.List r1 = r0.f8493m
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
            r13 = r1
            r15 = r2
            r14 = r4
            r1 = r23
            r2 = r24
            r4 = r25
        L_0x005d:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x00b7
            java.lang.Object r6 = r13.next()
            ch.icoaching.typewise.language_modelling.inference.Inference r6 = (ch.icoaching.typewise.language_modelling.inference.Inference) r6
            r15.f8508a = r1
            r15.f8509b = r2
            r15.f8510c = r4
            r15.f8511d = r13
            r15.f8512e = r14
            r15.f8515h = r5
            r16 = 10
            r17 = 0
            r8 = 0
            r10 = 0
            r7 = r1
            r9 = r2
            r11 = r4
            r12 = r15
            r18 = r13
            r13 = r16
            r16 = r14
            r14 = r17
            java.lang.Object r6 = ch.icoaching.typewise.language_modelling.inference.a.a(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r6 != r3) goto L_0x008e
            return r3
        L_0x008e:
            r9 = r1
            r7 = r4
            r1 = r6
            r4 = r16
            r13 = r18
        L_0x0095:
            r16 = r1
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r16 = (ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult) r16
            int r1 = r16.p()
            int r18 = r4 + r1
            int r1 = r16.r()
            if (r1 == 0) goto L_0x00b2
            r20 = 5
            r21 = 0
            r17 = 0
            r19 = 0
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r1 = ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult.c(r16, r17, r18, r19, r20, r21)
            return r1
        L_0x00b2:
            r4 = r7
            r1 = r9
            r14 = r18
            goto L_0x005d
        L_0x00b7:
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r1 = new ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult
            java.util.List r3 = kotlin.collections.C0718m.j()
            r6 = 4
            r7 = 0
            r4 = 0
            r5 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination.l(java.lang.String, java.lang.Float, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(java.lang.String r22, java.lang.Float r23, java.lang.String r24, kotlin.coroutines.c r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r25
            boolean r2 = r1 instanceof ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination$predictCompletionsImplLongestRes$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination$predictCompletionsImplLongestRes$1 r2 = (ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination$predictCompletionsImplLongestRes$1) r2
            int r3 = r2.f8524i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f8524i = r3
            goto L_0x001c
        L_0x0017:
            ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination$predictCompletionsImplLongestRes$1 r2 = new ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination$predictCompletionsImplLongestRes$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f8522g
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r2.f8524i
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0051
            if (r4 != r5) goto L_0x0049
            int r4 = r2.f8521f
            java.lang.Object r7 = r2.f8520e
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r2.f8519d
            ch.icoaching.typewise.language_modelling_result_classes.a r8 = (ch.icoaching.typewise.language_modelling_result_classes.a) r8
            java.lang.Object r9 = r2.f8518c
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.f8517b
            java.lang.Float r10 = (java.lang.Float) r10
            java.lang.Object r11 = r2.f8516a
            java.lang.String r11 = (java.lang.String) r11
            kotlin.f.b(r1)
            r15 = r2
            r13 = r7
            r12 = r8
            r2 = r10
            goto L_0x00a7
        L_0x0049:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0051:
            kotlin.f.b(r1)
            java.util.List r1 = r0.f8493m
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
            r13 = r1
            r15 = r2
            r12 = r4
            r14 = r6
            r1 = r22
            r2 = r23
            r4 = r24
        L_0x0065:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x00d4
            java.lang.Object r7 = r13.next()
            ch.icoaching.typewise.language_modelling.inference.Inference r7 = (ch.icoaching.typewise.language_modelling.inference.Inference) r7
            r15.f8516a = r1
            r15.f8517b = r2
            r15.f8518c = r4
            r15.f8519d = r12
            r15.f8520e = r13
            r15.f8521f = r14
            r15.f8524i = r5
            r16 = 10
            r17 = 0
            r9 = 0
            r11 = 0
            r8 = r1
            r10 = r2
            r18 = r12
            r12 = r4
            r19 = r13
            r13 = r15
            r20 = r14
            r14 = r16
            r16 = r15
            r15 = r17
            java.lang.Object r7 = ch.icoaching.typewise.language_modelling.inference.a.a(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r7 != r3) goto L_0x009c
            return r3
        L_0x009c:
            r11 = r1
            r9 = r4
            r1 = r7
            r15 = r16
            r12 = r18
            r13 = r19
            r4 = r20
        L_0x00a7:
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r1 = (ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult) r1
            int r7 = r1.p()
            int r14 = r4 + r7
            int r4 = r1.r()
            if (r4 == 0) goto L_0x00d1
            if (r12 == 0) goto L_0x00cd
            java.lang.String r4 = r12.i()
            int r4 = r4.length()
            ch.icoaching.typewise.language_modelling_result_classes.a r7 = r1.o(r6)
            java.lang.String r7 = r7.i()
            int r7 = r7.length()
            if (r4 >= r7) goto L_0x00d1
        L_0x00cd:
            ch.icoaching.typewise.language_modelling_result_classes.a r12 = r1.o(r6)
        L_0x00d1:
            r4 = r9
            r1 = r11
            goto L_0x0065
        L_0x00d4:
            r18 = r12
            r20 = r14
            ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult r1 = new ch.icoaching.typewise.language_modelling_result_classes.LMInferenceResult
            if (r18 != 0) goto L_0x00ea
            java.util.List r8 = kotlin.collections.C0718m.j()
            r11 = 4
            r12 = 0
            r10 = 0
            r7 = r1
            r9 = r20
            r7.<init>(r8, r9, r10, r11, r12)
            return r1
        L_0x00ea:
            java.util.List r8 = kotlin.collections.C0718m.e(r18)
            r11 = 4
            r12 = 0
            r10 = 0
            r7 = r1
            r9 = r20
            r7.<init>(r8, r9, r10, r11, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.inference_impl.InferenceCombination.m(java.lang.String, java.lang.Float, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
