package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import y.g;

public final class M0 {

    /* renamed from: a  reason: collision with root package name */
    private final e f5170a;

    private static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        protected final Window f5171a;

        /* renamed from: b  reason: collision with root package name */
        private final H f5172b;

        a(Window window, H h4) {
            this.f5171a = window;
            this.f5172b = h4;
        }

        private void f(int i4) {
            if (i4 == 1) {
                g(4);
            } else if (i4 == 2) {
                g(2);
            } else if (i4 == 8) {
                this.f5172b.a();
            }
        }

        private void i(int i4) {
            if (i4 == 1) {
                j(4);
                k(1024);
            } else if (i4 == 2) {
                j(2);
            } else if (i4 == 8) {
                this.f5172b.b();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i4) {
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    f(i5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e(int i4) {
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    i(i5);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void g(int i4) {
            View decorView = this.f5171a.getDecorView();
            decorView.setSystemUiVisibility(i4 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void h(int i4) {
            this.f5171a.addFlags(i4);
        }

        /* access modifiers changed from: protected */
        public void j(int i4) {
            View decorView = this.f5171a.getDecorView();
            decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void k(int i4) {
            this.f5171a.clearFlags(i4);
        }
    }

    private static class b extends a {
        b(Window window, H h4) {
            super(window, h4);
        }

        public boolean b() {
            if ((this.f5171a.getDecorView().getSystemUiVisibility() & 8192) != 0) {
                return true;
            }
            return false;
        }

        public void d(boolean z3) {
            if (z3) {
                k(67108864);
                h(Integer.MIN_VALUE);
                g(8192);
                return;
            }
            j(8192);
        }
    }

    private static class c extends b {
        c(Window window, H h4) {
            super(window, h4);
        }

        public void c(boolean z3) {
            if (z3) {
                k(134217728);
                h(Integer.MIN_VALUE);
                g(16);
                return;
            }
            j(16);
        }
    }

    private static class e {
        e() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a(int i4);

        public abstract boolean b();

        public void c(boolean z3) {
        }

        public abstract void d(boolean z3);

        /* access modifiers changed from: package-private */
        public abstract void e(int i4);
    }

    private M0(WindowInsetsController windowInsetsController) {
        this.f5170a = new d(windowInsetsController, this, new H(windowInsetsController));
    }

    public static M0 f(WindowInsetsController windowInsetsController) {
        return new M0(windowInsetsController);
    }

    public void a(int i4) {
        this.f5170a.a(i4);
    }

    public boolean b() {
        return this.f5170a.b();
    }

    public void c(boolean z3) {
        this.f5170a.c(z3);
    }

    public void d(boolean z3) {
        this.f5170a.d(z3);
    }

    public void e(int i4) {
        this.f5170a.e(i4);
    }

    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final M0 f5173a;

        /* renamed from: b  reason: collision with root package name */
        final WindowInsetsController f5174b;

        /* renamed from: c  reason: collision with root package name */
        final H f5175c;

        /* renamed from: d  reason: collision with root package name */
        private final g f5176d;

        /* renamed from: e  reason: collision with root package name */
        protected Window f5177e;

        d(Window window, M0 m02, H h4) {
            this(window.getInsetsController(), m02, h4);
            this.f5177e = window;
        }

        /* access modifiers changed from: package-private */
        public void a(int i4) {
            if ((i4 & 8) != 0) {
                this.f5175c.a();
            }
            this.f5174b.hide(i4 & -9);
        }

        public boolean b() {
            if ((this.f5174b.getSystemBarsAppearance() & 8) != 0) {
                return true;
            }
            return false;
        }

        public void c(boolean z3) {
            if (z3) {
                if (this.f5177e != null) {
                    f(16);
                }
                this.f5174b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f5177e != null) {
                g(16);
            }
            this.f5174b.setSystemBarsAppearance(0, 16);
        }

        public void d(boolean z3) {
            if (z3) {
                if (this.f5177e != null) {
                    f(8192);
                }
                this.f5174b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f5177e != null) {
                g(8192);
            }
            this.f5174b.setSystemBarsAppearance(0, 8);
        }

        /* access modifiers changed from: package-private */
        public void e(int i4) {
            if ((i4 & 8) != 0) {
                this.f5175c.b();
            }
            this.f5174b.show(i4 & -9);
        }

        /* access modifiers changed from: protected */
        public void f(int i4) {
            View decorView = this.f5177e.getDecorView();
            decorView.setSystemUiVisibility(i4 | decorView.getSystemUiVisibility());
        }

        /* access modifiers changed from: protected */
        public void g(int i4) {
            View decorView = this.f5177e.getDecorView();
            decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, M0 m02, H h4) {
            this.f5176d = new g();
            this.f5174b = windowInsetsController;
            this.f5173a = m02;
            this.f5175c = h4;
        }
    }

    public M0(Window window, View view) {
        H h4 = new H(view);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            this.f5170a = new d(window, this, h4);
        } else if (i4 >= 26) {
            this.f5170a = new c(window, h4);
        } else {
            this.f5170a = new b(window, h4);
        }
    }
}
