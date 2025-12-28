package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;
import o.C0836a;

public class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3540a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f3541b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f3542c;

    private c0(Context context, TypedArray typedArray) {
        this.f3540a = context;
        this.f3541b = typedArray;
    }

    public static c0 t(Context context, int i4, int[] iArr) {
        return new c0(context, context.obtainStyledAttributes(i4, iArr));
    }

    public static c0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new c0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static c0 v(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5) {
        return new c0(context, context.obtainStyledAttributes(attributeSet, iArr, i4, i5));
    }

    public boolean a(int i4, boolean z3) {
        return this.f3541b.getBoolean(i4, z3);
    }

    public int b(int i4, int i5) {
        return this.f3541b.getColor(i4, i5);
    }

    public ColorStateList c(int i4) {
        int resourceId;
        ColorStateList a4;
        if (!this.f3541b.hasValue(i4) || (resourceId = this.f3541b.getResourceId(i4, 0)) == 0 || (a4 = C0836a.a(this.f3540a, resourceId)) == null) {
            return this.f3541b.getColorStateList(i4);
        }
        return a4;
    }

    public float d(int i4, float f4) {
        return this.f3541b.getDimension(i4, f4);
    }

    public int e(int i4, int i5) {
        return this.f3541b.getDimensionPixelOffset(i4, i5);
    }

    public int f(int i4, int i5) {
        return this.f3541b.getDimensionPixelSize(i4, i5);
    }

    public Drawable g(int i4) {
        int resourceId;
        if (!this.f3541b.hasValue(i4) || (resourceId = this.f3541b.getResourceId(i4, 0)) == 0) {
            return this.f3541b.getDrawable(i4);
        }
        return C0836a.b(this.f3540a, resourceId);
    }

    public Drawable h(int i4) {
        int resourceId;
        if (!this.f3541b.hasValue(i4) || (resourceId = this.f3541b.getResourceId(i4, 0)) == 0) {
            return null;
        }
        return C0387k.b().d(this.f3540a, resourceId, true);
    }

    public float i(int i4, float f4) {
        return this.f3541b.getFloat(i4, f4);
    }

    public Typeface j(int i4, int i5, h.e eVar) {
        int resourceId = this.f3541b.getResourceId(i4, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f3542c == null) {
            this.f3542c = new TypedValue();
        }
        return h.h(this.f3540a, resourceId, this.f3542c, i5, eVar);
    }

    public int k(int i4, int i5) {
        return this.f3541b.getInt(i4, i5);
    }

    public int l(int i4, int i5) {
        return this.f3541b.getInteger(i4, i5);
    }

    public int m(int i4, int i5) {
        return this.f3541b.getLayoutDimension(i4, i5);
    }

    public int n(int i4, int i5) {
        return this.f3541b.getResourceId(i4, i5);
    }

    public String o(int i4) {
        return this.f3541b.getString(i4);
    }

    public CharSequence p(int i4) {
        return this.f3541b.getText(i4);
    }

    public CharSequence[] q(int i4) {
        return this.f3541b.getTextArray(i4);
    }

    public TypedArray r() {
        return this.f3541b;
    }

    public boolean s(int i4) {
        return this.f3541b.hasValue(i4);
    }

    public void w() {
        this.f3541b.recycle();
    }
}
