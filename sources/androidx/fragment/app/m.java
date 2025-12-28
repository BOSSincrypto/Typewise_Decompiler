package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.core.app.b;
import androidx.core.content.a;
import androidx.core.util.g;

public abstract class m extends j {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f5828a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5829b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f5830c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5831d;

    /* renamed from: e  reason: collision with root package name */
    final q f5832e;

    m(h hVar) {
        this(hVar, hVar, new Handler(), 0);
    }

    /* access modifiers changed from: package-private */
    public Activity e() {
        return this.f5828a;
    }

    /* access modifiers changed from: package-private */
    public Context f() {
        return this.f5829b;
    }

    public Handler g() {
        return this.f5830c;
    }

    public abstract Object h();

    public abstract LayoutInflater i();

    public void j(Fragment fragment, String[] strArr, int i4) {
    }

    public abstract boolean k(String str);

    public void l(Fragment fragment, Intent intent, int i4, Bundle bundle) {
        if (i4 == -1) {
            a.j(this.f5829b, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void m(Fragment fragment, IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        if (i4 == -1) {
            b.w(this.f5828a, intentSender, i4, intent, i5, i6, i7, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }

    public abstract void n();

    m(Activity activity, Context context, Handler handler, int i4) {
        this.f5832e = new r();
        this.f5828a = activity;
        this.f5829b = (Context) g.h(context, "context == null");
        this.f5830c = (Handler) g.h(handler, "handler == null");
        this.f5831d = i4;
    }
}
