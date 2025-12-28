package retrofit2;

import android.os.Build;
import java.util.concurrent.Executor;
import retrofit2.C0876c;
import retrofit2.D;

abstract class B {

    /* renamed from: a  reason: collision with root package name */
    static final Executor f16104a;

    /* renamed from: b  reason: collision with root package name */
    static final D f16105b;

    /* renamed from: c  reason: collision with root package name */
    static final C0876c f16106c;

    static {
        String property = System.getProperty("java.vm.name");
        property.hashCode();
        if (property.equals("RoboVM")) {
            f16104a = null;
            f16105b = new D();
            f16106c = new C0876c();
        } else if (!property.equals("Dalvik")) {
            f16104a = null;
            f16105b = new D.b();
            f16106c = new C0876c.a();
        } else {
            f16104a = new C0874a();
            if (Build.VERSION.SDK_INT >= 24) {
                f16105b = new D.a();
                f16106c = new C0876c.a();
                return;
            }
            f16105b = new D();
            f16106c = new C0876c();
        }
    }
}
