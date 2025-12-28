package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import kotlin.coroutines.b;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.internal.f;
import kotlinx.coroutines.internal.j;

public abstract class CoroutineDispatcher extends a implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final Key f13989b = new Key((i) null);

    public static final class Key extends b {
        public /* synthetic */ Key(i iVar) {
            this();
        }

        private Key() {
            super(d.f13873r, AnonymousClass1.INSTANCE);
        }
    }

    public CoroutineDispatcher() {
        super(d.f13873r);
    }

    public CoroutineContext.a get(CoroutineContext.b bVar) {
        return d.a.a(this, bVar);
    }

    public final void h(c cVar) {
        ((f) cVar).r();
    }

    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return d.a.b(this, bVar);
    }

    public final c o(c cVar) {
        return new f(this, cVar);
    }

    public abstract void p0(CoroutineContext coroutineContext, Runnable runnable);

    public boolean q0(CoroutineContext coroutineContext) {
        return true;
    }

    public CoroutineDispatcher r0(int i4) {
        j.a(i4);
        return new kotlinx.coroutines.internal.i(this, i4);
    }

    public String toString() {
        return F.a(this) + '@' + F.b(this);
    }
}
