package P;

import android.text.Editable;
import androidx.emoji2.text.o;

final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f1085a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile Editable.Factory f1086b;

    /* renamed from: c  reason: collision with root package name */
    private static Class f1087c;

    private b() {
        try {
            f1087c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f1086b == null) {
            synchronized (f1085a) {
                try {
                    if (f1086b == null) {
                        f1086b = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1086b;
    }

    public Editable newEditable(CharSequence charSequence) {
        Class cls = f1087c;
        if (cls != null) {
            return o.c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
