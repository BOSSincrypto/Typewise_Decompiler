package androidx.room;

import kotlin.jvm.internal.o;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f6862a = new s();

    private s() {
    }

    public static final String a(String str) {
        o.e(str, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')";
    }
}
