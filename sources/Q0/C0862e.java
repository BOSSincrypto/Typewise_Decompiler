package q0;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.m;
import ch.icoaching.wrio.A;
import ch.icoaching.wrio.B;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import l2.q;
import q0.C0859b;
import u2.C0906a;
import u2.l;

/* renamed from: q0.e  reason: case insensitive filesystem */
public final class C0862e extends m {

    /* renamed from: f  reason: collision with root package name */
    private final l f15930f;

    /* renamed from: g  reason: collision with root package name */
    private ThemeModel.AIAssistantTheme.AIAssistantDropDownTheme f15931g;

    /* renamed from: q0.e$a */
    private static final class a extends h.f {
        /* renamed from: d */
        public boolean a(C0859b bVar, C0859b bVar2) {
            o.e(bVar, "oldItem");
            o.e(bVar2, "newItem");
            return o.a(bVar, bVar2);
        }

        /* renamed from: e */
        public boolean b(C0859b bVar, C0859b bVar2) {
            o.e(bVar, "oldItem");
            o.e(bVar2, "newItem");
            return o.a(bVar, bVar2);
        }
    }

    /* renamed from: q0.e$b */
    public static final class b extends RecyclerView.D {

        /* renamed from: u  reason: collision with root package name */
        private final View f15932u;

        /* renamed from: v  reason: collision with root package name */
        private final ConstraintLayout f15933v;

        /* renamed from: w  reason: collision with root package name */
        private final TextView f15934w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            o.e(view, "view");
            this.f15932u = view;
            View findViewById = view.findViewById(A.cl_option);
            o.d(findViewById, "findViewById(...)");
            this.f15933v = (ConstraintLayout) findViewById;
            View findViewById2 = view.findViewById(A.tv_option);
            o.d(findViewById2, "findViewById(...)");
            this.f15934w = (TextView) findViewById2;
        }

        /* access modifiers changed from: private */
        public static final void O(C0906a aVar, View view) {
            aVar.invoke();
        }

        public final void N(C0859b.a aVar, ThemeModel.AIAssistantTheme.AIAssistantDropDownTheme aIAssistantDropDownTheme, C0906a aVar2) {
            o.e(aVar, "optionData");
            o.e(aVar2, "onOptionSelected");
            this.f15934w.setText(aVar.a());
            this.f15932u.setOnClickListener(new C0863f(aVar2));
            if (aIAssistantDropDownTheme != null) {
                this.f15934w.setTextColor(aIAssistantDropDownTheme.getOptionFontColor());
                this.f15933v.setBackgroundTintList(ColorStateList.valueOf(aIAssistantDropDownTheme.getOptionBackgroundColor()));
            }
        }
    }

    /* renamed from: q0.e$c */
    public static final class c extends RecyclerView.D {

        /* renamed from: u  reason: collision with root package name */
        private final View f15935u;

        /* renamed from: v  reason: collision with root package name */
        private final ConstraintLayout f15936v;

        /* renamed from: w  reason: collision with root package name */
        private final TextView f15937w;

        /* renamed from: x  reason: collision with root package name */
        private final ImageView f15938x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            o.e(view, "view");
            this.f15935u = view;
            View findViewById = view.findViewById(A.cl_option);
            o.d(findViewById, "findViewById(...)");
            this.f15936v = (ConstraintLayout) findViewById;
            View findViewById2 = view.findViewById(A.tv_option);
            o.d(findViewById2, "findViewById(...)");
            this.f15937w = (TextView) findViewById2;
            View findViewById3 = view.findViewById(A.iv_icon);
            o.d(findViewById3, "findViewById(...)");
            this.f15938x = (ImageView) findViewById3;
        }

        /* access modifiers changed from: private */
        public static final void O(C0906a aVar, View view) {
            aVar.invoke();
        }

        public final void N(C0859b.C0224b bVar, ThemeModel.AIAssistantTheme.AIAssistantDropDownTheme aIAssistantDropDownTheme, C0906a aVar) {
            o.e(bVar, "optionData");
            o.e(aVar, "onOptionSelected");
            this.f15938x.setImageResource(bVar.a());
            this.f15937w.setText(bVar.b());
            this.f15935u.setOnClickListener(new g(aVar));
            if (aIAssistantDropDownTheme != null) {
                this.f15937w.setTextColor(aIAssistantDropDownTheme.getOptionFontColor());
                this.f15938x.setImageTintList(ColorStateList.valueOf(aIAssistantDropDownTheme.getOptionFontColor()));
                this.f15936v.setBackgroundTintList(ColorStateList.valueOf(aIAssistantDropDownTheme.getOptionBackgroundColor()));
            }
        }
    }

    /* renamed from: q0.e$d */
    public static final class d extends RecyclerView.D {

        /* renamed from: u  reason: collision with root package name */
        private final TextView f15939u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(view);
            o.e(view, "view");
            View findViewById = view.findViewById(A.tv_title);
            o.d(findViewById, "findViewById(...)");
            this.f15939u = (TextView) findViewById;
        }

        public final void M(C0859b.c cVar, ThemeModel.AIAssistantTheme.AIAssistantDropDownTheme aIAssistantDropDownTheme) {
            o.e(cVar, "titleData");
            this.f15939u.setText(cVar.a());
            if (aIAssistantDropDownTheme != null) {
                this.f15939u.setTextColor(aIAssistantDropDownTheme.getFontColor());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0862e(l lVar) {
        super(new a());
        o.e(lVar, "onOptionClicked");
        this.f15930f = lVar;
    }

    /* access modifiers changed from: private */
    public static final q G(RecyclerView.D d4, C0862e eVar) {
        C0859b.a aVar;
        b bVar = (b) d4;
        if (bVar.j() != -1) {
            Object A3 = eVar.A(bVar.j());
            String str = null;
            if (A3 instanceof C0859b.a) {
                aVar = (C0859b.a) A3;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                str = aVar.b();
            }
            if (str != null) {
                eVar.f15930f.invoke(str);
            }
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q I(RecyclerView.D d4, C0862e eVar) {
        C0859b.C0224b bVar;
        c cVar = (c) d4;
        if (cVar.j() != -1) {
            Object A3 = eVar.A(cVar.j());
            String str = null;
            if (A3 instanceof C0859b.C0224b) {
                bVar = (C0859b.C0224b) A3;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                str = bVar.c();
            }
            if (str != null) {
                eVar.f15930f.invoke(str);
            }
        }
        return q.f14567a;
    }

    public final void H(ThemeModel.AIAssistantTheme.AIAssistantDropDownTheme aIAssistantDropDownTheme) {
        o.e(aIAssistantDropDownTheme, "theme");
        this.f15931g = aIAssistantDropDownTheme;
    }

    public int f(int i4) {
        C0859b bVar = (C0859b) A(i4);
        if (bVar instanceof C0859b.c) {
            return 0;
        }
        if (bVar instanceof C0859b.a) {
            return 1;
        }
        if (bVar instanceof C0859b.C0224b) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public void o(RecyclerView.D d4, int i4) {
        o.e(d4, "holder");
        if (d4 instanceof d) {
            Object A3 = A(i4);
            o.c(A3, "null cannot be cast to non-null type ch.icoaching.wrio.ai_assistant.ui.prompt_options.GptOptionData.TitleData");
            ((d) d4).M((C0859b.c) A3, this.f15931g);
        } else if (d4 instanceof b) {
            Object A4 = A(i4);
            o.c(A4, "null cannot be cast to non-null type ch.icoaching.wrio.ai_assistant.ui.prompt_options.GptOptionData.OptionData");
            ((b) d4).N((C0859b.a) A4, this.f15931g, new C0860c(d4, this));
        } else if (d4 instanceof c) {
            Object A5 = A(i4);
            o.c(A5, "null cannot be cast to non-null type ch.icoaching.wrio.ai_assistant.ui.prompt_options.GptOptionData.OptionWithIconData");
            ((c) d4).N((C0859b.C0224b) A5, this.f15931g, new C0861d(d4, this));
        }
    }

    public RecyclerView.D q(ViewGroup viewGroup, int i4) {
        o.e(viewGroup, "parent");
        if (i4 == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(B.ai_assistant_title_item, viewGroup, false);
            o.d(inflate, "inflate(...)");
            return new d(inflate);
        } else if (i4 == 1) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(B.ai_assistant_option_item, viewGroup, false);
            o.d(inflate2, "inflate(...)");
            return new b(inflate2);
        } else if (i4 == 2) {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(B.ai_assistant_option_with_icon_item, viewGroup, false);
            o.d(inflate3, "inflate(...)");
            return new c(inflate3);
        } else {
            throw new IllegalArgumentException("Unknown view type " + i4);
        }
    }
}
