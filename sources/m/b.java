package m;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.g;
import m.C0796a;
import z2.d;

public final class b extends C0796a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14569a = new a((i) null);

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final Intent a(String[] strArr) {
            o.e(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            o.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }

        private a() {
        }
    }

    /* renamed from: d */
    public Intent a(Context context, String[] strArr) {
        o.e(context, "context");
        o.e(strArr, "input");
        return f14569a.a(strArr);
    }

    /* renamed from: e */
    public C0796a.C0206a b(Context context, String[] strArr) {
        o.e(context, "context");
        o.e(strArr, "input");
        if (strArr.length == 0) {
            return new C0796a.C0206a(D.h());
        }
        for (String a4 : strArr) {
            if (androidx.core.content.a.a(context, a4) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d.b(D.e(strArr.length), 16));
        for (String a5 : strArr) {
            Pair a6 = g.a(a5, Boolean.TRUE);
            linkedHashMap.put(a6.getFirst(), a6.getSecond());
        }
        return new C0796a.C0206a(linkedHashMap);
    }

    /* renamed from: f */
    public Map c(int i4, Intent intent) {
        boolean z3;
        if (i4 != -1) {
            return D.h();
        }
        if (intent == null) {
            return D.h();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return D.h();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i5 : intArrayExtra) {
            if (i5 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            arrayList.add(Boolean.valueOf(z3));
        }
        return D.o(C0718m.J0(C0713h.x(stringArrayExtra), arrayList));
    }
}
