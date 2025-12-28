package androidx.room;

import X.b;
import X.c;
import Z.g;
import Z.h;
import a0.C0354a;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

public final class v implements h, f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6881a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6882b;

    /* renamed from: c  reason: collision with root package name */
    private final File f6883c;

    /* renamed from: d  reason: collision with root package name */
    private final Callable f6884d;

    /* renamed from: e  reason: collision with root package name */
    private final int f6885e;

    /* renamed from: f  reason: collision with root package name */
    private final h f6886f;

    /* renamed from: g  reason: collision with root package name */
    private e f6887g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6888h;

    public v(Context context, String str, File file, Callable callable, int i4, h hVar) {
        o.e(context, "context");
        o.e(hVar, "delegate");
        this.f6881a = context;
        this.f6882b = str;
        this.f6883c = file;
        this.f6884d = callable;
        this.f6885e = i4;
        this.f6886f = hVar;
    }

    private final void a(File file, boolean z3) {
        ReadableByteChannel readableByteChannel;
        if (this.f6882b != null) {
            readableByteChannel = Channels.newChannel(this.f6881a.getAssets().open(this.f6882b));
            o.d(readableByteChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f6883c != null) {
            readableByteChannel = new FileInputStream(this.f6883c).getChannel();
            o.d(readableByteChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.f6884d;
            if (callable != null) {
                try {
                    readableByteChannel = Channels.newChannel((InputStream) callable.call());
                    o.d(readableByteChannel, "newChannel(inputStream)");
                } catch (Exception e4) {
                    throw new IOException("inputStreamCallable exception on call", e4);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f6881a.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        o.d(channel, "output");
        c.a(readableByteChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            o.d(createTempFile, "intermediateFile");
            e(createTempFile, z3);
            if (!createTempFile.renameTo(file)) {
                throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
            }
            return;
        }
        throw new IOException("Failed to create directories for " + file.getAbsolutePath());
    }

    private final void e(File file, boolean z3) {
        e eVar = this.f6887g;
        if (eVar == null) {
            o.p("databaseConfiguration");
            eVar = null;
        }
        eVar.getClass();
    }

    private final void h(boolean z3) {
        String databaseName = getDatabaseName();
        if (databaseName != null) {
            File databasePath = this.f6881a.getDatabasePath(databaseName);
            e eVar = this.f6887g;
            e eVar2 = null;
            if (eVar == null) {
                o.p("databaseConfiguration");
                eVar = null;
            }
            boolean z4 = eVar.f6807s;
            File filesDir = this.f6881a.getFilesDir();
            o.d(filesDir, "context.filesDir");
            C0354a aVar = new C0354a(databaseName, filesDir, z4);
            try {
                C0354a.c(aVar, false, 1, (Object) null);
                if (!databasePath.exists()) {
                    o.d(databasePath, "databaseFile");
                    a(databasePath, z3);
                    aVar.d();
                    return;
                }
                try {
                    o.d(databasePath, "databaseFile");
                    int c4 = b.c(databasePath);
                    if (c4 == this.f6885e) {
                        aVar.d();
                        return;
                    }
                    e eVar3 = this.f6887g;
                    if (eVar3 == null) {
                        o.p("databaseConfiguration");
                    } else {
                        eVar2 = eVar3;
                    }
                    if (eVar2.a(c4, this.f6885e)) {
                        aVar.d();
                        return;
                    }
                    if (this.f6881a.deleteDatabase(databaseName)) {
                        try {
                            a(databasePath, z3);
                        } catch (IOException e4) {
                            Log.w("ROOM", "Unable to copy database file.", e4);
                        }
                    } else {
                        Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                    }
                    aVar.d();
                } catch (IOException e5) {
                    Log.w("ROOM", "Unable to read database version.", e5);
                    aVar.d();
                }
            } catch (IOException e6) {
                throw new RuntimeException("Unable to copy database file.", e6);
            } catch (Throwable th) {
                aVar.d();
                throw th;
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public synchronized void close() {
        getDelegate().close();
        this.f6888h = false;
    }

    public final void f(e eVar) {
        o.e(eVar, "databaseConfiguration");
        this.f6887g = eVar;
    }

    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    public h getDelegate() {
        return this.f6886f;
    }

    public g i0() {
        if (!this.f6888h) {
            h(true);
            this.f6888h = true;
        }
        return getDelegate().i0();
    }

    public void setWriteAheadLoggingEnabled(boolean z3) {
        getDelegate().setWriteAheadLoggingEnabled(z3);
    }
}
