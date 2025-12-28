package com.bumptech.glide;

import X0.a;
import androidx.core.util.d;
import c1.n;
import c1.o;
import c1.p;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.load.engine.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l1.C0787a;
import l1.C0788b;
import l1.C0789c;
import l1.C0790d;
import l1.e;
import l1.f;
import q1.C0864a;

public class Registry {

    /* renamed from: a  reason: collision with root package name */
    private final p f10712a;

    /* renamed from: b  reason: collision with root package name */
    private final C0787a f10713b;

    /* renamed from: c  reason: collision with root package name */
    private final e f10714c;

    /* renamed from: d  reason: collision with root package name */
    private final f f10715d;

    /* renamed from: e  reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f10716e;

    /* renamed from: f  reason: collision with root package name */
    private final j1.f f10717f;

    /* renamed from: g  reason: collision with root package name */
    private final C0788b f10718g;

    /* renamed from: h  reason: collision with root package name */
    private final C0790d f10719h = new C0790d();

    /* renamed from: i  reason: collision with root package name */
    private final C0789c f10720i = new C0789c();

    /* renamed from: j  reason: collision with root package name */
    private final d f10721j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(M m4, List<n> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m4);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        d e4 = C0864a.e();
        this.f10721j = e4;
        this.f10712a = new p(e4);
        this.f10713b = new C0787a();
        this.f10714c = new e();
        this.f10715d = new f();
        this.f10716e = new com.bumptech.glide.load.data.f();
        this.f10717f = new j1.f();
        this.f10718g = new C0788b();
        r(Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"}));
    }

    private List f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f10714c.d(cls, cls2)) {
            for (Class cls5 : this.f10717f.b(cls4, cls3)) {
                arrayList.add(new g(cls, cls4, cls5, this.f10714c.b(cls, cls4), this.f10717f.a(cls4, cls5), this.f10721j));
            }
        }
        return arrayList;
    }

    public Registry a(Class cls, a aVar) {
        this.f10713b.a(cls, aVar);
        return this;
    }

    public Registry b(Class cls, X0.f fVar) {
        this.f10715d.a(cls, fVar);
        return this;
    }

    public Registry c(Class cls, Class cls2, X0.e eVar) {
        e("legacy_append", cls, cls2, eVar);
        return this;
    }

    public Registry d(Class cls, Class cls2, o oVar) {
        this.f10712a.a(cls, cls2, oVar);
        return this;
    }

    public Registry e(String str, Class cls, Class cls2, X0.e eVar) {
        this.f10714c.a(str, eVar, cls, cls2);
        return this;
    }

    public List g() {
        List b4 = this.f10718g.b();
        if (!b4.isEmpty()) {
            return b4;
        }
        throw new NoImageHeaderParserException();
    }

    public q h(Class cls, Class cls2, Class cls3) {
        q a4 = this.f10720i.a(cls, cls2, cls3);
        if (this.f10720i.c(a4)) {
            return null;
        }
        if (a4 == null) {
            List f4 = f(cls, cls2, cls3);
            if (f4.isEmpty()) {
                a4 = null;
            } else {
                a4 = new q(cls, cls2, cls3, f4, this.f10721j);
            }
            this.f10720i.d(cls, cls2, cls3, a4);
        }
        return a4;
    }

    public List i(Object obj) {
        return this.f10712a.d(obj);
    }

    public List j(Class cls, Class cls2, Class cls3) {
        List a4 = this.f10719h.a(cls, cls2, cls3);
        if (a4 == null) {
            a4 = new ArrayList();
            for (Class d4 : this.f10712a.c(cls)) {
                for (Class cls4 : this.f10714c.d(d4, cls2)) {
                    if (!this.f10717f.b(cls4, cls3).isEmpty() && !a4.contains(cls4)) {
                        a4.add(cls4);
                    }
                }
            }
            this.f10719h.b(cls, cls2, cls3, Collections.unmodifiableList(a4));
        }
        return a4;
    }

    public X0.f k(s sVar) {
        X0.f b4 = this.f10715d.b(sVar.c());
        if (b4 != null) {
            return b4;
        }
        throw new NoResultEncoderAvailableException(sVar.c());
    }

    public com.bumptech.glide.load.data.e l(Object obj) {
        return this.f10716e.a(obj);
    }

    public a m(Object obj) {
        a b4 = this.f10713b.b(obj.getClass());
        if (b4 != null) {
            return b4;
        }
        throw new NoSourceEncoderAvailableException(obj.getClass());
    }

    public boolean n(s sVar) {
        if (this.f10715d.b(sVar.c()) != null) {
            return true;
        }
        return false;
    }

    public Registry o(ImageHeaderParser imageHeaderParser) {
        this.f10718g.a(imageHeaderParser);
        return this;
    }

    public Registry p(e.a aVar) {
        this.f10716e.b(aVar);
        return this;
    }

    public Registry q(Class cls, Class cls2, j1.e eVar) {
        this.f10717f.c(cls, cls2, eVar);
        return this;
    }

    public final Registry r(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f10714c.e(arrayList);
        return this;
    }
}
