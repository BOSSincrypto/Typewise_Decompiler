package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.o;

public abstract class t {
    public static final void a(View view, q qVar) {
        o.e(view, "<this>");
        o.e(qVar, "onBackPressedDispatcherOwner");
        view.setTag(r.f2389b, qVar);
    }
}
