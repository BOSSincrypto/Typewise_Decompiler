package i1;

import X0.d;
import X0.e;
import Z0.b;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.engine.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public class j implements e {

    /* renamed from: a  reason: collision with root package name */
    private final List f13721a;

    /* renamed from: b  reason: collision with root package name */
    private final e f13722b;

    /* renamed from: c  reason: collision with root package name */
    private final b f13723c;

    public j(List list, e eVar, b bVar) {
        this.f13721a = list;
        this.f13722b = eVar;
        this.f13723c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e4) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e4);
            return null;
        }
    }

    /* renamed from: c */
    public s a(InputStream inputStream, int i4, int i5, d dVar) {
        byte[] e4 = e(inputStream);
        if (e4 == null) {
            return null;
        }
        return this.f13722b.a(ByteBuffer.wrap(e4), i4, i5, dVar);
    }

    /* renamed from: d */
    public boolean b(InputStream inputStream, d dVar) {
        if (((Boolean) dVar.c(i.f13720b)).booleanValue() || a.f(this.f13721a, inputStream, this.f13723c) != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }
}
