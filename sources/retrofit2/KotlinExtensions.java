package retrofit2;

import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0747k;
import kotlinx.coroutines.C0748l;

public abstract class KotlinExtensions {

    public static final class a implements C0879f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0747k f16182a;

        a(C0747k kVar) {
            this.f16182a = kVar;
        }

        public void a(C0877d dVar, J j4) {
            o.e(dVar, "call");
            o.e(j4, "response");
            if (j4.e()) {
                Object a4 = j4.a();
                if (a4 == null) {
                    Object i4 = dVar.a().i(v.class);
                    o.b(i4);
                    v vVar = (v) i4;
                    Class b4 = vVar.b();
                    Method a5 = vVar.a();
                    KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException("Response from " + b4.getName() + '.' + a5.getName() + " was null but response body type was declared as non-null");
                    C0747k kVar = this.f16182a;
                    Result.a aVar = Result.Companion;
                    kVar.resumeWith(Result.m1constructorimpl(f.a(kotlinNullPointerException)));
                    return;
                }
                this.f16182a.resumeWith(Result.m1constructorimpl(a4));
                return;
            }
            C0747k kVar2 = this.f16182a;
            Result.a aVar2 = Result.Companion;
            kVar2.resumeWith(Result.m1constructorimpl(f.a(new HttpException(j4))));
        }

        public void b(C0877d dVar, Throwable th) {
            o.e(dVar, "call");
            o.e(th, "t");
            C0747k kVar = this.f16182a;
            Result.a aVar = Result.Companion;
            kVar.resumeWith(Result.m1constructorimpl(f.a(th)));
        }
    }

    public static final class b implements C0879f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0747k f16183a;

        b(C0747k kVar) {
            this.f16183a = kVar;
        }

        public void a(C0877d dVar, J j4) {
            o.e(dVar, "call");
            o.e(j4, "response");
            if (j4.e()) {
                C0747k kVar = this.f16183a;
                Result.a aVar = Result.Companion;
                kVar.resumeWith(Result.m1constructorimpl(j4.a()));
                return;
            }
            C0747k kVar2 = this.f16183a;
            Result.a aVar2 = Result.Companion;
            kVar2.resumeWith(Result.m1constructorimpl(f.a(new HttpException(j4))));
        }

        public void b(C0877d dVar, Throwable th) {
            o.e(dVar, "call");
            o.e(th, "t");
            C0747k kVar = this.f16183a;
            Result.a aVar = Result.Companion;
            kVar.resumeWith(Result.m1constructorimpl(f.a(th)));
        }
    }

    public static final class c implements C0879f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0747k f16184a;

        c(C0747k kVar) {
            this.f16184a = kVar;
        }

        public void a(C0877d dVar, J j4) {
            o.e(dVar, "call");
            o.e(j4, "response");
            this.f16184a.resumeWith(Result.m1constructorimpl(j4));
        }

        public void b(C0877d dVar, Throwable th) {
            o.e(dVar, "call");
            o.e(th, "t");
            C0747k kVar = this.f16184a;
            Result.a aVar = Result.Companion;
            kVar.resumeWith(Result.m1constructorimpl(f.a(th)));
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.c f16185a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f16186b;

        d(kotlin.coroutines.c cVar, Throwable th) {
            this.f16185a = cVar;
            this.f16186b = th;
        }

        public final void run() {
            kotlin.coroutines.c d4 = kotlin.coroutines.intrinsics.a.d(this.f16185a);
            Result.a aVar = Result.Companion;
            d4.resumeWith(Result.m1constructorimpl(f.a(this.f16186b)));
        }
    }

    public static final Object a(C0877d dVar, kotlin.coroutines.c cVar) {
        C0748l lVar = new C0748l(kotlin.coroutines.intrinsics.a.d(cVar), 1);
        lVar.z();
        lVar.j(new KotlinExtensions$await$2$1(dVar));
        dVar.m(new a(lVar));
        Object v3 = lVar.v();
        if (v3 == kotlin.coroutines.intrinsics.a.f()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return v3;
    }

    public static final Object b(C0877d dVar, kotlin.coroutines.c cVar) {
        C0748l lVar = new C0748l(kotlin.coroutines.intrinsics.a.d(cVar), 1);
        lVar.z();
        lVar.j(new KotlinExtensions$await$4$1(dVar));
        dVar.m(new b(lVar));
        Object v3 = lVar.v();
        if (v3 == kotlin.coroutines.intrinsics.a.f()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return v3;
    }

    public static final Object c(C0877d dVar, kotlin.coroutines.c cVar) {
        C0748l lVar = new C0748l(kotlin.coroutines.intrinsics.a.d(cVar), 1);
        lVar.z();
        lVar.j(new KotlinExtensions$awaitResponse$2$1(dVar));
        dVar.m(new c(lVar));
        Object v3 = lVar.v();
        if (v3 == kotlin.coroutines.intrinsics.a.f()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return v3;
    }

    public static final Object d(C0877d dVar, kotlin.coroutines.c cVar) {
        o.c(dVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return b(dVar, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(java.lang.Throwable r4, kotlin.coroutines.c r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002d:
            java.lang.Object r4 = r0.L$0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlin.f.b(r5)
            goto L_0x005c
        L_0x0035:
            kotlin.f.b(r5)
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.P.a()
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            retrofit2.KotlinExtensions$d r3 = new retrofit2.KotlinExtensions$d
            r3.<init>(r0, r4)
            r5.p0(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.f()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.f()
            if (r4 != r5) goto L_0x0059
            kotlin.coroutines.jvm.internal.f.c(r0)
        L_0x0059:
            if (r4 != r1) goto L_0x005c
            return r1
        L_0x005c:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.e(java.lang.Throwable, kotlin.coroutines.c):java.lang.Object");
    }
}
