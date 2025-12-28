package kotlinx.coroutines;

import B2.h;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.f;
import l2.C0793c;
import l2.q;

public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    private static final List f13983a;

    static {
        Class<C0761z> cls = C0761z.class;
        f13983a = h.o(h.c(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        for (C0761z e02 : f13983a) {
            try {
                e02.e0(coroutineContext, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, B.b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            Result.a aVar = Result.Companion;
            C0793c.a(th, new DiagnosticCoroutineContextException(coroutineContext));
            Result.m1constructorimpl(q.f14567a);
        } catch (Throwable th3) {
            Result.a aVar2 = Result.Companion;
            Result.m1constructorimpl(f.a(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
