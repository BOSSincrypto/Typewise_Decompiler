package ch.icoaching.wrio.util;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.o;

public abstract class a {
    public static final String a(Context context, String str) {
        o.e(context, "<this>");
        o.e(str, "languageCode");
        Resources resources = context.getApplicationContext().getResources();
        int identifier = resources.getIdentifier("settings_languages_" + kotlin.text.o.C(str, "-", "_", false, 4, (Object) null), "string", context.getApplicationContext().getPackageName());
        if (identifier == 0) {
            return null;
        }
        return context.getApplicationContext().getString(identifier);
    }
}
