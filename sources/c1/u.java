package c1;

import X0.a;
import Z0.b;

public class u implements a {

    /* renamed from: a  reason: collision with root package name */
    private final b f7611a;

    public u(b bVar) {
        this.f7611a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003a A[SYNTHETIC, Splitter:B:22:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045 A[SYNTHETIC, Splitter:B:27:0x0045] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.io.InputStream r4, java.io.File r5, X0.d r6) {
        /*
            r3 = this;
            Z0.b r6 = r3.f7611a
            r0 = 65536(0x10000, float:9.18355E-41)
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Object r6 = r6.e(r0, r1)
            byte[] r6 = (byte[]) r6
            r0 = 0
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0032 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x0032 }
        L_0x0013:
            int r5 = r4.read(r6)     // Catch:{ IOException -> 0x0021, all -> 0x001e }
            r1 = -1
            if (r5 == r1) goto L_0x0023
            r2.write(r6, r0, r5)     // Catch:{ IOException -> 0x0021, all -> 0x001e }
            goto L_0x0013
        L_0x001e:
            r4 = move-exception
            r1 = r2
            goto L_0x0043
        L_0x0021:
            r1 = r2
            goto L_0x0032
        L_0x0023:
            r2.close()     // Catch:{ IOException -> 0x0021, all -> 0x001e }
            r2.close()     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            Z0.b r4 = r3.f7611a
            r4.d(r6)
            r0 = 1
            goto L_0x0042
        L_0x0030:
            r4 = move-exception
            goto L_0x0043
        L_0x0032:
            java.lang.String r4 = "StreamEncoder"
            r5 = 3
            android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x003d
            r1.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            Z0.b r4 = r3.f7611a
            r4.d(r6)
        L_0x0042:
            return r0
        L_0x0043:
            if (r1 == 0) goto L_0x0048
            r1.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            Z0.b r5 = r3.f7611a
            r5.d(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.u.a(java.io.InputStream, java.io.File, X0.d):boolean");
    }
}
