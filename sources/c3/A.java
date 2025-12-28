package c3;

import kotlin.jvm.internal.o;
import kotlin.text.C0724d;

public abstract class A {
    public static final byte[] a(String str) {
        o.e(str, "<this>");
        byte[] bytes = str.getBytes(C0724d.f13927b);
        o.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        o.e(bArr, "<this>");
        return new String(bArr, C0724d.f13927b);
    }
}
