package p1;

import java.io.FilterInputStream;
import java.io.InputStream;

public class i extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private int f15876a = Integer.MIN_VALUE;

    public i(InputStream inputStream) {
        super(inputStream);
    }

    private long a(long j4) {
        int i4 = this.f15876a;
        if (i4 == 0) {
            return -1;
        }
        if (i4 == Integer.MIN_VALUE || j4 <= ((long) i4)) {
            return j4;
        }
        return (long) i4;
    }

    private void e(long j4) {
        int i4 = this.f15876a;
        if (i4 != Integer.MIN_VALUE && j4 != -1) {
            this.f15876a = (int) (((long) i4) - j4);
        }
    }

    public int available() {
        int i4 = this.f15876a;
        if (i4 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i4, super.available());
    }

    public synchronized void mark(int i4) {
        super.mark(i4);
        this.f15876a = i4;
    }

    public int read() {
        if (a(1) == -1) {
            return -1;
        }
        int read = super.read();
        e(1);
        return read;
    }

    public synchronized void reset() {
        super.reset();
        this.f15876a = Integer.MIN_VALUE;
    }

    public long skip(long j4) {
        long a4 = a(j4);
        if (a4 == -1) {
            return 0;
        }
        long skip = super.skip(a4);
        e(skip);
        return skip;
    }

    public int read(byte[] bArr, int i4, int i5) {
        int a4 = (int) a((long) i5);
        if (a4 == -1) {
            return -1;
        }
        int read = super.read(bArr, i4, a4);
        e((long) read);
        return read;
    }
}
