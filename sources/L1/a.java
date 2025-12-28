package L1;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import z1.C0970a;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final TimeInterpolator f870a;

    /* renamed from: b  reason: collision with root package name */
    protected final View f871b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f872c;

    /* renamed from: d  reason: collision with root package name */
    protected final int f873d;

    /* renamed from: e  reason: collision with root package name */
    protected final int f874e;

    public a(View view) {
        this.f871b = view;
        Context context = view.getContext();
        this.f870a = d.g(context, C0970a.motionEasingStandardDecelerateInterpolator, androidx.core.view.animation.a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f872c = d.f(context, C0970a.motionDurationMedium2, 300);
        this.f873d = d.f(context, C0970a.motionDurationShort3, 150);
        this.f874e = d.f(context, C0970a.motionDurationShort2, 100);
    }
}
