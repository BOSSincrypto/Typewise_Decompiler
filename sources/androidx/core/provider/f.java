package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.graphics.i;
import androidx.core.provider.g;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import y.C0943e;
import y.g;

abstract class f {

    /* renamed from: a  reason: collision with root package name */
    static final C0943e f5042a = new C0943e(16);

    /* renamed from: b  reason: collision with root package name */
    private static final ExecutorService f5043b = h.a("fonts-androidx", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    static final Object f5044c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final g f5045d = new g();

    class a implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f5047b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f5048c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f5049d;

        a(String str, Context context, e eVar, int i4) {
            this.f5046a = str;
            this.f5047b = context;
            this.f5048c = eVar;
            this.f5049d = i4;
        }

        /* renamed from: a */
        public e call() {
            return f.c(this.f5046a, this.f5047b, this.f5048c, this.f5049d);
        }
    }

    class b implements androidx.core.util.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f5050a;

        b(a aVar) {
            this.f5050a = aVar;
        }

        /* renamed from: a */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f5050a.b(eVar);
        }
    }

    class c implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5051a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f5052b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f5053c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f5054d;

        c(String str, Context context, e eVar, int i4) {
            this.f5051a = str;
            this.f5052b = context;
            this.f5053c = eVar;
            this.f5054d = i4;
        }

        /* renamed from: a */
        public e call() {
            try {
                return f.c(this.f5051a, this.f5052b, this.f5053c, this.f5054d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements androidx.core.util.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5055a;

        d(String str) {
            this.f5055a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
            if (r0 >= r2.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
            ((androidx.core.util.a) r2.get(r0)).accept(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(androidx.core.provider.f.e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = androidx.core.provider.f.f5044c
                monitor-enter(r0)
                y.g r1 = androidx.core.provider.f.f5045d     // Catch:{ all -> 0x0011 }
                java.lang.String r2 = r4.f5055a     // Catch:{ all -> 0x0011 }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x0011 }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0011 }
                if (r2 != 0) goto L_0x0013
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                return
            L_0x0011:
                r5 = move-exception
                goto L_0x002d
            L_0x0013:
                java.lang.String r3 = r4.f5055a     // Catch:{ all -> 0x0011 }
                r1.remove(r3)     // Catch:{ all -> 0x0011 }
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                r0 = 0
            L_0x001a:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002c
                java.lang.Object r1 = r2.get(r0)
                androidx.core.util.a r1 = (androidx.core.util.a) r1
                r1.accept(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.f.d.accept(androidx.core.provider.f$e):void");
        }
    }

    private static String a(e eVar, int i4) {
        return eVar.d() + "-" + i4;
    }

    private static int b(g.a aVar) {
        int i4 = 1;
        if (aVar.c() == 0) {
            g.b[] b4 = aVar.b();
            if (!(b4 == null || b4.length == 0)) {
                int length = b4.length;
                i4 = 0;
                int i5 = 0;
                while (i5 < length) {
                    int b5 = b4[i5].b();
                    if (b5 == 0) {
                        i5++;
                    } else if (b5 < 0) {
                        return -3;
                    } else {
                        return b5;
                    }
                }
            }
            return i4;
        } else if (aVar.c() != 1) {
            return -3;
        } else {
            return -2;
        }
    }

    static e c(String str, Context context, e eVar, int i4) {
        C0943e eVar2 = f5042a;
        Typeface typeface = (Typeface) eVar2.c(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a e4 = d.e(context, eVar, (CancellationSignal) null);
            int b4 = b(e4);
            if (b4 != 0) {
                return new e(b4);
            }
            Typeface b5 = i.b(context, (CancellationSignal) null, e4.b(), i4);
            if (b5 == null) {
                return new e(-3);
            }
            eVar2.d(str, b5);
            return new e(b5);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r9 = new androidx.core.provider.f.c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r8 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r8 = f5043b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        androidx.core.provider.h.b(r8, r9, new androidx.core.provider.f.d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Typeface d(android.content.Context r5, androidx.core.provider.e r6, int r7, java.util.concurrent.Executor r8, androidx.core.provider.a r9) {
        /*
            java.lang.String r0 = a(r6, r7)
            y.e r1 = f5042a
            java.lang.Object r1 = r1.c(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            androidx.core.provider.f$e r5 = new androidx.core.provider.f$e
            r5.<init>((android.graphics.Typeface) r1)
            r9.b(r5)
            return r1
        L_0x0017:
            androidx.core.provider.f$b r1 = new androidx.core.provider.f$b
            r1.<init>(r9)
            java.lang.Object r9 = f5044c
            monitor-enter(r9)
            y.g r2 = f5045d     // Catch:{ all -> 0x002f }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x002f }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x002f }
            r4 = 0
            if (r3 == 0) goto L_0x0031
            r3.add(r1)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            return r4
        L_0x002f:
            r5 = move-exception
            goto L_0x004f
        L_0x0031:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x002f }
            r3.<init>()     // Catch:{ all -> 0x002f }
            r3.add(r1)     // Catch:{ all -> 0x002f }
            r2.put(r0, r3)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            androidx.core.provider.f$c r9 = new androidx.core.provider.f$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0046
            java.util.concurrent.ExecutorService r8 = f5043b
        L_0x0046:
            androidx.core.provider.f$d r5 = new androidx.core.provider.f$d
            r5.<init>(r0)
            androidx.core.provider.h.b(r8, r9, r5)
            return r4
        L_0x004f:
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.f.d(android.content.Context, androidx.core.provider.e, int, java.util.concurrent.Executor, androidx.core.provider.a):android.graphics.Typeface");
    }

    static Typeface e(Context context, e eVar, a aVar, int i4, int i5) {
        String a4 = a(eVar, i4);
        Typeface typeface = (Typeface) f5042a.c(a4);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        } else if (i5 == -1) {
            e c4 = c(a4, context, eVar, i4);
            aVar.b(c4);
            return c4.f5056a;
        } else {
            try {
                e eVar2 = (e) h.c(f5043b, new a(a4, context, eVar, i4), i5);
                aVar.b(eVar2);
                return eVar2.f5056a;
            } catch (InterruptedException unused) {
                aVar.b(new e(-3));
                return null;
            }
        }
    }

    static final class e {

        /* renamed from: a  reason: collision with root package name */
        final Typeface f5056a;

        /* renamed from: b  reason: collision with root package name */
        final int f5057b;

        e(int i4) {
            this.f5056a = null;
            this.f5057b = i4;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            if (this.f5057b == 0) {
                return true;
            }
            return false;
        }

        e(Typeface typeface) {
            this.f5056a = typeface;
            this.f5057b = 0;
        }
    }
}
