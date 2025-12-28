package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.i;

/* renamed from: kotlinx.coroutines.v  reason: case insensitive filesystem */
public class C0757v {

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f14315b = AtomicIntegerFieldUpdater.newUpdater(C0757v.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f14316a;

    public C0757v(Throwable th, boolean z3) {
        this.f14316a = th;
        this._handled = z3 ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return f14315b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return F.a(this) + '[' + this.f14316a + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0757v(Throwable th, boolean z3, int i4, i iVar) {
        this(th, (i4 & 2) != 0 ? false : z3);
    }
}
