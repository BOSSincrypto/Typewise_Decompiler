package okhttp3;

import Q2.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l2.q;
import okhttp3.internal.connection.e;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private int f15466a = 64;

    /* renamed from: b  reason: collision with root package name */
    private int f15467b = 5;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f15468c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f15469d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque f15470e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque f15471f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque f15472g = new ArrayDeque();

    private final e.a c(String str) {
        Iterator it = this.f15471f.iterator();
        while (it.hasNext()) {
            e.a aVar = (e.a) it.next();
            if (kotlin.jvm.internal.o.a(aVar.d(), str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f15470e.iterator();
        while (it2.hasNext()) {
            e.a aVar2 = (e.a) it2.next();
            if (kotlin.jvm.internal.o.a(aVar2.d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    private final void d(Deque deque, Object obj) {
        Runnable f4;
        synchronized (this) {
            if (deque.remove(obj)) {
                f4 = f();
                q qVar = q.f14567a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!i() && f4 != null) {
            f4.run();
        }
    }

    private final boolean i() {
        int i4;
        boolean z3;
        if (!d.f1353h || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    Iterator it = this.f15470e.iterator();
                    kotlin.jvm.internal.o.d(it, "readyAsyncCalls.iterator()");
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        e.a aVar = (e.a) it.next();
                        if (this.f15471f.size() >= g()) {
                            break;
                        } else if (aVar.c().get() < h()) {
                            it.remove();
                            aVar.c().incrementAndGet();
                            kotlin.jvm.internal.o.d(aVar, "asyncCall");
                            arrayList.add(aVar);
                            this.f15471f.add(aVar);
                        }
                    }
                    if (j() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    q qVar = q.f14567a;
                } finally {
                }
            }
            int size = arrayList.size();
            for (i4 = 0; i4 < size; i4++) {
                ((e.a) arrayList.get(i4)).a(b());
            }
            return z3;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void a(e.a aVar) {
        e.a c4;
        kotlin.jvm.internal.o.e(aVar, "call");
        synchronized (this) {
            try {
                this.f15470e.add(aVar);
                if (!aVar.b().r() && (c4 = c(aVar.d())) != null) {
                    aVar.e(c4);
                }
                q qVar = q.f14567a;
            } catch (Throwable th) {
                throw th;
            }
        }
        i();
    }

    public final synchronized ExecutorService b() {
        ExecutorService executorService;
        try {
            if (this.f15469d == null) {
                this.f15469d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), d.M(kotlin.jvm.internal.o.k(d.f1354i, " Dispatcher"), false));
            }
            executorService = this.f15469d;
            kotlin.jvm.internal.o.b(executorService);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return executorService;
    }

    public final void e(e.a aVar) {
        kotlin.jvm.internal.o.e(aVar, "call");
        aVar.c().decrementAndGet();
        d(this.f15471f, aVar);
    }

    public final synchronized Runnable f() {
        return this.f15468c;
    }

    public final synchronized int g() {
        return this.f15466a;
    }

    public final synchronized int h() {
        return this.f15467b;
    }

    public final synchronized int j() {
        return this.f15471f.size() + this.f15472g.size();
    }
}
