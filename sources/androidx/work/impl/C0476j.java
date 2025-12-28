package androidx.work.impl;

import W.b;
import Z.g;
import kotlin.jvm.internal.o;

/* renamed from: androidx.work.impl.j  reason: case insensitive filesystem */
public final class C0476j extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0476j f7334c = new C0476j();

    private C0476j() {
        super(3, 4);
    }

    public void a(g gVar) {
        o.e(gVar, "db");
        gVar.p("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
