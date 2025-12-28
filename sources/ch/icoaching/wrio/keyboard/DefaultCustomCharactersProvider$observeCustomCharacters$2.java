package ch.icoaching.wrio.keyboard;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.j;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.keyboard.DefaultCustomCharactersProvider$observeCustomCharacters$2", f = "DefaultCustomCharactersProvider.kt", l = {83, 88}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ll2/q;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultCustomCharactersProvider$observeCustomCharacters$2 extends SuspendLambda implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultCustomCharactersProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultCustomCharactersProvider$observeCustomCharacters$2(DefaultCustomCharactersProvider defaultCustomCharactersProvider, c<? super DefaultCustomCharactersProvider$observeCustomCharacters$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultCustomCharactersProvider;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        DefaultCustomCharactersProvider$observeCustomCharacters$2 defaultCustomCharactersProvider$observeCustomCharacters$2 = new DefaultCustomCharactersProvider$observeCustomCharacters$2(this.this$0, cVar);
        defaultCustomCharactersProvider$observeCustomCharacters$2.L$0 = obj;
        return defaultCustomCharactersProvider$observeCustomCharacters$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            String str = (String) this.L$0;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -507432542) {
                    if (hashCode != -440986443) {
                        if (hashCode == 489639811 && str.equals("split1_customcharacters")) {
                            DefaultCustomCharactersProvider defaultCustomCharactersProvider = this.this$0;
                            defaultCustomCharactersProvider.f9829g = defaultCustomCharactersProvider.f9824b.B0();
                            j h4 = this.this$0.f9827e;
                            Boolean a4 = kotlin.coroutines.jvm.internal.a.a(true);
                            this.label = 1;
                            if (h4.emit(a4, this) == f4) {
                                return f4;
                            }
                        }
                    } else if (str.equals("quickaccess_specialcharacters")) {
                        DefaultCustomCharactersProvider defaultCustomCharactersProvider2 = this.this$0;
                        defaultCustomCharactersProvider2.f9831i = defaultCustomCharactersProvider2.f9824b.e();
                    }
                } else if (str.equals("split2_customcharacters")) {
                    DefaultCustomCharactersProvider defaultCustomCharactersProvider3 = this.this$0;
                    defaultCustomCharactersProvider3.f9830h = defaultCustomCharactersProvider3.f9824b.g();
                    j h5 = this.this$0.f9827e;
                    Boolean a5 = kotlin.coroutines.jvm.internal.a.a(true);
                    this.label = 2;
                    if (h5.emit(a5, this) == f4) {
                        return f4;
                    }
                }
            }
        } else if (i4 == 1 || i4 == 2) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }

    public final Object invoke(String str, c<? super q> cVar) {
        return ((DefaultCustomCharactersProvider$observeCustomCharacters$2) create(str, cVar)).invokeSuspend(q.f14567a);
    }
}
