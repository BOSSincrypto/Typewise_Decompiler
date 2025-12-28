package androidx.work;

import androidx.work.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class OverwritingInputMerger extends i {
    public e b(List list) {
        e.a aVar = new e.a();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.putAll(((e) it.next()).h());
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}
