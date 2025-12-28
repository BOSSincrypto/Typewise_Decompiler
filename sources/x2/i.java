package X2;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.o;

public class i extends k {

    /* renamed from: d  reason: collision with root package name */
    public static final a f1966d = new a((kotlin.jvm.internal.i) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f1967e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final i a() {
            if (b()) {
                return new i();
            }
            return null;
        }

        public final boolean b() {
            return i.f1967e;
        }

        private a() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r0.intValue() >= 9) goto L_0x0022;
     */
    static {
        /*
            X2.i$a r0 = new X2.i$a
            r1 = 0
            r0.<init>(r1)
            f1966d = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto L_0x0012
            r0 = r1
            goto L_0x0016
        L_0x0012:
            java.lang.Integer r0 = kotlin.text.o.m(r0)
        L_0x0016:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0024
            int r0 = r0.intValue()
            r1 = 9
            if (r0 < r1) goto L_0x002c
        L_0x0022:
            r2 = r3
            goto L_0x002c
        L_0x0024:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "getApplicationProtocol"
            r0.getMethod(r4, r1)     // Catch:{ NoSuchMethodException -> 0x002c }
            goto L_0x0022
        L_0x002c:
            f1967e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.i.<clinit>():void");
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        o.e(sSLSocket, "sslSocket");
        o.e(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Object[] array = k.f1971a.b(list).toArray(new String[0]);
        if (array != null) {
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public String g(SSLSocket sSLSocket) {
        boolean z3;
        o.e(sSLSocket, "sslSocket");
        try {
            String a4 = sSLSocket.getApplicationProtocol();
            if (a4 == null) {
                z3 = true;
            } else {
                z3 = o.a(a4, "");
            }
            if (z3) {
                return null;
            }
            return a4;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
