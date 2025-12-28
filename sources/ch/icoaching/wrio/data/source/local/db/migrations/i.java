package ch.icoaching.wrio.data.source.local.db.migrations;

import android.content.Context;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkManager;
import ch.icoaching.wrio.logging.Log;
import h2.q;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;

public final class i implements q {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9564a;

    public i(Context context) {
        o.e(context, "applicationContext");
        this.f9564a = context;
    }

    public Object d(c cVar) {
        Log log = Log.f10572a;
        Log.d(log, "Migration40to41", "migrate() :: Start", (Throwable) null, 4, (Object) null);
        WorkManager.g(this.f9564a).e("restore_mixed_case_words", ExistingWorkPolicy.REPLACE, RestoreMixedCaseWordsWorker.f9542l.a());
        Log.d(log, "Migration40to41", "migrate() :: Done", (Throwable) null, 4, (Object) null);
        return l2.q.f14567a;
    }
}
