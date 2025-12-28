package ch.icoaching.wrio.appnomix.data.network;

import ch.icoaching.wrio.appnomix.data.network.model.AppnomixAnalyticsEvent;
import kotlin.Metadata;
import kotlin.coroutines.c;
import l2.q;
import l3.a;
import l3.o;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lch/icoaching/wrio/appnomix/data/network/d;", "", "Lch/icoaching/wrio/appnomix/data/network/model/AppnomixAnalyticsEvent;", "eventBody", "Ll2/q;", "a", "(Lch/icoaching/wrio/appnomix/data/network/model/AppnomixAnalyticsEvent;Lkotlin/coroutines/c;)Ljava/lang/Object;", "typewise-sdk-appnomix-2.4.40(219)_remoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface d {
    @o("v1/analytics/events")
    Object a(@a AppnomixAnalyticsEvent appnomixAnalyticsEvent, c<? super q> cVar);
}
