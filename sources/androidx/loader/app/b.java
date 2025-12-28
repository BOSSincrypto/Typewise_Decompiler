package androidx.loader.app;

import androidx.lifecycle.E;
import androidx.lifecycle.F;
import androidx.lifecycle.G;
import androidx.lifecycle.I;
import androidx.lifecycle.m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.uuid.Uuid;
import y.h;

class b extends a {

    /* renamed from: a  reason: collision with root package name */
    private final m f6098a;

    /* renamed from: b  reason: collision with root package name */
    private final a f6099b;

    static class a extends E {

        /* renamed from: f  reason: collision with root package name */
        private static final F.b f6100f = new C0101a();

        /* renamed from: d  reason: collision with root package name */
        private h f6101d = new h();

        /* renamed from: e  reason: collision with root package name */
        private boolean f6102e = false;

        /* renamed from: androidx.loader.app.b$a$a  reason: collision with other inner class name */
        static class C0101a implements F.b {
            C0101a() {
            }

            public E a(Class cls) {
                return new a();
            }

            public /* synthetic */ E b(Class cls, U.a aVar) {
                return G.b(this, cls, aVar);
            }
        }

        a() {
        }

        static a g(I i4) {
            return (a) new F(i4, f6100f).a(a.class);
        }

        /* access modifiers changed from: protected */
        public void d() {
            super.d();
            if (this.f6101d.o() <= 0) {
                this.f6101d.c();
            } else {
                androidx.appcompat.app.F.a(this.f6101d.p(0));
                throw null;
            }
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f6101d.o() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                if (this.f6101d.o() > 0) {
                    androidx.appcompat.app.F.a(this.f6101d.p(0));
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f6101d.l(0));
                    printWriter.print(": ");
                    throw null;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void h() {
            if (this.f6101d.o() > 0) {
                androidx.appcompat.app.F.a(this.f6101d.p(0));
                throw null;
            }
        }
    }

    b(m mVar, I i4) {
        this.f6098a = mVar;
        this.f6099b = a.g(i4);
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f6099b.f(str, fileDescriptor, printWriter, strArr);
    }

    public void c() {
        this.f6099b.h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.core.util.b.a(this.f6098a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
