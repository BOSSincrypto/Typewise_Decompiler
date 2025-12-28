package K0;

import H0.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import ch.icoaching.wrio.appnomix.data.network.suggestions.SearchSuggestion;
import kotlin.jvm.internal.o;
import u2.l;

public final class k extends m {

    /* renamed from: f  reason: collision with root package name */
    public final l f803f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(l lVar) {
        super(new h());
        o.e(lVar, "onSuggestionClicked");
        this.f803f = lVar;
    }

    public final void o(RecyclerView.D d4, int i4) {
        o.e(d4, "holder");
        if (d4 instanceof j) {
            SearchSuggestion searchSuggestion = (SearchSuggestion) A(i4);
            j jVar = (j) d4;
            o.b(searchSuggestion);
            boolean z3 = true;
            if (i4 != d() - 1) {
                z3 = false;
            }
            jVar.M(searchSuggestion, z3, this.f803f);
            return;
        }
        throw new IllegalArgumentException("Unknown view holder type");
    }

    public final RecyclerView.D q(ViewGroup viewGroup, int i4) {
        o.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(f.search_suggestion_item, viewGroup, false);
        o.b(inflate);
        return new j(inflate);
    }
}
