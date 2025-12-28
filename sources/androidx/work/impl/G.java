package androidx.work.impl;

import W.b;
import Z.g;
import android.content.Context;
import kotlin.jvm.internal.o;
import m0.C0813l;
import m0.r;

public final class G extends b {

    /* renamed from: c  reason: collision with root package name */
    private final Context f7177c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public G(Context context) {
        super(9, 10);
        o.e(context, "context");
        this.f7177c = context;
    }

    public void a(g gVar) {
        o.e(gVar, "db");
        gVar.p("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        r.c(this.f7177c, gVar);
        C0813l.c(this.f7177c, gVar);
    }
}
