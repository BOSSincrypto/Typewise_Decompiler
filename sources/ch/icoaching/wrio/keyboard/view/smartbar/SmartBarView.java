package ch.icoaching.wrio.keyboard.view.smartbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.icoaching.wrio.keyboard.E;
import ch.icoaching.wrio.keyboard.F;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.keyboard.view.autofill.AutofillView;
import ch.icoaching.wrio.keyboard.z;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import l2.q;
import u2.C0906a;
import u2.l;

public final class SmartBarView extends ConstraintLayout {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public ConstraintLayout f10444A;

    /* renamed from: B  reason: collision with root package name */
    private RecyclerView f10445B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public ImageView f10446C;

    /* renamed from: D  reason: collision with root package name */
    private View f10447D;

    /* renamed from: E  reason: collision with root package name */
    private FrameLayout f10448E;

    /* renamed from: F  reason: collision with root package name */
    private ConstraintLayout f10449F;

    /* renamed from: G  reason: collision with root package name */
    private View f10450G;

    /* renamed from: H  reason: collision with root package name */
    private ImageView f10451H;

    /* renamed from: I  reason: collision with root package name */
    private ImageView f10452I;

    /* renamed from: J  reason: collision with root package name */
    private ImageView f10453J;

    /* renamed from: K  reason: collision with root package name */
    private ConstraintLayout f10454K;

    /* renamed from: L  reason: collision with root package name */
    private AutofillView f10455L;

    /* renamed from: M  reason: collision with root package name */
    private h f10456M;

    /* renamed from: N  reason: collision with root package name */
    private ThemeModel.SmartBarTheme f10457N;

    /* renamed from: O  reason: collision with root package name */
    private boolean f10458O;

    /* renamed from: P  reason: collision with root package name */
    private int f10459P;

    /* renamed from: Q  reason: collision with root package name */
    private int f10460Q;

    /* renamed from: R  reason: collision with root package name */
    private boolean f10461R;

    /* renamed from: y  reason: collision with root package name */
    private boolean f10462y;

    /* renamed from: z  reason: collision with root package name */
    private ProgressBar f10463z;

    /* synthetic */ class a extends FunctionReferenceImpl implements l {
        a(Object obj) {
            super(1, obj, z.class, "onSmartBarItemClick", "onSmartBarItemClick(Lch/icoaching/wrio/keyboard/view/smartbar/SmartBarItem;)V", 0);
        }

        public final void a(g gVar) {
            o.e(gVar, "p0");
            ((z) this.receiver).a(gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((g) obj);
            return q.f14567a;
        }
    }

    /* synthetic */ class b extends FunctionReferenceImpl implements l {
        b(Object obj) {
            super(1, obj, z.class, "onSmartBarItemLongClick", "onSmartBarItemLongClick(Lch/icoaching/wrio/keyboard/view/smartbar/SmartBarItem;)V", 0);
        }

        public final void a(g gVar) {
            o.e(gVar, "p0");
            ((z) this.receiver).d(gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((g) obj);
            return q.f14567a;
        }
    }

    /* synthetic */ class c extends FunctionReferenceImpl implements l {
        c(Object obj) {
            super(1, obj, z.class, "onSmartBarItemSwipeUp", "onSmartBarItemSwipeUp(Lch/icoaching/wrio/keyboard/view/smartbar/SmartBarItem;)V", 0);
        }

        public final void a(g gVar) {
            o.e(gVar, "p0");
            ((z) this.receiver).e(gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((g) obj);
            return q.f14567a;
        }
    }

    /* synthetic */ class d extends FunctionReferenceImpl implements l {
        d(Object obj) {
            super(1, obj, z.class, "onSmartBarItemSwipeDown", "onSmartBarItemSwipeDown(Lch/icoaching/wrio/keyboard/view/smartbar/SmartBarItem;)V", 0);
        }

        public final void a(g gVar) {
            o.e(gVar, "p0");
            ((z) this.receiver).c(gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((g) obj);
            return q.f14567a;
        }
    }

    /* synthetic */ class e extends FunctionReferenceImpl implements l {
        e(Object obj) {
            super(1, obj, z.class, "onSmartBarItemCollapse", "onSmartBarItemCollapse(Lch/icoaching/wrio/keyboard/view/smartbar/SmartBarItem;)V", 0);
        }

        public final void a(g gVar) {
            o.e(gVar, "p0");
            ((z) this.receiver).b(gVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((g) obj);
            return q.f14567a;
        }
    }

    public static final class f implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SmartBarView f10464a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Animation f10465b;

        f(SmartBarView smartBarView, Animation animation) {
            this.f10464a = smartBarView;
            this.f10465b = animation;
        }

        public void onAnimationEnd(Animation animation) {
            ImageView H3 = this.f10464a.f10446C;
            ConstraintLayout constraintLayout = null;
            if (H3 == null) {
                o.p("smartBarIntroImage");
                H3 = null;
            }
            H3.setVisibility(8);
            ConstraintLayout G3 = this.f10464a.f10444A;
            if (G3 == null) {
                o.p("smartBarContents");
                G3 = null;
            }
            G3.setVisibility(0);
            ConstraintLayout G4 = this.f10464a.f10444A;
            if (G4 == null) {
                o.p("smartBarContents");
            } else {
                constraintLayout = G4;
            }
            constraintLayout.startAnimation(this.f10465b);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SmartBarView(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void T() {
        View.inflate(getContext(), F.smart_bar, this);
        this.f10448E = (FrameLayout) findViewById(E.fl_logo_content);
        this.f10449F = (ConstraintLayout) findViewById(E.cl_ai_assistant_view);
        this.f10452I = (ImageView) findViewById(E.iv_ai_assistant_icon);
        this.f10450G = findViewById(E.v_divider_line);
        this.f10451H = (ImageView) findViewById(E.iv_last_prompt_icon);
        this.f10453J = (ImageView) findViewById(E.iv_ai_assistant_close_icon);
        this.f10444A = (ConstraintLayout) findViewById(E.cl_smart_bar_contents);
        this.f10446C = (ImageView) findViewById(E.iv_intro_image);
        this.f10463z = (ProgressBar) findViewById(E.pb_loading);
        this.f10447D = findViewById(E.v_smart_bar_disabled);
        this.f10445B = (RecyclerView) findViewById(E.rv_smart_bar_items);
        this.f10454K = (ConstraintLayout) findViewById(E.cl_additional_view);
        this.f10455L = (AutofillView) findViewById(E.autofill_view);
        b0();
    }

    /* access modifiers changed from: private */
    public static final void W(C0906a aVar, View view) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void X(C0906a aVar, View view) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void Y(C0906a aVar, View view) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void Z(C0906a aVar, View view) {
        aVar.invoke();
    }

    private final void b0() {
        h hVar = new h();
        hVar.x(false);
        this.f10456M = hVar;
        RecyclerView recyclerView = this.f10445B;
        if (recyclerView == null) {
            o.p("smartBarRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView2 = this.f10445B;
        if (recyclerView2 == null) {
            o.p("smartBarRecyclerView");
            recyclerView2 = null;
        }
        h hVar2 = this.f10456M;
        if (hVar2 == null) {
            o.p("defaultSmartBarAdapter");
            hVar2 = null;
        }
        recyclerView2.setAdapter(hVar2);
        RecyclerView recyclerView3 = this.f10445B;
        if (recyclerView3 == null) {
            o.p("smartBarRecyclerView");
            recyclerView3 = null;
        }
        recyclerView3.setItemAnimator((RecyclerView.l) null);
    }

    /* access modifiers changed from: private */
    public static final void setSmartBarContent$lambda$5(SmartBarView smartBarView) {
        RecyclerView recyclerView = smartBarView.f10445B;
        if (recyclerView == null) {
            o.p("smartBarRecyclerView");
            recyclerView = null;
        }
        recyclerView.r1(0);
    }

    private final void setupIntroAnimations(int i4) {
        Animation m4 = P0.c.m(500, 0, 2, (Object) null);
        Animation n4 = P0.c.n(500, 500);
        n4.setAnimationListener(new f(this, m4));
        ConstraintLayout constraintLayout = this.f10444A;
        ImageView imageView = null;
        if (constraintLayout == null) {
            o.p("smartBarContents");
            constraintLayout = null;
        }
        constraintLayout.setVisibility(8);
        ImageView imageView2 = this.f10446C;
        if (imageView2 == null) {
            o.p("smartBarIntroImage");
            imageView2 = null;
        }
        imageView2.setImageDrawable(androidx.core.content.a.d(getContext(), i4));
        ImageView imageView3 = this.f10446C;
        if (imageView3 == null) {
            o.p("smartBarIntroImage");
        } else {
            imageView = imageView3;
        }
        imageView.startAnimation(n4);
    }

    public final void I() {
        ImageView imageView = this.f10452I;
        ImageView imageView2 = null;
        if (imageView == null) {
            o.p("aiAssistantIcon");
            imageView = null;
        }
        imageView.setVisibility(0);
        if (this.f10461R) {
            View view = this.f10450G;
            if (view == null) {
                o.p("aiAssistantDividerLine");
                view = null;
            }
            view.setVisibility(0);
            ImageView imageView3 = this.f10451H;
            if (imageView3 == null) {
                o.p("aiAssistantLastPromptIcon");
                imageView3 = null;
            }
            imageView3.setVisibility(0);
        }
        ConstraintLayout constraintLayout = this.f10449F;
        if (constraintLayout == null) {
            o.p("aiAssistantView");
            constraintLayout = null;
        }
        constraintLayout.setBackgroundTintList(ColorStateList.valueOf(this.f10460Q));
        ImageView imageView4 = this.f10453J;
        if (imageView4 == null) {
            o.p("aiAssistantCloseIcon");
        } else {
            imageView2 = imageView4;
        }
        imageView2.setVisibility(8);
    }

    public final void J() {
        ImageView imageView = this.f10452I;
        ImageView imageView2 = null;
        if (imageView == null) {
            o.p("aiAssistantIcon");
            imageView = null;
        }
        imageView.setVisibility(8);
        View view = this.f10450G;
        if (view == null) {
            o.p("aiAssistantDividerLine");
            view = null;
        }
        view.setVisibility(8);
        ImageView imageView3 = this.f10451H;
        if (imageView3 == null) {
            o.p("aiAssistantLastPromptIcon");
            imageView3 = null;
        }
        imageView3.setVisibility(8);
        ConstraintLayout constraintLayout = this.f10449F;
        if (constraintLayout == null) {
            o.p("aiAssistantView");
            constraintLayout = null;
        }
        constraintLayout.setBackgroundTintList(ColorStateList.valueOf(0));
        ImageView imageView4 = this.f10453J;
        if (imageView4 == null) {
            o.p("aiAssistantCloseIcon");
        } else {
            imageView2 = imageView4;
        }
        imageView2.setVisibility(0);
    }

    public final void K() {
        AutofillView autofillView = this.f10455L;
        if (autofillView != null) {
            autofillView.a();
        }
    }

    public final void L() {
        this.f10462y = false;
        View view = this.f10447D;
        if (view == null) {
            o.p("smartBarDisabledView");
            view = null;
        }
        view.setVisibility(0);
    }

    public final void M(List list) {
        o.e(list, "suggestions");
        AutofillView autofillView = this.f10455L;
        if (autofillView != null) {
            autofillView.b(list);
        }
    }

    public final void N() {
        this.f10462y = true;
        View view = this.f10447D;
        if (view == null) {
            o.p("smartBarDisabledView");
            view = null;
        }
        view.setVisibility(8);
    }

    public final void O() {
        ImageView imageView = this.f10453J;
        if (imageView == null) {
            o.p("aiAssistantCloseIcon");
            imageView = null;
        }
        imageView.setVisibility(8);
    }

    public final void P() {
        ConstraintLayout constraintLayout = this.f10454K;
        ConstraintLayout constraintLayout2 = null;
        if (constraintLayout == null) {
            o.p("additionalView");
            constraintLayout = null;
        }
        constraintLayout.removeAllViews();
        ConstraintLayout constraintLayout3 = this.f10454K;
        if (constraintLayout3 == null) {
            o.p("additionalView");
        } else {
            constraintLayout2 = constraintLayout3;
        }
        constraintLayout2.setVisibility(8);
    }

    public final void Q() {
        View view = this.f10450G;
        ImageView imageView = null;
        if (view == null) {
            o.p("aiAssistantDividerLine");
            view = null;
        }
        view.setVisibility(8);
        ImageView imageView2 = this.f10451H;
        if (imageView2 == null) {
            o.p("aiAssistantLastPromptIcon");
        } else {
            imageView = imageView2;
        }
        imageView.setVisibility(8);
        this.f10461R = false;
    }

    public final void R() {
        ProgressBar progressBar = this.f10463z;
        if (progressBar == null) {
            o.p("smartBarLoadingIndicator");
            progressBar = null;
        }
        progressBar.setVisibility(8);
    }

    public final void S() {
        setVisibility(8);
    }

    public final void U() {
        RecyclerView recyclerView = this.f10445B;
        h hVar = null;
        if (recyclerView == null) {
            o.p("smartBarRecyclerView");
            recyclerView = null;
        }
        recyclerView.setAdapter((RecyclerView.Adapter) null);
        RecyclerView recyclerView2 = this.f10445B;
        if (recyclerView2 == null) {
            o.p("smartBarRecyclerView");
            recyclerView2 = null;
        }
        h hVar2 = this.f10456M;
        if (hVar2 == null) {
            o.p("defaultSmartBarAdapter");
        } else {
            hVar = hVar2;
        }
        recyclerView2.setAdapter(hVar);
    }

    public final void V(int i4, boolean z3) {
        this.f10458O = z3;
        ImageView imageView = this.f10451H;
        ImageView imageView2 = null;
        if (imageView == null) {
            o.p("aiAssistantLastPromptIcon");
            imageView = null;
        }
        imageView.setImageDrawable(androidx.core.content.a.d(getContext(), i4));
        ImageView imageView3 = this.f10451H;
        if (imageView3 == null) {
            o.p("aiAssistantLastPromptIcon");
            imageView3 = null;
        }
        ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
        ImageView imageView4 = this.f10452I;
        if (imageView4 == null) {
            o.p("aiAssistantIcon");
            imageView4 = null;
        }
        layoutParams.height = imageView4.getLayoutParams().height;
        if (!this.f10458O || this.f10459P == 0) {
            ImageView imageView5 = this.f10451H;
            if (imageView5 == null) {
                o.p("aiAssistantLastPromptIcon");
            } else {
                imageView2 = imageView5;
            }
            imageView2.clearColorFilter();
        } else {
            ImageView imageView6 = this.f10451H;
            if (imageView6 == null) {
                o.p("aiAssistantLastPromptIcon");
            } else {
                imageView2 = imageView6;
            }
            imageView2.setColorFilter(this.f10459P);
        }
        this.f10461R = true;
    }

    public final void a0(int i4, int i5) {
        this.f10459P = i4;
        ImageView imageView = this.f10452I;
        ConstraintLayout constraintLayout = null;
        if (imageView == null) {
            o.p("aiAssistantIcon");
            imageView = null;
        }
        imageView.setColorFilter(i4);
        View view = this.f10450G;
        if (view == null) {
            o.p("aiAssistantDividerLine");
            view = null;
        }
        view.setBackgroundColor(i4);
        if (this.f10458O && i4 != 0) {
            ImageView imageView2 = this.f10451H;
            if (imageView2 == null) {
                o.p("aiAssistantLastPromptIcon");
                imageView2 = null;
            }
            imageView2.setColorFilter(i4);
        }
        ConstraintLayout constraintLayout2 = this.f10449F;
        if (constraintLayout2 == null) {
            o.p("aiAssistantView");
        } else {
            constraintLayout = constraintLayout2;
        }
        constraintLayout.setBackgroundTintList(ColorStateList.valueOf(i5));
        this.f10460Q = i5;
    }

    public final void c0(View view) {
        o.e(view, "view");
        ConstraintLayout constraintLayout = this.f10454K;
        ConstraintLayout constraintLayout2 = null;
        if (constraintLayout == null) {
            o.p("additionalView");
            constraintLayout = null;
        }
        constraintLayout.removeAllViews();
        ConstraintLayout constraintLayout3 = this.f10454K;
        if (constraintLayout3 == null) {
            o.p("additionalView");
            constraintLayout3 = null;
        }
        constraintLayout3.setVisibility(0);
        ConstraintLayout constraintLayout4 = this.f10454K;
        if (constraintLayout4 == null) {
            o.p("additionalView");
        } else {
            constraintLayout2 = constraintLayout4;
        }
        constraintLayout2.addView(view);
    }

    public final void d0() {
        ProgressBar progressBar = this.f10463z;
        if (progressBar == null) {
            o.p("smartBarLoadingIndicator");
            progressBar = null;
        }
        progressBar.setVisibility(0);
    }

    public final void e0() {
        setVisibility(0);
    }

    public final void f0() {
        RecyclerView recyclerView = this.f10445B;
        if (recyclerView == null) {
            o.p("smartBarRecyclerView");
            recyclerView = null;
        }
        recyclerView.setVisibility(0);
    }

    public final void setAiAssistantViewVisibility(boolean z3) {
        ConstraintLayout constraintLayout = null;
        if (z3) {
            ConstraintLayout constraintLayout2 = this.f10449F;
            if (constraintLayout2 == null) {
                o.p("aiAssistantView");
            } else {
                constraintLayout = constraintLayout2;
            }
            constraintLayout.setVisibility(0);
            return;
        }
        ConstraintLayout constraintLayout3 = this.f10449F;
        if (constraintLayout3 == null) {
            o.p("aiAssistantView");
        } else {
            constraintLayout = constraintLayout3;
        }
        constraintLayout.setVisibility(8);
    }

    public final void setIntroImageResource(Integer num) {
        if (num != null) {
            setupIntroAnimations(num.intValue());
        }
    }

    public final void setIsAutofillViewVisible(boolean z3) {
        AutofillView autofillView = this.f10455L;
        if (autofillView != null) {
            autofillView.setIsVisible(z3);
        }
    }

    public final void setOnAiAssistantCloseIconClick(C0906a aVar) {
        o.e(aVar, "onAiAssistantCloseIconClick");
        ImageView imageView = this.f10453J;
        if (imageView == null) {
            o.p("aiAssistantCloseIcon");
            imageView = null;
        }
        imageView.setOnClickListener(new k(aVar));
    }

    public final void setOnAiAssistantIconClick(C0906a aVar) {
        o.e(aVar, "onAiAssistantIconClickListener");
        ImageView imageView = this.f10452I;
        if (imageView == null) {
            o.p("aiAssistantIcon");
            imageView = null;
        }
        imageView.setOnClickListener(new j(aVar));
    }

    public final void setOnAiAssistantLastPromptClick(C0906a aVar) {
        o.e(aVar, "onAiAssistantLastPromptClick");
        ImageView imageView = this.f10451H;
        if (imageView == null) {
            o.p("aiAssistantLastPromptIcon");
            imageView = null;
        }
        imageView.setOnClickListener(new i(aVar));
    }

    public final void setOnLogoClickListener(C0906a aVar) {
        o.e(aVar, "onLogoClick");
        FrameLayout frameLayout = this.f10448E;
        if (frameLayout == null) {
            o.p("logoContent");
            frameLayout = null;
        }
        frameLayout.setOnClickListener(new m(aVar));
    }

    public final void setSmartBarContent(List<? extends g> list) {
        o.e(list, "list");
        h hVar = this.f10456M;
        if (hVar == null) {
            o.p("defaultSmartBarAdapter");
            hVar = null;
        }
        hVar.D(list, new l(this));
    }

    public final void setSmartBarEventListener(z zVar) {
        o.e(zVar, "onSmartBarEventListener");
        h hVar = this.f10456M;
        h hVar2 = null;
        if (hVar == null) {
            o.p("defaultSmartBarAdapter");
            hVar = null;
        }
        hVar.E(new a(zVar));
        h hVar3 = this.f10456M;
        if (hVar3 == null) {
            o.p("defaultSmartBarAdapter");
            hVar3 = null;
        }
        hVar3.G(new b(zVar));
        h hVar4 = this.f10456M;
        if (hVar4 == null) {
            o.p("defaultSmartBarAdapter");
            hVar4 = null;
        }
        hVar4.I(new c(zVar));
        h hVar5 = this.f10456M;
        if (hVar5 == null) {
            o.p("defaultSmartBarAdapter");
            hVar5 = null;
        }
        hVar5.H(new d(zVar));
        h hVar6 = this.f10456M;
        if (hVar6 == null) {
            o.p("defaultSmartBarAdapter");
        } else {
            hVar2 = hVar6;
        }
        hVar2.F(new e(zVar));
    }

    public final void setSmartBarLogoView(View view) {
        o.e(view, "view");
        FrameLayout frameLayout = this.f10448E;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            o.p("logoContent");
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        FrameLayout frameLayout3 = this.f10448E;
        if (frameLayout3 == null) {
            o.p("logoContent");
        } else {
            frameLayout2 = frameLayout3;
        }
        frameLayout2.addView(view);
    }

    public final void setTheme(ThemeModel.SmartBarTheme smartBarTheme) {
        ThemeModel.SmartBarTheme smartBarTheme2;
        o.e(smartBarTheme, "theme");
        this.f10457N = smartBarTheme;
        RecyclerView recyclerView = null;
        if (smartBarTheme == null) {
            o.p("smartBarTheme");
            smartBarTheme2 = null;
        } else {
            smartBarTheme2 = smartBarTheme;
        }
        setBackgroundColor(smartBarTheme2.getBackgroundColor());
        ProgressBar progressBar = this.f10463z;
        if (progressBar == null) {
            o.p("smartBarLoadingIndicator");
            progressBar = null;
        }
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(smartBarTheme.getSpinnerColor()));
        ImageView imageView = this.f10453J;
        if (imageView == null) {
            o.p("aiAssistantCloseIcon");
            imageView = null;
        }
        imageView.setImageTintList(ColorStateList.valueOf(smartBarTheme.getArrowCloseIconFontColor()));
        AutofillView autofillView = this.f10455L;
        if (autofillView != null) {
            ThemeModel.SmartBarTheme smartBarTheme3 = this.f10457N;
            if (smartBarTheme3 == null) {
                o.p("smartBarTheme");
                smartBarTheme3 = null;
            }
            autofillView.setBackgroundColor(smartBarTheme3.getBackgroundColor());
        }
        h hVar = this.f10456M;
        if (hVar == null) {
            o.p("defaultSmartBarAdapter");
            hVar = null;
        }
        ThemeModel.SmartBarTheme smartBarTheme4 = this.f10457N;
        if (smartBarTheme4 == null) {
            o.p("smartBarTheme");
            smartBarTheme4 = null;
        }
        hVar.J(smartBarTheme4);
        RecyclerView recyclerView2 = this.f10445B;
        if (recyclerView2 == null) {
            o.p("smartBarRecyclerView");
            recyclerView2 = null;
        }
        RecyclerView recyclerView3 = this.f10445B;
        if (recyclerView3 == null) {
            o.p("smartBarRecyclerView");
        } else {
            recyclerView = recyclerView3;
        }
        recyclerView2.setAdapter(recyclerView.getAdapter());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SmartBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmartBarView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        this.f10462y = true;
        this.f10458O = true;
        T();
    }
}
