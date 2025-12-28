package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.j;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Set;

abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f4848a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f4849b = new Object();

    static Bundle a(j.a aVar) {
        int i4;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat d4 = aVar.d();
        if (d4 != null) {
            i4 = d4.d();
        } else {
            i4 = 0;
        }
        bundle2.putInt("icon", i4);
        bundle2.putCharSequence("title", aVar.h());
        bundle2.putParcelable("actionIntent", aVar.a());
        if (aVar.c() != null) {
            bundle = new Bundle(aVar.c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle2.putBoolean("showsUserInterface", aVar.g());
        bundle2.putInt("semanticAction", aVar.f());
        return bundle2;
    }

    private static Bundle b(o oVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", oVar.i());
        bundle.putCharSequence("label", oVar.h());
        bundle.putCharSequenceArray("choices", oVar.e());
        bundle.putBoolean("allowFreeFormInput", oVar.c());
        bundle.putBundle("extras", oVar.g());
        Set<String> d4 = oVar.d();
        if (d4 != null && !d4.isEmpty()) {
            ArrayList arrayList = new ArrayList(d4.size());
            for (String add : d4) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(o[] oVarArr) {
        if (oVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[oVarArr.length];
        for (int i4 = 0; i4 < oVarArr.length; i4++) {
            bundleArr[i4] = b(oVarArr[i4]);
        }
        return bundleArr;
    }
}
