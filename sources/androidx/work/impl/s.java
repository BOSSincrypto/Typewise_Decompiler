package androidx.work.impl;

import W.b;
import Z.g;
import android.content.Context;
import kotlin.jvm.internal.o;

public final class s extends b {

    /* renamed from: c  reason: collision with root package name */
    private final Context f7363c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(Context context, int i4, int i5) {
        super(i4, i5);
        o.e(context, "mContext");
        this.f7363c = context;
    }

    public void a(g gVar) {
        o.e(gVar, "db");
        if (this.f1648b >= 10) {
            gVar.X("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            return;
        }
        this.f7363c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
    }
}
