package V0;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final File f1548a;

    /* renamed from: b  reason: collision with root package name */
    private final File f1549b;

    /* renamed from: c  reason: collision with root package name */
    private final File f1550c;

    /* renamed from: d  reason: collision with root package name */
    private final File f1551d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1552e;

    /* renamed from: f  reason: collision with root package name */
    private long f1553f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final int f1554g;

    /* renamed from: h  reason: collision with root package name */
    private long f1555h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public Writer f1556i;

    /* renamed from: j  reason: collision with root package name */
    private final LinkedHashMap f1557j = new LinkedHashMap(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f1558k;

    /* renamed from: l  reason: collision with root package name */
    private long f1559l = 0;

    /* renamed from: m  reason: collision with root package name */
    final ThreadPoolExecutor f1560m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C0028b((a) null));

    /* renamed from: n  reason: collision with root package name */
    private final Callable f1561n = new a();

    class a implements Callable {
        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r4 = this;
                V0.b r0 = V0.b.this
                monitor-enter(r0)
                V0.b r1 = V0.b.this     // Catch:{ all -> 0x000e }
                java.io.Writer r1 = r1.f1556i     // Catch:{ all -> 0x000e }
                r2 = 0
                if (r1 != 0) goto L_0x0010
                monitor-exit(r0)     // Catch:{ all -> 0x000e }
                return r2
            L_0x000e:
                r1 = move-exception
                goto L_0x002a
            L_0x0010:
                V0.b r1 = V0.b.this     // Catch:{ all -> 0x000e }
                r1.w0()     // Catch:{ all -> 0x000e }
                V0.b r1 = V0.b.this     // Catch:{ all -> 0x000e }
                boolean r1 = r1.o0()     // Catch:{ all -> 0x000e }
                if (r1 == 0) goto L_0x0028
                V0.b r1 = V0.b.this     // Catch:{ all -> 0x000e }
                r1.t0()     // Catch:{ all -> 0x000e }
                V0.b r1 = V0.b.this     // Catch:{ all -> 0x000e }
                r3 = 0
                int unused = r1.f1558k = r3     // Catch:{ all -> 0x000e }
            L_0x0028:
                monitor-exit(r0)     // Catch:{ all -> 0x000e }
                return r2
            L_0x002a:
                monitor-exit(r0)     // Catch:{ all -> 0x000e }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: V0.b.a.call():java.lang.Void");
        }
    }

    /* renamed from: V0.b$b  reason: collision with other inner class name */
    private static final class C0028b implements ThreadFactory {
        private C0028b() {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ C0028b(a aVar) {
            this();
        }
    }

    public final class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final d f1563a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f1564b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f1565c;

        /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        public void a() {
            b.this.G(this, false);
        }

        public void b() {
            if (!this.f1565c) {
                try {
                    a();
                } catch (IOException unused) {
                }
            }
        }

        public void e() {
            b.this.G(this, true);
            this.f1565c = true;
        }

        public File f(int i4) {
            File k4;
            synchronized (b.this) {
                try {
                    if (this.f1563a.f1572f == this) {
                        if (!this.f1563a.f1571e) {
                            this.f1564b[i4] = true;
                        }
                        k4 = this.f1563a.k(i4);
                        b.this.f1548a.mkdirs();
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return k4;
        }

        private c(d dVar) {
            this.f1563a = dVar;
            this.f1564b = dVar.f1571e ? null : new boolean[b.this.f1554g];
        }
    }

    private final class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f1567a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long[] f1568b;

        /* renamed from: c  reason: collision with root package name */
        File[] f1569c;

        /* renamed from: d  reason: collision with root package name */
        File[] f1570d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f1571e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public c f1572f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public long f1573g;

        /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: private */
        public void n(String[] strArr) {
            if (strArr.length == b.this.f1554g) {
                int i4 = 0;
                while (i4 < strArr.length) {
                    try {
                        this.f1568b[i4] = Long.parseLong(strArr[i4]);
                        i4++;
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }

        public File j(int i4) {
            return this.f1569c[i4];
        }

        public File k(int i4) {
            return this.f1570d[i4];
        }

        public String l() {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f1568b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        private d(String str) {
            this.f1567a = str;
            this.f1568b = new long[b.this.f1554g];
            this.f1569c = new File[b.this.f1554g];
            this.f1570d = new File[b.this.f1554g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i4 = 0; i4 < b.this.f1554g; i4++) {
                sb.append(i4);
                this.f1569c[i4] = new File(b.this.f1548a, sb.toString());
                sb.append(".tmp");
                this.f1570d[i4] = new File(b.this.f1548a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    public final class e {

        /* renamed from: a  reason: collision with root package name */
        private final String f1575a;

        /* renamed from: b  reason: collision with root package name */
        private final long f1576b;

        /* renamed from: c  reason: collision with root package name */
        private final long[] f1577c;

        /* renamed from: d  reason: collision with root package name */
        private final File[] f1578d;

        /* synthetic */ e(b bVar, String str, long j4, File[] fileArr, long[] jArr, a aVar) {
            this(str, j4, fileArr, jArr);
        }

        public File a(int i4) {
            return this.f1578d[i4];
        }

        private e(String str, long j4, File[] fileArr, long[] jArr) {
            this.f1575a = str;
            this.f1576b = j4;
            this.f1578d = fileArr;
            this.f1577c = jArr;
        }
    }

    private b(File file, int i4, int i5, long j4) {
        File file2 = file;
        this.f1548a = file2;
        this.f1552e = i4;
        this.f1549b = new File(file2, "journal");
        this.f1550c = new File(file2, "journal.tmp");
        this.f1551d = new File(file2, "journal.bkp");
        this.f1554g = i5;
        this.f1553f = j4;
    }

    private void A() {
        if (this.f1556i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void D(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void G(V0.b.c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            V0.b$d r0 = r10.f1563a     // Catch:{ all -> 0x0030 }
            V0.b$c r1 = r0.f1572f     // Catch:{ all -> 0x0030 }
            if (r1 != r10) goto L_0x010b
            r1 = 0
            if (r11 == 0) goto L_0x0050
            boolean r2 = r0.f1571e     // Catch:{ all -> 0x0030 }
            if (r2 != 0) goto L_0x0050
            r2 = r1
        L_0x0015:
            int r3 = r9.f1554g     // Catch:{ all -> 0x0030 }
            if (r2 >= r3) goto L_0x0050
            boolean[] r3 = r10.f1564b     // Catch:{ all -> 0x0030 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x0030 }
            if (r3 == 0) goto L_0x0036
            java.io.File r3 = r0.k(r2)     // Catch:{ all -> 0x0030 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x0030 }
            if (r3 != 0) goto L_0x0033
            r10.a()     // Catch:{ all -> 0x0030 }
            monitor-exit(r9)
            return
        L_0x0030:
            r10 = move-exception
            goto L_0x0111
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0036:
            r10.a()     // Catch:{ all -> 0x0030 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0030 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r11.<init>()     // Catch:{ all -> 0x0030 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x0030 }
            r11.append(r2)     // Catch:{ all -> 0x0030 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0030 }
            r10.<init>(r11)     // Catch:{ all -> 0x0030 }
            throw r10     // Catch:{ all -> 0x0030 }
        L_0x0050:
            int r10 = r9.f1554g     // Catch:{ all -> 0x0030 }
            if (r1 >= r10) goto L_0x0084
            java.io.File r10 = r0.k(r1)     // Catch:{ all -> 0x0030 }
            if (r11 == 0) goto L_0x007e
            boolean r2 = r10.exists()     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0081
            java.io.File r2 = r0.j(r1)     // Catch:{ all -> 0x0030 }
            r10.renameTo(r2)     // Catch:{ all -> 0x0030 }
            long[] r10 = r0.f1568b     // Catch:{ all -> 0x0030 }
            r3 = r10[r1]     // Catch:{ all -> 0x0030 }
            long r5 = r2.length()     // Catch:{ all -> 0x0030 }
            long[] r10 = r0.f1568b     // Catch:{ all -> 0x0030 }
            r10[r1] = r5     // Catch:{ all -> 0x0030 }
            long r7 = r9.f1555h     // Catch:{ all -> 0x0030 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f1555h = r7     // Catch:{ all -> 0x0030 }
            goto L_0x0081
        L_0x007e:
            R(r10)     // Catch:{ all -> 0x0030 }
        L_0x0081:
            int r1 = r1 + 1
            goto L_0x0050
        L_0x0084:
            int r10 = r9.f1558k     // Catch:{ all -> 0x0030 }
            r1 = 1
            int r10 = r10 + r1
            r9.f1558k = r10     // Catch:{ all -> 0x0030 }
            r10 = 0
            V0.b.c unused = r0.f1572f = r10     // Catch:{ all -> 0x0030 }
            boolean r10 = r0.f1571e     // Catch:{ all -> 0x0030 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00cc
            boolean unused = r0.f1571e = r1     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f1556i     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f1556i     // Catch:{ all -> 0x0030 }
            r10.append(r3)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f1556i     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = r0.f1567a     // Catch:{ all -> 0x0030 }
            r10.append(r1)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f1556i     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = r0.l()     // Catch:{ all -> 0x0030 }
            r10.append(r1)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f1556i     // Catch:{ all -> 0x0030 }
            r10.append(r2)     // Catch:{ all -> 0x0030 }
            if (r11 == 0) goto L_0x00ef
            long r10 = r9.f1559l     // Catch:{ all -> 0x0030 }
            r1 = 1
            long r1 = r1 + r10
            r9.f1559l = r1     // Catch:{ all -> 0x0030 }
            long unused = r0.f1573g = r10     // Catch:{ all -> 0x0030 }
            goto L_0x00ef
        L_0x00cc:
            java.util.LinkedHashMap r10 = r9.f1557j     // Catch:{ all -> 0x0030 }
            java.lang.String r11 = r0.f1567a     // Catch:{ all -> 0x0030 }
            r10.remove(r11)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f1556i     // Catch:{ all -> 0x0030 }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f1556i     // Catch:{ all -> 0x0030 }
            r10.append(r3)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f1556i     // Catch:{ all -> 0x0030 }
            java.lang.String r11 = r0.f1567a     // Catch:{ all -> 0x0030 }
            r10.append(r11)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f1556i     // Catch:{ all -> 0x0030 }
            r10.append(r2)     // Catch:{ all -> 0x0030 }
        L_0x00ef:
            java.io.Writer r10 = r9.f1556i     // Catch:{ all -> 0x0030 }
            g0(r10)     // Catch:{ all -> 0x0030 }
            long r10 = r9.f1555h     // Catch:{ all -> 0x0030 }
            long r0 = r9.f1553f     // Catch:{ all -> 0x0030 }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x0102
            boolean r10 = r9.o0()     // Catch:{ all -> 0x0030 }
            if (r10 == 0) goto L_0x0109
        L_0x0102:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f1560m     // Catch:{ all -> 0x0030 }
            java.util.concurrent.Callable r11 = r9.f1561n     // Catch:{ all -> 0x0030 }
            r10.submit(r11)     // Catch:{ all -> 0x0030 }
        L_0x0109:
            monitor-exit(r9)
            return
        L_0x010b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0030 }
            r10.<init>()     // Catch:{ all -> 0x0030 }
            throw r10     // Catch:{ all -> 0x0030 }
        L_0x0111:
            monitor-exit(r9)     // Catch:{ all -> 0x0030 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.b.G(V0.b$c, boolean):void");
    }

    private static void R(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized V0.b.c e0(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.A()     // Catch:{ all -> 0x001e }
            java.util.LinkedHashMap r0 = r5.f1557j     // Catch:{ all -> 0x001e }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x001e }
            V0.b$d r0 = (V0.b.d) r0     // Catch:{ all -> 0x001e }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0020
            long r3 = r0.f1573g     // Catch:{ all -> 0x001e }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0022
            goto L_0x0020
        L_0x001e:
            r6 = move-exception
            goto L_0x0060
        L_0x0020:
            monitor-exit(r5)
            return r2
        L_0x0022:
            if (r0 != 0) goto L_0x002f
            V0.b$d r0 = new V0.b$d     // Catch:{ all -> 0x001e }
            r0.<init>(r5, r6, r2)     // Catch:{ all -> 0x001e }
            java.util.LinkedHashMap r7 = r5.f1557j     // Catch:{ all -> 0x001e }
            r7.put(r6, r0)     // Catch:{ all -> 0x001e }
            goto L_0x0037
        L_0x002f:
            V0.b$c r7 = r0.f1572f     // Catch:{ all -> 0x001e }
            if (r7 == 0) goto L_0x0037
            monitor-exit(r5)
            return r2
        L_0x0037:
            V0.b$c r7 = new V0.b$c     // Catch:{ all -> 0x001e }
            r7.<init>(r5, r0, r2)     // Catch:{ all -> 0x001e }
            V0.b.c unused = r0.f1572f = r7     // Catch:{ all -> 0x001e }
            java.io.Writer r8 = r5.f1556i     // Catch:{ all -> 0x001e }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x001e }
            java.io.Writer r8 = r5.f1556i     // Catch:{ all -> 0x001e }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x001e }
            java.io.Writer r8 = r5.f1556i     // Catch:{ all -> 0x001e }
            r8.append(r6)     // Catch:{ all -> 0x001e }
            java.io.Writer r6 = r5.f1556i     // Catch:{ all -> 0x001e }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x001e }
            java.io.Writer r6 = r5.f1556i     // Catch:{ all -> 0x001e }
            g0(r6)     // Catch:{ all -> 0x001e }
            monitor-exit(r5)
            return r7
        L_0x0060:
            monitor-exit(r5)     // Catch:{ all -> 0x001e }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.b.e0(java.lang.String, long):V0.b$c");
    }

    private static void g0(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    public boolean o0() {
        int i4 = this.f1558k;
        if (i4 < 2000 || i4 < this.f1557j.size()) {
            return false;
        }
        return true;
    }

    public static b p0(File file, int i4, int i5, long j4) {
        if (j4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i5 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    v0(file2, file3, false);
                }
            }
            b bVar = new b(file, i4, i5, j4);
            if (bVar.f1549b.exists()) {
                try {
                    bVar.r0();
                    bVar.q0();
                    return bVar;
                } catch (IOException e4) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e4.getMessage() + ", removing");
                    bVar.Q();
                }
            }
            file.mkdirs();
            b bVar2 = new b(file, i4, i5, j4);
            bVar2.t0();
            return bVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    private void q0() {
        R(this.f1550c);
        Iterator it = this.f1557j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i4 = 0;
            if (dVar.f1572f == null) {
                while (i4 < this.f1554g) {
                    this.f1555h += dVar.f1568b[i4];
                    i4++;
                }
            } else {
                c unused = dVar.f1572f = null;
                while (i4 < this.f1554g) {
                    R(dVar.j(i4));
                    R(dVar.k(i4));
                    i4++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|(1:20)(1:21)|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r9.f1558k = r0 - r9.f1557j.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (r1.f() != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        t0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        r9.f1556i = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f1549b, true), V0.d.f1586a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0061 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0061=Splitter:B:17:0x0061, B:24:0x008e=Splitter:B:24:0x008e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r0() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            V0.c r1 = new V0.c
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f1549b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = V0.d.f1586a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.h()     // Catch:{ all -> 0x005f }
            java.lang.String r3 = r1.h()     // Catch:{ all -> 0x005f }
            java.lang.String r4 = r1.h()     // Catch:{ all -> 0x005f }
            java.lang.String r5 = r1.h()     // Catch:{ all -> 0x005f }
            java.lang.String r6 = r1.h()     // Catch:{ all -> 0x005f }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x008e
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x008e
            int r7 = r9.f1552e     // Catch:{ all -> 0x005f }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x005f }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x005f }
            if (r4 == 0) goto L_0x008e
            int r4 = r9.f1554g     // Catch:{ all -> 0x005f }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x005f }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x005f }
            if (r4 == 0) goto L_0x008e
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x005f }
            if (r4 == 0) goto L_0x008e
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.h()     // Catch:{ EOFException -> 0x0061 }
            r9.s0(r2)     // Catch:{ EOFException -> 0x0061 }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            r0 = move-exception
            goto L_0x00bc
        L_0x0061:
            java.util.LinkedHashMap r2 = r9.f1557j     // Catch:{ all -> 0x005f }
            int r2 = r2.size()     // Catch:{ all -> 0x005f }
            int r0 = r0 - r2
            r9.f1558k = r0     // Catch:{ all -> 0x005f }
            boolean r0 = r1.f()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0074
            r9.t0()     // Catch:{ all -> 0x005f }
            goto L_0x008a
        L_0x0074:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x005f }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x005f }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x005f }
            java.io.File r4 = r9.f1549b     // Catch:{ all -> 0x005f }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x005f }
            java.nio.charset.Charset r4 = V0.d.f1586a     // Catch:{ all -> 0x005f }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x005f }
            r0.<init>(r2)     // Catch:{ all -> 0x005f }
            r9.f1556i = r0     // Catch:{ all -> 0x005f }
        L_0x008a:
            V0.d.a(r1)
            return
        L_0x008e:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x005f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
            r7.<init>()     // Catch:{ all -> 0x005f }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x005f }
            r7.append(r2)     // Catch:{ all -> 0x005f }
            r7.append(r0)     // Catch:{ all -> 0x005f }
            r7.append(r3)     // Catch:{ all -> 0x005f }
            r7.append(r0)     // Catch:{ all -> 0x005f }
            r7.append(r5)     // Catch:{ all -> 0x005f }
            r7.append(r0)     // Catch:{ all -> 0x005f }
            r7.append(r6)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x005f }
            r4.<init>(r0)     // Catch:{ all -> 0x005f }
            throw r4     // Catch:{ all -> 0x005f }
        L_0x00bc:
            V0.d.a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.b.r0():void");
    }

    private void s0(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i4 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i4);
            if (indexOf2 == -1) {
                str2 = str.substring(i4);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f1557j.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i4, indexOf2);
            }
            d dVar = (d) this.f1557j.get(str2);
            if (dVar == null) {
                dVar = new d(this, str2, (a) null);
                this.f1557j.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f1571e = true;
                c unused2 = dVar.f1572f = null;
                dVar.n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c unused3 = dVar.f1572f = new c(this, dVar, (a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public synchronized void t0() {
        BufferedWriter bufferedWriter;
        try {
            Writer writer = this.f1556i;
            if (writer != null) {
                D(writer);
            }
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1550c), d.f1586a));
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f1552e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f1554g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.f1557j.values()) {
                if (dVar.f1572f != null) {
                    bufferedWriter.write("DIRTY " + dVar.f1567a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + dVar.f1567a + dVar.l() + 10);
                }
            }
            D(bufferedWriter);
            if (this.f1549b.exists()) {
                v0(this.f1549b, this.f1551d, true);
            }
            v0(this.f1550c, this.f1549b, false);
            this.f1551d.delete();
            this.f1556i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1549b, true), d.f1586a));
        } catch (Throwable th) {
            D(bufferedWriter);
            throw th;
        } finally {
        }
    }

    private static void v0(File file, File file2, boolean z3) {
        if (z3) {
            R(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* access modifiers changed from: private */
    public void w0() {
        while (this.f1555h > this.f1553f) {
            u0((String) ((Map.Entry) this.f1557j.entrySet().iterator().next()).getKey());
        }
    }

    public void Q() {
        close();
        d.b(this.f1548a);
    }

    public c b0(String str) {
        return e0(str, -1);
    }

    public synchronized void close() {
        try {
            if (this.f1556i != null) {
                Iterator it = new ArrayList(this.f1557j.values()).iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar.f1572f != null) {
                        dVar.f1572f.a();
                    }
                }
                w0();
                D(this.f1556i);
                this.f1556i = null;
            }
        } finally {
            while (true) {
            }
        }
    }

    public synchronized e j0(String str) {
        A();
        d dVar = (d) this.f1557j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f1571e) {
            return null;
        }
        for (File exists : dVar.f1569c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f1558k++;
        this.f1556i.append("READ");
        this.f1556i.append(' ');
        this.f1556i.append(str);
        this.f1556i.append(10);
        if (o0()) {
            this.f1560m.submit(this.f1561n);
        }
        return new e(this, str, dVar.f1573g, dVar.f1569c, dVar.f1568b, (a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean u0(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.A()     // Catch:{ all -> 0x0043 }
            java.util.LinkedHashMap r0 = r7.f1557j     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0043 }
            V0.b$d r0 = (V0.b.d) r0     // Catch:{ all -> 0x0043 }
            r1 = 0
            if (r0 == 0) goto L_0x008f
            V0.b$c r2 = r0.f1572f     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x0017
            goto L_0x008f
        L_0x0017:
            int r2 = r7.f1554g     // Catch:{ all -> 0x0043 }
            if (r1 >= r2) goto L_0x005b
            java.io.File r2 = r0.j(r1)     // Catch:{ all -> 0x0043 }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x0045
            boolean r3 = r2.delete()     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x002c
            goto L_0x0045
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0043 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0043 }
            r0.<init>()     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x0043 }
            r0.append(r2)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0043 }
            r8.<init>(r0)     // Catch:{ all -> 0x0043 }
            throw r8     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r8 = move-exception
            goto L_0x0091
        L_0x0045:
            long r2 = r7.f1555h     // Catch:{ all -> 0x0043 }
            long[] r4 = r0.f1568b     // Catch:{ all -> 0x0043 }
            r5 = r4[r1]     // Catch:{ all -> 0x0043 }
            long r2 = r2 - r5
            r7.f1555h = r2     // Catch:{ all -> 0x0043 }
            long[] r2 = r0.f1568b     // Catch:{ all -> 0x0043 }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x0043 }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x005b:
            int r0 = r7.f1558k     // Catch:{ all -> 0x0043 }
            r1 = 1
            int r0 = r0 + r1
            r7.f1558k = r0     // Catch:{ all -> 0x0043 }
            java.io.Writer r0 = r7.f1556i     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x0043 }
            java.io.Writer r0 = r7.f1556i     // Catch:{ all -> 0x0043 }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x0043 }
            java.io.Writer r0 = r7.f1556i     // Catch:{ all -> 0x0043 }
            r0.append(r8)     // Catch:{ all -> 0x0043 }
            java.io.Writer r0 = r7.f1556i     // Catch:{ all -> 0x0043 }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x0043 }
            java.util.LinkedHashMap r0 = r7.f1557j     // Catch:{ all -> 0x0043 }
            r0.remove(r8)     // Catch:{ all -> 0x0043 }
            boolean r8 = r7.o0()     // Catch:{ all -> 0x0043 }
            if (r8 == 0) goto L_0x008d
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f1560m     // Catch:{ all -> 0x0043 }
            java.util.concurrent.Callable r0 = r7.f1561n     // Catch:{ all -> 0x0043 }
            r8.submit(r0)     // Catch:{ all -> 0x0043 }
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            monitor-exit(r7)
            return r1
        L_0x0091:
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.b.u0(java.lang.String):boolean");
    }
}
