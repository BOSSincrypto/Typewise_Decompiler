package androidx.recyclerview.widget;

import androidx.recyclerview.widget.h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f6500a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f6501b;

    /* renamed from: c  reason: collision with root package name */
    private final h.f f6502c;

    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        private static final Object f6503d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private static Executor f6504e;

        /* renamed from: a  reason: collision with root package name */
        private Executor f6505a;

        /* renamed from: b  reason: collision with root package name */
        private Executor f6506b;

        /* renamed from: c  reason: collision with root package name */
        private final h.f f6507c;

        public a(h.f fVar) {
            this.f6507c = fVar;
        }

        public c a() {
            if (this.f6506b == null) {
                synchronized (f6503d) {
                    try {
                        if (f6504e == null) {
                            f6504e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                this.f6506b = f6504e;
            }
            return new c(this.f6505a, this.f6506b, this.f6507c);
        }
    }

    c(Executor executor, Executor executor2, h.f fVar) {
        this.f6500a = executor;
        this.f6501b = executor2;
        this.f6502c = fVar;
    }

    public Executor a() {
        return this.f6501b;
    }

    public h.f b() {
        return this.f6502c;
    }

    public Executor c() {
        return this.f6500a;
    }
}
