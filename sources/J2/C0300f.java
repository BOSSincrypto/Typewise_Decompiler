package J2;

import F2.b;
import H2.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: J2.f  reason: case insensitive filesystem */
public final class C0300f extends r {

    /* renamed from: b  reason: collision with root package name */
    private final f f697b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0300f(b bVar) {
        super(bVar);
        o.e(bVar, "element");
        this.f697b = new C0298e(bVar.a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public List q(ArrayList arrayList) {
        o.e(arrayList, "<this>");
        return arrayList;
    }

    public f a() {
        return this.f697b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public ArrayList f() {
        return new ArrayList();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int g(ArrayList arrayList) {
        o.e(arrayList, "<this>");
        return arrayList.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void h(ArrayList arrayList, int i4) {
        o.e(arrayList, "<this>");
        arrayList.ensureCapacity(i4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void s(ArrayList arrayList, int i4, Object obj) {
        o.e(arrayList, "<this>");
        arrayList.add(i4, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public ArrayList p(List list) {
        ArrayList arrayList;
        o.e(list, "<this>");
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return new ArrayList(list);
        }
        return arrayList;
    }
}
