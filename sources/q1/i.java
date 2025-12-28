package Q1;

import android.graphics.RectF;
import java.util.Arrays;

public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f1270a;

    public i(float f4) {
        this.f1270a = f4;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    public float a(RectF rectF) {
        return this.f1270a * b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        if (this.f1270a == ((i) obj).f1270a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1270a)});
    }
}
