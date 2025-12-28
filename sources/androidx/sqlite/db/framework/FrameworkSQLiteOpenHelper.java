package androidx.sqlite.db.framework;

import Z.g;
import Z.h;
import a0.C0354a;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.getcapacitor.PluginMethod;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.f;

public final class FrameworkSQLiteOpenHelper implements h {

    /* renamed from: h  reason: collision with root package name */
    public static final a f6914h = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f6915a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f6916b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final h.a f6917c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6918d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6919e;

    /* renamed from: f  reason: collision with root package name */
    private final f f6920f = c.b(new FrameworkSQLiteOpenHelper$lazyDelegate$1(this));
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f6921g;

    private static final class OpenHelper extends SQLiteOpenHelper {

        /* renamed from: h  reason: collision with root package name */
        public static final a f6922h = new a((i) null);

        /* renamed from: a  reason: collision with root package name */
        private final Context f6923a;

        /* renamed from: b  reason: collision with root package name */
        private final b f6924b;

        /* renamed from: c  reason: collision with root package name */
        private final h.a f6925c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f6926d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f6927e;

        /* renamed from: f  reason: collision with root package name */
        private final C0354a f6928f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f6929g;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "callbackName", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "cause", "", "(Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;Ljava/lang/Throwable;)V", "getCallbackName", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "getCause", "()Ljava/lang/Throwable;", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        private static final class CallbackException extends RuntimeException {
            private final CallbackName callbackName;
            private final Throwable cause;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public CallbackException(CallbackName callbackName2, Throwable th) {
                super(th);
                o.e(callbackName2, "callbackName");
                o.e(th, "cause");
                this.callbackName = callbackName2;
                this.cause = th;
            }

            public final CallbackName getCallbackName() {
                return this.callbackName;
            }

            public Throwable getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "(Ljava/lang/String;I)V", "ON_CONFIGURE", "ON_CREATE", "ON_UPGRADE", "ON_DOWNGRADE", "ON_OPEN", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public enum CallbackName {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        public static final class a {
            public /* synthetic */ a(i iVar) {
                this();
            }

            public final FrameworkSQLiteDatabase a(b bVar, SQLiteDatabase sQLiteDatabase) {
                o.e(bVar, "refHolder");
                o.e(sQLiteDatabase, "sqLiteDatabase");
                FrameworkSQLiteDatabase a4 = bVar.a();
                if (a4 != null && a4.f(sQLiteDatabase)) {
                    return a4;
                }
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = new FrameworkSQLiteDatabase(sQLiteDatabase);
                bVar.b(frameworkSQLiteDatabase);
                return frameworkSQLiteDatabase;
            }

            private a() {
            }
        }

        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f6931a;

            /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName[] r0 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CONFIGURE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_UPGRADE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_DOWNGRADE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_OPEN     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    f6931a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.b.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OpenHelper(Context context, String str, b bVar, h.a aVar, boolean z3) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f2136a, new c(aVar, bVar));
            o.e(context, "context");
            o.e(bVar, "dbRef");
            o.e(aVar, PluginMethod.RETURN_CALLBACK);
            this.f6923a = context;
            this.f6924b = bVar;
            this.f6925c = aVar;
            this.f6926d = z3;
            if (str == null) {
                str = UUID.randomUUID().toString();
                o.d(str, "randomUUID().toString()");
            }
            File cacheDir = context.getCacheDir();
            o.d(cacheDir, "context.cacheDir");
            this.f6928f = new C0354a(str, cacheDir, false);
        }

        /* access modifiers changed from: private */
        public static final void e(h.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            o.e(aVar, "$callback");
            o.e(bVar, "$dbRef");
            a aVar2 = f6922h;
            o.d(sQLiteDatabase, "dbObj");
            aVar.c(aVar2.a(bVar, sQLiteDatabase));
        }

        private final SQLiteDatabase m(boolean z3) {
            if (z3) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                o.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            o.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|10|12|13|14|15|16) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final android.database.sqlite.SQLiteDatabase o(boolean r5) {
            /*
                r4 = this;
                java.lang.String r0 = r4.getDatabaseName()
                if (r0 == 0) goto L_0x0031
                android.content.Context r1 = r4.f6923a
                java.io.File r1 = r1.getDatabasePath(r0)
                java.io.File r1 = r1.getParentFile()
                if (r1 == 0) goto L_0x0031
                r1.mkdirs()
                boolean r2 = r1.isDirectory()
                if (r2 != 0) goto L_0x0031
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid database parent file, not a directory: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "SupportSQLite"
                android.util.Log.w(r2, r1)
            L_0x0031:
                android.database.sqlite.SQLiteDatabase r5 = r4.m(r5)     // Catch:{ all -> 0x0036 }
                return r5
            L_0x0036:
                super.close()
                r1 = 500(0x1f4, double:2.47E-321)
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x003e }
            L_0x003e:
                android.database.sqlite.SQLiteDatabase r5 = r4.m(r5)     // Catch:{ all -> 0x0043 }
                return r5
            L_0x0043:
                r1 = move-exception
                super.close()
                boolean r2 = r1 instanceof androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException
                if (r2 == 0) goto L_0x0070
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackException r1 = (androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException) r1
                java.lang.Throwable r2 = r1.getCause()
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$CallbackName r1 = r1.getCallbackName()
                int[] r3 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.b.f6931a
                int r1 = r1.ordinal()
                r1 = r3[r1]
                r3 = 1
                if (r1 == r3) goto L_0x006f
                r3 = 2
                if (r1 == r3) goto L_0x006f
                r3 = 3
                if (r1 == r3) goto L_0x006f
                r3 = 4
                if (r1 == r3) goto L_0x006f
                boolean r1 = r2 instanceof android.database.sqlite.SQLiteException
                if (r1 == 0) goto L_0x006e
                goto L_0x007a
            L_0x006e:
                throw r2
            L_0x006f:
                throw r2
            L_0x0070:
                boolean r2 = r1 instanceof android.database.sqlite.SQLiteException
                if (r2 == 0) goto L_0x008b
                if (r0 == 0) goto L_0x008a
                boolean r2 = r4.f6926d
                if (r2 == 0) goto L_0x008a
            L_0x007a:
                android.content.Context r1 = r4.f6923a
                r1.deleteDatabase(r0)
                android.database.sqlite.SQLiteDatabase r5 = r4.m(r5)     // Catch:{ CallbackException -> 0x0084 }
                return r5
            L_0x0084:
                r5 = move-exception
                java.lang.Throwable r5 = r5.getCause()
                throw r5
            L_0x008a:
                throw r1
            L_0x008b:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.o(boolean):android.database.sqlite.SQLiteDatabase");
        }

        public void close() {
            try {
                C0354a.c(this.f6928f, false, 1, (Object) null);
                super.close();
                this.f6924b.b((FrameworkSQLiteDatabase) null);
                this.f6929g = false;
            } finally {
                this.f6928f.d();
            }
        }

        public final g f(boolean z3) {
            boolean z4;
            try {
                C0354a aVar = this.f6928f;
                if (this.f6929g || getDatabaseName() == null) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                aVar.b(z4);
                this.f6927e = false;
                SQLiteDatabase o4 = o(z3);
                if (this.f6927e) {
                    close();
                    g f4 = f(z3);
                    this.f6928f.d();
                    return f4;
                }
                FrameworkSQLiteDatabase h4 = h(o4);
                this.f6928f.d();
                return h4;
            } catch (Throwable th) {
                this.f6928f.d();
                throw th;
            }
        }

        public final FrameworkSQLiteDatabase h(SQLiteDatabase sQLiteDatabase) {
            o.e(sQLiteDatabase, "sqLiteDatabase");
            return f6922h.a(this.f6924b, sQLiteDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            o.e(sQLiteDatabase, "db");
            try {
                this.f6925c.b(h(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CONFIGURE, th);
            }
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            o.e(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f6925c.d(h(sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CREATE, th);
            }
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
            o.e(sQLiteDatabase, "db");
            this.f6927e = true;
            try {
                this.f6925c.e(h(sQLiteDatabase), i4, i5);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_DOWNGRADE, th);
            }
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            o.e(sQLiteDatabase, "db");
            if (!this.f6927e) {
                try {
                    this.f6925c.f(h(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.ON_OPEN, th);
                }
            }
            this.f6929g = true;
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
            o.e(sQLiteDatabase, "sqLiteDatabase");
            this.f6927e = true;
            try {
                this.f6925c.g(h(sQLiteDatabase), i4, i5);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_UPGRADE, th);
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private FrameworkSQLiteDatabase f6932a;

        public b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.f6932a = frameworkSQLiteDatabase;
        }

        public final FrameworkSQLiteDatabase a() {
            return this.f6932a;
        }

        public final void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.f6932a = frameworkSQLiteDatabase;
        }
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, h.a aVar, boolean z3, boolean z4) {
        o.e(context, "context");
        o.e(aVar, PluginMethod.RETURN_CALLBACK);
        this.f6915a = context;
        this.f6916b = str;
        this.f6917c = aVar;
        this.f6918d = z3;
        this.f6919e = z4;
    }

    private final OpenHelper v() {
        return (OpenHelper) this.f6920f.getValue();
    }

    public void close() {
        if (this.f6920f.isInitialized()) {
            v().close();
        }
    }

    public String getDatabaseName() {
        return this.f6916b;
    }

    public g i0() {
        return v().f(true);
    }

    public void setWriteAheadLoggingEnabled(boolean z3) {
        if (this.f6920f.isInitialized()) {
            Z.b.d(v(), z3);
        }
        this.f6921g = z3;
    }
}
