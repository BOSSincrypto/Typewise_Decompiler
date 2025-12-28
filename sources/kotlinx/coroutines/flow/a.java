package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.D;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.l;
import l2.q;

final class a extends ChannelFlow {

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f14102f = AtomicIntegerFieldUpdater.newUpdater(a.class, "consumed");
    private volatile /* synthetic */ int consumed;

    /* renamed from: d  reason: collision with root package name */
    private final p f14103d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f14104e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(p pVar, boolean z3, CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow, int i5, i iVar) {
        this(pVar, z3, (i5 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i5 & 8) != 0 ? -3 : i4, (i5 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    private final void k() {
        if (this.f14104e && f14102f.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    public Object a(d dVar, c cVar) {
        if (this.f14107b == -3) {
            k();
            Object a4 = FlowKt__ChannelsKt.d(dVar, this.f14103d, this.f14104e, cVar);
            if (a4 == kotlin.coroutines.intrinsics.a.f()) {
                return a4;
            }
            return q.f14567a;
        }
        Object a5 = super.a(dVar, cVar);
        if (a5 == kotlin.coroutines.intrinsics.a.f()) {
            return a5;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "channel=" + this.f14103d;
    }

    /* access modifiers changed from: protected */
    public Object f(n nVar, c cVar) {
        Object a4 = FlowKt__ChannelsKt.d(new l(nVar), this.f14103d, this.f14104e, cVar);
        if (a4 == kotlin.coroutines.intrinsics.a.f()) {
            return a4;
        }
        return q.f14567a;
    }

    /* access modifiers changed from: protected */
    public ChannelFlow g(CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow) {
        return new a(this.f14103d, this.f14104e, coroutineContext, i4, bufferOverflow);
    }

    public p j(D d4) {
        k();
        if (this.f14107b == -3) {
            return this.f14103d;
        }
        return super.j(d4);
    }

    public a(p pVar, boolean z3, CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow) {
        super(coroutineContext, i4, bufferOverflow);
        this.f14103d = pVar;
        this.f14104e = z3;
        this.consumed = 0;
    }
}
