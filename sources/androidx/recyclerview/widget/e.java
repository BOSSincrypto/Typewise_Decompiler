package androidx.recyclerview.widget;

public class e implements n {

    /* renamed from: a  reason: collision with root package name */
    final n f6525a;

    /* renamed from: b  reason: collision with root package name */
    int f6526b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f6527c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f6528d = -1;

    /* renamed from: e  reason: collision with root package name */
    Object f6529e = null;

    public e(n nVar) {
        this.f6525a = nVar;
    }

    public void a(int i4, int i5) {
        int i6;
        if (this.f6526b != 2 || (i6 = this.f6527c) < i4 || i6 > i4 + i5) {
            e();
            this.f6527c = i4;
            this.f6528d = i5;
            this.f6526b = 2;
            return;
        }
        this.f6528d += i5;
        this.f6527c = i4;
    }

    public void b(int i4, int i5) {
        e();
        this.f6525a.b(i4, i5);
    }

    public void c(int i4, int i5) {
        int i6;
        if (this.f6526b == 1 && i4 >= (i6 = this.f6527c)) {
            int i7 = this.f6528d;
            if (i4 <= i6 + i7) {
                this.f6528d = i7 + i5;
                this.f6527c = Math.min(i4, i6);
                return;
            }
        }
        e();
        this.f6527c = i4;
        this.f6528d = i5;
        this.f6526b = 1;
    }

    public void d(int i4, int i5, Object obj) {
        int i6;
        if (this.f6526b == 3) {
            int i7 = this.f6527c;
            int i8 = this.f6528d;
            if (i4 <= i7 + i8 && (i6 = i4 + i5) >= i7 && this.f6529e == obj) {
                this.f6527c = Math.min(i4, i7);
                this.f6528d = Math.max(i8 + i7, i6) - this.f6527c;
                return;
            }
        }
        e();
        this.f6527c = i4;
        this.f6528d = i5;
        this.f6529e = obj;
        this.f6526b = 3;
    }

    public void e() {
        int i4 = this.f6526b;
        if (i4 != 0) {
            if (i4 == 1) {
                this.f6525a.c(this.f6527c, this.f6528d);
            } else if (i4 == 2) {
                this.f6525a.a(this.f6527c, this.f6528d);
            } else if (i4 == 3) {
                this.f6525a.d(this.f6527c, this.f6528d, this.f6529e);
            }
            this.f6529e = null;
            this.f6526b = 0;
        }
    }
}
