package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;
import n.g;

public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    Context f2911a;

    /* renamed from: b  reason: collision with root package name */
    LayoutInflater f2912b;

    /* renamed from: c  reason: collision with root package name */
    g f2913c;

    /* renamed from: d  reason: collision with root package name */
    ExpandedMenuView f2914d;

    /* renamed from: e  reason: collision with root package name */
    int f2915e;

    /* renamed from: f  reason: collision with root package name */
    int f2916f;

    /* renamed from: g  reason: collision with root package name */
    int f2917g;

    /* renamed from: h  reason: collision with root package name */
    private m.a f2918h;

    /* renamed from: i  reason: collision with root package name */
    a f2919i;

    private class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        private int f2920a = -1;

        public a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            i v3 = e.this.f2913c.v();
            if (v3 != null) {
                ArrayList z3 = e.this.f2913c.z();
                int size = z3.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (((i) z3.get(i4)) == v3) {
                        this.f2920a = i4;
                        return;
                    }
                }
            }
            this.f2920a = -1;
        }

        /* renamed from: b */
        public i getItem(int i4) {
            ArrayList z3 = e.this.f2913c.z();
            int i5 = i4 + e.this.f2915e;
            int i6 = this.f2920a;
            if (i6 >= 0 && i5 >= i6) {
                i5++;
            }
            return (i) z3.get(i5);
        }

        public int getCount() {
            int size = e.this.f2913c.z().size() - e.this.f2915e;
            if (this.f2920a < 0) {
                return size;
            }
            return size - 1;
        }

        public long getItemId(int i4) {
            return (long) i4;
        }

        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f2912b.inflate(eVar.f2917g, viewGroup, false);
            }
            ((n.a) view).e(getItem(i4), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i4) {
        this(i4, 0);
        this.f2911a = context;
        this.f2912b = LayoutInflater.from(context);
    }

    public void a(g gVar, boolean z3) {
        m.a aVar = this.f2918h;
        if (aVar != null) {
            aVar.a(gVar, z3);
        }
    }

    public ListAdapter b() {
        if (this.f2919i == null) {
            this.f2919i = new a();
        }
        return this.f2919i;
    }

    public void c(Context context, g gVar) {
        if (this.f2916f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f2916f);
            this.f2911a = contextThemeWrapper;
            this.f2912b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f2911a != null) {
            this.f2911a = context;
            if (this.f2912b == null) {
                this.f2912b = LayoutInflater.from(context);
            }
        }
        this.f2913c = gVar;
        a aVar = this.f2919i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public n d(ViewGroup viewGroup) {
        if (this.f2914d == null) {
            this.f2914d = (ExpandedMenuView) this.f2912b.inflate(g.f14809g, viewGroup, false);
            if (this.f2919i == null) {
                this.f2919i = new a();
            }
            this.f2914d.setAdapter(this.f2919i);
            this.f2914d.setOnItemClickListener(this);
        }
        return this.f2914d;
    }

    public boolean e(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).d((IBinder) null);
        m.a aVar = this.f2918h;
        if (aVar == null) {
            return true;
        }
        aVar.b(rVar);
        return true;
    }

    public void f(boolean z3) {
        a aVar = this.f2919i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean h() {
        return false;
    }

    public boolean i(g gVar, i iVar) {
        return false;
    }

    public boolean j(g gVar, i iVar) {
        return false;
    }

    public void k(m.a aVar) {
        this.f2918h = aVar;
    }

    public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        this.f2913c.M(this.f2919i.getItem(i4), this, 0);
    }

    public e(int i4, int i5) {
        this.f2917g = i4;
        this.f2916f = i5;
    }
}
