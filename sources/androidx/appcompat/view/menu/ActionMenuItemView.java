package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.N;
import androidx.appcompat.widget.h0;
import n.j;

public class ActionMenuItemView extends D implements n.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: h  reason: collision with root package name */
    i f2809h;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f2810i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f2811j;

    /* renamed from: k  reason: collision with root package name */
    g.b f2812k;

    /* renamed from: l  reason: collision with root package name */
    private N f2813l;

    /* renamed from: m  reason: collision with root package name */
    b f2814m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f2815n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f2816o;

    /* renamed from: p  reason: collision with root package name */
    private int f2817p;

    /* renamed from: q  reason: collision with root package name */
    private int f2818q;

    /* renamed from: r  reason: collision with root package name */
    private int f2819r;

    private class a extends N {
        public a() {
            super(ActionMenuItemView.this);
        }

        public p b() {
            b bVar = ActionMenuItemView.this.f2814m;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public boolean c() {
            p b4;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f2812k;
            if (bVar == null || !bVar.a(actionMenuItemView.f2809h) || (b4 = b()) == null || !b4.b()) {
                return false;
            }
            return true;
        }
    }

    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean s() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (i4 >= 480 || ((i4 >= 640 && i5 >= 480) || configuration.orientation == 2)) {
            return true;
        }
        return false;
    }

    private void t() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f2810i);
        if (this.f2811j != null && (!this.f2809h.B() || (!this.f2815n && !this.f2816o))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        CharSequence charSequence3 = null;
        if (z5) {
            charSequence = this.f2810i;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f2809h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z5) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f2809h.getTitle();
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f2809h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z5) {
                charSequence3 = this.f2809h.getTitle();
            }
            h0.a(this, charSequence3);
            return;
        }
        h0.a(this, tooltipText);
    }

    public boolean a() {
        return r();
    }

    public boolean b() {
        if (!r() || this.f2809h.getIcon() != null) {
            return false;
        }
        return true;
    }

    public boolean d() {
        return true;
    }

    public void e(i iVar, int i4) {
        int i5;
        this.f2809h = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.i(this));
        setId(iVar.getItemId());
        if (iVar.isVisible()) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        setVisibility(i5);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f2813l == null) {
            this.f2813l = new a();
        }
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public i getItemData() {
        return this.f2809h;
    }

    public void onClick(View view) {
        g.b bVar = this.f2812k;
        if (bVar != null) {
            bVar.a(this.f2809h);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2815n = s();
        t();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        boolean r4 = r();
        if (r4 && (i7 = this.f2818q) >= 0) {
            super.setPadding(i7, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i6 = Math.min(size, this.f2817p);
        } else {
            i6 = this.f2817p;
        }
        if (mode != 1073741824 && this.f2817p > 0 && measuredWidth < i6) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i5);
        }
        if (!r4 && this.f2811j != null) {
            super.setPadding((getMeasuredWidth() - this.f2811j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        N n4;
        if (!this.f2809h.hasSubMenu() || (n4 = this.f2813l) == null || !n4.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean r() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f2816o != z3) {
            this.f2816o = z3;
            i iVar = this.f2809h;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2811j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.f2819r;
            if (intrinsicWidth > i4) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i4) / ((float) intrinsicWidth)));
                intrinsicWidth = i4;
            }
            if (intrinsicHeight > i4) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i4) / ((float) intrinsicHeight)));
            } else {
                i4 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i4);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        t();
    }

    public void setItemInvoker(g.b bVar) {
        this.f2812k = bVar;
    }

    public void setPadding(int i4, int i5, int i6, int i7) {
        this.f2818q = i4;
        super.setPadding(i4, i5, i6, i7);
    }

    public void setPopupCallback(b bVar) {
        this.f2814m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2810i = charSequence;
        t();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Resources resources = context.getResources();
        this.f2815n = s();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f15047v, i4, 0);
        this.f2817p = obtainStyledAttributes.getDimensionPixelSize(j.f15051w, 0);
        obtainStyledAttributes.recycle();
        this.f2819r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2818q = -1;
        setSaveEnabled(false);
    }
}
