package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p1.C0851a;

interface y {

    public static final class a implements y {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f11157a;

        /* renamed from: b  reason: collision with root package name */
        private final List f11158b;

        /* renamed from: c  reason: collision with root package name */
        private final Z0.b f11159c;

        a(ByteBuffer byteBuffer, List list, Z0.b bVar) {
            this.f11157a = byteBuffer;
            this.f11158b = list;
            this.f11159c = bVar;
        }

        private InputStream e() {
            return C0851a.g(C0851a.d(this.f11157a));
        }

        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), (Rect) null, options);
        }

        public void b() {
        }

        public int c() {
            return com.bumptech.glide.load.a.c(this.f11158b, C0851a.d(this.f11157a), this.f11159c);
        }

        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.g(this.f11158b, C0851a.d(this.f11157a));
        }
    }

    public static final class b implements y {

        /* renamed from: a  reason: collision with root package name */
        private final k f11160a;

        /* renamed from: b  reason: collision with root package name */
        private final Z0.b f11161b;

        /* renamed from: c  reason: collision with root package name */
        private final List f11162c;

        b(InputStream inputStream, List list, Z0.b bVar) {
            this.f11161b = (Z0.b) p1.k.d(bVar);
            this.f11162c = (List) p1.k.d(list);
            this.f11160a = new k(inputStream, bVar);
        }

        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f11160a.a(), (Rect) null, options);
        }

        public void b() {
            this.f11160a.c();
        }

        public int c() {
            return com.bumptech.glide.load.a.b(this.f11162c, this.f11160a.a(), this.f11161b);
        }

        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.f(this.f11162c, this.f11160a.a(), this.f11161b);
        }
    }

    public static final class c implements y {

        /* renamed from: a  reason: collision with root package name */
        private final Z0.b f11163a;

        /* renamed from: b  reason: collision with root package name */
        private final List f11164b;

        /* renamed from: c  reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f11165c;

        c(ParcelFileDescriptor parcelFileDescriptor, List list, Z0.b bVar) {
            this.f11163a = (Z0.b) p1.k.d(bVar);
            this.f11164b = (List) p1.k.d(list);
            this.f11165c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f11165c.a().getFileDescriptor(), (Rect) null, options);
        }

        public void b() {
        }

        public int c() {
            return com.bumptech.glide.load.a.a(this.f11164b, this.f11165c, this.f11163a);
        }

        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.e(this.f11164b, this.f11165c, this.f11163a);
        }
    }

    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();
}
