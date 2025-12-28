package c1;

import X0.b;
import com.bumptech.glide.load.data.d;
import java.util.Collections;
import java.util.List;
import p1.k;

public interface n {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final b f7577a;

        /* renamed from: b  reason: collision with root package name */
        public final List f7578b;

        /* renamed from: c  reason: collision with root package name */
        public final d f7579c;

        public a(b bVar, d dVar) {
            this(bVar, Collections.emptyList(), dVar);
        }

        public a(b bVar, List list, d dVar) {
            this.f7577a = (b) k.d(bVar);
            this.f7578b = (List) k.d(list);
            this.f7579c = (d) k.d(dVar);
        }
    }

    a a(Object obj, int i4, int i5, X0.d dVar);

    boolean b(Object obj);
}
