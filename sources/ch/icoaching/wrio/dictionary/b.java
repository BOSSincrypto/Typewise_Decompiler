package ch.icoaching.wrio.dictionary;

import android.content.Context;
import ch.icoaching.wrio.data.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import l2.q;
import s2.C0896b;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f9626a;

    public b(c cVar) {
        o.e(cVar, "languageSettings");
        this.f9626a = new a(cVar);
    }

    private final g c(String str, int i4, String str2, int i5) {
        String[] strArr = (String[]) kotlin.text.o.t0(str, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
        g gVar = new g(strArr[0], Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]), Integer.parseInt(strArr[3]), Integer.parseInt(strArr[4]));
        if (strArr.length > 5) {
            gVar.f(strArr[5]);
        }
        gVar.b(i4);
        gVar.c(str2);
        gVar.e(i5);
        return gVar;
    }

    public final int a(Context context, String str) {
        o.e(context, "context");
        o.e(str, "language");
        return this.f9626a.a(context, str);
    }

    public final f b(Context context, String str, int i4, int i5) {
        o.e(context, "context");
        o.e(str, "language");
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f9626a.b(context, str, i5)));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    o.b(readLine);
                    arrayList.add(c(readLine, i4, str, i5));
                } catch (Throwable th) {
                    C0896b.a(bufferedReader, th);
                    throw th;
                }
            }
            q qVar = q.f14567a;
            C0896b.a(bufferedReader, (Throwable) null);
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return new f(str, arrayList);
    }
}
