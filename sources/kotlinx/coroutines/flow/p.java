package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.c;

public final class p extends c {

    /* renamed from: a  reason: collision with root package name */
    public long f14134a = -1;

    /* renamed from: b  reason: collision with root package name */
    public kotlin.coroutines.c f14135b;

    /* renamed from: c */
    public boolean a(SharedFlowImpl sharedFlowImpl) {
        if (this.f14134a >= 0) {
            return false;
        }
        this.f14134a = sharedFlowImpl.U();
        return true;
    }

    /* renamed from: d */
    public kotlin.coroutines.c[] b(SharedFlowImpl sharedFlowImpl) {
        long j4 = this.f14134a;
        this.f14134a = -1;
        this.f14135b = null;
        return sharedFlowImpl.T(j4);
    }
}
