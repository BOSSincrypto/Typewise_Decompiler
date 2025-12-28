package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.C0402a;
import androidx.core.view.P;
import androidx.core.view.accessibility.A;
import java.util.Calendar;
import z1.e;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f11931a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11932b;

    class a extends C0402a {
        a() {
        }

        public void g(View view, A a4) {
            super.g(view, a4);
            a4.l0((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i4, Rect rect) {
        if (i4 == 33) {
            setSelection(getAdapter().k());
        } else if (i4 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i4, rect);
        }
    }

    /* renamed from: b */
    public n getAdapter() {
        return (n) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n b4 = getAdapter();
        b4.getClass();
        int max = Math.max(b4.b(), getFirstVisiblePosition());
        int min = Math.min(b4.k(), getLastVisiblePosition());
        b4.getItem(max);
        b4.getItem(min);
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z3, int i4, Rect rect) {
        if (z3) {
            a(i4, rect);
        } else {
            super.onFocusChanged(false, i4, rect);
        }
    }

    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (!super.onKeyDown(i4, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i4) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    public void onMeasure(int i4, int i5) {
        if (this.f11932b) {
            super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i4, i5);
    }

    public void setSelection(int i4) {
        if (i4 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i4);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f11931a = y.k();
        if (k.D(getContext())) {
            setNextFocusLeftId(e.cancel_button);
            setNextFocusRightId(e.confirm_button);
        }
        this.f11932b = k.F(getContext());
        P.o0(this, new a());
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof n) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), n.class.getCanonicalName()}));
    }
}
