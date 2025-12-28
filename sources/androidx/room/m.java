package androidx.room;

import Z.g;
import Z.k;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.util.Log;
import com.silkimen.http.HttpRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.collections.L;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;
import s.C0890b;
import s2.C0896b;

public class m {

    /* renamed from: q  reason: collision with root package name */
    public static final a f6813q = new a((i) null);

    /* renamed from: r  reason: collision with root package name */
    private static final String[] f6814r = {"UPDATE", HttpRequest.METHOD_DELETE, "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    private final RoomDatabase f6815a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f6816b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f6817c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f6818d;

    /* renamed from: e  reason: collision with root package name */
    private final String[] f6819e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public c f6820f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f6821g = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f6822h;

    /* renamed from: i  reason: collision with root package name */
    private volatile k f6823i;

    /* renamed from: j  reason: collision with root package name */
    private final b f6824j;

    /* renamed from: k  reason: collision with root package name */
    private final k f6825k;

    /* renamed from: l  reason: collision with root package name */
    private final C0890b f6826l;

    /* renamed from: m  reason: collision with root package name */
    private p f6827m;

    /* renamed from: n  reason: collision with root package name */
    private final Object f6828n;

    /* renamed from: o  reason: collision with root package name */
    private final Object f6829o;

    /* renamed from: p  reason: collision with root package name */
    public final Runnable f6830p;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(g gVar) {
            o.e(gVar, "database");
            if (gVar.S()) {
                gVar.Y();
            } else {
                gVar.j();
            }
        }

        public final String b(String str, String str2) {
            o.e(str, "tableName");
            o.e(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final a f6831e = new a((i) null);

        /* renamed from: a  reason: collision with root package name */
        private final long[] f6832a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean[] f6833b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f6834c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f6835d;

        public static final class a {
            public /* synthetic */ a(i iVar) {
                this();
            }

            private a() {
            }
        }

        public b(int i4) {
            this.f6832a = new long[i4];
            this.f6833b = new boolean[i4];
            this.f6834c = new int[i4];
        }

        public final int[] a() {
            boolean z3;
            synchronized (this) {
                try {
                    if (!this.f6835d) {
                        return null;
                    }
                    long[] jArr = this.f6832a;
                    int length = jArr.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length) {
                        int i6 = i5 + 1;
                        int i7 = 1;
                        if (jArr[i4] > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean[] zArr = this.f6833b;
                        if (z3 != zArr[i5]) {
                            int[] iArr = this.f6834c;
                            if (!z3) {
                                i7 = 2;
                            }
                            iArr[i5] = i7;
                        } else {
                            this.f6834c[i5] = 0;
                        }
                        zArr[i5] = z3;
                        i4++;
                        i5 = i6;
                    }
                    this.f6835d = false;
                    int[] iArr2 = (int[]) this.f6834c.clone();
                    return iArr2;
                } finally {
                }
            }
        }

        public final boolean b(int... iArr) {
            boolean z3;
            o.e(iArr, "tableIds");
            synchronized (this) {
                try {
                    z3 = false;
                    for (int i4 : iArr) {
                        long[] jArr = this.f6832a;
                        long j4 = jArr[i4];
                        jArr[i4] = 1 + j4;
                        if (j4 == 0) {
                            this.f6835d = true;
                            z3 = true;
                        }
                    }
                    q qVar = q.f14567a;
                } finally {
                }
            }
            return z3;
        }

        public final boolean c(int... iArr) {
            boolean z3;
            o.e(iArr, "tableIds");
            synchronized (this) {
                try {
                    z3 = false;
                    for (int i4 : iArr) {
                        long[] jArr = this.f6832a;
                        long j4 = jArr[i4];
                        jArr[i4] = j4 - 1;
                        if (j4 == 1) {
                            this.f6835d = true;
                            z3 = true;
                        }
                    }
                    q qVar = q.f14567a;
                } finally {
                }
            }
            return z3;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f6833b, false);
                this.f6835d = true;
                q qVar = q.f14567a;
            }
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        private final String[] f6836a;

        public c(String[] strArr) {
            o.e(strArr, "tables");
            this.f6836a = strArr;
        }

        public final String[] a() {
            return this.f6836a;
        }

        public abstract boolean b();

        public abstract void c(Set set);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final c f6837a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f6838b;

        /* renamed from: c  reason: collision with root package name */
        private final String[] f6839c;

        /* renamed from: d  reason: collision with root package name */
        private final Set f6840d;

        public d(c cVar, int[] iArr, String[] strArr) {
            boolean z3;
            Set set;
            o.e(cVar, "observer");
            o.e(iArr, "tableIds");
            o.e(strArr, "tableNames");
            this.f6837a = cVar;
            this.f6838b = iArr;
            this.f6839c = strArr;
            if (strArr.length == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                set = L.d(strArr[0]);
            } else {
                set = L.e();
            }
            this.f6840d = set;
            if (iArr.length != strArr.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] a() {
            return this.f6838b;
        }

        public final void b(Set set) {
            Set set2;
            o.e(set, "invalidatedTablesIds");
            int[] iArr = this.f6838b;
            int length = iArr.length;
            if (length != 0) {
                int i4 = 0;
                if (length != 1) {
                    Set b4 = L.b();
                    int[] iArr2 = this.f6838b;
                    int length2 = iArr2.length;
                    int i5 = 0;
                    while (i4 < length2) {
                        int i6 = i5 + 1;
                        if (set.contains(Integer.valueOf(iArr2[i4]))) {
                            b4.add(this.f6839c[i5]);
                        }
                        i4++;
                        i5 = i6;
                    }
                    set2 = L.a(b4);
                } else if (set.contains(Integer.valueOf(iArr[0]))) {
                    set2 = this.f6840d;
                } else {
                    set2 = L.e();
                }
            } else {
                set2 = L.e();
            }
            if (!set2.isEmpty()) {
                this.f6837a.c(set2);
            }
        }

        public final void c(String[] strArr) {
            Set set;
            o.e(strArr, "tables");
            int length = this.f6839c.length;
            if (length != 0) {
                if (length == 1) {
                    int length2 = strArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            set = L.e();
                            break;
                        } else if (kotlin.text.o.v(strArr[i4], this.f6839c[0], true)) {
                            set = this.f6840d;
                            break;
                        } else {
                            i4++;
                        }
                    }
                } else {
                    Set b4 = L.b();
                    for (String str : strArr) {
                        for (String str2 : this.f6839c) {
                            if (kotlin.text.o.v(str2, str, true)) {
                                b4.add(str2);
                            }
                        }
                    }
                    set = L.a(b4);
                }
            } else {
                set = L.e();
            }
            if (!set.isEmpty()) {
                this.f6837a.c(set);
            }
        }
    }

    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f6841a;

        e(m mVar) {
            this.f6841a = mVar;
        }

        private final Set a() {
            m mVar = this.f6841a;
            Set b4 = L.b();
            Cursor y3 = RoomDatabase.y(mVar.e(), new Z.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), (CancellationSignal) null, 2, (Object) null);
            while (y3.moveToNext()) {
                try {
                    b4.add(Integer.valueOf(y3.getInt(0)));
                } catch (Throwable th) {
                    C0896b.a(y3, th);
                    throw th;
                }
            }
            q qVar = q.f14567a;
            C0896b.a(y3, (Throwable) null);
            Set a4 = L.a(b4);
            if (!a4.isEmpty()) {
                if (this.f6841a.d() != null) {
                    k d4 = this.f6841a.d();
                    if (d4 != null) {
                        d4.t();
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            return a4;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
            if (r0 != null) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
            r0.e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
            if (r0 == null) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bd, code lost:
            if (r0 == null) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c7, code lost:
            if (r2.isEmpty() != false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
            r0 = r4.f6841a.f();
            r1 = r4.f6841a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            r1 = r1.f().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00de, code lost:
            if (r1.hasNext() == false) goto L_0x00f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e0, code lost:
            ((androidx.room.m.d) ((java.util.Map.Entry) r1.next()).getValue()).b(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f0, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f2, code lost:
            r1 = l2.q.f14567a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f4, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f7, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                androidx.room.m r0 = r4.f6841a
                androidx.room.RoomDatabase r0 = r0.e()
                java.util.concurrent.locks.Lock r0 = r0.k()
                r0.lock()
                androidx.room.m r1 = r4.f6841a     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                boolean r1 = r1.c()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                if (r1 != 0) goto L_0x0024
                r0.unlock()
                androidx.room.m r0 = r4.f6841a
                androidx.room.c r0 = r0.f6820f
                if (r0 == 0) goto L_0x0023
                r0.e()
            L_0x0023:
                return
            L_0x0024:
                androidx.room.m r1 = r4.f6841a     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                java.util.concurrent.atomic.AtomicBoolean r1 = r1.g()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                r2 = 1
                r3 = 0
                boolean r1 = r1.compareAndSet(r2, r3)     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                if (r1 != 0) goto L_0x0041
                r0.unlock()
                androidx.room.m r0 = r4.f6841a
                androidx.room.c r0 = r0.f6820f
                if (r0 == 0) goto L_0x0040
                r0.e()
            L_0x0040:
                return
            L_0x0041:
                androidx.room.m r1 = r4.f6841a     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                androidx.room.RoomDatabase r1 = r1.e()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                boolean r1 = r1.q()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                if (r1 == 0) goto L_0x005c
                r0.unlock()
                androidx.room.m r0 = r4.f6841a
                androidx.room.c r0 = r0.f6820f
                if (r0 == 0) goto L_0x005b
                r0.e()
            L_0x005b:
                return
            L_0x005c:
                androidx.room.m r1 = r4.f6841a     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                androidx.room.RoomDatabase r1 = r1.e()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                Z.h r1 = r1.m()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                Z.g r1 = r1.i0()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                r1.Y()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                java.util.Set r2 = r4.a()     // Catch:{ all -> 0x008d }
                r1.V()     // Catch:{ all -> 0x008d }
                r1.i()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                r0.unlock()
                androidx.room.m r0 = r4.f6841a
                androidx.room.c r0 = r0.f6820f
                if (r0 == 0) goto L_0x00c0
            L_0x0082:
                r0.e()
                goto L_0x00c0
            L_0x0086:
                r1 = move-exception
                goto L_0x00f9
            L_0x0089:
                r1 = move-exception
                goto L_0x0092
            L_0x008b:
                r1 = move-exception
                goto L_0x00a9
            L_0x008d:
                r2 = move-exception
                r1.i()     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
                throw r2     // Catch:{ IllegalStateException -> 0x008b, SQLiteException -> 0x0089 }
            L_0x0092:
                java.lang.String r2 = "ROOM"
                java.lang.String r3 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0086 }
                java.util.Set r2 = kotlin.collections.L.e()     // Catch:{ all -> 0x0086 }
                r0.unlock()
                androidx.room.m r0 = r4.f6841a
                androidx.room.c r0 = r0.f6820f
                if (r0 == 0) goto L_0x00c0
                goto L_0x0082
            L_0x00a9:
                java.lang.String r2 = "ROOM"
                java.lang.String r3 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0086 }
                java.util.Set r2 = kotlin.collections.L.e()     // Catch:{ all -> 0x0086 }
                r0.unlock()
                androidx.room.m r0 = r4.f6841a
                androidx.room.c r0 = r0.f6820f
                if (r0 == 0) goto L_0x00c0
                goto L_0x0082
            L_0x00c0:
                r0 = r2
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x00f8
                androidx.room.m r0 = r4.f6841a
                s.b r0 = r0.f()
                androidx.room.m r1 = r4.f6841a
                monitor-enter(r0)
                s.b r1 = r1.f()     // Catch:{ all -> 0x00f0 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00f0 }
            L_0x00da:
                boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00f0 }
                if (r3 == 0) goto L_0x00f2
                java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00f0 }
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00f0 }
                java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00f0 }
                androidx.room.m$d r3 = (androidx.room.m.d) r3     // Catch:{ all -> 0x00f0 }
                r3.b(r2)     // Catch:{ all -> 0x00f0 }
                goto L_0x00da
            L_0x00f0:
                r1 = move-exception
                goto L_0x00f6
            L_0x00f2:
                l2.q r1 = l2.q.f14567a     // Catch:{ all -> 0x00f0 }
                monitor-exit(r0)
                goto L_0x00f8
            L_0x00f6:
                monitor-exit(r0)
                throw r1
            L_0x00f8:
                return
            L_0x00f9:
                r0.unlock()
                androidx.room.m r0 = r4.f6841a
                androidx.room.c r0 = r0.f6820f
                if (r0 == 0) goto L_0x0107
                r0.e()
            L_0x0107:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.m.e.run():void");
        }
    }

    public m(RoomDatabase roomDatabase, Map map, Map map2, String... strArr) {
        String str;
        o.e(roomDatabase, "database");
        o.e(map, "shadowTablesMap");
        o.e(map2, "viewTables");
        o.e(strArr, "tableNames");
        this.f6815a = roomDatabase;
        this.f6816b = map;
        this.f6817c = map2;
        this.f6824j = new b(strArr.length);
        this.f6825k = new k(roomDatabase);
        this.f6826l = new C0890b();
        this.f6828n = new Object();
        this.f6829o = new Object();
        this.f6818d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            String str2 = strArr[i4];
            Locale locale = Locale.US;
            o.d(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            o.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f6818d.put(lowerCase, Integer.valueOf(i4));
            String str3 = (String) this.f6816b.get(strArr[i4]);
            if (str3 != null) {
                o.d(locale, "US");
                str = str3.toLowerCase(locale);
                o.d(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i4] = lowerCase;
        }
        this.f6819e = strArr2;
        for (Map.Entry entry : this.f6816b.entrySet()) {
            Locale locale2 = Locale.US;
            o.d(locale2, "US");
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            o.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f6818d.containsKey(lowerCase2)) {
                o.d(locale2, "US");
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                o.d(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map map3 = this.f6818d;
                map3.put(lowerCase3, D.i(map3, lowerCase2));
            }
        }
        this.f6830p = new e(this);
    }

    private final String[] n(String[] strArr) {
        Set b4 = L.b();
        for (String str : strArr) {
            Map map = this.f6817c;
            Locale locale = Locale.US;
            o.d(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            o.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f6817c;
                o.d(locale, "US");
                String lowerCase2 = str.toLowerCase(locale);
                o.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                o.b(obj);
                b4.addAll((Collection) obj);
            } else {
                b4.add(str);
            }
        }
        Object[] array = L.a(b4).toArray(new String[0]);
        o.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    private final void q(g gVar, int i4) {
        gVar.p("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i4 + ", 0)");
        String str = this.f6819e[i4];
        for (String str2 : f6814r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f6813q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE " + "room_table_modification_log" + " SET " + "invalidated" + " = 1" + " WHERE " + "table_id" + " = " + i4 + " AND " + "invalidated" + " = 0" + "; END";
            o.d(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.p(str3);
        }
    }

    private final void r(g gVar, int i4) {
        String str = this.f6819e[i4];
        for (String str2 : f6814r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f6813q.b(str, str2);
            o.d(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.p(str3);
        }
    }

    public void b(c cVar) {
        d dVar;
        o.e(cVar, "observer");
        String[] n4 = n(cVar.a());
        ArrayList arrayList = new ArrayList(n4.length);
        int length = n4.length;
        int i4 = 0;
        while (i4 < length) {
            String str = n4[i4];
            Map map = this.f6818d;
            Locale locale = Locale.US;
            o.d(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            o.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num != null) {
                arrayList.add(num);
                i4++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        int[] A02 = C0718m.A0(arrayList);
        d dVar2 = new d(cVar, A02, n4);
        synchronized (this.f6826l) {
            dVar = (d) this.f6826l.g(cVar, dVar2);
        }
        if (dVar == null && this.f6824j.b(Arrays.copyOf(A02, A02.length))) {
            s();
        }
    }

    public final boolean c() {
        if (!this.f6815a.w()) {
            return false;
        }
        if (!this.f6822h) {
            this.f6815a.m().i0();
        }
        if (this.f6822h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final k d() {
        return this.f6823i;
    }

    public final RoomDatabase e() {
        return this.f6815a;
    }

    public final C0890b f() {
        return this.f6826l;
    }

    public final AtomicBoolean g() {
        return this.f6821g;
    }

    public final Map h() {
        return this.f6818d;
    }

    public final void i(g gVar) {
        o.e(gVar, "database");
        synchronized (this.f6829o) {
            if (this.f6822h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            gVar.p("PRAGMA temp_store = MEMORY;");
            gVar.p("PRAGMA recursive_triggers='ON';");
            gVar.p("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            t(gVar);
            this.f6823i = gVar.u("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f6822h = true;
            q qVar = q.f14567a;
        }
    }

    public final void j(String... strArr) {
        o.e(strArr, "tables");
        synchronized (this.f6826l) {
            try {
                for (Map.Entry entry : this.f6826l) {
                    o.d(entry, "(observer, wrapper)");
                    d dVar = (d) entry.getValue();
                    if (!((c) entry.getKey()).b()) {
                        dVar.c(strArr);
                    }
                }
                q qVar = q.f14567a;
            } finally {
            }
        }
    }

    public final void k() {
        synchronized (this.f6829o) {
            this.f6822h = false;
            this.f6824j.d();
            q qVar = q.f14567a;
        }
    }

    public void l() {
        if (this.f6821g.compareAndSet(false, true)) {
            c cVar = this.f6820f;
            if (cVar != null) {
                cVar.j();
            }
            this.f6815a.n().execute(this.f6830p);
        }
    }

    public void m(c cVar) {
        d dVar;
        o.e(cVar, "observer");
        synchronized (this.f6826l) {
            dVar = (d) this.f6826l.h(cVar);
        }
        if (dVar != null) {
            b bVar = this.f6824j;
            int[] a4 = dVar.a();
            if (bVar.c(Arrays.copyOf(a4, a4.length))) {
                s();
            }
        }
    }

    public final void o(c cVar) {
        o.e(cVar, "autoCloser");
        this.f6820f = cVar;
        cVar.m(new l(this));
    }

    public final void p(Context context, String str, Intent intent) {
        o.e(context, "context");
        o.e(str, "name");
        o.e(intent, "serviceIntent");
        this.f6827m = new p(context, str, intent, this, this.f6815a.n());
    }

    public final void s() {
        if (this.f6815a.w()) {
            t(this.f6815a.m().i0());
        }
    }

    public final void t(g gVar) {
        Lock k4;
        o.e(gVar, "database");
        if (!gVar.M()) {
            try {
                k4 = this.f6815a.k();
                k4.lock();
                synchronized (this.f6828n) {
                    int[] a4 = this.f6824j.a();
                    if (a4 == null) {
                        k4.unlock();
                        return;
                    }
                    f6813q.a(gVar);
                    try {
                        int length = a4.length;
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < length) {
                            int i6 = a4[i4];
                            int i7 = i5 + 1;
                            if (i6 == 1) {
                                q(gVar, i5);
                            } else if (i6 == 2) {
                                r(gVar, i5);
                            }
                            i4++;
                            i5 = i7;
                        }
                        gVar.V();
                        gVar.i();
                        q qVar = q.f14567a;
                        k4.unlock();
                    } finally {
                        gVar.i();
                    }
                }
            } catch (IllegalStateException e4) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
            } catch (SQLiteException e5) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e5);
            } catch (Throwable th) {
                k4.unlock();
                throw th;
            }
        }
    }
}
