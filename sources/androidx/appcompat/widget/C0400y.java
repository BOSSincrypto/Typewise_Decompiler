package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import n.C0822a;

/* renamed from: androidx.appcompat.widget.y  reason: case insensitive filesystem */
public class C0400y extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    private final C0401z f3671a;

    public C0400y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0822a.f14663G);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f3671a.h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f3671a.i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3671a.g(canvas);
    }

    public C0400y(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Y.a(this, getContext());
        C0401z zVar = new C0401z(this);
        this.f3671a = zVar;
        zVar.c(attributeSet, i4);
    }
}
