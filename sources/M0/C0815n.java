package m0;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.o;

/* renamed from: m0.n  reason: case insensitive filesystem */
public abstract class C0815n {
    public static final Network a(ConnectivityManager connectivityManager) {
        o.e(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
