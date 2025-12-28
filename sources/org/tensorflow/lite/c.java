package org.tensorflow.lite;

import java.nio.ByteBuffer;
import java.util.Map;
import org.tensorflow.lite.e;

public final class c extends e implements AutoCloseable {

    /* renamed from: c  reason: collision with root package name */
    private final NativeInterpreterWrapperExperimental f15739c;

    public static class a extends e.a {
    }

    public c(ByteBuffer byteBuffer) {
        this(byteBuffer, (a) null);
    }

    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public /* bridge */ /* synthetic */ f f(int i4) {
        return super.f(i4);
    }

    public /* bridge */ /* synthetic */ f h(int i4) {
        return super.h(i4);
    }

    public /* bridge */ /* synthetic */ String[] m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ void o(Object obj, Object obj2) {
        super.o(obj, obj2);
    }

    public /* bridge */ /* synthetic */ void v(Object[] objArr, Map map) {
        super.v(objArr, map);
    }

    public c(ByteBuffer byteBuffer, a aVar) {
        this(new NativeInterpreterWrapperExperimental(byteBuffer, aVar));
    }

    private c(NativeInterpreterWrapperExperimental nativeInterpreterWrapperExperimental) {
        super(nativeInterpreterWrapperExperimental);
        this.f15739c = nativeInterpreterWrapperExperimental;
    }
}
