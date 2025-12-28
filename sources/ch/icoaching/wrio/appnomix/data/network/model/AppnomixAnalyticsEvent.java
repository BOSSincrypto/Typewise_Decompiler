package ch.icoaching.wrio.appnomix.data.network.model;

import F2.m;
import H2.f;
import I2.d;
import J2.B;
import J2.C0;
import J2.C0317n0;
import J2.C0326s0;
import J2.F;
import J2.G0;
import J2.O;
import java.lang.annotation.Annotation;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u0000 92\u00020\u0001:\u0002:;B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\n\u0010\u000bBY\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u001dR \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b5\u0010.\u001a\u0004\b4\u0010\u001bR,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b8\u0010.\u001a\u0004\b7\u0010!¨\u0006<"}, d2 = {"Lch/icoaching/wrio/appnomix/data/network/model/AppnomixAnalyticsEvent;", "", "", "eventID", "Lch/icoaching/wrio/appnomix/data/network/model/AnalyticsEventType;", "eventType", "userTimestamp", "source", "", "payload", "<init>", "(Ljava/lang/String;Lch/icoaching/wrio/appnomix/data/network/model/AnalyticsEventType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Lch/icoaching/wrio/appnomix/data/network/model/AnalyticsEventType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_appnomix_2_4_40_219__remoteRelease", "(Lch/icoaching/wrio/appnomix/data/network/model/AppnomixAnalyticsEvent;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lch/icoaching/wrio/appnomix/data/network/model/AnalyticsEventType;", "component3", "component4", "component5", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Lch/icoaching/wrio/appnomix/data/network/model/AnalyticsEventType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lch/icoaching/wrio/appnomix/data/network/model/AppnomixAnalyticsEvent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventID", "getEventID$annotations", "()V", "Lch/icoaching/wrio/appnomix/data/network/model/AnalyticsEventType;", "getEventType", "getEventType$annotations", "getUserTimestamp", "getUserTimestamp$annotations", "getSource", "getSource$annotations", "Ljava/util/Map;", "getPayload", "getPayload$annotations", "Companion", "b", "a", "typewise-sdk-appnomix-2.4.40(219)_remoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@m
public final class AppnomixAnalyticsEvent {
    /* access modifiers changed from: private */
    public static final F2.b[] $childSerializers;
    public static final a Companion = new a((i) null);
    private final String eventID;
    private final AnalyticsEventType eventType;
    private final Map<String, String> payload;
    private final String source;
    private final String userTimestamp;

    public static final class a {
        private a() {
        }

        public final F2.b serializer() {
            return b.f9258a;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public /* synthetic */ class b implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final b f9258a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f9259b;

        static {
            b bVar = new b();
            f9258a = bVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.appnomix.data.network.model.AppnomixAnalyticsEvent", bVar, 5);
            s0Var.p("event_id", false);
            s0Var.p("event_type", false);
            s0Var.p("user_timestamp", false);
            s0Var.p("source", false);
            s0Var.p("payload", false);
            f9259b = s0Var;
        }

        private b() {
        }

        public final f a() {
            return f9259b;
        }

        public final F2.b[] c() {
            F2.b[] access$get$childSerializers$cp = AppnomixAnalyticsEvent.$childSerializers;
            F2.b bVar = access$get$childSerializers$cp[1];
            F2.b bVar2 = access$get$childSerializers$cp[4];
            G0 g02 = G0.f622a;
            return new F2.b[]{g02, bVar, g02, g02, bVar2};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: ch.icoaching.wrio.appnomix.data.network.model.AnalyticsEventType} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.util.Map} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ch.icoaching.wrio.appnomix.data.network.model.AppnomixAnalyticsEvent b(I2.e r24) {
            /*
                r23 = this;
                r0 = r24
                java.lang.String r1 = "decoder"
                kotlin.jvm.internal.o.e(r0, r1)
                H2.f r1 = f9259b
                I2.c r0 = r0.d(r1)
                F2.b[] r2 = ch.icoaching.wrio.appnomix.data.network.model.AppnomixAnalyticsEvent.$childSerializers
                boolean r3 = r0.p()
                r4 = 3
                r5 = 2
                r6 = 4
                r7 = 1
                r8 = 0
                r9 = 0
                if (r3 == 0) goto L_0x0049
                java.lang.String r3 = r0.z(r1, r8)
                r8 = r2[r7]
                java.lang.Object r7 = r0.E(r1, r7, r8, r9)
                ch.icoaching.wrio.appnomix.data.network.model.AnalyticsEventType r7 = (ch.icoaching.wrio.appnomix.data.network.model.AnalyticsEventType) r7
                java.lang.String r5 = r0.z(r1, r5)
                java.lang.String r4 = r0.z(r1, r4)
                r2 = r2[r6]
                java.lang.Object r2 = r0.E(r1, r6, r2, r9)
                java.util.Map r2 = (java.util.Map) r2
                r6 = 31
                r21 = r2
                r17 = r3
                r20 = r4
                r19 = r5
                r16 = r6
                r18 = r7
                goto L_0x00a6
            L_0x0049:
                r14 = r7
                r3 = r8
                r10 = r9
                r11 = r10
                r12 = r11
                r13 = r12
            L_0x004f:
                if (r14 == 0) goto L_0x009a
                int r15 = r0.e(r1)
                r8 = -1
                if (r15 == r8) goto L_0x0097
                if (r15 == 0) goto L_0x008f
                if (r15 == r7) goto L_0x0083
                if (r15 == r5) goto L_0x007c
                if (r15 == r4) goto L_0x0075
                if (r15 != r6) goto L_0x006f
                r8 = r2[r6]
                java.lang.Object r8 = r0.E(r1, r6, r8, r13)
                r13 = r8
                java.util.Map r13 = (java.util.Map) r13
                r3 = r3 | 16
            L_0x006d:
                r8 = 0
                goto L_0x004f
            L_0x006f:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>((int) r15)
                throw r0
            L_0x0075:
                java.lang.String r12 = r0.z(r1, r4)
                r3 = r3 | 8
                goto L_0x006d
            L_0x007c:
                java.lang.String r11 = r0.z(r1, r5)
                r3 = r3 | 4
                goto L_0x006d
            L_0x0083:
                r8 = r2[r7]
                java.lang.Object r8 = r0.E(r1, r7, r8, r10)
                r10 = r8
                ch.icoaching.wrio.appnomix.data.network.model.AnalyticsEventType r10 = (ch.icoaching.wrio.appnomix.data.network.model.AnalyticsEventType) r10
                r3 = r3 | 2
                goto L_0x006d
            L_0x008f:
                r8 = 0
                java.lang.String r9 = r0.z(r1, r8)
                r3 = r3 | 1
                goto L_0x004f
            L_0x0097:
                r8 = 0
                r14 = r8
                goto L_0x004f
            L_0x009a:
                r16 = r3
                r17 = r9
                r18 = r10
                r19 = r11
                r20 = r12
                r21 = r13
            L_0x00a6:
                r0.c(r1)
                ch.icoaching.wrio.appnomix.data.network.model.AppnomixAnalyticsEvent r0 = new ch.icoaching.wrio.appnomix.data.network.model.AppnomixAnalyticsEvent
                r22 = 0
                r15 = r0
                r15.<init>(r16, r17, r18, r19, r20, r21, r22)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.appnomix.data.network.model.AppnomixAnalyticsEvent.b.b(I2.e):ch.icoaching.wrio.appnomix.data.network.model.AppnomixAnalyticsEvent");
        }

        /* renamed from: g */
        public final void e(I2.f fVar, AppnomixAnalyticsEvent appnomixAnalyticsEvent) {
            o.e(fVar, "encoder");
            o.e(appnomixAnalyticsEvent, "value");
            f fVar2 = f9259b;
            d d4 = fVar.d(fVar2);
            AppnomixAnalyticsEvent.write$Self$typewise_sdk_appnomix_2_4_40_219__remoteRelease(appnomixAnalyticsEvent, d4, fVar2);
            d4.c(fVar2);
        }
    }

    static {
        F2.b a4 = B.a("ch.icoaching.wrio.appnomix.data.network.model.AnalyticsEventType", AnalyticsEventType.values(), new String[]{"keyboard_opened"}, new Annotation[][]{null}, (Annotation[]) null);
        G0 g02 = G0.f622a;
        $childSerializers = new F2.b[]{null, a4, null, null, new O(g02, g02)};
    }

    public /* synthetic */ AppnomixAnalyticsEvent(int i4, String str, AnalyticsEventType analyticsEventType, String str2, String str3, Map map, C0 c02) {
        if (31 != (i4 & 31)) {
            C0317n0.a(i4, 31, b.f9258a.a());
        }
        this.eventID = str;
        this.eventType = analyticsEventType;
        this.userTimestamp = str2;
        this.source = str3;
        this.payload = map;
    }

    public static /* synthetic */ AppnomixAnalyticsEvent copy$default(AppnomixAnalyticsEvent appnomixAnalyticsEvent, String str, AnalyticsEventType analyticsEventType, String str2, String str3, Map<String, String> map, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = appnomixAnalyticsEvent.eventID;
        }
        if ((i4 & 2) != 0) {
            analyticsEventType = appnomixAnalyticsEvent.eventType;
        }
        AnalyticsEventType analyticsEventType2 = analyticsEventType;
        if ((i4 & 4) != 0) {
            str2 = appnomixAnalyticsEvent.userTimestamp;
        }
        String str4 = str2;
        if ((i4 & 8) != 0) {
            str3 = appnomixAnalyticsEvent.source;
        }
        String str5 = str3;
        if ((i4 & 16) != 0) {
            map = appnomixAnalyticsEvent.payload;
        }
        return appnomixAnalyticsEvent.copy(str, analyticsEventType2, str4, str5, map);
    }

    public static /* synthetic */ void getEventID$annotations() {
    }

    public static /* synthetic */ void getEventType$annotations() {
    }

    public static /* synthetic */ void getPayload$annotations() {
    }

    public static /* synthetic */ void getSource$annotations() {
    }

    public static /* synthetic */ void getUserTimestamp$annotations() {
    }

    public static final /* synthetic */ void write$Self$typewise_sdk_appnomix_2_4_40_219__remoteRelease(AppnomixAnalyticsEvent appnomixAnalyticsEvent, d dVar, f fVar) {
        F2.b[] bVarArr = $childSerializers;
        dVar.p(fVar, 0, appnomixAnalyticsEvent.eventID);
        dVar.f(fVar, 1, bVarArr[1], appnomixAnalyticsEvent.eventType);
        dVar.p(fVar, 2, appnomixAnalyticsEvent.userTimestamp);
        dVar.p(fVar, 3, appnomixAnalyticsEvent.source);
        dVar.f(fVar, 4, bVarArr[4], appnomixAnalyticsEvent.payload);
    }

    public final String component1() {
        return this.eventID;
    }

    public final AnalyticsEventType component2() {
        return this.eventType;
    }

    public final String component3() {
        return this.userTimestamp;
    }

    public final String component4() {
        return this.source;
    }

    public final Map<String, String> component5() {
        return this.payload;
    }

    public final AppnomixAnalyticsEvent copy(String str, AnalyticsEventType analyticsEventType, String str2, String str3, Map<String, String> map) {
        o.e(str, "eventID");
        o.e(analyticsEventType, "eventType");
        o.e(str2, "userTimestamp");
        o.e(str3, "source");
        o.e(map, "payload");
        return new AppnomixAnalyticsEvent(str, analyticsEventType, str2, str3, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppnomixAnalyticsEvent)) {
            return false;
        }
        AppnomixAnalyticsEvent appnomixAnalyticsEvent = (AppnomixAnalyticsEvent) obj;
        return o.a(this.eventID, appnomixAnalyticsEvent.eventID) && this.eventType == appnomixAnalyticsEvent.eventType && o.a(this.userTimestamp, appnomixAnalyticsEvent.userTimestamp) && o.a(this.source, appnomixAnalyticsEvent.source) && o.a(this.payload, appnomixAnalyticsEvent.payload);
    }

    public final String getEventID() {
        return this.eventID;
    }

    public final AnalyticsEventType getEventType() {
        return this.eventType;
    }

    public final Map<String, String> getPayload() {
        return this.payload;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getUserTimestamp() {
        return this.userTimestamp;
    }

    public int hashCode() {
        int hashCode = this.eventType.hashCode();
        int hashCode2 = this.userTimestamp.hashCode();
        int hashCode3 = this.source.hashCode();
        return this.payload.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.eventID.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "AppnomixAnalyticsEvent(eventID=" + this.eventID + ", eventType=" + this.eventType + ", userTimestamp=" + this.userTimestamp + ", source=" + this.source + ", payload=" + this.payload + ')';
    }

    public AppnomixAnalyticsEvent(String str, AnalyticsEventType analyticsEventType, String str2, String str3, Map<String, String> map) {
        o.e(str, "eventID");
        o.e(analyticsEventType, "eventType");
        o.e(str2, "userTimestamp");
        o.e(str3, "source");
        o.e(map, "payload");
        this.eventID = str;
        this.eventType = analyticsEventType;
        this.userTimestamp = str2;
        this.source = str3;
        this.payload = map;
    }
}
