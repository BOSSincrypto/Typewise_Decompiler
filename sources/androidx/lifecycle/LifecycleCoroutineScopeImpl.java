package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0010X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/i;", "Landroidx/lifecycle/k;", "Landroidx/lifecycle/m;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Ll2/q;", "c", "(Landroidx/lifecycle/m;Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/Lifecycle;", "a", "Landroidx/lifecycle/Lifecycle;", "e", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "g", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LifecycleCoroutineScopeImpl extends C0459i implements C0461k {

    /* renamed from: a  reason: collision with root package name */
    private final Lifecycle f6016a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineContext f6017b;

    public void c(m mVar, Lifecycle.Event event) {
        o.e(mVar, "source");
        o.e(event, "event");
        if (e().b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            e().c(this);
            k0.d(g(), (CancellationException) null, 1, (Object) null);
        }
    }

    public Lifecycle e() {
        return this.f6016a;
    }

    public CoroutineContext g() {
        return this.f6017b;
    }
}
