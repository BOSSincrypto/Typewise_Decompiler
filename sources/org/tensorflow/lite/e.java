package org.tensorflow.lite;

import java.util.HashMap;
import java.util.Map;

abstract class e implements AutoCloseable {

    /* renamed from: a  reason: collision with root package name */
    NativeInterpreterWrapper f15740a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f15741b = m();

    static class a extends InterpreterApi$Options {

        /* renamed from: h  reason: collision with root package name */
        Boolean f15742h;

        /* renamed from: i  reason: collision with root package name */
        Boolean f15743i;
    }

    e(NativeInterpreterWrapper nativeInterpreterWrapper) {
        this.f15740a = nativeInterpreterWrapper;
    }

    public void a() {
        e();
        this.f15740a.f();
    }

    public void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.f15740a;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.f15740a = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (this.f15740a == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }

    public f f(int i4) {
        e();
        return this.f15740a.m(i4);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public f h(int i4) {
        e();
        return this.f15740a.o(i4);
    }

    public String[] m() {
        e();
        return this.f15740a.v();
    }

    public void o(Object obj, Object obj2) {
        Object[] objArr = {obj};
        HashMap hashMap = new HashMap();
        hashMap.put(0, obj2);
        v(objArr, hashMap);
    }

    public void v(Object[] objArr, Map map) {
        e();
        this.f15740a.R(objArr, map);
    }
}
