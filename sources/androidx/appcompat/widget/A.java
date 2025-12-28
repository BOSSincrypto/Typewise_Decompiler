package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.C0369c;
import androidx.appcompat.view.menu.p;
import androidx.core.view.P;
import n.C0822a;
import o.C0836a;

public class A extends Spinner {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f3042i = {16843505};

    /* renamed from: a  reason: collision with root package name */
    private final C0381e f3043a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3044b;

    /* renamed from: c  reason: collision with root package name */
    private N f3045c;

    /* renamed from: d  reason: collision with root package name */
    private SpinnerAdapter f3046d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3047e;

    /* renamed from: f  reason: collision with root package name */
    private j f3048f;

    /* renamed from: g  reason: collision with root package name */
    int f3049g;

    /* renamed from: h  reason: collision with root package name */
    final Rect f3050h;

    class a extends N {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ h f3051j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, h hVar) {
            super(view);
            this.f3051j = hVar;
        }

        public p b() {
            return this.f3051j;
        }

        public boolean c() {
            if (A.this.getInternalPopup().b()) {
                return true;
            }
            A.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        public void onGlobalLayout() {
            if (!A.this.getInternalPopup().b()) {
                A.this.b();
            }
            ViewTreeObserver viewTreeObserver = A.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.a(viewTreeObserver, this);
            }
        }
    }

    private static final class c {
        static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    private static final class d {
        static int a(View view) {
            return view.getTextAlignment();
        }

        static int b(View view) {
            return view.getTextDirection();
        }

        static void c(View view, int i4) {
            view.setTextAlignment(i4);
        }

        static void d(View view, int i4) {
            view.setTextDirection(i4);
        }
    }

    private static final class e {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!androidx.core.util.c.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    class f implements j, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        C0369c f3054a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f3055b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f3056c;

        f() {
        }

        public int a() {
            return 0;
        }

        public boolean b() {
            C0369c cVar = this.f3054a;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        public void dismiss() {
            C0369c cVar = this.f3054a;
            if (cVar != null) {
                cVar.dismiss();
                this.f3054a = null;
            }
        }

        public Drawable f() {
            return null;
        }

        public void h(CharSequence charSequence) {
            this.f3056c = charSequence;
        }

        public void i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public void j(int i4) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public void k(int i4) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public void l(int i4) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public void m(int i4, int i5) {
            if (this.f3055b != null) {
                C0369c.a aVar = new C0369c.a(A.this.getPopupContext());
                CharSequence charSequence = this.f3056c;
                if (charSequence != null) {
                    aVar.h(charSequence);
                }
                C0369c a4 = aVar.g(this.f3055b, A.this.getSelectedItemPosition(), this).a();
                this.f3054a = a4;
                ListView h4 = a4.h();
                d.d(h4, i4);
                d.c(h4, i5);
                this.f3054a.show();
            }
        }

        public int n() {
            return 0;
        }

        public CharSequence o() {
            return this.f3056c;
        }

        public void onClick(DialogInterface dialogInterface, int i4) {
            A.this.setSelection(i4);
            if (A.this.getOnItemClickListener() != null) {
                A.this.performItemClick((View) null, i4, this.f3055b.getItemId(i4));
            }
            dismiss();
        }

        public void p(ListAdapter listAdapter) {
            this.f3055b = listAdapter;
        }
    }

    private static class g implements ListAdapter, SpinnerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private SpinnerAdapter f3058a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f3059b;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f3058a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f3059b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                e.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f3059b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f3058a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f3058a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i4, view, viewGroup);
        }

        public Object getItem(int i4) {
            SpinnerAdapter spinnerAdapter = this.f3058a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i4);
        }

        public long getItemId(int i4) {
            SpinnerAdapter spinnerAdapter = this.f3058a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i4);
        }

        public int getItemViewType(int i4) {
            return 0;
        }

        public View getView(int i4, View view, ViewGroup viewGroup) {
            return getDropDownView(i4, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f3058a;
            if (spinnerAdapter == null || !spinnerAdapter.hasStableIds()) {
                return false;
            }
            return true;
        }

        public boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        public boolean isEnabled(int i4) {
            ListAdapter listAdapter = this.f3059b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i4);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f3058a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f3058a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class h extends P implements j {

        /* renamed from: J  reason: collision with root package name */
        private CharSequence f3060J;

        /* renamed from: K  reason: collision with root package name */
        ListAdapter f3061K;

        /* renamed from: L  reason: collision with root package name */
        private final Rect f3062L = new Rect();

        /* renamed from: M  reason: collision with root package name */
        private int f3063M;

        class a implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ A f3065a;

            a(A a4) {
                this.f3065a = a4;
            }

            public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
                A.this.setSelection(i4);
                if (A.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    A.this.performItemClick(view, i4, hVar.f3061K.getItemId(i4));
                }
                h.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.V(A.this)) {
                    h.this.dismiss();
                    return;
                }
                h.this.T();
                h.super.d();
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f3068a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f3068a = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = A.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f3068a);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i4) {
            super(context, attributeSet, i4);
            D(A.this);
            J(true);
            P(0);
            L(new a(A.this));
        }

        /* access modifiers changed from: package-private */
        public void T() {
            int i4;
            int i5;
            Drawable f4 = f();
            if (f4 != null) {
                f4.getPadding(A.this.f3050h);
                if (n0.b(A.this)) {
                    i4 = A.this.f3050h.right;
                } else {
                    i4 = -A.this.f3050h.left;
                }
            } else {
                Rect rect = A.this.f3050h;
                rect.right = 0;
                rect.left = 0;
                i4 = 0;
            }
            int paddingLeft = A.this.getPaddingLeft();
            int paddingRight = A.this.getPaddingRight();
            int width = A.this.getWidth();
            A a4 = A.this;
            int i6 = a4.f3049g;
            if (i6 == -2) {
                int a5 = a4.a((SpinnerAdapter) this.f3061K, f());
                int i7 = A.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = A.this.f3050h;
                int i8 = (i7 - rect2.left) - rect2.right;
                if (a5 > i8) {
                    a5 = i8;
                }
                F(Math.max(a5, (width - paddingLeft) - paddingRight));
            } else if (i6 == -1) {
                F((width - paddingLeft) - paddingRight);
            } else {
                F(i6);
            }
            if (n0.b(A.this)) {
                i5 = i4 + (((width - paddingRight) - z()) - U());
            } else {
                i5 = i4 + paddingLeft + U();
            }
            l(i5);
        }

        public int U() {
            return this.f3063M;
        }

        /* access modifiers changed from: package-private */
        public boolean V(View view) {
            if (!P.R(view) || !view.getGlobalVisibleRect(this.f3062L)) {
                return false;
            }
            return true;
        }

        public void h(CharSequence charSequence) {
            this.f3060J = charSequence;
        }

        public void k(int i4) {
            this.f3063M = i4;
        }

        public void m(int i4, int i5) {
            ViewTreeObserver viewTreeObserver;
            boolean b4 = b();
            T();
            I(2);
            super.d();
            ListView g4 = g();
            g4.setChoiceMode(1);
            d.d(g4, i4);
            d.c(g4, i5);
            Q(A.this.getSelectedItemPosition());
            if (!b4 && (viewTreeObserver = A.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                K(new c(bVar));
            }
        }

        public CharSequence o() {
            return this.f3060J;
        }

        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.f3061K = listAdapter;
        }
    }

    static class i extends View.BaseSavedState {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        boolean f3070a;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            /* renamed from: b */
            public i[] newArray(int i4) {
                return new i[i4];
            }
        }

        i(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeByte(this.f3070a ? (byte) 1 : 0);
        }

        i(Parcel parcel) {
            super(parcel);
            this.f3070a = parcel.readByte() != 0;
        }
    }

    interface j {
        int a();

        boolean b();

        void dismiss();

        Drawable f();

        void h(CharSequence charSequence);

        void i(Drawable drawable);

        void j(int i4);

        void k(int i4);

        void l(int i4);

        void m(int i4, int i5);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    public A(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0822a.f14664H);
    }

    /* access modifiers changed from: package-private */
    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i4 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i5 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i5 = Math.max(i5, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i5;
        }
        drawable.getPadding(this.f3050h);
        Rect rect = this.f3050h;
        return i5 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f3048f.m(d.b(this), d.a(this));
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0381e eVar = this.f3043a;
        if (eVar != null) {
            eVar.b();
        }
    }

    public int getDropDownHorizontalOffset() {
        j jVar = this.f3048f;
        if (jVar != null) {
            return jVar.a();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        j jVar = this.f3048f;
        if (jVar != null) {
            return jVar.n();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.f3048f != null) {
            return this.f3049g;
        }
        return super.getDropDownWidth();
    }

    /* access modifiers changed from: package-private */
    public final j getInternalPopup() {
        return this.f3048f;
    }

    public Drawable getPopupBackground() {
        j jVar = this.f3048f;
        if (jVar != null) {
            return jVar.f();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f3044b;
    }

    public CharSequence getPrompt() {
        j jVar = this.f3048f;
        if (jVar != null) {
            return jVar.o();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0381e eVar = this.f3043a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0381e eVar = this.f3043a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f3048f;
        if (jVar != null && jVar.b()) {
            this.f3048f.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f3048f != null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (iVar.f3070a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    public Parcelable onSaveInstanceState() {
        boolean z3;
        i iVar = new i(super.onSaveInstanceState());
        j jVar = this.f3048f;
        if (jVar == null || !jVar.b()) {
            z3 = false;
        } else {
            z3 = true;
        }
        iVar.f3070a = z3;
        return iVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        N n4 = this.f3045c;
        if (n4 == null || !n4.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        j jVar = this.f3048f;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.b()) {
            return true;
        }
        b();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0381e eVar = this.f3043a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0381e eVar = this.f3043a;
        if (eVar != null) {
            eVar.g(i4);
        }
    }

    public void setDropDownHorizontalOffset(int i4) {
        j jVar = this.f3048f;
        if (jVar != null) {
            jVar.k(i4);
            this.f3048f.l(i4);
            return;
        }
        super.setDropDownHorizontalOffset(i4);
    }

    public void setDropDownVerticalOffset(int i4) {
        j jVar = this.f3048f;
        if (jVar != null) {
            jVar.j(i4);
        } else {
            super.setDropDownVerticalOffset(i4);
        }
    }

    public void setDropDownWidth(int i4) {
        if (this.f3048f != null) {
            this.f3049g = i4;
        } else {
            super.setDropDownWidth(i4);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        j jVar = this.f3048f;
        if (jVar != null) {
            jVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i4) {
        setPopupBackgroundDrawable(C0836a.b(getPopupContext(), i4));
    }

    public void setPrompt(CharSequence charSequence) {
        j jVar = this.f3048f;
        if (jVar != null) {
            jVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0381e eVar = this.f3043a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0381e eVar = this.f3043a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public A(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, -1);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f3047e) {
            this.f3046d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f3048f != null) {
            Context context = this.f3044b;
            if (context == null) {
                context = getContext();
            }
            this.f3048f.p(new g(spinnerAdapter, context.getTheme()));
        }
    }

    public A(Context context, AttributeSet attributeSet, int i4, int i5) {
        this(context, attributeSet, i4, i5, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (r10 != null) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public A(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.f3050h = r0
            android.content.Context r0 = r5.getContext()
            androidx.appcompat.widget.Y.a(r5, r0)
            int[] r0 = n.j.f15058x2
            r1 = 0
            androidx.appcompat.widget.c0 r0 = androidx.appcompat.widget.c0.v(r6, r7, r0, r8, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r5)
            r5.f3043a = r2
            if (r10 == 0) goto L_0x0029
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r6, (android.content.res.Resources.Theme) r10)
            r5.f3044b = r2
            goto L_0x003b
        L_0x0029:
            int r10 = n.j.f14850C2
            int r10 = r0.n(r10, r1)
            if (r10 == 0) goto L_0x0039
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r6, (int) r10)
            r5.f3044b = r2
            goto L_0x003b
        L_0x0039:
            r5.f3044b = r6
        L_0x003b:
            r10 = -1
            r2 = 0
            if (r9 != r10) goto L_0x0064
            int[] r10 = f3042i     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r7, r10, r8, r1)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            boolean r3 = r10.hasValue(r1)     // Catch:{ Exception -> 0x0061, all -> 0x0050 }
            if (r3 == 0) goto L_0x0053
            int r9 = r10.getInt(r1, r1)     // Catch:{ Exception -> 0x0061, all -> 0x0050 }
            goto L_0x0053
        L_0x0050:
            r6 = move-exception
            r2 = r10
            goto L_0x005b
        L_0x0053:
            r10.recycle()
            goto L_0x0064
        L_0x0057:
            r6 = move-exception
            goto L_0x005b
        L_0x0059:
            r10 = r2
            goto L_0x0061
        L_0x005b:
            if (r2 == 0) goto L_0x0060
            r2.recycle()
        L_0x0060:
            throw r6
        L_0x0061:
            if (r10 == 0) goto L_0x0064
            goto L_0x0053
        L_0x0064:
            r10 = 1
            if (r9 == 0) goto L_0x00a1
            if (r9 == r10) goto L_0x006a
            goto L_0x00b1
        L_0x006a:
            androidx.appcompat.widget.A$h r9 = new androidx.appcompat.widget.A$h
            android.content.Context r3 = r5.f3044b
            r9.<init>(r3, r7, r8)
            android.content.Context r3 = r5.f3044b
            int[] r4 = n.j.f15058x2
            androidx.appcompat.widget.c0 r1 = androidx.appcompat.widget.c0.v(r3, r7, r4, r8, r1)
            int r3 = n.j.f14846B2
            r4 = -2
            int r3 = r1.m(r3, r4)
            r5.f3049g = r3
            int r3 = n.j.f15066z2
            android.graphics.drawable.Drawable r3 = r1.g(r3)
            r9.i(r3)
            int r3 = n.j.f14842A2
            java.lang.String r3 = r0.o(r3)
            r9.h(r3)
            r1.w()
            r5.f3048f = r9
            androidx.appcompat.widget.A$a r1 = new androidx.appcompat.widget.A$a
            r1.<init>(r5, r9)
            r5.f3045c = r1
            goto L_0x00b1
        L_0x00a1:
            androidx.appcompat.widget.A$f r9 = new androidx.appcompat.widget.A$f
            r9.<init>()
            r5.f3048f = r9
            int r1 = n.j.f14842A2
            java.lang.String r1 = r0.o(r1)
            r9.h(r1)
        L_0x00b1:
            int r9 = n.j.f15062y2
            java.lang.CharSequence[] r9 = r0.q(r9)
            if (r9 == 0) goto L_0x00c9
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r6, r3, r9)
            int r6 = n.g.f14822t
            r1.setDropDownViewResource(r6)
            r5.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00c9:
            r0.w()
            r5.f3047e = r10
            android.widget.SpinnerAdapter r6 = r5.f3046d
            if (r6 == 0) goto L_0x00d7
            r5.setAdapter((android.widget.SpinnerAdapter) r6)
            r5.f3046d = r2
        L_0x00d7:
            androidx.appcompat.widget.e r6 = r5.f3043a
            r6.e(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.A.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
