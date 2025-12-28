package ch.icoaching.wrio;

import android.content.SharedPreferences;
import kotlinx.coroutines.channels.n;

public final /* synthetic */ class G implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f9032a;

    public /* synthetic */ G(n nVar) {
        this.f9032a = nVar;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        SharedPreferencesKt$observeChanges$1.g(this.f9032a, sharedPreferences, str);
    }
}
