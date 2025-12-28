package K0;

import H0.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import ch.icoaching.wrio.appnomix.data.network.suggestions.ProductSuggestion;
import kotlin.jvm.internal.o;
import u2.l;

public final class g extends m {

    /* renamed from: f  reason: collision with root package name */
    public final l f797f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(l lVar) {
        super(new d());
        o.e(lVar, "onProductSuggestionClicked");
        this.f797f = lVar;
    }

    public final void o(RecyclerView.D d4, int i4) {
        o.e(d4, "holder");
        if (d4 instanceof f) {
            ProductSuggestion productSuggestion = (ProductSuggestion) A(i4);
            f fVar = (f) d4;
            o.b(productSuggestion);
            boolean z3 = true;
            if (i4 != d() - 1) {
                z3 = false;
            }
            fVar.M(productSuggestion, z3, this.f797f);
            return;
        }
        throw new IllegalArgumentException("Unknown view holder type");
    }

    public final RecyclerView.D q(ViewGroup viewGroup, int i4) {
        o.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(f.product_suggestion_item, viewGroup, false);
        o.b(inflate);
        return new f(inflate);
    }
}
