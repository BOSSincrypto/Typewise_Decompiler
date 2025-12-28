package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.W;
import androidx.core.view.X;
import androidx.core.view.Y;
import java.util.ArrayList;
import java.util.Iterator;

public class h {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList f2799a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private long f2800b = -1;

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f2801c;

    /* renamed from: d  reason: collision with root package name */
    X f2802d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2803e;

    /* renamed from: f  reason: collision with root package name */
    private final Y f2804f = new a();

    class a extends Y {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2805a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f2806b = 0;

        a() {
        }

        public void b(View view) {
            int i4 = this.f2806b + 1;
            this.f2806b = i4;
            if (i4 == h.this.f2799a.size()) {
                X x3 = h.this.f2802d;
                if (x3 != null) {
                    x3.b((View) null);
                }
                d();
            }
        }

        public void c(View view) {
            if (!this.f2805a) {
                this.f2805a = true;
                X x3 = h.this.f2802d;
                if (x3 != null) {
                    x3.c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f2806b = 0;
            this.f2805a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f2803e) {
            Iterator it = this.f2799a.iterator();
            while (it.hasNext()) {
                ((W) it.next()).c();
            }
            this.f2803e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f2803e = false;
    }

    public h c(W w3) {
        if (!this.f2803e) {
            this.f2799a.add(w3);
        }
        return this;
    }

    public h d(W w3, W w4) {
        this.f2799a.add(w3);
        w4.j(w3.d());
        this.f2799a.add(w4);
        return this;
    }

    public h e(long j4) {
        if (!this.f2803e) {
            this.f2800b = j4;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f2803e) {
            this.f2801c = interpolator;
        }
        return this;
    }

    public h g(X x3) {
        if (!this.f2803e) {
            this.f2802d = x3;
        }
        return this;
    }

    public void h() {
        if (!this.f2803e) {
            Iterator it = this.f2799a.iterator();
            while (it.hasNext()) {
                W w3 = (W) it.next();
                long j4 = this.f2800b;
                if (j4 >= 0) {
                    w3.f(j4);
                }
                Interpolator interpolator = this.f2801c;
                if (interpolator != null) {
                    w3.g(interpolator);
                }
                if (this.f2802d != null) {
                    w3.h(this.f2804f);
                }
                w3.l();
            }
            this.f2803e = true;
        }
    }
}
