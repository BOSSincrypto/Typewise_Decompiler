package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import androidx.core.graphics.h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y.C0939a;

public class h extends g {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f6976k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private C0112h f6977b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuffColorFilter f6978c;

    /* renamed from: d  reason: collision with root package name */
    private ColorFilter f6979d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6980e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6981f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable.ConstantState f6982g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f6983h;

    /* renamed from: i  reason: collision with root package name */
    private final Matrix f6984i;

    /* renamed from: j  reason: collision with root package name */
    private final Rect f6985j;

    private static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f7012b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f7011a = androidx.core.graphics.h.d(string2);
            }
            this.f7013c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.j(xmlPullParser, "pathData")) {
                TypedArray k4 = k.k(resources, theme, attributeSet, a.f6947d);
                f(k4, xmlPullParser);
                k4.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$h  reason: collision with other inner class name */
    private static class C0112h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f7032a;

        /* renamed from: b  reason: collision with root package name */
        g f7033b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f7034c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f7035d;

        /* renamed from: e  reason: collision with root package name */
        boolean f7036e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f7037f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f7038g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f7039h;

        /* renamed from: i  reason: collision with root package name */
        int f7040i;

        /* renamed from: j  reason: collision with root package name */
        boolean f7041j;

        /* renamed from: k  reason: collision with root package name */
        boolean f7042k;

        /* renamed from: l  reason: collision with root package name */
        Paint f7043l;

        public C0112h(C0112h hVar) {
            this.f7034c = null;
            this.f7035d = h.f6976k;
            if (hVar != null) {
                this.f7032a = hVar.f7032a;
                g gVar = new g(hVar.f7033b);
                this.f7033b = gVar;
                if (hVar.f7033b.f7020e != null) {
                    gVar.f7020e = new Paint(hVar.f7033b.f7020e);
                }
                if (hVar.f7033b.f7019d != null) {
                    this.f7033b.f7019d = new Paint(hVar.f7033b.f7019d);
                }
                this.f7034c = hVar.f7034c;
                this.f7035d = hVar.f7035d;
                this.f7036e = hVar.f7036e;
            }
        }

        public boolean a(int i4, int i5) {
            if (i4 == this.f7037f.getWidth() && i5 == this.f7037f.getHeight()) {
                return true;
            }
            return false;
        }

        public boolean b() {
            if (!this.f7042k && this.f7038g == this.f7034c && this.f7039h == this.f7035d && this.f7041j == this.f7036e && this.f7040i == this.f7033b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        public void c(int i4, int i5) {
            if (this.f7037f == null || !a(i4, i5)) {
                this.f7037f = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
                this.f7042k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f7037f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f7043l == null) {
                Paint paint = new Paint();
                this.f7043l = paint;
                paint.setFilterBitmap(true);
            }
            this.f7043l.setAlpha(this.f7033b.getRootAlpha());
            this.f7043l.setColorFilter(colorFilter);
            return this.f7043l;
        }

        public boolean f() {
            if (this.f7033b.getRootAlpha() < 255) {
                return true;
            }
            return false;
        }

        public boolean g() {
            return this.f7033b.f();
        }

        public int getChangingConfigurations() {
            return this.f7032a;
        }

        public boolean h(int[] iArr) {
            boolean g4 = this.f7033b.g(iArr);
            this.f7042k |= g4;
            return g4;
        }

        public void i() {
            this.f7038g = this.f7034c;
            this.f7039h = this.f7035d;
            this.f7040i = this.f7033b.getRootAlpha();
            this.f7041j = this.f7036e;
            this.f7042k = false;
        }

        public void j(int i4, int i5) {
            this.f7037f.eraseColor(0);
            this.f7033b.b(new Canvas(this.f7037f), i4, i5, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new h(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }

        public C0112h() {
            this.f7034c = null;
            this.f7035d = h.f6976k;
            this.f7033b = new g();
        }
    }

    h() {
        this.f6981f = true;
        this.f6983h = new float[9];
        this.f6984i = new Matrix();
        this.f6985j = new Rect();
        this.f6977b = new C0112h();
    }

    static int a(int i4, float f4) {
        return (i4 & 16777215) | (((int) (((float) Color.alpha(i4)) * f4)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ XmlPullParserException -> 0x003f, IOException -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041 A[Catch:{ XmlPullParserException -> 0x003f, IOException -> 0x003d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.vectordrawable.graphics.drawable.h b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            androidx.vectordrawable.graphics.drawable.h r0 = new androidx.vectordrawable.graphics.drawable.h
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.res.h.e(r6, r7, r8)
            r0.f6975a = r6
            androidx.vectordrawable.graphics.drawable.h$i r6 = new androidx.vectordrawable.graphics.drawable.h$i
            android.graphics.drawable.Drawable r7 = r0.f6975a
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f6982g = r6
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x003f, IOException -> 0x003d }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x003f, IOException -> 0x003d }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x003f, IOException -> 0x003d }
            r4 = 2
            if (r3 == r4) goto L_0x0036
            r5 = 1
            if (r3 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            if (r3 != r4) goto L_0x0041
            androidx.vectordrawable.graphics.drawable.h r6 = c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x003f, IOException -> 0x003d }
            return r6
        L_0x003d:
            r6 = move-exception
            goto L_0x0049
        L_0x003f:
            r6 = move-exception
            goto L_0x004d
        L_0x0041:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x003f, IOException -> 0x003d }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x003f, IOException -> 0x003d }
            throw r6     // Catch:{ XmlPullParserException -> 0x003f, IOException -> 0x003d }
        L_0x0049:
            android.util.Log.e(r1, r0, r6)
            goto L_0x0050
        L_0x004d:
            android.util.Log.e(r1, r0, r6)
        L_0x0050:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.h.b(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.vectordrawable.graphics.drawable.h");
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0112h hVar = this.f6977b;
        g gVar = hVar.f7033b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f7023h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z3 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f6999b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f7031p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f7032a = cVar.f7014d | hVar.f7032a;
                    z3 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f6999b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f7031p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f7032a = bVar.f7014d | hVar.f7032a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f6999b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f7031p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f7032a = dVar2.f7008k | hVar.f7032a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z3) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        if (!isAutoMirrored() || androidx.core.graphics.drawable.a.f(this) != 1) {
            return false;
        }
        return true;
    }

    private static PorterDuff.Mode g(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C0112h hVar = this.f6977b;
        g gVar = hVar.f7033b;
        hVar.f7035d = g(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c4 = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c4 != null) {
            hVar.f7034c = c4;
        }
        hVar.f7036e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f7036e);
        gVar.f7026k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f7026k);
        float f4 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f7027l);
        gVar.f7027l = f4;
        if (gVar.f7026k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f4 > 0.0f) {
            gVar.f7024i = typedArray.getDimension(3, gVar.f7024i);
            float dimension = typedArray.getDimension(2, gVar.f7025j);
            gVar.f7025j = dimension;
            if (gVar.f7024i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f7029n = string;
                    gVar.f7031p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f6975a;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f6977b.f7033b.f7031p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f6985j);
        if (this.f6985j.width() > 0 && this.f6985j.height() > 0) {
            ColorFilter colorFilter = this.f6979d;
            if (colorFilter == null) {
                colorFilter = this.f6978c;
            }
            canvas.getMatrix(this.f6984i);
            this.f6984i.getValues(this.f6983h);
            float abs = Math.abs(this.f6983h[0]);
            float abs2 = Math.abs(this.f6983h[4]);
            float abs3 = Math.abs(this.f6983h[1]);
            float abs4 = Math.abs(this.f6983h[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f6985j.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f6985j.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f6985j;
                canvas.translate((float) rect.left, (float) rect.top);
                if (f()) {
                    canvas.translate((float) this.f6985j.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f6985j.offsetTo(0, 0);
                this.f6977b.c(min, min2);
                if (!this.f6981f) {
                    this.f6977b.j(min, min2);
                } else if (!this.f6977b.b()) {
                    this.f6977b.j(min, min2);
                    this.f6977b.i();
                }
                this.f6977b.d(canvas, colorFilter, this.f6985j);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f6977b.f7033b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f6977b.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.f6979d;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f6975a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f6975a.getConstantState());
        }
        this.f6977b.f7032a = getChangingConfigurations();
        return this.f6977b;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f6977b.f7033b.f7025j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f6977b.f7033b.f7024i;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* access modifiers changed from: package-private */
    public void h(boolean z3) {
        this.f6981f = z3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.f6977b.f7036e;
    }

    public boolean isStateful() {
        C0112h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful() || ((hVar = this.f6977b) != null && (hVar.g() || ((colorStateList = this.f6977b.f7034c) != null && colorStateList.isStateful())))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f6980e && super.mutate() == this) {
            this.f6977b = new C0112h(this.f6977b);
            this.f6980e = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z3;
        PorterDuff.Mode mode;
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0112h hVar = this.f6977b;
        ColorStateList colorStateList = hVar.f7034c;
        if (colorStateList == null || (mode = hVar.f7035d) == null) {
            z3 = false;
        } else {
            this.f6978c = j(this.f6978c, colorStateList, mode);
            invalidateSelf();
            z3 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z3;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j4) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j4);
        } else {
            super.scheduleSelf(runnable, j4);
        }
    }

    public void setAlpha(int i4) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else if (this.f6977b.f7033b.getRootAlpha() != i4) {
            this.f6977b.f7033b.setRootAlpha(i4);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z3);
        } else {
            this.f6977b.f7036e = z3;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i4) {
        super.setChangingConfigurations(i4);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i4, PorterDuff.Mode mode) {
        super.setColorFilter(i4, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z3) {
        super.setFilterBitmap(z3);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f4, float f5) {
        super.setHotspot(f4, f5);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i4, int i5, int i6, int i7) {
        super.setHotspotBounds(i4, i5, i6, i7);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i4) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i4);
        } else {
            setTintList(ColorStateList.valueOf(i4));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        C0112h hVar = this.f6977b;
        if (hVar.f7034c != colorStateList) {
            hVar.f7034c = colorStateList;
            this.f6978c = j(this.f6978c, colorStateList, hVar.f7035d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        C0112h hVar = this.f6977b;
        if (hVar.f7035d != mode) {
            hVar.f7035d = mode;
            this.f6978c = j(this.f6978c, hVar.f7034c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            return drawable.setVisible(z3, z4);
        }
        return super.setVisible(z3, z4);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    private static class i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f7044a;

        public i(Drawable.ConstantState constantState) {
            this.f7044a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f7044a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f7044a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f6975a = (VectorDrawable) this.f7044a.newDrawable();
            return hVar;
        }

        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f6975a = (VectorDrawable) this.f7044a.newDrawable(resources);
            return hVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f6975a = (VectorDrawable) this.f7044a.newDrawable(resources, theme);
            return hVar;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f6979d = colorFilter;
        invalidateSelf();
    }

    private static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        protected h.b[] f7011a = null;

        /* renamed from: b  reason: collision with root package name */
        String f7012b;

        /* renamed from: c  reason: collision with root package name */
        int f7013c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f7014d;

        public f() {
            super();
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            h.b[] bVarArr = this.f7011a;
            if (bVarArr != null) {
                h.b.e(bVarArr, path);
            }
        }

        public h.b[] getPathData() {
            return this.f7011a;
        }

        public String getPathName() {
            return this.f7012b;
        }

        public void setPathData(h.b[] bVarArr) {
            if (!androidx.core.graphics.h.b(this.f7011a, bVarArr)) {
                this.f7011a = androidx.core.graphics.h.f(bVarArr);
            } else {
                androidx.core.graphics.h.j(this.f7011a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f7012b = fVar.f7012b;
            this.f7014d = fVar.f7014d;
            this.f7011a = androidx.core.graphics.h.f(fVar.f7011a);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f6975a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0112h hVar = this.f6977b;
        hVar.f7033b = new g();
        TypedArray k4 = k.k(resources, theme, attributeSet, a.f6944a);
        i(k4, xmlPullParser, theme);
        k4.recycle();
        hVar.f7032a = getChangingConfigurations();
        hVar.f7042k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f6978c = j(this.f6978c, hVar.f7034c, hVar.f7035d);
    }

    h(C0112h hVar) {
        this.f6981f = true;
        this.f6983h = new float[9];
        this.f6984i = new Matrix();
        this.f6985j = new Rect();
        this.f6977b = hVar;
        this.f6978c = j(this.f6978c, hVar.f7034c, hVar.f7035d);
    }

    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f6986e;

        /* renamed from: f  reason: collision with root package name */
        androidx.core.content.res.d f6987f;

        /* renamed from: g  reason: collision with root package name */
        float f6988g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        androidx.core.content.res.d f6989h;

        /* renamed from: i  reason: collision with root package name */
        float f6990i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        float f6991j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        float f6992k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        float f6993l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        float f6994m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        Paint.Cap f6995n = Paint.Cap.BUTT;

        /* renamed from: o  reason: collision with root package name */
        Paint.Join f6996o = Paint.Join.MITER;

        /* renamed from: p  reason: collision with root package name */
        float f6997p = 4.0f;

        c() {
        }

        private Paint.Cap e(int i4, Paint.Cap cap) {
            if (i4 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i4 == 1) {
                return Paint.Cap.ROUND;
            }
            if (i4 != 2) {
                return cap;
            }
            return Paint.Cap.SQUARE;
        }

        private Paint.Join f(int i4, Paint.Join join) {
            if (i4 == 0) {
                return Paint.Join.MITER;
            }
            if (i4 == 1) {
                return Paint.Join.ROUND;
            }
            if (i4 != 2) {
                return join;
            }
            return Paint.Join.BEVEL;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f6986e = null;
            if (k.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f7012b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f7011a = androidx.core.graphics.h.d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f6989h = k.e(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f6991j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f6991j);
                this.f6995n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f6995n);
                this.f6996o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f6996o);
                this.f6997p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f6997p);
                this.f6987f = k.e(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f6990i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f6990i);
                this.f6988g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f6988g);
                this.f6993l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f6993l);
                this.f6994m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f6994m);
                this.f6992k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f6992k);
                this.f7013c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f7013c);
            }
        }

        public boolean a() {
            if (this.f6989h.i() || this.f6987f.i()) {
                return true;
            }
            return false;
        }

        public boolean b(int[] iArr) {
            return this.f6987f.j(iArr) | this.f6989h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k4 = k.k(resources, theme, attributeSet, a.f6946c);
            h(k4, xmlPullParser, theme);
            k4.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f6991j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f6989h.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f6990i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f6987f.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f6988g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f6993l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f6994m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f6992k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f4) {
            this.f6991j = f4;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i4) {
            this.f6989h.k(i4);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f4) {
            this.f6990i = f4;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i4) {
            this.f6987f.k(i4);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f4) {
            this.f6988g = f4;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f4) {
            this.f6993l = f4;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f4) {
            this.f6994m = f4;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f4) {
            this.f6992k = f4;
        }

        c(c cVar) {
            super(cVar);
            this.f6986e = cVar.f6986e;
            this.f6987f = cVar.f6987f;
            this.f6988g = cVar.f6988g;
            this.f6990i = cVar.f6990i;
            this.f6989h = cVar.f6989h;
            this.f7013c = cVar.f7013c;
            this.f6991j = cVar.f6991j;
            this.f6992k = cVar.f6992k;
            this.f6993l = cVar.f6993l;
            this.f6994m = cVar.f6994m;
            this.f6995n = cVar.f6995n;
            this.f6996o = cVar.f6996o;
            this.f6997p = cVar.f6997p;
        }
    }

    private static class g {

        /* renamed from: q  reason: collision with root package name */
        private static final Matrix f7015q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f7016a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f7017b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f7018c;

        /* renamed from: d  reason: collision with root package name */
        Paint f7019d;

        /* renamed from: e  reason: collision with root package name */
        Paint f7020e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f7021f;

        /* renamed from: g  reason: collision with root package name */
        private int f7022g;

        /* renamed from: h  reason: collision with root package name */
        final d f7023h;

        /* renamed from: i  reason: collision with root package name */
        float f7024i;

        /* renamed from: j  reason: collision with root package name */
        float f7025j;

        /* renamed from: k  reason: collision with root package name */
        float f7026k;

        /* renamed from: l  reason: collision with root package name */
        float f7027l;

        /* renamed from: m  reason: collision with root package name */
        int f7028m;

        /* renamed from: n  reason: collision with root package name */
        String f7029n;

        /* renamed from: o  reason: collision with root package name */
        Boolean f7030o;

        /* renamed from: p  reason: collision with root package name */
        final C0939a f7031p;

        public g() {
            this.f7018c = new Matrix();
            this.f7024i = 0.0f;
            this.f7025j = 0.0f;
            this.f7026k = 0.0f;
            this.f7027l = 0.0f;
            this.f7028m = 255;
            this.f7029n = null;
            this.f7030o = null;
            this.f7031p = new C0939a();
            this.f7023h = new d();
            this.f7016a = new Path();
            this.f7017b = new Path();
        }

        private static float a(float f4, float f5, float f6, float f7) {
            return (f4 * f7) - (f5 * f6);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i4, int i5, ColorFilter colorFilter) {
            dVar.f6998a.set(matrix);
            dVar.f6998a.preConcat(dVar.f7007j);
            canvas.save();
            for (int i6 = 0; i6 < dVar.f6999b.size(); i6++) {
                e eVar = (e) dVar.f6999b.get(i6);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f6998a, canvas, i4, i5, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i4, i5, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i4, int i5, ColorFilter colorFilter) {
            Path.FillType fillType;
            Path.FillType fillType2;
            float f4 = ((float) i4) / this.f7026k;
            float f5 = ((float) i5) / this.f7027l;
            float min = Math.min(f4, f5);
            Matrix matrix = dVar.f6998a;
            this.f7018c.set(matrix);
            this.f7018c.postScale(f4, f5);
            float e4 = e(matrix);
            if (e4 != 0.0f) {
                fVar.d(this.f7016a);
                Path path = this.f7016a;
                this.f7017b.reset();
                if (fVar.c()) {
                    Path path2 = this.f7017b;
                    if (fVar.f7013c == 0) {
                        fillType2 = Path.FillType.WINDING;
                    } else {
                        fillType2 = Path.FillType.EVEN_ODD;
                    }
                    path2.setFillType(fillType2);
                    this.f7017b.addPath(path, this.f7018c);
                    canvas.clipPath(this.f7017b);
                    return;
                }
                c cVar = (c) fVar;
                float f6 = cVar.f6992k;
                if (!(f6 == 0.0f && cVar.f6993l == 1.0f)) {
                    float f7 = cVar.f6994m;
                    float f8 = (f6 + f7) % 1.0f;
                    float f9 = (cVar.f6993l + f7) % 1.0f;
                    if (this.f7021f == null) {
                        this.f7021f = new PathMeasure();
                    }
                    this.f7021f.setPath(this.f7016a, false);
                    float length = this.f7021f.getLength();
                    float f10 = f8 * length;
                    float f11 = f9 * length;
                    path.reset();
                    if (f10 > f11) {
                        this.f7021f.getSegment(f10, length, path, true);
                        this.f7021f.getSegment(0.0f, f11, path, true);
                    } else {
                        this.f7021f.getSegment(f10, f11, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f7017b.addPath(path, this.f7018c);
                if (cVar.f6989h.l()) {
                    androidx.core.content.res.d dVar2 = cVar.f6989h;
                    if (this.f7020e == null) {
                        Paint paint = new Paint(1);
                        this.f7020e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f7020e;
                    if (dVar2.h()) {
                        Shader f12 = dVar2.f();
                        f12.setLocalMatrix(this.f7018c);
                        paint2.setShader(f12);
                        paint2.setAlpha(Math.round(cVar.f6991j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(h.a(dVar2.e(), cVar.f6991j));
                    }
                    paint2.setColorFilter(colorFilter);
                    Path path3 = this.f7017b;
                    if (cVar.f7013c == 0) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    path3.setFillType(fillType);
                    canvas.drawPath(this.f7017b, paint2);
                }
                if (cVar.f6987f.l()) {
                    androidx.core.content.res.d dVar3 = cVar.f6987f;
                    if (this.f7019d == null) {
                        Paint paint3 = new Paint(1);
                        this.f7019d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f7019d;
                    Paint.Join join = cVar.f6996o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f6995n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f6997p);
                    if (dVar3.h()) {
                        Shader f13 = dVar3.f();
                        f13.setLocalMatrix(this.f7018c);
                        paint4.setShader(f13);
                        paint4.setAlpha(Math.round(cVar.f6990i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(h.a(dVar3.e(), cVar.f6990i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f6988g * min * e4);
                    canvas.drawPath(this.f7017b, paint4);
                }
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a4 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a4) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i4, int i5, ColorFilter colorFilter) {
            c(this.f7023h, f7015q, canvas, i4, i5, colorFilter);
        }

        public boolean f() {
            if (this.f7030o == null) {
                this.f7030o = Boolean.valueOf(this.f7023h.a());
            }
            return this.f7030o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f7023h.b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f7028m;
        }

        public void setAlpha(float f4) {
            setRootAlpha((int) (f4 * 255.0f));
        }

        public void setRootAlpha(int i4) {
            this.f7028m = i4;
        }

        public g(g gVar) {
            this.f7018c = new Matrix();
            this.f7024i = 0.0f;
            this.f7025j = 0.0f;
            this.f7026k = 0.0f;
            this.f7027l = 0.0f;
            this.f7028m = 255;
            this.f7029n = null;
            this.f7030o = null;
            C0939a aVar = new C0939a();
            this.f7031p = aVar;
            this.f7023h = new d(gVar.f7023h, aVar);
            this.f7016a = new Path(gVar.f7016a);
            this.f7017b = new Path(gVar.f7017b);
            this.f7024i = gVar.f7024i;
            this.f7025j = gVar.f7025j;
            this.f7026k = gVar.f7026k;
            this.f7027l = gVar.f7027l;
            this.f7022g = gVar.f7022g;
            this.f7028m = gVar.f7028m;
            this.f7029n = gVar.f7029n;
            String str = gVar.f7029n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f7030o = gVar.f7030o;
        }
    }

    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f6998a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList f6999b;

        /* renamed from: c  reason: collision with root package name */
        float f7000c;

        /* renamed from: d  reason: collision with root package name */
        private float f7001d;

        /* renamed from: e  reason: collision with root package name */
        private float f7002e;

        /* renamed from: f  reason: collision with root package name */
        private float f7003f;

        /* renamed from: g  reason: collision with root package name */
        private float f7004g;

        /* renamed from: h  reason: collision with root package name */
        private float f7005h;

        /* renamed from: i  reason: collision with root package name */
        private float f7006i;

        /* renamed from: j  reason: collision with root package name */
        final Matrix f7007j;

        /* renamed from: k  reason: collision with root package name */
        int f7008k;

        /* renamed from: l  reason: collision with root package name */
        private int[] f7009l;

        /* renamed from: m  reason: collision with root package name */
        private String f7010m;

        public d(d dVar, C0939a aVar) {
            super();
            f fVar;
            this.f6998a = new Matrix();
            this.f6999b = new ArrayList();
            this.f7000c = 0.0f;
            this.f7001d = 0.0f;
            this.f7002e = 0.0f;
            this.f7003f = 1.0f;
            this.f7004g = 1.0f;
            this.f7005h = 0.0f;
            this.f7006i = 0.0f;
            Matrix matrix = new Matrix();
            this.f7007j = matrix;
            this.f7010m = null;
            this.f7000c = dVar.f7000c;
            this.f7001d = dVar.f7001d;
            this.f7002e = dVar.f7002e;
            this.f7003f = dVar.f7003f;
            this.f7004g = dVar.f7004g;
            this.f7005h = dVar.f7005h;
            this.f7006i = dVar.f7006i;
            this.f7009l = dVar.f7009l;
            String str = dVar.f7010m;
            this.f7010m = str;
            this.f7008k = dVar.f7008k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f7007j);
            ArrayList arrayList = dVar.f6999b;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                Object obj = arrayList.get(i4);
                if (obj instanceof d) {
                    this.f6999b.add(new d((d) obj, aVar));
                } else {
                    if (obj instanceof c) {
                        fVar = new c((c) obj);
                    } else if (obj instanceof b) {
                        fVar = new b((b) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f6999b.add(fVar);
                    String str2 = fVar.f7012b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        private void d() {
            this.f7007j.reset();
            this.f7007j.postTranslate(-this.f7001d, -this.f7002e);
            this.f7007j.postScale(this.f7003f, this.f7004g);
            this.f7007j.postRotate(this.f7000c, 0.0f, 0.0f);
            this.f7007j.postTranslate(this.f7005h + this.f7001d, this.f7006i + this.f7002e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f7009l = null;
            this.f7000c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f7000c);
            this.f7001d = typedArray.getFloat(1, this.f7001d);
            this.f7002e = typedArray.getFloat(2, this.f7002e);
            this.f7003f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f7003f);
            this.f7004g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f7004g);
            this.f7005h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f7005h);
            this.f7006i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f7006i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f7010m = string;
            }
            d();
        }

        public boolean a() {
            for (int i4 = 0; i4 < this.f6999b.size(); i4++) {
                if (((e) this.f6999b.get(i4)).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int[] iArr) {
            boolean z3 = false;
            for (int i4 = 0; i4 < this.f6999b.size(); i4++) {
                z3 |= ((e) this.f6999b.get(i4)).b(iArr);
            }
            return z3;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k4 = k.k(resources, theme, attributeSet, a.f6945b);
            e(k4, xmlPullParser);
            k4.recycle();
        }

        public String getGroupName() {
            return this.f7010m;
        }

        public Matrix getLocalMatrix() {
            return this.f7007j;
        }

        public float getPivotX() {
            return this.f7001d;
        }

        public float getPivotY() {
            return this.f7002e;
        }

        public float getRotation() {
            return this.f7000c;
        }

        public float getScaleX() {
            return this.f7003f;
        }

        public float getScaleY() {
            return this.f7004g;
        }

        public float getTranslateX() {
            return this.f7005h;
        }

        public float getTranslateY() {
            return this.f7006i;
        }

        public void setPivotX(float f4) {
            if (f4 != this.f7001d) {
                this.f7001d = f4;
                d();
            }
        }

        public void setPivotY(float f4) {
            if (f4 != this.f7002e) {
                this.f7002e = f4;
                d();
            }
        }

        public void setRotation(float f4) {
            if (f4 != this.f7000c) {
                this.f7000c = f4;
                d();
            }
        }

        public void setScaleX(float f4) {
            if (f4 != this.f7003f) {
                this.f7003f = f4;
                d();
            }
        }

        public void setScaleY(float f4) {
            if (f4 != this.f7004g) {
                this.f7004g = f4;
                d();
            }
        }

        public void setTranslateX(float f4) {
            if (f4 != this.f7005h) {
                this.f7005h = f4;
                d();
            }
        }

        public void setTranslateY(float f4) {
            if (f4 != this.f7006i) {
                this.f7006i = f4;
                d();
            }
        }

        public d() {
            super();
            this.f6998a = new Matrix();
            this.f6999b = new ArrayList();
            this.f7000c = 0.0f;
            this.f7001d = 0.0f;
            this.f7002e = 0.0f;
            this.f7003f = 1.0f;
            this.f7004g = 1.0f;
            this.f7005h = 0.0f;
            this.f7006i = 0.0f;
            this.f7007j = new Matrix();
            this.f7010m = null;
        }
    }
}
