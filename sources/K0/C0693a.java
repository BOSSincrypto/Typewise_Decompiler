package k0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.m;
import kotlin.jvm.internal.o;
import n0.c;

/* renamed from: k0.a  reason: case insensitive filesystem */
public final class C0693a extends C0697e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0693a(Context context, c cVar) {
        super(context, cVar);
        o.e(context, "context");
        o.e(cVar, "taskExecutor");
    }

    private final boolean m(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    public void k(Intent intent) {
        o.e(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            m e4 = m.e();
            String a4 = C0694b.f13780a;
            e4.a(a4, "Received " + action);
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        g(Boolean.FALSE);
                        return;
                    }
                    return;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        g(Boolean.FALSE);
                        return;
                    }
                    return;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        g(Boolean.TRUE);
                        return;
                    }
                    return;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        g(Boolean.TRUE);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: l */
    public Boolean e() {
        Intent registerReceiver = d().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(m(registerReceiver));
        }
        m.e().c(C0694b.f13780a, "getInitialState - null intent received");
        return Boolean.FALSE;
    }
}
