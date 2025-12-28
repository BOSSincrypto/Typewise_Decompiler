package Y1;

import androidx.appcompat.app.F;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import java.util.Map;

public abstract class l extends j {

    /* renamed from: j  reason: collision with root package name */
    private static final boolean f2020j = h.a("service");

    /* renamed from: d  reason: collision with root package name */
    protected final String f2021d;

    /* renamed from: e  reason: collision with root package name */
    private final k f2022e = new k();

    /* renamed from: f  reason: collision with root package name */
    private final List f2023f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private int f2024g = 0;

    /* renamed from: h  reason: collision with root package name */
    private Map f2025h;

    /* renamed from: i  reason: collision with root package name */
    private Map f2026i;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final String f2027a;

        /* renamed from: b  reason: collision with root package name */
        final Object f2028b;

        a(String str, Object obj) {
            this.f2027a = str;
            this.f2028b = obj;
        }
    }

    public interface b {
        Object a(c cVar, l lVar);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f2029a;

        public c(String str) {
            this.f2029a = str;
        }

        public abstract String a();

        public abstract String b();

        public abstract String c();

        public abstract boolean d();
    }

    public l(String str) {
        this.f2021d = str;
    }

    /* access modifiers changed from: protected */
    public void b(EventListener eventListener) {
        F.a(eventListener);
        throw null;
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.f2025h = null;
        this.f2026i = null;
    }

    public Object d(c cVar) {
        return e(cVar, (String[]) null);
    }

    public Object e(c cVar, String[] strArr) {
        return f(cVar, strArr, (b) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01a9, code lost:
        r19 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01ab, code lost:
        if (r7 != null) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01ad, code lost:
        r7 = new java.util.ArrayList(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01b4, code lost:
        r7.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01bb, code lost:
        if (r17.d() != false) goto L_0x0271;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(Y1.l.c r17, java.lang.String[] r18, Y1.l.b r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r19
            java.util.List r3 = r1.f2023f
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0013
            java.lang.Object r0 = r16.g(r17, r18)
            return r0
        L_0x0013:
            boolean r3 = f2020j
            if (r3 == 0) goto L_0x003b
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Service: "
            r5.append(r6)
            java.lang.String r6 = r1.f2021d
            r5.append(r6)
            java.lang.String r6 = " key: "
            r5.append(r6)
            java.lang.String r6 = r17.a()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.println(r5)
        L_0x003b:
            if (r0 == 0) goto L_0x027d
            Y1.k r4 = r1.f2022e     // Catch:{ all -> 0x0066 }
            r4.a()     // Catch:{ all -> 0x0066 }
            java.util.Map r4 = r1.f2025h     // Catch:{ all -> 0x0066 }
            if (r4 != 0) goto L_0x006e
            if (r3 == 0) goto L_0x0069
            java.io.PrintStream r3 = java.lang.System.out     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r4.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = "Service "
            r4.append(r5)     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = r1.f2021d     // Catch:{ all -> 0x0066 }
            r4.append(r5)     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = " cache was empty"
            r4.append(r5)     // Catch:{ all -> 0x0066 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0066 }
            r3.println(r4)     // Catch:{ all -> 0x0066 }
            goto L_0x0069
        L_0x0066:
            r0 = move-exception
            goto L_0x0277
        L_0x0069:
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0066 }
            r4.<init>()     // Catch:{ all -> 0x0066 }
        L_0x006e:
            java.util.List r3 = r1.f2023f     // Catch:{ all -> 0x0066 }
            int r3 = r3.size()     // Catch:{ all -> 0x0066 }
            r5 = 1
            r7 = 0
            if (r2 == 0) goto L_0x00ae
            r8 = 0
        L_0x0079:
            if (r8 >= r3) goto L_0x0088
            java.util.List r9 = r1.f2023f     // Catch:{ all -> 0x0066 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x0066 }
            if (r2 != r9) goto L_0x0085
            int r8 = r8 + r5
            goto L_0x0089
        L_0x0085:
            int r8 = r8 + 1
            goto L_0x0079
        L_0x0088:
            r8 = 0
        L_0x0089:
            if (r8 == 0) goto L_0x008f
            r2 = 0
            r9 = 0
        L_0x008d:
            r10 = 0
            goto L_0x00b2
        L_0x008f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r3.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r4 = "Factory "
            r3.append(r4)     // Catch:{ all -> 0x0066 }
            r3.append(r2)     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "not registered with service: "
            r3.append(r2)     // Catch:{ all -> 0x0066 }
            r3.append(r1)     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0066 }
            r0.<init>(r2)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x00ae:
            r9 = r5
            r2 = 0
            r8 = 0
            goto L_0x008d
        L_0x00b2:
            java.lang.String r11 = r17.b()     // Catch:{ all -> 0x0066 }
            boolean r12 = f2020j     // Catch:{ all -> 0x0066 }
            if (r12 == 0) goto L_0x00e0
            java.io.PrintStream r13 = java.lang.System.out     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r14.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r15 = r1.f2021d     // Catch:{ all -> 0x0066 }
            r14.append(r15)     // Catch:{ all -> 0x0066 }
            java.lang.String r15 = "["
            r14.append(r15)     // Catch:{ all -> 0x0066 }
            int r15 = r2 + 1
            r14.append(r2)     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "] looking for: "
            r14.append(r2)     // Catch:{ all -> 0x0066 }
            r14.append(r11)     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = r14.toString()     // Catch:{ all -> 0x0066 }
            r13.println(r2)     // Catch:{ all -> 0x0066 }
            r2 = r15
        L_0x00e0:
            java.lang.Object r13 = r4.get(r11)     // Catch:{ all -> 0x0066 }
            Y1.l$a r13 = (Y1.l.a) r13     // Catch:{ all -> 0x0066 }
            if (r13 == 0) goto L_0x0108
            if (r12 == 0) goto L_0x0105
            java.io.PrintStream r2 = java.lang.System.out     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r3.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r8 = r1.f2021d     // Catch:{ all -> 0x0066 }
            r3.append(r8)     // Catch:{ all -> 0x0066 }
            java.lang.String r8 = " found with descriptor: "
            r3.append(r8)     // Catch:{ all -> 0x0066 }
            r3.append(r11)     // Catch:{ all -> 0x0066 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0066 }
            r2.println(r3)     // Catch:{ all -> 0x0066 }
        L_0x0105:
            r9 = r10
            goto L_0x01bd
        L_0x0108:
            if (r12 == 0) goto L_0x0125
            java.io.PrintStream r10 = java.lang.System.out     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r12.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r14 = "did not find: "
            r12.append(r14)     // Catch:{ all -> 0x0066 }
            r12.append(r11)     // Catch:{ all -> 0x0066 }
            java.lang.String r14 = " in cache"
            r12.append(r14)     // Catch:{ all -> 0x0066 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0066 }
            r10.println(r12)     // Catch:{ all -> 0x0066 }
        L_0x0125:
            r10 = r8
        L_0x0126:
            if (r10 >= r3) goto L_0x01a9
            java.util.List r12 = r1.f2023f     // Catch:{ all -> 0x0066 }
            int r14 = r10 + 1
            java.lang.Object r12 = r12.get(r10)     // Catch:{ all -> 0x0066 }
            Y1.l$b r12 = (Y1.l.b) r12     // Catch:{ all -> 0x0066 }
            boolean r15 = f2020j     // Catch:{ all -> 0x0066 }
            if (r15 == 0) goto L_0x015b
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r5.<init>()     // Catch:{ all -> 0x0066 }
            r19 = r2
            java.lang.String r2 = "trying factory["
            r5.append(r2)     // Catch:{ all -> 0x0066 }
            r5.append(r10)     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "] "
            r5.append(r2)     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = r12.toString()     // Catch:{ all -> 0x0066 }
            r5.append(r2)     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0066 }
            r6.println(r2)     // Catch:{ all -> 0x0066 }
            goto L_0x015d
        L_0x015b:
            r19 = r2
        L_0x015d:
            java.lang.Object r2 = r12.a(r0, r1)     // Catch:{ all -> 0x0066 }
            if (r2 == 0) goto L_0x018b
            Y1.l$a r13 = new Y1.l$a     // Catch:{ all -> 0x0066 }
            r13.<init>(r11, r2)     // Catch:{ all -> 0x0066 }
            if (r15 == 0) goto L_0x01bd
            java.io.PrintStream r2 = java.lang.System.out     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r3.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = r1.f2021d     // Catch:{ all -> 0x0066 }
            r3.append(r5)     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = " factory supported: "
            r3.append(r5)     // Catch:{ all -> 0x0066 }
            r3.append(r11)     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = ", caching"
            r3.append(r5)     // Catch:{ all -> 0x0066 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0066 }
            r2.println(r3)     // Catch:{ all -> 0x0066 }
            goto L_0x01bd
        L_0x018b:
            if (r15 == 0) goto L_0x01a3
            java.io.PrintStream r2 = java.lang.System.out     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r5.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r6 = "factory did not support: "
            r5.append(r6)     // Catch:{ all -> 0x0066 }
            r5.append(r11)     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0066 }
            r2.println(r5)     // Catch:{ all -> 0x0066 }
        L_0x01a3:
            r2 = r19
            r10 = r14
            r5 = 1
            goto L_0x0126
        L_0x01a9:
            r19 = r2
            if (r7 != 0) goto L_0x01b4
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0066 }
            r5 = 5
            r2.<init>(r5)     // Catch:{ all -> 0x0066 }
            r7 = r2
        L_0x01b4:
            r7.add(r11)     // Catch:{ all -> 0x0066 }
            boolean r2 = r17.d()     // Catch:{ all -> 0x0066 }
            if (r2 != 0) goto L_0x0271
        L_0x01bd:
            if (r13 == 0) goto L_0x026b
            if (r9 == 0) goto L_0x022b
            boolean r0 = f2020j     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "'"
            if (r0 == 0) goto L_0x01e2
            java.io.PrintStream r0 = java.lang.System.out     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r3.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = "caching '"
            r3.append(r5)     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = r13.f2027a     // Catch:{ all -> 0x0066 }
            r3.append(r5)     // Catch:{ all -> 0x0066 }
            r3.append(r2)     // Catch:{ all -> 0x0066 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0066 }
            r0.println(r3)     // Catch:{ all -> 0x0066 }
        L_0x01e2:
            java.lang.String r0 = r13.f2027a     // Catch:{ all -> 0x0066 }
            r4.put(r0, r13)     // Catch:{ all -> 0x0066 }
            if (r7 == 0) goto L_0x0229
            java.util.Iterator r0 = r7.iterator()     // Catch:{ all -> 0x0066 }
        L_0x01ed:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0066 }
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0066 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0066 }
            boolean r5 = f2020j     // Catch:{ all -> 0x0066 }
            if (r5 == 0) goto L_0x0225
            java.io.PrintStream r5 = java.lang.System.out     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r6.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r7 = r1.f2021d     // Catch:{ all -> 0x0066 }
            r6.append(r7)     // Catch:{ all -> 0x0066 }
            java.lang.String r7 = " adding descriptor: '"
            r6.append(r7)     // Catch:{ all -> 0x0066 }
            r6.append(r3)     // Catch:{ all -> 0x0066 }
            java.lang.String r7 = "' for actual: '"
            r6.append(r7)     // Catch:{ all -> 0x0066 }
            java.lang.String r7 = r13.f2027a     // Catch:{ all -> 0x0066 }
            r6.append(r7)     // Catch:{ all -> 0x0066 }
            r6.append(r2)     // Catch:{ all -> 0x0066 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0066 }
            r5.println(r6)     // Catch:{ all -> 0x0066 }
        L_0x0225:
            r4.put(r3, r13)     // Catch:{ all -> 0x0066 }
            goto L_0x01ed
        L_0x0229:
            r1.f2025h = r4     // Catch:{ all -> 0x0066 }
        L_0x022b:
            if (r18 == 0) goto L_0x0247
            java.lang.String r0 = r13.f2027a     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "/"
            int r0 = r0.indexOf(r2)     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0242
            java.lang.String r0 = r13.f2027a     // Catch:{ all -> 0x0066 }
            r2 = 1
            java.lang.String r0 = r0.substring(r2)     // Catch:{ all -> 0x0066 }
            r5 = 0
            r18[r5] = r0     // Catch:{ all -> 0x0066 }
            goto L_0x0247
        L_0x0242:
            r5 = 0
            java.lang.String r0 = r13.f2027a     // Catch:{ all -> 0x0066 }
            r18[r5] = r0     // Catch:{ all -> 0x0066 }
        L_0x0247:
            boolean r0 = f2020j     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0263
            java.io.PrintStream r0 = java.lang.System.out     // Catch:{ all -> 0x0066 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0066 }
            r2.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r3 = "found in service: "
            r2.append(r3)     // Catch:{ all -> 0x0066 }
            java.lang.String r3 = r1.f2021d     // Catch:{ all -> 0x0066 }
            r2.append(r3)     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0066 }
            r0.println(r2)     // Catch:{ all -> 0x0066 }
        L_0x0263:
            java.lang.Object r0 = r13.f2028b     // Catch:{ all -> 0x0066 }
            Y1.k r2 = r1.f2022e
            r2.c()
            return r0
        L_0x026b:
            Y1.k r2 = r1.f2022e
            r2.c()
            goto L_0x027d
        L_0x0271:
            r2 = r19
            r10 = r9
            r5 = 1
            goto L_0x00b2
        L_0x0277:
            Y1.k r2 = r1.f2022e
            r2.c()
            throw r0
        L_0x027d:
            boolean r2 = f2020j
            if (r2 == 0) goto L_0x0299
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "not found in service: "
            r3.append(r4)
            java.lang.String r4 = r1.f2021d
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.println(r3)
        L_0x0299:
            java.lang.Object r0 = r16.g(r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.l.f(Y1.l$c, java.lang.String[], Y1.l$b):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public Object g(c cVar, String[] strArr) {
        return null;
    }

    public boolean h() {
        if (this.f2023f.size() == this.f2024g) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void i() {
        this.f2024g = this.f2023f.size();
    }

    /* JADX INFO: finally extract failed */
    public final b j(b bVar) {
        bVar.getClass();
        try {
            this.f2022e.b();
            this.f2023f.add(0, bVar);
            c();
            this.f2022e.d();
            a();
            return bVar;
        } catch (Throwable th) {
            this.f2022e.d();
            throw th;
        }
    }

    public String toString() {
        return super.toString() + "{" + this.f2021d + "}";
    }
}
