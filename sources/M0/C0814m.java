package m0;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.o;

/* renamed from: m0.m  reason: case insensitive filesystem */
public abstract class C0814m {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        o.e(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities, int i4) {
        o.e(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i4);
    }

    public static final void c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        o.e(connectivityManager, "<this>");
        o.e(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
