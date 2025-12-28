package ch.icoaching.wrio.data.source.local.db.migrations;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import ch.icoaching.wrio.data.c;
import ch.icoaching.wrio.dictionary.b;
import ch.icoaching.wrio.dictionary.f;
import ch.icoaching.wrio.dictionary.g;
import ch.icoaching.wrio.logging.Log;
import h2.C0670i;
import h2.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.jvm.internal.o;

public final class a implements q {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9547a;

    /* renamed from: b  reason: collision with root package name */
    private final c f9548b;

    /* renamed from: c  reason: collision with root package name */
    private final SQLiteDatabase f9549c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f9550d;

    public a(Context context, c cVar, SQLiteDatabase sQLiteDatabase, Object obj) {
        o.e(context, "applicationContext");
        o.e(cVar, "languageSettings");
        o.e(sQLiteDatabase, "writableDatabase");
        o.e(obj, "writableDatabaseLock");
        this.f9547a = context;
        this.f9548b = cVar;
        this.f9549c = sQLiteDatabase;
        this.f9550d = obj;
    }

    private final void a() {
        Log log;
        Map s4 = D.s(b());
        s4.remove("user_specific");
        s4.remove("unknown");
        s4.remove("system");
        List<Pair> u3 = D.u(s4);
        Log.d(Log.f10572a, "Migration27to28", "fixWordlistAndFrequencyValues() :: Start " + u3, (Throwable) null, 4, (Object) null);
        String str = "language_id" + " = ?" + " AND " + "word" + " = ?";
        o.d(str, "toString(...)");
        b bVar = new b(this.f9548b);
        for (Pair pair : u3) {
            Log.d(Log.f10572a, "Migration27to28", "fixWordlistAndFrequencyValues() :: Fixing " + ((String) pair.getFirst()), (Throwable) null, 4, (Object) null);
            f b4 = bVar.b(this.f9547a, (String) pair.getFirst(), ((Number) pair.getSecond()).intValue(), bVar.a(this.f9547a, (String) pair.getFirst()));
            synchronized (this.f9550d) {
                try {
                    this.f9549c.beginTransactionNonExclusive();
                    int i4 = 0;
                    for (g gVar : b4.c()) {
                        i4++;
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("frequency", Integer.valueOf(gVar.a()));
                        contentValues.put("wordlist", 1);
                        this.f9549c.update("main_dictionary", contentValues, str, new String[]{String.valueOf(gVar.d()), gVar.l()});
                    }
                    this.f9549c.setTransactionSuccessful();
                    log = Log.f10572a;
                    Log.d(log, "Migration27to28", "fixWordlistAndFrequencyValues() :: Processed " + i4 + " rows", (Throwable) null, 4, (Object) null);
                    this.f9549c.endTransaction();
                    l2.q qVar = l2.q.f14567a;
                } catch (Throwable th) {
                    this.f9549c.endTransaction();
                    throw th;
                }
            }
            Log.d(log, "Migration27to28", "fixWordlistAndFrequencyValues() :: " + ((String) pair.getFirst()) + " fixed", (Throwable) null, 4, (Object) null);
        }
        Log.d(Log.f10572a, "Migration27to28", "fixWordlistAndFrequencyValues() :: Done", (Throwable) null, 4, (Object) null);
    }

    private final Map b() {
        Map b4;
        synchronized (this.f9550d) {
            b4 = C0670i.f13642b.b(this.f9549c);
        }
        return b4;
    }

    private final void c() {
        ArrayList arrayList = new ArrayList(this.f9548b.e());
        if (!arrayList.contains("unknown")) {
            arrayList.add("unknown");
        }
        if (!arrayList.contains("user_specific")) {
            arrayList.add("user_specific");
        }
        Log.d(Log.f10572a, "Migration27to28", "removeNotInstalledLanguages() :: User selected languages: " + arrayList, (Throwable) null, 4, (Object) null);
        Map s4 = D.s(b());
        s4.keySet().removeAll(C0718m.F0(arrayList));
        List<Pair> u3 = D.u(s4);
        ArrayList arrayList2 = new ArrayList(C0718m.t(u3, 10));
        for (Pair first : u3) {
            arrayList2.add((String) first.getFirst());
        }
        ArrayList arrayList3 = new ArrayList(C0718m.t(u3, 10));
        for (Pair second : u3) {
            arrayList3.add(Integer.valueOf(((Number) second.getSecond()).intValue()));
        }
        if (u3.isEmpty()) {
            Log.d(Log.f10572a, "Migration27to28", "removeNotInstalledLanguages() :: No languages for removal", (Throwable) null, 4, (Object) null);
            return;
        }
        Log log = Log.f10572a;
        Log log2 = log;
        Log.d(log2, "Migration27to28", "removeNotInstalledLanguages() :: Languages for removal: " + arrayList2, (Throwable) null, 4, (Object) null);
        String a4 = b.b(arrayList3, ",");
        Log.d(log2, "Migration27to28", "removeNotInstalledLanguages() :: Languages for removal: " + a4, (Throwable) null, 4, (Object) null);
        String str = "SELECT " + "word_id" + " FROM " + "main_dictionary" + " WHERE " + "language_id" + " IN (" + a4 + ')';
        o.d(str, "toString(...)");
        String str2 = "SELECT " + "delete_id" + " FROM " + "deletes_dictionary" + " WHERE " + "word_id" + " IN (" + str + ')';
        o.d(str2, "toString(...)");
        String str3 = "DELETE FROM " + "deletes" + " WHERE " + "delete_id" + " IN (" + str2 + ')';
        o.d(str3, "toString(...)");
        String str4 = "DELETE FROM " + "deletes_dictionary" + " WHERE " + "word_id" + " IN (" + str + ')';
        o.d(str4, "toString(...)");
        String str5 = "DELETE FROM " + "main_dictionary" + " WHERE " + "language_id" + " = ?";
        o.d(str5, "toString(...)");
        String str6 = "DELETE FROM " + "dictionary_languages" + " WHERE " + "language_id" + " IN (" + a4 + ')';
        o.d(str6, "toString(...)");
        Log.d(log2, "Migration27to28", "removeNotInstalledLanguages() :: Step 1", (Throwable) null, 4, (Object) null);
        synchronized (this.f9550d) {
            try {
                this.f9549c.beginTransactionNonExclusive();
                this.f9549c.execSQL(str3);
                this.f9549c.setTransactionSuccessful();
                this.f9549c.endTransaction();
                l2.q qVar = l2.q.f14567a;
            } catch (Throwable th) {
                this.f9549c.endTransaction();
                throw th;
            }
        }
        Log.d(log, "Migration27to28", "removeNotInstalledLanguages() :: Step 2", (Throwable) null, 4, (Object) null);
        synchronized (this.f9550d) {
            try {
                this.f9549c.beginTransactionNonExclusive();
                this.f9549c.execSQL(str4);
                this.f9549c.setTransactionSuccessful();
                this.f9549c.endTransaction();
            } catch (Throwable th2) {
                this.f9549c.endTransaction();
                throw th2;
            }
        }
        Log.d(log, "Migration27to28", "removeNotInstalledLanguages() :: Step 3", (Throwable) null, 4, (Object) null);
        for (Pair pair : u3) {
            Log.d(Log.f10572a, "Migration27to28", "removeNotInstalledLanguages() :: Removing words for " + ((String) pair.getFirst()), (Throwable) null, 4, (Object) null);
            synchronized (this.f9550d) {
                try {
                    this.f9549c.beginTransactionNonExclusive();
                    this.f9549c.execSQL(str5, new String[]{String.valueOf(((Number) pair.getSecond()).intValue())});
                    this.f9549c.setTransactionSuccessful();
                    this.f9549c.endTransaction();
                    l2.q qVar2 = l2.q.f14567a;
                } catch (Throwable th3) {
                    this.f9549c.endTransaction();
                    throw th3;
                }
            }
        }
        Log log3 = Log.f10572a;
        Log.d(log3, "Migration27to28", "removeNotInstalledLanguages() :: Step 4", (Throwable) null, 4, (Object) null);
        synchronized (this.f9550d) {
            try {
                this.f9549c.beginTransactionNonExclusive();
                this.f9549c.execSQL(str6);
                this.f9549c.setTransactionSuccessful();
                this.f9549c.endTransaction();
                l2.q qVar3 = l2.q.f14567a;
            } catch (Throwable th4) {
                this.f9549c.endTransaction();
                throw th4;
            }
        }
        Log.d(log3, "Migration27to28", "removeNotInstalledLanguages() :: Done", (Throwable) null, 4, (Object) null);
    }

    /* JADX INFO: finally extract failed */
    private final void e() {
        synchronized (this.f9550d) {
            int a4 = C0670i.f13642b.a("unknown", this.f9549c);
            if (a4 != -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("language_id", Integer.valueOf(a4));
                contentValues.put("language_code", "unknown");
                try {
                    this.f9549c.beginTransactionNonExclusive();
                    this.f9549c.update("main_dictionary", contentValues, "language_code = ?", new String[]{"user"});
                    this.f9549c.setTransactionSuccessful();
                    this.f9549c.endTransaction();
                    l2.q qVar = l2.q.f14567a;
                } catch (Throwable th) {
                    this.f9549c.endTransaction();
                    throw th;
                }
            } else {
                throw new IllegalStateException("Database corrupted! Doesn't have a language entry for 'unknown'");
            }
        }
        Log.d(Log.f10572a, "Migration27to28", "updateUserToUnknownLanguageCode() :: Done", (Throwable) null, 4, (Object) null);
    }

    public Object d(kotlin.coroutines.c cVar) {
        Log log = Log.f10572a;
        Log.d(log, "Migration27to28", "migrate() :: Start", (Throwable) null, 4, (Object) null);
        e();
        c();
        a();
        Log.d(log, "Migration27to28", "migrate() :: Done", (Throwable) null, 4, (Object) null);
        return l2.q.f14567a;
    }
}
