package Y1;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2014a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private a f2015b;

    /* renamed from: c  reason: collision with root package name */
    private List f2016c;

    private static class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private final j f2017a;

        /* renamed from: b  reason: collision with root package name */
        private final List f2018b = new ArrayList();

        a(j jVar) {
            this.f2017a = jVar;
        }

        public void a(EventListener[] eventListenerArr) {
            synchronized (this) {
                this.f2018b.add(eventListenerArr);
                notify();
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:0|0|(3:10|11|(2:13|14)(1:21))|19) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:19:0x0000, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
            L_0x0000:
                monitor-enter(r4)     // Catch:{ InterruptedException -> 0x0000 }
            L_0x0001:
                java.util.List r0 = r4.f2018b     // Catch:{ all -> 0x000d }
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x000d }
                if (r0 == 0) goto L_0x000f
                r4.wait()     // Catch:{ all -> 0x000d }
                goto L_0x0001
            L_0x000d:
                r0 = move-exception
                goto L_0x0026
            L_0x000f:
                java.util.List r0 = r4.f2018b     // Catch:{ all -> 0x000d }
                r1 = 0
                java.lang.Object r0 = r0.remove(r1)     // Catch:{ all -> 0x000d }
                java.util.EventListener[] r0 = (java.util.EventListener[]) r0     // Catch:{ all -> 0x000d }
                monitor-exit(r4)     // Catch:{ all -> 0x000d }
            L_0x0019:
                int r2 = r0.length     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 >= r2) goto L_0x0000
                Y1.j r2 = r4.f2017a     // Catch:{ InterruptedException -> 0x0000 }
                r3 = r0[r1]     // Catch:{ InterruptedException -> 0x0000 }
                r2.b(r3)     // Catch:{ InterruptedException -> 0x0000 }
                int r1 = r1 + 1
                goto L_0x0019
            L_0x0026:
                monitor-exit(r4)     // Catch:{ all -> 0x000d }
                throw r0     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: Y1.j.a.run():void");
        }
    }

    public void a() {
        synchronized (this.f2014a) {
            try {
                if (this.f2016c != null) {
                    if (this.f2015b == null) {
                        a aVar = new a(this);
                        this.f2015b = aVar;
                        aVar.setDaemon(true);
                        this.f2015b.start();
                    }
                    a aVar2 = this.f2015b;
                    List list = this.f2016c;
                    aVar2.a((EventListener[]) list.toArray(new EventListener[list.size()]));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b(EventListener eventListener);
}
