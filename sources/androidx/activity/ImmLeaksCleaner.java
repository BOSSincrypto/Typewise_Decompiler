package androidx.activity;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0461k;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements C0461k {

    /* renamed from: b  reason: collision with root package name */
    private static int f2339b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f2340c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f2341d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f2342e;

    /* renamed from: a  reason: collision with root package name */
    private Activity f2343a;

    ImmLeaksCleaner(Activity activity) {
        this.f2343a = activity;
    }

    private static void e() {
        Class<InputMethodManager> cls = InputMethodManager.class;
        try {
            f2339b = 2;
            Field declaredField = cls.getDeclaredField("mServedView");
            f2341d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("mNextServedView");
            f2342e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mH");
            f2340c = declaredField3;
            declaredField3.setAccessible(true);
            f2339b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:31|32|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(androidx.lifecycle.m r3, androidx.lifecycle.Lifecycle.Event r4) {
        /*
            r2 = this;
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r4 == r3) goto L_0x0005
            return
        L_0x0005:
            int r3 = f2339b
            if (r3 != 0) goto L_0x000c
            e()
        L_0x000c:
            int r3 = f2339b
            r4 = 1
            if (r3 != r4) goto L_0x004e
            android.app.Activity r3 = r2.f2343a
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = f2340c     // Catch:{ IllegalAccessException -> 0x004e }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x004e }
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = f2341d     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            if (r0 != 0) goto L_0x0033
            monitor-exit(r4)     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r3 = move-exception
            goto L_0x004c
        L_0x0033:
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x003b
            monitor-exit(r4)     // Catch:{ all -> 0x0031 }
            return
        L_0x003b:
            java.lang.reflect.Field r0 = f2342e     // Catch:{ IllegalAccessException -> 0x0046 }
            r1 = 0
            r0.set(r3, r1)     // Catch:{ IllegalAccessException -> 0x0046 }
            monitor-exit(r4)     // Catch:{ all -> 0x0031 }
            r3.isActive()
            goto L_0x004e
        L_0x0046:
            monitor-exit(r4)     // Catch:{ all -> 0x0031 }
            return
        L_0x0048:
            monitor-exit(r4)     // Catch:{ all -> 0x0031 }
            return
        L_0x004a:
            monitor-exit(r4)     // Catch:{ all -> 0x0031 }
            return
        L_0x004c:
            monitor-exit(r4)     // Catch:{ all -> 0x0031 }
            throw r3
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.c(androidx.lifecycle.m, androidx.lifecycle.Lifecycle$Event):void");
    }
}
