package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.F;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.m;
import m0.C0818q;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    static final String f7236a = m.i("ConstrntProxyUpdtRecvr");

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f7237a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f7238b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f7239c;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f7237a = intent;
            this.f7238b = context;
            this.f7239c = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f7237a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f7237a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f7237a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f7237a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                m.e().a(ConstraintProxyUpdateReceiver.f7236a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                C0818q.a(this.f7238b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C0818q.a(this.f7238b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C0818q.a(this.f7238b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C0818q.a(this.f7238b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f7239c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z4).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z5).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z6);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            m e4 = m.e();
            String str2 = f7236a;
            e4.a(str2, "Ignoring unknown action " + str);
            return;
        }
        F.p(context).v().c(new a(intent, context, goAsync()));
    }
}
