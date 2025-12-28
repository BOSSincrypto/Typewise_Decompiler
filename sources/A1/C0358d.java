package a1;

import a1.C0355a;
import java.io.File;

/* renamed from: a1.d  reason: case insensitive filesystem */
public abstract class C0358d implements C0355a.C0044a {

    /* renamed from: a  reason: collision with root package name */
    private final long f2227a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2228b;

    /* renamed from: a1.d$a */
    public interface a {
        File a();
    }

    public C0358d(a aVar, long j4) {
        this.f2227a = j4;
        this.f2228b = aVar;
    }

    public C0355a a() {
        File a4 = this.f2228b.a();
        if (a4 == null) {
            return null;
        }
        if (a4.isDirectory() || a4.mkdirs()) {
            return e.c(a4, this.f2227a);
        }
        return null;
    }
}
