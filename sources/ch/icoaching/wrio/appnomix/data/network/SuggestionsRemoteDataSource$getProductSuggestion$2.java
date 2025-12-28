package ch.icoaching.wrio.appnomix.data.network;

import ch.icoaching.wrio.appnomix.data.network.suggestions.ProductSuggestion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import l2.q;
import retrofit2.J;
import u2.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/D;", "", "Lch/icoaching/wrio/appnomix/data/network/suggestions/ProductSuggestion;", "<anonymous>", "(Lkotlinx/coroutines/D;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@d(c = "ch.icoaching.wrio.appnomix.data.network.SuggestionsRemoteDataSource$getProductSuggestion$2", f = "SuggestionsRemoteDataSource.kt", l = {59}, m = "invokeSuspend")
final class SuggestionsRemoteDataSource$getProductSuggestion$2 extends SuspendLambda implements p {
    final /* synthetic */ String $query;
    int label;
    final /* synthetic */ g this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestionsRemoteDataSource$getProductSuggestion$2(g gVar, String str, c<? super SuggestionsRemoteDataSource$getProductSuggestion$2> cVar) {
        super(2, cVar);
        this.this$0 = gVar;
        this.$query = str;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new SuggestionsRemoteDataSource$getProductSuggestion$2(this.this$0, this.$query, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        List j4;
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            a aVar = this.this$0.f9253a;
            String str = this.$query;
            String a4 = I0.a.f579a.a();
            g gVar = this.this$0;
            String str2 = gVar.f9254b;
            String str3 = gVar.f9255c;
            this.label = 1;
            obj = aVar.b(str, a4, str2, str3, this);
            if (obj == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            try {
                f.b(obj);
            } catch (Exception unused) {
                return C0718m.j();
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        J j5 = (J) obj;
        if (j5.e()) {
            Collection collection = (Collection) j5.a();
            if (collection != null) {
                if (!collection.isEmpty()) {
                    Object a5 = j5.a();
                    o.b(a5);
                    ArrayList arrayList = new ArrayList();
                    for (Object next : (Iterable) a5) {
                        ProductSuggestion productSuggestion = (ProductSuggestion) next;
                        if (productSuggestion.getCurrencyCode() != null && ((productSuggestion.getOriginalPrice() != null && productSuggestion.getOriginalPrice().floatValue() > 0.0f) || (productSuggestion.getPrice() != null && productSuggestion.getPrice().floatValue() > 0.0f))) {
                            arrayList.add(next);
                        }
                    }
                    return arrayList;
                }
            }
            j4 = C0718m.j();
        } else {
            j4 = C0718m.j();
        }
        return j4;
    }

    public final Object invoke(D d4, c<? super List<ProductSuggestion>> cVar) {
        return ((SuggestionsRemoteDataSource$getProductSuggestion$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
