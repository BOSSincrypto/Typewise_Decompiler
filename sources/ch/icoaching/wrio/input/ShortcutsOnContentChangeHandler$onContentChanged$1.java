package ch.icoaching.wrio.input;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.wrio.input.ShortcutsOnContentChangeHandler", f = "ShortcutsOnContentChangeHandler.kt", l = {32, 43, 55, 66, 70}, m = "onContentChanged")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ShortcutsOnContentChangeHandler$onContentChanged$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShortcutsOnContentChangeHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ShortcutsOnContentChangeHandler$onContentChanged$1(ShortcutsOnContentChangeHandler shortcutsOnContentChangeHandler, c<? super ShortcutsOnContentChangeHandler$onContentChanged$1> cVar) {
        super(cVar);
        this.this$0 = shortcutsOnContentChangeHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b((l) null, this);
    }
}
