package V0;

import com.silkimen.http.HttpRequest;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

abstract class d {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f1586a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f1587b = Charset.forName(HttpRequest.CHARSET_UTF8);

    static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }

    static void b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i4 = 0;
            while (i4 < length) {
                File file2 = listFiles[i4];
                if (file2.isDirectory()) {
                    b(file2);
                }
                if (file2.delete()) {
                    i4++;
                } else {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
