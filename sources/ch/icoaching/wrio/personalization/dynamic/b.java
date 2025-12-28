package ch.icoaching.wrio.personalization.dynamic;

import android.content.SharedPreferences;
import android.view.inputmethod.InputConnection;
import c.C0489b;
import e3.c;
import f.C0646a;
import java.lang.ref.WeakReference;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f10600a;

    /* renamed from: b  reason: collision with root package name */
    private final C0489b f10601b;

    /* renamed from: c  reason: collision with root package name */
    private final InputConnection f10602c;

    public b(SharedPreferences sharedPreferences, C0489b bVar, InputConnection inputConnection) {
        this.f10600a = new WeakReference(sharedPreferences);
        this.f10601b = bVar;
        this.f10602c = inputConnection;
    }

    private void a() {
        String string = ((SharedPreferences) this.f10600a.get()).getString("settings_reset", "");
        if (!c.j(string)) {
            ((SharedPreferences) this.f10600a.get()).edit().putString("settings_reset", C0646a.a(c.o(string, "dynamic_layout", ""))).apply();
            this.f10602c.commitText("Reset complete", 1);
        }
    }

    public void b() {
        try {
            this.f10601b.p0();
            a();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}
