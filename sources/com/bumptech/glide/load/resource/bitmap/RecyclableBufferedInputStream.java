package com.bumptech.glide.load.resource.bitmap;

import Z0.b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class RecyclableBufferedInputStream extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private volatile byte[] f11097a;

    /* renamed from: b  reason: collision with root package name */
    private int f11098b;

    /* renamed from: c  reason: collision with root package name */
    private int f11099c;

    /* renamed from: d  reason: collision with root package name */
    private int f11100d;

    /* renamed from: e  reason: collision with root package name */
    private int f11101e;

    /* renamed from: f  reason: collision with root package name */
    private final b f11102f;

    static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, b bVar) {
        this(inputStream, bVar, 65536);
    }

    private int a(InputStream inputStream, byte[] bArr) {
        int i4;
        int i5 = this.f11100d;
        if (i5 == -1 || this.f11101e - i5 >= (i4 = this.f11099c)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f11100d = -1;
                this.f11101e = 0;
                this.f11098b = read;
            }
            return read;
        }
        if (i5 == 0 && i4 > bArr.length && this.f11098b == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i4) {
                i4 = length;
            }
            byte[] bArr2 = (byte[]) this.f11102f.e(i4, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f11097a = bArr2;
            this.f11102f.d(bArr);
            bArr = bArr2;
        } else if (i5 > 0) {
            System.arraycopy(bArr, i5, bArr, 0, bArr.length - i5);
        }
        int i6 = this.f11101e - this.f11100d;
        this.f11101e = i6;
        this.f11100d = 0;
        this.f11098b = 0;
        int read2 = inputStream.read(bArr, i6, bArr.length - i6);
        int i7 = this.f11101e;
        if (read2 > 0) {
            i7 += read2;
        }
        this.f11098b = i7;
        return read2;
    }

    private static IOException h() {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f11097a == null || inputStream == null) {
            throw h();
        }
        return (this.f11098b - this.f11101e) + inputStream.available();
    }

    public void close() {
        if (this.f11097a != null) {
            this.f11102f.d(this.f11097a);
            this.f11097a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void e() {
        this.f11099c = this.f11097a.length;
    }

    public synchronized void f() {
        if (this.f11097a != null) {
            this.f11102f.d(this.f11097a);
            this.f11097a = null;
        }
    }

    public synchronized void mark(int i4) {
        this.f11099c = Math.max(this.f11099c, i4);
        this.f11100d = this.f11101e;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:12:0x001a=Splitter:B:12:0x001a, B:28:0x003b=Splitter:B:28:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.f11097a     // Catch:{ all -> 0x0018 }
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            int r2 = r5.f11101e     // Catch:{ all -> 0x0018 }
            int r3 = r5.f11098b     // Catch:{ all -> 0x0018 }
            r4 = -1
            if (r2 < r3) goto L_0x001a
            int r1 = r5.a(r1, r0)     // Catch:{ all -> 0x0018 }
            if (r1 != r4) goto L_0x001a
            monitor-exit(r5)
            return r4
        L_0x0018:
            r0 = move-exception
            goto L_0x0040
        L_0x001a:
            byte[] r1 = r5.f11097a     // Catch:{ all -> 0x0018 }
            if (r0 == r1) goto L_0x0028
            byte[] r0 = r5.f11097a     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            java.io.IOException r0 = h()     // Catch:{ all -> 0x0018 }
            throw r0     // Catch:{ all -> 0x0018 }
        L_0x0028:
            int r1 = r5.f11098b     // Catch:{ all -> 0x0018 }
            int r2 = r5.f11101e     // Catch:{ all -> 0x0018 }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0039
            int r1 = r2 + 1
            r5.f11101e = r1     // Catch:{ all -> 0x0018 }
            byte r0 = r0[r2]     // Catch:{ all -> 0x0018 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L_0x0039:
            monitor-exit(r5)
            return r4
        L_0x003b:
            java.io.IOException r0 = h()     // Catch:{ all -> 0x0018 }
            throw r0     // Catch:{ all -> 0x0018 }
        L_0x0040:
            monitor-exit(r5)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream.read():int");
    }

    public synchronized void reset() {
        if (this.f11097a != null) {
            int i4 = this.f11100d;
            if (-1 != i4) {
                this.f11101e = i4;
            } else {
                throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f11101e + " markLimit: " + this.f11099c);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public synchronized long skip(long j4) {
        if (j4 < 1) {
            return 0;
        }
        byte[] bArr = this.f11097a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i4 = this.f11098b;
                int i5 = this.f11101e;
                if (((long) (i4 - i5)) >= j4) {
                    this.f11101e = (int) (((long) i5) + j4);
                    return j4;
                }
                long j5 = ((long) i4) - ((long) i5);
                this.f11101e = i4;
                if (this.f11100d == -1 || j4 > ((long) this.f11099c)) {
                    long skip = inputStream.skip(j4 - j5);
                    if (skip > 0) {
                        this.f11100d = -1;
                    }
                    return j5 + skip;
                } else if (a(inputStream, bArr) == -1) {
                    return j5;
                } else {
                    int i6 = this.f11098b;
                    int i7 = this.f11101e;
                    if (((long) (i6 - i7)) >= j4 - j5) {
                        this.f11101e = (int) ((((long) i7) + j4) - j5);
                        return j4;
                    }
                    long j6 = (j5 + ((long) i6)) - ((long) i7);
                    this.f11101e = i6;
                    return j6;
                }
            } else {
                throw h();
            }
        } else {
            throw h();
        }
    }

    RecyclableBufferedInputStream(InputStream inputStream, b bVar, int i4) {
        super(inputStream);
        this.f11100d = -1;
        this.f11102f = bVar;
        this.f11097a = (byte[]) bVar.e(i4, byte[].class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0049, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0056, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f11097a     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x008d
            if (r9 != 0) goto L_0x000a
            monitor-exit(r6)
            r7 = 0
            return r7
        L_0x000a:
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0088
            int r2 = r6.f11101e     // Catch:{ all -> 0x0030 }
            int r3 = r6.f11098b     // Catch:{ all -> 0x0030 }
            if (r2 >= r3) goto L_0x0034
            int r4 = r3 - r2
            if (r4 < r9) goto L_0x001a
            r3 = r9
            goto L_0x001b
        L_0x001a:
            int r3 = r3 - r2
        L_0x001b:
            java.lang.System.arraycopy(r0, r2, r7, r8, r3)     // Catch:{ all -> 0x0030 }
            int r2 = r6.f11101e     // Catch:{ all -> 0x0030 }
            int r2 = r2 + r3
            r6.f11101e = r2     // Catch:{ all -> 0x0030 }
            if (r3 == r9) goto L_0x0032
            int r2 = r1.available()     // Catch:{ all -> 0x0030 }
            if (r2 != 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            int r8 = r8 + r3
            int r2 = r9 - r3
            goto L_0x0035
        L_0x0030:
            r7 = move-exception
            goto L_0x0092
        L_0x0032:
            monitor-exit(r6)
            return r3
        L_0x0034:
            r2 = r9
        L_0x0035:
            int r3 = r6.f11100d     // Catch:{ all -> 0x0030 }
            r4 = -1
            if (r3 != r4) goto L_0x004a
            int r3 = r0.length     // Catch:{ all -> 0x0030 }
            if (r2 < r3) goto L_0x004a
            int r3 = r1.read(r7, r8, r2)     // Catch:{ all -> 0x0030 }
            if (r3 != r4) goto L_0x0078
            if (r2 != r9) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            int r4 = r9 - r2
        L_0x0048:
            monitor-exit(r6)
            return r4
        L_0x004a:
            int r3 = r6.a(r1, r0)     // Catch:{ all -> 0x0030 }
            if (r3 != r4) goto L_0x0057
            if (r2 != r9) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            int r4 = r9 - r2
        L_0x0055:
            monitor-exit(r6)
            return r4
        L_0x0057:
            byte[] r3 = r6.f11097a     // Catch:{ all -> 0x0030 }
            if (r0 == r3) goto L_0x0065
            byte[] r0 = r6.f11097a     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0060
            goto L_0x0065
        L_0x0060:
            java.io.IOException r7 = h()     // Catch:{ all -> 0x0030 }
            throw r7     // Catch:{ all -> 0x0030 }
        L_0x0065:
            int r3 = r6.f11098b     // Catch:{ all -> 0x0030 }
            int r4 = r6.f11101e     // Catch:{ all -> 0x0030 }
            int r5 = r3 - r4
            if (r5 < r2) goto L_0x006f
            r3 = r2
            goto L_0x0070
        L_0x006f:
            int r3 = r3 - r4
        L_0x0070:
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x0030 }
            int r4 = r6.f11101e     // Catch:{ all -> 0x0030 }
            int r4 = r4 + r3
            r6.f11101e = r4     // Catch:{ all -> 0x0030 }
        L_0x0078:
            int r2 = r2 - r3
            if (r2 != 0) goto L_0x007d
            monitor-exit(r6)
            return r9
        L_0x007d:
            int r4 = r1.available()     // Catch:{ all -> 0x0030 }
            if (r4 != 0) goto L_0x0086
            int r9 = r9 - r2
            monitor-exit(r6)
            return r9
        L_0x0086:
            int r8 = r8 + r3
            goto L_0x0035
        L_0x0088:
            java.io.IOException r7 = h()     // Catch:{ all -> 0x0030 }
            throw r7     // Catch:{ all -> 0x0030 }
        L_0x008d:
            java.io.IOException r7 = h()     // Catch:{ all -> 0x0030 }
            throw r7     // Catch:{ all -> 0x0030 }
        L_0x0092:
            monitor-exit(r6)     // Catch:{ all -> 0x0030 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream.read(byte[], int, int):int");
    }
}
