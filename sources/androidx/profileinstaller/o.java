package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    private static final androidx.concurrent.futures.c f6140a = androidx.concurrent.futures.c.q();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f6141b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static c f6142c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f6143a;

        /* renamed from: b  reason: collision with root package name */
        final int f6144b;

        /* renamed from: c  reason: collision with root package name */
        final long f6145c;

        /* renamed from: d  reason: collision with root package name */
        final long f6146d;

        b(int i4, int i5, long j4, long j5) {
            this.f6143a = i4;
            this.f6144b = i5;
            this.f6145c = j4;
            this.f6146d = j5;
        }

        static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        /* access modifiers changed from: package-private */
        public void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f6143a);
                dataOutputStream.writeInt(this.f6144b);
                dataOutputStream.writeLong(this.f6145c);
                dataOutputStream.writeLong(this.f6146d);
                dataOutputStream.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f6144b == bVar.f6144b && this.f6145c == bVar.f6145c && this.f6143a == bVar.f6143a && this.f6146d == bVar.f6146d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.f6144b), Long.valueOf(this.f6145c), Integer.valueOf(this.f6143a), Long.valueOf(this.f6146d)});
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final int f6147a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f6148b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f6149c;

        c(int i4, boolean z3, boolean z4) {
            this.f6147a = i4;
            this.f6149c = z4;
            this.f6148b = z3;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return a.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i4, boolean z3, boolean z4) {
        c cVar = new c(i4, z3, z4);
        f6142c = cVar;
        f6140a.o(cVar);
        return f6142c;
    }

    static c c(Context context, boolean z3) {
        boolean z4;
        boolean z5;
        b bVar;
        b bVar2;
        c cVar;
        if (!z3 && (cVar = f6142c) != null) {
            return cVar;
        }
        synchronized (f6141b) {
            if (!z3) {
                try {
                    c cVar2 = f6142c;
                    if (cVar2 != null) {
                        return cVar2;
                    }
                } catch (IOException unused) {
                    return b(131072, z4, z5);
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i4 = Build.VERSION.SDK_INT;
            int i5 = 0;
            if (i4 >= 28) {
                if (i4 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    if (!file.exists() || length <= 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    if (!file2.exists() || length2 <= 0) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    try {
                        long a4 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            bVar = b.a(file3);
                        } else {
                            bVar = null;
                        }
                        if (bVar != null && bVar.f6145c == a4) {
                            int i6 = bVar.f6144b;
                            if (i6 != 2) {
                                i5 = i6;
                                if (z3 && z5 && i5 != 1) {
                                    i5 = 2;
                                }
                                if (bVar != null && bVar.f6144b == 2 && i5 == 1 && length < bVar.f6146d) {
                                    i5 = 3;
                                }
                                bVar2 = new b(1, i5, a4, length2);
                                if (bVar == null || !bVar.equals(bVar2)) {
                                    bVar2.b(file3);
                                }
                                c b4 = b(i5, z4, z5);
                                return b4;
                            }
                        }
                        if (z4) {
                            i5 = 1;
                        } else if (z5) {
                            i5 = 2;
                        }
                        i5 = 2;
                        i5 = 3;
                        bVar2 = new b(1, i5, a4, length2);
                        try {
                            bVar2.b(file3);
                        } catch (IOException unused2) {
                            i5 = 196608;
                        }
                        c b42 = b(i5, z4, z5);
                        return b42;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        return b(65536, z4, z5);
                    }
                }
            }
            c b5 = b(262144, false, false);
            return b5;
        }
    }
}
