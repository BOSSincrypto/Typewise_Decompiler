package org.tensorflow.lite;

import androidx.appcompat.app.F;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.InterpreterApi$Options;
import org.tensorflow.lite.e;
import org.tensorflow.lite.nnapi.a;

abstract class NativeInterpreterWrapper implements AutoCloseable {

    /* renamed from: n  reason: collision with root package name */
    private static final RuntimeFlavor f15713n = RuntimeFlavor.APPLICATION;

    /* renamed from: a  reason: collision with root package name */
    long f15714a;

    /* renamed from: b  reason: collision with root package name */
    long f15715b;

    /* renamed from: c  reason: collision with root package name */
    private long f15716c;

    /* renamed from: d  reason: collision with root package name */
    private long f15717d = 0;

    /* renamed from: e  reason: collision with root package name */
    private ByteBuffer f15718e;

    /* renamed from: f  reason: collision with root package name */
    private Map f15719f;

    /* renamed from: g  reason: collision with root package name */
    private Map f15720g;

    /* renamed from: h  reason: collision with root package name */
    private TensorImpl[] f15721h;

    /* renamed from: i  reason: collision with root package name */
    private TensorImpl[] f15722i;
    private long inferenceDurationNanoseconds = -1;

    /* renamed from: j  reason: collision with root package name */
    private boolean f15723j = false;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15724k = false;

    /* renamed from: l  reason: collision with root package name */
    private final List f15725l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private final List f15726m = new ArrayList();

    NativeInterpreterWrapper(ByteBuffer byteBuffer, e.a aVar) {
        TensorFlowLite.a();
        if (byteBuffer == null || (!(byteBuffer instanceof MappedByteBuffer) && (!byteBuffer.isDirect() || byteBuffer.order() != ByteOrder.nativeOrder()))) {
            throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
        }
        this.f15718e = byteBuffer;
        long createErrorReporter = createErrorReporter(512);
        y(createErrorReporter, createModelWithBuffer(this.f15718e, createErrorReporter), aVar);
    }

    private void A() {
        InterpreterFactoryImpl interpreterFactoryImpl = new InterpreterFactoryImpl();
        for (b bVar : this.f15725l) {
            if (bVar instanceof a) {
                ((a) bVar).e(interpreterFactoryImpl);
            }
        }
    }

    private static b D(List list) {
        try {
            Class<?> cls = Class.forName("org.tensorflow.lite.flex.FlexDelegate");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (cls.isInstance((b) it.next())) {
                    return null;
                }
            }
            return (b) cls.getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }

    private void a(e.a aVar) {
        b D3;
        if (this.f15724k && (D3 = D(aVar.c())) != null) {
            this.f15726m.add(D3);
            this.f15725l.add(D3);
        }
        e(aVar);
        Iterator it = aVar.b().iterator();
        if (it.hasNext()) {
            F.a(it.next());
            throw null;
        } else if (aVar.f()) {
            a aVar2 = new a();
            this.f15726m.add(aVar2);
            this.f15725l.add(aVar2);
        }
    }

    private static native long allocateTensors(long j4, long j5);

    private static native void allowBufferHandleOutput(long j4, boolean z3);

    private static native void allowFp16PrecisionForFp32(long j4, boolean z3);

    private static native long createCancellationFlag(long j4);

    private static native long createErrorReporter(int i4);

    private static native long createInterpreter(long j4, long j5, int i4, boolean z3, List<Long> list);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j4);

    private static native void delete(long j4, long j5, long j6);

    private static native long deleteCancellationFlag(long j4);

    private void e(e.a aVar) {
        for (b bVar : aVar.c()) {
            if (aVar.e() == InterpreterApi$Options.TfLiteRuntime.FROM_APPLICATION_ONLY || (bVar instanceof a)) {
                this.f15725l.add(bVar);
            } else {
                throw new IllegalArgumentException("Instantiated delegates (other than NnApiDelegate) are not allowed when using TF Lite from Google Play Services. Please use InterpreterApi.Options.addDelegateFactory() with an appropriate DelegateFactory instead.");
            }
        }
    }

    private static native int getInputCount(long j4);

    private static native int getInputTensorIndex(long j4, int i4);

    private static native int getOutputCount(long j4);

    private static native int getOutputTensorIndex(long j4, int i4);

    private static native String[] getSignatureKeys(long j4);

    private boolean h() {
        if (this.f15723j) {
            return false;
        }
        this.f15723j = true;
        allocateTensors(this.f15715b, this.f15714a);
        for (TensorImpl tensorImpl : this.f15722i) {
            if (tensorImpl != null) {
                tensorImpl.p();
            }
        }
        return true;
    }

    private static native boolean hasUnresolvedFlexOp(long j4);

    private static native boolean resizeInput(long j4, long j5, int i4, int[] iArr, boolean z3);

    private static native void run(long j4, long j5);

    private void y(long j4, long j5, e.a aVar) {
        if (aVar == null) {
            aVar = new e.a();
        }
        aVar.a();
        this.f15714a = j4;
        this.f15716c = j5;
        ArrayList arrayList = new ArrayList();
        long createInterpreter = createInterpreter(j5, j4, aVar.d(), aVar.g(), arrayList);
        this.f15715b = createInterpreter;
        this.f15724k = hasUnresolvedFlexOp(createInterpreter);
        a(aVar);
        A();
        arrayList.ensureCapacity(this.f15725l.size());
        for (b F3 : this.f15725l) {
            arrayList.add(Long.valueOf(F3.F()));
        }
        if (!arrayList.isEmpty()) {
            delete(0, 0, this.f15715b);
            this.f15715b = createInterpreter(j5, j4, aVar.d(), aVar.g(), arrayList);
        }
        Boolean bool = aVar.f15742h;
        if (bool != null) {
            allowFp16PrecisionForFp32(this.f15715b, bool.booleanValue());
        }
        Boolean bool2 = aVar.f15743i;
        if (bool2 != null) {
            allowBufferHandleOutput(this.f15715b, bool2.booleanValue());
        }
        if (aVar.h()) {
            this.f15717d = createCancellationFlag(this.f15715b);
        }
        this.f15721h = new TensorImpl[getInputCount(this.f15715b)];
        this.f15722i = new TensorImpl[getOutputCount(this.f15715b)];
        Boolean bool3 = aVar.f15742h;
        if (bool3 != null) {
            allowFp16PrecisionForFp32(this.f15715b, bool3.booleanValue());
        }
        Boolean bool4 = aVar.f15743i;
        if (bool4 != null) {
            allowBufferHandleOutput(this.f15715b, bool4.booleanValue());
        }
        allocateTensors(this.f15715b, j4);
        this.f15723j = true;
    }

    /* access modifiers changed from: package-private */
    public void G(int i4, int[] iArr) {
        Q(i4, iArr, false);
    }

    /* access modifiers changed from: package-private */
    public void Q(int i4, int[] iArr, boolean z3) {
        if (resizeInput(this.f15715b, this.f15714a, i4, iArr, z3)) {
            this.f15723j = false;
            TensorImpl tensorImpl = this.f15721h[i4];
            if (tensorImpl != null) {
                tensorImpl.p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void R(Object[] objArr, Map map) {
        this.inferenceDurationNanoseconds = -1;
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        } else if (map != null) {
            for (int i4 = 0; i4 < objArr.length; i4++) {
                int[] k4 = m(i4).k(objArr[i4]);
                if (k4 != null) {
                    G(i4, k4);
                }
            }
            boolean h4 = h();
            for (int i5 = 0; i5 < objArr.length; i5++) {
                m(i5).q(objArr[i5]);
            }
            long nanoTime = System.nanoTime();
            run(this.f15715b, this.f15714a);
            long nanoTime2 = System.nanoTime() - nanoTime;
            if (h4) {
                for (TensorImpl tensorImpl : this.f15722i) {
                    if (tensorImpl != null) {
                        tensorImpl.p();
                    }
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    o(((Integer) entry.getKey()).intValue()).f(entry.getValue());
                }
            }
            this.inferenceDurationNanoseconds = nanoTime2;
        } else {
            throw new IllegalArgumentException("Input error: Outputs should not be null.");
        }
    }

    public void close() {
        int i4 = 0;
        while (true) {
            TensorImpl[] tensorImplArr = this.f15721h;
            if (i4 >= tensorImplArr.length) {
                break;
            }
            TensorImpl tensorImpl = tensorImplArr[i4];
            if (tensorImpl != null) {
                tensorImpl.c();
                this.f15721h[i4] = null;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            TensorImpl[] tensorImplArr2 = this.f15722i;
            if (i5 >= tensorImplArr2.length) {
                break;
            }
            TensorImpl tensorImpl2 = tensorImplArr2[i5];
            if (tensorImpl2 != null) {
                tensorImpl2.c();
                this.f15722i[i5] = null;
            }
            i5++;
        }
        this.f15725l.clear();
        for (b close : this.f15726m) {
            close.close();
        }
        this.f15726m.clear();
        delete(this.f15714a, this.f15716c, this.f15715b);
        deleteCancellationFlag(this.f15717d);
        this.f15714a = 0;
        this.f15716c = 0;
        this.f15715b = 0;
        this.f15717d = 0;
        this.f15718e = null;
        this.f15719f = null;
        this.f15720g = null;
        this.f15723j = false;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        h();
    }

    /* access modifiers changed from: package-private */
    public TensorImpl m(int i4) {
        if (i4 >= 0) {
            TensorImpl[] tensorImplArr = this.f15721h;
            if (i4 < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i4];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j4 = this.f15715b;
                TensorImpl j5 = TensorImpl.j(j4, getInputTensorIndex(j4, i4));
                tensorImplArr[i4] = j5;
                return j5;
            }
        }
        throw new IllegalArgumentException("Invalid input Tensor index: " + i4);
    }

    /* access modifiers changed from: package-private */
    public TensorImpl o(int i4) {
        if (i4 >= 0) {
            TensorImpl[] tensorImplArr = this.f15722i;
            if (i4 < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i4];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j4 = this.f15715b;
                TensorImpl j5 = TensorImpl.j(j4, getOutputTensorIndex(j4, i4));
                tensorImplArr[i4] = j5;
                return j5;
            }
        }
        throw new IllegalArgumentException("Invalid output Tensor index: " + i4);
    }

    public String[] v() {
        return getSignatureKeys(this.f15715b);
    }
}
