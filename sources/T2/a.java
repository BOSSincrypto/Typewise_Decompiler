package T2;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f1458a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f1459b;

    /* renamed from: c  reason: collision with root package name */
    private d f1460c;

    /* renamed from: d  reason: collision with root package name */
    private long f1461d;

    public a(String str, boolean z3) {
        o.e(str, "name");
        this.f1458a = str;
        this.f1459b = z3;
        this.f1461d = -1;
    }

    public final boolean a() {
        return this.f1459b;
    }

    public final String b() {
        return this.f1458a;
    }

    public final long c() {
        return this.f1461d;
    }

    public final d d() {
        return this.f1460c;
    }

    public final void e(d dVar) {
        o.e(dVar, "queue");
        d dVar2 = this.f1460c;
        if (dVar2 != dVar) {
            if (dVar2 == null) {
                this.f1460c = dVar;
                return;
            }
            throw new IllegalStateException("task is in multiple queues");
        }
    }

    public abstract long f();

    public final void g(long j4) {
        this.f1461d = j4;
    }

    public String toString() {
        return this.f1458a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, boolean z3, int i4, i iVar) {
        this(str, (i4 & 2) != 0 ? true : z3);
    }
}
