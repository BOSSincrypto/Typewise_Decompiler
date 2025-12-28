package ch.icoaching.wrio.dictionary;

import android.content.Context;
import android.content.res.AssetManager;
import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.logging.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.zip.GZIPInputStream;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import x0.C0934a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final c f9625a;

    public a(c cVar) {
        o.e(cVar, "languageSettings");
        this.f9625a = cVar;
    }

    public final int a(Context context, String str) {
        o.e(context, "context");
        o.e(str, "language");
        if (this.f9625a.g().contains(str)) {
            String a4 = C0934a.f16394c.a(str);
            String[] list = new File(ch.icoaching.typewise.c.f8119a.a(context), a4).list();
            o.b(list);
            for (String str2 : list) {
                o.b(str2);
                if (kotlin.text.o.u(str2, ".bin", false, 2, (Object) null)) {
                    String substring = str2.substring(a4.length() + 2, str2.length() - 4);
                    o.d(substring, "substring(...)");
                    return Integer.parseInt(substring);
                }
            }
            return 0;
        }
        try {
            String[] list2 = context.getAssets().list("csv");
            if (list2 == null) {
                list2 = new String[0];
            }
            String a5 = C0934a.f16394c.a(str);
            Regex regex = new Regex(a5 + ".v\\d+.bin");
            for (String str3 : new LinkedList(C0713h.a0(list2))) {
                if (regex.matches(str3)) {
                    String substring2 = str3.substring((a5 + ".v").length(), kotlin.text.o.b0(str3, ".bin", 0, false, 6, (Object) null));
                    o.d(substring2, "substring(...)");
                    try {
                        return Integer.parseInt(substring2);
                    } catch (NumberFormatException unused) {
                        return 0;
                    }
                }
            }
            return 0;
        } catch (IOException unused2) {
            Log.f(Log.f10572a, "CsvFileProvider", "getCsvVersion() :: CSV folder doesn't exist in assets.", (Throwable) null, 4, (Object) null);
            return 0;
        }
    }

    public final InputStream b(Context context, String str, int i4) {
        o.e(context, "context");
        o.e(str, "language");
        if (this.f9625a.g().contains(str)) {
            String a4 = C0934a.f16394c.a(str);
            File file = new File(ch.icoaching.typewise.c.f8119a.a(context), a4);
            return new GZIPInputStream(new FileInputStream(new File(file, a4 + ".v" + i4 + ".bin")));
        }
        String a5 = C0934a.f16394c.a(str);
        AssetManager assets = context.getAssets();
        InputStream open = assets.open("csv/" + a5 + ".v" + i4 + ".bin");
        o.d(open, "open(...)");
        return new GZIPInputStream(open);
    }
}
