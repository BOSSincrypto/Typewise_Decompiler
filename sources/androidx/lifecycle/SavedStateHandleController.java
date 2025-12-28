package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.savedstate.a;
import kotlin.Metadata;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/k;", "", "key", "Landroidx/lifecycle/z;", "handle", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/z;)V", "Landroidx/savedstate/a;", "registry", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Ll2/q;", "e", "(Landroidx/savedstate/a;Landroidx/lifecycle/Lifecycle;)V", "Landroidx/lifecycle/m;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "c", "(Landroidx/lifecycle/m;Landroidx/lifecycle/Lifecycle$Event;)V", "a", "Ljava/lang/String;", "b", "Landroidx/lifecycle/z;", "f", "()Landroidx/lifecycle/z;", "", "<set-?>", "Z", "g", "()Z", "isAttached", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandleController implements C0461k {

    /* renamed from: a  reason: collision with root package name */
    private final String f6040a;

    /* renamed from: b  reason: collision with root package name */
    private final z f6041b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6042c;

    public SavedStateHandleController(String str, z zVar) {
        o.e(str, "key");
        o.e(zVar, "handle");
        this.f6040a = str;
        this.f6041b = zVar;
    }

    public void c(m mVar, Lifecycle.Event event) {
        o.e(mVar, "source");
        o.e(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f6042c = false;
            mVar.getLifecycle().c(this);
        }
    }

    public final void e(a aVar, Lifecycle lifecycle) {
        o.e(aVar, "registry");
        o.e(lifecycle, "lifecycle");
        if (!this.f6042c) {
            this.f6042c = true;
            lifecycle.a(this);
            aVar.h(this.f6040a, this.f6041b.c());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public final z f() {
        return this.f6041b;
    }

    public final boolean g() {
        return this.f6042c;
    }
}
