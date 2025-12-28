package ch.icoaching.typewise;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.o;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f8119a = new c();

    private c() {
    }

    public final File a(Context context) {
        o.e(context, "applicationContext");
        return new File(context.getFilesDir().getPath(), "DownloadedLanguages");
    }
}
