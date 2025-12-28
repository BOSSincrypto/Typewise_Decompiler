package ch.icoaching.typewise.language_modelling.preprocessing;

import ch.icoaching.typewise.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;

public abstract class c extends a {

    /* renamed from: d  reason: collision with root package name */
    private final int f8793d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f8794e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f8795f;

    /* renamed from: g  reason: collision with root package name */
    private final String f8796g;

    /* renamed from: h  reason: collision with root package name */
    private final String f8797h;

    /* renamed from: i  reason: collision with root package name */
    private final String f8798i;

    /* renamed from: j  reason: collision with root package name */
    private final String f8799j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f8800k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f8801l;

    /* renamed from: m  reason: collision with root package name */
    private final Integer f8802m;

    /* renamed from: n  reason: collision with root package name */
    private final List f8803n;

    /* renamed from: o  reason: collision with root package name */
    private final Integer f8804o;

    /* renamed from: p  reason: collision with root package name */
    private Integer f8805p;

    /* renamed from: q  reason: collision with root package name */
    private final Integer f8806q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, String str2, int i4, Map map, Map map2, String str3, String str4, String str5, String str6, boolean z3, boolean z4, boolean z5) {
        super(str, str2, z3);
        o.e(str, "level");
        o.e(str2, "processSamplesApproach");
        o.e(map, "id2tok");
        o.e(map2, "tok2id");
        o.e(str3, "startToken");
        o.e(str4, "unkToken");
        o.e(str5, "endToken");
        o.e(str6, "padToken");
        this.f8793d = i4;
        this.f8794e = map;
        this.f8795f = map2;
        this.f8796g = str3;
        this.f8797h = str4;
        this.f8798i = str5;
        this.f8799j = str6;
        this.f8800k = z3;
        this.f8801l = z5;
        this.f8802m = (Integer) map2.get(str6);
        this.f8803n = C0718m.m(str3, str4, str5, str6);
        this.f8804o = (Integer) map2.get(str3);
        this.f8805p = (Integer) map2.get(str4);
        this.f8806q = (Integer) map2.get(str5);
        if (l()) {
            e.l(e.f8233a, "PreprocessingWithVocab", "map_stop_tokens_to_space = True is deprecated", (Throwable) null, 4, (Object) null);
        }
    }

    public final List g(String str, int i4, boolean z3) {
        List list;
        o.e(str, "text");
        String c4 = c(str, i4);
        if (c4.length() == 0) {
            list = C0718m.o(this.f8796g);
        } else {
            list = C0718m.D0(f(c4));
            if (z3) {
                list.add(0, this.f8796g);
            }
        }
        return j(list);
    }

    /* access modifiers changed from: protected */
    public final List h() {
        return this.f8803n;
    }

    public final List i(List list) {
        o.e(list, "indices");
        ArrayList arrayList = new ArrayList(C0718m.t(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = this.f8794e.get(Integer.valueOf(((Number) it.next()).intValue()));
            o.b(obj);
            arrayList.add((String) obj);
        }
        return arrayList;
    }

    public List j(List list) {
        o.e(list, "tokens");
        ArrayList arrayList = new ArrayList(C0718m.t(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) this.f8795f.get((String) it.next());
            if (num == null) {
                num = this.f8805p;
                o.b(num);
            }
            arrayList.add(Integer.valueOf(num.intValue()));
        }
        return arrayList;
    }

    public final Map k() {
        return this.f8794e;
    }

    public abstract boolean l();

    public final Map m() {
        return this.f8795f;
    }

    public List n() {
        List<Number> p02 = C0718m.p0(this.f8794e.keySet());
        ArrayList arrayList = new ArrayList(C0718m.t(p02, 10));
        for (Number intValue : p02) {
            Object obj = this.f8794e.get(Integer.valueOf(intValue.intValue()));
            o.b(obj);
            arrayList.add((String) obj);
        }
        return arrayList;
    }

    public final int o() {
        return this.f8793d;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c(java.lang.String r16, java.lang.String r17, int r18, java.util.Map r19, java.util.Map r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, boolean r26, boolean r27, int r28, kotlin.jvm.internal.i r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0009
            r1 = 1
            r12 = r1
            goto L_0x000b
        L_0x0009:
            r12 = r25
        L_0x000b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L_0x0012
            r13 = r2
            goto L_0x0014
        L_0x0012:
            r13 = r26
        L_0x0014:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x001a
            r14 = r2
            goto L_0x001c
        L_0x001a:
            r14 = r27
        L_0x001c:
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.typewise.language_modelling.preprocessing.c.<init>(java.lang.String, java.lang.String, int, java.util.Map, java.util.Map, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }
}
