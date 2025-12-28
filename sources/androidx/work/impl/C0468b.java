package androidx.work.impl;

import W.a;
import Z.g;
import android.content.ContentValues;
import kotlin.jvm.internal.o;

/* renamed from: androidx.work.impl.b  reason: case insensitive filesystem */
public final class C0468b implements a {
    public void a(g gVar) {
        o.e(gVar, "db");
        gVar.p("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        gVar.Z("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
