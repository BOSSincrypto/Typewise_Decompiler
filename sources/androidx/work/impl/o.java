package androidx.work.impl;

import androidx.lifecycle.r;
import androidx.work.impl.utils.futures.a;
import androidx.work.o;

public class o implements androidx.work.o {

    /* renamed from: c  reason: collision with root package name */
    private final r f7339c = new r();

    /* renamed from: d  reason: collision with root package name */
    private final a f7340d = a.t();

    public o() {
        a(androidx.work.o.f7434b);
    }

    public void a(o.b bVar) {
        this.f7339c.h(bVar);
        if (bVar instanceof o.b.c) {
            this.f7340d.p((o.b.c) bVar);
        } else if (bVar instanceof o.b.a) {
            this.f7340d.q(((o.b.a) bVar).a());
        }
    }
}
