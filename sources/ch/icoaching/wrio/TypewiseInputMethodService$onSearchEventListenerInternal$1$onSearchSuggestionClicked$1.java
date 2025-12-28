package ch.icoaching.wrio;

import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import ch.icoaching.wrio.appnomix.data.network.suggestions.SearchSuggestion;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.TypewiseInputMethodService$onSearchEventListenerInternal$1$onSearchSuggestionClicked$1", f = "TypewiseInputMethodService.kt", l = {82}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class TypewiseInputMethodService$onSearchEventListenerInternal$1$onSearchSuggestionClicked$1 extends SuspendLambda implements p {
    final /* synthetic */ SearchSuggestion $suggestion;
    int label;
    final /* synthetic */ TypewiseInputMethodService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TypewiseInputMethodService$onSearchEventListenerInternal$1$onSearchSuggestionClicked$1(SearchSuggestion searchSuggestion, TypewiseInputMethodService typewiseInputMethodService, c<? super TypewiseInputMethodService$onSearchEventListenerInternal$1$onSearchSuggestionClicked$1> cVar) {
        super(2, cVar);
        this.$suggestion = searchSuggestion;
        this.this$0 = typewiseInputMethodService;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new TypewiseInputMethodService$onSearchEventListenerInternal$1$onSearchSuggestionClicked$1(this.$suggestion, this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            if (this.$suggestion.getUrl() != null) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.$suggestion.getUrl()));
                intent.addFlags(268435456);
                this.this$0.startActivity(intent);
                return q.f14567a;
            }
            ch.icoaching.wrio.input.c k02 = this.this$0.k0();
            String suggestionText = this.$suggestion.getSuggestionText();
            this.label = 1;
            if (k02.y(suggestionText, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.k0().o(10, (PointF) null);
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((TypewiseInputMethodService$onSearchEventListenerInternal$1$onSearchSuggestionClicked$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
