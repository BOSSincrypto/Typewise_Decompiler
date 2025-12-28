package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.c0;
import androidx.core.view.P;
import n.C0822a;
import n.f;
import n.g;
import n.j;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    private i f2824a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f2825b;

    /* renamed from: c  reason: collision with root package name */
    private RadioButton f2826c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f2827d;

    /* renamed from: e  reason: collision with root package name */
    private CheckBox f2828e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f2829f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f2830g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f2831h;

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f2832i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f2833j;

    /* renamed from: k  reason: collision with root package name */
    private int f2834k;

    /* renamed from: l  reason: collision with root package name */
    private Context f2835l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f2836m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f2837n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f2838o;

    /* renamed from: p  reason: collision with root package name */
    private LayoutInflater f2839p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f2840q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0822a.f14657A);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i4) {
        LinearLayout linearLayout = this.f2832i;
        if (linearLayout != null) {
            linearLayout.addView(view, i4);
        } else {
            addView(view, i4);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.f14810h, this, false);
        this.f2828e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(g.f14811i, this, false);
        this.f2825b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.f14813k, this, false);
        this.f2826c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f2839p == null) {
            this.f2839p = LayoutInflater.from(getContext());
        }
        return this.f2839p;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        int i4;
        ImageView imageView = this.f2830g;
        if (imageView != null) {
            if (z3) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            imageView.setVisibility(i4);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f2831h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2831h.getLayoutParams();
            rect.top += this.f2831h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public boolean d() {
        return false;
    }

    public void e(i iVar, int i4) {
        int i5;
        this.f2824a = iVar;
        if (iVar.isVisible()) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        setVisibility(i5);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    public i getItemData() {
        return this.f2824a;
    }

    public void h(boolean z3, char c4) {
        int i4;
        if (!z3 || !this.f2824a.A()) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        if (i4 == 0) {
            this.f2829f.setText(this.f2824a.h());
        }
        if (this.f2829f.getVisibility() != i4) {
            this.f2829f.setVisibility(i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        P.s0(this, this.f2833j);
        TextView textView = (TextView) findViewById(f.f14773M);
        this.f2827d = textView;
        int i4 = this.f2834k;
        if (i4 != -1) {
            textView.setTextAppearance(this.f2835l, i4);
        }
        this.f2829f = (TextView) findViewById(f.f14766F);
        ImageView imageView = (ImageView) findViewById(f.f14769I);
        this.f2830g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2837n);
        }
        this.f2831h = (ImageView) findViewById(f.f14794r);
        this.f2832i = (LinearLayout) findViewById(f.f14788l);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        if (this.f2825b != null && this.f2836m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2825b.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i4, i5);
    }

    public void setCheckable(boolean z3) {
        View view;
        CompoundButton compoundButton;
        if (z3 || this.f2826c != null || this.f2828e != null) {
            if (this.f2824a.m()) {
                if (this.f2826c == null) {
                    g();
                }
                compoundButton = this.f2826c;
                view = this.f2828e;
            } else {
                if (this.f2828e == null) {
                    c();
                }
                compoundButton = this.f2828e;
                view = this.f2826c;
            }
            if (z3) {
                compoundButton.setChecked(this.f2824a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f2828e;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f2826c;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if (this.f2824a.m()) {
            if (this.f2826c == null) {
                g();
            }
            compoundButton = this.f2826c;
        } else {
            if (this.f2828e == null) {
                c();
            }
            compoundButton = this.f2828e;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f2840q = z3;
        this.f2836m = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        int i4;
        ImageView imageView = this.f2831h;
        if (imageView != null) {
            if (this.f2838o || !z3) {
                i4 = 8;
            } else {
                i4 = 0;
            }
            imageView.setVisibility(i4);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z3;
        if (this.f2824a.z() || this.f2840q) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || this.f2836m) {
            ImageView imageView = this.f2825b;
            if (imageView != null || drawable != null || this.f2836m) {
                if (imageView == null) {
                    f();
                }
                if (drawable != null || this.f2836m) {
                    ImageView imageView2 = this.f2825b;
                    if (!z3) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f2825b.getVisibility() != 0) {
                        this.f2825b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f2825b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f2827d.setText(charSequence);
            if (this.f2827d.getVisibility() != 0) {
                this.f2827d.setVisibility(0);
            }
        } else if (this.f2827d.getVisibility() != 8) {
            this.f2827d.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        c0 v3 = c0.v(getContext(), attributeSet, j.f14917T1, i4, 0);
        this.f2833j = v3.g(j.f14925V1);
        this.f2834k = v3.n(j.f14921U1, -1);
        this.f2836m = v3.a(j.f14929W1, false);
        this.f2835l = context;
        this.f2837n = v3.g(j.f14933X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C0822a.f14691x, 0);
        this.f2838o = obtainStyledAttributes.hasValue(0);
        v3.w();
        obtainStyledAttributes.recycle();
    }
}
