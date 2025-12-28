package p1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public final class d extends InputStream {

    /* renamed from: c  reason: collision with root package name */
    private static final Queue f15862c = l.e(0);

    /* renamed from: a  reason: collision with root package name */
    private InputStream f15863a;

    /* renamed from: b  reason: collision with root package name */
    private IOException f15864b;

    d() {
    }

    public static d e(InputStream inputStream) {
        d dVar;
        Queue queue = f15862c;
        synchronized (queue) {
            dVar = (d) queue.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        dVar.h(inputStream);
        return dVar;
    }

    public IOException a() {
        return this.f15864b;
    }

    public int available() {
        return this.f15863a.available();
    }

    public void close() {
        this.f15863a.close();
    }

    public void f() {
        this.f15864b = null;
        this.f15863a = null;
        Queue queue = f15862c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void h(InputStream inputStream) {
        this.f15863a = inputStream;
    }

    public void mark(int i4) {
        this.f15863a.mark(i4);
    }

    public boolean markSupported() {
        return this.f15863a.markSupported();
    }

    public int read() {
        try {
            return this.f15863a.read();
        } catch (IOException e4) {
            this.f15864b = e4;
            throw e4;
        }
    }

    public synchronized void reset() {
        this.f15863a.reset();
    }

    public long skip(long j4) {
        try {
            return this.f15863a.skip(j4);
        } catch (IOException e4) {
            this.f15864b = e4;
            throw e4;
        }
    }

    public int read(byte[] bArr) {
        try {
            return this.f15863a.read(bArr);
        } catch (IOException e4) {
            this.f15864b = e4;
            throw e4;
        }
    }

    public int read(byte[] bArr, int i4, int i5) {
        try {
            return this.f15863a.read(bArr, i4, i5);
        } catch (IOException e4) {
            this.f15864b = e4;
            throw e4;
        }
    }
}
