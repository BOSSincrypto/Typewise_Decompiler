package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

public abstract class a extends View {

    /* renamed from: a  reason: collision with root package name */
    protected int[] f4295a = new int[32];

    /* renamed from: b  reason: collision with root package name */
    protected int f4296b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f4297c;

    /* renamed from: d  reason: collision with root package name */
    protected C.a f4298d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f4299e = false;

    /* renamed from: f  reason: collision with root package name */
    protected String f4300f;

    /* renamed from: g  reason: collision with root package name */
    protected String f4301g;

    /* renamed from: h  reason: collision with root package name */
    private View[] f4302h = null;

    /* renamed from: i  reason: collision with root package name */
    protected HashMap f4303i = new HashMap();

    public a(Context context) {
        super(context);
        this.f4297c = context;
        i((AttributeSet) null);
    }

    private void a(String str) {
        if (str != null && str.length() != 0 && this.f4297c != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int h4 = h(trim);
            if (h4 != 0) {
                this.f4303i.put(Integer.valueOf(h4), trim);
                b(h4);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    private void b(int i4) {
        if (i4 != getId()) {
            int i5 = this.f4296b + 1;
            int[] iArr = this.f4295a;
            if (i5 > iArr.length) {
                this.f4295a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f4295a;
            int i6 = this.f4296b;
            iArr2[i6] = i4;
            this.f4296b = i6 + 1;
        }
    }

    private void c(String str) {
        ConstraintLayout constraintLayout;
        if (str != null && str.length() != 0 && this.f4297c != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            } else {
                constraintLayout = null;
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = constraintLayout.getChildAt(i4);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).f4241c0)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        b(childAt.getId());
                    }
                }
            }
        }
    }

    private int g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f4297c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int h(String str) {
        ConstraintLayout constraintLayout;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i4 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object g4 = constraintLayout.g(0, str);
            if (g4 instanceof Integer) {
                i4 = ((Integer) g4).intValue();
            }
        }
        if (i4 == 0 && constraintLayout != null) {
            i4 = g(constraintLayout, str);
        }
        if (i4 == 0) {
            try {
                i4 = e.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        if (i4 == 0) {
            return this.f4297c.getResources().getIdentifier(str, "id", this.f4297c.getPackageName());
        }
        return i4;
    }

    /* access modifiers changed from: protected */
    public void d() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            e((ConstraintLayout) parent);
        }
    }

    /* access modifiers changed from: protected */
    public void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i4 = 0; i4 < this.f4296b; i4++) {
            View l4 = constraintLayout.l(this.f4295a[i4]);
            if (l4 != null) {
                l4.setVisibility(visibility);
                if (elevation > 0.0f) {
                    l4.setTranslationZ(l4.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void f(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f4295a, this.f4296b);
    }

    /* access modifiers changed from: protected */
    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f4623n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == f.f4478G1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f4300f = string;
                    setIds(string);
                } else if (index == f.f4482H1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f4301g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void j(ConstraintWidget constraintWidget, boolean z3);

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
    }

    public void m(ConstraintLayout constraintLayout) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = (java.lang.String) r5.f4303i.get(java.lang.Integer.valueOf(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f4300f
            r5.setIds(r0)
        L_0x000b:
            C.a r0 = r5.f4298d
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.b()
            r0 = 0
        L_0x0014:
            int r1 = r5.f4296b
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f4295a
            r1 = r1[r0]
            android.view.View r2 = r6.l(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap r3 = r5.f4303i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.g(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f4295a
            r2[r0] = r3
            java.util.HashMap r2 = r5.f4303i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.l(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            C.a r1 = r5.f4298d
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.p(r2)
            r1.c(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            C.a r0 = r5.f4298d
            androidx.constraintlayout.core.widgets.d r6 = r6.f4188c
            r0.a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.n(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public void o() {
        if (this.f4298d != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.b) {
                ((ConstraintLayout.b) layoutParams).f4279v0 = (ConstraintWidget) this.f4298d;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f4300f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f4301g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        if (this.f4299e) {
            super.onMeasure(i4, i5);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f4300f = str;
        if (str != null) {
            int i4 = 0;
            this.f4296b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i4);
                if (indexOf == -1) {
                    a(str.substring(i4));
                    return;
                } else {
                    a(str.substring(i4, indexOf));
                    i4 = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setReferenceTags(String str) {
        this.f4301g = str;
        if (str != null) {
            int i4 = 0;
            this.f4296b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i4);
                if (indexOf == -1) {
                    c(str.substring(i4));
                    return;
                } else {
                    c(str.substring(i4, indexOf));
                    i4 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f4300f = null;
        this.f4296b = 0;
        for (int b4 : iArr) {
            b(b4);
        }
    }

    public void setTag(int i4, Object obj) {
        super.setTag(i4, obj);
        if (obj == null && this.f4300f == null) {
            b(i4);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4297c = context;
        i(attributeSet);
    }
}
