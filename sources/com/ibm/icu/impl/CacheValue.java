package com.ibm.icu.impl;

import com.ibm.icu.util.ICUException;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;

public abstract class CacheValue {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Strength f12533a = Strength.SOFT;

    /* renamed from: b  reason: collision with root package name */
    private static final CacheValue f12534b = new b();

    public enum Strength {
        STRONG,
        SOFT
    }

    private static final class b extends CacheValue {
        private b() {
        }

        public Object b() {
            return null;
        }

        public boolean d() {
            return true;
        }

        public Object e(Object obj) {
            if (obj == null) {
                return null;
            }
            throw new ICUException("resetting a null value to a non-null value");
        }
    }

    private static final class c extends CacheValue {

        /* renamed from: c  reason: collision with root package name */
        private volatile Reference f12536c;

        c(Object obj) {
            this.f12536c = new SoftReference(obj);
        }

        public Object b() {
            return this.f12536c.get();
        }

        public synchronized Object e(Object obj) {
            Object obj2 = this.f12536c.get();
            if (obj2 != null) {
                return obj2;
            }
            this.f12536c = new SoftReference(obj);
            return obj;
        }
    }

    private static final class d extends CacheValue {

        /* renamed from: c  reason: collision with root package name */
        private Object f12537c;

        d(Object obj) {
            this.f12537c = obj;
        }

        public Object b() {
            return this.f12537c;
        }

        public Object e(Object obj) {
            return this.f12537c;
        }
    }

    public static boolean a() {
        if (f12533a == Strength.STRONG) {
            return true;
        }
        return false;
    }

    public static CacheValue c(Object obj) {
        if (obj == null) {
            return f12534b;
        }
        if (f12533a == Strength.STRONG) {
            return new d(obj);
        }
        return new c(obj);
    }

    public abstract Object b();

    public boolean d() {
        return false;
    }

    public abstract Object e(Object obj);
}
