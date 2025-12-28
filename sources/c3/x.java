package c3;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public class x {

    /* renamed from: d  reason: collision with root package name */
    public static final b f7696d = new b((i) null);

    /* renamed from: e  reason: collision with root package name */
    public static final x f7697e = new a();

    /* renamed from: a  reason: collision with root package name */
    private boolean f7698a;

    /* renamed from: b  reason: collision with root package name */
    private long f7699b;

    /* renamed from: c  reason: collision with root package name */
    private long f7700c;

    public static final class a extends x {
        a() {
        }

        public x d(long j4) {
            return this;
        }

        public void f() {
        }

        public x g(long j4, TimeUnit timeUnit) {
            o.e(timeUnit, "unit");
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        private b() {
        }
    }

    public x a() {
        this.f7698a = false;
        return this;
    }

    public x b() {
        this.f7700c = 0;
        return this;
    }

    public long c() {
        if (this.f7698a) {
            return this.f7699b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x d(long j4) {
        this.f7698a = true;
        this.f7699b = j4;
        return this;
    }

    public boolean e() {
        return this.f7698a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.f7698a && this.f7699b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j4, TimeUnit timeUnit) {
        o.e(timeUnit, "unit");
        if (j4 >= 0) {
            this.f7700c = timeUnit.toNanos(j4);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j4).toString());
    }

    public long h() {
        return this.f7700c;
    }
}
