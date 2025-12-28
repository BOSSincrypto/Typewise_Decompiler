package ch.icoaching.typewise.autocorrection;

import B0.H;
import B0.v;
import android.content.Context;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.sync.b;
import org.tensorflow.lite.c;

public final class AutocorrectionTFModel implements v {

    /* renamed from: a  reason: collision with root package name */
    private final c f7859a;

    /* renamed from: b  reason: collision with root package name */
    private final b f7860b;

    public AutocorrectionTFModel(Context context, H h4) {
        o.e(context, "context");
        o.e(h4, "urls");
        try {
            this.f7859a = new c((ByteBuffer) h4.a(context));
            this.f7860b = kotlinx.coroutines.sync.c.b(false, 1, (Object) null);
        } catch (Exception e4) {
            throw new RuntimeException(e4.getLocalizedMessage());
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7 A[LOOP:4: B:31:0x00a5->B:32:0x00a7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.Double[][] r13, kotlin.coroutines.c r14) {
        /*
            r12 = this;
            r0 = 1
            boolean r1 = r14 instanceof ch.icoaching.typewise.autocorrection.AutocorrectionTFModel$prediction$1
            if (r1 == 0) goto L_0x0014
            r1 = r14
            ch.icoaching.typewise.autocorrection.AutocorrectionTFModel$prediction$1 r1 = (ch.icoaching.typewise.autocorrection.AutocorrectionTFModel$prediction$1) r1
            int r2 = r1.f7868h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0014
            int r2 = r2 - r3
            r1.f7868h = r2
            goto L_0x0019
        L_0x0014:
            ch.icoaching.typewise.autocorrection.AutocorrectionTFModel$prediction$1 r1 = new ch.icoaching.typewise.autocorrection.AutocorrectionTFModel$prediction$1
            r1.<init>(r12, r14)
        L_0x0019:
            java.lang.Object r14 = r1.f7866f
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.f()
            int r3 = r1.f7868h
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x0045
            if (r3 != r0) goto L_0x003d
            int r13 = r1.f7865e
            java.lang.Object r2 = r1.f7864d
            kotlinx.coroutines.sync.b r2 = (kotlinx.coroutines.sync.b) r2
            java.lang.Object r3 = r1.f7863c
            float[][] r3 = (float[][]) r3
            java.lang.Object r6 = r1.f7862b
            float[][] r6 = (float[][]) r6
            java.lang.Object r1 = r1.f7861a
            ch.icoaching.typewise.autocorrection.AutocorrectionTFModel r1 = (ch.icoaching.typewise.autocorrection.AutocorrectionTFModel) r1
            kotlin.f.b(r14)
            goto L_0x0095
        L_0x003d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0045:
            kotlin.f.b(r14)
            int r14 = r13.length
            float[][] r6 = new float[r14][]
            r3 = r5
        L_0x004c:
            if (r3 >= r14) goto L_0x0057
            r7 = r13[r5]
            int r7 = r7.length
            float[] r7 = new float[r7]
            r6[r3] = r7
            int r3 = r3 + r0
            goto L_0x004c
        L_0x0057:
            int r14 = r13.length
            r3 = r5
        L_0x0059:
            if (r3 >= r14) goto L_0x0072
            r7 = r13[r5]
            int r7 = r7.length
            r8 = r5
        L_0x005f:
            if (r8 >= r7) goto L_0x0070
            r9 = r6[r3]
            r10 = r13[r3]
            r10 = r10[r8]
            double r10 = r10.doubleValue()
            float r10 = (float) r10
            r9[r8] = r10
            int r8 = r8 + r0
            goto L_0x005f
        L_0x0070:
            int r3 = r3 + r0
            goto L_0x0059
        L_0x0072:
            int r13 = r13.length
            float[][] r3 = new float[r13][]
            r14 = r5
        L_0x0076:
            if (r14 >= r13) goto L_0x007e
            float[] r7 = new float[r0]
            r3[r14] = r7
            int r14 = r14 + r0
            goto L_0x0076
        L_0x007e:
            kotlinx.coroutines.sync.b r14 = r12.f7860b
            r1.f7861a = r12
            r1.f7862b = r6
            r1.f7863c = r3
            r1.f7864d = r14
            r1.f7865e = r13
            r1.f7868h = r0
            java.lang.Object r1 = r14.a(r4, r1)
            if (r1 != r2) goto L_0x0093
            return r2
        L_0x0093:
            r1 = r12
            r2 = r14
        L_0x0095:
            org.tensorflow.lite.c r14 = r1.f7859a     // Catch:{ all -> 0x00bb }
            r14.o(r6, r3)     // Catch:{ all -> 0x00bb }
            l2.q r14 = l2.q.f14567a     // Catch:{ all -> 0x00bb }
            r2.b(r4)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r1 = r5
        L_0x00a5:
            if (r1 >= r13) goto L_0x00b4
            r2 = r3[r1]
            r2 = r2[r5]
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.a.c(r2)
            r14.add(r2)
            int r1 = r1 + r0
            goto L_0x00a5
        L_0x00b4:
            java.lang.Float[] r13 = new java.lang.Float[r5]
            java.lang.Object[] r13 = r14.toArray(r13)
            return r13
        L_0x00bb:
            r13 = move-exception
            r2.b(r4)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.autocorrection.AutocorrectionTFModel.a(java.lang.Double[][], kotlin.coroutines.c):java.lang.Object");
    }
}
