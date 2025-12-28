package I1;

import N1.b;
import android.content.Context;
import android.graphics.Color;
import z1.C0970a;

public class a {

    /* renamed from: f  reason: collision with root package name */
    private static final int f582f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a  reason: collision with root package name */
    private final boolean f583a;

    /* renamed from: b  reason: collision with root package name */
    private final int f584b;

    /* renamed from: c  reason: collision with root package name */
    private final int f585c;

    /* renamed from: d  reason: collision with root package name */
    private final int f586d;

    /* renamed from: e  reason: collision with root package name */
    private final float f587e;

    public a(Context context) {
        this(b.b(context, C0970a.elevationOverlayEnabled, false), F1.a.b(context, C0970a.elevationOverlayColor, 0), F1.a.b(context, C0970a.elevationOverlayAccentColor, 0), F1.a.b(context, C0970a.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i4) {
        if (androidx.core.graphics.a.k(i4, 255) == this.f586d) {
            return true;
        }
        return false;
    }

    public float a(float f4) {
        float f5 = this.f587e;
        if (f5 <= 0.0f || f4 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f4 / f5))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i4, float f4) {
        int i5;
        float a4 = a(f4);
        int alpha = Color.alpha(i4);
        int i6 = F1.a.i(androidx.core.graphics.a.k(i4, 255), this.f584b, a4);
        if (a4 > 0.0f && (i5 = this.f585c) != 0) {
            i6 = F1.a.h(i6, androidx.core.graphics.a.k(i5, f582f));
        }
        return androidx.core.graphics.a.k(i6, alpha);
    }

    public int c(int i4, float f4) {
        if (!this.f583a || !e(i4)) {
            return i4;
        }
        return b(i4, f4);
    }

    public boolean d() {
        return this.f583a;
    }

    public a(boolean z3, int i4, int i5, int i6, float f4) {
        this.f583a = z3;
        this.f584b = i4;
        this.f585c = i5;
        this.f586d = i6;
        this.f587e = f4;
    }
}
