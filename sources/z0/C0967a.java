package z0;

import ch.icoaching.typewise.text.CapsMode;
import ch.icoaching.typewise.text.TypewiseInputType;
import ch.icoaching.typewise.word_lists.b;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: z0.a  reason: case insensitive filesystem */
public interface C0967a {

    /* renamed from: z0.a$a  reason: collision with other inner class name */
    public static final class C0251a {

        /* renamed from: a  reason: collision with root package name */
        private final String f16493a;

        /* renamed from: b  reason: collision with root package name */
        private final CapsMode f16494b;

        public C0251a(String str, CapsMode capsMode) {
            o.e(str, "word");
            o.e(capsMode, "capsMode");
            this.f16493a = str;
            this.f16494b = capsMode;
        }

        public final String a() {
            return this.f16493a;
        }

        public final CapsMode b() {
            return this.f16494b;
        }

        public final String c() {
            return this.f16493a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0251a)) {
                return false;
            }
            C0251a aVar = (C0251a) obj;
            if (o.a(this.f16493a, aVar.f16493a) && this.f16494b == aVar.f16494b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f16493a.hashCode() * 31) + this.f16494b.hashCode();
        }

        public String toString() {
            String str = this.f16493a;
            CapsMode capsMode = this.f16494b;
            return "WordAndCapsModeResult(word=" + str + ", capsMode=" + capsMode + ")";
        }
    }

    b a(String str);

    b b(String str);

    List c(String str, String str2, int i4);

    List d(String str);

    List e(String str, TypewiseInputType typewiseInputType);

    List f(String str, String str2, int i4, int i5);

    List i(String str, List list, int i4);
}
