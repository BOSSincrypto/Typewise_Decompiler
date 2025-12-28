package j3;

import android.view.View;
import android.widget.LinearLayout;

public final class c extends b {

    /* renamed from: c  reason: collision with root package name */
    private View f13777c;

    public void f() {
        b((View) null);
        LinearLayout d4 = d();
        if (d4 != null) {
            d4.removeView(this.f13777c);
            this.f13777c = null;
        }
    }

    public boolean g() {
        if (this.f13777c != null) {
            return true;
        }
        return false;
    }

    public void h() {
        View a4;
        LinearLayout d4 = d();
        if (d4 != null && (a4 = a()) != null) {
            b((View) null);
            View view = this.f13777c;
            if (view != null) {
                d4.removeView(view);
            }
            d4.addView(a4, 0);
            this.f13777c = a4;
        }
    }
}
