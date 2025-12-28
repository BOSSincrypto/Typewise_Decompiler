package v;

import android.os.Bundle;
import v.d;

/* renamed from: v.c  reason: case insensitive filesystem */
public final class C0919c extends d {

    /* renamed from: v.c$a */
    public static final class a extends d.a {
        public a() {
            super("text_view_style");
        }

        public C0919c e() {
            return new C0919c(this.f16387a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public a a() {
            return this;
        }

        public a g(int i4) {
            this.f16387a.putInt("text_color", i4);
            return this;
        }

        public a h(float f4) {
            this.f16387a.putFloat("text_size", f4);
            return this;
        }
    }

    public C0919c(Bundle bundle) {
        super(bundle);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "text_view_style";
    }
}
