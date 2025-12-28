package com.bumptech.glide.load.resource.bitmap;

import Z0.b;
import androidx.exifinterface.media.a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p1.C0851a;

public final class v implements ImageHeaderParser {
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public int b(InputStream inputStream, b bVar) {
        int c4 = new a(inputStream).c("Orientation", 1);
        if (c4 == 0) {
            return -1;
        }
        return c4;
    }

    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public int d(ByteBuffer byteBuffer, b bVar) {
        return b(C0851a.g(byteBuffer), bVar);
    }
}
