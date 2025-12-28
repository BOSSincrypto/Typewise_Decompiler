package ch.icoaching.wrio.keyboard.view.smartbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.P;
import androidx.recyclerview.widget.RecyclerView;
import ch.icoaching.wrio.V;
import ch.icoaching.wrio.keyboard.C;
import ch.icoaching.wrio.keyboard.E;
import ch.icoaching.wrio.keyboard.F;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.L;
import kotlinx.coroutines.g0;
import l2.q;
import u2.C0906a;
import u2.l;
import u2.p;

public final class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private l f10466a;

    /* renamed from: b  reason: collision with root package name */
    private l f10467b;

    /* renamed from: c  reason: collision with root package name */
    private l f10468c;

    /* renamed from: d  reason: collision with root package name */
    private c f10469d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f10470e;

    /* renamed from: f  reason: collision with root package name */
    private ThemeModel.SmartBarTheme f10471f;

    /* renamed from: g  reason: collision with root package name */
    private b f10472g;

    /* renamed from: h  reason: collision with root package name */
    private g0 f10473h;

    /* renamed from: ch.icoaching.wrio.keyboard.view.smartbar.a$a  reason: collision with other inner class name */
    static final class C0155a extends SuspendLambda implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10474a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f10475b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0155a(a aVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f10475b = aVar;
        }

        /* renamed from: a */
        public final Object invoke(D d4, kotlin.coroutines.c cVar) {
            return ((C0155a) create(d4, cVar)).invokeSuspend(q.f14567a);
        }

        public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
            return new C0155a(this.f10475b, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object f4 = kotlin.coroutines.intrinsics.a.f();
            int i4 = this.f10474a;
            if (i4 == 0) {
                f.b(obj);
                this.f10474a = 1;
                if (L.a(10000, this) == f4) {
                    return f4;
                }
            } else if (i4 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f10475b.b();
            return q.f14567a;
        }
    }

    public static final class b implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10476a;

        b(a aVar) {
            this.f10476a = aVar;
        }

        public void onViewAttachedToWindow(View view) {
            o.e(view, "view");
            this.f10476a.g();
            this.f10476a.e();
        }

        public void onViewDetachedFromWindow(View view) {
            o.e(view, "view");
        }
    }

    /* synthetic */ class c extends FunctionReferenceImpl implements C0906a {
        c(Object obj) {
            super(0, obj, a.class, "onSmartBarItemClick", "onSmartBarItemClick()V", 0);
        }

        public final void a() {
            ((a) this.receiver).m();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return q.f14567a;
        }
    }

    /* synthetic */ class d extends FunctionReferenceImpl implements C0906a {
        d(Object obj) {
            super(0, obj, a.class, "onSmartBarItemLongClickEnd", "onSmartBarItemLongClickEnd()V", 0);
        }

        public final void a() {
            ((a) this.receiver).n();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return q.f14567a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    /* access modifiers changed from: private */
    public final void b() {
        P0.c.f(this, 500);
        animate().setDuration(500).alpha(0.0f);
        postDelayed(new n(this), 500);
    }

    /* access modifiers changed from: private */
    public final void e() {
        g0 g0Var = this.f10473h;
        if (g0Var != null) {
            g0.a.a(g0Var, (CancellationException) null, 1, (Object) null);
        }
        this.f10473h = C0739h.d(V.a(this), (CoroutineContext) null, (CoroutineStart) null, new C0155a(this, (kotlin.coroutines.c) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void g() {
        P0.c.g(this, 500);
        animate().setDuration(500).alpha(1.0f);
    }

    private final void i() {
        View.inflate(getContext(), F.correction_item_view, this);
        RecyclerView.p pVar = new RecyclerView.p(-2, -2);
        pVar.setMarginStart(getResources().getDimensionPixelSize(C.smart_bar_item_horizontal_padding));
        setLayoutParams(pVar);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C.margin_xxxsmall);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C.smart_bar_item_vertical_padding);
        setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        this.f10470e = (TextView) findViewById(E.tv_correction);
        setBackground(androidx.core.content.a.d(getContext(), ch.icoaching.wrio.keyboard.D.rounded_white_rectangle_5dp));
        addOnAttachStateChangeListener(new b(this));
    }

    /* access modifiers changed from: private */
    public final void k() {
        b bVar = this.f10472g;
        if (bVar != null) {
            l lVar = this.f10466a;
            if (lVar != null) {
                lVar.invoke(bVar);
            }
            this.f10466a = null;
        }
    }

    /* access modifiers changed from: private */
    public final void m() {
        b bVar = this.f10472g;
        if (bVar != null) {
            l lVar = this.f10468c;
            if (lVar != null) {
                lVar.invoke(bVar);
            }
            b();
        }
    }

    /* access modifiers changed from: private */
    public final void n() {
        b bVar = this.f10472g;
        if (bVar != null) {
            l lVar = this.f10467b;
            if (lVar != null) {
                lVar.invoke(bVar);
            }
            b();
        }
    }

    public final void d(l lVar, l lVar2, l lVar3) {
        this.f10468c = lVar;
        this.f10467b = lVar2;
        this.f10466a = lVar3;
        this.f10469d = new c(V.a(this), new c(this), (C0906a) null, new d(this), (C0906a) null, (C0906a) null, (C0906a) null, 116, (i) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        o.e(motionEvent, "event");
        c cVar = this.f10469d;
        if (cVar == null) {
            o.p("gestureDetector");
            cVar = null;
        }
        return cVar.c(motionEvent);
    }

    public final void setCorrectionData(b bVar) {
        o.e(bVar, "correctionData");
        if (!o.a(this.f10472g, bVar)) {
            this.f10472g = bVar;
            TextView textView = this.f10470e;
            if (textView == null) {
                o.p("correctionText");
                textView = null;
            }
            textView.setText(bVar.e());
            if (P.R(this)) {
                g();
                e();
            }
        }
    }

    public final void setDrawable(o oVar) {
        o.e(oVar, "drawableItem");
        TextView textView = null;
        if (oVar.b()) {
            TextView textView2 = this.f10470e;
            if (textView2 == null) {
                o.p("correctionText");
                textView2 = null;
            }
            textView2.setCompoundDrawablesWithIntrinsicBounds(androidx.core.content.a.d(getContext(), oVar.a()), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            TextView textView3 = this.f10470e;
            if (textView3 == null) {
                o.p("correctionText");
                textView3 = null;
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, androidx.core.content.a.d(getContext(), oVar.a()), (Drawable) null);
        }
        ThemeModel.SmartBarTheme smartBarTheme = this.f10471f;
        if (smartBarTheme != null) {
            TextView textView4 = this.f10470e;
            if (textView4 == null) {
                o.p("correctionText");
            } else {
                textView = textView4;
            }
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            o.d(compoundDrawables, "getCompoundDrawables(...)");
            for (Drawable drawable : compoundDrawables) {
                if (drawable != null) {
                    drawable.setTint(smartBarTheme.getUndoIconColor());
                }
            }
        }
    }

    public final void setTheme(ThemeModel.SmartBarTheme smartBarTheme) {
        this.f10471f = smartBarTheme;
        if (smartBarTheme != null) {
            getBackground().setTint(smartBarTheme.getUndoBackgroundColor());
            TextView textView = this.f10470e;
            TextView textView2 = null;
            if (textView == null) {
                o.p("correctionText");
                textView = null;
            }
            textView.setTextColor(smartBarTheme.getUndoFontColor());
            TextView textView3 = this.f10470e;
            if (textView3 == null) {
                o.p("correctionText");
            } else {
                textView2 = textView3;
            }
            Drawable[] compoundDrawables = textView2.getCompoundDrawables();
            o.d(compoundDrawables, "getCompoundDrawables(...)");
            for (Drawable drawable : compoundDrawables) {
                if (drawable != null) {
                    drawable.setTint(smartBarTheme.getUndoIconColor());
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        i();
    }
}
