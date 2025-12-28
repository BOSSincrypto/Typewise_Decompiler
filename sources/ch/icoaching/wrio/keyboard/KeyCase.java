package ch.icoaching.wrio.keyboard;

import kotlin.Metadata;
import kotlin.enums.a;
import o2.C0840a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\t"}, d2 = {"Lch/icoaching/wrio/keyboard/KeyCase;", "", "<init>", "(Ljava/lang/String;I)V", "LOWERCASE", "UPPERCASE", "CAPS_LOCK", "isUppercase", "", "typewise-sdk-keyboard-ui-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum KeyCase {
    LOWERCASE,
    UPPERCASE,
    CAPS_LOCK;

    static {
        KeyCase[] a4;
        f9968b = a.a(a4);
    }

    public static C0840a getEntries() {
        return f9968b;
    }

    public final boolean isUppercase() {
        if (this == UPPERCASE || this == CAPS_LOCK) {
            return true;
        }
        return false;
    }
}
