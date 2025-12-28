package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.d;
import androidx.savedstate.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.D;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.k;
import l2.g;

public final class z {

    /* renamed from: f  reason: collision with root package name */
    public static final a f6091f = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Class[] f6092g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    private final Map f6093a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f6094b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f6095c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f6096d;

    /* renamed from: e  reason: collision with root package name */
    private final a.c f6097e;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public final z a(Bundle bundle, Bundle bundle2) {
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    throw new IllegalStateException("Invalid bundle passed as restored state");
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj = parcelableArrayList.get(i4);
                    o.c(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i4));
                }
                return new z(linkedHashMap);
            } else if (bundle2 == null) {
                return new z();
            } else {
                HashMap hashMap = new HashMap();
                for (String next : bundle2.keySet()) {
                    o.d(next, "key");
                    hashMap.put(next, bundle2.get(next));
                }
                return new z(hashMap);
            }
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : z.f6092g) {
                o.b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }
    }

    public z(Map map) {
        o.e(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f6093a = linkedHashMap;
        this.f6094b = new LinkedHashMap();
        this.f6095c = new LinkedHashMap();
        this.f6096d = new LinkedHashMap();
        this.f6097e = new y(this);
        linkedHashMap.putAll(map);
    }

    /* access modifiers changed from: private */
    public static final Bundle d(z zVar) {
        o.e(zVar, "this$0");
        for (Map.Entry entry : D.q(zVar.f6094b).entrySet()) {
            zVar.e((String) entry.getKey(), ((a.c) entry.getValue()).a());
        }
        Set<String> keySet = zVar.f6093a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(zVar.f6093a.get(str));
        }
        return d.a(g.a("keys", arrayList), g.a("values", arrayList2));
    }

    public final a.c c() {
        return this.f6097e;
    }

    public final void e(String str, Object obj) {
        r rVar;
        o.e(str, "key");
        if (f6091f.b(obj)) {
            Object obj2 = this.f6095c.get(str);
            if (obj2 instanceof r) {
                rVar = (r) obj2;
            } else {
                rVar = null;
            }
            if (rVar != null) {
                rVar.j(obj);
            } else {
                this.f6093a.put(str, obj);
            }
            k kVar = (k) this.f6096d.get(str);
            if (kVar != null) {
                kVar.setValue(obj);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        o.b(obj);
        sb.append(obj.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }

    public z() {
        this.f6093a = new LinkedHashMap();
        this.f6094b = new LinkedHashMap();
        this.f6095c = new LinkedHashMap();
        this.f6096d = new LinkedHashMap();
        this.f6097e = new y(this);
    }
}
