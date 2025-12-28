package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import kotlin.collections.C0718m;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.E;
import kotlinx.coroutines.F;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.flow.d;
import l2.q;
import u2.l;
import u2.p;

public abstract class ChannelFlow implements h {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineContext f14106a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14107b;

    /* renamed from: c  reason: collision with root package name */
    public final BufferOverflow f14108c;

    public ChannelFlow(CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow) {
        this.f14106a = coroutineContext;
        this.f14107b = i4;
        this.f14108c = bufferOverflow;
    }

    static /* synthetic */ Object e(ChannelFlow channelFlow, d dVar, c cVar) {
        Object d4 = E.d(new ChannelFlow$collect$2(dVar, channelFlow, (c<? super ChannelFlow$collect$2>) null), cVar);
        if (d4 == a.f()) {
            return d4;
        }
        return q.f14567a;
    }

    public Object a(d dVar, c cVar) {
        return e(this, dVar, cVar);
    }

    public kotlinx.coroutines.flow.c b(CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow) {
        CoroutineContext plus = coroutineContext.plus(this.f14106a);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i5 = this.f14107b;
            if (i5 != -3) {
                if (i4 != -3) {
                    if (i5 != -2) {
                        if (i4 != -2) {
                            i4 += i5;
                            if (i4 < 0) {
                                i4 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i4 = i5;
            }
            bufferOverflow = this.f14108c;
        }
        if (o.a(plus, this.f14106a) && i4 == this.f14107b && bufferOverflow == this.f14108c) {
            return this;
        }
        return g(plus, i4, bufferOverflow);
    }

    /* access modifiers changed from: protected */
    public String c() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract Object f(n nVar, c cVar);

    /* access modifiers changed from: protected */
    public abstract ChannelFlow g(CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow);

    public final p h() {
        return new ChannelFlow$collectToFun$1(this, (c<? super ChannelFlow$collectToFun$1>) null);
    }

    public final int i() {
        int i4 = this.f14107b;
        if (i4 == -3) {
            return -2;
        }
        return i4;
    }

    public kotlinx.coroutines.channels.p j(D d4) {
        return ProduceKt.d(d4, this.f14106a, i(), this.f14108c, CoroutineStart.ATOMIC, (l) null, h(), 16, (Object) null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String c4 = c();
        if (c4 != null) {
            arrayList.add(c4);
        }
        if (this.f14106a != EmptyCoroutineContext.INSTANCE) {
            arrayList.add("context=" + this.f14106a);
        }
        if (this.f14107b != -3) {
            arrayList.add("capacity=" + this.f14107b);
        }
        if (this.f14108c != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f14108c);
        }
        return F.a(this) + '[' + C0718m.Z(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null) + ']';
    }
}
