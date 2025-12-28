package ch.icoaching.wrio.personalization.dictionary;

import android.content.SharedPreferences;
import android.view.inputmethod.InputConnection;
import c.C0489b;
import e3.c;
import f.C0646a;
import java.lang.ref.WeakReference;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f10586a;

    /* renamed from: b  reason: collision with root package name */
    private final C0489b f10587b;

    /* renamed from: c  reason: collision with root package name */
    private final InputConnection f10588c;

    public b(SharedPreferences sharedPreferences, C0489b bVar, InputConnection inputConnection) {
        this.f10586a = new WeakReference(sharedPreferences);
        this.f10587b = bVar;
        this.f10588c = inputConnection;
    }

    private void a() {
        String string = ((SharedPreferences) this.f10586a.get()).getString("settings_reset", "");
        if (!c.j(string)) {
            ((SharedPreferences) this.f10586a.get()).edit().putString("settings_reset", C0646a.a(c.o(string, "user_dictionary", ""))).apply();
            this.f10588c.commitText("Reset complete", 1);
        }
    }

    public void b() {
        try {
            this.f10587b.r0();
            a();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}
