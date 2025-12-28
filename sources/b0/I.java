package B0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

public final class I implements A {

    /* renamed from: a  reason: collision with root package name */
    private double f66a;

    /* renamed from: b  reason: collision with root package name */
    private List f67b;

    /* renamed from: c  reason: collision with root package name */
    private List f68c;

    public I(double d4, z zVar) {
        o.e(zVar, "dataProvider");
        this.f66a = d4;
        J a4 = zVar.a();
        this.f67b = a4.c();
        this.f68c = a4.d();
    }

    public Double[][] g(List list) {
        o.e(list, "data");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                return (Double[][]) arrayList.toArray(new Double[0][]);
            }
            List list2 = (List) it.next();
            int size = list2.size();
            Double[] dArr = new Double[size];
            for (int i4 = 0; i4 < size; i4++) {
                dArr[i4] = Double.valueOf(0.0d);
            }
            int size2 = list2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                dArr[i5] = Double.valueOf((((Number) list2.get(i5)).doubleValue() - ((Number) this.f67b.get(i5)).doubleValue()) / (((Number) this.f68c.get(i5)).doubleValue() + this.f66a));
            }
            arrayList.add(dArr);
        }
    }
}
