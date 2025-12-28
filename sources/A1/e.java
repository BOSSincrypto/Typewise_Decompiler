package a1;

import V0.b;
import a1.C0355a;
import android.util.Log;
import java.io.File;
import java.io.IOException;

public class e implements C0355a {

    /* renamed from: a  reason: collision with root package name */
    private final j f2229a;

    /* renamed from: b  reason: collision with root package name */
    private final File f2230b;

    /* renamed from: c  reason: collision with root package name */
    private final long f2231c;

    /* renamed from: d  reason: collision with root package name */
    private final C0357c f2232d = new C0357c();

    /* renamed from: e  reason: collision with root package name */
    private b f2233e;

    protected e(File file, long j4) {
        this.f2230b = file;
        this.f2231c = j4;
        this.f2229a = new j();
    }

    public static C0355a c(File file, long j4) {
        return new e(file, j4);
    }

    private synchronized b d() {
        try {
            if (this.f2233e == null) {
                this.f2233e = b.p0(this.f2230b, 1, 1, this.f2231c);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.f2233e;
    }

    public void a(X0.b bVar, C0355a.b bVar2) {
        b.c b02;
        String b4 = this.f2229a.b(bVar);
        this.f2232d.a(b4);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Put: Obtained: ");
                sb.append(b4);
                sb.append(" for for Key: ");
                sb.append(bVar);
            }
            try {
                b d4 = d();
                if (d4.j0(b4) == null) {
                    b02 = d4.b0(b4);
                    if (b02 != null) {
                        if (bVar2.a(b02.f(0))) {
                            b02.e();
                        }
                        b02.b();
                        this.f2232d.b(b4);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + b4);
                }
            } catch (IOException e4) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e4);
                }
            } catch (Throwable th) {
                b02.b();
                throw th;
            }
        } finally {
            this.f2232d.b(b4);
        }
    }

    public File b(X0.b bVar) {
        String b4 = this.f2229a.b(bVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get: Obtained: ");
            sb.append(b4);
            sb.append(" for for Key: ");
            sb.append(bVar);
        }
        try {
            b.e j02 = d().j0(b4);
            if (j02 != null) {
                return j02.a(0);
            }
            return null;
        } catch (IOException e4) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e4);
            return null;
        }
    }
}
