package w;

import android.os.Bundle;
import u.C0901a;
import v.C0917a;
import v.C0918b;
import v.C0919c;
import v.d;

/* renamed from: w.a  reason: case insensitive filesystem */
public abstract class C0927a {

    /* renamed from: w.a$a  reason: collision with other inner class name */
    public static final class C0247a extends C0917a implements C0901a.C0244a {

        /* renamed from: w.a$a$a  reason: collision with other inner class name */
        public static final class C0248a extends C0917a.C0245a {
            C0248a() {
                super("style_v1");
            }

            public C0247a a() {
                return new C0247a(this.f16387a);
            }

            public C0248a b(d dVar) {
                dVar.c();
                this.f16387a.putBundle("chip_style", dVar.a());
                return this;
            }

            public C0248a c(C0918b bVar) {
                bVar.c();
                this.f16387a.putBundle("end_icon_style", bVar.a());
                return this;
            }

            public C0248a d(C0918b bVar) {
                bVar.c();
                this.f16387a.putBundle("single_icon_chip_icon_style", bVar.a());
                return this;
            }

            public C0248a e(d dVar) {
                dVar.c();
                this.f16387a.putBundle("single_icon_chip_style", dVar.a());
                return this;
            }

            public C0248a f(C0918b bVar) {
                bVar.c();
                this.f16387a.putBundle("start_icon_style", bVar.a());
                return this;
            }

            public C0248a g(C0919c cVar) {
                cVar.c();
                this.f16387a.putBundle("subtitle_style", cVar.a());
                return this;
            }

            public C0248a h(C0919c cVar) {
                cVar.c();
                this.f16387a.putBundle("title_style", cVar.a());
                return this;
            }
        }

        C0247a(Bundle bundle) {
            super(bundle);
        }

        public String b() {
            return "androidx.autofill.inline.ui.version:v1";
        }

        /* access modifiers changed from: protected */
        public String d() {
            return "style_v1";
        }
    }

    public static C0247a.C0248a a() {
        return new C0247a.C0248a();
    }
}
