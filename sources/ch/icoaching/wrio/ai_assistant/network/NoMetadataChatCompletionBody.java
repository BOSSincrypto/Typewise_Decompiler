package ch.icoaching.wrio.ai_assistant.network;

import F2.m;
import H2.f;
import I2.c;
import I2.d;
import I2.e;
import J2.B;
import J2.C0;
import J2.C0317n0;
import J2.C0326s0;
import J2.F;
import J2.G0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u0019¨\u0006."}, d2 = {"Lch/icoaching/wrio/ai_assistant/network/NoMetadataChatCompletionBody;", "Lch/icoaching/wrio/ai_assistant/network/ChatCompletionBody;", "", "message", "Lch/icoaching/wrio/ai_assistant/network/ActionType;", "actionType", "<init>", "(Ljava/lang/String;Lch/icoaching/wrio/ai_assistant/network/ActionType;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Lch/icoaching/wrio/ai_assistant/network/ActionType;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/ai_assistant/network/NoMetadataChatCompletionBody;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lch/icoaching/wrio/ai_assistant/network/ActionType;", "copy", "(Ljava/lang/String;Lch/icoaching/wrio/ai_assistant/network/ActionType;)Lch/icoaching/wrio/ai_assistant/network/NoMetadataChatCompletionBody;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getMessage$annotations", "()V", "Lch/icoaching/wrio/ai_assistant/network/ActionType;", "getActionType", "getActionType$annotations", "Companion", "a", "b", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@m
public final class NoMetadataChatCompletionBody extends ChatCompletionBody {
    /* access modifiers changed from: private */
    public static final F2.b[] $childSerializers = {null, B.a("ch.icoaching.wrio.ai_assistant.network.ActionType", ActionType.values(), new String[]{"proofread", "translate", "tonality", "inclusiveLanguage", "shorten", "extend"}, new Annotation[][]{null, null, null, null, null, null}, (Annotation[]) null)};
    public static final b Companion = new b((i) null);
    private final ActionType actionType;
    private final String message;

    public /* synthetic */ class a implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9165a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f9166b;

        static {
            a aVar = new a();
            f9165a = aVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.ai_assistant.network.NoMetadataChatCompletionBody", aVar, 2);
            s0Var.p("message", false);
            s0Var.p("actionType", false);
            f9166b = s0Var;
        }

        private a() {
        }

        public final f a() {
            return f9166b;
        }

        public final F2.b[] c() {
            return new F2.b[]{G0.f622a, NoMetadataChatCompletionBody.$childSerializers[1]};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* renamed from: f */
        public final NoMetadataChatCompletionBody b(e eVar) {
            int i4;
            String str;
            ActionType actionType;
            o.e(eVar, "decoder");
            f fVar = f9166b;
            c d4 = eVar.d(fVar);
            F2.b[] access$get$childSerializers$cp = NoMetadataChatCompletionBody.$childSerializers;
            if (d4.p()) {
                str = d4.z(fVar, 0);
                actionType = (ActionType) d4.E(fVar, 1, access$get$childSerializers$cp[1], (Object) null);
                i4 = 3;
            } else {
                boolean z3 = true;
                int i5 = 0;
                ActionType actionType2 = null;
                String str2 = null;
                while (z3) {
                    int e4 = d4.e(fVar);
                    if (e4 == -1) {
                        z3 = false;
                    } else if (e4 == 0) {
                        str2 = d4.z(fVar, 0);
                        i5 |= 1;
                    } else if (e4 == 1) {
                        actionType2 = (ActionType) d4.E(fVar, 1, access$get$childSerializers$cp[1], actionType2);
                        i5 |= 2;
                    } else {
                        throw new UnknownFieldException(e4);
                    }
                }
                actionType = actionType2;
                str = str2;
                i4 = i5;
            }
            d4.c(fVar);
            return new NoMetadataChatCompletionBody(i4, str, actionType, (C0) null);
        }

        /* renamed from: g */
        public final void e(I2.f fVar, NoMetadataChatCompletionBody noMetadataChatCompletionBody) {
            o.e(fVar, "encoder");
            o.e(noMetadataChatCompletionBody, "value");
            f fVar2 = f9166b;
            d d4 = fVar.d(fVar2);
            NoMetadataChatCompletionBody.write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease(noMetadataChatCompletionBody, d4, fVar2);
            d4.c(fVar2);
        }
    }

    public static final class b {
        private b() {
        }

        public final F2.b serializer() {
            return a.f9165a;
        }

        public /* synthetic */ b(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoMetadataChatCompletionBody(int i4, String str, ActionType actionType2, C0 c02) {
        super(i4, c02);
        if (3 != (i4 & 3)) {
            C0317n0.a(i4, 3, a.f9165a.a());
        }
        this.message = str;
        this.actionType = actionType2;
    }

    public static /* synthetic */ NoMetadataChatCompletionBody copy$default(NoMetadataChatCompletionBody noMetadataChatCompletionBody, String str, ActionType actionType2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = noMetadataChatCompletionBody.message;
        }
        if ((i4 & 2) != 0) {
            actionType2 = noMetadataChatCompletionBody.actionType;
        }
        return noMetadataChatCompletionBody.copy(str, actionType2);
    }

    public static /* synthetic */ void getActionType$annotations() {
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    public static final /* synthetic */ void write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease(NoMetadataChatCompletionBody noMetadataChatCompletionBody, d dVar, f fVar) {
        ChatCompletionBody.write$Self(noMetadataChatCompletionBody, dVar, fVar);
        F2.b[] bVarArr = $childSerializers;
        dVar.p(fVar, 0, noMetadataChatCompletionBody.message);
        dVar.f(fVar, 1, bVarArr[1], noMetadataChatCompletionBody.actionType);
    }

    public final String component1() {
        return this.message;
    }

    public final ActionType component2() {
        return this.actionType;
    }

    public final NoMetadataChatCompletionBody copy(String str, ActionType actionType2) {
        o.e(str, "message");
        o.e(actionType2, "actionType");
        return new NoMetadataChatCompletionBody(str, actionType2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoMetadataChatCompletionBody)) {
            return false;
        }
        NoMetadataChatCompletionBody noMetadataChatCompletionBody = (NoMetadataChatCompletionBody) obj;
        return o.a(this.message, noMetadataChatCompletionBody.message) && this.actionType == noMetadataChatCompletionBody.actionType;
    }

    public final ActionType getActionType() {
        return this.actionType;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + this.actionType.hashCode();
    }

    public String toString() {
        return "NoMetadataChatCompletionBody(message=" + this.message + ", actionType=" + this.actionType + ')';
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoMetadataChatCompletionBody(String str, ActionType actionType2) {
        super((i) null);
        o.e(str, "message");
        o.e(actionType2, "actionType");
        this.message = str;
        this.actionType = actionType2;
    }
}
