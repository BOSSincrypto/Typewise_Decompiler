package U2;

import Q2.d;
import X2.k;
import c3.C0500b;
import com.silkimen.http.HttpRequest;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.D;
import kotlin.jvm.internal.o;
import okhttp3.A;
import okhttp3.g;
import okhttp3.l;
import okhttp3.m;
import okhttp3.s;
import okhttp3.t;
import okio.ByteString;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static final ByteString f1513a;

    /* renamed from: b  reason: collision with root package name */
    private static final ByteString f1514b;

    static {
        ByteString.a aVar = ByteString.Companion;
        f1513a = aVar.d("\"\\");
        f1514b = aVar.d("\t ,=");
    }

    public static final List a(s sVar, String str) {
        o.e(sVar, "<this>");
        o.e(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = sVar.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            if (kotlin.text.o.v(str, sVar.c(i4), true)) {
                try {
                    c(new C0500b().f0(sVar.f(i4)), arrayList);
                } catch (EOFException e4) {
                    k.f1971a.g().j("Unable to parse challenge", 5, e4);
                }
            }
            i4 = i5;
        }
        return arrayList;
    }

    public static final boolean b(A a4) {
        o.e(a4, "<this>");
        if (o.a(a4.o0().g(), HttpRequest.METHOD_HEAD)) {
            return false;
        }
        int m4 = a4.m();
        if (((m4 >= 100 && m4 < 200) || m4 == 204 || m4 == 304) && d.v(a4) == -1 && !kotlin.text.o.v("chunked", A.A(a4, "Transfer-Encoding", (String) null, 2, (Object) null), true)) {
            return false;
        }
        return true;
    }

    private static final void c(C0500b bVar, List list) {
        String e4;
        int K3;
        String str;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    g(bVar);
                    str2 = e(bVar);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean g4 = g(bVar);
                e4 = e(bVar);
                if (e4 != null) {
                    K3 = d.K(bVar, (byte) 61);
                    boolean g5 = g(bVar);
                    if (g4 || (!g5 && !bVar.H())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int K4 = K3 + d.K(bVar, (byte) 61);
                        while (true) {
                            if (e4 == null) {
                                e4 = e(bVar);
                                if (g(bVar)) {
                                    continue;
                                    break;
                                }
                                K4 = d.K(bVar, (byte) 61);
                            }
                            if (K4 == 0) {
                                continue;
                                break;
                            } else if (K4 <= 1 && !g(bVar)) {
                                if (h(bVar, (byte) 34)) {
                                    str = d(bVar);
                                } else {
                                    str = e(bVar);
                                }
                                if (str == null || ((String) linkedHashMap.put(e4, str)) != null) {
                                    return;
                                }
                                if (g(bVar) || bVar.H()) {
                                    e4 = null;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new g(str2, linkedHashMap));
                        str2 = e4;
                    }
                } else if (bVar.H()) {
                    list.add(new g(str2, D.h()));
                    return;
                } else {
                    return;
                }
            }
            Map singletonMap = Collections.singletonMap((Object) null, o.k(e4, kotlin.text.o.y("=", K3)));
            o.d(singletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
            list.add(new g(str2, singletonMap));
        }
    }

    private static final String d(C0500b bVar) {
        if (bVar.readByte() == 34) {
            C0500b bVar2 = new C0500b();
            while (true) {
                long R3 = bVar.R(f1513a);
                if (R3 == -1) {
                    return null;
                }
                if (bVar.G(R3) == 34) {
                    bVar2.z(bVar, R3);
                    bVar.readByte();
                    return bVar2.s0();
                } else if (bVar.w0() == R3 + 1) {
                    return null;
                } else {
                    bVar2.z(bVar, R3);
                    bVar.readByte();
                    bVar2.z(bVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private static final String e(C0500b bVar) {
        long R3 = bVar.R(f1514b);
        if (R3 == -1) {
            R3 = bVar.w0();
        }
        if (R3 != 0) {
            return bVar.t0(R3);
        }
        return null;
    }

    public static final void f(m mVar, t tVar, s sVar) {
        o.e(mVar, "<this>");
        o.e(tVar, "url");
        o.e(sVar, "headers");
        if (mVar != m.f15463b) {
            List e4 = l.f15441j.e(tVar, sVar);
            if (!e4.isEmpty()) {
                mVar.b(tVar, e4);
            }
        }
    }

    private static final boolean g(C0500b bVar) {
        boolean z3 = false;
        while (!bVar.H()) {
            byte G3 = bVar.G(0);
            if (G3 == 44) {
                bVar.readByte();
                z3 = true;
            } else if (G3 != 32 && G3 != 9) {
                break;
            } else {
                bVar.readByte();
            }
        }
        return z3;
    }

    private static final boolean h(C0500b bVar, byte b4) {
        if (bVar.H() || bVar.G(0) != b4) {
            return false;
        }
        return true;
    }
}
