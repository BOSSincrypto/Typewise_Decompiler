package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.P;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import n.j;

class E {

    /* renamed from: l  reason: collision with root package name */
    private static final RectF f3193l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    private static ConcurrentHashMap f3194m = new ConcurrentHashMap();

    /* renamed from: n  reason: collision with root package name */
    private static ConcurrentHashMap f3195n = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    private int f3196a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3197b = false;

    /* renamed from: c  reason: collision with root package name */
    private float f3198c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f3199d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f3200e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    private int[] f3201f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private boolean f3202g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextPaint f3203h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f3204i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f3205j;

    /* renamed from: k  reason: collision with root package name */
    private final f f3206k;

    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i4, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i4, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    private static final class b {
        static boolean a(View view) {
            return view.isInLayout();
        }
    }

    private static final class c {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i4, int i5, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i4);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i5 == -1) {
                i5 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i5);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    private static class d extends f {
        d() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) E.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class e extends d {
        e() {
        }

        /* access modifiers changed from: package-private */
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class f {
        f() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a(StaticLayout.Builder builder, TextView textView);

        /* access modifiers changed from: package-private */
        public boolean b(TextView textView) {
            return ((Boolean) E.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    E(TextView textView) {
        this.f3204i = textView;
        this.f3205j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3206k = new e();
        } else {
            this.f3206k = new d();
        }
    }

    private int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            if (i4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i4)) < 0) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr2[i5] = ((Integer) arrayList.get(i5)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f3196a = 0;
        this.f3199d = -1.0f;
        this.f3200e = -1.0f;
        this.f3198c = -1.0f;
        this.f3201f = new int[0];
        this.f3197b = false;
    }

    private int e(RectF rectF) {
        int length = this.f3201f.length;
        if (length != 0) {
            int i4 = 1;
            int i5 = length - 1;
            int i6 = 0;
            while (i4 <= i5) {
                int i7 = (i4 + i5) / 2;
                if (x(this.f3201f[i7], rectF)) {
                    int i8 = i7 + 1;
                    i6 = i4;
                    i4 = i8;
                } else {
                    i6 = i7 - 1;
                    i5 = i6;
                }
            }
            return this.f3201f[i6];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    private static Method k(String str) {
        try {
            Method method = (Method) f3194m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, (Class[]) null)) != null) {
                method.setAccessible(true);
                f3194m.put(str, method);
            }
            return method;
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e4);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + r4 + "() method", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Object m(java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
        /*
            java.lang.reflect.Method r0 = k(r4)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            r1 = 0
            java.lang.Object r5 = r0.invoke(r3, r1)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            goto L_0x002a
        L_0x000a:
            r3 = move-exception
            goto L_0x000e
        L_0x000c:
            r3 = move-exception
            goto L_0x000f
        L_0x000e:
            throw r3
        L_0x000f:
            java.lang.String r0 = "ACTVAutoSizeHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to invoke TextView#"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "() method"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.util.Log.w(r0, r4, r3)
        L_0x002a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.E.m(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    private void s(float f4) {
        if (f4 != this.f3204i.getPaint().getTextSize()) {
            this.f3204i.getPaint().setTextSize(f4);
            boolean a4 = b.a(this.f3204i);
            if (this.f3204i.getLayout() != null) {
                this.f3197b = false;
                try {
                    Method k4 = k("nullLayouts");
                    if (k4 != null) {
                        k4.invoke(this.f3204i, (Object[]) null);
                    }
                } catch (Exception e4) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e4);
                }
                if (!a4) {
                    this.f3204i.requestLayout();
                } else {
                    this.f3204i.forceLayout();
                }
                this.f3204i.invalidate();
            }
        }
    }

    private boolean u() {
        if (!y() || this.f3196a != 1) {
            this.f3197b = false;
        } else {
            if (!this.f3202g || this.f3201f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f3200e - this.f3199d) / this.f3198c))) + 1;
                int[] iArr = new int[floor];
                for (int i4 = 0; i4 < floor; i4++) {
                    iArr[i4] = Math.round(this.f3199d + (((float) i4) * this.f3198c));
                }
                this.f3201f = b(iArr);
            }
            this.f3197b = true;
        }
        return this.f3197b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = typedArray.getDimensionPixelSize(i4, -1);
            }
            this.f3201f = b(iArr);
            w();
        }
    }

    private boolean w() {
        boolean z3;
        int[] iArr = this.f3201f;
        int length = iArr.length;
        if (length > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f3202g = z3;
        if (z3) {
            this.f3196a = 1;
            this.f3199d = (float) iArr[0];
            this.f3200e = (float) iArr[length - 1];
            this.f3198c = -1.0f;
        }
        return z3;
    }

    private boolean x(int i4, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f3204i.getText();
        TransformationMethod transformationMethod = this.f3204i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f3204i)) == null)) {
            text = transformation;
        }
        int b4 = a.b(this.f3204i);
        l(i4);
        StaticLayout d4 = d(text, (Layout.Alignment) m(this.f3204i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b4);
        if ((b4 == -1 || (d4.getLineCount() <= b4 && d4.getLineEnd(d4.getLineCount() - 1) == text.length())) && ((float) d4.getHeight()) <= rectF.bottom) {
            return true;
        }
        return false;
    }

    private boolean y() {
        return !(this.f3204i instanceof C0388l);
    }

    private void z(float f4, float f5, float f6) {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f4 + "px) is less or equal to (0px)");
        } else if (f5 <= f4) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f5 + "px) is less or equal to minimum auto-size text size (" + f4 + "px)");
        } else if (f6 > 0.0f) {
            this.f3196a = 1;
            this.f3199d = f4;
            this.f3200e = f5;
            this.f3198c = f6;
            this.f3202g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f6 + "px) is less or equal to (0px)");
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int i4;
        if (n()) {
            if (this.f3197b) {
                if (this.f3204i.getMeasuredHeight() > 0 && this.f3204i.getMeasuredWidth() > 0) {
                    if (this.f3206k.b(this.f3204i)) {
                        i4 = 1048576;
                    } else {
                        i4 = (this.f3204i.getMeasuredWidth() - this.f3204i.getTotalPaddingLeft()) - this.f3204i.getTotalPaddingRight();
                    }
                    int height = (this.f3204i.getHeight() - this.f3204i.getCompoundPaddingBottom()) - this.f3204i.getCompoundPaddingTop();
                    if (i4 > 0 && height > 0) {
                        RectF rectF = f3193l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = (float) i4;
                                rectF.bottom = (float) height;
                                float e4 = (float) e(rectF);
                                if (e4 != this.f3204i.getTextSize()) {
                                    t(0, e4);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f3197b = true;
        }
    }

    /* access modifiers changed from: package-private */
    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i4, int i5) {
        return c.a(charSequence, alignment, i4, i5, this.f3204i, this.f3203h, this.f3206k);
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return Math.round(this.f3200e);
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return Math.round(this.f3199d);
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return Math.round(this.f3198c);
    }

    /* access modifiers changed from: package-private */
    public int[] i() {
        return this.f3201f;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f3196a;
    }

    /* access modifiers changed from: package-private */
    public void l(int i4) {
        TextPaint textPaint = this.f3203h;
        if (textPaint == null) {
            this.f3203h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f3203h.set(this.f3204i.getPaint());
        this.f3203h.setTextSize((float) i4);
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        if (!y() || this.f3196a == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void o(AttributeSet attributeSet, int i4) {
        float f4;
        float f5;
        float f6;
        int resourceId;
        Context context = this.f3205j;
        int[] iArr = j.f14974g0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        TextView textView = this.f3204i;
        P.m0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i4, 0);
        int i5 = j.f14999l0;
        if (obtainStyledAttributes.hasValue(i5)) {
            this.f3196a = obtainStyledAttributes.getInt(i5, 0);
        }
        int i6 = j.f14994k0;
        if (obtainStyledAttributes.hasValue(i6)) {
            f4 = obtainStyledAttributes.getDimension(i6, -1.0f);
        } else {
            f4 = -1.0f;
        }
        int i7 = j.f14984i0;
        if (obtainStyledAttributes.hasValue(i7)) {
            f5 = obtainStyledAttributes.getDimension(i7, -1.0f);
        } else {
            f5 = -1.0f;
        }
        int i8 = j.f14979h0;
        if (obtainStyledAttributes.hasValue(i8)) {
            f6 = obtainStyledAttributes.getDimension(i8, -1.0f);
        } else {
            f6 = -1.0f;
        }
        int i9 = j.f14989j0;
        if (obtainStyledAttributes.hasValue(i9) && (resourceId = obtainStyledAttributes.getResourceId(i9, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!y()) {
            this.f3196a = 0;
        } else if (this.f3196a == 1) {
            if (!this.f3202g) {
                DisplayMetrics displayMetrics = this.f3205j.getResources().getDisplayMetrics();
                if (f5 == -1.0f) {
                    f5 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (f6 == -1.0f) {
                    f6 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (f4 == -1.0f) {
                    f4 = 1.0f;
                }
                z(f5, f6, f4);
            }
            u();
        }
    }

    /* access modifiers changed from: package-private */
    public void p(int i4, int i5, int i6, int i7) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f3205j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i7, (float) i4, displayMetrics), TypedValue.applyDimension(i7, (float) i5, displayMetrics), TypedValue.applyDimension(i7, (float) i6, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int[] iArr, int i4) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i4 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f3205j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArr2[i5] = Math.round(TypedValue.applyDimension(i4, (float) iArr[i5], displayMetrics));
                    }
                }
                this.f3201f = b(iArr2);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f3202g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r(int i4) {
        if (!y()) {
            return;
        }
        if (i4 == 0) {
            c();
        } else if (i4 == 1) {
            DisplayMetrics displayMetrics = this.f3205j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i4, float f4) {
        Resources resources;
        Context context = this.f3205j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        s(TypedValue.applyDimension(i4, f4, resources.getDisplayMetrics()));
    }
}
