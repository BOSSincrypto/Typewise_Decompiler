package P1;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

public class a {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f1117i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    private static final float[] f1118j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f1119k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f1120l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f1121a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f1122b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f1123c;

    /* renamed from: d  reason: collision with root package name */
    private int f1124d;

    /* renamed from: e  reason: collision with root package name */
    private int f1125e;

    /* renamed from: f  reason: collision with root package name */
    private int f1126f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f1127g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f1128h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i4, float f4, float f5) {
        boolean z3;
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i5 = i4;
        float f6 = f5;
        if (f6 < 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        Path path = this.f1127g;
        if (z3) {
            int[] iArr = f1119k;
            iArr[0] = 0;
            iArr[1] = this.f1126f;
            iArr[2] = this.f1125e;
            iArr[3] = this.f1124d;
            float f7 = f4;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f4, f6);
            path.close();
            float f8 = (float) (-i5);
            rectF2.inset(f8, f8);
            int[] iArr2 = f1119k;
            iArr2[0] = 0;
            iArr2[1] = this.f1124d;
            iArr2[2] = this.f1125e;
            iArr2[3] = this.f1126f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f9 = 1.0f - (((float) i5) / width);
            float[] fArr = f1120l;
            fArr[1] = f9;
            fArr[2] = ((1.0f - f9) / 2.0f) + f9;
            this.f1122b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f1119k, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z3) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, this.f1128h);
            }
            canvas.drawArc(rectF, f4, f5, true, this.f1122b);
            canvas.restore();
        }
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i4) {
        rectF.bottom += (float) i4;
        rectF.offset(0.0f, (float) (-i4));
        int[] iArr = f1117i;
        iArr[0] = this.f1126f;
        iArr[1] = this.f1125e;
        iArr[2] = this.f1124d;
        Paint paint = this.f1123c;
        float f4 = rectF.left;
        paint.setShader(new LinearGradient(f4, rectF.top, f4, rectF.bottom, iArr, f1118j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f1123c);
        canvas.restore();
    }

    public Paint c() {
        return this.f1121a;
    }

    public void d(int i4) {
        this.f1124d = androidx.core.graphics.a.k(i4, 68);
        this.f1125e = androidx.core.graphics.a.k(i4, 20);
        this.f1126f = androidx.core.graphics.a.k(i4, 0);
        this.f1121a.setColor(this.f1124d);
    }

    public a(int i4) {
        this.f1127g = new Path();
        Paint paint = new Paint();
        this.f1128h = paint;
        this.f1121a = new Paint();
        d(i4);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f1122b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f1123c = new Paint(paint2);
    }
}
