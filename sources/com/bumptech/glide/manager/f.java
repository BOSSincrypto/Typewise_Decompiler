package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.core.content.a;
import com.bumptech.glide.manager.c;

public class f implements d {
    public c a(Context context, c.a aVar) {
        boolean z3;
        if (a.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Log.isLoggable("ConnectivityMonitor", 3);
        if (z3) {
            return new e(context, aVar);
        }
        return new o();
    }
}
