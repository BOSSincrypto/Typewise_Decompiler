package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Result;
import kotlin.f;
import kotlin.jvm.internal.i;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f14031a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        d dVar = null;
        try {
            Result.a aVar = Result.Companion;
            obj = Result.m1constructorimpl(new HandlerContext(a(Looper.getMainLooper(), true), (String) null, 2, (i) null));
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            obj = Result.m1constructorimpl(f.a(th));
        }
        if (!Result.m7isFailureimpl(obj)) {
            dVar = obj;
        }
        f14031a = dVar;
    }

    public static final Handler a(Looper looper, boolean z3) {
        if (!z3) {
            return new Handler(looper);
        }
        Class<Looper> cls = Looper.class;
        Class<Handler> cls2 = Handler.class;
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = cls2.getDeclaredMethod("createAsync", new Class[]{cls}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            return cls2.getDeclaredConstructor(new Class[]{cls, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
