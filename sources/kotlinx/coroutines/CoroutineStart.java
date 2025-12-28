package kotlinx.coroutines;

import E2.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.c;
import kotlin.coroutines.e;
import u2.l;
import u2.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00042\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJY\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u00042\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118FX\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "<init>", "(Ljava/lang/String;I)V", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "", "block", "completion", "Ll2/q;", "invoke", "(Lu2/l;Lkotlin/coroutines/c;)V", "R", "Lkotlin/Function2;", "receiver", "(Lu2/p;Ljava/lang/Object;Lkotlin/coroutines/c;)V", "", "isLazy", "()Z", "isLazy$annotations", "()V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13991a = null;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            iArr[CoroutineStart.LAZY.ordinal()] = 4;
            f13991a = iArr;
        }
    }

    public final <T> void invoke(l lVar, c<? super T> cVar) {
        int i4 = a.f13991a[ordinal()];
        if (i4 == 1) {
            E2.a.c(lVar, cVar);
        } else if (i4 == 2) {
            e.a(lVar, cVar);
        } else if (i4 == 3) {
            b.a(lVar, cVar);
        } else if (i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }

    public final <R, T> void invoke(p pVar, R r4, c<? super T> cVar) {
        int i4 = a.f13991a[ordinal()];
        if (i4 == 1) {
            E2.a.e(pVar, r4, cVar, (l) null, 4, (Object) null);
        } else if (i4 == 2) {
            e.b(pVar, r4, cVar);
        } else if (i4 == 3) {
            b.b(pVar, r4, cVar);
        } else if (i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
