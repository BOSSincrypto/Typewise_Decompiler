package K0;

import H0.e;
import H0.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.a;
import androidx.core.widget.NestedScrollView;
import ch.icoaching.wrio.appnomix.ui.search.ProductSuggestionsView;
import ch.icoaching.wrio.appnomix.ui.search.SearchSuggestionsView;
import java.util.List;
import kotlin.jvm.internal.o;
import u2.l;

public final class c extends NestedScrollView {

    /* renamed from: E  reason: collision with root package name */
    private int f784E;

    /* renamed from: F  reason: collision with root package name */
    private SearchSuggestionsView f785F;

    /* renamed from: G  reason: collision with root package name */
    private ProductSuggestionsView f786G;

    /* renamed from: H  reason: collision with root package name */
    private TextView f787H;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    public final void Z() {
        View.inflate(getContext(), f.search_view, this);
        setBackgroundColor(a.b(getContext(), H0.c.interception_view_background));
        this.f785F = (SearchSuggestionsView) findViewById(e.search_suggestions);
        this.f786G = (ProductSuggestionsView) findViewById(e.product_suggestions);
        this.f787H = (TextView) findViewById(e.tv_attribution);
    }

    public final void a0(List list) {
        o.e(list, "productSuggestions");
        ProductSuggestionsView productSuggestionsView = this.f786G;
        TextView textView = null;
        if (productSuggestionsView == null) {
            o.p("productSuggestionsView");
            productSuggestionsView = null;
        }
        productSuggestionsView.getClass();
        o.e(list, "productSuggestionsList");
        g gVar = productSuggestionsView.f9264A;
        if (gVar == null) {
            o.p("productSuggestionsAdapter");
            gVar = null;
        }
        gVar.C(list);
        if (!list.isEmpty()) {
            TextView textView2 = this.f787H;
            if (textView2 == null) {
                o.p("tvAttribution");
            } else {
                textView = textView2;
            }
            textView.setVisibility(0);
            return;
        }
        TextView textView3 = this.f787H;
        if (textView3 == null) {
            o.p("tvAttribution");
        } else {
            textView = textView3;
        }
        textView.setVisibility(8);
    }

    public final void b0(List list) {
        o.e(list, "searchSuggestions");
        SearchSuggestionsView searchSuggestionsView = this.f785F;
        k kVar = null;
        if (searchSuggestionsView == null) {
            o.p("searchSuggestionsView");
            searchSuggestionsView = null;
        }
        searchSuggestionsView.getClass();
        o.e(list, "suggestionsList");
        k kVar2 = searchSuggestionsView.f9267A;
        if (kVar2 == null) {
            o.p("suggestionsAdapter");
        } else {
            kVar = kVar2;
        }
        kVar.C(list);
    }

    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f784E != 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(i4), this.f784E);
        }
    }

    public final void setOnProductSuggestionsClicked(l lVar) {
        o.e(lVar, "onProductSuggestionClicked");
        ProductSuggestionsView productSuggestionsView = this.f786G;
        if (productSuggestionsView == null) {
            o.p("productSuggestionsView");
            productSuggestionsView = null;
        }
        productSuggestionsView.setOnProductSuggestionClicked(lVar);
    }

    public final void setOnSearchSuggestionsClicked(l lVar) {
        o.e(lVar, "onSuggestionClicked");
        SearchSuggestionsView searchSuggestionsView = this.f785F;
        if (searchSuggestionsView == null) {
            o.p("searchSuggestionsView");
            searchSuggestionsView = null;
        }
        searchSuggestionsView.setOnSearchSuggestionClicked(lVar);
    }

    public final void setSearchViewHeight(int i4) {
        this.f784E = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
    }
}
