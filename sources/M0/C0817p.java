package m0;

import android.net.ConnectivityManager;
import kotlin.jvm.internal.o;

/* renamed from: m0.p  reason: case insensitive filesystem */
public abstract class C0817p {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        o.e(connectivityManager, "<this>");
        o.e(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
