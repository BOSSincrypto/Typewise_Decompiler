package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.F;
import androidx.work.m;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7241a = m.i("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        m e4 = m.e();
        String str = f7241a;
        e4.a(str, "Received intent " + intent);
        try {
            F.p(context).z(goAsync());
        } catch (IllegalStateException e5) {
            m.e().d(f7241a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e5);
        }
    }
}
