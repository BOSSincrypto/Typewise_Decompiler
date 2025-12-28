package ch.icoaching.wrio.data;

import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.flow.c;
import kotlinx.coroutines.flow.d;
import l2.q;

public final class DefaultAutocorrectionSettings$observeAutoCapitalizationState$$inlined$filter$1 implements c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f9348a;

    public DefaultAutocorrectionSettings$observeAutoCapitalizationState$$inlined$filter$1(c cVar) {
        this.f9348a = cVar;
    }

    public Object a(final d dVar, kotlin.coroutines.c cVar) {
        Object a4 = this.f9348a.a(new d() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.c r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof ch.icoaching.wrio.data.DefaultAutocorrectionSettings$observeAutoCapitalizationState$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    ch.icoaching.wrio.data.DefaultAutocorrectionSettings$observeAutoCapitalizationState$$inlined$filter$1$2$1 r0 = (ch.icoaching.wrio.data.DefaultAutocorrectionSettings$observeAutoCapitalizationState$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    ch.icoaching.wrio.data.DefaultAutocorrectionSettings$observeAutoCapitalizationState$$inlined$filter$1$2$1 r0 = new ch.icoaching.wrio.data.DefaultAutocorrectionSettings$observeAutoCapitalizationState$$inlined$filter$1$2$1
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.f.b(r7)
                    goto L_0x004a
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    kotlin.f.b(r7)
                    kotlinx.coroutines.flow.d r7 = r3
                    r2 = r6
                    java.lang.String r2 = (java.lang.String) r2
                    java.lang.String r4 = "settings_autocaps_level"
                    boolean r2 = kotlin.jvm.internal.o.a(r4, r2)
                    if (r2 == 0) goto L_0x004a
                    r0.label = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x004a
                    return r1
                L_0x004a:
                    l2.q r6 = l2.q.f14567a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.data.DefaultAutocorrectionSettings$observeAutoCapitalizationState$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (a4 == a.f()) {
            return a4;
        }
        return q.f14567a;
    }
}
