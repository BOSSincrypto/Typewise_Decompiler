package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.i;
import java.util.concurrent.Executor;

public abstract class g {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f5058a;

        /* renamed from: b  reason: collision with root package name */
        private final b[] f5059b;

        public a(int i4, b[] bVarArr) {
            this.f5058a = i4;
            this.f5059b = bVarArr;
        }

        static a a(int i4, b[] bVarArr) {
            return new a(i4, bVarArr);
        }

        public b[] b() {
            return this.f5059b;
        }

        public int c() {
            return this.f5058a;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f5060a;

        /* renamed from: b  reason: collision with root package name */
        private final int f5061b;

        /* renamed from: c  reason: collision with root package name */
        private final int f5062c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f5063d;

        /* renamed from: e  reason: collision with root package name */
        private final int f5064e;

        public b(Uri uri, int i4, int i5, boolean z3, int i6) {
            this.f5060a = (Uri) androidx.core.util.g.g(uri);
            this.f5061b = i4;
            this.f5062c = i5;
            this.f5063d = z3;
            this.f5064e = i6;
        }

        static b a(Uri uri, int i4, int i5, boolean z3, int i6) {
            return new b(uri, i4, i5, z3, i6);
        }

        public int b() {
            return this.f5064e;
        }

        public int c() {
            return this.f5061b;
        }

        public Uri d() {
            return this.f5060a;
        }

        public int e() {
            return this.f5062c;
        }

        public boolean f() {
            return this.f5063d;
        }
    }

    public static class c {
        public abstract void a(int i4);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return i.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i4, boolean z3, int i5, Handler handler, c cVar) {
        a aVar = new a(cVar, handler);
        if (z3) {
            return f.e(context, eVar, aVar, i4, i5);
        }
        return f.d(context, eVar, i4, (Executor) null, aVar);
    }
}
