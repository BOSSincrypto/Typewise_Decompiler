package j0;

import android.os.Build;
import androidx.work.NetworkType;
import i0.C0678b;
import k0.C0700h;
import kotlin.jvm.internal.o;
import l0.v;

public final class g extends C0686c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(C0700h hVar) {
        super(hVar);
        o.e(hVar, "tracker");
    }

    public boolean b(v vVar) {
        o.e(vVar, "workSpec");
        NetworkType d4 = vVar.f14479j.d();
        if (d4 == NetworkType.UNMETERED || (Build.VERSION.SDK_INT >= 30 && d4 == NetworkType.TEMPORARILY_UNMETERED)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean c(C0678b bVar) {
        o.e(bVar, "value");
        if (!bVar.a() || bVar.b()) {
            return true;
        }
        return false;
    }
}
