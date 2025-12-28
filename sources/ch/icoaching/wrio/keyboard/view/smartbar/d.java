package ch.icoaching.wrio.keyboard.view.smartbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.icoaching.wrio.V;
import ch.icoaching.wrio.keyboard.E;
import ch.icoaching.wrio.keyboard.F;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import l2.q;
import u2.C0906a;
import u2.l;

public final class d extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    private l f10497A;

    /* renamed from: B  reason: collision with root package name */
    private l f10498B;

    /* renamed from: C  reason: collision with root package name */
    private ValueAnimator f10499C;

    /* renamed from: D  reason: collision with root package name */
    private ValueAnimator f10500D;

    /* renamed from: E  reason: collision with root package name */
    private ValueAnimator f10501E;

    /* renamed from: F  reason: collision with root package name */
    private ThemeModel.SmartBarTheme f10502F;

    /* renamed from: G  reason: collision with root package name */
    private TextView f10503G;

    /* renamed from: H  reason: collision with root package name */
    private View f10504H;

    /* renamed from: I  reason: collision with root package name */
    private View f10505I;

    /* renamed from: J  reason: collision with root package name */
    private c f10506J;

    /* renamed from: K  reason: collision with root package name */
    private e f10507K;

    /* renamed from: y  reason: collision with root package name */
    private l f10508y;

    /* renamed from: z  reason: collision with root package name */
    private l f10509z;

    /* synthetic */ class a extends FunctionReferenceImpl implements C0906a {
        a(Object obj) {
            super(0, obj, d.class, "onSmartBarItemClick", "onSmartBarItemClick()V", 0);
        }

        public final void a() {
            ((d) this.receiver).E();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return q.f14567a;
        }
    }

    /* synthetic */ class b extends FunctionReferenceImpl implements C0906a {
        b(Object obj) {
            super(0, obj, d.class, "onSmartBarItemLongClickStart", "onSmartBarItemLongClickStart()V", 0);
        }

        public final void a() {
            ((d) this.receiver).K();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return q.f14567a;
        }
    }

    /* synthetic */ class c extends FunctionReferenceImpl implements C0906a {
        c(Object obj) {
            super(0, obj, d.class, "onSmartBarItemLongClickEnd", "onSmartBarItemLongClickEnd()V", 0);
        }

        public final void a() {
            ((d) this.receiver).I();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return q.f14567a;
        }
    }

    /* renamed from: ch.icoaching.wrio.keyboard.view.smartbar.d$d  reason: collision with other inner class name */
    /* synthetic */ class C0156d extends FunctionReferenceImpl implements C0906a {
        C0156d(Object obj) {
            super(0, obj, d.class, "onSmartBarItemSwipeUp", "onSmartBarItemSwipeUp()V", 0);
        }

        public final void a() {
            ((d) this.receiver).O();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return q.f14567a;
        }
    }

    /* synthetic */ class e extends FunctionReferenceImpl implements C0906a {
        e(Object obj) {
            super(0, obj, d.class, "onSmartBarItemSwipeDown", "onSmartBarItemSwipeDown()V", 0);
        }

        public final void a() {
            ((d) this.receiver).M();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return q.f14567a;
        }
    }

    /* synthetic */ class f extends FunctionReferenceImpl implements C0906a {
        f(Object obj) {
            super(0, obj, d.class, "onSmartBarItemGestureCancelled", "onSmartBarItemGestureCancelled()V", 0);
        }

        public final void a() {
            ((d) this.receiver).G();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return q.f14567a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void B() {
        View.inflate(getContext(), F.prediction_item_view, this);
        setLayoutParams(new RecyclerView.p(-2, -1));
        this.f10503G = (TextView) findViewById(E.tv_prediction);
        this.f10504H = findViewById(E.v_prediction_divider);
        this.f10505I = findViewById(E.v_delete_background);
    }

    /* access modifiers changed from: private */
    public final void E() {
        l lVar = this.f10508y;
        if (lVar != null) {
            e eVar = this.f10507K;
            if (eVar == null) {
                o.p("predictionData");
                eVar = null;
            }
            lVar.invoke(eVar);
        }
    }

    /* access modifiers changed from: private */
    public final void G() {
        ValueAnimator valueAnimator = this.f10499C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f10501E;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        if (this.f10500D == null) {
            View view = this.f10505I;
            View view2 = null;
            if (view == null) {
                o.p("predictionDeleteBackground");
                view = null;
            }
            int measuredWidth = view.getMeasuredWidth();
            View view3 = this.f10505I;
            if (view3 == null) {
                o.p("predictionDeleteBackground");
            } else {
                view2 = view3;
            }
            this.f10500D = P0.c.h(view2, measuredWidth, 150);
        }
        ValueAnimator valueAnimator3 = this.f10500D;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
        P();
    }

    /* access modifiers changed from: private */
    public final void I() {
        ValueAnimator h4 = P0.c.h(this, getMeasuredWidth(), 300);
        this.f10501E = h4;
        if (h4 != null) {
            h4.start();
        }
        l lVar = this.f10509z;
        if (lVar != null) {
            e eVar = this.f10507K;
            if (eVar == null) {
                o.p("predictionData");
                eVar = null;
            }
            lVar.invoke(eVar);
        }
    }

    /* access modifiers changed from: private */
    public final void K() {
        ThemeModel.SmartBarTheme smartBarTheme = this.f10502F;
        TextView textView = null;
        if (smartBarTheme != null) {
            TextView textView2 = this.f10503G;
            if (textView2 == null) {
                o.p("predictionText");
                textView2 = null;
            }
            textView2.setTextColor(smartBarTheme.getDeleteFontColor());
        }
        View view = this.f10505I;
        if (view == null) {
            o.p("predictionDeleteBackground");
            view = null;
        }
        TextView textView3 = this.f10503G;
        if (textView3 == null) {
            o.p("predictionText");
        } else {
            textView = textView3;
        }
        ValueAnimator j4 = P0.c.j(view, textView.getMeasuredWidth(), 300);
        this.f10499C = j4;
        if (j4 != null) {
            j4.start();
        }
    }

    /* access modifiers changed from: private */
    public final void M() {
        l lVar = this.f10498B;
        if (lVar != null) {
            e eVar = this.f10507K;
            if (eVar == null) {
                o.p("predictionData");
                eVar = null;
            }
            lVar.invoke(eVar);
        }
    }

    /* access modifiers changed from: private */
    public final void O() {
        l lVar = this.f10497A;
        if (lVar != null) {
            e eVar = this.f10507K;
            if (eVar == null) {
                o.p("predictionData");
                eVar = null;
            }
            lVar.invoke(eVar);
        }
    }

    private final void P() {
        ThemeModel.SmartBarTheme smartBarTheme = this.f10502F;
        if (smartBarTheme != null) {
            e eVar = this.f10507K;
            TextView textView = null;
            if (eVar == null) {
                o.p("predictionData");
                eVar = null;
            }
            if (eVar.m()) {
                TextView textView2 = this.f10503G;
                if (textView2 == null) {
                    o.p("predictionText");
                } else {
                    textView = textView2;
                }
                textView.setTextColor(smartBarTheme.getProFeatureColor());
                return;
            }
            TextView textView3 = this.f10503G;
            if (textView3 == null) {
                o.p("predictionText");
            } else {
                textView = textView3;
            }
            textView.setTextColor(smartBarTheme.getFontColor());
        }
    }

    public final void D(l lVar, l lVar2, l lVar3, l lVar4) {
        this.f10508y = lVar;
        this.f10509z = lVar2;
        this.f10497A = lVar3;
        this.f10498B = lVar4;
        this.f10506J = new c(V.a(this), new a(this), new b(this), new c(this), new C0156d(this), new e(this), new f(this));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        o.e(motionEvent, "event");
        c cVar = this.f10506J;
        if (cVar == null) {
            o.p("gestureDetector");
            cVar = null;
        }
        return cVar.c(motionEvent);
    }

    public final void setDividerVisibility(boolean z3) {
        View view = null;
        if (z3) {
            View view2 = this.f10504H;
            if (view2 == null) {
                o.p("predictionDivider");
            } else {
                view = view2;
            }
            view.setVisibility(0);
            return;
        }
        View view3 = this.f10504H;
        if (view3 == null) {
            o.p("predictionDivider");
        } else {
            view = view3;
        }
        view.setVisibility(4);
    }

    public final void setPredictionData(e eVar) {
        o.e(eVar, "predictionData");
        this.f10507K = eVar;
        TextView textView = this.f10503G;
        if (textView == null) {
            o.p("predictionText");
            textView = null;
        }
        textView.setText(eVar.l());
        P();
    }

    public final void setTheme(ThemeModel.SmartBarTheme smartBarTheme) {
        this.f10502F = smartBarTheme;
        if (smartBarTheme != null) {
            TextView textView = this.f10503G;
            View view = null;
            if (textView == null) {
                o.p("predictionText");
                textView = null;
            }
            textView.setTextColor(smartBarTheme.getFontColor());
            View view2 = this.f10504H;
            if (view2 == null) {
                o.p("predictionDivider");
                view2 = null;
            }
            view2.setBackgroundColor(smartBarTheme.getDividerColor());
            View view3 = this.f10505I;
            if (view3 == null) {
                o.p("predictionDeleteBackground");
            } else {
                view = view3;
            }
            view.getBackground().setTint(smartBarTheme.getDeleteBackgroundColor());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        B();
    }
}
