package l2;

import kotlin.jvm.internal.i;

public final class j implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14551b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f14552a;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ j(int i4) {
        this.f14552a = i4;
    }

    public static final /* synthetic */ j a(int i4) {
        return new j(i4);
    }

    public static int b(int i4) {
        return i4;
    }

    public static boolean c(int i4, Object obj) {
        if ((obj instanceof j) && i4 == ((j) obj).f()) {
            return true;
        }
        return false;
    }

    public static int d(int i4) {
        return i4;
    }

    public static String e(int i4) {
        return String.valueOf(((long) i4) & 4294967295L);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return r.a(f(), ((j) obj).f());
    }

    public boolean equals(Object obj) {
        return c(this.f14552a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f14552a;
    }

    public int hashCode() {
        return d(this.f14552a);
    }

    public String toString() {
        return e(this.f14552a);
    }
}
