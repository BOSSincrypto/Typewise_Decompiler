package com.bumptech.glide.load.engine;

import androidx.core.util.d;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.engine.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p1.k;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private final Class f11028a;

    /* renamed from: b  reason: collision with root package name */
    private final d f11029b;

    /* renamed from: c  reason: collision with root package name */
    private final List f11030c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11031d;

    public q(Class cls, Class cls2, Class cls3, List list, d dVar) {
        this.f11028a = cls;
        this.f11029b = dVar;
        this.f11030c = (List) k.c(list);
        this.f11031d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private s b(e eVar, X0.d dVar, int i4, int i5, g.a aVar, List list) {
        List list2 = list;
        int size = this.f11030c.size();
        s sVar = null;
        for (int i6 = 0; i6 < size; i6++) {
            try {
                sVar = ((g) this.f11030c.get(i6)).a(eVar, i4, i5, dVar, aVar);
            } catch (GlideException e4) {
                list2.add(e4);
            }
            if (sVar != null) {
                break;
            }
        }
        if (sVar != null) {
            return sVar;
        }
        throw new GlideException(this.f11031d, (List<Throwable>) new ArrayList(list2));
    }

    public s a(e eVar, X0.d dVar, int i4, int i5, g.a aVar) {
        List list = (List) k.d(this.f11029b.b());
        try {
            return b(eVar, dVar, i4, i5, aVar, list);
        } finally {
            this.f11029b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f11030c.toArray()) + '}';
    }
}
