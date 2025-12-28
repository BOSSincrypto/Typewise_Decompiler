package j3;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import ch.icoaching.wrio.logging.Log;

public final class a extends b {

    /* renamed from: c  reason: collision with root package name */
    private PopupWindow f13774c;

    public void f() {
        b((View) null);
        PopupWindow popupWindow = this.f13774c;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f13774c = null;
    }

    public boolean g() {
        return false;
    }

    public void h() {
        View a4;
        Log log = Log.f10572a;
        Log.d(log, "DefaultInterceptionViewController", "tryDisplayingInterceptionView() :: Start", (Throwable) null, 4, (Object) null);
        LinearLayout d4 = d();
        if (d4 != null && (a4 = a()) != null) {
            b((View) null);
            if (a4.getParent() == null) {
                a4.measure(0, 0);
                int measuredHeight = a4.getMeasuredHeight();
                Log.d(log, "DefaultInterceptionViewController", "tryDisplayingInterceptionView() :: interceptionViewHeight = " + measuredHeight, (Throwable) null, 4, (Object) null);
                PopupWindow popupWindow = new PopupWindow(a4, -1, -2, true);
                popupWindow.setOutsideTouchable(false);
                popupWindow.setTouchable(true);
                popupWindow.setFocusable(false);
                popupWindow.showAsDropDown(d4, 0, (-d4.getHeight()) - measuredHeight);
                PopupWindow popupWindow2 = this.f13774c;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                }
                this.f13774c = popupWindow;
                Log.d(log, "DefaultInterceptionViewController", "tryDisplayingInterceptionView() :: End", (Throwable) null, 4, (Object) null);
            }
        }
    }
}
