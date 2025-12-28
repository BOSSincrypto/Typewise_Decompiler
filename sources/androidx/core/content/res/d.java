package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.Log;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Shader f4915a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f4916b;

    /* renamed from: c  reason: collision with root package name */
    private int f4917c;

    private d(Shader shader, ColorStateList colorStateList, int i4) {
        this.f4915a = shader;
        this.f4916b = colorStateList;
        this.f4917c = i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.res.d a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0008:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x0013
            r3 = 1
            if (r1 == r3) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            if (r1 != r2) goto L_0x005c
            java.lang.String r1 = r5.getName()
            r1.hashCode()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0053
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0035
            android.content.res.ColorStateList r4 = androidx.core.content.res.c.b(r4, r5, r0, r6)
            androidx.core.content.res.d r4 = c(r4)
            return r4
        L_0x0035:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = ": unsupported complex color tag "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L_0x0053:
            android.graphics.Shader r4 = androidx.core.content.res.f.b(r4, r5, r0, r6)
            androidx.core.content.res.d r4 = d(r4)
            return r4
        L_0x005c:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.d.a(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.core.content.res.d");
    }

    static d b(int i4) {
        return new d((Shader) null, (ColorStateList) null, i4);
    }

    static d c(ColorStateList colorStateList) {
        return new d((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, (ColorStateList) null, 0);
    }

    public static d g(Resources resources, int i4, Resources.Theme theme) {
        try {
            return a(resources, i4, theme);
        } catch (Exception e4) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e4);
            return null;
        }
    }

    public int e() {
        return this.f4917c;
    }

    public Shader f() {
        return this.f4915a;
    }

    public boolean h() {
        if (this.f4915a != null) {
            return true;
        }
        return false;
    }

    public boolean i() {
        ColorStateList colorStateList;
        if (this.f4915a != null || (colorStateList = this.f4916b) == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f4916b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f4917c) {
                this.f4917c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i4) {
        this.f4917c = i4;
    }

    public boolean l() {
        if (h() || this.f4917c != 0) {
            return true;
        }
        return false;
    }
}
