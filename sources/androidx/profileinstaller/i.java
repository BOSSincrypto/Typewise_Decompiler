package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static final c f6131a = new a();

    /* renamed from: b  reason: collision with root package name */
    static final c f6132b = new b();

    class a implements c {
        a() {
        }

        public void a(int i4, Object obj) {
        }

        public void b(int i4, Object obj) {
        }
    }

    class b implements c {
        b() {
        }

        public void a(int i4, Object obj) {
        }

        public void b(int i4, Object obj) {
            String str;
            switch (i4) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
                default:
                    str = "";
                    break;
            }
            if (i4 == 6 || i4 == 7 || i4 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            }
        }
    }

    public interface c {
        void a(int i4, Object obj);

        void b(int i4, Object obj);
    }

    static boolean b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    static void c(Context context, Executor executor, c cVar) {
        b(context.getFilesDir());
        g(executor, cVar, 11, (Object) null);
    }

    static boolean d(PackageInfo packageInfo, File file, c cVar) {
        DataInputStream dataInputStream;
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        boolean z3 = false;
        if (!file2.exists()) {
            return false;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(file2));
            long readLong = dataInputStream.readLong();
            dataInputStream.close();
            if (readLong == packageInfo.lastUpdateTime) {
                z3 = true;
            }
            if (z3) {
                cVar.b(2, (Object) null);
            }
            return z3;
        } catch (IOException unused) {
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    static void f(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    static void g(Executor executor, c cVar, int i4, Object obj) {
        executor.execute(new h(cVar, i4, obj));
    }

    private static boolean h(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, c cVar) {
        d dVar = new d(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!dVar.e()) {
            return false;
        }
        boolean n4 = dVar.i().m().n();
        if (n4) {
            f(packageInfo, file);
        }
        return n4;
    }

    public static void i(Context context) {
        j(context, new g(), f6131a);
    }

    public static void j(Context context, Executor executor, c cVar) {
        k(context, executor, cVar, false);
    }

    static void k(Context context, Executor executor, c cVar, boolean z3) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z4 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (z3 || !d(packageInfo, filesDir, cVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Installing profile for ");
                sb.append(context.getPackageName());
                if (h(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z3) {
                    z4 = true;
                }
                o.c(context, z4);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Skipping profile installation for ");
            sb2.append(context.getPackageName());
            o.c(context, false);
        } catch (PackageManager.NameNotFoundException e4) {
            cVar.b(7, e4);
            o.c(context, false);
        }
    }

    static void l(Context context, Executor executor, c cVar) {
        try {
            f(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            g(executor, cVar, 10, (Object) null);
        } catch (PackageManager.NameNotFoundException e4) {
            g(executor, cVar, 7, e4);
        }
    }
}
