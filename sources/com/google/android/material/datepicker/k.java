package com.google.android.material.datepicker;

import Q1.g;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.F;
import androidx.core.view.C;
import androidx.core.view.C0402a;
import androidx.core.view.C0435o0;
import androidx.core.view.P;
import androidx.fragment.app.C0450e;
import androidx.fragment.app.y;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.c;
import com.google.android.material.internal.m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.C0836a;
import z1.C0970a;
import z1.C0972c;
import z1.d;
import z1.e;
import z1.h;
import z1.i;
import z1.j;

public final class k<S> extends C0450e {

    /* renamed from: O  reason: collision with root package name */
    static final Object f11968O = "CONFIRM_BUTTON_TAG";

    /* renamed from: P  reason: collision with root package name */
    static final Object f11969P = "CANCEL_BUTTON_TAG";

    /* renamed from: Q  reason: collision with root package name */
    static final Object f11970Q = "TOGGLE_BUTTON_TAG";

    /* renamed from: A  reason: collision with root package name */
    private boolean f11971A;

    /* renamed from: B  reason: collision with root package name */
    private int f11972B;

    /* renamed from: C  reason: collision with root package name */
    private int f11973C;

    /* renamed from: D  reason: collision with root package name */
    private CharSequence f11974D;

    /* renamed from: E  reason: collision with root package name */
    private int f11975E;

    /* renamed from: F  reason: collision with root package name */
    private CharSequence f11976F;

    /* renamed from: G  reason: collision with root package name */
    private TextView f11977G;

    /* renamed from: H  reason: collision with root package name */
    private TextView f11978H;

    /* renamed from: I  reason: collision with root package name */
    private CheckableImageButton f11979I;

    /* renamed from: J  reason: collision with root package name */
    private g f11980J;

    /* renamed from: K  reason: collision with root package name */
    private Button f11981K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f11982L;

    /* renamed from: M  reason: collision with root package name */
    private CharSequence f11983M;

    /* renamed from: N  reason: collision with root package name */
    private CharSequence f11984N;

    /* renamed from: q  reason: collision with root package name */
    private final LinkedHashSet f11985q = new LinkedHashSet();

    /* renamed from: r  reason: collision with root package name */
    private final LinkedHashSet f11986r = new LinkedHashSet();

    /* renamed from: s  reason: collision with root package name */
    private final LinkedHashSet f11987s = new LinkedHashSet();

    /* renamed from: t  reason: collision with root package name */
    private final LinkedHashSet f11988t = new LinkedHashSet();

    /* renamed from: u  reason: collision with root package name */
    private int f11989u;

    /* renamed from: v  reason: collision with root package name */
    private q f11990v;

    /* renamed from: w  reason: collision with root package name */
    private a f11991w;

    /* renamed from: x  reason: collision with root package name */
    private MaterialCalendar f11992x;

    /* renamed from: y  reason: collision with root package name */
    private int f11993y;

    /* renamed from: z  reason: collision with root package name */
    private CharSequence f11994z;

    class a implements C {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11995a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f11996b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11997c;

        a(int i4, View view, int i5) {
            this.f11995a = i4;
            this.f11996b = view;
            this.f11997c = i5;
        }

        public C0435o0 a(View view, C0435o0 o0Var) {
            int i4 = o0Var.f(C0435o0.m.f()).f4971b;
            if (this.f11995a >= 0) {
                this.f11996b.getLayoutParams().height = this.f11995a + i4;
                View view2 = this.f11996b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f11996b;
            view3.setPadding(view3.getPaddingLeft(), this.f11997c + i4, this.f11996b.getPaddingRight(), this.f11996b.getPaddingBottom());
            return o0Var;
        }
    }

    class b extends p {
        b() {
        }
    }

    private static int A(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C0972c.mtrl_calendar_content_padding);
        int i4 = m.w().f12006d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C0972c.mtrl_calendar_day_width) * i4) + ((i4 - 1) * resources.getDimensionPixelOffset(C0972c.mtrl_calendar_month_horizontal_padding));
    }

    private int B(Context context) {
        int i4 = this.f11989u;
        if (i4 != 0) {
            return i4;
        }
        w();
        throw null;
    }

    private void C(Context context) {
        boolean z3;
        this.f11979I.setTag(f11970Q);
        this.f11979I.setImageDrawable(u(context));
        CheckableImageButton checkableImageButton = this.f11979I;
        if (this.f11972B != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        checkableImageButton.setChecked(z3);
        P.o0(this.f11979I, (C0402a) null);
        L(this.f11979I);
        this.f11979I.setOnClickListener(new j(this));
    }

    static boolean D(Context context) {
        return H(context, 16843277);
    }

    private boolean E() {
        if (getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    static boolean F(Context context) {
        return H(context, C0970a.nestedScrollable);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(View view) {
        w();
        throw null;
    }

    static boolean H(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(N1.b.d(context, C0970a.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i4});
        boolean z3 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z3;
    }

    private void I() {
        int B3 = B(requireContext());
        w();
        MaterialCalendar x3 = MaterialCalendar.x((d) null, B3, this.f11991w, (h) null);
        this.f11992x = x3;
        q qVar = x3;
        if (this.f11972B == 1) {
            w();
            qVar = l.j((d) null, B3, this.f11991w);
        }
        this.f11990v = qVar;
        K();
        J(z());
        y l4 = getChildFragmentManager().l();
        l4.m(e.mtrl_calendar_frame, this.f11990v);
        l4.h();
        this.f11990v.h(new b());
    }

    private void K() {
        CharSequence charSequence;
        TextView textView = this.f11977G;
        if (this.f11972B != 1 || !E()) {
            charSequence = this.f11983M;
        } else {
            charSequence = this.f11984N;
        }
        textView.setText(charSequence);
    }

    private void L(CheckableImageButton checkableImageButton) {
        String str;
        if (this.f11972B == 1) {
            str = checkableImageButton.getContext().getString(h.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(h.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f11979I.setContentDescription(str);
    }

    private static Drawable u(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C0836a.b(context, d.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C0836a.b(context, d.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    private void v(Window window) {
        if (!this.f11982L) {
            View findViewById = requireView().findViewById(e.fullscreen_header);
            c.a(window, true, m.d(findViewById), (Integer) null);
            P.C0(findViewById, new a(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
            this.f11982L = true;
        }
    }

    private d w() {
        F.a(getArguments().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    private static CharSequence x(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] split = TextUtils.split(String.valueOf(charSequence), "\n");
        if (split.length > 1) {
            return split[0];
        }
        return charSequence;
    }

    private String y() {
        w();
        requireContext();
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void J(String str) {
        this.f11978H.setContentDescription(y());
        this.f11978H.setText(str);
    }

    public final Dialog n(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), B(requireContext()));
        Context context = dialog.getContext();
        this.f11971A = D(context);
        int i4 = C0970a.materialCalendarStyle;
        int i5 = i.Widget_MaterialComponents_MaterialCalendar;
        this.f11980J = new g(context, (AttributeSet) null, i4, i5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j.f16737y2, i4, i5);
        int color = obtainStyledAttributes.getColor(j.f16741z2, 0);
        obtainStyledAttributes.recycle();
        this.f11980J.J(context);
        this.f11980J.T(ColorStateList.valueOf(color));
        this.f11980J.S(P.w(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f11987s.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f11989u = bundle.getInt("OVERRIDE_THEME_RES_ID");
        F.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f11991w = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        F.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f11993y = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f11994z = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f11972B = bundle.getInt("INPUT_MODE_KEY");
        this.f11973C = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f11974D = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f11975E = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f11976F = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.f11994z;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.f11993y);
        }
        this.f11983M = charSequence;
        this.f11984N = x(charSequence);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i4;
        if (this.f11971A) {
            i4 = z1.g.mtrl_picker_fullscreen;
        } else {
            i4 = z1.g.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i4, viewGroup);
        Context context = inflate.getContext();
        if (this.f11971A) {
            inflate.findViewById(e.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(A(context), -2));
        } else {
            inflate.findViewById(e.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(A(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(e.mtrl_picker_header_selection_text);
        this.f11978H = textView;
        P.q0(textView, 1);
        this.f11979I = (CheckableImageButton) inflate.findViewById(e.mtrl_picker_header_toggle);
        this.f11977G = (TextView) inflate.findViewById(e.mtrl_picker_title_text);
        C(context);
        this.f11981K = (Button) inflate.findViewById(e.confirm_button);
        w();
        throw null;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f11988t.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        m mVar;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f11989u);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        a.b bVar = new a.b(this.f11991w);
        MaterialCalendar materialCalendar = this.f11992x;
        if (materialCalendar == null) {
            mVar = null;
        } else {
            mVar = materialCalendar.s();
        }
        if (mVar != null) {
            bVar.b(mVar.f12008f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f11993y);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f11994z);
        bundle.putInt("INPUT_MODE_KEY", this.f11972B);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f11973C);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f11974D);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f11975E);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f11976F);
    }

    public void onStart() {
        super.onStart();
        Window window = r().getWindow();
        if (this.f11971A) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f11980J);
            v(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(C0972c.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f11980J, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new G1.a(r(), rect));
        }
        I();
    }

    public void onStop() {
        this.f11990v.i();
        super.onStop();
    }

    public String z() {
        w();
        getContext();
        throw null;
    }
}
