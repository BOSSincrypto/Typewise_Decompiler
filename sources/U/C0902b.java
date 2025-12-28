package u;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u.C0901a;

/* renamed from: u.b  reason: case insensitive filesystem */
public abstract class C0902b {
    public static boolean a(String str) {
        return C0901a.a().contains(str);
    }

    public static void b(List list, Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0901a.C0244a aVar = (C0901a.C0244a) it.next();
            String b4 = aVar.b();
            arrayList.add(aVar.b());
            bundle.putBundle(b4, aVar.a());
        }
        bundle.putStringArrayList("androidx.autofill.inline.ui.version:key", arrayList);
    }
}
