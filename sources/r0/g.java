package r0;

import ch.icoaching.typewise.autocorrection.helpers.TextCase;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f16031f = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final d f16032a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16033b;

    /* renamed from: c  reason: collision with root package name */
    private final List f16034c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16035d;

    /* renamed from: e  reason: collision with root package name */
    private final TextCase f16036e;

    public static final class a {
        private a() {
        }

        public final g a() {
            return new g(d.f16015g.a(), "", C0718m.j(), 0, TextCase.LOWER);
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public g(d dVar, String str, List list, int i4, TextCase textCase) {
        o.e(dVar, "strippedWord");
        o.e(str, "context");
        o.e(list, "touchPoints");
        o.e(textCase, "stringCasing");
        this.f16032a = dVar;
        this.f16033b = str;
        this.f16034c = list;
        this.f16035d = i4;
        this.f16036e = textCase;
    }

    public static /* synthetic */ g c(g gVar, d dVar, String str, List list, int i4, TextCase textCase, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            dVar = gVar.f16032a;
        }
        if ((i5 & 2) != 0) {
            str = gVar.f16033b;
        }
        String str2 = str;
        if ((i5 & 4) != 0) {
            list = gVar.f16034c;
        }
        List list2 = list;
        if ((i5 & 8) != 0) {
            i4 = gVar.f16035d;
        }
        int i6 = i4;
        if ((i5 & 16) != 0) {
            textCase = gVar.f16036e;
        }
        return gVar.b(dVar, str2, list2, i6, textCase);
    }

    public final String a() {
        return this.f16033b;
    }

    public final g b(d dVar, String str, List list, int i4, TextCase textCase) {
        o.e(dVar, "strippedWord");
        o.e(str, "context");
        o.e(list, "touchPoints");
        o.e(textCase, "stringCasing");
        return new g(dVar, str, list, i4, textCase);
    }

    public final TextCase d() {
        return this.f16036e;
    }

    public final d e() {
        return this.f16032a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (o.a(this.f16032a, gVar.f16032a) && o.a(this.f16033b, gVar.f16033b) && o.a(this.f16034c, gVar.f16034c) && this.f16035d == gVar.f16035d && this.f16036e == gVar.f16036e) {
            return true;
        }
        return false;
    }

    public final List f() {
        return this.f16034c;
    }

    public int hashCode() {
        return (((((((this.f16032a.hashCode() * 31) + this.f16033b.hashCode()) * 31) + this.f16034c.hashCode()) * 31) + this.f16035d) * 31) + this.f16036e.hashCode();
    }

    public String toString() {
        d dVar = this.f16032a;
        String str = this.f16033b;
        List list = this.f16034c;
        int i4 = this.f16035d;
        TextCase textCase = this.f16036e;
        return "Split(strippedWord=" + dVar + ", context=" + str + ", touchPoints=" + list + ", startIndex=" + i4 + ", stringCasing=" + textCase + ")";
    }
}
