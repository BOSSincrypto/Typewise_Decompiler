package c3;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.o;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f7690a = new t();

    /* renamed from: b  reason: collision with root package name */
    private static final int f7691b = 65536;

    /* renamed from: c  reason: collision with root package name */
    private static final r f7692c = new r(new byte[0], 0, 0, false, false);

    /* renamed from: d  reason: collision with root package name */
    private static final int f7693d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReference[] f7694e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f7693d = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i4 = 0; i4 < highestOneBit; i4++) {
            atomicReferenceArr[i4] = new AtomicReference();
        }
        f7694e = atomicReferenceArr;
    }

    private t() {
    }

    private final AtomicReference a() {
        return f7694e[(int) (Thread.currentThread().getId() & (((long) f7693d) - 1))];
    }

    public static final void b(r rVar) {
        int i4;
        o.e(rVar, "segment");
        if (rVar.f7688f != null || rVar.f7689g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (!rVar.f7686d) {
            AtomicReference a4 = f7690a.a();
            r rVar2 = (r) a4.get();
            if (rVar2 != f7692c) {
                if (rVar2 != null) {
                    i4 = rVar2.f7685c;
                } else {
                    i4 = 0;
                }
                if (i4 < f7691b) {
                    rVar.f7688f = rVar2;
                    rVar.f7684b = 0;
                    rVar.f7685c = i4 + 8192;
                    if (!s.a(a4, rVar2, rVar)) {
                        rVar.f7688f = null;
                    }
                }
            }
        }
    }

    public static final r c() {
        AtomicReference a4 = f7690a.a();
        r rVar = f7692c;
        r rVar2 = (r) a4.getAndSet(rVar);
        if (rVar2 == rVar) {
            return new r();
        }
        if (rVar2 == null) {
            a4.set((Object) null);
            return new r();
        }
        a4.set(rVar2.f7688f);
        rVar2.f7688f = null;
        rVar2.f7685c = 0;
        return rVar2;
    }
}
