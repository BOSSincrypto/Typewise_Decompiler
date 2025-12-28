package ch.icoaching.wrio.util;

import android.database.sqlite.SQLiteDatabase;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.D;
import kotlinx.coroutines.P;
import l2.q;
import u2.p;

@d(c = "ch.icoaching.wrio.util.WordWithApostrophesReSetter$resetWordsWithApostrophes$1", f = "WordWithApostrophesReSetter.kt", l = {21}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
final class WordWithApostrophesReSetter$resetWordsWithApostrophes$1 extends SuspendLambda implements p {
    int label;
    final /* synthetic */ WordWithApostrophesReSetter this$0;

    @d(c = "ch.icoaching.wrio.util.WordWithApostrophesReSetter$resetWordsWithApostrophes$1$1", f = "WordWithApostrophesReSetter.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/D;", "Ll2/q;", "<anonymous>", "(Lkotlinx/coroutines/D;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ch.icoaching.wrio.util.WordWithApostrophesReSetter$resetWordsWithApostrophes$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements p {
        int label;

        public final c<q> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(wordWithApostrophesReSetter, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            q qVar;
            a.f();
            if (this.label == 0) {
                f.b(obj);
                SQLiteDatabase writableDatabase = wordWithApostrophesReSetter.f10690a.getWritableDatabase();
                Object obj2 = wordWithApostrophesReSetter.f10690a.f7503m;
                o.b(obj2);
                synchronized (obj2) {
                    try {
                        writableDatabase.beginTransactionNonExclusive();
                        writableDatabase.execSQL("UPDATE main_dictionary SET typedMixedCase = 0 WHERE word LIKE \"%'%\" AND (wordMixedCase = '' OR wordMixedCase is NULL)");
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        qVar = q.f14567a;
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                return qVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(D d4, c<? super q> cVar) {
            return ((AnonymousClass1) create(d4, cVar)).invokeSuspend(q.f14567a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WordWithApostrophesReSetter$resetWordsWithApostrophes$1(WordWithApostrophesReSetter wordWithApostrophesReSetter, c<? super WordWithApostrophesReSetter$resetWordsWithApostrophes$1> cVar) {
        super(2, cVar);
        this.this$0 = wordWithApostrophesReSetter;
    }

    public final c<q> create(Object obj, c<?> cVar) {
        return new WordWithApostrophesReSetter$resetWordsWithApostrophes$1(this.this$0, cVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object f4 = a.f();
        int i4 = this.label;
        if (i4 == 0) {
            f.b(obj);
            CoroutineDispatcher b4 = P.b();
            final WordWithApostrophesReSetter wordWithApostrophesReSetter = this.this$0;
            AnonymousClass1 r12 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            this.label = 1;
            if (C0738g.e(b4, r12, this) == f4) {
                return f4;
            }
        } else if (i4 == 1) {
            f.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return q.f14567a;
    }

    public final Object invoke(D d4, c<? super q> cVar) {
        return ((WordWithApostrophesReSetter$resetWordsWithApostrophes$1) create(d4, cVar)).invokeSuspend(q.f14567a);
    }
}
