package androidx.work.impl;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: androidx.work.impl.a  reason: case insensitive filesystem */
public final class C0467a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0467a f7234a = new C0467a();

    private C0467a() {
    }

    public final File a(Context context) {
        o.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        o.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
