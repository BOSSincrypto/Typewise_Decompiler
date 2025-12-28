package androidx.work.impl;

import W.b;
import Z.g;
import kotlin.jvm.internal.o;

/* renamed from: androidx.work.impl.g  reason: case insensitive filesystem */
public final class C0473g extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0473g f7331c = new C0473g();

    private C0473g() {
        super(12, 13);
    }

    public void a(g gVar) {
        o.e(gVar, "db");
        gVar.p("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        gVar.p("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
