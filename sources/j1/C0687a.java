package j1;

import X0.d;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.s;
import f1.b;
import java.io.ByteArrayOutputStream;

/* renamed from: j1.a  reason: case insensitive filesystem */
public class C0687a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap.CompressFormat f13748a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13749b;

    public C0687a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public s a(s sVar, d dVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) sVar.get()).compress(this.f13748a, this.f13749b, byteArrayOutputStream);
        sVar.d();
        return new b(byteArrayOutputStream.toByteArray());
    }

    public C0687a(Bitmap.CompressFormat compressFormat, int i4) {
        this.f13748a = compressFormat;
        this.f13749b = i4;
    }
}
