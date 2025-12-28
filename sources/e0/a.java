package E0;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.o;

public abstract class a {
    public static final boolean a(AssetManager assetManager, String str) {
        o.e(assetManager, "<this>");
        o.e(str, "path");
        try {
            assetManager.open(str).close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static final boolean b(AssetManager assetManager, String str) {
        o.e(assetManager, "<this>");
        o.e(str, "path");
        boolean z3 = false;
        try {
            String[] list = assetManager.list(str);
            if (list == null || list.length == 0) {
                z3 = true;
            }
            return !z3;
        } catch (IOException unused) {
            return false;
        }
    }

    public static final ByteBuffer c(AssetManager assetManager, String str) {
        o.e(assetManager, "<this>");
        o.e(str, "filePath");
        InputStream open = assetManager.open(str);
        o.d(open, "open(...)");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[32768];
        while (true) {
            int read = open.read(bArr, 0, 32768);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                open.close();
                ByteBuffer order = ByteBuffer.allocateDirect(byteArray.length).order(ByteOrder.nativeOrder());
                order.put(byteArray);
                order.rewind();
                o.b(order);
                return order;
            }
        }
    }

    public static final MappedByteBuffer d(AssetManager assetManager, String str) {
        o.e(assetManager, "<this>");
        o.e(str, "filePath");
        AssetFileDescriptor openFd = assetManager.openFd(str);
        o.d(openFd, "openFd(...)");
        FileInputStream fileInputStream = new FileInputStream(openFd.getFileDescriptor());
        FileChannel channel = fileInputStream.getChannel();
        FileChannel fileChannel = channel;
        MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getDeclaredLength());
        channel.close();
        fileInputStream.close();
        openFd.close();
        o.b(map);
        return map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        s2.C0896b.a(r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String e(android.content.res.AssetManager r1, java.lang.String r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.e(r1, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.o.e(r2, r0)
            java.io.InputStream r1 = r1.open(r2)
            java.lang.String r2 = "open(...)"
            kotlin.jvm.internal.o.d(r1, r2)
            java.nio.charset.Charset r2 = kotlin.text.C0724d.f13927b
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r1, r2)
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r2 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r0, r2)
            java.lang.String r2 = s2.c.c(r1)     // Catch:{ all -> 0x002a }
            r0 = 0
            s2.C0896b.a(r1, r0)
            return r2
        L_0x002a:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            s2.C0896b.a(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.a.e(android.content.res.AssetManager, java.lang.String):java.lang.String");
    }
}
