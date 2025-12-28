package com.google.android.material.textfield;

import Q1.k;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0387k;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.K;
import androidx.core.view.C0402a;
import androidx.core.view.P;
import androidx.core.view.accessibility.A;
import androidx.core.view.r;
import androidx.core.widget.j;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.m;
import d0.C0613d;
import d0.C0623n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.C0836a;
import z1.C0970a;
import z1.C0971b;
import z1.C0972c;
import z1.i;

public class TextInputLayout extends LinearLayout {

    /* renamed from: A0  reason: collision with root package name */
    private static final int f12248A0 = i.Widget_Design_TextInputLayout;

    /* renamed from: B0  reason: collision with root package name */
    private static final int[][] f12249B0 = {new int[]{16842919}, new int[0]};

    /* renamed from: A  reason: collision with root package name */
    private ColorStateList f12250A;

    /* renamed from: B  reason: collision with root package name */
    private ColorStateList f12251B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f12252C;

    /* renamed from: D  reason: collision with root package name */
    private CharSequence f12253D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f12254E;

    /* renamed from: F  reason: collision with root package name */
    private Q1.g f12255F;

    /* renamed from: G  reason: collision with root package name */
    private Q1.g f12256G;

    /* renamed from: H  reason: collision with root package name */
    private StateListDrawable f12257H;

    /* renamed from: I  reason: collision with root package name */
    private boolean f12258I;

    /* renamed from: J  reason: collision with root package name */
    private Q1.g f12259J;

    /* renamed from: K  reason: collision with root package name */
    private Q1.g f12260K;

    /* renamed from: L  reason: collision with root package name */
    private k f12261L;

    /* renamed from: M  reason: collision with root package name */
    private boolean f12262M;

    /* renamed from: N  reason: collision with root package name */
    private final int f12263N;

    /* renamed from: O  reason: collision with root package name */
    private int f12264O;

    /* renamed from: P  reason: collision with root package name */
    private int f12265P;

    /* renamed from: Q  reason: collision with root package name */
    private int f12266Q;

    /* renamed from: R  reason: collision with root package name */
    private int f12267R;

    /* renamed from: S  reason: collision with root package name */
    private int f12268S;

    /* renamed from: T  reason: collision with root package name */
    private int f12269T;

    /* renamed from: U  reason: collision with root package name */
    private int f12270U;

    /* renamed from: V  reason: collision with root package name */
    private final Rect f12271V;

    /* renamed from: W  reason: collision with root package name */
    private final Rect f12272W;

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f12273a;

    /* renamed from: a0  reason: collision with root package name */
    private final RectF f12274a0;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final A f12275b;

    /* renamed from: b0  reason: collision with root package name */
    private Typeface f12276b0;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final s f12277c;

    /* renamed from: c0  reason: collision with root package name */
    private Drawable f12278c0;

    /* renamed from: d  reason: collision with root package name */
    EditText f12279d;

    /* renamed from: d0  reason: collision with root package name */
    private int f12280d0;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f12281e;

    /* renamed from: e0  reason: collision with root package name */
    private final LinkedHashSet f12282e0;

    /* renamed from: f  reason: collision with root package name */
    private int f12283f;

    /* renamed from: f0  reason: collision with root package name */
    private Drawable f12284f0;

    /* renamed from: g  reason: collision with root package name */
    private int f12285g;

    /* renamed from: g0  reason: collision with root package name */
    private int f12286g0;

    /* renamed from: h  reason: collision with root package name */
    private int f12287h;

    /* renamed from: h0  reason: collision with root package name */
    private Drawable f12288h0;

    /* renamed from: i  reason: collision with root package name */
    private int f12289i;

    /* renamed from: i0  reason: collision with root package name */
    private ColorStateList f12290i0;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final v f12291j;

    /* renamed from: j0  reason: collision with root package name */
    private ColorStateList f12292j0;

    /* renamed from: k  reason: collision with root package name */
    boolean f12293k;

    /* renamed from: k0  reason: collision with root package name */
    private int f12294k0;

    /* renamed from: l  reason: collision with root package name */
    private int f12295l;

    /* renamed from: l0  reason: collision with root package name */
    private int f12296l0;

    /* renamed from: m  reason: collision with root package name */
    private boolean f12297m;

    /* renamed from: m0  reason: collision with root package name */
    private int f12298m0;

    /* renamed from: n  reason: collision with root package name */
    private f f12299n;

    /* renamed from: n0  reason: collision with root package name */
    private ColorStateList f12300n0;

    /* renamed from: o  reason: collision with root package name */
    private TextView f12301o;

    /* renamed from: o0  reason: collision with root package name */
    private int f12302o0;

    /* renamed from: p  reason: collision with root package name */
    private int f12303p;

    /* renamed from: p0  reason: collision with root package name */
    private int f12304p0;

    /* renamed from: q  reason: collision with root package name */
    private int f12305q;

    /* renamed from: q0  reason: collision with root package name */
    private int f12306q0;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f12307r;

    /* renamed from: r0  reason: collision with root package name */
    private int f12308r0;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public boolean f12309s;

    /* renamed from: s0  reason: collision with root package name */
    private int f12310s0;

    /* renamed from: t  reason: collision with root package name */
    private TextView f12311t;

    /* renamed from: t0  reason: collision with root package name */
    private boolean f12312t0;

    /* renamed from: u  reason: collision with root package name */
    private ColorStateList f12313u;

    /* renamed from: u0  reason: collision with root package name */
    final com.google.android.material.internal.a f12314u0;

    /* renamed from: v  reason: collision with root package name */
    private int f12315v;

    /* renamed from: v0  reason: collision with root package name */
    private boolean f12316v0;

    /* renamed from: w  reason: collision with root package name */
    private C0613d f12317w;

    /* renamed from: w0  reason: collision with root package name */
    private boolean f12318w0;

    /* renamed from: x  reason: collision with root package name */
    private C0613d f12319x;

    /* renamed from: x0  reason: collision with root package name */
    private ValueAnimator f12320x0;

    /* renamed from: y  reason: collision with root package name */
    private ColorStateList f12321y;

    /* renamed from: y0  reason: collision with root package name */
    private boolean f12322y0;

    /* renamed from: z  reason: collision with root package name */
    private ColorStateList f12323z;
    /* access modifiers changed from: private */

    /* renamed from: z0  reason: collision with root package name */
    public boolean f12324z0;

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.r0(!textInputLayout.f12324z0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f12293k) {
                textInputLayout2.i0(editable);
            }
            if (TextInputLayout.this.f12309s) {
                TextInputLayout.this.v0(editable);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            TextInputLayout.this.f12277c.h();
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            TextInputLayout.this.f12279d.requestLayout();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f12314u0.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends C0402a {

        /* renamed from: d  reason: collision with root package name */
        private final TextInputLayout f12329d;

        public e(TextInputLayout textInputLayout) {
            this.f12329d = textInputLayout;
        }

        public void g(View view, A a4) {
            Editable editable;
            boolean z3;
            String str;
            super.g(view, a4);
            EditText editText = this.f12329d.getEditText();
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            CharSequence hint = this.f12329d.getHint();
            CharSequence error = this.f12329d.getError();
            CharSequence placeholderText = this.f12329d.getPlaceholderText();
            int counterMaxLength = this.f12329d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f12329d.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(editable);
            boolean isEmpty2 = TextUtils.isEmpty(hint);
            boolean O3 = this.f12329d.O();
            boolean isEmpty3 = TextUtils.isEmpty(error);
            if (!isEmpty3 || !TextUtils.isEmpty(counterOverflowDescription)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!isEmpty2) {
                str = hint.toString();
            } else {
                str = "";
            }
            this.f12329d.f12275b.A(a4);
            if (!isEmpty) {
                a4.F0(editable);
            } else if (!TextUtils.isEmpty(str)) {
                a4.F0(str);
                if (!O3 && placeholderText != null) {
                    a4.F0(str + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                a4.F0(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    a4.t0(str);
                } else {
                    if (!isEmpty) {
                        str = editable + ", " + str;
                    }
                    a4.F0(str);
                }
                a4.C0(isEmpty);
            }
            if (editable == null || editable.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            a4.v0(counterMaxLength);
            if (z3) {
                if (isEmpty3) {
                    error = counterOverflowDescription;
                }
                a4.p0(error);
            }
            View t4 = this.f12329d.f12291j.t();
            if (t4 != null) {
                a4.u0(t4);
            }
            this.f12329d.f12277c.m().o(view, a4);
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f12329d.f12277c.m().p(view, accessibilityEvent);
        }
    }

    public interface f {
        int a(Editable editable);
    }

    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    static class h extends M.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        CharSequence f12330c;

        /* renamed from: d  reason: collision with root package name */
        boolean f12331d;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            /* renamed from: c */
            public h[] newArray(int i4) {
                return new h[i4];
            }
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f12330c + "}";
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            TextUtils.writeToParcel(this.f12330c, parcel, i4);
            parcel.writeInt(this.f12331d ? 1 : 0);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12330c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f12331d = parcel.readInt() != 1 ? false : true;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0970a.textInputStyle);
    }

    private boolean A() {
        if (!this.f12252C || TextUtils.isEmpty(this.f12253D) || !(this.f12255F instanceof C0581h)) {
            return false;
        }
        return true;
    }

    private void B() {
        Iterator it = this.f12282e0.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this);
        }
    }

    private void C(Canvas canvas) {
        Q1.g gVar;
        if (this.f12260K != null && (gVar = this.f12259J) != null) {
            gVar.draw(canvas);
            if (this.f12279d.isFocused()) {
                Rect bounds = this.f12260K.getBounds();
                Rect bounds2 = this.f12259J.getBounds();
                float x3 = this.f12314u0.x();
                int centerX = bounds2.centerX();
                bounds.left = A1.a.c(centerX, bounds2.left, x3);
                bounds.right = A1.a.c(centerX, bounds2.right, x3);
                this.f12260K.draw(canvas);
            }
        }
    }

    private void D(Canvas canvas) {
        if (this.f12252C) {
            this.f12314u0.l(canvas);
        }
    }

    private void E(boolean z3) {
        ValueAnimator valueAnimator = this.f12320x0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f12320x0.cancel();
        }
        if (!z3 || !this.f12318w0) {
            this.f12314u0.c0(0.0f);
        } else {
            k(0.0f);
        }
        if (A() && ((C0581h) this.f12255F).h0()) {
            x();
        }
        this.f12312t0 = true;
        K();
        this.f12275b.l(true);
        this.f12277c.H(true);
    }

    private Q1.g F(boolean z3) {
        float f4;
        float f5;
        ColorStateList colorStateList;
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(C0972c.mtrl_shape_corner_size_small_component);
        if (z3) {
            f4 = dimensionPixelOffset;
        } else {
            f4 = 0.0f;
        }
        EditText editText = this.f12279d;
        if (editText instanceof w) {
            f5 = ((w) editText).getPopupElevation();
        } else {
            f5 = (float) getResources().getDimensionPixelOffset(C0972c.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C0972c.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        k m4 = k.a().A(f4).E(f4).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        EditText editText2 = this.f12279d;
        if (editText2 instanceof w) {
            colorStateList = ((w) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Q1.g m5 = Q1.g.m(getContext(), f5, colorStateList);
        m5.setShapeAppearanceModel(m4);
        m5.V(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return m5;
    }

    private static Drawable G(Q1.g gVar, int i4, int i5, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{F1.a.i(i5, i4, 0.1f), i4}), gVar, gVar);
    }

    private int H(int i4, boolean z3) {
        int compoundPaddingLeft;
        if (!z3 && getPrefixText() != null) {
            compoundPaddingLeft = this.f12275b.c();
        } else if (!z3 || getSuffixText() == null) {
            compoundPaddingLeft = this.f12279d.getCompoundPaddingLeft();
        } else {
            compoundPaddingLeft = this.f12277c.y();
        }
        return i4 + compoundPaddingLeft;
    }

    private int I(int i4, boolean z3) {
        int compoundPaddingRight;
        if (!z3 && getSuffixText() != null) {
            compoundPaddingRight = this.f12277c.y();
        } else if (!z3 || getPrefixText() == null) {
            compoundPaddingRight = this.f12279d.getCompoundPaddingRight();
        } else {
            compoundPaddingRight = this.f12275b.c();
        }
        return i4 - compoundPaddingRight;
    }

    private static Drawable J(Context context, Q1.g gVar, int i4, int[][] iArr) {
        int c4 = F1.a.c(context, C0970a.colorSurface, "TextInputLayout");
        Q1.g gVar2 = new Q1.g(gVar.A());
        int i5 = F1.a.i(i4, c4, 0.1f);
        gVar2.T(new ColorStateList(iArr, new int[]{i5, 0}));
        gVar2.setTint(c4);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{i5, c4});
        Q1.g gVar3 = new Q1.g(gVar.A());
        gVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
    }

    private void K() {
        TextView textView = this.f12311t;
        if (textView != null && this.f12309s) {
            textView.setText((CharSequence) null);
            C0623n.a(this.f12273a, this.f12319x);
            this.f12311t.setVisibility(4);
        }
    }

    private boolean P() {
        if (b0() || (this.f12301o != null && this.f12297m)) {
            return true;
        }
        return false;
    }

    private boolean R() {
        if (this.f12264O != 1 || this.f12279d.getMinLines() > 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int S(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private void T() {
        o();
        o0();
        x0();
        f0();
        j();
        if (this.f12264O != 0) {
            q0();
        }
        Z();
    }

    private void U() {
        if (A()) {
            RectF rectF = this.f12274a0;
            this.f12314u0.o(rectF, this.f12279d.getWidth(), this.f12279d.getGravity());
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                n(rectF);
                rectF.offset((float) (-getPaddingLeft()), (((float) (-getPaddingTop())) - (rectF.height() / 2.0f)) + ((float) this.f12266Q));
                ((C0581h) this.f12255F).k0(rectF);
            }
        }
    }

    private void V() {
        if (A() && !this.f12312t0) {
            x();
            U();
        }
    }

    private static void W(ViewGroup viewGroup, boolean z3) {
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            childAt.setEnabled(z3);
            if (childAt instanceof ViewGroup) {
                W((ViewGroup) childAt, z3);
            }
        }
    }

    private void Y() {
        TextView textView = this.f12311t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void Z() {
        EditText editText = this.f12279d;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i4 = this.f12264O;
                if (i4 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i4 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    private boolean c0() {
        if ((this.f12277c.G() || ((this.f12277c.A() && L()) || this.f12277c.w() != null)) && this.f12277c.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private boolean d0() {
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f12275b.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private void e0() {
        if (this.f12311t != null && this.f12309s && !TextUtils.isEmpty(this.f12307r)) {
            this.f12311t.setText(this.f12307r);
            C0623n.a(this.f12273a, this.f12317w);
            this.f12311t.setVisibility(0);
            this.f12311t.bringToFront();
            announceForAccessibility(this.f12307r);
        }
    }

    private void f0() {
        if (this.f12264O != 1) {
            return;
        }
        if (N1.c.h(getContext())) {
            this.f12265P = getResources().getDimensionPixelSize(C0972c.material_font_2_0_box_collapsed_padding_top);
        } else if (N1.c.g(getContext())) {
            this.f12265P = getResources().getDimensionPixelSize(C0972c.material_font_1_3_box_collapsed_padding_top);
        }
    }

    private void g0(Rect rect) {
        Q1.g gVar = this.f12259J;
        if (gVar != null) {
            int i4 = rect.bottom;
            gVar.setBounds(rect.left, i4 - this.f12267R, rect.right, i4);
        }
        Q1.g gVar2 = this.f12260K;
        if (gVar2 != null) {
            int i5 = rect.bottom;
            gVar2.setBounds(rect.left, i5 - this.f12268S, rect.right, i5);
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f12279d;
        if (!(editText instanceof AutoCompleteTextView) || r.a(editText)) {
            return this.f12255F;
        }
        int d4 = F1.a.d(this.f12279d, C0970a.f16506f);
        int i4 = this.f12264O;
        if (i4 == 2) {
            return J(getContext(), this.f12255F, d4, f12249B0);
        }
        if (i4 == 1) {
            return G(this.f12255F, this.f12270U, d4, f12249B0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f12257H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f12257H = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.f12257H.addState(new int[0], F(false));
        }
        return this.f12257H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f12256G == null) {
            this.f12256G = F(true);
        }
        return this.f12256G;
    }

    private void h0() {
        Editable editable;
        if (this.f12301o != null) {
            EditText editText = this.f12279d;
            if (editText == null) {
                editable = null;
            } else {
                editable = editText.getText();
            }
            i0(editable);
        }
    }

    private void i() {
        TextView textView = this.f12311t;
        if (textView != null) {
            this.f12273a.addView(textView);
            this.f12311t.setVisibility(0);
        }
    }

    private void j() {
        if (this.f12279d != null && this.f12264O == 1) {
            if (N1.c.h(getContext())) {
                EditText editText = this.f12279d;
                P.D0(editText, P.G(editText), getResources().getDimensionPixelSize(C0972c.material_filled_edittext_font_2_0_padding_top), P.F(this.f12279d), getResources().getDimensionPixelSize(C0972c.material_filled_edittext_font_2_0_padding_bottom));
            } else if (N1.c.g(getContext())) {
                EditText editText2 = this.f12279d;
                P.D0(editText2, P.G(editText2), getResources().getDimensionPixelSize(C0972c.material_filled_edittext_font_1_3_padding_top), P.F(this.f12279d), getResources().getDimensionPixelSize(C0972c.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    private static void j0(Context context, TextView textView, int i4, int i5, boolean z3) {
        int i6;
        if (z3) {
            i6 = z1.h.character_counter_overflowed_content_description;
        } else {
            i6 = z1.h.character_counter_content_description;
        }
        textView.setContentDescription(context.getString(i6, new Object[]{Integer.valueOf(i4), Integer.valueOf(i5)}));
    }

    private void k0() {
        int i4;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f12301o;
        if (textView != null) {
            if (this.f12297m) {
                i4 = this.f12303p;
            } else {
                i4 = this.f12305q;
            }
            a0(textView, i4);
            if (!this.f12297m && (colorStateList2 = this.f12321y) != null) {
                this.f12301o.setTextColor(colorStateList2);
            }
            if (this.f12297m && (colorStateList = this.f12323z) != null) {
                this.f12301o.setTextColor(colorStateList);
            }
        }
    }

    private void l() {
        Q1.g gVar = this.f12255F;
        if (gVar != null) {
            k A3 = gVar.A();
            k kVar = this.f12261L;
            if (A3 != kVar) {
                this.f12255F.setShapeAppearanceModel(kVar);
            }
            if (v()) {
                this.f12255F.X((float) this.f12266Q, this.f12269T);
            }
            int p4 = p();
            this.f12270U = p4;
            this.f12255F.T(ColorStateList.valueOf(p4));
            m();
            o0();
        }
    }

    private void l0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f12250A;
        if (colorStateList2 == null) {
            colorStateList2 = F1.a.f(getContext(), C0970a.f16505e);
        }
        EditText editText = this.f12279d;
        if (editText != null && editText.getTextCursorDrawable() != null) {
            Drawable a4 = this.f12279d.getTextCursorDrawable();
            if (P() && (colorStateList = this.f12251B) != null) {
                colorStateList2 = colorStateList;
            }
            androidx.core.graphics.drawable.a.o(a4, colorStateList2);
        }
    }

    private void m() {
        ColorStateList colorStateList;
        if (this.f12259J != null && this.f12260K != null) {
            if (w()) {
                Q1.g gVar = this.f12259J;
                if (this.f12279d.isFocused()) {
                    colorStateList = ColorStateList.valueOf(this.f12294k0);
                } else {
                    colorStateList = ColorStateList.valueOf(this.f12269T);
                }
                gVar.T(colorStateList);
                this.f12260K.T(ColorStateList.valueOf(this.f12269T));
            }
            invalidate();
        }
    }

    private void n(RectF rectF) {
        float f4 = rectF.left;
        int i4 = this.f12263N;
        rectF.left = f4 - ((float) i4);
        rectF.right += (float) i4;
    }

    private void o() {
        int i4 = this.f12264O;
        if (i4 == 0) {
            this.f12255F = null;
            this.f12259J = null;
            this.f12260K = null;
        } else if (i4 == 1) {
            this.f12255F = new Q1.g(this.f12261L);
            this.f12259J = new Q1.g();
            this.f12260K = new Q1.g();
        } else if (i4 == 2) {
            if (!this.f12252C || (this.f12255F instanceof C0581h)) {
                this.f12255F = new Q1.g(this.f12261L);
            } else {
                this.f12255F = C0581h.f0(this.f12261L);
            }
            this.f12259J = null;
            this.f12260K = null;
        } else {
            throw new IllegalArgumentException(this.f12264O + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    private int p() {
        int i4 = this.f12270U;
        if (this.f12264O == 1) {
            return F1.a.h(F1.a.e(this, C0970a.colorSurface, 0), this.f12270U);
        }
        return i4;
    }

    private boolean p0() {
        int max;
        if (this.f12279d == null || this.f12279d.getMeasuredHeight() >= (max = Math.max(this.f12277c.getMeasuredHeight(), this.f12275b.getMeasuredHeight()))) {
            return false;
        }
        this.f12279d.setMinimumHeight(max);
        return true;
    }

    private Rect q(Rect rect) {
        if (this.f12279d != null) {
            Rect rect2 = this.f12272W;
            boolean g4 = m.g(this);
            rect2.bottom = rect.bottom;
            int i4 = this.f12264O;
            if (i4 == 1) {
                rect2.left = H(rect.left, g4);
                rect2.top = rect.top + this.f12265P;
                rect2.right = I(rect.right, g4);
                return rect2;
            } else if (i4 != 2) {
                rect2.left = H(rect.left, g4);
                rect2.top = getPaddingTop();
                rect2.right = I(rect.right, g4);
                return rect2;
            } else {
                rect2.left = rect.left + this.f12279d.getPaddingLeft();
                rect2.top = rect.top - u();
                rect2.right = rect.right - this.f12279d.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    private void q0() {
        if (this.f12264O != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f12273a.getLayoutParams();
            int u3 = u();
            if (u3 != layoutParams.topMargin) {
                layoutParams.topMargin = u3;
                this.f12273a.requestLayout();
            }
        }
    }

    private int r(Rect rect, Rect rect2, float f4) {
        if (R()) {
            return (int) (((float) rect2.top) + f4);
        }
        return rect.bottom - this.f12279d.getCompoundPaddingBottom();
    }

    private int s(Rect rect, float f4) {
        if (R()) {
            return (int) (((float) rect.centerY()) - (f4 / 2.0f));
        }
        return rect.top + this.f12279d.getCompoundPaddingTop();
    }

    private void s0(boolean z3, boolean z4) {
        boolean z5;
        ColorStateList colorStateList;
        TextView textView;
        int i4;
        boolean isEnabled = isEnabled();
        EditText editText = this.f12279d;
        boolean z6 = false;
        if (editText == null || TextUtils.isEmpty(editText.getText())) {
            z5 = false;
        } else {
            z5 = true;
        }
        EditText editText2 = this.f12279d;
        if (editText2 != null && editText2.hasFocus()) {
            z6 = true;
        }
        ColorStateList colorStateList2 = this.f12290i0;
        if (colorStateList2 != null) {
            this.f12314u0.M(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f12290i0;
            if (colorStateList3 != null) {
                i4 = colorStateList3.getColorForState(new int[]{-16842910}, this.f12310s0);
            } else {
                i4 = this.f12310s0;
            }
            this.f12314u0.M(ColorStateList.valueOf(i4));
        } else if (b0()) {
            this.f12314u0.M(this.f12291j.r());
        } else if (this.f12297m && (textView = this.f12301o) != null) {
            this.f12314u0.M(textView.getTextColors());
        } else if (z6 && (colorStateList = this.f12292j0) != null) {
            this.f12314u0.R(colorStateList);
        }
        if (z5 || !this.f12316v0 || (isEnabled() && z6)) {
            if (z4 || this.f12312t0) {
                y(z3);
            }
        } else if (z4 || !this.f12312t0) {
            E(z3);
        }
    }

    private void setEditText(EditText editText) {
        if (this.f12279d == null) {
            if (getEndIconMode() != 3) {
                boolean z3 = editText instanceof TextInputEditText;
            }
            this.f12279d = editText;
            int i4 = this.f12283f;
            if (i4 != -1) {
                setMinEms(i4);
            } else {
                setMinWidth(this.f12287h);
            }
            int i5 = this.f12285g;
            if (i5 != -1) {
                setMaxEms(i5);
            } else {
                setMaxWidth(this.f12289i);
            }
            this.f12258I = false;
            T();
            setTextInputAccessibilityDelegate(new e(this));
            this.f12314u0.i0(this.f12279d.getTypeface());
            this.f12314u0.a0(this.f12279d.getTextSize());
            int i6 = Build.VERSION.SDK_INT;
            this.f12314u0.X(this.f12279d.getLetterSpacing());
            int gravity = this.f12279d.getGravity();
            this.f12314u0.S((gravity & -113) | 48);
            this.f12314u0.Z(gravity);
            this.f12279d.addTextChangedListener(new a());
            if (this.f12290i0 == null) {
                this.f12290i0 = this.f12279d.getHintTextColors();
            }
            if (this.f12252C) {
                if (TextUtils.isEmpty(this.f12253D)) {
                    CharSequence hint = this.f12279d.getHint();
                    this.f12281e = hint;
                    setHint(hint);
                    this.f12279d.setHint((CharSequence) null);
                }
                this.f12254E = true;
            }
            if (i6 >= 29) {
                l0();
            }
            if (this.f12301o != null) {
                i0(this.f12279d.getText());
            }
            n0();
            this.f12291j.f();
            this.f12275b.bringToFront();
            this.f12277c.bringToFront();
            B();
            this.f12277c.x0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            s0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f12253D)) {
            this.f12253D = charSequence;
            this.f12314u0.g0(charSequence);
            if (!this.f12312t0) {
                U();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z3) {
        if (this.f12309s != z3) {
            if (z3) {
                i();
            } else {
                Y();
                this.f12311t = null;
            }
            this.f12309s = z3;
        }
    }

    private Rect t(Rect rect) {
        if (this.f12279d != null) {
            Rect rect2 = this.f12272W;
            float w3 = this.f12314u0.w();
            rect2.left = rect.left + this.f12279d.getCompoundPaddingLeft();
            rect2.top = s(rect, w3);
            rect2.right = rect.right - this.f12279d.getCompoundPaddingRight();
            rect2.bottom = r(rect, rect2, w3);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private void t0() {
        EditText editText;
        if (this.f12311t != null && (editText = this.f12279d) != null) {
            this.f12311t.setGravity(editText.getGravity());
            this.f12311t.setPadding(this.f12279d.getCompoundPaddingLeft(), this.f12279d.getCompoundPaddingTop(), this.f12279d.getCompoundPaddingRight(), this.f12279d.getCompoundPaddingBottom());
        }
    }

    private int u() {
        float q4;
        if (!this.f12252C) {
            return 0;
        }
        int i4 = this.f12264O;
        if (i4 == 0) {
            q4 = this.f12314u0.q();
        } else if (i4 != 2) {
            return 0;
        } else {
            q4 = this.f12314u0.q() / 2.0f;
        }
        return (int) q4;
    }

    private void u0() {
        Editable editable;
        EditText editText = this.f12279d;
        if (editText == null) {
            editable = null;
        } else {
            editable = editText.getText();
        }
        v0(editable);
    }

    private boolean v() {
        if (this.f12264O != 2 || !w()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void v0(Editable editable) {
        if (this.f12299n.a(editable) != 0 || this.f12312t0) {
            K();
        } else {
            e0();
        }
    }

    private boolean w() {
        if (this.f12266Q <= -1 || this.f12269T == 0) {
            return false;
        }
        return true;
    }

    private void w0(boolean z3, boolean z4) {
        int defaultColor = this.f12300n0.getDefaultColor();
        int colorForState = this.f12300n0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f12300n0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z3) {
            this.f12269T = colorForState2;
        } else if (z4) {
            this.f12269T = colorForState;
        } else {
            this.f12269T = defaultColor;
        }
    }

    private void x() {
        if (A()) {
            ((C0581h) this.f12255F).i0();
        }
    }

    private void y(boolean z3) {
        ValueAnimator valueAnimator = this.f12320x0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f12320x0.cancel();
        }
        if (!z3 || !this.f12318w0) {
            this.f12314u0.c0(1.0f);
        } else {
            k(1.0f);
        }
        this.f12312t0 = false;
        if (A()) {
            U();
        }
        u0();
        this.f12275b.l(false);
        this.f12277c.H(false);
    }

    private C0613d z() {
        C0613d dVar = new C0613d();
        dVar.Y((long) L1.d.f(getContext(), C0970a.motionDurationShort2, 87));
        dVar.a0(L1.d.g(getContext(), C0970a.motionEasingLinearInterpolator, A1.a.f5a));
        return dVar;
    }

    public boolean L() {
        return this.f12277c.F();
    }

    public boolean M() {
        return this.f12291j.A();
    }

    public boolean N() {
        return this.f12291j.B();
    }

    /* access modifiers changed from: package-private */
    public final boolean O() {
        return this.f12312t0;
    }

    public boolean Q() {
        return this.f12254E;
    }

    public void X() {
        this.f12275b.m();
    }

    /* access modifiers changed from: package-private */
    public void a0(TextView textView, int i4) {
        try {
            j.o(textView, i4);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        j.o(textView, i.f16512a);
        textView.setTextColor(androidx.core.content.a.b(getContext(), C0971b.design_error));
    }

    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f12273a.addView(view, layoutParams2);
            this.f12273a.setLayoutParams(layoutParams);
            q0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i4, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public boolean b0() {
        return this.f12291j.l();
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i4) {
        EditText editText = this.f12279d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i4);
            return;
        }
        if (this.f12281e != null) {
            boolean z3 = this.f12254E;
            this.f12254E = false;
            CharSequence hint = editText.getHint();
            this.f12279d.setHint(this.f12281e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i4);
            } finally {
                this.f12279d.setHint(hint);
                this.f12254E = z3;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i4);
            onProvideAutofillVirtualStructure(viewStructure, i4);
            viewStructure.setChildCount(this.f12273a.getChildCount());
            for (int i5 = 0; i5 < this.f12273a.getChildCount(); i5++) {
                View childAt = this.f12273a.getChildAt(i5);
                ViewStructure newChild = viewStructure.newChild(i5);
                childAt.dispatchProvideAutofillStructure(newChild, i4);
                if (childAt == this.f12279d) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f12324z0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f12324z0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        D(canvas);
        C(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z3;
        if (!this.f12322y0) {
            boolean z4 = true;
            this.f12322y0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            com.google.android.material.internal.a aVar = this.f12314u0;
            if (aVar != null) {
                z3 = aVar.f0(drawableState);
            } else {
                z3 = false;
            }
            if (this.f12279d != null) {
                if (!P.S(this) || !isEnabled()) {
                    z4 = false;
                }
                r0(z4);
            }
            n0();
            x0();
            if (z3) {
                invalidate();
            }
            this.f12322y0 = false;
        }
    }

    public int getBaseline() {
        EditText editText = this.f12279d;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + u();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public Q1.g getBoxBackground() {
        int i4 = this.f12264O;
        if (i4 == 1 || i4 == 2) {
            return this.f12255F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f12270U;
    }

    public int getBoxBackgroundMode() {
        return this.f12264O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f12265P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (m.g(this)) {
            return this.f12261L.j().a(this.f12274a0);
        }
        return this.f12261L.l().a(this.f12274a0);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (m.g(this)) {
            return this.f12261L.l().a(this.f12274a0);
        }
        return this.f12261L.j().a(this.f12274a0);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (m.g(this)) {
            return this.f12261L.r().a(this.f12274a0);
        }
        return this.f12261L.t().a(this.f12274a0);
    }

    public float getBoxCornerRadiusTopStart() {
        if (m.g(this)) {
            return this.f12261L.t().a(this.f12274a0);
        }
        return this.f12261L.r().a(this.f12274a0);
    }

    public int getBoxStrokeColor() {
        return this.f12298m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f12300n0;
    }

    public int getBoxStrokeWidth() {
        return this.f12267R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f12268S;
    }

    public int getCounterMaxLength() {
        return this.f12295l;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f12293k || !this.f12297m || (textView = this.f12301o) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f12323z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f12321y;
    }

    public ColorStateList getCursorColor() {
        return this.f12250A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f12251B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f12290i0;
    }

    public EditText getEditText() {
        return this.f12279d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f12277c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f12277c.n();
    }

    public int getEndIconMinSize() {
        return this.f12277c.o();
    }

    public int getEndIconMode() {
        return this.f12277c.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f12277c.q();
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f12277c.r();
    }

    public CharSequence getError() {
        if (this.f12291j.A()) {
            return this.f12291j.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f12291j.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f12291j.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f12291j.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f12277c.s();
    }

    public CharSequence getHelperText() {
        if (this.f12291j.B()) {
            return this.f12291j.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f12291j.u();
    }

    public CharSequence getHint() {
        if (this.f12252C) {
            return this.f12253D;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.f12314u0.q();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f12314u0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f12292j0;
    }

    public f getLengthCounter() {
        return this.f12299n;
    }

    public int getMaxEms() {
        return this.f12285g;
    }

    public int getMaxWidth() {
        return this.f12289i;
    }

    public int getMinEms() {
        return this.f12283f;
    }

    public int getMinWidth() {
        return this.f12287h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f12277c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f12277c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f12309s) {
            return this.f12307r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f12315v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f12313u;
    }

    public CharSequence getPrefixText() {
        return this.f12275b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f12275b.b();
    }

    public TextView getPrefixTextView() {
        return this.f12275b.d();
    }

    public k getShapeAppearanceModel() {
        return this.f12261L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f12275b.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f12275b.f();
    }

    public int getStartIconMinSize() {
        return this.f12275b.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f12275b.h();
    }

    public CharSequence getSuffixText() {
        return this.f12277c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f12277c.x();
    }

    public TextView getSuffixTextView() {
        return this.f12277c.z();
    }

    public Typeface getTypeface() {
        return this.f12276b0;
    }

    public void h(g gVar) {
        this.f12282e0.add(gVar);
        if (this.f12279d != null) {
            gVar.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void i0(Editable editable) {
        boolean z3;
        int a4 = this.f12299n.a(editable);
        boolean z4 = this.f12297m;
        int i4 = this.f12295l;
        if (i4 == -1) {
            this.f12301o.setText(String.valueOf(a4));
            this.f12301o.setContentDescription((CharSequence) null);
            this.f12297m = false;
        } else {
            if (a4 > i4) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f12297m = z3;
            j0(getContext(), this.f12301o, a4, this.f12295l, this.f12297m);
            if (z4 != this.f12297m) {
                k0();
            }
            this.f12301o.setText(androidx.core.text.a.c().j(getContext().getString(z1.h.character_counter_pattern, new Object[]{Integer.valueOf(a4), Integer.valueOf(this.f12295l)})));
        }
        if (this.f12279d != null && z4 != this.f12297m) {
            r0(false);
            x0();
            n0();
        }
    }

    /* access modifiers changed from: package-private */
    public void k(float f4) {
        if (this.f12314u0.x() != f4) {
            if (this.f12320x0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f12320x0 = valueAnimator;
                valueAnimator.setInterpolator(L1.d.g(getContext(), C0970a.motionEasingEmphasizedInterpolator, A1.a.f6b));
                this.f12320x0.setDuration((long) L1.d.f(getContext(), C0970a.motionDurationMedium4, 167));
                this.f12320x0.addUpdateListener(new d());
            }
            this.f12320x0.setFloatValues(new float[]{this.f12314u0.x(), f4});
            this.f12320x0.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f12279d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.d0()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 == 0) goto L_0x0049
            com.google.android.material.textfield.A r0 = r10.f12275b
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f12279d
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f12278c0
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f12280d0
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f12278c0 = r6
            r10.f12280d0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.f12279d
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.j.a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f12278c0
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.f12279d
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.j.j(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.f12278c0
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.f12279d
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.j.a(r0)
            android.widget.EditText r6 = r10.f12279d
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.j.j(r6, r2, r7, r8, r0)
            r10.f12278c0 = r2
        L_0x0060:
            r0 = r5
            goto L_0x0063
        L_0x0062:
            r0 = r1
        L_0x0063:
            boolean r6 = r10.c0()
            if (r6 == 0) goto L_0x00d8
            com.google.android.material.textfield.s r2 = r10.f12277c
            android.widget.TextView r2 = r2.z()
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f12279d
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.textfield.s r6 = r10.f12277c
            com.google.android.material.internal.CheckableImageButton r6 = r6.k()
            if (r6 == 0) goto L_0x0092
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = androidx.core.view.r.b(r6)
            int r2 = r2 + r6
        L_0x0092:
            android.widget.EditText r6 = r10.f12279d
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.j.a(r6)
            android.graphics.drawable.Drawable r7 = r10.f12284f0
            if (r7 == 0) goto L_0x00b3
            int r8 = r10.f12286g0
            if (r8 == r2) goto L_0x00b3
            r10.f12286g0 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.f12279d
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r3 = r10.f12284f0
            r4 = r6[r4]
            androidx.core.widget.j.j(r0, r1, r2, r3, r4)
            goto L_0x00d6
        L_0x00b3:
            if (r7 != 0) goto L_0x00c1
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f12284f0 = r7
            r10.f12286g0 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00c1:
            r2 = r6[r3]
            android.graphics.drawable.Drawable r3 = r10.f12284f0
            if (r2 == r3) goto L_0x00d5
            r10.f12288h0 = r2
            android.widget.EditText r0 = r10.f12279d
            r1 = r6[r1]
            r2 = r6[r5]
            r4 = r6[r4]
            androidx.core.widget.j.j(r0, r1, r2, r3, r4)
            goto L_0x00d6
        L_0x00d5:
            r5 = r0
        L_0x00d6:
            r0 = r5
            goto L_0x00fa
        L_0x00d8:
            android.graphics.drawable.Drawable r6 = r10.f12284f0
            if (r6 == 0) goto L_0x00fa
            android.widget.EditText r6 = r10.f12279d
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.j.a(r6)
            r3 = r6[r3]
            android.graphics.drawable.Drawable r7 = r10.f12284f0
            if (r3 != r7) goto L_0x00f6
            android.widget.EditText r0 = r10.f12279d
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f12288h0
            r4 = r6[r4]
            androidx.core.widget.j.j(r0, r1, r3, r7, r4)
            goto L_0x00f7
        L_0x00f6:
            r5 = r0
        L_0x00f7:
            r10.f12284f0 = r2
            goto L_0x00d6
        L_0x00fa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m0():boolean");
    }

    /* access modifiers changed from: package-private */
    public void n0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f12279d;
        if (editText != null && this.f12264O == 0 && (background = editText.getBackground()) != null) {
            if (K.a(background)) {
                background = background.mutate();
            }
            if (b0()) {
                background.setColorFilter(C0387k.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f12297m || (textView = this.f12301o) == null) {
                androidx.core.graphics.drawable.a.c(background);
                this.f12279d.refreshDrawableState();
            } else {
                background.setColorFilter(C0387k.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o0() {
        EditText editText = this.f12279d;
        if (editText != null && this.f12255F != null) {
            if ((this.f12258I || editText.getBackground() == null) && this.f12264O != 0) {
                P.s0(this.f12279d, getEditTextBoxBackground());
                this.f12258I = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f12314u0.H(configuration);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        EditText editText = this.f12279d;
        if (editText != null) {
            Rect rect = this.f12271V;
            com.google.android.material.internal.b.a(this, editText, rect);
            g0(rect);
            if (this.f12252C) {
                this.f12314u0.a0(this.f12279d.getTextSize());
                int gravity = this.f12279d.getGravity();
                this.f12314u0.S((gravity & -113) | 48);
                this.f12314u0.Z(gravity);
                this.f12314u0.O(q(rect));
                this.f12314u0.W(t(rect));
                this.f12314u0.J();
                if (A() && !this.f12312t0) {
                    U();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        boolean p02 = p0();
        boolean m02 = m0();
        if (p02 || m02) {
            this.f12279d.post(new c());
        }
        t0();
        this.f12277c.x0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.t());
        setError(hVar.f12330c);
        if (hVar.f12331d) {
            post(new b());
        }
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        boolean z3 = true;
        if (i4 != 1) {
            z3 = false;
        }
        if (z3 != this.f12262M) {
            float a4 = this.f12261L.r().a(this.f12274a0);
            float a5 = this.f12261L.t().a(this.f12274a0);
            float a6 = this.f12261L.j().a(this.f12274a0);
            float a7 = this.f12261L.l().a(this.f12274a0);
            Q1.d q4 = this.f12261L.q();
            Q1.d s4 = this.f12261L.s();
            k m4 = k.a().z(s4).D(q4).r(this.f12261L.k()).v(this.f12261L.i()).A(a5).E(a4).s(a7).w(a6).m();
            this.f12262M = z3;
            setShapeAppearanceModel(m4);
        }
    }

    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (b0()) {
            hVar.f12330c = getError();
        }
        hVar.f12331d = this.f12277c.E();
        return hVar;
    }

    /* access modifiers changed from: package-private */
    public void r0(boolean z3) {
        s0(z3, false);
    }

    public void setBoxBackgroundColor(int i4) {
        if (this.f12270U != i4) {
            this.f12270U = i4;
            this.f12302o0 = i4;
            this.f12306q0 = i4;
            this.f12308r0 = i4;
            l();
        }
    }

    public void setBoxBackgroundColorResource(int i4) {
        setBoxBackgroundColor(androidx.core.content.a.b(getContext(), i4));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f12302o0 = defaultColor;
        this.f12270U = defaultColor;
        this.f12304p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f12306q0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f12308r0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        l();
    }

    public void setBoxBackgroundMode(int i4) {
        if (i4 != this.f12264O) {
            this.f12264O = i4;
            if (this.f12279d != null) {
                T();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i4) {
        this.f12265P = i4;
    }

    public void setBoxCornerFamily(int i4) {
        this.f12261L = this.f12261L.v().y(i4, this.f12261L.r()).C(i4, this.f12261L.t()).q(i4, this.f12261L.j()).u(i4, this.f12261L.l()).m();
        l();
    }

    public void setBoxStrokeColor(int i4) {
        if (this.f12298m0 != i4) {
            this.f12298m0 = i4;
            x0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f12294k0 = colorStateList.getDefaultColor();
            this.f12310s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f12296l0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f12298m0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f12298m0 != colorStateList.getDefaultColor()) {
            this.f12298m0 = colorStateList.getDefaultColor();
        }
        x0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f12300n0 != colorStateList) {
            this.f12300n0 = colorStateList;
            x0();
        }
    }

    public void setBoxStrokeWidth(int i4) {
        this.f12267R = i4;
        x0();
    }

    public void setBoxStrokeWidthFocused(int i4) {
        this.f12268S = i4;
        x0();
    }

    public void setBoxStrokeWidthFocusedResource(int i4) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i4));
    }

    public void setBoxStrokeWidthResource(int i4) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i4));
    }

    public void setCounterEnabled(boolean z3) {
        if (this.f12293k != z3) {
            if (z3) {
                D d4 = new D(getContext());
                this.f12301o = d4;
                d4.setId(z1.e.textinput_counter);
                Typeface typeface = this.f12276b0;
                if (typeface != null) {
                    this.f12301o.setTypeface(typeface);
                }
                this.f12301o.setMaxLines(1);
                this.f12291j.e(this.f12301o, 2);
                r.d((ViewGroup.MarginLayoutParams) this.f12301o.getLayoutParams(), getResources().getDimensionPixelOffset(C0972c.mtrl_textinput_counter_margin_start));
                k0();
                h0();
            } else {
                this.f12291j.C(this.f12301o, 2);
                this.f12301o = null;
            }
            this.f12293k = z3;
        }
    }

    public void setCounterMaxLength(int i4) {
        if (this.f12295l != i4) {
            if (i4 > 0) {
                this.f12295l = i4;
            } else {
                this.f12295l = -1;
            }
            if (this.f12293k) {
                h0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i4) {
        if (this.f12303p != i4) {
            this.f12303p = i4;
            k0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f12323z != colorStateList) {
            this.f12323z = colorStateList;
            k0();
        }
    }

    public void setCounterTextAppearance(int i4) {
        if (this.f12305q != i4) {
            this.f12305q = i4;
            k0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f12321y != colorStateList) {
            this.f12321y = colorStateList;
            k0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f12250A != colorStateList) {
            this.f12250A = colorStateList;
            l0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f12251B != colorStateList) {
            this.f12251B = colorStateList;
            if (P()) {
                l0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f12290i0 = colorStateList;
        this.f12292j0 = colorStateList;
        if (this.f12279d != null) {
            r0(false);
        }
    }

    public void setEnabled(boolean z3) {
        W(this, z3);
        super.setEnabled(z3);
    }

    public void setEndIconActivated(boolean z3) {
        this.f12277c.N(z3);
    }

    public void setEndIconCheckable(boolean z3) {
        this.f12277c.O(z3);
    }

    public void setEndIconContentDescription(int i4) {
        this.f12277c.P(i4);
    }

    public void setEndIconDrawable(int i4) {
        this.f12277c.R(i4);
    }

    public void setEndIconMinSize(int i4) {
        this.f12277c.T(i4);
    }

    public void setEndIconMode(int i4) {
        this.f12277c.U(i4);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f12277c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f12277c.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f12277c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f12277c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f12277c.Z(mode);
    }

    public void setEndIconVisible(boolean z3) {
        this.f12277c.a0(z3);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f12291j.A()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f12291j.Q(charSequence);
        } else {
            this.f12291j.w();
        }
    }

    public void setErrorAccessibilityLiveRegion(int i4) {
        this.f12291j.E(i4);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f12291j.F(charSequence);
    }

    public void setErrorEnabled(boolean z3) {
        this.f12291j.G(z3);
    }

    public void setErrorIconDrawable(int i4) {
        this.f12277c.b0(i4);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f12277c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f12277c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f12277c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f12277c.g0(mode);
    }

    public void setErrorTextAppearance(int i4) {
        this.f12291j.H(i4);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f12291j.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z3) {
        if (this.f12316v0 != z3) {
            this.f12316v0 = z3;
            r0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!N()) {
                setHelperTextEnabled(true);
            }
            this.f12291j.R(charSequence);
        } else if (N()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f12291j.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z3) {
        this.f12291j.K(z3);
    }

    public void setHelperTextTextAppearance(int i4) {
        this.f12291j.J(i4);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f12252C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z3) {
        this.f12318w0 = z3;
    }

    public void setHintEnabled(boolean z3) {
        if (z3 != this.f12252C) {
            this.f12252C = z3;
            if (!z3) {
                this.f12254E = false;
                if (!TextUtils.isEmpty(this.f12253D) && TextUtils.isEmpty(this.f12279d.getHint())) {
                    this.f12279d.setHint(this.f12253D);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f12279d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f12253D)) {
                        setHint(hint);
                    }
                    this.f12279d.setHint((CharSequence) null);
                }
                this.f12254E = true;
            }
            if (this.f12279d != null) {
                q0();
            }
        }
    }

    public void setHintTextAppearance(int i4) {
        this.f12314u0.P(i4);
        this.f12292j0 = this.f12314u0.p();
        if (this.f12279d != null) {
            r0(false);
            q0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f12292j0 != colorStateList) {
            if (this.f12290i0 == null) {
                this.f12314u0.R(colorStateList);
            }
            this.f12292j0 = colorStateList;
            if (this.f12279d != null) {
                r0(false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.f12299n = fVar;
    }

    public void setMaxEms(int i4) {
        this.f12285g = i4;
        EditText editText = this.f12279d;
        if (editText != null && i4 != -1) {
            editText.setMaxEms(i4);
        }
    }

    public void setMaxWidth(int i4) {
        this.f12289i = i4;
        EditText editText = this.f12279d;
        if (editText != null && i4 != -1) {
            editText.setMaxWidth(i4);
        }
    }

    public void setMaxWidthResource(int i4) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i4));
    }

    public void setMinEms(int i4) {
        this.f12283f = i4;
        EditText editText = this.f12279d;
        if (editText != null && i4 != -1) {
            editText.setMinEms(i4);
        }
    }

    public void setMinWidth(int i4) {
        this.f12287h = i4;
        EditText editText = this.f12279d;
        if (editText != null && i4 != -1) {
            editText.setMinWidth(i4);
        }
    }

    public void setMinWidthResource(int i4) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i4));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i4) {
        this.f12277c.i0(i4);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i4) {
        this.f12277c.k0(i4);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z3) {
        this.f12277c.m0(z3);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f12277c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f12277c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f12311t == null) {
            D d4 = new D(getContext());
            this.f12311t = d4;
            d4.setId(z1.e.textinput_placeholder);
            P.y0(this.f12311t, 2);
            C0613d z3 = z();
            this.f12317w = z3;
            z3.d0(67);
            this.f12319x = z();
            setPlaceholderTextAppearance(this.f12315v);
            setPlaceholderTextColor(this.f12313u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f12309s) {
                setPlaceholderTextEnabled(true);
            }
            this.f12307r = charSequence;
        }
        u0();
    }

    public void setPlaceholderTextAppearance(int i4) {
        this.f12315v = i4;
        TextView textView = this.f12311t;
        if (textView != null) {
            j.o(textView, i4);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f12313u != colorStateList) {
            this.f12313u = colorStateList;
            TextView textView = this.f12311t;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f12275b.n(charSequence);
    }

    public void setPrefixTextAppearance(int i4) {
        this.f12275b.o(i4);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f12275b.p(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        Q1.g gVar = this.f12255F;
        if (gVar != null && gVar.A() != kVar) {
            this.f12261L = kVar;
            l();
        }
    }

    public void setStartIconCheckable(boolean z3) {
        this.f12275b.q(z3);
    }

    public void setStartIconContentDescription(int i4) {
        setStartIconContentDescription(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setStartIconDrawable(int i4) {
        setStartIconDrawable(i4 != 0 ? C0836a.b(getContext(), i4) : null);
    }

    public void setStartIconMinSize(int i4) {
        this.f12275b.t(i4);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f12275b.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f12275b.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f12275b.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f12275b.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f12275b.y(mode);
    }

    public void setStartIconVisible(boolean z3) {
        this.f12275b.z(z3);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f12277c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i4) {
        this.f12277c.q0(i4);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f12277c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f12279d;
        if (editText != null) {
            P.o0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f12276b0) {
            this.f12276b0 = typeface;
            this.f12314u0.i0(typeface);
            this.f12291j.N(typeface);
            TextView textView = this.f12301o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void x0() {
        boolean z3;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f12255F != null && this.f12264O != 0) {
            boolean z4 = false;
            if (isFocused() || ((editText2 = this.f12279d) != null && editText2.hasFocus())) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (isHovered() || ((editText = this.f12279d) != null && editText.isHovered())) {
                z4 = true;
            }
            if (!isEnabled()) {
                this.f12269T = this.f12310s0;
            } else if (b0()) {
                if (this.f12300n0 != null) {
                    w0(z3, z4);
                } else {
                    this.f12269T = getErrorCurrentTextColors();
                }
            } else if (!this.f12297m || (textView = this.f12301o) == null) {
                if (z3) {
                    this.f12269T = this.f12298m0;
                } else if (z4) {
                    this.f12269T = this.f12296l0;
                } else {
                    this.f12269T = this.f12294k0;
                }
            } else if (this.f12300n0 != null) {
                w0(z3, z4);
            } else {
                this.f12269T = textView.getCurrentTextColor();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                l0();
            }
            this.f12277c.I();
            X();
            if (this.f12264O == 2) {
                int i4 = this.f12266Q;
                if (!z3 || !isEnabled()) {
                    this.f12266Q = this.f12267R;
                } else {
                    this.f12266Q = this.f12268S;
                }
                if (this.f12266Q != i4) {
                    V();
                }
            }
            if (this.f12264O == 1) {
                if (!isEnabled()) {
                    this.f12270U = this.f12304p0;
                } else if (z4 && !z3) {
                    this.f12270U = this.f12308r0;
                } else if (z3) {
                    this.f12270U = this.f12306q0;
                } else {
                    this.f12270U = this.f12302o0;
                }
            }
            l();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r22, android.util.AttributeSet r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r7 = r23
            r8 = r24
            int r9 = f12248A0
            r1 = r22
            android.content.Context r1 = T1.a.c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f12283f = r10
            r0.f12285g = r10
            r0.f12287h = r10
            r0.f12289i = r10
            com.google.android.material.textfield.v r1 = new com.google.android.material.textfield.v
            r1.<init>(r0)
            r0.f12291j = r1
            com.google.android.material.textfield.H r1 = new com.google.android.material.textfield.H
            r1.<init>()
            r0.f12299n = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f12271V = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f12272W = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f12274a0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f12282e0 = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.f12314u0 = r1
            android.content.Context r11 = r21.getContext()
            r12 = 1
            r0.setOrientation(r12)
            r13 = 0
            r0.setWillNotDraw(r13)
            r0.setAddStatesFromChildren(r12)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r11)
            r0.f12273a = r14
            r14.setAddStatesFromChildren(r12)
            android.animation.TimeInterpolator r2 = A1.a.f5a
            r1.h0(r2)
            r1.e0(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.S(r2)
            int[] r3 = z1.j.j5
            int r15 = z1.j.G5
            int r6 = z1.j.E5
            int r5 = z1.j.Y5
            int r4 = z1.j.d6
            int r2 = z1.j.h6
            int[] r16 = new int[]{r15, r6, r5, r4, r2}
            r1 = r11
            r17 = r2
            r2 = r23
            r18 = r4
            r4 = r24
            r19 = r5
            r5 = r9
            r20 = r6
            r6 = r16
            androidx.appcompat.widget.c0 r1 = com.google.android.material.internal.j.j(r1, r2, r3, r4, r5, r6)
            com.google.android.material.textfield.A r2 = new com.google.android.material.textfield.A
            r2.<init>(r0, r1)
            r0.f12275b = r2
            int r3 = z1.j.g6
            boolean r3 = r1.a(r3, r12)
            r0.f12252C = r3
            int r3 = z1.j.o5
            java.lang.CharSequence r3 = r1.p(r3)
            r0.setHint((java.lang.CharSequence) r3)
            int r3 = z1.j.f6
            boolean r3 = r1.a(r3, r12)
            r0.f12318w0 = r3
            int r3 = z1.j.a6
            boolean r3 = r1.a(r3, r12)
            r0.f12316v0 = r3
            int r3 = z1.j.q5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x00ce
            int r3 = r1.k(r3, r10)
            r0.setMinEms(r3)
            goto L_0x00dd
        L_0x00ce:
            int r3 = z1.j.n5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x00dd
            int r3 = r1.f(r3, r10)
            r0.setMinWidth(r3)
        L_0x00dd:
            int r3 = z1.j.p5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x00ed
            int r3 = r1.k(r3, r10)
            r0.setMaxEms(r3)
            goto L_0x00fc
        L_0x00ed:
            int r3 = z1.j.m5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x00fc
            int r3 = r1.f(r3, r10)
            r0.setMaxWidth(r3)
        L_0x00fc:
            Q1.k$b r3 = Q1.k.e(r11, r7, r8, r9)
            Q1.k r3 = r3.m()
            r0.f12261L = r3
            android.content.res.Resources r3 = r11.getResources()
            int r4 = z1.C0972c.mtrl_textinput_box_label_cutout_padding
            int r3 = r3.getDimensionPixelOffset(r4)
            r0.f12263N = r3
            int r3 = z1.j.t5
            int r3 = r1.e(r3, r13)
            r0.f12265P = r3
            int r3 = z1.j.A5
            android.content.res.Resources r4 = r11.getResources()
            int r5 = z1.C0972c.mtrl_textinput_box_stroke_width_default
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.f(r3, r4)
            r0.f12267R = r3
            int r3 = z1.j.B5
            android.content.res.Resources r4 = r11.getResources()
            int r5 = z1.C0972c.mtrl_textinput_box_stroke_width_focused
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.f(r3, r4)
            r0.f12268S = r3
            int r3 = r0.f12267R
            r0.f12266Q = r3
            int r3 = z1.j.x5
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r1.d(r3, r4)
            int r5 = z1.j.w5
            float r5 = r1.d(r5, r4)
            int r6 = z1.j.u5
            float r6 = r1.d(r6, r4)
            int r7 = z1.j.v5
            float r4 = r1.d(r7, r4)
            Q1.k r7 = r0.f12261L
            Q1.k$b r7 = r7.v()
            r8 = 0
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x016a
            r7.A(r3)
        L_0x016a:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0171
            r7.E(r5)
        L_0x0171:
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0178
            r7.w(r6)
        L_0x0178:
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x017f
            r7.s(r4)
        L_0x017f:
            Q1.k r3 = r7.m()
            r0.f12261L = r3
            int r3 = z1.j.r5
            android.content.res.ColorStateList r3 = N1.c.b(r11, r1, r3)
            if (r3 == 0) goto L_0x01e5
            int r4 = r3.getDefaultColor()
            r0.f12302o0 = r4
            r0.f12270U = r4
            boolean r4 = r3.isStateful()
            r5 = 16843623(0x1010367, float:2.3696E-38)
            r6 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L_0x01c6
            int[] r4 = new int[]{r6}
            int r4 = r3.getColorForState(r4, r10)
            r0.f12304p0 = r4
            r4 = 16842908(0x101009c, float:2.3693995E-38)
            r6 = 16842910(0x101009e, float:2.3694E-38)
            int[] r4 = new int[]{r4, r6}
            int r4 = r3.getColorForState(r4, r10)
            r0.f12306q0 = r4
            int[] r4 = new int[]{r5, r6}
            int r3 = r3.getColorForState(r4, r10)
            r0.f12308r0 = r3
            goto L_0x01ef
        L_0x01c6:
            int r3 = r0.f12302o0
            r0.f12306q0 = r3
            int r3 = z1.C0971b.mtrl_filled_background_color
            android.content.res.ColorStateList r3 = o.C0836a.a(r11, r3)
            int[] r4 = new int[]{r6}
            int r4 = r3.getColorForState(r4, r10)
            r0.f12304p0 = r4
            int[] r4 = new int[]{r5}
            int r3 = r3.getColorForState(r4, r10)
            r0.f12308r0 = r3
            goto L_0x01ef
        L_0x01e5:
            r0.f12270U = r13
            r0.f12302o0 = r13
            r0.f12304p0 = r13
            r0.f12306q0 = r13
            r0.f12308r0 = r13
        L_0x01ef:
            int r3 = z1.j.l5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x01ff
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.f12292j0 = r3
            r0.f12290i0 = r3
        L_0x01ff:
            int r3 = z1.j.y5
            android.content.res.ColorStateList r4 = N1.c.b(r11, r1, r3)
            int r3 = r1.b(r3, r13)
            r0.f12298m0 = r3
            int r3 = z1.C0971b.mtrl_textinput_default_box_stroke_color
            int r3 = androidx.core.content.a.b(r11, r3)
            r0.f12294k0 = r3
            int r3 = z1.C0971b.mtrl_textinput_disabled_color
            int r3 = androidx.core.content.a.b(r11, r3)
            r0.f12310s0 = r3
            int r3 = z1.C0971b.mtrl_textinput_hovered_box_stroke_color
            int r3 = androidx.core.content.a.b(r11, r3)
            r0.f12296l0 = r3
            if (r4 == 0) goto L_0x0228
            r0.setBoxStrokeColorStateList(r4)
        L_0x0228:
            int r3 = z1.j.z5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x0237
            android.content.res.ColorStateList r3 = N1.c.b(r11, r1, r3)
            r0.setBoxStrokeErrorColor(r3)
        L_0x0237:
            r3 = r17
            int r4 = r1.n(r3, r10)
            if (r4 == r10) goto L_0x0246
            int r3 = r1.n(r3, r13)
            r0.setHintTextAppearance(r3)
        L_0x0246:
            int r3 = z1.j.I5
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.f12250A = r3
            int r3 = z1.j.J5
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.f12251B = r3
            r3 = r19
            int r3 = r1.n(r3, r13)
            int r4 = z1.j.T5
            java.lang.CharSequence r4 = r1.p(r4)
            int r5 = z1.j.S5
            int r5 = r1.k(r5, r12)
            int r6 = z1.j.U5
            boolean r6 = r1.a(r6, r13)
            r7 = r18
            int r7 = r1.n(r7, r13)
            int r8 = z1.j.c6
            boolean r8 = r1.a(r8, r13)
            int r9 = z1.j.b6
            java.lang.CharSequence r9 = r1.p(r9)
            int r11 = z1.j.p6
            int r11 = r1.n(r11, r13)
            int r12 = z1.j.o6
            java.lang.CharSequence r12 = r1.p(r12)
            int r10 = z1.j.C5
            boolean r10 = r1.a(r10, r13)
            int r13 = z1.j.D5
            r23 = r9
            r9 = -1
            int r9 = r1.k(r13, r9)
            r0.setCounterMaxLength(r9)
            r9 = 0
            int r13 = r1.n(r15, r9)
            r0.f12305q = r13
            r13 = r20
            int r13 = r1.n(r13, r9)
            r0.f12303p = r13
            int r13 = z1.j.s5
            int r9 = r1.k(r13, r9)
            r0.setBoxBackgroundMode(r9)
            r0.setErrorContentDescription(r4)
            r0.setErrorAccessibilityLiveRegion(r5)
            int r4 = r0.f12303p
            r0.setCounterOverflowTextAppearance(r4)
            r0.setHelperTextTextAppearance(r7)
            r0.setErrorTextAppearance(r3)
            int r3 = r0.f12305q
            r0.setCounterTextAppearance(r3)
            r0.setPlaceholderText(r12)
            r0.setPlaceholderTextAppearance(r11)
            int r3 = z1.j.Z5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x02e1
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setErrorTextColor(r3)
        L_0x02e1:
            int r3 = z1.j.e6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x02f0
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setHelperTextColor(r3)
        L_0x02f0:
            int r3 = z1.j.i6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x02ff
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setHintTextColor(r3)
        L_0x02ff:
            int r3 = z1.j.H5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x030e
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setCounterTextColor(r3)
        L_0x030e:
            int r3 = z1.j.F5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x031d
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setCounterOverflowTextColor(r3)
        L_0x031d:
            int r3 = z1.j.q6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x032c
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setPlaceholderTextColor(r3)
        L_0x032c:
            com.google.android.material.textfield.s r3 = new com.google.android.material.textfield.s
            r3.<init>(r0, r1)
            r0.f12277c = r3
            int r4 = z1.j.k5
            r5 = 1
            boolean r4 = r1.a(r4, r5)
            r1.w()
            r1 = 2
            androidx.core.view.P.y0(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r1 < r7) goto L_0x034a
            androidx.core.view.P.A0(r0, r5)
        L_0x034a:
            r14.addView(r2)
            r14.addView(r3)
            r0.addView(r14)
            r0.setEnabled(r4)
            r0.setHelperTextEnabled(r8)
            r0.setErrorEnabled(r6)
            r0.setCounterEnabled(r10)
            r1 = r23
            r0.setHelperText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f12277c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f12277c.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f12277c.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f12277c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f12277c.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f12275b.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f12275b.s(drawable);
    }

    public void setHint(int i4) {
        setHint(i4 != 0 ? getResources().getText(i4) : null);
    }
}
