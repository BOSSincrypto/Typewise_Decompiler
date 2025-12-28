package androidx.work;

import android.net.Network;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import n0.c;

public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    private UUID f7086a;

    /* renamed from: b  reason: collision with root package name */
    private e f7087b;

    /* renamed from: c  reason: collision with root package name */
    private Set f7088c;

    /* renamed from: d  reason: collision with root package name */
    private a f7089d;

    /* renamed from: e  reason: collision with root package name */
    private int f7090e;

    /* renamed from: f  reason: collision with root package name */
    private Executor f7091f;

    /* renamed from: g  reason: collision with root package name */
    private c f7092g;

    /* renamed from: h  reason: collision with root package name */
    private v f7093h;

    /* renamed from: i  reason: collision with root package name */
    private q f7094i;

    /* renamed from: j  reason: collision with root package name */
    private h f7095j;

    /* renamed from: k  reason: collision with root package name */
    private int f7096k;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List f7097a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List f7098b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f7099c;
    }

    public WorkerParameters(UUID uuid, e eVar, Collection collection, a aVar, int i4, int i5, Executor executor, c cVar, v vVar, q qVar, h hVar) {
        this.f7086a = uuid;
        this.f7087b = eVar;
        this.f7088c = new HashSet(collection);
        this.f7089d = aVar;
        this.f7090e = i4;
        this.f7096k = i5;
        this.f7091f = executor;
        this.f7092g = cVar;
        this.f7093h = vVar;
        this.f7094i = qVar;
        this.f7095j = hVar;
    }

    public Executor a() {
        return this.f7091f;
    }

    public h b() {
        return this.f7095j;
    }

    public UUID c() {
        return this.f7086a;
    }

    public e d() {
        return this.f7087b;
    }

    public c e() {
        return this.f7092g;
    }

    public v f() {
        return this.f7093h;
    }
}
