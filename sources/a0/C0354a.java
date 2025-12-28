package a0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

/* renamed from: a0.a  reason: case insensitive filesystem */
public final class C0354a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0043a f2216e = new C0043a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Map f2217f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f2218a;

    /* renamed from: b  reason: collision with root package name */
    private final File f2219b;

    /* renamed from: c  reason: collision with root package name */
    private final Lock f2220c;

    /* renamed from: d  reason: collision with root package name */
    private FileChannel f2221d;

    /* renamed from: a0.a$a  reason: collision with other inner class name */
    public static final class C0043a {
        public /* synthetic */ C0043a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final Lock b(String str) {
            Lock lock;
            synchronized (C0354a.f2217f) {
                try {
                    Map a4 = C0354a.f2217f;
                    Object obj = a4.get(str);
                    if (obj == null) {
                        obj = new ReentrantLock();
                        a4.put(str, obj);
                    }
                    lock = (Lock) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        private C0043a() {
        }
    }

    public C0354a(String str, File file, boolean z3) {
        o.e(str, "name");
        o.e(file, "lockDir");
        this.f2218a = z3;
        File file2 = new File(file, str + ".lck");
        this.f2219b = file2;
        C0043a aVar = f2216e;
        String absolutePath = file2.getAbsolutePath();
        o.d(absolutePath, "lockFile.absolutePath");
        this.f2220c = aVar.b(absolutePath);
    }

    public static /* synthetic */ void c(C0354a aVar, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = aVar.f2218a;
        }
        aVar.b(z3);
    }

    public final void b(boolean z3) {
        this.f2220c.lock();
        if (z3) {
            try {
                File parentFile = this.f2219b.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f2219b).getChannel();
                channel.lock();
                this.f2221d = channel;
            } catch (IOException e4) {
                this.f2221d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e4);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f2221d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f2220c.unlock();
    }
}
