package ch.icoaching.typewise.language_modelling.inference.beam_search;

import ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

public final class b extends d {
    public List c(List list, Float f4) {
        o.e(list, "completedBeams");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BeamSearcher.b bVar = (BeamSearcher.b) it.next();
            arrayList.add(BeamSearcher.b.a(bVar, (String) null, (List) null, 0.0f, 0, Float.valueOf(bVar.e()), 15, (Object) null));
        }
        return arrayList;
    }
}
