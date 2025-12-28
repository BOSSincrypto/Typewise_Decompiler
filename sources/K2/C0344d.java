package K2;

import L2.b;
import kotlin.jvm.internal.o;
import kotlinx.serialization.json.ClassDiscriminatorMode;

/* renamed from: K2.d  reason: case insensitive filesystem */
public final class C0344d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f822a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f823b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f824c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f825d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f826e;

    /* renamed from: f  reason: collision with root package name */
    private String f827f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f828g;

    /* renamed from: h  reason: collision with root package name */
    private String f829h;

    /* renamed from: i  reason: collision with root package name */
    private ClassDiscriminatorMode f830i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f831j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f832k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f833l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f834m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f835n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f836o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f837p;

    /* renamed from: q  reason: collision with root package name */
    private b f838q;

    public C0344d(C0341a aVar) {
        o.e(aVar, "json");
        this.f822a = aVar.d().i();
        this.f823b = aVar.d().j();
        this.f824c = aVar.d().k();
        this.f825d = aVar.d().q();
        this.f826e = aVar.d().m();
        this.f827f = aVar.d().n();
        this.f828g = aVar.d().g();
        this.f829h = aVar.d().e();
        this.f830i = aVar.d().f();
        this.f831j = aVar.d().o();
        aVar.d().l();
        this.f832k = aVar.d().h();
        this.f833l = aVar.d().d();
        this.f834m = aVar.d().a();
        this.f835n = aVar.d().b();
        this.f836o = aVar.d().c();
        this.f837p = aVar.d().p();
        this.f838q = aVar.a();
    }

    public final C0346f a() {
        if (this.f837p) {
            if (!o.a(this.f829h, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            } else if (this.f830i != ClassDiscriminatorMode.POLYMORPHIC) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (!this.f826e) {
            if (!o.a(this.f827f, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
            }
        } else if (!o.a(this.f827f, "    ")) {
            String str = this.f827f;
            int i4 = 0;
            while (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if (charAt == ' ' || charAt == 9 || charAt == 13 || charAt == 10) {
                    i4++;
                } else {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f827f).toString());
                }
            }
        }
        return new C0346f(this.f822a, this.f824c, this.f825d, this.f836o, this.f826e, this.f823b, this.f827f, this.f828g, this.f837p, this.f829h, this.f835n, this.f831j, (x) null, this.f832k, this.f833l, this.f834m, this.f830i);
    }

    public final b b() {
        return this.f838q;
    }

    public final void c(ClassDiscriminatorMode classDiscriminatorMode) {
        o.e(classDiscriminatorMode, "<set-?>");
        this.f830i = classDiscriminatorMode;
    }

    public final void d(boolean z3) {
        this.f823b = z3;
    }

    public final void e(boolean z3) {
        this.f824c = z3;
    }

    public final void f(b bVar) {
        o.e(bVar, "<set-?>");
        this.f838q = bVar;
    }
}
