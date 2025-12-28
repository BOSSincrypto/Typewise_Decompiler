package kotlin.text;

import B2.h;
import java.util.Iterator;
import kotlin.collections.AbstractCollection;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import z2.c;

public final class MatcherMatchResult$groups$1 extends AbstractCollection implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MatcherMatchResult f13923a;

    MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.f13923a = matcherMatchResult;
    }

    public /* bridge */ boolean b(j jVar) {
        return super.contains(jVar);
    }

    public j c(int i4) {
        c d4 = m.i(this.f13923a.d(), i4);
        if (d4.h().intValue() < 0) {
            return null;
        }
        String group = this.f13923a.d().group(i4);
        o.d(group, "group(...)");
        return new j(group, d4);
    }

    public final /* bridge */ boolean contains(Object obj) {
        boolean z3;
        if (obj == null) {
            z3 = true;
        } else {
            z3 = obj instanceof j;
        }
        if (!z3) {
            return false;
        }
        return b((j) obj);
    }

    public int getSize() {
        return this.f13923a.d().groupCount() + 1;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator iterator() {
        return h.m(C0718m.J(C0718m.k(this)), new MatcherMatchResult$groups$1$iterator$1(this)).iterator();
    }
}
