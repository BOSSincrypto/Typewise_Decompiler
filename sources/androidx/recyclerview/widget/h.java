package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator f6588a = new a();

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return dVar.f6591a - dVar2.f6591a;
        }
    }

    public static abstract class b {
        public abstract boolean a(int i4, int i5);

        public abstract boolean b(int i4, int i5);

        public abstract Object c(int i4, int i5);

        public abstract int d();

        public abstract int e();
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f6589a;

        /* renamed from: b  reason: collision with root package name */
        private final int f6590b;

        c(int i4) {
            int[] iArr = new int[i4];
            this.f6589a = iArr;
            this.f6590b = iArr.length / 2;
        }

        /* access modifiers changed from: package-private */
        public int[] a() {
            return this.f6589a;
        }

        /* access modifiers changed from: package-private */
        public int b(int i4) {
            return this.f6589a[i4 + this.f6590b];
        }

        /* access modifiers changed from: package-private */
        public void c(int i4, int i5) {
            this.f6589a[i4 + this.f6590b] = i5;
        }
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f6591a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6592b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6593c;

        d(int i4, int i5, int i6) {
            this.f6591a = i4;
            this.f6592b = i5;
            this.f6593c = i6;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f6591a + this.f6593c;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f6592b + this.f6593c;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final List f6594a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f6595b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f6596c;

        /* renamed from: d  reason: collision with root package name */
        private final b f6597d;

        /* renamed from: e  reason: collision with root package name */
        private final int f6598e;

        /* renamed from: f  reason: collision with root package name */
        private final int f6599f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f6600g;

        e(b bVar, List list, int[] iArr, int[] iArr2, boolean z3) {
            this.f6594a = list;
            this.f6595b = iArr;
            this.f6596c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f6597d = bVar;
            this.f6598e = bVar.e();
            this.f6599f = bVar.d();
            this.f6600g = z3;
            a();
            d();
        }

        private void a() {
            d dVar;
            if (this.f6594a.isEmpty()) {
                dVar = null;
            } else {
                dVar = (d) this.f6594a.get(0);
            }
            if (!(dVar != null && dVar.f6591a == 0 && dVar.f6592b == 0)) {
                this.f6594a.add(0, new d(0, 0, 0));
            }
            this.f6594a.add(new d(this.f6598e, this.f6599f, 0));
        }

        private void c(int i4) {
            int i5;
            int size = this.f6594a.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) this.f6594a.get(i7);
                while (i6 < dVar.f6592b) {
                    if (this.f6596c[i6] != 0 || !this.f6597d.b(i4, i6)) {
                        i6++;
                    } else {
                        if (this.f6597d.a(i4, i6)) {
                            i5 = 8;
                        } else {
                            i5 = 4;
                        }
                        this.f6595b[i4] = (i6 << 4) | i5;
                        this.f6596c[i6] = (i4 << 4) | i5;
                        return;
                    }
                }
                i6 = dVar.b();
            }
        }

        private void d() {
            int i4;
            for (d dVar : this.f6594a) {
                for (int i5 = 0; i5 < dVar.f6593c; i5++) {
                    int i6 = dVar.f6591a + i5;
                    int i7 = dVar.f6592b + i5;
                    if (this.f6597d.a(i6, i7)) {
                        i4 = 1;
                    } else {
                        i4 = 2;
                    }
                    this.f6595b[i6] = (i7 << 4) | i4;
                    this.f6596c[i7] = (i6 << 4) | i4;
                }
            }
            if (this.f6600g) {
                e();
            }
        }

        private void e() {
            int i4 = 0;
            for (d dVar : this.f6594a) {
                while (i4 < dVar.f6591a) {
                    if (this.f6595b[i4] == 0) {
                        c(i4);
                    }
                    i4++;
                }
                i4 = dVar.a();
            }
        }

        private static g f(Collection collection, int i4, boolean z3) {
            g gVar;
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = (g) it.next();
                if (gVar.f6601a == i4 && gVar.f6603c == z3) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                if (z3) {
                    gVar2.f6602b--;
                } else {
                    gVar2.f6602b++;
                }
            }
            return gVar;
        }

        public void b(n nVar) {
            e eVar;
            int i4;
            if (nVar instanceof e) {
                eVar = (e) nVar;
            } else {
                eVar = new e(nVar);
            }
            int i5 = this.f6598e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i6 = this.f6598e;
            int i7 = this.f6599f;
            for (int size = this.f6594a.size() - 1; size >= 0; size--) {
                d dVar = (d) this.f6594a.get(size);
                int a4 = dVar.a();
                int b4 = dVar.b();
                while (true) {
                    if (i6 <= a4) {
                        break;
                    }
                    i6--;
                    int i8 = this.f6595b[i6];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        g f4 = f(arrayDeque, i9, false);
                        if (f4 != null) {
                            int i10 = (i5 - f4.f6602b) - 1;
                            eVar.b(i6, i10);
                            if ((i8 & 4) != 0) {
                                eVar.d(i10, 1, this.f6597d.c(i6, i9));
                            }
                        } else {
                            arrayDeque.add(new g(i6, (i5 - i6) - 1, true));
                        }
                    } else {
                        eVar.a(i6, 1);
                        i5--;
                    }
                }
                while (i7 > b4) {
                    i7--;
                    int i11 = this.f6596c[i7];
                    if ((i11 & 12) != 0) {
                        int i12 = i11 >> 4;
                        g f5 = f(arrayDeque, i12, true);
                        if (f5 == null) {
                            arrayDeque.add(new g(i7, i5 - i6, false));
                        } else {
                            eVar.b((i5 - f5.f6602b) - 1, i6);
                            if ((i11 & 4) != 0) {
                                eVar.d(i6, 1, this.f6597d.c(i12, i7));
                            }
                        }
                    } else {
                        eVar.c(i6, 1);
                        i5++;
                    }
                }
                int i13 = dVar.f6591a;
                int i14 = dVar.f6592b;
                for (i4 = 0; i4 < dVar.f6593c; i4++) {
                    if ((this.f6595b[i13] & 15) == 2) {
                        eVar.d(i13, 1, this.f6597d.c(i13, i14));
                    }
                    i13++;
                    i14++;
                }
                i6 = dVar.f6591a;
                i7 = dVar.f6592b;
            }
            eVar.e();
        }
    }

    public static abstract class f {
        public abstract boolean a(Object obj, Object obj2);

        public abstract boolean b(Object obj, Object obj2);

        public Object c(Object obj, Object obj2) {
            return null;
        }
    }

    private static class g {

        /* renamed from: a  reason: collision with root package name */
        int f6601a;

        /* renamed from: b  reason: collision with root package name */
        int f6602b;

        /* renamed from: c  reason: collision with root package name */
        boolean f6603c;

        g(int i4, int i5, boolean z3) {
            this.f6601a = i4;
            this.f6602b = i5;
            this.f6603c = z3;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$h  reason: collision with other inner class name */
    static class C0107h {

        /* renamed from: a  reason: collision with root package name */
        int f6604a;

        /* renamed from: b  reason: collision with root package name */
        int f6605b;

        /* renamed from: c  reason: collision with root package name */
        int f6606c;

        /* renamed from: d  reason: collision with root package name */
        int f6607d;

        public C0107h() {
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f6607d - this.f6606c;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f6605b - this.f6604a;
        }

        public C0107h(int i4, int i5, int i6, int i7) {
            this.f6604a = i4;
            this.f6605b = i5;
            this.f6606c = i6;
            this.f6607d = i7;
        }
    }

    static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f6608a;

        /* renamed from: b  reason: collision with root package name */
        public int f6609b;

        /* renamed from: c  reason: collision with root package name */
        public int f6610c;

        /* renamed from: d  reason: collision with root package name */
        public int f6611d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6612e;

        i() {
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return Math.min(this.f6610c - this.f6608a, this.f6611d - this.f6609b);
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            if (this.f6611d - this.f6609b != this.f6610c - this.f6608a) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            if (this.f6611d - this.f6609b > this.f6610c - this.f6608a) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public d d() {
            if (!b()) {
                int i4 = this.f6608a;
                return new d(i4, this.f6609b, this.f6610c - i4);
            } else if (this.f6612e) {
                return new d(this.f6608a, this.f6609b, a());
            } else {
                if (c()) {
                    return new d(this.f6608a, this.f6609b + 1, a());
                }
                return new d(this.f6608a + 1, this.f6609b, a());
            }
        }
    }

    private static i a(C0107h hVar, b bVar, c cVar, c cVar2, int i4) {
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        if ((hVar.b() - hVar.a()) % 2 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int b4 = hVar.b() - hVar.a();
        int i9 = -i4;
        int i10 = i9;
        while (i10 <= i4) {
            if (i10 == i9 || (i10 != i4 && cVar2.b(i10 + 1) < cVar2.b(i10 - 1))) {
                i6 = cVar2.b(i10 + 1);
                i5 = i6;
            } else {
                i6 = cVar2.b(i10 - 1);
                i5 = i6 - 1;
            }
            int i11 = hVar.f6607d - ((hVar.f6605b - i5) - i10);
            if (i4 == 0 || i5 != i6) {
                i7 = i11;
            } else {
                i7 = i11 + 1;
            }
            while (i5 > hVar.f6604a && i11 > hVar.f6606c && bVar.b(i5 - 1, i11 - 1)) {
                i5--;
                i11--;
            }
            cVar2.c(i10, i5);
            if (!z3 || (i8 = b4 - i10) < i9 || i8 > i4 || cVar.b(i8) < i5) {
                i10 += 2;
            } else {
                i iVar = new i();
                iVar.f6608a = i5;
                iVar.f6609b = i11;
                iVar.f6610c = i6;
                iVar.f6611d = i7;
                iVar.f6612e = true;
                return iVar;
            }
        }
        return null;
    }

    public static e b(b bVar) {
        return c(bVar, true);
    }

    public static e c(b bVar, boolean z3) {
        C0107h hVar;
        int e4 = bVar.e();
        int d4 = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0107h(0, e4, 0, d4));
        int i4 = ((((e4 + d4) + 1) / 2) * 2) + 1;
        c cVar = new c(i4);
        c cVar2 = new c(i4);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0107h hVar2 = (C0107h) arrayList2.remove(arrayList2.size() - 1);
            i e5 = e(hVar2, bVar, cVar, cVar2);
            if (e5 != null) {
                if (e5.a() > 0) {
                    arrayList.add(e5.d());
                }
                if (arrayList3.isEmpty()) {
                    hVar = new C0107h();
                } else {
                    hVar = (C0107h) arrayList3.remove(arrayList3.size() - 1);
                }
                hVar.f6604a = hVar2.f6604a;
                hVar.f6606c = hVar2.f6606c;
                hVar.f6605b = e5.f6608a;
                hVar.f6607d = e5.f6609b;
                arrayList2.add(hVar);
                hVar2.f6605b = hVar2.f6605b;
                hVar2.f6607d = hVar2.f6607d;
                hVar2.f6604a = e5.f6610c;
                hVar2.f6606c = e5.f6611d;
                arrayList2.add(hVar2);
            } else {
                arrayList3.add(hVar2);
            }
        }
        Collections.sort(arrayList, f6588a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z3);
    }

    private static i d(C0107h hVar, b bVar, c cVar, c cVar2, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3 = true;
        if (Math.abs(hVar.b() - hVar.a()) % 2 != 1) {
            z3 = false;
        }
        int b4 = hVar.b() - hVar.a();
        int i9 = -i4;
        int i10 = i9;
        while (i10 <= i4) {
            if (i10 == i9 || (i10 != i4 && cVar.b(i10 + 1) > cVar.b(i10 - 1))) {
                i6 = cVar.b(i10 + 1);
                i5 = i6;
            } else {
                i6 = cVar.b(i10 - 1);
                i5 = i6 + 1;
            }
            int i11 = (hVar.f6606c + (i5 - hVar.f6604a)) - i10;
            if (i4 == 0 || i5 != i6) {
                i7 = i11;
            } else {
                i7 = i11 - 1;
            }
            while (i5 < hVar.f6605b && i11 < hVar.f6607d && bVar.b(i5, i11)) {
                i5++;
                i11++;
            }
            cVar.c(i10, i5);
            if (!z3 || (i8 = b4 - i10) < i9 + 1 || i8 > i4 - 1 || cVar2.b(i8) > i5) {
                i10 += 2;
            } else {
                i iVar = new i();
                iVar.f6608a = i6;
                iVar.f6609b = i7;
                iVar.f6610c = i5;
                iVar.f6611d = i11;
                iVar.f6612e = false;
                return iVar;
            }
        }
        return null;
    }

    private static i e(C0107h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.b() >= 1 && hVar.a() >= 1) {
            int b4 = ((hVar.b() + hVar.a()) + 1) / 2;
            cVar.c(1, hVar.f6604a);
            cVar2.c(1, hVar.f6605b);
            for (int i4 = 0; i4 < b4; i4++) {
                i d4 = d(hVar, bVar, cVar, cVar2, i4);
                if (d4 != null) {
                    return d4;
                }
                i a4 = a(hVar, bVar, cVar, cVar2, i4);
                if (a4 != null) {
                    return a4;
                }
            }
        }
        return null;
    }
}
