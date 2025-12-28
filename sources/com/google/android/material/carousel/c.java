package com.google.android.material.carousel;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

abstract class c {

    /* renamed from: a  reason: collision with root package name */
    final int f11778a;

    class a extends c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f11779b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i4, CarouselLayoutManager carouselLayoutManager) {
            super(i4, (a) null);
            this.f11779b = carouselLayoutManager;
        }

        public float d(RecyclerView.p pVar) {
            return (float) (pVar.topMargin + pVar.bottomMargin);
        }

        /* access modifiers changed from: package-private */
        public int e() {
            return this.f11779b.j0();
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return e();
        }

        /* access modifiers changed from: package-private */
        public int g() {
            return this.f11779b.getPaddingLeft();
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return this.f11779b.x0() - this.f11779b.getPaddingRight();
        }

        /* access modifiers changed from: package-private */
        public int i() {
            return j();
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return 0;
        }

        public void k(View view, int i4, int i5) {
            this.f11779b.J0(view, g(), i4, h(), i5);
        }

        public void l(View view, Rect rect, float f4, float f5) {
            view.offsetTopAndBottom((int) (f5 - (((float) rect.top) + f4)));
        }
    }

    class b extends c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CarouselLayoutManager f11780b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i4, CarouselLayoutManager carouselLayoutManager) {
            super(i4, (a) null);
            this.f11780b = carouselLayoutManager;
        }

        public float d(RecyclerView.p pVar) {
            return (float) (pVar.rightMargin + pVar.leftMargin);
        }

        /* access modifiers changed from: package-private */
        public int e() {
            return this.f11780b.j0() - this.f11780b.getPaddingBottom();
        }

        /* access modifiers changed from: package-private */
        public int f() {
            if (this.f11780b.B2()) {
                return g();
            }
            return h();
        }

        /* access modifiers changed from: package-private */
        public int g() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return this.f11780b.x0();
        }

        /* access modifiers changed from: package-private */
        public int i() {
            if (this.f11780b.B2()) {
                return h();
            }
            return g();
        }

        /* access modifiers changed from: package-private */
        public int j() {
            return this.f11780b.getPaddingTop();
        }

        public void k(View view, int i4, int i5) {
            this.f11780b.J0(view, i4, j(), i5, e());
        }

        public void l(View view, Rect rect, float f4, float f5) {
            view.offsetLeftAndRight((int) (f5 - (((float) rect.left) + f4)));
        }
    }

    /* synthetic */ c(int i4, a aVar) {
        this(i4);
    }

    private static c a(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    static c b(CarouselLayoutManager carouselLayoutManager, int i4) {
        if (i4 == 0) {
            return a(carouselLayoutManager);
        }
        if (i4 == 1) {
            return c(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static c c(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    /* access modifiers changed from: package-private */
    public abstract float d(RecyclerView.p pVar);

    /* access modifiers changed from: package-private */
    public abstract int e();

    /* access modifiers changed from: package-private */
    public abstract int f();

    /* access modifiers changed from: package-private */
    public abstract int g();

    /* access modifiers changed from: package-private */
    public abstract int h();

    /* access modifiers changed from: package-private */
    public abstract int i();

    /* access modifiers changed from: package-private */
    public abstract int j();

    /* access modifiers changed from: package-private */
    public abstract void k(View view, int i4, int i5);

    /* access modifiers changed from: package-private */
    public abstract void l(View view, Rect rect, float f4, float f5);

    private c(int i4) {
        this.f11778a = i4;
    }
}
