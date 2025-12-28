package t3;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import ch.icoaching.wrio.data.b;
import ch.icoaching.wrio.subscription.a;
import com.capacitorjs.plugins.haptics.c;
import kotlin.jvm.internal.o;

public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f16373a;

    /* renamed from: b  reason: collision with root package name */
    private final b f16374b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f16375c;

    /* renamed from: d  reason: collision with root package name */
    private final Vibrator f16376d;

    public e(a aVar, b bVar, Context context) {
        Vibrator vibrator;
        o.e(aVar, "subscriptionChecker");
        o.e(bVar, "keyboardSettings");
        o.e(context, "applicationContext");
        this.f16373a = aVar;
        this.f16374b = bVar;
        this.f16375c = context;
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            o.c(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
            vibrator = c.a(systemService).getDefaultVibrator();
            o.b(vibrator);
        } else {
            Object systemService2 = context.getSystemService("vibrator");
            o.c(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
            vibrator = (Vibrator) systemService2;
        }
        this.f16376d = vibrator;
    }

    private final void a() {
        int v3 = this.f16374b.v();
        int i4 = 2;
        if (v3 != 0) {
            if (v3 == 1) {
                i4 = 0;
            } else if (v3 == 2) {
                i4 = 5;
            } else {
                throw new IllegalStateException("Vibration intensity of " + v3 + " is not a valid value.");
            }
        }
        VibrationEffect a4 = VibrationEffect.createPredefined(i4);
        o.d(a4, "createPredefined(...)");
        this.f16376d.vibrate(a4);
    }

    private final void b(int i4) {
        int s4 = this.f16374b.s();
        if (s4 > 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f16376d.vibrate(VibrationEffect.createOneShot((long) (s4 * i4), -1));
                return;
            }
            this.f16376d.vibrate((long) (s4 * i4));
        }
    }

    public void g(int i4) {
        if (this.f16373a.b() && this.f16374b.c()) {
            if (Build.VERSION.SDK_INT >= 29) {
                a();
            } else {
                b(i4);
            }
        }
    }
}
