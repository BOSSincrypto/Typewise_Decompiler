package j0;

import android.os.Build;
import androidx.work.NetworkType;
import i0.C0678b;
import k0.C0700h;
import kotlin.jvm.internal.o;
import l0.v;

public final class d extends C0686c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(C0700h hVar) {
        super(hVar);
        o.e(hVar, "tracker");
    }

    public boolean b(v vVar) {
        o.e(vVar, "workSpec");
        if (vVar.f14479j.d() == NetworkType.CONNECTED) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean c(C0678b bVar) {
        o.e(bVar, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            if (!bVar.a() || !bVar.d()) {
                return true;
            }
        } else if (!bVar.a()) {
            return true;
        }
        return false;
    }
}
