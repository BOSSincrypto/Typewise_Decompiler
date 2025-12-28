package d0;

import android.view.View;
import android.view.WindowId;

/* renamed from: d0.O  reason: case insensitive filesystem */
class C0608O implements C0609P {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f13404a;

    C0608O(View view) {
        this.f13404a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0608O) || !((C0608O) obj).f13404a.equals(this.f13404a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f13404a.hashCode();
    }
}
