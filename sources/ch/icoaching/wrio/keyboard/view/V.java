package ch.icoaching.wrio.keyboard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.m;
import ch.icoaching.wrio.keyboard.E;
import ch.icoaching.wrio.keyboard.H;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import o.C0836a;
import u2.l;

public final class V extends m {

    /* renamed from: f  reason: collision with root package name */
    private final int f10319f;

    /* renamed from: g  reason: collision with root package name */
    private final int f10320g;

    /* renamed from: h  reason: collision with root package name */
    private final l f10321h;

    /* renamed from: i  reason: collision with root package name */
    private int f10322i;

    private static final class a extends h.f {
        public /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2) {
            return d(((Character) obj).charValue(), ((Character) obj2).charValue());
        }

        public /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
            return e(((Character) obj).charValue(), ((Character) obj2).charValue());
        }

        public boolean d(char c4, char c5) {
            return c4 == c5;
        }

        public boolean e(char c4, char c5) {
            return c4 == c5;
        }
    }

    public static final class b extends RecyclerView.D {

        /* renamed from: w  reason: collision with root package name */
        public static final a f10323w = new a((i) null);

        /* renamed from: u  reason: collision with root package name */
        private final View f10324u;

        /* renamed from: v  reason: collision with root package name */
        private final TextView f10325v;

        public static final class a {
            public /* synthetic */ a(i iVar) {
                this();
            }

            private final int a(Context context) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16843534, typedValue, true);
                return typedValue.resourceId;
            }

            public final b b(ViewGroup viewGroup, int i4, int i5, int i6) {
                o.e(viewGroup, "parent");
                FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(i4, i5));
                frameLayout.setBackgroundColor(0);
                TextView textView = new TextView(viewGroup.getContext(), (AttributeSet) null, 0, H.NumbersAndCharactersStyle_CharacterStyle);
                textView.setId(E.tv_character);
                textView.setTextColor(i6);
                textView.setGravity(17);
                textView.setTextSize(2, 22.0f);
                Context context = textView.getContext();
                a aVar = b.f10323w;
                Context context2 = textView.getContext();
                o.d(context2, "getContext(...)");
                textView.setForeground(C0836a.b(context, aVar.a(context2)));
                textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
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
        public static final void O(b bVar, l lVar, char c4, View view) {
            bVar.f10325v.setPressed(true);
            bVar.f10325v.setPressed(false);
            if (lVar != null) {
                lVar.invoke(Character.valueOf(c4));
            }
        }

        public final void N(char c4, l lVar) {
            this.f10325v.setText(String.valueOf(c4));
            this.f10324u.setOnClickListener(new W(this, lVar, c4));
        }

        private b(View view) {
            super(view);
            this.f10324u = view;
            View findViewById = view.findViewById(E.tv_character);
            o.d(findViewById, "findViewById(...)");
            this.f10325v = (TextView) findViewById;
        }
    }

    public V(int i4, int i5, l lVar) {
        super(new a());
        this.f10319f = i4;
        this.f10320g = i5;
        this.f10321h = lVar;
    }

    public final void E(int i4) {
        this.f10322i = i4;
    }

    /* renamed from: F */
    public void o(b bVar, int i4) {
        o.e(bVar, "holder");
        Object A3 = A(i4);
        o.d(A3, "getItem(...)");
        bVar.N(((Character) A3).charValue(), this.f10321h);
    }

    /* renamed from: G */
    public b q(ViewGroup viewGroup, int i4) {
        o.e(viewGroup, "parent");
        return b.f10323w.b(viewGroup, this.f10322i, this.f10319f, this.f10320g);
    }
}
