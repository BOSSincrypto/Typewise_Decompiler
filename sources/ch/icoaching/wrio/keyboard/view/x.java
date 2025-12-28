package ch.icoaching.wrio.keyboard.view;

import M0.b;
import M0.c;
import M0.d;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.icoaching.wrio.C0551o;
import ch.icoaching.wrio.C0553q;
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
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import u2.p;

public final class x extends KeyboardLayoutView {

    /* renamed from: h0  reason: collision with root package name */
    private int f10543h0;

    /* renamed from: i0  reason: collision with root package name */
    private int f10544i0;

    /* renamed from: j0  reason: collision with root package name */
    private boolean f10545j0;

    /* renamed from: k0  reason: collision with root package name */
    private boolean f10546k0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public x(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    /* access modifiers changed from: private */
    public static final void W(x xVar, View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        Log log = Log.f10572a;
        Log.d(log, "RectangleKeyboardLayoutView", "OnLayoutChange() :: (" + i4 + ", " + i5 + ", " + i6 + ", " + i7 + ')', (Throwable) null, 4, (Object) null);
        xVar.getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().clear();
        xVar.X();
        xVar.R();
        xVar.S();
    }

    private final void X() {
        float f4;
        int i4;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            o.c(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) childAt;
            float x3 = linearLayout.getX();
            float y3 = linearLayout.getY();
            int childCount2 = linearLayout.getChildCount();
            int i6 = 0;
            while (i6 < childCount2) {
                View childAt2 = linearLayout.getChildAt(i6);
                o.c(childAt2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                ConstraintLayout constraintLayout = (ConstraintLayout) childAt2;
                float x4 = constraintLayout.getX();
                float y4 = constraintLayout.getY();
                int childCount3 = constraintLayout.getChildCount();
                int i7 = 0;
                while (i7 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i7);
                    o.c(childAt3, "null cannot be cast to non-null type ch.icoaching.wrio.keyboard.view.KeyView");
                    C0531f fVar = (C0531f) childAt3;
                    if (fVar.getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease() == null) {
                        i4 = childCount;
                    } else {
                        i4 = childCount;
                        getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().add(new KeyboardLayoutView.b(new PointF(x3 + x4 + fVar.getX(), y3 + y4 + fVar.getY()), fVar, (PointF) null, 4, (i) null));
                    }
                    i7++;
                    childCount = i4;
                }
                int i8 = childCount;
                i6++;
            }
            int i9 = childCount;
        }
        f();
        if (getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().size() > 1) {
            f4 = C0559x.a(getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().get(0).c(), getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease().get(1).c());
        } else {
            f4 = 0.0f;
        }
        List<KeyboardLayoutView.b> keys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease = getKeys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
        ArrayList<KeyboardLayoutView.b> arrayList = new ArrayList<>();
        for (T next : keys$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease) {
            d model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease = ((KeyboardLayoutView.b) next).g().getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
            o.b(model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease);
            if (o.a(model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.f(), d.b.l.INSTANCE) || o.a(model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.f(), d.b.n.INSTANCE) || (model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.f() instanceof d.b.C0008b) || (model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.f() instanceof d.b.o) || (model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease.f() instanceof d.b.c)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (KeyboardLayoutView.b bVar : arrayList) {
            d model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2 = bVar.g().getModel$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease();
            o.b(model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2);
            d.b f5 = model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.f();
            if (o.a(f5, d.b.l.INSTANCE)) {
                arrayList2.add(new b(10, bVar.g().getCode$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(), N.b(bVar), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.g(), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.e()));
            } else if (o.a(f5, d.b.n.INSTANCE)) {
                arrayList2.add(new b(' ', bVar.g().getCode$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(), N.b(bVar), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.g(), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.e()));
            } else if (f5 instanceof d.b.C0008b) {
                arrayList2.add(new b(((d.b.C0008b) model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.f()).e(), bVar.g().getCode$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(), N.b(bVar), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.g(), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.e()));
            } else if (f5 instanceof d.b.o) {
                arrayList2.add(new b(((d.b.o) model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.f()).e(), bVar.g().getCode$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(), N.b(bVar), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.g(), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.e()));
                arrayList2.add(new b(((d.b.o) model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.f()).f(), bVar.g().getCode$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(), N.b(bVar), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.g(), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.e()));
            } else if (f5 instanceof d.b.c) {
                arrayList2.add(new b(((d.b.c) model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.f()).f(), bVar.g().getCode$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(), N.b(bVar), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.g(), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.e()));
                if (((d.b.c) model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.f()).h() != null) {
                    arrayList2.add(new b(((d.b.c) model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.f()).h().charValue(), bVar.g().getCode$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease(), N.b(bVar), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.g(), model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.e()));
                }
            } else {
                throw new IllegalStateException(model$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease2.f() + " key shouldn't be converted into a character. This key type should have been filtered out.");
            }
        }
        getKeyCentresFlowInner().d(new c(f4, arrayList2));
    }

    private final void Y(JsonConfig.Keyboard.Layout layout, int i4, ThemeModel themeModel) {
        int size = layout.getColumns().size();
        List<JsonConfig.Keyboard.Layout.Column> r02 = C0718m.r0(layout.getColumns(), new C0547w(new C0546v()));
        if (layout.getDefaultKeyHeight() != null) {
            float n4 = KeyboardLayoutView.n(this, layout.getColumns(), false, 1, (Object) null);
            float a4 = (float) C0553q.a(layout.getDefaultKeyHeight().intValue());
            float f4 = 0.05f * a4;
            setKeyboardPadding((int) f4);
            setKeyPadding((int) ((float) Math.rint((double) f4)));
            int i5 = (int) a4;
            float keyboardPadding = ((float) (i4 - (getKeyboardPadding() * 2))) / ((float) size);
            setStandardKeyWidth((int) (keyboardPadding / n4));
            this.f10544i0 = (int) keyboardPadding;
            int i6 = 0;
            for (JsonConfig.Keyboard.Layout.Column column : r02) {
                int i7 = i6 + 1;
                List<JsonConfig.Keyboard.Layout.Column.Row> rows = column.getRows();
                int i8 = this.f10544i0;
                JsonConfig.Keyboard.Layout.Column.Alignment alignment = column.getAlignment();
                if (alignment == null) {
                    alignment = JsonConfig.Keyboard.Layout.Column.Alignment.CENTER;
                }
                b0(rows, i8, O(alignment), getStandardKeyWidth(), i5, i6, themeModel);
                i6 = i7;
            }
            this.f10543h0 = ((int) n4) * r02.size();
            I();
            return;
        }
        throw new IllegalArgumentException("defaultKeyHeight must be set for rectangle layout");
    }

    /* access modifiers changed from: private */
    public static final int Z(JsonConfig.Keyboard.Layout.Column column, JsonConfig.Keyboard.Layout.Column column2) {
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
    public static final int a0(p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    private final void b0(List list, int i4, int i5, int i6, int i7, int i8, ThemeModel themeModel) {
        int i9 = i5;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(i9);
        linearLayout.setClipChildren(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, -2);
        layoutParams.gravity = i9;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackgroundColor(0);
        addView(linearLayout);
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            d0(linearLayout, i4, (JsonConfig.Keyboard.Layout.Column.Row) it.next(), i6, i7, i8, i10, themeModel);
            i10++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final ch.icoaching.wrio.keyboard.view.O c0(ch.icoaching.wrio.keyboard.model.config.JsonConfig.Keyboard.Layout.Column.Row.Key r3, int r4, int r5, int r6, int r7, int r8, ch.icoaching.wrio.keyboard.model.ThemeModel r9) {
        /*
            r2 = this;
            java.lang.Float r0 = r3.getWidth()
            if (r0 == 0) goto L_0x000b
            float r0 = r0.floatValue()
            goto L_0x000d
        L_0x000b:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x000d:
            float r4 = (float) r4
            float r4 = r4 * r0
            double r0 = (double) r4
            double r0 = java.lang.Math.rint(r0)
            float r4 = (float) r0
            int r4 = (int) r4
            M0.d r3 = r2.P(r3, r4, r5)
            ch.icoaching.wrio.keyboard.view.O$a r4 = ch.icoaching.wrio.keyboard.view.O.f10266B
            android.content.Context r5 = r2.getContext()
            java.lang.String r0 = "getContext(...)"
            kotlin.jvm.internal.o.d(r5, r0)
            ch.icoaching.wrio.keyboard.view.O r4 = r4.a(r5, r3, r9)
            ch.icoaching.wrio.keyboard.KeyCase r5 = r2.getKeyCase()
            r4.setCase(r5)
            int r6 = r6 * 1000
            int r7 = r7 * 100
            int r6 = r6 + r7
            int r6 = r6 + r8
            r4.setCode(r6)
            boolean r5 = r2.getShowNumbersOnMainLayout()
            r2.M(r5)
            boolean r5 = r2.getShowTinyCharacters()
            r2.N(r5)
            M0.d$b r5 = r3.f()
            boolean r5 = r5 instanceof M0.d.b.o
            if (r5 == 0) goto L_0x0099
            M0.d$b r5 = r3.f()
            M0.d$b$o r5 = (M0.d.b.o) r5
            java.lang.String r5 = r5.g()
            java.lang.String r6 = "split1"
            boolean r6 = kotlin.jvm.internal.o.a(r5, r6)
            if (r6 == 0) goto L_0x0074
            ch.icoaching.wrio.keyboard.u r5 = r2.getCustomCharactersProviderInternal()
            if (r5 == 0) goto L_0x008f
            java.lang.Character[] r5 = r5.d()
            if (r5 == 0) goto L_0x008f
            java.lang.Object r5 = kotlin.collections.C0713h.A(r5)
            java.lang.Character r5 = (java.lang.Character) r5
            goto L_0x0090
        L_0x0074:
            java.lang.String r6 = "split2"
            boolean r5 = kotlin.jvm.internal.o.a(r5, r6)
            if (r5 == 0) goto L_0x008f
            ch.icoaching.wrio.keyboard.u r5 = r2.getCustomCharactersProviderInternal()
            if (r5 == 0) goto L_0x008f
            java.lang.Character[] r5 = r5.a()
            if (r5 == 0) goto L_0x008f
            java.lang.Object r5 = kotlin.collections.C0713h.A(r5)
            java.lang.Character r5 = (java.lang.Character) r5
            goto L_0x0090
        L_0x008f:
            r5 = 0
        L_0x0090:
            if (r5 == 0) goto L_0x0099
            char r5 = r5.charValue()
            r4.setTertiaryCharacter((char) r5)
        L_0x0099:
            boolean r5 = r2.getShowTinyCharacters()
            if (r5 == 0) goto L_0x00b0
            M0.d$b r5 = r3.f()
            boolean r5 = r5 instanceof M0.d.b.c
            if (r5 == 0) goto L_0x00b0
            M0.d$b r3 = r3.f()
            M0.d$b$c r3 = (M0.d.b.c) r3
            r2.H(r4, r3)
        L_0x00b0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.keyboard.view.x.c0(ch.icoaching.wrio.keyboard.model.config.JsonConfig$Keyboard$Layout$Column$Row$Key, int, int, int, int, int, ch.icoaching.wrio.keyboard.model.ThemeModel):ch.icoaching.wrio.keyboard.view.O");
    }

    private final void d0(LinearLayout linearLayout, int i4, JsonConfig.Keyboard.Layout.Column.Row row, int i5, int i6, int i7, int i8, ThemeModel themeModel) {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        int i9 = i4;
        constraintLayout.setLayoutParams(new LinearLayout.LayoutParams(i4, -2));
        int i10 = 0;
        constraintLayout.setBackgroundColor(0);
        constraintLayout.setId(View.generateViewId());
        constraintLayout.setClipChildren(false);
        LinearLayout linearLayout2 = linearLayout;
        linearLayout.addView(constraintLayout);
        ArrayList<View> arrayList = new ArrayList<>();
        for (JsonConfig.Keyboard.Layout.Column.Row.Key c02 : row.getRowItems()) {
            int i11 = i10 + 1;
            O c03 = c0(c02, i5, i6, i7, i8, i10, themeModel);
            constraintLayout.addView(c03);
            if (i10 == 0) {
                androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                cVar.f(constraintLayout);
                androidx.constraintlayout.widget.c cVar2 = cVar;
                cVar2.h(c03.getId(), 3, 0, 3, 0);
                cVar2.h(c03.getId(), 4, 0, 4, 0);
                cVar2.h(c03.getId(), 1, 0, 1, 0);
                cVar.c(constraintLayout);
            } else if (i10 == C0718m.l(row.getRowItems())) {
                androidx.constraintlayout.widget.c cVar3 = new androidx.constraintlayout.widget.c();
                cVar3.f(constraintLayout);
                androidx.constraintlayout.widget.c cVar4 = cVar3;
                cVar4.h(c03.getId(), 3, 0, 3, 0);
                cVar4.h(c03.getId(), 4, 0, 4, 0);
                cVar4.h(c03.getId(), 2, 0, 2, 0);
                cVar3.c(constraintLayout);
            } else {
                androidx.constraintlayout.widget.c cVar5 = new androidx.constraintlayout.widget.c();
                cVar5.f(constraintLayout);
                androidx.constraintlayout.widget.c cVar6 = cVar5;
                cVar6.h(c03.getId(), 3, 0, 3, 0);
                cVar6.h(c03.getId(), 4, 0, 4, 0);
                cVar6.h(c03.getId(), 1, ((View) C0718m.b0(arrayList)).getId(), 2, 0);
                cVar5.c(constraintLayout);
            }
            arrayList.add(c03);
            i10 = i11;
        }
        ArrayList arrayList2 = new ArrayList(C0718m.t(arrayList, 10));
        for (View id : arrayList) {
            arrayList2.add(Integer.valueOf(id.getId()));
        }
        int[] A02 = C0718m.A0(arrayList2);
        androidx.constraintlayout.widget.c cVar7 = new androidx.constraintlayout.widget.c();
        cVar7.f(constraintLayout);
        cVar7.k(0, 1, 0, 2, A02, (float[]) null, 1);
        cVar7.c(constraintLayout);
    }

    public final void e0() {
        this.f10546k0 = true;
    }

    public final void f0() {
        this.f10545j0 = true;
    }

    public int getColumnWidth() {
        return this.f10544i0;
    }

    public KeyboardLayoutView.a getDiacriticsParams$typewise_sdk_keyboard_ui_2_4_40_219__typewiseRemoteRelease() {
        return new KeyboardLayoutView.a(getKeyPadding() * 2, C0553q.a(3), false);
    }

    /* access modifiers changed from: protected */
    public int k(int i4) {
        if (i4 > getStandardKeyWidth()) {
            return this.f10544i0 / i4;
        }
        return this.f10543h0;
    }

    public void y(JsonConfig.Keyboard keyboard, ThemeModel themeModel, int i4, int i5, boolean z3, int i6) {
        boolean z4;
        o.e(keyboard, "keyboardConfiguration");
        o.e(themeModel, "theme");
        super.y(keyboard, themeModel, i4, i5, z3, i6);
        Context context = getContext();
        o.d(context, "getContext(...)");
        if (C0551o.b(context) || z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 || !themeModel.getIgnoreBackgroundImageInLandscape()) {
            setBackground(new C0555t(getKeyboardTheme().getBackground()));
        } else {
            setBackgroundColor(getKeyboardTheme().getBackgroundColor());
        }
        if (this.f10545j0) {
            if (keyboard.getNumbers() != null) {
                Y(keyboard.getNumbers(), i4, getKeyboardTheme());
                return;
            }
            throw new IllegalArgumentException("More numbers cannot be null");
        } else if (this.f10546k0) {
            if (keyboard.getMath() != null) {
                Y(keyboard.getMath(), i4, getKeyboardTheme());
                return;
            }
            throw new IllegalArgumentException("More math cannot be null");
        } else if (z4 || z3) {
            Y(keyboard.getLandscape(), i4, getKeyboardTheme());
        } else {
            Y(keyboard.getPortrait(), i4, getKeyboardTheme());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        addOnLayoutChangeListener(new C0545u(this));
    }
}
