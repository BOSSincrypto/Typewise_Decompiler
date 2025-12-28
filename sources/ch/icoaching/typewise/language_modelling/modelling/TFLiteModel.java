package ch.icoaching.typewise.language_modelling.modelling;

import D0.C0266b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C0718m;
import kotlinx.coroutines.sync.b;
import kotlinx.coroutines.sync.c;

public final class TFLiteModel extends OnDeviceLM {

    /* renamed from: g  reason: collision with root package name */
    private final String f8695g;

    /* renamed from: h  reason: collision with root package name */
    private final C0266b f8696h;

    /* renamed from: i  reason: collision with root package name */
    private final Map f8697i = new LinkedHashMap();

    /* renamed from: j  reason: collision with root package name */
    private final b f8698j = c.b(false, 1, (Object) null);

    /* renamed from: k  reason: collision with root package name */
    private List f8699k = C0718m.j();

    /* renamed from: l  reason: collision with root package name */
    private List f8700l = C0718m.j();

    /* renamed from: m  reason: collision with root package name */
    private org.tensorflow.lite.c f8701m;

    /* renamed from: n  reason: collision with root package name */
    private int f8702n = -1;

    /* renamed from: o  reason: collision with root package name */
    private int f8703o = -1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TFLiteModel(java.lang.String r12, java.lang.String r13, int r14, int r15, java.lang.String r16, boolean r17, D0.C0266b r18) {
        /*
            r11 = this;
            r8 = r11
            r9 = r13
            r10 = r18
            java.lang.String r0 = "kind"
            r1 = r12
            kotlin.jvm.internal.o.e(r12, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.o.e(r13, r0)
            java.lang.String r0 = "rnnType"
            r6 = r16
            kotlin.jvm.internal.o.e(r6, r0)
            java.lang.String r0 = "platformDependencies"
            kotlin.jvm.internal.o.e(r10, r0)
            java.lang.String r3 = ".tf_lite"
            r0 = r11
            r2 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f8695g = r9
            r8.f8696h = r10
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r8.f8697i = r0
            r0 = 1
            r1 = 0
            r2 = 0
            kotlinx.coroutines.sync.b r0 = kotlinx.coroutines.sync.c.b(r2, r0, r1)
            r8.f8698j = r0
            java.util.List r0 = kotlin.collections.C0718m.j()
            r8.f8699k = r0
            java.util.List r0 = kotlin.collections.C0718m.j()
            r8.f8700l = r0
            r0 = -1
            r8.f8702n = r0
            r8.f8703o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.TFLiteModel.<init>(java.lang.String, java.lang.String, int, int, java.lang.String, boolean, D0.b):void");
    }

    /* access modifiers changed from: private */
    public static final CharSequence q(int i4) {
        return String.valueOf(i4);
    }

    /* access modifiers changed from: private */
    public static final CharSequence r(int i4) {
        return String.valueOf(i4);
    }

    /* access modifiers changed from: private */
    public static final CharSequence s(int i4) {
        return String.valueOf(i4);
    }

    /* access modifiers changed from: private */
    public static final CharSequence t(int i4) {
        return String.valueOf(i4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068 A[SYNTHETIC, Splitter:B:23:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r23, kotlin.coroutines.c r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r24
            java.lang.String r2 = "shape(...)"
            boolean r3 = r0 instanceof ch.icoaching.typewise.language_modelling.modelling.TFLiteModel$loadWeights$1
            if (r3 == 0) goto L_0x0019
            r3 = r0
            ch.icoaching.typewise.language_modelling.modelling.TFLiteModel$loadWeights$1 r3 = (ch.icoaching.typewise.language_modelling.modelling.TFLiteModel$loadWeights$1) r3
            int r4 = r3.f8714f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f8714f = r4
            goto L_0x001e
        L_0x0019:
            ch.icoaching.typewise.language_modelling.modelling.TFLiteModel$loadWeights$1 r3 = new ch.icoaching.typewise.language_modelling.modelling.TFLiteModel$loadWeights$1
            r3.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r0 = r3.f8712d
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.f()
            int r5 = r3.f8714f
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0044
            if (r5 != r7) goto L_0x003c
            java.lang.Object r4 = r3.f8711c
            kotlinx.coroutines.sync.b r4 = (kotlinx.coroutines.sync.b) r4
            java.lang.Object r5 = r3.f8710b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.f8709a
            ch.icoaching.typewise.language_modelling.modelling.TFLiteModel r3 = (ch.icoaching.typewise.language_modelling.modelling.TFLiteModel) r3
            kotlin.f.b(r0)
            goto L_0x0062
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0044:
            kotlin.f.b(r0)
            if (r23 != 0) goto L_0x004c
            java.lang.String r0 = r1.f8695g
            goto L_0x004e
        L_0x004c:
            r0 = r23
        L_0x004e:
            kotlinx.coroutines.sync.b r5 = r1.f8698j
            r3.f8709a = r1
            r3.f8710b = r0
            r3.f8711c = r5
            r3.f8714f = r7
            java.lang.Object r3 = r5.a(r6, r3)
            if (r3 != r4) goto L_0x005f
            return r4
        L_0x005f:
            r3 = r1
            r4 = r5
            r5 = r0
        L_0x0062:
            org.tensorflow.lite.c r0 = r3.f8701m     // Catch:{ all -> 0x01f1 }
            if (r0 == 0) goto L_0x0068
            goto L_0x01eb
        L_0x0068:
            org.tensorflow.lite.c r0 = new org.tensorflow.lite.c     // Catch:{ Exception -> 0x01f3 }
            D0.b r8 = r3.f8696h     // Catch:{ Exception -> 0x01f3 }
            java.nio.ByteBuffer r5 = r8.b(r5)     // Catch:{ Exception -> 0x01f3 }
            r0.<init>((java.nio.ByteBuffer) r5)     // Catch:{ Exception -> 0x01f3 }
            r0.a()     // Catch:{ all -> 0x01f1 }
            r5 = 0
            org.tensorflow.lite.f r8 = r0.f(r5)     // Catch:{ all -> 0x01f1 }
            org.tensorflow.lite.f r9 = r0.f(r7)     // Catch:{ all -> 0x01f1 }
            int[] r10 = r8.a()     // Catch:{ all -> 0x01f1 }
            kotlin.jvm.internal.o.d(r10, r2)     // Catch:{ all -> 0x01f1 }
            int r10 = E0.g.a(r10)     // Catch:{ all -> 0x01f1 }
            int[] r11 = r9.a()     // Catch:{ all -> 0x01f1 }
            kotlin.jvm.internal.o.d(r11, r2)     // Catch:{ all -> 0x01f1 }
            int r11 = E0.g.a(r11)     // Catch:{ all -> 0x01f1 }
            if (r10 >= r11) goto L_0x0099
            r10 = r7
            goto L_0x009a
        L_0x0099:
            r10 = r5
        L_0x009a:
            r3.f8703o = r10     // Catch:{ all -> 0x01f1 }
            ch.icoaching.typewise.e r10 = ch.icoaching.typewise.e.f8233a     // Catch:{ all -> 0x01f1 }
            java.lang.String r12 = "TFLiteModel"
            int[] r13 = r8.a()     // Catch:{ all -> 0x01f1 }
            kotlin.jvm.internal.o.d(r13, r2)     // Catch:{ all -> 0x01f1 }
            ch.icoaching.typewise.language_modelling.modelling.a r19 = new ch.icoaching.typewise.language_modelling.modelling.a     // Catch:{ all -> 0x01f1 }
            r19.<init>()     // Catch:{ all -> 0x01f1 }
            r20 = 31
            r21 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r8 = kotlin.collections.C0713h.S(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01f1 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f1 }
            r11.<init>()     // Catch:{ all -> 0x01f1 }
            java.lang.String r13 = "loadWeights() :: Input Tensor 0 shape is "
            r11.append(r13)     // Catch:{ all -> 0x01f1 }
            r11.append(r8)     // Catch:{ all -> 0x01f1 }
            java.lang.String r13 = r11.toString()     // Catch:{ all -> 0x01f1 }
            r15 = 4
            r16 = 0
            r14 = 0
            r11 = r10
            ch.icoaching.typewise.e.b(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01f1 }
            java.lang.String r12 = "TFLiteModel"
            int[] r13 = r9.a()     // Catch:{ all -> 0x01f1 }
            kotlin.jvm.internal.o.d(r13, r2)     // Catch:{ all -> 0x01f1 }
            ch.icoaching.typewise.language_modelling.modelling.b r19 = new ch.icoaching.typewise.language_modelling.modelling.b     // Catch:{ all -> 0x01f1 }
            r19.<init>()     // Catch:{ all -> 0x01f1 }
            r20 = 31
            r21 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r8 = kotlin.collections.C0713h.S(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01f1 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f1 }
            r9.<init>()     // Catch:{ all -> 0x01f1 }
            java.lang.String r11 = "loadWeights() :: Input Tensor 1 shape is "
            r9.append(r11)     // Catch:{ all -> 0x01f1 }
            r9.append(r8)     // Catch:{ all -> 0x01f1 }
            java.lang.String r13 = r9.toString()     // Catch:{ all -> 0x01f1 }
            r15 = 4
            r16 = 0
            r14 = 0
            r11 = r10
            ch.icoaching.typewise.e.b(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01f1 }
            org.tensorflow.lite.f r8 = r0.h(r5)     // Catch:{ all -> 0x01f1 }
            org.tensorflow.lite.f r9 = r0.h(r7)     // Catch:{ all -> 0x01f1 }
            int[] r11 = r8.a()     // Catch:{ all -> 0x01f1 }
            kotlin.jvm.internal.o.d(r11, r2)     // Catch:{ all -> 0x01f1 }
            int r11 = E0.g.a(r11)     // Catch:{ all -> 0x01f1 }
            int[] r12 = r9.a()     // Catch:{ all -> 0x01f1 }
            kotlin.jvm.internal.o.d(r12, r2)     // Catch:{ all -> 0x01f1 }
            int r12 = E0.g.a(r12)     // Catch:{ all -> 0x01f1 }
            if (r11 >= r12) goto L_0x012e
            r11 = r7
            goto L_0x012f
        L_0x012e:
            r11 = r5
        L_0x012f:
            r3.f8702n = r11     // Catch:{ all -> 0x01f1 }
            java.util.Map r11 = r3.f8697i     // Catch:{ all -> 0x01f1 }
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)     // Catch:{ all -> 0x01f1 }
            int[] r12 = r8.a()     // Catch:{ all -> 0x01f1 }
            kotlin.jvm.internal.o.d(r12, r2)     // Catch:{ all -> 0x01f1 }
            int r12 = E0.g.a(r12)     // Catch:{ all -> 0x01f1 }
            java.nio.FloatBuffer r12 = java.nio.FloatBuffer.allocate(r12)     // Catch:{ all -> 0x01f1 }
            r11.put(r5, r12)     // Catch:{ all -> 0x01f1 }
            java.util.Map r5 = r3.f8697i     // Catch:{ all -> 0x01f1 }
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.d(r7)     // Catch:{ all -> 0x01f1 }
            int[] r11 = r9.a()     // Catch:{ all -> 0x01f1 }
            kotlin.jvm.internal.o.d(r11, r2)     // Catch:{ all -> 0x01f1 }
            int r11 = E0.g.a(r11)     // Catch:{ all -> 0x01f1 }
            java.nio.FloatBuffer r11 = java.nio.FloatBuffer.allocate(r11)     // Catch:{ all -> 0x01f1 }
            r5.put(r7, r11)     // Catch:{ all -> 0x01f1 }
            int[] r5 = r8.a()     // Catch:{ all -> 0x01f1 }
            kotlin.jvm.internal.o.d(r5, r2)     // Catch:{ all -> 0x01f1 }
            java.util.List r5 = kotlin.collections.C0713h.Z(r5)     // Catch:{ all -> 0x01f1 }
            r3.f8699k = r5     // Catch:{ all -> 0x01f1 }
            int[] r5 = r9.a()     // Catch:{ all -> 0x01f1 }
            kotlin.jvm.internal.o.d(r5, r2)     // Catch:{ all -> 0x01f1 }
            java.util.List r5 = kotlin.collections.C0713h.Z(r5)     // Catch:{ all -> 0x01f1 }
            r3.f8700l = r5     // Catch:{ all -> 0x01f1 }
            java.lang.String r12 = "TFLiteModel"
            int[] r13 = r8.a()     // Catch:{ all -> 0x01f1 }
            kotlin.jvm.internal.o.d(r13, r2)     // Catch:{ all -> 0x01f1 }
            ch.icoaching.typewise.language_modelling.modelling.c r19 = new ch.icoaching.typewise.language_modelling.modelling.c     // Catch:{ all -> 0x01f1 }
            r19.<init>()     // Catch:{ all -> 0x01f1 }
            r20 = 31
            r21 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r5 = kotlin.collections.C0713h.S(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01f1 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f1 }
            r7.<init>()     // Catch:{ all -> 0x01f1 }
            java.lang.String r8 = "loadWeights() :: Output Tensor 0 shape is "
            r7.append(r8)     // Catch:{ all -> 0x01f1 }
            r7.append(r5)     // Catch:{ all -> 0x01f1 }
            java.lang.String r13 = r7.toString()     // Catch:{ all -> 0x01f1 }
            r15 = 4
            r16 = 0
            r14 = 0
            r11 = r10
            ch.icoaching.typewise.e.b(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01f1 }
            java.lang.String r12 = "TFLiteModel"
            int[] r13 = r9.a()     // Catch:{ all -> 0x01f1 }
            kotlin.jvm.internal.o.d(r13, r2)     // Catch:{ all -> 0x01f1 }
            ch.icoaching.typewise.language_modelling.modelling.d r19 = new ch.icoaching.typewise.language_modelling.modelling.d     // Catch:{ all -> 0x01f1 }
            r19.<init>()     // Catch:{ all -> 0x01f1 }
            r20 = 31
            r21 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r2 = kotlin.collections.C0713h.S(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01f1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f1 }
            r5.<init>()     // Catch:{ all -> 0x01f1 }
            java.lang.String r7 = "loadWeights() :: Output Tensor 1 shape is "
            r5.append(r7)     // Catch:{ all -> 0x01f1 }
            r5.append(r2)     // Catch:{ all -> 0x01f1 }
            java.lang.String r13 = r5.toString()     // Catch:{ all -> 0x01f1 }
            r15 = 4
            r16 = 0
            r14 = 0
            r11 = r10
            ch.icoaching.typewise.e.b(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01f1 }
            r3.f8701m = r0     // Catch:{ all -> 0x01f1 }
        L_0x01eb:
            l2.q r0 = l2.q.f14567a     // Catch:{ all -> 0x01f1 }
            r4.b(r6)
            return r0
        L_0x01f1:
            r0 = move-exception
            goto L_0x01f5
        L_0x01f3:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01f1 }
        L_0x01f5:
            r4.b(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.TFLiteModel.a(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052 A[Catch:{ all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(kotlin.coroutines.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ch.icoaching.typewise.language_modelling.modelling.TFLiteModel$destroy$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ch.icoaching.typewise.language_modelling.modelling.TFLiteModel$destroy$1 r0 = (ch.icoaching.typewise.language_modelling.modelling.TFLiteModel$destroy$1) r0
            int r1 = r0.f8708e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8708e = r1
            goto L_0x0018
        L_0x0013:
            ch.icoaching.typewise.language_modelling.modelling.TFLiteModel$destroy$1 r0 = new ch.icoaching.typewise.language_modelling.modelling.TFLiteModel$destroy$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f8706c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f8708e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r1 = r0.f8705b
            kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.b) r1
            java.lang.Object r0 = r0.f8704a
            ch.icoaching.typewise.language_modelling.modelling.TFLiteModel r0 = (ch.icoaching.typewise.language_modelling.modelling.TFLiteModel) r0
            kotlin.f.b(r6)
            goto L_0x004e
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003a:
            kotlin.f.b(r6)
            kotlinx.coroutines.sync.b r6 = r5.f8698j
            r0.f8704a = r5
            r0.f8705b = r6
            r0.f8708e = r3
            java.lang.Object r0 = r6.a(r4, r0)
            if (r0 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r5
            r1 = r6
        L_0x004e:
            org.tensorflow.lite.c r6 = r0.f8701m     // Catch:{ all -> 0x0056 }
            if (r6 == 0) goto L_0x0058
            r6.close()     // Catch:{ all -> 0x0056 }
            goto L_0x0058
        L_0x0056:
            r6 = move-exception
            goto L_0x0060
        L_0x0058:
            r0.f8701m = r4     // Catch:{ all -> 0x0056 }
            l2.q r6 = l2.q.f14567a     // Catch:{ all -> 0x0056 }
            r1.b(r4)
            return r6
        L_0x0060:
            r1.b(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.TFLiteModel.b(kotlin.coroutines.c):java.lang.Object");
    }

    public String d() {
        return "TFLite Model: " + this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d A[Catch:{ all -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073 A[SYNTHETIC, Splitter:B:23:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object l(java.util.List r10, kotlin.coroutines.c r11) {
        /*
            r9 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            java.lang.String r3 = "null cannot be cast to non-null type java.nio.FloatBuffer"
            boolean r4 = r11 instanceof ch.icoaching.typewise.language_modelling.modelling.TFLiteModel$predictSingleToken$1
            if (r4 == 0) goto L_0x0018
            r4 = r11
            ch.icoaching.typewise.language_modelling.modelling.TFLiteModel$predictSingleToken$1 r4 = (ch.icoaching.typewise.language_modelling.modelling.TFLiteModel$predictSingleToken$1) r4
            int r5 = r4.f8720f
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x0018
            int r5 = r5 - r6
            r4.f8720f = r5
            goto L_0x001d
        L_0x0018:
            ch.icoaching.typewise.language_modelling.modelling.TFLiteModel$predictSingleToken$1 r4 = new ch.icoaching.typewise.language_modelling.modelling.TFLiteModel$predictSingleToken$1
            r4.<init>(r9, r11)
        L_0x001d:
            java.lang.Object r11 = r4.f8718d
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.f()
            int r6 = r4.f8720f
            r7 = 0
            if (r6 == 0) goto L_0x0044
            if (r6 != r2) goto L_0x003c
            java.lang.Object r10 = r4.f8717c
            kotlinx.coroutines.sync.b r10 = (kotlinx.coroutines.sync.b) r10
            java.lang.Object r5 = r4.f8716b
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r4.f8715a
            ch.icoaching.typewise.language_modelling.modelling.TFLiteModel r4 = (ch.icoaching.typewise.language_modelling.modelling.TFLiteModel) r4
            kotlin.f.b(r11)
            r11 = r10
            r10 = r5
            goto L_0x0059
        L_0x003c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0044:
            kotlin.f.b(r11)
            kotlinx.coroutines.sync.b r11 = r9.f8698j
            r4.f8715a = r9
            r4.f8716b = r10
            r4.f8717c = r11
            r4.f8720f = r2
            java.lang.Object r4 = r11.a(r7, r4)
            if (r4 != r5) goto L_0x0058
            return r5
        L_0x0058:
            r4 = r9
        L_0x0059:
            org.tensorflow.lite.c r5 = r4.f8701m     // Catch:{ all -> 0x0070 }
            if (r5 != 0) goto L_0x0073
            kotlin.Pair r10 = new kotlin.Pair     // Catch:{ all -> 0x0070 }
            D0.E$a r0 = D0.E.f232d     // Catch:{ all -> 0x0070 }
            D0.E r1 = r0.a()     // Catch:{ all -> 0x0070 }
            D0.E r0 = r0.a()     // Catch:{ all -> 0x0070 }
            r10.<init>(r1, r0)     // Catch:{ all -> 0x0070 }
            r11.b(r7)
            return r10
        L_0x0070:
            r10 = move-exception
            goto L_0x0106
        L_0x0073:
            java.lang.Object r6 = r10.get(r1)     // Catch:{ all -> 0x0070 }
            D0.E r6 = (D0.E) r6     // Catch:{ all -> 0x0070 }
            java.nio.FloatBuffer r6 = D0.G.b(r6)     // Catch:{ all -> 0x0070 }
            java.lang.Object r10 = r10.get(r2)     // Catch:{ all -> 0x0070 }
            D0.E r10 = (D0.E) r10     // Catch:{ all -> 0x0070 }
            java.nio.FloatBuffer r10 = D0.G.b(r10)     // Catch:{ all -> 0x0070 }
            int r8 = r4.f8703o     // Catch:{ all -> 0x0070 }
            if (r8 != 0) goto L_0x0092
            java.nio.FloatBuffer[] r0 = new java.nio.FloatBuffer[r0]     // Catch:{ all -> 0x0070 }
            r0[r1] = r10     // Catch:{ all -> 0x0070 }
            r0[r2] = r6     // Catch:{ all -> 0x0070 }
            goto L_0x0098
        L_0x0092:
            java.nio.FloatBuffer[] r0 = new java.nio.FloatBuffer[r0]     // Catch:{ all -> 0x0070 }
            r0[r1] = r6     // Catch:{ all -> 0x0070 }
            r0[r2] = r10     // Catch:{ all -> 0x0070 }
        L_0x0098:
            java.util.Map r10 = r4.f8697i     // Catch:{ all -> 0x0070 }
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r1)     // Catch:{ all -> 0x0070 }
            java.lang.Object r10 = r10.get(r6)     // Catch:{ all -> 0x0070 }
            kotlin.jvm.internal.o.c(r10, r3)     // Catch:{ all -> 0x0070 }
            java.nio.FloatBuffer r10 = (java.nio.FloatBuffer) r10     // Catch:{ all -> 0x0070 }
            r10.clear()     // Catch:{ all -> 0x0070 }
            java.util.Map r10 = r4.f8697i     // Catch:{ all -> 0x0070 }
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r2)     // Catch:{ all -> 0x0070 }
            java.lang.Object r10 = r10.get(r6)     // Catch:{ all -> 0x0070 }
            kotlin.jvm.internal.o.c(r10, r3)     // Catch:{ all -> 0x0070 }
            java.nio.FloatBuffer r10 = (java.nio.FloatBuffer) r10     // Catch:{ all -> 0x0070 }
            r10.clear()     // Catch:{ all -> 0x0070 }
            java.util.Map r10 = r4.f8697i     // Catch:{ all -> 0x0070 }
            r5.v(r0, r10)     // Catch:{ all -> 0x0070 }
            java.util.Map r10 = r4.f8697i     // Catch:{ all -> 0x0070 }
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.d(r1)     // Catch:{ all -> 0x0070 }
            java.lang.Object r10 = r10.get(r0)     // Catch:{ all -> 0x0070 }
            kotlin.jvm.internal.o.c(r10, r3)     // Catch:{ all -> 0x0070 }
            java.nio.FloatBuffer r10 = (java.nio.FloatBuffer) r10     // Catch:{ all -> 0x0070 }
            java.util.List r0 = r4.f8699k     // Catch:{ all -> 0x0070 }
            D0.E r10 = D0.G.a(r10, r0)     // Catch:{ all -> 0x0070 }
            java.util.Map r0 = r4.f8697i     // Catch:{ all -> 0x0070 }
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.d(r2)     // Catch:{ all -> 0x0070 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0070 }
            kotlin.jvm.internal.o.c(r0, r3)     // Catch:{ all -> 0x0070 }
            java.nio.FloatBuffer r0 = (java.nio.FloatBuffer) r0     // Catch:{ all -> 0x0070 }
            java.util.List r1 = r4.f8700l     // Catch:{ all -> 0x0070 }
            D0.E r0 = D0.G.a(r0, r1)     // Catch:{ all -> 0x0070 }
            int r1 = r4.f8702n     // Catch:{ all -> 0x0070 }
            if (r1 != 0) goto L_0x00f5
            kotlin.Pair r1 = new kotlin.Pair     // Catch:{ all -> 0x0070 }
            r1.<init>(r0, r10)     // Catch:{ all -> 0x0070 }
            goto L_0x00fa
        L_0x00f5:
            kotlin.Pair r1 = new kotlin.Pair     // Catch:{ all -> 0x0070 }
            r1.<init>(r10, r0)     // Catch:{ all -> 0x0070 }
        L_0x00fa:
            r11.b(r7)
            int r10 = r4.f()
            int r10 = r10 + r2
            r4.e(r10)
            return r1
        L_0x0106:
            r11.b(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.TFLiteModel.l(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }
}
