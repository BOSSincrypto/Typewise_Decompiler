package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.WorkManager;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.m;
import androidx.work.n;

public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7301a = m.i("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            m.e().a(f7301a, "Requesting diagnostics");
            try {
                WorkManager.g(context).b(n.e(DiagnosticsWorker.class));
            } catch (IllegalStateException e4) {
                m.e().d(f7301a, "WorkManager is not initialized", e4);
            }
        }
    }
}
