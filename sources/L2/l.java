package l2;

import kotlin.jvm.internal.i;
import l0.t;

public final class l implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14556b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f14557a;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ l(long j4) {
        this.f14557a = j4;
    }

    public static final /* synthetic */ l a(long j4) {
        return new l(j4);
    }

    public static long b(long j4) {
        return j4;
    }

    public static boolean c(long j4, Object obj) {
        if ((obj instanceof l) && j4 == ((l) obj).f()) {
            return true;
        }
        return false;
    }

    public static int d(long j4) {
        return t.a(j4);
    }

    public static String e(long j4) {
        return r.c(j4, 10);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return r.b(f(), ((l) obj).f());
    }

    public boolean equals(Object obj) {
        return c(this.f14557a, obj);
    }

    public final /* synthetic */ long f() {
        return this.f14557a;
    }

    public int hashCode() {
        return d(this.f14557a);
    }

    public String toString() {
        return e(this.f14557a);
    }
}
