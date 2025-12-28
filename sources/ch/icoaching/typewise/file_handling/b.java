package ch.icoaching.typewise.file_handling;

import android.content.Context;
import android.content.res.AssetManager;
import ch.icoaching.typewise.file_handling.FileIO;
import kotlin.jvm.internal.o;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f8265a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static FileIO f8266b;

    private b() {
    }

    public final FileIO a(FileIO.Scope scope) {
        o.e(scope, "scope");
        FileIO fileIO = f8266b;
        if (fileIO != null) {
            return fileIO;
        }
        throw new IllegalStateException("FileIOFactory NOT initialized. FileIOFactory.initialize() must be called before calling any other member function!");
    }

    public final void b(Context context) {
        o.e(context, "context");
        AssetManager assets = context.getAssets();
        o.d(assets, "getAssets(...)");
        f8266b = new a(assets);
    }
}
