package s;

import java.util.HashMap;
import java.util.Map;
import s.C0890b;

/* renamed from: s.a  reason: case insensitive filesystem */
public class C0889a extends C0890b {

    /* renamed from: e  reason: collision with root package name */
    private final HashMap f16255e = new HashMap();

    /* access modifiers changed from: protected */
    public C0890b.c c(Object obj) {
        return (C0890b.c) this.f16255e.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f16255e.containsKey(obj);
    }

    public Object g(Object obj, Object obj2) {
        C0890b.c c4 = c(obj);
        if (c4 != null) {
            return c4.f16261b;
        }
        this.f16255e.put(obj, f(obj, obj2));
        return null;
    }

    public Object h(Object obj) {
        Object h4 = super.h(obj);
        this.f16255e.remove(obj);
        return h4;
    }

    public Map.Entry i(Object obj) {
        if (contains(obj)) {
            return ((C0890b.c) this.f16255e.get(obj)).f16263d;
        }
        return null;
    }
}
