package ch.icoaching.wrio.dictionary;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final a f9630c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f9631a;

    /* renamed from: b  reason: collision with root package name */
    private final List f9632b;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public f(String str, List list) {
        o.e(str, "language");
        o.e(list, "words");
        this.f9631a = str;
        this.f9632b = list;
    }

    public final int a() {
        return this.f9632b.size();
    }

    public final List b(int i4) {
        int i5 = i4 + 5000;
        if (i5 < this.f9632b.size()) {
            return this.f9632b.subList(i4, i5);
        }
        List list = this.f9632b;
        return list.subList(i4, list.size());
    }

    public final List c() {
        return this.f9632b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return o.a(this.f9631a, fVar.f9631a) && o.a(this.f9632b, fVar.f9632b);
    }

    public int hashCode() {
        return (this.f9631a.hashCode() * 31) + this.f9632b.hashCode();
    }

    public String toString() {
        return "LoadedCsv(language=" + this.f9631a + ", words=" + this.f9632b + ')';
    }
}
