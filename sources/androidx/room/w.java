package androidx.room;

import Z.h;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

public final class w implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f6889a;

    /* renamed from: b  reason: collision with root package name */
    private final File f6890b;

    /* renamed from: c  reason: collision with root package name */
    private final Callable f6891c;

    /* renamed from: d  reason: collision with root package name */
    private final h.c f6892d;

    public w(String str, File file, Callable callable, h.c cVar) {
        o.e(cVar, "mDelegate");
        this.f6889a = str;
        this.f6890b = file;
        this.f6891c = callable;
        this.f6892d = cVar;
    }

    public h a(h.b bVar) {
        o.e(bVar, "configuration");
        return new v(bVar.f2138a, this.f6889a, this.f6890b, this.f6891c, bVar.f2140c.f2136a, this.f6892d.a(bVar));
    }
}
