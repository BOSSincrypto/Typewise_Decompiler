package J2;

import A2.c;
import F2.b;
import H2.f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class A0 extends C0322q {

    /* renamed from: b  reason: collision with root package name */
    private final c f606b;

    /* renamed from: c  reason: collision with root package name */
    private final f f607c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public A0(c cVar, b bVar) {
        super(bVar, (i) null);
        o.e(cVar, "kClass");
        o.e(bVar, "eSerializer");
        this.f606b = cVar;
        this.f607c = new C0296d(bVar.a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Object[] q(ArrayList arrayList) {
        o.e(arrayList, "<this>");
        return C0313l0.n(arrayList, this.f606b);
    }

    public f a() {
        return this.f607c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public ArrayList f() {
        return new ArrayList();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public int g(ArrayList arrayList) {
        o.e(arrayList, "<this>");
        return arrayList.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void h(ArrayList arrayList, int i4) {
        o.e(arrayList, "<this>");
        arrayList.ensureCapacity(i4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Iterator i(Object[] objArr) {
        o.e(objArr, "<this>");
        return kotlin.jvm.internal.b.a(objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int j(Object[] objArr) {
        o.e(objArr, "<this>");
        return objArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void s(ArrayList arrayList, int i4, Object obj) {
        o.e(arrayList, "<this>");
        arrayList.add(i4, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public ArrayList p(Object[] objArr) {
        o.e(objArr, "<this>");
        return new ArrayList(C0713h.c(objArr));
    }
}
