package J2;

import F2.b;
import H2.a;
import H2.f;
import H2.l;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.g;
import l2.q;

/* renamed from: J2.k0  reason: case insensitive filesystem */
public final class C0311k0 extends M {

    /* renamed from: c  reason: collision with root package name */
    private final f f716c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0311k0(b bVar, b bVar2) {
        super(bVar, bVar2, (i) null);
        o.e(bVar, "keySerializer");
        o.e(bVar2, "valueSerializer");
        this.f716c = l.c("kotlin.Pair", new f[0], new C0309j0(bVar, bVar2));
    }

    /* access modifiers changed from: private */
    public static final q l(b bVar, b bVar2, a aVar) {
        o.e(aVar, "$this$buildClassSerialDescriptor");
        a aVar2 = aVar;
        a.b(aVar2, "first", bVar.a(), (List) null, false, 12, (Object) null);
        a.b(aVar2, "second", bVar2.a(), (List) null, false, 12, (Object) null);
        return q.f14567a;
    }

    public f a() {
        return this.f716c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Object f(Pair pair) {
        o.e(pair, "<this>");
        return pair.getFirst();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Object h(Pair pair) {
        o.e(pair, "<this>");
        return pair.getSecond();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public Pair j(Object obj, Object obj2) {
        return g.a(obj, obj2);
    }
}
