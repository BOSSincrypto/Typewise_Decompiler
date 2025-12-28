package androidx.recyclerview.widget;

import androidx.core.util.d;
import androidx.core.util.e;
import androidx.recyclerview.widget.RecyclerView;
import y.C0942d;
import y.g;

class w {

    /* renamed from: a  reason: collision with root package name */
    final g f6708a = new g();

    /* renamed from: b  reason: collision with root package name */
    final C0942d f6709b = new C0942d();

    static class a {

        /* renamed from: d  reason: collision with root package name */
        static d f6710d = new e(20);

        /* renamed from: a  reason: collision with root package name */
        int f6711a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.l.b f6712b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.l.b f6713c;

        private a() {
        }

        static void a() {
            do {
            } while (f6710d.b() != null);
        }

        static a b() {
            a aVar = (a) f6710d.b();
            if (aVar == null) {
                return new a();
            }
            return aVar;
        }

        static void c(a aVar) {
            aVar.f6711a = 0;
            aVar.f6712b = null;
            aVar.f6713c = null;
            f6710d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.D d4);

        void b(RecyclerView.D d4, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void c(RecyclerView.D d4, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void d(RecyclerView.D d4, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);
    }

    w() {
    }

    private RecyclerView.l.b l(RecyclerView.D d4, int i4) {
        a aVar;
        RecyclerView.l.b bVar;
        int g4 = this.f6708a.g(d4);
        if (g4 >= 0 && (aVar = (a) this.f6708a.n(g4)) != null) {
            int i5 = aVar.f6711a;
            if ((i5 & i4) != 0) {
                int i6 = (~i4) & i5;
                aVar.f6711a = i6;
                if (i4 == 4) {
                    bVar = aVar.f6712b;
                } else if (i4 == 8) {
                    bVar = aVar.f6713c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i6 & 12) == 0) {
                    this.f6708a.l(g4);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.D d4, RecyclerView.l.b bVar) {
        a aVar = (a) this.f6708a.get(d4);
        if (aVar == null) {
            aVar = a.b();
            this.f6708a.put(d4, aVar);
        }
        aVar.f6711a |= 2;
        aVar.f6712b = bVar;
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.D d4) {
        a aVar = (a) this.f6708a.get(d4);
        if (aVar == null) {
            aVar = a.b();
            this.f6708a.put(d4, aVar);
        }
        aVar.f6711a |= 1;
    }

    /* access modifiers changed from: package-private */
    public void c(long j4, RecyclerView.D d4) {
        this.f6709b.n(j4, d4);
    }

    /* access modifiers changed from: package-private */
    public void d(RecyclerView.D d4, RecyclerView.l.b bVar) {
        a aVar = (a) this.f6708a.get(d4);
        if (aVar == null) {
            aVar = a.b();
            this.f6708a.put(d4, aVar);
        }
        aVar.f6713c = bVar;
        aVar.f6711a |= 8;
    }

    /* access modifiers changed from: package-private */
    public void e(RecyclerView.D d4, RecyclerView.l.b bVar) {
        a aVar = (a) this.f6708a.get(d4);
        if (aVar == null) {
            aVar = a.b();
            this.f6708a.put(d4, aVar);
        }
        aVar.f6712b = bVar;
        aVar.f6711a |= 4;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f6708a.clear();
        this.f6709b.c();
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.D g(long j4) {
        return (RecyclerView.D) this.f6709b.i(j4);
    }

    /* access modifiers changed from: package-private */
    public boolean h(RecyclerView.D d4) {
        a aVar = (a) this.f6708a.get(d4);
        if (aVar == null || (aVar.f6711a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean i(RecyclerView.D d4) {
        a aVar = (a) this.f6708a.get(d4);
        if (aVar == null || (aVar.f6711a & 4) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        a.a();
    }

    public void k(RecyclerView.D d4) {
        p(d4);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.l.b m(RecyclerView.D d4) {
        return l(d4, 8);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.l.b n(RecyclerView.D d4) {
        return l(d4, 4);
    }

    /* access modifiers changed from: package-private */
    public void o(b bVar) {
        for (int size = this.f6708a.size() - 1; size >= 0; size--) {
            RecyclerView.D d4 = (RecyclerView.D) this.f6708a.j(size);
            a aVar = (a) this.f6708a.l(size);
            int i4 = aVar.f6711a;
            if ((i4 & 3) == 3) {
                bVar.a(d4);
            } else if ((i4 & 1) != 0) {
                RecyclerView.l.b bVar2 = aVar.f6712b;
                if (bVar2 == null) {
                    bVar.a(d4);
                } else {
                    bVar.c(d4, bVar2, aVar.f6713c);
                }
            } else if ((i4 & 14) == 14) {
                bVar.b(d4, aVar.f6712b, aVar.f6713c);
            } else if ((i4 & 12) == 12) {
                bVar.d(d4, aVar.f6712b, aVar.f6713c);
            } else if ((i4 & 4) != 0) {
                bVar.c(d4, aVar.f6712b, (RecyclerView.l.b) null);
            } else if ((i4 & 8) != 0) {
                bVar.b(d4, aVar.f6712b, aVar.f6713c);
            }
            a.c(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void p(RecyclerView.D d4) {
        a aVar = (a) this.f6708a.get(d4);
        if (aVar != null) {
            aVar.f6711a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public void q(RecyclerView.D d4) {
        int q4 = this.f6709b.q() - 1;
        while (true) {
            if (q4 < 0) {
                break;
            } else if (d4 == this.f6709b.r(q4)) {
                this.f6709b.p(q4);
                break;
            } else {
                q4--;
            }
        }
        a aVar = (a) this.f6708a.remove(d4);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
