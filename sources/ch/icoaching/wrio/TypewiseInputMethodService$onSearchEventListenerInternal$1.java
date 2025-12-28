package ch.icoaching.wrio;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import ch.icoaching.wrio.appnomix.controller.SearchController;
import ch.icoaching.wrio.appnomix.data.network.suggestions.SearchSuggestion;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g0;

public final class TypewiseInputMethodService$onSearchEventListenerInternal$1 implements SearchController.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TypewiseInputMethodService f9078a;

    TypewiseInputMethodService$onSearchEventListenerInternal$1(TypewiseInputMethodService typewiseInputMethodService) {
        this.f9078a = typewiseInputMethodService;
    }

    public void a() {
        SearchController b12 = this.f9078a.f9064r0;
        if (b12 == null) {
            o.p("searchController");
            b12 = null;
        }
        if (b12.p()) {
            this.f9078a.j1();
            SearchController b13 = this.f9078a.f9064r0;
            if (b13 == null) {
                o.p("searchController");
                b13 = null;
            }
            SearchController.s(b13, false, 1, (Object) null);
        }
    }

    public void b() {
        TypewiseInputMethodService typewiseInputMethodService = this.f9078a;
        SearchController b12 = typewiseInputMethodService.f9064r0;
        if (b12 == null) {
            o.p("searchController");
            b12 = null;
        }
        LayoutInflater layoutInflater = this.f9078a.getLayoutInflater();
        o.d(layoutInflater, "getLayoutInflater(...)");
        typewiseInputMethodService.t1(b12.n(layoutInflater));
    }

    public void c(String str, String str2) {
        o.e(str, "suggestionUrl");
        o.e(str2, "currentBrowserPackageName");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setPackage(str2);
        intent.setFlags(268435456);
        if (intent.resolveActivity(this.f9078a.getPackageManager()) != null) {
            this.f9078a.startActivity(intent);
            return;
        }
        intent.setPackage((String) null);
        this.f9078a.startActivity(intent);
    }

    public void d(SearchSuggestion searchSuggestion) {
        o.e(searchSuggestion, "suggestion");
        g0 unused = C0739h.d(this.f9078a.u0(), (CoroutineContext) null, (CoroutineStart) null, new TypewiseInputMethodService$onSearchEventListenerInternal$1$onSearchSuggestionClicked$1(searchSuggestion, this.f9078a, (c<? super TypewiseInputMethodService$onSearchEventListenerInternal$1$onSearchSuggestionClicked$1>) null), 3, (Object) null);
    }
}
