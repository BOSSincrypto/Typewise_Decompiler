package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

abstract class k implements p, m, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    private Rect f3002a;

    k() {
    }

    protected static int o(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i4) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i5 = 0;
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = listAdapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i7, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i4) {
                return i4;
            }
            if (measuredWidth > i5) {
                i5 = measuredWidth;
            }
        }
        return i5;
    }

    protected static boolean x(g gVar) {
        int size = gVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = gVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected static f y(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (f) listAdapter;
    }

    public void c(Context context, g gVar) {
    }

    public boolean i(g gVar, i iVar) {
        return false;
    }

    public boolean j(g gVar, i iVar) {
        return false;
    }

    public abstract void l(g gVar);

    /* access modifiers changed from: protected */
    public boolean m() {
        return true;
    }

    public Rect n() {
        return this.f3002a;
    }

    public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        int i5;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        g gVar = y(listAdapter).f2922a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i4);
        if (m()) {
            i5 = 0;
        } else {
            i5 = 4;
        }
        gVar.M(menuItem, this, i5);
    }

    public abstract void p(View view);

    public void q(Rect rect) {
        this.f3002a = rect;
    }

    public abstract void r(boolean z3);

    public abstract void s(int i4);

    public abstract void t(int i4);

    public abstract void u(PopupWindow.OnDismissListener onDismissListener);

    public abstract void v(boolean z3);

    public abstract void w(int i4);
}
