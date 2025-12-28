package K0;

import H0.e;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.icoaching.wrio.appnomix.data.network.suggestions.SearchSuggestion;
import kotlin.jvm.internal.o;
import u2.l;

public final class j extends RecyclerView.D {

    /* renamed from: u  reason: collision with root package name */
    public final View f800u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f801v;

    /* renamed from: w  reason: collision with root package name */
    public final View f802w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(View view) {
        super(view);
        o.e(view, "view");
        this.f800u = view;
        View findViewById = view.findViewById(e.tv_search_suggestion);
        o.d(findViewById, "findViewById(...)");
        this.f801v = (TextView) findViewById;
        View findViewById2 = view.findViewById(e.v_line);
        o.d(findViewById2, "findViewById(...)");
        this.f802w = findViewById2;
    }

    public static final void N(l lVar, SearchSuggestion searchSuggestion, View view) {
        lVar.invoke(searchSuggestion);
    }

    public final void M(SearchSuggestion searchSuggestion, boolean z3, l lVar) {
        int i4;
        o.e(searchSuggestion, "suggestion");
        o.e(lVar, "onSuggestionClicked");
        this.f801v.setText(searchSuggestion.getSuggestionText());
        View view = this.f802w;
        if (!z3) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view.setVisibility(i4);
        this.f800u.setOnClickListener(new i(lVar, searchSuggestion));
    }
}
