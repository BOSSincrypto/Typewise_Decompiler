package ch.icoaching.wrio.keyboard.view.autofill;

import Q0.d;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001c"}, d2 = {"Lch/icoaching/wrio/keyboard/view/autofill/ClippedAutoFillSuggestionsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll2/q;", "b", "()V", "Landroid/view/View;", "rootView", "c", "(Landroid/view/View;)V", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/ViewTreeObserver$OnDrawListener;", "a", "Landroid/view/ViewTreeObserver$OnDrawListener;", "onDrawListener", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "parentBounds", "contentBounds", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClippedAutoFillSuggestionsView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final ViewTreeObserver.OnDrawListener f10333a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f10334b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f10335c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClippedAutoFillSuggestionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    private final void b() {
        this.f10334b.right = getWidth();
        this.f10334b.bottom = getHeight();
        c(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r4 = (android.view.ViewGroup) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        r4 = (android.view.ViewGroup) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c(android.view.View r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto L_0x003e
            boolean r0 = Q0.a.a(r4)
            if (r0 == 0) goto L_0x0026
            android.graphics.Rect r0 = r3.f10335c
            android.graphics.Rect r1 = r3.f10334b
            r0.set(r1)
            android.graphics.Rect r0 = r3.f10335c
            r3.offsetRectIntoDescendantCoords(r4, r0)
            android.widget.inline.InlineContentView r4 = Q0.b.a(r4)
            android.graphics.Rect r0 = r3.f10335c
            r4.setClipBounds(r0)
            goto L_0x0056
        L_0x0026:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0056
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            if (r0 < 0) goto L_0x0056
        L_0x0032:
            android.view.View r1 = r4.getChildAt(r2)
            r3.c(r1)
            if (r2 == r0) goto L_0x0056
            int r2 = r2 + 1
            goto L_0x0032
        L_0x003e:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0056
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            if (r0 < 0) goto L_0x0056
        L_0x004a:
            android.view.View r1 = r4.getChildAt(r2)
            r3.c(r1)
            if (r2 == r0) goto L_0x0056
            int r2 = r2 + 1
            goto L_0x004a
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.view.autofill.ClippedAutoFillSuggestionsView.c(android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void d(ClippedAutoFillSuggestionsView clippedAutoFillSuggestionsView) {
        clippedAutoFillSuggestionsView.b();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnDrawListener(this.f10333a);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        getViewTreeObserver().removeOnDrawListener(this.f10333a);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClippedAutoFillSuggestionsView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        this.f10333a = new d(this);
        this.f10334b = new Rect();
        this.f10335c = new Rect();
    }
}
