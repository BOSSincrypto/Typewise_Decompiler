package ch.icoaching.typewise.language_modelling.inference.beam_search;

import ch.icoaching.typewise.language_modelling.inference.beam_search.BeamSearcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

public final class c extends d {

    /* renamed from: c  reason: collision with root package name */
    private final float f8453c;

    public c(float f4) {
        this.f8453c = f4;
    }

    public List c(List list, Float f4) {
        o.e(list, "completedBeams");
        float floatValue = f4 != null ? f4.floatValue() : this.f8453c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BeamSearcher.b bVar = (BeamSearcher.b) it.next();
            arrayList.add(BeamSearcher.b.a(bVar, (String) null, (List) null, 0.0f, 0, Float.valueOf(bVar.c().length() == 0 ? 0.0f : bVar.e() * ((float) Math.pow((double) ((float) bVar.c().length()), (double) floatValue))), 15, (Object) null));
        }
        return arrayList;
    }
}
