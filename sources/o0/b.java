package o0;

import X1.a;
import androidx.work.impl.workers.ConstraintTrackingWorker;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f15088a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f15089b;

    public /* synthetic */ b(ConstraintTrackingWorker constraintTrackingWorker, a aVar) {
        this.f15088a = constraintTrackingWorker;
        this.f15089b = aVar;
    }

    public final void run() {
        ConstraintTrackingWorker.t(this.f15088a, this.f15089b);
    }
}
