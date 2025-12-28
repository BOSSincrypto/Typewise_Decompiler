package m0;

import androidx.work.impl.F;
import androidx.work.impl.v;
import androidx.work.m;

public class w implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private static final String f14631d = m.i("StopWorkRunnable");

    /* renamed from: a  reason: collision with root package name */
    private final F f14632a;

    /* renamed from: b  reason: collision with root package name */
    private final v f14633b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f14634c;

    public w(F f4, v vVar, boolean z3) {
        this.f14632a = f4;
        this.f14633b = vVar;
        this.f14634c = z3;
    }

    public void run() {
        boolean z3;
        if (this.f14634c) {
            z3 = this.f14632a.r().t(this.f14633b);
        } else {
            z3 = this.f14632a.r().u(this.f14633b);
        }
        m e4 = m.e();
        String str = f14631d;
        e4.a(str, "StopWorkRunnable for " + this.f14633b.a().b() + "; Processor.stopWork = " + z3);
    }
}
