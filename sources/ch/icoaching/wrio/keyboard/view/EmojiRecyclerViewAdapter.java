package ch.icoaching.wrio.keyboard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.m;
import ch.icoaching.wrio.keyboard.E;
import ch.icoaching.wrio.keyboard.G;
import ch.icoaching.wrio.keyboard.H;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.keyboard.model.config.Emoji;
import ch.icoaching.wrio.keyboard.view.F;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;
import u2.l;

public final class EmojiRecyclerViewAdapter extends m {

    /* renamed from: f  reason: collision with root package name */
    private final int f10126f;

    /* renamed from: g  reason: collision with root package name */
    private final int f10127g;

    /* renamed from: h  reason: collision with root package name */
    private final int f10128h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10129i;

    /* renamed from: j  reason: collision with root package name */
    private final int f10130j;

    /* renamed from: k  reason: collision with root package name */
    private final ThemeModel.SpecialOverlaysTheme f10131k;

    /* renamed from: l  reason: collision with root package name */
    private final l f10132l;

    /* renamed from: m  reason: collision with root package name */
    private final l f10133m;

    /* renamed from: n  reason: collision with root package name */
    private final l f10134n;

    /* renamed from: o  reason: collision with root package name */
    private final l f10135o;

    /* renamed from: p  reason: collision with root package name */
    private final RecyclerView.t f10136p = new RecyclerView.t();

    private static final class EmojiViewHolder extends RecyclerView.D {

        /* renamed from: A  reason: collision with root package name */
        public static final Companion f10137A = new Companion((i) null);

        /* renamed from: u  reason: collision with root package name */
        private final int f10138u;

        /* renamed from: v  reason: collision with root package name */
        private final int f10139v;

        /* renamed from: w  reason: collision with root package name */
        private final int f10140w;

        /* renamed from: x  reason: collision with root package name */
        private final l f10141x;

        /* renamed from: y  reason: collision with root package name */
        private final l f10142y;

        /* renamed from: z  reason: collision with root package name */
        private final RecyclerView f10143z;

        public static final class Companion {
            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final EmojiViewHolder a(ViewGroup viewGroup, int i4, int i5, int i6, RecyclerView.t tVar, l lVar, l lVar2) {
                RecyclerView.t tVar2 = tVar;
                ViewGroup viewGroup2 = viewGroup;
                o.e(viewGroup, "parent");
                o.e(tVar, "recycledViewPool");
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                frameLayout.setBackgroundColor(0);
                RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
                recyclerView.setId(E.list);
                recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                recyclerView.setLayoutManager(new EmojiRecyclerViewAdapter$EmojiViewHolder$Companion$from$recyclerView$1$1(viewGroup.getContext()));
                recyclerView.setRecycledViewPool(tVar);
                frameLayout.addView(recyclerView);
                return new EmojiViewHolder(frameLayout, i4, i5, i6, lVar, lVar2, (i) null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ EmojiViewHolder(View view, int i4, int i5, int i6, l lVar, l lVar2, i iVar) {
            this(view, i4, i5, i6, lVar, lVar2);
        }

        /* access modifiers changed from: private */
        public static final q O(EmojiViewHolder emojiViewHolder, Emoji emoji) {
            o.e(emoji, "it");
            l lVar = emojiViewHolder.f10141x;
            if (lVar != null) {
                lVar.invoke(emoji);
            }
            return q.f14567a;
        }

        /* access modifiers changed from: private */
        public static final q Q(EmojiViewHolder emojiViewHolder, Emoji emoji) {
            o.e(emoji, "it");
            l lVar = emojiViewHolder.f10142y;
            if (lVar != null) {
                lVar.invoke(emoji);
            }
            return q.f14567a;
        }

        public final void P(F.a aVar) {
            o.e(aVar, "emojis");
            RecyclerView recyclerView = this.f10143z;
            G g4 = new G(this.f10138u, this.f10139v, this.f10140w, new C0538m(this), new C0539n(this));
            g4.C(aVar.a());
            recyclerView.setAdapter(g4);
        }

        private EmojiViewHolder(View view, int i4, int i5, int i6, l lVar, l lVar2) {
            super(view);
            this.f10138u = i4;
            this.f10139v = i5;
            this.f10140w = i6;
            this.f10141x = lVar;
            this.f10142y = lVar2;
            View findViewById = view.findViewById(E.list);
            o.d(findViewById, "findViewById(...)");
            this.f10143z = (RecyclerView) findViewById;
        }
    }

    private static final class a extends h.f {
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

    private static final class b extends RecyclerView.D {

        /* renamed from: w  reason: collision with root package name */
        public static final a f10144w = new a((i) null);

        /* renamed from: u  reason: collision with root package name */
        private final TextView f10145u;

        /* renamed from: v  reason: collision with root package name */
        private String f10146v;

        public static final class a {
            public /* synthetic */ a(i iVar) {
                this();
            }

            public final b a(ViewGroup viewGroup, ThemeModel.SpecialOverlaysTheme specialOverlaysTheme, int i4, int i5) {
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
                textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                frameLayout.addView(textView);
                return new b(frameLayout, (i) null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(View view, i iVar) {
            this(view);
        }

        private final String N(Context context, String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -2104556212:
                        if (str.equals("smileys_people")) {
                            String string = context.getString(G.keyboard_emoji_smileys_people);
                            o.d(string, "getString(...)");
                            return string;
                        }
                        break;
                    case -1164565767:
                        if (str.equals("most_used")) {
                            String string2 = context.getString(G.keyboard_emoji_mostused);
                            o.d(string2, "getString(...)");
                            return string2;
                        }
                        break;
                    case -937462801:
                        if (str.equals("animals_nature")) {
                            String string3 = context.getString(G.keyboard_emoji_animals_nature);
                            o.d(string3, "getString(...)");
                            return string3;
                        }
                        break;
                    case -78395017:
                        if (str.equals("food_drink")) {
                            String string4 = context.getString(G.keyboard_emoji_food_drink);
                            o.d(string4, "getString(...)");
                            return string4;
                        }
                        break;
                    case 1031558576:
                        if (str.equals("objects_symbols")) {
                            String string5 = context.getString(G.keyboard_emoji_objects_symbols);
                            o.d(string5, "getString(...)");
                            return string5;
                        }
                        break;
                    case 1034515729:
                        if (str.equals("travel_places")) {
                            String string6 = context.getString(G.keyboard_emoji_travel_places);
                            o.d(string6, "getString(...)");
                            return string6;
                        }
                        break;
                    case 2048605165:
                        if (str.equals("activities")) {
                            String string7 = context.getString(G.keyboard_emoji_activities);
                            o.d(string7, "getString(...)");
                            return string7;
                        }
                        break;
                }
            }
            return "";
        }

        public final String M() {
            String str = this.f10146v;
            if (str != null) {
                return str;
            }
            o.p("titleResourceName");
            return null;
        }

        public final void O(F.b bVar) {
            o.e(bVar, "titleData");
            TextView textView = this.f10145u;
            Context context = textView.getContext();
            o.d(context, "getContext(...)");
            textView.setText(N(context, bVar.a()));
            this.f10146v = bVar.a();
        }

        private b(View view) {
            super(view);
            View findViewById = view.findViewById(E.title_view);
            o.d(findViewById, "findViewById(...)");
            this.f10145u = (TextView) findViewById;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiRecyclerViewAdapter(int i4, int i5, int i6, int i7, int i8, ThemeModel.SpecialOverlaysTheme specialOverlaysTheme, l lVar, l lVar2, l lVar3, l lVar4) {
        super(new a());
        o.e(specialOverlaysTheme, "specialOverlayTheme");
        o.e(lVar, "onEmojiClick");
        o.e(lVar2, "onEmojiLongClick");
        o.e(lVar3, "onTitleShown");
        o.e(lVar4, "onTitleHidden");
        this.f10126f = i4;
        this.f10127g = i5;
        this.f10128h = i6;
        this.f10129i = i7;
        this.f10130j = i8;
        this.f10131k = specialOverlaysTheme;
        this.f10132l = lVar;
        this.f10133m = lVar2;
        this.f10134n = lVar3;
        this.f10135o = lVar4;
    }

    public int f(int i4) {
        F f4 = (F) A(i4);
        if (f4 instanceof F.b) {
            return 0;
        }
        if (f4 instanceof F.a) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public void o(RecyclerView.D d4, int i4) {
        o.e(d4, "holder");
        if (d4 instanceof b) {
            Object A3 = A(i4);
            o.c(A3, "null cannot be cast to non-null type ch.icoaching.wrio.keyboard.view.EmojiData.TitleData");
            ((b) d4).O((F.b) A3);
        } else if (d4 instanceof EmojiViewHolder) {
            Object A4 = A(i4);
            o.c(A4, "null cannot be cast to non-null type ch.icoaching.wrio.keyboard.view.EmojiData.Emojis");
            ((EmojiViewHolder) d4).P((F.a) A4);
        }
    }

    public RecyclerView.D q(ViewGroup viewGroup, int i4) {
        o.e(viewGroup, "parent");
        if (i4 == 0) {
            return b.f10144w.a(viewGroup, this.f10131k, this.f10129i, this.f10130j);
        }
        if (i4 == 1) {
            return EmojiViewHolder.f10137A.a(viewGroup, this.f10126f, this.f10127g, this.f10128h, this.f10136p, this.f10132l, this.f10133m);
        }
        throw new IllegalArgumentException("Unknown viewType " + i4);
    }

    public void t(RecyclerView.D d4) {
        o.e(d4, "holder");
        if (d4.l() == 0 && (d4 instanceof b)) {
            this.f10134n.invoke(((b) d4).M());
        }
    }

    public void u(RecyclerView.D d4) {
        o.e(d4, "holder");
        if (d4.l() == 0 && (d4 instanceof b)) {
            this.f10135o.invoke(((b) d4).M());
        }
    }
}
