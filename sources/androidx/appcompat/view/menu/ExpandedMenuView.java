package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.c0;

public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f2821c = {16842964, 16843049};

    /* renamed from: a  reason: collision with root package name */
    private g f2822a;

    /* renamed from: b  reason: collision with root package name */
    private int f2823b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public boolean a(i iVar) {
        return this.f2822a.L(iVar, 0);
    }

    public void b(g gVar) {
        this.f2822a = gVar;
    }

    public int getWindowAnimations() {
        return this.f2823b;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        a((i) getAdapter().getItem(i4));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        c0 v3 = c0.v(context, attributeSet, f2821c, i4, 0);
        if (v3.s(0)) {
            setBackgroundDrawable(v3.g(0));
        }
        if (v3.s(1)) {
            setDivider(v3.g(1));
        }
        v3.w();
    }
}
