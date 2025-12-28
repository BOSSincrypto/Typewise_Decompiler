package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public abstract class E {

    /* renamed from: a  reason: collision with root package name */
    private final Map f5993a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Set f5994b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f5995c = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f5995c = true;
        Map map = this.f5993a;
        if (map != null) {
            synchronized (map) {
                try {
                    for (Object b4 : this.f5993a.values()) {
                        b(b4);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Set set = this.f5994b;
        if (set != null) {
            synchronized (set) {
                try {
                    for (Closeable b5 : this.f5994b) {
                        b(b5);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        d();
    }

    /* access modifiers changed from: package-private */
    public Object c(String str) {
        Object obj;
        Map map = this.f5993a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.f5993a.get(str);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public void d() {
    }

    /* access modifiers changed from: package-private */
    public Object e(String str, Object obj) {
        Object obj2;
        synchronized (this.f5993a) {
            try {
                obj2 = this.f5993a.get(str);
                if (obj2 == null) {
                    this.f5993a.put(str, obj);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f5995c) {
            b(obj);
        }
        return obj;
    }
}
