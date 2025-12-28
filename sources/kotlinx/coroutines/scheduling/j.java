package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.F;

public final class j extends g {

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f14265c;

    public j(Runnable runnable, long j4, h hVar) {
        super(j4, hVar);
        this.f14265c = runnable;
    }

    public void run() {
        try {
            this.f14265c.run();
        } finally {
            this.f14263b.a();
        }
    }

    public String toString() {
        return "Task[" + F.a(this.f14265c) + '@' + F.b(this.f14265c) + ", " + this.f14262a + ", " + this.f14263b + ']';
    }
}
