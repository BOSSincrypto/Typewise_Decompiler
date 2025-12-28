package retrofit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import retrofit2.C0878e;

/* renamed from: retrofit2.c  reason: case insensitive filesystem */
class C0876c {

    /* renamed from: retrofit2.c$a */
    static final class a extends C0876c {
        a() {
        }

        /* access modifiers changed from: package-private */
        public List a(Executor executor) {
            return Arrays.asList(new C0878e.a[]{new C0883j(), new C0885l(executor)});
        }

        /* access modifiers changed from: package-private */
        public List b() {
            return Collections.singletonList(new z());
        }
    }

    C0876c() {
    }

    /* access modifiers changed from: package-private */
    public List a(Executor executor) {
        return Collections.singletonList(new C0885l(executor));
    }

    /* access modifiers changed from: package-private */
    public List b() {
        return Collections.emptyList();
    }
}
