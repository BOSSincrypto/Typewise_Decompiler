package ch.icoaching.wrio.appnomix.controller;

import ch.icoaching.wrio.appnomix.controller.SearchController;
import ch.icoaching.wrio.appnomix.data.network.suggestions.SearchSuggestion;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import l2.q;
import u2.l;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class SearchController$getSearchView$1 extends FunctionReferenceImpl implements l {
    public SearchController$getSearchView$1(Object obj) {
        super(1, obj, SearchController.a.class, "onSearchSuggestionClicked", "onSearchSuggestionClicked(Lch/icoaching/wrio/appnomix/data/network/suggestions/SearchSuggestion;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SearchSuggestion) obj);
        return q.f14567a;
    }

    public final void invoke(SearchSuggestion searchSuggestion) {
        o.e(searchSuggestion, "p0");
        ((SearchController.a) this.receiver).d(searchSuggestion);
    }
}
