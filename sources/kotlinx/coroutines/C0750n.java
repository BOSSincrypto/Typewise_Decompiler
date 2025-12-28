package kotlinx.coroutines;

import kotlin.coroutines.c;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.f;

/* renamed from: kotlinx.coroutines.n  reason: case insensitive filesystem */
public abstract class C0750n {
    public static final void a(C0747k kVar, Q q4) {
        kVar.j(new S(q4));
    }

    public static final C0748l b(c cVar) {
        if (!(cVar instanceof f)) {
            return new C0748l(cVar, 1);
        }
        C0748l m4 = ((f) cVar).m();
        if (m4 != null) {
            if (!m4.I()) {
                m4 = null;
            }
            if (m4 != null) {
                return m4;
            }
        }
        return new C0748l(cVar, 2);
    }

    public static final void c(C0747k kVar, LockFreeLinkedListNode lockFreeLinkedListNode) {
        kVar.j(new v0(lockFreeLinkedListNode));
    }
}
