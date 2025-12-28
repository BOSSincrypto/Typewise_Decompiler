package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: androidx.core.view.accessibility.a  reason: case insensitive filesystem */
public final class C0404a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    private final int f5272a;

    /* renamed from: b  reason: collision with root package name */
    private final A f5273b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5274c;

    public C0404a(int i4, A a4, int i5) {
        this.f5272a = i4;
        this.f5273b = a4;
        this.f5274c = i5;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f5272a);
        this.f5273b.a0(this.f5274c, bundle);
    }
}
