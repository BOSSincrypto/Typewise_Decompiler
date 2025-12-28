package K2;

import F2.a;
import F2.n;
import F2.q;
import L2.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlinx.serialization.json.internal.C;
import kotlinx.serialization.json.internal.D;
import kotlinx.serialization.json.internal.J;
import kotlinx.serialization.json.internal.M;
import kotlinx.serialization.json.internal.N;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.json.internal.u;

/* renamed from: K2.a  reason: case insensitive filesystem */
public abstract class C0341a implements q {

    /* renamed from: d  reason: collision with root package name */
    public static final C0006a f812d = new C0006a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final C0346f f813a;

    /* renamed from: b  reason: collision with root package name */
    private final b f814b;

    /* renamed from: c  reason: collision with root package name */
    private final u f815c;

    /* renamed from: K2.a$a  reason: collision with other inner class name */
    public static final class C0006a extends C0341a {
        public /* synthetic */ C0006a(i iVar) {
            this();
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C0006a() {
            /*
                r21 = this;
                K2.f r15 = new K2.f
                r0 = r15
                r18 = 131071(0x1ffff, float:1.8367E-40)
                r19 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r16 = 0
                r20 = r15
                r15 = r16
                r17 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                L2.b r0 = L2.c.a()
                r1 = 0
                r2 = r21
                r3 = r20
                r2.<init>(r3, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: K2.C0341a.C0006a.<init>():void");
        }
    }

    public /* synthetic */ C0341a(C0346f fVar, b bVar, i iVar) {
        this(fVar, bVar);
    }

    public b a() {
        return this.f814b;
    }

    public final String b(n nVar, Object obj) {
        o.e(nVar, "serializer");
        D d4 = new D();
        try {
            C.a(this, d4, nVar, obj);
            return d4.toString();
        } finally {
            d4.h();
        }
    }

    public final Object c(a aVar, String str) {
        o.e(aVar, "deserializer");
        o.e(str, "string");
        M a4 = N.a(this, str);
        Object w3 = new J(this, WriteMode.OBJ, a4, aVar.a(), (J.a) null).w(aVar);
        a4.v();
        return w3;
    }

    public final C0346f d() {
        return this.f813a;
    }

    public final u e() {
        return this.f815c;
    }

    private C0341a(C0346f fVar, b bVar) {
        this.f813a = fVar;
        this.f814b = bVar;
        this.f815c = new u();
    }
}
