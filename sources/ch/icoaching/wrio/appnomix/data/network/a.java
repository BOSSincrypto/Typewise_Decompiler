package ch.icoaching.wrio.appnomix.data.network;

import ch.icoaching.wrio.appnomix.data.network.suggestions.ProductSuggestion;
import ch.icoaching.wrio.appnomix.data.network.suggestions.SearchSuggestion;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import l3.f;
import l3.t;
import retrofit2.J;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JD\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJD\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lch/icoaching/wrio/appnomix/data/network/a;", "", "", "query", "campaignId", "userId", "sessionId", "Lretrofit2/J;", "", "Lch/icoaching/wrio/appnomix/data/network/suggestions/SearchSuggestion;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lch/icoaching/wrio/appnomix/data/network/suggestions/ProductSuggestion;", "b", "typewise-sdk-appnomix-2.4.40(219)_remoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {
    @f("api/v1/product/search_suggest")
    Object a(@t("q") String str, @t("campaign_id") String str2, @t("ec") String str3, @t("es") String str4, c<? super J<List<SearchSuggestion>>> cVar);

    @f("api/v1/product/search")
    Object b(@t("q") String str, @t("campaign_id") String str2, @t("ec") String str3, @t("es") String str4, c<? super J<List<ProductSuggestion>>> cVar);
}
