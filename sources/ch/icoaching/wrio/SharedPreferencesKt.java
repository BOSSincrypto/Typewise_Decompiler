package ch.icoaching.wrio;

import android.content.SharedPreferences;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.c;
import kotlinx.coroutines.flow.e;

public abstract class SharedPreferencesKt {
    public static final c a(SharedPreferences sharedPreferences) {
        o.e(sharedPreferences, "<this>");
        return e.b(new SharedPreferencesKt$observeChanges$1(sharedPreferences, (kotlin.coroutines.c<? super SharedPreferencesKt$observeChanges$1>) null));
    }
}
