package l2;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class h implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14546b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final byte f14547a;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ h(byte b4) {
        this.f14547a = b4;
    }

    public static final /* synthetic */ h a(byte b4) {
        return new h(b4);
    }

    public static byte b(byte b4) {
        return b4;
    }

    public static boolean c(byte b4, Object obj) {
        if ((obj instanceof h) && b4 == ((h) obj).f()) {
            return true;
        }
        return false;
    }

    public static int d(byte b4) {
        return b4;
    }

    public static String e(byte b4) {
        return String.valueOf(b4 & 255);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return o.f(f() & 255, ((h) obj).f() & 255);
    }

    public boolean equals(Object obj) {
        return c(this.f14547a, obj);
    }

    public final /* synthetic */ byte f() {
        return this.f14547a;
    }

    public int hashCode() {
        return d(this.f14547a);
    }

    public String toString() {
        return e(this.f14547a);
    }
}
