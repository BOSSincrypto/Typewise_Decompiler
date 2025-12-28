package Z;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.o;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f2132a = new d();

    private d() {
    }

    public static final File a(Context context) {
        o.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        o.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
