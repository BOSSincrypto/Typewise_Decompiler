package ch.icoaching.wrio.data.source.local.db.migrations;

import android.content.Context;
import androidx.work.WorkManager;
import ch.icoaching.wrio.data.source.local.db.migrations.DuplicateWordsRemoverWorker;
import h2.q;
import kotlin.coroutines.c;
import kotlin.jvm.internal.o;

public final class m implements q {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9571a;

    public m(Context context) {
        o.e(context, "applicationContext");
        this.f9571a = context;
    }

    public Object d(c cVar) {
        DuplicateWordsRemoverWorker.a aVar = DuplicateWordsRemoverWorker.f9522k;
        WorkManager g4 = WorkManager.g(this.f9571a);
        o.d(g4, "getInstance(...)");
        aVar.a(g4);
        return l2.q.f14567a;
    }
}
