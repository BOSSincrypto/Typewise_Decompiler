package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.core.provider.e;
import androidx.core.util.g;
import androidx.emoji2.text.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class d {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final b f5452a;

        public a(b bVar) {
            this.f5452a = bVar == null ? e() : bVar;
        }

        private f.c a(Context context, e eVar) {
            if (eVar == null) {
                return null;
            }
            return new k(context, eVar);
        }

        private List b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        private e d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new e(str, str2, "emojicompat-emoji-font", b(this.f5452a.b(packageManager, str2)));
        }

        private static b e() {
            if (Build.VERSION.SDK_INT >= 28) {
                return new C0089d();
            }
            return new c();
        }

        private boolean f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            if (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) {
                return false;
            }
            return true;
        }

        private ProviderInfo g(PackageManager packageManager) {
            for (ResolveInfo a4 : this.f5452a.c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0)) {
                ProviderInfo a5 = this.f5452a.a(a4);
                if (f(a5)) {
                    return a5;
                }
            }
            return null;
        }

        public f.c c(Context context) {
            return a(context, h(context));
        }

        /* access modifiers changed from: package-private */
        public e h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            g.h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g4 = g(packageManager);
            if (g4 == null) {
                return null;
            }
            try {
                return d(g4, packageManager);
            } catch (PackageManager.NameNotFoundException e4) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e4);
                return null;
            }
        }
    }

    public static class b {
        public abstract ProviderInfo a(ResolveInfo resolveInfo);

        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public abstract List c(PackageManager packageManager, Intent intent, int i4);
    }

    public static class c extends b {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        public List c(PackageManager packageManager, Intent intent, int i4) {
            return packageManager.queryIntentContentProviders(intent, i4);
        }
    }

    /* renamed from: androidx.emoji2.text.d$d  reason: collision with other inner class name */
    public static class C0089d extends c {
        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static k a(Context context) {
        return (k) new a((b) null).c(context);
    }
}
