package Q1;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final c f1217a;

    /* renamed from: b  reason: collision with root package name */
    private final float f1218b;

    public b(float f4, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f1217a;
            f4 += ((b) cVar).f1218b;
        }
        this.f1217a = cVar;
        this.f1218b = f4;
    }

    public float a(RectF rectF) {
        return Math.max(0.0f, this.f1217a.a(rectF) + this.f1218b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f1217a.equals(bVar.f1217a) || this.f1218b != bVar.f1218b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1217a, Float.valueOf(this.f1218b)});
    }
}
