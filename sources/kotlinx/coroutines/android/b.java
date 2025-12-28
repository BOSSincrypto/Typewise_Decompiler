package kotlinx.coroutines.android;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import kotlinx.coroutines.C0761z;

public final class b extends a implements C0761z {
    private volatile Object _preHandler = this;

    public b() {
        super(C0761z.f14322s);
    }

    private final Method p0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", (Class[]) null);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    public void e0(CoroutineContext coroutineContext, Throwable th) {
        Object obj;
        int i4 = Build.VERSION.SDK_INT;
        if (26 <= i4 && i4 < 28) {
            Method p02 = p0();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (p02 != null) {
                obj = p02.invoke((Object) null, (Object[]) null);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
