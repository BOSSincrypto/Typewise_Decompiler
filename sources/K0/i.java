package K0;

import android.view.View;
import ch.icoaching.wrio.appnomix.data.network.suggestions.SearchSuggestion;
import u2.l;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f798a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SearchSuggestion f799b;

    public /* synthetic */ i(l lVar, SearchSuggestion searchSuggestion) {
        this.f798a = lVar;
        this.f799b = searchSuggestion;
    }

    public final void onClick(View view) {
        j.N(this.f798a, this.f799b, view);
    }
}
