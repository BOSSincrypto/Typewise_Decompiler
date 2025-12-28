package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.d;
import j1.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p1.k;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private final Class f10941a;

    /* renamed from: b  reason: collision with root package name */
    private final List f10942b;

    /* renamed from: c  reason: collision with root package name */
    private final e f10943c;

    /* renamed from: d  reason: collision with root package name */
    private final d f10944d;

    /* renamed from: e  reason: collision with root package name */
    private final String f10945e;

    interface a {
        s a(s sVar);
    }

    public g(Class cls, Class cls2, Class cls3, List list, e eVar, d dVar) {
        this.f10941a = cls;
        this.f10942b = list;
        this.f10943c = eVar;
        this.f10944d = dVar;
        this.f10945e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private s b(com.bumptech.glide.load.data.e eVar, int i4, int i5, X0.d dVar) {
        List list = (List) k.d(this.f10944d.b());
        try {
            return c(eVar, i4, i5, dVar, list);
        } finally {
            this.f10944d.a(list);
        }
    }

    private s c(com.bumptech.glide.load.data.e eVar, int i4, int i5, X0.d dVar, List list) {
        int size = this.f10942b.size();
        s sVar = null;
        for (int i6 = 0; i6 < size; i6++) {
            X0.e eVar2 = (X0.e) this.f10942b.get(i6);
            try {
                if (eVar2.b(eVar.a(), dVar)) {
                    sVar = eVar2.a(eVar.a(), i4, i5, dVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e4) {
                if (Log.isLoggable("DecodePath", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(eVar2);
                }
                list.add(e4);
            }
            if (sVar != null) {
                break;
            }
        }
        if (sVar != null) {
            return sVar;
        }
        throw new GlideException(this.f10945e, (List<Throwable>) new ArrayList(list));
    }

    public s a(com.bumptech.glide.load.data.e eVar, int i4, int i5, X0.d dVar, a aVar) {
        return this.f10943c.a(aVar.a(b(eVar, i4, i5, dVar)), dVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f10941a + ", decoders=" + this.f10942b + ", transcoder=" + this.f10943c + '}';
    }
}
