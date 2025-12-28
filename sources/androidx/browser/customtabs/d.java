package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import java.util.ArrayList;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f3727a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f3728b;

    private static class a {
        static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    private static class b {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    private static class c {
        static void a(ActivityOptions activityOptions, boolean z3) {
            activityOptions.setShareIdentityEnabled(z3);
        }
    }

    /* renamed from: androidx.browser.customtabs.d$d  reason: collision with other inner class name */
    public static final class C0059d {

        /* renamed from: a  reason: collision with root package name */
        private final Intent f3729a = new Intent("android.intent.action.VIEW");

        /* renamed from: b  reason: collision with root package name */
        private final a.C0056a f3730b = new a.C0056a();

        /* renamed from: c  reason: collision with root package name */
        private ArrayList f3731c;

        /* renamed from: d  reason: collision with root package name */
        private ActivityOptions f3732d;

        /* renamed from: e  reason: collision with root package name */
        private ArrayList f3733e;

        /* renamed from: f  reason: collision with root package name */
        private SparseArray f3734f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f3735g;

        /* renamed from: h  reason: collision with root package name */
        private int f3736h = 0;

        /* renamed from: i  reason: collision with root package name */
        private boolean f3737i = true;

        /* renamed from: j  reason: collision with root package name */
        private boolean f3738j;

        public C0059d(f fVar) {
            if (fVar != null) {
                d(fVar);
            }
        }

        private void b() {
            Bundle bundle;
            String a4 = b.a();
            if (!TextUtils.isEmpty(a4)) {
                if (this.f3729a.hasExtra("com.android.browser.headers")) {
                    bundle = this.f3729a.getBundleExtra("com.android.browser.headers");
                } else {
                    bundle = new Bundle();
                }
                if (!bundle.containsKey("Accept-Language")) {
                    bundle.putString("Accept-Language", a4);
                    this.f3729a.putExtra("com.android.browser.headers", bundle);
                }
            }
        }

        private void e(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f3729a.putExtras(bundle);
        }

        private void f() {
            if (this.f3732d == null) {
                this.f3732d = a.a();
            }
            c.a(this.f3732d, this.f3738j);
        }

        public d a() {
            Bundle bundle = null;
            if (!this.f3729a.hasExtra("android.support.customtabs.extra.SESSION")) {
                e((IBinder) null, (PendingIntent) null);
            }
            ArrayList arrayList = this.f3731c;
            if (arrayList != null) {
                this.f3729a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList arrayList2 = this.f3733e;
            if (arrayList2 != null) {
                this.f3729a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f3729a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f3737i);
            this.f3729a.putExtras(this.f3730b.a().a());
            Bundle bundle2 = this.f3735g;
            if (bundle2 != null) {
                this.f3729a.putExtras(bundle2);
            }
            if (this.f3734f != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f3734f);
                this.f3729a.putExtras(bundle3);
            }
            this.f3729a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f3736h);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 24) {
                b();
            }
            if (i4 >= 34) {
                f();
            }
            ActivityOptions activityOptions = this.f3732d;
            if (activityOptions != null) {
                bundle = activityOptions.toBundle();
            }
            return new d(this.f3729a, bundle);
        }

        public C0059d c(a aVar) {
            this.f3735g = aVar.a();
            return this;
        }

        public C0059d d(f fVar) {
            this.f3729a.setPackage(fVar.b().getPackageName());
            e(fVar.a(), fVar.c());
            return this;
        }

        public C0059d g(int i4) {
            if (i4 < 0 || i4 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f3736h = i4;
            if (i4 == 1) {
                this.f3729a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i4 == 2) {
                this.f3729a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                this.f3729a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
            return this;
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f3727a = intent;
        this.f3728b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f3727a.setData(uri);
        androidx.core.content.a.j(context, this.f3727a, this.f3728b);
    }
}
