package ch.icoaching.wrio.ai_assistant;

import F2.b;
import F2.m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.internal.i;
import l2.f;
import o2.C0840a;

@m
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lch/icoaching/wrio/ai_assistant/Role;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "SYSTEM", "ASSISTANT", "USER", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum Role {
    SYSTEM,
    ASSISTANT,
    USER;
    
    /* access modifiers changed from: private */
    public static final f $cachedSerializer$delegate = null;
    public static final a Companion = null;

    public static final class a {
        private a() {
        }

        private final /* synthetic */ b a() {
            return (b) Role.$cachedSerializer$delegate.getValue();
        }

        public final b serializer() {
            return a();
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    static {
        Role[] $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a((i) null);
        $cachedSerializer$delegate = c.a(LazyThreadSafetyMode.PUBLICATION, new d());
    }

    public static C0840a getEntries() {
        return $ENTRIES;
    }
}
