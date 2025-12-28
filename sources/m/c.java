package m;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class c extends C0796a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14570a = new a((i) null);

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: d */
    public Intent a(Context context, Intent intent) {
        o.e(context, "context");
        o.e(intent, "input");
        return intent;
    }

    /* renamed from: e */
    public androidx.activity.result.a c(int i4, Intent intent) {
        return new androidx.activity.result.a(i4, intent);
    }
}
