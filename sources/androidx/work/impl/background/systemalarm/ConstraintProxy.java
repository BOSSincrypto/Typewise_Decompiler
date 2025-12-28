package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.NetworkType;
import androidx.work.b;
import androidx.work.m;
import java.util.Iterator;
import java.util.List;
import l0.v;

abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7235a = m.i("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    static void a(Context context, List list) {
        boolean z3;
        Iterator it = list.iterator();
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (it.hasNext()) {
            b bVar = ((v) it.next()).f14479j;
            z4 |= bVar.f();
            z5 |= bVar.g();
            z6 |= bVar.i();
            if (bVar.d() != NetworkType.NOT_REQUIRED) {
                z3 = true;
            } else {
                z3 = false;
            }
            z7 |= z3;
            if (z4 && z5 && z6 && z7) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, z4, z5, z6, z7));
    }

    public void onReceive(Context context, Intent intent) {
        m e4 = m.e();
        String str = f7235a;
        e4.a(str, "onReceive : " + intent);
        context.startService(b.a(context));
    }
}
