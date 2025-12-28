package V1;

import y1.C0951e;

public abstract class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C0951e f1592a;

    j() {
        this.f1592a = null;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public final C0951e b() {
        return this.f1592a;
    }

    public final void c(Exception exc) {
        C0951e eVar = this.f1592a;
        if (eVar != null) {
            eVar.b(exc);
        }
    }

    public final void run() {
        try {
            a();
        } catch (Exception e4) {
            c(e4);
        }
    }

    public j(C0951e eVar) {
        this.f1592a = eVar;
    }
}
