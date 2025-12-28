package ch.icoaching.wrio.util;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.o;
import o2.C0840a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lch/icoaching/wrio/util/DirectExecutor;", "Ljava/util/concurrent/Executor;", "", "<init>", "(Ljava/lang/String;I)V", "Ljava/lang/Runnable;", "command", "Ll2/q;", "execute", "(Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "INSTANCE", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
enum DirectExecutor implements Executor {
    INSTANCE;

    static {
        DirectExecutor[] a4;
        f10686b = a.a(a4);
    }

    public static C0840a getEntries() {
        return f10686b;
    }

    public void execute(Runnable runnable) {
        o.e(runnable, "command");
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
