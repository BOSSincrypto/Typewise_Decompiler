package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.y;
import retrofit2.C0878e;

/* renamed from: retrofit2.l  reason: case insensitive filesystem */
final class C0885l extends C0878e.a {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f16210a;

    /* renamed from: retrofit2.l$a */
    class a implements C0878e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f16211a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Executor f16212b;

        a(Type type, Executor executor) {
            this.f16211a = type;
            this.f16212b = executor;
        }

        public Type a() {
            return this.f16211a;
        }

        /* renamed from: c */
        public C0877d b(C0877d dVar) {
            Executor executor = this.f16212b;
            if (executor == null) {
                return dVar;
            }
            return new b(executor, dVar);
        }
    }

    /* renamed from: retrofit2.l$b */
    static final class b implements C0877d {

        /* renamed from: a  reason: collision with root package name */
        final Executor f16214a;

        /* renamed from: b  reason: collision with root package name */
        final C0877d f16215b;

        /* renamed from: retrofit2.l$b$a */
        class a implements C0879f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0879f f16216a;

            a(C0879f fVar) {
                this.f16216a = fVar;
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void e(C0879f fVar, Throwable th) {
                fVar.b(b.this, th);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void f(C0879f fVar, J j4) {
                if (b.this.f16215b.e()) {
                    fVar.b(b.this, new IOException("Canceled"));
                } else {
                    fVar.a(b.this, j4);
                }
            }

            public void a(C0877d dVar, J j4) {
                b.this.f16214a.execute(new C0886m(this, this.f16216a, j4));
            }

            public void b(C0877d dVar, Throwable th) {
                b.this.f16214a.execute(new C0887n(this, this.f16216a, th));
            }
        }

        b(Executor executor, C0877d dVar) {
            this.f16214a = executor;
            this.f16215b = dVar;
        }

        public y a() {
            return this.f16215b.a();
        }

        public void cancel() {
            this.f16215b.cancel();
        }

        public boolean e() {
            return this.f16215b.e();
        }

        /* renamed from: f */
        public C0877d clone() {
            return new b(this.f16214a, this.f16215b.f());
        }

        public void m(C0879f fVar) {
            Objects.requireNonNull(fVar, "callback == null");
            this.f16215b.m(new a(fVar));
        }
    }

    C0885l(Executor executor) {
        this.f16210a = executor;
    }

    public C0878e a(Type type, Annotation[] annotationArr, K k4) {
        Executor executor = null;
        if (C0878e.a.c(type) != C0877d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type g4 = O.g(0, (ParameterizedType) type);
            if (!O.l(annotationArr, M.class)) {
                executor = this.f16210a;
            }
            return new a(g4, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
