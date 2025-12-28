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
import ch.icoaching.wrio.ai_assistant.network.TonalityActionMetadata;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 22\u00020\u0001:\u000234B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010\u001bR \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010\u001d¨\u00065"}, d2 = {"Lch/icoaching/wrio/ai_assistant/network/TonalityChatCompletionBody;", "Lch/icoaching/wrio/ai_assistant/network/ChatCompletionBody;", "", "message", "Lch/icoaching/wrio/ai_assistant/network/ActionType;", "actionType", "Lch/icoaching/wrio/ai_assistant/network/TonalityActionMetadata;", "actionMetadata", "<init>", "(Ljava/lang/String;Lch/icoaching/wrio/ai_assistant/network/ActionType;Lch/icoaching/wrio/ai_assistant/network/TonalityActionMetadata;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Lch/icoaching/wrio/ai_assistant/network/ActionType;Lch/icoaching/wrio/ai_assistant/network/TonalityActionMetadata;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/ai_assistant/network/TonalityChatCompletionBody;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lch/icoaching/wrio/ai_assistant/network/ActionType;", "component3", "()Lch/icoaching/wrio/ai_assistant/network/TonalityActionMetadata;", "copy", "(Ljava/lang/String;Lch/icoaching/wrio/ai_assistant/network/ActionType;Lch/icoaching/wrio/ai_assistant/network/TonalityActionMetadata;)Lch/icoaching/wrio/ai_assistant/network/TonalityChatCompletionBody;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getMessage$annotations", "()V", "Lch/icoaching/wrio/ai_assistant/network/ActionType;", "getActionType", "getActionType$annotations", "Lch/icoaching/wrio/ai_assistant/network/TonalityActionMetadata;", "getActionMetadata", "getActionMetadata$annotations", "Companion", "a", "b", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@m
public final class TonalityChatCompletionBody extends ChatCompletionBody {
    /* access modifiers changed from: private */
    public static final F2.b[] $childSerializers = {null, B.a("ch.icoaching.wrio.ai_assistant.network.ActionType", ActionType.values(), new String[]{"proofread", "translate", "tonality", "inclusiveLanguage", "shorten", "extend"}, new Annotation[][]{null, null, null, null, null, null}, (Annotation[]) null), null};
    public static final b Companion = new b((i) null);
    private final TonalityActionMetadata actionMetadata;
    private final ActionType actionType;
    private final String message;

    public /* synthetic */ class a implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9169a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f9170b;

        static {
            a aVar = new a();
            f9169a = aVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.ai_assistant.network.TonalityChatCompletionBody", aVar, 3);
            s0Var.p("message", false);
            s0Var.p("actionType", false);
            s0Var.p("actionMetadata", false);
            f9170b = s0Var;
        }

        private a() {
        }

        public final f a() {
            return f9170b;
        }

        public final F2.b[] c() {
            return new F2.b[]{G0.f622a, TonalityChatCompletionBody.$childSerializers[1], TonalityActionMetadata.a.f9167a};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* renamed from: f */
        public final TonalityChatCompletionBody b(e eVar) {
            TonalityActionMetadata tonalityActionMetadata;
            ActionType actionType;
            String str;
            int i4;
            e eVar2 = eVar;
            o.e(eVar2, "decoder");
            f fVar = f9170b;
            c d4 = eVar2.d(fVar);
            F2.b[] access$get$childSerializers$cp = TonalityChatCompletionBody.$childSerializers;
            String str2 = null;
            if (d4.p()) {
                String z3 = d4.z(fVar, 0);
                actionType = (ActionType) d4.E(fVar, 1, access$get$childSerializers$cp[1], (Object) null);
                str = z3;
                tonalityActionMetadata = (TonalityActionMetadata) d4.E(fVar, 2, TonalityActionMetadata.a.f9167a, (Object) null);
                i4 = 7;
            } else {
                boolean z4 = true;
                int i5 = 0;
                ActionType actionType2 = null;
                TonalityActionMetadata tonalityActionMetadata2 = null;
                while (z4) {
                    int e4 = d4.e(fVar);
                    if (e4 == -1) {
                        z4 = false;
                    } else if (e4 == 0) {
                        str2 = d4.z(fVar, 0);
                        i5 |= 1;
                    } else if (e4 == 1) {
                        actionType2 = (ActionType) d4.E(fVar, 1, access$get$childSerializers$cp[1], actionType2);
                        i5 |= 2;
                    } else if (e4 == 2) {
                        tonalityActionMetadata2 = (TonalityActionMetadata) d4.E(fVar, 2, TonalityActionMetadata.a.f9167a, tonalityActionMetadata2);
                        i5 |= 4;
                    } else {
                        throw new UnknownFieldException(e4);
                    }
                }
                i4 = i5;
                str = str2;
                actionType = actionType2;
                tonalityActionMetadata = tonalityActionMetadata2;
            }
            d4.c(fVar);
            return new TonalityChatCompletionBody(i4, str, actionType, tonalityActionMetadata, (C0) null);
        }

        /* renamed from: g */
        public final void e(I2.f fVar, TonalityChatCompletionBody tonalityChatCompletionBody) {
            o.e(fVar, "encoder");
            o.e(tonalityChatCompletionBody, "value");
            f fVar2 = f9170b;
            d d4 = fVar.d(fVar2);
            TonalityChatCompletionBody.write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease(tonalityChatCompletionBody, d4, fVar2);
            d4.c(fVar2);
        }
    }

    public static final class b {
        private b() {
        }

        public final F2.b serializer() {
            return a.f9169a;
        }

        public /* synthetic */ b(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TonalityChatCompletionBody(int i4, String str, ActionType actionType2, TonalityActionMetadata tonalityActionMetadata, C0 c02) {
        super(i4, c02);
        if (7 != (i4 & 7)) {
            C0317n0.a(i4, 7, a.f9169a.a());
        }
        this.message = str;
        this.actionType = actionType2;
        this.actionMetadata = tonalityActionMetadata;
    }

    public static /* synthetic */ TonalityChatCompletionBody copy$default(TonalityChatCompletionBody tonalityChatCompletionBody, String str, ActionType actionType2, TonalityActionMetadata tonalityActionMetadata, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = tonalityChatCompletionBody.message;
        }
        if ((i4 & 2) != 0) {
            actionType2 = tonalityChatCompletionBody.actionType;
        }
        if ((i4 & 4) != 0) {
            tonalityActionMetadata = tonalityChatCompletionBody.actionMetadata;
        }
        return tonalityChatCompletionBody.copy(str, actionType2, tonalityActionMetadata);
    }

    public static /* synthetic */ void getActionMetadata$annotations() {
    }

    public static /* synthetic */ void getActionType$annotations() {
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    public static final /* synthetic */ void write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease(TonalityChatCompletionBody tonalityChatCompletionBody, d dVar, f fVar) {
        ChatCompletionBody.write$Self(tonalityChatCompletionBody, dVar, fVar);
        F2.b[] bVarArr = $childSerializers;
        dVar.p(fVar, 0, tonalityChatCompletionBody.message);
        dVar.f(fVar, 1, bVarArr[1], tonalityChatCompletionBody.actionType);
        dVar.f(fVar, 2, TonalityActionMetadata.a.f9167a, tonalityChatCompletionBody.actionMetadata);
    }

    public final String component1() {
        return this.message;
    }

    public final ActionType component2() {
        return this.actionType;
    }

    public final TonalityActionMetadata component3() {
        return this.actionMetadata;
    }

    public final TonalityChatCompletionBody copy(String str, ActionType actionType2, TonalityActionMetadata tonalityActionMetadata) {
        o.e(str, "message");
        o.e(actionType2, "actionType");
        o.e(tonalityActionMetadata, "actionMetadata");
        return new TonalityChatCompletionBody(str, actionType2, tonalityActionMetadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TonalityChatCompletionBody)) {
            return false;
        }
        TonalityChatCompletionBody tonalityChatCompletionBody = (TonalityChatCompletionBody) obj;
        return o.a(this.message, tonalityChatCompletionBody.message) && this.actionType == tonalityChatCompletionBody.actionType && o.a(this.actionMetadata, tonalityChatCompletionBody.actionMetadata);
    }

    public final TonalityActionMetadata getActionMetadata() {
        return this.actionMetadata;
    }

    public final ActionType getActionType() {
        return this.actionType;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (((this.message.hashCode() * 31) + this.actionType.hashCode()) * 31) + this.actionMetadata.hashCode();
    }

    public String toString() {
        return "TonalityChatCompletionBody(message=" + this.message + ", actionType=" + this.actionType + ", actionMetadata=" + this.actionMetadata + ')';
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TonalityChatCompletionBody(String str, ActionType actionType2, TonalityActionMetadata tonalityActionMetadata) {
        super((i) null);
        o.e(str, "message");
        o.e(actionType2, "actionType");
        o.e(tonalityActionMetadata, "actionMetadata");
        this.message = str;
        this.actionType = actionType2;
        this.actionMetadata = tonalityActionMetadata;
    }
}
