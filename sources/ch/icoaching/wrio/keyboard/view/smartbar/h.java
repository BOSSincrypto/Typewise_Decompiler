package ch.icoaching.wrio.keyboard.view.smartbar;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.m;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import u2.l;

public final class h extends m {

    /* renamed from: f  reason: collision with root package name */
    private ThemeModel.SmartBarTheme f10522f;

    /* renamed from: g  reason: collision with root package name */
    private l f10523g;

    /* renamed from: h  reason: collision with root package name */
    private l f10524h;

    /* renamed from: i  reason: collision with root package name */
    private l f10525i;

    /* renamed from: j  reason: collision with root package name */
    private l f10526j;

    /* renamed from: k  reason: collision with root package name */
    private l f10527k;

    private static final class a extends RecyclerView.D {

        /* renamed from: v  reason: collision with root package name */
        public static final C0157a f10528v = new C0157a((i) null);

        /* renamed from: u  reason: collision with root package name */
        private final a f10529u;

        /* renamed from: ch.icoaching.wrio.keyboard.view.smartbar.h$a$a  reason: collision with other inner class name */
        public static final class C0157a {
            public /* synthetic */ C0157a(i iVar) {
                this();
            }

            public final a a(ViewGroup viewGroup, ThemeModel.SmartBarTheme smartBarTheme, l lVar, l lVar2, l lVar3) {
                o.e(viewGroup, "parent");
                Context context = viewGroup.getContext();
                o.d(context, "getContext(...)");
                a aVar = new a(context);
                aVar.setTheme(smartBarTheme);
                aVar.d(lVar, lVar2, lVar3);
                return new a(aVar, (i) null);
            }

            private C0157a() {
            }
        }

        public /* synthetic */ a(a aVar, i iVar) {
            this(aVar);
        }

        public final void M(b bVar) {
            o.e(bVar, "correctionData");
            this.f10529u.setDrawable(bVar.d());
            this.f10529u.setCorrectionData(bVar);
        }

        private a(a aVar) {
            super(aVar);
            this.f10529u = aVar;
        }
    }

    private static final class b extends h.f {
        /* renamed from: d */
        public boolean a(g gVar, g gVar2) {
            o.e(gVar, "oldItem");
            o.e(gVar2, "newItem");
            return gVar.a(gVar2);
        }

        /* renamed from: e */
        public boolean b(g gVar, g gVar2) {
            o.e(gVar, "oldItem");
            o.e(gVar2, "newItem");
            return gVar.b(gVar2);
        }
    }

    private static final class c extends RecyclerView.D {

        /* renamed from: v  reason: collision with root package name */
        public static final a f10530v = new a((i) null);

        /* renamed from: u  reason: collision with root package name */
        private final d f10531u;

        public static final class a {
            public /* synthetic */ a(i iVar) {
                this();
            }

            public final c a(ViewGroup viewGroup, ThemeModel.SmartBarTheme smartBarTheme, l lVar, l lVar2, l lVar3, l lVar4) {
                o.e(viewGroup, "parent");
                Context context = viewGroup.getContext();
                o.d(context, "getContext(...)");
                d dVar = new d(context);
                dVar.setTheme(smartBarTheme);
                dVar.D(lVar, lVar2, lVar3, lVar4);
                return new c(dVar, (i) null);
            }

            private a() {
            }
        }

        public /* synthetic */ c(d dVar, i iVar) {
            this(dVar);
        }

        public final void M(e eVar, int i4, int i5) {
            o.e(eVar, "predictionData");
            this.f10531u.setPredictionData(eVar);
            d dVar = this.f10531u;
            boolean z3 = true;
            if (i4 == i5 - 1) {
                z3 = false;
            }
            dVar.setDividerVisibility(z3);
        }

        private c(d dVar) {
            super(dVar);
            this.f10531u = dVar;
        }
    }

    public h() {
        super(new b());
    }

    public final void E(l lVar) {
        this.f10523g = lVar;
    }

    public final void F(l lVar) {
        this.f10527k = lVar;
    }

    public final void G(l lVar) {
        this.f10524h = lVar;
    }

    public final void H(l lVar) {
        this.f10526j = lVar;
    }

    public final void I(l lVar) {
        this.f10525i = lVar;
    }

    public final void J(ThemeModel.SmartBarTheme smartBarTheme) {
        this.f10522f = smartBarTheme;
    }

    public int f(int i4) {
        g gVar = (g) A(i4);
        if (gVar instanceof e) {
            return 0;
        }
        if (gVar instanceof b) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown smart bar item.");
    }

    public void o(RecyclerView.D d4, int i4) {
        o.e(d4, "holder");
        if (d4 instanceof c) {
            Object A3 = A(i4);
            o.c(A3, "null cannot be cast to non-null type ch.icoaching.wrio.keyboard.view.smartbar.PredictionSmartBarItem");
            ((c) d4).M((e) A3, i4, d());
        } else if (d4 instanceof a) {
            Object A4 = A(i4);
            o.c(A4, "null cannot be cast to non-null type ch.icoaching.wrio.keyboard.view.smartbar.CorrectionSmartBarItem");
            ((a) d4).M((b) A4);
        } else {
            throw new IllegalArgumentException("Unknown item view type " + d4.f6318a);
        }
    }

    public RecyclerView.D q(ViewGroup viewGroup, int i4) {
        o.e(viewGroup, "parent");
        if (i4 == 0) {
            return c.f10530v.a(viewGroup, this.f10522f, this.f10523g, this.f10524h, this.f10525i, this.f10526j);
        } else if (i4 == 1) {
            return a.f10528v.a(viewGroup, this.f10522f, this.f10523g, this.f10524h, this.f10527k);
        } else {
            throw new IllegalArgumentException("Unknown smart bar item type " + i4);
        }
    }
}
