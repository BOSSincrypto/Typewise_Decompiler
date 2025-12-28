package j2;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;

/* renamed from: j2.c  reason: case insensitive filesystem */
public abstract class C0690c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f13764a = "c";

    /* renamed from: j2.c$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final View f13765a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f13766b;

        /* renamed from: c  reason: collision with root package name */
        private final C0689b f13767c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f13768d;

        /* renamed from: e  reason: collision with root package name */
        private int f13769e = 300;

        public a(Context context) {
            this.f13766b = context;
            View view = new View(context);
            this.f13765a = view;
            view.setTag(C0690c.f13764a);
            this.f13767c = new C0689b();
        }

        public b a(View view) {
            return new b(this.f13766b, view, this.f13767c, this.f13768d);
        }

        public a b(int i4) {
            this.f13767c.f13763e = i4;
            return this;
        }

        public a c(int i4) {
            this.f13767c.f13761c = i4;
            return this;
        }

        public a d(int i4) {
            this.f13767c.f13762d = i4;
            return this;
        }
    }

    /* renamed from: j2.c$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f13770a;

        /* renamed from: b  reason: collision with root package name */
        private final View f13771b;

        /* renamed from: c  reason: collision with root package name */
        private final C0689b f13772c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f13773d;

        public b(Context context, View view, C0689b bVar, boolean z3) {
            this.f13770a = context;
            this.f13771b = view;
            this.f13772c = bVar;
            this.f13773d = z3;
        }

        public Bitmap a() {
            if (!this.f13773d) {
                this.f13772c.f13759a = this.f13771b.getMeasuredWidth();
                this.f13772c.f13760b = this.f13771b.getMeasuredHeight();
                return C0688a.b(this.f13771b, this.f13772c);
            }
            throw new IllegalArgumentException("Use getAsync() instead of async().");
        }
    }

    public static a b(Context context) {
        return new a(context);
    }
}
