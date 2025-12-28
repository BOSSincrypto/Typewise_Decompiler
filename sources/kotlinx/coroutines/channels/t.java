package kotlinx.coroutines.channels;

import kotlin.coroutines.c;
import u2.l;

public interface t {

    public static final class a {
        public static /* synthetic */ boolean a(t tVar, Throwable th, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    th = null;
                }
                return tVar.d(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    boolean d(Throwable th);

    Object k(Object obj);

    Object n(Object obj, c cVar);

    boolean r();

    void s(l lVar);
}
