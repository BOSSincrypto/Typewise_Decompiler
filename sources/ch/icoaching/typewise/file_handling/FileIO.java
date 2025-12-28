package ch.icoaching.typewise.file_handling;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.enums.a;
import o2.C0840a;

public interface FileIO {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lch/icoaching/typewise/file_handling/FileIO$Scope;", "", "<init>", "(Ljava/lang/String;I)V", "COMMON", "AUTOCORRECTION", "PREDICTION", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Scope {
        COMMON,
        AUTOCORRECTION,
        PREDICTION;

        static {
            Scope[] a4;
            f8263b = a.a(a4);
        }

        public static C0840a getEntries() {
            return f8263b;
        }
    }

    Object a(String str, c cVar);

    Object b(String str, boolean z3, boolean z4, c cVar);

    Object c(String str, c cVar);

    Object d(String str, c cVar);
}
