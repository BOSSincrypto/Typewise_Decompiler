package Q1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private final m[] f1297a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    private final Matrix[] f1298b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix[] f1299c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    private final PointF f1300d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    private final Path f1301e = new Path();

    /* renamed from: f  reason: collision with root package name */
    private final Path f1302f = new Path();

    /* renamed from: g  reason: collision with root package name */
    private final m f1303g = new m();

    /* renamed from: h  reason: collision with root package name */
    private final float[] f1304h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    private final float[] f1305i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    private final Path f1306j = new Path();

    /* renamed from: k  reason: collision with root package name */
    private final Path f1307k = new Path();

    /* renamed from: l  reason: collision with root package name */
    private boolean f1308l = true;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final l f1309a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i4);

        void b(m mVar, Matrix matrix, int i4);
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final k f1310a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f1311b;

        /* renamed from: c  reason: collision with root package name */
        public final RectF f1312c;

        /* renamed from: d  reason: collision with root package name */
        public final b f1313d;

        /* renamed from: e  reason: collision with root package name */
        public final float f1314e;

        c(k kVar, float f4, RectF rectF, b bVar, Path path) {
            this.f1313d = bVar;
            this.f1310a = kVar;
            this.f1314e = f4;
            this.f1312c = rectF;
            this.f1311b = path;
        }
    }

    public l() {
        for (int i4 = 0; i4 < 4; i4++) {
            this.f1297a[i4] = new m();
            this.f1298b[i4] = new Matrix();
            this.f1299c[i4] = new Matrix();
        }
    }

    private float a(int i4) {
        return (float) (((i4 + 1) % 4) * 90);
    }

    private void b(c cVar, int i4) {
        this.f1304h[0] = this.f1297a[i4].k();
        this.f1304h[1] = this.f1297a[i4].l();
        this.f1298b[i4].mapPoints(this.f1304h);
        if (i4 == 0) {
            Path path = cVar.f1311b;
            float[] fArr = this.f1304h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f1311b;
            float[] fArr2 = this.f1304h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f1297a[i4].d(this.f1298b[i4], cVar.f1311b);
        b bVar = cVar.f1313d;
        if (bVar != null) {
            bVar.a(this.f1297a[i4], this.f1298b[i4], i4);
        }
    }

    private void c(c cVar, int i4) {
        int i5 = (i4 + 1) % 4;
        this.f1304h[0] = this.f1297a[i4].i();
        this.f1304h[1] = this.f1297a[i4].j();
        this.f1298b[i4].mapPoints(this.f1304h);
        this.f1305i[0] = this.f1297a[i5].k();
        this.f1305i[1] = this.f1297a[i5].l();
        this.f1298b[i5].mapPoints(this.f1305i);
        float[] fArr = this.f1304h;
        float f4 = fArr[0];
        float[] fArr2 = this.f1305i;
        float max = Math.max(((float) Math.hypot((double) (f4 - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i6 = i(cVar.f1312c, i4);
        this.f1303g.n(0.0f, 0.0f);
        f j4 = j(i4, cVar.f1310a);
        j4.b(max, i6, cVar.f1314e, this.f1303g);
        this.f1306j.reset();
        this.f1303g.d(this.f1299c[i4], this.f1306j);
        if (!this.f1308l || (!j4.a() && !l(this.f1306j, i4) && !l(this.f1306j, i5))) {
            this.f1303g.d(this.f1299c[i4], cVar.f1311b);
        } else {
            Path path = this.f1306j;
            path.op(path, this.f1302f, Path.Op.DIFFERENCE);
            this.f1304h[0] = this.f1303g.k();
            this.f1304h[1] = this.f1303g.l();
            this.f1299c[i4].mapPoints(this.f1304h);
            Path path2 = this.f1301e;
            float[] fArr3 = this.f1304h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f1303g.d(this.f1299c[i4], this.f1301e);
        }
        b bVar = cVar.f1313d;
        if (bVar != null) {
            bVar.b(this.f1303g, this.f1299c[i4], i4);
        }
    }

    private void f(int i4, RectF rectF, PointF pointF) {
        if (i4 == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i4 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i4 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private c g(int i4, k kVar) {
        if (i4 == 1) {
            return kVar.l();
        }
        if (i4 == 2) {
            return kVar.j();
        }
        if (i4 != 3) {
            return kVar.t();
        }
        return kVar.r();
    }

    private d h(int i4, k kVar) {
        if (i4 == 1) {
            return kVar.k();
        }
        if (i4 == 2) {
            return kVar.i();
        }
        if (i4 != 3) {
            return kVar.s();
        }
        return kVar.q();
    }

    private float i(RectF rectF, int i4) {
        float[] fArr = this.f1304h;
        m mVar = this.f1297a[i4];
        fArr[0] = mVar.f1317c;
        fArr[1] = mVar.f1318d;
        this.f1298b[i4].mapPoints(fArr);
        if (i4 == 1 || i4 == 3) {
            return Math.abs(rectF.centerX() - this.f1304h[0]);
        }
        return Math.abs(rectF.centerY() - this.f1304h[1]);
    }

    private f j(int i4, k kVar) {
        if (i4 == 1) {
            return kVar.h();
        }
        if (i4 == 2) {
            return kVar.n();
        }
        if (i4 != 3) {
            return kVar.o();
        }
        return kVar.p();
    }

    public static l k() {
        return a.f1309a;
    }

    private boolean l(Path path, int i4) {
        this.f1307k.reset();
        this.f1297a[i4].d(this.f1298b[i4], this.f1307k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f1307k.computeBounds(rectF, true);
        path.op(this.f1307k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    private void m(c cVar, int i4) {
        h(i4, cVar.f1310a).b(this.f1297a[i4], 90.0f, cVar.f1314e, cVar.f1312c, g(i4, cVar.f1310a));
        float a4 = a(i4);
        this.f1298b[i4].reset();
        f(i4, cVar.f1312c, this.f1300d);
        Matrix matrix = this.f1298b[i4];
        PointF pointF = this.f1300d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f1298b[i4].preRotate(a4);
    }

    private void n(int i4) {
        this.f1304h[0] = this.f1297a[i4].i();
        this.f1304h[1] = this.f1297a[i4].j();
        this.f1298b[i4].mapPoints(this.f1304h);
        float a4 = a(i4);
        this.f1299c[i4].reset();
        Matrix matrix = this.f1299c[i4];
        float[] fArr = this.f1304h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f1299c[i4].preRotate(a4);
    }

    public void d(k kVar, float f4, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f1301e.rewind();
        this.f1302f.rewind();
        this.f1302f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f4, rectF, bVar, path);
        for (int i4 = 0; i4 < 4; i4++) {
            m(cVar, i4);
            n(i4);
        }
        for (int i5 = 0; i5 < 4; i5++) {
            b(cVar, i5);
            c(cVar, i5);
        }
        path.close();
        this.f1301e.close();
        if (!this.f1301e.isEmpty()) {
            path.op(this.f1301e, Path.Op.UNION);
        }
    }

    public void e(k kVar, float f4, RectF rectF, Path path) {
        d(kVar, f4, rectF, (b) null, path);
    }
}
