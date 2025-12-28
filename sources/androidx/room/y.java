package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;
import l2.q;

public final class y implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f6895a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque f6896b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private Runnable f6897c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f6898d = new Object();

    public y(Executor executor) {
        o.e(executor, "executor");
        this.f6895a = executor;
    }

    /* access modifiers changed from: private */
    public static final void b(Runnable runnable, y yVar) {
        o.e(runnable, "$command");
        o.e(yVar, "this$0");
        try {
            runnable.run();
        } finally {
            yVar.c();
        }
    }

    public final void c() {
        synchronized (this.f6898d) {
            try {
                Object poll = this.f6896b.poll();
                Runnable runnable = (Runnable) poll;
                this.f6897c = runnable;
                if (poll != null) {
                    this.f6895a.execute(runnable);
                }
                q qVar = q.f14567a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void execute(Runnable runnable) {
        o.e(runnable, "command");
        synchronized (this.f6898d) {
            try {
                this.f6896b.offer(new x(runnable, this));
                if (this.f6897c == null) {
                    c();
                }
                q qVar = q.f14567a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
