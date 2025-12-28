package E0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public class t {

    /* renamed from: d  reason: collision with root package name */
    public static final a f396d = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Object f397a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f398b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f399c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public t(Object obj, Object obj2, Object obj3) {
        this.f397a = obj;
        this.f398b = obj2;
        this.f399c = obj3;
    }

    public final Object a() {
        return this.f397a;
    }

    public final Object b() {
        return this.f398b;
    }

    public final Object c() {
        return this.f399c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!o.a(this.f397a, tVar.f397a) || !o.a(this.f398b, tVar.f398b) || !o.a(this.f399c, tVar.f399c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i4;
        int i5;
        Object obj = this.f397a;
        int i6 = 0;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i7 = (i4 + 97601) * 73;
        Object obj2 = this.f398b;
        if (obj2 != null) {
            i5 = obj2.hashCode();
        } else {
            i5 = 0;
        }
        int i8 = (i7 + i5) * 73;
        Object obj3 = this.f399c;
        if (obj3 != null) {
            i6 = obj3.hashCode();
        }
        return i8 + i6;
    }

    public String toString() {
        Object obj = this.f397a;
        Object obj2 = this.f398b;
        Object obj3 = this.f399c;
        return "<" + obj + ", " + obj2 + ", " + obj3 + ">";
    }
}
