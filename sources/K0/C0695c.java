package k0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.m;
import kotlin.jvm.internal.o;
import n0.c;

/* renamed from: k0.c  reason: case insensitive filesystem */
public final class C0695c extends C0697e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0695c(Context context, c cVar) {
        super(context, cVar);
        o.e(context, "context");
        o.e(cVar, "taskExecutor");
    }

    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    public void k(Intent intent) {
        o.e(intent, "intent");
        if (intent.getAction() != null) {
            m e4 = m.e();
            String a4 = C0696d.f13781a;
            e4.a(a4, "Received " + intent.getAction());
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1980154005) {
                    if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                        g(Boolean.FALSE);
                    }
                } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    g(Boolean.TRUE);
                }
            }
        }
    }

    /* renamed from: l */
    public Boolean e() {
        Intent registerReceiver = d().registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            m.e().c(C0696d.f13781a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        boolean z3 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
