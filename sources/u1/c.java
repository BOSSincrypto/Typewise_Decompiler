package U1;

import android.content.Context;

public abstract class c {
    public static b a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new g(new l(context));
    }
}
