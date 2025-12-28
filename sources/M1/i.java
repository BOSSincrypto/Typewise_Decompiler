package m1;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.f;
import com.bumptech.glide.request.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p1.k;

public abstract class i extends C0819a {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f14642f;

    /* renamed from: g  reason: collision with root package name */
    private static int f14643g = f.glide_custom_view_target_tag;

    /* renamed from: a  reason: collision with root package name */
    protected final View f14644a;

    /* renamed from: b  reason: collision with root package name */
    private final a f14645b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnAttachStateChangeListener f14646c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14647d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14648e;

    static final class a {

        /* renamed from: e  reason: collision with root package name */
        static Integer f14649e;

        /* renamed from: a  reason: collision with root package name */
        private final View f14650a;

        /* renamed from: b  reason: collision with root package name */
        private final List f14651b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        boolean f14652c;

        /* renamed from: d  reason: collision with root package name */
        private C0208a f14653d;

        /* renamed from: m1.i$a$a  reason: collision with other inner class name */
        private static final class C0208a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference f14654a;

            C0208a(a aVar) {
                this.f14654a = new WeakReference(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                }
                a aVar = (a) this.f14654a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.f14650a = view;
        }

        private static int c(Context context) {
            if (f14649e == null) {
                Display defaultDisplay = ((WindowManager) k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f14649e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f14649e.intValue();
        }

        private int e(int i4, int i5, int i6) {
            int i7 = i5 - i6;
            if (i7 > 0) {
                return i7;
            }
            if (this.f14652c && this.f14650a.isLayoutRequested()) {
                return 0;
            }
            int i8 = i4 - i6;
            if (i8 > 0) {
                return i8;
            }
            if (this.f14650a.isLayoutRequested() || i5 != -2) {
                return 0;
            }
            Log.isLoggable("ViewTarget", 4);
            return c(this.f14650a.getContext());
        }

        private int f() {
            int i4;
            int paddingTop = this.f14650a.getPaddingTop() + this.f14650a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f14650a.getLayoutParams();
            if (layoutParams != null) {
                i4 = layoutParams.height;
            } else {
                i4 = 0;
            }
            return e(this.f14650a.getHeight(), i4, paddingTop);
        }

        private int g() {
            int i4;
            int paddingLeft = this.f14650a.getPaddingLeft() + this.f14650a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f14650a.getLayoutParams();
            if (layoutParams != null) {
                i4 = layoutParams.width;
            } else {
                i4 = 0;
            }
            return e(this.f14650a.getWidth(), i4, paddingLeft);
        }

        private boolean h(int i4) {
            if (i4 > 0 || i4 == Integer.MIN_VALUE) {
                return true;
            }
            return false;
        }

        private boolean i(int i4, int i5) {
            if (!h(i4) || !h(i5)) {
                return false;
            }
            return true;
        }

        private void j(int i4, int i5) {
            Iterator it = new ArrayList(this.f14651b).iterator();
            while (it.hasNext()) {
                ((g) it.next()).g(i4, i5);
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            if (!this.f14651b.isEmpty()) {
                int g4 = g();
                int f4 = f();
                if (i(g4, f4)) {
                    j(g4, f4);
                    b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            ViewTreeObserver viewTreeObserver = this.f14650a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f14653d);
            }
            this.f14653d = null;
            this.f14651b.clear();
        }

        /* access modifiers changed from: package-private */
        public void d(g gVar) {
            int g4 = g();
            int f4 = f();
            if (i(g4, f4)) {
                gVar.g(g4, f4);
                return;
            }
            if (!this.f14651b.contains(gVar)) {
                this.f14651b.add(gVar);
            }
            if (this.f14653d == null) {
                ViewTreeObserver viewTreeObserver = this.f14650a.getViewTreeObserver();
                C0208a aVar = new C0208a(this);
                this.f14653d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        public void k(g gVar) {
            this.f14651b.remove(gVar);
        }
    }

    public i(View view) {
        this.f14644a = (View) k.d(view);
        this.f14645b = new a(view);
    }

    private Object l() {
        return this.f14644a.getTag(f14643g);
    }

    private void m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f14646c;
        if (onAttachStateChangeListener != null && !this.f14648e) {
            this.f14644a.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f14648e = true;
        }
    }

    private void n() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f14646c;
        if (onAttachStateChangeListener != null && this.f14648e) {
            this.f14644a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f14648e = false;
        }
    }

    private void o(Object obj) {
        f14642f = true;
        this.f14644a.setTag(f14643g, obj);
    }

    public void d(g gVar) {
        this.f14645b.d(gVar);
    }

    public void f(g gVar) {
        this.f14645b.k(gVar);
    }

    public void g(Drawable drawable) {
        super.g(drawable);
        m();
    }

    public c i() {
        Object l4 = l();
        if (l4 == null) {
            return null;
        }
        if (l4 instanceof c) {
            return (c) l4;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public void j(Drawable drawable) {
        super.j(drawable);
        this.f14645b.b();
        if (!this.f14647d) {
            n();
        }
    }

    public void k(c cVar) {
        o(cVar);
    }

    public String toString() {
        return "Target for: " + this.f14644a;
    }
}
