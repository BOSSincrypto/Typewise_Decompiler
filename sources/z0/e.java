package Z0;

import android.graphics.Bitmap;

public class e implements d {
    public void a(int i4) {
    }

    public void b() {
    }

    public Bitmap c(int i4, int i5, Bitmap.Config config) {
        return Bitmap.createBitmap(i4, i5, config);
    }

    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    public Bitmap e(int i4, int i5, Bitmap.Config config) {
        return c(i4, i5, config);
    }
}
