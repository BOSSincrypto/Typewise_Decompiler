package ch.icoaching.typewise.word_lists;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "ch.icoaching.typewise.word_lists.DBSupportedWordListDataLoader", f = "DBSupportedWordListDataLoader.kt", l = {42}, m = "loadWordList")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class DBSupportedWordListDataLoader$loadWordList$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f8885a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f8886b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DBSupportedWordListDataLoader f8887c;

    /* renamed from: d  reason: collision with root package name */
    int f8888d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DBSupportedWordListDataLoader$loadWordList$1(DBSupportedWordListDataLoader dBSupportedWordListDataLoader, c cVar) {
        super(cVar);
        this.f8887c = dBSupportedWordListDataLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.f8886b = obj;
        this.f8888d |= Integer.MIN_VALUE;
        return this.f8887c.a((e) null, this);
    }
}
