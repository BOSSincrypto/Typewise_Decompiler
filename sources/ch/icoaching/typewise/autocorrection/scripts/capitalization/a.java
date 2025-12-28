package ch.icoaching.typewise.autocorrection.scripts.capitalization;

import B0.n;
import androidx.work.c;
import ch.icoaching.typewise.autocorrection.helpers.TextCase;
import java.util.List;
import kotlin.jvm.internal.o;

public interface a {

    /* renamed from: ch.icoaching.typewise.autocorrection.scripts.capitalization.a$a  reason: collision with other inner class name */
    public static final class C0128a {

        /* renamed from: a  reason: collision with root package name */
        private final List f8059a;

        /* renamed from: b  reason: collision with root package name */
        private final List f8060b;

        public C0128a(List list, List list2) {
            o.e(list, "suggestions");
            o.e(list2, "numbersToReplace");
            this.f8059a = list;
            this.f8060b = list2;
        }

        public final List a() {
            return this.f8060b;
        }

        public final List b() {
            return this.f8059a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0128a)) {
                return false;
            }
            C0128a aVar = (C0128a) obj;
            return o.a(this.f8059a, aVar.f8059a) && o.a(this.f8060b, aVar.f8060b);
        }

        public int hashCode() {
            return (this.f8059a.hashCode() * 31) + this.f8060b.hashCode();
        }

        public String toString() {
            List list = this.f8059a;
            List list2 = this.f8060b;
            return "CapitalizeSuggestionsResult(suggestions=" + list + ", numbersToReplace=" + list2 + ")";
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f8061a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f8062b;

        /* renamed from: c  reason: collision with root package name */
        private final TextCase f8063c;

        public b(String str, boolean z3, TextCase textCase) {
            o.e(str, "newString");
            o.e(textCase, "stringCasing");
            this.f8061a = str;
            this.f8062b = z3;
            this.f8063c = textCase;
        }

        public final String a() {
            return this.f8061a;
        }

        public final boolean b() {
            return this.f8062b;
        }

        public final TextCase c() {
            return this.f8063c;
        }

        public final String d() {
            return this.f8061a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return o.a(this.f8061a, bVar.f8061a) && this.f8062b == bVar.f8062b && this.f8063c == bVar.f8063c;
        }

        public int hashCode() {
            return (((this.f8061a.hashCode() * 31) + c.a(this.f8062b)) * 31) + this.f8063c.hashCode();
        }

        public String toString() {
            String str = this.f8061a;
            boolean z3 = this.f8062b;
            TextCase textCase = this.f8063c;
            return "SingleWordAutoCapsResult(newString=" + str + ", wordInVocab=" + z3 + ", stringCasing=" + textCase + ")";
        }
    }

    n a(List list, List list2, int i4, int i5);

    Object b(List list, List list2, List list3, List list4, List list5, String str, kotlin.coroutines.c cVar);

    TextCase c(String str);
}
