package kotlinx.coroutines.channels;

import java.util.ArrayList;
import kotlinx.coroutines.channels.b;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.y;

public class l extends AbstractChannel {
    public l(u2.l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    public final boolean M() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean N() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void R(Object obj, j jVar) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                s sVar = (s) obj;
                if (sVar instanceof b.a) {
                    u2.l lVar = this.f14052a;
                    if (lVar != null) {
                        undeliveredElementException = OnUndeliveredElementKt.c(lVar, ((b.a) sVar).f14054d, (UndeliveredElementException) null);
                    }
                } else {
                    sVar.T(jVar);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                UndeliveredElementException undeliveredElementException2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    s sVar2 = (s) arrayList.get(size);
                    if (sVar2 instanceof b.a) {
                        u2.l lVar2 = this.f14052a;
                        if (lVar2 != null) {
                            undeliveredElementException2 = OnUndeliveredElementKt.c(lVar2, ((b.a) sVar2).f14054d, undeliveredElementException2);
                        } else {
                            undeliveredElementException2 = null;
                        }
                    } else {
                        sVar2.T(jVar);
                    }
                }
                undeliveredElementException = undeliveredElementException2;
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        return false;
    }

    /* access modifiers changed from: protected */
    public Object y(Object obj) {
        q A3;
        do {
            Object y3 = super.y(obj);
            y yVar = a.f14046b;
            if (y3 == yVar) {
                return yVar;
            }
            if (y3 == a.f14047c) {
                A3 = A(obj);
                if (A3 == null) {
                    return yVar;
                }
            } else if (y3 instanceof j) {
                return y3;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + y3).toString());
            }
        } while (!(A3 instanceof j));
        return A3;
    }
}
