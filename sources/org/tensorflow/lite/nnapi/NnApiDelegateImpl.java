package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.b;
import org.tensorflow.lite.nnapi.a;

public class NnApiDelegateImpl implements a.b, b, AutoCloseable {

    /* renamed from: a  reason: collision with root package name */
    private long f15746a;

    public NnApiDelegateImpl(a.C0219a aVar) {
        boolean z3;
        TensorFlowLite.a();
        int d4 = aVar.d();
        String a4 = aVar.a();
        String c4 = aVar.c();
        String f4 = aVar.f();
        int e4 = aVar.e();
        boolean z4 = false;
        if (aVar.h() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f15746a = createDelegate(d4, a4, c4, f4, e4, z3, (aVar.h() == null || !aVar.h().booleanValue()) ? true : z4, aVar.b(), aVar.g());
    }

    private static native long createDelegate(int i4, String str, String str2, String str3, int i5, boolean z3, boolean z4, boolean z5, long j4);

    private static native void deleteDelegate(long j4);

    public long F() {
        return this.f15746a;
    }

    public void close() {
        long j4 = this.f15746a;
        if (j4 != 0) {
            deleteDelegate(j4);
            this.f15746a = 0;
        }
    }
}
