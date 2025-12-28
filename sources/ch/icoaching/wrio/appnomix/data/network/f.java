package ch.icoaching.wrio.appnomix.data.network;

import ch.icoaching.wrio.appnomix.data.network.suggestions.SearchSuggestion;
import java.util.Comparator;
import n2.C0830a;

public final class f implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return C0830a.a(Integer.valueOf(((SearchSuggestion) obj).getSuggestionRank()), Integer.valueOf(((SearchSuggestion) obj2).getSuggestionRank()));
    }
}
