package ch.icoaching.wrio.keyboard;

import ch.icoaching.wrio.keyboard.model.config.Emoji;
import ch.icoaching.wrio.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.keyboard.RecentEmojiStore$save$2", f = "RecentEmojiStore.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class RecentEmojiStore$save$2 extends SuspendLambda implements p {
    final /* synthetic */ List<Emoji> $emojis;
    int label;
    final /* synthetic */ RecentEmojiStore this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RecentEmojiStore$save$2(RecentEmojiStore recentEmojiStore, List<Emoji> list, c<? super RecentEmojiStore$save$2> cVar) {
        super(2, cVar);
        this.this$0 = recentEmojiStore;
        this.$emojis = list;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new RecentEmojiStore$save$2(this.this$0, this.$emojis, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a.f();
        if (this.label == 0) {
            f.b(obj);
            List a4 = this.this$0.f9971a.f7498h.a();
            ArrayList arrayList = new ArrayList();
            for (Emoji emoji : this.$emojis) {
                Iterator it = a4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (o.a(((Pair) obj2).first, emoji)) {
                        break;
                    }
                }
                Pair pair = (Pair) obj2;
                if (pair == null) {
                    arrayList.add(new Pair(emoji, kotlin.coroutines.jvm.internal.a.d(1)));
                } else {
                    arrayList.add(new Pair(pair.first, kotlin.coroutines.jvm.internal.a.d(((Number) pair.second).intValue() + 1)));
                }
            }
            this.this$0.f9971a.f7498h.g(arrayList);
            return q.f14567a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((RecentEmojiStore$save$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
