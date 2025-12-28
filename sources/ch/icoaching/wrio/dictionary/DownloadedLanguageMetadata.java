package ch.icoaching.wrio.dictionary;

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
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006-"}, d2 = {"Lch/icoaching/wrio/dictionary/DownloadedLanguageMetadata;", "", "", "version", "", "", "files", "<init>", "(ILjava/util/List;)V", "seen0", "LJ2/C0;", "serializationConstructorMarker", "(IILjava/util/List;LJ2/C0;)V", "self", "LI2/d;", "output", "LH2/f;", "serialDesc", "Ll2/q;", "write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease", "(Lch/icoaching/wrio/dictionary/DownloadedLanguageMetadata;LI2/d;LH2/f;)V", "write$Self", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lch/icoaching/wrio/dictionary/DownloadedLanguageMetadata;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getVersion", "getVersion$annotations", "()V", "Ljava/util/List;", "getFiles", "getFiles$annotations", "Companion", "b", "a", "typewise-sdk-2.4.40(219)_typewiseRemoteRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@m
public final class DownloadedLanguageMetadata {
    /* access modifiers changed from: private */
    public static final F2.b[] $childSerializers = {null, new C0300f(G0.f622a)};
    public static final a Companion = new a((i) null);
    private final List<String> files;
    private final int version;

    public static final class a {
        private a() {
        }

        public final F2.b serializer() {
            return b.f9600a;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public /* synthetic */ class b implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final b f9600a;

        /* renamed from: b  reason: collision with root package name */
        private static final f f9601b;

        static {
            b bVar = new b();
            f9600a = bVar;
            C0326s0 s0Var = new C0326s0("ch.icoaching.wrio.dictionary.DownloadedLanguageMetadata", bVar, 2);
            s0Var.p("version", false);
            s0Var.p("files", false);
            f9601b = s0Var;
        }

        private b() {
        }

        public final f a() {
            return f9601b;
        }

        public final F2.b[] c() {
            return new F2.b[]{K.f636a, DownloadedLanguageMetadata.$childSerializers[1]};
        }

        public F2.b[] d() {
            return F.a.a(this);
        }

        /* renamed from: f */
        public final DownloadedLanguageMetadata b(e eVar) {
            int i4;
            int i5;
            List list;
            o.e(eVar, "decoder");
            f fVar = f9601b;
            c d4 = eVar.d(fVar);
            F2.b[] access$get$childSerializers$cp = DownloadedLanguageMetadata.$childSerializers;
            if (d4.p()) {
                i5 = d4.v(fVar, 0);
                list = (List) d4.E(fVar, 1, access$get$childSerializers$cp[1], (Object) null);
                i4 = 3;
            } else {
                boolean z3 = true;
                int i6 = 0;
                int i7 = 0;
                List list2 = null;
                while (z3) {
                    int e4 = d4.e(fVar);
                    if (e4 == -1) {
                        z3 = false;
                    } else if (e4 == 0) {
                        i6 = d4.v(fVar, 0);
                        i7 |= 1;
                    } else if (e4 == 1) {
                        list2 = (List) d4.E(fVar, 1, access$get$childSerializers$cp[1], list2);
                        i7 |= 2;
                    } else {
                        throw new UnknownFieldException(e4);
                    }
                }
                list = list2;
                i5 = i6;
                i4 = i7;
            }
            d4.c(fVar);
            return new DownloadedLanguageMetadata(i4, i5, list, (C0) null);
        }

        /* renamed from: g */
        public final void e(I2.f fVar, DownloadedLanguageMetadata downloadedLanguageMetadata) {
            o.e(fVar, "encoder");
            o.e(downloadedLanguageMetadata, "value");
            f fVar2 = f9601b;
            d d4 = fVar.d(fVar2);
            DownloadedLanguageMetadata.write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease(downloadedLanguageMetadata, d4, fVar2);
            d4.c(fVar2);
        }
    }

    public /* synthetic */ DownloadedLanguageMetadata(int i4, int i5, List list, C0 c02) {
        if (3 != (i4 & 3)) {
            C0317n0.a(i4, 3, b.f9600a.a());
        }
        this.version = i5;
        this.files = list;
    }

    public static /* synthetic */ DownloadedLanguageMetadata copy$default(DownloadedLanguageMetadata downloadedLanguageMetadata, int i4, List<String> list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = downloadedLanguageMetadata.version;
        }
        if ((i5 & 2) != 0) {
            list = downloadedLanguageMetadata.files;
        }
        return downloadedLanguageMetadata.copy(i4, list);
    }

    public static /* synthetic */ void getFiles$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$typewise_sdk_2_4_40_219__typewiseRemoteRelease(DownloadedLanguageMetadata downloadedLanguageMetadata, d dVar, f fVar) {
        F2.b[] bVarArr = $childSerializers;
        dVar.z(fVar, 0, downloadedLanguageMetadata.version);
        dVar.f(fVar, 1, bVarArr[1], downloadedLanguageMetadata.files);
    }

    public final int component1() {
        return this.version;
    }

    public final List<String> component2() {
        return this.files;
    }

    public final DownloadedLanguageMetadata copy(int i4, List<String> list) {
        o.e(list, "files");
        return new DownloadedLanguageMetadata(i4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadedLanguageMetadata)) {
            return false;
        }
        DownloadedLanguageMetadata downloadedLanguageMetadata = (DownloadedLanguageMetadata) obj;
        return this.version == downloadedLanguageMetadata.version && o.a(this.files, downloadedLanguageMetadata.files);
    }

    public final List<String> getFiles() {
        return this.files;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.version * 31) + this.files.hashCode();
    }

    public String toString() {
        return "DownloadedLanguageMetadata(version=" + this.version + ", files=" + this.files + ')';
    }

    public DownloadedLanguageMetadata(int i4, List<String> list) {
        o.e(list, "files");
        this.version = i4;
        this.files = list;
    }
}
