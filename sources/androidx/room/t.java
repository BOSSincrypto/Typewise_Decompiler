package androidx.room;

import Z.g;
import Z.h;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public class t extends h.a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f6863g = new a((i) null);

    /* renamed from: c  reason: collision with root package name */
    private e f6864c;

    /* renamed from: d  reason: collision with root package name */
    private final b f6865d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6866e;

    /* renamed from: f  reason: collision with root package name */
    private final String f6867f;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            s2.C0896b.a(r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(Z.g r3) {
            /*
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.o.e(r3, r0)
                java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
                android.database.Cursor r3 = r3.l0(r0)
                boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x001a }
                r1 = 0
                if (r0 == 0) goto L_0x001c
                int r0 = r3.getInt(r1)     // Catch:{ all -> 0x001a }
                if (r0 != 0) goto L_0x001c
                r1 = 1
                goto L_0x001c
            L_0x001a:
                r0 = move-exception
                goto L_0x0021
            L_0x001c:
                r0 = 0
                s2.C0896b.a(r3, r0)
                return r1
            L_0x0021:
                throw r0     // Catch:{ all -> 0x0022 }
            L_0x0022:
                r1 = move-exception
                s2.C0896b.a(r3, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.t.a.a(Z.g):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            s2.C0896b.a(r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b(Z.g r3) {
            /*
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.o.e(r3, r0)
                java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
                android.database.Cursor r3 = r3.l0(r0)
                boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x001a }
                r1 = 0
                if (r0 == 0) goto L_0x001c
                int r0 = r3.getInt(r1)     // Catch:{ all -> 0x001a }
                if (r0 == 0) goto L_0x001c
                r1 = 1
                goto L_0x001c
            L_0x001a:
                r0 = move-exception
                goto L_0x0021
            L_0x001c:
                r0 = 0
                s2.C0896b.a(r3, r0)
                return r1
            L_0x0021:
                throw r0     // Catch:{ all -> 0x0022 }
            L_0x0022:
                r1 = move-exception
                s2.C0896b.a(r3, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.t.a.b(Z.g):boolean");
        }

        private a() {
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f6868a;

        public b(int i4) {
            this.f6868a = i4;
        }

        public abstract void a(g gVar);

        public abstract void b(g gVar);

        public abstract void c(g gVar);

        public abstract void d(g gVar);

        public abstract void e(g gVar);

        public abstract void f(g gVar);

        public abstract c g(g gVar);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f6869a;

        /* renamed from: b  reason: collision with root package name */
        public final String f6870b;

        public c(boolean z3, String str) {
            this.f6869a = z3;
            this.f6870b = str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(e eVar, b bVar, String str, String str2) {
        super(bVar.f6868a);
        o.e(eVar, "configuration");
        o.e(bVar, "delegate");
        o.e(str, "identityHash");
        o.e(str2, "legacyHash");
        this.f6864c = eVar;
        this.f6865d = bVar;
        this.f6866e = str;
        this.f6867f = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        s2.C0896b.a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void h(Z.g r4) {
        /*
            r3 = this;
            androidx.room.t$a r0 = f6863g
            boolean r0 = r0.b(r4)
            if (r0 == 0) goto L_0x005e
            Z.a r0 = new Z.a
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r0.<init>(r1)
            android.database.Cursor r4 = r4.J(r0)
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0020 }
            r1 = 0
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x0020 }
            goto L_0x0023
        L_0x0020:
            r0 = move-exception
            goto L_0x0058
        L_0x0022:
            r0 = r1
        L_0x0023:
            s2.C0896b.a(r4, r1)
            java.lang.String r4 = r3.f6866e
            boolean r4 = kotlin.jvm.internal.o.a(r4, r0)
            if (r4 != 0) goto L_0x0070
            java.lang.String r4 = r3.f6867f
            boolean r4 = kotlin.jvm.internal.o.a(r4, r0)
            if (r4 == 0) goto L_0x0037
            goto L_0x0070
        L_0x0037:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r1.append(r2)
            java.lang.String r2 = r3.f6866e
            r1.append(r2)
            java.lang.String r2 = ", found: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L_0x0058:
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            s2.C0896b.a(r4, r0)
            throw r1
        L_0x005e:
            androidx.room.t$b r0 = r3.f6865d
            androidx.room.t$c r0 = r0.g(r4)
            boolean r1 = r0.f6869a
            if (r1 == 0) goto L_0x0071
            androidx.room.t$b r0 = r3.f6865d
            r0.e(r4)
            r3.j(r4)
        L_0x0070:
            return
        L_0x0071:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r1.append(r2)
            java.lang.String r0 = r0.f6870b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.t.h(Z.g):void");
    }

    private final void i(g gVar) {
        gVar.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(g gVar) {
        i(gVar);
        gVar.p(s.a(this.f6866e));
    }

    public void b(g gVar) {
        o.e(gVar, "db");
        super.b(gVar);
    }

    public void d(g gVar) {
        o.e(gVar, "db");
        boolean a4 = f6863g.a(gVar);
        this.f6865d.a(gVar);
        if (!a4) {
            c g4 = this.f6865d.g(gVar);
            if (!g4.f6869a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g4.f6870b);
            }
        }
        j(gVar);
        this.f6865d.c(gVar);
    }

    public void e(g gVar, int i4, int i5) {
        o.e(gVar, "db");
        g(gVar, i4, i5);
    }

    public void f(g gVar) {
        o.e(gVar, "db");
        super.f(gVar);
        h(gVar);
        this.f6865d.d(gVar);
        this.f6864c = null;
    }

    public void g(g gVar, int i4, int i5) {
        List<W.b> d4;
        o.e(gVar, "db");
        e eVar = this.f6864c;
        if (eVar == null || (d4 = eVar.f6792d.d(i4, i5)) == null) {
            e eVar2 = this.f6864c;
            if (eVar2 == null || eVar2.a(i4, i5)) {
                throw new IllegalStateException("A migration from " + i4 + " to " + i5 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f6865d.b(gVar);
            this.f6865d.a(gVar);
            return;
        }
        this.f6865d.f(gVar);
        for (W.b a4 : d4) {
            a4.a(gVar);
        }
        c g4 = this.f6865d.g(gVar);
        if (g4.f6869a) {
            this.f6865d.e(gVar);
            j(gVar);
            return;
        }
        throw new IllegalStateException("Migration didn't properly handle: " + g4.f6870b);
    }
}
