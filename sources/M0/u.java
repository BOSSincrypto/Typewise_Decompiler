package m0;

import androidx.work.WorkerParameters;
import androidx.work.impl.F;
import androidx.work.impl.v;

public class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private F f14625a;

    /* renamed from: b  reason: collision with root package name */
    private v f14626b;

    /* renamed from: c  reason: collision with root package name */
    private WorkerParameters.a f14627c;

    public u(F f4, v vVar, WorkerParameters.a aVar) {
        this.f14625a = f4;
        this.f14626b = vVar;
        this.f14627c = aVar;
    }

    public void run() {
        this.f14625a.r().q(this.f14626b, this.f14627c);
    }
}
