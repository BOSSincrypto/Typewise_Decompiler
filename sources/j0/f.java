package j0;

import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.m;
import i0.C0678b;
import k0.C0700h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l0.v;

public final class f extends C0686c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f13746f = new a((i) null);

    /* renamed from: g  reason: collision with root package name */
    private static final String f13747g;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    static {
        String i4 = m.i("NetworkNotRoamingCtrlr");
        o.d(i4, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        f13747g = i4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(C0700h hVar) {
        super(hVar);
        o.e(hVar, "tracker");
    }

    public boolean b(v vVar) {
        o.e(vVar, "workSpec");
        if (vVar.f14479j.d() == NetworkType.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean c(C0678b bVar) {
        o.e(bVar, "value");
        if (Build.VERSION.SDK_INT < 24) {
            m.e().a(f13747g, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
            if (bVar.a()) {
                return false;
            }
        } else if (bVar.a() && bVar.c()) {
            return false;
        }
        return true;
    }
}
