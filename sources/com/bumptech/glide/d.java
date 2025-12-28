package com.bumptech.glide;

import Z0.b;
import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.b;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.request.e;
import java.util.List;
import java.util.Map;
import p1.f;

public class d extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    static final j f10752k = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b f10753a;

    /* renamed from: b  reason: collision with root package name */
    private final f.b f10754b;

    /* renamed from: c  reason: collision with root package name */
    private final m1.f f10755c;

    /* renamed from: d  reason: collision with root package name */
    private final b.a f10756d;

    /* renamed from: e  reason: collision with root package name */
    private final List f10757e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f10758f;

    /* renamed from: g  reason: collision with root package name */
    private final i f10759g;

    /* renamed from: h  reason: collision with root package name */
    private final e f10760h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10761i;

    /* renamed from: j  reason: collision with root package name */
    private e f10762j;

    public d(Context context, Z0.b bVar, f.b bVar2, m1.f fVar, b.a aVar, Map map, List list, i iVar, e eVar, int i4) {
        super(context.getApplicationContext());
        this.f10753a = bVar;
        this.f10755c = fVar;
        this.f10756d = aVar;
        this.f10757e = list;
        this.f10758f = map;
        this.f10759g = iVar;
        this.f10760h = eVar;
        this.f10761i = i4;
        this.f10754b = f.a(bVar2);
    }

    public m1.i a(ImageView imageView, Class cls) {
        return this.f10755c.a(imageView, cls);
    }

    public Z0.b b() {
        return this.f10753a;
    }

    public List c() {
        return this.f10757e;
    }

    public synchronized e d() {
        try {
            if (this.f10762j == null) {
                this.f10762j = (e) this.f10756d.a().O();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.f10762j;
    }

    public j e(Class cls) {
        j jVar = (j) this.f10758f.get(cls);
        if (jVar == null) {
            for (Map.Entry entry : this.f10758f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    jVar = (j) entry.getValue();
                }
            }
        }
        if (jVar == null) {
            return f10752k;
        }
        return jVar;
    }

    public i f() {
        return this.f10759g;
    }

    public e g() {
        return this.f10760h;
    }

    public int h() {
        return this.f10761i;
    }

    public Registry i() {
        return (Registry) this.f10754b.get();
    }
}
