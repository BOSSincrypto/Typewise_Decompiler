package androidx.recyclerview.widget;

import androidx.core.os.q;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class j implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    static final ThreadLocal f6649e = new ThreadLocal();

    /* renamed from: f  reason: collision with root package name */
    static Comparator f6650f = new a();

    /* renamed from: a  reason: collision with root package name */
    ArrayList f6651a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    long f6652b;

    /* renamed from: c  reason: collision with root package name */
    long f6653c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f6654d = new ArrayList();

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            boolean z3;
            boolean z4;
            RecyclerView recyclerView = cVar.f6662d;
            if (recyclerView == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (cVar2.f6662d == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 == z4) {
                boolean z5 = cVar.f6659a;
                if (z5 == cVar2.f6659a) {
                    int i4 = cVar2.f6660b - cVar.f6660b;
                    if (i4 != 0) {
                        return i4;
                    }
                    int i5 = cVar.f6661c - cVar2.f6661c;
                    if (i5 != 0) {
                        return i5;
                    }
                    return 0;
                } else if (z5) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (recyclerView == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    static class b implements RecyclerView.o.c {

        /* renamed from: a  reason: collision with root package name */
        int f6655a;

        /* renamed from: b  reason: collision with root package name */
        int f6656b;

        /* renamed from: c  reason: collision with root package name */
        int[] f6657c;

        /* renamed from: d  reason: collision with root package name */
        int f6658d;

        b() {
        }

        public void a(int i4, int i5) {
            if (i4 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i5 >= 0) {
                int i6 = this.f6658d;
                int i7 = i6 * 2;
                int[] iArr = this.f6657c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f6657c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i7 >= iArr.length) {
                    int[] iArr3 = new int[(i6 * 4)];
                    this.f6657c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f6657c;
                iArr4[i7] = i4;
                iArr4[i7 + 1] = i5;
                this.f6658d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f6657c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f6658d = 0;
        }

        /* access modifiers changed from: package-private */
        public void c(RecyclerView recyclerView, boolean z3) {
            this.f6658d = 0;
            int[] iArr = this.f6657c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.f6280n;
            if (recyclerView.f6278m != null && oVar != null && oVar.D0()) {
                if (z3) {
                    if (!recyclerView.f6262e.p()) {
                        oVar.C(recyclerView.f6278m.d(), this);
                    }
                } else if (!recyclerView.t0()) {
                    oVar.B(this.f6655a, this.f6656b, recyclerView.f6271i0, this);
                }
                int i4 = this.f6658d;
                if (i4 > oVar.f6366m) {
                    oVar.f6366m = i4;
                    oVar.f6367n = z3;
                    recyclerView.f6258c.P();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i4) {
            if (this.f6657c != null) {
                int i5 = this.f6658d * 2;
                for (int i6 = 0; i6 < i5; i6 += 2) {
                    if (this.f6657c[i6] == i4) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void e(int i4, int i5) {
            this.f6655a = i4;
            this.f6656b = i5;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6659a;

        /* renamed from: b  reason: collision with root package name */
        public int f6660b;

        /* renamed from: c  reason: collision with root package name */
        public int f6661c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f6662d;

        /* renamed from: e  reason: collision with root package name */
        public int f6663e;

        c() {
        }

        public void a() {
            this.f6659a = false;
            this.f6660b = 0;
            this.f6661c = 0;
            this.f6662d = null;
            this.f6663e = 0;
        }
    }

    j() {
    }

    private void b() {
        c cVar;
        boolean z3;
        int size = this.f6651a.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView = (RecyclerView) this.f6651a.get(i5);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f6269h0.c(recyclerView, false);
                i4 += recyclerView.f6269h0.f6658d;
            }
        }
        this.f6654d.ensureCapacity(i4);
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f6651a.get(i7);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f6269h0;
                int abs = Math.abs(bVar.f6655a) + Math.abs(bVar.f6656b);
                for (int i8 = 0; i8 < bVar.f6658d * 2; i8 += 2) {
                    if (i6 >= this.f6654d.size()) {
                        cVar = new c();
                        this.f6654d.add(cVar);
                    } else {
                        cVar = (c) this.f6654d.get(i6);
                    }
                    int[] iArr = bVar.f6657c;
                    int i9 = iArr[i8 + 1];
                    if (i9 <= abs) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.f6659a = z3;
                    cVar.f6660b = abs;
                    cVar.f6661c = i9;
                    cVar.f6662d = recyclerView2;
                    cVar.f6663e = iArr[i8];
                    i6++;
                }
            }
        }
        Collections.sort(this.f6654d, f6650f);
    }

    private void c(c cVar, long j4) {
        long j5;
        if (cVar.f6659a) {
            j5 = Long.MAX_VALUE;
        } else {
            j5 = j4;
        }
        RecyclerView.D i4 = i(cVar.f6662d, cVar.f6663e, j5);
        if (i4 != null && i4.f6319b != null && i4.s() && !i4.t()) {
            h((RecyclerView) i4.f6319b.get(), j4);
        }
    }

    private void d(long j4) {
        int i4 = 0;
        while (i4 < this.f6654d.size()) {
            c cVar = (c) this.f6654d.get(i4);
            if (cVar.f6662d != null) {
                c(cVar, j4);
                cVar.a();
                i4++;
            } else {
                return;
            }
        }
    }

    static boolean e(RecyclerView recyclerView, int i4) {
        int j4 = recyclerView.f6264f.j();
        for (int i5 = 0; i5 < j4; i5++) {
            RecyclerView.D m02 = RecyclerView.m0(recyclerView.f6264f.i(i5));
            if (m02.f6320c == i4 && !m02.t()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j4) {
        if (recyclerView != null) {
            if (recyclerView.f6235E && recyclerView.f6264f.j() != 0) {
                recyclerView.e1();
            }
            b bVar = recyclerView.f6269h0;
            bVar.c(recyclerView, true);
            if (bVar.f6658d != 0) {
                try {
                    q.a("RV Nested Prefetch");
                    recyclerView.f6271i0.f(recyclerView.f6278m);
                    for (int i4 = 0; i4 < bVar.f6658d * 2; i4 += 2) {
                        i(recyclerView, bVar.f6657c[i4], j4);
                    }
                } finally {
                    q.b();
                }
            }
        }
    }

    private RecyclerView.D i(RecyclerView recyclerView, int i4, long j4) {
        if (e(recyclerView, i4)) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.f6258c;
        try {
            recyclerView.O0();
            RecyclerView.D N3 = uVar.N(i4, false, j4);
            if (N3 != null) {
                if (!N3.s() || N3.t()) {
                    uVar.a(N3, false);
                } else {
                    uVar.G(N3.f6318a);
                }
            }
            return N3;
        } finally {
            recyclerView.Q0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        if (!RecyclerView.f6217B0 || !this.f6651a.contains(recyclerView)) {
            this.f6651a.add(recyclerView);
            return;
        }
        throw new IllegalStateException("RecyclerView already present in worker list!");
    }

    /* access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i4, int i5) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.f6217B0 && !this.f6651a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            } else if (this.f6652b == 0) {
                this.f6652b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f6269h0.e(i4, i5);
    }

    /* access modifiers changed from: package-private */
    public void g(long j4) {
        b();
        d(j4);
    }

    public void j(RecyclerView recyclerView) {
        boolean remove = this.f6651a.remove(recyclerView);
        if (RecyclerView.f6217B0 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    public void run() {
        try {
            q.a("RV Prefetch");
            if (!this.f6651a.isEmpty()) {
                int size = this.f6651a.size();
                long j4 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    RecyclerView recyclerView = (RecyclerView) this.f6651a.get(i4);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j4 = Math.max(recyclerView.getDrawingTime(), j4);
                    }
                }
                if (j4 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j4) + this.f6653c);
                    this.f6652b = 0;
                    q.b();
                }
            }
        } finally {
            this.f6652b = 0;
            q.b();
        }
    }
}
