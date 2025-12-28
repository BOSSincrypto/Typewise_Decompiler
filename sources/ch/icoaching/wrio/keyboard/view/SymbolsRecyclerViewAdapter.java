package ch.icoaching.wrio.keyboard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.m;
import ch.icoaching.wrio.SafeFlexboxLayoutManager;
import ch.icoaching.wrio.keyboard.E;
import ch.icoaching.wrio.keyboard.G;
import ch.icoaching.wrio.keyboard.H;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.keyboard.view.U;
import ch.icoaching.wrio.logging.Log;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;
import u2.l;

public final class SymbolsRecyclerViewAdapter extends m {

    /* renamed from: f  reason: collision with root package name */
    private final int f10290f;

    /* renamed from: g  reason: collision with root package name */
    private final int f10291g;

    /* renamed from: h  reason: collision with root package name */
    private final int f10292h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10293i;

    /* renamed from: j  reason: collision with root package name */
    private final int f10294j;

    /* renamed from: k  reason: collision with root package name */
    private final int f10295k;

    /* renamed from: l  reason: collision with root package name */
    private final int f10296l;

    /* renamed from: m  reason: collision with root package name */
    private final int f10297m;

    /* renamed from: n  reason: collision with root package name */
    private final ThemeModel.SpecialOverlaysTheme f10298n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f10299o;

    /* renamed from: p  reason: collision with root package name */
    private final List f10300p;

    /* renamed from: q  reason: collision with root package name */
    private final l f10301q;

    /* renamed from: r  reason: collision with root package name */
    private final V f10302r;

    /* renamed from: s  reason: collision with root package name */
    private final RecyclerView.t f10303s = new RecyclerView.t();

    private static final class SymbolsViewHolder extends RecyclerView.D {

        /* renamed from: y  reason: collision with root package name */
        public static final Companion f10304y = new Companion((i) null);

        /* renamed from: u  reason: collision with root package name */
        private final int f10305u;

        /* renamed from: v  reason: collision with root package name */
        private final int f10306v;

        /* renamed from: w  reason: collision with root package name */
        private final l f10307w;

        /* renamed from: x  reason: collision with root package name */
        private final RecyclerView f10308x;

        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final SymbolsViewHolder a(ViewGroup viewGroup, int i4, int i5, int i6, RecyclerView.t tVar, l lVar) {
                o.e(viewGroup, "parent");
                o.e(tVar, "recycledViewPool");
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                frameLayout.setBackgroundColor(0);
                RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
                recyclerView.setId(E.list);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(i6, 0, i6, 0);
                recyclerView.setLayoutParams(layoutParams);
                recyclerView.setLayoutManager(new SymbolsRecyclerViewAdapter$SymbolsViewHolder$Companion$from$recyclerView$1$2(viewGroup.getContext()));
                recyclerView.setRecycledViewPool(tVar);
                frameLayout.addView(recyclerView);
                return new SymbolsViewHolder(frameLayout, i4, i5, lVar, (i) null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ SymbolsViewHolder(View view, int i4, int i5, l lVar, i iVar) {
            this(view, i4, i5, lVar);
        }

        /* access modifiers changed from: private */
        public static final q N(SymbolsViewHolder symbolsViewHolder, char c4) {
            l lVar = symbolsViewHolder.f10307w;
            if (lVar != null) {
                lVar.invoke(Character.valueOf(c4));
            }
            return q.f14567a;
        }

        public final void O(U.d dVar, int i4) {
            o.e(dVar, "model");
            RecyclerView recyclerView = this.f10308x;
            V v3 = new V(this.f10306v, i4, new C(this));
            v3.E(this.f10305u);
            v3.C(dVar.a());
            recyclerView.setAdapter(v3);
        }

        public final void P(V v3) {
            o.e(v3, "adapter");
            this.f10308x.setAdapter(v3);
        }

        private SymbolsViewHolder(View view, int i4, int i5, l lVar) {
            super(view);
            this.f10305u = i4;
            this.f10306v = i5;
            this.f10307w = lVar;
            View findViewById = view.findViewById(E.list);
            o.d(findViewById, "findViewById(...)");
            this.f10308x = (RecyclerView) findViewById;
        }
    }

    private static final class a extends h.f {
        /* renamed from: d */
        public boolean a(U u3, U u4) {
            o.e(u3, "oldItem");
            o.e(u4, "newItem");
            return o.a(u3, u4);
        }

        /* renamed from: e */
        public boolean b(U u3, U u4) {
            o.e(u3, "oldItem");
            o.e(u4, "newItem");
            return o.a(u3, u4);
        }
    }

    private static final class b extends RecyclerView.D {

        /* renamed from: v  reason: collision with root package name */
        public static final a f10309v = new a((i) null);

        /* renamed from: u  reason: collision with root package name */
        private final RecyclerView f10310u;

        public static final class a {
            public /* synthetic */ a(i iVar) {
                this();
            }

            public final b a(ViewGroup viewGroup, int i4, int i5, int i6, int i7, int i8, int i9, RecyclerView.t tVar, ThemeModel.SpecialOverlaysTheme specialOverlaysTheme, boolean z3, l lVar) {
                int i10;
                int i11;
                int i12 = i4;
                int i13 = i9;
                RecyclerView.t tVar2 = tVar;
                o.e(viewGroup, "parent");
                o.e(tVar2, "recycledViewPool");
                o.e(specialOverlaysTheme, "specialOverlayTheme");
                ConstraintLayout constraintLayout = new ConstraintLayout(viewGroup.getContext());
                constraintLayout.setId(View.generateViewId());
                ConstraintLayout.b bVar = new ConstraintLayout.b(-1, -2);
                bVar.setMargins(0, i6, 0, i7);
                constraintLayout.setLayoutParams(bVar);
                constraintLayout.setBackgroundColor(0);
                Context context = viewGroup.getContext();
                o.d(context, "getContext(...)");
                SafeFlexboxLayoutManager safeFlexboxLayoutManager = new SafeFlexboxLayoutManager(context);
                safeFlexboxLayoutManager.Q2(1);
                safeFlexboxLayoutManager.R2(2);
                RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
                int i14 = E.flex_box;
                recyclerView.setId(i14);
                recyclerView.setLayoutParams(new ConstraintLayout.b(i12 * 3, -2));
                recyclerView.setBackgroundColor(0);
                recyclerView.setRecycledViewPool(tVar2);
                recyclerView.setLayoutManager(safeFlexboxLayoutManager);
                V v3 = new V(i5, specialOverlaysTheme.getCharacterFontColor(), lVar);
                v3.E(i12);
                recyclerView.setAdapter(v3);
                v3.C(C0718m.m('1', '2', '3', '4', '5', '6', '7', '8', '9', ',', '0', '.'));
                RecyclerView recyclerView2 = new RecyclerView(viewGroup.getContext());
                int i15 = E.list;
                recyclerView2.setId(i15);
                recyclerView2.setLayoutParams(new ConstraintLayout.b(i12 * i13, -2));
                recyclerView2.setBackgroundColor(0);
                recyclerView2.setRecycledViewPool(tVar2);
                recyclerView2.setLayoutManager(new GridLayoutManager(viewGroup.getContext(), i13));
                if (z3) {
                    constraintLayout.addView(recyclerView);
                    constraintLayout.addView(recyclerView2);
                    i11 = i15;
                    i10 = i14;
                } else {
                    constraintLayout.addView(recyclerView2);
                    constraintLayout.addView(recyclerView);
                    i10 = i15;
                    i11 = i14;
                }
                androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                cVar.f(constraintLayout);
                cVar.h(i10, 6, constraintLayout.getId(), 6, i8);
                cVar.h(i11, 7, constraintLayout.getId(), 7, i8);
                cVar.c(constraintLayout);
                return new b(constraintLayout, (i) null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(View view, i iVar) {
            this(view);
        }

        public final void M(V v3) {
            o.e(v3, "quickAccessSymbolsAdapter");
            this.f10310u.setAdapter(v3);
        }

        private b(View view) {
            super(view);
            View findViewById = view.findViewById(E.list);
            o.d(findViewById, "findViewById(...)");
            this.f10310u = (RecyclerView) findViewById;
        }
    }

    private static final class c extends RecyclerView.D {

        /* renamed from: v  reason: collision with root package name */
        public static final a f10311v = new a((i) null);

        /* renamed from: u  reason: collision with root package name */
        private final TextView f10312u;

        public static final class a {
            public /* synthetic */ a(i iVar) {
                this();
            }

            public final c a(ViewGroup viewGroup, int i4, ThemeModel.SpecialOverlaysTheme specialOverlaysTheme) {
                o.e(viewGroup, "parent");
                o.e(specialOverlaysTheme, "specialOverlayTheme");
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                frameLayout.setBackgroundColor(0);
                TextView textView = new TextView(viewGroup.getContext(), (AttributeSet) null, 0, H.NumbersAndCharactersStyle_TitleStyle);
                textView.setId(E.title_view);
                textView.setTextColor(specialOverlaysTheme.getTitleFontColor());
                textView.setTextSize(2, 16.0f);
                textView.setGravity(17);
                textView.setLayoutParams(new FrameLayout.LayoutParams(-1, i4));
                frameLayout.addView(textView);
                return new c(frameLayout, (i) null);
            }

            private a() {
            }
        }

        public /* synthetic */ c(View view, i iVar) {
            this(view);
        }

        private final String M(Context context, String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -2014872366) {
                    if (hashCode != -1089470353) {
                        if (hashCode != 3344136) {
                            if (hashCode == 1540136437 && str.equals("punctuations_symbols")) {
                                String string = context.getString(G.keyboard_numbers_specialcharacters_punctuations_symbols);
                                o.d(string, "getString(...)");
                                return string;
                            }
                        } else if (str.equals("math")) {
                            String string2 = context.getString(G.keyboard_numbers_specialcharacters_math);
                            o.d(string2, "getString(...)");
                            return string2;
                        }
                    } else if (str.equals("currencies")) {
                        String string3 = context.getString(G.keyboard_numbers_specialcharacters_currencies);
                        o.d(string3, "getString(...)");
                        return string3;
                    }
                } else if (str.equals("subscript_superscript")) {
                    String string4 = context.getString(G.keyboard_numbers_specialcharacters_subscript_superscript);
                    o.d(string4, "getString(...)");
                    return string4;
                }
            }
            return "";
        }

        public final void N(U.e eVar) {
            o.e(eVar, "model");
            TextView textView = this.f10312u;
            Context context = textView.getContext();
            o.d(context, "getContext(...)");
            textView.setText(M(context, eVar.a()));
        }

        private c(View view) {
            super(view);
            View findViewById = view.findViewById(E.title_view);
            o.d(findViewById, "findViewById(...)");
            this.f10312u = (TextView) findViewById;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SymbolsRecyclerViewAdapter(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, ThemeModel.SpecialOverlaysTheme specialOverlaysTheme, boolean z3, List list, l lVar) {
        super(new a());
        o.e(specialOverlaysTheme, "specialOverlayTheme");
        o.e(list, "numbers");
        this.f10290f = i4;
        this.f10291g = i5;
        this.f10292h = i6;
        this.f10293i = i7;
        this.f10294j = i8;
        this.f10295k = i9;
        this.f10296l = i10;
        this.f10297m = i11;
        this.f10298n = specialOverlaysTheme;
        this.f10299o = z3;
        this.f10300p = list;
        this.f10301q = lVar;
        V v3 = new V(i6, specialOverlaysTheme.getCharacterFontColor(), lVar);
        v3.E(i4);
        this.f10302r = v3;
    }

    public final void E(List list) {
        o.e(list, "quickAccessSymbolsList");
        this.f10302r.C(list);
    }

    public int f(int i4) {
        U u3 = (U) A(i4);
        if (u3 instanceof U.e) {
            return 0;
        }
        if (u3 instanceof U.d) {
            return 1;
        }
        if (u3 instanceof U.a) {
            return 2;
        }
        if (u3 instanceof U.c) {
            return 3;
        }
        if (u3 instanceof U.b) {
            return 4;
        }
        throw new NoWhenBranchMatchedException();
    }

    public void o(RecyclerView.D d4, int i4) {
        o.e(d4, "holder");
        Log log = Log.f10572a;
        Log.d(log, "SymbolsLayoutNew", "holder is " + d4 + " and position is " + i4, (Throwable) null, 4, (Object) null);
        if (d4 instanceof c) {
            Object A3 = A(i4);
            o.c(A3, "null cannot be cast to non-null type ch.icoaching.wrio.keyboard.view.SymbolData.TitleData");
            ((c) d4).N((U.e) A3);
        } else if (d4 instanceof SymbolsViewHolder) {
            if (i4 == 0) {
                ((SymbolsViewHolder) d4).O(new U.d(this.f10300p), this.f10298n.getCharacterFontColor());
            } else if (i4 != 1) {
                Object A4 = A(i4);
                o.c(A4, "null cannot be cast to non-null type ch.icoaching.wrio.keyboard.view.SymbolData.Symbols");
                ((SymbolsViewHolder) d4).O((U.d) A4, this.f10298n.getCharacterFontColor());
            } else {
                this.f10302r.E(this.f10291g);
                ((SymbolsViewHolder) d4).P(this.f10302r);
            }
        } else if (d4 instanceof b) {
            ((b) d4).M(this.f10302r);
        }
    }

    public RecyclerView.D q(ViewGroup viewGroup, int i4) {
        o.e(viewGroup, "parent");
        if (i4 == 0) {
            return c.f10311v.a(viewGroup, this.f10293i, this.f10298n);
        }
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            return SymbolsViewHolder.f10304y.a(viewGroup, this.f10291g, this.f10292h, this.f10296l, this.f10303s, this.f10301q);
        } else if (i4 == 4) {
            return b.f10309v.a(viewGroup, this.f10290f, this.f10292h, this.f10294j, this.f10295k, this.f10296l, this.f10297m, this.f10303s, this.f10298n, this.f10299o, this.f10301q);
        } else {
            throw new IllegalArgumentException("Unknown viewType " + i4);
        }
    }
}
