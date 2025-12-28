package androidx.recyclerview.widget;

import androidx.core.util.d;
import androidx.core.util.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import java.util.ArrayList;
import java.util.List;

final class a implements o.a {

    /* renamed from: a  reason: collision with root package name */
    private d f6487a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList f6488b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList f6489c;

    /* renamed from: d  reason: collision with root package name */
    final C0104a f6490d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f6491e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f6492f;

    /* renamed from: g  reason: collision with root package name */
    final o f6493g;

    /* renamed from: h  reason: collision with root package name */
    private int f6494h;

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    interface C0104a {
        void a(int i4, int i5);

        void b(b bVar);

        RecyclerView.D c(int i4);

        void d(int i4, int i5);

        void e(int i4, int i5);

        void f(int i4, int i5);

        void g(b bVar);

        void h(int i4, int i5, Object obj);
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        int f6495a;

        /* renamed from: b  reason: collision with root package name */
        int f6496b;

        /* renamed from: c  reason: collision with root package name */
        Object f6497c;

        /* renamed from: d  reason: collision with root package name */
        int f6498d;

        b(int i4, int i5, int i6, Object obj) {
            this.f6495a = i4;
            this.f6496b = i5;
            this.f6498d = i6;
            this.f6497c = obj;
        }

        /* access modifiers changed from: package-private */
        public String a() {
            int i4 = this.f6495a;
            if (i4 == 1) {
                return "add";
            }
            if (i4 == 2) {
                return "rm";
            }
            if (i4 == 4) {
                return "up";
            }
            if (i4 != 8) {
                return "??";
            }
            return "mv";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i4 = this.f6495a;
            if (i4 != bVar.f6495a) {
                return false;
            }
            if (i4 == 8 && Math.abs(this.f6498d - this.f6496b) == 1 && this.f6498d == bVar.f6496b && this.f6496b == bVar.f6498d) {
                return true;
            }
            if (this.f6498d != bVar.f6498d || this.f6496b != bVar.f6496b) {
                return false;
            }
            Object obj2 = this.f6497c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f6497c)) {
                    return false;
                }
            } else if (bVar.f6497c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f6495a * 31) + this.f6496b) * 31) + this.f6498d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f6496b + "c:" + this.f6498d + ",p:" + this.f6497c + "]";
        }
    }

    a(C0104a aVar) {
        this(aVar, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        char c4;
        boolean z3;
        boolean z4;
        int i4 = bVar.f6496b;
        int i5 = bVar.f6498d + i4;
        char c5 = 65535;
        int i6 = i4;
        int i7 = 0;
        while (i6 < i5) {
            if (this.f6490d.c(i6) != null || h(i6)) {
                if (c5 == 0) {
                    k(b(2, i4, i7, (Object) null));
                    z4 = true;
                } else {
                    z4 = false;
                }
                c4 = 1;
            } else {
                if (c5 == 1) {
                    v(b(2, i4, i7, (Object) null));
                    z3 = true;
                } else {
                    z3 = false;
                }
                c4 = 0;
            }
            if (z3) {
                i6 -= i7;
                i5 -= i7;
                i7 = 1;
            } else {
                i7++;
            }
            i6++;
            c5 = c4;
        }
        if (i7 != bVar.f6498d) {
            a(bVar);
            bVar = b(2, i4, i7, (Object) null);
        }
        if (c5 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i4 = bVar.f6496b;
        int i5 = bVar.f6498d + i4;
        int i6 = 0;
        boolean z3 = true;
        int i7 = i4;
        while (i4 < i5) {
            if (this.f6490d.c(i4) != null || h(i4)) {
                if (!z3) {
                    k(b(4, i7, i6, bVar.f6497c));
                    i7 = i4;
                    i6 = 0;
                }
                z3 = true;
            } else {
                if (z3) {
                    v(b(4, i7, i6, bVar.f6497c));
                    i7 = i4;
                    i6 = 0;
                }
                z3 = false;
            }
            i6++;
            i4++;
        }
        if (i6 != bVar.f6498d) {
            Object obj = bVar.f6497c;
            a(bVar);
            bVar = b(4, i7, i6, obj);
        }
        if (!z3) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i4) {
        int size = this.f6489c.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = (b) this.f6489c.get(i5);
            int i6 = bVar.f6495a;
            if (i6 == 8) {
                if (n(bVar.f6498d, i5 + 1) == i4) {
                    return true;
                }
            } else if (i6 == 1) {
                int i7 = bVar.f6496b;
                int i8 = bVar.f6498d + i7;
                while (i7 < i8) {
                    if (n(i7, i5 + 1) == i4) {
                        return true;
                    }
                    i7++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i4;
        int i5 = bVar.f6495a;
        if (i5 == 1 || i5 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int z3 = z(bVar.f6496b, i5);
        int i6 = bVar.f6496b;
        int i7 = bVar.f6495a;
        if (i7 == 2) {
            i4 = 0;
        } else if (i7 == 4) {
            i4 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i8 = 1;
        for (int i9 = 1; i9 < bVar.f6498d; i9++) {
            int z4 = z(bVar.f6496b + (i4 * i9), bVar.f6495a);
            int i10 = bVar.f6495a;
            if (i10 == 2 ? z4 != z3 : !(i10 == 4 && z4 == z3 + 1)) {
                b b4 = b(i10, z3, i8, bVar.f6497c);
                l(b4, i6);
                a(b4);
                if (bVar.f6495a == 4) {
                    i6 += i8;
                }
                i8 = 1;
                z3 = z4;
            } else {
                i8++;
            }
        }
        Object obj = bVar.f6497c;
        a(bVar);
        if (i8 > 0) {
            b b5 = b(bVar.f6495a, z3, i8, obj);
            l(b5, i6);
            a(b5);
        }
    }

    private void v(b bVar) {
        this.f6489c.add(bVar);
        int i4 = bVar.f6495a;
        if (i4 == 1) {
            this.f6490d.e(bVar.f6496b, bVar.f6498d);
        } else if (i4 == 2) {
            this.f6490d.d(bVar.f6496b, bVar.f6498d);
        } else if (i4 == 4) {
            this.f6490d.h(bVar.f6496b, bVar.f6498d, bVar.f6497c);
        } else if (i4 == 8) {
            this.f6490d.a(bVar.f6496b, bVar.f6498d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i4, int i5) {
        int i6;
        int i7;
        for (int size = this.f6489c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f6489c.get(size);
            int i8 = bVar.f6495a;
            if (i8 == 8) {
                int i9 = bVar.f6496b;
                int i10 = bVar.f6498d;
                if (i9 < i10) {
                    i7 = i9;
                    i6 = i10;
                } else {
                    i6 = i9;
                    i7 = i10;
                }
                if (i4 < i7 || i4 > i6) {
                    if (i4 < i9) {
                        if (i5 == 1) {
                            bVar.f6496b = i9 + 1;
                            bVar.f6498d = i10 + 1;
                        } else if (i5 == 2) {
                            bVar.f6496b = i9 - 1;
                            bVar.f6498d = i10 - 1;
                        }
                    }
                } else if (i7 == i9) {
                    if (i5 == 1) {
                        bVar.f6498d = i10 + 1;
                    } else if (i5 == 2) {
                        bVar.f6498d = i10 - 1;
                    }
                    i4++;
                } else {
                    if (i5 == 1) {
                        bVar.f6496b = i9 + 1;
                    } else if (i5 == 2) {
                        bVar.f6496b = i9 - 1;
                    }
                    i4--;
                }
            } else {
                int i11 = bVar.f6496b;
                if (i11 <= i4) {
                    if (i8 == 1) {
                        i4 -= bVar.f6498d;
                    } else if (i8 == 2) {
                        i4 += bVar.f6498d;
                    }
                } else if (i5 == 1) {
                    bVar.f6496b = i11 + 1;
                } else if (i5 == 2) {
                    bVar.f6496b = i11 - 1;
                }
            }
        }
        for (int size2 = this.f6489c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f6489c.get(size2);
            if (bVar2.f6495a == 8) {
                int i12 = bVar2.f6498d;
                if (i12 == bVar2.f6496b || i12 < 0) {
                    this.f6489c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f6498d <= 0) {
                this.f6489c.remove(size2);
                a(bVar2);
            }
        }
        return i4;
    }

    public void a(b bVar) {
        if (!this.f6492f) {
            bVar.f6497c = null;
            this.f6487a.a(bVar);
        }
    }

    public b b(int i4, int i5, int i6, Object obj) {
        b bVar = (b) this.f6487a.b();
        if (bVar == null) {
            return new b(i4, i5, i6, obj);
        }
        bVar.f6495a = i4;
        bVar.f6496b = i5;
        bVar.f6498d = i6;
        bVar.f6497c = obj;
        return bVar;
    }

    public int e(int i4) {
        int size = this.f6488b.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = (b) this.f6488b.get(i5);
            int i6 = bVar.f6495a;
            if (i6 != 1) {
                if (i6 == 2) {
                    int i7 = bVar.f6496b;
                    if (i7 <= i4) {
                        int i8 = bVar.f6498d;
                        if (i7 + i8 > i4) {
                            return -1;
                        }
                        i4 -= i8;
                    } else {
                        continue;
                    }
                } else if (i6 == 8) {
                    int i9 = bVar.f6496b;
                    if (i9 == i4) {
                        i4 = bVar.f6498d;
                    } else {
                        if (i9 < i4) {
                            i4--;
                        }
                        if (bVar.f6498d <= i4) {
                            i4++;
                        }
                    }
                }
            } else if (bVar.f6496b <= i4) {
                i4 += bVar.f6498d;
            }
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        int size = this.f6489c.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f6490d.b((b) this.f6489c.get(i4));
        }
        x(this.f6489c);
        this.f6494h = 0;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.f6488b.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = (b) this.f6488b.get(i4);
            int i5 = bVar.f6495a;
            if (i5 == 1) {
                this.f6490d.b(bVar);
                this.f6490d.e(bVar.f6496b, bVar.f6498d);
            } else if (i5 == 2) {
                this.f6490d.b(bVar);
                this.f6490d.f(bVar.f6496b, bVar.f6498d);
            } else if (i5 == 4) {
                this.f6490d.b(bVar);
                this.f6490d.h(bVar.f6496b, bVar.f6498d, bVar.f6497c);
            } else if (i5 == 8) {
                this.f6490d.b(bVar);
                this.f6490d.a(bVar.f6496b, bVar.f6498d);
            }
            Runnable runnable = this.f6491e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f6488b);
        this.f6494h = 0;
    }

    /* access modifiers changed from: package-private */
    public void l(b bVar, int i4) {
        this.f6490d.g(bVar);
        int i5 = bVar.f6495a;
        if (i5 == 2) {
            this.f6490d.f(i4, bVar.f6498d);
        } else if (i5 == 4) {
            this.f6490d.h(i4, bVar.f6498d, bVar.f6497c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    public int m(int i4) {
        return n(i4, 0);
    }

    /* access modifiers changed from: package-private */
    public int n(int i4, int i5) {
        int size = this.f6489c.size();
        while (i5 < size) {
            b bVar = (b) this.f6489c.get(i5);
            int i6 = bVar.f6495a;
            if (i6 == 8) {
                int i7 = bVar.f6496b;
                if (i7 == i4) {
                    i4 = bVar.f6498d;
                } else {
                    if (i7 < i4) {
                        i4--;
                    }
                    if (bVar.f6498d <= i4) {
                        i4++;
                    }
                }
            } else {
                int i8 = bVar.f6496b;
                if (i8 > i4) {
                    continue;
                } else if (i6 == 2) {
                    int i9 = bVar.f6498d;
                    if (i4 < i8 + i9) {
                        return -1;
                    }
                    i4 -= i9;
                } else if (i6 == 1) {
                    i4 += bVar.f6498d;
                }
            }
            i5++;
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    public boolean o(int i4) {
        if ((i4 & this.f6494h) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        if (this.f6488b.size() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        if (this.f6489c.isEmpty() || this.f6488b.isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean r(int i4, int i5, Object obj) {
        if (i5 < 1) {
            return false;
        }
        this.f6488b.add(b(4, i4, i5, obj));
        this.f6494h |= 4;
        if (this.f6488b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean s(int i4, int i5) {
        if (i5 < 1) {
            return false;
        }
        this.f6488b.add(b(1, i4, i5, (Object) null));
        this.f6494h |= 1;
        if (this.f6488b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean t(int i4, int i5, int i6) {
        if (i4 == i5) {
            return false;
        }
        if (i6 == 1) {
            this.f6488b.add(b(8, i4, i5, (Object) null));
            this.f6494h |= 8;
            if (this.f6488b.size() == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* access modifiers changed from: package-private */
    public boolean u(int i4, int i5) {
        if (i5 < 1) {
            return false;
        }
        this.f6488b.add(b(2, i4, i5, (Object) null));
        this.f6494h |= 2;
        if (this.f6488b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.f6493g.b(this.f6488b);
        int size = this.f6488b.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = (b) this.f6488b.get(i4);
            int i5 = bVar.f6495a;
            if (i5 == 1) {
                c(bVar);
            } else if (i5 == 2) {
                f(bVar);
            } else if (i5 == 4) {
                g(bVar);
            } else if (i5 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f6491e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f6488b.clear();
    }

    /* access modifiers changed from: package-private */
    public void x(List list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            a((b) list.get(i4));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    public void y() {
        x(this.f6488b);
        x(this.f6489c);
        this.f6494h = 0;
    }

    a(C0104a aVar, boolean z3) {
        this.f6487a = new e(30);
        this.f6488b = new ArrayList();
        this.f6489c = new ArrayList();
        this.f6494h = 0;
        this.f6490d = aVar;
        this.f6492f = z3;
        this.f6493g = new o(this);
    }
}
