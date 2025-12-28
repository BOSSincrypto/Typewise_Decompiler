package androidx.work;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f7148a;

    public /* synthetic */ d(CoroutineWorker coroutineWorker) {
        this.f7148a = coroutineWorker;
    }

    public final void run() {
        CoroutineWorker.r(this.f7148a);
    }
}
