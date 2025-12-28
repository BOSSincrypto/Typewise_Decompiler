package androidx.room;

import android.content.Context;
import androidx.room.RoomDatabase;
import kotlin.jvm.internal.o;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f6861a = new r();

    private r() {
    }

    public static final RoomDatabase.a a(Context context, Class cls, String str) {
        boolean z3;
        o.e(context, "context");
        o.e(cls, "klass");
        if (str == null || kotlin.text.o.X(str)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return new RoomDatabase.a(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    public static final Object b(Class cls, String str) {
        String str2;
        o.e(cls, "klass");
        o.e(str, "suffix");
        Package packageR = cls.getPackage();
        o.b(packageR);
        String name = packageR.getName();
        String canonicalName = cls.getCanonicalName();
        o.b(canonicalName);
        o.d(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            o.d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str3 = canonicalName;
        String str4 = kotlin.text.o.B(str3, '.', '_', false, 4, (Object) null) + str;
        try {
            if (name.length() == 0) {
                str2 = str4;
            } else {
                str2 = name + '.' + str4;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            o.c(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls2.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }

    public static final RoomDatabase.a c(Context context, Class cls) {
        o.e(context, "context");
        o.e(cls, "klass");
        return new RoomDatabase.a(context, cls, (String) null);
    }
}
