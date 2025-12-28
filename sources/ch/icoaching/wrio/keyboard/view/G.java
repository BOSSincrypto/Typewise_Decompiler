package ch.icoaching.wrio.keyboard.view;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.m;
import ch.icoaching.wrio.keyboard.E;
import ch.icoaching.wrio.keyboard.H;
import ch.icoaching.wrio.keyboard.model.config.Emoji;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import u2.l;

public final class G extends m {

    /* renamed from: f  reason: collision with root package name */
    private final int f10149f;

    /* renamed from: g  reason: collision with root package name */
    private final int f10150g;

    /* renamed from: h  reason: collision with root package name */
    private final int f10151h;

    /* renamed from: i  reason: collision with root package name */
    private final l f10152i;

    /* renamed from: j  reason: collision with root package name */
    private final l f10153j;

    private static final class a extends h.f {
        /* renamed from: d */
        public boolean a(Emoji emoji, Emoji emoji2) {
            o.e(emoji, "oldItem");
            o.e(emoji2, "newItem");
            return o.a(emoji, emoji2);
        }

        /* renamed from: e */
        public boolean b(Emoji emoji, Emoji emoji2) {
            o.e(emoji, "oldItem");
            o.e(emoji2, "newItem");
            return o.a(emoji, emoji2);
        }
    }

    public static final class b extends RecyclerView.D {

        /* renamed from: w  reason: collision with root package name */
        public static final a f10154w = new a((i) null);

        /* renamed from: u  reason: collision with root package name */
        private final View f10155u;

        /* renamed from: v  reason: collision with root package name */
        private final TextView f10156v;

        public static final class a {
            public /* synthetic */ a(i iVar) {
                this();
            }

            public final b a(ViewGroup viewGroup, int i4, int i5, int i6) {
                o.e(viewGroup, "parent");
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(i4, i5));
                frameLayout.setBackgroundColor(0);
                TextView textView = new TextView(viewGroup.getContext(), (AttributeSet) null, 0, H.NumbersAndCharactersStyle_CharacterStyle);
                textView.setId(E.tv_character);
                textView.setGravity(17);
                textView.setPadding(i6, i6, i6, i6);
                textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                j.g(textView, 1);
                frameLayout.addView(textView);
                return new b(frameLayout, (i) null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(View view, i iVar) {
            this(view);
        }

        /* access modifiers changed from: private */
        public static final void P(l lVar, Emoji emoji, View view) {
            lVar.invoke(emoji);
        }

        /* access modifiers changed from: private */
        public static final boolean Q(Emoji emoji, l lVar, View view) {
            if (!emoji.getHasSkinTones()) {
                return false;
            }
            lVar.invoke(emoji);
            return true;
        }

        public final void O(Emoji emoji, l lVar, l lVar2) {
            o.e(emoji, "emoji");
            o.e(lVar, "onEmojiClick");
            o.e(lVar2, "onEmojiLongClick");
            this.f10156v.setText(emoji.getIcon());
            this.f10155u.setOnClickListener(new H(lVar, emoji));
            this.f10155u.setOnLongClickListener(new I(emoji, lVar2));
        }

        private b(View view) {
            super(view);
            this.f10155u = view;
            View findViewById = view.findViewById(E.tv_character);
            o.d(findViewById, "findViewById(...)");
            this.f10156v = (TextView) findViewById;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public G(int i4, int i5, int i6, l lVar, l lVar2) {
        super(new a());
        o.e(lVar, "onEmojiClick");
        o.e(lVar2, "onEmojiLongClick");
        this.f10149f = i4;
        this.f10150g = i5;
        this.f10151h = i6;
        this.f10152i = lVar;
        this.f10153j = lVar2;
    }

    /* renamed from: E */
    public void o(b bVar, int i4) {
        o.e(bVar, "holder");
        Object A3 = A(i4);
        o.d(A3, "getItem(...)");
        bVar.O((Emoji) A3, this.f10152i, this.f10153j);
    }

    /* renamed from: F */
    public b q(ViewGroup viewGroup, int i4) {
        o.e(viewGroup, "parent");
        return b.f10154w.a(viewGroup, this.f10149f, this.f10150g, this.f10151h);
    }
}
