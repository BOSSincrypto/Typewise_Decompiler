package L;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import kotlin.jvm.internal.o;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int f867a = c.pooling_container_listener_holder_tag;

    /* renamed from: b  reason: collision with root package name */
    private static final int f868b = c.is_pooling_container_tag;

    public static final void a(View view) {
        o.e(view, "<this>");
        for (View c4 : ViewKt.a(view)) {
            c(c4).a();
        }
    }

    public static final void b(ViewGroup viewGroup) {
        o.e(viewGroup, "<this>");
        for (View c4 : ViewGroupKt.a(viewGroup)) {
            c(c4).a();
        }
    }

    private static final b c(View view) {
        int i4 = f867a;
        b bVar = (b) view.getTag(i4);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        view.setTag(i4, bVar2);
        return bVar2;
    }

    public static final void d(View view, boolean z3) {
        o.e(view, "<this>");
        view.setTag(f868b, Boolean.valueOf(z3));
    }
}
