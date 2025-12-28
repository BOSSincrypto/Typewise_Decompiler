package retrofit2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: retrofit2.a  reason: case insensitive filesystem */
final class C0874a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f16196a = new Handler(Looper.getMainLooper());

    C0874a() {
    }

    public void execute(Runnable runnable) {
        this.f16196a.post(runnable);
    }
}
