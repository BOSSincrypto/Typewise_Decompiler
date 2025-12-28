package ch.icoaching.wrio.appnomix.ui.search;

import H0.e;
import H0.f;
import K0.b;
import K0.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.icoaching.wrio.appnomix.data.network.suggestions.SearchSuggestion;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import l2.q;
import u2.l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ!\u0010\u000f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lch/icoaching/wrio/appnomix/ui/search/SearchSuggestionsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Lch/icoaching/wrio/appnomix/data/network/suggestions/SearchSuggestion;", "Ll2/q;", "onSuggestionClicked", "setOnSearchSuggestionClicked", "(Lu2/l;)V", "typewise-sdk-appnomix-2.4.40(219)_remoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SearchSuggestionsView extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    public k f9267A;

    /* renamed from: y  reason: collision with root package name */
    public l f9268y;

    /* renamed from: z  reason: collision with root package name */
    public RecyclerView f9269z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SearchSuggestionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    public static final q B(SearchSuggestionsView searchSuggestionsView, SearchSuggestion searchSuggestion) {
        o.e(searchSuggestion, "suggestion");
        l lVar = searchSuggestionsView.f9268y;
        if (lVar != null) {
            lVar.invoke(searchSuggestion);
        }
        return q.f14567a;
    }

    public final void C() {
        View.inflate(getContext(), f.search_suggestions_view, this);
        this.f9269z = (RecyclerView) findViewById(e.rv_suggestions_list);
        this.f9267A = new k(new b(this));
        RecyclerView recyclerView = this.f9269z;
        k kVar = null;
        if (recyclerView == null) {
            o.p("suggestionsList");
            recyclerView = null;
        }
        k kVar2 = this.f9267A;
        if (kVar2 == null) {
            o.p("suggestionsAdapter");
        } else {
            kVar = kVar2;
        }
        recyclerView.setAdapter(kVar);
    }

    public final void setOnSearchSuggestionClicked(l lVar) {
        o.e(lVar, "onSuggestionClicked");
        this.f9268y = lVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchSuggestionsView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        C();
    }
}
