package ch.icoaching.wrio.appnomix.ui.search;

import H0.e;
import H0.f;
import K0.a;
import K0.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import l2.q;
import u2.l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ!\u0010\u000f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lch/icoaching/wrio/appnomix/ui/search/ProductSuggestionsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "", "Ll2/q;", "onProductSuggestionClicked", "setOnProductSuggestionClicked", "(Lu2/l;)V", "typewise-sdk-appnomix-2.4.40(219)_remoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductSuggestionsView extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    public g f9264A;

    /* renamed from: y  reason: collision with root package name */
    public l f9265y;

    /* renamed from: z  reason: collision with root package name */
    public RecyclerView f9266z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProductSuggestionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    public static final q B(ProductSuggestionsView productSuggestionsView, String str) {
        o.e(str, "productUrl");
        l lVar = productSuggestionsView.f9265y;
        if (lVar != null) {
            lVar.invoke(str);
        }
        return q.f14567a;
    }

    public final void C() {
        View.inflate(getContext(), f.product_suggestion_view, this);
        this.f9266z = (RecyclerView) findViewById(e.rv_product_suggestions_list);
        this.f9264A = new g(new a(this));
        RecyclerView recyclerView = this.f9266z;
        g gVar = null;
        if (recyclerView == null) {
            o.p("productSuggestionsList");
            recyclerView = null;
        }
        g gVar2 = this.f9264A;
        if (gVar2 == null) {
            o.p("productSuggestionsAdapter");
        } else {
            gVar = gVar2;
        }
        recyclerView.setAdapter(gVar);
    }

    public final void setOnProductSuggestionClicked(l lVar) {
        o.e(lVar, "onProductSuggestionClicked");
        this.f9265y = lVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductSuggestionsView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        C();
    }
}
