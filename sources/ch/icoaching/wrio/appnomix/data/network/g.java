package ch.icoaching.wrio.appnomix.data.network;

import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.P;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final a f9253a;

    /* renamed from: b  reason: collision with root package name */
    public String f9254b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f9255c = "";

    public g(a aVar) {
        o.e(aVar, "appnomixApiService");
        this.f9253a = aVar;
    }

    public final Object a(String str, c cVar) {
        return C0738g.e(P.b(), new SuggestionsRemoteDataSource$getProductSuggestion$2(this, str, (c<? super SuggestionsRemoteDataSource$getProductSuggestion$2>) null), cVar);
    }

    public final Object b(String str, c cVar) {
        return C0738g.e(P.b(), new SuggestionsRemoteDataSource$getSearchSuggestion$2(this, str, (c<? super SuggestionsRemoteDataSource$getSearchSuggestion$2>) null), cVar);
    }
}
