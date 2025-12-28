package x2;

import java.util.Random;
import kotlin.jvm.internal.o;

/* renamed from: x2.b  reason: case insensitive filesystem */
public final class C0937b extends C0936a {

    /* renamed from: b  reason: collision with root package name */
    private final a f16397b = new a();

    /* renamed from: x2.b$a */
    public static final class a extends ThreadLocal {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    public Random a() {
        Object obj = this.f16397b.get();
        o.d(obj, "get(...)");
        return (Random) obj;
    }
}
