package Q2;

import W2.a;
import c3.C0500b;
import c3.n;
import c3.w;
import com.capacitorjs.plugins.localnotifications.LocalNotificationManager;
import com.silkimen.http.HttpRequest;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.b;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.u;
import kotlin.text.C0724d;
import kotlin.text.Regex;
import l2.C0793c;
import okhttp3.A;
import okhttp3.B;
import okhttp3.e;
import okhttp3.q;
import okhttp3.s;
import okhttp3.t;
import okhttp3.v;
import okhttp3.x;
import okhttp3.z;
import okio.ByteString;
import z2.c;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f1346a;

    /* renamed from: b  reason: collision with root package name */
    public static final s f1347b = s.f15485b.g(new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final B f1348c;

    /* renamed from: d  reason: collision with root package name */
    public static final z f1349d;

    /* renamed from: e  reason: collision with root package name */
    private static final n f1350e;

    /* renamed from: f  reason: collision with root package name */
    public static final TimeZone f1351f;

    /* renamed from: g  reason: collision with root package name */
    private static final Regex f1352g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f1353h = false;

    /* renamed from: i  reason: collision with root package name */
    public static final String f1354i;

    static {
        byte[] bArr = new byte[0];
        f1346a = bArr;
        f1348c = B.a.d(B.f15139a, bArr, (v) null, 1, (Object) null);
        f1349d = z.a.g(z.f15608a, bArr, (v) null, 0, 0, 7, (Object) null);
        n.a aVar = n.f7671c;
        ByteString.a aVar2 = ByteString.Companion;
        f1350e = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        o.b(timeZone);
        f1351f = timeZone;
        String name = x.class.getName();
        o.d(name, "OkHttpClient::class.java.name");
        f1354i = kotlin.text.o.n0(kotlin.text.o.m0(name, "okhttp3."), "Client");
    }

    public static /* synthetic */ int A(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return z(str, i4, i5);
    }

    public static final int B(String str, int i4, int i5) {
        o.e(str, "<this>");
        int i6 = i5 - 1;
        if (i4 <= i6) {
            while (true) {
                int i7 = i6 - 1;
                char charAt = str.charAt(i6);
                if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                    return i6 + 1;
                }
                if (i6 == i4) {
                    break;
                }
                i6 = i7;
            }
        }
        return i4;
    }

    public static /* synthetic */ int C(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return B(str, i4, i5);
    }

    public static final int D(String str, int i4) {
        o.e(str, "<this>");
        int length = str.length();
        while (i4 < length) {
            int i5 = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt != ' ' && charAt != 9) {
                return i4;
            }
            i4 = i5;
        }
        return str.length();
    }

    public static final String[] E(String[] strArr, String[] strArr2, Comparator comparator) {
        o.e(strArr, "<this>");
        o.e(strArr2, "other");
        o.e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i4 = 0;
        while (i4 < length) {
            String str = strArr[i4];
            i4++;
            int length2 = strArr2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length2) {
                    break;
                }
                String str2 = strArr2[i5];
                i5++;
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean F(Socket socket, c3.d dVar) {
        int soTimeout;
        o.e(socket, "<this>");
        o.e(dVar, "source");
        try {
            soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z3 = !dVar.H();
            socket.setSoTimeout(soTimeout);
            return z3;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th) {
            socket.setSoTimeout(soTimeout);
            throw th;
        }
    }

    public static final boolean G(String str) {
        o.e(str, "name");
        if (kotlin.text.o.v(str, HttpRequest.HEADER_AUTHORIZATION, true) || kotlin.text.o.v(str, "Cookie", true) || kotlin.text.o.v(str, HttpRequest.HEADER_PROXY_AUTHORIZATION, true) || kotlin.text.o.v(str, "Set-Cookie", true)) {
            return true;
        }
        return false;
    }

    public static final int H(char c4) {
        if ('0' <= c4 && c4 < ':') {
            return c4 - '0';
        }
        if ('a' <= c4 && c4 < 'g') {
            return c4 - 'W';
        }
        if ('A' > c4 || c4 >= 'G') {
            return -1;
        }
        return c4 - '7';
    }

    public static final Charset I(c3.d dVar, Charset charset) {
        o.e(dVar, "<this>");
        o.e(charset, LocalNotificationManager.DEFAULT_NOTIFICATION_CHANNEL_ID);
        int W3 = dVar.W(f1350e);
        if (W3 == -1) {
            return charset;
        }
        if (W3 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            o.d(charset2, "UTF_8");
            return charset2;
        } else if (W3 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            o.d(charset3, "UTF_16BE");
            return charset3;
        } else if (W3 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            o.d(charset4, "UTF_16LE");
            return charset4;
        } else if (W3 == 3) {
            return C0724d.f13926a.a();
        } else {
            if (W3 == 4) {
                return C0724d.f13926a.b();
            }
            throw new AssertionError();
        }
    }

    public static final int J(c3.d dVar) {
        o.e(dVar, "<this>");
        return d(dVar.readByte(), 255) | (d(dVar.readByte(), 255) << 16) | (d(dVar.readByte(), 255) << 8);
    }

    public static final int K(C0500b bVar, byte b4) {
        o.e(bVar, "<this>");
        int i4 = 0;
        while (!bVar.H() && bVar.G(0) == b4) {
            i4++;
            bVar.readByte();
        }
        return i4;
    }

    public static final boolean L(w wVar, int i4, TimeUnit timeUnit) {
        long j4;
        o.e(wVar, "<this>");
        o.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        if (wVar.d().e()) {
            j4 = wVar.d().c() - nanoTime;
        } else {
            j4 = Long.MAX_VALUE;
        }
        wVar.d().d(Math.min(j4, timeUnit.toNanos((long) i4)) + nanoTime);
        try {
            C0500b bVar = new C0500b();
            while (wVar.N(bVar, 8192) != -1) {
                bVar.o();
            }
            if (j4 == Long.MAX_VALUE) {
                wVar.d().a();
            } else {
                wVar.d().d(nanoTime + j4);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (j4 == Long.MAX_VALUE) {
                wVar.d().a();
            } else {
                wVar.d().d(nanoTime + j4);
            }
            return false;
        } catch (Throwable th) {
            if (j4 == Long.MAX_VALUE) {
                wVar.d().a();
            } else {
                wVar.d().d(nanoTime + j4);
            }
            throw th;
        }
    }

    public static final ThreadFactory M(String str, boolean z3) {
        o.e(str, "name");
        return new c(str, z3);
    }

    /* access modifiers changed from: private */
    public static final Thread N(String str, boolean z3, Runnable runnable) {
        o.e(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z3);
        return thread;
    }

    public static final List O(s sVar) {
        o.e(sVar, "<this>");
        c j4 = z2.d.j(0, sVar.size());
        ArrayList arrayList = new ArrayList(C0718m.t(j4, 10));
        Iterator it = j4.iterator();
        while (it.hasNext()) {
            int b4 = ((kotlin.collections.B) it).b();
            arrayList.add(new a(sVar.c(b4), sVar.f(b4)));
        }
        return arrayList;
    }

    public static final s P(List list) {
        o.e(list, "<this>");
        s.a aVar = new s.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            aVar.d(aVar2.a().utf8(), aVar2.b().utf8());
        }
        return aVar.f();
    }

    public static final String Q(t tVar, boolean z3) {
        String str;
        o.e(tVar, "<this>");
        if (kotlin.text.o.L(tVar.i(), ":", false, 2, (Object) null)) {
            str = '[' + tVar.i() + ']';
        } else {
            str = tVar.i();
        }
        if (!z3 && tVar.n() == t.f15488k.c(tVar.r())) {
            return str;
        }
        return str + ':' + tVar.n();
    }

    public static /* synthetic */ String R(t tVar, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        return Q(tVar, z3);
    }

    public static final List S(List list) {
        o.e(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(C0718m.D0(list));
        o.d(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final Map T(Map map) {
        o.e(map, "<this>");
        if (map.isEmpty()) {
            return D.h();
        }
        Map unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        o.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long U(String str, long j4) {
        o.e(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j4;
        }
    }

    public static final int V(String str, int i4) {
        Long l4;
        if (str == null) {
            l4 = null;
        } else {
            try {
                l4 = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i4;
            }
        }
        if (l4 == null) {
            return i4;
        }
        long longValue = l4.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final String W(String str, int i4, int i5) {
        o.e(str, "<this>");
        int z3 = z(str, i4, i5);
        String substring = str.substring(z3, B(str, z3, i5));
        o.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String X(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return W(str, i4, i5);
    }

    public static final Throwable Y(Exception exc, List list) {
        o.e(exc, "<this>");
        o.e(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0793c.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void Z(c3.c cVar, int i4) {
        o.e(cVar, "<this>");
        cVar.I((i4 >>> 16) & 255);
        cVar.I((i4 >>> 8) & 255);
        cVar.I(i4 & 255);
    }

    public static final void c(List list, Object obj) {
        o.e(list, "<this>");
        if (!list.contains(obj)) {
            list.add(obj);
        }
    }

    public static final int d(byte b4, int i4) {
        return b4 & i4;
    }

    public static final int e(short s4, int i4) {
        return s4 & i4;
    }

    public static final long f(int i4, long j4) {
        return ((long) i4) & j4;
    }

    public static final q.c g(q qVar) {
        o.e(qVar, "<this>");
        return new b(qVar);
    }

    /* access modifiers changed from: private */
    public static final q h(q qVar, e eVar) {
        o.e(qVar, "$this_asFactory");
        o.e(eVar, "it");
        return qVar;
    }

    public static final boolean i(String str) {
        o.e(str, "<this>");
        return f1352g.matches(str);
    }

    public static final boolean j(t tVar, t tVar2) {
        o.e(tVar, "<this>");
        o.e(tVar2, "other");
        if (!o.a(tVar.i(), tVar2.i()) || tVar.n() != tVar2.n() || !o.a(tVar.r(), tVar2.r())) {
            return false;
        }
        return true;
    }

    public static final int k(String str, long j4, TimeUnit timeUnit) {
        o.e(str, "name");
        int i4 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i4 < 0) {
            throw new IllegalStateException(o.k(str, " < 0").toString());
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j4);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(o.k(str, " too large.").toString());
            } else if (millis != 0 || i4 <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(o.k(str, " too small.").toString());
            }
        } else {
            throw new IllegalStateException("unit == null");
        }
    }

    public static final void l(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void m(Closeable closeable) {
        o.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void n(Socket socket) {
        o.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e5) {
            if (!o.a(e5.getMessage(), "bio == null")) {
                throw e5;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] o(String[] strArr, String str) {
        o.e(strArr, "<this>");
        o.e(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        o.d(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[C0713h.D(strArr2)] = str;
        return strArr2;
    }

    public static final int p(String str, char c4, int i4, int i5) {
        o.e(str, "<this>");
        while (i4 < i5) {
            int i6 = i4 + 1;
            if (str.charAt(i4) == c4) {
                return i4;
            }
            i4 = i6;
        }
        return i5;
    }

    public static final int q(String str, String str2, int i4, int i5) {
        o.e(str, "<this>");
        o.e(str2, "delimiters");
        while (i4 < i5) {
            int i6 = i4 + 1;
            if (kotlin.text.o.K(str2, str.charAt(i4), false, 2, (Object) null)) {
                return i4;
            }
            i4 = i6;
        }
        return i5;
    }

    public static /* synthetic */ int r(String str, char c4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = str.length();
        }
        return p(str, c4, i4, i5);
    }

    public static final boolean s(w wVar, int i4, TimeUnit timeUnit) {
        o.e(wVar, "<this>");
        o.e(timeUnit, "timeUnit");
        try {
            return L(wVar, i4, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String t(String str, Object... objArr) {
        o.e(str, "format");
        o.e(objArr, "args");
        u uVar = u.f13912a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        o.d(format, "format(locale, format, *args)");
        return format;
    }

    public static final boolean u(String[] strArr, String[] strArr2, Comparator comparator) {
        o.e(strArr, "<this>");
        o.e(comparator, "comparator");
        if (!(strArr.length == 0 || strArr2 == null || strArr2.length == 0)) {
            int length = strArr.length;
            int i4 = 0;
            while (i4 < length) {
                String str = strArr[i4];
                i4++;
                Iterator a4 = b.a(strArr2);
                while (true) {
                    if (a4.hasNext()) {
                        if (comparator.compare(str, (String) a4.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long v(A a4) {
        o.e(a4, "<this>");
        String b4 = a4.D().b(HttpRequest.HEADER_CONTENT_LENGTH);
        if (b4 == null) {
            return -1;
        }
        return U(b4, -1);
    }

    public static final List w(Object... objArr) {
        o.e(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(C0718m.m(Arrays.copyOf(objArr2, objArr2.length)));
        o.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int x(String[] strArr, String str, Comparator comparator) {
        o.e(strArr, "<this>");
        o.e(str, "value");
        o.e(comparator, "comparator");
        int length = strArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (comparator.compare(strArr[i4], str) == 0) {
                return i4;
            }
        }
        return -1;
    }

    public static final int y(String str) {
        o.e(str, "<this>");
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1;
            char charAt = str.charAt(i4);
            if (o.f(charAt, 31) <= 0 || o.f(charAt, 127) >= 0) {
                return i4;
            }
            i4 = i5;
        }
        return -1;
    }

    public static final int z(String str, int i4, int i5) {
        o.e(str, "<this>");
        while (i4 < i5) {
            int i6 = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i4;
            }
            i4 = i6;
        }
        return i5;
    }
}
