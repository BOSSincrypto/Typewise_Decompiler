package ch.icoaching.wrio.ai_assistant;

import ch.icoaching.wrio.ai_assistant.network.d;
import kotlin.jvm.internal.o;

public interface j {

    public static final class a implements j {

        /* renamed from: a  reason: collision with root package name */
        private final d f9153a;

        public a(d dVar) {
            o.e(dVar, "gptApiError");
            this.f9153a = dVar;
        }

        public final d a() {
            return this.f9153a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && o.a(this.f9153a, ((a) obj).f9153a);
        }

        public int hashCode() {
            return this.f9153a.hashCode();
        }

        public String toString() {
            return "Error(gptApiError=" + this.f9153a + ')';
        }
    }

    public static final class b implements j {

        /* renamed from: a  reason: collision with root package name */
        private final String f9154a;

        public b(String str) {
            o.e(str, "transformedMessage");
            this.f9154a = str;
        }

        public final String a() {
            return this.f9154a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && o.a(this.f9154a, ((b) obj).f9154a);
        }

        public int hashCode() {
            return this.f9154a.hashCode();
        }

        public String toString() {
            return "MessageTransformation(transformedMessage=" + this.f9154a + ')';
        }
    }
}
