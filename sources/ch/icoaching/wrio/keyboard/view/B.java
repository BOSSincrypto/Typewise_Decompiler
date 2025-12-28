package ch.icoaching.wrio.keyboard.view;

import android.content.Context;
import android.graphics.PointF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.icoaching.wrio.keyboard.A;
import ch.icoaching.wrio.keyboard.E;
import ch.icoaching.wrio.keyboard.view.C0536k;
import ch.icoaching.wrio.keyboard.view.U;
import ch.icoaching.wrio.logging.Log;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import l2.q;

public final class B extends C0536k {

    /* renamed from: N  reason: collision with root package name */
    private int f10116N;

    /* renamed from: O  reason: collision with root package name */
    private int f10117O;
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public A f10118P;

    /* renamed from: Q  reason: collision with root package name */
    private SymbolsRecyclerViewAdapter f10119Q;

    /* renamed from: R  reason: collision with root package name */
    private int f10120R;

    public static final class a extends RecyclerView.s {

        /* renamed from: a  reason: collision with root package name */
        private long f10121a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ B f10122b;

        a(B b4) {
            this.f10122b = b4;
        }

        public void a(RecyclerView recyclerView, int i4) {
            boolean z3;
            o.e(recyclerView, "recyclerView");
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f10121a;
            if (this.f10122b.y() || i4 != 0 || elapsedRealtime <= 200 || recyclerView.canScrollVertically(-1)) {
                B b4 = this.f10122b;
                if (i4 != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                b4.B(z3);
                return;
            }
            A P3 = this.f10122b.f10118P;
            if (P3 == null) {
                o.p("onKeyEventListenerInternal");
                P3 = null;
            }
            P3.c();
        }

        public void b(RecyclerView recyclerView, int i4, int i5) {
            o.e(recyclerView, "recyclerView");
            super.b(recyclerView, i4, i5);
            this.f10121a = SystemClock.elapsedRealtime();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public B(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    /* access modifiers changed from: private */
    public static final void O(B b4, View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        Log log = Log.f10572a;
        Log.d(log, "SymbolsLayoutView", "OnLayoutChange() :: (" + i4 + ", " + i5 + ", " + i6 + ", " + i7 + ')', (Throwable) null, 4, (Object) null);
        if (i4 == i8 && i5 == i9 && i6 == i10 && i7 == i11) {
            Log.d(log, "SymbolsLayoutView", "OnLayoutChange() :: layout unchanged", (Throwable) null, 4, (Object) null);
            return;
        }
        b4.getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().clear();
        b4.Q();
    }

    private final void Q() {
        View childAt = getChildAt(0);
        o.c(childAt, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) childAt;
        int left = constraintLayout.getLeft();
        int top = constraintLayout.getTop();
        getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().add(new C0536k.a(new PointF(getContentRecyclerView().getX(), getContentRecyclerView().getY()), getContentRecyclerView()));
        if (!y()) {
            ViewParent parent = getImgExit().getParent();
            o.c(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout2 = (ConstraintLayout) parent;
            float x3 = constraintLayout2.getX();
            float f4 = ((float) left) + x3;
            float y3 = ((float) top) + constraintLayout2.getY();
            getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().add(new C0536k.a(new PointF(getImgExit().getX() + f4, getImgExit().getY() + y3), getImgExit()));
            getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().add(new C0536k.a(new PointF(getImgBackspace().getX() + f4, getImgBackspace().getY() + y3), getImgBackspace()));
            getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().add(new C0536k.a(new PointF(getImgSpace().getX() + f4, getImgSpace().getY() + y3), getImgSpace()));
            getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().add(new C0536k.a(new PointF(f4 + getImgReturn().getX(), y3 + getImgReturn().getY()), getImgReturn()));
        }
    }

    /* access modifiers changed from: private */
    public static final q S(B b4, char c4) {
        A a4 = b4.f10118P;
        A a5 = null;
        if (a4 == null) {
            o.p("onKeyEventListenerInternal");
            a4 = null;
        }
        a4.e(c4);
        A a6 = b4.f10118P;
        if (a6 == null) {
            o.p("onKeyEventListenerInternal");
        } else {
            a5 = a6;
        }
        a5.d();
        return q.f14567a;
    }

    /* access modifiers changed from: private */
    public static final boolean T(List list, List list2) {
        o.e(list2, "characters");
        return list.add(new U.d(C0718m.D0(list2)));
    }

    public boolean A(PointF pointF, C0536k.a aVar) {
        o.e(pointF, "eventOrigin");
        o.e(aVar, "positionedClickableView");
        return false;
    }

    /* access modifiers changed from: protected */
    public void C(int i4) {
        A a4 = this.f10118P;
        if (a4 == null) {
            o.p("onKeyEventListenerInternal");
            a4 = null;
        }
        a4.i(i4);
    }

    /* access modifiers changed from: protected */
    public void D() {
        A a4 = this.f10118P;
        if (a4 == null) {
            o.p("onKeyEventListenerInternal");
            a4 = null;
        }
        a4.e(' ');
    }

    /* access modifiers changed from: protected */
    public void E(String str) {
        o.e(str, "newItem");
    }

    /* access modifiers changed from: protected */
    public void F(int i4) {
        A a4 = this.f10118P;
        if (a4 == null) {
            o.p("onKeyEventListenerInternal");
            a4 = null;
        }
        a4.f(i4);
    }

    /* access modifiers changed from: protected */
    public void G(int i4) {
        A a4 = this.f10118P;
        if (a4 == null) {
            o.p("onKeyEventListenerInternal");
            a4 = null;
        }
        a4.h(i4);
    }

    /* access modifiers changed from: protected */
    public void H() {
        A a4 = this.f10118P;
        if (a4 == null) {
            o.p("onKeyEventListenerInternal");
            a4 = null;
        }
        a4.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0358 A[LOOP:0: B:58:0x0352->B:60:0x0358, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x03bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(java.util.Map r38, ch.icoaching.wrio.keyboard.model.ThemeModel.SpecialOverlaysTheme r39, android.graphics.drawable.Drawable r40, boolean r41, int r42, int r43, int r44, int r45, int r46, ch.icoaching.wrio.keyboard.A r47, boolean r48, boolean r49, boolean r50) {
        /*
            r37 = this;
            r0 = r37
            r1 = r39
            r2 = r40
            r3 = r42
            r4 = r43
            r5 = r44
            r6 = r47
            java.lang.String r7 = "symbolsAdapter"
            r14 = 12
            r16 = 2
            r8 = 1
            r15 = 0
            r17 = 4
            java.lang.String r10 = "specialCharactersConfiguration"
            r11 = r38
            kotlin.jvm.internal.o.e(r11, r10)
            java.lang.String r10 = "specialOverlaysConfig"
            kotlin.jvm.internal.o.e(r1, r10)
            java.lang.String r10 = "onSymbolEventListener"
            kotlin.jvm.internal.o.e(r6, r10)
            if (r3 <= 0) goto L_0x0406
            if (r4 <= 0) goto L_0x03eb
            if (r5 <= 0) goto L_0x03d0
            r0.setSpecialOverlayTheme(r1)
            android.content.Context r1 = r37.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r10 = ch.icoaching.wrio.keyboard.F.symbols_layout_view
            r12 = 0
            android.view.View r1 = r1.inflate(r10, r12, r15)
            kotlin.jvm.internal.o.b(r1)
            int r10 = r1.getPaddingLeft()
            int r12 = r1.getPaddingTop()
            int r13 = r1.getPaddingRight()
            r9 = r46
            r1.setPadding(r10, r12, r13, r9)
            if (r2 != 0) goto L_0x0063
            ch.icoaching.wrio.keyboard.model.ThemeModel$SpecialOverlaysTheme r2 = r37.getSpecialOverlayTheme()
            int r2 = r2.getFallbackBackgroundColor()
            r1.setBackgroundColor(r2)
            goto L_0x0066
        L_0x0063:
            r1.setBackground(r2)
        L_0x0066:
            android.content.Context r2 = r37.getContext()
            java.lang.String r9 = "getContext(...)"
            kotlin.jvm.internal.o.d(r2, r9)
            boolean r2 = ch.icoaching.wrio.C0551o.b(r2)
            r10 = 46
            r12 = 44
            r13 = 48
            r24 = 57
            r25 = 56
            r26 = 55
            r27 = 54
            r28 = 53
            r29 = 52
            r30 = 51
            r31 = 50
            r32 = 49
            if (r2 == 0) goto L_0x00f0
            if (r41 != 0) goto L_0x00f0
            java.lang.Character r32 = java.lang.Character.valueOf(r32)
            java.lang.Character r31 = java.lang.Character.valueOf(r31)
            java.lang.Character r30 = java.lang.Character.valueOf(r30)
            java.lang.Character r29 = java.lang.Character.valueOf(r29)
            java.lang.Character r28 = java.lang.Character.valueOf(r28)
            java.lang.Character r27 = java.lang.Character.valueOf(r27)
            java.lang.Character r26 = java.lang.Character.valueOf(r26)
            java.lang.Character r25 = java.lang.Character.valueOf(r25)
            java.lang.Character r24 = java.lang.Character.valueOf(r24)
            java.lang.Character r13 = java.lang.Character.valueOf(r13)
            java.lang.Character r12 = java.lang.Character.valueOf(r12)
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            java.lang.Character[] r14 = new java.lang.Character[r14]
            r14[r15] = r32
            r14[r8] = r31
            r14[r16] = r30
            r23 = 3
            r14[r23] = r29
            r14[r17] = r28
            r22 = 5
            r14[r22] = r27
            r21 = 6
            r14[r21] = r26
            r20 = 7
            r14[r20] = r25
            r19 = 8
            r14[r19] = r24
            r18 = 9
            r14[r18] = r13
            r13 = 10
            r14[r13] = r12
            r12 = 11
            r14[r12] = r10
            java.util.List r10 = kotlin.collections.C0718m.m(r14)
        L_0x00ed:
            r35 = r10
            goto L_0x014f
        L_0x00f0:
            java.lang.Character r32 = java.lang.Character.valueOf(r32)
            java.lang.Character r31 = java.lang.Character.valueOf(r31)
            java.lang.Character r30 = java.lang.Character.valueOf(r30)
            java.lang.Character r29 = java.lang.Character.valueOf(r29)
            java.lang.Character r28 = java.lang.Character.valueOf(r28)
            java.lang.Character r27 = java.lang.Character.valueOf(r27)
            java.lang.Character r26 = java.lang.Character.valueOf(r26)
            java.lang.Character r25 = java.lang.Character.valueOf(r25)
            java.lang.Character r24 = java.lang.Character.valueOf(r24)
            java.lang.Character r12 = java.lang.Character.valueOf(r12)
            java.lang.Character r13 = java.lang.Character.valueOf(r13)
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            java.lang.Character[] r14 = new java.lang.Character[r14]
            r14[r15] = r32
            r14[r8] = r31
            r14[r16] = r30
            r23 = 3
            r14[r23] = r29
            r14[r17] = r28
            r22 = 5
            r14[r22] = r27
            r21 = 6
            r14[r21] = r26
            r20 = 7
            r14[r20] = r25
            r19 = 8
            r14[r19] = r24
            r18 = 9
            r14[r18] = r12
            r12 = 10
            r14[r12] = r13
            r12 = 11
            r14[r12] = r10
            java.util.List r10 = kotlin.collections.C0718m.m(r14)
            goto L_0x00ed
        L_0x014f:
            r0.f10118P = r6
            if (r2 != 0) goto L_0x0155
            if (r49 == 0) goto L_0x0159
        L_0x0155:
            if (r41 == 0) goto L_0x0159
            r2 = r8
            goto L_0x015a
        L_0x0159:
            r2 = r15
        L_0x015a:
            r0.setHexagonLandscape(r2)
            int r2 = ch.icoaching.wrio.keyboard.E.cl_icons
            android.view.View r2 = r1.findViewById(r2)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r0.setClIcons(r2)
            int r2 = ch.icoaching.wrio.keyboard.E.iv_exit
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.setImgExit(r2)
            int r2 = ch.icoaching.wrio.keyboard.E.iv_backspace
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.setImgBackspace(r2)
            int r2 = ch.icoaching.wrio.keyboard.E.iv_space
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.setImgSpace(r2)
            int r2 = ch.icoaching.wrio.keyboard.E.iv_return
            android.view.View r2 = r1.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.setImgReturn(r2)
            androidx.constraintlayout.widget.ConstraintLayout r2 = r37.getClIcons()
            ch.icoaching.wrio.keyboard.model.ThemeModel$SpecialOverlaysTheme r6 = r37.getSpecialOverlayTheme()
            ch.icoaching.wrio.keyboard.model.ThemeModel$SpecialOverlaysTheme$b r6 = r6.getSideBarTheme()
            int r6 = r6.a()
            r2.setBackgroundColor(r6)
            android.widget.ImageView r2 = r37.getImgExit()
            ch.icoaching.wrio.keyboard.model.ThemeModel$SpecialOverlaysTheme r6 = r37.getSpecialOverlayTheme()
            ch.icoaching.wrio.keyboard.model.ThemeModel$SpecialOverlaysTheme$b r6 = r6.getSideBarTheme()
            android.content.res.ColorStateList r6 = r6.b()
            r2.setImageTintList(r6)
            android.widget.ImageView r2 = r37.getImgBackspace()
            ch.icoaching.wrio.keyboard.model.ThemeModel$SpecialOverlaysTheme r6 = r37.getSpecialOverlayTheme()
            ch.icoaching.wrio.keyboard.model.ThemeModel$SpecialOverlaysTheme$b r6 = r6.getSideBarTheme()
            android.content.res.ColorStateList r6 = r6.c()
            r2.setImageTintList(r6)
            android.widget.ImageView r2 = r37.getImgSpace()
            ch.icoaching.wrio.keyboard.model.ThemeModel$SpecialOverlaysTheme r6 = r37.getSpecialOverlayTheme()
            ch.icoaching.wrio.keyboard.model.ThemeModel$SpecialOverlaysTheme$b r6 = r6.getSideBarTheme()
            android.content.res.ColorStateList r6 = r6.c()
            r2.setImageTintList(r6)
            android.widget.ImageView r2 = r37.getImgReturn()
            ch.icoaching.wrio.keyboard.model.ThemeModel$SpecialOverlaysTheme r6 = r37.getSpecialOverlayTheme()
            ch.icoaching.wrio.keyboard.model.ThemeModel$SpecialOverlaysTheme$b r6 = r6.getSideBarTheme()
            android.content.res.ColorStateList r6 = r6.c()
            r2.setImageTintList(r6)
            android.widget.ImageView r2 = r37.getImgBackspace()
            boolean r6 = r37.x()
            if (r6 == 0) goto L_0x01ff
            r6 = r15
            goto L_0x0201
        L_0x01ff:
            r6 = r17
        L_0x0201:
            r2.setVisibility(r6)
            r37.w()
            boolean r2 = r37.y()
            if (r2 == 0) goto L_0x0212
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x020f:
            r6 = 10
            goto L_0x022f
        L_0x0212:
            int r2 = r37.getSmallKeyboardUpperBound()
            if (r3 <= r2) goto L_0x022b
            ch.icoaching.wrio.logging.Log r24 = ch.icoaching.wrio.logging.Log.f10572a
            r28 = 4
            r29 = 0
            java.lang.String r25 = "SymbolsLayoutView"
            java.lang.String r26 = "The device is hex standard"
            r27 = 0
            ch.icoaching.wrio.logging.Log.d(r24, r25, r26, r27, r28, r29)
            r2 = 1062668861(0x3f570a3d, float:0.84)
            goto L_0x020f
        L_0x022b:
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            goto L_0x020f
        L_0x022f:
            int r10 = ch.icoaching.wrio.C0553q.a(r6)
            int r6 = ch.icoaching.wrio.C0553q.a(r6)
            r12 = 20
            r13 = 15
            if (r41 == 0) goto L_0x0277
            int r6 = r37.getSmallKeyboardUpperBound()
            if (r3 >= r6) goto L_0x025e
            ch.icoaching.wrio.logging.Log r24 = ch.icoaching.wrio.logging.Log.f10572a
            r28 = 4
            r29 = 0
            java.lang.String r25 = "SymbolsLayoutView"
            java.lang.String r26 = "Set small margins"
            r27 = 0
            ch.icoaching.wrio.logging.Log.d(r24, r25, r26, r27, r28, r29)
            int r6 = ch.icoaching.wrio.C0553q.a(r13)
            int r10 = ch.icoaching.wrio.C0553q.a(r12)
            r30 = r10
            r10 = r6
            goto L_0x0279
        L_0x025e:
            ch.icoaching.wrio.logging.Log r24 = ch.icoaching.wrio.logging.Log.f10572a
            r28 = 4
            r29 = 0
            java.lang.String r25 = "SymbolsLayoutView"
            java.lang.String r26 = "Set large margins"
            r27 = 0
            ch.icoaching.wrio.logging.Log.d(r24, r25, r26, r27, r28, r29)
            r6 = 30
            int r10 = ch.icoaching.wrio.C0553q.a(r6)
            int r6 = ch.icoaching.wrio.C0553q.a(r6)
        L_0x0277:
            r30 = r6
        L_0x0279:
            boolean r6 = r37.y()
            if (r6 == 0) goto L_0x0284
            int r6 = ch.icoaching.wrio.C0553q.a(r13)
            goto L_0x0288
        L_0x0284:
            int r6 = ch.icoaching.wrio.C0553q.a(r15)
        L_0x0288:
            r0.f10116N = r6
            float r13 = (float) r3
            float r2 = r2 * r13
            r13 = 3
            int r6 = r6 * r13
            float r6 = (float) r6
            float r2 = r2 - r6
            double r13 = (double) r2
            double r13 = java.lang.Math.ceil(r13)
            float r2 = (float) r13
            int r2 = (int) r2
            int r6 = r3 - r2
            int r13 = r4 - r45
            double r13 = (double) r13
            r40 = r9
            double r8 = (double) r10
            r18 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r8 = r8 * r18
            double r13 = r13 - r8
            r8 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r13 = r13 / r8
            double r8 = java.lang.Math.ceil(r13)
            int r8 = (int) r8
            int r28 = r8 / 2
            double r13 = (double) r8
            r18 = 4605831338911806259(0x3feb333333333333, double:0.85)
            double r13 = r13 * r18
            int r9 = (int) r13
            int r13 = r2 / r9
            int r14 = r9 * r13
            int r2 = r2 - r14
            int r14 = r0.f10116N
            r12 = 3
            int r2 = r2 / r12
            int r14 = r14 + r2
            r0.f10117O = r14
            float r2 = (float) r14
            float r14 = (float) r13
            float r2 = r2 / r14
            r45 = r13
            double r12 = (double) r2
            double r12 = java.lang.Math.ceil(r12)
            float r2 = (float) r12
            int r2 = (int) r2
            int r26 = r9 + r2
            r2 = r45
            r12 = 3
            if (r2 <= r12) goto L_0x02db
            int r13 = r2 + -3
            r32 = r13
            goto L_0x02dd
        L_0x02db:
            r32 = 1
        L_0x02dd:
            int r12 = r32 * 4
            r0.f10120R = r12
            r0.addView(r1)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r12.<init>(r3, r4)
            r3 = 17
            r12.gravity = r3
            r1.setLayoutParams(r12)
            int r3 = ch.icoaching.wrio.keyboard.E.rv_symbols
            android.view.View r3 = r1.findViewById(r3)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r0.setContentRecyclerView(r3)
            androidx.recyclerview.widget.RecyclerView r3 = r37.getContentRecyclerView()
            androidx.recyclerview.widget.LinearLayoutManager r4 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r12 = r37.getContext()
            r13 = 1
            r4.<init>(r12, r13, r15)
            r3.setLayoutManager(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r50 == 0) goto L_0x0335
            if (r41 != 0) goto L_0x032f
            android.content.Context r4 = r37.getContext()
            r12 = r40
            kotlin.jvm.internal.o.d(r4, r12)
            boolean r4 = ch.icoaching.wrio.C0551o.b(r4)
            if (r4 == 0) goto L_0x032f
            ch.icoaching.wrio.keyboard.view.U$a r4 = ch.icoaching.wrio.keyboard.view.U.a.f10314a
            r3.add(r4)
            ch.icoaching.wrio.keyboard.view.U$c r4 = ch.icoaching.wrio.keyboard.view.U.c.f10316a
            r3.add(r4)
            goto L_0x0347
        L_0x032f:
            ch.icoaching.wrio.keyboard.view.U$b r4 = ch.icoaching.wrio.keyboard.view.U.b.f10315a
            r3.add(r4)
            goto L_0x0347
        L_0x0335:
            androidx.recyclerview.widget.RecyclerView r4 = r37.getContentRecyclerView()
            T0.a r12 = new T0.a
            r14 = 20
            int r14 = ch.icoaching.wrio.C0553q.a(r14)
            r12.<init>(r14)
            r4.j(r12)
        L_0x0347:
            if (r2 != 0) goto L_0x034a
            r2 = r13
        L_0x034a:
            java.util.Set r4 = r38.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0352:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x037b
            java.lang.Object r11 = r4.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r11.getValue()
            java.util.List r11 = (java.util.List) r11
            ch.icoaching.wrio.keyboard.view.U$e r13 = new ch.icoaching.wrio.keyboard.view.U$e
            r13.<init>(r12)
            r3.add(r13)
            ch.icoaching.wrio.keyboard.view.z r12 = new ch.icoaching.wrio.keyboard.view.z
            r12.<init>(r3)
            kotlin.collections.C0718m.K(r11, r2, r12)
            goto L_0x0352
        L_0x037b:
            ch.icoaching.wrio.keyboard.view.SymbolsRecyclerViewAdapter r2 = new ch.icoaching.wrio.keyboard.view.SymbolsRecyclerViewAdapter
            int r4 = r0.f10117O
            ch.icoaching.wrio.keyboard.model.ThemeModel$SpecialOverlaysTheme r33 = r37.getSpecialOverlayTheme()
            ch.icoaching.wrio.keyboard.view.A r11 = new ch.icoaching.wrio.keyboard.view.A
            r11.<init>(r0)
            r24 = r2
            r25 = r9
            r27 = r8
            r29 = r10
            r31 = r4
            r34 = r48
            r36 = r11
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r0.f10119Q = r2
            androidx.recyclerview.widget.RecyclerView r2 = r37.getContentRecyclerView()
            ch.icoaching.wrio.keyboard.view.SymbolsRecyclerViewAdapter r4 = r0.f10119Q
            if (r4 != 0) goto L_0x03a7
            kotlin.jvm.internal.o.p(r7)
            r4 = 0
        L_0x03a7:
            r2.setAdapter(r4)
            ch.icoaching.wrio.keyboard.view.SymbolsRecyclerViewAdapter r2 = r0.f10119Q
            if (r2 != 0) goto L_0x03b3
            kotlin.jvm.internal.o.p(r7)
            r12 = 0
            goto L_0x03b4
        L_0x03b3:
            r12 = r2
        L_0x03b4:
            r12.C(r3)
            boolean r2 = r37.y()
            if (r2 != 0) goto L_0x03c0
            r0.m(r6)
        L_0x03c0:
            androidx.recyclerview.widget.RecyclerView r2 = r37.getContentRecyclerView()
            ch.icoaching.wrio.keyboard.view.B$a r3 = new ch.icoaching.wrio.keyboard.view.B$a
            r3.<init>(r0)
            r2.m(r3)
            r0.v(r1, r5)
            return
        L_0x03d0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Screen height must be greater than 0. Screen height is "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x03eb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Height must be greater than 0. Height is "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x0406:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Width must be greater than 0. Width is "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.view.B.R(java.util.Map, ch.icoaching.wrio.keyboard.model.ThemeModel$SpecialOverlaysTheme, android.graphics.drawable.Drawable, boolean, int, int, int, int, int, ch.icoaching.wrio.keyboard.A, boolean, boolean, boolean):void");
    }

    public final void U(List list) {
        o.e(list, "quickAccessSymbolsList");
        List v02 = C0718m.v0(list, this.f10120R);
        SymbolsRecyclerViewAdapter symbolsRecyclerViewAdapter = this.f10119Q;
        if (symbolsRecyclerViewAdapter == null) {
            o.p("symbolsAdapter");
            symbolsRecyclerViewAdapter = null;
        }
        symbolsRecyclerViewAdapter.E(v02);
    }

    public void z(PointF pointF, C0536k.a aVar) {
        View W3;
        View W4;
        o.e(pointF, "eventOrigin");
        o.e(aVar, "positionedClickableView");
        View b4 = aVar.b();
        A a4 = null;
        if (b4 instanceof ImageView) {
            A a5 = this.f10118P;
            if (a5 == null) {
                o.p("onKeyEventListenerInternal");
                a5 = null;
            }
            a5.a();
            int id = ((ImageView) b4).getId();
            if (id == E.iv_backspace) {
                C(1);
                H();
            } else if (id == E.iv_space) {
                A a6 = this.f10118P;
                if (a6 == null) {
                    o.p("onKeyEventListenerInternal");
                    a6 = null;
                }
                a6.e(' ');
                A a7 = this.f10118P;
                if (a7 == null) {
                    o.p("onKeyEventListenerInternal");
                } else {
                    a4 = a7;
                }
                a4.d();
            } else if (id == E.iv_return) {
                A a8 = this.f10118P;
                if (a8 == null) {
                    o.p("onKeyEventListenerInternal");
                    a8 = null;
                }
                a8.e(10);
                A a9 = this.f10118P;
                if (a9 == null) {
                    o.p("onKeyEventListenerInternal");
                } else {
                    a4 = a9;
                }
                a4.d();
            } else {
                A a10 = this.f10118P;
                if (a10 == null) {
                    o.p("onKeyEventListenerInternal");
                } else {
                    a4 = a10;
                }
                a4.c();
            }
        } else if ((b4 instanceof RecyclerView) && (W3 = getContentRecyclerView().W(pointF.x, pointF.y)) != null) {
            if (W3 instanceof FrameLayout) {
                View childAt = ((FrameLayout) W3).getChildAt(0);
                if ((childAt instanceof RecyclerView) && (W4 = ((RecyclerView) childAt).W(pointF.x - ((float) this.f10117O), 0.0f)) != null) {
                    A a11 = this.f10118P;
                    if (a11 == null) {
                        o.p("onKeyEventListenerInternal");
                    } else {
                        a4 = a11;
                    }
                    a4.a();
                    W4.performClick();
                }
            } else if (W3 instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) W3;
                View childAt2 = constraintLayout.getChildAt(0);
                o.c(childAt2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                RecyclerView recyclerView = (RecyclerView) childAt2;
                View W5 = recyclerView.W(pointF.x - recyclerView.getX(), pointF.y - constraintLayout.getY());
                if (W5 != null) {
                    A a12 = this.f10118P;
                    if (a12 == null) {
                        o.p("onKeyEventListenerInternal");
                    } else {
                        a4 = a12;
                    }
                    a4.a();
                    W5.performClick();
                    return;
                }
                View childAt3 = constraintLayout.getChildAt(1);
                o.c(childAt3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                RecyclerView recyclerView2 = (RecyclerView) childAt3;
                View W6 = recyclerView2.W(pointF.x - recyclerView2.getX(), pointF.y - constraintLayout.getY());
                if (W6 != null) {
                    A a13 = this.f10118P;
                    if (a13 == null) {
                        o.p("onKeyEventListenerInternal");
                    } else {
                        a4 = a13;
                    }
                    a4.a();
                    W6.performClick();
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public B(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        addOnLayoutChangeListener(new y(this));
    }
}
