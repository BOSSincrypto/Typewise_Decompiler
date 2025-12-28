package okhttp3;

import Q2.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import n2.C0830a;

public final class k {

    /* renamed from: e  reason: collision with root package name */
    public static final b f15426e = new b((i) null);

    /* renamed from: f  reason: collision with root package name */
    private static final h[] f15427f;

    /* renamed from: g  reason: collision with root package name */
    private static final h[] f15428g;

    /* renamed from: h  reason: collision with root package name */
    public static final k f15429h;

    /* renamed from: i  reason: collision with root package name */
    public static final k f15430i;

    /* renamed from: j  reason: collision with root package name */
    public static final k f15431j;

    /* renamed from: k  reason: collision with root package name */
    public static final k f15432k = new a(false).a();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f15433a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15434b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final String[] f15435c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String[] f15436d;

    public static final class b {
        public /* synthetic */ b(i iVar) {
            this();
        }

        private b() {
        }
    }

    static {
        h hVar = h.f15294o1;
        h hVar2 = h.f15297p1;
        h hVar3 = h.f15300q1;
        h hVar4 = h.f15252a1;
        h hVar5 = h.f15264e1;
        h hVar6 = h.f15255b1;
        h hVar7 = h.f15267f1;
        h hVar8 = h.f15285l1;
        h hVar9 = h.f15282k1;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9};
        f15427f = hVarArr;
        h[] hVarArr2 = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, h.f15222L0, h.f15224M0, h.f15278j0, h.f15281k0, h.f15213H, h.f15221L, h.f15283l};
        f15428g = hVarArr2;
        a c4 = new a(true).c((h[]) Arrays.copyOf(hVarArr, hVarArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        f15429h = c4.j(tlsVersion, tlsVersion2).h(true).a();
        f15430i = new a(true).c((h[]) Arrays.copyOf(hVarArr2, hVarArr2.length)).j(tlsVersion, tlsVersion2).h(true).a();
        f15431j = new a(true).c((h[]) Arrays.copyOf(hVarArr2, hVarArr2.length)).j(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).h(true).a();
    }

    public k(boolean z3, boolean z4, String[] strArr, String[] strArr2) {
        this.f15433a = z3;
        this.f15434b = z4;
        this.f15435c = strArr;
        this.f15436d = strArr2;
    }

    private final k g(SSLSocket sSLSocket, boolean z3) {
        String[] strArr;
        String[] strArr2;
        if (this.f15435c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            o.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            strArr = d.E(enabledCipherSuites, this.f15435c, h.f15253b.c());
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f15436d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            o.d(enabledProtocols, "sslSocket.enabledProtocols");
            strArr2 = d.E(enabledProtocols, this.f15436d, C0830a.b());
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        o.d(supportedCipherSuites, "supportedCipherSuites");
        int x3 = d.x(supportedCipherSuites, "TLS_FALLBACK_SCSV", h.f15253b.c());
        if (z3 && x3 != -1) {
            o.d(strArr, "cipherSuitesIntersection");
            String str = supportedCipherSuites[x3];
            o.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            strArr = d.o(strArr, str);
        }
        a aVar = new a(this);
        o.d(strArr, "cipherSuitesIntersection");
        a b4 = aVar.b((String[]) Arrays.copyOf(strArr, strArr.length));
        o.d(strArr2, "tlsVersionsIntersection");
        return b4.i((String[]) Arrays.copyOf(strArr2, strArr2.length)).a();
    }

    public final void c(SSLSocket sSLSocket, boolean z3) {
        o.e(sSLSocket, "sslSocket");
        k g4 = g(sSLSocket, z3);
        if (g4.i() != null) {
            sSLSocket.setEnabledProtocols(g4.f15436d);
        }
        if (g4.d() != null) {
            sSLSocket.setEnabledCipherSuites(g4.f15435c);
        }
    }

    public final List d() {
        String[] strArr = this.f15435c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b4 : strArr) {
            arrayList.add(h.f15253b.b(b4));
        }
        return C0718m.B0(arrayList);
    }

    public final boolean e(SSLSocket sSLSocket) {
        o.e(sSLSocket, "socket");
        if (!this.f15433a) {
            return false;
        }
        String[] strArr = this.f15436d;
        if (strArr != null && !d.u(strArr, sSLSocket.getEnabledProtocols(), C0830a.b())) {
            return false;
        }
        String[] strArr2 = this.f15435c;
        if (strArr2 == null || d.u(strArr2, sSLSocket.getEnabledCipherSuites(), h.f15253b.c())) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z3 = this.f15433a;
        k kVar = (k) obj;
        if (z3 != kVar.f15433a) {
            return false;
        }
        if (!z3 || (Arrays.equals(this.f15435c, kVar.f15435c) && Arrays.equals(this.f15436d, kVar.f15436d) && this.f15434b == kVar.f15434b)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f15433a;
    }

    public final boolean h() {
        return this.f15434b;
    }

    public int hashCode() {
        int i4;
        if (!this.f15433a) {
            return 17;
        }
        String[] strArr = this.f15435c;
        int i5 = 0;
        if (strArr == null) {
            i4 = 0;
        } else {
            i4 = Arrays.hashCode(strArr);
        }
        int i6 = (527 + i4) * 31;
        String[] strArr2 = this.f15436d;
        if (strArr2 != null) {
            i5 = Arrays.hashCode(strArr2);
        }
        return ((i6 + i5) * 31) + (this.f15434b ^ true ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.f15436d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a4 : strArr) {
            arrayList.add(TlsVersion.Companion.a(a4));
        }
        return C0718m.B0(arrayList);
    }

    public String toString() {
        if (!this.f15433a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f15434b + ')';
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f15437a;

        /* renamed from: b  reason: collision with root package name */
        private String[] f15438b;

        /* renamed from: c  reason: collision with root package name */
        private String[] f15439c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f15440d;

        public a(boolean z3) {
            this.f15437a = z3;
        }

        public final k a() {
            return new k(this.f15437a, this.f15440d, this.f15438b, this.f15439c);
        }

        public final a b(String... strArr) {
            boolean z3;
            o.e(strArr, "cipherSuites");
            if (d()) {
                if (strArr.length == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    e((String[]) strArr.clone());
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }

        public final a c(h... hVarArr) {
            o.e(hVarArr, "cipherSuites");
            if (d()) {
                ArrayList arrayList = new ArrayList(hVarArr.length);
                for (h c4 : hVarArr) {
                    arrayList.add(c4.c());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return b((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }

        public final boolean d() {
            return this.f15437a;
        }

        public final void e(String[] strArr) {
            this.f15438b = strArr;
        }

        public final void f(boolean z3) {
            this.f15440d = z3;
        }

        public final void g(String[] strArr) {
            this.f15439c = strArr;
        }

        public final a h(boolean z3) {
            if (d()) {
                f(z3);
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }

        public final a i(String... strArr) {
            boolean z3;
            o.e(strArr, "tlsVersions");
            if (d()) {
                if (strArr.length == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    g((String[]) strArr.clone());
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }

        public final a j(TlsVersion... tlsVersionArr) {
            o.e(tlsVersionArr, "tlsVersions");
            if (d()) {
                ArrayList arrayList = new ArrayList(tlsVersionArr.length);
                for (TlsVersion javaName : tlsVersionArr) {
                    arrayList.add(javaName.javaName());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    return i((String[]) Arrays.copyOf(strArr, strArr.length));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }

        public a(k kVar) {
            o.e(kVar, "connectionSpec");
            this.f15437a = kVar.f();
            this.f15438b = kVar.f15435c;
            this.f15439c = kVar.f15436d;
            this.f15440d = kVar.h();
        }
    }
}
