package com.bumptech.glide.load.data;

import Z0.b;
import java.io.OutputStream;

public final class c extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f10824a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f10825b;

    /* renamed from: c  reason: collision with root package name */
    private b f10826c;

    /* renamed from: d  reason: collision with root package name */
    private int f10827d;

    public c(OutputStream outputStream, b bVar) {
        this(outputStream, bVar, 65536);
    }

    private void a() {
        int i4 = this.f10827d;
        if (i4 > 0) {
            this.f10824a.write(this.f10825b, 0, i4);
            this.f10827d = 0;
        }
    }

    private void e() {
        if (this.f10827d == this.f10825b.length) {
            a();
        }
    }

    private void f() {
        byte[] bArr = this.f10825b;
        if (bArr != null) {
            this.f10826c.d(bArr);
            this.f10825b = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            flush();
            this.f10824a.close();
            f();
        } catch (Throwable th) {
            this.f10824a.close();
            throw th;
        }
    }

    public void flush() {
        a();
        this.f10824a.flush();
    }

    public void write(int i4) {
        byte[] bArr = this.f10825b;
        int i5 = this.f10827d;
        this.f10827d = i5 + 1;
        bArr[i5] = (byte) i4;
        e();
    }

    c(OutputStream outputStream, b bVar, int i4) {
        this.f10824a = outputStream;
        this.f10826c = bVar;
        this.f10825b = (byte[]) bVar.e(i4, byte[].class);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i4, int i5) {
        int i6 = 0;
        do {
            int i7 = i5 - i6;
            int i8 = i4 + i6;
            int i9 = this.f10827d;
            if (i9 != 0 || i7 < this.f10825b.length) {
                int min = Math.min(i7, this.f10825b.length - i9);
                System.arraycopy(bArr, i8, this.f10825b, this.f10827d, min);
                this.f10827d += min;
                i6 += min;
                e();
            } else {
                this.f10824a.write(bArr, i8, i7);
                return;
            }
        } while (i6 < i5);
    }
}
