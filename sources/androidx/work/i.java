package androidx.work;

import java.util.List;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7158a = m.i("InputMerger");

    public static i a(String str) {
        try {
            return (i) Class.forName(str).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception e4) {
            m e5 = m.e();
            String str2 = f7158a;
            e5.d(str2, "Trouble instantiating + " + str, e4);
            return null;
        }
    }

    public abstract e b(List list);
}
