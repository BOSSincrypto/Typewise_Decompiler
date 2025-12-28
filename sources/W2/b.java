package W2;

import c3.C0500b;
import c3.d;
import c3.k;
import c3.w;
import com.getcapacitor.Bridge;
import com.silkimen.http.HttpRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.uuid.Uuid;
import okio.ByteString;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f1710a;

    /* renamed from: b  reason: collision with root package name */
    private static final a[] f1711b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map f1712c;

    static {
        b bVar = new b();
        f1710a = bVar;
        a aVar = new a(a.f1706j, "");
        ByteString byteString = a.f1703g;
        a aVar2 = new a(byteString, HttpRequest.METHOD_GET);
        a aVar3 = new a(byteString, HttpRequest.METHOD_POST);
        ByteString byteString2 = a.f1704h;
        a aVar4 = new a(byteString2, "/");
        a aVar5 = new a(byteString2, "/index.html");
        ByteString byteString3 = a.f1705i;
        a aVar6 = new a(byteString3, Bridge.CAPACITOR_HTTP_SCHEME);
        a aVar7 = new a(byteString3, Bridge.CAPACITOR_HTTPS_SCHEME);
        ByteString byteString4 = a.f1702f;
        a aVar8 = new a(byteString4, "200");
        a aVar9 = new a(byteString4, "204");
        a aVar10 = new a(byteString4, "206");
        a aVar11 = new a(byteString4, "304");
        a aVar12 = new a(byteString4, "400");
        b bVar2 = bVar;
        a aVar13 = new a(byteString4, "404");
        a aVar14 = new a(byteString4, "500");
        a aVar15 = aVar14;
        f1711b = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar15, new a("accept-charset", ""), new a("accept-encoding", "gzip, deflate"), new a("accept-language", ""), new a("accept-ranges", ""), new a("accept", ""), new a("access-control-allow-origin", ""), new a("age", ""), new a("allow", ""), new a("authorization", ""), new a("cache-control", ""), new a("content-disposition", ""), new a("content-encoding", ""), new a("content-language", ""), new a("content-length", ""), new a("content-location", ""), new a("content-range", ""), new a("content-type", ""), new a("cookie", ""), new a("date", ""), new a("etag", ""), new a("expect", ""), new a("expires", ""), new a("from", ""), new a("host", ""), new a("if-match", ""), new a("if-modified-since", ""), new a("if-none-match", ""), new a("if-range", ""), new a("if-unmodified-since", ""), new a("last-modified", ""), new a("link", ""), new a("location", ""), new a("max-forwards", ""), new a("proxy-authenticate", ""), new a("proxy-authorization", ""), new a("range", ""), new a("referer", ""), new a("refresh", ""), new a("retry-after", ""), new a("server", ""), new a("set-cookie", ""), new a("strict-transport-security", ""), new a("transfer-encoding", ""), new a("user-agent", ""), new a("vary", ""), new a("via", ""), new a("www-authenticate", "")};
        f1712c = bVar2.d();
    }

    private b() {
    }

    private final Map d() {
        a[] aVarArr = f1711b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(aVarArr.length);
        int length = aVarArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1;
            a[] aVarArr2 = f1711b;
            if (!linkedHashMap.containsKey(aVarArr2[i4].f1707a)) {
                linkedHashMap.put(aVarArr2[i4].f1707a, Integer.valueOf(i4));
            }
            i4 = i5;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        o.d(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public final ByteString a(ByteString byteString) {
        o.e(byteString, "name");
        int size = byteString.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            byte b4 = byteString.getByte(i4);
            if (65 > b4 || b4 > 90) {
                i4 = i5;
            } else {
                throw new IOException(o.k("PROTOCOL_ERROR response malformed: mixed case name: ", byteString.utf8()));
            }
        }
        return byteString;
    }

    public final Map b() {
        return f1712c;
    }

    public final a[] c() {
        return f1711b;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f1713a;

        /* renamed from: b  reason: collision with root package name */
        private int f1714b;

        /* renamed from: c  reason: collision with root package name */
        private final List f1715c;

        /* renamed from: d  reason: collision with root package name */
        private final d f1716d;

        /* renamed from: e  reason: collision with root package name */
        public a[] f1717e;

        /* renamed from: f  reason: collision with root package name */
        private int f1718f;

        /* renamed from: g  reason: collision with root package name */
        public int f1719g;

        /* renamed from: h  reason: collision with root package name */
        public int f1720h;

        public a(w wVar, int i4, int i5) {
            o.e(wVar, "source");
            this.f1713a = i4;
            this.f1714b = i5;
            this.f1715c = new ArrayList();
            this.f1716d = k.b(wVar);
            a[] aVarArr = new a[8];
            this.f1717e = aVarArr;
            this.f1718f = aVarArr.length - 1;
        }

        private final void a() {
            int i4 = this.f1714b;
            int i5 = this.f1720h;
            if (i4 >= i5) {
                return;
            }
            if (i4 == 0) {
                b();
            } else {
                d(i5 - i4);
            }
        }

        private final void b() {
            C0713h.k(this.f1717e, (Object) null, 0, 0, 6, (Object) null);
            this.f1718f = this.f1717e.length - 1;
            this.f1719g = 0;
            this.f1720h = 0;
        }

        private final int c(int i4) {
            return this.f1718f + 1 + i4;
        }

        private final int d(int i4) {
            int i5;
            int i6 = 0;
            if (i4 > 0) {
                int length = this.f1717e.length;
                while (true) {
                    length--;
                    i5 = this.f1718f;
                    if (length < i5 || i4 <= 0) {
                        a[] aVarArr = this.f1717e;
                        System.arraycopy(aVarArr, i5 + 1, aVarArr, i5 + 1 + i6, this.f1719g);
                        this.f1718f += i6;
                    } else {
                        a aVar = this.f1717e[length];
                        o.b(aVar);
                        int i7 = aVar.f1709c;
                        i4 -= i7;
                        this.f1720h -= i7;
                        this.f1719g--;
                        i6++;
                    }
                }
                a[] aVarArr2 = this.f1717e;
                System.arraycopy(aVarArr2, i5 + 1, aVarArr2, i5 + 1 + i6, this.f1719g);
                this.f1718f += i6;
            }
            return i6;
        }

        private final ByteString f(int i4) {
            if (h(i4)) {
                return b.f1710a.c()[i4].f1707a;
            }
            int c4 = c(i4 - b.f1710a.c().length);
            if (c4 >= 0) {
                a[] aVarArr = this.f1717e;
                if (c4 < aVarArr.length) {
                    a aVar = aVarArr[c4];
                    o.b(aVar);
                    return aVar.f1707a;
                }
            }
            throw new IOException(o.k("Header index too large ", Integer.valueOf(i4 + 1)));
        }

        private final void g(int i4, a aVar) {
            this.f1715c.add(aVar);
            int i5 = aVar.f1709c;
            if (i4 != -1) {
                a aVar2 = this.f1717e[c(i4)];
                o.b(aVar2);
                i5 -= aVar2.f1709c;
            }
            int i6 = this.f1714b;
            if (i5 > i6) {
                b();
                return;
            }
            int d4 = d((this.f1720h + i5) - i6);
            if (i4 == -1) {
                int i7 = this.f1719g + 1;
                a[] aVarArr = this.f1717e;
                if (i7 > aVarArr.length) {
                    a[] aVarArr2 = new a[(aVarArr.length * 2)];
                    System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                    this.f1718f = this.f1717e.length - 1;
                    this.f1717e = aVarArr2;
                }
                int i8 = this.f1718f;
                this.f1718f = i8 - 1;
                this.f1717e[i8] = aVar;
                this.f1719g++;
            } else {
                this.f1717e[i4 + c(i4) + d4] = aVar;
            }
            this.f1720h += i5;
        }

        private final boolean h(int i4) {
            if (i4 < 0 || i4 > b.f1710a.c().length - 1) {
                return false;
            }
            return true;
        }

        private final int i() {
            return Q2.d.d(this.f1716d.readByte(), 255);
        }

        private final void l(int i4) {
            if (h(i4)) {
                this.f1715c.add(b.f1710a.c()[i4]);
                return;
            }
            int c4 = c(i4 - b.f1710a.c().length);
            if (c4 >= 0) {
                a[] aVarArr = this.f1717e;
                if (c4 < aVarArr.length) {
                    a aVar = aVarArr[c4];
                    o.b(aVar);
                    this.f1715c.add(aVar);
                    return;
                }
            }
            throw new IOException(o.k("Header index too large ", Integer.valueOf(i4 + 1)));
        }

        private final void n(int i4) {
            g(-1, new a(f(i4), j()));
        }

        private final void o() {
            g(-1, new a(b.f1710a.a(j()), j()));
        }

        private final void p(int i4) {
            this.f1715c.add(new a(f(i4), j()));
        }

        private final void q() {
            this.f1715c.add(new a(b.f1710a.a(j()), j()));
        }

        public final List e() {
            List B02 = C0718m.B0(this.f1715c);
            this.f1715c.clear();
            return B02;
        }

        public final ByteString j() {
            boolean z3;
            int i4 = i();
            if ((i4 & Uuid.SIZE_BITS) == 128) {
                z3 = true;
            } else {
                z3 = false;
            }
            long m4 = (long) m(i4, 127);
            if (!z3) {
                return this.f1716d.n(m4);
            }
            C0500b bVar = new C0500b();
            i.f1893a.b(this.f1716d, m4, bVar);
            return bVar.j0();
        }

        public final void k() {
            while (!this.f1716d.H()) {
                int d4 = Q2.d.d(this.f1716d.readByte(), 255);
                if (d4 == 128) {
                    throw new IOException("index == 0");
                } else if ((d4 & Uuid.SIZE_BITS) == 128) {
                    l(m(d4, 127) - 1);
                } else if (d4 == 64) {
                    o();
                } else if ((d4 & 64) == 64) {
                    n(m(d4, 63) - 1);
                } else if ((d4 & 32) == 32) {
                    int m4 = m(d4, 31);
                    this.f1714b = m4;
                    if (m4 < 0 || m4 > this.f1713a) {
                        throw new IOException(o.k("Invalid dynamic table size update ", Integer.valueOf(this.f1714b)));
                    }
                    a();
                } else if (d4 == 16 || d4 == 0) {
                    q();
                } else {
                    p(m(d4, 15) - 1);
                }
            }
        }

        public final int m(int i4, int i5) {
            int i6 = i4 & i5;
            if (i6 < i5) {
                return i6;
            }
            int i7 = 0;
            while (true) {
                int i8 = i();
                if ((i8 & Uuid.SIZE_BITS) == 0) {
                    return i5 + (i8 << i7);
                }
                i5 += (i8 & 127) << i7;
                i7 += 7;
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(w wVar, int i4, int i5, int i6, i iVar) {
            this(wVar, i4, (i6 & 4) != 0 ? i4 : i5);
        }
    }

    /* renamed from: W2.b$b  reason: collision with other inner class name */
    public static final class C0033b {

        /* renamed from: a  reason: collision with root package name */
        public int f1721a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f1722b;

        /* renamed from: c  reason: collision with root package name */
        private final C0500b f1723c;

        /* renamed from: d  reason: collision with root package name */
        private int f1724d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1725e;

        /* renamed from: f  reason: collision with root package name */
        public int f1726f;

        /* renamed from: g  reason: collision with root package name */
        public a[] f1727g;

        /* renamed from: h  reason: collision with root package name */
        private int f1728h;

        /* renamed from: i  reason: collision with root package name */
        public int f1729i;

        /* renamed from: j  reason: collision with root package name */
        public int f1730j;

        public C0033b(int i4, boolean z3, C0500b bVar) {
            o.e(bVar, "out");
            this.f1721a = i4;
            this.f1722b = z3;
            this.f1723c = bVar;
            this.f1724d = Integer.MAX_VALUE;
            this.f1726f = i4;
            a[] aVarArr = new a[8];
            this.f1727g = aVarArr;
            this.f1728h = aVarArr.length - 1;
        }

        private final void a() {
            int i4 = this.f1726f;
            int i5 = this.f1730j;
            if (i4 >= i5) {
                return;
            }
            if (i4 == 0) {
                b();
            } else {
                c(i5 - i4);
            }
        }

        private final void b() {
            C0713h.k(this.f1727g, (Object) null, 0, 0, 6, (Object) null);
            this.f1728h = this.f1727g.length - 1;
            this.f1729i = 0;
            this.f1730j = 0;
        }

        private final int c(int i4) {
            int i5;
            int i6 = 0;
            if (i4 > 0) {
                int length = this.f1727g.length;
                while (true) {
                    length--;
                    i5 = this.f1728h;
                    if (length < i5 || i4 <= 0) {
                        a[] aVarArr = this.f1727g;
                        System.arraycopy(aVarArr, i5 + 1, aVarArr, i5 + 1 + i6, this.f1729i);
                        a[] aVarArr2 = this.f1727g;
                        int i7 = this.f1728h;
                        Arrays.fill(aVarArr2, i7 + 1, i7 + 1 + i6, (Object) null);
                        this.f1728h += i6;
                    } else {
                        a aVar = this.f1727g[length];
                        o.b(aVar);
                        i4 -= aVar.f1709c;
                        int i8 = this.f1730j;
                        a aVar2 = this.f1727g[length];
                        o.b(aVar2);
                        this.f1730j = i8 - aVar2.f1709c;
                        this.f1729i--;
                        i6++;
                    }
                }
                a[] aVarArr3 = this.f1727g;
                System.arraycopy(aVarArr3, i5 + 1, aVarArr3, i5 + 1 + i6, this.f1729i);
                a[] aVarArr22 = this.f1727g;
                int i72 = this.f1728h;
                Arrays.fill(aVarArr22, i72 + 1, i72 + 1 + i6, (Object) null);
                this.f1728h += i6;
            }
            return i6;
        }

        private final void d(a aVar) {
            int i4 = aVar.f1709c;
            int i5 = this.f1726f;
            if (i4 > i5) {
                b();
                return;
            }
            c((this.f1730j + i4) - i5);
            int i6 = this.f1729i + 1;
            a[] aVarArr = this.f1727g;
            if (i6 > aVarArr.length) {
                a[] aVarArr2 = new a[(aVarArr.length * 2)];
                System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                this.f1728h = this.f1727g.length - 1;
                this.f1727g = aVarArr2;
            }
            int i7 = this.f1728h;
            this.f1728h = i7 - 1;
            this.f1727g[i7] = aVar;
            this.f1729i++;
            this.f1730j += i4;
        }

        public final void e(int i4) {
            this.f1721a = i4;
            int min = Math.min(i4, 16384);
            int i5 = this.f1726f;
            if (i5 != min) {
                if (min < i5) {
                    this.f1724d = Math.min(this.f1724d, min);
                }
                this.f1725e = true;
                this.f1726f = min;
                a();
            }
        }

        public final void f(ByteString byteString) {
            o.e(byteString, "data");
            if (this.f1722b) {
                i iVar = i.f1893a;
                if (iVar.d(byteString) < byteString.size()) {
                    C0500b bVar = new C0500b();
                    iVar.c(byteString, bVar);
                    ByteString j02 = bVar.j0();
                    h(j02.size(), 127, Uuid.SIZE_BITS);
                    this.f1723c.P(j02);
                    return;
                }
            }
            h(byteString.size(), 127, 0);
            this.f1723c.P(byteString);
        }

        public final void g(List list) {
            int i4;
            int i5;
            o.e(list, "headerBlock");
            if (this.f1725e) {
                int i6 = this.f1724d;
                if (i6 < this.f1726f) {
                    h(i6, 31, 32);
                }
                this.f1725e = false;
                this.f1724d = Integer.MAX_VALUE;
                h(this.f1726f, 31, 32);
            }
            int size = list.size();
            int i7 = 0;
            while (i7 < size) {
                int i8 = i7 + 1;
                a aVar = (a) list.get(i7);
                ByteString asciiLowercase = aVar.f1707a.toAsciiLowercase();
                ByteString byteString = aVar.f1708b;
                b bVar = b.f1710a;
                Integer num = (Integer) bVar.b().get(asciiLowercase);
                if (num != null) {
                    int intValue = num.intValue();
                    i4 = intValue + 1;
                    if (2 <= i4 && i4 < 8) {
                        if (o.a(bVar.c()[intValue].f1708b, byteString)) {
                            i5 = i4;
                        } else if (o.a(bVar.c()[i4].f1708b, byteString)) {
                            i5 = i4;
                            i4 = intValue + 2;
                        }
                    }
                    i5 = i4;
                    i4 = -1;
                } else {
                    i5 = -1;
                    i4 = -1;
                }
                if (i4 == -1) {
                    int i9 = this.f1728h + 1;
                    int length = this.f1727g.length;
                    while (true) {
                        if (i9 >= length) {
                            break;
                        }
                        int i10 = i9 + 1;
                        a aVar2 = this.f1727g[i9];
                        o.b(aVar2);
                        if (o.a(aVar2.f1707a, asciiLowercase)) {
                            a aVar3 = this.f1727g[i9];
                            o.b(aVar3);
                            if (o.a(aVar3.f1708b, byteString)) {
                                i4 = b.f1710a.c().length + (i9 - this.f1728h);
                                break;
                            } else if (i5 == -1) {
                                i5 = b.f1710a.c().length + (i9 - this.f1728h);
                            }
                        }
                        i9 = i10;
                    }
                }
                if (i4 != -1) {
                    h(i4, 127, Uuid.SIZE_BITS);
                } else if (i5 == -1) {
                    this.f1723c.I(64);
                    f(asciiLowercase);
                    f(byteString);
                    d(aVar);
                } else if (!asciiLowercase.startsWith(a.f1701e) || o.a(a.f1706j, asciiLowercase)) {
                    h(i5, 63, 64);
                    f(byteString);
                    d(aVar);
                } else {
                    h(i5, 15, 0);
                    f(byteString);
                }
                i7 = i8;
            }
        }

        public final void h(int i4, int i5, int i6) {
            if (i4 < i5) {
                this.f1723c.I(i4 | i6);
                return;
            }
            this.f1723c.I(i6 | i5);
            int i7 = i4 - i5;
            while (i7 >= 128) {
                this.f1723c.I(128 | (i7 & 127));
                i7 >>>= 7;
            }
            this.f1723c.I(i7);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0033b(int i4, boolean z3, C0500b bVar, int i5, i iVar) {
            this((i5 & 1) != 0 ? 4096 : i4, (i5 & 2) != 0 ? true : z3, bVar);
        }
    }
}
