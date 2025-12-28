package androidx.work.impl;

import W.b;
import Z.g;
import kotlin.jvm.internal.o;

public final class n extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final n f7338c = new n();

    private n() {
        super(8, 9);
    }

    public void a(g gVar) {
        o.e(gVar, "db");
        gVar.p("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
