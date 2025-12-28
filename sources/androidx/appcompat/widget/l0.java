package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import n.d;
import n.f;
import n.g;
import n.i;

class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3631a;

    /* renamed from: b  reason: collision with root package name */
    private final View f3632b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f3633c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f3634d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f3635e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f3636f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private final int[] f3637g = new int[2];

    l0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f3634d = layoutParams;
        this.f3631a = context;
        View inflate = LayoutInflater.from(context).inflate(g.f14821s, (ViewGroup) null);
        this.f3632b = inflate;
        this.f3633c = (TextView) inflate.findViewById(f.f14795s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.f14835a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i4, int i5, boolean z3, WindowManager.LayoutParams layoutParams) {
        int i6;
        int i7;
        int i8;
        int i9;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f3631a.getResources().getDimensionPixelOffset(d.f14713k);
        if (view.getWidth() < dimensionPixelOffset) {
            i4 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f3631a.getResources().getDimensionPixelOffset(d.f14712j);
            i7 = i5 + dimensionPixelOffset2;
            i6 = i5 - dimensionPixelOffset2;
        } else {
            i7 = view.getHeight();
            i6 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f3631a.getResources();
        if (z3) {
            i8 = d.f14715m;
        } else {
            i8 = d.f14714l;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i8);
        View b4 = b(view);
        if (b4 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b4.getWindowVisibleDisplayFrame(this.f3635e);
        Rect rect = this.f3635e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources2 = this.f3631a.getResources();
            int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier != 0) {
                i9 = resources2.getDimensionPixelSize(identifier);
            } else {
                i9 = 0;
            }
            DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.f3635e.set(0, i9, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b4.getLocationOnScreen(this.f3637g);
        view.getLocationOnScreen(this.f3636f);
        int[] iArr = this.f3636f;
        int i10 = iArr[0];
        int[] iArr2 = this.f3637g;
        int i11 = i10 - iArr2[0];
        iArr[0] = i11;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i11 + i4) - (b4.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3632b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f3632b.getMeasuredHeight();
        int i12 = this.f3636f[1];
        int i13 = ((i6 + i12) - dimensionPixelOffset3) - measuredHeight;
        int i14 = i12 + i7 + dimensionPixelOffset3;
        if (z3) {
            if (i13 >= 0) {
                layoutParams.y = i13;
            } else {
                layoutParams.y = i14;
            }
        } else if (measuredHeight + i14 <= this.f3635e.height()) {
            layoutParams.y = i14;
        } else {
            layoutParams.y = i13;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (d()) {
            ((WindowManager) this.f3631a.getSystemService("window")).removeView(this.f3632b);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        if (this.f3632b.getParent() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void e(View view, int i4, int i5, boolean z3, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f3633c.setText(charSequence);
        a(view, i4, i5, z3, this.f3634d);
        ((WindowManager) this.f3631a.getSystemService("window")).addView(this.f3632b, this.f3634d);
    }
}
