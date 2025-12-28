package ch.icoaching.typewise.language_modelling.modelling;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;

public final class ModelRepository {

    /* renamed from: a  reason: collision with root package name */
    private boolean f8650a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f8651b;

    public ModelRepository(boolean z3) {
        this.f8650a = z3;
        this.f8651b = new LinkedHashMap();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r11, D0.h0 r12, D0.Q r13, kotlin.coroutines.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof ch.icoaching.typewise.language_modelling.modelling.ModelRepository$getModelAndPPByName$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            ch.icoaching.typewise.language_modelling.modelling.ModelRepository$getModelAndPPByName$1 r0 = (ch.icoaching.typewise.language_modelling.modelling.ModelRepository$getModelAndPPByName$1) r0
            int r1 = r0.f8658g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8658g = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling.modelling.ModelRepository$getModelAndPPByName$1 r0 = new ch.icoaching.typewise.language_modelling.modelling.ModelRepository$getModelAndPPByName$1
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f8656e
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r0.f8658g
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0051
            if (r1 == r2) goto L_0x003d
            if (r1 != r8) goto L_0x0035
            java.lang.Object r11 = r0.f8653b
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.f8652a
            ch.icoaching.typewise.language_modelling.modelling.ModelRepository r12 = (ch.icoaching.typewise.language_modelling.modelling.ModelRepository) r12
            kotlin.f.b(r14)
            goto L_0x00a5
        L_0x0035:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003d:
            java.lang.Object r11 = r0.f8655d
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.f8654c
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r13 = r0.f8653b
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r1 = r0.f8652a
            ch.icoaching.typewise.language_modelling.modelling.ModelRepository r1 = (ch.icoaching.typewise.language_modelling.modelling.ModelRepository) r1
            kotlin.f.b(r14)
            goto L_0x007b
        L_0x0051:
            kotlin.f.b(r14)
            java.util.Map r14 = r10.f8651b
            boolean r14 = r14.containsKey(r11)
            if (r14 != 0) goto L_0x0081
            java.util.Map r14 = r10.f8651b
            boolean r4 = r10.f8650a
            r0.f8652a = r10
            r0.f8653b = r11
            r0.f8654c = r14
            r0.f8655d = r11
            r0.f8658g = r2
            r3 = 1
            r1 = r11
            r2 = r12
            r5 = r13
            r6 = r0
            java.lang.Object r12 = ch.icoaching.typewise.language_modelling.modelling.ModelsFilesHandlingKt.d(r1, r2, r3, r4, r5, r6)
            if (r12 != r7) goto L_0x0076
            return r7
        L_0x0076:
            r1 = r10
            r13 = r11
            r9 = r14
            r14 = r12
            r12 = r9
        L_0x007b:
            r12.put(r11, r14)
            r11 = r13
            r12 = r1
            goto L_0x0082
        L_0x0081:
            r12 = r10
        L_0x0082:
            java.util.Map r13 = r12.f8651b
            java.lang.Object r13 = r13.get(r11)
            kotlin.jvm.internal.o.b(r13)
            kotlin.Pair r13 = (kotlin.Pair) r13
            java.lang.Object r13 = r13.getFirst()
            D0.V r13 = (D0.V) r13
            r0.f8652a = r12
            r0.f8653b = r11
            r14 = 0
            r0.f8654c = r14
            r0.f8655d = r14
            r0.f8658g = r8
            java.lang.Object r13 = r13.a(r14, r0)
            if (r13 != r7) goto L_0x00a5
            return r7
        L_0x00a5:
            java.util.Map r12 = r12.f8651b
            java.lang.Object r11 = r12.get(r11)
            kotlin.jvm.internal.o.b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.ModelRepository.a(java.lang.String, D0.h0, D0.Q, kotlin.coroutines.c):java.lang.Object");
    }

    public final void b(boolean z3) {
        this.f8650a = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModelRepository(boolean z3, int i4, i iVar) {
        this((i4 & 1) != 0 ? false : z3);
    }
}
