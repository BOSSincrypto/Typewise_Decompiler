package U1;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import y1.C0950d;
import y1.C0951e;
import y1.C0953g;

public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    private final l f1493a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f1494b = new Handler(Looper.getMainLooper());

    g(l lVar) {
        this.f1493a = lVar;
    }

    public final C0950d a() {
        return this.f1493a.a();
    }

    public final C0950d b(Activity activity, a aVar) {
        if (aVar.u()) {
            return C0953g.b((Object) null);
        }
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", aVar.t());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        C0951e eVar = new C0951e();
        intent.putExtra("result_receiver", new f(this, this.f1494b, eVar));
        activity.startActivity(intent);
        return eVar.a();
    }
}
