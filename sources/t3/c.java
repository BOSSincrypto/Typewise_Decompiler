package t3;

import android.content.Context;
import android.media.AudioManager;
import ch.icoaching.wrio.data.b;
import ch.icoaching.wrio.logging.Log;
import ch.icoaching.wrio.subscription.a;
import kotlin.jvm.internal.o;
import l2.f;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final a f16369a;

    /* renamed from: b  reason: collision with root package name */
    private final b f16370b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f16371c;

    /* renamed from: d  reason: collision with root package name */
    private final f f16372d = kotlin.c.b(new b(this));

    public c(a aVar, b bVar, Context context) {
        o.e(aVar, "subscriptionChecker");
        o.e(bVar, "keyboardSettings");
        o.e(context, "applicationContext");
        this.f16369a = aVar;
        this.f16370b = bVar;
        this.f16371c = context;
    }

    /* access modifiers changed from: private */
    public static final AudioManager c(c cVar) {
        Object systemService = cVar.f16371c.getSystemService("audio");
        o.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    private final AudioManager d() {
        return (AudioManager) this.f16372d.getValue();
    }

    public void a() {
        if (!this.f16369a.b() || !this.f16370b.L()) {
            Log.d(Log.f10572a, "DefaultAudioService", "Not playing default keyboard click sound event", (Throwable) null, 4, (Object) null);
            return;
        }
        float streamVolume = (float) d().getStreamVolume(1);
        float f4 = streamVolume / 3.0f;
        Log log = Log.f10572a;
        Log.d(log, "DefaultAudioService", "Input " + streamVolume + ", calculated output " + f4, (Throwable) null, 4, (Object) null);
        d().playSoundEffect(5, f4);
    }
}
