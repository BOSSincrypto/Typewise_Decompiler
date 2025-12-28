package J2;

import F2.b;
import H2.f;
import I2.d;
import I2.e;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

/* renamed from: J2.x0  reason: case insensitive filesystem */
public abstract class C0336x0 extends C0322q {

    /* renamed from: b  reason: collision with root package name */
    private final f f760b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0336x0(b bVar) {
        super(bVar, (i) null);
        o.e(bVar, "primitiveSerializer");
        this.f760b = new C0334w0(bVar.a());
    }

    public final f a() {
        return this.f760b;
    }

    public final Object b(e eVar) {
        o.e(eVar, "decoder");
        return k(eVar, (Object) null);
    }

    public final void e(I2.f fVar, Object obj) {
        o.e(fVar, "encoder");
        int j4 = j(obj);
        f fVar2 = this.f760b;
        d x3 = fVar.x(fVar2, j4);
        z(x3, obj, j4);
        x3.c(fVar2);
    }

    /* access modifiers changed from: protected */
    public final Iterator i(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final C0332v0 f() {
        return (C0332v0) p(w());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final int g(C0332v0 v0Var) {
        o.e(v0Var, "<this>");
        return v0Var.d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void h(C0332v0 v0Var, int i4) {
        o.e(v0Var, "<this>");
        v0Var.b(i4);
    }

    /* access modifiers changed from: protected */
    public abstract Object w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void s(C0332v0 v0Var, int i4, Object obj) {
        o.e(v0Var, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final Object q(C0332v0 v0Var) {
        o.e(v0Var, "<this>");
        return v0Var.a();
    }

    /* access modifiers changed from: protected */
    public abstract void z(d dVar, Object obj, int i4);
}
