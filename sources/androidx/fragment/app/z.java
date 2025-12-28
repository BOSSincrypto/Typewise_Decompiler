package androidx.fragment.app;

import android.view.View;
import d0.C0614e;
import java.util.ArrayList;
import y.C0939a;

abstract class z {

    /* renamed from: a  reason: collision with root package name */
    static final B f5973a = new A();

    /* renamed from: b  reason: collision with root package name */
    static final B f5974b = b();

    static void a(Fragment fragment, Fragment fragment2, boolean z3, C0939a aVar, boolean z4) {
        if (z3) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    private static B b() {
        try {
            return C0614e.class.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    static void c(C0939a aVar, C0939a aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey((String) aVar.n(size))) {
                aVar.l(size);
            }
        }
    }

    static void d(ArrayList arrayList, int i4) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i4);
            }
        }
    }
}
