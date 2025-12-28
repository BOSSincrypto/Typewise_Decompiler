package ch.icoaching.wrio.data;

import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.flow.c;
import kotlinx.coroutines.flow.d;
import l2.q;

public final class DefaultOtherSettings$observeSendDebugLogTimestamp$$inlined$map$1 implements c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f9497a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DefaultOtherSettings f9498b;

    public DefaultOtherSettings$observeSendDebugLogTimestamp$$inlined$map$1(c cVar, DefaultOtherSettings defaultOtherSettings) {
        this.f9497a = cVar;
        this.f9498b = defaultOtherSettings;
    }

    public Object a(final d dVar, kotlin.coroutines.c cVar) {
        c cVar2 = this.f9497a;
        final DefaultOtherSettings defaultOtherSettings = this.f9498b;
        Object a4 = cVar2.a(new d() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.c r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof ch.icoaching.wrio.data.DefaultOtherSettings$observeSendDebugLogTimestamp$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r10
                    ch.icoaching.wrio.data.DefaultOtherSettings$observeSendDebugLogTimestamp$$inlined$map$1$2$1 r0 = (ch.icoaching.wrio.data.DefaultOtherSettings$observeSendDebugLogTimestamp$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    ch.icoaching.wrio.data.DefaultOtherSettings$observeSendDebugLogTimestamp$$inlined$map$1$2$1 r0 = new ch.icoaching.wrio.data.DefaultOtherSettings$observeSendDebugLogTimestamp$$inlined$map$1$2$1
                    r0.<init>(r8, r10)
                L_0x0018:
                    java.lang.Object r10 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.f.b(r10)
                    goto L_0x0053
                L_0x0029:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L_0x0031:
                    kotlin.f.b(r10)
                    kotlinx.coroutines.flow.d r10 = r4
                    java.lang.String r9 = (java.lang.String) r9
                    ch.icoaching.wrio.data.DefaultOtherSettings r9 = r2
                    i2.a r9 = r9.f9488a
                    int r9 = r9.h()
                    long r4 = (long) r9
                    r6 = 1000(0x3e8, double:4.94E-321)
                    long r4 = r4 * r6
                    java.lang.Long r9 = kotlin.coroutines.jvm.internal.a.e(r4)
                    r0.label = r3
                    java.lang.Object r9 = r10.emit(r9, r0)
                    if (r9 != r1) goto L_0x0053
                    return r1
                L_0x0053:
                    l2.q r9 = l2.q.f14567a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.data.DefaultOtherSettings$observeSendDebugLogTimestamp$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (a4 == a.f()) {
            return a4;
        }
        return q.f14567a;
    }
}
