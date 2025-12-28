package com.ibm.icu.impl.locale;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap f12892a;

    /* renamed from: b  reason: collision with root package name */
    private ReferenceQueue f12893b;

    private static class a extends SoftReference {

        /* renamed from: a  reason: collision with root package name */
        private Object f12894a;

        a(Object obj, Object obj2, ReferenceQueue referenceQueue) {
            super(obj2, referenceQueue);
            this.f12894a = obj;
        }

        /* access modifiers changed from: package-private */
        public Object a() {
            return this.f12894a;
        }
    }

    public i() {
        this(16, 0.75f, 16);
    }

    private void a() {
        while (true) {
            a aVar = (a) this.f12893b.poll();
            if (aVar != null) {
                this.f12892a.remove(aVar.a());
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object b(Object obj);

    public Object c(Object obj) {
        Object obj2;
        a();
        a aVar = (a) this.f12892a.get(obj);
        if (aVar != null) {
            obj2 = aVar.get();
        } else {
            obj2 = null;
        }
        if (obj2 != null) {
            return obj2;
        }
        Object d4 = d(obj);
        Object b4 = b(d4);
        if (d4 == null || b4 == null) {
            return null;
        }
        a aVar2 = new a(d4, b4, this.f12893b);
        while (obj2 == null) {
            a();
            a aVar3 = (a) this.f12892a.putIfAbsent(d4, aVar2);
            if (aVar3 == null) {
                return b4;
            }
            obj2 = aVar3.get();
        }
        return obj2;
    }

    /* access modifiers changed from: protected */
    public abstract Object d(Object obj);

    public i(int i4, float f4, int i5) {
        this.f12893b = new ReferenceQueue();
        this.f12892a = new ConcurrentHashMap(i4, f4, i5);
    }
}
