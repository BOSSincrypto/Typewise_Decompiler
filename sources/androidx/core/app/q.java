package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class q implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f4889a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final Context f4890b;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private q(Context context) {
        this.f4890b = context;
    }

    public static q d(Context context) {
        return new q(context);
    }

    public q a(Intent intent) {
        this.f4889a.add(intent);
        return this;
    }

    public q b(Activity activity) {
        Intent intent;
        if (activity instanceof a) {
            intent = ((a) activity).getSupportParentActivityIntent();
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = h.a(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.f4890b.getPackageManager());
            }
            c(component);
            a(intent);
        }
        return this;
    }

    public q c(ComponentName componentName) {
        int size = this.f4889a.size();
        try {
            Intent b4 = h.b(this.f4890b, componentName);
            while (b4 != null) {
                this.f4889a.add(size, b4);
                b4 = h.b(this.f4890b, b4.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e4);
        }
    }

    public void e() {
        f((Bundle) null);
    }

    public void f(Bundle bundle) {
        if (!this.f4889a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f4889a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!androidx.core.content.a.i(this.f4890b, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f4890b.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    public Iterator iterator() {
        return this.f4889a.iterator();
    }
}
