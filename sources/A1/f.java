package a1;

import a1.C0358d;
import android.content.Context;
import java.io.File;

public final class f extends C0358d {

    class a implements C0358d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f2234a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f2235b;

        a(Context context, String str) {
            this.f2234a = context;
            this.f2235b = str;
        }

        public File a() {
            File cacheDir = this.f2234a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            if (this.f2235b != null) {
                return new File(cacheDir, this.f2235b);
            }
            return cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public f(Context context, String str, long j4) {
        super(new a(context, str), j4);
    }
}
