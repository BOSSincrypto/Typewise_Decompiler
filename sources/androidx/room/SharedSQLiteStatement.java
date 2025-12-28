package androidx.room;

import Z.k;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.c;
import kotlin.jvm.internal.o;
import l2.f;

public abstract class SharedSQLiteStatement {

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f6769a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f6770b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    private final f f6771c = c.b(new SharedSQLiteStatement$stmt$2(this));

    public SharedSQLiteStatement(RoomDatabase roomDatabase) {
        o.e(roomDatabase, "database");
        this.f6769a = roomDatabase;
    }

    /* access modifiers changed from: private */
    public final k d() {
        return this.f6769a.f(e());
    }

    private final k f() {
        return (k) this.f6771c.getValue();
    }

    private final k g(boolean z3) {
        if (z3) {
            return f();
        }
        return d();
    }

    public k b() {
        c();
        return g(this.f6770b.compareAndSet(false, true));
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.f6769a.c();
    }

    /* access modifiers changed from: protected */
    public abstract String e();

    public void h(k kVar) {
        o.e(kVar, "statement");
        if (kVar == f()) {
            this.f6770b.set(false);
        }
    }
}
