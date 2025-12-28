package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.appcompat.app.F;
import androidx.core.view.C0402a;
import androidx.core.view.P;
import androidx.core.view.accessibility.A;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import z1.C0972c;

public final class MaterialCalendar<S> extends q {

    /* renamed from: m  reason: collision with root package name */
    static final Object f11896m = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: n  reason: collision with root package name */
    static final Object f11897n = "NAVIGATION_PREV_TAG";

    /* renamed from: o  reason: collision with root package name */
    static final Object f11898o = "NAVIGATION_NEXT_TAG";

    /* renamed from: p  reason: collision with root package name */
    static final Object f11899p = "SELECTOR_TOGGLE_TAG";

    /* renamed from: b  reason: collision with root package name */
    private int f11900b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public a f11901c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public m f11902d;

    /* renamed from: e  reason: collision with root package name */
    private CalendarSelector f11903e;

    /* renamed from: f  reason: collision with root package name */
    private c f11904f;

    /* renamed from: g  reason: collision with root package name */
    private RecyclerView f11905g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public RecyclerView f11906h;

    /* renamed from: i  reason: collision with root package name */
    private View f11907i;

    /* renamed from: j  reason: collision with root package name */
    private View f11908j;

    /* renamed from: k  reason: collision with root package name */
    private View f11909k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public View f11910l;

    enum CalendarSelector {
        DAY,
        YEAR
    }

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f11912a;

        a(o oVar) {
            this.f11912a = oVar;
        }

        public void onClick(View view) {
            int l22 = MaterialCalendar.this.w().l2() - 1;
            if (l22 >= 0) {
                MaterialCalendar.this.z(this.f11912a.A(l22));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11914a;

        b(int i4) {
            this.f11914a = i4;
        }

        public void run() {
            MaterialCalendar.this.f11906h.A1(this.f11914a);
        }
    }

    class c extends C0402a {
        c() {
        }

        public void g(View view, A a4) {
            super.g(view, a4);
            a4.l0((Object) null);
        }
    }

    class d extends r {

        /* renamed from: I  reason: collision with root package name */
        final /* synthetic */ int f11917I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Context context, int i4, boolean z3, int i5) {
            super(context, i4, z3);
            this.f11917I = i5;
        }

        /* access modifiers changed from: protected */
        public void X1(RecyclerView.z zVar, int[] iArr) {
            if (this.f11917I == 0) {
                iArr[0] = MaterialCalendar.this.f11906h.getWidth();
                iArr[1] = MaterialCalendar.this.f11906h.getWidth();
                return;
            }
            iArr[0] = MaterialCalendar.this.f11906h.getHeight();
            iArr[1] = MaterialCalendar.this.f11906h.getHeight();
        }
    }

    class e implements l {
        e() {
        }

        public void a(long j4) {
            if (MaterialCalendar.this.f11901c.y().d(j4)) {
                d unused = MaterialCalendar.this.getClass();
                throw null;
            }
        }
    }

    class f extends C0402a {
        f() {
        }

        public void g(View view, A a4) {
            super.g(view, a4);
            a4.B0(false);
        }
    }

    class g extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        private final Calendar f11921a = y.k();

        /* renamed from: b  reason: collision with root package name */
        private final Calendar f11922b = y.k();

        g() {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            if ((recyclerView.getAdapter() instanceof z) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                z zVar2 = (z) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                d unused = MaterialCalendar.this.getClass();
                throw null;
            }
        }
    }

    class h extends C0402a {
        h() {
        }

        public void g(View view, A a4) {
            String str;
            super.g(view, a4);
            if (MaterialCalendar.this.f11910l.getVisibility() == 0) {
                str = MaterialCalendar.this.getString(z1.h.mtrl_picker_toggle_to_year_selection);
            } else {
                str = MaterialCalendar.this.getString(z1.h.mtrl_picker_toggle_to_day_selection);
            }
            a4.t0(str);
        }
    }

    class i extends RecyclerView.s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f11925a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MaterialButton f11926b;

        i(o oVar, MaterialButton materialButton) {
            this.f11925a = oVar;
            this.f11926b = materialButton;
        }

        public void a(RecyclerView recyclerView, int i4) {
            if (i4 == 0) {
                recyclerView.announceForAccessibility(this.f11926b.getText());
            }
        }

        public void b(RecyclerView recyclerView, int i4, int i5) {
            int i6;
            if (i4 < 0) {
                i6 = MaterialCalendar.this.w().j2();
            } else {
                i6 = MaterialCalendar.this.w().l2();
            }
            m unused = MaterialCalendar.this.f11902d = this.f11925a.A(i6);
            this.f11926b.setText(this.f11925a.B(i6));
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        public void onClick(View view) {
            MaterialCalendar.this.C();
        }
    }

    class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f11929a;

        k(o oVar) {
            this.f11929a = oVar;
        }

        public void onClick(View view) {
            int j22 = MaterialCalendar.this.w().j2() + 1;
            if (j22 < MaterialCalendar.this.f11906h.getAdapter().d()) {
                MaterialCalendar.this.z(this.f11929a.A(j22));
            }
        }
    }

    interface l {
        void a(long j4);
    }

    private void B() {
        P.o0(this.f11906h, new f());
    }

    private void o(View view, o oVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(z1.e.month_navigation_fragment_toggle);
        materialButton.setTag(f11899p);
        P.o0(materialButton, new h());
        View findViewById = view.findViewById(z1.e.month_navigation_previous);
        this.f11907i = findViewById;
        findViewById.setTag(f11897n);
        View findViewById2 = view.findViewById(z1.e.month_navigation_next);
        this.f11908j = findViewById2;
        findViewById2.setTag(f11898o);
        this.f11909k = view.findViewById(z1.e.mtrl_calendar_year_selector_frame);
        this.f11910l = view.findViewById(z1.e.mtrl_calendar_day_selector_frame);
        A(CalendarSelector.DAY);
        materialButton.setText(this.f11902d.A());
        this.f11906h.m(new i(oVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.f11908j.setOnClickListener(new k(oVar));
        this.f11907i.setOnClickListener(new a(oVar));
    }

    private RecyclerView.n p() {
        return new g();
    }

    static int u(Context context) {
        return context.getResources().getDimensionPixelSize(C0972c.mtrl_calendar_day_height);
    }

    private static int v(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0972c.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C0972c.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C0972c.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0972c.mtrl_calendar_days_of_week_height);
        int i4 = n.f12010e;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C0972c.mtrl_calendar_day_height) * i4) + ((i4 - 1) * resources.getDimensionPixelOffset(C0972c.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(C0972c.mtrl_calendar_bottom_padding);
    }

    public static MaterialCalendar x(d dVar, int i4, a aVar, h hVar) {
        MaterialCalendar materialCalendar = new MaterialCalendar();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i4);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", hVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.C());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    private void y(int i4) {
        this.f11906h.post(new b(i4));
    }

    /* access modifiers changed from: package-private */
    public void A(CalendarSelector calendarSelector) {
        this.f11903e = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f11905g.getLayoutManager().I1(((z) this.f11905g.getAdapter()).z(this.f11902d.f12005c));
            this.f11909k.setVisibility(0);
            this.f11910l.setVisibility(8);
            this.f11907i.setVisibility(8);
            this.f11908j.setVisibility(8);
        } else if (calendarSelector == CalendarSelector.DAY) {
            this.f11909k.setVisibility(8);
            this.f11910l.setVisibility(0);
            this.f11907i.setVisibility(0);
            this.f11908j.setVisibility(0);
            z(this.f11902d);
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        CalendarSelector calendarSelector = this.f11903e;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            A(CalendarSelector.DAY);
        } else if (calendarSelector == CalendarSelector.DAY) {
            A(calendarSelector2);
        }
    }

    public boolean h(p pVar) {
        return super.h(pVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f11900b = bundle.getInt("THEME_RES_ID_KEY");
        F.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f11901c = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        F.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f11902d = (m) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i4;
        int i5;
        i iVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f11900b);
        this.f11904f = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        m D3 = this.f11901c.D();
        if (k.D(contextThemeWrapper)) {
            i5 = z1.g.mtrl_calendar_vertical;
            i4 = 1;
        } else {
            i5 = z1.g.mtrl_calendar_horizontal;
            i4 = 0;
        }
        View inflate = cloneInContext.inflate(i5, viewGroup, false);
        inflate.setMinimumHeight(v(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(z1.e.mtrl_calendar_days_of_week);
        P.o0(gridView, new c());
        int A3 = this.f11901c.A();
        if (A3 <= 0) {
            iVar = new i();
        }
        gridView.setAdapter(iVar);
        gridView.setNumColumns(D3.f12006d);
        gridView.setEnabled(false);
        this.f11906h = (RecyclerView) inflate.findViewById(z1.e.mtrl_calendar_months);
        this.f11906h.setLayoutManager(new d(getContext(), i4, false, i4));
        this.f11906h.setTag(f11896m);
        o oVar = new o(contextThemeWrapper, (d) null, this.f11901c, (h) null, new e());
        this.f11906h.setAdapter(oVar);
        int integer = contextThemeWrapper.getResources().getInteger(z1.f.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(z1.e.mtrl_calendar_year_selector_frame);
        this.f11905g = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f11905g.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f11905g.setAdapter(new z(this));
            this.f11905g.j(p());
        }
        if (inflate.findViewById(z1.e.month_navigation_fragment_toggle) != null) {
            o(inflate, oVar);
        }
        if (!k.D(contextThemeWrapper)) {
            new q().b(this.f11906h);
        }
        this.f11906h.r1(oVar.C(this.f11902d));
        B();
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f11900b);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f11901c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f11902d);
    }

    /* access modifiers changed from: package-private */
    public a q() {
        return this.f11901c;
    }

    /* access modifiers changed from: package-private */
    public c r() {
        return this.f11904f;
    }

    /* access modifiers changed from: package-private */
    public m s() {
        return this.f11902d;
    }

    public d t() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public LinearLayoutManager w() {
        return (LinearLayoutManager) this.f11906h.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    public void z(m mVar) {
        boolean z3;
        o oVar = (o) this.f11906h.getAdapter();
        int C3 = oVar.C(mVar);
        int C4 = C3 - oVar.C(this.f11902d);
        boolean z4 = false;
        if (Math.abs(C4) > 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (C4 > 0) {
            z4 = true;
        }
        this.f11902d = mVar;
        if (z3 && z4) {
            this.f11906h.r1(C3 - 3);
            y(C3);
        } else if (z3) {
            this.f11906h.r1(C3 + 3);
            y(C3);
        } else {
            y(C3);
        }
    }
}
