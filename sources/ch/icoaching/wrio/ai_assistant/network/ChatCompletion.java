package ch.icoaching.wrio.ai_assistant.network;

import F2.m;
import H2.f;
import I2.c;
import I2.d;
import I2.e;
import J2.C0;
import J2.C0300f;
import J2.C0317n0;
import J2.C0326s0;
import J2.F;
import J2.G0;
import J2.K;
import J2.V;
import ch.icoaching.wrio.ai_assistant.Role;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.serialization.UnknownFieldException;
import l0.t;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 62\u00020\u0001:\u0003789B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J>\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001dR \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b2\u0010-\u001a\u0004\b1\u0010\u001bR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u00103\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010 ¨\u0006:"}, d2 = {"Lch/icoaching/wrio/ai_assistant/network/ChatCompletion;", "", "", "id", "", "created", "model", "", "Lch/icoaching/wrio/ai_assistant/network/ChatCompletion$Choice;", "choices", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/String;Ljava/util/List;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/ai_assistant/network/ChatCompletion;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)Lch/icoaching/wrio/ai_assistant/network/ChatCompletion;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "J", "getCreated", "getCreated$annotations", "getModel", "getModel$annotations", "Ljava/util/List;", "getChoices", "getChoices$annotations", "Companion", "Choice", "b", "a", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@m
public final class ChatCompletion {
    /* access modifiers changed from: private */
    public static final F2.b[] $childSerializers = {null, null, null, new C0300f(Choice.a.f9161a)};
    public static final a Companion = new a((i) null);
    private final List<Choice> choices;
    private final long created;
    private final String id;
    private final String model;

    @m
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 /2\u00020\u0001:\u0003012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u001c¨\u00063"}, d2 = {"Lch/icoaching/wrio/ai_assistant/network/ChatCompletion$Choice;", "", "", "index", "Lch/icoaching/wrio/ai_assistant/network/ChatCompletion$Choice$Message;", "message", "", "finishReason", "<init>", "(ILch/icoaching/wrio/ai_assistant/network/ChatCompletion$Choice$Message;Ljava/lang/String;)V", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(IILch/icoaching/wrio/ai_assistant/network/ChatCompletion$Choice$Message;Ljava/lang/String;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/ai_assistant/network/ChatCompletion$Choice;LI2/d;LH2/f;)V", "write$Self", "component1", "()I", "component2", "()Lch/icoaching/wrio/ai_assistant/network/ChatCompletion$Choice$Message;", "component3", "()Ljava/lang/String;", "copy", "(ILch/icoaching/wrio/ai_assistant/network/ChatCompletion$Choice$Message;Ljava/lang/String;)Lch/icoaching/wrio/ai_assistant/network/ChatCompletion$Choice;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getIndex", "getIndex$annotations", "()V", "Lch/icoaching/wrio/ai_assistant/network/ChatCompletion$Choice$Message;", "getMessage", "getMessage$annotations", "Ljava/lang/String;", "getFinishReason", "getFinishReason$annotations", "Companion", "Message", "a", "b", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Choice {
        public static final b Companion = new b((i) null);
        private final String finishReason;
        private final int index;
        private final Message message;

        @m
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006-"}, d2 = {"Lch/icoaching/wrio/ai_assistant/network/ChatCompletion$Choice$Message;", "", "Lch/icoaching/wrio/ai_assistant/Role;", "role", "", "content", "<init>", "(Lch/icoaching/wrio/ai_assistant/Role;Ljava/lang/String;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/wrio/ai_assistant/Role;Ljava/lang/String;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/ai_assistant/network/ChatCompletion$Choice$Message;LI2/d;LH2/f;)V", "write$Self", "component1", "()Lch/icoaching/wrio/ai_assistant/Role;", "component2", "()Ljava/lang/String;", "copy", "(Lch/icoaching/wrio/ai_assistant/Role;Ljava/lang/String;)Lch/icoaching/wrio/ai_assistant/network/ChatCompletion$Choice$Message;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lch/icoaching/wrio/ai_assistant/Role;", "getRole", "getRole$annotations", "()V", "Ljava/lang/String;", "getContent", "getContent$annotations", "Companion", "a", "b", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Message {
            /* access modifiers changed from: private */
            public static final F2.b[] $childSerializers = {Role.Companion.serializer(), null};
            public static final b Companion = new b((i) null);
            private final String content;
            private final Role role;

            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f9159a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f9160b;

                static {
                    a aVar = new a();
                    f9159a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.ai_assistant.network.ChatCompletion.Choice.Message", aVar, 2);
                    s0Var.p("role", false);
                    s0Var.p("content", false);
                    f9160b = s0Var;
                }

                private a() {
                }

                public final f a() {
                    return f9160b;
                }

                public final F2.b[] c() {
                    return new F2.b[]{Message.$childSerializers[0], G2.a.u(G0.f622a)};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final Message b(e eVar) {
                    int i4;
                    String str;
                    Role role;
                    o.e(eVar, "decoder");
                    f fVar = f9160b;
                    c d4 = eVar.d(fVar);
                    F2.b[] access$get$childSerializers$cp = Message.$childSerializers;
                    if (d4.p()) {
                        role = (Role) d4.E(fVar, 0, access$get$childSerializers$cp[0], (Object) null);
                        str = (String) d4.m(fVar, 1, G0.f622a, (Object) null);
                        i4 = 3;
                    } else {
                        boolean z3 = true;
                        int i5 = 0;
                        Role role2 = null;
                        String str2 = null;
                        while (z3) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z3 = false;
                            } else if (e4 == 0) {
                                role2 = (Role) d4.E(fVar, 0, access$get$childSerializers$cp[0], role2);
                                i5 |= 1;
                            } else if (e4 == 1) {
                                str2 = (String) d4.m(fVar, 1, G0.f622a, str2);
                                i5 |= 2;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        role = role2;
                        str = str2;
                        i4 = i5;
                    }
                    d4.c(fVar);
                    return new Message(i4, role, str, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, Message message) {
                    o.e(fVar, "encoder");
                    o.e(message, "value");
                    f fVar2 = f9160b;
                    d d4 = fVar.d(fVar2);
                    Message.write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease(message, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return a.f9159a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ Message(int i4, Role role2, String str, C0 c02) {
                if (3 != (i4 & 3)) {
                    C0317n0.a(i4, 3, a.f9159a.a());
                }
                this.role = role2;
                this.content = str;
            }

            public static /* synthetic */ Message copy$default(Message message, Role role2, String str, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    role2 = message.role;
                }
                if ((i4 & 2) != 0) {
                    str = message.content;
                }
                return message.copy(role2, str);
            }

            public static /* synthetic */ void getContent$annotations() {
            }

            public static /* synthetic */ void getRole$annotations() {
            }

            public static final /* synthetic */ void write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease(Message message, d dVar, f fVar) {
                dVar.f(fVar, 0, $childSerializers[0], message.role);
                dVar.o(fVar, 1, G0.f622a, message.content);
            }

            public final Role component1() {
                return this.role;
            }

            public final String component2() {
                return this.content;
            }

            public final Message copy(Role role2, String str) {
                o.e(role2, "role");
                return new Message(role2, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Message)) {
                    return false;
                }
                Message message = (Message) obj;
                return this.role == message.role && o.a(this.content, message.content);
            }

            public final String getContent() {
                return this.content;
            }

            public final Role getRole() {
                return this.role;
            }

            public int hashCode() {
                int hashCode = this.role.hashCode() * 31;
                String str = this.content;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Message(role=" + this.role + ", content=" + this.content + ')';
            }

            public Message(Role role2, String str) {
                o.e(role2, "role");
                this.role = role2;
                this.content = str;
            }
        }

        public /* synthetic */ class a implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final a f9161a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f9162b;

            static {
                a aVar = new a();
                f9161a = aVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.ai_assistant.network.ChatCompletion.Choice", aVar, 3);
                s0Var.p("index", false);
                s0Var.p("message", false);
                s0Var.p("finish_reason", false);
                f9162b = s0Var;
            }

            private a() {
            }

            public final f a() {
                return f9162b;
            }

            public final F2.b[] c() {
                return new F2.b[]{K.f636a, Message.a.f9159a, G0.f622a};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* renamed from: f */
            public final Choice b(e eVar) {
                String str;
                Message message;
                int i4;
                int i5;
                e eVar2 = eVar;
                o.e(eVar2, "decoder");
                f fVar = f9162b;
                c d4 = eVar2.d(fVar);
                if (d4.p()) {
                    i4 = d4.v(fVar, 0);
                    str = d4.z(fVar, 2);
                    message = (Message) d4.E(fVar, 1, Message.a.f9159a, (Object) null);
                    i5 = 7;
                } else {
                    boolean z3 = true;
                    int i6 = 0;
                    Message message2 = null;
                    String str2 = null;
                    int i7 = 0;
                    while (z3) {
                        int e4 = d4.e(fVar);
                        if (e4 == -1) {
                            z3 = false;
                        } else if (e4 == 0) {
                            i6 = d4.v(fVar, 0);
                            i7 |= 1;
                        } else if (e4 == 1) {
                            message2 = (Message) d4.E(fVar, 1, Message.a.f9159a, message2);
                            i7 |= 2;
                        } else if (e4 == 2) {
                            str2 = d4.z(fVar, 2);
                            i7 |= 4;
                        } else {
                            throw new UnknownFieldException(e4);
                        }
                    }
                    i4 = i6;
                    i5 = i7;
                    message = message2;
                    str = str2;
                }
                d4.c(fVar);
                return new Choice(i5, i4, message, str, (C0) null);
            }

            /* renamed from: g */
            public final void e(I2.f fVar, Choice choice) {
                o.e(fVar, "encoder");
                o.e(choice, "value");
                f fVar2 = f9162b;
                d d4 = fVar.d(fVar2);
                Choice.write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease(choice, d4, fVar2);
                d4.c(fVar2);
            }
        }

        public static final class b {
            private b() {
            }

            public final F2.b serializer() {
                return a.f9161a;
            }

            public /* synthetic */ b(i iVar) {
                this();
            }
        }

        public /* synthetic */ Choice(int i4, int i5, Message message2, String str, C0 c02) {
            if (7 != (i4 & 7)) {
                C0317n0.a(i4, 7, a.f9161a.a());
            }
            this.index = i5;
            this.message = message2;
            this.finishReason = str;
        }

        public static /* synthetic */ Choice copy$default(Choice choice, int i4, Message message2, String str, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i4 = choice.index;
            }
            if ((i5 & 2) != 0) {
                message2 = choice.message;
            }
            if ((i5 & 4) != 0) {
                str = choice.finishReason;
            }
            return choice.copy(i4, message2, str);
        }

        public static /* synthetic */ void getFinishReason$annotations() {
        }

        public static /* synthetic */ void getIndex$annotations() {
        }

        public static /* synthetic */ void getMessage$annotations() {
        }

        public static final /* synthetic */ void write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease(Choice choice, d dVar, f fVar) {
            dVar.z(fVar, 0, choice.index);
            dVar.f(fVar, 1, Message.a.f9159a, choice.message);
            dVar.p(fVar, 2, choice.finishReason);
        }

        public final int component1() {
            return this.index;
        }

        public final Message component2() {
            return this.message;
        }

        public final String component3() {
            return this.finishReason;
        }

        public final Choice copy(int i4, Message message2, String str) {
            o.e(message2, "message");
            o.e(str, "finishReason");
            return new Choice(i4, message2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Choice)) {
                return false;
            }
            Choice choice = (Choice) obj;
            return this.index == choice.index && o.a(this.message, choice.message) && o.a(this.finishReason, choice.finishReason);
        }

        public final String getFinishReason() {
            return this.finishReason;
        }

        public final int getIndex() {
            return this.index;
        }

        public final Message getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (((this.index * 31) + this.message.hashCode()) * 31) + this.finishReason.hashCode();
        }

        public String toString() {
            return "Choice(index=" + this.index + ", message=" + this.message + ", finishReason=" + this.finishReason + ')';
        }

        public Choice(int i4, Message message2, String str) {
            o.e(message2, "message");
            o.e(str, "finishReason");
            this.index = i4;
            this.message = message2;
            this.finishReason = str;
        }
    }

    public static final class a {
        private a() {
        }

        public final F2.b serializer() {
            return b.f9163a;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public /* synthetic */ class b implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final b f9163a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f9164b;

        static {
            b bVar = new b();
            f9163a = bVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.ai_assistant.network.ChatCompletion", bVar, 4);
            s0Var.p("id", false);
            s0Var.p("created", false);
            s0Var.p("model", false);
            s0Var.p("choices", false);
            f9164b = s0Var;
        }

        private b() {
        }

        public final f a() {
            return f9164b;
        }

        public final F2.b[] c() {
            F2.b bVar = ChatCompletion.$childSerializers[3];
            G0 g02 = G0.f622a;
            return new F2.b[]{g02, V.f666a, g02, bVar};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* renamed from: f */
        public final ChatCompletion b(e eVar) {
            List list;
            String str;
            long j4;
            String str2;
            int i4;
            e eVar2 = eVar;
            o.e(eVar2, "decoder");
            f fVar = f9164b;
            c d4 = eVar2.d(fVar);
            F2.b[] access$get$childSerializers$cp = ChatCompletion.$childSerializers;
            String str3 = null;
            if (d4.p()) {
                String z3 = d4.z(fVar, 0);
                long r4 = d4.r(fVar, 1);
                String z4 = d4.z(fVar, 2);
                list = (List) d4.E(fVar, 3, access$get$childSerializers$cp[3], (Object) null);
                str2 = z3;
                str = z4;
                i4 = 15;
                j4 = r4;
            } else {
                long j5 = 0;
                boolean z5 = true;
                int i5 = 0;
                String str4 = null;
                List list2 = null;
                while (z5) {
                    int e4 = d4.e(fVar);
                    if (e4 == -1) {
                        z5 = false;
                    } else if (e4 == 0) {
                        str3 = d4.z(fVar, 0);
                        i5 |= 1;
                    } else if (e4 == 1) {
                        j5 = d4.r(fVar, 1);
                        i5 |= 2;
                    } else if (e4 == 2) {
                        str4 = d4.z(fVar, 2);
                        i5 |= 4;
                    } else if (e4 == 3) {
                        list2 = (List) d4.E(fVar, 3, access$get$childSerializers$cp[3], list2);
                        i5 |= 8;
                    } else {
                        throw new UnknownFieldException(e4);
                    }
                }
                i4 = i5;
                str2 = str3;
                j4 = j5;
                str = str4;
                list = list2;
            }
            d4.c(fVar);
            return new ChatCompletion(i4, str2, j4, str, list, (C0) null);
        }

        /* renamed from: g */
        public final void e(I2.f fVar, ChatCompletion chatCompletion) {
            o.e(fVar, "encoder");
            o.e(chatCompletion, "value");
            f fVar2 = f9164b;
            d d4 = fVar.d(fVar2);
            ChatCompletion.write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease(chatCompletion, d4, fVar2);
            d4.c(fVar2);
        }
    }

    public /* synthetic */ ChatCompletion(int i4, String str, long j4, String str2, List list, C0 c02) {
        if (15 != (i4 & 15)) {
            C0317n0.a(i4, 15, b.f9163a.a());
        }
        this.id = str;
        this.created = j4;
        this.model = str2;
        this.choices = list;
    }

    public static /* synthetic */ ChatCompletion copy$default(ChatCompletion chatCompletion, String str, long j4, String str2, List<Choice> list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = chatCompletion.id;
        }
        if ((i4 & 2) != 0) {
            j4 = chatCompletion.created;
        }
        long j5 = j4;
        if ((i4 & 4) != 0) {
            str2 = chatCompletion.model;
        }
        String str3 = str2;
        if ((i4 & 8) != 0) {
            list = chatCompletion.choices;
        }
        return chatCompletion.copy(str, j5, str3, list);
    }

    public static /* synthetic */ void getChoices$annotations() {
    }

    public static /* synthetic */ void getCreated$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getModel$annotations() {
    }

    public static final /* synthetic */ void write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease(ChatCompletion chatCompletion, d dVar, f fVar) {
        F2.b[] bVarArr = $childSerializers;
        dVar.p(fVar, 0, chatCompletion.id);
        dVar.t(fVar, 1, chatCompletion.created);
        dVar.p(fVar, 2, chatCompletion.model);
        dVar.f(fVar, 3, bVarArr[3], chatCompletion.choices);
    }

    public final String component1() {
        return this.id;
    }

    public final long component2() {
        return this.created;
    }

    public final String component3() {
        return this.model;
    }

    public final List<Choice> component4() {
        return this.choices;
    }

    public final ChatCompletion copy(String str, long j4, String str2, List<Choice> list) {
        o.e(str, "id");
        o.e(str2, "model");
        o.e(list, "choices");
        return new ChatCompletion(str, j4, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatCompletion)) {
            return false;
        }
        ChatCompletion chatCompletion = (ChatCompletion) obj;
        return o.a(this.id, chatCompletion.id) && this.created == chatCompletion.created && o.a(this.model, chatCompletion.model) && o.a(this.choices, chatCompletion.choices);
    }

    public final List<Choice> getChoices() {
        return this.choices;
    }

    public final long getCreated() {
        return this.created;
    }

    public final String getId() {
        return this.id;
    }

    public final String getModel() {
        return this.model;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + t.a(this.created)) * 31) + this.model.hashCode()) * 31) + this.choices.hashCode();
    }

    public String toString() {
        return "ChatCompletion(id=" + this.id + ", created=" + this.created + ", model=" + this.model + ", choices=" + this.choices + ')';
    }

    public ChatCompletion(String str, long j4, String str2, List<Choice> list) {
        o.e(str, "id");
        o.e(str2, "model");
        o.e(list, "choices");
        this.id = str;
        this.created = j4;
        this.model = str2;
        this.choices = list;
    }
}
