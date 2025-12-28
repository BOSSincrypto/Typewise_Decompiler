package androidx.activity;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f2370a;

    public /* synthetic */ d(ComponentActivity componentActivity) {
        this.f2370a = componentActivity;
    }

    public final void run() {
        this.f2370a.invalidateMenu();
    }
}
