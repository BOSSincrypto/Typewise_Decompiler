package ch.icoaching.typewise.config;

import F2.m;
import H2.f;
import J2.B;
import J2.C0;
import J2.C0300f;
import J2.C0306i;
import J2.C0317n0;
import J2.C0320p;
import J2.C0326s0;
import J2.C0329u;
import J2.E;
import J2.F;
import J2.G0;
import J2.K;
import J2.O;
import J2.Q;
import com.capacitorjs.plugins.localnotifications.LocalNotificationManager;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.uuid.Uuid;
import kotlinx.serialization.UnknownFieldException;
import o2.C0840a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u001c\b\b\u0018\u0000 @2\u00020\u0001:\u0006A.2\u001f:)BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011Bo\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJl\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0018\b\u0002\u0010\n\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R'\u0010\n\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u00106\u0012\u0004\b9\u00101\u001a\u0004\b7\u00108R \u0010\u000e\u001a\u00020\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b=\u00101\u001a\u0004\b:\u0010<R(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u0010-\u0012\u0004\b?\u00101\u001a\u0004\b>\u0010/¨\u0006B"}, d2 = {"Lch/icoaching/typewise/config/CompanyConfig;", "", "Lch/icoaching/typewise/config/CompanyConfig$Name;", "name", "", "", "authorizedClientUIDs", "", "Lch/icoaching/typewise/misc/Language;", "Lch/icoaching/typewise/config/CompanyConfig$d;", "languages", "Lch/icoaching/typewise/config/CompanyConfig$c;", "globalLibrarySettings", "Lch/icoaching/typewise/config/CompanyConfig$b;", "correctionConfig", "specialConfigs", "<init>", "(Lch/icoaching/typewise/config/CompanyConfig$Name;Ljava/util/List;Ljava/util/Map;Lch/icoaching/typewise/config/CompanyConfig$c;Lch/icoaching/typewise/config/CompanyConfig$b;Ljava/util/List;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/typewise/config/CompanyConfig$Name;Ljava/util/List;Ljava/util/Map;Lch/icoaching/typewise/config/CompanyConfig$c;Lch/icoaching/typewise/config/CompanyConfig$b;Ljava/util/List;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "j", "(Lch/icoaching/typewise/config/CompanyConfig;LI2/d;LH2/f;)V", "b", "(Lch/icoaching/typewise/config/CompanyConfig$Name;Ljava/util/List;Ljava/util/Map;Lch/icoaching/typewise/config/CompanyConfig$c;Lch/icoaching/typewise/config/CompanyConfig$b;Ljava/util/List;)Lch/icoaching/typewise/config/CompanyConfig;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lch/icoaching/typewise/config/CompanyConfig$Name;", "h", "()Lch/icoaching/typewise/config/CompanyConfig$Name;", "Ljava/util/List;", "d", "()Ljava/util/List;", "getAuthorizedClientUIDs$annotations", "()V", "c", "Ljava/util/Map;", "g", "()Ljava/util/Map;", "Lch/icoaching/typewise/config/CompanyConfig$c;", "f", "()Lch/icoaching/typewise/config/CompanyConfig$c;", "getGlobalLibrarySettings$annotations", "e", "Lch/icoaching/typewise/config/CompanyConfig$b;", "()Lch/icoaching/typewise/config/CompanyConfig$b;", "getCorrectionConfig$annotations", "i", "getSpecialConfigs$annotations", "Companion", "Name", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
@m
public final class CompanyConfig {
    public static final a Companion = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final F2.b[] f8120g;

    /* renamed from: a  reason: collision with root package name */
    private final Name f8121a;

    /* renamed from: b  reason: collision with root package name */
    private final List f8122b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f8123c;

    /* renamed from: d  reason: collision with root package name */
    private final c f8124d;

    /* renamed from: e  reason: collision with root package name */
    private final b f8125e;

    /* renamed from: f  reason: collision with root package name */
    private final List f8126f;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lch/icoaching/typewise/config/CompanyConfig$Name;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TEST", "DEFAULT", "SUPERHUMAN", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Name {
        TEST("test"),
        DEFAULT(LocalNotificationManager.DEFAULT_NOTIFICATION_CHANNEL_ID),
        SUPERHUMAN("superhuman");
        
        private final String value;

        static {
            Name[] a4;
            f8128b = kotlin.enums.a.a(a4);
        }

        private Name(String str) {
            this.value = str;
        }

        public static C0840a getEntries() {
            return f8128b;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public static final class a {
        private a() {
        }

        public final F2.b serializer() {
            return e.f8231a;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    @m
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u0000 ^2\u00020\u0001:\u0006/<95AEBç\u0002\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0012\u0018\u00010\u0011\u0012\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0012\u0018\u00010\u0011\u0012 \u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0011\u0018\u00010\u0011\u0012\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0012\u0018\u00010\u0011\u0012\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0012\u0018\u00010\u0011\u0012 \u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0011\u0018\u00010\u0011\u0012\u001a\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0012\u0018\u00010\u0011\u0012\u001a\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0012\u0018\u00010\u0011\u0012\u001a\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0012\u0018\u00010\u0011\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b8\u00104\u001a\u0004\b7\u0010)R \u0010\b\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u00106\u0012\u0004\b;\u00104\u001a\u0004\b:\u0010)R \u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u00104\u001a\u0004\b>\u0010?R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR \u0010\u0010\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b>\u0010I\u0012\u0004\bL\u00104\u001a\u0004\bJ\u0010KR-\u0010\u0013\u001a\u0018\u0012\b\u0012\u00060\u0006j\u0002`M\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00120\u00118\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b5\u0010PR-\u0010\u0014\u001a\u0018\u0012\b\u0012\u00060\u0006j\u0002`M\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00120\u00118\u0006¢\u0006\f\n\u0004\bG\u0010O\u001a\u0004\b9\u0010PR<\u0010\u0015\u001a\u001e\u0012\b\u0012\u00060\u0006j\u0002`M\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00110\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\bC\u0010O\u0012\u0004\bR\u00104\u001a\u0004\bQ\u0010PR6\u0010\u0016\u001a\u0018\u0012\b\u0012\u00060\u0006j\u0002`M\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00120\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\bS\u0010O\u0012\u0004\bT\u00104\u001a\u0004\bA\u0010PR6\u0010\u0017\u001a\u0018\u0012\b\u0012\u00060\u0006j\u0002`M\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00120\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\bU\u0010O\u0012\u0004\bV\u00104\u001a\u0004\bE\u0010PRD\u0010\u0018\u001a&\u0012\b\u0012\u00060\u0006j\u0002`M\u0012\u0018\u0012\u0016\u0012\b\u0012\u00060\u0006j\u0002`W\u0012\b\u0012\u00060\u0006j\u0002`W0\u00110\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010O\u0012\u0004\bX\u00104\u001a\u0004\bN\u0010PR<\u0010\u0019\u001a\u001e\u0012\b\u0012\u00060\u0006j\u0002`M\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0006j\u0002`W0\u0012\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010O\u0012\u0004\bY\u00104\u001a\u0004\bU\u0010PR8\u0010\u001a\u001a\u001a\u0012\b\u0012\u00060\u0006j\u0002`M\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0012\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\bZ\u0010O\u0012\u0004\b[\u00104\u001a\u0004\b<\u0010PR8\u0010\u001b\u001a\u001a\u0012\b\u0012\u00060\u0006j\u0002`M\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0012\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b\\\u0010O\u0012\u0004\b]\u00104\u001a\u0004\bS\u0010P¨\u0006_"}, d2 = {"Lch/icoaching/typewise/config/CompanyConfig$b;", "", "", "seen0", "", "isServer", "", "baseModelName", "ngramVersion", "Lch/icoaching/typewise/config/CompanyConfig$b$a;", "editDistanceWeights", "Lch/icoaching/typewise/config/CompanyConfig$b$d;", "settings", "Lch/icoaching/typewise/config/CompanyConfig$b$c;", "properties", "Lch/icoaching/typewise/config/CompanyConfig$b$b;", "neuralProperties", "", "", "abbreviations", "blocklist", "casingOverwrite", "dontCorrectAwayFromWords", "dontPredictWords", "hardcodedCorrections", "wordsToCheckEvenIfInCasingDictionary", "blocklistWordListNames", "wordListBlocklistsNotToShowInCorrections", "LJ2/C0;", "serializationConstructorMarker", "<init>", "(IZLjava/lang/String;Ljava/lang/String;Lch/icoaching/typewise/config/CompanyConfig$b$a;Lch/icoaching/typewise/config/CompanyConfig$b$d;Lch/icoaching/typewise/config/CompanyConfig$b$c;Lch/icoaching/typewise/config/CompanyConfig$b$b;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "n", "(Lch/icoaching/typewise/config/CompanyConfig$b;LI2/d;LH2/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "m", "()Z", "isServer$annotations", "()V", "b", "Ljava/lang/String;", "getBaseModelName", "getBaseModelName$annotations", "c", "getNgramVersion", "getNgramVersion$annotations", "d", "Lch/icoaching/typewise/config/CompanyConfig$b$a;", "g", "()Lch/icoaching/typewise/config/CompanyConfig$b$a;", "getEditDistanceWeights$annotations", "e", "Lch/icoaching/typewise/config/CompanyConfig$b$d;", "j", "()Lch/icoaching/typewise/config/CompanyConfig$b$d;", "f", "Lch/icoaching/typewise/config/CompanyConfig$b$c;", "i", "()Lch/icoaching/typewise/config/CompanyConfig$b$c;", "Lch/icoaching/typewise/config/CompanyConfig$b$b;", "getNeuralProperties", "()Lch/icoaching/typewise/config/CompanyConfig$b$b;", "getNeuralProperties$annotations", "Lch/icoaching/typewise/misc/Language;", "h", "Ljava/util/Map;", "()Ljava/util/Map;", "getCasingOverwrite", "getCasingOverwrite$annotations", "k", "getDontCorrectAwayFromWords$annotations", "l", "getDontPredictWords$annotations", "Lch/icoaching/typewise/text/Word;", "getHardcodedCorrections$annotations", "getWordsToCheckEvenIfInCasingDictionary$annotations", "o", "getBlocklistWordListNames$annotations", "p", "getWordListBlocklistsNotToShowInCorrections$annotations", "q", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
    public static final class b {

        /* renamed from: q  reason: collision with root package name */
        public static final f f8129q = new f((i) null);
        /* access modifiers changed from: private */

        /* renamed from: r  reason: collision with root package name */
        public static final F2.b[] f8130r;

        /* renamed from: a  reason: collision with root package name */
        private final boolean f8131a;

        /* renamed from: b  reason: collision with root package name */
        private final String f8132b;

        /* renamed from: c  reason: collision with root package name */
        private final String f8133c;

        /* renamed from: d  reason: collision with root package name */
        private final a f8134d;

        /* renamed from: e  reason: collision with root package name */
        private final d f8135e;

        /* renamed from: f  reason: collision with root package name */
        private final c f8136f;

        /* renamed from: g  reason: collision with root package name */
        private final C0131b f8137g;

        /* renamed from: h  reason: collision with root package name */
        private final Map f8138h;

        /* renamed from: i  reason: collision with root package name */
        private final Map f8139i;

        /* renamed from: j  reason: collision with root package name */
        private final Map f8140j;

        /* renamed from: k  reason: collision with root package name */
        private final Map f8141k;

        /* renamed from: l  reason: collision with root package name */
        private final Map f8142l;

        /* renamed from: m  reason: collision with root package name */
        private final Map f8143m;

        /* renamed from: n  reason: collision with root package name */
        private final Map f8144n;

        /* renamed from: o  reason: collision with root package name */
        private final Map f8145o;

        /* renamed from: p  reason: collision with root package name */
        private final Map f8146p;

        @m
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\b\u0018\u0000 92\u00020\u0001:\u0002#(B[\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b#\u0010%R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010$\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010%R \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R \u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010$\u0012\u0004\b1\u0010'\u001a\u0004\b0\u0010%R \u0010\n\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010$\u0012\u0004\b3\u0010'\u001a\u0004\b2\u0010%R \u0010\u000b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010,\u0012\u0004\b5\u0010'\u001a\u0004\b4\u0010.R \u0010\f\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010$\u0012\u0004\b6\u0010'\u001a\u0004\b(\u0010%R \u0010\r\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u0010$\u0012\u0004\b8\u0010'\u001a\u0004\b+\u0010%¨\u0006:"}, d2 = {"Lch/icoaching/typewise/config/CompanyConfig$b$a;", "", "", "seen0", "", "deletionWeight", "insertionWeight", "", "substitutionWeight", "transpositionWeight", "lowerInsertionWeight", "lowerTranspositionWeight", "increasedDeletionWeight", "increasedSubstitutionWeight", "LJ2/C0;", "serializationConstructorMarker", "<init>", "(IFFDFFDFFLJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "g", "(Lch/icoaching/typewise/config/CompanyConfig$b$a;LI2/d;LH2/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "getDeletionWeight$annotations", "()V", "b", "d", "getInsertionWeight$annotations", "c", "D", "getSubstitutionWeight", "()D", "getSubstitutionWeight$annotations", "f", "getTranspositionWeight$annotations", "e", "getLowerInsertionWeight$annotations", "getLowerTranspositionWeight", "getLowerTranspositionWeight$annotations", "getIncreasedDeletionWeight$annotations", "h", "getIncreasedSubstitutionWeight$annotations", "i", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
        public static final class a {

            /* renamed from: i  reason: collision with root package name */
            public static final C0130b f8147i = new C0130b((i) null);

            /* renamed from: a  reason: collision with root package name */
            private final float f8148a;

            /* renamed from: b  reason: collision with root package name */
            private final float f8149b;

            /* renamed from: c  reason: collision with root package name */
            private final double f8150c;

            /* renamed from: d  reason: collision with root package name */
            private final float f8151d;

            /* renamed from: e  reason: collision with root package name */
            private final float f8152e;

            /* renamed from: f  reason: collision with root package name */
            private final double f8153f;

            /* renamed from: g  reason: collision with root package name */
            private final float f8154g;

            /* renamed from: h  reason: collision with root package name */
            private final float f8155h;

            /* renamed from: ch.icoaching.typewise.config.CompanyConfig$b$a$a  reason: collision with other inner class name */
            public /* synthetic */ class C0129a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final C0129a f8156a;

                /* renamed from: b  reason: collision with root package name */
                private static final H2.f f8157b;

                static {
                    C0129a aVar = new C0129a();
                    f8156a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.CompanyConfig.CorrectionConfig.EditDistanceWeights", aVar, 8);
                    s0Var.p("deletion_weight", false);
                    s0Var.p("insertion_weight", false);
                    s0Var.p("substitution_weight", false);
                    s0Var.p("transposition_weight", false);
                    s0Var.p("lower_insertion_weight", false);
                    s0Var.p("lower_transposition_weight", false);
                    s0Var.p("increased_deletion_weight", false);
                    s0Var.p("increased_substitution_weight", false);
                    f8157b = s0Var;
                }

                private C0129a() {
                }

                public final H2.f a() {
                    return f8157b;
                }

                public final F2.b[] c() {
                    E e4 = E.f616a;
                    C0329u uVar = C0329u.f745a;
                    return new F2.b[]{e4, e4, uVar, e4, e4, uVar, e4, e4};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final a b(I2.e eVar) {
                    float f4;
                    float f5;
                    double d4;
                    float f6;
                    float f7;
                    double d5;
                    float f8;
                    float f9;
                    int i4;
                    I2.e eVar2 = eVar;
                    o.e(eVar2, "decoder");
                    H2.f fVar = f8157b;
                    I2.c d6 = eVar2.d(fVar);
                    if (d6.p()) {
                        float H3 = d6.H(fVar, 0);
                        float H4 = d6.H(fVar, 1);
                        double u3 = d6.u(fVar, 2);
                        float H5 = d6.H(fVar, 3);
                        float H6 = d6.H(fVar, 4);
                        double u4 = d6.u(fVar, 5);
                        float H7 = d6.H(fVar, 6);
                        f9 = H3;
                        f4 = d6.H(fVar, 7);
                        f5 = H7;
                        i4 = 255;
                        f7 = H5;
                        f6 = H6;
                        f8 = H4;
                        d5 = u3;
                        d4 = u4;
                    } else {
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        boolean z3 = true;
                        int i5 = 0;
                        double d7 = 0.0d;
                        double d8 = 0.0d;
                        float f14 = 0.0f;
                        float f15 = 0.0f;
                        while (z3) {
                            int e4 = d6.e(fVar);
                            switch (e4) {
                                case -1:
                                    z3 = false;
                                    continue;
                                case 0:
                                    f10 = d6.H(fVar, 0);
                                    i5 |= 1;
                                    continue;
                                case 1:
                                    f13 = d6.H(fVar, 1);
                                    i5 |= 2;
                                    break;
                                case 2:
                                    d7 = d6.u(fVar, 2);
                                    i5 |= 4;
                                    break;
                                case 3:
                                    f11 = d6.H(fVar, 3);
                                    i5 |= 8;
                                    break;
                                case 4:
                                    f12 = d6.H(fVar, 4);
                                    i5 |= 16;
                                    break;
                                case 5:
                                    d8 = d6.u(fVar, 5);
                                    i5 |= 32;
                                    break;
                                case 6:
                                    f15 = d6.H(fVar, 6);
                                    i5 |= 64;
                                    break;
                                case 7:
                                    f14 = d6.H(fVar, 7);
                                    i5 |= Uuid.SIZE_BITS;
                                    break;
                                default:
                                    throw new UnknownFieldException(e4);
                            }
                        }
                        f9 = f10;
                        f4 = f14;
                        f5 = f15;
                        i4 = i5;
                        f7 = f11;
                        f6 = f12;
                        f8 = f13;
                        d5 = d7;
                        d4 = d8;
                    }
                    d6.c(fVar);
                    return new a(i4, f9, f8, d5, f7, f6, d4, f5, f4, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, a aVar) {
                    o.e(fVar, "encoder");
                    o.e(aVar, "value");
                    H2.f fVar2 = f8157b;
                    I2.d d4 = fVar.d(fVar2);
                    a.g(aVar, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            /* renamed from: ch.icoaching.typewise.config.CompanyConfig$b$a$b  reason: collision with other inner class name */
            public static final class C0130b {
                private C0130b() {
                }

                public final F2.b serializer() {
                    return C0129a.f8156a;
                }

                public /* synthetic */ C0130b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ a(int i4, float f4, float f5, double d4, float f6, float f7, double d5, float f8, float f9, C0 c02) {
                if (255 != (i4 & 255)) {
                    C0317n0.a(i4, 255, C0129a.f8156a.a());
                }
                this.f8148a = f4;
                this.f8149b = f5;
                this.f8150c = d4;
                this.f8151d = f6;
                this.f8152e = f7;
                this.f8153f = d5;
                this.f8154g = f8;
                this.f8155h = f9;
            }

            public static final /* synthetic */ void g(a aVar, I2.d dVar, H2.f fVar) {
                dVar.D(fVar, 0, aVar.f8148a);
                dVar.D(fVar, 1, aVar.f8149b);
                dVar.g(fVar, 2, aVar.f8150c);
                dVar.D(fVar, 3, aVar.f8151d);
                dVar.D(fVar, 4, aVar.f8152e);
                dVar.g(fVar, 5, aVar.f8153f);
                dVar.D(fVar, 6, aVar.f8154g);
                dVar.D(fVar, 7, aVar.f8155h);
            }

            public final float a() {
                return this.f8148a;
            }

            public final float b() {
                return this.f8154g;
            }

            public final float c() {
                return this.f8155h;
            }

            public final float d() {
                return this.f8149b;
            }

            public final float e() {
                return this.f8152e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Float.compare(this.f8148a, aVar.f8148a) == 0 && Float.compare(this.f8149b, aVar.f8149b) == 0 && Double.compare(this.f8150c, aVar.f8150c) == 0 && Float.compare(this.f8151d, aVar.f8151d) == 0 && Float.compare(this.f8152e, aVar.f8152e) == 0 && Double.compare(this.f8153f, aVar.f8153f) == 0 && Float.compare(this.f8154g, aVar.f8154g) == 0 && Float.compare(this.f8155h, aVar.f8155h) == 0;
            }

            public final float f() {
                return this.f8151d;
            }

            public int hashCode() {
                return (((((((((((((Float.floatToIntBits(this.f8148a) * 31) + Float.floatToIntBits(this.f8149b)) * 31) + Double.doubleToLongBits(this.f8150c)) * 31) + Float.floatToIntBits(this.f8151d)) * 31) + Float.floatToIntBits(this.f8152e)) * 31) + Double.doubleToLongBits(this.f8153f)) * 31) + Float.floatToIntBits(this.f8154g)) * 31) + Float.floatToIntBits(this.f8155h);
            }

            public String toString() {
                float f4 = this.f8148a;
                float f5 = this.f8149b;
                double d4 = this.f8150c;
                float f6 = this.f8151d;
                float f7 = this.f8152e;
                double d5 = this.f8153f;
                float f8 = this.f8154g;
                float f9 = this.f8155h;
                return "EditDistanceWeights(deletionWeight=" + f4 + ", insertionWeight=" + f5 + ", substitutionWeight=" + d4 + ", transpositionWeight=" + f6 + ", lowerInsertionWeight=" + f7 + ", lowerTranspositionWeight=" + d5 + ", increasedDeletionWeight=" + f8 + ", increasedSubstitutionWeight=" + f9 + ")";
            }
        }

        @m
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0010\u001fB#\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lch/icoaching/typewise/config/CompanyConfig$b$b;", "", "", "seen0", "", "includeNeuralNetwork", "LJ2/C0;", "serializationConstructorMarker", "<init>", "(IZLJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "a", "(Lch/icoaching/typewise/config/CompanyConfig$b$b;LI2/d;LH2/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getIncludeNeuralNetwork", "()Z", "getIncludeNeuralNetwork$annotations", "()V", "b", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
        /* renamed from: ch.icoaching.typewise.config.CompanyConfig$b$b  reason: collision with other inner class name */
        public static final class C0131b {

            /* renamed from: b  reason: collision with root package name */
            public static final C0132b f8158b = new C0132b((i) null);

            /* renamed from: a  reason: collision with root package name */
            private final boolean f8159a;

            /* renamed from: ch.icoaching.typewise.config.CompanyConfig$b$b$a */
            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f8160a;

                /* renamed from: b  reason: collision with root package name */
                private static final H2.f f8161b;

                static {
                    a aVar = new a();
                    f8160a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.CompanyConfig.CorrectionConfig.NeuralProperties", aVar, 1);
                    s0Var.p("include_neural_network", false);
                    f8161b = s0Var;
                }

                private a() {
                }

                public final H2.f a() {
                    return f8161b;
                }

                public final F2.b[] c() {
                    return new F2.b[]{C0306i.f706a};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final C0131b b(I2.e eVar) {
                    boolean z3;
                    o.e(eVar, "decoder");
                    H2.f fVar = f8161b;
                    I2.c d4 = eVar.d(fVar);
                    int i4 = 1;
                    if (d4.p()) {
                        z3 = d4.n(fVar, 0);
                    } else {
                        boolean z4 = true;
                        z3 = false;
                        int i5 = 0;
                        while (z4) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z4 = false;
                            } else if (e4 == 0) {
                                z3 = d4.n(fVar, 0);
                                i5 = 1;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        i4 = i5;
                    }
                    d4.c(fVar);
                    return new C0131b(i4, z3, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, C0131b bVar) {
                    o.e(fVar, "encoder");
                    o.e(bVar, "value");
                    H2.f fVar2 = f8161b;
                    I2.d d4 = fVar.d(fVar2);
                    d4.j(fVar2, 0, bVar.f8159a);
                    d4.c(fVar2);
                }
            }

            /* renamed from: ch.icoaching.typewise.config.CompanyConfig$b$b$b  reason: collision with other inner class name */
            public static final class C0132b {
                private C0132b() {
                }

                public final F2.b serializer() {
                    return a.f8160a;
                }

                public /* synthetic */ C0132b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ C0131b(int i4, boolean z3, C0 c02) {
                if (1 != (i4 & 1)) {
                    C0317n0.a(i4, 1, a.f8160a.a());
                }
                this.f8159a = z3;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0131b) && this.f8159a == ((C0131b) obj).f8159a;
            }

            public int hashCode() {
                return androidx.work.c.a(this.f8159a);
            }

            public String toString() {
                boolean z3 = this.f8159a;
                return "NeuralProperties(includeNeuralNetwork=" + z3 + ")";
            }
        }

        @m
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u001f!BO\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010 \u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\"R \u0010\t\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010'\u0012\u0004\b)\u0010$\u001a\u0004\b(\u0010\u0018R \u0010\n\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010'\u0012\u0004\b+\u0010$\u001a\u0004\b*\u0010\u0018¨\u0006,"}, d2 = {"Lch/icoaching/typewise/config/CompanyConfig$b$c;", "", "", "seen0", "", "", "capitalizeAfterPunctuation", "", "ignoreCapitalizationAfterSalutationLanguages", "sosToken", "unknownToken", "LJ2/C0;", "serializationConstructorMarker", "<init>", "(ILjava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "e", "(Lch/icoaching/typewise/config/CompanyConfig$b$c;LI2/d;LH2/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "b", "()Ljava/util/Set;", "getCapitalizeAfterPunctuation$annotations", "()V", "c", "getIgnoreCapitalizationAfterSalutationLanguages$annotations", "Ljava/lang/String;", "d", "getSosToken$annotations", "getUnknownToken", "getUnknownToken$annotations", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
        public static final class c {

            /* renamed from: e  reason: collision with root package name */
            public static final C0133b f8162e = new C0133b((i) null);
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public static final F2.b[] f8163f = {new Q(C0320p.f724a), new Q(G0.f622a), null, null};

            /* renamed from: a  reason: collision with root package name */
            private final Set f8164a;

            /* renamed from: b  reason: collision with root package name */
            private final Set f8165b;

            /* renamed from: c  reason: collision with root package name */
            private final String f8166c;

            /* renamed from: d  reason: collision with root package name */
            private final String f8167d;

            public /* synthetic */ class a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final a f8168a;

                /* renamed from: b  reason: collision with root package name */
                private static final H2.f f8169b;

                static {
                    a aVar = new a();
                    f8168a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.CompanyConfig.CorrectionConfig.Properties", aVar, 4);
                    s0Var.p("capitalize_after_punctuation", false);
                    s0Var.p("ignore_capitalization_after_salutation_languages", false);
                    s0Var.p("sos_token", false);
                    s0Var.p("unknown_token", false);
                    f8169b = s0Var;
                }

                private a() {
                }

                public final H2.f a() {
                    return f8169b;
                }

                public final F2.b[] c() {
                    F2.b[] a4 = c.f8163f;
                    F2.b bVar = a4[0];
                    F2.b bVar2 = a4[1];
                    G0 g02 = G0.f622a;
                    return new F2.b[]{bVar, bVar2, g02, g02};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final c b(I2.e eVar) {
                    String str;
                    String str2;
                    Set set;
                    Set set2;
                    int i4;
                    I2.e eVar2 = eVar;
                    o.e(eVar2, "decoder");
                    H2.f fVar = f8169b;
                    I2.c d4 = eVar2.d(fVar);
                    F2.b[] a4 = c.f8163f;
                    Set set3 = null;
                    if (d4.p()) {
                        String z3 = d4.z(fVar, 2);
                        set = (Set) d4.E(fVar, 1, a4[1], (Object) null);
                        set2 = (Set) d4.E(fVar, 0, a4[0], (Object) null);
                        str = d4.z(fVar, 3);
                        str2 = z3;
                        i4 = 15;
                    } else {
                        boolean z4 = true;
                        int i5 = 0;
                        Set set4 = null;
                        String str3 = null;
                        String str4 = null;
                        while (z4) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z4 = false;
                            } else if (e4 == 0) {
                                set3 = (Set) d4.E(fVar, 0, a4[0], set3);
                                i5 |= 1;
                            } else if (e4 == 1) {
                                set4 = (Set) d4.E(fVar, 1, a4[1], set4);
                                i5 |= 2;
                            } else if (e4 == 2) {
                                str3 = d4.z(fVar, 2);
                                i5 |= 4;
                            } else if (e4 == 3) {
                                str4 = d4.z(fVar, 3);
                                i5 |= 8;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        i4 = i5;
                        set2 = set3;
                        set = set4;
                        str2 = str3;
                        str = str4;
                    }
                    d4.c(fVar);
                    return new c(i4, set2, set, str2, str, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, c cVar) {
                    o.e(fVar, "encoder");
                    o.e(cVar, "value");
                    H2.f fVar2 = f8169b;
                    I2.d d4 = fVar.d(fVar2);
                    c.e(cVar, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            /* renamed from: ch.icoaching.typewise.config.CompanyConfig$b$c$b  reason: collision with other inner class name */
            public static final class C0133b {
                private C0133b() {
                }

                public final F2.b serializer() {
                    return a.f8168a;
                }

                public /* synthetic */ C0133b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ c(int i4, Set set, Set set2, String str, String str2, C0 c02) {
                if (15 != (i4 & 15)) {
                    C0317n0.a(i4, 15, a.f8168a.a());
                }
                this.f8164a = set;
                this.f8165b = set2;
                this.f8166c = str;
                this.f8167d = str2;
            }

            public static final /* synthetic */ void e(c cVar, I2.d dVar, H2.f fVar) {
                F2.b[] bVarArr = f8163f;
                dVar.f(fVar, 0, bVarArr[0], cVar.f8164a);
                dVar.f(fVar, 1, bVarArr[1], cVar.f8165b);
                dVar.p(fVar, 2, cVar.f8166c);
                dVar.p(fVar, 3, cVar.f8167d);
            }

            public final Set b() {
                return this.f8164a;
            }

            public final Set c() {
                return this.f8165b;
            }

            public final String d() {
                return this.f8166c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return o.a(this.f8164a, cVar.f8164a) && o.a(this.f8165b, cVar.f8165b) && o.a(this.f8166c, cVar.f8166c) && o.a(this.f8167d, cVar.f8167d);
            }

            public int hashCode() {
                return (((((this.f8164a.hashCode() * 31) + this.f8165b.hashCode()) * 31) + this.f8166c.hashCode()) * 31) + this.f8167d.hashCode();
            }

            public String toString() {
                Set set = this.f8164a;
                Set set2 = this.f8165b;
                String str = this.f8166c;
                String str2 = this.f8167d;
                return "Properties(capitalizeAfterPunctuation=" + set + ", ignoreCapitalizationAfterSalutationLanguages=" + set2 + ", sosToken=" + str + ", unknownToken=" + str2 + ")";
            }
        }

        @m
        @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0018\u0002\n\u0002\b\u0017\b\b\u0018\u0000 \u00012\u00020\u0001:\u0003=?EB¥\u0002\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u001a\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0018\u00010\u001d\u0012\u0006\u0010!\u001a\u00020\u0012\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u0012\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J'\u00104\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010;\u001a\u00020\u00042\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010>\u0012\u0004\bD\u0010B\u001a\u0004\bC\u0010@R \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bG\u0010B\u001a\u0004\bE\u00107R \u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bH\u0010>\u0012\u0004\bI\u0010B\u001a\u0004\bH\u0010@R \u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\u0012\n\u0004\bJ\u0010K\u0012\u0004\bM\u0010B\u001a\u0004\bJ\u0010LR \u0010\f\u001a\u00020\n8\u0006X\u0004¢\u0006\u0012\n\u0004\bN\u0010K\u0012\u0004\bO\u0010B\u001a\u0004\bN\u0010LR \u0010\r\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bP\u0010>\u0012\u0004\bQ\u0010B\u001a\u0004\bP\u0010@R \u0010\u000e\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bR\u0010>\u0012\u0004\bS\u0010B\u001a\u0004\bR\u0010@R \u0010\u000f\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bT\u0010>\u0012\u0004\bU\u0010B\u001a\u0004\bT\u0010@R \u0010\u0010\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bV\u0010>\u0012\u0004\bW\u0010B\u001a\u0004\bV\u0010@R \u0010\u0011\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bX\u0010Y\u0012\u0004\bZ\u0010B\u001a\u0004\bX\u00109R \u0010\u0013\u001a\u00020\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b[\u0010\\\u0012\u0004\b^\u0010B\u001a\u0004\b[\u0010]R \u0010\u0014\u001a\u00020\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b_\u0010K\u0012\u0004\b`\u0010B\u001a\u0004\b_\u0010LR \u0010\u0015\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\ba\u0010F\u0012\u0004\bc\u0010B\u001a\u0004\bb\u00107R \u0010\u0016\u001a\u00020\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\bd\u0010\\\u0012\u0004\be\u0010B\u001a\u0004\ba\u0010]R \u0010\u0017\u001a\u00020\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\bf\u0010\\\u0012\u0004\bg\u0010B\u001a\u0004\bd\u0010]R \u0010\u0018\u001a\u00020\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\bh\u0010\\\u0012\u0004\bi\u0010B\u001a\u0004\bf\u0010]R \u0010\u0019\u001a\u00020\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\bj\u0010\\\u0012\u0004\bk\u0010B\u001a\u0004\bh\u0010]R \u0010\u001a\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bl\u0010Y\u0012\u0004\bm\u0010B\u001a\u0004\bj\u00109R \u0010\u001b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bn\u0010Y\u0012\u0004\bp\u0010B\u001a\u0004\bo\u00109R \u0010\u001c\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bq\u0010Y\u0012\u0004\br\u0010B\u001a\u0004\bl\u00109R6\u0010 \u001a\u0018\u0012\b\u0012\u00060\u0007j\u0002`s\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d8\u0006X\u0004¢\u0006\u0012\n\u0004\bt\u0010u\u0012\u0004\bw\u0010B\u001a\u0004\bn\u0010vR \u0010!\u001a\u00020\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\bx\u0010\\\u0012\u0004\by\u0010B\u001a\u0004\bq\u0010]R \u0010\"\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bz\u0010>\u0012\u0004\b{\u0010B\u001a\u0004\bt\u0010@R \u0010#\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b|\u0010>\u0012\u0004\b}\u0010B\u001a\u0004\bx\u0010@R \u0010$\u001a\u00020\u00128\u0006X\u0004¢\u0006\u0012\n\u0004\b~\u0010\\\u0012\u0004\b\u0010B\u001a\u0004\bz\u0010]R\"\u0010%\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0014\n\u0005\b\u0001\u0010>\u0012\u0005\b\u0001\u0010B\u001a\u0004\b|\u0010@R#\u0010'\u001a\u00020&8\u0006X\u0004¢\u0006\u0015\n\u0005\b4\u0010\u0001\u0012\u0005\b\u0001\u0010B\u001a\u0005\b~\u0010\u0001R#\u0010(\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010Y\u0012\u0005\b\u0001\u0010B\u001a\u0005\b\u0001\u00109R\"\u0010)\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0014\n\u0004\bK\u0010Y\u0012\u0005\b\u0001\u0010B\u001a\u0005\b\u0001\u00109¨\u0006\u0001"}, d2 = {"Lch/icoaching/typewise/config/CompanyConfig$b$d;", "", "", "seen0", "", "allowCorrectionCompoundNouns", "autoCaps", "", "capitalizationImplementation", "capitalizeFirstWord", "", "compoundNounLengthThreshold", "compoundNounTitleCaseThreshold", "correctAccidentalCapitalization", "correctFirstLineNames", "correctSingleLetterWords", "correctUpperCaseWords", "defaultNumberOfSpaceSplits", "", "defaultPreviousCorrectionBestScore", "ignoreScoresLessThan", "inferenceModel", "keepCurrentWordBias", "languageModelK", "maxEditDistance", "maxEditDistanceSecondSplit", "maxSuggestionLengthDifference", "minNoUniGramCounts", "prefixLength", "", "", "", "singleLettersToAllowAutocorrect", "spaceNeighboursScaling", "spaceSplitOnEachKey", "spaceSplitOnSpaceNeighbours", "splitProbReduction", "transposeAroundSpace", "Lch/icoaching/typewise/config/CompanyConfig$b$d$a;", "uppercaseBias", "verbosityNoSpaceSplit", "verbositySpaceSplit", "LJ2/C0;", "serializationConstructorMarker", "<init>", "(IZZLjava/lang/String;ZDDZZZZIFDLjava/lang/String;FFFFIIILjava/util/Map;FZZFZLch/icoaching/typewise/config/CompanyConfig$b$d$a;IILJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "B", "(Lch/icoaching/typewise/config/CompanyConfig$b$d;LI2/d;LH2/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "getAllowCorrectionCompoundNouns$annotations", "()V", "getAutoCaps", "getAutoCaps$annotations", "c", "Ljava/lang/String;", "getCapitalizationImplementation$annotations", "d", "getCapitalizeFirstWord$annotations", "e", "D", "()D", "getCompoundNounLengthThreshold$annotations", "f", "getCompoundNounTitleCaseThreshold$annotations", "g", "getCorrectAccidentalCapitalization$annotations", "h", "getCorrectFirstLineNames$annotations", "i", "getCorrectSingleLetterWords$annotations", "j", "getCorrectUpperCaseWords$annotations", "k", "I", "getDefaultNumberOfSpaceSplits$annotations", "l", "F", "()F", "getDefaultPreviousCorrectionBestScore$annotations", "m", "getIgnoreScoresLessThan$annotations", "n", "getInferenceModel", "getInferenceModel$annotations", "o", "getKeepCurrentWordBias$annotations", "p", "getLanguageModelK$annotations", "q", "getMaxEditDistance$annotations", "r", "getMaxEditDistanceSecondSplit$annotations", "s", "getMaxSuggestionLengthDifference$annotations", "t", "getMinNoUniGramCounts", "getMinNoUniGramCounts$annotations", "u", "getPrefixLength$annotations", "Lch/icoaching/typewise/misc/Language;", "v", "Ljava/util/Map;", "()Ljava/util/Map;", "getSingleLettersToAllowAutocorrect$annotations", "w", "getSpaceNeighboursScaling$annotations", "x", "getSpaceSplitOnEachKey$annotations", "y", "getSpaceSplitOnSpaceNeighbours$annotations", "z", "getSplitProbReduction$annotations", "A", "getTransposeAroundSpace$annotations", "Lch/icoaching/typewise/config/CompanyConfig$b$d$a;", "()Lch/icoaching/typewise/config/CompanyConfig$b$d$a;", "getUppercaseBias$annotations", "C", "getVerbosityNoSpaceSplit$annotations", "getVerbositySpaceSplit", "getVerbositySpaceSplit$annotations", "E", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
        public static final class d {

            /* renamed from: E  reason: collision with root package name */
            public static final c f8170E = new c((i) null);
            /* access modifiers changed from: private */

            /* renamed from: F  reason: collision with root package name */
            public static final F2.b[] f8171F = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new O(G0.f622a, new C0300f(C0320p.f724a)), null, null, null, null, null, null, null, null};

            /* renamed from: A  reason: collision with root package name */
            private final boolean f8172A;

            /* renamed from: B  reason: collision with root package name */
            private final a f8173B;

            /* renamed from: C  reason: collision with root package name */
            private final int f8174C;

            /* renamed from: D  reason: collision with root package name */
            private final int f8175D;

            /* renamed from: a  reason: collision with root package name */
            private final boolean f8176a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f8177b;

            /* renamed from: c  reason: collision with root package name */
            private final String f8178c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f8179d;

            /* renamed from: e  reason: collision with root package name */
            private final double f8180e;

            /* renamed from: f  reason: collision with root package name */
            private final double f8181f;

            /* renamed from: g  reason: collision with root package name */
            private final boolean f8182g;

            /* renamed from: h  reason: collision with root package name */
            private final boolean f8183h;

            /* renamed from: i  reason: collision with root package name */
            private final boolean f8184i;

            /* renamed from: j  reason: collision with root package name */
            private final boolean f8185j;

            /* renamed from: k  reason: collision with root package name */
            private final int f8186k;

            /* renamed from: l  reason: collision with root package name */
            private final float f8187l;

            /* renamed from: m  reason: collision with root package name */
            private final double f8188m;

            /* renamed from: n  reason: collision with root package name */
            private final String f8189n;

            /* renamed from: o  reason: collision with root package name */
            private final float f8190o;

            /* renamed from: p  reason: collision with root package name */
            private final float f8191p;

            /* renamed from: q  reason: collision with root package name */
            private final float f8192q;

            /* renamed from: r  reason: collision with root package name */
            private final float f8193r;

            /* renamed from: s  reason: collision with root package name */
            private final int f8194s;

            /* renamed from: t  reason: collision with root package name */
            private final int f8195t;

            /* renamed from: u  reason: collision with root package name */
            private final int f8196u;

            /* renamed from: v  reason: collision with root package name */
            private final Map f8197v;

            /* renamed from: w  reason: collision with root package name */
            private final float f8198w;

            /* renamed from: x  reason: collision with root package name */
            private final boolean f8199x;

            /* renamed from: y  reason: collision with root package name */
            private final boolean f8200y;

            /* renamed from: z  reason: collision with root package name */
            private final float f8201z;

            @m
            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u001c!B+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010\u001eR \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001d\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u001e¨\u0006#"}, d2 = {"Lch/icoaching/typewise/config/CompanyConfig$b$d$a;", "", "", "seen0", "", "strong", "weak", "LJ2/C0;", "serializationConstructorMarker", "<init>", "(IFFLJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "c", "(Lch/icoaching/typewise/config/CompanyConfig$b$d$a;LI2/d;LH2/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "getStrong$annotations", "()V", "b", "getWeak$annotations", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
            public static final class a {

                /* renamed from: c  reason: collision with root package name */
                public static final C0135b f8202c = new C0135b((i) null);

                /* renamed from: a  reason: collision with root package name */
                private final float f8203a;

                /* renamed from: b  reason: collision with root package name */
                private final float f8204b;

                /* renamed from: ch.icoaching.typewise.config.CompanyConfig$b$d$a$a  reason: collision with other inner class name */
                public /* synthetic */ class C0134a implements F {

                    /* renamed from: a  reason: collision with root package name */
                    public static final C0134a f8205a;

                    /* renamed from: b  reason: collision with root package name */
                    private static final H2.f f8206b;

                    static {
                        C0134a aVar = new C0134a();
                        f8205a = aVar;
                        C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.CompanyConfig.CorrectionConfig.Settings.UppercaseBias", aVar, 2);
                        s0Var.p("strong", false);
                        s0Var.p("weak", false);
                        f8206b = s0Var;
                    }

                    private C0134a() {
                    }

                    public final H2.f a() {
                        return f8206b;
                    }

                    public final F2.b[] c() {
                        E e4 = E.f616a;
                        return new F2.b[]{e4, e4};
                    }

                    public F2.b[] d() {
                        return F.a.a(this);
                    }

                    /* renamed from: f */
                    public final a b(I2.e eVar) {
                        int i4;
                        float f4;
                        float f5;
                        o.e(eVar, "decoder");
                        H2.f fVar = f8206b;
                        I2.c d4 = eVar.d(fVar);
                        if (d4.p()) {
                            f5 = d4.H(fVar, 0);
                            f4 = d4.H(fVar, 1);
                            i4 = 3;
                        } else {
                            f5 = 0.0f;
                            float f6 = 0.0f;
                            boolean z3 = true;
                            int i5 = 0;
                            while (z3) {
                                int e4 = d4.e(fVar);
                                if (e4 == -1) {
                                    z3 = false;
                                } else if (e4 == 0) {
                                    f5 = d4.H(fVar, 0);
                                    i5 |= 1;
                                } else if (e4 == 1) {
                                    f6 = d4.H(fVar, 1);
                                    i5 |= 2;
                                } else {
                                    throw new UnknownFieldException(e4);
                                }
                            }
                            f4 = f6;
                            i4 = i5;
                        }
                        d4.c(fVar);
                        return new a(i4, f5, f4, (C0) null);
                    }

                    /* renamed from: g */
                    public final void e(I2.f fVar, a aVar) {
                        o.e(fVar, "encoder");
                        o.e(aVar, "value");
                        H2.f fVar2 = f8206b;
                        I2.d d4 = fVar.d(fVar2);
                        a.c(aVar, d4, fVar2);
                        d4.c(fVar2);
                    }
                }

                /* renamed from: ch.icoaching.typewise.config.CompanyConfig$b$d$a$b  reason: collision with other inner class name */
                public static final class C0135b {
                    private C0135b() {
                    }

                    public final F2.b serializer() {
                        return C0134a.f8205a;
                    }

                    public /* synthetic */ C0135b(i iVar) {
                        this();
                    }
                }

                public /* synthetic */ a(int i4, float f4, float f5, C0 c02) {
                    if (3 != (i4 & 3)) {
                        C0317n0.a(i4, 3, C0134a.f8205a.a());
                    }
                    this.f8203a = f4;
                    this.f8204b = f5;
                }

                public static final /* synthetic */ void c(a aVar, I2.d dVar, H2.f fVar) {
                    dVar.D(fVar, 0, aVar.f8203a);
                    dVar.D(fVar, 1, aVar.f8204b);
                }

                public final float a() {
                    return this.f8203a;
                }

                public final float b() {
                    return this.f8204b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return Float.compare(this.f8203a, aVar.f8203a) == 0 && Float.compare(this.f8204b, aVar.f8204b) == 0;
                }

                public int hashCode() {
                    return (Float.floatToIntBits(this.f8203a) * 31) + Float.floatToIntBits(this.f8204b);
                }

                public String toString() {
                    float f4 = this.f8203a;
                    float f5 = this.f8204b;
                    return "UppercaseBias(strong=" + f4 + ", weak=" + f5 + ")";
                }
            }

            /* renamed from: ch.icoaching.typewise.config.CompanyConfig$b$d$b  reason: collision with other inner class name */
            public /* synthetic */ class C0136b implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final C0136b f8207a;

                /* renamed from: b  reason: collision with root package name */
                private static final H2.f f8208b;

                static {
                    C0136b bVar = new C0136b();
                    f8207a = bVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.CompanyConfig.CorrectionConfig.Settings", bVar, 30);
                    s0Var.p("allow_correction_compoundNouns", false);
                    s0Var.p("auto_caps", false);
                    s0Var.p("capitalization_implementation", false);
                    s0Var.p("capitalize_first_word", false);
                    s0Var.p("compound_noun_length_threshold", false);
                    s0Var.p("compound_noun_titlecase_threshold", false);
                    s0Var.p("correct_accidental_capitalization", false);
                    s0Var.p("correct_first_line_names", false);
                    s0Var.p("correct_single_letter_words", false);
                    s0Var.p("correct_upper_case_words", false);
                    s0Var.p("default_number_of_spacesplits", false);
                    s0Var.p("default_previous_correction_best_score", false);
                    s0Var.p("ignore_scores_less_than", false);
                    s0Var.p("inference_model", false);
                    s0Var.p("keep_current_word_bias", false);
                    s0Var.p("language_model_K", false);
                    s0Var.p("max_edit_distance", false);
                    s0Var.p("max_edit_distance_second_split", false);
                    s0Var.p("max_suggestion_length_difference", false);
                    s0Var.p("min_no_unigram_counts", false);
                    s0Var.p("prefix_length", false);
                    s0Var.p("single_letters_to_allow_autocorrect", false);
                    s0Var.p("space_neighbours_scaling", false);
                    s0Var.p("spacesplit_on_each_key", false);
                    s0Var.p("spacesplit_on_space_neighbours", false);
                    s0Var.p("split_prob_reduction", false);
                    s0Var.p("transpose_around_space", false);
                    s0Var.p("uppercase_bias", false);
                    s0Var.p("verbosity_nospacesplit", false);
                    s0Var.p("verbosity_spacesplit", false);
                    f8208b = s0Var;
                }

                private C0136b() {
                }

                public final H2.f a() {
                    return f8208b;
                }

                public final F2.b[] c() {
                    F2.b bVar = d.f8171F[21];
                    C0306i iVar = C0306i.f706a;
                    G0 g02 = G0.f622a;
                    C0329u uVar = C0329u.f745a;
                    K k4 = K.f636a;
                    E e4 = E.f616a;
                    return new F2.b[]{iVar, iVar, g02, iVar, uVar, uVar, iVar, iVar, iVar, iVar, k4, e4, uVar, g02, e4, e4, e4, e4, k4, k4, k4, bVar, e4, iVar, iVar, e4, iVar, a.C0134a.f8205a, k4, k4};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:10:0x0187, code lost:
                    r19 = r9;
                    r9 = r8;
                    r8 = r7;
                    r7 = r3;
                    r3 = r6;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:19:0x01f2, code lost:
                    r19 = r9;
                    r9 = r8;
                    r8 = r7;
                    r7 = r3;
                    r3 = r15;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:25:0x0240, code lost:
                    r19 = r9;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:26:0x0245, code lost:
                    r9 = r8;
                    r8 = r7;
                    r7 = r3;
                    r3 = r16;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:32:0x0293, code lost:
                    r19 = r9;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:44:0x032f, code lost:
                    r52 = r52 | r3;
                    r3 = r7;
                    r7 = r8;
                    r8 = r9;
                    r9 = r19;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:46:0x033c, code lost:
                    r4 = 8;
                    r15 = 3;
                 */
                /* renamed from: f */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final ch.icoaching.typewise.config.CompanyConfig.b.d b(I2.e r92) {
                    /*
                        r91 = this;
                        r0 = r92
                        java.lang.String r1 = "decoder"
                        kotlin.jvm.internal.o.e(r0, r1)
                        H2.f r1 = f8208b
                        I2.c r0 = r0.d(r1)
                        F2.b[] r2 = ch.icoaching.typewise.config.CompanyConfig.b.d.f8171F
                        boolean r3 = r0.p()
                        r10 = 10
                        r11 = 9
                        r12 = 7
                        r13 = 6
                        r14 = 5
                        r15 = 3
                        r4 = 8
                        r5 = 4
                        r6 = 2
                        r7 = 1
                        r8 = 0
                        if (r3 == 0) goto L_0x012e
                        boolean r3 = r0.n(r1, r8)
                        boolean r7 = r0.n(r1, r7)
                        java.lang.String r6 = r0.z(r1, r6)
                        boolean r8 = r0.n(r1, r15)
                        double r23 = r0.u(r1, r5)
                        double r14 = r0.u(r1, r14)
                        boolean r5 = r0.n(r1, r13)
                        boolean r12 = r0.n(r1, r12)
                        boolean r4 = r0.n(r1, r4)
                        boolean r11 = r0.n(r1, r11)
                        int r10 = r0.v(r1, r10)
                        r13 = 11
                        float r13 = r0.H(r1, r13)
                        r9 = 12
                        double r21 = r0.u(r1, r9)
                        r9 = 13
                        java.lang.String r9 = r0.z(r1, r9)
                        r19 = r3
                        r3 = 14
                        float r3 = r0.H(r1, r3)
                        r18 = r3
                        r3 = 15
                        float r3 = r0.H(r1, r3)
                        r17 = r3
                        r3 = 16
                        float r3 = r0.H(r1, r3)
                        r16 = r3
                        r3 = 17
                        float r3 = r0.H(r1, r3)
                        r92 = r3
                        r3 = 18
                        int r3 = r0.v(r1, r3)
                        r26 = r3
                        r3 = 19
                        int r3 = r0.v(r1, r3)
                        r27 = r3
                        r3 = 20
                        int r3 = r0.v(r1, r3)
                        r28 = r3
                        r3 = 21
                        r2 = r2[r3]
                        r20 = r4
                        r4 = 0
                        java.lang.Object r2 = r0.E(r1, r3, r2, r4)
                        java.util.Map r2 = (java.util.Map) r2
                        r3 = 22
                        float r3 = r0.H(r1, r3)
                        r4 = 23
                        boolean r4 = r0.n(r1, r4)
                        r29 = r2
                        r2 = 24
                        boolean r2 = r0.n(r1, r2)
                        r30 = r2
                        r2 = 25
                        float r2 = r0.H(r1, r2)
                        r31 = r2
                        r2 = 26
                        boolean r2 = r0.n(r1, r2)
                        r32 = r2
                        ch.icoaching.typewise.config.CompanyConfig$b$d$a$a r2 = ch.icoaching.typewise.config.CompanyConfig.b.d.a.C0134a.f8205a
                        r33 = r3
                        r3 = 27
                        r34 = r8
                        r8 = 0
                        java.lang.Object r2 = r0.E(r1, r3, r2, r8)
                        ch.icoaching.typewise.config.CompanyConfig$b$d$a r2 = (ch.icoaching.typewise.config.CompanyConfig.b.d.a) r2
                        r3 = 28
                        int r3 = r0.v(r1, r3)
                        r8 = 29
                        int r8 = r0.v(r1, r8)
                        r25 = 1073741823(0x3fffffff, float:1.9999999)
                        r76 = r92
                        r86 = r2
                        r87 = r3
                        r82 = r4
                        r64 = r5
                        r58 = r6
                        r57 = r7
                        r88 = r8
                        r72 = r9
                        r68 = r10
                        r67 = r11
                        r65 = r12
                        r69 = r13
                        r62 = r14
                        r75 = r16
                        r74 = r17
                        r73 = r18
                        r56 = r19
                        r66 = r20
                        r70 = r21
                        r60 = r23
                        r55 = r25
                        r77 = r26
                        r78 = r27
                        r79 = r28
                        r80 = r29
                        r83 = r30
                        r84 = r31
                        r85 = r32
                        r81 = r33
                        r59 = r34
                        goto L_0x0380
                    L_0x012e:
                        r3 = r8
                        r8 = 0
                        r23 = 0
                        r9 = 0
                        r29 = r3
                        r30 = r29
                        r31 = r30
                        r33 = r31
                        r34 = r33
                        r35 = r34
                        r36 = r35
                        r37 = r36
                        r38 = r37
                        r39 = r38
                        r42 = r39
                        r43 = r42
                        r44 = r43
                        r52 = r44
                        r53 = r7
                        r7 = r8
                        r40 = r7
                        r41 = r40
                        r25 = r9
                        r26 = r25
                        r27 = r26
                        r28 = r27
                        r32 = r28
                        r45 = r32
                        r46 = r23
                        r48 = r46
                        r50 = r48
                        r23 = r52
                        r24 = r23
                        r3 = r41
                        r8 = r24
                    L_0x0170:
                        if (r53 == 0) goto L_0x0342
                        int r6 = r0.e(r1)
                        switch(r6) {
                            case -1: goto L_0x0337;
                            case 0: goto L_0x0320;
                            case 1: goto L_0x030f;
                            case 2: goto L_0x02fc;
                            case 3: goto L_0x02ea;
                            case 4: goto L_0x02d9;
                            case 5: goto L_0x02ce;
                            case 6: goto L_0x02c3;
                            case 7: goto L_0x02b8;
                            case 8: goto L_0x02ad;
                            case 9: goto L_0x02a2;
                            case 10: goto L_0x0297;
                            case 11: goto L_0x0289;
                            case 12: goto L_0x027e;
                            case 13: goto L_0x0263;
                            case 14: goto L_0x0258;
                            case 15: goto L_0x024c;
                            case 16: goto L_0x0236;
                            case 17: goto L_0x0220;
                            case 18: goto L_0x0215;
                            case 19: goto L_0x020a;
                            case 20: goto L_0x01ff;
                            case 21: goto L_0x01e6;
                            case 22: goto L_0x01dd;
                            case 23: goto L_0x01d4;
                            case 24: goto L_0x01cb;
                            case 25: goto L_0x01c2;
                            case 26: goto L_0x01b9;
                            case 27: goto L_0x019d;
                            case 28: goto L_0x0194;
                            case 29: goto L_0x017f;
                            default: goto L_0x0179;
                        }
                    L_0x0179:
                        kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                        r0.<init>((int) r6)
                        throw r0
                    L_0x017f:
                        r6 = 29
                        int r39 = r0.v(r1, r6)
                        r6 = 536870912(0x20000000, float:1.0842022E-19)
                    L_0x0187:
                        r19 = r9
                        r4 = 0
                        r15 = 17
                        r9 = r8
                        r8 = r7
                        r7 = r3
                        r3 = r6
                        r6 = 11
                        goto L_0x032f
                    L_0x0194:
                        r6 = 28
                        int r33 = r0.v(r1, r6)
                        r6 = 268435456(0x10000000, float:2.5243549E-29)
                        goto L_0x0187
                    L_0x019d:
                        ch.icoaching.typewise.config.CompanyConfig$b$d$a$a r6 = ch.icoaching.typewise.config.CompanyConfig.b.d.a.C0134a.f8205a
                        r15 = 27
                        java.lang.Object r6 = r0.E(r1, r15, r6, r7)
                        ch.icoaching.typewise.config.CompanyConfig$b$d$a r6 = (ch.icoaching.typewise.config.CompanyConfig.b.d.a) r6
                        r7 = 134217728(0x8000000, float:3.85186E-34)
                        r19 = r9
                        r4 = 0
                        r15 = 17
                        r9 = r8
                        r8 = r6
                        r6 = 11
                        r90 = r7
                        r7 = r3
                        r3 = r90
                        goto L_0x032f
                    L_0x01b9:
                        r6 = 26
                        boolean r23 = r0.n(r1, r6)
                        r6 = 67108864(0x4000000, float:1.5046328E-36)
                        goto L_0x0187
                    L_0x01c2:
                        r6 = 25
                        float r9 = r0.H(r1, r6)
                        r6 = 33554432(0x2000000, float:9.403955E-38)
                        goto L_0x0187
                    L_0x01cb:
                        r6 = 24
                        boolean r8 = r0.n(r1, r6)
                        r6 = 16777216(0x1000000, float:2.3509887E-38)
                        goto L_0x0187
                    L_0x01d4:
                        r6 = 23
                        boolean r35 = r0.n(r1, r6)
                        r6 = 8388608(0x800000, float:1.17549435E-38)
                        goto L_0x0187
                    L_0x01dd:
                        r6 = 22
                        float r32 = r0.H(r1, r6)
                        r6 = 4194304(0x400000, float:5.877472E-39)
                        goto L_0x0187
                    L_0x01e6:
                        r6 = 21
                        r15 = r2[r6]
                        java.lang.Object r3 = r0.E(r1, r6, r15, r3)
                        java.util.Map r3 = (java.util.Map) r3
                        r15 = 2097152(0x200000, float:2.938736E-39)
                    L_0x01f2:
                        r19 = r9
                        r4 = 0
                        r6 = 11
                        r9 = r8
                        r8 = r7
                        r7 = r3
                        r3 = r15
                        r15 = 17
                        goto L_0x032f
                    L_0x01ff:
                        r6 = 21
                        r15 = 20
                        int r31 = r0.v(r1, r15)
                        r15 = 1048576(0x100000, float:1.469368E-39)
                        goto L_0x01f2
                    L_0x020a:
                        r6 = 21
                        r15 = 19
                        int r30 = r0.v(r1, r15)
                        r15 = 524288(0x80000, float:7.34684E-40)
                        goto L_0x01f2
                    L_0x0215:
                        r6 = 21
                        r15 = 18
                        int r29 = r0.v(r1, r15)
                        r15 = 262144(0x40000, float:3.67342E-40)
                        goto L_0x01f2
                    L_0x0220:
                        r6 = 21
                        r15 = 17
                        float r28 = r0.H(r1, r15)
                        r20 = 131072(0x20000, float:1.83671E-40)
                        r19 = r9
                        r4 = 0
                        r6 = 11
                        r9 = r8
                        r8 = r7
                        r7 = r3
                        r3 = r20
                        goto L_0x032f
                    L_0x0236:
                        r6 = 16
                        r15 = 17
                        float r27 = r0.H(r1, r6)
                        r16 = 65536(0x10000, float:9.18355E-41)
                    L_0x0240:
                        r19 = r9
                        r4 = 0
                        r6 = 11
                    L_0x0245:
                        r9 = r8
                        r8 = r7
                        r7 = r3
                        r3 = r16
                        goto L_0x032f
                    L_0x024c:
                        r6 = 15
                        r15 = 17
                        float r26 = r0.H(r1, r6)
                        r16 = 32768(0x8000, float:4.5918E-41)
                        goto L_0x0240
                    L_0x0258:
                        r6 = 14
                        r15 = 17
                        float r25 = r0.H(r1, r6)
                        r16 = 16384(0x4000, float:2.2959E-41)
                        goto L_0x0240
                    L_0x0263:
                        r6 = 13
                        r15 = 17
                        java.lang.String r16 = r0.z(r1, r6)
                        r19 = 8192(0x2000, float:1.14794E-41)
                        r41 = r16
                        r4 = 0
                        r6 = 11
                        r90 = r7
                        r7 = r3
                        r3 = r19
                        r19 = r9
                        r9 = r8
                        r8 = r90
                        goto L_0x032f
                    L_0x027e:
                        r6 = 12
                        r15 = 17
                        double r48 = r0.u(r1, r6)
                        r16 = 4096(0x1000, float:5.74E-42)
                        goto L_0x0240
                    L_0x0289:
                        r6 = 11
                        r15 = 17
                        float r45 = r0.H(r1, r6)
                        r16 = 2048(0x800, float:2.87E-42)
                    L_0x0293:
                        r19 = r9
                        r4 = 0
                        goto L_0x0245
                    L_0x0297:
                        r6 = 11
                        r15 = 17
                        int r42 = r0.v(r1, r10)
                        r16 = 1024(0x400, float:1.435E-42)
                        goto L_0x0293
                    L_0x02a2:
                        r6 = 11
                        r15 = 17
                        boolean r43 = r0.n(r1, r11)
                        r16 = 512(0x200, float:7.175E-43)
                        goto L_0x0293
                    L_0x02ad:
                        r6 = 11
                        r15 = 17
                        boolean r34 = r0.n(r1, r4)
                        r16 = 256(0x100, float:3.59E-43)
                        goto L_0x0293
                    L_0x02b8:
                        r6 = 11
                        r15 = 17
                        boolean r44 = r0.n(r1, r12)
                        r16 = 128(0x80, float:1.794E-43)
                        goto L_0x0293
                    L_0x02c3:
                        r6 = 11
                        r15 = 17
                        boolean r36 = r0.n(r1, r13)
                        r16 = 64
                        goto L_0x0293
                    L_0x02ce:
                        r6 = 11
                        r15 = 17
                        double r46 = r0.u(r1, r14)
                        r16 = 32
                        goto L_0x0293
                    L_0x02d9:
                        r6 = 11
                        r15 = 17
                        double r50 = r0.u(r1, r5)
                        r19 = r9
                        r4 = 0
                        r9 = r8
                        r8 = r7
                        r7 = r3
                        r3 = 16
                        goto L_0x032f
                    L_0x02ea:
                        r4 = r15
                        r6 = 11
                        r15 = 17
                        boolean r38 = r0.n(r1, r4)
                        r19 = r9
                        r4 = 0
                        r9 = r8
                        r8 = r7
                        r7 = r3
                        r3 = 8
                        goto L_0x032f
                    L_0x02fc:
                        r4 = 2
                        r6 = 11
                        r15 = 17
                        java.lang.String r19 = r0.z(r1, r4)
                        r40 = r19
                        r4 = 0
                        r19 = r9
                        r9 = r8
                        r8 = r7
                        r7 = r3
                        r3 = r5
                        goto L_0x032f
                    L_0x030f:
                        r4 = 1
                        r6 = 11
                        r15 = 17
                        boolean r37 = r0.n(r1, r4)
                        r19 = r9
                        r4 = 0
                        r9 = r8
                        r8 = r7
                        r7 = r3
                        r3 = 2
                        goto L_0x032f
                    L_0x0320:
                        r4 = 0
                        r6 = 11
                        r15 = 17
                        boolean r24 = r0.n(r1, r4)
                        r19 = r9
                        r9 = r8
                        r8 = r7
                        r7 = r3
                        r3 = 1
                    L_0x032f:
                        r52 = r52 | r3
                        r3 = r7
                        r7 = r8
                        r8 = r9
                        r9 = r19
                        goto L_0x033c
                    L_0x0337:
                        r4 = 0
                        r15 = 17
                        r53 = r4
                    L_0x033c:
                        r4 = 8
                        r6 = 2
                        r15 = 3
                        goto L_0x0170
                    L_0x0342:
                        r80 = r3
                        r86 = r7
                        r83 = r8
                        r84 = r9
                        r85 = r23
                        r56 = r24
                        r73 = r25
                        r74 = r26
                        r75 = r27
                        r76 = r28
                        r77 = r29
                        r78 = r30
                        r79 = r31
                        r81 = r32
                        r87 = r33
                        r66 = r34
                        r82 = r35
                        r64 = r36
                        r57 = r37
                        r59 = r38
                        r88 = r39
                        r58 = r40
                        r72 = r41
                        r68 = r42
                        r67 = r43
                        r65 = r44
                        r69 = r45
                        r62 = r46
                        r70 = r48
                        r60 = r50
                        r55 = r52
                    L_0x0380:
                        r0.c(r1)
                        ch.icoaching.typewise.config.CompanyConfig$b$d r0 = new ch.icoaching.typewise.config.CompanyConfig$b$d
                        r54 = r0
                        r89 = 0
                        r54.<init>(r55, r56, r57, r58, r59, r60, r62, r64, r65, r66, r67, r68, r69, r70, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.config.CompanyConfig.b.d.C0136b.b(I2.e):ch.icoaching.typewise.config.CompanyConfig$b$d");
                }

                /* renamed from: g */
                public final void e(I2.f fVar, d dVar) {
                    o.e(fVar, "encoder");
                    o.e(dVar, "value");
                    H2.f fVar2 = f8208b;
                    I2.d d4 = fVar.d(fVar2);
                    d.B(dVar, d4, fVar2);
                    d4.c(fVar2);
                }
            }

            public static final class c {
                private c() {
                }

                public final F2.b serializer() {
                    return C0136b.f8207a;
                }

                public /* synthetic */ c(i iVar) {
                    this();
                }
            }

            public /* synthetic */ d(int i4, boolean z3, boolean z4, String str, boolean z5, double d4, double d5, boolean z6, boolean z7, boolean z8, boolean z9, int i5, float f4, double d6, String str2, float f5, float f6, float f7, float f8, int i6, int i7, int i8, Map map, float f9, boolean z10, boolean z11, float f10, boolean z12, a aVar, int i9, int i10, C0 c02) {
                if (1073741823 != (i4 & 1073741823)) {
                    C0317n0.a(i4, 1073741823, C0136b.f8207a.a());
                }
                this.f8176a = z3;
                this.f8177b = z4;
                this.f8178c = str;
                this.f8179d = z5;
                this.f8180e = d4;
                this.f8181f = d5;
                this.f8182g = z6;
                this.f8183h = z7;
                this.f8184i = z8;
                this.f8185j = z9;
                this.f8186k = i5;
                this.f8187l = f4;
                this.f8188m = d6;
                this.f8189n = str2;
                this.f8190o = f5;
                this.f8191p = f6;
                this.f8192q = f7;
                this.f8193r = f8;
                this.f8194s = i6;
                this.f8195t = i7;
                this.f8196u = i8;
                this.f8197v = map;
                this.f8198w = f9;
                this.f8199x = z10;
                this.f8200y = z11;
                this.f8201z = f10;
                this.f8172A = z12;
                this.f8173B = aVar;
                this.f8174C = i9;
                this.f8175D = i10;
            }

            public static final /* synthetic */ void B(d dVar, I2.d dVar2, H2.f fVar) {
                F2.b[] bVarArr = f8171F;
                dVar2.j(fVar, 0, dVar.f8176a);
                dVar2.j(fVar, 1, dVar.f8177b);
                dVar2.p(fVar, 2, dVar.f8178c);
                dVar2.j(fVar, 3, dVar.f8179d);
                dVar2.g(fVar, 4, dVar.f8180e);
                dVar2.g(fVar, 5, dVar.f8181f);
                dVar2.j(fVar, 6, dVar.f8182g);
                dVar2.j(fVar, 7, dVar.f8183h);
                dVar2.j(fVar, 8, dVar.f8184i);
                dVar2.j(fVar, 9, dVar.f8185j);
                dVar2.z(fVar, 10, dVar.f8186k);
                dVar2.D(fVar, 11, dVar.f8187l);
                dVar2.g(fVar, 12, dVar.f8188m);
                dVar2.p(fVar, 13, dVar.f8189n);
                dVar2.D(fVar, 14, dVar.f8190o);
                dVar2.D(fVar, 15, dVar.f8191p);
                dVar2.D(fVar, 16, dVar.f8192q);
                dVar2.D(fVar, 17, dVar.f8193r);
                dVar2.z(fVar, 18, dVar.f8194s);
                dVar2.z(fVar, 19, dVar.f8195t);
                dVar2.z(fVar, 20, dVar.f8196u);
                dVar2.f(fVar, 21, bVarArr[21], dVar.f8197v);
                dVar2.D(fVar, 22, dVar.f8198w);
                dVar2.j(fVar, 23, dVar.f8199x);
                dVar2.j(fVar, 24, dVar.f8200y);
                dVar2.D(fVar, 25, dVar.f8201z);
                dVar2.j(fVar, 26, dVar.f8172A);
                dVar2.f(fVar, 27, a.C0134a.f8205a, dVar.f8173B);
                dVar2.z(fVar, 28, dVar.f8174C);
                dVar2.z(fVar, 29, dVar.f8175D);
            }

            public final int A() {
                return this.f8174C;
            }

            public final boolean b() {
                return this.f8176a;
            }

            public final String c() {
                return this.f8178c;
            }

            public final boolean d() {
                return this.f8179d;
            }

            public final double e() {
                return this.f8180e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f8176a == dVar.f8176a && this.f8177b == dVar.f8177b && o.a(this.f8178c, dVar.f8178c) && this.f8179d == dVar.f8179d && Double.compare(this.f8180e, dVar.f8180e) == 0 && Double.compare(this.f8181f, dVar.f8181f) == 0 && this.f8182g == dVar.f8182g && this.f8183h == dVar.f8183h && this.f8184i == dVar.f8184i && this.f8185j == dVar.f8185j && this.f8186k == dVar.f8186k && Float.compare(this.f8187l, dVar.f8187l) == 0 && Double.compare(this.f8188m, dVar.f8188m) == 0 && o.a(this.f8189n, dVar.f8189n) && Float.compare(this.f8190o, dVar.f8190o) == 0 && Float.compare(this.f8191p, dVar.f8191p) == 0 && Float.compare(this.f8192q, dVar.f8192q) == 0 && Float.compare(this.f8193r, dVar.f8193r) == 0 && this.f8194s == dVar.f8194s && this.f8195t == dVar.f8195t && this.f8196u == dVar.f8196u && o.a(this.f8197v, dVar.f8197v) && Float.compare(this.f8198w, dVar.f8198w) == 0 && this.f8199x == dVar.f8199x && this.f8200y == dVar.f8200y && Float.compare(this.f8201z, dVar.f8201z) == 0 && this.f8172A == dVar.f8172A && o.a(this.f8173B, dVar.f8173B) && this.f8174C == dVar.f8174C && this.f8175D == dVar.f8175D;
            }

            public final double f() {
                return this.f8181f;
            }

            public final boolean g() {
                return this.f8182g;
            }

            public final boolean h() {
                return this.f8183h;
            }

            public int hashCode() {
                return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((androidx.work.c.a(this.f8176a) * 31) + androidx.work.c.a(this.f8177b)) * 31) + this.f8178c.hashCode()) * 31) + androidx.work.c.a(this.f8179d)) * 31) + Double.doubleToLongBits(this.f8180e)) * 31) + Double.doubleToLongBits(this.f8181f)) * 31) + androidx.work.c.a(this.f8182g)) * 31) + androidx.work.c.a(this.f8183h)) * 31) + androidx.work.c.a(this.f8184i)) * 31) + androidx.work.c.a(this.f8185j)) * 31) + this.f8186k) * 31) + Float.floatToIntBits(this.f8187l)) * 31) + Double.doubleToLongBits(this.f8188m)) * 31) + this.f8189n.hashCode()) * 31) + Float.floatToIntBits(this.f8190o)) * 31) + Float.floatToIntBits(this.f8191p)) * 31) + Float.floatToIntBits(this.f8192q)) * 31) + Float.floatToIntBits(this.f8193r)) * 31) + this.f8194s) * 31) + this.f8195t) * 31) + this.f8196u) * 31) + this.f8197v.hashCode()) * 31) + Float.floatToIntBits(this.f8198w)) * 31) + androidx.work.c.a(this.f8199x)) * 31) + androidx.work.c.a(this.f8200y)) * 31) + Float.floatToIntBits(this.f8201z)) * 31) + androidx.work.c.a(this.f8172A)) * 31) + this.f8173B.hashCode()) * 31) + this.f8174C) * 31) + this.f8175D;
            }

            public final boolean i() {
                return this.f8184i;
            }

            public final boolean j() {
                return this.f8185j;
            }

            public final int k() {
                return this.f8186k;
            }

            public final float l() {
                return this.f8187l;
            }

            public final double m() {
                return this.f8188m;
            }

            public final float n() {
                return this.f8190o;
            }

            public final float o() {
                return this.f8191p;
            }

            public final float p() {
                return this.f8192q;
            }

            public final float q() {
                return this.f8193r;
            }

            public final int r() {
                return this.f8194s;
            }

            public final int s() {
                return this.f8196u;
            }

            public final Map t() {
                return this.f8197v;
            }

            public String toString() {
                boolean z3 = this.f8176a;
                boolean z4 = this.f8177b;
                String str = this.f8178c;
                boolean z5 = this.f8179d;
                double d4 = this.f8180e;
                double d5 = this.f8181f;
                boolean z6 = this.f8182g;
                boolean z7 = this.f8183h;
                boolean z8 = this.f8184i;
                boolean z9 = this.f8185j;
                int i4 = this.f8186k;
                float f4 = this.f8187l;
                double d6 = this.f8188m;
                String str2 = this.f8189n;
                float f5 = this.f8190o;
                float f6 = this.f8191p;
                float f7 = this.f8192q;
                float f8 = this.f8193r;
                int i5 = this.f8194s;
                int i6 = this.f8195t;
                int i7 = this.f8196u;
                Map map = this.f8197v;
                float f9 = this.f8198w;
                boolean z10 = this.f8199x;
                boolean z11 = this.f8200y;
                float f10 = this.f8201z;
                boolean z12 = this.f8172A;
                a aVar = this.f8173B;
                int i8 = this.f8174C;
                int i9 = this.f8175D;
                return "Settings(allowCorrectionCompoundNouns=" + z3 + ", autoCaps=" + z4 + ", capitalizationImplementation=" + str + ", capitalizeFirstWord=" + z5 + ", compoundNounLengthThreshold=" + d4 + ", compoundNounTitleCaseThreshold=" + d5 + ", correctAccidentalCapitalization=" + z6 + ", correctFirstLineNames=" + z7 + ", correctSingleLetterWords=" + z8 + ", correctUpperCaseWords=" + z9 + ", defaultNumberOfSpaceSplits=" + i4 + ", defaultPreviousCorrectionBestScore=" + f4 + ", ignoreScoresLessThan=" + d6 + ", inferenceModel=" + str2 + ", keepCurrentWordBias=" + f5 + ", languageModelK=" + f6 + ", maxEditDistance=" + f7 + ", maxEditDistanceSecondSplit=" + f8 + ", maxSuggestionLengthDifference=" + i5 + ", minNoUniGramCounts=" + i6 + ", prefixLength=" + i7 + ", singleLettersToAllowAutocorrect=" + map + ", spaceNeighboursScaling=" + f9 + ", spaceSplitOnEachKey=" + z10 + ", spaceSplitOnSpaceNeighbours=" + z11 + ", splitProbReduction=" + f10 + ", transposeAroundSpace=" + z12 + ", uppercaseBias=" + aVar + ", verbosityNoSpaceSplit=" + i8 + ", verbositySpaceSplit=" + i9 + ")";
            }

            public final float u() {
                return this.f8198w;
            }

            public final boolean v() {
                return this.f8199x;
            }

            public final boolean w() {
                return this.f8200y;
            }

            public final float x() {
                return this.f8201z;
            }

            public final boolean y() {
                return this.f8172A;
            }

            public final a z() {
                return this.f8173B;
            }
        }

        public /* synthetic */ class e implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final e f8209a;

            /* renamed from: b  reason: collision with root package name */
            private static final H2.f f8210b;

            static {
                e eVar = new e();
                f8209a = eVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.CompanyConfig.CorrectionConfig", eVar, 16);
                s0Var.p("server", false);
                s0Var.p("base_model_name", false);
                s0Var.p("ngram_version", false);
                s0Var.p("edit_distance_weights_overwrite", false);
                s0Var.p("settings", false);
                s0Var.p("properties", false);
                s0Var.p("neural_properties", false);
                s0Var.p("abbreviations", false);
                s0Var.p("blocklist", false);
                s0Var.p("casing_overwrite", false);
                s0Var.p("don't_correct_away_from_words", false);
                s0Var.p("don't_predict_words", false);
                s0Var.p("hardcoded_corrections", false);
                s0Var.p("words_to_check_even_if_in_casing_dict", false);
                s0Var.p("blocklist_wordlist_names", false);
                s0Var.p("wordlist_blocklists_not_to_show_in_corrections", false);
                f8210b = s0Var;
            }

            private e() {
            }

            public final H2.f a() {
                return f8210b;
            }

            public final F2.b[] c() {
                F2.b[] a4 = b.f8130r;
                F2.b bVar = a4[7];
                F2.b bVar2 = a4[8];
                F2.b bVar3 = a4[9];
                F2.b bVar4 = a4[10];
                F2.b bVar5 = a4[11];
                F2.b bVar6 = a4[12];
                F2.b u3 = G2.a.u(a4[13]);
                F2.b u4 = G2.a.u(a4[14]);
                F2.b u5 = G2.a.u(a4[15]);
                G0 g02 = G0.f622a;
                return new F2.b[]{C0306i.f706a, g02, g02, a.C0129a.f8156a, d.C0136b.f8207a, c.a.f8168a, C0131b.a.f8160a, bVar, bVar2, bVar3, bVar4, bVar5, bVar6, u3, u4, u5};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: ch.icoaching.typewise.config.CompanyConfig$b$a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: ch.icoaching.typewise.config.CompanyConfig$b$c} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.Map} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.util.Map} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.util.Map} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.util.Map} */
            /* JADX WARNING: Code restructure failed: missing block: B:10:0x010e, code lost:
                r8 = r49;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0110, code lost:
                r11 = r27;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x01ca, code lost:
                r8 = r23;
                r2 = r49;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:26:0x01fb, code lost:
                r11 = r22;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x0228, code lost:
                r11 = r22;
                r8 = r23;
             */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final ch.icoaching.typewise.config.CompanyConfig.b b(I2.e r49) {
                /*
                    r48 = this;
                    r0 = r49
                    java.lang.String r1 = "decoder"
                    kotlin.jvm.internal.o.e(r0, r1)
                    H2.f r1 = f8210b
                    I2.c r0 = r0.d(r1)
                    F2.b[] r2 = ch.icoaching.typewise.config.CompanyConfig.b.f8130r
                    boolean r3 = r0.p()
                    r4 = 6
                    r5 = 5
                    r6 = 3
                    r7 = 4
                    r8 = 2
                    r14 = 10
                    r15 = 9
                    r9 = 7
                    r10 = 8
                    r11 = 1
                    r12 = 0
                    r13 = 0
                    if (r3 == 0) goto L_0x00d3
                    boolean r3 = r0.n(r1, r12)
                    java.lang.String r11 = r0.z(r1, r11)
                    java.lang.String r8 = r0.z(r1, r8)
                    ch.icoaching.typewise.config.CompanyConfig$b$a$a r12 = ch.icoaching.typewise.config.CompanyConfig.b.a.C0129a.f8156a
                    java.lang.Object r6 = r0.E(r1, r6, r12, r13)
                    ch.icoaching.typewise.config.CompanyConfig$b$a r6 = (ch.icoaching.typewise.config.CompanyConfig.b.a) r6
                    ch.icoaching.typewise.config.CompanyConfig$b$d$b r12 = ch.icoaching.typewise.config.CompanyConfig.b.d.C0136b.f8207a
                    java.lang.Object r7 = r0.E(r1, r7, r12, r13)
                    ch.icoaching.typewise.config.CompanyConfig$b$d r7 = (ch.icoaching.typewise.config.CompanyConfig.b.d) r7
                    ch.icoaching.typewise.config.CompanyConfig$b$c$a r12 = ch.icoaching.typewise.config.CompanyConfig.b.c.a.f8168a
                    java.lang.Object r5 = r0.E(r1, r5, r12, r13)
                    ch.icoaching.typewise.config.CompanyConfig$b$c r5 = (ch.icoaching.typewise.config.CompanyConfig.b.c) r5
                    ch.icoaching.typewise.config.CompanyConfig$b$b$a r12 = ch.icoaching.typewise.config.CompanyConfig.b.C0131b.a.f8160a
                    java.lang.Object r4 = r0.E(r1, r4, r12, r13)
                    ch.icoaching.typewise.config.CompanyConfig$b$b r4 = (ch.icoaching.typewise.config.CompanyConfig.b.C0131b) r4
                    r12 = r2[r9]
                    java.lang.Object r9 = r0.E(r1, r9, r12, r13)
                    java.util.Map r9 = (java.util.Map) r9
                    r12 = r2[r10]
                    java.lang.Object r10 = r0.E(r1, r10, r12, r13)
                    java.util.Map r10 = (java.util.Map) r10
                    r12 = r2[r15]
                    java.lang.Object r12 = r0.E(r1, r15, r12, r13)
                    java.util.Map r12 = (java.util.Map) r12
                    r15 = r2[r14]
                    java.lang.Object r14 = r0.E(r1, r14, r15, r13)
                    java.util.Map r14 = (java.util.Map) r14
                    r19 = r3
                    r15 = 11
                    r3 = r2[r15]
                    java.lang.Object r3 = r0.E(r1, r15, r3, r13)
                    java.util.Map r3 = (java.util.Map) r3
                    r18 = r3
                    r15 = 12
                    r3 = r2[r15]
                    java.lang.Object r3 = r0.E(r1, r15, r3, r13)
                    java.util.Map r3 = (java.util.Map) r3
                    r17 = r3
                    r15 = 13
                    r3 = r2[r15]
                    java.lang.Object r3 = r0.m(r1, r15, r3, r13)
                    java.util.Map r3 = (java.util.Map) r3
                    r16 = r3
                    r15 = 14
                    r3 = r2[r15]
                    java.lang.Object r3 = r0.m(r1, r15, r3, r13)
                    java.util.Map r3 = (java.util.Map) r3
                    r15 = 15
                    r2 = r2[r15]
                    java.lang.Object r2 = r0.m(r1, r15, r2, r13)
                    java.util.Map r2 = (java.util.Map) r2
                    r13 = 65535(0xffff, float:9.1834E-41)
                    r45 = r2
                    r44 = r3
                    r36 = r4
                    r35 = r5
                    r33 = r6
                    r34 = r7
                    r32 = r8
                    r37 = r9
                    r38 = r10
                    r31 = r11
                    r39 = r12
                    r29 = r13
                    r40 = r14
                    r43 = r16
                    r42 = r17
                    r41 = r18
                    r30 = r19
                    goto L_0x0256
                L_0x00d3:
                    r26 = r11
                    r24 = r12
                    r3 = r13
                    r4 = r3
                    r5 = r4
                    r6 = r5
                    r7 = r6
                    r8 = r7
                    r9 = r8
                    r10 = r9
                    r11 = r10
                    r14 = r11
                    r15 = r14
                    r20 = r15
                    r21 = r20
                    r25 = r21
                    r12 = r25
                    r13 = r24
                L_0x00ec:
                    if (r26 == 0) goto L_0x022e
                    r27 = r11
                    int r11 = r0.e(r1)
                    switch(r11) {
                        case -1: goto L_0x0220;
                        case 0: goto L_0x020f;
                        case 1: goto L_0x01fe;
                        case 2: goto L_0x01eb;
                        case 3: goto L_0x01d0;
                        case 4: goto L_0x01b6;
                        case 5: goto L_0x019d;
                        case 6: goto L_0x018d;
                        case 7: goto L_0x017f;
                        case 8: goto L_0x0170;
                        case 9: goto L_0x0161;
                        case 10: goto L_0x0152;
                        case 11: goto L_0x0142;
                        case 12: goto L_0x0132;
                        case 13: goto L_0x0122;
                        case 14: goto L_0x0113;
                        case 15: goto L_0x00fd;
                        default: goto L_0x00f7;
                    }
                L_0x00f7:
                    kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                    r0.<init>((int) r11)
                    throw r0
                L_0x00fd:
                    r49 = r8
                    r11 = 15
                    r8 = r2[r11]
                    java.lang.Object r8 = r0.m(r1, r11, r8, r12)
                    r12 = r8
                    java.util.Map r12 = (java.util.Map) r12
                    r8 = 32768(0x8000, float:4.5918E-41)
                    r13 = r13 | r8
                L_0x010e:
                    r8 = r49
                L_0x0110:
                    r11 = r27
                    goto L_0x00ec
                L_0x0113:
                    r49 = r8
                    r8 = 14
                    r11 = r2[r8]
                    java.lang.Object r3 = r0.m(r1, r8, r11, r3)
                    java.util.Map r3 = (java.util.Map) r3
                    r13 = r13 | 16384(0x4000, float:2.2959E-41)
                    goto L_0x010e
                L_0x0122:
                    r49 = r8
                    r11 = 13
                    r8 = r2[r11]
                    java.lang.Object r8 = r0.m(r1, r11, r8, r14)
                    r14 = r8
                    java.util.Map r14 = (java.util.Map) r14
                    r13 = r13 | 8192(0x2000, float:1.14794E-41)
                    goto L_0x010e
                L_0x0132:
                    r49 = r8
                    r8 = 12
                    r11 = r2[r8]
                    java.lang.Object r11 = r0.E(r1, r8, r11, r15)
                    r15 = r11
                    java.util.Map r15 = (java.util.Map) r15
                    r13 = r13 | 4096(0x1000, float:5.74E-42)
                    goto L_0x010e
                L_0x0142:
                    r49 = r8
                    r11 = 11
                    r8 = r2[r11]
                    java.lang.Object r8 = r0.E(r1, r11, r8, r10)
                    r10 = r8
                    java.util.Map r10 = (java.util.Map) r10
                    r13 = r13 | 2048(0x800, float:2.87E-42)
                    goto L_0x010e
                L_0x0152:
                    r49 = r8
                    r8 = 10
                    r11 = r2[r8]
                    java.lang.Object r9 = r0.E(r1, r8, r11, r9)
                    java.util.Map r9 = (java.util.Map) r9
                    r13 = r13 | 1024(0x400, float:1.435E-42)
                    goto L_0x010e
                L_0x0161:
                    r49 = r8
                    r11 = 9
                    r8 = r2[r11]
                    java.lang.Object r4 = r0.E(r1, r11, r8, r4)
                    java.util.Map r4 = (java.util.Map) r4
                    r13 = r13 | 512(0x200, float:7.175E-43)
                    goto L_0x010e
                L_0x0170:
                    r49 = r8
                    r8 = 8
                    r11 = r2[r8]
                    java.lang.Object r5 = r0.E(r1, r8, r11, r5)
                    java.util.Map r5 = (java.util.Map) r5
                    r13 = r13 | 256(0x100, float:3.59E-43)
                    goto L_0x010e
                L_0x017f:
                    r49 = r8
                    r11 = 7
                    r8 = r2[r11]
                    java.lang.Object r7 = r0.E(r1, r11, r8, r7)
                    java.util.Map r7 = (java.util.Map) r7
                    r13 = r13 | 128(0x80, float:1.794E-43)
                    goto L_0x010e
                L_0x018d:
                    r49 = r8
                    r11 = 7
                    ch.icoaching.typewise.config.CompanyConfig$b$b$a r8 = ch.icoaching.typewise.config.CompanyConfig.b.C0131b.a.f8160a
                    r11 = 6
                    java.lang.Object r6 = r0.E(r1, r11, r8, r6)
                    ch.icoaching.typewise.config.CompanyConfig$b$b r6 = (ch.icoaching.typewise.config.CompanyConfig.b.C0131b) r6
                    r13 = r13 | 64
                    goto L_0x010e
                L_0x019d:
                    r49 = r8
                    r11 = 6
                    ch.icoaching.typewise.config.CompanyConfig$b$c$a r8 = ch.icoaching.typewise.config.CompanyConfig.b.c.a.f8168a
                    r11 = 5
                    r47 = r2
                    r2 = r49
                    r49 = r47
                    java.lang.Object r2 = r0.E(r1, r11, r8, r2)
                    r8 = r2
                    ch.icoaching.typewise.config.CompanyConfig$b$c r8 = (ch.icoaching.typewise.config.CompanyConfig.b.c) r8
                    r13 = r13 | 32
                    r2 = r49
                    goto L_0x0110
                L_0x01b6:
                    r49 = r2
                    r2 = r8
                    r11 = 5
                    ch.icoaching.typewise.config.CompanyConfig$b$d$b r8 = ch.icoaching.typewise.config.CompanyConfig.b.d.C0136b.f8207a
                    r23 = r2
                    r2 = r27
                    r11 = 4
                    java.lang.Object r2 = r0.E(r1, r11, r8, r2)
                    ch.icoaching.typewise.config.CompanyConfig$b$d r2 = (ch.icoaching.typewise.config.CompanyConfig.b.d) r2
                    r13 = r13 | 16
                    r11 = r2
                L_0x01ca:
                    r8 = r23
                    r2 = r49
                    goto L_0x00ec
                L_0x01d0:
                    r49 = r2
                    r23 = r8
                    r2 = r27
                    r11 = 4
                    ch.icoaching.typewise.config.CompanyConfig$b$a$a r8 = ch.icoaching.typewise.config.CompanyConfig.b.a.C0129a.f8156a
                    r22 = r2
                    r2 = r25
                    r11 = 3
                    java.lang.Object r2 = r0.E(r1, r11, r8, r2)
                    r25 = r2
                    ch.icoaching.typewise.config.CompanyConfig$b$a r25 = (ch.icoaching.typewise.config.CompanyConfig.b.a) r25
                    r13 = r13 | 8
                    r2 = r49
                    goto L_0x0228
                L_0x01eb:
                    r49 = r2
                    r23 = r8
                    r2 = r25
                    r22 = r27
                    r8 = 2
                    r11 = 3
                    java.lang.String r21 = r0.z(r1, r8)
                    r13 = r13 | 4
                L_0x01fb:
                    r11 = r22
                    goto L_0x01ca
                L_0x01fe:
                    r49 = r2
                    r23 = r8
                    r2 = r25
                    r22 = r27
                    r8 = 1
                    r11 = 3
                    java.lang.String r20 = r0.z(r1, r8)
                    r13 = r13 | 2
                    goto L_0x01fb
                L_0x020f:
                    r49 = r2
                    r23 = r8
                    r2 = r25
                    r22 = r27
                    r8 = 0
                    r11 = 3
                    boolean r24 = r0.n(r1, r8)
                    r13 = r13 | 1
                    goto L_0x01fb
                L_0x0220:
                    r23 = r8
                    r22 = r27
                    r8 = 0
                    r11 = 3
                    r26 = r8
                L_0x0228:
                    r11 = r22
                    r8 = r23
                    goto L_0x00ec
                L_0x022e:
                    r23 = r8
                    r22 = r11
                    r2 = r25
                    r33 = r2
                    r44 = r3
                    r39 = r4
                    r38 = r5
                    r36 = r6
                    r37 = r7
                    r40 = r9
                    r41 = r10
                    r45 = r12
                    r29 = r13
                    r43 = r14
                    r42 = r15
                    r31 = r20
                    r32 = r21
                    r34 = r22
                    r35 = r23
                    r30 = r24
                L_0x0256:
                    r0.c(r1)
                    ch.icoaching.typewise.config.CompanyConfig$b r0 = new ch.icoaching.typewise.config.CompanyConfig$b
                    r28 = r0
                    r46 = 0
                    r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.config.CompanyConfig.b.e.b(I2.e):ch.icoaching.typewise.config.CompanyConfig$b");
            }

            /* renamed from: g */
            public final void e(I2.f fVar, b bVar) {
                o.e(fVar, "encoder");
                o.e(bVar, "value");
                H2.f fVar2 = f8210b;
                I2.d d4 = fVar.d(fVar2);
                b.n(bVar, d4, fVar2);
                d4.c(fVar2);
            }
        }

        public static final class f {
            private f() {
            }

            public final F2.b serializer() {
                return e.f8209a;
            }

            public /* synthetic */ f(i iVar) {
                this();
            }
        }

        static {
            G0 g02 = G0.f622a;
            f8130r = new F2.b[]{null, null, null, null, null, null, null, new O(g02, new Q(g02)), new O(g02, new Q(g02)), new O(g02, new O(g02, g02)), new O(g02, new Q(g02)), new O(g02, new Q(g02)), new O(g02, new O(g02, g02)), new O(g02, new Q(g02)), new O(g02, new Q(g02)), new O(g02, new Q(g02))};
        }

        public /* synthetic */ b(int i4, boolean z3, String str, String str2, a aVar, d dVar, c cVar, C0131b bVar, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, Map map8, Map map9, C0 c02) {
            if (65535 != (i4 & 65535)) {
                C0317n0.a(i4, 65535, e.f8209a.a());
            }
            this.f8131a = z3;
            this.f8132b = str;
            this.f8133c = str2;
            this.f8134d = aVar;
            this.f8135e = dVar;
            this.f8136f = cVar;
            this.f8137g = bVar;
            this.f8138h = map;
            this.f8139i = map2;
            this.f8140j = map3;
            this.f8141k = map4;
            this.f8142l = map5;
            this.f8143m = map6;
            this.f8144n = map7;
            this.f8145o = map8;
            this.f8146p = map9;
        }

        public static final /* synthetic */ void n(b bVar, I2.d dVar, H2.f fVar) {
            F2.b[] bVarArr = f8130r;
            dVar.j(fVar, 0, bVar.f8131a);
            dVar.p(fVar, 1, bVar.f8132b);
            dVar.p(fVar, 2, bVar.f8133c);
            dVar.f(fVar, 3, a.C0129a.f8156a, bVar.f8134d);
            dVar.f(fVar, 4, d.C0136b.f8207a, bVar.f8135e);
            dVar.f(fVar, 5, c.a.f8168a, bVar.f8136f);
            dVar.f(fVar, 6, C0131b.a.f8160a, bVar.f8137g);
            dVar.f(fVar, 7, bVarArr[7], bVar.f8138h);
            dVar.f(fVar, 8, bVarArr[8], bVar.f8139i);
            dVar.f(fVar, 9, bVarArr[9], bVar.f8140j);
            dVar.f(fVar, 10, bVarArr[10], bVar.f8141k);
            dVar.f(fVar, 11, bVarArr[11], bVar.f8142l);
            dVar.f(fVar, 12, bVarArr[12], bVar.f8143m);
            dVar.o(fVar, 13, bVarArr[13], bVar.f8144n);
            dVar.o(fVar, 14, bVarArr[14], bVar.f8145o);
            dVar.o(fVar, 15, bVarArr[15], bVar.f8146p);
        }

        public final Map b() {
            return this.f8138h;
        }

        public final Map c() {
            return this.f8139i;
        }

        public final Map d() {
            return this.f8145o;
        }

        public final Map e() {
            return this.f8141k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f8131a == bVar.f8131a && o.a(this.f8132b, bVar.f8132b) && o.a(this.f8133c, bVar.f8133c) && o.a(this.f8134d, bVar.f8134d) && o.a(this.f8135e, bVar.f8135e) && o.a(this.f8136f, bVar.f8136f) && o.a(this.f8137g, bVar.f8137g) && o.a(this.f8138h, bVar.f8138h) && o.a(this.f8139i, bVar.f8139i) && o.a(this.f8140j, bVar.f8140j) && o.a(this.f8141k, bVar.f8141k) && o.a(this.f8142l, bVar.f8142l) && o.a(this.f8143m, bVar.f8143m) && o.a(this.f8144n, bVar.f8144n) && o.a(this.f8145o, bVar.f8145o) && o.a(this.f8146p, bVar.f8146p);
        }

        public final Map f() {
            return this.f8142l;
        }

        public final a g() {
            return this.f8134d;
        }

        public final Map h() {
            return this.f8143m;
        }

        public int hashCode() {
            int a4 = ((((((((((((((((((((((((androidx.work.c.a(this.f8131a) * 31) + this.f8132b.hashCode()) * 31) + this.f8133c.hashCode()) * 31) + this.f8134d.hashCode()) * 31) + this.f8135e.hashCode()) * 31) + this.f8136f.hashCode()) * 31) + this.f8137g.hashCode()) * 31) + this.f8138h.hashCode()) * 31) + this.f8139i.hashCode()) * 31) + this.f8140j.hashCode()) * 31) + this.f8141k.hashCode()) * 31) + this.f8142l.hashCode()) * 31) + this.f8143m.hashCode()) * 31;
            Map map = this.f8144n;
            int i4 = 0;
            int hashCode = (a4 + (map == null ? 0 : map.hashCode())) * 31;
            Map map2 = this.f8145o;
            int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            Map map3 = this.f8146p;
            if (map3 != null) {
                i4 = map3.hashCode();
            }
            return hashCode2 + i4;
        }

        public final c i() {
            return this.f8136f;
        }

        public final d j() {
            return this.f8135e;
        }

        public final Map k() {
            return this.f8146p;
        }

        public final Map l() {
            return this.f8144n;
        }

        public final boolean m() {
            return this.f8131a;
        }

        public String toString() {
            boolean z3 = this.f8131a;
            String str = this.f8132b;
            String str2 = this.f8133c;
            a aVar = this.f8134d;
            d dVar = this.f8135e;
            c cVar = this.f8136f;
            C0131b bVar = this.f8137g;
            Map map = this.f8138h;
            Map map2 = this.f8139i;
            Map map3 = this.f8140j;
            Map map4 = this.f8141k;
            Map map5 = this.f8142l;
            Map map6 = this.f8143m;
            Map map7 = this.f8144n;
            Map map8 = this.f8145o;
            Map map9 = this.f8146p;
            return "CorrectionConfig(isServer=" + z3 + ", baseModelName=" + str + ", ngramVersion=" + str2 + ", editDistanceWeights=" + aVar + ", settings=" + dVar + ", properties=" + cVar + ", neuralProperties=" + bVar + ", abbreviations=" + map + ", blocklist=" + map2 + ", casingOverwrite=" + map3 + ", dontCorrectAwayFromWords=" + map4 + ", dontPredictWords=" + map5 + ", hardcodedCorrections=" + map6 + ", wordsToCheckEvenIfInCasingDictionary=" + map7 + ", blocklistWordListNames=" + map8 + ", wordListBlocklistsNotToShowInCorrections=" + map9 + ")";
        }
    }

    @m
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0003\u0013\u001f\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lch/icoaching/typewise/config/CompanyConfig$c;", "", "Lch/icoaching/typewise/config/CompanyConfig$c$a;", "wordLists", "<init>", "(Lch/icoaching/typewise/config/CompanyConfig$c$a;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILch/icoaching/typewise/config/CompanyConfig$c$a;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "c", "(Lch/icoaching/typewise/config/CompanyConfig$c;LI2/d;LH2/f;)V", "a", "(Lch/icoaching/typewise/config/CompanyConfig$c$a;)Lch/icoaching/typewise/config/CompanyConfig$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lch/icoaching/typewise/config/CompanyConfig$c$a;", "b", "()Lch/icoaching/typewise/config/CompanyConfig$c$a;", "getWordLists$annotations", "()V", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
    public static final class c {

        /* renamed from: b  reason: collision with root package name */
        public static final C0138c f8211b = new C0138c((i) null);

        /* renamed from: a  reason: collision with root package name */
        private final a f8212a;

        @m
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u00162\u00020\u0001:\u0002 \u0016B%\u0012\u001c\u0010\u0006\u001a\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u0016\u001a\u00020\u00002\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR6\u0010\u0006\u001a\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lch/icoaching/typewise/config/CompanyConfig$c$a;", "", "", "", "Lch/icoaching/typewise/misc/Language;", "", "companySpecificWorldLists", "<init>", "(Ljava/util/Map;)V", "", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(ILjava/util/Map;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "d", "(Lch/icoaching/typewise/config/CompanyConfig$c$a;LI2/d;LH2/f;)V", "b", "(Ljava/util/Map;)Lch/icoaching/typewise/config/CompanyConfig$c$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "getCompanySpecificWorldLists$annotations", "()V", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
        public static final class a {

            /* renamed from: b  reason: collision with root package name */
            public static final b f8213b = new b((i) null);
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public static final F2.b[] f8214c;

            /* renamed from: a  reason: collision with root package name */
            private final Map f8215a;

            /* renamed from: ch.icoaching.typewise.config.CompanyConfig$c$a$a  reason: collision with other inner class name */
            public /* synthetic */ class C0137a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final C0137a f8216a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f8217b;

                static {
                    C0137a aVar = new C0137a();
                    f8216a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.CompanyConfig.GlobalLibrarySettings.WordLists", aVar, 1);
                    s0Var.p("company_specific_wordlists", false);
                    f8217b = s0Var;
                }

                private C0137a() {
                }

                public final f a() {
                    return f8217b;
                }

                public final F2.b[] c() {
                    return new F2.b[]{a.f8214c[0]};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final a b(I2.e eVar) {
                    Map map;
                    o.e(eVar, "decoder");
                    f fVar = f8217b;
                    I2.c d4 = eVar.d(fVar);
                    F2.b[] a4 = a.f8214c;
                    int i4 = 1;
                    if (d4.p()) {
                        map = (Map) d4.E(fVar, 0, a4[0], (Object) null);
                    } else {
                        boolean z3 = true;
                        int i5 = 0;
                        Map map2 = null;
                        while (z3) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z3 = false;
                            } else if (e4 == 0) {
                                map2 = (Map) d4.E(fVar, 0, a4[0], map2);
                                i5 = 1;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        map = map2;
                        i4 = i5;
                    }
                    d4.c(fVar);
                    return new a(i4, map, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, a aVar) {
                    o.e(fVar, "encoder");
                    o.e(aVar, "value");
                    f fVar2 = f8217b;
                    I2.d d4 = fVar.d(fVar2);
                    d4.f(fVar2, 0, a.f8214c[0], aVar.f8215a);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return C0137a.f8216a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            static {
                G0 g02 = G0.f622a;
                f8214c = new F2.b[]{new O(g02, new C0300f(g02))};
            }

            public /* synthetic */ a(int i4, Map map, C0 c02) {
                if (1 != (i4 & 1)) {
                    C0317n0.a(i4, 1, C0137a.f8216a.a());
                }
                this.f8215a = map;
            }

            public final a b(Map map) {
                o.e(map, "companySpecificWorldLists");
                return new a(map);
            }

            public final Map c() {
                return this.f8215a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && o.a(this.f8215a, ((a) obj).f8215a);
            }

            public int hashCode() {
                return this.f8215a.hashCode();
            }

            public String toString() {
                Map map = this.f8215a;
                return "WordLists(companySpecificWorldLists=" + map + ")";
            }

            public a(Map map) {
                o.e(map, "companySpecificWorldLists");
                this.f8215a = map;
            }
        }

        public /* synthetic */ class b implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final b f8218a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f8219b;

            static {
                b bVar = new b();
                f8218a = bVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.CompanyConfig.GlobalLibrarySettings", bVar, 1);
                s0Var.p("wordlists", false);
                f8219b = s0Var;
            }

            private b() {
            }

            public final f a() {
                return f8219b;
            }

            public final F2.b[] c() {
                return new F2.b[]{a.C0137a.f8216a};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* renamed from: f */
            public final c b(I2.e eVar) {
                a aVar;
                o.e(eVar, "decoder");
                f fVar = f8219b;
                I2.c d4 = eVar.d(fVar);
                int i4 = 1;
                if (d4.p()) {
                    aVar = (a) d4.E(fVar, 0, a.C0137a.f8216a, (Object) null);
                } else {
                    boolean z3 = true;
                    int i5 = 0;
                    aVar = null;
                    while (z3) {
                        int e4 = d4.e(fVar);
                        if (e4 == -1) {
                            z3 = false;
                        } else if (e4 == 0) {
                            aVar = (a) d4.E(fVar, 0, a.C0137a.f8216a, aVar);
                            i5 = 1;
                        } else {
                            throw new UnknownFieldException(e4);
                        }
                    }
                    i4 = i5;
                }
                d4.c(fVar);
                return new c(i4, aVar, (C0) null);
            }

            /* renamed from: g */
            public final void e(I2.f fVar, c cVar) {
                o.e(fVar, "encoder");
                o.e(cVar, "value");
                f fVar2 = f8219b;
                I2.d d4 = fVar.d(fVar2);
                d4.f(fVar2, 0, a.C0137a.f8216a, cVar.f8212a);
                d4.c(fVar2);
            }
        }

        /* renamed from: ch.icoaching.typewise.config.CompanyConfig$c$c  reason: collision with other inner class name */
        public static final class C0138c {
            private C0138c() {
            }

            public final F2.b serializer() {
                return b.f8218a;
            }

            public /* synthetic */ C0138c(i iVar) {
                this();
            }
        }

        public /* synthetic */ c(int i4, a aVar, C0 c02) {
            if (1 != (i4 & 1)) {
                C0317n0.a(i4, 1, b.f8218a.a());
            }
            this.f8212a = aVar;
        }

        public final c a(a aVar) {
            o.e(aVar, "wordLists");
            return new c(aVar);
        }

        public final a b() {
            return this.f8212a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && o.a(this.f8212a, ((c) obj).f8212a);
        }

        public int hashCode() {
            return this.f8212a.hashCode();
        }

        public String toString() {
            a aVar = this.f8212a;
            return "GlobalLibrarySettings(wordLists=" + aVar + ")";
        }

        public c(a aVar) {
            o.e(aVar, "wordLists");
            this.f8212a = aVar;
        }
    }

    @m
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 \u00132\u00020\u0001:\u0003\u001e\"#BC\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u001e\u0010!R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010!R \u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001f\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010!¨\u0006&"}, d2 = {"Lch/icoaching/typewise/config/CompanyConfig$d;", "", "", "seen0", "Lch/icoaching/typewise/config/CompanyConfig$d$a;", "prediction", "autocorrection", "grammar", "languageDetection", "LJ2/C0;", "serializationConstructorMarker", "<init>", "(ILch/icoaching/typewise/config/CompanyConfig$d$a;Lch/icoaching/typewise/config/CompanyConfig$d$a;Lch/icoaching/typewise/config/CompanyConfig$d$a;Lch/icoaching/typewise/config/CompanyConfig$d$a;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "e", "(Lch/icoaching/typewise/config/CompanyConfig$d;LI2/d;LH2/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lch/icoaching/typewise/config/CompanyConfig$d$a;", "d", "()Lch/icoaching/typewise/config/CompanyConfig$d$a;", "b", "c", "getLanguageDetection$annotations", "()V", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
    public static final class d {

        /* renamed from: e  reason: collision with root package name */
        public static final c f8220e = new c((i) null);

        /* renamed from: a  reason: collision with root package name */
        private final a f8221a;

        /* renamed from: b  reason: collision with root package name */
        private final a f8222b;

        /* renamed from: c  reason: collision with root package name */
        private final a f8223c;

        /* renamed from: d  reason: collision with root package name */
        private final a f8224d;

        @m
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u001a\u0010B#\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lch/icoaching/typewise/config/CompanyConfig$d$a;", "", "", "seen0", "", "enabled", "LJ2/C0;", "serializationConstructorMarker", "<init>", "(IZLJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "b", "(Lch/icoaching/typewise/config/CompanyConfig$d$a;LI2/d;LH2/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "typewise-autocorrect-library-common-3.0.19(161)_release"}, k = 1, mv = {2, 0, 0})
        public static final class a {

            /* renamed from: b  reason: collision with root package name */
            public static final b f8225b = new b((i) null);

            /* renamed from: a  reason: collision with root package name */
            private final boolean f8226a;

            /* renamed from: ch.icoaching.typewise.config.CompanyConfig$d$a$a  reason: collision with other inner class name */
            public /* synthetic */ class C0139a implements F {

                /* renamed from: a  reason: collision with root package name */
                public static final C0139a f8227a;

                /* renamed from: b  reason: collision with root package name */
                private static final f f8228b;

                static {
                    C0139a aVar = new C0139a();
                    f8227a = aVar;
                    C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.CompanyConfig.LanguageSettings.Feature", aVar, 1);
                    s0Var.p("enabled", false);
                    f8228b = s0Var;
                }

                private C0139a() {
                }

                public final f a() {
                    return f8228b;
                }

                public final F2.b[] c() {
                    return new F2.b[]{C0306i.f706a};
                }

                public F2.b[] d() {
                    return F.a.a(this);
                }

                /* renamed from: f */
                public final a b(I2.e eVar) {
                    boolean z3;
                    o.e(eVar, "decoder");
                    f fVar = f8228b;
                    I2.c d4 = eVar.d(fVar);
                    int i4 = 1;
                    if (d4.p()) {
                        z3 = d4.n(fVar, 0);
                    } else {
                        boolean z4 = true;
                        z3 = false;
                        int i5 = 0;
                        while (z4) {
                            int e4 = d4.e(fVar);
                            if (e4 == -1) {
                                z4 = false;
                            } else if (e4 == 0) {
                                z3 = d4.n(fVar, 0);
                                i5 = 1;
                            } else {
                                throw new UnknownFieldException(e4);
                            }
                        }
                        i4 = i5;
                    }
                    d4.c(fVar);
                    return new a(i4, z3, (C0) null);
                }

                /* renamed from: g */
                public final void e(I2.f fVar, a aVar) {
                    o.e(fVar, "encoder");
                    o.e(aVar, "value");
                    f fVar2 = f8228b;
                    I2.d d4 = fVar.d(fVar2);
                    d4.j(fVar2, 0, aVar.f8226a);
                    d4.c(fVar2);
                }
            }

            public static final class b {
                private b() {
                }

                public final F2.b serializer() {
                    return C0139a.f8227a;
                }

                public /* synthetic */ b(i iVar) {
                    this();
                }
            }

            public /* synthetic */ a(int i4, boolean z3, C0 c02) {
                if (1 != (i4 & 1)) {
                    C0317n0.a(i4, 1, C0139a.f8227a.a());
                }
                this.f8226a = z3;
            }

            public final boolean a() {
                return this.f8226a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f8226a == ((a) obj).f8226a;
            }

            public int hashCode() {
                return androidx.work.c.a(this.f8226a);
            }

            public String toString() {
                boolean z3 = this.f8226a;
                return "Feature(enabled=" + z3 + ")";
            }
        }

        public /* synthetic */ class b implements F {

            /* renamed from: a  reason: collision with root package name */
            public static final b f8229a;

            /* renamed from: b  reason: collision with root package name */
            private static final f f8230b;

            static {
                b bVar = new b();
                f8229a = bVar;
                C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.CompanyConfig.LanguageSettings", bVar, 4);
                s0Var.p("prediction", false);
                s0Var.p("autocorrection", false);
                s0Var.p("grammar", false);
                s0Var.p("language_detection", false);
                f8230b = s0Var;
            }

            private b() {
            }

            public final f a() {
                return f8230b;
            }

            public final F2.b[] c() {
                a.C0139a aVar = a.C0139a.f8227a;
                return new F2.b[]{aVar, aVar, aVar, aVar};
            }

            public F2.b[] d() {
                return F.a.a(this);
            }

            /* renamed from: f */
            public final d b(I2.e eVar) {
                a aVar;
                a aVar2;
                a aVar3;
                a aVar4;
                int i4;
                I2.e eVar2 = eVar;
                o.e(eVar2, "decoder");
                f fVar = f8230b;
                I2.c d4 = eVar2.d(fVar);
                a aVar5 = null;
                if (d4.p()) {
                    a.C0139a aVar6 = a.C0139a.f8227a;
                    aVar = (a) d4.E(fVar, 3, aVar6, (Object) null);
                    i4 = 15;
                    aVar2 = (a) d4.E(fVar, 2, aVar6, (Object) null);
                    aVar3 = (a) d4.E(fVar, 1, aVar6, (Object) null);
                    aVar4 = (a) d4.E(fVar, 0, aVar6, (Object) null);
                } else {
                    boolean z3 = true;
                    int i5 = 0;
                    a aVar7 = null;
                    a aVar8 = null;
                    a aVar9 = null;
                    while (z3) {
                        int e4 = d4.e(fVar);
                        if (e4 == -1) {
                            z3 = false;
                        } else if (e4 == 0) {
                            aVar5 = (a) d4.E(fVar, 0, a.C0139a.f8227a, aVar5);
                            i5 |= 1;
                        } else if (e4 == 1) {
                            aVar7 = (a) d4.E(fVar, 1, a.C0139a.f8227a, aVar7);
                            i5 |= 2;
                        } else if (e4 == 2) {
                            aVar8 = (a) d4.E(fVar, 2, a.C0139a.f8227a, aVar8);
                            i5 |= 4;
                        } else if (e4 == 3) {
                            aVar9 = (a) d4.E(fVar, 3, a.C0139a.f8227a, aVar9);
                            i5 |= 8;
                        } else {
                            throw new UnknownFieldException(e4);
                        }
                    }
                    i4 = i5;
                    aVar4 = aVar5;
                    aVar3 = aVar7;
                    aVar2 = aVar8;
                    aVar = aVar9;
                }
                d4.c(fVar);
                return new d(i4, aVar4, aVar3, aVar2, aVar, (C0) null);
            }

            /* renamed from: g */
            public final void e(I2.f fVar, d dVar) {
                o.e(fVar, "encoder");
                o.e(dVar, "value");
                f fVar2 = f8230b;
                I2.d d4 = fVar.d(fVar2);
                d.e(dVar, d4, fVar2);
                d4.c(fVar2);
            }
        }

        public static final class c {
            private c() {
            }

            public final F2.b serializer() {
                return b.f8229a;
            }

            public /* synthetic */ c(i iVar) {
                this();
            }
        }

        public /* synthetic */ d(int i4, a aVar, a aVar2, a aVar3, a aVar4, C0 c02) {
            if (15 != (i4 & 15)) {
                C0317n0.a(i4, 15, b.f8229a.a());
            }
            this.f8221a = aVar;
            this.f8222b = aVar2;
            this.f8223c = aVar3;
            this.f8224d = aVar4;
        }

        public static final /* synthetic */ void e(d dVar, I2.d dVar2, f fVar) {
            a.C0139a aVar = a.C0139a.f8227a;
            dVar2.f(fVar, 0, aVar, dVar.f8221a);
            dVar2.f(fVar, 1, aVar, dVar.f8222b);
            dVar2.f(fVar, 2, aVar, dVar.f8223c);
            dVar2.f(fVar, 3, aVar, dVar.f8224d);
        }

        public final a a() {
            return this.f8222b;
        }

        public final a b() {
            return this.f8223c;
        }

        public final a c() {
            return this.f8224d;
        }

        public final a d() {
            return this.f8221a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return o.a(this.f8221a, dVar.f8221a) && o.a(this.f8222b, dVar.f8222b) && o.a(this.f8223c, dVar.f8223c) && o.a(this.f8224d, dVar.f8224d);
        }

        public int hashCode() {
            return (((((this.f8221a.hashCode() * 31) + this.f8222b.hashCode()) * 31) + this.f8223c.hashCode()) * 31) + this.f8224d.hashCode();
        }

        public String toString() {
            a aVar = this.f8221a;
            a aVar2 = this.f8222b;
            a aVar3 = this.f8223c;
            a aVar4 = this.f8224d;
            return "LanguageSettings(prediction=" + aVar + ", autocorrection=" + aVar2 + ", grammar=" + aVar3 + ", languageDetection=" + aVar4 + ")";
        }
    }

    public /* synthetic */ class e implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final e f8231a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f8232b;

        static {
            e eVar = new e();
            f8231a = eVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.typewise.config.CompanyConfig", eVar, 6);
            s0Var.p("name", false);
            s0Var.p("authorizedClientUids", false);
            s0Var.p("languages", false);
            s0Var.p("global_library_settings", false);
            s0Var.p("correction_config", false);
            s0Var.p("special_configs", false);
            f8232b = s0Var;
        }

        private e() {
        }

        public final f a() {
            return f8232b;
        }

        public final F2.b[] c() {
            F2.b[] a4 = CompanyConfig.f8120g;
            return new F2.b[]{a4[0], G2.a.u(a4[1]), a4[2], c.b.f8218a, b.e.f8209a, G2.a.u(a4[5])};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.util.List} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.util.Map} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: ch.icoaching.typewise.config.CompanyConfig$c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: ch.icoaching.typewise.config.CompanyConfig$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.util.List} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ch.icoaching.typewise.config.CompanyConfig b(I2.e r27) {
            /*
                r26 = this;
                r0 = r27
                java.lang.String r1 = "decoder"
                kotlin.jvm.internal.o.e(r0, r1)
                H2.f r1 = f8232b
                I2.c r0 = r0.d(r1)
                F2.b[] r2 = ch.icoaching.typewise.config.CompanyConfig.f8120g
                boolean r3 = r0.p()
                r4 = 3
                r5 = 4
                r6 = 5
                r7 = 2
                r8 = 1
                r9 = 0
                r10 = 0
                if (r3 == 0) goto L_0x0060
                r3 = r2[r9]
                java.lang.Object r3 = r0.E(r1, r9, r3, r10)
                ch.icoaching.typewise.config.CompanyConfig$Name r3 = (ch.icoaching.typewise.config.CompanyConfig.Name) r3
                r9 = r2[r8]
                java.lang.Object r8 = r0.m(r1, r8, r9, r10)
                java.util.List r8 = (java.util.List) r8
                r9 = r2[r7]
                java.lang.Object r7 = r0.E(r1, r7, r9, r10)
                java.util.Map r7 = (java.util.Map) r7
                ch.icoaching.typewise.config.CompanyConfig$c$b r9 = ch.icoaching.typewise.config.CompanyConfig.c.b.f8218a
                java.lang.Object r4 = r0.E(r1, r4, r9, r10)
                ch.icoaching.typewise.config.CompanyConfig$c r4 = (ch.icoaching.typewise.config.CompanyConfig.c) r4
                ch.icoaching.typewise.config.CompanyConfig$b$e r9 = ch.icoaching.typewise.config.CompanyConfig.b.e.f8209a
                java.lang.Object r5 = r0.E(r1, r5, r9, r10)
                ch.icoaching.typewise.config.CompanyConfig$b r5 = (ch.icoaching.typewise.config.CompanyConfig.b) r5
                r2 = r2[r6]
                java.lang.Object r2 = r0.m(r1, r6, r2, r10)
                java.util.List r2 = (java.util.List) r2
                r6 = 63
                r24 = r2
                r19 = r3
                r22 = r4
                r23 = r5
                r18 = r6
                r21 = r7
                r20 = r8
                goto L_0x00d4
            L_0x0060:
                r16 = r8
                r3 = r9
                r11 = r10
                r12 = r11
                r13 = r12
                r14 = r13
                r15 = r14
            L_0x0068:
                if (r16 == 0) goto L_0x00c6
                int r9 = r0.e(r1)
                switch(r9) {
                    case -1: goto L_0x00c2;
                    case 0: goto L_0x00b4;
                    case 1: goto L_0x00a8;
                    case 2: goto L_0x009c;
                    case 3: goto L_0x0090;
                    case 4: goto L_0x0084;
                    case 5: goto L_0x0077;
                    default: goto L_0x0071;
                }
            L_0x0071:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>((int) r9)
                throw r0
            L_0x0077:
                r9 = r2[r6]
                java.lang.Object r9 = r0.m(r1, r6, r9, r15)
                r15 = r9
                java.util.List r15 = (java.util.List) r15
                r3 = r3 | 32
            L_0x0082:
                r9 = 0
                goto L_0x0068
            L_0x0084:
                ch.icoaching.typewise.config.CompanyConfig$b$e r9 = ch.icoaching.typewise.config.CompanyConfig.b.e.f8209a
                java.lang.Object r9 = r0.E(r1, r5, r9, r14)
                r14 = r9
                ch.icoaching.typewise.config.CompanyConfig$b r14 = (ch.icoaching.typewise.config.CompanyConfig.b) r14
                r3 = r3 | 16
                goto L_0x0082
            L_0x0090:
                ch.icoaching.typewise.config.CompanyConfig$c$b r9 = ch.icoaching.typewise.config.CompanyConfig.c.b.f8218a
                java.lang.Object r9 = r0.E(r1, r4, r9, r13)
                r13 = r9
                ch.icoaching.typewise.config.CompanyConfig$c r13 = (ch.icoaching.typewise.config.CompanyConfig.c) r13
                r3 = r3 | 8
                goto L_0x0082
            L_0x009c:
                r9 = r2[r7]
                java.lang.Object r9 = r0.E(r1, r7, r9, r12)
                r12 = r9
                java.util.Map r12 = (java.util.Map) r12
                r3 = r3 | 4
                goto L_0x0082
            L_0x00a8:
                r9 = r2[r8]
                java.lang.Object r9 = r0.m(r1, r8, r9, r11)
                r11 = r9
                java.util.List r11 = (java.util.List) r11
                r3 = r3 | 2
                goto L_0x0082
            L_0x00b4:
                r9 = 0
                r4 = r2[r9]
                java.lang.Object r4 = r0.E(r1, r9, r4, r10)
                r10 = r4
                ch.icoaching.typewise.config.CompanyConfig$Name r10 = (ch.icoaching.typewise.config.CompanyConfig.Name) r10
                r3 = r3 | 1
                r4 = 3
                goto L_0x0068
            L_0x00c2:
                r9 = 0
                r16 = r9
                goto L_0x0068
            L_0x00c6:
                r18 = r3
                r19 = r10
                r20 = r11
                r21 = r12
                r22 = r13
                r23 = r14
                r24 = r15
            L_0x00d4:
                r0.c(r1)
                ch.icoaching.typewise.config.CompanyConfig r0 = new ch.icoaching.typewise.config.CompanyConfig
                r25 = 0
                r17 = r0
                r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.config.CompanyConfig.e.b(I2.e):ch.icoaching.typewise.config.CompanyConfig");
        }

        /* renamed from: g */
        public final void e(I2.f fVar, CompanyConfig companyConfig) {
            o.e(fVar, "encoder");
            o.e(companyConfig, "value");
            f fVar2 = f8232b;
            I2.d d4 = fVar.d(fVar2);
            CompanyConfig.j(companyConfig, d4, fVar2);
            d4.c(fVar2);
        }
    }

    static {
        F2.b a4 = B.a("ch.icoaching.typewise.config.CompanyConfig.Name", Name.values(), new String[]{"test", LocalNotificationManager.DEFAULT_NOTIFICATION_CHANNEL_ID, "superhuman"}, new Annotation[][]{null, null, null}, (Annotation[]) null);
        G0 g02 = G0.f622a;
        f8120g = new F2.b[]{a4, new C0300f(g02), new O(g02, d.b.f8229a), null, null, new C0300f(g02)};
    }

    public /* synthetic */ CompanyConfig(int i4, Name name, List list, Map map, c cVar, b bVar, List list2, C0 c02) {
        if (63 != (i4 & 63)) {
            C0317n0.a(i4, 63, e.f8231a.a());
        }
        this.f8121a = name;
        this.f8122b = list;
        this.f8123c = map;
        this.f8124d = cVar;
        this.f8125e = bVar;
        this.f8126f = list2;
    }

    public static /* synthetic */ CompanyConfig c(CompanyConfig companyConfig, Name name, List list, Map map, c cVar, b bVar, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            name = companyConfig.f8121a;
        }
        if ((i4 & 2) != 0) {
            list = companyConfig.f8122b;
        }
        List list3 = list;
        if ((i4 & 4) != 0) {
            map = companyConfig.f8123c;
        }
        Map map2 = map;
        if ((i4 & 8) != 0) {
            cVar = companyConfig.f8124d;
        }
        c cVar2 = cVar;
        if ((i4 & 16) != 0) {
            bVar = companyConfig.f8125e;
        }
        b bVar2 = bVar;
        if ((i4 & 32) != 0) {
            list2 = companyConfig.f8126f;
        }
        return companyConfig.b(name, list3, map2, cVar2, bVar2, list2);
    }

    public static final /* synthetic */ void j(CompanyConfig companyConfig, I2.d dVar, f fVar) {
        F2.b[] bVarArr = f8120g;
        dVar.f(fVar, 0, bVarArr[0], companyConfig.f8121a);
        dVar.o(fVar, 1, bVarArr[1], companyConfig.f8122b);
        dVar.f(fVar, 2, bVarArr[2], companyConfig.f8123c);
        dVar.f(fVar, 3, c.b.f8218a, companyConfig.f8124d);
        dVar.f(fVar, 4, b.e.f8209a, companyConfig.f8125e);
        dVar.o(fVar, 5, bVarArr[5], companyConfig.f8126f);
    }

    public final CompanyConfig b(Name name, List list, Map map, c cVar, b bVar, List list2) {
        o.e(name, "name");
        o.e(map, "languages");
        o.e(cVar, "globalLibrarySettings");
        o.e(bVar, "correctionConfig");
        return new CompanyConfig(name, list, map, cVar, bVar, list2);
    }

    public final List d() {
        return this.f8122b;
    }

    public final b e() {
        return this.f8125e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompanyConfig)) {
            return false;
        }
        CompanyConfig companyConfig = (CompanyConfig) obj;
        return this.f8121a == companyConfig.f8121a && o.a(this.f8122b, companyConfig.f8122b) && o.a(this.f8123c, companyConfig.f8123c) && o.a(this.f8124d, companyConfig.f8124d) && o.a(this.f8125e, companyConfig.f8125e) && o.a(this.f8126f, companyConfig.f8126f);
    }

    public final c f() {
        return this.f8124d;
    }

    public final Map g() {
        return this.f8123c;
    }

    public final Name h() {
        return this.f8121a;
    }

    public int hashCode() {
        int hashCode = this.f8121a.hashCode() * 31;
        List list = this.f8122b;
        int i4 = 0;
        int hashCode2 = (((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f8123c.hashCode()) * 31) + this.f8124d.hashCode()) * 31) + this.f8125e.hashCode()) * 31;
        List list2 = this.f8126f;
        if (list2 != null) {
            i4 = list2.hashCode();
        }
        return hashCode2 + i4;
    }

    public final List i() {
        return this.f8126f;
    }

    public String toString() {
        Name name = this.f8121a;
        List list = this.f8122b;
        Map map = this.f8123c;
        c cVar = this.f8124d;
        b bVar = this.f8125e;
        List list2 = this.f8126f;
        return "CompanyConfig(name=" + name + ", authorizedClientUIDs=" + list + ", languages=" + map + ", globalLibrarySettings=" + cVar + ", correctionConfig=" + bVar + ", specialConfigs=" + list2 + ")";
    }

    public CompanyConfig(Name name, List list, Map map, c cVar, b bVar, List list2) {
        o.e(name, "name");
        o.e(map, "languages");
        o.e(cVar, "globalLibrarySettings");
        o.e(bVar, "correctionConfig");
        this.f8121a = name;
        this.f8122b = list;
        this.f8123c = map;
        this.f8124d = cVar;
        this.f8125e = bVar;
        this.f8126f = list2;
    }
}
