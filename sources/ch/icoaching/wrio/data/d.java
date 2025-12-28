package ch.icoaching.wrio.data;

import i2.C0680a;
import java.util.UUID;
import kotlin.jvm.internal.o;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final C0680a f9501a;

    public d(C0680a aVar) {
        o.e(aVar, "sharedPreferences");
        this.f9501a = aVar;
    }

    public final String a() {
        String r4 = this.f9501a.r();
        if (!kotlin.text.o.X(r4)) {
            return r4;
        }
        String uuid = UUID.randomUUID().toString();
        o.d(uuid, "toString(...)");
        this.f9501a.X(uuid);
        return uuid;
    }
}
