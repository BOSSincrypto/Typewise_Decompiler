package ch.icoaching.wrio.keyboard;

import kotlin.Metadata;
import kotlin.enums.a;
import o2.C0840a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lch/icoaching/wrio/keyboard/KeyboardLayoutType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "RECTANGLE", "HEXAGON", "HEXAGON_LEGACY", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum KeyboardLayoutType {
    RECTANGLE("rectangle"),
    HEXAGON("hexagon"),
    HEXAGON_LEGACY("hexagon_legacy");
    
    private final String value;

    static {
        KeyboardLayoutType[] a4;
        f9970b = a.a(a4);
    }

    private KeyboardLayoutType(String str) {
        this.value = str;
    }

    public static C0840a getEntries() {
        return f9970b;
    }

    public final String getValue() {
        return this.value;
    }
}
