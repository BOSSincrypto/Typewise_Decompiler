package ch.icoaching.wrio;

import F2.m;
import H2.f;
import I2.d;
import J2.C0;
import J2.C0300f;
import J2.C0306i;
import J2.C0317n0;
import J2.C0326s0;
import J2.F;
import J2.G0;
import J2.K;
import J2.V;
import androidx.work.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.uuid.Uuid;
import l0.t;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\b\b\u0018\u0000 P2\u00020\u0001:\u0002QRBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013B\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0010\u0010+\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b+\u0010%J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b0\u0010/J\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\"J\u0010\u00104\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b4\u0010/J\u001a\u00106\u001a\u00020\u00052\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010\"R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u00108\u0012\u0004\b=\u0010;\u001a\u0004\b<\u0010\"R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010>\u0012\u0004\b?\u0010;\u001a\u0004\b\u0006\u0010%R \u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010>\u0012\u0004\b@\u0010;\u001a\u0004\b\u0007\u0010%R \u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u00108\u0012\u0004\bB\u0010;\u001a\u0004\bA\u0010\"R \u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010C\u0012\u0004\bE\u0010;\u001a\u0004\bD\u0010)R \u0010\u000b\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010>\u0012\u0004\bF\u0010;\u001a\u0004\b\u000b\u0010%R \u0010\f\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010>\u0012\u0004\bG\u0010;\u001a\u0004\b\f\u0010%R&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010H\u0012\u0004\bJ\u0010;\u001a\u0004\bI\u0010-R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010K\u0012\u0004\bM\u0010;\u001a\u0004\bL\u0010/R \u0010\u0011\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010K\u0012\u0004\bO\u0010;\u001a\u0004\bN\u0010/¨\u0006S"}, d2 = {"Lch/icoaching/wrio/StatisticsModel;", "", "", "matomoId", "firstAppVersion", "", "isOfflineMode", "isSubscriptionActive", "layoutType", "", "installDate", "isAutocorrectionEnabled", "isSmartBarEnabled", "", "languages", "", "wordCountUnique", "wordCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;JZZLjava/util/List;II)V", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;JZZLjava/util/List;IILJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/StatisticsModel;LI2/d;LH2/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "()J", "component7", "component8", "component9", "()Ljava/util/List;", "component10", "()I", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;JZZLjava/util/List;II)Lch/icoaching/wrio/StatisticsModel;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMatomoId", "getMatomoId$annotations", "()V", "getFirstAppVersion", "getFirstAppVersion$annotations", "Z", "isOfflineMode$annotations", "isSubscriptionActive$annotations", "getLayoutType", "getLayoutType$annotations", "J", "getInstallDate", "getInstallDate$annotations", "isAutocorrectionEnabled$annotations", "isSmartBarEnabled$annotations", "Ljava/util/List;", "getLanguages", "getLanguages$annotations", "I", "getWordCountUnique", "getWordCountUnique$annotations", "getWordCount", "getWordCount$annotations", "Companion", "b", "a", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@m
public final class StatisticsModel {
    /* access modifiers changed from: private */
    public static final F2.b[] $childSerializers = {null, null, null, null, null, null, null, null, new C0300f(G0.f622a), null, null};
    public static final a Companion = new a((i) null);
    private final String firstAppVersion;
    private final long installDate;
    private final boolean isAutocorrectionEnabled;
    private final boolean isOfflineMode;
    private final boolean isSmartBarEnabled;
    private final boolean isSubscriptionActive;
    private final List<String> languages;
    private final String layoutType;
    private final String matomoId;
    private final int wordCount;
    private final int wordCountUnique;

    public static final class a {
        private a() {
        }

        public final F2.b serializer() {
            return b.f9047a;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public /* synthetic */ class b implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final b f9047a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f9048b;

        static {
            b bVar = new b();
            f9047a = bVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.StatisticsModel", bVar, 11);
            s0Var.p("matomoId", false);
            s0Var.p("firstAppVersion", false);
            s0Var.p("isOfflineMode", false);
            s0Var.p("isSubscriptionActive", false);
            s0Var.p("layoutType", false);
            s0Var.p("installDate", false);
            s0Var.p("isAutocorrectionEnabled", false);
            s0Var.p("isSmartBarEnabled", false);
            s0Var.p("languages", false);
            s0Var.p("wordCountUnique", false);
            s0Var.p("wordCount", false);
            f9048b = s0Var;
        }

        private b() {
        }

        public final f a() {
            return f9048b;
        }

        public final F2.b[] c() {
            F2.b bVar = StatisticsModel.$childSerializers[8];
            G0 g02 = G0.f622a;
            C0306i iVar = C0306i.f706a;
            K k4 = K.f636a;
            return new F2.b[]{g02, g02, iVar, iVar, g02, V.f666a, iVar, iVar, bVar, k4, k4};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.util.List} */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e7, code lost:
            r4 = 10;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ch.icoaching.wrio.StatisticsModel b(I2.e r42) {
            /*
                r41 = this;
                r0 = r42
                java.lang.String r1 = "decoder"
                kotlin.jvm.internal.o.e(r0, r1)
                H2.f r1 = f9048b
                I2.c r0 = r0.d(r1)
                F2.b[] r2 = ch.icoaching.wrio.StatisticsModel.$childSerializers
                boolean r3 = r0.p()
                r4 = 10
                r5 = 9
                r6 = 7
                r7 = 6
                r8 = 5
                r9 = 3
                r10 = 4
                r11 = 2
                r12 = 8
                r13 = 1
                r14 = 0
                r15 = 0
                if (r3 == 0) goto L_0x0072
                java.lang.String r3 = r0.z(r1, r14)
                java.lang.String r13 = r0.z(r1, r13)
                boolean r11 = r0.n(r1, r11)
                boolean r9 = r0.n(r1, r9)
                java.lang.String r10 = r0.z(r1, r10)
                long r16 = r0.r(r1, r8)
                boolean r7 = r0.n(r1, r7)
                boolean r6 = r0.n(r1, r6)
                r2 = r2[r12]
                java.lang.Object r2 = r0.E(r1, r12, r2, r15)
                java.util.List r2 = (java.util.List) r2
                int r5 = r0.v(r1, r5)
                int r4 = r0.v(r1, r4)
                r8 = 2047(0x7ff, float:2.868E-42)
                r37 = r2
                r28 = r3
                r39 = r4
                r38 = r5
                r36 = r6
                r35 = r7
                r27 = r8
                r31 = r9
                r32 = r10
                r30 = r11
                r29 = r13
                r33 = r16
                goto L_0x0110
            L_0x0072:
                r16 = 0
                r25 = r13
                r3 = r14
                r18 = r3
                r19 = r18
                r13 = r15
                r20 = r13
                r21 = r20
                r22 = r21
                r23 = r16
                r15 = r19
                r16 = r15
                r17 = r16
            L_0x008a:
                if (r25 == 0) goto L_0x00f8
                int r11 = r0.e(r1)
                switch(r11) {
                    case -1: goto L_0x00f3;
                    case 0: goto L_0x00ea;
                    case 1: goto L_0x00df;
                    case 2: goto L_0x00d7;
                    case 3: goto L_0x00d0;
                    case 4: goto L_0x00c9;
                    case 5: goto L_0x00c2;
                    case 6: goto L_0x00bb;
                    case 7: goto L_0x00b4;
                    case 8: goto L_0x00a8;
                    case 9: goto L_0x00a1;
                    case 10: goto L_0x0099;
                    default: goto L_0x0093;
                }
            L_0x0093:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>((int) r11)
                throw r0
            L_0x0099:
                int r3 = r0.v(r1, r4)
                r14 = r14 | 1024(0x400, float:1.435E-42)
            L_0x009f:
                r11 = 2
                goto L_0x008a
            L_0x00a1:
                int r15 = r0.v(r1, r5)
                r14 = r14 | 512(0x200, float:7.175E-43)
                goto L_0x009f
            L_0x00a8:
                r11 = r2[r12]
                java.lang.Object r11 = r0.E(r1, r12, r11, r13)
                r13 = r11
                java.util.List r13 = (java.util.List) r13
                r14 = r14 | 256(0x100, float:3.59E-43)
                goto L_0x009f
            L_0x00b4:
                boolean r16 = r0.n(r1, r6)
                r14 = r14 | 128(0x80, float:1.794E-43)
                goto L_0x009f
            L_0x00bb:
                boolean r17 = r0.n(r1, r7)
                r14 = r14 | 64
                goto L_0x009f
            L_0x00c2:
                long r23 = r0.r(r1, r8)
                r14 = r14 | 32
                goto L_0x009f
            L_0x00c9:
                java.lang.String r22 = r0.z(r1, r10)
                r14 = r14 | 16
                goto L_0x009f
            L_0x00d0:
                boolean r18 = r0.n(r1, r9)
                r14 = r14 | 8
                goto L_0x009f
            L_0x00d7:
                r11 = 2
                boolean r19 = r0.n(r1, r11)
                r14 = r14 | 4
                goto L_0x008a
            L_0x00df:
                r4 = 1
                r11 = 2
                java.lang.String r21 = r0.z(r1, r4)
                r14 = r14 | 2
            L_0x00e7:
                r4 = 10
                goto L_0x008a
            L_0x00ea:
                r4 = 0
                r11 = 2
                java.lang.String r20 = r0.z(r1, r4)
                r14 = r14 | 1
                goto L_0x00e7
            L_0x00f3:
                r4 = 0
                r11 = 2
                r25 = r4
                goto L_0x00e7
            L_0x00f8:
                r39 = r3
                r37 = r13
                r27 = r14
                r38 = r15
                r36 = r16
                r35 = r17
                r31 = r18
                r30 = r19
                r28 = r20
                r29 = r21
                r32 = r22
                r33 = r23
            L_0x0110:
                r0.c(r1)
                ch.icoaching.wrio.StatisticsModel r0 = new ch.icoaching.wrio.StatisticsModel
                r40 = 0
                r26 = r0
                r26.<init>(r27, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r39, r40)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.StatisticsModel.b.b(I2.e):ch.icoaching.wrio.StatisticsModel");
        }

        /* renamed from: g */
        public final void e(I2.f fVar, StatisticsModel statisticsModel) {
            o.e(fVar, "encoder");
            o.e(statisticsModel, "value");
            f fVar2 = f9048b;
            d d4 = fVar.d(fVar2);
            StatisticsModel.write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease(statisticsModel, d4, fVar2);
            d4.c(fVar2);
        }
    }

    public /* synthetic */ StatisticsModel(int i4, String str, String str2, boolean z3, boolean z4, String str3, long j4, boolean z5, boolean z6, List list, int i5, int i6, C0 c02) {
        if (2047 != (i4 & 2047)) {
            C0317n0.a(i4, 2047, b.f9047a.a());
        }
        this.matomoId = str;
        this.firstAppVersion = str2;
        this.isOfflineMode = z3;
        this.isSubscriptionActive = z4;
        this.layoutType = str3;
        this.installDate = j4;
        this.isAutocorrectionEnabled = z5;
        this.isSmartBarEnabled = z6;
        this.languages = list;
        this.wordCountUnique = i5;
        this.wordCount = i6;
    }

    public static /* synthetic */ StatisticsModel copy$default(StatisticsModel statisticsModel, String str, String str2, boolean z3, boolean z4, String str3, long j4, boolean z5, boolean z6, List list, int i4, int i5, int i6, Object obj) {
        StatisticsModel statisticsModel2 = statisticsModel;
        int i7 = i6;
        return statisticsModel.copy((i7 & 1) != 0 ? statisticsModel2.matomoId : str, (i7 & 2) != 0 ? statisticsModel2.firstAppVersion : str2, (i7 & 4) != 0 ? statisticsModel2.isOfflineMode : z3, (i7 & 8) != 0 ? statisticsModel2.isSubscriptionActive : z4, (i7 & 16) != 0 ? statisticsModel2.layoutType : str3, (i7 & 32) != 0 ? statisticsModel2.installDate : j4, (i7 & 64) != 0 ? statisticsModel2.isAutocorrectionEnabled : z5, (i7 & Uuid.SIZE_BITS) != 0 ? statisticsModel2.isSmartBarEnabled : z6, (i7 & 256) != 0 ? statisticsModel2.languages : list, (i7 & 512) != 0 ? statisticsModel2.wordCountUnique : i4, (i7 & 1024) != 0 ? statisticsModel2.wordCount : i5);
    }

    public static /* synthetic */ void getFirstAppVersion$annotations() {
    }

    public static /* synthetic */ void getInstallDate$annotations() {
    }

    public static /* synthetic */ void getLanguages$annotations() {
    }

    public static /* synthetic */ void getLayoutType$annotations() {
    }

    public static /* synthetic */ void getMatomoId$annotations() {
    }

    public static /* synthetic */ void getWordCount$annotations() {
    }

    public static /* synthetic */ void getWordCountUnique$annotations() {
    }

    public static /* synthetic */ void isAutocorrectionEnabled$annotations() {
    }

    public static /* synthetic */ void isOfflineMode$annotations() {
    }

    public static /* synthetic */ void isSmartBarEnabled$annotations() {
    }

    public static /* synthetic */ void isSubscriptionActive$annotations() {
    }

    public static final /* synthetic */ void write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease(StatisticsModel statisticsModel, d dVar, f fVar) {
        F2.b[] bVarArr = $childSerializers;
        dVar.p(fVar, 0, statisticsModel.matomoId);
        dVar.p(fVar, 1, statisticsModel.firstAppVersion);
        dVar.j(fVar, 2, statisticsModel.isOfflineMode);
        dVar.j(fVar, 3, statisticsModel.isSubscriptionActive);
        dVar.p(fVar, 4, statisticsModel.layoutType);
        dVar.t(fVar, 5, statisticsModel.installDate);
        dVar.j(fVar, 6, statisticsModel.isAutocorrectionEnabled);
        dVar.j(fVar, 7, statisticsModel.isSmartBarEnabled);
        dVar.f(fVar, 8, bVarArr[8], statisticsModel.languages);
        dVar.z(fVar, 9, statisticsModel.wordCountUnique);
        dVar.z(fVar, 10, statisticsModel.wordCount);
    }

    public final String component1() {
        return this.matomoId;
    }

    public final int component10() {
        return this.wordCountUnique;
    }

    public final int component11() {
        return this.wordCount;
    }

    public final String component2() {
        return this.firstAppVersion;
    }

    public final boolean component3() {
        return this.isOfflineMode;
    }

    public final boolean component4() {
        return this.isSubscriptionActive;
    }

    public final String component5() {
        return this.layoutType;
    }

    public final long component6() {
        return this.installDate;
    }

    public final boolean component7() {
        return this.isAutocorrectionEnabled;
    }

    public final boolean component8() {
        return this.isSmartBarEnabled;
    }

    public final List<String> component9() {
        return this.languages;
    }

    public final StatisticsModel copy(String str, String str2, boolean z3, boolean z4, String str3, long j4, boolean z5, boolean z6, List<String> list, int i4, int i5) {
        o.e(str, "matomoId");
        String str4 = str2;
        o.e(str4, "firstAppVersion");
        String str5 = str3;
        o.e(str5, "layoutType");
        List<String> list2 = list;
        o.e(list2, "languages");
        return new StatisticsModel(str, str4, z3, z4, str5, j4, z5, z6, list2, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatisticsModel)) {
            return false;
        }
        StatisticsModel statisticsModel = (StatisticsModel) obj;
        return o.a(this.matomoId, statisticsModel.matomoId) && o.a(this.firstAppVersion, statisticsModel.firstAppVersion) && this.isOfflineMode == statisticsModel.isOfflineMode && this.isSubscriptionActive == statisticsModel.isSubscriptionActive && o.a(this.layoutType, statisticsModel.layoutType) && this.installDate == statisticsModel.installDate && this.isAutocorrectionEnabled == statisticsModel.isAutocorrectionEnabled && this.isSmartBarEnabled == statisticsModel.isSmartBarEnabled && o.a(this.languages, statisticsModel.languages) && this.wordCountUnique == statisticsModel.wordCountUnique && this.wordCount == statisticsModel.wordCount;
    }

    public final String getFirstAppVersion() {
        return this.firstAppVersion;
    }

    public final long getInstallDate() {
        return this.installDate;
    }

    public final List<String> getLanguages() {
        return this.languages;
    }

    public final String getLayoutType() {
        return this.layoutType;
    }

    public final String getMatomoId() {
        return this.matomoId;
    }

    public final int getWordCount() {
        return this.wordCount;
    }

    public final int getWordCountUnique() {
        return this.wordCountUnique;
    }

    public int hashCode() {
        return (((((((((((((((((((this.matomoId.hashCode() * 31) + this.firstAppVersion.hashCode()) * 31) + c.a(this.isOfflineMode)) * 31) + c.a(this.isSubscriptionActive)) * 31) + this.layoutType.hashCode()) * 31) + t.a(this.installDate)) * 31) + c.a(this.isAutocorrectionEnabled)) * 31) + c.a(this.isSmartBarEnabled)) * 31) + this.languages.hashCode()) * 31) + this.wordCountUnique) * 31) + this.wordCount;
    }

    public final boolean isAutocorrectionEnabled() {
        return this.isAutocorrectionEnabled;
    }

    public final boolean isOfflineMode() {
        return this.isOfflineMode;
    }

    public final boolean isSmartBarEnabled() {
        return this.isSmartBarEnabled;
    }

    public final boolean isSubscriptionActive() {
        return this.isSubscriptionActive;
    }

    public String toString() {
        return "StatisticsModel(matomoId=" + this.matomoId + ", firstAppVersion=" + this.firstAppVersion + ", isOfflineMode=" + this.isOfflineMode + ", isSubscriptionActive=" + this.isSubscriptionActive + ", layoutType=" + this.layoutType + ", installDate=" + this.installDate + ", isAutocorrectionEnabled=" + this.isAutocorrectionEnabled + ", isSmartBarEnabled=" + this.isSmartBarEnabled + ", languages=" + this.languages + ", wordCountUnique=" + this.wordCountUnique + ", wordCount=" + this.wordCount + ')';
    }

    public StatisticsModel(String str, String str2, boolean z3, boolean z4, String str3, long j4, boolean z5, boolean z6, List<String> list, int i4, int i5) {
        o.e(str, "matomoId");
        o.e(str2, "firstAppVersion");
        o.e(str3, "layoutType");
        o.e(list, "languages");
        this.matomoId = str;
        this.firstAppVersion = str2;
        this.isOfflineMode = z3;
        this.isSubscriptionActive = z4;
        this.layoutType = str3;
        this.installDate = j4;
        this.isAutocorrectionEnabled = z5;
        this.isSmartBarEnabled = z6;
        this.languages = list;
        this.wordCountUnique = i4;
        this.wordCount = i5;
    }
}
