package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.o;

public interface p {

    /* renamed from: a  reason: collision with root package name */
    public static final a f15473a = a.f15475a;

    /* renamed from: b  reason: collision with root package name */
    public static final p f15474b = new a.C0215a();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f15475a = new a();

        /* renamed from: okhttp3.p$a$a  reason: collision with other inner class name */
        private static final class C0215a implements p {
            public List a(String str) {
                o.e(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    o.d(allByName, "getAllByName(hostname)");
                    return C0713h.a0(allByName);
                } catch (NullPointerException e4) {
                    UnknownHostException unknownHostException = new UnknownHostException(o.k("Broken system behaviour for dns lookup of ", str));
                    unknownHostException.initCause(e4);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }
    }

    List a(String str);
}
