package ch.icoaching.wrio;

import G0.a;
import G0.b;
import android.content.Intent;
import android.net.Uri;
import ch.icoaching.ionic.MainActivity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0003R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lch/icoaching/wrio/Wrio;", "Lch/icoaching/wrio/TypewiseInputMethodService;", "<init>", "()V", "Ll2/q;", "onWindowShown", "onWindowHidden", "v1", "u1", "w1", "x1", "y1", "z1", "A1", "h1", "LG0/a;", "x0", "LG0/a;", "analyticsController", "", "y0", "Z", "onWindowShownAlreadyCalled", "ch.icoaching-4.4.38(3020319)_paidRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Wrio extends TypewiseInputMethodService {

    /* renamed from: x0  reason: collision with root package name */
    private final a f9081x0 = new b(this);

    /* renamed from: y0  reason: collision with root package name */
    private boolean f9082y0;

    public void A1() {
        z1();
    }

    public void h1() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://typewiseofflineapp.typewise.app/appnomix"));
        intent.addFlags(268435456);
        startActivity(intent);
    }

    public void onWindowHidden() {
        super.onWindowHidden();
        this.f9082y0 = false;
        this.f9081x0.a();
    }

    public void onWindowShown() {
        super.onWindowShown();
        if (!this.f9082y0) {
            this.f9082y0 = true;
            this.f9081x0.b();
        }
    }

    public void u1() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://typewiseofflineapp.typewise.app/languagesettings"));
        intent.addFlags(268435456);
        startActivity(intent);
    }

    public void v1() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://typewiseofflineapp.typewise.app/optimize"));
        intent.addFlags(268435456);
        startActivity(intent);
    }

    public void w1() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.addFlags(268435456);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://typewiseofflineapp.typewise.app/rating"));
        startActivity(intent);
    }

    public void x1() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://typewiseofflineapp.typewise.app/settings"));
        intent.addFlags(268435456);
        startActivity(intent);
    }

    public void y1() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://typewiseofflineapp.typewise.app/tutorial"));
        intent.addFlags(268435456);
        startActivity(intent);
    }

    public void z1() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://typewiseofflineapp.typewise.app/upgrade"));
        intent.addFlags(268435456);
        startActivity(intent);
    }
}
