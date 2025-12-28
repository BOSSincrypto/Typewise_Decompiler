package E0;

import kotlin.jvm.internal.i;

public final class o {

    /* renamed from: c  reason: collision with root package name */
    public static final a f382c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Object f383a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f384b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public o(Object obj, Object obj2) {
        this.f383a = obj;
        this.f384b = obj2;
    }

    public final Object a() {
        return this.f383a;
    }

    public final Object b() {
        return this.f384b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!kotlin.jvm.internal.o.a(this.f383a, oVar.f383a) || !kotlin.jvm.internal.o.a(this.f384b, oVar.f384b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i4;
        Object obj = this.f383a;
        int i5 = 0;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i6 = (i4 + 97601) * 73;
        Object obj2 = this.f384b;
        if (obj2 != null) {
            i5 = obj2.hashCode();
        }
        return i6 + i5;
    }

    public String toString() {
        Object obj = this.f383a;
        Object obj2 = this.f384b;
        return "<" + obj + ", " + obj2 + ">";
    }
}
