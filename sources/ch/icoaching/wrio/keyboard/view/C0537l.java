package ch.icoaching.wrio.keyboard.view;

import S0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.icoaching.wrio.C0551o;
import ch.icoaching.wrio.C0553q;
import ch.icoaching.wrio.W;
import ch.icoaching.wrio.keyboard.E;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.keyboard.model.config.Emoji;
import ch.icoaching.wrio.keyboard.view.C0536k;
import ch.icoaching.wrio.keyboard.view.F;
import ch.icoaching.wrio.keyboard.w;
import ch.icoaching.wrio.keyboard.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.o;
import l2.q;

/* renamed from: ch.icoaching.wrio.keyboard.view.l  reason: case insensitive filesystem */
public final class C0537l extends C0536k {

    /* renamed from: N  reason: collision with root package name */
    private final int f10416N;

    /* renamed from: O  reason: collision with root package name */
    private final int f10417O;

    /* renamed from: P  reason: collision with root package name */
    private final int f10418P;
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public w f10419Q;

    /* renamed from: R  reason: collision with root package name */
    private EmojiRecyclerViewAdapter f10420R;

    /* renamed from: S  reason: collision with root package name */
    private int f10421S;

    /* renamed from: T  reason: collision with root package name */
    private int f10422T;

    /* renamed from: U  reason: collision with root package name */
    private int f10423U;

    /* renamed from: V  reason: collision with root package name */
    private int f10424V;

    /* renamed from: W  reason: collision with root package name */
    private int f10425W;

    /* renamed from: a0  reason: collision with root package name */
    private int f10426a0;
    /* access modifiers changed from: private */

    /* renamed from: b0  reason: collision with root package name */
    public boolean f10427b0;
    /* access modifiers changed from: private */

    /* renamed from: c0  reason: collision with root package name */
    public boolean f10428c0;
    /* access modifiers changed from: private */

    /* renamed from: d0  reason: collision with root package name */
    public boolean f10429d0;

    /* renamed from: e0  reason: collision with root package name */
    private ConstraintLayout f10430e0;

    /* renamed from: f0  reason: collision with root package name */
    private final Map f10431f0;

    /* renamed from: g0  reason: collision with root package name */
    private final Map f10432g0;

    /* renamed from: h0  reason: collision with root package name */
    private ColorStateList f10433h0;

    /* renamed from: i0  reason: collision with root package name */
    private ColorStateList f10434i0;

    /* renamed from: ch.icoaching.wrio.keyboard.view.l$a */
    public static final class a extends RecyclerView.s {

        /* renamed from: a  reason: collision with root package name */
        private long f10435a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0537l f10436b;

        a(C0537l lVar) {
            this.f10436b = lVar;
        }

        public void a(RecyclerView recyclerView, int i4) {
            boolean z3;
            o.e(recyclerView, "recyclerView");
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f10435a;
            if (this.f10436b.y() || i4 != 0 || elapsedRealtime <= 200 || recyclerView.canScrollVertically(-1)) {
                C0537l lVar = this.f10436b;
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                lVar.B(z3);
                return;
            }
            w W3 = this.f10436b.f10419Q;
            if (W3 == null) {
                o.p("onKeyEventListenerInternal");
                W3 = null;
            }
            W3.c();
        }

        public void b(RecyclerView recyclerView, int i4, int i5) {
            boolean z3;
            o.e(recyclerView, "recyclerView");
            super.b(recyclerView, i4, i5);
            this.f10435a = SystemClock.elapsedRealtime();
            C0537l lVar = this.f10436b;
            if (i5 < 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            lVar.f10427b0 = z3;
            if (this.f10436b.f10429d0 && i5 < 0 && Math.abs(i5) > 5) {
                this.f10436b.g0("most_used");
                this.f10436b.f10428c0 = true;
            }
            if (this.f10436b.f10428c0 && i5 > 5) {
                this.f10436b.g0("smileys_people");
                this.f10436b.f10429d0 = true;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0537l(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    /* access modifiers changed from: private */
    public static final void U(C0537l lVar, View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        lVar.getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().clear();
        lVar.c0();
    }

    private final void c0() {
        View childAt = getChildAt(0);
        o.c(childAt, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) childAt;
        int left = constraintLayout.getLeft();
        int top = constraintLayout.getTop();
        ConstraintLayout constraintLayout2 = this.f10430e0;
        ConstraintLayout constraintLayout3 = null;
        if (constraintLayout2 == null) {
            o.p("emojiSidebar");
            constraintLayout2 = null;
        }
        float x3 = constraintLayout2.getX();
        ConstraintLayout constraintLayout4 = this.f10430e0;
        if (constraintLayout4 == null) {
            o.p("emojiSidebar");
        } else {
            constraintLayout3 = constraintLayout4;
        }
        float y3 = constraintLayout3.getY();
        for (ImageView imageView : this.f10431f0.values()) {
            getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().add(new C0536k.a(new PointF(imageView.getX() + x3, imageView.getY() + y3), imageView));
        }
        getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().add(new C0536k.a(new PointF(getContentRecyclerView().getX(), getContentRecyclerView().getY()), getContentRecyclerView()));
        if (!y()) {
            ViewParent parent = getImgExit().getParent();
            o.c(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout5 = (ConstraintLayout) parent;
            float x4 = ((float) left) + constraintLayout5.getX();
            float y4 = ((float) top) + constraintLayout5.getY();
            getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().add(new C0536k.a(new PointF(getImgExit().getX() + x4, getImgExit().getY() + y4), getImgExit()));
            getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().add(new C0536k.a(new PointF(getImgBackspace().getX() + x4, getImgBackspace().getY() + y4), getImgBackspace()));
            getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().add(new C0536k.a(new PointF(getImgSpace().getX() + x4, getImgSpace().getY() + y4), getImgSpace()));
            getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().add(new C0536k.a(new PointF(x4 + getImgReturn().getX(), y4 + getImgReturn().getY()), getImgReturn()));
        }
    }

    private final String d0(View view, int i4, String str) {
        ImageView imageView = (ImageView) view.findViewById(i4);
        String obj = imageView.getTag().toString();
        this.f10431f0.put(obj, imageView);
        if (str != null) {
            this.f10432g0.put(obj, str);
        }
        return obj;
    }

    private final String e0(String str, String str2) {
        int V3 = kotlin.text.o.V(str, "‍", 0, false, 6, (Object) null);
        int V4 = kotlin.text.o.V(str, "️", 0, false, 6, (Object) null);
        if ((V3 > 0 && V4 > 0 && V4 < V3) || (V3 < 0 && V4 > 0)) {
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, V4);
            o.d(substring, "substring(...)");
            sb.append(substring);
            sb.append(str2);
            String substring2 = str.substring(V4 + 1);
            o.d(substring2, "substring(...)");
            sb.append(substring2);
            return sb.toString();
        } else if (V3 > 0) {
            StringBuilder sb2 = new StringBuilder();
            String substring3 = str.substring(0, V3);
            o.d(substring3, "substring(...)");
            sb2.append(substring3);
            sb2.append(str2);
            String substring4 = str.substring(V3);
            o.d(substring4, "substring(...)");
            sb2.append(substring4);
            return sb2.toString();
        } else {
            return str + str2;
        }
    }

    private final String[] f0(String str) {
        return new String[]{str, e0(str, "🏻"), e0(str, "🏼"), e0(str, "🏽"), e0(str, "🏾"), e0(str, "🏿")};
    }

    /* access modifiers changed from: private */
    public final void g0(String str) {
        q0();
        Map map = this.f10431f0;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            o.b(obj);
            ImageView imageView = (ImageView) obj;
            ColorStateList colorStateList = this.f10434i0;
            if (colorStateList == null) {
                o.p("activeSideBarIconColor");
                colorStateList = null;
            }
            imageView.setImageTintList(colorStateList);
        }
        if (o.a(str, "smileys_people")) {
            this.f10429d0 = true;
        } else if (o.a(str, "most_used")) {
            this.f10428c0 = true;
        }
    }

    /* access modifiers changed from: private */
    public static final q i0(C0537l lVar, String str) {
        o.e(str, "it");
        lVar.o0(str);
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final boolean j0(List list, List list2) {
        o.e(list2, "emojiRow");
        return list.add(new F.a(C0718m.D0(list2)));
    }

    /* access modifiers changed from: private */
    public static final q k0(C0537l lVar, Emoji emoji) {
        o.e(emoji, "it");
        w wVar = lVar.f10419Q;
        w wVar2 = null;
        if (wVar == null) {
            o.p("onKeyEventListenerInternal");
            wVar = null;
        }
        wVar.m(emoji);
        w wVar3 = lVar.f10419Q;
        if (wVar3 == null) {
            o.p("onKeyEventListenerInternal");
        } else {
            wVar2 = wVar3;
        }
        wVar2.d();
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q l0(C0537l lVar, Emoji emoji) {
        o.e(emoji, "it");
        if (!lVar.n0(emoji.getIcon())) {
            lVar.t0(emoji);
        }
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final q m0(C0537l lVar, String str) {
        o.e(str, "it");
        lVar.p0(str);
        return q.f14567a;
    }

    private final boolean n0(String str) {
        if (kotlin.text.o.u(str, "🏻", false, 2, (Object) null) || kotlin.text.o.u(str, "🏼", false, 2, (Object) null) || kotlin.text.o.u(str, "🏽", false, 2, (Object) null) || kotlin.text.o.u(str, "🏾", false, 2, (Object) null) || kotlin.text.o.u(str, "🏿", false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    private final void o0(String str) {
        if (!o.a(str, "smileys_people") && this.f10427b0) {
            q0();
            Object obj = this.f10431f0.get((String) this.f10432g0.get(str));
            o.b(obj);
            ImageView imageView = (ImageView) obj;
            ColorStateList colorStateList = this.f10434i0;
            if (colorStateList == null) {
                o.p("activeSideBarIconColor");
                colorStateList = null;
            }
            imageView.setImageTintList(colorStateList);
        }
    }

    private final void p0(String str) {
        if (!this.f10428c0) {
            g0(str);
        }
    }

    private final void q0() {
        for (ImageView imageView : this.f10431f0.values()) {
            ColorStateList colorStateList = this.f10433h0;
            if (colorStateList == null) {
                o.p("defaultSideBarIconColor");
                colorStateList = null;
            }
            imageView.setImageTintList(colorStateList);
        }
        this.f10428c0 = false;
        this.f10429d0 = false;
    }

    private final void r0() {
        for (ImageView imageView : this.f10431f0.values()) {
            imageView.setOnClickListener(new C0535j(this, imageView));
        }
    }

    /* access modifiers changed from: private */
    public static final void s0(C0537l lVar, ImageView imageView, View view) {
        lVar.q0();
        EmojiRecyclerViewAdapter emojiRecyclerViewAdapter = lVar.f10420R;
        ColorStateList colorStateList = null;
        if (emojiRecyclerViewAdapter == null) {
            o.p("emojiAdapter");
            emojiRecyclerViewAdapter = null;
        }
        List z3 = emojiRecyclerViewAdapter.z();
        o.d(z3, "getCurrentList(...)");
        Iterator it = z3.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            F f4 = (F) it.next();
            if ((f4 instanceof F.b) && o.a(((F.b) f4).a(), view.getTag())) {
                break;
            }
            i4++;
        }
        if (i4 < 0) {
            S.b(lVar.getContentRecyclerView(), 0);
            lVar.g0("most_used");
            return;
        }
        if (o.a(view.getTag(), "smileys_people")) {
            lVar.f10429d0 = true;
            ColorStateList colorStateList2 = lVar.f10434i0;
            if (colorStateList2 == null) {
                o.p("activeSideBarIconColor");
            } else {
                colorStateList = colorStateList2;
            }
            imageView.setImageTintList(colorStateList);
        }
        S.b(lVar.getContentRecyclerView(), i4);
    }

    private final void t0(Emoji emoji) {
        w wVar = this.f10419Q;
        w wVar2 = null;
        if (wVar == null) {
            o.p("onKeyEventListenerInternal");
            wVar = null;
        }
        wVar.m(emoji);
        y onLongTouchListener$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease = getOnLongTouchListener$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
        if (onLongTouchListener$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease != null) {
            onLongTouchListener$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.a();
        }
        int i4 = this.f10424V;
        int i5 = this.f10425W;
        int i6 = this.f10423U;
        Rect rect = new Rect(i4, i5, i4 + i6, i6 + i5);
        rect.offset((int) getX(), (int) getY());
        String[] f02 = f0(emoji.getIcon());
        Context context = getContext();
        o.d(context, "getContext(...)");
        S0.a a4 = new a.C0024a(context).b(rect).f(f02).c(getLongClickMenuTheme$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease()).e(false).g().a(this, 0, this.f10426a0, false);
        int m4 = a4.m();
        if (m4 < f02.length) {
            w wVar3 = this.f10419Q;
            if (wVar3 == null) {
                o.p("onKeyEventListenerInternal");
            } else {
                wVar2 = wVar3;
            }
            wVar2.l(f02[m4]);
        }
        setLongClickMenu$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(a4);
    }

    /* access modifiers changed from: private */
    public static final int v0(List list, Ref$IntRef ref$IntRef, List list2) {
        o.e(list2, "emojiList");
        list.add(ref$IntRef.element, new F.a(C0718m.D0(list2)));
        int i4 = ref$IntRef.element;
        ref$IntRef.element = i4 + 1;
        return i4;
    }

    /* access modifiers changed from: private */
    public static final void w0(C0537l lVar) {
        lVar.getContentRecyclerView().A1(0);
    }

    public boolean A(PointF pointF, C0536k.a aVar) {
        float x3;
        View W3;
        int i4;
        int i5;
        o.e(pointF, "eventOrigin");
        o.e(aVar, "positionedClickableView");
        if (!(aVar.b() instanceof RecyclerView) || (W3 = getContentRecyclerView().W(x3, pointF.y - getContentRecyclerView().getY())) == null) {
            return false;
        }
        FrameLayout frameLayout = (FrameLayout) W3;
        View childAt = frameLayout.getChildAt(0);
        if (!(childAt instanceof RecyclerView)) {
            return false;
        }
        View W4 = ((RecyclerView) childAt).W((x3 = pointF.x - getContentRecyclerView().getX()), 0.0f);
        int x4 = ((int) getContentRecyclerView().getX()) + ((int) frameLayout.getX());
        if (W4 != null) {
            i4 = (int) W4.getX();
        } else {
            i4 = 0;
        }
        this.f10424V = x4 + i4;
        this.f10425W = (int) frameLayout.getY();
        if (W4 != null) {
            i5 = W.a(W4);
        } else {
            i5 = 0;
        }
        this.f10426a0 = i5;
        if (W4 != null) {
            return W4.performLongClick();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void C(int i4) {
        w wVar = this.f10419Q;
        if (wVar == null) {
            o.p("onKeyEventListenerInternal");
            wVar = null;
        }
        wVar.i(i4);
    }

    /* access modifiers changed from: protected */
    public void D() {
        w wVar = this.f10419Q;
        w wVar2 = null;
        if (wVar == null) {
            o.p("onKeyEventListenerInternal");
            wVar = null;
        }
        wVar.g();
        w wVar3 = this.f10419Q;
        if (wVar3 == null) {
            o.p("onKeyEventListenerInternal");
        } else {
            wVar2 = wVar3;
        }
        wVar2.d();
    }

    /* access modifiers changed from: protected */
    public void E(String str) {
        o.e(str, "newItem");
        w wVar = this.f10419Q;
        if (wVar == null) {
            o.p("onKeyEventListenerInternal");
            wVar = null;
        }
        wVar.l(str);
    }

    /* access modifiers changed from: protected */
    public void F(int i4) {
        w wVar = this.f10419Q;
        if (wVar == null) {
            o.p("onKeyEventListenerInternal");
            wVar = null;
        }
        wVar.f(i4);
    }

    /* access modifiers changed from: protected */
    public void G(int i4) {
        w wVar = this.f10419Q;
        if (wVar == null) {
            o.p("onKeyEventListenerInternal");
            wVar = null;
        }
        wVar.h(i4);
    }

    /* access modifiers changed from: protected */
    public void H() {
        w wVar = this.f10419Q;
        if (wVar == null) {
            o.p("onKeyEventListenerInternal");
            wVar = null;
        }
        wVar.b();
    }

    public final void h0(Map map, ThemeModel.SpecialOverlaysTheme specialOverlaysTheme, Drawable drawable, boolean z3, int i4, int i5, int i6, int i7, w wVar, boolean z4) {
        boolean z5;
        int i8;
        int i9;
        float f4;
        ThemeModel.SpecialOverlaysTheme specialOverlaysTheme2 = specialOverlaysTheme;
        Drawable drawable2 = drawable;
        w wVar2 = wVar;
        o.e(map, "emojiConfig");
        o.e(specialOverlaysTheme2, "specialOverlaysTheme");
        o.e(wVar2, "onEmojiEventListener");
        setSpecialOverlayTheme(specialOverlaysTheme2);
        EmojiRecyclerViewAdapter emojiRecyclerViewAdapter = null;
        View inflate = LayoutInflater.from(getContext()).inflate(ch.icoaching.wrio.keyboard.F.emoji_layout, (ViewGroup) null, false);
        o.b(inflate);
        inflate.setPadding(inflate.getPaddingLeft(), inflate.getPaddingTop(), inflate.getPaddingRight(), i7);
        if (drawable2 == null) {
            inflate.setBackgroundColor(getSpecialOverlayTheme().getFallbackBackgroundColor());
        } else {
            inflate.setBackground(drawable2);
        }
        this.f10419Q = wVar2;
        Context context = getContext();
        o.d(context, "getContext(...)");
        if ((C0551o.b(context) || z4) && z3) {
            z5 = true;
        } else {
            z5 = false;
        }
        setHexagonLandscape(z5);
        if (y()) {
            i8 = i4 - (C0553q.a(7) + C0553q.a(5));
        } else {
            i8 = i4;
        }
        if (y()) {
            View findViewById = inflate.findViewById(E.emojiParentLayout);
            o.b(findViewById);
            findViewById.setPadding(findViewById.getLeft() + C0553q.a(7), findViewById.getPaddingTop(), findViewById.getRight() + C0553q.a(5), findViewById.getPaddingBottom());
            View findViewById2 = inflate.findViewById(E.cl_emoji_sidebar);
            ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            o.c(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.setMarginStart(0);
            bVar.setMarginEnd(0);
            findViewById2.setLayoutParams(bVar);
        }
        setClIcons((ConstraintLayout) inflate.findViewById(E.cl_icons));
        setImgExit((ImageView) inflate.findViewById(E.iv_exit));
        setImgBackspace((ImageView) inflate.findViewById(E.iv_backspace));
        setImgSpace((ImageView) inflate.findViewById(E.iv_space));
        setImgReturn((ImageView) inflate.findViewById(E.iv_return));
        getClIcons().setBackgroundColor(specialOverlaysTheme.getSideBarTheme().a());
        getImgExit().setImageTintList(specialOverlaysTheme.getSideBarTheme().b());
        getImgBackspace().setImageTintList(specialOverlaysTheme.getSideBarTheme().c());
        getImgSpace().setImageTintList(specialOverlaysTheme.getSideBarTheme().c());
        getImgReturn().setImageTintList(specialOverlaysTheme.getSideBarTheme().c());
        ImageView imgBackspace = getImgBackspace();
        if (x()) {
            i9 = 0;
        } else {
            i9 = 4;
        }
        imgBackspace.setVisibility(i9);
        this.f10431f0.clear();
        this.f10430e0 = (ConstraintLayout) inflate.findViewById(E.cl_emoji_sidebar);
        d0(inflate, E.img_activities, d0(inflate, E.img_travel_places, d0(inflate, E.img_food_drink, d0(inflate, E.img_animals_nature, d0(inflate, E.img_objects_symbols, d0(inflate, E.img_smileys_people, d0(inflate, E.img_frequent, (String) null)))))));
        this.f10434i0 = ColorStateList.valueOf(specialOverlaysTheme.getEmojiSidebarTheme().a());
        this.f10433h0 = ColorStateList.valueOf(specialOverlaysTheme.getEmojiSidebarTheme().c());
        ConstraintLayout constraintLayout = this.f10430e0;
        if (constraintLayout == null) {
            o.p("emojiSidebar");
            constraintLayout = null;
        }
        constraintLayout.getBackground().setTint(specialOverlaysTheme.getEmojiSidebarTheme().b());
        g0("most_used");
        r0();
        w();
        if (y()) {
            f4 = 1.0f;
        } else if (i8 > getSmallKeyboardUpperBound()) {
            f4 = 0.84f;
        } else {
            f4 = 0.8f;
        }
        int i10 = (int) (((float) i8) * f4);
        int i11 = i8 - i10;
        int i12 = i10 / this.f10416N;
        this.f10422T = i12;
        int i13 = i10 / i12;
        this.f10423U = i13;
        int i14 = (int) (((float) i13) * 0.1f);
        int i15 = i12 - 1;
        this.f10422T = i15;
        this.f10421S = i15 * 4;
        addView(inflate);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i8, i5);
        layoutParams2.gravity = 17;
        inflate.setLayoutParams(layoutParams2);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new F.b((String) entry.getKey()));
            C0718m.K((List) entry.getValue(), this.f10422T, new C0527b(arrayList));
        }
        setContentRecyclerView((RecyclerView) inflate.findViewById(E.rv_emoji));
        getContentRecyclerView().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        int i16 = this.f10423U;
        this.f10420R = new EmojiRecyclerViewAdapter(i16, i16, i14, this.f10417O, this.f10418P, getSpecialOverlayTheme(), new C0528c(this), new C0529d(this), new C0530e(this), new C0532g(this));
        RecyclerView contentRecyclerView = getContentRecyclerView();
        EmojiRecyclerViewAdapter emojiRecyclerViewAdapter2 = this.f10420R;
        if (emojiRecyclerViewAdapter2 == null) {
            o.p("emojiAdapter");
            emojiRecyclerViewAdapter2 = null;
        }
        contentRecyclerView.setAdapter(emojiRecyclerViewAdapter2);
        EmojiRecyclerViewAdapter emojiRecyclerViewAdapter3 = this.f10420R;
        if (emojiRecyclerViewAdapter3 == null) {
            o.p("emojiAdapter");
        } else {
            emojiRecyclerViewAdapter = emojiRecyclerViewAdapter3;
        }
        emojiRecyclerViewAdapter.C(arrayList);
        if (!y()) {
            m(i11);
        }
        getContentRecyclerView().m(new a(this));
        v(inflate, i6);
    }

    public final void u0(List list) {
        o.e(list, "mostUsedList");
        EmojiRecyclerViewAdapter emojiRecyclerViewAdapter = this.f10420R;
        EmojiRecyclerViewAdapter emojiRecyclerViewAdapter2 = null;
        if (emojiRecyclerViewAdapter == null) {
            o.p("emojiAdapter");
            emojiRecyclerViewAdapter = null;
        }
        List z3 = emojiRecyclerViewAdapter.z();
        o.d(z3, "getCurrentList(...)");
        List D02 = C0718m.D0(z3);
        List v02 = C0718m.v0(list, this.f10421S);
        while (D02.get(0) instanceof F.a) {
            D02.remove(0);
        }
        C0718m.K(v02, this.f10422T, new C0533h(D02, new Ref$IntRef()));
        EmojiRecyclerViewAdapter emojiRecyclerViewAdapter3 = this.f10420R;
        if (emojiRecyclerViewAdapter3 == null) {
            o.p("emojiAdapter");
        } else {
            emojiRecyclerViewAdapter2 = emojiRecyclerViewAdapter3;
        }
        emojiRecyclerViewAdapter2.C(D02);
        getContentRecyclerView().post(new C0534i(this));
    }

    public void z(PointF pointF, C0536k.a aVar) {
        float x3;
        View W3;
        View W4;
        o.e(pointF, "eventOrigin");
        o.e(aVar, "positionedClickableView");
        View b4 = aVar.b();
        w wVar = null;
        if (b4 instanceof ImageView) {
            w wVar2 = this.f10419Q;
            if (wVar2 == null) {
                o.p("onKeyEventListenerInternal");
                wVar2 = null;
            }
            wVar2.a();
            int id = ((ImageView) b4).getId();
            if (id == E.iv_backspace) {
                C(1);
                H();
            } else if (id == E.iv_space) {
                w wVar3 = this.f10419Q;
                if (wVar3 == null) {
                    o.p("onKeyEventListenerInternal");
                    wVar3 = null;
                }
                wVar3.g();
                w wVar4 = this.f10419Q;
                if (wVar4 == null) {
                    o.p("onKeyEventListenerInternal");
                } else {
                    wVar = wVar4;
                }
                wVar.d();
            } else if (id == E.iv_return) {
                w wVar5 = this.f10419Q;
                if (wVar5 == null) {
                    o.p("onKeyEventListenerInternal");
                    wVar5 = null;
                }
                wVar5.e();
                w wVar6 = this.f10419Q;
                if (wVar6 == null) {
                    o.p("onKeyEventListenerInternal");
                } else {
                    wVar = wVar6;
                }
                wVar.d();
            } else if (id == E.iv_exit) {
                w wVar7 = this.f10419Q;
                if (wVar7 == null) {
                    o.p("onKeyEventListenerInternal");
                } else {
                    wVar = wVar7;
                }
                wVar.c();
            } else {
                b4.performClick();
            }
        } else if ((b4 instanceof RecyclerView) && (W3 = getContentRecyclerView().W((x3 = pointF.x - getContentRecyclerView().getX()), pointF.y - getContentRecyclerView().getY())) != null) {
            View childAt = ((FrameLayout) W3).getChildAt(0);
            if ((childAt instanceof RecyclerView) && (W4 = ((RecyclerView) childAt).W(x3, 0.0f)) != null) {
                w wVar8 = this.f10419Q;
                if (wVar8 == null) {
                    o.p("onKeyEventListenerInternal");
                } else {
                    wVar = wVar8;
                }
                wVar.a();
                W4.performClick();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0537l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0537l(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        this.f10416N = C0553q.a(44);
        this.f10417O = C0553q.a(22);
        this.f10418P = C0553q.a(5);
        this.f10431f0 = new LinkedHashMap();
        this.f10432g0 = new LinkedHashMap();
        addOnLayoutChangeListener(new C0526a(this));
    }
}
