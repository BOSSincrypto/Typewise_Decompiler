package S0;

import S0.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import ch.icoaching.wrio.C0553q;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import u2.l;
import w2.C0930a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1392a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f1393b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1394c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ThemeModel.b f1395d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public String[] f1396e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f1397f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f1398g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public String f1399h;

    /* renamed from: i  reason: collision with root package name */
    private final Rect f1400i;

    /* renamed from: j  reason: collision with root package name */
    private PopupWindow f1401j;

    /* renamed from: k  reason: collision with root package name */
    private c f1402k;

    /* renamed from: S0.a$a  reason: collision with other inner class name */
    public static final class C0024a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f1403a;

        /* renamed from: b  reason: collision with root package name */
        private ThemeModel.b f1404b;

        /* renamed from: c  reason: collision with root package name */
        private int f1405c = C0553q.a(8);

        /* renamed from: d  reason: collision with root package name */
        private String[] f1406d = new String[0];

        /* renamed from: e  reason: collision with root package name */
        private Rect f1407e = new Rect();

        /* renamed from: f  reason: collision with root package name */
        private int f1408f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f1409g = true;

        /* renamed from: h  reason: collision with root package name */
        private String f1410h = "";

        public C0024a(Context context) {
            o.e(context, "context");
            this.f1403a = context;
            ColorStateList valueOf = ColorStateList.valueOf(-1);
            o.d(valueOf, "valueOf(...)");
            this.f1404b = new ThemeModel.b(-16777216, -16776961, valueOf);
        }

        public final C0024a a(int i4) {
            this.f1408f = i4;
            return this;
        }

        public final C0024a b(Rect rect) {
            o.e(rect, "rect");
            this.f1407e.set(rect);
            return this;
        }

        public final C0024a c(ThemeModel.b bVar) {
            o.e(bVar, "theme");
            this.f1404b = bVar;
            return this;
        }

        public final C0024a d(String str) {
            o.e(str, "forceCharacterToDisplay");
            this.f1410h = str;
            return this;
        }

        public final C0024a e(boolean z3) {
            this.f1409g = z3;
            return this;
        }

        public final C0024a f(String[] strArr) {
            o.e(strArr, "items");
            this.f1406d = strArr;
            return this;
        }

        public final a g() {
            a aVar = new a(this.f1403a, (i) null);
            aVar.f1393b = this.f1405c;
            aVar.f1394c.set(this.f1407e);
            aVar.f1397f = this.f1408f;
            aVar.f1395d = this.f1404b;
            aVar.f1396e = this.f1406d;
            aVar.f1398g = this.f1409g;
            aVar.f1399h = this.f1410h;
            return aVar;
        }

        public final C0024a h(int i4) {
            this.f1405c = i4;
            return this;
        }
    }

    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f1411a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PopupWindow f1412b;

        b(View view, PopupWindow popupWindow) {
            this.f1411a = view;
            this.f1412b = popupWindow;
        }

        public void onGlobalLayout() {
            this.f1411a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ViewParent parent = this.f1412b.getContentView().getParent();
            o.c(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).setBackground((Drawable) null);
        }
    }

    public /* synthetic */ a(Context context, i iVar) {
        this(context);
    }

    private final PopupWindow c(View view, View view2, int i4, int i5, int i6, int i7) {
        PopupWindow popupWindow = new PopupWindow(view2, i4, i5);
        view2.getViewTreeObserver().addOnGlobalLayoutListener(new b(view2, popupWindow));
        popupWindow.showAtLocation(view, 8388691, i7, i6);
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = i4 + i7;
        if (i8 > view.getWidth()) {
            i8 = view.getWidth();
        }
        if (i6 < 0) {
            i6 = 0;
        }
        int i9 = i6 + i5;
        if (i9 > view.getHeight()) {
            i9 = view.getHeight();
            i6 = i9 - i5;
        }
        this.f1400i.set(i7, i6, i8, i9);
        return popupWindow;
    }

    private final Triple d(View view, int i4, int i5) {
        boolean z3;
        if (this.f1394c.left > view.getWidth() / 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i6 = i4 + i5;
        return new Triple(Integer.valueOf(this.f1394c.left / i6), Integer.valueOf((view.getWidth() - this.f1394c.right) / i6), Boolean.valueOf(z3));
    }

    private final void k(c cVar, float f4, float f5, l lVar) {
        Rect rect = this.f1400i;
        String b4 = cVar.b(f4 - ((float) rect.left), f5 - ((float) rect.top));
        if (b4 != null) {
            lVar.invoke(b4);
        }
    }

    public final a a(View view, int i4, int i5, boolean z3) {
        Pair pair;
        View view2 = view;
        o.e(view2, "parent");
        int b4 = C0930a.b(((float) this.f1394c.width()) * 0.9f);
        int width = this.f1394c.width() - b4;
        int height = this.f1394c.height() - width;
        Triple d4 = d(view2, b4, width);
        if (this.f1398g) {
            pair = b.b(this.f1396e, ((Number) d4.getFirst()).intValue(), ((Number) d4.getSecond()).intValue(), ((Boolean) d4.getThird()).booleanValue(), this.f1399h);
        } else {
            pair = new Pair(this.f1396e, d4.getFirst());
        }
        int intValue = this.f1394c.left - (((Number) pair.getSecond()).intValue() * this.f1394c.width());
        Triple a4 = c.f1413p.a(this.f1392a, b4, height, width, (String[]) pair.getFirst(), ((Number) pair.getSecond()).intValue(), this.f1395d, this.f1393b);
        this.f1402k = (c) a4.getFirst();
        int height2 = this.f1394c.height() + i4;
        d a5 = d.a.a(d.f1430g, this.f1392a, new LinearLayout.LayoutParams(this.f1394c.width(), height2), this.f1395d.a(), z3, false, 16, (Object) null);
        LinearLayout linearLayout = new LinearLayout(this.f1392a);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        linearLayout.addView((View) a4.getFirst());
        linearLayout.addView(a5);
        linearLayout.setBackgroundColor(0);
        this.f1401j = c(view, linearLayout, ((Number) a4.getSecond()).intValue(), ((Number) a4.getThird()).intValue() + height2, i5, intValue);
        ViewGroup.LayoutParams layoutParams = a5.getLayoutParams();
        o.c(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = this.f1394c.left - this.f1400i.left;
        a5.setLayoutParams(layoutParams2);
        return this;
    }

    public final void e() {
        PopupWindow popupWindow = this.f1401j;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f1401j = null;
    }

    public final void l(MotionEvent motionEvent, l lVar) {
        o.e(motionEvent, "event");
        o.e(lVar, "onSelectedCharUpdate");
        c cVar = this.f1402k;
        if (cVar != null) {
            k(cVar, motionEvent.getX(), motionEvent.getY(), lVar);
        }
    }

    public final int m() {
        c cVar = this.f1402k;
        if (cVar != null) {
            return cVar.getSelectedItemPosition();
        }
        return 0;
    }

    private a(Context context) {
        this.f1392a = context;
        this.f1393b = C0553q.a(8);
        this.f1394c = new Rect();
        ColorStateList valueOf = ColorStateList.valueOf(-1);
        o.d(valueOf, "valueOf(...)");
        this.f1395d = new ThemeModel.b(-16777216, -16776961, valueOf);
        this.f1396e = new String[0];
        this.f1398g = true;
        this.f1399h = "";
        this.f1400i = new Rect();
    }
}
