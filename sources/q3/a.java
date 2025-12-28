package q3;

import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import kotlin.jvm.internal.o;

public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0227a f15966a = C0227a.f15967a;

    /* renamed from: q3.a$a  reason: collision with other inner class name */
    public static final class C0227a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0227a f15967a = new C0227a();

        private C0227a() {
        }

        public final a a(InputMethodService inputMethodService) {
            o.e(inputMethodService, "inputMethodService");
            return new d(inputMethodService);
        }
    }

    int[] a();

    void onConfigurationChanged(Configuration configuration);
}
