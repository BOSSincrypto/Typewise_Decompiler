package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.a;
import kotlinx.coroutines.flow.internal.h;
import kotlinx.coroutines.flow.internal.k;
import kotlinx.coroutines.internal.y;
import l2.q;

final class StateFlowImpl extends a implements k, c, h {
    private volatile /* synthetic */ Object _state;

    /* renamed from: d  reason: collision with root package name */
    private int f14101d;

    public StateFlowImpl(Object obj) {
        this._state = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        r8 = (kotlinx.coroutines.flow.s[]) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0030, code lost:
        if (r8 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        r1 = r8.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0034, code lost:
        if (r3 >= r1) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0036, code lost:
        r4 = r8[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0038, code lost:
        if (r4 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003a, code lost:
        r4.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003d, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003f, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r8 = r6.f14101d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0042, code lost:
        if (r8 != r7) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0044, code lost:
        r6.f14101d = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0047, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0048, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r7 = k();
        r1 = l2.q.f14567a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0051, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0052, code lost:
        r5 = r8;
        r8 = r7;
        r7 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean n(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 1
            r6.k()
            monitor-enter(r6)
            java.lang.Object r1 = r6._state     // Catch:{ all -> 0x0012 }
            r2 = 0
            if (r7 == 0) goto L_0x0014
            boolean r7 = kotlin.jvm.internal.o.a(r1, r7)     // Catch:{ all -> 0x0012 }
            if (r7 != 0) goto L_0x0014
            monitor-exit(r6)
            return r2
        L_0x0012:
            r7 = move-exception
            goto L_0x005e
        L_0x0014:
            boolean r7 = kotlin.jvm.internal.o.a(r1, r8)     // Catch:{ all -> 0x0012 }
            if (r7 == 0) goto L_0x001c
            monitor-exit(r6)
            return r0
        L_0x001c:
            r6._state = r8     // Catch:{ all -> 0x0012 }
            int r7 = r6.f14101d     // Catch:{ all -> 0x0012 }
            r8 = r7 & 1
            if (r8 != 0) goto L_0x0058
            int r7 = r7 + r0
            r6.f14101d = r7     // Catch:{ all -> 0x0012 }
            kotlinx.coroutines.flow.internal.c[] r8 = r6.k()     // Catch:{ all -> 0x0012 }
            l2.q r1 = l2.q.f14567a     // Catch:{ all -> 0x0012 }
            monitor-exit(r6)
        L_0x002e:
            kotlinx.coroutines.flow.s[] r8 = (kotlinx.coroutines.flow.s[]) r8
            if (r8 == 0) goto L_0x003f
            int r1 = r8.length
            r3 = r2
        L_0x0034:
            if (r3 >= r1) goto L_0x003f
            r4 = r8[r3]
            if (r4 == 0) goto L_0x003d
            r4.f()
        L_0x003d:
            int r3 = r3 + r0
            goto L_0x0034
        L_0x003f:
            monitor-enter(r6)
            int r8 = r6.f14101d     // Catch:{ all -> 0x0049 }
            if (r8 != r7) goto L_0x004b
            int r7 = r7 + r0
            r6.f14101d = r7     // Catch:{ all -> 0x0049 }
            monitor-exit(r6)
            return r0
        L_0x0049:
            r7 = move-exception
            goto L_0x0056
        L_0x004b:
            kotlinx.coroutines.flow.internal.c[] r7 = r6.k()     // Catch:{ all -> 0x0049 }
            l2.q r1 = l2.q.f14567a     // Catch:{ all -> 0x0049 }
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x002e
        L_0x0056:
            monitor-exit(r6)
            throw r7
        L_0x0058:
            int r7 = r7 + 2
            r6.f14101d = r7     // Catch:{ all -> 0x0012 }
            monitor-exit(r6)
            return r0
        L_0x005e:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.n(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: kotlinx.coroutines.flow.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlinx.coroutines.flow.StateFlowImpl} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b7 A[Catch:{ all -> 0x0042 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8 A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(kotlinx.coroutines.flow.d r11, kotlin.coroutines.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.StateFlowImpl$collect$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.StateFlowImpl$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.StateFlowImpl$collect$1
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L_0x0075
            r11 = 1
            if (r2 == r11) goto L_0x0063
            if (r2 == r5) goto L_0x004d
            if (r2 != r4) goto L_0x0045
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.g0 r2 = (kotlinx.coroutines.g0) r2
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.flow.s r6 = (kotlinx.coroutines.flow.s) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.d r7 = (kotlinx.coroutines.flow.d) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.f.b(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x008f
        L_0x0042:
            r11 = move-exception
            goto L_0x00d2
        L_0x0045:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004d:
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.g0 r2 = (kotlinx.coroutines.g0) r2
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.flow.s r6 = (kotlinx.coroutines.flow.s) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.d r7 = (kotlinx.coroutines.flow.d) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.f.b(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x00b9
        L_0x0063:
            java.lang.Object r11 = r0.L$2
            r6 = r11
            kotlinx.coroutines.flow.s r6 = (kotlinx.coroutines.flow.s) r6
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.flow.d r11 = (kotlinx.coroutines.flow.d) r11
            java.lang.Object r2 = r0.L$0
            r8 = r2
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.f.b(r12)     // Catch:{ all -> 0x0042 }
            goto L_0x0080
        L_0x0075:
            kotlin.f.b(r12)
            kotlinx.coroutines.flow.internal.c r12 = r10.f()
            kotlinx.coroutines.flow.s r12 = (kotlinx.coroutines.flow.s) r12
            r8 = r10
            r6 = r12
        L_0x0080:
            kotlin.coroutines.CoroutineContext r12 = r0.getContext()     // Catch:{ all -> 0x0042 }
            kotlinx.coroutines.g0$b r2 = kotlinx.coroutines.g0.f14139t     // Catch:{ all -> 0x0042 }
            kotlin.coroutines.CoroutineContext$a r12 = r12.get(r2)     // Catch:{ all -> 0x0042 }
            kotlinx.coroutines.g0 r12 = (kotlinx.coroutines.g0) r12     // Catch:{ all -> 0x0042 }
            r7 = r11
            r2 = r12
            r11 = r3
        L_0x008f:
            java.lang.Object r12 = r8._state     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x0096
            kotlinx.coroutines.j0.f(r2)     // Catch:{ all -> 0x0042 }
        L_0x0096:
            if (r11 == 0) goto L_0x009e
            boolean r9 = kotlin.jvm.internal.o.a(r11, r12)     // Catch:{ all -> 0x0042 }
            if (r9 != 0) goto L_0x00b9
        L_0x009e:
            kotlinx.coroutines.internal.y r11 = kotlinx.coroutines.flow.internal.k.f14124a     // Catch:{ all -> 0x0042 }
            if (r12 != r11) goto L_0x00a4
            r11 = r3
            goto L_0x00a5
        L_0x00a4:
            r11 = r12
        L_0x00a5:
            r0.L$0 = r8     // Catch:{ all -> 0x0042 }
            r0.L$1 = r7     // Catch:{ all -> 0x0042 }
            r0.L$2 = r6     // Catch:{ all -> 0x0042 }
            r0.L$3 = r2     // Catch:{ all -> 0x0042 }
            r0.L$4 = r12     // Catch:{ all -> 0x0042 }
            r0.label = r5     // Catch:{ all -> 0x0042 }
            java.lang.Object r11 = r7.emit(r11, r0)     // Catch:{ all -> 0x0042 }
            if (r11 != r1) goto L_0x00b8
            return r1
        L_0x00b8:
            r11 = r12
        L_0x00b9:
            boolean r12 = r6.g()     // Catch:{ all -> 0x0042 }
            if (r12 != 0) goto L_0x008f
            r0.L$0 = r8     // Catch:{ all -> 0x0042 }
            r0.L$1 = r7     // Catch:{ all -> 0x0042 }
            r0.L$2 = r6     // Catch:{ all -> 0x0042 }
            r0.L$3 = r2     // Catch:{ all -> 0x0042 }
            r0.L$4 = r11     // Catch:{ all -> 0x0042 }
            r0.label = r4     // Catch:{ all -> 0x0042 }
            java.lang.Object r12 = r6.d(r0)     // Catch:{ all -> 0x0042 }
            if (r12 != r1) goto L_0x008f
            return r1
        L_0x00d2:
            r8.i(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.a(kotlinx.coroutines.flow.d, kotlin.coroutines.c):java.lang.Object");
    }

    public c b(CoroutineContext coroutineContext, int i4, BufferOverflow bufferOverflow) {
        return r.d(this, coroutineContext, i4, bufferOverflow);
    }

    public boolean d(Object obj) {
        setValue(obj);
        return true;
    }

    public Object emit(Object obj, c cVar) {
        setValue(obj);
        return q.f14567a;
    }

    public Object getValue() {
        y yVar = k.f14124a;
        Object obj = this._state;
        if (obj == yVar) {
            return null;
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public s g() {
        return new s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public s[] h(int i4) {
        return new s[i4];
    }

    public void setValue(Object obj) {
        if (obj == null) {
            obj = k.f14124a;
        }
        n((Object) null, obj);
    }
}
