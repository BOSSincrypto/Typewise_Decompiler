package ch.icoaching.wrio.util;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import ch.icoaching.wrio.logging.Log;
import com.getcapacitor.PluginMethod;
import java.io.File;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D;
import kotlinx.coroutines.g0;
import u2.l;

public final class DictionaryExporter {

    /* renamed from: a  reason: collision with root package name */
    private final D f10684a;

    public DictionaryExporter(D d4) {
        o.e(d4, "applicationCoroutineScope");
        this.f10684a = d4;
    }

    private final File a(Context context) {
        return new File(new File(context.getFilesDir(), "Dictionary"), "dictionary.db");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007a A[SYNTHETIC, Splitter:B:36:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0084 A[SYNTHETIC, Splitter:B:41:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f A[SYNTHETIC, Splitter:B:47:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0099 A[SYNTHETIC, Splitter:B:52:0x0099] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(android.content.Context r12) {
        /*
            r11 = this;
            java.lang.String r0 = "wrio-dynamic-layout.db"
            java.io.File r0 = r12.getDatabasePath(r0)
            java.io.File r12 = r11.a(r12)
            java.io.File r1 = r12.getParentFile()
            if (r1 == 0) goto L_0x0019
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x0019
            r1.mkdirs()
        L_0x0019:
            boolean r1 = r12.exists()
            if (r1 == 0) goto L_0x0022
            r12.delete()
        L_0x0022:
            r12.createNewFile()
            r1 = 0
            r2 = 0
            boolean r3 = r12.exists()     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            if (r3 != 0) goto L_0x0040
            ch.icoaching.wrio.logging.Log r4 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            java.lang.String r5 = "DictionaryExporter"
            java.lang.String r6 = "doWork() :: Aborting. Export to file couldn't be created."
            r8 = 4
            r9 = 0
            r7 = 0
            ch.icoaching.wrio.logging.Log.d(r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            return r1
        L_0x003a:
            r12 = move-exception
            r0 = r2
            goto L_0x008d
        L_0x003d:
            r12 = move-exception
            r0 = r2
            goto L_0x0075
        L_0x0040:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            r3.<init>(r0)     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            java.nio.channels.FileChannel r0 = r3.getChannel()     // Catch:{ Exception -> 0x003d, all -> 0x003a }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0071, all -> 0x006c }
            r3.<init>(r12)     // Catch:{ Exception -> 0x0071, all -> 0x006c }
            java.nio.channels.FileChannel r2 = r3.getChannel()     // Catch:{ Exception -> 0x0071, all -> 0x006c }
            long r8 = r0.size()     // Catch:{ Exception -> 0x0071, all -> 0x006c }
            r6 = 0
            r4 = r2
            r5 = r0
            r4.transferFrom(r5, r6, r8)     // Catch:{ Exception -> 0x0071, all -> 0x006c }
            r0.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r12 = move-exception
            r12.printStackTrace()
        L_0x0065:
            r1 = 1
            r2.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x008b
        L_0x006a:
            r12 = move-exception
            goto L_0x0088
        L_0x006c:
            r12 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
            goto L_0x008d
        L_0x0071:
            r12 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
        L_0x0075:
            r12.printStackTrace()     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0082
            r2.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x0082
        L_0x007e:
            r12 = move-exception
            r12.printStackTrace()
        L_0x0082:
            if (r0 == 0) goto L_0x008b
            r0.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x008b
        L_0x0088:
            r12.printStackTrace()
        L_0x008b:
            return r1
        L_0x008c:
            r12 = move-exception
        L_0x008d:
            if (r2 == 0) goto L_0x0097
            r2.close()     // Catch:{ IOException -> 0x0093 }
            goto L_0x0097
        L_0x0093:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0097:
            if (r0 == 0) goto L_0x00a1
            r0.close()     // Catch:{ IOException -> 0x009d }
            goto L_0x00a1
        L_0x009d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00a1:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.util.DictionaryExporter.e(android.content.Context):boolean");
    }

    /* access modifiers changed from: private */
    public final Uri f(Context context) {
        String packageName = context.getPackageName();
        Uri g4 = FileProvider.g(context, packageName + ".fileprovider", a(context));
        o.d(g4, "getUriForFile(...)");
        return g4;
    }

    public final void b(Context context, l lVar) {
        o.e(context, "applicationContext");
        o.e(lVar, PluginMethod.RETURN_CALLBACK);
        Log.d(Log.f10572a, "DictionaryExporter", "doExport() :: Start", (Throwable) null, 4, (Object) null);
        g0 unused = C0739h.d(this.f10684a, (CoroutineContext) null, (CoroutineStart) null, new DictionaryExporter$exportDictionary$1(lVar, this, context, (c<? super DictionaryExporter$exportDictionary$1>) null), 3, (Object) null);
    }
}
