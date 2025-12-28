package P2;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.m;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;
import u2.C0906a;
import u2.l;

public final class u extends m {

    /* renamed from: f  reason: collision with root package name */
    public ThemeModel.SmartBarTheme f1183f;

    /* renamed from: g  reason: collision with root package name */
    private l f1184g;

    /* renamed from: h  reason: collision with root package name */
    private C0906a f1185h;

    private static final class a extends RecyclerView.D {

        /* renamed from: u  reason: collision with root package name */
        public static final C0020a f1186u = new C0020a((i) null);

        /* renamed from: P2.u$a$a  reason: collision with other inner class name */
        public static final class C0020a {
            public /* synthetic */ C0020a(i iVar) {
                this();
            }

            /* access modifiers changed from: private */
            public static final q c(C0906a aVar) {
                if (aVar != null) {
                    aVar.invoke();
                }
                return q.f14567a;
            }

            public final a b(ViewGroup viewGroup, ThemeModel.SmartBarTheme smartBarTheme, C0906a aVar) {
                o.e(viewGroup, "parent");
                o.e(smartBarTheme, "theme");
                Context context = viewGroup.getContext();
                o.d(context, "getContext(...)");
                C0349c cVar = new C0349c(context);
                cVar.setOnAddLanguageClick(new t(aVar));
                cVar.c(smartBarTheme.getUnselectedBackgroundColor(), smartBarTheme.getUnselectedFontColor());
                return new a(cVar, (i) null);
            }

            private C0020a() {
            }
        }

        public /* synthetic */ a(C0349c cVar, i iVar) {
            this(cVar);
        }

        private a(C0349c cVar) {
            super(cVar);
        }
    }

    private static final class b extends h.f {
        /* renamed from: d */
        public boolean a(F f4, F f5) {
            o.e(f4, "oldItem");
            o.e(f5, "newItem");
            return o.a(f4, f5);
        }

        /* renamed from: e */
        public boolean b(F f4, F f5) {
            o.e(f4, "oldItem");
            o.e(f5, "newItem");
            return o.a(f4, f5);
        }
    }

    private static final class c extends RecyclerView.D {

        /* renamed from: v  reason: collision with root package name */
        public static final a f1187v = new a((i) null);

        /* renamed from: u  reason: collision with root package name */
        private final s f1188u;

        public static final class a {
            public /* synthetic */ a(i iVar) {
                this();
            }

            public final c a(ViewGroup viewGroup) {
                o.e(viewGroup, "parent");
                Context context = viewGroup.getContext();
                o.d(context, "getContext(...)");
                return new c(new s(context), (i) null);
            }

            private a() {
            }
        }

        public /* synthetic */ c(s sVar, i iVar) {
            this(sVar);
        }

        /* access modifiers changed from: private */
        public static final q N(l lVar, q qVar) {
            if (lVar != null) {
                lVar.invoke(qVar.b());
            }
            return q.f14567a;
        }

        public final void O(q qVar, ThemeModel.SmartBarTheme smartBarTheme, l lVar) {
            o.e(qVar, "item");
            o.e(smartBarTheme, "theme");
            s sVar = this.f1188u;
            sVar.setLanguage(qVar.a());
            if (qVar.c()) {
                sVar.c(smartBarTheme.getSelectedBackgroundColor(), smartBarTheme.getSelectedFontColor());
            } else {
                sVar.c(smartBarTheme.getUnselectedBackgroundColor(), smartBarTheme.getUnselectedFontColor());
            }
            sVar.setOnLanguageClick(new v(lVar, qVar));
        }

        private c(s sVar) {
            super(sVar);
            this.f1188u = sVar;
        }
    }

    public u() {
        super(new b());
    }

    public final ThemeModel.SmartBarTheme E() {
        ThemeModel.SmartBarTheme smartBarTheme = this.f1183f;
        if (smartBarTheme != null) {
            return smartBarTheme;
        }
        o.p("theme");
        return null;
    }

    public final void F(ThemeModel.SmartBarTheme smartBarTheme) {
        o.e(smartBarTheme, "<set-?>");
        this.f1183f = smartBarTheme;
    }

    public final void G(C0906a aVar) {
        this.f1185h = aVar;
    }

    public final void H(l lVar) {
        this.f1184g = lVar;
    }

    public int f(int i4) {
        F f4 = (F) A(i4);
        if (f4 instanceof q) {
            return 0;
        }
        if (f4 instanceof C0347a) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown dropdown language item.");
    }

    public void o(RecyclerView.D d4, int i4) {
        o.e(d4, "holder");
        if (d4 instanceof c) {
            Object A3 = A(i4);
            o.c(A3, "null cannot be cast to non-null type ch.icoaching.wrio.dropdown.DropdownLanguageItem");
            ((c) d4).O((q) A3, E(), this.f1184g);
        } else if (!(d4 instanceof a)) {
            throw new IllegalArgumentException("Unknown item view type " + d4.f6318a);
        }
    }

    public RecyclerView.D q(ViewGroup viewGroup, int i4) {
        o.e(viewGroup, "parent");
        if (i4 == 0) {
            return c.f1187v.a(viewGroup);
        }
        if (i4 == 1) {
            return a.f1186u.b(viewGroup, E(), this.f1185h);
        }
        throw new IllegalArgumentException("Unknown dropdown language item type " + i4);
    }
}
