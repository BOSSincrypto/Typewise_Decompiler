package B0;

import ch.icoaching.typewise.file_handling.ConfigHolder;
import kotlin.jvm.internal.o;
import r0.c;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final q f154a;

    public p(q qVar, ConfigHolder configHolder) {
        o.e(qVar, "distanceComparer");
        o.e(configHolder, "configHolder");
        this.f154a = qVar;
    }

    public final float a(c cVar, c cVar2, float f4) {
        o.e(cVar, "singleWord1");
        o.e(cVar2, "singleWord2");
        return this.f154a.g(cVar, cVar2, f4);
    }
}
