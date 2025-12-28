package ch.icoaching.wrio;

import android.content.SharedPreferences;
import u2.C0906a;

public final /* synthetic */ class H implements C0906a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f9033a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences.OnSharedPreferenceChangeListener f9034b;

    public /* synthetic */ H(SharedPreferences sharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f9033a = sharedPreferences;
        this.f9034b = onSharedPreferenceChangeListener;
    }

    public final Object invoke() {
        return SharedPreferencesKt$observeChanges$1.h(this.f9033a, this.f9034b);
    }
}
