package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import java.lang.reflect.Method;

public class S extends P implements Q {

    /* renamed from: K  reason: collision with root package name */
    private static Method f3303K;

    /* renamed from: J  reason: collision with root package name */
    private Q f3304J;

    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class b {
        static void a(PopupWindow popupWindow, boolean z3) {
            popupWindow.setTouchModal(z3);
        }
    }

    public static class c extends L {

        /* renamed from: n  reason: collision with root package name */
        final int f3305n;

        /* renamed from: o  reason: collision with root package name */
        final int f3306o;

        /* renamed from: p  reason: collision with root package name */
        private Q f3307p;

        /* renamed from: q  reason: collision with root package name */
        private MenuItem f3308q;

        static class a {
            static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z3) {
            super(context, z3);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f3305n = 21;
                this.f3306o = 22;
                return;
            }
            this.f3305n = 22;
            this.f3306o = 21;
        }

        public /* bridge */ /* synthetic */ int d(int i4, int i5, int i6, int i7, int i8) {
            return super.d(i4, i5, i6, i7, i8);
        }

        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i4) {
            return super.e(motionEvent, i4);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i4;
            f fVar;
            i iVar;
            int pointToPosition;
            int i5;
            if (this.f3307p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i4 = headerViewListAdapter.getHeadersCount();
                    fVar = (f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fVar = (f) adapter;
                    i4 = 0;
                }
                if (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i5 = pointToPosition - i4) < 0 || i5 >= fVar.getCount()) {
                    iVar = null;
                } else {
                    iVar = fVar.getItem(i5);
                }
                MenuItem menuItem = this.f3308q;
                if (menuItem != iVar) {
                    g b4 = fVar.b();
                    if (menuItem != null) {
                        this.f3307p.e(b4, menuItem);
                    }
                    this.f3308q = iVar;
                    if (iVar != null) {
                        this.f3307p.c(b4, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i4, KeyEvent keyEvent) {
            f fVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i4 == this.f3305n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i4 != this.f3306o) {
                return super.onKeyDown(i4, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    fVar = (f) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    fVar = (f) adapter;
                }
                fVar.b().e(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(Q q4) {
            this.f3307p = q4;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3303K = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public S(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
    }

    public void S(Object obj) {
        a.a(this.f3269F, (Transition) obj);
    }

    public void T(Object obj) {
        a.b(this.f3269F, (Transition) obj);
    }

    public void U(Q q4) {
        this.f3304J = q4;
    }

    public void V(boolean z3) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3303K;
            if (method != null) {
                try {
                    method.invoke(this.f3269F, new Object[]{Boolean.valueOf(z3)});
                } catch (Exception unused) {
                }
            }
        } else {
            b.a(this.f3269F, z3);
        }
    }

    public void c(g gVar, MenuItem menuItem) {
        Q q4 = this.f3304J;
        if (q4 != null) {
            q4.c(gVar, menuItem);
        }
    }

    public void e(g gVar, MenuItem menuItem) {
        Q q4 = this.f3304J;
        if (q4 != null) {
            q4.e(gVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    public L s(Context context, boolean z3) {
        c cVar = new c(context, z3);
        cVar.setHoverListener(this);
        return cVar;
    }
}
