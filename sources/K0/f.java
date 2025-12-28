package K0;

import H0.c;
import H0.e;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import ch.icoaching.wrio.appnomix.data.network.suggestions.ProductSuggestion;
import com.bumptech.glide.b;
import java.text.NumberFormat;
import java.util.Currency;
import kotlin.jvm.internal.o;
import u2.l;

public final class f extends RecyclerView.D {

    /* renamed from: A  reason: collision with root package name */
    public final View f790A;

    /* renamed from: u  reason: collision with root package name */
    public final View f791u;

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f792v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f793w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f794x;

    /* renamed from: y  reason: collision with root package name */
    public final TextView f795y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f796z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view) {
        super(view);
        o.e(view, "view");
        this.f791u = view;
        View findViewById = view.findViewById(e.img_product);
        o.d(findViewById, "findViewById(...)");
        this.f792v = (ImageView) findViewById;
        View findViewById2 = view.findViewById(e.tv_product_title);
        o.d(findViewById2, "findViewById(...)");
        this.f793w = (TextView) findViewById2;
        View findViewById3 = view.findViewById(e.tv_discounted_price);
        o.d(findViewById3, "findViewById(...)");
        this.f794x = (TextView) findViewById3;
        View findViewById4 = view.findViewById(e.tv_original_price);
        o.d(findViewById4, "findViewById(...)");
        this.f795y = (TextView) findViewById4;
        View findViewById5 = view.findViewById(e.img_prime_eligible);
        o.d(findViewById5, "findViewById(...)");
        this.f796z = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(e.v_line);
        o.d(findViewById6, "findViewById(...)");
        this.f790A = findViewById6;
    }

    public static final void N(l lVar, ProductSuggestion productSuggestion, View view) {
        lVar.invoke(productSuggestion.getProductUrl());
    }

    public final void M(ProductSuggestion productSuggestion, boolean z3, l lVar) {
        boolean z4;
        o.e(productSuggestion, "productSuggestion");
        o.e(lVar, "onProductSuggestionClick");
        try {
            b.u(this.f791u).s(productSuggestion.getImageUrl()).t0(this.f792v);
        } catch (Exception unused) {
        }
        this.f793w.setText(productSuggestion.getName());
        Currency instance = Currency.getInstance(productSuggestion.getCurrencyCode());
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setMaximumFractionDigits(2);
        if (instance != null) {
            currencyInstance.setCurrency(instance);
        }
        int i4 = 8;
        if (productSuggestion.getOriginalPrice() != null) {
            this.f795y.setText(currencyInstance.format(productSuggestion.getPrice()));
            TextView textView = this.f795y;
            textView.setPaintFlags(textView.getPaintFlags() | 16);
            z4 = true;
        } else {
            this.f795y.setVisibility(8);
            z4 = false;
        }
        if (productSuggestion.getPrice() != null) {
            this.f794x.setVisibility(0);
            this.f794x.setText(currencyInstance.format(productSuggestion.getPrice()));
            if (z4) {
                this.f794x.setTextColor(a.b(this.f791u.getContext(), c.product_discounted_price_color));
            } else {
                this.f794x.setTextColor(a.b(this.f791u.getContext(), c.product_regular_price_color));
            }
        } else {
            this.f794x.setVisibility(8);
        }
        if (productSuggestion.isPrimeEligible()) {
            this.f796z.setVisibility(0);
        } else {
            this.f796z.setVisibility(8);
        }
        View view = this.f790A;
        if (!z3) {
            i4 = 0;
        }
        view.setVisibility(i4);
        this.f791u.setOnClickListener(new e(lVar, productSuggestion));
    }
}
