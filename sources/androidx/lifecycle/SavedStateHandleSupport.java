package androidx.lifecycle;

import U.a;
import Y.d;
import android.os.Bundle;
import androidx.lifecycle.F;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.a;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;

public abstract class SavedStateHandleSupport {

    /* renamed from: a  reason: collision with root package name */
    public static final a.b f6043a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a.b f6044b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a.b f6045c = new a();

    public static final class a implements a.b {
        a() {
        }
    }

    public static final class b implements a.b {
        b() {
        }
    }

    public static final class c implements a.b {
        c() {
        }
    }

    public static final z a(U.a aVar) {
        o.e(aVar, "<this>");
        d dVar = (d) aVar.a(f6043a);
        if (dVar != null) {
            J j4 = (J) aVar.a(f6044b);
            if (j4 != null) {
                Bundle bundle = (Bundle) aVar.a(f6045c);
                String str = (String) aVar.a(F.c.f6006c);
                if (str != null) {
                    return b(dVar, j4, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    private static final z b(d dVar, J j4, String str, Bundle bundle) {
        SavedStateHandlesProvider d4 = d(dVar);
        A e4 = e(j4);
        z zVar = (z) e4.f().get(str);
        if (zVar != null) {
            return zVar;
        }
        z a4 = z.f6091f.a(d4.b(str), bundle);
        e4.f().put(str, a4);
        return a4;
    }

    public static final void c(d dVar) {
        o.e(dVar, "<this>");
        Lifecycle.State b4 = dVar.getLifecycle().b();
        if (b4 != Lifecycle.State.INITIALIZED && b4 != Lifecycle.State.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (dVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(dVar.getSavedStateRegistry(), (J) dVar);
            dVar.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
            dVar.getLifecycle().a(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    public static final SavedStateHandlesProvider d(d dVar) {
        SavedStateHandlesProvider savedStateHandlesProvider;
        o.e(dVar, "<this>");
        a.c c4 = dVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        if (c4 instanceof SavedStateHandlesProvider) {
            savedStateHandlesProvider = (SavedStateHandlesProvider) c4;
        } else {
            savedStateHandlesProvider = null;
        }
        if (savedStateHandlesProvider != null) {
            return savedStateHandlesProvider;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final A e(J j4) {
        o.e(j4, "<this>");
        U.c cVar = new U.c();
        Class<A> cls = A.class;
        cVar.a(r.b(cls), SavedStateHandleSupport$savedStateHandlesVM$1$1.INSTANCE);
        return (A) new F(j4, cVar.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", cls);
    }
}
