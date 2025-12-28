package ch.icoaching.typewise.language_modelling.inference;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class InferenceRepository {

    /* renamed from: a  reason: collision with root package name */
    private final Map f8394a;

    public InferenceRepository(Map map) {
        o.e(map, "inferenceInstances");
        this.f8394a = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r16, java.lang.String r17, ch.icoaching.typewise.word_lists.c r18, D0.Q r19, java.lang.Integer r20, java.lang.Integer r21, java.lang.Float r22, kotlin.coroutines.c r23) {
        /*
            r15 = this;
            r0 = r15
            r1 = r17
            r2 = r23
            boolean r3 = r2 instanceof ch.icoaching.typewise.language_modelling.inference.InferenceRepository$getInferenceByModelNameAndInferenceTechnique$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            ch.icoaching.typewise.language_modelling.inference.InferenceRepository$getInferenceByModelNameAndInferenceTechnique$1 r3 = (ch.icoaching.typewise.language_modelling.inference.InferenceRepository$getInferenceByModelNameAndInferenceTechnique$1) r3
            int r4 = r3.f8406g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f8406g = r4
        L_0x0017:
            r12 = r3
            goto L_0x001f
        L_0x0019:
            ch.icoaching.typewise.language_modelling.inference.InferenceRepository$getInferenceByModelNameAndInferenceTechnique$1 r3 = new ch.icoaching.typewise.language_modelling.inference.InferenceRepository$getInferenceByModelNameAndInferenceTechnique$1
            r3.<init>(r15, r2)
            goto L_0x0017
        L_0x001f:
            java.lang.Object r2 = r12.f8404e
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.f()
            int r4 = r12.f8406g
            r5 = 1
            if (r4 == 0) goto L_0x0048
            if (r4 != r5) goto L_0x0040
            java.lang.Object r1 = r12.f8403d
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r3 = r12.f8402c
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r4 = r12.f8401b
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r12.f8400a
            ch.icoaching.typewise.language_modelling.inference.InferenceRepository r5 = (ch.icoaching.typewise.language_modelling.inference.InferenceRepository) r5
            kotlin.f.b(r2)
            goto L_0x008e
        L_0x0040:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0048:
            kotlin.f.b(r2)
            kotlin.Pair r2 = l2.g.a(r16, r17)
            java.util.Map r4 = r0.f8394a
            boolean r4 = r4.containsKey(r2)
            if (r4 != 0) goto L_0x0093
            if (r1 != 0) goto L_0x005c
            r1 = 0
            r6 = r1
            goto L_0x0067
        L_0x005c:
            ch.icoaching.typewise.language_modelling.inference.c r4 = new ch.icoaching.typewise.language_modelling.inference.c
            ch.icoaching.typewise.language_modelling.inference.c$a r6 = new ch.icoaching.typewise.language_modelling.inference.c$a
            r6.<init>(r1)
            r4.<init>(r6)
            r6 = r4
        L_0x0067:
            java.util.Map r1 = r0.f8394a
            r12.f8400a = r0
            r12.f8401b = r2
            r12.f8402c = r1
            r12.f8403d = r2
            r12.f8406g = r5
            r13 = 2
            r14 = 0
            r5 = 0
            r4 = r16
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            java.lang.Object r4 = ch.icoaching.typewise.language_modelling.inference.InferenceInstantiatorKt.c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r4 != r3) goto L_0x0089
            return r3
        L_0x0089:
            r5 = r0
            r3 = r1
            r1 = r2
            r2 = r4
            r4 = r1
        L_0x008e:
            r3.put(r1, r2)
            r2 = r4
            goto L_0x0094
        L_0x0093:
            r5 = r0
        L_0x0094:
            java.util.Map r1 = r5.f8394a
            java.lang.Object r1 = r1.get(r2)
            kotlin.jvm.internal.o.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.InferenceRepository.a(java.lang.String, java.lang.String, ch.icoaching.typewise.word_lists.c, D0.Q, java.lang.Integer, java.lang.Integer, java.lang.Float, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(kotlin.coroutines.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ch.icoaching.typewise.language_modelling.inference.InferenceRepository$destroyInferences$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ch.icoaching.typewise.language_modelling.inference.InferenceRepository$destroyInferences$1 r0 = (ch.icoaching.typewise.language_modelling.inference.InferenceRepository$destroyInferences$1) r0
            int r1 = r0.f8399e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8399e = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling.inference.InferenceRepository$destroyInferences$1 r0 = new ch.icoaching.typewise.language_modelling.inference.InferenceRepository$destroyInferences$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f8397c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8399e
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r2 = r0.f8396b
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f8395a
            ch.icoaching.typewise.language_modelling.inference.InferenceRepository r4 = (ch.icoaching.typewise.language_modelling.inference.InferenceRepository) r4
            kotlin.f.b(r6)
            goto L_0x0047
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            kotlin.f.b(r6)
            java.util.Map r6 = r5.f8394a
            java.util.Collection r6 = r6.values()
            java.util.Iterator r2 = r6.iterator()
            r4 = r5
        L_0x0047:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0060
            java.lang.Object r6 = r2.next()
            ch.icoaching.typewise.language_modelling.inference.Inference r6 = (ch.icoaching.typewise.language_modelling.inference.Inference) r6
            r0.f8395a = r4
            r0.f8396b = r2
            r0.f8399e = r3
            java.lang.Object r6 = r6.h(r0)
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0060:
            java.util.Map r6 = r4.f8394a
            r6.clear()
            l2.q r6 = l2.q.f14567a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.inference.InferenceRepository.b(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InferenceRepository(Map map, int i4, i iVar) {
        this((i4 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
