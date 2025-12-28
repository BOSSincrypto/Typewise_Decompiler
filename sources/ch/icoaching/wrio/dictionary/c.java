package ch.icoaching.wrio.dictionary;

import android.content.Context;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkManager;
import ch.icoaching.wrio.data.h;
import i2.C0680a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.D;

public final class c extends AbstractDictionaryController {

    /* renamed from: f  reason: collision with root package name */
    private final Context f9627f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, h hVar, D d4, C0680a aVar) {
        super(context, hVar, d4, aVar);
        o.e(context, "applicationContext");
        o.e(hVar, "dictionarySettings");
        o.e(d4, "applicationCoroutineScope");
        o.e(aVar, "defaultSharedPreferences");
        this.f9627f = context;
    }

    public void c() {
        WorkManager.g(this.f9627f).e("language_restoration_unique_work_id", ExistingWorkPolicy.KEEP, DictionaryRestorerWorker.f9593n.a());
    }

    public void f(long j4, TimeUnit timeUnit, ExistingWorkPolicy existingWorkPolicy) {
        o.e(timeUnit, "languageDownloadInitialDelayTimeUnit");
        o.e(existingWorkPolicy, "existingWorkPolicy");
        WorkManager.g(this.f9627f).e("language_import_unique_work_id", existingWorkPolicy, WriteWordsWorker.f9612t.a());
    }
}
