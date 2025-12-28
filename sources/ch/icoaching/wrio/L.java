package ch.icoaching.wrio;

import java.lang.Thread;

public final /* synthetic */ class L implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TypewiseApplication f9040a;

    public /* synthetic */ L(TypewiseApplication typewiseApplication) {
        this.f9040a = typewiseApplication;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        TypewiseApplication.m(this.f9040a, thread, th);
    }
}
