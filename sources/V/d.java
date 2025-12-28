package v;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.util.g;
import v.C0917a;

public class d extends C0917a {

    public static abstract class a extends C0917a.C0245a {
        protected a(String str) {
            super(str);
        }

        /* access modifiers changed from: protected */
        public abstract a a();

        public a b(Icon icon) {
            g.h(icon, "background icon should not be null");
            this.f16387a.putParcelable("background", icon);
            return a();
        }

        public a c(int i4, int i5, int i6, int i7) {
            this.f16387a.putIntArray("layout_margin", new int[]{i4, i5, i6, i7});
            return a();
        }

        public a d(int i4, int i5, int i6, int i7) {
            this.f16387a.putIntArray("padding", new int[]{i4, i5, i6, i7});
            return a();
        }
    }

    public static final class b extends a {
        public b() {
            super("view_style");
        }

        public d e() {
            return new d(this.f16387a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public b a() {
            return this;
        }
    }

    public d(Bundle bundle) {
        super(bundle);
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "view_style";
    }
}
