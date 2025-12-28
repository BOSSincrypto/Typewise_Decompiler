package org.tensorflow.lite;

import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import org.tensorflow.lite.f;

final class TensorImpl implements f {

    /* renamed from: a  reason: collision with root package name */
    private long f15733a;

    /* renamed from: b  reason: collision with root package name */
    private final DataType f15734b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f15735c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f15736d;

    /* renamed from: e  reason: collision with root package name */
    private final f.a f15737e;

    private TensorImpl(long j4) {
        this.f15733a = j4;
        this.f15734b = a.a(dtype(j4));
        this.f15735c = shape(j4);
        this.f15736d = shapeSignature(j4);
        this.f15737e = new f.a(quantizationScale(j4), quantizationZeroPoint(j4));
    }

    private ByteBuffer b() {
        return buffer(this.f15733a).order(ByteOrder.nativeOrder());
    }

    private static native ByteBuffer buffer(long j4);

    private static native long create(long j4, int i4, int i5);

    static int d(Object obj) {
        if (obj == null || !obj.getClass().isArray()) {
            return 0;
        }
        if (Array.getLength(obj) != 0) {
            return d(Array.get(obj, 0)) + 1;
        }
        throw new IllegalArgumentException("Array lengths cannot be 0.");
    }

    private static native void delete(long j4);

    private static native int dtype(long j4);

    private int[] e(Object obj) {
        int d4 = d(obj);
        if (this.f15734b == DataType.STRING) {
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                while (cls.isArray()) {
                    cls = cls.getComponentType();
                }
                if (Byte.TYPE.equals(cls)) {
                    d4--;
                }
            }
        }
        int[] iArr = new int[d4];
        i(obj, 0, iArr);
        return iArr;
    }

    private void g(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            ((ByteBuffer) buffer).put(b());
        } else if (buffer instanceof FloatBuffer) {
            ((FloatBuffer) buffer).put(b().asFloatBuffer());
        } else if (buffer instanceof LongBuffer) {
            ((LongBuffer) buffer).put(b().asLongBuffer());
        } else if (buffer instanceof IntBuffer) {
            ((IntBuffer) buffer).put(b().asIntBuffer());
        } else if (buffer instanceof ShortBuffer) {
            ((ShortBuffer) buffer).put(b().asShortBuffer());
        } else {
            throw new IllegalArgumentException("Unexpected output buffer type: " + buffer);
        }
    }

    private static native boolean hasDelegateBufferHandle(long j4);

    static void i(Object obj, int i4, int[] iArr) {
        if (iArr != null && i4 != iArr.length) {
            int length = Array.getLength(obj);
            int i5 = iArr[i4];
            if (i5 == 0) {
                iArr[i4] = length;
            } else if (i5 != length) {
                throw new IllegalArgumentException(String.format("Mismatched lengths (%d and %d) in dimension %d", new Object[]{Integer.valueOf(iArr[i4]), Integer.valueOf(length), Integer.valueOf(i4)}));
            }
            int i6 = i4 + 1;
            if (i6 != iArr.length) {
                for (int i7 = 0; i7 < length; i7++) {
                    i(Array.get(obj, i7), i6, iArr);
                }
            }
        }
    }

    static TensorImpl j(long j4, int i4) {
        return new TensorImpl(create(j4, i4, 0));
    }

    private static boolean l(Object obj) {
        return obj instanceof Buffer;
    }

    private static boolean m(Object obj) {
        return obj instanceof ByteBuffer;
    }

    private static native String name(long j4);

    private static native int numBytes(long j4);

    private static native float quantizationScale(long j4);

    private static native int quantizationZeroPoint(long j4);

    private void r(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) buffer;
            if (!byteBuffer.isDirect() || byteBuffer.order() != ByteOrder.nativeOrder()) {
                b().put(byteBuffer);
            } else {
                writeDirectBuffer(this.f15733a, buffer);
            }
        } else if (buffer instanceof LongBuffer) {
            LongBuffer longBuffer = (LongBuffer) buffer;
            if (!longBuffer.isDirect() || longBuffer.order() != ByteOrder.nativeOrder()) {
                b().asLongBuffer().put(longBuffer);
            } else {
                writeDirectBuffer(this.f15733a, buffer);
            }
        } else if (buffer instanceof FloatBuffer) {
            FloatBuffer floatBuffer = (FloatBuffer) buffer;
            if (!floatBuffer.isDirect() || floatBuffer.order() != ByteOrder.nativeOrder()) {
                b().asFloatBuffer().put(floatBuffer);
            } else {
                writeDirectBuffer(this.f15733a, buffer);
            }
        } else if (buffer instanceof IntBuffer) {
            IntBuffer intBuffer = (IntBuffer) buffer;
            if (!intBuffer.isDirect() || intBuffer.order() != ByteOrder.nativeOrder()) {
                b().asIntBuffer().put(intBuffer);
            } else {
                writeDirectBuffer(this.f15733a, buffer);
            }
        } else if (buffer instanceof ShortBuffer) {
            ShortBuffer shortBuffer = (ShortBuffer) buffer;
            if (!shortBuffer.isDirect() || shortBuffer.order() != ByteOrder.nativeOrder()) {
                b().asShortBuffer().put(shortBuffer);
            } else {
                writeDirectBuffer(this.f15733a, buffer);
            }
        } else {
            throw new IllegalArgumentException("Unexpected input buffer type: " + buffer);
        }
    }

    private static native void readMultiDimensionalArray(long j4, Object obj);

    private void s(Object obj) {
        int i4;
        if (l(obj)) {
            Buffer buffer = (Buffer) obj;
            int o4 = o();
            if (m(obj)) {
                i4 = buffer.capacity();
            } else {
                i4 = buffer.capacity() * this.f15734b.byteSize();
            }
            if (o4 > i4) {
                throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with %d bytes to a Java Buffer with %d bytes.", new Object[]{n(), Integer.valueOf(o4), Integer.valueOf(i4)}));
            }
            return;
        }
        int[] e4 = e(obj);
        if (!Arrays.equals(e4, this.f15735c)) {
            throw new IllegalArgumentException(String.format("Cannot copy from a TensorFlowLite tensor (%s) with shape %s to a Java object with shape %s.", new Object[]{n(), Arrays.toString(this.f15735c), Arrays.toString(e4)}));
        }
    }

    private static native int[] shape(long j4);

    private static native int[] shapeSignature(long j4);

    private void t(Object obj) {
        int i4;
        if (l(obj)) {
            Buffer buffer = (Buffer) obj;
            int o4 = o();
            if (m(obj)) {
                i4 = buffer.capacity();
            } else {
                i4 = buffer.capacity() * this.f15734b.byteSize();
            }
            if (o4 != i4) {
                throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with %d bytes from a Java Buffer with %d bytes.", new Object[]{n(), Integer.valueOf(o4), Integer.valueOf(i4)}));
            }
            return;
        }
        int[] e4 = e(obj);
        if (!Arrays.equals(e4, this.f15735c)) {
            throw new IllegalArgumentException(String.format("Cannot copy to a TensorFlowLite tensor (%s) with shape %s from a Java object with shape %s.", new Object[]{n(), Arrays.toString(this.f15735c), Arrays.toString(e4)}));
        }
    }

    private void u(Object obj) {
        DataType h4;
        if (!m(obj) && (h4 = h(obj)) != this.f15734b && !a.b(h4).equals(a.b(this.f15734b))) {
            throw new IllegalArgumentException(String.format("Cannot convert between a TensorFlowLite tensor with type %s and a Java object of type %s (which is compatible with the TensorFlowLite type %s).", new Object[]{this.f15734b, obj.getClass().getName(), h4}));
        }
    }

    private static native void writeDirectBuffer(long j4, Buffer buffer);

    private static native void writeMultiDimensionalArray(long j4, Object obj);

    private static native void writeScalar(long j4, Object obj);

    public int[] a() {
        return this.f15735c;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        delete(this.f15733a);
        this.f15733a = 0;
    }

    /* access modifiers changed from: package-private */
    public void f(Object obj) {
        if (obj != null) {
            u(obj);
            s(obj);
            if (l(obj)) {
                g((Buffer) obj);
            } else {
                readMultiDimensionalArray(this.f15733a, obj);
            }
        } else if (!hasDelegateBufferHandle(this.f15733a)) {
            throw new IllegalArgumentException("Null outputs are allowed only if the Tensor is bound to a buffer handle.");
        }
    }

    /* access modifiers changed from: package-private */
    public DataType h(Object obj) {
        Class<?> cls = obj.getClass();
        Class<String> cls2 = String.class;
        if (cls.isArray()) {
            while (cls.isArray()) {
                cls = cls.getComponentType();
            }
            if (Float.TYPE.equals(cls)) {
                return DataType.FLOAT32;
            }
            if (Integer.TYPE.equals(cls)) {
                return DataType.INT32;
            }
            if (Short.TYPE.equals(cls)) {
                return DataType.INT16;
            }
            if (Byte.TYPE.equals(cls)) {
                DataType dataType = this.f15734b;
                DataType dataType2 = DataType.STRING;
                if (dataType == dataType2) {
                    return dataType2;
                }
                return DataType.UINT8;
            } else if (Long.TYPE.equals(cls)) {
                return DataType.INT64;
            } else {
                if (Boolean.TYPE.equals(cls)) {
                    return DataType.BOOL;
                }
                if (cls2.equals(cls)) {
                    return DataType.STRING;
                }
            }
        } else if (Float.class.equals(cls) || (obj instanceof FloatBuffer)) {
            return DataType.FLOAT32;
        } else {
            if (Integer.class.equals(cls) || (obj instanceof IntBuffer)) {
                return DataType.INT32;
            }
            if (Short.class.equals(cls) || (obj instanceof ShortBuffer)) {
                return DataType.INT16;
            }
            if (Byte.class.equals(cls)) {
                return DataType.UINT8;
            }
            if (Long.class.equals(cls) || (obj instanceof LongBuffer)) {
                return DataType.INT64;
            }
            if (Boolean.class.equals(cls)) {
                return DataType.BOOL;
            }
            if (cls2.equals(cls)) {
                return DataType.STRING;
            }
        }
        throw new IllegalArgumentException("DataType error: cannot resolve DataType of " + obj.getClass().getName());
    }

    /* access modifiers changed from: package-private */
    public int[] k(Object obj) {
        if (obj == null || l(obj)) {
            return null;
        }
        u(obj);
        int[] e4 = e(obj);
        if (Arrays.equals(this.f15735c, e4)) {
            return null;
        }
        return e4;
    }

    public String n() {
        return name(this.f15733a);
    }

    public int o() {
        return numBytes(this.f15733a);
    }

    /* access modifiers changed from: package-private */
    public void p() {
        this.f15735c = shape(this.f15733a);
    }

    /* access modifiers changed from: package-private */
    public void q(Object obj) {
        if (obj != null) {
            u(obj);
            t(obj);
            if (l(obj)) {
                r((Buffer) obj);
            } else if (this.f15734b == DataType.STRING && this.f15735c.length == 0) {
                writeScalar(this.f15733a, obj);
            } else if (obj.getClass().isArray()) {
                writeMultiDimensionalArray(this.f15733a, obj);
            } else {
                writeScalar(this.f15733a, obj);
            }
        } else if (!hasDelegateBufferHandle(this.f15733a)) {
            throw new IllegalArgumentException("Null inputs are allowed only if the Tensor is bound to a buffer handle.");
        }
    }
}
