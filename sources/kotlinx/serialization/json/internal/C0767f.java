package kotlinx.serialization.json.internal;

import kotlin.collections.C0712g;
import kotlin.jvm.internal.o;
import l2.q;

/* renamed from: kotlinx.serialization.json.internal.f  reason: case insensitive filesystem */
public abstract class C0767f {

    /* renamed from: a  reason: collision with root package name */
    private final C0712g f14389a = new C0712g();

    /* renamed from: b  reason: collision with root package name */
    private int f14390b;

    /* access modifiers changed from: protected */
    public final void a(char[] cArr) {
        o.e(cArr, "array");
        synchronized (this) {
            try {
                if (this.f14390b + cArr.length < C0765d.f14387a) {
                    this.f14390b += cArr.length;
                    this.f14389a.addLast(cArr);
                }
                q qVar = q.f14567a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final char[] b(int i4) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f14389a.k();
            if (cArr != null) {
                this.f14390b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        if (cArr == null) {
            return new char[i4];
        }
        return cArr;
    }
}
