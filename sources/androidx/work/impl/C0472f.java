package androidx.work.impl;

import W.b;
import Z.g;
import kotlin.jvm.internal.o;

/* renamed from: androidx.work.impl.f  reason: case insensitive filesystem */
public final class C0472f extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0472f f7302c = new C0472f();

    private C0472f() {
        super(11, 12);
    }

    public void a(g gVar) {
        o.e(gVar, "db");
        gVar.p("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
