package e1;

import X0.c;
import X0.d;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.s;
import com.bumptech.glide.load.resource.bitmap.x;

public final class l implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    private final x f13560a = x.b();

    /* renamed from: b  reason: collision with root package name */
    private final int f13561b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13562c;

    /* renamed from: d  reason: collision with root package name */
    private final DecodeFormat f13563d;

    /* renamed from: e  reason: collision with root package name */
    private final DownsampleStrategy f13564e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f13565f;

    /* renamed from: g  reason: collision with root package name */
    private final PreferredColorSpace f13566g;

    class a implements ImageDecoder$OnPartialImageListener {
        a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public l(int i4, int i5, d dVar) {
        boolean z3;
        this.f13561b = i4;
        this.f13562c = i5;
        this.f13563d = (DecodeFormat) dVar.c(s.f11128f);
        this.f13564e = (DownsampleStrategy) dVar.c(DownsampleStrategy.f11088h);
        c cVar = s.f11132j;
        if (dVar.c(cVar) == null || !((Boolean) dVar.c(cVar)).booleanValue()) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f13565f = z3;
        this.f13566g = (PreferredColorSpace) dVar.c(s.f11129g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        if (this.f13560a.e(this.f13561b, this.f13562c, this.f13565f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f13563d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size a4 = imageInfo.getSize();
        int i4 = this.f13561b;
        if (i4 == Integer.MIN_VALUE) {
            i4 = a4.getWidth();
        }
        int i5 = this.f13562c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = a4.getHeight();
        }
        float b4 = this.f13564e.b(a4.getWidth(), a4.getHeight(), i4, i5);
        int round = Math.round(((float) a4.getWidth()) * b4);
        int round2 = Math.round(((float) a4.getHeight()) * b4);
        if (Log.isLoggable("ImageDecoder", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resizing from [");
            sb.append(a4.getWidth());
            sb.append("x");
            sb.append(a4.getHeight());
            sb.append("] to [");
            sb.append(round);
            sb.append("x");
            sb.append(round2);
            sb.append("] scaleFactor: ");
            sb.append(b4);
        }
        imageDecoder.setTargetSize(round, round2);
        PreferredColorSpace preferredColorSpace = this.f13566g;
        if (preferredColorSpace != null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 28) {
                if (preferredColorSpace != PreferredColorSpace.DISPLAY_P3 || imageInfo.getColorSpace() == null || !imageInfo.getColorSpace().isWideGamut()) {
                    named = ColorSpace.Named.SRGB;
                } else {
                    named = ColorSpace.Named.DISPLAY_P3;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(named));
            } else if (i6 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
