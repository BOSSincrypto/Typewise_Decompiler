package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.b;
import androidx.core.view.P;
import androidx.core.view.W;
import n.C0822a;
import n.f;
import n.g;
import n.j;

public class ActionBarContextView extends C0377a {

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f3081i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f3082j;

    /* renamed from: k  reason: collision with root package name */
    private View f3083k;

    /* renamed from: l  reason: collision with root package name */
    private View f3084l;

    /* renamed from: m  reason: collision with root package name */
    private View f3085m;

    /* renamed from: n  reason: collision with root package name */
    private LinearLayout f3086n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f3087o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f3088p;

    /* renamed from: q  reason: collision with root package name */
    private int f3089q;

    /* renamed from: r  reason: collision with root package name */
    private int f3090r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f3091s;

    /* renamed from: t  reason: collision with root package name */
    private int f3092t;

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f3093a;

        a(b bVar) {
            this.f3093a = bVar;
        }

        public void onClick(View view) {
            this.f3093a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void i() {
        int i4;
        if (this.f3086n == null) {
            LayoutInflater.from(getContext()).inflate(g.f14803a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f3086n = linearLayout;
            this.f3087o = (TextView) linearLayout.findViewById(f.f14781e);
            this.f3088p = (TextView) this.f3086n.findViewById(f.f14780d);
            if (this.f3089q != 0) {
                this.f3087o.setTextAppearance(getContext(), this.f3089q);
            }
            if (this.f3090r != 0) {
                this.f3088p.setTextAppearance(getContext(), this.f3090r);
            }
        }
        this.f3087o.setText(this.f3081i);
        this.f3088p.setText(this.f3082j);
        boolean isEmpty = TextUtils.isEmpty(this.f3081i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f3082j);
        TextView textView = this.f3088p;
        int i5 = 8;
        if (!isEmpty2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        textView.setVisibility(i4);
        LinearLayout linearLayout2 = this.f3086n;
        if (!isEmpty || !isEmpty2) {
            i5 = 0;
        }
        linearLayout2.setVisibility(i5);
        if (this.f3086n.getParent() == null) {
            addView(this.f3086n);
        }
    }

    public /* bridge */ /* synthetic */ W f(int i4, long j4) {
        return super.f(i4, j4);
    }

    public void g() {
        if (this.f3083k == null) {
            k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f3082j;
    }

    public CharSequence getTitle() {
        return this.f3081i;
    }

    public void h(b bVar) {
        View view = this.f3083k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f3092t, this, false);
            this.f3083k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f3083k);
        }
        View findViewById = this.f3083k.findViewById(f.f14785i);
        this.f3084l = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) bVar.e();
        C0379c cVar = this.f3497d;
        if (cVar != null) {
            cVar.y();
        }
        C0379c cVar2 = new C0379c(getContext());
        this.f3497d = cVar2;
        cVar2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.c(this.f3497d, this.f3495b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f3497d.o(this);
        this.f3496c = actionMenuView;
        P.s0(actionMenuView, (Drawable) null);
        addView(this.f3496c, layoutParams);
    }

    public boolean j() {
        return this.f3091s;
    }

    public void k() {
        removeAllViews();
        this.f3085m = null;
        this.f3496c = null;
        this.f3497d = null;
        View view = this.f3084l;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public boolean l() {
        C0379c cVar = this.f3497d;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0379c cVar = this.f3497d;
        if (cVar != null) {
            cVar.B();
            this.f3497d.C();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        boolean b4 = n0.b(this);
        if (b4) {
            i8 = (i6 - i4) - getPaddingRight();
        } else {
            i8 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        View view = this.f3083k;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3083k.getLayoutParams();
            if (b4) {
                i10 = marginLayoutParams.rightMargin;
            } else {
                i10 = marginLayoutParams.leftMargin;
            }
            if (b4) {
                i11 = marginLayoutParams.leftMargin;
            } else {
                i11 = marginLayoutParams.rightMargin;
            }
            int d4 = C0377a.d(i8, i10, b4);
            i8 = C0377a.d(d4 + e(this.f3083k, d4, paddingTop, paddingTop2, b4), i11, b4);
        }
        int i12 = i8;
        LinearLayout linearLayout = this.f3086n;
        if (!(linearLayout == null || this.f3085m != null || linearLayout.getVisibility() == 8)) {
            i12 += e(this.f3086n, i12, paddingTop, paddingTop2, b4);
        }
        int i13 = i12;
        View view2 = this.f3085m;
        if (view2 != null) {
            e(view2, i13, paddingTop, paddingTop2, b4);
        }
        if (b4) {
            i9 = getPaddingLeft();
        } else {
            i9 = (i6 - i4) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f3496c;
        if (actionMenuView != null) {
            e(actionMenuView, i9, paddingTop, paddingTop2, !b4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        int i6;
        boolean z3;
        int i7;
        int i8 = 1073741824;
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i5) != 0) {
            int size = View.MeasureSpec.getSize(i4);
            int i9 = this.f3498e;
            if (i9 <= 0) {
                i9 = View.MeasureSpec.getSize(i5);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i10 = i9 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
            View view = this.f3083k;
            if (view != null) {
                int c4 = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3083k.getLayoutParams();
                paddingLeft = c4 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f3496c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f3496c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f3086n;
            if (linearLayout != null && this.f3085m == null) {
                if (this.f3091s) {
                    this.f3086n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f3086n.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.f3086n;
                    if (z3) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    linearLayout2.setVisibility(i7);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f3085m;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i11 = layoutParams.width;
                if (i11 != -2) {
                    i6 = 1073741824;
                } else {
                    i6 = Integer.MIN_VALUE;
                }
                if (i11 >= 0) {
                    paddingLeft = Math.min(i11, paddingLeft);
                }
                int i12 = layoutParams.height;
                if (i12 == -2) {
                    i8 = Integer.MIN_VALUE;
                }
                if (i12 >= 0) {
                    i10 = Math.min(i12, i10);
                }
                this.f3085m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i10, i8));
            }
            if (this.f3498e <= 0) {
                int childCount = getChildCount();
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    int measuredHeight = getChildAt(i14).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i13) {
                        i13 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i13);
                return;
            }
            setMeasuredDimension(size, i9);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i4) {
        this.f3498e = i4;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f3085m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f3085m = view;
        if (!(view == null || (linearLayout = this.f3086n) == null)) {
            removeView(linearLayout);
            this.f3086n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f3082j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f3081i = charSequence;
        i();
        P.r0(this, charSequence);
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f3091s) {
            requestLayout();
        }
        this.f3091s = z3;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i4) {
        super.setVisibility(i4);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0822a.f14674g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        c0 v3 = c0.v(context, attributeSet, j.f15059y, i4, 0);
        P.s0(this, v3.g(j.f15063z));
        this.f3089q = v3.n(j.f14851D, 0);
        this.f3090r = v3.n(j.f14847C, 0);
        this.f3498e = v3.m(j.f14843B, 0);
        this.f3092t = v3.n(j.f14839A, g.f14806d);
        v3.w();
    }
}
