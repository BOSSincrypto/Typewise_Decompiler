package j0;

import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.m;
import i0.C0678b;
import k0.C0700h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l0.v;

public final class e extends C0686c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f13744f = new a((i) null);

    /* renamed from: g  reason: collision with root package name */
    private static final String f13745g;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    static {
        String i4 = m.i("NetworkMeteredCtrlr");
        o.d(i4, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f13745g = i4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(C0700h hVar) {
        super(hVar);
        o.e(hVar, "tracker");
    }

    public boolean b(v vVar) {
        o.e(vVar, "workSpec");
        if (vVar.f14479j.d() == NetworkType.METERED) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean c(C0678b bVar) {
        o.e(bVar, "value");
        if (Build.VERSION.SDK_INT < 26) {
            m.e().a(f13745g, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (bVar.a()) {
                return false;
            }
        } else if (bVar.a() && bVar.b()) {
            return false;
        }
        return true;
    }
}
