package ch.icoaching.wrio.keyboard;

import kotlin.Metadata;
import kotlin.enums.a;
import o2.C0840a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lch/icoaching/wrio/keyboard/WindowSizeClass;", "", "<init>", "(Ljava/lang/String;I)V", "COMPACT", "MEDIUM", "EXPANDED", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
enum WindowSizeClass {
    COMPACT,
    MEDIUM,
    EXPANDED;

    static {
        WindowSizeClass[] a4;
        f9979b = a.a(a4);
    }

    public static C0840a getEntries() {
        return f9979b;
    }
}
