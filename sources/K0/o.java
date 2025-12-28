package k0;

import android.content.Context;
import kotlin.jvm.internal.i;
import n0.c;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final C0700h f13799a;

    /* renamed from: b  reason: collision with root package name */
    private final C0695c f13800b;

    /* renamed from: c  reason: collision with root package name */
    private final C0700h f13801c;

    /* renamed from: d  reason: collision with root package name */
    private final C0700h f13802d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o(Context context, c cVar) {
        this(context, cVar, (C0700h) null, (C0695c) null, (C0700h) null, (C0700h) null, 60, (i) null);
        kotlin.jvm.internal.o.e(context, "context");
        kotlin.jvm.internal.o.e(cVar, "taskExecutor");
    }

    public final C0700h a() {
        return this.f13799a;
    }

    public final C0695c b() {
        return this.f13800b;
    }

    public final C0700h c() {
        return this.f13801c;
    }

    public final C0700h d() {
        return this.f13802d;
    }

    public o(Context context, c cVar, C0700h hVar, C0695c cVar2, C0700h hVar2, C0700h hVar3) {
        kotlin.jvm.internal.o.e(context, "context");
        kotlin.jvm.internal.o.e(cVar, "taskExecutor");
        kotlin.jvm.internal.o.e(hVar, "batteryChargingTracker");
        kotlin.jvm.internal.o.e(cVar2, "batteryNotLowTracker");
        kotlin.jvm.internal.o.e(hVar2, "networkStateTracker");
        kotlin.jvm.internal.o.e(hVar3, "storageNotLowTracker");
        this.f13799a = hVar;
        this.f13800b = cVar2;
        this.f13801c = hVar2;
        this.f13802d = hVar3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ o(android.content.Context r8, n0.c r9, k0.C0700h r10, k0.C0695c r11, k0.C0700h r12, k0.C0700h r13, int r14, kotlin.jvm.internal.i r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "context.applicationContext"
            if (r0 == 0) goto L_0x0014
            k0.a r0 = new k0.a
            android.content.Context r3 = r8.getApplicationContext()
            kotlin.jvm.internal.o.d(r3, r1)
            r0.<init>(r3, r9)
            r3 = r0
            goto L_0x0015
        L_0x0014:
            r3 = r10
        L_0x0015:
            r0 = r14 & 8
            if (r0 == 0) goto L_0x0027
            k0.c r0 = new k0.c
            android.content.Context r4 = r8.getApplicationContext()
            kotlin.jvm.internal.o.d(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L_0x0028
        L_0x0027:
            r4 = r11
        L_0x0028:
            r0 = r14 & 16
            if (r0 == 0) goto L_0x0039
            android.content.Context r0 = r8.getApplicationContext()
            kotlin.jvm.internal.o.d(r0, r1)
            k0.h r0 = k0.C0703k.a(r0, r9)
            r5 = r0
            goto L_0x003a
        L_0x0039:
            r5 = r12
        L_0x003a:
            r0 = r14 & 32
            if (r0 == 0) goto L_0x004c
            k0.m r0 = new k0.m
            android.content.Context r6 = r8.getApplicationContext()
            kotlin.jvm.internal.o.d(r6, r1)
            r0.<init>(r6, r9)
            r6 = r0
            goto L_0x004d
        L_0x004c:
            r6 = r13
        L_0x004d:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.o.<init>(android.content.Context, n0.c, k0.h, k0.c, k0.h, k0.h, int, kotlin.jvm.internal.i):void");
    }
}
