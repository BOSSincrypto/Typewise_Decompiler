package s2;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.o;

/* renamed from: s2.a  reason: case insensitive filesystem */
public abstract class C0895a {
    public static final long a(InputStream inputStream, OutputStream outputStream, int i4) {
        o.e(inputStream, "<this>");
        o.e(outputStream, "out");
        byte[] bArr = new byte[i4];
        int read = inputStream.read(bArr);
        long j4 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j4 += (long) read;
            read = inputStream.read(bArr);
        }
        return j4;
    }

    public static /* synthetic */ long b(InputStream inputStream, OutputStream outputStream, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 8192;
        }
        return a(inputStream, outputStream, i4);
    }

    public static final byte[] c(InputStream inputStream) {
        o.e(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        b(inputStream, byteArrayOutputStream, 0, 2, (Object) null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        o.d(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
