package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/k;", "Landroidx/lifecycle/SavedStateHandlesProvider;", "provider", "<init>", "(Landroidx/lifecycle/SavedStateHandlesProvider;)V", "Landroidx/lifecycle/m;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "Ll2/q;", "c", "(Landroidx/lifecycle/m;Landroidx/lifecycle/Lifecycle$Event;)V", "a", "Landroidx/lifecycle/SavedStateHandlesProvider;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandleAttacher implements C0461k {

    /* renamed from: a  reason: collision with root package name */
    private final SavedStateHandlesProvider f6039a;

    public SavedStateHandleAttacher(SavedStateHandlesProvider savedStateHandlesProvider) {
        o.e(savedStateHandlesProvider, "provider");
        this.f6039a = savedStateHandlesProvider;
    }

    public void c(m mVar, Lifecycle.Event event) {
        o.e(mVar, "source");
        o.e(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            mVar.getLifecycle().c(this);
            this.f6039a.d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
    }
}
