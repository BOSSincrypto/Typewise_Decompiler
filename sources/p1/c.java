package p1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final long f15860a;

    /* renamed from: b  reason: collision with root package name */
    private int f15861b;

    private c(InputStream inputStream, long j4) {
        super(inputStream);
        this.f15860a = j4;
    }

    private int a(int i4) {
        if (i4 >= 0) {
            this.f15861b += i4;
        } else if (this.f15860a - ((long) this.f15861b) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f15860a + ", but read: " + this.f15861b);
        }
        return i4;
    }

    public static InputStream e(InputStream inputStream, long j4) {
        return new c(inputStream, j4);
    }

    public synchronized int available() {
        return (int) Math.max(this.f15860a - ((long) this.f15861b), (long) this.in.available());
    }

    public synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i4, int i5) {
        return a(super.read(bArr, i4, i5));
    }
}
