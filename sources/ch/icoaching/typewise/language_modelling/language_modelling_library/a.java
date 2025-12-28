package ch.icoaching.typewise.language_modelling.language_modelling_library;

import kotlin.coroutines.c;

public interface a {

    /* renamed from: ch.icoaching.typewise.language_modelling.language_modelling_library.a$a  reason: collision with other inner class name */
    public static final class C0144a {
        public static /* synthetic */ Object a(a aVar, String str, boolean z3, c cVar, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 2) != 0) {
                    z3 = false;
                }
                return aVar.e(str, z3, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCachedSingleWordInference");
        }
    }

    ch.icoaching.typewise.language_detection.a a();

    Object d(c cVar);

    Object e(String str, boolean z3, c cVar);

    Object f(c cVar);
}
