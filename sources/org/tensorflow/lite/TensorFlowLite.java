package org.tensorflow.lite;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import org.tensorflow.lite.InterpreterApi$Options;

public abstract class TensorFlowLite {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f15728a = Logger.getLogger(TensorFlowLite.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final String[][] f15729b;

    /* renamed from: c  reason: collision with root package name */
    private static final Throwable f15730c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f15731d = false;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicBoolean[] f15732e = new AtomicBoolean[InterpreterApi$Options.TfLiteRuntime.values().length];

    static {
        String[][] strArr = {new String[]{"tensorflowlite_jni", "tensorflowlite_jni_stable"}, new String[]{"tensorflowlite_jni_gms_client"}};
        f15729b = strArr;
        UnsatisfiedLinkError unsatisfiedLinkError = null;
        for (String[] strArr2 : strArr) {
            int length = strArr2.length;
            int i4 = 0;
            while (i4 < length) {
                String str = strArr2[i4];
                try {
                    System.loadLibrary(str);
                    f15728a.info("Loaded native library: " + str);
                    break;
                } catch (UnsatisfiedLinkError e4) {
                    f15728a.info("Didn't load native library: " + str);
                    if (unsatisfiedLinkError == null) {
                        unsatisfiedLinkError = e4;
                    } else {
                        unsatisfiedLinkError.addSuppressed(e4);
                    }
                    i4++;
                }
            }
        }
        f15730c = unsatisfiedLinkError;
        for (int i5 = 0; i5 < InterpreterApi$Options.TfLiteRuntime.values().length; i5++) {
            f15732e[i5] = new AtomicBoolean();
        }
    }

    public static void a() {
        if (!f15731d) {
            try {
                nativeDoNothing();
                f15731d = true;
            } catch (UnsatisfiedLinkError e4) {
                Throwable th = f15730c;
                if (th == null) {
                    th = e4;
                }
                UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + th);
                unsatisfiedLinkError.initCause(e4);
                throw unsatisfiedLinkError;
            }
        }
    }

    private static native void nativeDoNothing();
}
