package B2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.o;
import l2.q;
import v2.C0925a;

final class f extends g implements Iterator, c, C0925a {

    /* renamed from: a  reason: collision with root package name */
    private int f201a;

    /* renamed from: b  reason: collision with root package name */
    private Object f202b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator f203c;

    /* renamed from: d  reason: collision with root package name */
    private c f204d;

    private final Throwable h() {
        int i4 = this.f201a;
        if (i4 == 4) {
            return new NoSuchElementException();
        }
        if (i4 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f201a);
    }

    private final Object i() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public Object d(Object obj, c cVar) {
        this.f202b = obj;
        this.f201a = 3;
        this.f204d = cVar;
        Object f4 = a.f();
        if (f4 == a.f()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        if (f4 == a.f()) {
            return f4;
        }
        return q.f14567a;
    }

    public Object g(Iterator it, c cVar) {
        if (!it.hasNext()) {
            return q.f14567a;
        }
        this.f203c = it;
        this.f201a = 2;
        this.f204d = cVar;
        Object f4 = a.f();
        if (f4 == a.f()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        if (f4 == a.f()) {
            return f4;
        }
        return q.f14567a;
    }

    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public boolean hasNext() {
        while (true) {
            int i4 = this.f201a;
            if (i4 != 0) {
                if (i4 == 1) {
                    Iterator it = this.f203c;
                    o.b(it);
                    if (it.hasNext()) {
                        this.f201a = 2;
                        return true;
                    }
                    this.f203c = null;
                } else if (i4 == 2 || i4 == 3) {
                    return true;
                } else {
                    if (i4 == 4) {
                        return false;
                    }
                    throw h();
                }
            }
            this.f201a = 5;
            c cVar = this.f204d;
            o.b(cVar);
            this.f204d = null;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m1constructorimpl(q.f14567a));
        }
    }

    public final void k(c cVar) {
        this.f204d = cVar;
    }

    public Object next() {
        int i4 = this.f201a;
        if (i4 == 0 || i4 == 1) {
            return i();
        }
        if (i4 == 2) {
            this.f201a = 1;
            Iterator it = this.f203c;
            o.b(it);
            return it.next();
        } else if (i4 == 3) {
            this.f201a = 0;
            Object obj = this.f202b;
            this.f202b = null;
            return obj;
        } else {
            throw h();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void resumeWith(Object obj) {
        kotlin.f.b(obj);
        this.f201a = 4;
    }
}
