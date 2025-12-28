package androidx.lifecycle;

import Y.d;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.a;
import kotlin.jvm.internal.o;

public final class LegacySavedStateHandleController {

    /* renamed from: a  reason: collision with root package name */
    public static final LegacySavedStateHandleController f6009a = new LegacySavedStateHandleController();

    public static final class a implements a.C0110a {
        public void a(d dVar) {
            o.e(dVar, "owner");
            if (dVar instanceof J) {
                I viewModelStore = ((J) dVar).getViewModelStore();
                androidx.savedstate.a savedStateRegistry = dVar.getSavedStateRegistry();
                for (String b4 : viewModelStore.c()) {
                    E b5 = viewModelStore.b(b4);
                    o.b(b5);
                    LegacySavedStateHandleController.a(b5, savedStateRegistry, dVar.getLifecycle());
                }
                if (!viewModelStore.c().isEmpty()) {
                    savedStateRegistry.i(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(E e4, androidx.savedstate.a aVar, Lifecycle lifecycle) {
        o.e(e4, "viewModel");
        o.e(aVar, "registry");
        o.e(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) e4.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.g()) {
            savedStateHandleController.e(aVar, lifecycle);
            f6009a.c(aVar, lifecycle);
        }
    }

    public static final SavedStateHandleController b(androidx.savedstate.a aVar, Lifecycle lifecycle, String str, Bundle bundle) {
        o.e(aVar, "registry");
        o.e(lifecycle, "lifecycle");
        o.b(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, z.f6091f.a(aVar.b(str), bundle));
        savedStateHandleController.e(aVar, lifecycle);
        f6009a.c(aVar, lifecycle);
        return savedStateHandleController;
    }

    private final void c(androidx.savedstate.a aVar, Lifecycle lifecycle) {
        Lifecycle.State b4 = lifecycle.b();
        if (b4 == Lifecycle.State.INITIALIZED || b4.isAtLeast(Lifecycle.State.STARTED)) {
            aVar.i(a.class);
        } else {
            lifecycle.a(new LegacySavedStateHandleController$tryToAddRecreator$1(lifecycle, aVar));
        }
    }
}
