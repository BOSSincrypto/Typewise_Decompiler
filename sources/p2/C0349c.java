package P2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ch.icoaching.wrio.A;
import ch.icoaching.wrio.B;
import ch.icoaching.wrio.C0561z;
import kotlin.jvm.internal.o;
import u2.C0906a;

/* renamed from: P2.c  reason: case insensitive filesystem */
public final class C0349c extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private ImageView f1151a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0349c(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void b() {
        View.inflate(getContext(), B.dropdown_add_language_item, this);
        this.f1151a = (ImageView) findViewById(A.iv_add_languages);
    }

    /* access modifiers changed from: private */
    public static final void d(C0906a aVar, View view) {
        aVar.invoke();
    }

    public final void c(int i4, int i5) {
        ImageView imageView = this.f1151a;
        ImageView imageView2 = null;
        if (imageView == null) {
            o.p("addLanguagesImage");
            imageView = null;
        }
        imageView.setBackgroundResource(C0561z.dropdown_item_background);
        ImageView imageView3 = this.f1151a;
        if (imageView3 == null) {
            o.p("addLanguagesImage");
            imageView3 = null;
        }
        imageView3.getBackground().setTint(i4);
        ImageView imageView4 = this.f1151a;
        if (imageView4 == null) {
            o.p("addLanguagesImage");
        } else {
            imageView2 = imageView4;
        }
        Drawable drawable = imageView2.getDrawable();
        if (drawable != null) {
            drawable.setTint(i5);
        }
    }

    public final void setOnAddLanguageClick(C0906a aVar) {
        o.e(aVar, "onAddLanguageItemClick");
        setOnClickListener(new C0348b(aVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0349c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0349c(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        b();
    }
}
