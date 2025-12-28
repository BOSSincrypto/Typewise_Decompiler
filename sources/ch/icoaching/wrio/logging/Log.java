package ch.icoaching.wrio.logging;

import android.content.Context;
import android.net.Uri;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.g0;

public final class Log {

    /* renamed from: a  reason: collision with root package name */
    public static final Log f10572a = new Log();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f10573b;

    /* renamed from: c  reason: collision with root package name */
    private static D f10574c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static LogFile f10575d;

    private Log() {
    }

    public static /* synthetic */ void d(Log log, String str, String str2, Throwable th, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        log.c(str, str2, th);
    }

    public static /* synthetic */ void f(Log log, String str, String str2, Throwable th, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        log.e(str, str2, th);
    }

    public static /* synthetic */ void i(Log log, String str, String str2, Throwable th, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        log.h(str, str2, th);
    }

    private final void k(int i4, String str, String str2, Throwable th) {
        D d4;
        if (f10573b && (d4 = f10574c) != null) {
            g0 unused = C0739h.d(d4, (CoroutineContext) null, (CoroutineStart) null, new Log$log$1(i4, str, str2, th, (c<? super Log$log$1>) null), 3, (Object) null);
        }
        if (i4 == 5) {
            android.util.Log.w(str, str2, th);
        } else if (i4 == 6) {
            android.util.Log.e(str, str2, th);
        } else if (i4 == 7) {
            android.util.Log.wtf(str, str2, th);
        }
    }

    public static /* synthetic */ void n(Log log, String str, String str2, Throwable th, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        log.m(str, str2, th);
    }

    public static /* synthetic */ void p(Log log, String str, String str2, Throwable th, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            th = null;
        }
        log.o(str, str2, th);
    }

    public final void b() {
        LogFile logFile = f10575d;
        if (logFile != null) {
            logFile.e();
        }
    }

    public final void c(String str, String str2, Throwable th) {
        o.e(str, "tag");
        o.e(str2, "msg");
        k(3, str, str2, th);
    }

    public final void e(String str, String str2, Throwable th) {
        o.e(str, "tag");
        o.e(str2, "msg");
        k(6, str, str2, th);
    }

    public final Uri g() {
        Uri f4;
        LogFile logFile = f10575d;
        if (logFile != null && (f4 = logFile.f()) != null) {
            return f4;
        }
        Uri uri = Uri.EMPTY;
        o.d(uri, "EMPTY");
        return uri;
    }

    public final void h(String str, String str2, Throwable th) {
        o.e(str, "tag");
        o.e(str2, "msg");
        k(4, str, str2, th);
    }

    public final void j(Context context, D d4, CoroutineDispatcher coroutineDispatcher) {
        o.e(context, "applicationContext");
        o.e(d4, "coroutineScope");
        o.e(coroutineDispatcher, "ioDispatcher");
        f10574c = d4;
        f10575d = new LogFile(context, coroutineDispatcher);
    }

    public final void l(boolean z3) {
        f10573b = z3;
    }

    public final void m(String str, String str2, Throwable th) {
        o.e(str, "tag");
        o.e(str2, "msg");
        k(2, str, str2, th);
    }

    public final void o(String str, String str2, Throwable th) {
        o.e(str, "tag");
        o.e(str2, "msg");
        k(5, str, str2, th);
    }
}
