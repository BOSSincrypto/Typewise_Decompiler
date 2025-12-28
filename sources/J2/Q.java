package J2;

import F2.b;
import H2.f;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.o;

public final class Q extends r {

    /* renamed from: b  reason: collision with root package name */
    private final f f652b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q(b bVar) {
        super(bVar);
        o.e(bVar, "eSerializer");
        this.f652b = new P(bVar.a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Set q(LinkedHashSet linkedHashSet) {
        o.e(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    public f a() {
        return this.f652b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public LinkedHashSet f() {
        return new LinkedHashSet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int g(LinkedHashSet linkedHashSet) {
        o.e(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void h(LinkedHashSet linkedHashSet, int i4) {
        o.e(linkedHashSet, "<this>");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void s(LinkedHashSet linkedHashSet, int i4, Object obj) {
        o.e(linkedHashSet, "<this>");
        linkedHashSet.add(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public LinkedHashSet p(Set set) {
        LinkedHashSet linkedHashSet;
        o.e(set, "<this>");
        if (set instanceof LinkedHashSet) {
            linkedHashSet = (LinkedHashSet) set;
        } else {
            linkedHashSet = null;
        }
        if (linkedHashSet == null) {
            return new LinkedHashSet(set);
        }
        return linkedHashSet;
    }
}
