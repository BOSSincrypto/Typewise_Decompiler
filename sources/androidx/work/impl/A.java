package androidx.work.impl;

import android.content.Context;
import androidx.work.m;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.D;
import kotlin.jvm.internal.o;
import l2.g;
import z2.d;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    public static final A f7159a = new A();

    private A() {
    }

    private final File c(Context context) {
        return new File(C0467a.f7234a.a(context), "androidx.work.workdb");
    }

    public static final void d(Context context) {
        String str;
        o.e(context, "context");
        A a4 = f7159a;
        if (a4.b(context).exists()) {
            m.e().a(B.f7160a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : a4.e(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        m.e().k(B.f7160a, "Over-writing contents of " + file2);
                    }
                    if (file.renameTo(file2)) {
                        str = "Migrated " + file + "to " + file2;
                    } else {
                        str = "Renaming " + file + " to " + file2 + " failed";
                    }
                    m.e().a(B.f7160a, str);
                }
            }
        }
    }

    public final File a(Context context) {
        o.e(context, "context");
        return c(context);
    }

    public final File b(Context context) {
        o.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        o.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final Map e(Context context) {
        o.e(context, "context");
        File b4 = b(context);
        File a4 = a(context);
        String[] a5 = B.f7161b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(d.b(D.e(a5.length), 16));
        for (String str : a5) {
            Pair a6 = g.a(new File(b4.getPath() + str), new File(a4.getPath() + str));
            linkedHashMap.put(a6.getFirst(), a6.getSecond());
        }
        return D.l(linkedHashMap, g.a(b4, a4));
    }
}
