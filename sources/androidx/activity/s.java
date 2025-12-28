package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.o;

public abstract class s {
    public static final void a(View view, n nVar) {
        o.e(view, "<this>");
        o.e(nVar, "fullyDrawnReporterOwner");
        view.setTag(r.report_drawn, nVar);
    }
}
