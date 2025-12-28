package androidx.fragment.app;

import Q.c;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.C0435o0;
import androidx.core.view.P;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0010B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010\u0011J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010\u0011J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020&H\u0001¢\u0006\u0004\b-\u0010.J)\u00102\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b6\u0010\u0011J\u0017\u00107\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b7\u0010\u0011J\u001f\u0010:\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u00020\u000fH\u0016¢\u0006\u0004\b=\u0010>J\u0019\u0010A\u001a\u00028\u0000\"\n\b\u0000\u0010@*\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\r0C8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\r0C8\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u0018\u0010J\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010,\u001a\u00020&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006M"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/q;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/q;)V", "Landroid/view/View;", "v", "Ll2/q;", "a", "(Landroid/view/View;)V", "Landroid/animation/LayoutTransition;", "transition", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "dispatchApplyWindowInsets", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "child", "", "drawingTime", "", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "view", "startViewTransition", "endViewTransition", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "removeViewAt", "(I)V", "removeViewInLayout", "removeView", "start", "count", "removeViews", "(II)V", "removeViewsInLayout", "removeAllViewsInLayout", "()V", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "", "Ljava/util/List;", "disappearingFragmentChildren", "b", "transitioningFragmentViews", "c", "Landroid/view/View$OnApplyWindowInsetsListener;", "applyWindowInsetsListener", "d", "Z", "fragment_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final List f5698a;

    /* renamed from: b  reason: collision with root package name */
    private final List f5699b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f5700c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5701d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f5702a = new a();

        private a() {
        }

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            o.e(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            o.e(view, "v");
            o.e(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            o.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (i) null);
        o.e(context, "context");
    }

    private final void a(View view) {
        if (this.f5699b.contains(view)) {
            this.f5698a.add(view);
        }
    }

    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        o.e(view, "child");
        if (q.x0(view) != null) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0435o0 o0Var;
        int childCount;
        o.e(windowInsets, "insets");
        C0435o0 v3 = C0435o0.v(windowInsets);
        o.d(v3, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f5700c;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f5702a;
            o.b(onApplyWindowInsetsListener);
            o0Var = C0435o0.v(aVar.a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            o0Var = P.a0(this, v3);
        }
        if (!o0Var.n() && (childCount = getChildCount()) > 0) {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                P.g(getChildAt(i4), o0Var);
                if (i5 >= childCount) {
                    break;
                }
                i4 = i5;
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        o.e(canvas, "canvas");
        if (this.f5701d) {
            for (View drawChild : this.f5698a) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j4) {
        o.e(canvas, "canvas");
        o.e(view, "child");
        if (!this.f5701d || this.f5698a.isEmpty() || !this.f5698a.contains(view)) {
            return super.drawChild(canvas, view, j4);
        }
        return false;
    }

    public void endViewTransition(View view) {
        o.e(view, "view");
        this.f5699b.remove(view);
        if (this.f5698a.remove(view)) {
            this.f5701d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return q.g0(this).d0(getId());
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        o.e(windowInsets, "insets");
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            while (true) {
                int i4 = childCount - 1;
                View childAt = getChildAt(childCount);
                o.d(childAt, "view");
                a(childAt);
                if (i4 < 0) {
                    break;
                }
                childCount = i4;
            }
        }
        super.removeAllViewsInLayout();
    }

    public void removeView(View view) {
        o.e(view, "view");
        a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i4) {
        View childAt = getChildAt(i4);
        o.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i4);
    }

    public void removeViewInLayout(View view) {
        o.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i4, int i5) {
        int i6 = i4 + i5;
        if (i4 < i6) {
            int i7 = i4;
            while (true) {
                int i8 = i7 + 1;
                View childAt = getChildAt(i7);
                o.d(childAt, "view");
                a(childAt);
                if (i8 >= i6) {
                    break;
                }
                i7 = i8;
            }
        }
        super.removeViews(i4, i5);
    }

    public void removeViewsInLayout(int i4, int i5) {
        int i6 = i4 + i5;
        if (i4 < i6) {
            int i7 = i4;
            while (true) {
                int i8 = i7 + 1;
                View childAt = getChildAt(i7);
                o.d(childAt, "view");
                a(childAt);
                if (i8 >= i6) {
                    break;
                }
                i7 = i8;
            }
        }
        super.removeViewsInLayout(i4, i5);
    }

    public final void setDrawDisappearingViewsLast(boolean z3) {
        this.f5701d = z3;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        o.e(onApplyWindowInsetsListener, "listener");
        this.f5700c = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        o.e(view, "view");
        if (view.getParent() == this) {
            this.f5699b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i4, int i5, i iVar) {
        this(context, attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        String str;
        o.e(context, "context");
        this.f5698a = new ArrayList();
        this.f5699b = new ArrayList();
        this.f5701d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = c.f1210e;
            o.d(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(c.f1211f);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, q qVar) {
        super(context, attributeSet);
        o.e(context, "context");
        o.e(attributeSet, "attrs");
        o.e(qVar, "fm");
        this.f5698a = new ArrayList();
        this.f5699b = new ArrayList();
        this.f5701d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = c.f1210e;
        o.d(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(c.f1211f) : classAttribute;
        String string = obtainStyledAttributes.getString(c.f1212g);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment d02 = qVar.d0(id);
        if (classAttribute != null && d02 == null) {
            if (id == -1) {
                String k4 = string != null ? o.k(" with tag ", string) : "";
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + k4);
            }
            Fragment a4 = qVar.o0().a(context.getClassLoader(), classAttribute);
            o.d(a4, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a4.onInflate(context, attributeSet, (Bundle) null);
            qVar.l().o(true).c(this, a4, string).i();
        }
        qVar.Q0(this);
    }
}
