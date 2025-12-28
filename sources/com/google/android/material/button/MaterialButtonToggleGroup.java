package com.google.android.material.button;

import Q1.k;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.core.view.C0402a;
import androidx.core.view.P;
import androidx.core.view.accessibility.A;
import androidx.core.view.r;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import z1.C0970a;
import z1.i;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k  reason: collision with root package name */
    private static final int f11709k = i.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: a  reason: collision with root package name */
    private final List f11710a;

    /* renamed from: b  reason: collision with root package name */
    private final e f11711b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashSet f11712c;

    /* renamed from: d  reason: collision with root package name */
    private final Comparator f11713d;

    /* renamed from: e  reason: collision with root package name */
    private Integer[] f11714e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11715f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11716g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11717h;

    /* renamed from: i  reason: collision with root package name */
    private final int f11718i;

    /* renamed from: j  reason: collision with root package name */
    private Set f11719j;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends C0402a {
        b() {
        }

        public void g(View view, A a4) {
            super.g(view, a4);
            a4.m0(A.g.a(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private static class c {

        /* renamed from: e  reason: collision with root package name */
        private static final Q1.c f11722e = new Q1.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        Q1.c f11723a;

        /* renamed from: b  reason: collision with root package name */
        Q1.c f11724b;

        /* renamed from: c  reason: collision with root package name */
        Q1.c f11725c;

        /* renamed from: d  reason: collision with root package name */
        Q1.c f11726d;

        c(Q1.c cVar, Q1.c cVar2, Q1.c cVar3, Q1.c cVar4) {
            this.f11723a = cVar;
            this.f11724b = cVar3;
            this.f11725c = cVar4;
            this.f11726d = cVar2;
        }

        public static c a(c cVar) {
            Q1.c cVar2 = f11722e;
            return new c(cVar2, cVar.f11726d, cVar2, cVar.f11725c);
        }

        public static c b(c cVar, View view) {
            if (m.g(view)) {
                return c(cVar);
            }
            return d(cVar);
        }

        public static c c(c cVar) {
            Q1.c cVar2 = cVar.f11723a;
            Q1.c cVar3 = cVar.f11726d;
            Q1.c cVar4 = f11722e;
            return new c(cVar2, cVar3, cVar4, cVar4);
        }

        public static c d(c cVar) {
            Q1.c cVar2 = f11722e;
            return new c(cVar2, cVar2, cVar.f11724b, cVar.f11725c);
        }

        public static c e(c cVar, View view) {
            if (m.g(view)) {
                return d(cVar);
            }
            return c(cVar);
        }

        public static c f(c cVar) {
            Q1.c cVar2 = cVar.f11723a;
            Q1.c cVar3 = f11722e;
            return new c(cVar2, cVar3, cVar.f11724b, cVar3);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i4, boolean z3);
    }

    private class e implements MaterialButton.a {
        private e() {
        }

        public void a(MaterialButton materialButton, boolean z3) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0970a.materialButtonToggleGroupStyle);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i4 = firstVisibleChildIndex + 1; i4 < getChildCount(); i4++) {
                MaterialButton h4 = h(i4);
                int min = Math.min(h4.getStrokeWidth(), h(i4 - 1).getStrokeWidth());
                LinearLayout.LayoutParams d4 = d(h4);
                if (getOrientation() == 0) {
                    r.c(d4, 0);
                    r.d(d4, -min);
                    d4.topMargin = 0;
                } else {
                    d4.bottomMargin = 0;
                    d4.topMargin = -min;
                    r.d(d4, 0);
                }
                h4.setLayoutParams(d4);
            }
            n(firstVisibleChildIndex);
        }
    }

    private LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void e(int i4, boolean z3) {
        if (i4 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i4);
            return;
        }
        HashSet hashSet = new HashSet(this.f11719j);
        if (z3 && !hashSet.contains(Integer.valueOf(i4))) {
            if (this.f11716g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i4));
        } else if (!z3 && hashSet.contains(Integer.valueOf(i4))) {
            if (!this.f11717h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i4));
            }
        } else {
            return;
        }
        q(hashSet);
    }

    private void g(int i4, boolean z3) {
        Iterator it = this.f11712c.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(this, i4, z3);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (k(i4)) {
                return i4;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if ((getChildAt(i5) instanceof MaterialButton) && k(i5)) {
                i4++;
            }
        }
        return i4;
    }

    private MaterialButton h(int i4) {
        return (MaterialButton) getChildAt(i4);
    }

    /* access modifiers changed from: private */
    public int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) == view) {
                return i4;
            }
            if ((getChildAt(i5) instanceof MaterialButton) && k(i5)) {
                i4++;
            }
        }
        return -1;
    }

    private c j(int i4, int i5, int i6) {
        boolean z3;
        c cVar = (c) this.f11710a.get(i4);
        if (i5 == i6) {
            return cVar;
        }
        if (getOrientation() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i4 == i5) {
            if (z3) {
                return c.e(cVar, this);
            }
            return c.f(cVar);
        } else if (i4 != i6) {
            return null;
        } else {
            if (z3) {
                return c.b(cVar, this);
            }
            return c.a(cVar);
        }
    }

    private boolean k(int i4) {
        if (getChildAt(i4).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    private void n(int i4) {
        if (getChildCount() != 0 && i4 != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i4).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            r.c(layoutParams, 0);
            r.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void o(int i4, boolean z3) {
        View findViewById = findViewById(i4);
        if (findViewById instanceof MaterialButton) {
            this.f11715f = true;
            ((MaterialButton) findViewById).setChecked(z3);
            this.f11715f = false;
        }
    }

    private static void p(k.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(cVar.f11723a).t(cVar.f11726d).F(cVar.f11724b).x(cVar.f11725c);
        }
    }

    private void q(Set set) {
        Set set2 = this.f11719j;
        this.f11719j = new HashSet(set);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            int id = h(i4).getId();
            o(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                g(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void r() {
        TreeMap treeMap = new TreeMap(this.f11713d);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            treeMap.put(h(i4), Integer.valueOf(i4));
        }
        this.f11714e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(P.k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f11711b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private void t() {
        Class cls;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (this.f11716g) {
                cls = RadioButton.class;
            } else {
                cls = ToggleButton.class;
            }
            h(i4).setA11yClassName(cls.getName());
        }
    }

    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i4, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        e(materialButton.getId(), materialButton.isChecked());
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f11710a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        materialButton.setEnabled(isEnabled());
        P.o0(materialButton, new b());
    }

    public void b(d dVar) {
        this.f11712c.add(dVar);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public void f() {
        q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f11716g || this.f11719j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f11719j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            int id = h(i4).getId();
            if (this.f11719j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i4, int i5) {
        Integer[] numArr = this.f11714e;
        if (numArr != null && i5 < numArr.length) {
            return numArr[i5].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i5;
    }

    public boolean l() {
        return this.f11716g;
    }

    /* access modifiers changed from: package-private */
    public void m(MaterialButton materialButton, boolean z3) {
        if (!this.f11715f) {
            e(materialButton.getId(), z3);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.f11718i;
        if (i4 != -1) {
            q(Collections.singleton(Integer.valueOf(i4)));
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i4;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        A J02 = A.J0(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (l()) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        J02.l0(A.f.a(1, visibleButtonCount, false, i4));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        s();
        c();
        super.onMeasure(i4, i5);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((MaterialButton.a) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f11710a.remove(indexOfChild);
        }
        s();
        c();
    }

    /* access modifiers changed from: package-private */
    public void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i4 = 0; i4 < childCount; i4++) {
            MaterialButton h4 = h(i4);
            if (h4.getVisibility() != 8) {
                k.b v3 = h4.getShapeAppearanceModel().v();
                p(v3, j(i4, firstVisibleChildIndex, lastVisibleChildIndex));
                h4.setShapeAppearanceModel(v3.m());
            }
        }
    }

    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            h(i4).setEnabled(z3);
        }
    }

    public void setSelectionRequired(boolean z3) {
        this.f11717h = z3;
    }

    public void setSingleSelection(boolean z3) {
        if (this.f11716g != z3) {
            this.f11716g = z3;
            f();
        }
        t();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f11709k
            android.content.Context r7 = T1.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f11710a = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r0 = 0
            r7.<init>(r6, r0)
            r6.f11711b = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f11712c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f11713d = r7
            r7 = 0
            r6.f11715f = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f11719j = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = z1.j.f16716t2
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.j.i(r0, r1, r2, r3, r4, r5)
            int r9 = z1.j.f16733x2
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection((boolean) r9)
            int r9 = z1.j.f16725v2
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f11718i = r9
            int r9 = z1.j.f16729w2
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f11717h = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            int r9 = z1.j.f16721u2
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setEnabled(r9)
            r8.recycle()
            androidx.core.view.P.y0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i4) {
        setSingleSelection(getResources().getBoolean(i4));
    }
}
