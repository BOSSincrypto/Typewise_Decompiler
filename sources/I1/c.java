package i1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.b;
import i1.g;
import java.nio.ByteBuffer;
import java.util.List;
import p1.k;

public class c extends Drawable implements g.b, Animatable {

    /* renamed from: a  reason: collision with root package name */
    private final a f13682a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13683b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13684c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13685d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13686e;

    /* renamed from: f  reason: collision with root package name */
    private int f13687f;

    /* renamed from: g  reason: collision with root package name */
    private int f13688g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13689h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f13690i;

    /* renamed from: j  reason: collision with root package name */
    private Rect f13691j;

    /* renamed from: k  reason: collision with root package name */
    private List f13692k;

    static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        final g f13693a;

        a(g gVar) {
            this.f13693a = gVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, W0.a aVar, X0.g gVar, int i4, int i5, Bitmap bitmap) {
        this(new a(new g(b.c(context), aVar, i4, i5, gVar, bitmap)));
    }

    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f13691j == null) {
            this.f13691j = new Rect();
        }
        return this.f13691j;
    }

    private Paint h() {
        if (this.f13690i == null) {
            this.f13690i = new Paint(2);
        }
        return this.f13690i;
    }

    private void j() {
        List list = this.f13692k;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((androidx.vectordrawable.graphics.drawable.b) this.f13692k.get(i4)).b(this);
            }
        }
    }

    private void l() {
        this.f13687f = 0;
    }

    private void n() {
        k.a(!this.f13685d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f13682a.f13693a.f() == 1) {
            invalidateSelf();
        } else if (!this.f13683b) {
            this.f13683b = true;
            this.f13682a.f13693a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f13683b = false;
        this.f13682a.f13693a.s(this);
    }

    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f13687f++;
        }
        int i4 = this.f13688g;
        if (i4 != -1 && this.f13687f >= i4) {
            j();
            stop();
        }
    }

    public ByteBuffer c() {
        return this.f13682a.f13693a.b();
    }

    public void draw(Canvas canvas) {
        if (!this.f13685d) {
            if (this.f13689h) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
                this.f13689h = false;
            }
            canvas.drawBitmap(this.f13682a.f13693a.c(), (Rect) null, d(), h());
        }
    }

    public Bitmap e() {
        return this.f13682a.f13693a.e();
    }

    public int f() {
        return this.f13682a.f13693a.f();
    }

    public int g() {
        return this.f13682a.f13693a.d();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f13682a;
    }

    public int getIntrinsicHeight() {
        return this.f13682a.f13693a.h();
    }

    public int getIntrinsicWidth() {
        return this.f13682a.f13693a.k();
    }

    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f13682a.f13693a.j();
    }

    public boolean isRunning() {
        return this.f13683b;
    }

    public void k() {
        this.f13685d = true;
        this.f13682a.f13693a.a();
    }

    public void m(X0.g gVar, Bitmap bitmap) {
        this.f13682a.f13693a.o(gVar, bitmap);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f13689h = true;
    }

    public void setAlpha(int i4) {
        h().setAlpha(i4);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z3, boolean z4) {
        k.a(!this.f13685d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f13686e = z3;
        if (!z3) {
            o();
        } else if (this.f13684c) {
            n();
        }
        return super.setVisible(z3, z4);
    }

    public void start() {
        this.f13684c = true;
        l();
        if (this.f13686e) {
            n();
        }
    }

    public void stop() {
        this.f13684c = false;
        o();
    }

    c(a aVar) {
        this.f13686e = true;
        this.f13688g = -1;
        this.f13682a = (a) k.d(aVar);
    }
}
