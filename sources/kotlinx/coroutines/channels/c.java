package kotlinx.coroutines.channels;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.internal.y;
import l2.q;
import u2.l;

public class c extends AbstractChannel {

    /* renamed from: d  reason: collision with root package name */
    private final int f14056d;

    /* renamed from: e  reason: collision with root package name */
    private final BufferOverflow f14057e;

    /* renamed from: f  reason: collision with root package name */
    private final ReentrantLock f14058f;

    /* renamed from: g  reason: collision with root package name */
    private Object[] f14059g;

    /* renamed from: h  reason: collision with root package name */
    private int f14060h;
    private volatile /* synthetic */ int size;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14061a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            f14061a = iArr;
        }
    }

    public c(int i4, BufferOverflow bufferOverflow, l lVar) {
        super(lVar);
        this.f14056d = i4;
        this.f14057e = bufferOverflow;
        if (i4 >= 1) {
            this.f14058f = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i4, 8)];
            C0713h.k(objArr, a.f14045a, 0, 0, 6, (Object) null);
            this.f14059g = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i4 + " was specified").toString());
    }

    private final void a0(int i4, Object obj) {
        if (i4 < this.f14056d) {
            b0(i4);
            Object[] objArr = this.f14059g;
            objArr[(this.f14060h + i4) % objArr.length] = obj;
            return;
        }
        Object[] objArr2 = this.f14059g;
        int i5 = this.f14060h;
        objArr2[i5 % objArr2.length] = null;
        objArr2[(i4 + i5) % objArr2.length] = obj;
        this.f14060h = (i5 + 1) % objArr2.length;
    }

    private final void b0(int i4) {
        Object[] objArr = this.f14059g;
        if (i4 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f14056d);
            Object[] objArr2 = new Object[min];
            for (int i5 = 0; i5 < i4; i5++) {
                Object[] objArr3 = this.f14059g;
                objArr2[i5] = objArr3[(this.f14060h + i5) % objArr3.length];
            }
            C0713h.j(objArr2, a.f14045a, i4, min);
            this.f14059g = objArr2;
            this.f14060h = 0;
        }
    }

    private final y c0(int i4) {
        if (i4 < this.f14056d) {
            this.size = i4 + 1;
            return null;
        }
        int i5 = a.f14061a[this.f14057e.ordinal()];
        if (i5 == 1) {
            return a.f14047c;
        }
        if (i5 == 2) {
            return a.f14046b;
        }
        if (i5 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* access modifiers changed from: protected */
    public boolean K(o oVar) {
        ReentrantLock reentrantLock = this.f14058f;
        reentrantLock.lock();
        try {
            return super.K(oVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean M() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean N() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    public boolean O() {
        ReentrantLock reentrantLock = this.f14058f;
        reentrantLock.lock();
        try {
            return super.O();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public void Q(boolean z3) {
        l lVar = this.f14052a;
        ReentrantLock reentrantLock = this.f14058f;
        reentrantLock.lock();
        try {
            int i4 = this.size;
            UndeliveredElementException undeliveredElementException = null;
            for (int i5 = 0; i5 < i4; i5++) {
                Object obj = this.f14059g[this.f14060h];
                if (!(lVar == null || obj == a.f14045a)) {
                    undeliveredElementException = OnUndeliveredElementKt.c(lVar, obj, undeliveredElementException);
                }
                Object[] objArr = this.f14059g;
                int i6 = this.f14060h;
                objArr[i6] = a.f14045a;
                this.f14060h = (i6 + 1) % objArr.length;
            }
            this.size = 0;
            q qVar = q.f14567a;
            reentrantLock.unlock();
            super.Q(z3);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public Object U() {
        ReentrantLock reentrantLock = this.f14058f;
        reentrantLock.lock();
        try {
            int i4 = this.size;
            if (i4 == 0) {
                Object j4 = j();
                if (j4 == null) {
                    j4 = a.f14048d;
                }
                return j4;
            }
            Object[] objArr = this.f14059g;
            int i5 = this.f14060h;
            Object obj = objArr[i5];
            s sVar = null;
            objArr[i5] = null;
            this.size = i4 - 1;
            Object obj2 = a.f14048d;
            boolean z3 = false;
            if (i4 == this.f14056d) {
                s sVar2 = null;
                while (true) {
                    s D3 = D();
                    if (D3 == null) {
                        sVar = sVar2;
                        break;
                    }
                    o.b(D3);
                    if (D3.U((LockFreeLinkedListNode.c) null) != null) {
                        obj2 = D3.S();
                        z3 = true;
                        sVar = D3;
                        break;
                    }
                    D3.V();
                    sVar2 = D3;
                }
            }
            if (obj2 != a.f14048d && !(obj2 instanceof j)) {
                this.size = i4;
                Object[] objArr2 = this.f14059g;
                objArr2[(this.f14060h + i4) % objArr2.length] = obj2;
            }
            this.f14060h = (this.f14060h + 1) % this.f14059g.length;
            q qVar = q.f14567a;
            reentrantLock.unlock();
            if (z3) {
                o.b(sVar);
                sVar.R();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 != kotlinx.coroutines.selects.e.d()) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        r8.size = r2;
        r8.f14059g[r8.f14060h] = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        r1.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        if ((r7 instanceof kotlinx.coroutines.channels.j) == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        r4 = true;
        r3 = r7;
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        throw new java.lang.IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + r7).toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d A[Catch:{ all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0099 A[Catch:{ all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object V(kotlinx.coroutines.selects.d r9) {
        /*
            r8 = this;
            r0 = 1
            java.util.concurrent.locks.ReentrantLock r1 = r8.f14058f
            r1.lock()
            int r2 = r8.size     // Catch:{ all -> 0x0013 }
            if (r2 != 0) goto L_0x001a
            kotlinx.coroutines.channels.j r9 = r8.j()     // Catch:{ all -> 0x0013 }
            if (r9 != 0) goto L_0x0016
            kotlinx.coroutines.internal.y r9 = kotlinx.coroutines.channels.a.f14048d     // Catch:{ all -> 0x0013 }
            goto L_0x0016
        L_0x0013:
            r9 = move-exception
            goto L_0x00c8
        L_0x0016:
            r1.unlock()
            return r9
        L_0x001a:
            java.lang.Object[] r3 = r8.f14059g     // Catch:{ all -> 0x0013 }
            int r4 = r8.f14060h     // Catch:{ all -> 0x0013 }
            r5 = r3[r4]     // Catch:{ all -> 0x0013 }
            r6 = 0
            r3[r4] = r6     // Catch:{ all -> 0x0013 }
            int r3 = r2 + -1
            r8.size = r3     // Catch:{ all -> 0x0013 }
            kotlinx.coroutines.internal.y r3 = kotlinx.coroutines.channels.a.f14048d     // Catch:{ all -> 0x0013 }
            int r4 = r8.f14056d     // Catch:{ all -> 0x0013 }
            if (r2 != r4) goto L_0x0084
        L_0x002d:
            kotlinx.coroutines.channels.AbstractChannel$e r4 = r8.I()     // Catch:{ all -> 0x0013 }
            java.lang.Object r7 = r9.m(r4)     // Catch:{ all -> 0x0013 }
            if (r7 != 0) goto L_0x0047
            java.lang.Object r6 = r4.o()     // Catch:{ all -> 0x0013 }
            kotlin.jvm.internal.o.b(r6)     // Catch:{ all -> 0x0013 }
            r3 = r6
            kotlinx.coroutines.channels.s r3 = (kotlinx.coroutines.channels.s) r3     // Catch:{ all -> 0x0013 }
            java.lang.Object r3 = r3.S()     // Catch:{ all -> 0x0013 }
            r4 = r0
            goto L_0x0085
        L_0x0047:
            kotlinx.coroutines.internal.y r4 = kotlinx.coroutines.channels.a.f14048d     // Catch:{ all -> 0x0013 }
            if (r7 == r4) goto L_0x0084
            java.lang.Object r4 = kotlinx.coroutines.internal.C0743c.f14168b     // Catch:{ all -> 0x0013 }
            if (r7 == r4) goto L_0x002d
            java.lang.Object r3 = kotlinx.coroutines.selects.e.d()     // Catch:{ all -> 0x0013 }
            if (r7 != r3) goto L_0x0061
            r8.size = r2     // Catch:{ all -> 0x0013 }
            java.lang.Object[] r9 = r8.f14059g     // Catch:{ all -> 0x0013 }
            int r0 = r8.f14060h     // Catch:{ all -> 0x0013 }
            r9[r0] = r5     // Catch:{ all -> 0x0013 }
            r1.unlock()
            return r7
        L_0x0061:
            boolean r3 = r7 instanceof kotlinx.coroutines.channels.j     // Catch:{ all -> 0x0013 }
            if (r3 == 0) goto L_0x0069
            r4 = r0
            r3 = r7
            r6 = r3
            goto L_0x0085
        L_0x0069:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0013 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0013 }
            r0.<init>()     // Catch:{ all -> 0x0013 }
            java.lang.String r2 = "performAtomicTrySelect(describeTryOffer) returned "
            r0.append(r2)     // Catch:{ all -> 0x0013 }
            r0.append(r7)     // Catch:{ all -> 0x0013 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0013 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0013 }
            r9.<init>(r0)     // Catch:{ all -> 0x0013 }
            throw r9     // Catch:{ all -> 0x0013 }
        L_0x0084:
            r4 = 0
        L_0x0085:
            kotlinx.coroutines.internal.y r7 = kotlinx.coroutines.channels.a.f14048d     // Catch:{ all -> 0x0013 }
            if (r3 == r7) goto L_0x0099
            boolean r7 = r3 instanceof kotlinx.coroutines.channels.j     // Catch:{ all -> 0x0013 }
            if (r7 != 0) goto L_0x0099
            r8.size = r2     // Catch:{ all -> 0x0013 }
            java.lang.Object[] r9 = r8.f14059g     // Catch:{ all -> 0x0013 }
            int r7 = r8.f14060h     // Catch:{ all -> 0x0013 }
            int r7 = r7 + r2
            int r2 = r9.length     // Catch:{ all -> 0x0013 }
            int r7 = r7 % r2
            r9[r7] = r3     // Catch:{ all -> 0x0013 }
            goto L_0x00af
        L_0x0099:
            boolean r9 = r9.q()     // Catch:{ all -> 0x0013 }
            if (r9 != 0) goto L_0x00af
            r8.size = r2     // Catch:{ all -> 0x0013 }
            java.lang.Object[] r9 = r8.f14059g     // Catch:{ all -> 0x0013 }
            int r0 = r8.f14060h     // Catch:{ all -> 0x0013 }
            r9[r0] = r5     // Catch:{ all -> 0x0013 }
            java.lang.Object r9 = kotlinx.coroutines.selects.e.d()     // Catch:{ all -> 0x0013 }
            r1.unlock()
            return r9
        L_0x00af:
            int r9 = r8.f14060h     // Catch:{ all -> 0x0013 }
            int r9 = r9 + r0
            java.lang.Object[] r0 = r8.f14059g     // Catch:{ all -> 0x0013 }
            int r0 = r0.length     // Catch:{ all -> 0x0013 }
            int r9 = r9 % r0
            r8.f14060h = r9     // Catch:{ all -> 0x0013 }
            l2.q r9 = l2.q.f14567a     // Catch:{ all -> 0x0013 }
            r1.unlock()
            if (r4 == 0) goto L_0x00c7
            kotlin.jvm.internal.o.b(r6)
            kotlinx.coroutines.channels.s r6 = (kotlinx.coroutines.channels.s) r6
            r6.R()
        L_0x00c7:
            return r5
        L_0x00c8:
            r1.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.c.V(kotlinx.coroutines.selects.d):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public Object f(s sVar) {
        ReentrantLock reentrantLock = this.f14058f;
        reentrantLock.lock();
        try {
            return super.f(sVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public String g() {
        return "(buffer:capacity=" + this.f14056d + ",size=" + this.size + ')';
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        if (this.size == this.f14056d && this.f14057e == BufferOverflow.SUSPEND) {
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public Object y(Object obj) {
        q C3;
        ReentrantLock reentrantLock = this.f14058f;
        reentrantLock.lock();
        int i4 = this.size;
        j j4 = j();
        if (j4 != null) {
            reentrantLock.unlock();
            return j4;
        }
        y c02 = c0(i4);
        if (c02 != null) {
            reentrantLock.unlock();
            return c02;
        }
        if (i4 == 0) {
            do {
                try {
                    C3 = C();
                    if (C3 != null) {
                        if (C3 instanceof j) {
                            this.size = i4;
                            reentrantLock.unlock();
                            return C3;
                        }
                        o.b(C3);
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } while (C3.s(obj, (LockFreeLinkedListNode.c) null) == null);
            this.size = i4;
            q qVar = q.f14567a;
            reentrantLock.unlock();
            C3.h(obj);
            return C3.o();
        }
        a0(i4, obj);
        y yVar = a.f14046b;
        reentrantLock.unlock();
        return yVar;
    }
}
