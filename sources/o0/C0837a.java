package o0;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* renamed from: o0.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0837a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f15087a;

    public /* synthetic */ C0837a(ConstraintTrackingWorker constraintTrackingWorker) {
        this.f15087a = constraintTrackingWorker;
    }

    public final void run() {
        ConstraintTrackingWorker.u(this.f15087a);
    }
}
