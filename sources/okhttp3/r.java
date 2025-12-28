package okhttp3;

import Q2.d;
import c3.C0500b;
import c3.c;
import com.silkimen.http.HttpRequest;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import okhttp3.t;

public final class r extends z {

    /* renamed from: d  reason: collision with root package name */
    public static final b f15478d = new b((i) null);

    /* renamed from: e  reason: collision with root package name */
    private static final v f15479e = v.f15509e.a(HttpRequest.CONTENT_TYPE_FORM);

    /* renamed from: b  reason: collision with root package name */
    private final List f15480b;

    /* renamed from: c  reason: collision with root package name */
    private final List f15481c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Charset f15482a;

        /* renamed from: b  reason: collision with root package name */
        private final List f15483b;

        /* renamed from: c  reason: collision with root package name */
        private final List f15484c;

        public a() {
            this((Charset) null, 1, (i) null);
        }

        public final a a(String str, String str2) {
            String str3 = str;
            o.e(str3, "name");
            o.e(str2, "value");
            t.b bVar = t.f15488k;
            this.f15483b.add(t.b.b(bVar, str3, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f15482a, 91, (Object) null));
            this.f15484c.add(t.b.b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f15482a, 91, (Object) null));
            return this;
        }

        public final a b(String str, String str2) {
            String str3 = str;
            o.e(str3, "name");
            o.e(str2, "value");
            t.b bVar = t.f15488k;
            this.f15483b.add(t.b.b(bVar, str3, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f15482a, 83, (Object) null));
            this.f15484c.add(t.b.b(bVar, str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f15482a, 83, (Object) null));
            return this;
        }

        public final r c() {
            return new r(this.f15483b, this.f15484c);
        }

        public a(Charset charset) {
            this.f15482a = charset;
            this.f15483b = new ArrayList();
            this.f15484c = new ArrayList();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Charset charset, int i4, i iVar) {
            this((i4 & 1) != 0 ? null : charset);
        }
    }

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        private b() {
        }
    }

    public r(List list, List list2) {
        o.e(list, "encodedNames");
        o.e(list2, "encodedValues");
        this.f15480b = d.S(list);
        this.f15481c = d.S(list2);
    }

    private final long h(c cVar, boolean z3) {
        C0500b bVar;
        if (z3) {
            bVar = new C0500b();
        } else {
            o.b(cVar);
            bVar = cVar.c();
        }
        int size = this.f15480b.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            if (i4 > 0) {
                bVar.I(38);
            }
            bVar.f0((String) this.f15480b.get(i4));
            bVar.I(61);
            bVar.f0((String) this.f15481c.get(i4));
            i4 = i5;
        }
        if (!z3) {
            return 0;
        }
        long w02 = bVar.w0();
        bVar.o();
        return w02;
    }

    public long a() {
        return h((c) null, true);
    }

    public v b() {
        return f15479e;
    }

    public void g(c cVar) {
        o.e(cVar, "sink");
        h(cVar, false);
    }
}
