package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

public class f extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    g f2922a;

    /* renamed from: b  reason: collision with root package name */
    private int f2923b = -1;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2924c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2925d;

    /* renamed from: e  reason: collision with root package name */
    private final LayoutInflater f2926e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2927f;

    public f(g gVar, LayoutInflater layoutInflater, boolean z3, int i4) {
        this.f2925d = z3;
        this.f2926e = layoutInflater;
        this.f2922a = gVar;
        this.f2927f = i4;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        i v3 = this.f2922a.v();
        if (v3 != null) {
            ArrayList z3 = this.f2922a.z();
            int size = z3.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((i) z3.get(i4)) == v3) {
                    this.f2923b = i4;
                    return;
                }
            }
        }
        this.f2923b = -1;
    }

    public g b() {
        return this.f2922a;
    }

    /* renamed from: c */
    public i getItem(int i4) {
        ArrayList arrayList;
        if (this.f2925d) {
            arrayList = this.f2922a.z();
        } else {
            arrayList = this.f2922a.E();
        }
        int i5 = this.f2923b;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return (i) arrayList.get(i4);
    }

    public void d(boolean z3) {
        this.f2924c = z3;
    }

    public int getCount() {
        ArrayList arrayList;
        if (this.f2925d) {
            arrayList = this.f2922a.z();
        } else {
            arrayList = this.f2922a.E();
        }
        if (this.f2923b < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public long getItemId(int i4) {
        return (long) i4;
    }

    public View getView(int i4, View view, ViewGroup viewGroup) {
        int i5;
        boolean z3;
        if (view == null) {
            view = this.f2926e.inflate(this.f2927f, viewGroup, false);
        }
        int groupId = getItem(i4).getGroupId();
        int i6 = i4 - 1;
        if (i6 >= 0) {
            i5 = getItem(i6).getGroupId();
        } else {
            i5 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (!this.f2922a.F() || groupId == i5) {
            z3 = false;
        } else {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        n.a aVar = (n.a) view;
        if (this.f2924c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i4), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
