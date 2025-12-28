package p0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.m;
import ch.icoaching.wrio.ai_assistant.ui.PromptItemType;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import kotlin.jvm.internal.o;
import l2.q;
import u2.l;

public final class i extends m {

    /* renamed from: f  reason: collision with root package name */
    private final l f15844f;

    /* renamed from: g  reason: collision with root package name */
    private ThemeModel.AIAssistantTheme.AIAssistantBarTheme f15845g;

    /* renamed from: h  reason: collision with root package name */
    private int f15846h = -1;

    private static final class a extends h.f {
        /* renamed from: d */
        public boolean a(C0849b bVar, C0849b bVar2) {
            o.e(bVar, "oldItem");
            o.e(bVar2, "newItem");
            return o.a(bVar, bVar2);
        }

        /* renamed from: e */
        public boolean b(C0849b bVar, C0849b bVar2) {
            o.e(bVar, "oldItem");
            o.e(bVar2, "newItem");
            return o.a(bVar, bVar2);
        }
    }

    public static final class b extends RecyclerView.D {

        /* renamed from: x  reason: collision with root package name */
        public static final a f15847x = new a((kotlin.jvm.internal.i) null);

        /* renamed from: u  reason: collision with root package name */
        private final Context f15848u;

        /* renamed from: v  reason: collision with root package name */
        private final g f15849v;

        /* renamed from: w  reason: collision with root package name */
        private Drawable f15850w;

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
                this();
            }

            public final b a(ViewGroup viewGroup) {
                o.e(viewGroup, "parent");
                Context context = viewGroup.getContext();
                o.d(context, "getContext(...)");
                Context context2 = viewGroup.getContext();
                o.d(context2, "getContext(...)");
                return new b(context, new g(context2), (kotlin.jvm.internal.i) null);
            }

            private a() {
            }
        }

        public /* synthetic */ b(Context context, g gVar, kotlin.jvm.internal.i iVar) {
            this(context, gVar);
        }

        /* access modifiers changed from: private */
        public static final q N(l lVar, C0849b bVar) {
            lVar.invoke(bVar.b());
            return q.f14567a;
        }

        public final void O(C0849b bVar, l lVar, boolean z3, boolean z4, ThemeModel.AIAssistantTheme.AIAssistantBarTheme aIAssistantBarTheme) {
            o.e(bVar, "aiAssistantPromptItem");
            o.e(lVar, "onPromptItemClick");
            this.f15849v.setPromptTitle(bVar.c());
            if (this.f15850w == null) {
                this.f15850w = androidx.core.content.a.d(this.f15848u, bVar.a());
            }
            Drawable drawable = this.f15850w;
            if (drawable != null) {
                this.f15849v.setPromptIconDrawable(drawable);
            }
            this.f15849v.setOnPromptItemClick(new j(lVar, bVar));
            if (aIAssistantBarTheme == null) {
                return;
            }
            if (!z4) {
                this.f15849v.setPromptColor(aIAssistantBarTheme.getAiPromptFontActiveColor());
                this.f15849v.setBackground(aIAssistantBarTheme.getAiPromptBackgroundActiveColor());
            } else if (z3) {
                this.f15849v.setPromptColor(aIAssistantBarTheme.getAiPromptFontActiveColor());
                this.f15849v.setBackground(aIAssistantBarTheme.getAiPromptBackgroundActiveColor());
            } else {
                this.f15849v.setPromptColor(aIAssistantBarTheme.getAiPromptFontDefaultColor());
                this.f15849v.setBackground(aIAssistantBarTheme.getAiPromptBackgroundDefaultColor());
            }
        }

        private b(Context context, g gVar) {
            super(gVar);
            this.f15848u = context;
            this.f15849v = gVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(l lVar) {
        super(new a());
        o.e(lVar, "onPromptItemClick");
        this.f15844f = lVar;
    }

    /* access modifiers changed from: private */
    public static final q F(C0849b bVar, i iVar, b bVar2, PromptItemType promptItemType) {
        o.e(promptItemType, "it");
        if (bVar.b().getHasOptionsView()) {
            iVar.f15846h = bVar2.j();
            iVar.i();
        }
        iVar.f15844f.invoke(promptItemType);
        return q.f14567a;
    }

    public final void G() {
        this.f15846h = -1;
        i();
    }

    public final void H(ThemeModel.AIAssistantTheme.AIAssistantBarTheme aIAssistantBarTheme) {
        o.e(aIAssistantBarTheme, "theme");
        this.f15845g = aIAssistantBarTheme;
        i();
    }

    /* renamed from: I */
    public void o(b bVar, int i4) {
        boolean z3;
        boolean z4;
        o.e(bVar, "holder");
        C0849b bVar2 = (C0849b) A(i4);
        h hVar = new h(bVar2, this, bVar);
        o.b(bVar2);
        int i5 = this.f15846h;
        if (i5 == i4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i5 != -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        bVar.O(bVar2, hVar, z3, z4, this.f15845g);
    }

    /* renamed from: J */
    public b q(ViewGroup viewGroup, int i4) {
        o.e(viewGroup, "parent");
        return b.f15847x.a(viewGroup);
    }
}
