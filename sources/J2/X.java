package J2;

import F2.b;
import H2.f;
import H2.l;
import H2.n;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;
import v2.C0925a;

public final class X extends M {

    /* renamed from: c  reason: collision with root package name */
    private final f f674c;

    private static final class a implements Map.Entry, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f675a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f676b;

        public a(Object obj, Object obj2) {
            this.f675a = obj;
            this.f676b = obj2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (o.a(this.f675a, aVar.f675a) && o.a(this.f676b, aVar.f676b)) {
                return true;
            }
            return false;
        }

        public Object getKey() {
            return this.f675a;
        }

        public Object getValue() {
            return this.f676b;
        }

        public int hashCode() {
            int i4;
            Object obj = this.f675a;
            int i5 = 0;
            if (obj == null) {
                i4 = 0;
            } else {
                i4 = obj.hashCode();
            }
            int i6 = i4 * 31;
            Object obj2 = this.f676b;
            if (obj2 != null) {
                i5 = obj2.hashCode();
            }
            return i6 + i5;
        }

        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f675a + ", value=" + this.f676b + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public X(b bVar, b bVar2) {
        super(bVar, bVar2, (i) null);
        o.e(bVar, "keySerializer");
        o.e(bVar2, "valueSerializer");
        this.f674c = l.d("kotlin.collections.Map.Entry", n.c.f577a, new f[0], new W(bVar, bVar2));
    }

    /* access modifiers changed from: private */
    public static final q l(b bVar, b bVar2, H2.a aVar) {
        o.e(aVar, "$this$buildSerialDescriptor");
        H2.a aVar2 = aVar;
        H2.a.b(aVar2, "key", bVar.a(), (List) null, false, 12, (Object) null);
        H2.a.b(aVar2, "value", bVar2.a(), (List) null, false, 12, (Object) null);
        return q.f14567a;
    }

    public f a() {
        return this.f674c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Object f(Map.Entry entry) {
        o.e(entry, "<this>");
        return entry.getKey();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Object h(Map.Entry entry) {
        o.e(entry, "<this>");
        return entry.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public Map.Entry j(Object obj, Object obj2) {
        return new a(obj, obj2);
    }
}
