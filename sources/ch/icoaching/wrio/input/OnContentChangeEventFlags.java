package ch.icoaching.wrio.input;

import androidx.work.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.o;
import o2.C0840a;

public final class OnContentChangeEventFlags {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9745a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f9746b;

    /* renamed from: c  reason: collision with root package name */
    private final TriggerEventType f9747c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lch/icoaching/wrio/input/OnContentChangeEventFlags$TriggerEventType;", "", "<init>", "(Ljava/lang/String;I)V", "CHARACTER", "EMOJI", "RESTORE", "DELETE", "RESTORE_DONE", "DELETE_DONE", "AUTOCORRECTION", "PREDICTION", "TEXT_REPLACEMENT_DONE", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum TriggerEventType {
        CHARACTER,
        EMOJI,
        RESTORE,
        DELETE,
        RESTORE_DONE,
        DELETE_DONE,
        AUTOCORRECTION,
        PREDICTION,
        TEXT_REPLACEMENT_DONE;

        static {
            TriggerEventType[] a4;
            f9749b = a.a(a4);
        }

        public static C0840a getEntries() {
            return f9749b;
        }
    }

    public OnContentChangeEventFlags(boolean z3, boolean z4, TriggerEventType triggerEventType) {
        o.e(triggerEventType, "triggerEventType");
        this.f9745a = z3;
        this.f9746b = z4;
        this.f9747c = triggerEventType;
    }

    public static /* synthetic */ OnContentChangeEventFlags b(OnContentChangeEventFlags onContentChangeEventFlags, boolean z3, boolean z4, TriggerEventType triggerEventType, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = onContentChangeEventFlags.f9745a;
        }
        if ((i4 & 2) != 0) {
            z4 = onContentChangeEventFlags.f9746b;
        }
        if ((i4 & 4) != 0) {
            triggerEventType = onContentChangeEventFlags.f9747c;
        }
        return onContentChangeEventFlags.c(z3, z4, triggerEventType);
    }

    public final TriggerEventType a() {
        return this.f9747c;
    }

    public final OnContentChangeEventFlags c(boolean z3, boolean z4, TriggerEventType triggerEventType) {
        o.e(triggerEventType, "triggerEventType");
        return new OnContentChangeEventFlags(z3, z4, triggerEventType);
    }

    public final boolean d() {
        return this.f9745a;
    }

    public final boolean e() {
        return this.f9746b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnContentChangeEventFlags)) {
            return false;
        }
        OnContentChangeEventFlags onContentChangeEventFlags = (OnContentChangeEventFlags) obj;
        return this.f9745a == onContentChangeEventFlags.f9745a && this.f9746b == onContentChangeEventFlags.f9746b && this.f9747c == onContentChangeEventFlags.f9747c;
    }

    public int hashCode() {
        return (((c.a(this.f9745a) * 31) + c.a(this.f9746b)) * 31) + this.f9747c.hashCode();
    }

    public String toString() {
        return "OnContentChangeEventFlags(isEmojiTriggered=" + this.f9745a + ", isMadeByUser=" + this.f9746b + ", triggerEventType=" + this.f9747c + ')';
    }
}
