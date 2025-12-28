package Y1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private ReentrantReadWriteLock f2019a = new ReentrantReadWriteLock();

    public void a() {
        this.f2019a.readLock().lock();
    }

    public void b() {
        this.f2019a.writeLock().lock();
    }

    public void c() {
        this.f2019a.readLock().unlock();
    }

    public void d() {
        this.f2019a.writeLock().unlock();
    }
}
