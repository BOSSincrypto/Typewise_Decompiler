package Q1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public float f1315a;

    /* renamed from: b  reason: collision with root package name */
    public float f1316b;

    /* renamed from: c  reason: collision with root package name */
    public float f1317c;

    /* renamed from: d  reason: collision with root package name */
    public float f1318d;

    /* renamed from: e  reason: collision with root package name */
    public float f1319e;

    /* renamed from: f  reason: collision with root package name */
    public float f1320f;

    /* renamed from: g  reason: collision with root package name */
    private final List f1321g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List f1322h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private boolean f1323i;

    class a extends g {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f1324c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Matrix f1325d;

        a(List list, Matrix matrix) {
            this.f1324c = list;
            this.f1325d = matrix;
        }

        public void b(Matrix matrix, P1.a aVar, int i4, Canvas canvas) {
            for (g b4 : this.f1324c) {
                b4.b(this.f1325d, aVar, i4, canvas);
            }
        }
    }

    static class b extends g {

        /* renamed from: c  reason: collision with root package name */
        private final d f1327c;

        public b(d dVar) {
            this.f1327c = dVar;
        }

        public void b(Matrix matrix, P1.a aVar, int i4, Canvas canvas) {
            float h4 = this.f1327c.m();
            float i5 = this.f1327c.n();
            aVar.a(canvas, matrix, new RectF(this.f1327c.k(), this.f1327c.o(), this.f1327c.l(), this.f1327c.j()), i4, h4, i5);
        }
    }

    static class c extends g {

        /* renamed from: c  reason: collision with root package name */
        private final e f1328c;

        /* renamed from: d  reason: collision with root package name */
        private final float f1329d;

        /* renamed from: e  reason: collision with root package name */
        private final float f1330e;

        public c(e eVar, float f4, float f5) {
            this.f1328c = eVar;
            this.f1329d = f4;
            this.f1330e = f5;
        }

        public void b(Matrix matrix, P1.a aVar, int i4, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f1328c.f1339c - this.f1330e), (double) (this.f1328c.f1338b - this.f1329d)), 0.0f);
            this.f1342a.set(matrix);
            this.f1342a.preTranslate(this.f1329d, this.f1330e);
            this.f1342a.preRotate(c());
            aVar.b(canvas, this.f1342a, rectF, i4);
        }

        /* access modifiers changed from: package-private */
        public float c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f1328c.f1339c - this.f1330e) / (this.f1328c.f1338b - this.f1329d))));
        }
    }

    public static class d extends f {

        /* renamed from: h  reason: collision with root package name */
        private static final RectF f1331h = new RectF();

        /* renamed from: b  reason: collision with root package name */
        public float f1332b;

        /* renamed from: c  reason: collision with root package name */
        public float f1333c;

        /* renamed from: d  reason: collision with root package name */
        public float f1334d;

        /* renamed from: e  reason: collision with root package name */
        public float f1335e;

        /* renamed from: f  reason: collision with root package name */
        public float f1336f;

        /* renamed from: g  reason: collision with root package name */
        public float f1337g;

        public d(float f4, float f5, float f6, float f7) {
            q(f4);
            u(f5);
            r(f6);
            p(f7);
        }

        /* access modifiers changed from: private */
        public float j() {
            return this.f1335e;
        }

        /* access modifiers changed from: private */
        public float k() {
            return this.f1332b;
        }

        /* access modifiers changed from: private */
        public float l() {
            return this.f1334d;
        }

        /* access modifiers changed from: private */
        public float m() {
            return this.f1336f;
        }

        /* access modifiers changed from: private */
        public float n() {
            return this.f1337g;
        }

        /* access modifiers changed from: private */
        public float o() {
            return this.f1333c;
        }

        private void p(float f4) {
            this.f1335e = f4;
        }

        private void q(float f4) {
            this.f1332b = f4;
        }

        private void r(float f4) {
            this.f1334d = f4;
        }

        /* access modifiers changed from: private */
        public void s(float f4) {
            this.f1336f = f4;
        }

        /* access modifiers changed from: private */
        public void t(float f4) {
            this.f1337g = f4;
        }

        private void u(float f4) {
            this.f1333c = f4;
        }

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f1340a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f1331h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public float f1338b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public float f1339c;

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f1340a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f1338b, this.f1339c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected final Matrix f1340a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {

        /* renamed from: b  reason: collision with root package name */
        static final Matrix f1341b = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        final Matrix f1342a = new Matrix();

        g() {
        }

        public final void a(P1.a aVar, int i4, Canvas canvas) {
            b(f1341b, aVar, i4, canvas);
        }

        public abstract void b(Matrix matrix, P1.a aVar, int i4, Canvas canvas);
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f4) {
        if (g() != f4) {
            float g4 = ((f4 - g()) + 360.0f) % 360.0f;
            if (g4 <= 180.0f) {
                d dVar = new d(i(), j(), i(), j());
                dVar.s(g());
                dVar.t(g4);
                this.f1322h.add(new b(dVar));
                p(f4);
            }
        }
    }

    private void c(g gVar, float f4, float f5) {
        b(f4);
        this.f1322h.add(gVar);
        p(f5);
    }

    private float g() {
        return this.f1319e;
    }

    private float h() {
        return this.f1320f;
    }

    private void p(float f4) {
        this.f1319e = f4;
    }

    private void q(float f4) {
        this.f1320f = f4;
    }

    private void r(float f4) {
        this.f1317c = f4;
    }

    private void s(float f4) {
        this.f1318d = f4;
    }

    private void t(float f4) {
        this.f1315a = f4;
    }

    private void u(float f4) {
        this.f1316b = f4;
    }

    public void a(float f4, float f5, float f6, float f7, float f8, float f9) {
        boolean z3;
        float f10;
        d dVar = new d(f4, f5, f6, f7);
        dVar.s(f8);
        dVar.t(f9);
        this.f1321g.add(dVar);
        b bVar = new b(dVar);
        float f11 = f8 + f9;
        if (f9 < 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            f8 = (f8 + 180.0f) % 360.0f;
        }
        if (z3) {
            f10 = (180.0f + f11) % 360.0f;
        } else {
            f10 = f11;
        }
        c(bVar, f8, f10);
        double d4 = (double) f11;
        r(((f4 + f6) * 0.5f) + (((f6 - f4) / 2.0f) * ((float) Math.cos(Math.toRadians(d4)))));
        s(((f5 + f7) * 0.5f) + (((f7 - f5) / 2.0f) * ((float) Math.sin(Math.toRadians(d4)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f1321g.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((f) this.f1321g.get(i4)).a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f1323i;
    }

    /* access modifiers changed from: package-private */
    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f1322h), new Matrix(matrix));
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f1317c;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.f1318d;
    }

    /* access modifiers changed from: package-private */
    public float k() {
        return this.f1315a;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f1316b;
    }

    public void m(float f4, float f5) {
        e eVar = new e();
        float unused = eVar.f1338b = f4;
        float unused2 = eVar.f1339c = f5;
        this.f1321g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f4);
        s(f5);
    }

    public void n(float f4, float f5) {
        o(f4, f5, 270.0f, 0.0f);
    }

    public void o(float f4, float f5, float f6, float f7) {
        t(f4);
        u(f5);
        r(f4);
        s(f5);
        p(f6);
        q((f6 + f7) % 360.0f);
        this.f1321g.clear();
        this.f1322h.clear();
        this.f1323i = false;
    }
}
