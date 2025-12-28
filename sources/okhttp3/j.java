package okhttp3;

import T2.e;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import okhttp3.internal.connection.f;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final f f15425a;

    public j(f fVar) {
        o.e(fVar, "delegate");
        this.f15425a = fVar;
    }

    public final f a() {
        return this.f15425a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public j(int i4, long j4, TimeUnit timeUnit) {
        this(new f(e.f1472i, i4, j4, timeUnit));
        o.e(timeUnit, "timeUnit");
    }

    public j() {
        this(5, 5, TimeUnit.MINUTES);
    }
}
