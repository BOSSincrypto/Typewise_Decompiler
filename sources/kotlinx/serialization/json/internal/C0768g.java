package kotlinx.serialization.json.internal;

import com.ibm.icu.util.ULocale;

/* renamed from: kotlinx.serialization.json.internal.g  reason: case insensitive filesystem */
public final class C0768g {

    /* renamed from: a  reason: collision with root package name */
    public static final C0768g f14391a;

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f14392b = new char[117];

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f14393c = new byte[126];

    static {
        C0768g gVar = new C0768g();
        f14391a = gVar;
        gVar.f();
        gVar.e();
    }

    private C0768g() {
    }

    private final void a(char c4, char c5) {
        b(c4, c5);
    }

    private final void b(int i4, char c4) {
        if (c4 != 'u') {
            f14392b[c4] = (char) i4;
        }
    }

    private final void c(char c4, byte b4) {
        d(c4, b4);
    }

    private final void d(int i4, byte b4) {
        f14393c[i4] = b4;
    }

    private final void e() {
        for (int i4 = 0; i4 < 33; i4++) {
            d(i4, Byte.MAX_VALUE);
        }
        d(9, (byte) 3);
        d(10, (byte) 3);
        d(13, (byte) 3);
        d(32, (byte) 3);
        c(',', (byte) 4);
        c(':', (byte) 5);
        c('{', (byte) 6);
        c('}', (byte) 7);
        c('[', (byte) 8);
        c(']', (byte) 9);
        c('\"', (byte) 1);
        c('\\', (byte) 2);
    }

    private final void f() {
        for (int i4 = 0; i4 < 32; i4++) {
            b(i4, ULocale.UNICODE_LOCALE_EXTENSION);
        }
        b(8, 'b');
        b(9, 't');
        b(10, 'n');
        b(12, 'f');
        b(13, 'r');
        a('/', '/');
        a('\"', '\"');
        a('\\', '\\');
    }
}
