package G0;

import ch.icoaching.wrio.C0556u;
import ch.icoaching.wrio.C0557v;
import ch.icoaching.wrio.TypewiseInputMethodService;
import kotlin.jvm.internal.o;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final TypewiseInputMethodService f521a;

    /* renamed from: b  reason: collision with root package name */
    private final a f522b;

    /* renamed from: c  reason: collision with root package name */
    private final C0003b f523c;

    /* renamed from: d  reason: collision with root package name */
    private String f524d = "";

    public static final class a implements C0556u {
        a() {
        }

        public void a(char c4, int i4) {
        }
    }

    /* renamed from: G0.b$b  reason: collision with other inner class name */
    public static final class C0003b implements C0557v {
        C0003b() {
        }

        public void a(String str, int i4) {
            o.e(str, "emoji");
        }
    }

    public b(TypewiseInputMethodService typewiseInputMethodService) {
        o.e(typewiseInputMethodService, "inputMethodService");
        this.f521a = typewiseInputMethodService;
        a aVar = new a();
        this.f522b = aVar;
        C0003b bVar = new C0003b();
        this.f523c = bVar;
        typewiseInputMethodService.M0(aVar);
        typewiseInputMethodService.N0(bVar);
    }

    public void a() {
    }

    public void b() {
    }
}
