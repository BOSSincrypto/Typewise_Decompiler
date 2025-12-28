package G1;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final Dialog f525a;

    /* renamed from: b  reason: collision with root package name */
    private final int f526b;

    /* renamed from: c  reason: collision with root package name */
    private final int f527c;

    /* renamed from: d  reason: collision with root package name */
    private final int f528d;

    public a(Dialog dialog, Rect rect) {
        this.f525a = dialog;
        this.f526b = rect.left;
        this.f527c = rect.top;
        this.f528d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f526b + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f527c + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i4 = this.f528d;
            obtain.setLocation((float) ((-i4) - 1), (float) ((-i4) - 1));
        }
        view.performClick();
        return this.f525a.onTouchEvent(obtain);
    }
}
