package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Result;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import l2.q;

public abstract class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public c[] f14115a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f14116b;

    /* renamed from: c  reason: collision with root package name */
    private int f14117c;

    /* access modifiers changed from: protected */
    public final c f() {
        c cVar;
        synchronized (this) {
            try {
                c[] cVarArr = this.f14115a;
                if (cVarArr == null) {
                    cVarArr = h(2);
                    this.f14115a = cVarArr;
                } else if (this.f14116b >= cVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                    o.d(copyOf, "copyOf(this, newSize)");
                    this.f14115a = (c[]) copyOf;
                    cVarArr = (c[]) copyOf;
                }
                int i4 = this.f14117c;
                do {
                    cVar = cVarArr[i4];
                    if (cVar == null) {
                        cVar = g();
                        cVarArr[i4] = cVar;
                    }
                    i4++;
                    if (i4 >= cVarArr.length) {
                        i4 = 0;
                    }
                } while (!cVar.a(this));
                this.f14117c = i4;
                this.f14116b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    public abstract c g();

    /* access modifiers changed from: protected */
    public abstract c[] h(int i4);

    /* access modifiers changed from: protected */
    public final void i(c cVar) {
        int i4;
        c[] b4;
        synchronized (this) {
            try {
                int i5 = this.f14116b - 1;
                this.f14116b = i5;
                if (i5 == 0) {
                    this.f14117c = 0;
                }
                b4 = cVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (c cVar2 : b4) {
            if (cVar2 != null) {
                Result.a aVar = Result.Companion;
                cVar2.resumeWith(Result.m1constructorimpl(q.f14567a));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int j() {
        return this.f14116b;
    }

    /* access modifiers changed from: protected */
    public final c[] k() {
        return this.f14115a;
    }
}
