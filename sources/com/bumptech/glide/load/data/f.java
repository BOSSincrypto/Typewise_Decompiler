package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p1.k;

public class f {

    /* renamed from: b  reason: collision with root package name */
    private static final e.a f10828b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map f10829a = new HashMap();

    class a implements e.a {
        a() {
        }

        public Class a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        public e b(Object obj) {
            return new b(obj);
        }
    }

    private static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final Object f10830a;

        b(Object obj) {
            this.f10830a = obj;
        }

        public Object a() {
            return this.f10830a;
        }

        public void b() {
        }
    }

    public synchronized e a(Object obj) {
        e.a aVar;
        try {
            k.d(obj);
            aVar = (e.a) this.f10829a.get(obj.getClass());
            if (aVar == null) {
                Iterator it = this.f10829a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a aVar2 = (e.a) it.next();
                    if (aVar2.a().isAssignableFrom(obj.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f10828b;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return aVar.b(obj);
    }

    public synchronized void b(e.a aVar) {
        this.f10829a.put(aVar.a(), aVar);
    }
}
