package a1;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p1.k;

/* renamed from: a1.c  reason: case insensitive filesystem */
final class C0357c {

    /* renamed from: a  reason: collision with root package name */
    private final Map f2222a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final b f2223b = new b();

    /* renamed from: a1.c$a */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        final Lock f2224a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        int f2225b;

        a() {
        }
    }

    /* renamed from: a1.c$b */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Queue f2226a = new ArrayDeque();

        b() {
        }

        /* access modifiers changed from: package-private */
        public a a() {
            a aVar;
            synchronized (this.f2226a) {
                aVar = (a) this.f2226a.poll();
            }
            if (aVar == null) {
                return new a();
            }
            return aVar;
        }

        /* access modifiers changed from: package-private */
        public void b(a aVar) {
            synchronized (this.f2226a) {
                try {
                    if (this.f2226a.size() < 10) {
                        this.f2226a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    C0357c() {
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) this.f2222a.get(str);
                if (aVar == null) {
                    aVar = this.f2223b.a();
                    this.f2222a.put(str, aVar);
                }
                aVar.f2225b++;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        aVar.f2224a.lock();
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.d(this.f2222a.get(str));
                int i4 = aVar.f2225b;
                if (i4 >= 1) {
                    int i5 = i4 - 1;
                    aVar.f2225b = i5;
                    if (i5 == 0) {
                        a aVar2 = (a) this.f2222a.remove(str);
                        if (aVar2.equals(aVar)) {
                            this.f2223b.b(aVar2);
                        } else {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                        }
                    }
                } else {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f2225b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f2224a.unlock();
    }
}
