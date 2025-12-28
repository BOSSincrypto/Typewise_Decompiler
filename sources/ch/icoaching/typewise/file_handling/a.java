package ch.icoaching.typewise.file_handling;

import android.content.res.AssetManager;
import ch.icoaching.typewise.e;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;

public final class a implements FileIO {

    /* renamed from: a  reason: collision with root package name */
    private AssetManager f8264a;

    public a(AssetManager assetManager) {
        o.e(assetManager, "assetManager");
        this.f8264a = assetManager;
    }

    public Object a(String str, c cVar) {
        return E0.a.e(this.f8264a, str);
    }

    public Object b(String str, boolean z3, boolean z4, c cVar) {
        e eVar = e.f8233a;
        e.b(eVar, "DefaultFileIO", "Calling FileIO.mkdir() with params: '" + str + "', " + z3 + ", " + z4 + ". Function DOESN'T make a directory, but always returns true.", (Throwable) null, 4, (Object) null);
        return kotlin.coroutines.jvm.internal.a.a(true);
    }

    public Object c(String str, c cVar) {
        return kotlin.coroutines.jvm.internal.a.a(E0.a.a(this.f8264a, String.valueOf(str)) || E0.a.b(this.f8264a, String.valueOf(str)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        s2.C0896b.a(r2, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(java.lang.String r2, kotlin.coroutines.c r3) {
        /*
            r1 = this;
            android.content.res.AssetManager r3 = r1.f8264a
            java.io.InputStream r2 = r3.open(r2)
            kotlin.jvm.internal.o.b(r2)     // Catch:{ all -> 0x0012 }
            byte[] r3 = s2.C0895a.c(r2)     // Catch:{ all -> 0x0012 }
            r0 = 0
            s2.C0896b.a(r2, r0)
            return r3
        L_0x0012:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r0 = move-exception
            s2.C0896b.a(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.file_handling.a.d(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }
}
