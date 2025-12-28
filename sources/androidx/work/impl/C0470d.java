package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.f;
import androidx.work.s;

/* renamed from: androidx.work.impl.d  reason: case insensitive filesystem */
public class C0470d implements s {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f7300a = f.a(Looper.getMainLooper());

    public void a(long j4, Runnable runnable) {
        this.f7300a.postDelayed(runnable, j4);
    }

    public void b(Runnable runnable) {
        this.f7300a.removeCallbacks(runnable);
    }
}
