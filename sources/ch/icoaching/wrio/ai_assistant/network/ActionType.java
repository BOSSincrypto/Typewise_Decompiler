package ch.icoaching.wrio.ai_assistant.network;

import kotlin.Metadata;
import kotlin.enums.a;
import o2.C0840a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lch/icoaching/wrio/ai_assistant/network/ActionType;", "", "<init>", "(Ljava/lang/String;I)V", "PROOFREAD", "TRANSLATE", "TONALITY", "INCLUSIVE_LANGUAGE", "SHORTEN", "EXTEND", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ActionType {
    PROOFREAD,
    TRANSLATE,
    TONALITY,
    INCLUSIVE_LANGUAGE,
    SHORTEN,
    EXTEND;

    static {
        ActionType[] a4;
        f9156b = a.a(a4);
    }

    public static C0840a getEntries() {
        return f9156b;
    }
}
