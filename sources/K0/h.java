package K0;

import androidx.recyclerview.widget.h;
import ch.icoaching.wrio.appnomix.data.network.suggestions.SearchSuggestion;
import kotlin.jvm.internal.o;

public final class h extends h.f {
    public final boolean a(Object obj, Object obj2) {
        SearchSuggestion searchSuggestion = (SearchSuggestion) obj;
        SearchSuggestion searchSuggestion2 = (SearchSuggestion) obj2;
        o.e(searchSuggestion, "oldItem");
        o.e(searchSuggestion2, "newItem");
        return o.a(searchSuggestion, searchSuggestion2);
    }

    public final boolean b(Object obj, Object obj2) {
        SearchSuggestion searchSuggestion = (SearchSuggestion) obj;
        SearchSuggestion searchSuggestion2 = (SearchSuggestion) obj2;
        o.e(searchSuggestion, "oldItem");
        o.e(searchSuggestion2, "newItem");
        return o.a(searchSuggestion, searchSuggestion2);
    }
}
