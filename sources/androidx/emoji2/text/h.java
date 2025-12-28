package androidx.emoji2.text;

import O.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

public class h {

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal f5490d = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    private final int f5491a;

    /* renamed from: b  reason: collision with root package name */
    private final n f5492b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f5493c = 0;

    h(n nVar, int i4) {
        this.f5492b = nVar;
        this.f5491a = i4;
    }

    private a g() {
        ThreadLocal threadLocal = f5490d;
        a aVar = (a) threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        this.f5492b.d().j(aVar, this.f5491a);
        return aVar;
    }

    public void a(Canvas canvas, float f4, float f5, Paint paint) {
        Typeface g4 = this.f5492b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g4);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f5492b.c(), this.f5491a * 2, 2, f4, f5, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i4) {
        return g().h(i4);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f5493c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public void k(boolean z3) {
        int i4;
        if (z3) {
            i4 = 2;
        } else {
            i4 = 1;
        }
        this.f5493c = i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int c4 = c();
        for (int i4 = 0; i4 < c4; i4++) {
            sb.append(Integer.toHexString(b(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
