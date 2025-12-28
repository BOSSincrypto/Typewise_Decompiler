package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.internal.p;
import kotlinx.coroutines.q0;

public final class a implements p {
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public q0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new HandlerContext(e.a(mainLooper, true), (String) null, 2, (i) null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int c() {
        return 1073741823;
    }
}
