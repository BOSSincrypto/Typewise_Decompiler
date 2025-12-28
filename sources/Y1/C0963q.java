package y1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import x1.C0935a;

/* renamed from: y1.q  reason: case insensitive filesystem */
final class C0963q implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f16486a = new C0935a(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f16486a.post(runnable);
    }
}
