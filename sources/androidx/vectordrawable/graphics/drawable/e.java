package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.res.k;
import androidx.core.graphics.h;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public abstract class e {

    private static class a implements TypeEvaluator {

        /* renamed from: a  reason: collision with root package name */
        private h.b[] f6973a;

        a() {
        }

        /* renamed from: a */
        public h.b[] evaluate(float f4, h.b[] bVarArr, h.b[] bVarArr2) {
            if (h.b(bVarArr, bVarArr2)) {
                if (!h.b(this.f6973a, bVarArr)) {
                    this.f6973a = h.f(bVarArr);
                }
                for (int i4 = 0; i4 < bVarArr.length; i4++) {
                    this.f6973a[i4].d(bVarArr[i4], bVarArr2[i4], f4);
                }
                return this.f6973a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f4) {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), (AnimatorSet) null, 0, f4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            int r12 = r21.getDepth()
            r0 = 0
            r13 = r0
        L_0x000e:
            int r1 = r21.next()
            r2 = 3
            r14 = 0
            if (r1 != r2) goto L_0x001c
            int r2 = r21.getDepth()
            if (r2 <= r12) goto L_0x00dd
        L_0x001c:
            r2 = 1
            if (r1 == r2) goto L_0x00dd
            r3 = 2
            if (r1 == r3) goto L_0x0023
            goto L_0x000e
        L_0x0023:
            java.lang.String r1 = r21.getName()
            java.lang.String r3 = "objectAnimator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0043
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r25
            r5 = r21
            android.animation.ObjectAnimator r0 = n(r0, r1, r2, r3, r4, r5)
        L_0x003f:
            r3 = r18
            goto L_0x00b2
        L_0x0043:
            java.lang.String r3 = "animator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x005d
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r5 = r25
            r6 = r21
            android.animation.ValueAnimator r0 = l(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x003f
        L_0x005d:
            java.lang.String r3 = "set"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0093
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            int[] r0 = androidx.vectordrawable.graphics.drawable.a.f6951h
            r7 = r22
            android.content.res.TypedArray r6 = androidx.core.content.res.k.k(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            int r16 = androidx.core.content.res.k.g(r6, r10, r0, r14, r14)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r15
            r17 = r6
            r6 = r16
            r7 = r25
            b(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r3 = r18
            r0 = r15
            goto L_0x00b2
        L_0x0093:
            java.lang.String r3 = "propertyValuesHolder"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r21)
            r3 = r18
            android.animation.PropertyValuesHolder[] r1 = p(r3, r8, r9, r10, r1)
            if (r1 == 0) goto L_0x00b1
            boolean r4 = r0 instanceof android.animation.ValueAnimator
            if (r4 == 0) goto L_0x00b1
            r4 = r0
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            r4.setValues(r1)
        L_0x00b1:
            r14 = r2
        L_0x00b2:
            if (r11 == 0) goto L_0x000e
            if (r14 != 0) goto L_0x000e
            if (r13 != 0) goto L_0x00bd
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x00bd:
            r13.add(r0)
            goto L_0x000e
        L_0x00c2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown animator name: "
            r1.append(r2)
            java.lang.String r2 = r21.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            if (r11 == 0) goto L_0x0106
            if (r13 == 0) goto L_0x0106
            int r1 = r13.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r13.iterator()
        L_0x00eb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00fd
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r14 + 1
            r1[r14] = r3
            r14 = r4
            goto L_0x00eb
        L_0x00fd:
            if (r24 != 0) goto L_0x0103
            r11.playTogether(r1)
            goto L_0x0106
        L_0x0103:
            r11.playSequentially(r1)
        L_0x0106:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.e.b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static Keyframe c(Keyframe keyframe, float f4) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f4);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f4);
        }
        return Keyframe.ofObject(f4);
    }

    private static void d(Keyframe[] keyframeArr, float f4, int i4, int i5) {
        float f5 = f4 / ((float) ((i5 - i4) + 2));
        while (i4 <= i5) {
            keyframeArr[i4].setFraction(keyframeArr[i4 - 1].getFraction() + f5);
            i4++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder e(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
        /*
            r0 = 2
            android.util.TypedValue r1 = r11.peekValue(r13)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000b
            r4 = r2
            goto L_0x000c
        L_0x000b:
            r4 = r3
        L_0x000c:
            if (r4 == 0) goto L_0x0011
            int r1 = r1.type
            goto L_0x0012
        L_0x0011:
            r1 = r3
        L_0x0012:
            android.util.TypedValue r5 = r11.peekValue(r14)
            if (r5 == 0) goto L_0x001a
            r6 = r2
            goto L_0x001b
        L_0x001a:
            r6 = r3
        L_0x001b:
            if (r6 == 0) goto L_0x0020
            int r5 = r5.type
            goto L_0x0021
        L_0x0020:
            r5 = r3
        L_0x0021:
            r7 = 4
            r8 = 3
            if (r12 != r7) goto L_0x0038
            if (r4 == 0) goto L_0x002d
            boolean r12 = h(r1)
            if (r12 != 0) goto L_0x0035
        L_0x002d:
            if (r6 == 0) goto L_0x0037
            boolean r12 = h(r5)
            if (r12 == 0) goto L_0x0037
        L_0x0035:
            r12 = r8
            goto L_0x0038
        L_0x0037:
            r12 = r3
        L_0x0038:
            if (r12 != 0) goto L_0x003c
            r7 = r2
            goto L_0x003d
        L_0x003c:
            r7 = r3
        L_0x003d:
            r9 = 0
            if (r12 != r0) goto L_0x00a9
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            androidx.core.graphics.h$b[] r13 = androidx.core.graphics.h.d(r12)
            androidx.core.graphics.h$b[] r14 = androidx.core.graphics.h.d(r11)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x0165
        L_0x0054:
            if (r13 == 0) goto L_0x0098
            androidx.vectordrawable.graphics.drawable.e$a r1 = new androidx.vectordrawable.graphics.drawable.e$a
            r1.<init>()
            if (r14 == 0) goto L_0x008f
            boolean r4 = androidx.core.graphics.h.b(r13, r14)
            if (r4 == 0) goto L_0x0070
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r11[r3] = r13
            r11[r2] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r1, r11)
        L_0x006d:
            r9 = r11
            goto L_0x0165
        L_0x0070:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = " Can't morph from "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L_0x008f:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r3] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r1, r11)
            goto L_0x006d
        L_0x0098:
            if (r14 == 0) goto L_0x0165
            androidx.vectordrawable.graphics.drawable.e$a r11 = new androidx.vectordrawable.graphics.drawable.e$a
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r3] = r14
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            goto L_0x0165
        L_0x00a9:
            if (r12 != r8) goto L_0x00b0
            androidx.vectordrawable.graphics.drawable.f r12 = androidx.vectordrawable.graphics.drawable.f.a()
            goto L_0x00b1
        L_0x00b0:
            r12 = r9
        L_0x00b1:
            r8 = 5
            r10 = 0
            if (r7 == 0) goto L_0x00f9
            if (r4 == 0) goto L_0x00e5
            if (r1 != r8) goto L_0x00be
            float r13 = r11.getDimension(r13, r10)
            goto L_0x00c2
        L_0x00be:
            float r13 = r11.getFloat(r13, r10)
        L_0x00c2:
            if (r6 == 0) goto L_0x00dc
            if (r5 != r8) goto L_0x00cb
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00cf
        L_0x00cb:
            float r11 = r11.getFloat(r14, r10)
        L_0x00cf:
            float[] r14 = new float[r0]
            r14[r3] = r13
            r14[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
        L_0x00d9:
            r9 = r11
            goto L_0x015e
        L_0x00dc:
            float[] r11 = new float[r2]
            r11[r3] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto L_0x00d9
        L_0x00e5:
            if (r5 != r8) goto L_0x00ec
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00f0
        L_0x00ec:
            float r11 = r11.getFloat(r14, r10)
        L_0x00f0:
            float[] r13 = new float[r2]
            r13[r3] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
            goto L_0x00d9
        L_0x00f9:
            if (r4 == 0) goto L_0x013d
            if (r1 != r8) goto L_0x0103
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L_0x0112
        L_0x0103:
            boolean r0 = h(r1)
            if (r0 == 0) goto L_0x010e
            int r13 = r11.getColor(r13, r3)
            goto L_0x0112
        L_0x010e:
            int r13 = r11.getInt(r13, r3)
        L_0x0112:
            if (r6 == 0) goto L_0x0134
            if (r5 != r8) goto L_0x011c
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x012b
        L_0x011c:
            boolean r0 = h(r5)
            if (r0 == 0) goto L_0x0127
            int r11 = r11.getColor(r14, r3)
            goto L_0x012b
        L_0x0127:
            int r11 = r11.getInt(r14, r3)
        L_0x012b:
            int[] r11 = new int[]{r13, r11}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x015e
        L_0x0134:
            int[] r11 = new int[]{r13}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x015e
        L_0x013d:
            if (r6 == 0) goto L_0x015e
            if (r5 != r8) goto L_0x0147
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0156
        L_0x0147:
            boolean r13 = h(r5)
            if (r13 == 0) goto L_0x0152
            int r11 = r11.getColor(r14, r3)
            goto L_0x0156
        L_0x0152:
            int r11 = r11.getInt(r14, r3)
        L_0x0156:
            int[] r11 = new int[]{r11}
            android.animation.PropertyValuesHolder r9 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
        L_0x015e:
            if (r9 == 0) goto L_0x0165
            if (r12 == 0) goto L_0x0165
            r9.setEvaluator(r12)
        L_0x0165:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.e.e(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    private static int f(TypedArray typedArray, int i4, int i5) {
        boolean z3;
        int i6;
        int i7;
        TypedValue peekValue = typedArray.peekValue(i4);
        boolean z4 = true;
        if (peekValue != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            i6 = peekValue.type;
        } else {
            i6 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i5);
        if (peekValue2 == null) {
            z4 = false;
        }
        if (z4) {
            i7 = peekValue2.type;
        } else {
            i7 = 0;
        }
        if ((!z3 || !h(i6)) && (!z4 || !h(i7))) {
            return 0;
        }
        return 3;
    }

    private static int g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k4 = k.k(resources, theme, attributeSet, a.f6953j);
        int i4 = 0;
        TypedValue l4 = k.l(k4, xmlPullParser, "value", 0);
        if (l4 != null && h(l4.type)) {
            i4 = 3;
        }
        k4.recycle();
        return i4;
    }

    private static boolean h(int i4) {
        return i4 >= 28 && i4 <= 31;
    }

    public static Animator i(Context context, int i4) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i4);
        }
        return j(context, context.getResources(), context.getTheme(), i4);
    }

    public static Animator j(Context context, Resources resources, Resources.Theme theme, int i4) {
        return k(context, resources, theme, i4, 1.0f);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, int i4, float f4) {
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser animation = resources.getAnimation(i4);
            Animator a4 = a(context, resources, theme, animation, f4);
            if (animation != null) {
                animation.close();
            }
            return a4;
        } catch (XmlPullParserException e4) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i4));
            notFoundException.initCause(e4);
            throw notFoundException;
        } catch (IOException e5) {
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i4));
            notFoundException2.initCause(e5);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    private static ValueAnimator l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f4, XmlPullParser xmlPullParser) {
        TypedArray k4 = k.k(resources, theme, attributeSet, a.f6950g);
        TypedArray k5 = k.k(resources, theme, attributeSet, a.f6954k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        q(valueAnimator, k4, k5, f4, xmlPullParser);
        int h4 = k.h(k4, xmlPullParser, "interpolator", 0, 0);
        if (h4 > 0) {
            valueAnimator.setInterpolator(d.a(context, h4));
        }
        k4.recycle();
        if (k5 != null) {
            k5.recycle();
        }
        return valueAnimator;
    }

    private static Keyframe m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i4, XmlPullParser xmlPullParser) {
        boolean z3;
        Keyframe keyframe;
        TypedArray k4 = k.k(resources, theme, attributeSet, a.f6953j);
        float f4 = k.f(k4, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue l4 = k.l(k4, xmlPullParser, "value", 0);
        if (l4 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i4 == 4) {
            if (!z3 || !h(l4.type)) {
                i4 = 0;
            } else {
                i4 = 3;
            }
        }
        if (z3) {
            if (i4 == 0) {
                keyframe = Keyframe.ofFloat(f4, k.f(k4, xmlPullParser, "value", 0, 0.0f));
            } else if (i4 == 1 || i4 == 3) {
                keyframe = Keyframe.ofInt(f4, k.g(k4, xmlPullParser, "value", 0, 0));
            } else {
                keyframe = null;
            }
        } else if (i4 == 0) {
            keyframe = Keyframe.ofFloat(f4);
        } else {
            keyframe = Keyframe.ofInt(f4);
        }
        int h4 = k.h(k4, xmlPullParser, "interpolator", 1, 0);
        if (h4 > 0) {
            keyframe.setInterpolator(d.a(context, h4));
        }
        k4.recycle();
        return keyframe;
    }

    private static ObjectAnimator n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f4, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        l(context, resources, theme, attributeSet, objectAnimator, f4, xmlPullParser);
        return objectAnimator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder o(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) {
        /*
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r12.next()
            r3 = 3
            if (r2 == r3) goto L_0x0040
            r4 = 1
            if (r2 == r4) goto L_0x0040
            java.lang.String r2 = r12.getName()
            java.lang.String r3 = "keyframe"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0002
            r2 = 4
            if (r14 != r2) goto L_0x0023
            android.util.AttributeSet r14 = android.util.Xml.asAttributeSet(r12)
            int r14 = g(r10, r11, r14, r12)
        L_0x0023:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r12)
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r14
            r7 = r12
            android.animation.Keyframe r2 = m(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x003c
            if (r1 != 0) goto L_0x0039
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0039:
            r1.add(r2)
        L_0x003c:
            r12.next()
            goto L_0x0002
        L_0x0040:
            if (r1 == 0) goto L_0x00e9
            int r9 = r1.size()
            if (r9 <= 0) goto L_0x00e9
            r10 = 0
            java.lang.Object r11 = r1.get(r10)
            android.animation.Keyframe r11 = (android.animation.Keyframe) r11
            int r12 = r9 + -1
            java.lang.Object r12 = r1.get(r12)
            android.animation.Keyframe r12 = (android.animation.Keyframe) r12
            float r0 = r12.getFraction()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 >= 0) goto L_0x0077
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x006a
            r12.setFraction(r2)
            goto L_0x0077
        L_0x006a:
            int r0 = r1.size()
            android.animation.Keyframe r12 = c(r12, r2)
            r1.add(r0, r12)
            int r9 = r9 + 1
        L_0x0077:
            float r12 = r11.getFraction()
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0090
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 >= 0) goto L_0x0087
            r11.setFraction(r5)
            goto L_0x0090
        L_0x0087:
            android.animation.Keyframe r11 = c(r11, r5)
            r1.add(r10, r11)
            int r9 = r9 + 1
        L_0x0090:
            android.animation.Keyframe[] r11 = new android.animation.Keyframe[r9]
            r1.toArray(r11)
        L_0x0095:
            if (r10 >= r9) goto L_0x00dc
            r12 = r11[r10]
            float r0 = r12.getFraction()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d9
            if (r10 != 0) goto L_0x00a7
            r12.setFraction(r5)
            goto L_0x00d9
        L_0x00a7:
            int r0 = r9 + -1
            if (r10 != r0) goto L_0x00af
            r12.setFraction(r2)
            goto L_0x00d9
        L_0x00af:
            int r12 = r10 + 1
            r1 = r10
        L_0x00b2:
            if (r12 >= r0) goto L_0x00c5
            r4 = r11[r12]
            float r4 = r4.getFraction()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x00bf
            goto L_0x00c5
        L_0x00bf:
            int r1 = r12 + 1
            r8 = r1
            r1 = r12
            r12 = r8
            goto L_0x00b2
        L_0x00c5:
            int r12 = r1 + 1
            r12 = r11[r12]
            float r12 = r12.getFraction()
            int r0 = r10 + -1
            r0 = r11[r0]
            float r0 = r0.getFraction()
            float r12 = r12 - r0
            d(r11, r12, r10, r1)
        L_0x00d9:
            int r10 = r10 + 1
            goto L_0x0095
        L_0x00dc:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofKeyframe(r13, r11)
            if (r14 != r3) goto L_0x00e9
            androidx.vectordrawable.graphics.drawable.f r9 = androidx.vectordrawable.graphics.drawable.f.a()
            r0.setEvaluator(r9)
        L_0x00e9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.e.o(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int):android.animation.PropertyValuesHolder");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] p(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) {
        /*
            r6 = r20
            r7 = 0
            r8 = r7
        L_0x0004:
            int r0 = r20.getEventType()
            r9 = 0
            r1 = 3
            if (r0 == r1) goto L_0x006c
            r10 = 1
            if (r0 == r10) goto L_0x006c
            r2 = 2
            if (r0 == r2) goto L_0x0016
            r20.next()
            goto L_0x0004
        L_0x0016:
            java.lang.String r0 = r20.getName()
            java.lang.String r3 = "propertyValuesHolder"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0062
            int[] r0 = androidx.vectordrawable.graphics.drawable.a.f6952i
            r11 = r18
            r12 = r19
            r13 = r21
            android.content.res.TypedArray r14 = androidx.core.content.res.k.k(r11, r12, r13, r0)
            java.lang.String r0 = "propertyName"
            java.lang.String r15 = androidx.core.content.res.k.i(r14, r6, r0, r1)
            java.lang.String r0 = "valueType"
            r1 = 4
            int r5 = androidx.core.content.res.k.g(r14, r6, r0, r2, r1)
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r15
            r16 = r5
            android.animation.PropertyValuesHolder r0 = o(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0052
            r1 = r16
            android.animation.PropertyValuesHolder r0 = e(r14, r1, r9, r10, r15)
        L_0x0052:
            if (r0 == 0) goto L_0x005e
            if (r8 != 0) goto L_0x005b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x005b:
            r8.add(r0)
        L_0x005e:
            r14.recycle()
            goto L_0x0068
        L_0x0062:
            r11 = r18
            r12 = r19
            r13 = r21
        L_0x0068:
            r20.next()
            goto L_0x0004
        L_0x006c:
            if (r8 == 0) goto L_0x0081
            int r0 = r8.size()
            android.animation.PropertyValuesHolder[] r7 = new android.animation.PropertyValuesHolder[r0]
        L_0x0074:
            if (r9 >= r0) goto L_0x0081
            java.lang.Object r1 = r8.get(r9)
            android.animation.PropertyValuesHolder r1 = (android.animation.PropertyValuesHolder) r1
            r7[r9] = r1
            int r9 = r9 + 1
            goto L_0x0074
        L_0x0081:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.e.p(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }

    private static void q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f4, XmlPullParser xmlPullParser) {
        long g4 = (long) k.g(typedArray, xmlPullParser, "duration", 1, 300);
        long g5 = (long) k.g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int g6 = k.g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (k.j(xmlPullParser, "valueFrom") && k.j(xmlPullParser, "valueTo")) {
            if (g6 == 4) {
                g6 = f(typedArray, 5, 6);
            }
            PropertyValuesHolder e4 = e(typedArray, g6, 5, 6, "");
            if (e4 != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{e4});
            }
        }
        valueAnimator.setDuration(g4);
        valueAnimator.setStartDelay(g5);
        valueAnimator.setRepeatCount(k.g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(k.g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            r(valueAnimator, typedArray2, g6, f4, xmlPullParser);
        }
    }

    private static void r(ValueAnimator valueAnimator, TypedArray typedArray, int i4, float f4, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String i5 = k.i(typedArray, xmlPullParser, "pathData", 1);
        if (i5 != null) {
            String i6 = k.i(typedArray, xmlPullParser, "propertyXName", 2);
            String i7 = k.i(typedArray, xmlPullParser, "propertyYName", 3);
            if (i4 != 2) {
            }
            if (i6 == null && i7 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            s(h.e(i5), objectAnimator, f4 * 0.5f, i6, i7);
            return;
        }
        objectAnimator.setPropertyName(k.i(typedArray, xmlPullParser, "propertyName", 0));
    }

    private static void s(Path path, ObjectAnimator objectAnimator, float f4, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        int i4 = 1;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        float f5 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f6 = 0.0f;
        do {
            f6 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f6));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f6 / f4)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f7 = f6 / ((float) (min - 1));
        int i5 = 0;
        int i6 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i5 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f5 - ((Float) arrayList.get(i6)).floatValue(), fArr3, (float[]) null);
            fArr[i5] = fArr3[0];
            fArr2[i5] = fArr3[1];
            f5 += f7;
            int i7 = i6 + 1;
            if (i7 < arrayList.size() && f5 > ((Float) arrayList.get(i7)).floatValue()) {
                pathMeasure2.nextContour();
                i6 = i7;
            }
            i4 = 1;
            i5++;
        }
        if (str3 != null) {
            propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str3, fArr);
        } else {
            propertyValuesHolder2 = null;
        }
        if (str4 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str4, fArr2);
        }
        if (propertyValuesHolder2 == null) {
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[i4];
            propertyValuesHolderArr[0] = propertyValuesHolder;
            objectAnimator2.setValues(propertyValuesHolderArr);
        } else if (propertyValuesHolder == null) {
            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[i4];
            propertyValuesHolderArr2[0] = propertyValuesHolder2;
            objectAnimator2.setValues(propertyValuesHolderArr2);
        } else {
            PropertyValuesHolder[] propertyValuesHolderArr3 = new PropertyValuesHolder[2];
            propertyValuesHolderArr3[0] = propertyValuesHolder2;
            propertyValuesHolderArr3[i4] = propertyValuesHolder;
            objectAnimator2.setValues(propertyValuesHolderArr3);
        }
    }
}
