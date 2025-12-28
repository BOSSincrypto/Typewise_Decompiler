package k0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.core.net.a;
import androidx.work.m;
import i0.C0678b;
import kotlin.jvm.internal.o;
import m0.C0814m;
import m0.C0815n;
import n0.c;

/* renamed from: k0.k  reason: case insensitive filesystem */
public abstract class C0703k {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f13796a;

    static {
        String i4 = m.i("NetworkStateTracker");
        o.d(i4, "tagWithPrefix(\"NetworkStateTracker\")");
        f13796a = i4;
    }

    public static final C0700h a(Context context, c cVar) {
        o.e(context, "context");
        o.e(cVar, "taskExecutor");
        if (Build.VERSION.SDK_INT >= 24) {
            return new C0702j(context, cVar);
        }
        return new l(context, cVar);
    }

    public static final C0678b c(ConnectivityManager connectivityManager) {
        boolean z3;
        o.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z4 = false;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean d4 = d(connectivityManager);
        boolean a4 = a.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z4 = true;
        }
        return new C0678b(z3, d4, a4, z4);
    }

    public static final boolean d(ConnectivityManager connectivityManager) {
        o.e(connectivityManager, "<this>");
        try {
            NetworkCapabilities a4 = C0814m.a(connectivityManager, C0815n.a(connectivityManager));
            if (a4 != null) {
                return C0814m.b(a4, 16);
            }
            return false;
        } catch (SecurityException e4) {
            m.e().d(f13796a, "Unable to validate active network", e4);
            return false;
        }
    }
}
