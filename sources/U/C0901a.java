package u;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: u.a  reason: case insensitive filesystem */
public abstract class C0901a {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f16377a = new HashSet(Arrays.asList(new String[]{"androidx.autofill.inline.ui.version:v1"}));

    /* renamed from: u.a$a  reason: collision with other inner class name */
    public interface C0244a {
        Bundle a();

        String b();
    }

    /* renamed from: u.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List f16378a = new ArrayList();

        b() {
        }

        public b a(C0244a aVar) {
            if (C0902b.a(aVar.b())) {
                this.f16378a.add(aVar);
                return this;
            }
            throw new IllegalArgumentException("Unsupported style version: " + aVar.b());
        }

        public Bundle b() {
            if (!this.f16378a.isEmpty()) {
                Bundle bundle = new Bundle();
                C0902b.b(this.f16378a, bundle);
                return bundle;
            }
            throw new IllegalStateException("Please put at least one style in the builder");
        }
    }

    public static Set a() {
        return f16377a;
    }

    public static b b() {
        return new b();
    }
}
