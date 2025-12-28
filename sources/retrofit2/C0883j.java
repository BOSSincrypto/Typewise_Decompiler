package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.C0878e;

/* renamed from: retrofit2.j  reason: case insensitive filesystem */
final class C0883j extends C0878e.a {

    /* renamed from: retrofit2.j$a */
    private static final class a implements C0878e {

        /* renamed from: a  reason: collision with root package name */
        private final Type f16203a;

        /* renamed from: retrofit2.j$a$a  reason: collision with other inner class name */
        private class C0230a implements C0879f {

            /* renamed from: a  reason: collision with root package name */
            private final CompletableFuture f16204a;

            public C0230a(CompletableFuture completableFuture) {
                this.f16204a = completableFuture;
            }

            public void a(C0877d dVar, J j4) {
                if (j4.e()) {
                    boolean unused = this.f16204a.complete(j4.a());
                } else {
                    boolean unused2 = this.f16204a.completeExceptionally(new HttpException(j4));
                }
            }

            public void b(C0877d dVar, Throwable th) {
                boolean unused = this.f16204a.completeExceptionally(th);
            }
        }

        a(Type type) {
            this.f16203a = type;
        }

        public Type a() {
            return this.f16203a;
        }

        /* renamed from: c */
        public CompletableFuture b(C0877d dVar) {
            b bVar = new b(dVar);
            dVar.m(new C0230a(bVar));
            return bVar;
        }
    }

    /* renamed from: retrofit2.j$b */
    private static final class b extends CompletableFuture {

        /* renamed from: a  reason: collision with root package name */
        private final C0877d f16206a;

        b(C0877d dVar) {
            this.f16206a = dVar;
        }

        public boolean cancel(boolean z3) {
            if (z3) {
                this.f16206a.cancel();
            }
            return super.cancel(z3);
        }
    }

    /* renamed from: retrofit2.j$c */
    private static final class c implements C0878e {

        /* renamed from: a  reason: collision with root package name */
        private final Type f16207a;

        /* renamed from: retrofit2.j$c$a */
        private class a implements C0879f {

            /* renamed from: a  reason: collision with root package name */
            private final CompletableFuture f16208a;

            public a(CompletableFuture completableFuture) {
                this.f16208a = completableFuture;
            }

            public void a(C0877d dVar, J j4) {
                boolean unused = this.f16208a.complete(j4);
            }

            public void b(C0877d dVar, Throwable th) {
                boolean unused = this.f16208a.completeExceptionally(th);
            }
        }

        c(Type type) {
            this.f16207a = type;
        }

        public Type a() {
            return this.f16207a;
        }

        /* renamed from: c */
        public CompletableFuture b(C0877d dVar) {
            b bVar = new b(dVar);
            dVar.m(new a(bVar));
            return bVar;
        }
    }

    C0883j() {
    }

    public C0878e a(Type type, Annotation[] annotationArr, K k4) {
        if (C0878e.a.c(type) != C0880g.a()) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b4 = C0878e.a.b(0, (ParameterizedType) type);
            if (C0878e.a.c(b4) != J.class) {
                return new a(b4);
            }
            if (b4 instanceof ParameterizedType) {
                return new c(C0878e.a.b(0, (ParameterizedType) b4));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
