package K0;

import androidx.recyclerview.widget.h;
import ch.icoaching.wrio.appnomix.data.network.suggestions.ProductSuggestion;
import kotlin.jvm.internal.o;

public final class d extends h.f {
    public final boolean a(Object obj, Object obj2) {
        ProductSuggestion productSuggestion = (ProductSuggestion) obj;
        ProductSuggestion productSuggestion2 = (ProductSuggestion) obj2;
        o.e(productSuggestion, "oldItem");
        o.e(productSuggestion2, "newItem");
        return o.a(productSuggestion, productSuggestion2);
    }

    public final boolean b(Object obj, Object obj2) {
        ProductSuggestion productSuggestion = (ProductSuggestion) obj;
        ProductSuggestion productSuggestion2 = (ProductSuggestion) obj2;
        o.e(productSuggestion, "oldItem");
        o.e(productSuggestion2, "newItem");
        return o.a(productSuggestion, productSuggestion2);
    }
}
