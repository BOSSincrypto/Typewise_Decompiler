package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class C extends kotlin.coroutines.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f13986c = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private final String f13987b;

    public static final class a implements CoroutineContext.b {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public C(String str) {
        super(f13986c);
        this.f13987b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C) && o.a(this.f13987b, ((C) obj).f13987b);
    }

    public int hashCode() {
        return this.f13987b.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f13987b + ')';
    }
}
