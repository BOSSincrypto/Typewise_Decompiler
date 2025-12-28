package m0;

import android.app.Application;
import kotlin.jvm.internal.o;

/* renamed from: m0.a  reason: case insensitive filesystem */
final class C0802a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0802a f14601a = new C0802a();

    private C0802a() {
    }

    public final String a() {
        String processName = Application.getProcessName();
        o.d(processName, "getProcessName()");
        return processName;
    }
}
