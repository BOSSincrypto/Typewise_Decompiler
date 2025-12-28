package ch.icoaching.wrio.ai_assistant.ui;

import F2.b;
import F2.m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.internal.i;
import l2.f;
import o2.C0840a;

@m
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lch/icoaching/wrio/ai_assistant/ui/PromptItemType;", "", "", "hasOptionsView", "<init>", "(Ljava/lang/String;IZ)V", "Z", "getHasOptionsView", "()Z", "Companion", "a", "PROOFREAD", "TRANSLATE", "TONALITY", "INCLUSIVE_LANGUAGE", "SHORTEN", "EXTEND", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum PromptItemType {
    PROOFREAD(false),
    TRANSLATE(true),
    TONALITY(true),
    INCLUSIVE_LANGUAGE(false),
    SHORTEN(false),
    EXTEND(false);
    
    public static final a Companion = null;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final f f9199a = null;
    private final boolean hasOptionsView;

    public static final class a {
        private a() {
        }

        private final /* synthetic */ b a() {
            return (b) PromptItemType.f9199a.getValue();
        }

        public final b serializer() {
            return a();
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    static {
        PromptItemType[] b4;
        f9201c = kotlin.enums.a.a(b4);
        Companion = new a((i) null);
        f9199a = c.a(LazyThreadSafetyMode.PUBLICATION, new F0.a());
    }

    private PromptItemType(boolean z3) {
        this.hasOptionsView = z3;
    }

    public static C0840a getEntries() {
        return f9201c;
    }

    public final boolean getHasOptionsView() {
        return this.hasOptionsView;
    }
}
