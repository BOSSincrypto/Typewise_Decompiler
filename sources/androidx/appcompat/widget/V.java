package androidx.appcompat.widget;

class V {

    /* renamed from: a  reason: collision with root package name */
    private int f3449a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f3450b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f3451c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    private int f3452d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private int f3453e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f3454f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3455g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3456h = false;

    V() {
    }

    public int a() {
        if (this.f3455g) {
            return this.f3449a;
        }
        return this.f3450b;
    }

    public int b() {
        return this.f3449a;
    }

    public int c() {
        return this.f3450b;
    }

    public int d() {
        if (this.f3455g) {
            return this.f3450b;
        }
        return this.f3449a;
    }

    public void e(int i4, int i5) {
        this.f3456h = false;
        if (i4 != Integer.MIN_VALUE) {
            this.f3453e = i4;
            this.f3449a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f3454f = i5;
            this.f3450b = i5;
        }
    }

    public void f(boolean z3) {
        if (z3 != this.f3455g) {
            this.f3455g = z3;
            if (!this.f3456h) {
                this.f3449a = this.f3453e;
                this.f3450b = this.f3454f;
            } else if (z3) {
                int i4 = this.f3452d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f3453e;
                }
                this.f3449a = i4;
                int i5 = this.f3451c;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = this.f3454f;
                }
                this.f3450b = i5;
            } else {
                int i6 = this.f3451c;
                if (i6 == Integer.MIN_VALUE) {
                    i6 = this.f3453e;
                }
                this.f3449a = i6;
                int i7 = this.f3452d;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = this.f3454f;
                }
                this.f3450b = i7;
            }
        }
    }

    public void g(int i4, int i5) {
        this.f3451c = i4;
        this.f3452d = i5;
        this.f3456h = true;
        if (this.f3455g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f3449a = i5;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f3450b = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f3449a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f3450b = i5;
        }
    }
}
