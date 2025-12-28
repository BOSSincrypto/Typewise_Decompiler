package S0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import ch.icoaching.wrio.C0553q;
import ch.icoaching.wrio.I;
import ch.icoaching.wrio.keyboard.model.ThemeModel;
import ch.icoaching.wrio.keyboard.view.C0531f;
import java.util.Locale;
import kotlin.Triple;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class c extends View {

    /* renamed from: p  reason: collision with root package name */
    public static final a f1413p = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f1414a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Paint f1415b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Paint f1416c;

    /* renamed from: d  reason: collision with root package name */
    private final Paint f1417d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public ThemeModel.b f1418e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public String[] f1419f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f1420g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f1421h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f1422i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f1423j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public boolean f1424k;

    /* renamed from: l  reason: collision with root package name */
    private final Rect f1425l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Rect f1426m;

    /* renamed from: n  reason: collision with root package name */
    private Float f1427n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int f1428o;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final int[] b(int i4, int i5, int i6, int i7) {
            return new int[]{(i5 + i7) * i4, i6 + i7};
        }

        public final Triple a(Context context, int i4, int i5, int i6, String[] strArr, int i7, ThemeModel.b bVar, int i8) {
            o.e(context, "context");
            o.e(strArr, "items");
            o.e(bVar, "diacriticsPopUpTheme");
            int[] b4 = b(strArr.length, i4, i5, i6);
            c cVar = new c(context);
            cVar.f1423j = i4;
            cVar.f1421h = i5;
            cVar.f1422i = i6;
            cVar.f1428o = i7;
            cVar.f1419f = strArr;
            cVar.f1420g = i7;
            cVar.f1424k = Character.isUpperCase(kotlin.text.o.S0((CharSequence) C0713h.z(strArr)));
            cVar.f1418e = bVar;
            cVar.f1415b.setColor(bVar.a());
            cVar.f1416c.setColor(bVar.c());
            cVar.f1414a = i8;
            cVar.setElevation((float) C0553q.a(1));
            return new Triple(cVar, Integer.valueOf(b4[0]), Integer.valueOf(b4[1]));
        }

        private a() {
        }
    }

    public static final class b extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f1429a;

        b(c cVar) {
            this.f1429a = cVar;
        }

        public void getOutline(View view, Outline outline) {
            o.e(view, "view");
            o.e(outline, "outline");
            outline.setRoundRect(this.f1429a.f1426m.left, this.f1429a.f1426m.top, this.f1429a.f1426m.right, this.f1429a.f1426m.bottom, (float) C0553q.a(12));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void c() {
        setOutlineProvider(new b(this));
    }

    private final void h(Canvas canvas, String str, int i4, boolean z3) {
        String str2;
        int[] iArr = z3 ? new int[]{C0531f.a.ACTIVE.b()} : new int[]{C0531f.a.DEFAULT.b()};
        if (z3) {
            int i5 = this.f1422i / 2;
            this.f1425l.set(i4, i5, this.f1423j + i4, this.f1421h + i5);
            canvas.drawRect(this.f1425l, this.f1416c);
        }
        Paint paint = this.f1417d;
        ThemeModel.b bVar = this.f1418e;
        if (bVar == null) {
            o.p("theme");
            bVar = null;
        }
        paint.setColor(bVar.b().getColorForState(iArr, 0));
        if (this.f1424k) {
            str2 = I.c(str);
        } else {
            str2 = str.toLowerCase(Locale.ROOT);
            o.d(str2, "toLowerCase(...)");
        }
        canvas.drawText(str2, ((float) i4) + (((float) this.f1423j) / 2.0f), (((float) canvas.getHeight()) / 2.0f) - ((this.f1417d.descent() + this.f1417d.ascent()) / 2.0f), this.f1417d);
    }

    public final String b(float f4, float f5) {
        String str;
        int i4;
        if (getWidth() == 0) {
            return null;
        }
        boolean z3 = false;
        if (f4 < 0.0f) {
            String[] strArr = this.f1419f;
            if (strArr == null) {
                o.p("items");
                strArr = null;
            }
            str = strArr[0];
            i4 = 0;
        } else if (f4 > ((float) getWidth())) {
            String[] strArr2 = this.f1419f;
            if (strArr2 == null) {
                o.p("items");
                strArr2 = null;
            }
            str = (String) C0713h.U(strArr2);
            String[] strArr3 = this.f1419f;
            if (strArr3 == null) {
                o.p("items");
                strArr3 = null;
            }
            i4 = C0713h.D(strArr3);
        } else {
            String[] strArr4 = this.f1419f;
            if (strArr4 == null) {
                o.p("items");
                strArr4 = null;
            }
            int length = strArr4.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    i4 = -1;
                    str = null;
                    break;
                }
                String str2 = strArr4[i5];
                int i6 = i5 + 1;
                if (f4 <= ((float) ((this.f1422i + this.f1423j) * i6))) {
                    i4 = i5;
                    str = str2;
                    break;
                }
                i5 = i6;
            }
            if (str == null) {
                String[] strArr5 = this.f1419f;
                if (strArr5 == null) {
                    o.p("items");
                    strArr5 = null;
                }
                str = (String) C0713h.U(strArr5);
                String[] strArr6 = this.f1419f;
                if (strArr6 == null) {
                    o.p("items");
                    strArr6 = null;
                }
                i4 = C0713h.D(strArr6);
            }
        }
        Float f6 = this.f1427n;
        if (f6 == null) {
            z3 = this.f1424k;
            this.f1427n = Float.valueOf(f5);
        } else {
            float floatValue = f6.floatValue() - f5;
            if (((int) Math.abs(floatValue)) <= this.f1414a) {
                z3 = this.f1424k;
            } else if (floatValue >= 0.0f) {
                z3 = true;
            }
        }
        if (this.f1428o == i4 && this.f1424k == z3) {
            return null;
        }
        this.f1428o = i4;
        this.f1424k = z3;
        if (isAttachedToWindow() && isLaidOut()) {
            invalidate();
        }
        if (this.f1424k) {
            return I.c(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        o.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final int getSelectedItemPosition() {
        return this.f1428o;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean z3;
        o.e(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawRect(this.f1426m, this.f1415b);
        int i4 = this.f1420g;
        String[] strArr = null;
        if (i4 == 0) {
            PathEffect pathEffect = this.f1415b.getPathEffect();
            this.f1415b.setPathEffect((PathEffect) null);
            canvas.drawRect(0.0f, ((float) getHeight()) / 2.0f, (float) (this.f1423j + this.f1422i), (float) getHeight(), this.f1415b);
            this.f1415b.setPathEffect(pathEffect);
        } else {
            String[] strArr2 = this.f1419f;
            if (strArr2 == null) {
                o.p("items");
                strArr2 = null;
            }
            if (i4 == C0713h.D(strArr2)) {
                PathEffect pathEffect2 = this.f1415b.getPathEffect();
                this.f1415b.setPathEffect((PathEffect) null);
                canvas.drawRect(((float) getWidth()) - ((float) (this.f1423j + this.f1422i)), ((float) getHeight()) / 2.0f, (float) getWidth(), (float) getHeight(), this.f1415b);
                this.f1415b.setPathEffect(pathEffect2);
            }
        }
        int i5 = this.f1422i / 2;
        String[] strArr3 = this.f1419f;
        if (strArr3 == null) {
            o.p("items");
        } else {
            strArr = strArr3;
        }
        int length = strArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            String str = strArr[i6];
            if (i6 == this.f1428o) {
                z3 = true;
            } else {
                z3 = false;
            }
            h(canvas, str, i5, z3);
            i5 += this.f1423j + this.f1422i;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i4, int i5) {
        a aVar = f1413p;
        String[] strArr = this.f1419f;
        if (strArr == null) {
            o.p("items");
            strArr = null;
        }
        int[] c4 = aVar.b(strArr.length, this.f1423j, this.f1421h, this.f1422i);
        this.f1426m.set(0, 0, c4[0], c4[1]);
        this.f1417d.setTextSize((float) C0553q.b(20));
        setMeasuredDimension(c4[0], c4[1]);
        c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        this.f1414a = C0553q.a(8);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setPathEffect(new CornerPathEffect((float) C0553q.a(12)));
        this.f1415b = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setPathEffect(new CornerPathEffect((float) C0553q.a(12)));
        this.f1416c = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setTextAlign(Paint.Align.CENTER);
        this.f1417d = paint3;
        this.f1425l = new Rect();
        this.f1426m = new Rect();
        this.f1428o = -1;
        setBackgroundColor(0);
    }
}
