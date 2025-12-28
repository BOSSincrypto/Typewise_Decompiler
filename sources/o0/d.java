package o0;

import androidx.work.m;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import l0.C0782A;
import l0.i;
import l0.j;
import l0.v;
import l0.y;
import u2.l;

public abstract class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f15091a;

    static {
        String i4 = m.i("DiagnosticsWrkr");
        o.d(i4, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f15091a = i4;
    }

    private static final String c(v vVar, String str, Integer num, String str2) {
        return 10 + vVar.f14470a + "\t " + vVar.f14472c + "\t " + num + "\t " + vVar.f14471b.name() + "\t " + str + "\t " + str2 + 9;
    }

    /* access modifiers changed from: private */
    public static final String d(l0.o oVar, C0782A a4, j jVar, List list) {
        Integer num;
        StringBuilder sb = new StringBuilder();
        sb.append("\n Id \t Class Name\t " + "Job Id" + "\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            i c4 = jVar.c(y.a(vVar));
            if (c4 != null) {
                num = Integer.valueOf(c4.f14445c);
            } else {
                num = null;
            }
            sb.append(c(vVar, C0718m.Z(oVar.b(vVar.f14470a), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null), num, C0718m.Z(a4.d(vVar.f14470a), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null)));
        }
        String sb2 = sb.toString();
        o.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
