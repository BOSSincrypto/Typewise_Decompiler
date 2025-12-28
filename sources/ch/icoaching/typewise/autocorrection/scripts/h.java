package ch.icoaching.typewise.autocorrection.scripts;

import E0.m;
import ch.icoaching.typewise.config.CompanyConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class h {

    /* renamed from: i  reason: collision with root package name */
    public static final a f8083i = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Iterator f8084a;

    /* renamed from: b  reason: collision with root package name */
    private Set f8085b;

    /* renamed from: c  reason: collision with root package name */
    private Map f8086c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f8087d;

    /* renamed from: e  reason: collision with root package name */
    private int f8088e;

    /* renamed from: f  reason: collision with root package name */
    private final float f8089f;

    /* renamed from: g  reason: collision with root package name */
    private final int f8090g;

    /* renamed from: h  reason: collision with root package name */
    private float f8091h;

    public static final class a {
        private a() {
        }

        public final List a(Set set) {
            o.e(set, "edits");
            return C0718m.p0(set);
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public h(Iterator it, CompanyConfig.b bVar, int i4) {
        o.e(it, "initialWords");
        o.e(bVar, "correctionConfig");
        this.f8084a = it;
        this.f8086c = new HashMap();
        this.f8087d = new HashSet();
        float p4 = bVar.j().p();
        this.f8089f = p4;
        int s4 = bVar.j().s();
        this.f8090g = s4;
        this.f8091h = i4 == 0 ? (s4 <= 6 || s4 > 16) ? 2.0f : 3.0f : (float) i4;
        if (p4 < 0.0f) {
            throw new IllegalArgumentException(("maxEditDistance " + p4 + " cannot be negative!").toString());
        } else if (s4 < 1 || ((float) s4) <= p4) {
            throw new IllegalArgumentException(("prefixLength " + s4 + " cannot be less than 1 or smaller than maxEditDistance (" + p4 + ")!").toString());
        } else {
            a();
        }
    }

    public final void a() {
        for (String b4 : C0718m.p0(m.i(this.f8084a))) {
            b(b4);
        }
    }

    public final void b(String str) {
        o.e(str, "key");
        if (!this.f8087d.contains(str)) {
            this.f8087d.add(str);
            if (str.length() > this.f8088e) {
                this.f8088e = str.length();
            }
            a aVar = f8083i;
            Set set = this.f8085b;
            if (set == null) {
                set = c(str);
            }
            for (String str2 : aVar.a(set)) {
                if (this.f8086c.get(str2) == null) {
                    this.f8086c.put(str2, new HashSet());
                }
                Set set2 = (Set) this.f8086c.get(str2);
                if (set2 != null) {
                    set2.add(str);
                }
            }
        }
    }

    public final Set c(String str) {
        o.e(str, "key");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (((float) str.length()) <= this.f8091h) {
            linkedHashSet.add("");
        }
        int length = str.length();
        int i4 = this.f8090g;
        if (length > i4) {
            str = str.substring(0, i4);
            o.d(str, "substring(...)");
        }
        linkedHashSet.add(str);
        return e(str, 0.0f, linkedHashSet);
    }

    public final Map d() {
        return this.f8086c;
    }

    public final Set e(String str, float f4, Set set) {
        o.e(str, "word");
        o.e(set, "deleteWords");
        float f5 = f4 + 1.0f;
        int length = str.length();
        if (length > 1) {
            int i4 = 0;
            while (i4 < length) {
                String substring = str.substring(0, i4);
                o.d(substring, "substring(...)");
                i4++;
                String substring2 = str.substring(i4);
                o.d(substring2, "substring(...)");
                String str2 = substring + substring2;
                if (!set.contains(str2)) {
                    set.add(str2);
                    if (f5 < this.f8091h) {
                        e(str2, f5, set);
                    }
                }
            }
        }
        return set;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Iterator it, CompanyConfig.b bVar, int i4, int i5, i iVar) {
        this(it, bVar, (i5 & 4) != 0 ? 0 : i4);
    }
}
