package ch.icoaching.wrio.dictionary;

import kotlin.Metadata;
import kotlin.enums.a;
import o2.C0840a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lch/icoaching/wrio/dictionary/IntegrityCheckStatus;", "", "<init>", "(Ljava/lang/String;I)V", "OK", "MISSING_WORDS", "MISSING_DELETES", "DUPLICATE_WORDS", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
enum IntegrityCheckStatus {
    OK,
    MISSING_WORDS,
    MISSING_DELETES,
    DUPLICATE_WORDS;

    static {
        IntegrityCheckStatus[] a4;
        f9603b = a.a(a4);
    }

    public static C0840a getEntries() {
        return f9603b;
    }
}
