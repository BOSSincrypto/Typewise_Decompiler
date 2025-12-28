package V0;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class c implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f1580a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Charset f1581b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f1582c;

    /* renamed from: d  reason: collision with root package name */
    private int f1583d;

    /* renamed from: e  reason: collision with root package name */
    private int f1584e;

    class a extends ByteArrayOutputStream {
        a(int i4) {
            super(i4);
        }

        public String toString() {
            int i4 = this.count;
            if (i4 > 0 && this.buf[i4 - 1] == 13) {
                i4--;
            }
            try {
                return new String(this.buf, 0, i4, c.this.f1581b.name());
            } catch (UnsupportedEncodingException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void e() {
        InputStream inputStream = this.f1580a;
        byte[] bArr = this.f1582c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f1583d = 0;
            this.f1584e = read;
            return;
        }
        throw new EOFException();
    }

    public void close() {
        synchronized (this.f1580a) {
            try {
                if (this.f1582c != null) {
                    this.f1582c = null;
                    this.f1580a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean f() {
        if (this.f1584e == -1) {
            return true;
        }
        return false;
    }

    public String h() {
        int i4;
        byte[] bArr;
        int i5;
        synchronized (this.f1580a) {
            try {
                if (this.f1582c != null) {
                    if (this.f1583d >= this.f1584e) {
                        e();
                    }
                    for (int i6 = this.f1583d; i6 != this.f1584e; i6++) {
                        byte[] bArr2 = this.f1582c;
                        if (bArr2[i6] == 10) {
                            int i7 = this.f1583d;
                            if (i6 != i7) {
                                i5 = i6 - 1;
                                if (bArr2[i5] == 13) {
                                    String str = new String(bArr2, i7, i5 - i7, this.f1581b.name());
                                    this.f1583d = i6 + 1;
                                    return str;
                                }
                            }
                            i5 = i6;
                            String str2 = new String(bArr2, i7, i5 - i7, this.f1581b.name());
                            this.f1583d = i6 + 1;
                            return str2;
                        }
                    }
                    a aVar = new a((this.f1584e - this.f1583d) + 80);
                    loop1:
                    while (true) {
                        byte[] bArr3 = this.f1582c;
                        int i8 = this.f1583d;
                        aVar.write(bArr3, i8, this.f1584e - i8);
                        this.f1584e = -1;
                        e();
                        i4 = this.f1583d;
                        while (true) {
                            if (i4 != this.f1584e) {
                                bArr = this.f1582c;
                                if (bArr[i4] == 10) {
                                    break loop1;
                                }
                                i4++;
                            }
                        }
                    }
                    int i9 = this.f1583d;
                    if (i4 != i9) {
                        aVar.write(bArr, i9, i4 - i9);
                    }
                    this.f1583d = i4 + 1;
                    String byteArrayOutputStream = aVar.toString();
                    return byteArrayOutputStream;
                }
                throw new IOException("LineReader is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c(InputStream inputStream, int i4, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i4 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(d.f1586a)) {
            this.f1580a = inputStream;
            this.f1581b = charset;
            this.f1582c = new byte[i4];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
