package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final Map f10763a;

    static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Map f10764a = new HashMap();

        a() {
        }

        /* access modifiers changed from: package-private */
        public e b() {
            return new e(this);
        }
    }

    e(a aVar) {
        this.f10763a = Collections.unmodifiableMap(new HashMap(aVar.f10764a));
    }

    public boolean a(Class cls) {
        return this.f10763a.containsKey(cls);
    }
}
