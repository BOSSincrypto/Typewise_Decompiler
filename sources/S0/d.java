package S0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import ch.icoaching.wrio.C0553q;
import ch.icoaching.wrio.keyboard.view.M;
import ch.icoaching.wrio.keyboard.view.P;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class d extends View {

    /* renamed from: g  reason: collision with root package name */
    public static final a f1430g = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Paint f1431a;

    /* renamed from: b  reason: collision with root package name */
    private Path f1432b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Path f1433c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f1434d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f1435e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1436f;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public static /* synthetic */ d a(a aVar, Context context, ViewGroup.LayoutParams layoutParams, int i4, boolean z3, boolean z4, int i5, Object obj) {
            if ((i5 & 16) != 0) {
                z4 = false;
            }
            return aVar.b(context, layoutParams, i4, z3, z4);
        }

        public final d b(Context context, ViewGroup.LayoutParams layoutParams, int i4, boolean z3, boolean z4) {
            o.e(context, "context");
            o.e(layoutParams, "layoutParams");
            d dVar = new d(context);
            dVar.setLayoutParams(layoutParams);
            dVar.f1431a.setColor(i4);
            dVar.setElevation((float) C0553q.a(1));
            dVar.f1434d = z3;
            dVar.f1435e = z4;
            return dVar;
        }

        private a() {
        }
    }

    public static final class b extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f1437a;

        b(d dVar) {
            this.f1437a = dVar;
        }

        public void getOutline(View view, Outline outline) {
            o.e(view, "view");
            o.e(outline, "outline");
            Path path = null;
            if (Build.VERSION.SDK_INT >= 30) {
                Path d4 = this.f1437a.f1433c;
                if (d4 == null) {
                    o.p("shadowPath");
                } else {
                    path = d4;
                }
                outline.setPath(path);
                return;
            }
            try {
                Path d5 = this.f1437a.f1433c;
                if (d5 == null) {
                    o.p("shadowPath");
                } else {
                    path = d5;
                }
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void b() {
        setOutlineProvider(new b(this));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        o.e(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawColor(0);
        Path path = this.f1432b;
        if (path == null) {
            o.p("stemPath");
            path = null;
        }
        canvas.drawPath(path, this.f1431a);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        float paddingStart = (float) getPaddingStart();
        float paddingTop = (float) getPaddingTop();
        float f4 = (float) size;
        float f5 = (float) size2;
        if (!this.f1435e) {
            Path path = null;
            if (this.f1434d) {
                Path c4 = M.c(paddingStart, paddingTop, f4, f5, (float) C0553q.a(4), (float) C0553q.a(2));
                this.f1432b = c4;
                if (c4 == null) {
                    o.p("stemPath");
                } else {
                    path = c4;
                }
                this.f1433c = path;
            } else {
                Path a4 = P.a(paddingStart, paddingTop, f4, f5, (float) C0553q.a(4));
                this.f1432b = a4;
                if (a4 == null) {
                    o.p("stemPath");
                } else {
                    path = a4;
                }
                this.f1433c = path;
            }
        } else if (this.f1434d) {
            int i6 = this.f1436f;
            float f6 = (float) i6;
            this.f1432b = M.c(paddingStart + f6, paddingTop, f4 - ((float) (i6 * 2)), f5 - f6, (float) C0553q.a(4), (float) C0553q.a(2));
            this.f1433c = M.c(paddingStart, paddingTop, f4, f5, (float) C0553q.a(4), (float) C0553q.a(2));
        } else {
            int i7 = this.f1436f;
            this.f1432b = P.a(((float) i7) + paddingStart, paddingTop, f4 - ((float) (i7 * 2)), f5, (float) C0553q.a(4));
            this.f1433c = P.a(paddingStart, paddingTop, f4, f5, (float) C0553q.a(4));
        }
        b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f1431a = paint;
        this.f1436f = C0553q.a(1);
        setBackgroundColor(0);
    }
}
