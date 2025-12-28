package ch.icoaching.wrio.input;

import kotlin.Metadata;
import kotlin.enums.a;
import o2.C0840a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lch/icoaching/wrio/input/NumberInputType;", "", "<init>", "(Ljava/lang/String;I)V", "PHONE", "OTHER", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum NumberInputType {
    PHONE,
    OTHER;

    static {
        NumberInputType[] a4;
        f9744b = a.a(a4);
    }

    public static C0840a getEntries() {
        return f9744b;
    }
}
