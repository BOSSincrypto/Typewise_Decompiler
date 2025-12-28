package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;

public class g implements RequestCoordinator, c {

    /* renamed from: a  reason: collision with root package name */
    private final RequestCoordinator f11300a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f11301b;

    /* renamed from: c  reason: collision with root package name */
    private volatile c f11302c;

    /* renamed from: d  reason: collision with root package name */
    private volatile c f11303d;

    /* renamed from: e  reason: collision with root package name */
    private RequestCoordinator.RequestState f11304e;

    /* renamed from: f  reason: collision with root package name */
    private RequestCoordinator.RequestState f11305f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11306g;

    public g(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f11304e = requestState;
        this.f11305f = requestState;
        this.f11301b = obj;
        this.f11300a = requestCoordinator;
    }

    private boolean m() {
        RequestCoordinator requestCoordinator = this.f11300a;
        if (requestCoordinator == null || requestCoordinator.l(this)) {
            return true;
        }
        return false;
    }

    private boolean n() {
        RequestCoordinator requestCoordinator = this.f11300a;
        if (requestCoordinator == null || requestCoordinator.c(this)) {
            return true;
        }
        return false;
    }

    private boolean o() {
        RequestCoordinator requestCoordinator = this.f11300a;
        if (requestCoordinator == null || requestCoordinator.f(this)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.bumptech.glide.request.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f11301b
            monitor-enter(r0)
            com.bumptech.glide.request.c r1 = r2.f11302c     // Catch:{ all -> 0x0011 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0011 }
            if (r3 != 0) goto L_0x0013
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x0011 }
            r2.f11305f = r3     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r3 = move-exception
            goto L_0x0020
        L_0x0013:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x0011 }
            r2.f11304e = r3     // Catch:{ all -> 0x0011 }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f11300a     // Catch:{ all -> 0x0011 }
            if (r3 == 0) goto L_0x001e
            r3.a(r2)     // Catch:{ all -> 0x0011 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.g.a(com.bumptech.glide.request.c):void");
    }

    public boolean b() {
        boolean z3;
        synchronized (this.f11301b) {
            try {
                if (!this.f11303d.b()) {
                    if (!this.f11302c.b()) {
                        z3 = false;
                    }
                }
                z3 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public boolean c(c cVar) {
        boolean z3;
        synchronized (this.f11301b) {
            try {
                if (!n() || !cVar.equals(this.f11302c) || b()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public void clear() {
        synchronized (this.f11301b) {
            this.f11306g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f11304e = requestState;
            this.f11305f = requestState;
            this.f11303d.clear();
            this.f11302c.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(com.bumptech.glide.request.c r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.request.g
            r1 = 0
            if (r0 == 0) goto L_0x002e
            com.bumptech.glide.request.g r4 = (com.bumptech.glide.request.g) r4
            com.bumptech.glide.request.c r0 = r3.f11302c
            if (r0 != 0) goto L_0x0010
            com.bumptech.glide.request.c r0 = r4.f11302c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            com.bumptech.glide.request.c r0 = r3.f11302c
            com.bumptech.glide.request.c r2 = r4.f11302c
            boolean r0 = r0.d(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            com.bumptech.glide.request.c r0 = r3.f11303d
            if (r0 != 0) goto L_0x0023
            com.bumptech.glide.request.c r4 = r4.f11303d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            com.bumptech.glide.request.c r0 = r3.f11303d
            com.bumptech.glide.request.c r4 = r4.f11303d
            boolean r4 = r0.d(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.g.d(com.bumptech.glide.request.c):boolean");
    }

    public boolean e() {
        boolean z3;
        synchronized (this.f11301b) {
            if (this.f11304e == RequestCoordinator.RequestState.CLEARED) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public boolean f(c cVar) {
        boolean z3;
        synchronized (this.f11301b) {
            try {
                if (o()) {
                    if (!cVar.equals(this.f11302c)) {
                        if (this.f11304e != RequestCoordinator.RequestState.SUCCESS) {
                        }
                    }
                    z3 = true;
                }
                z3 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public RequestCoordinator g() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f11301b) {
            try {
                RequestCoordinator requestCoordinator2 = this.f11300a;
                if (requestCoordinator2 != null) {
                    requestCoordinator = requestCoordinator2.g();
                } else {
                    requestCoordinator = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return requestCoordinator;
    }

    public void h() {
        synchronized (this.f11301b) {
            try {
                if (!this.f11305f.isComplete()) {
                    this.f11305f = RequestCoordinator.RequestState.PAUSED;
                    this.f11303d.h();
                }
                if (!this.f11304e.isComplete()) {
                    this.f11304e = RequestCoordinator.RequestState.PAUSED;
                    this.f11302c.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i() {
        RequestCoordinator.RequestState requestState;
        RequestCoordinator.RequestState requestState2;
        synchronized (this.f11301b) {
            try {
                this.f11306g = true;
                if (!(this.f11304e == RequestCoordinator.RequestState.SUCCESS || this.f11305f == (requestState2 = RequestCoordinator.RequestState.RUNNING))) {
                    this.f11305f = requestState2;
                    this.f11303d.i();
                }
                if (this.f11306g && this.f11304e != (requestState = RequestCoordinator.RequestState.RUNNING)) {
                    this.f11304e = requestState;
                    this.f11302c.i();
                }
                this.f11306g = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isRunning() {
        boolean z3;
        synchronized (this.f11301b) {
            if (this.f11304e == RequestCoordinator.RequestState.RUNNING) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(com.bumptech.glide.request.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f11301b
            monitor-enter(r0)
            com.bumptech.glide.request.c r1 = r2.f11303d     // Catch:{ all -> 0x0011 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0011 }
            if (r3 == 0) goto L_0x0013
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch:{ all -> 0x0011 }
            r2.f11305f = r3     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r3 = move-exception
            goto L_0x002d
        L_0x0013:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch:{ all -> 0x0011 }
            r2.f11304e = r3     // Catch:{ all -> 0x0011 }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f11300a     // Catch:{ all -> 0x0011 }
            if (r3 == 0) goto L_0x001e
            r3.j(r2)     // Catch:{ all -> 0x0011 }
        L_0x001e:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.f11305f     // Catch:{ all -> 0x0011 }
            boolean r3 = r3.isComplete()     // Catch:{ all -> 0x0011 }
            if (r3 != 0) goto L_0x002b
            com.bumptech.glide.request.c r3 = r2.f11303d     // Catch:{ all -> 0x0011 }
            r3.clear()     // Catch:{ all -> 0x0011 }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.g.j(com.bumptech.glide.request.c):void");
    }

    public boolean k() {
        boolean z3;
        synchronized (this.f11301b) {
            if (this.f11304e == RequestCoordinator.RequestState.SUCCESS) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public boolean l(c cVar) {
        boolean z3;
        synchronized (this.f11301b) {
            try {
                if (!m() || !cVar.equals(this.f11302c) || this.f11304e == RequestCoordinator.RequestState.PAUSED) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public void p(c cVar, c cVar2) {
        this.f11302c = cVar;
        this.f11303d = cVar2;
    }
}
