package ch.icoaching.wrio.subscription;

import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.flow.c;
import kotlinx.coroutines.flow.d;
import l2.q;

public final class TypewiseSubscriptionChecker$observeSubscriptionStatusChanges$$inlined$map$1 implements c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f10640a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TypewiseSubscriptionChecker f10641b;

    public TypewiseSubscriptionChecker$observeSubscriptionStatusChanges$$inlined$map$1(c cVar, TypewiseSubscriptionChecker typewiseSubscriptionChecker) {
        this.f10640a = cVar;
        this.f10641b = typewiseSubscriptionChecker;
    }

    public Object a(final d dVar, kotlin.coroutines.c cVar) {
        c cVar2 = this.f10640a;
        final TypewiseSubscriptionChecker typewiseSubscriptionChecker = this.f10641b;
        Object a4 = cVar2.a(new d() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.c r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof ch.icoaching.wrio.subscription.TypewiseSubscriptionChecker$observeSubscriptionStatusChanges$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    ch.icoaching.wrio.subscription.TypewiseSubscriptionChecker$observeSubscriptionStatusChanges$$inlined$map$1$2$1 r0 = (ch.icoaching.wrio.subscription.TypewiseSubscriptionChecker$observeSubscriptionStatusChanges$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    ch.icoaching.wrio.subscription.TypewiseSubscriptionChecker$observeSubscriptionStatusChanges$$inlined$map$1$2$1 r0 = new ch.icoaching.wrio.subscription.TypewiseSubscriptionChecker$observeSubscriptionStatusChanges$$inlined$map$1$2$1
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    kotlin.f.b(r8)
                    goto L_0x00c1
                L_0x002a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0032:
                    kotlin.f.b(r8)
                    kotlinx.coroutines.flow.d r8 = r4
                    java.lang.String r7 = (java.lang.String) r7
                    if (r7 == 0) goto L_0x00ae
                    int r2 = r7.hashCode()
                    switch(r2) {
                        case -1159686523: goto L_0x009c;
                        case -1130985444: goto L_0x0089;
                        case -500652216: goto L_0x0072;
                        case -318452137: goto L_0x005b;
                        case -63216618: goto L_0x0044;
                        default: goto L_0x0042;
                    }
                L_0x0042:
                    goto L_0x00ae
                L_0x0044:
                    java.lang.String r2 = "PurchaseValidationInfoDate"
                    boolean r7 = r7.equals(r2)
                    if (r7 != 0) goto L_0x004d
                    goto L_0x00ae
                L_0x004d:
                    ch.icoaching.wrio.subscription.TypewiseSubscriptionChecker r7 = r2
                    i2.a r2 = r7.f10630a
                    long r4 = r2.M0()
                    r7.f10637h = r4
                    goto L_0x00ae
                L_0x005b:
                    java.lang.String r2 = "premium"
                    boolean r7 = r7.equals(r2)
                    if (r7 != 0) goto L_0x0064
                    goto L_0x00ae
                L_0x0064:
                    ch.icoaching.wrio.subscription.TypewiseSubscriptionChecker r7 = r2
                    i2.a r2 = r7.f10630a
                    boolean r2 = r2.l()
                    r7.f10634e = r2
                    goto L_0x00ae
                L_0x0072:
                    java.lang.String r2 = "appnomix_mode"
                    boolean r7 = r7.equals(r2)
                    if (r7 != 0) goto L_0x007b
                    goto L_0x00ae
                L_0x007b:
                    ch.icoaching.wrio.subscription.TypewiseSubscriptionChecker r7 = r2
                    I0.b r2 = r7.f10631b
                    boolean r2 = r2.h()
                    r7.f10633d = r2
                    goto L_0x00ae
                L_0x0089:
                    java.lang.String r2 = "subscription_expiration_date"
                    boolean r7 = r7.equals(r2)
                    if (r7 != 0) goto L_0x0092
                    goto L_0x00ae
                L_0x0092:
                    ch.icoaching.wrio.subscription.TypewiseSubscriptionChecker r7 = r2
                    long r4 = r7.n()
                    r7.f10636g = r4
                    goto L_0x00ae
                L_0x009c:
                    java.lang.String r2 = "inapp_product_ids"
                    boolean r7 = r7.equals(r2)
                    if (r7 != 0) goto L_0x00a5
                    goto L_0x00ae
                L_0x00a5:
                    ch.icoaching.wrio.subscription.TypewiseSubscriptionChecker r7 = r2
                    boolean r2 = r7.o()
                    r7.f10635f = r2
                L_0x00ae:
                    ch.icoaching.wrio.subscription.TypewiseSubscriptionChecker r7 = r2
                    boolean r7 = r7.b()
                    java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.a.a(r7)
                    r0.label = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x00c1
                    return r1
                L_0x00c1:
                    l2.q r7 = l2.q.f14567a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.subscription.TypewiseSubscriptionChecker$observeSubscriptionStatusChanges$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (a4 == a.f()) {
            return a4;
        }
        return q.f14567a;
    }
}
