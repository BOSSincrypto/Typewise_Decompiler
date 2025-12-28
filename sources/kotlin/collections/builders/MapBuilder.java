package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C0707b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import m2.C0821b;
import v2.C0925a;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0007\b\u0000\u0018\u0000 \u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0007\u0001 &5\u001f\u0019BG\b\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u0013J\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00028\u0000H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u0013J\u0017\u0010+\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010\u001dJ\u0017\u0010,\u001a\u00020\f2\u0006\u0010\"\u001a\u00028\u0000H\u0002¢\u0006\u0004\b,\u0010$J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00028\u0001H\u0002¢\u0006\u0004\b.\u0010$J\u0017\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\fH\u0002¢\u0006\u0004\b0\u0010\u0013J\u0017\u00102\u001a\u00020\u00172\u0006\u00101\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u0010\u0013J\u001f\u00105\u001a\u00020\u001b2\u000e\u00104\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000303H\u0002¢\u0006\u0004\b5\u00106J#\u00109\u001a\u00020\u001b2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000107H\u0002¢\u0006\u0004\b9\u0010:J)\u0010=\u001a\u00020\u001b2\u0018\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001070;H\u0002¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u001bH\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u001b2\u0006\u0010-\u001a\u00028\u0001H\u0016¢\u0006\u0004\bE\u0010DJ\u001a\u0010F\u001a\u0004\u0018\u00018\u00012\u0006\u0010\"\u001a\u00028\u0000H\u0002¢\u0006\u0004\bF\u0010GJ!\u0010H\u001a\u0004\u0018\u00018\u00012\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010-\u001a\u00028\u0001H\u0016¢\u0006\u0004\bH\u0010IJ%\u0010J\u001a\u00020\u00172\u0014\u0010<\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103H\u0016¢\u0006\u0004\bJ\u0010KJ\u0019\u0010L\u001a\u0004\u0018\u00018\u00012\u0006\u0010\"\u001a\u00028\u0000H\u0016¢\u0006\u0004\bL\u0010GJ\u000f\u0010M\u001a\u00020\u0017H\u0016¢\u0006\u0004\bM\u0010\u0011J\u001a\u0010N\u001a\u00020\u001b2\b\u00104\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\bN\u0010DJ\u000f\u0010O\u001a\u00020\fH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bR\u0010SJ\u000f\u0010U\u001a\u00020\u0017H\u0000¢\u0006\u0004\bT\u0010\u0011J\u0017\u0010W\u001a\u00020\f2\u0006\u0010\"\u001a\u00028\u0000H\u0000¢\u0006\u0004\bV\u0010$J\u0017\u0010Y\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00028\u0000H\u0000¢\u0006\u0004\bX\u0010DJ#\u0010[\u001a\u00020\u001b2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000107H\u0000¢\u0006\u0004\bZ\u0010:J\u001b\u0010]\u001a\u00020\u001b2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030;H\u0000¢\u0006\u0004\b\\\u0010>J#\u0010_\u001a\u00020\u001b2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000107H\u0000¢\u0006\u0004\b^\u0010:J\u0017\u0010b\u001a\u00020\u001b2\u0006\u0010`\u001a\u00028\u0001H\u0000¢\u0006\u0004\ba\u0010DJ\u001b\u0010f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010cH\u0000¢\u0006\u0004\bd\u0010eJ\u001b\u0010j\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010gH\u0000¢\u0006\u0004\bh\u0010iJ\u001b\u0010n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010kH\u0000¢\u0006\u0004\bl\u0010mR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010oR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010oR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010pR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010pR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010qR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010qR\u0016\u0010r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\br\u0010qR\u0016\u0010s\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bs\u0010qR$\u0010u\u001a\u00020\f2\u0006\u0010t\u001a\u00020\f8\u0016@RX\u000e¢\u0006\f\n\u0004\bu\u0010q\u001a\u0004\bv\u0010PR\u001e\u0010x\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010w8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u001e\u0010{\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010z8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b{\u0010|R$\u0010~\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010}8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b~\u0010R(\u0010\u0001\u001a\u00020\u001b2\u0006\u0010t\u001a\u00020\u001b8\u0000@BX\u000e¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010BR\u0015\u0010\u0001\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010PR\u001e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00018VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u001e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u00018VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R+\u0010\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00010\u00018VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020\f8@X\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010P¨\u0006\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "keysArray", "valuesArray", "", "presenceArray", "hashArray", "", "maxProbeDistance", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "", "writeReplace", "()Ljava/lang/Object;", "Ll2/q;", "n", "f", "extraCapacity", "", "r", "(I)Z", "minCapacity", "e", "b", "()[Ljava/lang/Object;", "key", "j", "(Ljava/lang/Object;)I", "updateHashArray", "c", "(Z)V", "newHashSize", "o", "i", "m", "g", "value", "h", "index", "p", "removedHash", "q", "", "other", "d", "(Ljava/util/Map;)Z", "", "entry", "l", "(Ljava/util/Map$Entry;)Z", "", "from", "k", "(Ljava/util/Collection;)Z", "build", "()Ljava/util/Map;", "isEmpty", "()Z", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "(Ljava/util/Map;)V", "remove", "clear", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "checkIsMutable$kotlin_stdlib", "checkIsMutable", "addKey$kotlin_stdlib", "addKey", "removeKey$kotlin_stdlib", "removeKey", "containsEntry$kotlin_stdlib", "containsEntry", "containsAllEntries$kotlin_stdlib", "containsAllEntries", "removeEntry$kotlin_stdlib", "removeEntry", "element", "removeValue$kotlin_stdlib", "removeValue", "Lkotlin/collections/builders/MapBuilder$e;", "keysIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$e;", "keysIterator", "Lkotlin/collections/builders/MapBuilder$f;", "valuesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$f;", "valuesIterator", "Lkotlin/collections/builders/MapBuilder$b;", "entriesIterator$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder$b;", "entriesIterator", "[Ljava/lang/Object;", "[I", "I", "hashShift", "modCount", "<set-?>", "size", "getSize", "Lkotlin/collections/builders/b;", "keysView", "Lkotlin/collections/builders/b;", "Lkotlin/collections/builders/c;", "valuesView", "Lkotlin/collections/builders/c;", "Lkotlin/collections/builders/a;", "entriesView", "Lkotlin/collections/builders/a;", "isReadOnly", "Z", "isReadOnly$kotlin_stdlib", "hashSize", "", "getKeys", "()Ljava/util/Set;", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "", "getEntries", "entries", "getCapacity$kotlin_stdlib", "capacity", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, C0925a {
    public static final a Companion = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final MapBuilder f13847a;
    private a entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    /* access modifiers changed from: private */
    public K[] keysArray;
    private b keysView;
    /* access modifiers changed from: private */
    public int length;
    private int maxProbeDistance;
    /* access modifiers changed from: private */
    public int modCount;
    /* access modifiers changed from: private */
    public int[] presenceArray;
    private int size;
    /* access modifiers changed from: private */
    public V[] valuesArray;
    private c valuesView;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final int c(int i4) {
            return Integer.highestOneBit(z2.d.b(i4, 1) * 3);
        }

        /* access modifiers changed from: private */
        public final int d(int i4) {
            return Integer.numberOfLeadingZeros(i4) + 1;
        }

        public final MapBuilder e() {
            return MapBuilder.f13847a;
        }

        private a() {
        }
    }

    public static final class b extends d implements Iterator, C0925a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(MapBuilder mapBuilder) {
            super(mapBuilder);
            o.e(mapBuilder, "map");
        }

        /* renamed from: i */
        public c next() {
            b();
            if (c() < e().length) {
                int c4 = c();
                g(c4 + 1);
                h(c4);
                c cVar = new c(e(), d());
                f();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void j(StringBuilder sb) {
            o.e(sb, "sb");
            if (c() < e().length) {
                int c4 = c();
                g(c4 + 1);
                h(c4);
                Object obj = e().keysArray[d()];
                if (obj == e()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] access$getValuesArray$p = e().valuesArray;
                o.b(access$getValuesArray$p);
                Object obj2 = access$getValuesArray$p[d()];
                if (obj2 == e()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                f();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int k() {
            int i4;
            if (c() < e().length) {
                int c4 = c();
                g(c4 + 1);
                h(c4);
                Object obj = e().keysArray[d()];
                int i5 = 0;
                if (obj != null) {
                    i4 = obj.hashCode();
                } else {
                    i4 = 0;
                }
                Object[] access$getValuesArray$p = e().valuesArray;
                o.b(access$getValuesArray$p);
                Object obj2 = access$getValuesArray$p[d()];
                if (obj2 != null) {
                    i5 = obj2.hashCode();
                }
                int i6 = i4 ^ i5;
                f();
                return i6;
            }
            throw new NoSuchElementException();
        }
    }

    public static final class c implements Map.Entry, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private final MapBuilder f13848a;

        /* renamed from: b  reason: collision with root package name */
        private final int f13849b;

        public c(MapBuilder mapBuilder, int i4) {
            o.e(mapBuilder, "map");
            this.f13848a = mapBuilder;
            this.f13849b = i4;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (!o.a(entry.getKey(), getKey()) || !o.a(entry.getValue(), getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public Object getKey() {
            return this.f13848a.keysArray[this.f13849b];
        }

        public Object getValue() {
            Object[] access$getValuesArray$p = this.f13848a.valuesArray;
            o.b(access$getValuesArray$p);
            return access$getValuesArray$p[this.f13849b];
        }

        public int hashCode() {
            int i4;
            Object key = getKey();
            int i5 = 0;
            if (key != null) {
                i4 = key.hashCode();
            } else {
                i4 = 0;
            }
            Object value = getValue();
            if (value != null) {
                i5 = value.hashCode();
            }
            return i4 ^ i5;
        }

        public Object setValue(Object obj) {
            this.f13848a.checkIsMutable$kotlin_stdlib();
            Object[] access$allocateValuesArray = this.f13848a.b();
            int i4 = this.f13849b;
            Object obj2 = access$allocateValuesArray[i4];
            access$allocateValuesArray[i4] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final MapBuilder f13850a;

        /* renamed from: b  reason: collision with root package name */
        private int f13851b;

        /* renamed from: c  reason: collision with root package name */
        private int f13852c = -1;

        /* renamed from: d  reason: collision with root package name */
        private int f13853d;

        public d(MapBuilder mapBuilder) {
            o.e(mapBuilder, "map");
            this.f13850a = mapBuilder;
            this.f13853d = mapBuilder.modCount;
            f();
        }

        public final void b() {
            if (this.f13850a.modCount != this.f13853d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int c() {
            return this.f13851b;
        }

        public final int d() {
            return this.f13852c;
        }

        public final MapBuilder e() {
            return this.f13850a;
        }

        public final void f() {
            while (this.f13851b < this.f13850a.length) {
                int[] access$getPresenceArray$p = this.f13850a.presenceArray;
                int i4 = this.f13851b;
                if (access$getPresenceArray$p[i4] < 0) {
                    this.f13851b = i4 + 1;
                } else {
                    return;
                }
            }
        }

        public final void g(int i4) {
            this.f13851b = i4;
        }

        public final void h(int i4) {
            this.f13852c = i4;
        }

        public final boolean hasNext() {
            if (this.f13851b < this.f13850a.length) {
                return true;
            }
            return false;
        }

        public final void remove() {
            b();
            if (this.f13852c != -1) {
                this.f13850a.checkIsMutable$kotlin_stdlib();
                this.f13850a.p(this.f13852c);
                this.f13852c = -1;
                this.f13853d = this.f13850a.modCount;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
    }

    public static final class e extends d implements Iterator, C0925a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(MapBuilder mapBuilder) {
            super(mapBuilder);
            o.e(mapBuilder, "map");
        }

        public Object next() {
            b();
            if (c() < e().length) {
                int c4 = c();
                g(c4 + 1);
                h(c4);
                Object obj = e().keysArray[d()];
                f();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    public static final class f extends d implements Iterator, C0925a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(MapBuilder mapBuilder) {
            super(mapBuilder);
            o.e(mapBuilder, "map");
        }

        public Object next() {
            b();
            if (c() < e().length) {
                int c4 = c();
                g(c4 + 1);
                h(c4);
                Object[] access$getValuesArray$p = e().valuesArray;
                o.b(access$getValuesArray$p);
                Object obj = access$getValuesArray$p[d()];
                f();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        f13847a = mapBuilder;
    }

    private MapBuilder(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i4, int i5) {
        this.keysArray = objArr;
        this.valuesArray = objArr2;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i4;
        this.length = i5;
        this.hashShift = Companion.d(i());
    }

    /* access modifiers changed from: private */
    public final Object[] b() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] d4 = C0821b.d(getCapacity$kotlin_stdlib());
        this.valuesArray = d4;
        return d4;
    }

    private final void c(boolean z3) {
        int i4;
        V[] vArr = this.valuesArray;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i4 = this.length;
            if (i5 >= i4) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i7 = iArr[i5];
            if (i7 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i6] = kArr[i5];
                if (vArr != null) {
                    vArr[i6] = vArr[i5];
                }
                if (z3) {
                    iArr[i6] = i7;
                    this.hashArray[i7] = i6 + 1;
                }
                i6++;
            }
            i5++;
        }
        C0821b.g(this.keysArray, i6, i4);
        if (vArr != null) {
            C0821b.g(vArr, i6, this.length);
        }
        this.length = i6;
    }

    private final boolean d(Map map) {
        if (size() != map.size() || !containsAllEntries$kotlin_stdlib(map.entrySet())) {
            return false;
        }
        return true;
    }

    private final void e(int i4) {
        V[] vArr;
        if (i4 < 0) {
            throw new OutOfMemoryError();
        } else if (i4 > getCapacity$kotlin_stdlib()) {
            int e4 = C0707b.Companion.e(getCapacity$kotlin_stdlib(), i4);
            this.keysArray = C0821b.e(this.keysArray, e4);
            V[] vArr2 = this.valuesArray;
            if (vArr2 != null) {
                vArr = C0821b.e(vArr2, e4);
            } else {
                vArr = null;
            }
            this.valuesArray = vArr;
            int[] copyOf = Arrays.copyOf(this.presenceArray, e4);
            o.d(copyOf, "copyOf(...)");
            this.presenceArray = copyOf;
            int a4 = Companion.c(e4);
            if (a4 > i()) {
                o(a4);
            }
        }
    }

    private final void f(int i4) {
        if (r(i4)) {
            c(true);
        } else {
            e(this.length + i4);
        }
    }

    private final int g(Object obj) {
        int j4 = j(obj);
        int i4 = this.maxProbeDistance;
        while (true) {
            int i5 = this.hashArray[j4];
            if (i5 == 0) {
                return -1;
            }
            if (i5 > 0) {
                int i6 = i5 - 1;
                if (o.a(this.keysArray[i6], obj)) {
                    return i6;
                }
            }
            i4--;
            if (i4 < 0) {
                return -1;
            }
            int i7 = j4 - 1;
            if (j4 == 0) {
                j4 = i() - 1;
            } else {
                j4 = i7;
            }
        }
    }

    private final int h(Object obj) {
        int i4 = this.length;
        while (true) {
            i4--;
            if (i4 < 0) {
                return -1;
            }
            if (this.presenceArray[i4] >= 0) {
                V[] vArr = this.valuesArray;
                o.b(vArr);
                if (o.a(vArr[i4], obj)) {
                    return i4;
                }
            }
        }
    }

    private final int i() {
        return this.hashArray.length;
    }

    private final int j(Object obj) {
        int i4;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        return (i4 * -1640531527) >>> this.hashShift;
    }

    private final boolean k(Collection collection) {
        boolean z3 = false;
        if (collection.isEmpty()) {
            return false;
        }
        f(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (l((Map.Entry) it.next())) {
                z3 = true;
            }
        }
        return z3;
    }

    private final boolean l(Map.Entry entry) {
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        Object[] b4 = b();
        if (addKey$kotlin_stdlib >= 0) {
            b4[addKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i4 = (-addKey$kotlin_stdlib) - 1;
        if (o.a(entry.getValue(), b4[i4])) {
            return false;
        }
        b4[i4] = entry.getValue();
        return true;
    }

    private final boolean m(int i4) {
        int j4 = j(this.keysArray[i4]);
        int i5 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[j4] == 0) {
                iArr[j4] = i4 + 1;
                this.presenceArray[i4] = j4;
                return true;
            }
            i5--;
            if (i5 < 0) {
                return false;
            }
            int i6 = j4 - 1;
            if (j4 == 0) {
                j4 = i() - 1;
            } else {
                j4 = i6;
            }
        }
    }

    private final void n() {
        this.modCount++;
    }

    private final void o(int i4) {
        n();
        int i5 = 0;
        if (this.length > size()) {
            c(false);
        }
        this.hashArray = new int[i4];
        this.hashShift = Companion.d(i4);
        while (i5 < this.length) {
            int i6 = i5 + 1;
            if (m(i5)) {
                i5 = i6;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* access modifiers changed from: private */
    public final void p(int i4) {
        C0821b.f(this.keysArray, i4);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            C0821b.f(vArr, i4);
        }
        q(this.presenceArray[i4]);
        this.presenceArray[i4] = -1;
        this.size = size() - 1;
        n();
    }

    private final void q(int i4) {
        int d4 = z2.d.d(this.maxProbeDistance * 2, i() / 2);
        int i5 = 0;
        int i6 = i4;
        do {
            int i7 = i4 - 1;
            if (i4 == 0) {
                i4 = i() - 1;
            } else {
                i4 = i7;
            }
            i5++;
            if (i5 > this.maxProbeDistance) {
                this.hashArray[i6] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i8 = iArr[i4];
            if (i8 == 0) {
                iArr[i6] = 0;
                return;
            }
            if (i8 < 0) {
                iArr[i6] = -1;
            } else {
                int i9 = i8 - 1;
                if (((j(this.keysArray[i9]) - i4) & (i() - 1)) >= i5) {
                    this.hashArray[i6] = i8;
                    this.presenceArray[i9] = i6;
                }
                d4--;
            }
            i6 = i4;
            i5 = 0;
            d4--;
        } while (d4 >= 0);
        this.hashArray[i6] = -1;
    }

    private final boolean r(int i4) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i5 = this.length;
        int i6 = capacity$kotlin_stdlib - i5;
        int size2 = i5 - size();
        if (i6 >= i4 || i6 + size2 < i4 || size2 < getCapacity$kotlin_stdlib() / 4) {
            return false;
        }
        return true;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int addKey$kotlin_stdlib(K k4) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int j4 = j(k4);
            int d4 = z2.d.d(this.maxProbeDistance * 2, i() / 2);
            int i4 = 0;
            while (true) {
                int i5 = this.hashArray[j4];
                if (i5 <= 0) {
                    if (this.length >= getCapacity$kotlin_stdlib()) {
                        f(1);
                    } else {
                        int i6 = this.length;
                        int i7 = i6 + 1;
                        this.length = i7;
                        this.keysArray[i6] = k4;
                        this.presenceArray[i6] = j4;
                        this.hashArray[j4] = i7;
                        this.size = size() + 1;
                        n();
                        if (i4 > this.maxProbeDistance) {
                            this.maxProbeDistance = i4;
                        }
                        return i6;
                    }
                } else if (o.a(this.keysArray[i5 - 1], k4)) {
                    return -i5;
                } else {
                    i4++;
                    if (i4 > d4) {
                        o(i() * 2);
                        break;
                    }
                    int i8 = j4 - 1;
                    if (j4 == 0) {
                        j4 = i() - 1;
                    } else {
                        j4 = i8;
                    }
                }
            }
        }
    }

    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = f13847a;
        o.c(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        checkIsMutable$kotlin_stdlib();
        int i4 = this.length - 1;
        if (i4 >= 0) {
            int i5 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i6 = iArr[i5];
                if (i6 >= 0) {
                    this.hashArray[i6] = 0;
                    iArr[i5] = -1;
                }
                if (i5 == i4) {
                    break;
                }
                i5++;
            }
        }
        C0821b.g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            C0821b.g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        n();
    }

    public final boolean containsAllEntries$kotlin_stdlib(Collection<?> collection) {
        o.e(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        o.e(entry, "entry");
        int g4 = g(entry.getKey());
        if (g4 < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        o.b(vArr);
        return o.a(vArr[g4], entry.getValue());
    }

    public boolean containsKey(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (h(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final b entriesIterator$kotlin_stdlib() {
        return new b(this);
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof Map) && d((Map) obj))) {
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        int g4 = g(obj);
        if (g4 < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        o.b(vArr);
        return vArr[g4];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    public Set<Map.Entry<K, V>> getEntries() {
        a aVar = this.entriesView;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.entriesView = aVar2;
        return aVar2;
    }

    public Set<K> getKeys() {
        b bVar = this.keysView;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.keysView = bVar2;
        return bVar2;
    }

    public int getSize() {
        return this.size;
    }

    public Collection<V> getValues() {
        c cVar = this.valuesView;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.valuesView = cVar2;
        return cVar2;
    }

    public int hashCode() {
        b entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i4 = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            i4 += entriesIterator$kotlin_stdlib.k();
        }
        return i4;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.isReadOnly;
    }

    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    public final e keysIterator$kotlin_stdlib() {
        return new e(this);
    }

    public V put(K k4, V v3) {
        checkIsMutable$kotlin_stdlib();
        int addKey$kotlin_stdlib = addKey$kotlin_stdlib(k4);
        V[] b4 = b();
        if (addKey$kotlin_stdlib < 0) {
            int i4 = (-addKey$kotlin_stdlib) - 1;
            V v4 = b4[i4];
            b4[i4] = v3;
            return v4;
        }
        b4[addKey$kotlin_stdlib] = v3;
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        o.e(map, "from");
        checkIsMutable$kotlin_stdlib();
        k(map.entrySet());
    }

    public V remove(Object obj) {
        checkIsMutable$kotlin_stdlib();
        int g4 = g(obj);
        if (g4 < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        o.b(vArr);
        V v3 = vArr[g4];
        p(g4);
        return v3;
    }

    public final boolean removeEntry$kotlin_stdlib(Map.Entry<? extends K, ? extends V> entry) {
        o.e(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int g4 = g(entry.getKey());
        if (g4 < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        o.b(vArr);
        if (!o.a(vArr[g4], entry.getValue())) {
            return false;
        }
        p(g4);
        return true;
    }

    public final boolean removeKey$kotlin_stdlib(K k4) {
        checkIsMutable$kotlin_stdlib();
        int g4 = g(k4);
        if (g4 < 0) {
            return false;
        }
        p(g4);
        return true;
    }

    public final boolean removeValue$kotlin_stdlib(V v3) {
        checkIsMutable$kotlin_stdlib();
        int h4 = h(v3);
        if (h4 < 0) {
            return false;
        }
        p(h4);
        return true;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b entriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i4 = 0;
        while (entriesIterator$kotlin_stdlib.hasNext()) {
            if (i4 > 0) {
                sb.append(", ");
            }
            entriesIterator$kotlin_stdlib.j(sb);
            i4++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        o.d(sb2, "toString(...)");
        return sb2;
    }

    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public final f valuesIterator$kotlin_stdlib() {
        return new f(this);
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i4) {
        this(C0821b.d(i4), (Object[]) null, new int[i4], new int[Companion.c(i4)], 2, 0);
    }
}
