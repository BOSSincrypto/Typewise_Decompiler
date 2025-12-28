package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import j.C0682a;
import j.C0683b;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private final C0683b f3688a;

    /* renamed from: b  reason: collision with root package name */
    private final ComponentName f3689b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f3690c;

    class a extends C0682a.C0193a {

        /* renamed from: d  reason: collision with root package name */
        private Handler f3691d = new Handler(Looper.getMainLooper());

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f3692e;

        /* renamed from: androidx.browser.customtabs.c$a$a  reason: collision with other inner class name */
        class C0057a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Bundle f3694a;

            C0057a(Bundle bundle) {
                this.f3694a = bundle;
            }

            public void run() {
                a.this.f3692e.onUnminimized(this.f3694a);
            }
        }

        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f3696a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f3697b;

            b(int i4, Bundle bundle) {
                this.f3696a = i4;
                this.f3697b = bundle;
            }

            public void run() {
                a.this.f3692e.onNavigationEvent(this.f3696a, this.f3697b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$a$c  reason: collision with other inner class name */
        class C0058c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f3699a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f3700b;

            C0058c(String str, Bundle bundle) {
                this.f3699a = str;
                this.f3700b = bundle;
            }

            public void run() {
                a.this.f3692e.extraCallback(this.f3699a, this.f3700b);
            }
        }

        class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Bundle f3702a;

            d(Bundle bundle) {
                this.f3702a = bundle;
            }

            public void run() {
                a.this.f3692e.onMessageChannelReady(this.f3702a);
            }
        }

        class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f3704a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f3705b;

            e(String str, Bundle bundle) {
                this.f3704a = str;
                this.f3705b = bundle;
            }

            public void run() {
                a.this.f3692e.onPostMessage(this.f3704a, this.f3705b);
            }
        }

        class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f3707a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Uri f3708b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f3709c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Bundle f3710d;

            f(int i4, Uri uri, boolean z3, Bundle bundle) {
                this.f3707a = i4;
                this.f3708b = uri;
                this.f3709c = z3;
                this.f3710d = bundle;
            }

            public void run() {
                a.this.f3692e.onRelationshipValidationResult(this.f3707a, this.f3708b, this.f3709c, this.f3710d);
            }
        }

        class g implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f3712a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f3713b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Bundle f3714c;

            g(int i4, int i5, Bundle bundle) {
                this.f3712a = i4;
                this.f3713b = i5;
                this.f3714c = bundle;
            }

            public void run() {
                a.this.f3692e.onActivityResized(this.f3712a, this.f3713b, this.f3714c);
            }
        }

        class h implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Bundle f3716a;

            h(Bundle bundle) {
                this.f3716a = bundle;
            }

            public void run() {
                a.this.f3692e.onWarmupCompleted(this.f3716a);
            }
        }

        class i implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f3718a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f3719b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f3720c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f3721d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f3722e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Bundle f3723f;

            i(int i4, int i5, int i6, int i7, int i8, Bundle bundle) {
                this.f3718a = i4;
                this.f3719b = i5;
                this.f3720c = i6;
                this.f3721d = i7;
                this.f3722e = i8;
                this.f3723f = bundle;
            }

            public void run() {
                a.this.f3692e.onActivityLayout(this.f3718a, this.f3719b, this.f3720c, this.f3721d, this.f3722e, this.f3723f);
            }
        }

        class j implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Bundle f3725a;

            j(Bundle bundle) {
                this.f3725a = bundle;
            }

            public void run() {
                a.this.f3692e.onMinimized(this.f3725a);
            }
        }

        a(b bVar) {
            this.f3692e = bVar;
        }

        public void a(int i4, int i5, Bundle bundle) {
            if (this.f3692e != null) {
                this.f3691d.post(new g(i4, i5, bundle));
            }
        }

        public void d(String str, Bundle bundle) {
            if (this.f3692e != null) {
                this.f3691d.post(new C0058c(str, bundle));
            }
        }

        public void f(int i4, int i5, int i6, int i7, int i8, Bundle bundle) {
            if (this.f3692e != null) {
                this.f3691d.post(new i(i4, i5, i6, i7, i8, bundle));
            }
        }

        public void h(Bundle bundle) {
            if (this.f3692e != null) {
                this.f3691d.post(new h(bundle));
            }
        }

        public void i(int i4, Bundle bundle) {
            if (this.f3692e != null) {
                this.f3691d.post(new b(i4, bundle));
            }
        }

        public Bundle k(String str, Bundle bundle) {
            b bVar = this.f3692e;
            if (bVar == null) {
                return null;
            }
            return bVar.extraCallbackWithResult(str, bundle);
        }

        public void l(String str, Bundle bundle) {
            if (this.f3692e != null) {
                this.f3691d.post(new e(str, bundle));
            }
        }

        public void o(Bundle bundle) {
            if (this.f3692e != null) {
                this.f3691d.post(new d(bundle));
            }
        }

        public void r(int i4, Uri uri, boolean z3, Bundle bundle) {
            if (this.f3692e != null) {
                this.f3691d.post(new f(i4, uri, z3, bundle));
            }
        }

        public void s(Bundle bundle) {
            if (this.f3692e != null) {
                this.f3691d.post(new j(bundle));
            }
        }

        public void u(Bundle bundle) {
            if (this.f3692e != null) {
                this.f3691d.post(new C0057a(bundle));
            }
        }
    }

    c(C0683b bVar, ComponentName componentName, Context context) {
        this.f3688a = bVar;
        this.f3689b = componentName;
        this.f3690c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    private C0682a.C0193a b(b bVar) {
        return new a(bVar);
    }

    private f d(b bVar, PendingIntent pendingIntent) {
        boolean z3;
        C0682a.C0193a b4 = b(bVar);
        if (pendingIntent != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                z3 = this.f3688a.n(b4, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        } else {
            z3 = this.f3688a.c(b4);
        }
        if (!z3) {
            return null;
        }
        return new f(this.f3688a, b4, this.f3689b, pendingIntent);
    }

    public f c(b bVar) {
        return d(bVar, (PendingIntent) null);
    }

    public boolean e(long j4) {
        try {
            return this.f3688a.p(j4);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
