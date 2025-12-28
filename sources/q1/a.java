package Q1;

import android.graphics.RectF;
import java.util.Arrays;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f1216a;

    public a(float f4) {
        this.f1216a = f4;
    }

    public float a(RectF rectF) {
        return this.f1216a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.f1216a == ((a) obj).f1216a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1216a)});
    }
}
