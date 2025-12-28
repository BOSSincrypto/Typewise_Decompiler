package okhttp3;

import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;

public interface m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f15462a = a.f15464a;

    /* renamed from: b  reason: collision with root package name */
    public static final m f15463b = new a.C0214a();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f15464a = new a();

        /* renamed from: okhttp3.m$a$a  reason: collision with other inner class name */
        private static final class C0214a implements m {
            public List a(t tVar) {
                o.e(tVar, "url");
                return C0718m.j();
            }

            public void b(t tVar, List list) {
                o.e(tVar, "url");
                o.e(list, "cookies");
            }
        }

        private a() {
        }
    }

    List a(t tVar);

    void b(t tVar, List list);
}
