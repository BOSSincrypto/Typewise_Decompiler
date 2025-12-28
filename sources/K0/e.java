package K0;

import android.view.View;
import ch.icoaching.wrio.appnomix.data.network.suggestions.ProductSuggestion;
import u2.l;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f788a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ProductSuggestion f789b;

    public /* synthetic */ e(l lVar, ProductSuggestion productSuggestion) {
        this.f788a = lVar;
        this.f789b = productSuggestion;
    }

    public final void onClick(View view) {
        f.N(this.f788a, this.f789b, view);
    }
}
