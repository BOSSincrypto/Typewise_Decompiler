package ch.icoaching.wrio;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C;
import kotlinx.coroutines.D;
import kotlinx.coroutines.E;
import kotlinx.coroutines.P;
import kotlinx.coroutines.g0;
import kotlinx.coroutines.z0;

public abstract class V {

    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f9079a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ D f9080b;

        a(View view, D d4) {
            this.f9079a = view;
            this.f9080b = d4;
        }

        public void onViewAttachedToWindow(View view) {
            o.e(view, "view");
        }

        public void onViewDetachedFromWindow(View view) {
            o.e(view, "view");
            this.f9079a.removeOnAttachStateChangeListener(this);
            this.f9079a.setTag(919191914, (Object) null);
            E.c(this.f9080b, (CancellationException) null, 1, (Object) null);
        }
    }

    public static final D a(View view) {
        D d4;
        o.e(view, "<this>");
        Object tag = view.getTag(919191914);
        if (tag instanceof D) {
            d4 = (D) tag;
        } else {
            d4 = null;
        }
        if (d4 != null) {
            return d4;
        }
        D a4 = E.a(P.c().plus(z0.b((g0) null, 1, (Object) null)).plus(new C("ViewCoroutineScope")));
        if (androidx.core.view.P.R(view)) {
            view.addOnAttachStateChangeListener(new a(view, a4));
            view.setTag(919191914, a4);
        } else {
            E.c(a4, (CancellationException) null, 1, (Object) null);
        }
        return a4;
    }
}
