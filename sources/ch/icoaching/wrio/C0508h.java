package ch.icoaching.wrio;

import android.content.SharedPreferences;

/* renamed from: ch.icoaching.wrio.h  reason: case insensitive filesystem */
public final /* synthetic */ class C0508h implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseInputMethodService f9645a;

    public /* synthetic */ C0508h(BaseInputMethodService baseInputMethodService) {
        this.f9645a = baseInputMethodService;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        BaseInputMethodService.j(this.f9645a, sharedPreferences, str);
    }
}
