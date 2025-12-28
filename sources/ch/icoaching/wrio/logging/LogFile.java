package ch.icoaching.wrio.logging;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.TimeZone;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.C0738g;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.sync.b;
import kotlinx.coroutines.sync.c;
import l2.q;
import org.apache.commons.lang3.time.FastDateFormat;

public final class LogFile {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10576a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineDispatcher f10577b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final File f10578c;

    /* renamed from: d  reason: collision with root package name */
    private final FastDateFormat f10579d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final b f10580e;

    public LogFile(Context context, CoroutineDispatcher coroutineDispatcher) {
        o.e(context, "applicationContext");
        o.e(coroutineDispatcher, "ioDispatcher");
        this.f10576a = context;
        this.f10577b = coroutineDispatcher;
        File file = new File(new File(context.getFilesDir(), "logs"), "log.txt");
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        this.f10578c = file;
        this.f10579d = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSS", TimeZone.getDefault());
        this.f10580e = c.b(false, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final String d(int i4, String str, String str2) {
        String format = this.f10579d.format(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder(format.length() + str.length() + str2.length() + 5);
        sb.append(format);
        sb.append(' ');
        sb.append(a.d(i4));
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        String sb2 = sb.toString();
        o.d(sb2, "toString(...)");
        return sb2;
    }

    public final void e() {
        try {
            this.f10578c.delete();
            this.f10578c.createNewFile();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final Uri f() {
        String packageName = this.f10576a.getPackageName();
        Context context = this.f10576a;
        Uri g4 = FileProvider.g(context, packageName + ".fileprovider", this.f10578c);
        o.d(g4, "getUriForFile(...)");
        return g4;
    }

    public final Object g(int i4, String str, String str2, Throwable th, kotlin.coroutines.c cVar) {
        Object e4 = C0738g.e(this.f10577b, new LogFile$log$2(this, i4, str, str2, th, (kotlin.coroutines.c<? super LogFile$log$2>) null), cVar);
        if (e4 == a.f()) {
            return e4;
        }
        return q.f14567a;
    }
}
