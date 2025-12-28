package com.bumptech.glide.load.resource.bitmap;

import X0.c;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.engine.s;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VideoDecoder implements X0.e {

    /* renamed from: d  reason: collision with root package name */
    public static final X0.c f11103d = X0.c.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final X0.c f11104e = X0.c.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    private static final f f11105f = new f();

    /* renamed from: g  reason: collision with root package name */
    private static final List f11106g = Collections.unmodifiableList(Arrays.asList(new String[]{"TP1A", "TD1A.220804.031"}));

    /* renamed from: a  reason: collision with root package name */
    private final e f11107a;

    /* renamed from: b  reason: collision with root package name */
    private final Z0.d f11108b;

    /* renamed from: c  reason: collision with root package name */
    private final f f11109c;

    private static final class VideoDecoderException extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    class a implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f11110a = ByteBuffer.allocate(8);

        a() {
        }

        /* renamed from: b */
        public void a(byte[] bArr, Long l4, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f11110a) {
                this.f11110a.position(0);
                messageDigest.update(this.f11110a.putLong(l4.longValue()).array());
            }
        }
    }

    class b implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f11111a = ByteBuffer.allocate(4);

        b() {
        }

        /* renamed from: b */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f11111a) {
                    this.f11111a.position(0);
                    messageDigest.update(this.f11111a.putInt(num.intValue()).array());
                }
            }
        }
    }

    private static final class c implements e {
        private c() {
        }

        /* renamed from: c */
        public void b(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* renamed from: d */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    static final class d implements e {

        class a extends MediaDataSource {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ByteBuffer f11112a;

            a(ByteBuffer byteBuffer) {
                this.f11112a = byteBuffer;
            }

            public void close() {
            }

            public long getSize() {
                return (long) this.f11112a.limit();
            }

            public int readAt(long j4, byte[] bArr, int i4, int i5) {
                if (j4 >= ((long) this.f11112a.limit())) {
                    return -1;
                }
                this.f11112a.position((int) j4);
                int min = Math.min(i5, this.f11112a.remaining());
                this.f11112a.get(bArr, i4, min);
                return min;
            }
        }

        d() {
        }

        private MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        /* renamed from: d */
        public void b(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        /* renamed from: e */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }
    }

    interface e {
        void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj);

        void b(MediaExtractor mediaExtractor, Object obj);
    }

    static class f {
        f() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    static final class g implements e {
        g() {
        }

        /* renamed from: c */
        public void b(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        /* renamed from: d */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    VideoDecoder(Z0.d dVar, e eVar) {
        this(dVar, eVar, f11105f);
    }

    public static X0.e c(Z0.d dVar) {
        return new VideoDecoder(dVar, new c((a) null));
    }

    public static X0.e d(Z0.d dVar) {
        return new VideoDecoder(dVar, new d());
    }

    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!j()) {
            return bitmap;
        }
        try {
            if (i(mediaMetadataRetriever) && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                Log.isLoggable("VideoDecoder", 3);
                Matrix matrix = new Matrix();
                matrix.postRotate(180.0f, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
        } catch (NumberFormatException unused) {
            Log.isLoggable("VideoDecoder", 3);
        }
        return bitmap;
    }

    private Bitmap f(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j4, int i4, int i5, int i6, DownsampleStrategy downsampleStrategy) {
        Bitmap bitmap;
        if (!l(obj, mediaMetadataRetriever)) {
            if (Build.VERSION.SDK_INT < 27 || i5 == Integer.MIN_VALUE || i6 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f11086f) {
                bitmap = null;
            } else {
                bitmap = h(mediaMetadataRetriever, j4, i4, i5, i6, downsampleStrategy);
            }
            if (bitmap == null) {
                bitmap = g(mediaMetadataRetriever, j4, i4);
            }
            Bitmap e4 = e(mediaMetadataRetriever, bitmap);
            if (e4 != null) {
                return e4;
            }
            throw new VideoDecoderException();
        }
        throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
    }

    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j4, int i4) {
        return mediaMetadataRetriever.getFrameAtTime(j4, i4);
    }

    private static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j4, int i4, int i5, int i6, DownsampleStrategy downsampleStrategy) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i7 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i7;
            }
            float b4 = downsampleStrategy.b(parseInt, parseInt2, i5, i6);
            return mediaMetadataRetriever.getScaledFrameAtTime(j4, i4, Math.round(((float) parseInt) * b4), Math.round(b4 * ((float) parseInt2)));
        } catch (Throwable unused) {
            Log.isLoggable("VideoDecoder", 3);
            return null;
        }
    }

    private static boolean i(MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        int parseInt2 = Integer.parseInt(extractMetadata2);
        if ((parseInt == 7 || parseInt == 6) && parseInt2 == 6) {
            return true;
        }
        return false;
    }

    static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 || i4 >= 33) {
            return false;
        }
        return true;
    }

    private static boolean k() {
        for (String startsWith : f11106g) {
            if (Build.ID.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean l(java.lang.Object r5, android.media.MediaMetadataRetriever r6) {
        /*
            r4 = this;
            java.lang.String r0 = android.os.Build.DEVICE
            r1 = 0
            if (r0 == 0) goto L_0x0061
            java.lang.String r2 = ".+_cheets|cheets_.+"
            boolean r0 = r0.matches(r2)
            if (r0 == 0) goto L_0x0061
            r0 = 12
            r2 = 0
            java.lang.String r6 = r6.extractMetadata(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "video/webm"
            boolean r6 = r0.equals(r6)     // Catch:{ all -> 0x004e }
            if (r6 != 0) goto L_0x001d
            return r1
        L_0x001d:
            android.media.MediaExtractor r6 = new android.media.MediaExtractor     // Catch:{ all -> 0x004e }
            r6.<init>()     // Catch:{ all -> 0x004e }
            com.bumptech.glide.load.resource.bitmap.VideoDecoder$e r0 = r4.f11107a     // Catch:{ all -> 0x0048 }
            r0.b(r6, r5)     // Catch:{ all -> 0x0048 }
            int r5 = r6.getTrackCount()     // Catch:{ all -> 0x0048 }
            r0 = r1
        L_0x002c:
            if (r0 >= r5) goto L_0x004a
            android.media.MediaFormat r2 = r6.getTrackFormat(r0)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "mime"
            java.lang.String r2 = r2.getString(r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "video/x-vnd.on2.vp8"
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x0045
            r6.release()
            r5 = 1
            return r5
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x002c
        L_0x0048:
            r2 = r6
            goto L_0x004e
        L_0x004a:
            r6.release()
            goto L_0x0059
        L_0x004e:
            java.lang.String r5 = "VideoDecoder"
            r6 = 3
            android.util.Log.isLoggable(r5, r6)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0059
            r2.release()
        L_0x0059:
            return r1
        L_0x005a:
            r5 = move-exception
            if (r2 == 0) goto L_0x0060
            r2.release()
        L_0x0060:
            throw r5
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.VideoDecoder.l(java.lang.Object, android.media.MediaMetadataRetriever):boolean");
    }

    public static X0.e m(Z0.d dVar) {
        return new VideoDecoder(dVar, new g());
    }

    public s a(Object obj, int i4, int i5, X0.d dVar) {
        int i6;
        long longValue = ((Long) dVar.c(f11103d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) dVar.c(f11104e);
            if (num == null) {
                num = 2;
            }
            DownsampleStrategy downsampleStrategy = (DownsampleStrategy) dVar.c(DownsampleStrategy.f11088h);
            if (downsampleStrategy == null) {
                downsampleStrategy = DownsampleStrategy.f11087g;
            }
            DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
            MediaMetadataRetriever a4 = this.f11109c.a();
            try {
                this.f11107a.a(a4, obj);
                Bitmap f4 = f(obj, a4, longValue, num.intValue(), i4, i5, downsampleStrategy2);
                if (i6 < 29) {
                    a4.release();
                }
                return C0568g.f(f4, this.f11108b);
            } finally {
                if (Build.VERSION.SDK_INT >= 29) {
                    a4.release();
                } else {
                    a4.release();
                }
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    public boolean b(Object obj, X0.d dVar) {
        return true;
    }

    VideoDecoder(Z0.d dVar, e eVar, f fVar) {
        this.f11108b = dVar;
        this.f11107a = eVar;
        this.f11109c = fVar;
    }
}
