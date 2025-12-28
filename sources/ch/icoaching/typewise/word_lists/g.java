package ch.icoaching.typewise.word_lists;

import ch.icoaching.typewise.word_lists.d;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import n2.C0830a;
import v2.C0925a;
import y0.C0946c;

public final class g extends WordList {

    /* renamed from: c  reason: collision with root package name */
    public static final a f8950c = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final e f8951a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map f8952b;

    public static final class a {

        /* renamed from: ch.icoaching.typewise.word_lists.g$a$a  reason: collision with other inner class name */
        public static final class C0147a implements Comparator {
            public final int compare(Object obj, Object obj2) {
                return C0830a.a(Integer.valueOf(((d) ((Pair) obj2).component2()).a()), Integer.valueOf(((d) ((Pair) obj).component2()).a()));
            }
        }

        private a() {
        }

        public static /* synthetic */ g a(a aVar, Iterable iterable, e eVar, d dVar, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                dVar = null;
            }
            return aVar.b(iterable, eVar, dVar);
        }

        public final g b(Iterable iterable, e eVar, d dVar) {
            d dVar2;
            boolean z3;
            boolean z4;
            boolean z5;
            o.e(iterable, "words");
            o.e(eVar, "info");
            List<String> p02 = C0718m.p0(iterable);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : p02) {
                if (str.length() != 0) {
                    if (C0946c.s(str)) {
                        String lowerCase = str.toLowerCase(Locale.ROOT);
                        o.d(lowerCase, "toLowerCase(...)");
                        if (dVar == null) {
                            dVar2 = d.a.c(d.f8938f, str, 0, 2, (Object) null);
                        } else {
                            dVar2 = dVar;
                        }
                        if (linkedHashMap.containsKey(lowerCase)) {
                            Object obj = linkedHashMap.get(lowerCase);
                            o.b(obj);
                            d dVar3 = (d) obj;
                            if (dVar2.b() || dVar3.b()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (dVar2.d() || dVar3.d()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (dVar2.c() || dVar3.c()) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            String e4 = dVar2.e();
                            if (e4 == null) {
                                e4 = dVar3.e();
                            }
                            linkedHashMap.put(lowerCase, new d(1, z3, z4, z5, e4));
                        } else {
                            linkedHashMap.put(lowerCase, dVar2);
                        }
                    } else {
                        throw new IllegalArgumentException("Invalid word '" + str + "'.");
                    }
                }
            }
            return new g(eVar, D.o(C0718m.r0(D.u(linkedHashMap), new C0147a())));
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public static final class b implements Iterator, C0925a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator f8953a;

        b(g gVar) {
            this.f8953a = gVar.f8952b.entrySet().iterator();
        }

        /* renamed from: b */
        public Pair next() {
            Map.Entry entry = (Map.Entry) this.f8953a.next();
            return l2.g.a(entry.getKey(), entry.getValue());
        }

        public boolean hasNext() {
            return this.f8953a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(e eVar, Map map) {
        o.e(eVar, "info");
        o.e(map, "wordToEntry");
        this.f8951a = eVar;
        this.f8952b = map;
    }

    public boolean c(String str) {
        o.e(str, "word");
        return this.f8952b.containsKey(str);
    }

    public d g(String str) {
        o.e(str, "word");
        return (d) this.f8952b.get(str);
    }

    public Iterator iterator() {
        return new b(this);
    }

    public Iterator l() {
        return this.f8952b.keySet().iterator();
    }

    public int m() {
        return this.f8952b.size();
    }

    public Set n() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashSet.addAll(((d) pair.component2()).g((String) pair.component1()));
        }
        return linkedHashSet;
    }
}
