package R0;

import R0.b;
import S0.d;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import ch.icoaching.wrio.C0553q;
import ch.icoaching.wrio.keyboard.E;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import kotlin.Triple;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import w2.C0930a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1357a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Rect f1358b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public ThemeModel.a f1359c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f1360d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f1361e;

    /* renamed from: f  reason: collision with root package name */
    private PopupWindow f1362f;

    /* renamed from: R0.a$a  reason: collision with other inner class name */
    public static final class C0021a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f1363a;

        /* renamed from: b  reason: collision with root package name */
        private ThemeModel.a f1364b = new ThemeModel.a(-16777216, -1);

        /* renamed from: c  reason: collision with root package name */
        private String f1365c = "";

        /* renamed from: d  reason: collision with root package name */
        private Rect f1366d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        private int f1367e;

        public C0021a(Context context) {
            o.e(context, "context");
            this.f1363a = context;
        }

        public final C0021a a(int i4) {
            this.f1367e = i4;
            return this;
        }

        public final C0021a b(Rect rect) {
            o.e(rect, "rect");
            this.f1366d.set(rect);
            return this;
        }

        public final C0021a c(ThemeModel.a aVar) {
            o.e(aVar, "theme");
            this.f1364b = aVar;
            return this;
        }

        public final C0021a d(String str) {
            o.e(str, "character");
            this.f1365c = str;
            return this;
        }

        public final a e() {
            a aVar = new a(this.f1363a, (i) null);
            aVar.f1358b.set(this.f1366d);
            aVar.f1361e = this.f1367e;
            aVar.f1359c = this.f1364b;
            aVar.f1360d = this.f1365c;
            return aVar;
        }
    }

    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f1368a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupWindow f1369b;

        b(View view, PopupWindow popupWindow) {
            this.f1368a = view;
            this.f1369b = popupWindow;
        }

        public void onGlobalLayout() {
            this.f1368a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ViewParent parent = this.f1369b.getContentView().getParent();
            o.c(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).setBackground((Drawable) null);
        }
    }

    public /* synthetic */ a(Context context, i iVar) {
        this(context);
    }

    private final PopupWindow c(View view, View view2, int i4, int i5, int i6, int i7) {
        int i8 = this.f1358b.left - i7;
        PopupWindow popupWindow = new PopupWindow(view2, i4, i5);
        view2.getViewTreeObserver().addOnGlobalLayoutListener(new b(view2, popupWindow));
        popupWindow.setFocusable(false);
        popupWindow.setTouchable(false);
        popupWindow.setOutsideTouchable(false);
        popupWindow.setElevation((float) C0553q.a(10));
        popupWindow.showAtLocation(view, 8388691, i8, i6);
        return popupWindow;
    }

    public final a a(View view, int i4, int i5, boolean z3) {
        boolean z4;
        o.e(view, "parent");
        int a4 = C0553q.a(1);
        float f4 = 1.1f;
        int b4 = C0930a.b(((float) this.f1358b.height()) * 1.1f) + i4;
        int width = (this.f1358b.width() - (this.f1361e * 2)) + (a4 * 2);
        d b5 = d.f1430g.b(this.f1357a, new ConstraintLayout.b(width, b4), this.f1359c.a(), z3, true);
        if (z3) {
            f4 = 1.0f;
        }
        int b6 = C0930a.b(((float) this.f1358b.width()) * f4);
        int height = this.f1358b.height();
        int i6 = (b6 - width) / 2;
        b.a aVar = b.f1370j;
        Context context = this.f1357a;
        String str = this.f1360d;
        ThemeModel.a aVar2 = this.f1359c;
        if (f4 > 1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        Triple a5 = aVar.a(context, b6, height, i6, str, aVar2, z4);
        b bVar = (b) a5.getFirst();
        bVar.setId(E.f9963a);
        b5.setId(E.f9964b);
        int width2 = ((int) (((float) this.f1358b.width()) * Math.abs(f4 - ((float) 1)))) / 2;
        ConstraintLayout constraintLayout = new ConstraintLayout(this.f1357a);
        constraintLayout.setLayoutParams(new ConstraintLayout.b(-2, -2));
        constraintLayout.addView(bVar);
        constraintLayout.addView(b5);
        c cVar = new c();
        cVar.f(constraintLayout);
        cVar.g(bVar.getId(), 6, 0, 6);
        cVar.g(bVar.getId(), 3, 0, 3);
        cVar.g(b5.getId(), 3, bVar.getId(), 4);
        cVar.h(b5.getId(), 6, 0, 6, (this.f1361e + width2) - a4);
        cVar.c(constraintLayout);
        this.f1362f = c(view, constraintLayout, ((Number) a5.getSecond()).intValue(), ((Number) a5.getThird()).intValue() + b4, i5, width2);
        return this;
    }

    public final void d() {
        PopupWindow popupWindow = this.f1362f;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f1362f = null;
    }

    private a(Context context) {
        this.f1357a = context;
        this.f1358b = new Rect();
        this.f1359c = new ThemeModel.a(-16777216, -1);
        this.f1360d = "";
    }
}
