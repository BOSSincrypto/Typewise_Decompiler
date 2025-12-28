package R;

import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f1355a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Violation f1356b;

    public /* synthetic */ a(String str, Violation violation) {
        this.f1355a = str;
        this.f1356b = violation;
    }

    public final void run() {
        FragmentStrictMode.d(this.f1355a, this.f1356b);
    }
}
