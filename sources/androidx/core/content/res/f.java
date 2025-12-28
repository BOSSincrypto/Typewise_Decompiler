package androidx.core.content.res;

import G.d;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

abstract class f {
    private static a a(a aVar, int i4, int i5, boolean z3, int i6) {
        if (aVar != null) {
            return aVar;
        }
        if (z3) {
            return new a(i4, i6, i5);
        }
        return new a(i4, i5);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray k4 = k.k(resources, theme2, attributeSet, d.f479A);
            float f4 = k.f(k4, xmlPullParser2, "startX", d.f488J, 0.0f);
            float f5 = k.f(k4, xmlPullParser2, "startY", d.f489K, 0.0f);
            float f6 = k.f(k4, xmlPullParser2, "endX", d.f490L, 0.0f);
            float f7 = k.f(k4, xmlPullParser2, "endY", d.f491M, 0.0f);
            float f8 = k.f(k4, xmlPullParser2, "centerX", d.f483E, 0.0f);
            float f9 = k.f(k4, xmlPullParser2, "centerY", d.f484F, 0.0f);
            int g4 = k.g(k4, xmlPullParser2, "type", d.f482D, 0);
            int b4 = k.b(k4, xmlPullParser2, "startColor", d.f480B, 0);
            boolean j4 = k.j(xmlPullParser2, "centerColor");
            int b5 = k.b(k4, xmlPullParser2, "centerColor", d.f487I, 0);
            int b6 = k.b(k4, xmlPullParser2, "endColor", d.f481C, 0);
            int g5 = k.g(k4, xmlPullParser2, "tileMode", d.f486H, 0);
            float f10 = f8;
            float f11 = k.f(k4, xmlPullParser2, "gradientRadius", d.f485G, 0.0f);
            k4.recycle();
            a a4 = a(c(resources, xmlPullParser, attributeSet, theme), b4, b6, j4, b5);
            if (g4 == 1) {
                float f12 = f10;
                if (f11 > 0.0f) {
                    int[] iArr = a4.f4929a;
                    return new RadialGradient(f12, f9, f11, iArr, a4.f4930b, d(g5));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (g4 != 2) {
                return new LinearGradient(f4, f5, f6, f7, a4.f4929a, a4.f4930b, d(g5));
            } else {
                return new SweepGradient(f10, f9, a4.f4929a, a4.f4930b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.res.f.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r10.next()
            if (r3 == r1) goto L_0x0081
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0081
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = G.d.f492N
            android.content.res.TypedArray r3 = androidx.core.content.res.k.k(r9, r12, r11, r3)
            int r5 = G.d.f493O
            boolean r6 = r3.hasValue(r5)
            int r7 = G.d.f494P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0066:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0081:
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x008d
            androidx.core.content.res.f$a r9 = new androidx.core.content.res.f$a
            r9.<init>((java.util.List) r4, (java.util.List) r2)
            return r9
        L_0x008d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    private static Shader.TileMode d(int i4) {
        if (i4 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i4 != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int[] f4929a;

        /* renamed from: b  reason: collision with root package name */
        final float[] f4930b;

        a(List list, List list2) {
            int size = list.size();
            this.f4929a = new int[size];
            this.f4930b = new float[size];
            for (int i4 = 0; i4 < size; i4++) {
                this.f4929a[i4] = ((Integer) list.get(i4)).intValue();
                this.f4930b[i4] = ((Float) list2.get(i4)).floatValue();
            }
        }

        a(int i4, int i5) {
            this.f4929a = new int[]{i4, i5};
            this.f4930b = new float[]{0.0f, 1.0f};
        }

        a(int i4, int i5, int i6) {
            this.f4929a = new int[]{i4, i5, i6};
            this.f4930b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
