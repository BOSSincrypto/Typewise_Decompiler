package g;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.icoaching.wrio.A;
import ch.icoaching.wrio.B;
import ch.icoaching.wrio.C0561z;
import com.getcapacitor.PluginMethod;
import kotlin.jvm.internal.o;
import u2.C0906a;

/* renamed from: g.d  reason: case insensitive filesystem */
public final class C0653d extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    private TextView f13589A;

    /* renamed from: B  reason: collision with root package name */
    private C0906a f13590B;

    /* renamed from: C  reason: collision with root package name */
    private C0906a f13591C;

    /* renamed from: y  reason: collision with root package name */
    private ImageView f13592y;

    /* renamed from: z  reason: collision with root package name */
    private ImageView f13593z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0653d(Context context) {
        this(context, (AttributeSet) null);
        o.e(context, "context");
    }

    private final void E() {
        View.inflate(getContext(), B.banner_unlock_ai_assistant, this);
        setBackgroundResource(C0561z.background_banner_unlock_ai_assistant);
        this.f13592y = (ImageView) findViewById(A.banner_unlock_ai_assistant_iv_stars);
        this.f13589A = (TextView) findViewById(A.banner_unlock_ai_assistant_tv_title);
        this.f13593z = (ImageView) findViewById(A.banner_unlock_ai_assistant_iv_close);
        ImageView imageView = this.f13592y;
        ImageView imageView2 = null;
        if (imageView == null) {
            o.p("textViewStarsIcon");
            imageView = null;
        }
        imageView.setOnClickListener(new C0650a(this));
        TextView textView = this.f13589A;
        if (textView == null) {
            o.p("textViewTitle");
            textView = null;
        }
        textView.setOnClickListener(new C0651b(this));
        ImageView imageView3 = this.f13593z;
        if (imageView3 == null) {
            o.p("imageViewClose");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setOnClickListener(new C0652c(this));
    }

    /* access modifiers changed from: private */
    public static final void F(C0653d dVar, View view) {
        C0906a aVar = dVar.f13590B;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void G(C0653d dVar, View view) {
        C0906a aVar = dVar.f13590B;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void H(C0653d dVar, View view) {
        C0906a aVar = dVar.f13591C;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setOnClicked$typewise_sdk_2_4_40_219__typewiseRemoteRelease(C0906a aVar) {
        o.e(aVar, PluginMethod.RETURN_CALLBACK);
        this.f13590B = aVar;
    }

    public final void setOnClosed$typewise_sdk_2_4_40_219__typewiseRemoteRelease(C0906a aVar) {
        o.e(aVar, PluginMethod.RETURN_CALLBACK);
        this.f13591C = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0653d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.e(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0653d(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o.e(context, "context");
        E();
    }
}
