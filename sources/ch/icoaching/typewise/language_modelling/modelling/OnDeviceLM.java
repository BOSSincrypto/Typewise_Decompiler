package ch.icoaching.typewise.language_modelling.modelling;

import D0.C;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C0718m;
import kotlin.coroutines.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public abstract class OnDeviceLM extends StatefulLanguageModel {

    /* renamed from: f  reason: collision with root package name */
    public static final a f8680f = new a((i) null);

    /* renamed from: d  reason: collision with root package name */
    private final int f8681d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8682e;

    public static final class a {
        private a() {
        }

        public final String a(String str, String str2) {
            o.e(str, "path");
            o.e(str2, "checkpointPostfix");
            return str + str2;
        }

        public final boolean b(String str, String str2) {
            o.e(str, "path");
            o.e(str2, "checkpointPostfix");
            return kotlin.text.o.u(str, str2, false, 2, (Object) null);
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OnDeviceLM(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, int r5, java.lang.String r6, boolean r7) {
        /*
            r0 = this;
            java.lang.String r5 = "kind"
            kotlin.jvm.internal.o.e(r1, r5)
            java.lang.String r5 = "path"
            kotlin.jvm.internal.o.e(r2, r5)
            java.lang.String r5 = "checkpointPostfix"
            kotlin.jvm.internal.o.e(r3, r5)
            java.lang.String r5 = "rnnType"
            kotlin.jvm.internal.o.e(r6, r5)
            ch.icoaching.typewise.language_modelling.modelling.OnDeviceLM$a r5 = f8680f
            boolean r7 = r5.b(r2, r3)
            if (r7 != 0) goto L_0x0020
            java.lang.String r2 = r5.a(r2, r3)
        L_0x0020:
            r0.<init>(r1, r2)
            r0.f8681d = r4
            r0.f8682e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.OnDeviceLM.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object k(ch.icoaching.typewise.language_modelling.modelling.OnDeviceLM r17, java.util.List r18, kotlin.coroutines.c r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = 2
            r4 = 1
            r5 = 0
            boolean r6 = r2 instanceof ch.icoaching.typewise.language_modelling.modelling.OnDeviceLM$statefulPredict$1
            if (r6 == 0) goto L_0x001c
            r6 = r2
            ch.icoaching.typewise.language_modelling.modelling.OnDeviceLM$statefulPredict$1 r6 = (ch.icoaching.typewise.language_modelling.modelling.OnDeviceLM$statefulPredict$1) r6
            int r7 = r6.f8691i
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001c
            int r7 = r7 - r8
            r6.f8691i = r7
            goto L_0x0021
        L_0x001c:
            ch.icoaching.typewise.language_modelling.modelling.OnDeviceLM$statefulPredict$1 r6 = new ch.icoaching.typewise.language_modelling.modelling.OnDeviceLM$statefulPredict$1
            r6.<init>(r0, r2)
        L_0x0021:
            java.lang.Object r2 = r6.f8689g
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.f()
            int r8 = r6.f8691i
            if (r8 == 0) goto L_0x0059
            if (r8 != r4) goto L_0x0051
            java.lang.Object r0 = r6.f8688f
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r1 = r6.f8687e
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r8 = r6.f8686d
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r6.f8685c
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r6.f8684b
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r6.f8683a
            ch.icoaching.typewise.language_modelling.modelling.OnDeviceLM r11 = (ch.icoaching.typewise.language_modelling.modelling.OnDeviceLM) r11
            kotlin.f.b(r2)
            r16 = r6
            r6 = r1
            r1 = r11
            r11 = r9
            r9 = r16
            goto L_0x0112
        L_0x0051:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0059:
            kotlin.f.b(r2)
            java.lang.String r2 = r0.f8682e
            java.lang.String r8 = "gru"
            boolean r2 = kotlin.jvm.internal.o.a(r2, r8)
            if (r2 == 0) goto L_0x0154
            java.lang.Object r2 = r1.get(r5)
            D0.E r2 = (D0.E) r2
            java.lang.Object r1 = r1.get(r4)
            D0.E r1 = (D0.E) r1
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r2.iterator()
            java.util.Iterator r1 = r1.iterator()
        L_0x0084:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x0140
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x0140
            java.lang.Object r10 = r2.next()
            D0.E r10 = (D0.E) r10
            java.lang.Object r11 = r1.next()
            D0.E r11 = (D0.E) r11
            D0.E$a r12 = D0.E.f232d
            D0.E r12 = r12.a()
            java.util.Iterator r10 = r10.iterator()
            r16 = r1
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            r8 = r6
            r6 = r2
            r2 = r16
        L_0x00b0:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x012a
            java.lang.Object r12 = r0.next()
            D0.E r12 = (D0.E) r12
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.a.d(r4)
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.a.d(r4)
            java.lang.Integer[] r15 = new java.lang.Integer[r3]
            r15[r5] = r13
            r15[r4] = r14
            java.util.List r13 = kotlin.collections.C0718m.m(r15)
            D0.E r12 = D0.C.p0(r12, r13)
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.a.d(r4)
            int r14 = r1.f8681d
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.a.d(r14)
            java.lang.Integer[] r15 = new java.lang.Integer[r3]
            r15[r5] = r13
            r15[r4] = r14
            java.util.List r13 = kotlin.collections.C0718m.m(r15)
            D0.E r11 = D0.C.p0(r11, r13)
            D0.E[] r13 = new D0.E[r3]
            r13[r5] = r12
            r13[r4] = r11
            java.util.List r11 = kotlin.collections.C0718m.m(r13)
            r8.f8683a = r1
            r8.f8684b = r9
            r8.f8685c = r10
            r8.f8686d = r6
            r8.f8687e = r2
            r8.f8688f = r0
            r8.f8691i = r4
            java.lang.Object r11 = r1.l(r11, r8)
            if (r11 != r7) goto L_0x0109
            return r7
        L_0x0109:
            r16 = r6
            r6 = r2
            r2 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r16
        L_0x0112:
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r12 = r2.getFirst()
            D0.E r12 = (D0.E) r12
            java.lang.Object r2 = r2.getSecond()
            D0.E r2 = (D0.E) r2
            r16 = r11
            r11 = r2
            r2 = r6
            r6 = r8
            r8 = r9
            r9 = r10
            r10 = r16
            goto L_0x00b0
        L_0x012a:
            D0.E r0 = r12.b(r5)
            r9.add(r0)
            D0.E r0 = r11.b(r5)
            r10.add(r0)
            r0 = r1
            r1 = r2
            r2 = r6
            r6 = r8
            r8 = r9
            r9 = r10
            goto L_0x0084
        L_0x0140:
            r0 = 0
            D0.E r1 = D0.C.c0(r8, r5, r3, r0)
            D0.E r0 = D0.C.c0(r9, r5, r3, r0)
            D0.E[] r2 = new D0.E[r3]
            r2[r5] = r1
            r2[r4] = r0
            java.util.List r0 = kotlin.collections.C0718m.m(r2)
            return r0
        L_0x0154:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.Class r0 = r17.getClass()
            A2.c r0 = kotlin.jvm.internal.r.b(r0)
            java.lang.String r0 = r0.b()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "LSTM with '"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "' not implemented."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.modelling.OnDeviceLM.k(ch.icoaching.typewise.language_modelling.modelling.OnDeviceLM, java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    public Object i(List list, c cVar) {
        return k(this, list, cVar);
    }

    public List j(int i4) {
        List m4 = C0718m.m(Integer.valueOf(i4), Integer.valueOf(this.f8681d));
        String lowerCase = this.f8682e.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        if (!o.a(lowerCase, "lstm")) {
            return C0718m.e(C.X0(m4));
        }
        return C0718m.m(C.X0(m4), C.X0(m4));
    }

    public abstract Object l(List list, c cVar);
}
