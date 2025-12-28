package org.tensorflow.lite;

import org.tensorflow.lite.nnapi.NnApiDelegateImpl;
import org.tensorflow.lite.nnapi.a;

class InterpreterFactoryImpl implements d {
    public a.b a(a.C0219a aVar) {
        return new NnApiDelegateImpl(aVar);
    }
}
