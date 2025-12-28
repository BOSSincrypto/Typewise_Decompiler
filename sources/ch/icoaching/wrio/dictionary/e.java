package ch.icoaching.wrio.dictionary;

import M2.a;
import M2.b;
import android.content.Context;
import ch.icoaching.wrio.data.f;
import kotlin.jvm.internal.o;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f9628a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static d f9629b;

    private e() {
    }

    public final d a() {
        if (f9629b == null) {
            Context a4 = a.f941a.a();
            f fVar = f.f9502a;
            f9629b = new c(a4, fVar.h(), b.f944a.a(), fVar.f());
        }
        d dVar = f9629b;
        o.b(dVar);
        return dVar;
    }
}
