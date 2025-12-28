package ch.icoaching.wrio.keyboard;

import ch.icoaching.wrio.keyboard.model.config.Emoji;
import ch.icoaching.wrio.util.Pair;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.D;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.keyboard.RecentEmojiStore$retrieve$2", f = "RecentEmojiStore.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/D;", "", "Lch/icoaching/wrio/keyboard/model/config/Emoji;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/D;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
final class RecentEmojiStore$retrieve$2 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ RecentEmojiStore this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RecentEmojiStore$retrieve$2(RecentEmojiStore recentEmojiStore, c<? super RecentEmojiStore$retrieve$2> cVar) {
        super(2, cVar);
        this.this$0 = recentEmojiStore;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new RecentEmojiStore$retrieve$2(this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        a.f();
        if (this.label == 0) {
            f.b(obj);
            List<Pair> a4 = this.this$0.f9971a.f7498h.a();
            ArrayList arrayList = new ArrayList(C0718m.t(a4, 10));
            for (Pair pair : a4) {
                arrayList.add((Emoji) pair.first);
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(D d4, c<? super List<Emoji>> cVar) {
        return ((RecentEmojiStore$retrieve$2) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
