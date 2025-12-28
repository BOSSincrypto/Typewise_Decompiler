package J0;

import H0.d;
import H0.e;
import H0.f;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.o;
import u2.C0906a;

public final class c extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    private TextView f599A;

    /* renamed from: B  reason: collision with root package name */
    private ImageView f600B;

    /* renamed from: y  reason: collision with root package name */
    private C0906a f601y;

    /* renamed from: z  reason: collision with root package name */
    private C0906a f602z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void D() {
        View.inflate(getContext(), f.appnomix_banner, this);
        setLayoutParams(new ConstraintLayout.b(-1, getResources().getDimensionPixelSize(d.banner_height)));
        this.f599A = (TextView) findViewById(e.tv_banner_text);
        this.f600B = (ImageView) findViewById(e.iv_close);
        TextView textView = this.f599A;
        ImageView imageView = null;
        if (textView == null) {
            o.p("tvBannerText");
            textView = null;
        }
        textView.setOnClickListener(new a(this));
        ImageView imageView2 = this.f600B;
        if (imageView2 == null) {
            o.p("imgClose");
        } else {
            imageView = imageView2;
        }
        imageView.setOnClickListener(new b(this));
    }

    /* access modifiers changed from: private */
    public static final void E(c cVar, View view) {
        C0906a aVar = cVar.f601y;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void F(c cVar, View view) {
        C0906a aVar = cVar.f602z;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void G(int i4, int i5) {
        setBackgroundColor(i4);
        TextView textView = this.f599A;
        ImageView imageView = null;
        if (textView == null) {
            o.p("tvBannerText");
            textView = null;
        }
        textView.setTextColor(i5);
        TextView textView2 = this.f599A;
        if (textView2 == null) {
            o.p("tvBannerText");
            textView2 = null;
        }
        Drawable[] compoundDrawables = textView2.getCompoundDrawables();
        o.d(compoundDrawables, "getCompoundDrawables(...)");
        for (Drawable drawable : compoundDrawables) {
            if (drawable != null) {
                drawable.setTint(i5);
            }
        }
        ImageView imageView2 = this.f600B;
        if (imageView2 == null) {
            o.p("imgClose");
        } else {
            imageView = imageView2;
        }
        imageView.setColorFilter(i5, PorterDuff.Mode.SRC_ATOP);
    }

    public final void setBannerText$typewise_sdk_appnomix_2_4_40_219__remoteRelease(String str) {
        o.e(str, "bannerText");
        TextView textView = this.f599A;
        if (textView == null) {
            o.p("tvBannerText");
            textView = null;
        }
        textView.setText(str);
    }

    public final void setOnBannerClicked$typewise_sdk_appnomix_2_4_40_219__remoteRelease(C0906a aVar) {
        o.e(aVar, "onClicked");
        this.f601y = aVar;
    }

    public final void setOnBannerClosed$typewise_sdk_appnomix_2_4_40_219__remoteRelease(C0906a aVar) {
        o.e(aVar, "onClosed");
        this.f602z = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        D();
    }
}
