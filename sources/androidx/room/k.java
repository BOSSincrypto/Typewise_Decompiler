package androidx.room;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.jvm.internal.o;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f6810a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f6811b;

    public k(RoomDatabase roomDatabase) {
        o.e(roomDatabase, "database");
        this.f6810a = roomDatabase;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        o.d(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f6811b = newSetFromMap;
    }
}
