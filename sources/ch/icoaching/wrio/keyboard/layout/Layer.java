package ch.icoaching.wrio.keyboard.layout;

import kotlin.Metadata;
import kotlin.enums.a;
import o2.C0840a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lch/icoaching/wrio/keyboard/layout/Layer;", "", "raw", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "LETTERS", "SYMBOLS", "EMOJI", "MORE_NUMBERS", "MORE_MATH", "selectorString", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum Layer {
    LETTERS("Letters"),
    SYMBOLS("Symbols"),
    EMOJI("Emoji"),
    MORE_NUMBERS("more_numbers"),
    MORE_MATH("more_math");
    
    private final String raw;

    static {
        Layer[] a4;
        f9985b = a.a(a4);
    }

    private Layer(String str) {
        this.raw = str;
    }

    public static C0840a getEntries() {
        return f9985b;
    }

    public final String selectorString() {
        return this.raw;
    }
}
