package g1;

import X0.d;
import X0.e;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.s;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p1.C0851a;
import p1.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final List f13602a;

    /* renamed from: b  reason: collision with root package name */
    private final Z0.b f13603b;

    private static final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        private final AnimatedImageDrawable f13604a;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f13604a = animatedImageDrawable;
        }

        public int a() {
            return this.f13604a.getIntrinsicWidth() * this.f13604a.getIntrinsicHeight() * l.h(Bitmap.Config.ARGB_8888) * 2;
        }

        /* renamed from: b */
        public AnimatedImageDrawable get() {
            return this.f13604a;
        }

        public Class c() {
            return Drawable.class;
        }

        public void d() {
            this.f13604a.stop();
            this.f13604a.clearAnimationCallbacks();
        }
    }

    private static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final h f13605a;

        b(h hVar) {
            this.f13605a = hVar;
        }

        /* renamed from: c */
        public s a(ByteBuffer byteBuffer, int i4, int i5, d dVar) {
            return this.f13605a.b(ImageDecoder.createSource(byteBuffer), i4, i5, dVar);
        }

        /* renamed from: d */
        public boolean b(ByteBuffer byteBuffer, d dVar) {
            return this.f13605a.d(byteBuffer);
        }
    }

    private static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        private final h f13606a;

        c(h hVar) {
            this.f13606a = hVar;
        }

        /* renamed from: c */
        public s a(InputStream inputStream, int i4, int i5, d dVar) {
            return this.f13606a.b(ImageDecoder.createSource(C0851a.b(inputStream)), i4, i5, dVar);
        }

        /* renamed from: d */
        public boolean b(InputStream inputStream, d dVar) {
            return this.f13606a.c(inputStream);
        }
    }

    private h(List list, Z0.b bVar) {
        this.f13602a = list;
        this.f13603b = bVar;
    }

    public static e a(List list, Z0.b bVar) {
        return new b(new h(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        if (imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF)) {
            return true;
        }
        return false;
    }

    public static e f(List list, Z0.b bVar) {
        return new c(new h(list, bVar));
    }

    /* access modifiers changed from: package-private */
    public s b(ImageDecoder.Source source, int i4, int i5, d dVar) {
        Drawable a4 = ImageDecoder.decodeDrawable(source, new e1.l(i4, i5, dVar));
        if (b.a(a4)) {
            return new a(c.a(a4));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + a4);
    }

    /* access modifiers changed from: package-private */
    public boolean c(InputStream inputStream) {
        return e(com.bumptech.glide.load.a.f(this.f13602a, inputStream, this.f13603b));
    }

    /* access modifiers changed from: package-private */
    public boolean d(ByteBuffer byteBuffer) {
        return e(com.bumptech.glide.load.a.g(this.f13602a, byteBuffer));
    }
}
