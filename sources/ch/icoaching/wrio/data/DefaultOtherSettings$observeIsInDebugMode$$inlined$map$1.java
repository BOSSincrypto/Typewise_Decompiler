package ch.icoaching.wrio.data;

import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.flow.c;
import kotlinx.coroutines.flow.d;
import l2.q;

public final class DefaultOtherSettings$observeIsInDebugMode$$inlined$map$1 implements c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f9491a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DefaultOtherSettings f9492b;

    public DefaultOtherSettings$observeIsInDebugMode$$inlined$map$1(c cVar, DefaultOtherSettings defaultOtherSettings) {
        this.f9491a = cVar;
        this.f9492b = defaultOtherSettings;
    }

    public Object a(final d dVar, kotlin.coroutines.c cVar) {
        c cVar2 = this.f9491a;
        final DefaultOtherSettings defaultOtherSettings = this.f9492b;
        Object a4 = cVar2.a(new d() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ch.icoaching.wrio.data.DefaultOtherSettings$observeIsInDebugMode$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    ch.icoaching.wrio.data.DefaultOtherSettings$observeIsInDebugMode$$inlined$map$1$2$1 r0 = (ch.icoaching.wrio.data.DefaultOtherSettings$observeIsInDebugMode$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    ch.icoaching.wrio.data.DefaultOtherSettings$observeIsInDebugMode$$inlined$map$1$2$1 r0 = new ch.icoaching.wrio.data.DefaultOtherSettings$observeIsInDebugMode$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.f.b(r6)
                    goto L_0x004b
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    kotlin.f.b(r6)
                    kotlinx.coroutines.flow.d r6 = r4
                    java.lang.String r5 = (java.lang.String) r5
                    ch.icoaching.wrio.data.DefaultOtherSettings r5 = r2
                    boolean r5 = r5.c()
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    l2.q r5 = l2.q.f14567a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.data.DefaultOtherSettings$observeIsInDebugMode$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (a4 == a.f()) {
            return a4;
        }
        return q.f14567a;
    }
}
