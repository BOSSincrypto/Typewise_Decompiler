package com.bumptech.glide.load.resource.bitmap;

import X0.c;
import X0.d;
import X0.f;
import Z0.b;
import android.graphics.Bitmap;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c  reason: case insensitive filesystem */
public class C0564c implements f {

    /* renamed from: b  reason: collision with root package name */
    public static final c f11118b = c.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c  reason: collision with root package name */
    public static final c f11119c = c.e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: a  reason: collision with root package name */
    private final b f11120a;

    public C0564c(b bVar) {
        this.f11120a = bVar;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, d dVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) dVar.c(f11119c);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public EncodeStrategy b(d dVar) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:23|(2:41|42)|43|44) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b3 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060 A[SYNTHETIC, Splitter:B:29:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b A[Catch:{ all -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0 A[SYNTHETIC, Splitter:B:41:0x00b0] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.bumptech.glide.load.engine.s r8, java.io.File r9, X0.d r10) {
        /*
            r7 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap$CompressFormat r1 = r7.d(r8, r10)
            int r2 = r8.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            q1.C0865b.d(r4, r2, r3, r1)
            long r2 = p1.g.b()     // Catch:{ all -> 0x0054 }
            X0.c r4 = f11118b     // Catch:{ all -> 0x0054 }
            java.lang.Object r4 = r10.c(r4)     // Catch:{ all -> 0x0054 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0054 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0054 }
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x005a }
            r6.<init>(r9)     // Catch:{ IOException -> 0x005a }
            Z0.b r9 = r7.f11120a     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            if (r9 == 0) goto L_0x0049
            com.bumptech.glide.load.data.c r9 = new com.bumptech.glide.load.data.c     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            Z0.b r5 = r7.f11120a     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            r9.<init>(r6, r5)     // Catch:{ IOException -> 0x0047, all -> 0x0044 }
            r5 = r9
            goto L_0x004a
        L_0x0044:
            r8 = move-exception
            r5 = r6
            goto L_0x00ae
        L_0x0047:
            r5 = r6
            goto L_0x005a
        L_0x0049:
            r5 = r6
        L_0x004a:
            r8.compress(r1, r4, r5)     // Catch:{ IOException -> 0x005a }
            r5.close()     // Catch:{ IOException -> 0x005a }
            r5.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x0056
        L_0x0054:
            r8 = move-exception
            goto L_0x00b4
        L_0x0056:
            r9 = 1
            goto L_0x0064
        L_0x0058:
            r8 = move-exception
            goto L_0x00ae
        L_0x005a:
            r9 = 3
            android.util.Log.isLoggable(r0, r9)     // Catch:{ all -> 0x0058 }
            if (r5 == 0) goto L_0x0063
            r5.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            r9 = 0
        L_0x0064:
            r4 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x00aa
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r0.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = "Compressed with type: "
            r0.append(r4)     // Catch:{ all -> 0x0054 }
            r0.append(r1)     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = " of size "
            r0.append(r1)     // Catch:{ all -> 0x0054 }
            int r1 = p1.l.g(r8)     // Catch:{ all -> 0x0054 }
            r0.append(r1)     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = " in "
            r0.append(r1)     // Catch:{ all -> 0x0054 }
            double r1 = p1.g.a(r2)     // Catch:{ all -> 0x0054 }
            r0.append(r1)     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = ", options format: "
            r0.append(r1)     // Catch:{ all -> 0x0054 }
            X0.c r1 = f11119c     // Catch:{ all -> 0x0054 }
            java.lang.Object r10 = r10.c(r1)     // Catch:{ all -> 0x0054 }
            r0.append(r10)     // Catch:{ all -> 0x0054 }
            java.lang.String r10 = ", hasAlpha: "
            r0.append(r10)     // Catch:{ all -> 0x0054 }
            boolean r8 = r8.hasAlpha()     // Catch:{ all -> 0x0054 }
            r0.append(r8)     // Catch:{ all -> 0x0054 }
        L_0x00aa:
            q1.C0865b.e()
            return r9
        L_0x00ae:
            if (r5 == 0) goto L_0x00b3
            r5.close()     // Catch:{ IOException -> 0x00b3 }
        L_0x00b3:
            throw r8     // Catch:{ all -> 0x0054 }
        L_0x00b4:
            q1.C0865b.e()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C0564c.a(com.bumptech.glide.load.engine.s, java.io.File, X0.d):boolean");
    }
}
