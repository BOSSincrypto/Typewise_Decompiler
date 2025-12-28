package ch.icoaching.typewise.text;

import kotlin.Metadata;
import kotlin.enums.a;
import o2.C0840a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lch/icoaching/typewise/text/TypewiseInputType;", "", "<init>", "(Ljava/lang/String;I)V", "USERNAME", "EMAIL", "PHONE", "NAME", "ADDRESS", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum TypewiseInputType {
    USERNAME,
    EMAIL,
    PHONE,
    NAME,
    ADDRESS;

    static {
        TypewiseInputType[] a4;
        f8878b = a.a(a4);
    }

    public static C0840a getEntries() {
        return f8878b;
    }
}
