package androidx.room;

import Z.g;
import Z.h;
import Z.j;
import Z.k;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import com.getcapacitor.PluginMethod;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.collections.L;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public abstract class RoomDatabase {

    /* renamed from: o  reason: collision with root package name */
    public static final c f6730o = new c((i) null);

    /* renamed from: a  reason: collision with root package name */
    protected volatile g f6731a;

    /* renamed from: b  reason: collision with root package name */
    private Executor f6732b;

    /* renamed from: c  reason: collision with root package name */
    private Executor f6733c;

    /* renamed from: d  reason: collision with root package name */
    private h f6734d;

    /* renamed from: e  reason: collision with root package name */
    private final m f6735e = g();

    /* renamed from: f  reason: collision with root package name */
    private boolean f6736f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6737g;

    /* renamed from: h  reason: collision with root package name */
    protected List f6738h;

    /* renamed from: i  reason: collision with root package name */
    private Map f6739i = new LinkedHashMap();

    /* renamed from: j  reason: collision with root package name */
    private final ReentrantReadWriteLock f6740j = new ReentrantReadWriteLock();

    /* renamed from: k  reason: collision with root package name */
    private c f6741k;

    /* renamed from: l  reason: collision with root package name */
    private final ThreadLocal f6742l = new ThreadLocal();

    /* renamed from: m  reason: collision with root package name */
    private final Map f6743m;

    /* renamed from: n  reason: collision with root package name */
    private final Map f6744n;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/app/ActivityManager;", "activityManager", "", "b", "(Landroid/app/ActivityManager;)Z", "Landroid/content/Context;", "context", "resolve$room_runtime_release", "(Landroid/content/Context;)Landroidx/room/RoomDatabase$JournalMode;", "resolve", "AUTOMATIC", "TRUNCATE", "WRITE_AHEAD_LOGGING", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean b(ActivityManager activityManager) {
            return Z.c.b(activityManager);
        }

        public final JournalMode resolve$room_runtime_release(Context context) {
            o.e(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            o.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            if (!b((ActivityManager) systemService)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f6746a;

        /* renamed from: b  reason: collision with root package name */
        private final Class f6747b;

        /* renamed from: c  reason: collision with root package name */
        private final String f6748c;

        /* renamed from: d  reason: collision with root package name */
        private final List f6749d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private final List f6750e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        private List f6751f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        private Executor f6752g;

        /* renamed from: h  reason: collision with root package name */
        private Executor f6753h;

        /* renamed from: i  reason: collision with root package name */
        private h.c f6754i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f6755j;

        /* renamed from: k  reason: collision with root package name */
        private JournalMode f6756k = JournalMode.AUTOMATIC;

        /* renamed from: l  reason: collision with root package name */
        private Intent f6757l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f6758m = true;

        /* renamed from: n  reason: collision with root package name */
        private boolean f6759n;

        /* renamed from: o  reason: collision with root package name */
        private long f6760o = -1;

        /* renamed from: p  reason: collision with root package name */
        private TimeUnit f6761p;

        /* renamed from: q  reason: collision with root package name */
        private final d f6762q = new d();

        /* renamed from: r  reason: collision with root package name */
        private Set f6763r = new LinkedHashSet();

        /* renamed from: s  reason: collision with root package name */
        private Set f6764s;

        /* renamed from: t  reason: collision with root package name */
        private String f6765t;

        /* renamed from: u  reason: collision with root package name */
        private File f6766u;

        /* renamed from: v  reason: collision with root package name */
        private Callable f6767v;

        public a(Context context, Class cls, String str) {
            o.e(context, "context");
            o.e(cls, "klass");
            this.f6746a = context;
            this.f6747b = cls;
            this.f6748c = str;
        }

        public a a(b bVar) {
            o.e(bVar, PluginMethod.RETURN_CALLBACK);
            this.f6749d.add(bVar);
            return this;
        }

        public a b(W.b... bVarArr) {
            o.e(bVarArr, "migrations");
            if (this.f6764s == null) {
                this.f6764s = new HashSet();
            }
            for (W.b bVar : bVarArr) {
                Set set = this.f6764s;
                o.b(set);
                set.add(Integer.valueOf(bVar.f1647a));
                Set set2 = this.f6764s;
                o.b(set2);
                set2.add(Integer.valueOf(bVar.f1648b));
            }
            this.f6762q.b((W.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
            return this;
        }

        public a c() {
            this.f6755j = true;
            return this;
        }

        public RoomDatabase d() {
            int i4;
            int i5;
            Executor executor = this.f6752g;
            if (executor == null && this.f6753h == null) {
                Executor f4 = r.c.f();
                this.f6753h = f4;
                this.f6752g = f4;
            } else if (executor != null && this.f6753h == null) {
                this.f6753h = executor;
            } else if (executor == null) {
                this.f6752g = this.f6753h;
            }
            Set<Number> set = this.f6764s;
            if (set != null) {
                o.b(set);
                for (Number intValue : set) {
                    int intValue2 = intValue.intValue();
                    if (this.f6763r.contains(Integer.valueOf(intValue2))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue2).toString());
                    }
                }
            }
            d dVar = this.f6754i;
            if (dVar == null) {
                dVar = new androidx.sqlite.db.framework.d();
            }
            if (dVar != null) {
                if (this.f6760o > 0) {
                    if (this.f6748c != null) {
                        long j4 = this.f6760o;
                        TimeUnit timeUnit = this.f6761p;
                        if (timeUnit != null) {
                            Executor executor2 = this.f6752g;
                            if (executor2 != null) {
                                dVar = new d(dVar, new c(j4, timeUnit, executor2));
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                }
                String str = this.f6765t;
                if (!(str == null && this.f6766u == null && this.f6767v == null)) {
                    if (this.f6748c != null) {
                        int i6 = 0;
                        if (str == null) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                        File file = this.f6766u;
                        if (file == null) {
                            i5 = 0;
                        } else {
                            i5 = 1;
                        }
                        Callable callable = this.f6767v;
                        if (callable != null) {
                            i6 = 1;
                        }
                        if (i4 + i5 + i6 == 1) {
                            dVar = new w(str, file, callable, dVar);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                }
            } else {
                dVar = null;
            }
            w wVar = dVar;
            if (wVar != null) {
                Context context = this.f6746a;
                String str2 = this.f6748c;
                d dVar2 = this.f6762q;
                List list = this.f6749d;
                boolean z3 = this.f6755j;
                JournalMode resolve$room_runtime_release = this.f6756k.resolve$room_runtime_release(context);
                Executor executor3 = this.f6752g;
                if (executor3 != null) {
                    Executor executor4 = this.f6753h;
                    if (executor4 != null) {
                        e eVar = new e(context, str2, wVar, dVar2, list, z3, resolve$room_runtime_release, executor3, executor4, this.f6757l, this.f6758m, this.f6759n, this.f6763r, this.f6765t, this.f6766u, this.f6767v, (e) null, this.f6750e, this.f6751f);
                        RoomDatabase roomDatabase = (RoomDatabase) r.b(this.f6747b, "_Impl");
                        roomDatabase.r(eVar);
                        return roomDatabase;
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public a e() {
            this.f6758m = false;
            this.f6759n = true;
            return this;
        }

        public a f(h.c cVar) {
            this.f6754i = cVar;
            return this;
        }

        public a g(Executor executor) {
            o.e(executor, "executor");
            this.f6752g = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(g gVar) {
            o.e(gVar, "db");
        }

        public void b(g gVar) {
            o.e(gVar, "db");
        }

        public void c(g gVar) {
            o.e(gVar, "db");
        }
    }

    public static final class c {
        public /* synthetic */ c(i iVar) {
            this();
        }

        private c() {
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final Map f6768a = new LinkedHashMap();

        private final void a(W.b bVar) {
            int i4 = bVar.f1647a;
            int i5 = bVar.f1648b;
            Map map = this.f6768a;
            Integer valueOf = Integer.valueOf(i4);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            if (treeMap.containsKey(Integer.valueOf(i5))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i5)) + " with " + bVar);
            }
            treeMap.put(Integer.valueOf(i5), bVar);
        }

        private final List e(List list, boolean z3, int i4, int i5) {
            Set set;
            boolean z4;
            Integer num;
            do {
                if (z3) {
                    if (i4 >= i5) {
                        return list;
                    }
                } else if (i4 <= i5) {
                    return list;
                }
                TreeMap treeMap = (TreeMap) this.f6768a.get(Integer.valueOf(i4));
                if (treeMap == null) {
                    return null;
                }
                if (z3) {
                    set = treeMap.descendingKeySet();
                } else {
                    set = treeMap.keySet();
                }
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z4 = false;
                        continue;
                        break;
                    }
                    num = (Integer) it.next();
                    if (!z3) {
                        o.d(num, "targetVersion");
                        int intValue = num.intValue();
                        if (i5 <= intValue && intValue < i4) {
                            break;
                        }
                    } else {
                        int i6 = i4 + 1;
                        o.d(num, "targetVersion");
                        int intValue2 = num.intValue();
                        if (i6 <= intValue2 && intValue2 <= i5) {
                            break;
                        }
                    }
                }
                Object obj = treeMap.get(num);
                o.b(obj);
                list.add(obj);
                i4 = num.intValue();
                z4 = true;
                continue;
            } while (z4);
            return null;
        }

        public void b(W.b... bVarArr) {
            o.e(bVarArr, "migrations");
            for (W.b a4 : bVarArr) {
                a(a4);
            }
        }

        public final boolean c(int i4, int i5) {
            Map f4 = f();
            if (!f4.containsKey(Integer.valueOf(i4))) {
                return false;
            }
            Map map = (Map) f4.get(Integer.valueOf(i4));
            if (map == null) {
                map = D.h();
            }
            return map.containsKey(Integer.valueOf(i5));
        }

        public List d(int i4, int i5) {
            boolean z3;
            if (i4 == i5) {
                return C0718m.j();
            }
            if (i5 > i4) {
                z3 = true;
            } else {
                z3 = false;
            }
            return e(new ArrayList(), z3, i4, i5);
        }

        public Map f() {
            return this.f6768a;
        }
    }

    public static abstract class e {
    }

    public RoomDatabase() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        o.d(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f6743m = synchronizedMap;
        this.f6744n = new LinkedHashMap();
    }

    private final Object C(Class cls, h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof f) {
            return C(cls, ((f) hVar).getDelegate());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final void s() {
        c();
        g i02 = m().i0();
        l().t(i02);
        if (i02.S()) {
            i02.Y();
        } else {
            i02.j();
        }
    }

    /* access modifiers changed from: private */
    public final void t() {
        m().i0().i();
        if (!q()) {
            l().l();
        }
    }

    public static /* synthetic */ Cursor y(RoomDatabase roomDatabase, j jVar, CancellationSignal cancellationSignal, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                cancellationSignal = null;
            }
            return roomDatabase.x(jVar, cancellationSignal);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
    }

    public void A(Runnable runnable) {
        o.e(runnable, "body");
        e();
        try {
            runnable.run();
            B();
        } finally {
            i();
        }
    }

    public void B() {
        m().i0().V();
    }

    public void c() {
        if (!this.f6736f && v()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void d() {
        if (!q() && this.f6742l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void e() {
        c();
        c cVar = this.f6741k;
        if (cVar == null) {
            s();
        } else {
            cVar.g(new RoomDatabase$beginTransaction$1(this));
        }
    }

    public k f(String str) {
        o.e(str, "sql");
        c();
        d();
        return m().i0().u(str);
    }

    /* access modifiers changed from: protected */
    public abstract m g();

    /* access modifiers changed from: protected */
    public abstract h h(e eVar);

    public void i() {
        c cVar = this.f6741k;
        if (cVar == null) {
            t();
        } else {
            cVar.g(new RoomDatabase$endTransaction$1(this));
        }
    }

    public List j(Map map) {
        o.e(map, "autoMigrationSpecs");
        return C0718m.j();
    }

    public final Lock k() {
        ReentrantReadWriteLock.ReadLock readLock = this.f6740j.readLock();
        o.d(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public m l() {
        return this.f6735e;
    }

    public h m() {
        h hVar = this.f6734d;
        if (hVar != null) {
            return hVar;
        }
        o.p("internalOpenHelper");
        return null;
    }

    public Executor n() {
        Executor executor = this.f6732b;
        if (executor != null) {
            return executor;
        }
        o.p("internalQueryExecutor");
        return null;
    }

    public Set o() {
        return L.e();
    }

    /* access modifiers changed from: protected */
    public Map p() {
        return D.h();
    }

    public boolean q() {
        return m().i0().M();
    }

    public void r(e eVar) {
        boolean z3 = false;
        o.e(eVar, "configuration");
        this.f6734d = h(eVar);
        Set<Class> o4 = o();
        BitSet bitSet = new BitSet();
        for (Class cls : o4) {
            int size = eVar.f6806r.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i4 = size - 1;
                    if (cls.isAssignableFrom(eVar.f6806r.get(size).getClass())) {
                        bitSet.set(size);
                        break;
                    } else if (i4 < 0) {
                        break;
                    } else {
                        size = i4;
                    }
                }
            }
            size = -1;
            if (size >= 0) {
                this.f6739i.put(cls, eVar.f6806r.get(size));
            } else {
                throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
            }
        }
        int size2 = eVar.f6806r.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i5 = size2 - 1;
                if (!bitSet.get(size2)) {
                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                } else if (i5 < 0) {
                    break;
                } else {
                    size2 = i5;
                }
            }
        }
        for (W.b bVar : j(this.f6739i)) {
            if (!eVar.f6792d.c(bVar.f1647a, bVar.f1648b)) {
                eVar.f6792d.b(bVar);
            }
        }
        v vVar = (v) C(v.class, m());
        if (vVar != null) {
            vVar.f(eVar);
        }
        AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) C(AutoClosingRoomOpenHelper.class, m());
        if (autoClosingRoomOpenHelper != null) {
            this.f6741k = autoClosingRoomOpenHelper.f6715b;
            l().o(autoClosingRoomOpenHelper.f6715b);
        }
        if (eVar.f6795g == JournalMode.WRITE_AHEAD_LOGGING) {
            z3 = true;
        }
        m().setWriteAheadLoggingEnabled(z3);
        this.f6738h = eVar.f6793e;
        this.f6732b = eVar.f6796h;
        this.f6733c = new y(eVar.f6797i);
        this.f6736f = eVar.f6794f;
        this.f6737g = z3;
        if (eVar.f6798j != null) {
            if (eVar.f6790b != null) {
                l().p(eVar.f6789a, eVar.f6790b, eVar.f6798j);
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Map p4 = p();
        BitSet bitSet2 = new BitSet();
        for (Map.Entry entry : p4.entrySet()) {
            Class cls2 = (Class) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls3 = (Class) it.next();
                    int size3 = eVar.f6805q.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i6 = size3 - 1;
                            if (cls3.isAssignableFrom(eVar.f6805q.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else if (i6 < 0) {
                                break;
                            } else {
                                size3 = i6;
                            }
                        }
                    }
                    size3 = -1;
                    if (size3 >= 0) {
                        this.f6744n.put(cls3, eVar.f6805q.get(size3));
                    } else {
                        throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                    }
                }
            }
        }
        int size4 = eVar.f6805q.size() - 1;
        if (size4 >= 0) {
            while (true) {
                int i7 = size4 - 1;
                if (!bitSet2.get(size4)) {
                    throw new IllegalArgumentException("Unexpected type converter " + eVar.f6805q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                } else if (i7 >= 0) {
                    size4 = i7;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void u(g gVar) {
        o.e(gVar, "db");
        l().i(gVar);
    }

    public final boolean v() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public boolean w() {
        Boolean bool;
        boolean isOpen;
        c cVar = this.f6741k;
        if (cVar != null) {
            isOpen = cVar.l();
        } else {
            g gVar = this.f6731a;
            if (gVar != null) {
                isOpen = gVar.isOpen();
            } else {
                bool = null;
                return o.a(bool, Boolean.TRUE);
            }
        }
        bool = Boolean.valueOf(isOpen);
        return o.a(bool, Boolean.TRUE);
    }

    public Cursor x(j jVar, CancellationSignal cancellationSignal) {
        o.e(jVar, "query");
        c();
        d();
        if (cancellationSignal != null) {
            return m().i0().x(jVar, cancellationSignal);
        }
        return m().i0().J(jVar);
    }

    public Object z(Callable callable) {
        o.e(callable, "body");
        e();
        try {
            Object call = callable.call();
            B();
            return call;
        } finally {
            i();
        }
    }
}
