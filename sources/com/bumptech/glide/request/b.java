package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;

public final class b implements RequestCoordinator, c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f11294a;

    /* renamed from: b  reason: collision with root package name */
    private final RequestCoordinator f11295b;

    /* renamed from: c  reason: collision with root package name */
    private volatile c f11296c;

    /* renamed from: d  reason: collision with root package name */
    private volatile c f11297d;

    /* renamed from: e  reason: collision with root package name */
    private RequestCoordinator.RequestState f11298e;

    /* renamed from: f  reason: collision with root package name */
    private RequestCoordinator.RequestState f11299f;

    public b(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f11298e = requestState;
        this.f11299f = requestState;
        this.f11294a = obj;
        this.f11295b = requestCoordinator;
    }

    private boolean m(c cVar) {
        RequestCoordinator.RequestState requestState;
        RequestCoordinator.RequestState requestState2 = this.f11298e;
        RequestCoordinator.RequestState requestState3 = RequestCoordinator.RequestState.FAILED;
        if (requestState2 != requestState3) {
            return cVar.equals(this.f11296c);
        }
        if (!cVar.equals(this.f11297d) || ((requestState = this.f11299f) != RequestCoordinator.RequestState.SUCCESS && requestState != requestState3)) {
            return false;
        }
        return true;
    }

    private boolean n() {
        RequestCoordinator requestCoordinator = this.f11295b;
        if (requestCoordinator == null || requestCoordinator.l(this)) {
            return true;
        }
        return false;
    }

    private boolean o() {
        RequestCoordinator requestCoordinator = this.f11295b;
        if (requestCoordinator == null || requestCoordinator.c(this)) {
            return true;
        }
        return false;
    }

    private boolean p() {
        RequestCoordinator requestCoordinator = this.f11295b;
        if (requestCoordinator == null || requestCoordinator.f(this)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.bumptech.glide.request.c r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f11294a
            monitor-enter(r0)
            com.bumptech.glide.request.c r1 = r2.f11297d     // Catch:{ all -> 0x001d }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001d }
            if (r3 != 0) goto L_0x0021
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x001d }
            r2.f11298e = r3     // Catch:{ all -> 0x001d }
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.f11299f     // Catch:{ all -> 0x001d }
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch:{ all -> 0x001d }
            if (r3 == r1) goto L_0x001f
            r2.f11299f = r1     // Catch:{ all -> 0x001d }
            com.bumptech.glide.request.c r3 = r2.f11297d     // Catch:{ all -> 0x001d }
            r3.i()     // Catch:{ all -> 0x001d }
            goto L_0x001f
        L_0x001d:
            r3 = move-exception
            goto L_0x002e
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x0021:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x001d }
            r2.f11299f = r3     // Catch:{ all -> 0x001d }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f11295b     // Catch:{ all -> 0x001d }
            if (r3 == 0) goto L_0x002c
            r3.a(r2)     // Catch:{ all -> 0x001d }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.b.a(com.bumptech.glide.request.c):void");
    }

    public boolean b() {
        boolean z3;
        synchronized (this.f11294a) {
            try {
                if (!this.f11296c.b()) {
                    if (!this.f11297d.b()) {
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
        synchronized (this.f11294a) {
            try {
                if (!o() || !m(cVar)) {
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
        synchronized (this.f11294a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.f11298e = requestState;
                this.f11296c.clear();
                if (this.f11299f != requestState) {
                    this.f11299f = requestState;
                    this.f11297d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        if (!this.f11296c.d(bVar.f11296c) || !this.f11297d.d(bVar.f11297d)) {
            return false;
        }
        return true;
    }

    public boolean e() {
        boolean z3;
        synchronized (this.f11294a) {
            try {
                RequestCoordinator.RequestState requestState = this.f11298e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                if (requestState == requestState2 && this.f11299f == requestState2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public boolean f(c cVar) {
        boolean p4;
        synchronized (this.f11294a) {
            p4 = p();
        }
        return p4;
    }

    public RequestCoordinator g() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f11294a) {
            try {
                RequestCoordinator requestCoordinator2 = this.f11295b;
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
        synchronized (this.f11294a) {
            try {
                RequestCoordinator.RequestState requestState = this.f11298e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.f11298e = RequestCoordinator.RequestState.PAUSED;
                    this.f11296c.h();
                }
                if (this.f11299f == requestState2) {
                    this.f11299f = RequestCoordinator.RequestState.PAUSED;
                    this.f11297d.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i() {
        synchronized (this.f11294a) {
            try {
                RequestCoordinator.RequestState requestState = this.f11298e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f11298e = requestState2;
                    this.f11296c.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isRunning() {
        boolean z3;
        synchronized (this.f11294a) {
            try {
                RequestCoordinator.RequestState requestState = this.f11298e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    if (this.f11299f != requestState2) {
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

    public void j(c cVar) {
        synchronized (this.f11294a) {
            try {
                if (cVar.equals(this.f11296c)) {
                    this.f11298e = RequestCoordinator.RequestState.SUCCESS;
                } else if (cVar.equals(this.f11297d)) {
                    this.f11299f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.f11295b;
                if (requestCoordinator != null) {
                    requestCoordinator.j(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean k() {
        boolean z3;
        synchronized (this.f11294a) {
            try {
                RequestCoordinator.RequestState requestState = this.f11298e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                if (requestState != requestState2) {
                    if (this.f11299f != requestState2) {
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

    public boolean l(c cVar) {
        boolean z3;
        synchronized (this.f11294a) {
            try {
                if (!n() || !cVar.equals(this.f11296c)) {
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

    public void q(c cVar, c cVar2) {
        this.f11296c = cVar;
        this.f11297d = cVar2;
    }
}
