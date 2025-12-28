package ch.icoaching.wrio.ai_assistant.network;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public abstract class b {

    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final d f9175a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar) {
            super((i) null);
            o.e(dVar, "error");
            this.f9175a = dVar;
        }

        public final d a() {
            return this.f9175a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && o.a(this.f9175a, ((a) obj).f9175a);
        }

        public int hashCode() {
            return this.f9175a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f9175a + ')';
        }
    }

    /* renamed from: ch.icoaching.wrio.ai_assistant.network.b$b  reason: collision with other inner class name */
    public static final class C0149b extends b {

        /* renamed from: a  reason: collision with root package name */
        private final Object f9176a;

        public C0149b(Object obj) {
            super((i) null);
            this.f9176a = obj;
        }

        public final Object a() {
            return this.f9176a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0149b) && o.a(this.f9176a, ((C0149b) obj).f9176a);
        }

        public int hashCode() {
            Object obj = this.f9176a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f9176a + ')';
        }
    }

    public /* synthetic */ b(i iVar) {
        this();
    }

    private b() {
    }
}
