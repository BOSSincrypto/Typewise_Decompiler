package ch.icoaching.wrio.autocorrect;

import kotlin.Metadata;
import kotlin.enums.a;
import o2.C0840a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lch/icoaching/wrio/autocorrect/AutoCapitalizationState;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "OFF", "LIMITED", "FULL", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum AutoCapitalizationState {
    OFF(0),
    LIMITED(1),
    FULL(2);
    
    private final int value;

    static {
        AutoCapitalizationState[] a4;
        f9271b = a.a(a4);
    }

    private AutoCapitalizationState(int i4) {
        this.value = i4;
    }

    public static C0840a getEntries() {
        return f9271b;
    }

    public final int getValue() {
        return this.value;
    }
}
