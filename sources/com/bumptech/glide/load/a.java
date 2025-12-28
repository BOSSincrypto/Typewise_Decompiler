package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p1.C0851a;

public abstract class a {

    /* renamed from: com.bumptech.glide.load.a$a  reason: collision with other inner class name */
    class C0160a implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputStream f10809a;

        C0160a(InputStream inputStream) {
            this.f10809a = inputStream;
        }

        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.c(this.f10809a);
            } finally {
                this.f10809a.reset();
            }
        }
    }

    class b implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ByteBuffer f10810a;

        b(ByteBuffer byteBuffer) {
            this.f10810a = byteBuffer;
        }

        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.a(this.f10810a);
            } finally {
                C0851a.d(this.f10810a);
            }
        }
    }

    class c implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f10811a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Z0.b f10812b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, Z0.b bVar) {
            this.f10811a = parcelFileDescriptorRewinder;
            this.f10812b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType a(com.bumptech.glide.load.ImageHeaderParser r5) {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r1 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream     // Catch:{ all -> 0x0027 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f10811a     // Catch:{ all -> 0x0027 }
                android.os.ParcelFileDescriptor r3 = r3.a()     // Catch:{ all -> 0x0027 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0027 }
                r2.<init>(r3)     // Catch:{ all -> 0x0027 }
                Z0.b r3 = r4.f10812b     // Catch:{ all -> 0x0027 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.c(r1)     // Catch:{ all -> 0x0024 }
                r1.f()
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f10811a
                r0.a()
                return r5
            L_0x0024:
                r5 = move-exception
                r0 = r1
                goto L_0x0028
            L_0x0027:
                r5 = move-exception
            L_0x0028:
                if (r0 == 0) goto L_0x002d
                r0.f()
            L_0x002d:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f10811a
                r0.a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.c.a(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    class d implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ByteBuffer f10813a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Z0.b f10814b;

        d(ByteBuffer byteBuffer, Z0.b bVar) {
            this.f10813a = byteBuffer;
            this.f10814b = bVar;
        }

        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.d(this.f10813a, this.f10814b);
            } finally {
                C0851a.d(this.f10813a);
            }
        }
    }

    class e implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputStream f10815a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Z0.b f10816b;

        e(InputStream inputStream, Z0.b bVar) {
            this.f10815a = inputStream;
            this.f10816b = bVar;
        }

        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.b(this.f10815a, this.f10816b);
            } finally {
                this.f10815a.reset();
            }
        }
    }

    class f implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f10817a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Z0.b f10818b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, Z0.b bVar) {
            this.f10817a = parcelFileDescriptorRewinder;
            this.f10818b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(com.bumptech.glide.load.ImageHeaderParser r5) {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r1 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream     // Catch:{ all -> 0x0029 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f10817a     // Catch:{ all -> 0x0029 }
                android.os.ParcelFileDescriptor r3 = r3.a()     // Catch:{ all -> 0x0029 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0029 }
                r2.<init>(r3)     // Catch:{ all -> 0x0029 }
                Z0.b r3 = r4.f10818b     // Catch:{ all -> 0x0029 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0029 }
                Z0.b r0 = r4.f10818b     // Catch:{ all -> 0x0026 }
                int r5 = r5.b(r1, r0)     // Catch:{ all -> 0x0026 }
                r1.f()
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f10817a
                r0.a()
                return r5
            L_0x0026:
                r5 = move-exception
                r0 = r1
                goto L_0x002a
            L_0x0029:
                r5 = move-exception
            L_0x002a:
                if (r0 == 0) goto L_0x002f
                r0.f()
            L_0x002f:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f10817a
                r0.a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.f.a(com.bumptech.glide.load.ImageHeaderParser):int");
        }
    }

    private interface g {
        int a(ImageHeaderParser imageHeaderParser);
    }

    private interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, Z0.b bVar) {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List list, InputStream inputStream, Z0.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(List list, ByteBuffer byteBuffer, Z0.b bVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    private static int d(List list, g gVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int a4 = gVar.a((ImageHeaderParser) list.get(i4));
            if (a4 != -1) {
                return a4;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, Z0.b bVar) {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType f(List list, InputStream inputStream, Z0.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new C0160a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return h(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType h(List list, h hVar) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            ImageHeaderParser.ImageType a4 = hVar.a((ImageHeaderParser) list.get(i4));
            if (a4 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a4;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
