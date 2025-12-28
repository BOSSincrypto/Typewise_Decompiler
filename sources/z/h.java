package Z;

import android.content.Context;
import android.util.Log;
import com.getcapacitor.PluginMethod;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.i;
import kotlin.text.o;

public interface h extends Closeable {

    public static abstract class a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0041a f2135b = new C0041a((i) null);

        /* renamed from: a  reason: collision with root package name */
        public final int f2136a;

        /* renamed from: Z.h$a$a  reason: collision with other inner class name */
        public static final class C0041a {
            public /* synthetic */ C0041a(i iVar) {
                this();
            }

            private C0041a() {
            }
        }

        public a(int i4) {
            this.f2136a = i4;
        }

        private final void a(String str) {
            int i4;
            boolean z3;
            if (!o.v(str, ":memory:", true)) {
                int length = str.length() - 1;
                int i5 = 0;
                boolean z4 = false;
                while (i5 <= length) {
                    if (!z4) {
                        i4 = i5;
                    } else {
                        i4 = length;
                    }
                    if (kotlin.jvm.internal.o.f(str.charAt(i4), 32) <= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z4) {
                        if (!z3) {
                            z4 = true;
                        } else {
                            i5++;
                        }
                    } else if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (str.subSequence(i5, length + 1).toString().length() != 0) {
                    Log.w("SupportSQLite", "deleting the database file: " + str);
                    try {
                        b.a(new File(str));
                    } catch (Exception e4) {
                        Log.w("SupportSQLite", "delete failed: ", e4);
                    }
                }
            }
        }

        public void b(g gVar) {
            kotlin.jvm.internal.o.e(gVar, "db");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
            if (r1 != null) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
            r4 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
            if (r4.hasNext() != false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
            r1 = ((android.util.Pair) r4.next()).second;
            kotlin.jvm.internal.o.d(r1, "p.second");
            a((java.lang.String) r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
            r4 = r4.K();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
            if (r4 != null) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
            a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003a */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0038 A[ExcHandler: all (r2v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r1 
          PHI: (r1v12 java.util.List) = (r1v4 java.util.List), (r1v5 java.util.List), (r1v5 java.util.List) binds: [B:6:0x0033, B:9:0x003a, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:6:0x0033] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(Z.g r4) {
            /*
                r3 = this;
                java.lang.String r0 = "p.second"
                java.lang.String r1 = "db"
                kotlin.jvm.internal.o.e(r4, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Corruption reported by sqlite on database: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = ".path"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "SupportSQLite"
                android.util.Log.e(r2, r1)
                boolean r1 = r4.isOpen()
                if (r1 != 0) goto L_0x0032
                java.lang.String r4 = r4.K()
                if (r4 == 0) goto L_0x0031
                r3.a(r4)
            L_0x0031:
                return
            L_0x0032:
                r1 = 0
                java.util.List r1 = r4.l()     // Catch:{ SQLiteException -> 0x003a, all -> 0x0038 }
                goto L_0x003a
            L_0x0038:
                r2 = move-exception
                goto L_0x003e
            L_0x003a:
                r4.close()     // Catch:{ IOException -> 0x0067, all -> 0x0038 }
                goto L_0x0067
            L_0x003e:
                if (r1 == 0) goto L_0x005d
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r4 = r1.iterator()
            L_0x0046:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x0066
                java.lang.Object r1 = r4.next()
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.second
                kotlin.jvm.internal.o.d(r1, r0)
                java.lang.String r1 = (java.lang.String) r1
                r3.a(r1)
                goto L_0x0046
            L_0x005d:
                java.lang.String r4 = r4.K()
                if (r4 == 0) goto L_0x0066
                r3.a(r4)
            L_0x0066:
                throw r2
            L_0x0067:
                if (r1 == 0) goto L_0x0086
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r4 = r1.iterator()
            L_0x006f:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x008f
                java.lang.Object r1 = r4.next()
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.second
                kotlin.jvm.internal.o.d(r1, r0)
                java.lang.String r1 = (java.lang.String) r1
                r3.a(r1)
                goto L_0x006f
            L_0x0086:
                java.lang.String r4 = r4.K()
                if (r4 == 0) goto L_0x008f
                r3.a(r4)
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Z.h.a.c(Z.g):void");
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i4, int i5);

        public void f(g gVar) {
            kotlin.jvm.internal.o.e(gVar, "db");
        }

        public abstract void g(g gVar, int i4, int i5);
    }

    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        public static final C0042b f2137f = new C0042b((i) null);

        /* renamed from: a  reason: collision with root package name */
        public final Context f2138a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2139b;

        /* renamed from: c  reason: collision with root package name */
        public final a f2140c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2141d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f2142e;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private final Context f2143a;

            /* renamed from: b  reason: collision with root package name */
            private String f2144b;

            /* renamed from: c  reason: collision with root package name */
            private a f2145c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f2146d;

            /* renamed from: e  reason: collision with root package name */
            private boolean f2147e;

            public a(Context context) {
                kotlin.jvm.internal.o.e(context, "context");
                this.f2143a = context;
            }

            public a a(boolean z3) {
                this.f2147e = z3;
                return this;
            }

            public b b() {
                String str;
                a aVar = this.f2145c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (!this.f2146d || ((str = this.f2144b) != null && str.length() != 0)) {
                    return new b(this.f2143a, this.f2144b, aVar, this.f2146d, this.f2147e);
                } else {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
            }

            public a c(a aVar) {
                kotlin.jvm.internal.o.e(aVar, PluginMethod.RETURN_CALLBACK);
                this.f2145c = aVar;
                return this;
            }

            public a d(String str) {
                this.f2144b = str;
                return this;
            }

            public a e(boolean z3) {
                this.f2146d = z3;
                return this;
            }
        }

        /* renamed from: Z.h$b$b  reason: collision with other inner class name */
        public static final class C0042b {
            public /* synthetic */ C0042b(i iVar) {
                this();
            }

            public final a a(Context context) {
                kotlin.jvm.internal.o.e(context, "context");
                return new a(context);
            }

            private C0042b() {
            }
        }

        public b(Context context, String str, a aVar, boolean z3, boolean z4) {
            kotlin.jvm.internal.o.e(context, "context");
            kotlin.jvm.internal.o.e(aVar, PluginMethod.RETURN_CALLBACK);
            this.f2138a = context;
            this.f2139b = str;
            this.f2140c = aVar;
            this.f2141d = z3;
            this.f2142e = z4;
        }

        public static final a a(Context context) {
            return f2137f.a(context);
        }
    }

    public interface c {
        h a(b bVar);
    }

    void close();

    String getDatabaseName();

    g i0();

    void setWriteAheadLoggingEnabled(boolean z3);
}
