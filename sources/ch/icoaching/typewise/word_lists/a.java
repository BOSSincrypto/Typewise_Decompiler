package ch.icoaching.typewise.word_lists;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import v2.C0925a;

public final class a extends WordList {

    /* renamed from: a  reason: collision with root package name */
    private final e f8930a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b f8931b;

    /* renamed from: ch.icoaching.typewise.word_lists.a$a  reason: collision with other inner class name */
    public static final class C0146a implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private final int f8932a;

        /* renamed from: b  reason: collision with root package name */
        private int f8933b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f8934c;

        C0146a(a aVar) {
            this.f8934c = aVar;
            this.f8932a = aVar.m();
        }

        /* renamed from: b */
        public String next() {
            String b4 = this.f8934c.f8931b.b(this.f8934c.p(), this.f8933b);
            this.f8933b++;
            return b4;
        }

        public boolean hasNext() {
            return this.f8932a > this.f8933b;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private final int f8935a;

        /* renamed from: b  reason: collision with root package name */
        private int f8936b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f8937c;

        b(a aVar) {
            this.f8937c = aVar;
            this.f8935a = aVar.m();
        }

        /* renamed from: b */
        public Pair next() {
            Pair e4 = this.f8937c.f8931b.e(this.f8937c.p(), this.f8936b);
            this.f8936b++;
            return e4;
        }

        public boolean hasNext() {
            return this.f8935a > this.f8936b;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(e eVar, b bVar) {
        o.e(eVar, "info");
        o.e(bVar, "dbWordListDataSource");
        this.f8930a = eVar;
        this.f8931b = bVar;
    }

    public boolean c(String str) {
        o.e(str, "word");
        return this.f8931b.d(p(), str);
    }

    public d g(String str) {
        o.e(str, "word");
        return this.f8931b.c(p(), str);
    }

    public Iterator iterator() {
        return new b(this);
    }

    public Iterator l() {
        return new C0146a(this);
    }

    public int m() {
        return this.f8931b.a(p());
    }

    public Set n() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashSet.addAll(((d) pair.component2()).g((String) pair.component1()));
        }
        return linkedHashSet;
    }

    public final String p() {
        return this.f8930a.b();
    }
}
