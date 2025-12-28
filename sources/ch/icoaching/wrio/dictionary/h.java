package ch.icoaching.wrio.dictionary;

import K2.C0341a;
import android.content.Context;
import android.content.res.AssetManager;
import ch.icoaching.wrio.C0501a;
import kotlin.jvm.internal.o;

public abstract class h {
    public static final LanguagesInAssets a(Context context, C0341a aVar) {
        o.e(context, "<this>");
        o.e(aVar, "json");
        AssetManager assets = context.getApplicationContext().getAssets();
        o.d(assets, "getAssets(...)");
        String a4 = C0501a.a(assets, "languages.json");
        aVar.a();
        return (LanguagesInAssets) aVar.c(LanguagesInAssets.Companion.serializer(), a4);
    }
}
