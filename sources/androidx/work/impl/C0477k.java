package androidx.work.impl;

import W.b;
import Z.g;
import kotlin.jvm.internal.o;

/* renamed from: androidx.work.impl.k  reason: case insensitive filesystem */
public final class C0477k extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0477k f7335c = new C0477k();

    private C0477k() {
        super(4, 5);
    }

    public void a(g gVar) {
        o.e(gVar, "db");
        gVar.p("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        gVar.p("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
