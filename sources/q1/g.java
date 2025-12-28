package Q1;

import Q1.k;
import Q1.l;
import Q1.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import z1.C0970a;

public class g extends Drawable implements n {

    /* renamed from: x  reason: collision with root package name */
    private static final String f1220x = "g";

    /* renamed from: y  reason: collision with root package name */
    private static final Paint f1221y;

    /* renamed from: a  reason: collision with root package name */
    private c f1222a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final m.g[] f1223b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final m.g[] f1224c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final BitSet f1225d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f1226e;

    /* renamed from: f  reason: collision with root package name */
    private final Matrix f1227f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f1228g;

    /* renamed from: h  reason: collision with root package name */
    private final Path f1229h;

    /* renamed from: i  reason: collision with root package name */
    private final RectF f1230i;

    /* renamed from: j  reason: collision with root package name */
    private final RectF f1231j;

    /* renamed from: k  reason: collision with root package name */
    private final Region f1232k;

    /* renamed from: l  reason: collision with root package name */
    private final Region f1233l;

    /* renamed from: m  reason: collision with root package name */
    private k f1234m;

    /* renamed from: n  reason: collision with root package name */
    private final Paint f1235n;

    /* renamed from: o  reason: collision with root package name */
    private final Paint f1236o;

    /* renamed from: p  reason: collision with root package name */
    private final P1.a f1237p;

    /* renamed from: q  reason: collision with root package name */
    private final l.b f1238q;

    /* renamed from: r  reason: collision with root package name */
    private final l f1239r;

    /* renamed from: s  reason: collision with root package name */
    private PorterDuffColorFilter f1240s;

    /* renamed from: t  reason: collision with root package name */
    private PorterDuffColorFilter f1241t;

    /* renamed from: u  reason: collision with root package name */
    private int f1242u;

    /* renamed from: v  reason: collision with root package name */
    private final RectF f1243v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1244w;

    class a implements l.b {
        a() {
        }

        public void a(m mVar, Matrix matrix, int i4) {
            g.this.f1225d.set(i4, mVar.e());
            g.this.f1223b[i4] = mVar.f(matrix);
        }

        public void b(m mVar, Matrix matrix, int i4) {
            g.this.f1225d.set(i4 + 4, mVar.e());
            g.this.f1224c[i4] = mVar.f(matrix);
        }
    }

    class b implements k.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f1246a;

        b(float f4) {
            this.f1246a = f4;
        }

        public c a(c cVar) {
            if (cVar instanceof i) {
                return cVar;
            }
            return new b(this.f1246a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f1221y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    private float B() {
        if (I()) {
            return this.f1236o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean G() {
        c cVar = this.f1222a;
        int i4 = cVar.f1264q;
        if (i4 == 1 || cVar.f1265r <= 0 || (i4 != 2 && !Q())) {
            return false;
        }
        return true;
    }

    private boolean H() {
        Paint.Style style = this.f1222a.f1269v;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            return true;
        }
        return false;
    }

    private boolean I() {
        Paint.Style style = this.f1222a.f1269v;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f1236o.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    private void K() {
        super.invalidateSelf();
    }

    private void N(Canvas canvas) {
        if (G()) {
            canvas.save();
            P(canvas);
            if (!this.f1244w) {
                n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f1243v.width() - ((float) getBounds().width()));
            int height = (int) (this.f1243v.height() - ((float) getBounds().height()));
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f1243v.width()) + (this.f1222a.f1265r * 2) + width, ((int) this.f1243v.height()) + (this.f1222a.f1265r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f4 = (float) ((getBounds().left - this.f1222a.f1265r) - width);
            float f5 = (float) ((getBounds().top - this.f1222a.f1265r) - height);
            canvas2.translate(-f4, -f5);
            n(canvas2);
            canvas.drawBitmap(createBitmap, f4, f5, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    private static int O(int i4, int i5) {
        return (i4 * (i5 + (i5 >>> 7))) >>> 8;
    }

    private void P(Canvas canvas) {
        canvas.translate((float) y(), (float) z());
    }

    private boolean b0(int[] iArr) {
        boolean z3;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f1222a.f1251d == null || (color2 = this.f1235n.getColor()) == (colorForState2 = this.f1222a.f1251d.getColorForState(iArr, color2))) {
            z3 = false;
        } else {
            this.f1235n.setColor(colorForState2);
            z3 = true;
        }
        if (this.f1222a.f1252e == null || (color = this.f1236o.getColor()) == (colorForState = this.f1222a.f1252e.getColorForState(iArr, color))) {
            return z3;
        }
        this.f1236o.setColor(colorForState);
        return true;
    }

    private boolean c0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f1240s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1241t;
        c cVar = this.f1222a;
        this.f1240s = k(cVar.f1254g, cVar.f1255h, this.f1235n, true);
        c cVar2 = this.f1222a;
        this.f1241t = k(cVar2.f1253f, cVar2.f1255h, this.f1236o, false);
        c cVar3 = this.f1222a;
        if (cVar3.f1268u) {
            this.f1237p.d(cVar3.f1254g.getColorForState(getState(), 0));
        }
        if (!androidx.core.util.c.a(porterDuffColorFilter, this.f1240s) || !androidx.core.util.c.a(porterDuffColorFilter2, this.f1241t)) {
            return true;
        }
        return false;
    }

    private void d0() {
        float F3 = F();
        this.f1222a.f1265r = (int) Math.ceil((double) (0.75f * F3));
        this.f1222a.f1266s = (int) Math.ceil((double) (F3 * 0.25f));
        c0();
        K();
    }

    private PorterDuffColorFilter f(Paint paint, boolean z3) {
        if (!z3) {
            return null;
        }
        int color = paint.getColor();
        int l4 = l(color);
        this.f1242u = l4;
        if (l4 != color) {
            return new PorterDuffColorFilter(l4, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f1222a.f1257j != 1.0f) {
            this.f1227f.reset();
            Matrix matrix = this.f1227f;
            float f4 = this.f1222a.f1257j;
            matrix.setScale(f4, f4, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f1227f);
        }
        path.computeBounds(this.f1243v, true);
    }

    private void i() {
        k y3 = A().y(new b(-B()));
        this.f1234m = y3;
        this.f1239r.e(y3, this.f1222a.f1258k, t(), this.f1229h);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z3) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z3) {
            colorForState = l(colorForState);
        }
        this.f1242u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z3) {
        if (colorStateList == null || mode == null) {
            return f(paint, z3);
        }
        return j(colorStateList, mode, z3);
    }

    public static g m(Context context, float f4, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(F1.a.c(context, C0970a.colorSurface, g.class.getSimpleName()));
        }
        g gVar = new g();
        gVar.J(context);
        gVar.T(colorStateList);
        gVar.S(f4);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.f1225d.cardinality() > 0) {
            Log.w(f1220x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f1222a.f1266s != 0) {
            canvas.drawPath(this.f1228g, this.f1237p.c());
        }
        for (int i4 = 0; i4 < 4; i4++) {
            this.f1223b[i4].a(this.f1237p, this.f1222a.f1265r, canvas);
            this.f1224c[i4].a(this.f1237p, this.f1222a.f1265r, canvas);
        }
        if (this.f1244w) {
            int y3 = y();
            int z3 = z();
            canvas.translate((float) (-y3), (float) (-z3));
            canvas.drawPath(this.f1228g, f1221y);
            canvas.translate((float) y3, (float) z3);
        }
    }

    private void o(Canvas canvas) {
        p(canvas, this.f1235n, this.f1228g, this.f1222a.f1248a, s());
    }

    private void p(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.u(rectF)) {
            float a4 = kVar.t().a(rectF) * this.f1222a.f1258k;
            canvas.drawRoundRect(rectF, a4, a4, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private RectF t() {
        this.f1231j.set(s());
        float B3 = B();
        this.f1231j.inset(B3, B3);
        return this.f1231j;
    }

    public k A() {
        return this.f1222a.f1248a;
    }

    public float C() {
        return this.f1222a.f1248a.r().a(s());
    }

    public float D() {
        return this.f1222a.f1248a.t().a(s());
    }

    public float E() {
        return this.f1222a.f1263p;
    }

    public float F() {
        return u() + E();
    }

    public void J(Context context) {
        this.f1222a.f1249b = new I1.a(context);
        d0();
    }

    public boolean L() {
        I1.a aVar = this.f1222a.f1249b;
        if (aVar == null || !aVar.d()) {
            return false;
        }
        return true;
    }

    public boolean M() {
        return this.f1222a.f1248a.u(s());
    }

    public boolean Q() {
        int i4 = Build.VERSION.SDK_INT;
        if (M() || this.f1228g.isConvex() || i4 >= 29) {
            return false;
        }
        return true;
    }

    public void R(c cVar) {
        setShapeAppearanceModel(this.f1222a.f1248a.x(cVar));
    }

    public void S(float f4) {
        c cVar = this.f1222a;
        if (cVar.f1262o != f4) {
            cVar.f1262o = f4;
            d0();
        }
    }

    public void T(ColorStateList colorStateList) {
        c cVar = this.f1222a;
        if (cVar.f1251d != colorStateList) {
            cVar.f1251d = colorStateList;
            onStateChange(getState());
        }
    }

    public void U(float f4) {
        c cVar = this.f1222a;
        if (cVar.f1258k != f4) {
            cVar.f1258k = f4;
            this.f1226e = true;
            invalidateSelf();
        }
    }

    public void V(int i4, int i5, int i6, int i7) {
        c cVar = this.f1222a;
        if (cVar.f1256i == null) {
            cVar.f1256i = new Rect();
        }
        this.f1222a.f1256i.set(i4, i5, i6, i7);
        invalidateSelf();
    }

    public void W(float f4) {
        c cVar = this.f1222a;
        if (cVar.f1261n != f4) {
            cVar.f1261n = f4;
            d0();
        }
    }

    public void X(float f4, int i4) {
        a0(f4);
        Z(ColorStateList.valueOf(i4));
    }

    public void Y(float f4, ColorStateList colorStateList) {
        a0(f4);
        Z(colorStateList);
    }

    public void Z(ColorStateList colorStateList) {
        c cVar = this.f1222a;
        if (cVar.f1252e != colorStateList) {
            cVar.f1252e = colorStateList;
            onStateChange(getState());
        }
    }

    public void a0(float f4) {
        this.f1222a.f1259l = f4;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f1235n.setColorFilter(this.f1240s);
        int alpha = this.f1235n.getAlpha();
        this.f1235n.setAlpha(O(alpha, this.f1222a.f1260m));
        this.f1236o.setColorFilter(this.f1241t);
        this.f1236o.setStrokeWidth(this.f1222a.f1259l);
        int alpha2 = this.f1236o.getAlpha();
        this.f1236o.setAlpha(O(alpha2, this.f1222a.f1260m));
        if (this.f1226e) {
            i();
            g(s(), this.f1228g);
            this.f1226e = false;
        }
        N(canvas);
        if (H()) {
            o(canvas);
        }
        if (I()) {
            r(canvas);
        }
        this.f1235n.setAlpha(alpha);
        this.f1236o.setAlpha(alpha2);
    }

    public int getAlpha() {
        return this.f1222a.f1260m;
    }

    public Drawable.ConstantState getConstantState() {
        return this.f1222a;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        if (this.f1222a.f1264q != 2) {
            if (M()) {
                outline.setRoundRect(getBounds(), C() * this.f1222a.f1258k);
                return;
            }
            g(s(), this.f1228g);
            H1.a.h(outline, this.f1228g);
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f1222a.f1256i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f1232k.set(getBounds());
        g(s(), this.f1228g);
        this.f1233l.setPath(this.f1228g, this.f1232k);
        this.f1232k.op(this.f1233l, Region.Op.DIFFERENCE);
        return this.f1232k;
    }

    /* access modifiers changed from: protected */
    public final void h(RectF rectF, Path path) {
        l lVar = this.f1239r;
        c cVar = this.f1222a;
        k kVar = cVar.f1248a;
        float f4 = cVar.f1258k;
        lVar.d(kVar, f4, rectF, this.f1238q, path);
    }

    public void invalidateSelf() {
        this.f1226e = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (super.isStateful() || (((colorStateList = this.f1222a.f1254g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f1222a.f1253f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f1222a.f1252e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f1222a.f1251d) != null && colorStateList4.isStateful()))))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public int l(int i4) {
        float F3 = F() + x();
        I1.a aVar = this.f1222a.f1249b;
        if (aVar != null) {
            return aVar.c(i4, F3);
        }
        return i4;
    }

    public Drawable mutate() {
        this.f1222a = new c(this.f1222a);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f1226e = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z3;
        boolean b02 = b0(iArr);
        boolean c02 = c0();
        if (b02 || c02) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            invalidateSelf();
        }
        return z3;
    }

    /* access modifiers changed from: protected */
    public void q(Canvas canvas, Paint paint, Path path, RectF rectF) {
        p(canvas, paint, path, this.f1222a.f1248a, rectF);
    }

    /* access modifiers changed from: protected */
    public void r(Canvas canvas) {
        p(canvas, this.f1236o, this.f1229h, this.f1234m, t());
    }

    /* access modifiers changed from: protected */
    public RectF s() {
        this.f1230i.set(getBounds());
        return this.f1230i;
    }

    public void setAlpha(int i4) {
        c cVar = this.f1222a;
        if (cVar.f1260m != i4) {
            cVar.f1260m = i4;
            K();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1222a.f1250c = colorFilter;
        K();
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f1222a.f1248a = kVar;
        invalidateSelf();
    }

    public void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1222a.f1254g = colorStateList;
        c0();
        K();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f1222a;
        if (cVar.f1255h != mode) {
            cVar.f1255h = mode;
            c0();
            K();
        }
    }

    public float u() {
        return this.f1222a.f1262o;
    }

    public ColorStateList v() {
        return this.f1222a.f1251d;
    }

    public float w() {
        return this.f1222a.f1258k;
    }

    public float x() {
        return this.f1222a.f1261n;
    }

    public int y() {
        c cVar = this.f1222a;
        return (int) (((double) cVar.f1266s) * Math.sin(Math.toRadians((double) cVar.f1267t)));
    }

    public int z() {
        c cVar = this.f1222a;
        return (int) (((double) cVar.f1266s) * Math.cos(Math.toRadians((double) cVar.f1267t)));
    }

    public g(Context context, AttributeSet attributeSet, int i4, int i5) {
        this(k.e(context, attributeSet, i4, i5).m());
    }

    public g(k kVar) {
        this(new c(kVar, (I1.a) null));
    }

    protected g(c cVar) {
        l lVar;
        this.f1223b = new m.g[4];
        this.f1224c = new m.g[4];
        this.f1225d = new BitSet(8);
        this.f1227f = new Matrix();
        this.f1228g = new Path();
        this.f1229h = new Path();
        this.f1230i = new RectF();
        this.f1231j = new RectF();
        this.f1232k = new Region();
        this.f1233l = new Region();
        Paint paint = new Paint(1);
        this.f1235n = paint;
        Paint paint2 = new Paint(1);
        this.f1236o = paint2;
        this.f1237p = new P1.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.k();
        } else {
            lVar = new l();
        }
        this.f1239r = lVar;
        this.f1243v = new RectF();
        this.f1244w = true;
        this.f1222a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        c0();
        b0(getState());
        this.f1238q = new a();
    }

    protected static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        k f1248a;

        /* renamed from: b  reason: collision with root package name */
        I1.a f1249b;

        /* renamed from: c  reason: collision with root package name */
        ColorFilter f1250c;

        /* renamed from: d  reason: collision with root package name */
        ColorStateList f1251d = null;

        /* renamed from: e  reason: collision with root package name */
        ColorStateList f1252e = null;

        /* renamed from: f  reason: collision with root package name */
        ColorStateList f1253f = null;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f1254g = null;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f1255h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i  reason: collision with root package name */
        Rect f1256i = null;

        /* renamed from: j  reason: collision with root package name */
        float f1257j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        float f1258k = 1.0f;

        /* renamed from: l  reason: collision with root package name */
        float f1259l;

        /* renamed from: m  reason: collision with root package name */
        int f1260m = 255;

        /* renamed from: n  reason: collision with root package name */
        float f1261n = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        float f1262o = 0.0f;

        /* renamed from: p  reason: collision with root package name */
        float f1263p = 0.0f;

        /* renamed from: q  reason: collision with root package name */
        int f1264q = 0;

        /* renamed from: r  reason: collision with root package name */
        int f1265r = 0;

        /* renamed from: s  reason: collision with root package name */
        int f1266s = 0;

        /* renamed from: t  reason: collision with root package name */
        int f1267t = 0;

        /* renamed from: u  reason: collision with root package name */
        boolean f1268u = false;

        /* renamed from: v  reason: collision with root package name */
        Paint.Style f1269v = Paint.Style.FILL_AND_STROKE;

        public c(k kVar, I1.a aVar) {
            this.f1248a = kVar;
            this.f1249b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            g gVar = new g(this);
            boolean unused = gVar.f1226e = true;
            return gVar;
        }

        public c(c cVar) {
            this.f1248a = cVar.f1248a;
            this.f1249b = cVar.f1249b;
            this.f1259l = cVar.f1259l;
            this.f1250c = cVar.f1250c;
            this.f1251d = cVar.f1251d;
            this.f1252e = cVar.f1252e;
            this.f1255h = cVar.f1255h;
            this.f1254g = cVar.f1254g;
            this.f1260m = cVar.f1260m;
            this.f1257j = cVar.f1257j;
            this.f1266s = cVar.f1266s;
            this.f1264q = cVar.f1264q;
            this.f1268u = cVar.f1268u;
            this.f1258k = cVar.f1258k;
            this.f1261n = cVar.f1261n;
            this.f1262o = cVar.f1262o;
            this.f1263p = cVar.f1263p;
            this.f1265r = cVar.f1265r;
            this.f1267t = cVar.f1267t;
            this.f1253f = cVar.f1253f;
            this.f1269v = cVar.f1269v;
            if (cVar.f1256i != null) {
                this.f1256i = new Rect(cVar.f1256i);
            }
        }
    }
}
