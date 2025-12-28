package J2;

import F2.b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public abstract class r extends C0322q {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(b bVar) {
        super(bVar, (i) null);
        o.e(bVar, "element");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Iterator i(Collection collection) {
        o.e(collection, "<this>");
        return collection.iterator();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public int j(Collection collection) {
        o.e(collection, "<this>");
        return collection.size();
    }
}
