package androidx.activity;

import java.util.concurrent.CopyOnWriteArrayList;
import u2.C0906a;

public abstract class o {
    private final CopyOnWriteArrayList<c> cancellables = new CopyOnWriteArrayList<>();
    private C0906a enabledChangedCallback;
    private boolean isEnabled;

    public o(boolean z3) {
        this.isEnabled = z3;
    }

    public final void addCancellable(c cVar) {
        kotlin.jvm.internal.o.e(cVar, "cancellable");
        this.cancellables.add(cVar);
    }

    public final C0906a getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(b bVar) {
        kotlin.jvm.internal.o.e(bVar, "backEvent");
    }

    public void handleOnBackStarted(b bVar) {
        kotlin.jvm.internal.o.e(bVar, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        for (c cancel : this.cancellables) {
            cancel.cancel();
        }
    }

    public final void removeCancellable(c cVar) {
        kotlin.jvm.internal.o.e(cVar, "cancellable");
        this.cancellables.remove(cVar);
    }

    public final void setEnabled(boolean z3) {
        this.isEnabled = z3;
        C0906a aVar = this.enabledChangedCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(C0906a aVar) {
        this.enabledChangedCallback = aVar;
    }
}
