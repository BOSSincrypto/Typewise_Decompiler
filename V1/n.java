package V1;

final class n extends j {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t f1598b;

    n(t tVar) {
        this.f1598b = tVar;
    }

    public final void a() {
        t tVar = this.f1598b;
        if (tVar.f1616m != null) {
            tVar.f1605b.d("Unbind from service.", new Object[0]);
            t tVar2 = this.f1598b;
            tVar2.f1604a.unbindService(tVar2.f1615l);
            this.f1598b.f1610g = false;
            this.f1598b.f1616m = null;
            this.f1598b.f1615l = null;
        }
        this.f1598b.t();
    }
}
