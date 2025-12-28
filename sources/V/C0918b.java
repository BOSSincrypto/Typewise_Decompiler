package v;

import android.content.res.ColorStateList;
import android.os.Bundle;
import androidx.core.util.g;
import v.d;

/* renamed from: v.b  reason: case insensitive filesystem */
public final class C0918b extends d {

    /* renamed from: v.b$a */
    public static final class a extends d.a {
        public a() {
            super("image_view_style");
        }

        public C0918b e() {
            return new C0918b(this.f16387a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public a a() {
            return this;
        }

        public a g(int i4) {
            this.f16387a.putInt("image_max_height", i4);
            return this;
        }

        public a h(int i4) {
            this.f16387a.putInt("image_max_width", i4);
            return this;
        }

        public a i(ColorStateList colorStateList) {
            g.h(colorStateList, "imageTintList should not be null");
            this.f16387a.putParcelable("image_tint_list", colorStateList);
            return this;
        }
    }

    public C0918b(Bundle bundle) {
        super(bundle);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "image_view_style";
    }
}
