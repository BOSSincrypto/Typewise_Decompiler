package androidx.recyclerview.widget;

import android.view.View;

class v {

    /* renamed from: a  reason: collision with root package name */
    final b f6701a;

    /* renamed from: b  reason: collision with root package name */
    a f6702b = new a();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f6703a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f6704b;

        /* renamed from: c  reason: collision with root package name */
        int f6705c;

        /* renamed from: d  reason: collision with root package name */
        int f6706d;

        /* renamed from: e  reason: collision with root package name */
        int f6707e;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i4) {
            this.f6703a = i4 | this.f6703a;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            int i4 = this.f6703a;
            if ((i4 & 7) != 0 && (i4 & c(this.f6706d, this.f6704b)) == 0) {
                return false;
            }
            int i5 = this.f6703a;
            if ((i5 & 112) != 0 && (i5 & (c(this.f6706d, this.f6705c) << 4)) == 0) {
                return false;
            }
            int i6 = this.f6703a;
            if ((i6 & 1792) != 0 && (i6 & (c(this.f6707e, this.f6704b) << 8)) == 0) {
                return false;
            }
            int i7 = this.f6703a;
            if ((i7 & 28672) == 0 || (i7 & (c(this.f6707e, this.f6705c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public int c(int i4, int i5) {
            if (i4 > i5) {
                return 1;
            }
            return i4 == i5 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f6703a = 0;
        }

        /* access modifiers changed from: package-private */
        public void e(int i4, int i5, int i6, int i7) {
            this.f6704b = i4;
            this.f6705c = i5;
            this.f6706d = i6;
            this.f6707e = i7;
        }
    }

    interface b {
        View a(int i4);

        int b();

        int c(View view);

        int d();

        int e(View view);
    }

    v(b bVar) {
        this.f6701a = bVar;
    }

    /* access modifiers changed from: package-private */
    public View a(int i4, int i5, int i6, int i7) {
        int i8;
        int d4 = this.f6701a.d();
        int b4 = this.f6701a.b();
        if (i5 > i4) {
            i8 = 1;
        } else {
            i8 = -1;
        }
        View view = null;
        while (i4 != i5) {
            View a4 = this.f6701a.a(i4);
            this.f6702b.e(d4, b4, this.f6701a.c(a4), this.f6701a.e(a4));
            if (i6 != 0) {
                this.f6702b.d();
                this.f6702b.a(i6);
                if (this.f6702b.b()) {
                    return a4;
                }
            }
            if (i7 != 0) {
                this.f6702b.d();
                this.f6702b.a(i7);
                if (this.f6702b.b()) {
                    view = a4;
                }
            }
            i4 += i8;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view, int i4) {
        this.f6702b.e(this.f6701a.d(), this.f6701a.b(), this.f6701a.c(view), this.f6701a.e(view));
        if (i4 == 0) {
            return false;
        }
        this.f6702b.d();
        this.f6702b.a(i4);
        return this.f6702b.b();
    }
}
