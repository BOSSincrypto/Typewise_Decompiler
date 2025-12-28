package R0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import ch.icoaching.wrio.C0553q;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import kotlin.Triple;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class b extends View {

    /* renamed from: j  reason: collision with root package name */
    public static final a f1370j = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Paint f1371a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f1372b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1373c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ThemeModel.a f1374d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public String f1375e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f1376f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f1377g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public float f1378h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f1379i;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final Triple a(Context context, int i4, int i5, int i6, String str, ThemeModel.a aVar, boolean z3) {
            o.e(context, "context");
            o.e(str, "character");
            o.e(aVar, "previewPopUpTheme");
            b bVar = new b(context);
            bVar.f1377g = i4;
            bVar.f1376f = i5;
            bVar.f1378h = (float) i6;
            bVar.f1379i = z3;
            bVar.f1375e = str;
            bVar.f1374d = aVar;
            bVar.f1371a.setColor(aVar.a());
            bVar.setElevation((float) C0553q.a(1));
            return new Triple(bVar, Integer.valueOf(i4), Integer.valueOf(i5));
        }

        private a() {
        }
    }

    /* renamed from: R0.b$b  reason: collision with other inner class name */
    public static final class C0022b extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f1380a;

        C0022b(b bVar) {
            this.f1380a = bVar;
        }

        public void getOutline(View view, Outline outline) {
            o.e(view, "view");
            o.e(outline, "outline");
            if (Build.VERSION.SDK_INT >= 30) {
                outline.setPath(this.f1380a.j());
                return;
            }
            try {
                outline.setConvexPath(this.f1380a.j());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final Path a() {
        PointF pointF = new PointF(this.f1378h + ((float) this.f1373c), (float) this.f1376f);
        PointF pointF2 = new PointF((((float) this.f1377g) - this.f1378h) - ((float) this.f1373c), (float) this.f1376f);
        float a4 = (float) C0553q.a(12);
        float f4 = (float) this.f1373c;
        PointF pointF3 = new PointF(this.f1378h + f4, (pointF.y - a4) - f4);
        PointF pointF4 = new PointF(f4, pointF.y - f4);
        float f5 = a4 + f4;
        PointF pointF5 = new PointF(f5, f5);
        PointF pointF6 = new PointF(f4, f4);
        PointF pointF7 = new PointF((((float) this.f1377g) - a4) - f4, f5);
        PointF pointF8 = new PointF(((float) this.f1377g) - f4, f4);
        PointF pointF9 = new PointF((((float) this.f1377g) - this.f1378h) - f4, (pointF2.y - a4) - f4);
        PointF pointF10 = new PointF(((float) this.f1377g) - f4, pointF2.y - f4);
        RectF rectF = new RectF(pointF4.x, pointF3.y, pointF3.x, pointF4.y);
        RectF rectF2 = new RectF(pointF6.x, pointF6.y, pointF5.x, pointF5.y);
        RectF rectF3 = new RectF(pointF7.x, pointF8.y, pointF8.x, pointF7.y);
        RectF rectF4 = new RectF(pointF9.x, pointF9.y, pointF10.x, pointF10.y);
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.arcTo(rectF2, 180.0f, 90.0f);
        path.arcTo(rectF3, 270.0f, 90.0f);
        path.arcTo(rectF4, 0.0f, 90.0f);
        path.lineTo(pointF2.x, pointF2.y);
        return path;
    }

    private final void h(Canvas canvas, String str) {
        Paint paint = this.f1372b;
        ThemeModel.a aVar = this.f1374d;
        if (aVar == null) {
            o.p("theme");
            aVar = null;
        }
        paint.setColor(aVar.b());
        canvas.drawText(str, ((float) this.f1377g) / 2.0f, (((float) canvas.getHeight()) / 2.0f) - ((this.f1372b.descent() + this.f1372b.ascent()) / 2.0f), this.f1372b);
    }

    /* access modifiers changed from: private */
    public final Path j() {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = new PointF(this.f1378h, (float) this.f1376f);
        PointF pointF4 = new PointF(((float) this.f1377g) - this.f1378h, (float) this.f1376f);
        float a4 = (float) C0553q.a(12);
        if (this.f1379i) {
            pointF = new PointF(a4, pointF3.y - a4);
        } else {
            pointF = new PointF(0.0f, pointF3.y - a4);
        }
        PointF pointF5 = new PointF(0.0f, pointF3.y);
        PointF pointF6 = new PointF(a4, a4);
        PointF pointF7 = new PointF(0.0f, 0.0f);
        PointF pointF8 = new PointF(((float) this.f1377g) - a4, a4);
        PointF pointF9 = new PointF((float) this.f1377g, 0.0f);
        if (this.f1379i) {
            pointF2 = new PointF(((float) this.f1377g) - a4, pointF4.y - a4);
        } else {
            pointF2 = new PointF((float) this.f1377g, pointF4.y - a4);
        }
        PointF pointF10 = new PointF((float) this.f1377g, pointF4.y);
        RectF rectF = new RectF(pointF5.x, pointF.y, pointF.x, pointF5.y);
        RectF rectF2 = new RectF(pointF7.x, pointF7.y, pointF6.x, pointF6.y);
        RectF rectF3 = new RectF(pointF8.x, pointF9.y, pointF9.x, pointF8.y);
        RectF rectF4 = new RectF(pointF2.x, pointF2.y, pointF10.x, pointF10.y);
        Path path = new Path();
        path.moveTo(pointF3.x, pointF3.y);
        path.arcTo(rectF, 90.0f, 90.0f);
        path.arcTo(rectF2, 180.0f, 90.0f);
        path.arcTo(rectF3, 270.0f, 90.0f);
        path.arcTo(rectF4, 0.0f, 90.0f);
        path.lineTo(pointF4.x, pointF4.y);
        return path;
    }

    private final void l() {
        setOutlineProvider(new C0022b(this));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        o.e(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPath(a(), this.f1371a);
        String str = this.f1375e;
        if (str == null) {
            o.p("character");
            str = null;
        }
        h(canvas, str);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        setClipToOutline(false);
        this.f1372b.setTextSize((float) C0553q.b(20));
        setMeasuredDimension(this.f1377g, this.f1376f);
        l();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f1371a = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setTextAlign(Paint.Align.CENTER);
        this.f1372b = paint2;
        this.f1373c = C0553q.a(1);
        setBackgroundColor(0);
    }
}
