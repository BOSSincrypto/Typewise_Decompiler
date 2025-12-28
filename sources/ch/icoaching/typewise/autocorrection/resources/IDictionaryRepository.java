package ch.icoaching.typewise.autocorrection.resources;

import androidx.work.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import o2.C0840a;
import r0.e;
import r0.f;

public interface IDictionaryRepository {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lch/icoaching/typewise/autocorrection/resources/IDictionaryRepository$DictionarySource;", "", "<init>", "(Ljava/lang/String;I)V", "DICTIONARY", "PASSIVE_WORD_LIST", "ADDITIONAL_WORD_LIST", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum DictionarySource {
        DICTIONARY,
        PASSIVE_WORD_LIST,
        ADDITIONAL_WORD_LIST;

        static {
            DictionarySource[] a4;
            f7920b = kotlin.enums.a.a(a4);
        }

        public static C0840a getEntries() {
            return f7920b;
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Boolean f7921a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f7922b;

        /* renamed from: c  reason: collision with root package name */
        private final List f7923c;

        /* renamed from: d  reason: collision with root package name */
        private final List f7924d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f7925e;

        public a(Boolean bool, boolean z3, List list, List list2) {
            o.e(list, "dictionaryWords");
            o.e(list2, "dictionarySource");
            this.f7921a = bool;
            this.f7922b = z3;
            this.f7923c = list;
            this.f7924d = list2;
            this.f7925e = o.a(bool, Boolean.TRUE) || z3;
        }

        public final boolean a() {
            return this.f7925e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return o.a(this.f7921a, aVar.f7921a) && this.f7922b == aVar.f7922b && o.a(this.f7923c, aVar.f7923c) && o.a(this.f7924d, aVar.f7924d);
        }

        public int hashCode() {
            Boolean bool = this.f7921a;
            return ((((((bool == null ? 0 : bool.hashCode()) * 31) + c.a(this.f7922b)) * 31) + this.f7923c.hashCode()) * 31) + this.f7924d.hashCode();
        }

        public String toString() {
            Boolean bool = this.f7921a;
            boolean z3 = this.f7922b;
            List list = this.f7923c;
            List list2 = this.f7924d;
            return "DictionaryContainsResult(isWordInDictionaryCaseSensitive=" + bool + ", isWordInDictionaryCaseInsensitive=" + z3 + ", dictionaryWords=" + list + ", dictionarySource=" + list2 + ")";
        }
    }

    int e();

    int f(String str);

    a g(String str, String str2);

    f h(String str, String str2);

    List i(String str, String str2, String str3, String str4, String str5);

    e j(r0.c cVar, String str, String str2);

    e k(r0.c cVar, String str);

    int l(String str);

    boolean m(String str, String str2);

    a n(String str, String str2);
}
