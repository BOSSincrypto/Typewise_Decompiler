package W2;

import c3.d;
import java.util.List;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.ErrorCode;

public interface j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1900a = a.f1902a;

    /* renamed from: b  reason: collision with root package name */
    public static final j f1901b = new a.C0036a();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f1902a = new a();

        /* renamed from: W2.j$a$a  reason: collision with other inner class name */
        private static final class C0036a implements j {
            public boolean a(int i4, List list) {
                o.e(list, "requestHeaders");
                return true;
            }

            public boolean b(int i4, List list, boolean z3) {
                o.e(list, "responseHeaders");
                return true;
            }

            public boolean c(int i4, d dVar, int i5, boolean z3) {
                o.e(dVar, "source");
                dVar.b((long) i5);
                return true;
            }

            public void d(int i4, ErrorCode errorCode) {
                o.e(errorCode, "errorCode");
            }
        }

        private a() {
        }
    }

    boolean a(int i4, List list);

    boolean b(int i4, List list, boolean z3);

    boolean c(int i4, d dVar, int i5, boolean z3);

    void d(int i4, ErrorCode errorCode);
}
