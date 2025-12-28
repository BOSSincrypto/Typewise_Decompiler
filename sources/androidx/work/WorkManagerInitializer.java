package androidx.work;

import android.content.Context;
import androidx.work.a;
import b0.C0479a;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer implements C0479a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7081a = m.i("WrkMgrInitializer");

    public List a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public WorkManager b(Context context) {
        m.e().a(f7081a, "Initializing WorkManager with default configuration.");
        WorkManager.i(context, new a.b().a());
        return WorkManager.g(context);
    }
}
