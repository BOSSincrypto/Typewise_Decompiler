package androidx.lifecycle;

import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.a;
import kotlin.Metadata;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1", "Landroidx/lifecycle/k;", "Landroidx/lifecycle/m;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Ll2/q;", "c", "(Landroidx/lifecycle/m;Landroidx/lifecycle/Lifecycle$Event;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements C0461k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Lifecycle f6010a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f6011b;

    LegacySavedStateHandleController$tryToAddRecreator$1(Lifecycle lifecycle, a aVar) {
        this.f6010a = lifecycle;
        this.f6011b = aVar;
    }

    public void c(m mVar, Lifecycle.Event event) {
        o.e(mVar, "source");
        o.e(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            this.f6010a.c(this);
            this.f6011b.i(LegacySavedStateHandleController.a.class);
        }
    }
}
