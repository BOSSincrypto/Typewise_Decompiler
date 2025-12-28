package ch.icoaching.wrio.keyboard.layout;

import kotlin.Metadata;
import kotlin.enums.a;
import o2.C0840a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lch/icoaching/wrio/keyboard/layout/Layout;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "QWERTY", "QWERTZ", "AZERTY", "WORKMAN", "NEO2", "DVORAK", "COLEMAK", "AUTO", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum Layout {
    QWERTY("qwerty"),
    QWERTZ("qwertz"),
    AZERTY("azerty"),
    WORKMAN("workman"),
    NEO2("neo2"),
    DVORAK("dvorak"),
    COLEMAK("colemak"),
    AUTO("auto");
    
    private final String value;

    static {
        Layout[] a4;
        f9987b = a.a(a4);
    }

    private Layout(String str) {
        this.value = str;
    }

    public static C0840a getEntries() {
        return f9987b;
    }

    public final String getValue() {
        return this.value;
    }
}
