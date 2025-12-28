package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

class f {

    /* renamed from: a  reason: collision with root package name */
    final b f6530a;

    /* renamed from: b  reason: collision with root package name */
    final a f6531b;

    /* renamed from: c  reason: collision with root package name */
    final List f6532c;

    /* renamed from: d  reason: collision with root package name */
    private int f6533d = 0;

    /* renamed from: e  reason: collision with root package name */
    private View f6534e;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        long f6535a = 0;

        /* renamed from: b  reason: collision with root package name */
        a f6536b;

        a() {
        }

        private void c() {
            if (this.f6536b == null) {
                this.f6536b = new a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i4) {
            if (i4 >= 64) {
                a aVar = this.f6536b;
                if (aVar != null) {
                    aVar.a(i4 - 64);
                    return;
                }
                return;
            }
            this.f6535a &= ~(1 << i4);
        }

        /* access modifiers changed from: package-private */
        public int b(int i4) {
            a aVar = this.f6536b;
            if (aVar == null) {
                if (i4 >= 64) {
                    return Long.bitCount(this.f6535a);
                }
                return Long.bitCount(this.f6535a & ((1 << i4) - 1));
            } else if (i4 < 64) {
                return Long.bitCount(this.f6535a & ((1 << i4) - 1));
            } else {
                return aVar.b(i4 - 64) + Long.bitCount(this.f6535a);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i4) {
            if (i4 >= 64) {
                c();
                return this.f6536b.d(i4 - 64);
            } else if ((this.f6535a & (1 << i4)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        public void e(int i4, boolean z3) {
            boolean z4;
            if (i4 >= 64) {
                c();
                this.f6536b.e(i4 - 64, z3);
                return;
            }
            long j4 = this.f6535a;
            if ((Long.MIN_VALUE & j4) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            long j5 = (1 << i4) - 1;
            this.f6535a = ((j4 & (~j5)) << 1) | (j4 & j5);
            if (z3) {
                h(i4);
            } else {
                a(i4);
            }
            if (z4 || this.f6536b != null) {
                c();
                this.f6536b.e(0, z4);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean f(int i4) {
            boolean z3;
            if (i4 >= 64) {
                c();
                return this.f6536b.f(i4 - 64);
            }
            long j4 = 1 << i4;
            long j5 = this.f6535a;
            if ((j5 & j4) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            long j6 = j5 & (~j4);
            this.f6535a = j6;
            long j7 = j4 - 1;
            this.f6535a = (j6 & j7) | Long.rotateRight((~j7) & j6, 1);
            a aVar = this.f6536b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f6536b.f(0);
            }
            return z3;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            this.f6535a = 0;
            a aVar = this.f6536b;
            if (aVar != null) {
                aVar.g();
            }
        }

        /* access modifiers changed from: package-private */
        public void h(int i4) {
            if (i4 >= 64) {
                c();
                this.f6536b.h(i4 - 64);
                return;
            }
            this.f6535a |= 1 << i4;
        }

        public String toString() {
            if (this.f6536b == null) {
                return Long.toBinaryString(this.f6535a);
            }
            return this.f6536b.toString() + "xx" + Long.toBinaryString(this.f6535a);
        }
    }

    interface b {
        View a(int i4);

        void b(View view);

        RecyclerView.D c(View view);

        void d(int i4);

        void e(View view);

        void f(View view, int i4);

        int g();

        void h(int i4);

        void i();

        void j(View view, int i4, ViewGroup.LayoutParams layoutParams);

        int k(View view);
    }

    f(b bVar) {
        this.f6530a = bVar;
        this.f6531b = new a();
        this.f6532c = new ArrayList();
    }

    private int h(int i4) {
        if (i4 < 0) {
            return -1;
        }
        int g4 = this.f6530a.g();
        int i5 = i4;
        while (i5 < g4) {
            int b4 = i4 - (i5 - this.f6531b.b(i5));
            if (b4 == 0) {
                while (this.f6531b.d(i5)) {
                    i5++;
                }
                return i5;
            }
            i5 += b4;
        }
        return -1;
    }

    private void l(View view) {
        this.f6532c.add(view);
        this.f6530a.b(view);
    }

    private boolean t(View view) {
        if (!this.f6532c.remove(view)) {
            return false;
        }
        this.f6530a.e(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i4, boolean z3) {
        int i5;
        if (i4 < 0) {
            i5 = this.f6530a.g();
        } else {
            i5 = h(i4);
        }
        this.f6531b.e(i5, z3);
        if (z3) {
            l(view);
        }
        this.f6530a.f(view, i5);
    }

    /* access modifiers changed from: package-private */
    public void b(View view, boolean z3) {
        a(view, -1, z3);
    }

    /* access modifiers changed from: package-private */
    public void c(View view, int i4, ViewGroup.LayoutParams layoutParams, boolean z3) {
        int i5;
        if (i4 < 0) {
            i5 = this.f6530a.g();
        } else {
            i5 = h(i4);
        }
        this.f6531b.e(i5, z3);
        if (z3) {
            l(view);
        }
        this.f6530a.j(view, i5, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void d(int i4) {
        int h4 = h(i4);
        this.f6531b.f(h4);
        this.f6530a.d(h4);
    }

    /* access modifiers changed from: package-private */
    public View e(int i4) {
        int size = this.f6532c.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f6532c.get(i5);
            RecyclerView.D c4 = this.f6530a.c(view);
            if (c4.m() == i4 && !c4.t() && !c4.v()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View f(int i4) {
        return this.f6530a.a(h(i4));
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f6530a.g() - this.f6532c.size();
    }

    /* access modifiers changed from: package-private */
    public View i(int i4) {
        return this.f6530a.a(i4);
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f6530a.g();
    }

    /* access modifiers changed from: package-private */
    public void k(View view) {
        int k4 = this.f6530a.k(view);
        if (k4 >= 0) {
            this.f6531b.h(k4);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    public int m(View view) {
        int k4 = this.f6530a.k(view);
        if (k4 != -1 && !this.f6531b.d(k4)) {
            return k4 - this.f6531b.b(k4);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean n(View view) {
        return this.f6532c.contains(view);
    }

    /* access modifiers changed from: package-private */
    public void o() {
        this.f6531b.g();
        for (int size = this.f6532c.size() - 1; size >= 0; size--) {
            this.f6530a.e((View) this.f6532c.get(size));
            this.f6532c.remove(size);
        }
        this.f6530a.i();
    }

    /* access modifiers changed from: package-private */
    public void p(View view) {
        int i4 = this.f6533d;
        if (i4 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        } else if (i4 != 2) {
            try {
                this.f6533d = 1;
                this.f6534e = view;
                int k4 = this.f6530a.k(view);
                if (k4 < 0) {
                    this.f6533d = 0;
                    this.f6534e = null;
                    return;
                }
                if (this.f6531b.f(k4)) {
                    t(view);
                }
                this.f6530a.h(k4);
                this.f6533d = 0;
                this.f6534e = null;
            } catch (Throwable th) {
                this.f6533d = 0;
                this.f6534e = null;
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i4) {
        int i5 = this.f6533d;
        if (i5 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        } else if (i5 != 2) {
            try {
                int h4 = h(i4);
                View a4 = this.f6530a.a(h4);
                if (a4 == null) {
                    this.f6533d = 0;
                    this.f6534e = null;
                    return;
                }
                this.f6533d = 1;
                this.f6534e = a4;
                if (this.f6531b.f(h4)) {
                    t(a4);
                }
                this.f6530a.h(h4);
                this.f6533d = 0;
                this.f6534e = null;
            } catch (Throwable th) {
                this.f6533d = 0;
                this.f6534e = null;
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public boolean r(View view) {
        int i4 = this.f6533d;
        if (i4 == 1) {
            if (this.f6534e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        } else if (i4 != 2) {
            try {
                this.f6533d = 2;
                int k4 = this.f6530a.k(view);
                if (k4 == -1) {
                    t(view);
                    this.f6533d = 0;
                    return true;
                } else if (this.f6531b.d(k4)) {
                    this.f6531b.f(k4);
                    t(view);
                    this.f6530a.h(k4);
                    this.f6533d = 0;
                    return true;
                } else {
                    this.f6533d = 0;
                    return false;
                }
            } catch (Throwable th) {
                this.f6533d = 0;
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
    }

    /* access modifiers changed from: package-private */
    public void s(View view) {
        int k4 = this.f6530a.k(view);
        if (k4 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f6531b.d(k4)) {
            this.f6531b.a(k4);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f6531b.toString() + ", hidden list:" + this.f6532c.size();
    }
}
