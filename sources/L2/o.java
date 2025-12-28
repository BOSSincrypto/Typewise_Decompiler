package l2;

import kotlin.jvm.internal.i;

public final class o implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14562b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final short f14563a;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ o(short s4) {
        this.f14563a = s4;
    }

    public static final /* synthetic */ o a(short s4) {
        return new o(s4);
    }

    public static short b(short s4) {
        return s4;
    }

    public static boolean c(short s4, Object obj) {
        if ((obj instanceof o) && s4 == ((o) obj).f()) {
            return true;
        }
        return false;
    }

    public static int d(short s4) {
        return s4;
    }

    public static String e(short s4) {
        return String.valueOf(s4 & 65535);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.o.f(f() & 65535, ((o) obj).f() & 65535);
    }

    public boolean equals(Object obj) {
        return c(this.f14563a, obj);
    }

    public final /* synthetic */ short f() {
        return this.f14563a;
    }

    public int hashCode() {
        return d(this.f14563a);
    }

    public String toString() {
        return e(this.f14563a);
    }
}
