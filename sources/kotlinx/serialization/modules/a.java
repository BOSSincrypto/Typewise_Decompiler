package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import u2.l;

public abstract class a {

    /* renamed from: kotlinx.serialization.modules.a$a  reason: collision with other inner class name */
    public static final class C0204a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final F2.b f14407a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0204a(F2.b bVar) {
            super((i) null);
            o.e(bVar, "serializer");
            this.f14407a = bVar;
        }

        public F2.b a(List list) {
            o.e(list, "typeArgumentsSerializers");
            return this.f14407a;
        }

        public final F2.b b() {
            return this.f14407a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0204a) || !o.a(((C0204a) obj).f14407a, this.f14407a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f14407a.hashCode();
        }
    }

    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final l f14408a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(l lVar) {
            super((i) null);
            o.e(lVar, "provider");
            this.f14408a = lVar;
        }

        public F2.b a(List list) {
            o.e(list, "typeArgumentsSerializers");
            return (F2.b) this.f14408a.invoke(list);
        }

        public final l b() {
            return this.f14408a;
        }
    }

    public /* synthetic */ a(i iVar) {
        this();
    }

    public abstract F2.b a(List list);

    private a() {
    }
}
