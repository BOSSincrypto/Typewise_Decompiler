package s2;

import java.io.Closeable;
import l2.C0793c;

/* renamed from: s2.b  reason: case insensitive filesystem */
public abstract class C0896b {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C0793c.a(th, th2);
        }
    }
}
