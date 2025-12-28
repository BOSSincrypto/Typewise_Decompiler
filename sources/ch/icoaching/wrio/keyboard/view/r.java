package ch.icoaching.wrio.keyboard.view;

import M0.b;
import M0.c;
import M0.d;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ch.icoaching.wrio.C0551o;
import ch.icoaching.wrio.C0555t;
import ch.icoaching.wrio.C0559x;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.keyboard.model.config.JsonConfig;
import ch.icoaching.wrio.keyboard.view.KeyboardLayoutView;
import ch.icoaching.wrio.logging.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import u2.p;

public final class r extends KeyboardLayoutView {

    /* renamed from: h0  reason: collision with root package name */
    private int f10441h0;

    /* renamed from: i0  reason: collision with root package name */
    private int f10442i0;

    /* renamed from: j0  reason: collision with root package name */
    private int f10443j0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    /* access modifiers changed from: private */
    public static final void W(r rVar, View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        Log log = Log.f10572a;
        Log.d(log, "HexagonKeyboardLayoutView", "OnLayoutChange() :: (" + i4 + ", " + i5 + ", " + i6 + ", " + i7 + ')', (Throwable) null, 4, (Object) null);
        rVar.getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().clear();
        rVar.X();
        rVar.R();
        rVar.S();
    }

    private final void X() {
        float f4;
        float f5;
        String str;
        int i4;
        LinearLayout linearLayout;
        d.b bVar;
        PointF pointF;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            String str2 = "null cannot be cast to non-null type android.widget.LinearLayout";
            o.c(childAt, str2);
            LinearLayout linearLayout2 = (LinearLayout) childAt;
            float x3 = linearLayout2.getX();
            float y3 = linearLayout2.getY();
            int childCount2 = linearLayout2.getChildCount();
            int i6 = 0;
            while (i6 < childCount2) {
                View childAt2 = linearLayout2.getChildAt(i6);
                o.c(childAt2, str2);
                LinearLayout linearLayout3 = (LinearLayout) childAt2;
                float x4 = linearLayout3.getX();
                float y4 = linearLayout3.getY();
                int childCount3 = linearLayout3.getChildCount();
                int i7 = 0;
                while (i7 < childCount3) {
                    View childAt3 = linearLayout3.getChildAt(i7);
                    o.c(childAt3, "null cannot be cast to non-null type ch.icoaching.wrio.keyboard.view.KeyView");
                    C0531f fVar = (C0531f) childAt3;
                    if (fVar.getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease() == null) {
                        i4 = childCount;
                        linearLayout = linearLayout2;
                        str = str2;
                        f5 = x3;
                    } else {
                        float x5 = x3 + x4 + fVar.getX();
                        i4 = childCount;
                        float y5 = y3 + y4 + fVar.getY();
                        d model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease = fVar.getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
                        if (model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease != null) {
                            bVar = model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.f();
                            linearLayout = linearLayout2;
                        } else {
                            linearLayout = linearLayout2;
                            bVar = null;
                        }
                        if (o.a(bVar, d.b.m.INSTANCE)) {
                            str = str2;
                            f5 = x3;
                            pointF = new PointF(((float) (-fVar.getWidth())) / 2.0f, 0.0f);
                        } else {
                            str = str2;
                            f5 = x3;
                            if (o.a(bVar, d.b.a.INSTANCE)) {
                                pointF = new PointF(((float) fVar.getWidth()) / 2.0f, 0.0f);
                            } else {
                                pointF = null;
                            }
                        }
                        if (!o.a(bVar, d.b.f.INSTANCE)) {
                            getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().add(new KeyboardLayoutView.b(new PointF(x5, y5), fVar, pointF));
                        }
                    }
                    i7++;
                    linearLayout2 = linearLayout;
                    childCount = i4;
                    str2 = str;
                    x3 = f5;
                }
                int i8 = childCount;
                LinearLayout linearLayout4 = linearLayout2;
                String str3 = str2;
                float f6 = x3;
                i6++;
            }
            int i9 = childCount;
        }
        f();
        if (getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().size() > 2) {
            f4 = C0559x.a(getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().get(1).c(), getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().get(2).c());
        } else {
            f4 = 0.0f;
        }
        List<KeyboardLayoutView.b> keys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease = getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
        ArrayList<KeyboardLayoutView.b> arrayList = new ArrayList<>();
        for (T next : keys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease) {
            d model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2 = ((KeyboardLayoutView.b) next).g().getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
            o.b(model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2);
            if (o.a(model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.f(), d.b.l.INSTANCE) || o.a(model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.f(), d.b.n.INSTANCE) || (model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.f() instanceof d.b.C0008b) || (model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.f() instanceof d.b.o) || (model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.f() instanceof d.b.c)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (KeyboardLayoutView.b bVar2 : arrayList) {
            d model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3 = bVar2.g().getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
            o.b(model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3);
            d.b f7 = model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.f();
            if (o.a(f7, d.b.l.INSTANCE)) {
                arrayList2.add(new b(10, bVar2.g().getCode$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(), N.b(bVar2), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.g(), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.e()));
            } else if (o.a(f7, d.b.n.INSTANCE)) {
                arrayList2.add(new b(' ', bVar2.g().getCode$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(), N.b(bVar2), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.g(), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.e()));
            } else if (f7 instanceof d.b.C0008b) {
                arrayList2.add(new b(((d.b.C0008b) model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.f()).e(), bVar2.g().getCode$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(), N.b(bVar2), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.g(), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.e()));
            } else if (f7 instanceof d.b.o) {
                arrayList2.add(new b(((d.b.o) model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.f()).e(), bVar2.g().getCode$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(), N.b(bVar2), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.g(), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.e()));
                arrayList2.add(new b(((d.b.o) model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.f()).f(), bVar2.g().getCode$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(), N.b(bVar2), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.g(), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.e()));
            } else if (f7 instanceof d.b.c) {
                arrayList2.add(new b(((d.b.c) model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.f()).f(), bVar2.g().getCode$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(), N.b(bVar2), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.g(), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.e()));
                if (((d.b.c) model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.f()).h() != null) {
                    arrayList2.add(new b(((d.b.c) model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.f()).h().charValue(), bVar2.g().getCode$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(), N.b(bVar2), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.g(), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.e()));
                }
            } else {
                throw new IllegalStateException(model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease3.f() + " key shouldn't be converted into a character. This key type should have been filtered out.");
            }
        }
        getKeyCentresFlowInner().d(new c(f4, arrayList2));
    }

    private final float Y(float f4, int i4) {
        return f4 / (((float) 1) + (((float) (i4 - 1)) * 0.725f));
    }

    private final void Z(JsonConfig.Keyboard.Layout layout, ThemeModel themeModel, float f4, float f5, int i4, int i5, boolean z3) {
        int i6 = i4;
        int i7 = i5;
        int size = layout.getColumns().size();
        List<JsonConfig.Keyboard.Layout.Column> r02 = C0718m.r0(layout.getColumns(), new C0541p(new C0540o()));
        float n4 = KeyboardLayoutView.n(this, r02, false, 1, (Object) null);
        setKeyboardPadding((int) (((float) i6) * 0.01f));
        float keyboardPadding = (float) (i6 - (getKeyboardPadding() * 2));
        float f6 = keyboardPadding * f4;
        float min = Math.min(keyboardPadding / ((float) size), f6);
        float keyboardPadding2 = (((float) i7) * f5) - ((float) (getKeyboardPadding() * 2));
        float Y3 = Y(keyboardPadding2, L.b(r02));
        Log log = Log.f10572a;
        Log log2 = log;
        Log.d(log2, "HexagonKeyboardLayoutView", "inflateKeyboardLayout() :: Screen size: " + i6 + " x " + i7, (Throwable) null, 4, (Object) null);
        StringBuilder sb = new StringBuilder();
        sb.append("inflateKeyboardLayout() :: Keyboard padding: ");
        sb.append(getKeyboardPadding());
        Log.d(log2, "HexagonKeyboardLayoutView", sb.toString(), (Throwable) null, 4, (Object) null);
        Log.d(log2, "HexagonKeyboardLayoutView", "inflateKeyboardLayout() :: Max column width: " + f6, (Throwable) null, 4, (Object) null);
        Log.d(log2, "HexagonKeyboardLayoutView", "inflateKeyboardLayout() :: Max keyboard height: " + keyboardPadding2, (Throwable) null, 4, (Object) null);
        Log.d(log2, "HexagonKeyboardLayoutView", "inflateKeyboardLayout() :: Max key(with padding) height: " + Y3, (Throwable) null, 4, (Object) null);
        float f7 = min / n4;
        setKeyPadding((int) ((float) Math.rint((double) (f7 * 0.025f))));
        setStandardKeyWidth((int) f7);
        int rint = (int) Math.rint(((double) getStandardKeyWidth()) * 1.1547005384d);
        Log.d(log2, "HexagonKeyboardLayoutView", "inflateKeyboardLayout() :: Key size (1st try): " + getStandardKeyWidth() + " x " + rint, (Throwable) null, 4, (Object) null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("inflateKeyboardLayout() :: Key padding (1st try): ");
        sb2.append(getKeyPadding());
        Log.d(log2, "HexagonKeyboardLayoutView", sb2.toString(), (Throwable) null, 4, (Object) null);
        if (((float) rint) > Y3) {
            double d4 = ((double) Y3) / 1.1547005384d;
            setKeyPadding((int) Math.rint(((double) 0.025f) * d4));
            setStandardKeyWidth((int) d4);
            rint = (int) Math.rint(((double) getStandardKeyWidth()) * 1.1547005384d);
            Log log3 = log;
            Log.d(log3, "HexagonKeyboardLayoutView", "inflateKeyboardLayout() :: Key size (2nd try): " + getStandardKeyWidth() + " x " + rint, (Throwable) null, 4, (Object) null);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("inflateKeyboardLayout() :: Key padding (2nd try): ");
            sb3.append(getKeyPadding());
            Log.d(log3, "HexagonKeyboardLayoutView", sb3.toString(), (Throwable) null, 4, (Object) null);
        }
        int i8 = rint;
        this.f10443j0 = (int) (((float) getStandardKeyWidth()) * n4);
        Log.d(log, "HexagonKeyboardLayoutView", "inflateKeyboardLayout() :: Actual column width: " + this.f10443j0, (Throwable) null, 4, (Object) null);
        int i9 = 0;
        for (JsonConfig.Keyboard.Layout.Column column : r02) {
            int i10 = i9 + 1;
            List<JsonConfig.Keyboard.Layout.Column.Row> rows = column.getRows();
            int i11 = this.f10443j0;
            JsonConfig.Keyboard.Layout.Column.Alignment alignment = column.getAlignment();
            if (alignment == null) {
                alignment = JsonConfig.Keyboard.Layout.Column.Alignment.CENTER;
            }
            e0(rows, i11, O(alignment), getStandardKeyWidth(), i8, getKeyPadding(), i9, themeModel, z3);
            i9 = i10;
        }
        this.f10441h0 = ((int) n4) * r02.size();
        I();
    }

    static /* synthetic */ void b0(r rVar, JsonConfig.Keyboard.Layout layout, ThemeModel themeModel, float f4, float f5, int i4, int i5, boolean z3, int i6, Object obj) {
        boolean z4;
        if ((i6 & 64) != 0) {
            z4 = false;
        } else {
            z4 = z3;
        }
        rVar.Z(layout, themeModel, f4, f5, i4, i5, z4);
    }

    /* access modifiers changed from: private */
    public static final int c0(JsonConfig.Keyboard.Layout.Column column, JsonConfig.Keyboard.Layout.Column column2) {
        if (column.getAlignment() == column2.getAlignment()) {
            return 0;
        }
        JsonConfig.Keyboard.Layout.Column.Alignment alignment = column.getAlignment();
        JsonConfig.Keyboard.Layout.Column.Alignment alignment2 = JsonConfig.Keyboard.Layout.Column.Alignment.LEFT;
        if (alignment != alignment2 && (column.getAlignment() == JsonConfig.Keyboard.Layout.Column.Alignment.RIGHT || column2.getAlignment() == alignment2)) {
            return 1;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static final int d0(p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    private final void e0(List list, int i4, int i5, int i6, int i7, int i8, int i9, ThemeModel themeModel, boolean z3) {
        int i10 = i5;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(i10);
        linearLayout.setClipChildren(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, -2);
        layoutParams.gravity = i10;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackgroundColor(0);
        addView(linearLayout);
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            g0(linearLayout, (JsonConfig.Keyboard.Layout.Column.Row) it.next(), i6, i7, i8, i9, i11, themeModel, z3);
            i11++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f0(android.widget.LinearLayout r10, ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key r11, int r12, int r13, int r14, int r15, int r16, ch.icoaching.wrio.keyboard.model.ThemeModel r17, boolean r18) {
        /*
            r9 = this;
            r0 = r9
            java.lang.Float r1 = r11.getWidth()
            if (r1 == 0) goto L_0x000d
            float r1 = r1.floatValue()
        L_0x000b:
            r2 = r12
            goto L_0x0010
        L_0x000d:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x000b
        L_0x0010:
            float r2 = (float) r2
            float r2 = r2 * r1
            double r1 = (double) r2
            double r1 = java.lang.Math.rint(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            r2 = r11
            r3 = r13
            M0.d r2 = r9.P(r11, r1, r13)
            if (r18 == 0) goto L_0x003d
            M0.d$b r1 = r2.f()
            M0.d$b$e r3 = M0.d.b.e.INSTANCE
            boolean r1 = kotlin.jvm.internal.o.a(r1, r3)
            if (r1 == 0) goto L_0x003d
            M0.d$b$d r3 = M0.d.b.C0011d.INSTANCE
            r7 = 14
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            M0.d r2 = M0.d.c(r2, r3, r4, r5, r6, r7, r8)
            r1 = 1
            r9.setInHexagonLandscape(r1)
        L_0x003d:
            ch.icoaching.wrio.keyboard.view.J$a r1 = ch.icoaching.wrio.keyboard.view.J.f10161z
            android.content.Context r3 = r9.getContext()
            java.lang.String r4 = "getContext(...)"
            kotlin.jvm.internal.o.d(r3, r4)
            r4 = r17
            ch.icoaching.wrio.keyboard.view.J r1 = r1.a(r3, r2, r4)
            M0.d$b r3 = r2.f()
            boolean r3 = r3 instanceof M0.d.b.o
            if (r3 == 0) goto L_0x00a0
            M0.d$b r3 = r2.f()
            M0.d$b$o r3 = (M0.d.b.o) r3
            java.lang.String r3 = r3.g()
            java.lang.String r4 = "split1"
            boolean r4 = kotlin.jvm.internal.o.a(r3, r4)
            if (r4 == 0) goto L_0x007b
            ch.icoaching.wrio.keyboard.u r3 = r9.getCustomCharactersProviderInternal()
            if (r3 == 0) goto L_0x0096
            java.lang.Character[] r3 = r3.d()
            if (r3 == 0) goto L_0x0096
            java.lang.Object r3 = kotlin.collections.C0713h.A(r3)
            java.lang.Character r3 = (java.lang.Character) r3
            goto L_0x0097
        L_0x007b:
            java.lang.String r4 = "split2"
            boolean r3 = kotlin.jvm.internal.o.a(r3, r4)
            if (r3 == 0) goto L_0x0096
            ch.icoaching.wrio.keyboard.u r3 = r9.getCustomCharactersProviderInternal()
            if (r3 == 0) goto L_0x0096
            java.lang.Character[] r3 = r3.a()
            if (r3 == 0) goto L_0x0096
            java.lang.Object r3 = kotlin.collections.C0713h.A(r3)
            java.lang.Character r3 = (java.lang.Character) r3
            goto L_0x0097
        L_0x0096:
            r3 = 0
        L_0x0097:
            if (r3 == 0) goto L_0x00a0
            char r3 = r3.charValue()
            r1.setTertiaryCharacter((char) r3)
        L_0x00a0:
            boolean r3 = r9.getShowTinyCharacters()
            if (r3 == 0) goto L_0x00b7
            M0.d$b r3 = r2.f()
            boolean r3 = r3 instanceof M0.d.b.c
            if (r3 == 0) goto L_0x00b7
            M0.d$b r2 = r2.f()
            M0.d$b$c r2 = (M0.d.b.c) r2
            r9.H(r1, r2)
        L_0x00b7:
            ch.icoaching.wrio.keyboard.KeyCase r2 = r9.getKeyCase()
            r1.setCase(r2)
            r2 = r14
            int r2 = r2 * 1000
            int r3 = r15 * 100
            int r2 = r2 + r3
            int r2 = r2 + r16
            r1.setCode(r2)
            boolean r2 = r9.getShowNumbersOnMainLayout()
            r9.M(r2)
            boolean r2 = r9.getShowTinyCharacters()
            r9.N(r2)
            r2 = r10
            r10.addView(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.view.r.f0(android.widget.LinearLayout, ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key, int, int, int, int, int, ch.icoaching.wrio.keyboard.model.ThemeModel, boolean):void");
    }

    private final void g0(LinearLayout linearLayout, JsonConfig.Keyboard.Layout.Column.Row row, int i4, int i5, int i6, int i7, int i8, ThemeModel themeModel, boolean z3) {
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(1);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        linearLayout2.setClipChildren(false);
        linearLayout2.setBackgroundColor(0);
        LinearLayout linearLayout3 = linearLayout;
        linearLayout.addView(linearLayout2);
        if (i8 != 0) {
            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
            o.c(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = (int) (((float) i6) - (((float) i5) * 0.275f));
            linearLayout2.setLayoutParams(layoutParams2);
        } else {
            int i9 = i5;
        }
        int i10 = 0;
        for (JsonConfig.Keyboard.Layout.Column.Row.Key f02 : row.getRowItems()) {
            f0(linearLayout2, f02, i4, i5, i7, i8, i10, themeModel, z3);
            i10++;
        }
    }

    public final void a0(JsonConfig.Keyboard keyboard, ThemeModel themeModel, int i4, int i5, boolean z3, boolean z4, int i6) {
        JsonConfig.Keyboard keyboard2 = keyboard;
        o.e(keyboard, "keyboardConfiguration");
        ThemeModel themeModel2 = themeModel;
        o.e(themeModel, "theme");
        super.y(keyboard, themeModel, i4, i5, z3, i6);
        boolean z5 = true;
        setInHexagon(true);
        Context context = getContext();
        o.d(context, "getContext(...)");
        if (!C0551o.b(context) && !z3) {
            z5 = false;
        }
        if (!z5 || !themeModel.getIgnoreBackgroundImageInLandscape()) {
            setBackground(new C0555t(getKeyboardTheme().getBackground()));
        } else {
            setBackgroundColor(getKeyboardTheme().getBackgroundColor());
        }
        if (z5) {
            Z(keyboard.getLandscape(), getKeyboardTheme(), 0.3f, 0.55f, i4, i5, true);
        } else if (z4) {
            JsonConfig.Keyboard.Layout portraitNumbers = keyboard.getPortraitNumbers();
            o.b(portraitNumbers);
            b0(this, portraitNumbers, getKeyboardTheme(), 1.0f, 1.0f, i4, i5, false, 64, (Object) null);
        } else {
            b0(this, keyboard.getPortrait(), getKeyboardTheme(), 1.0f, 1.0f, i4, i5, false, 64, (Object) null);
        }
    }

    public int getColumnWidth() {
        return this.f10443j0;
    }

    public KeyboardLayoutView.a getDiacriticsParams$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease() {
        return new KeyboardLayoutView.a(0, this.f10442i0, true);
    }

    /* access modifiers changed from: protected */
    public int k(int i4) {
        if (i4 > getStandardKeyWidth()) {
            return this.f10443j0 / i4;
        }
        return this.f10441h0;
    }

    public void y(JsonConfig.Keyboard keyboard, ThemeModel themeModel, int i4, int i5, boolean z3, int i6) {
        o.e(keyboard, "keyboardConfiguration");
        o.e(themeModel, "theme");
        a0(keyboard, themeModel, i4, i5, z3, false, i6);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        addOnLayoutChangeListener(new C0542q(this));
    }
}
