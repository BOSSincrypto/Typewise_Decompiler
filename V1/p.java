package V1;

import android.os.IBinder;

final class p extends j {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ IBinder f1599b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ s f1600c;

    p(s sVar, IBinder iBinder) {
        this.f1600c = sVar;
        this.f1599b = iBinder;
    }

    public final void a() {
        this.f1600c.f1602a.f1616m = e.w(this.f1599b);
        t.n(this.f1600c.f1602a);
        this.f1600c.f1602a.f1610g = false;
        for (Runnable run : this.f1600c.f1602a.f1607d) {
            run.run();
        }
        this.f1600c.f1602a.f1607d.clear();
    }
}
