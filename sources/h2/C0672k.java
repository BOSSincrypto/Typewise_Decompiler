package h2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import c.C0489b;
import ch.icoaching.wrio.dictionary.g;
import ch.icoaching.wrio.logging.Log;
import e3.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import l2.q;
import s2.C0896b;

/* renamed from: h2.k  reason: case insensitive filesystem */
public final class C0672k implements p {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13645b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final C0489b f13646a;

    /* renamed from: h2.k$a */
    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public static final q g(SQLiteDatabase sQLiteDatabase, List list) {
            o.e(list, "idsSublist");
            int size = list.size();
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM main_dictionary ");
            sb.append("WHERE word_id IN (");
            for (int i4 = 0; i4 < size; i4++) {
                sb.append(((Number) list.get(i4)).intValue());
                if (i4 < size - 1) {
                    sb.append(',');
                }
            }
            sb.append(')');
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL(sb.toString());
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e4) {
                e4.printStackTrace();
            } finally {
                sQLiteDatabase.endTransaction();
            }
            return q.f14567a;
        }

        private final boolean i(String str, Integer[] numArr, SQLiteDatabase sQLiteDatabase) {
            for (Integer intValue : numArr) {
                int intValue2 = intValue.intValue();
                String str2 = "SELECT DISTINCT 1 FROM " + "main_dictionary" + " WHERE " + "word=?" + " AND language_id=?";
                o.d(str2, "toString(...)");
                Cursor cursor = null;
                try {
                    cursor = sQLiteDatabase.rawQuery(str2, new String[]{str, String.valueOf(intValue2)});
                    if (cursor.moveToFirst()) {
                        cursor.close();
                        return true;
                    }
                } catch (SQLException e4) {
                    e4.printStackTrace();
                    if (cursor == null) {
                    }
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
                cursor.close();
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Integer b(java.lang.String r4, android.database.sqlite.SQLiteDatabase r5) {
            /*
                r3 = this;
                java.lang.String r0 = "word"
                kotlin.jvm.internal.o.e(r4, r0)
                java.lang.String r1 = "database"
                kotlin.jvm.internal.o.e(r5, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "SELECT * FROM "
                r1.append(r2)
                java.lang.String r2 = "main_dictionary"
                r1.append(r2)
                java.lang.String r2 = " WHERE "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = " = ?"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "toString(...)"
                kotlin.jvm.internal.o.d(r0, r1)
                r1 = 0
                java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ all -> 0x0052 }
                android.database.Cursor r4 = r5.rawQuery(r0, r4)     // Catch:{ all -> 0x0052 }
                boolean r5 = r4.moveToFirst()     // Catch:{ all -> 0x004b }
                if (r5 == 0) goto L_0x004e
                r5 = 0
                int r5 = r4.getInt(r5)     // Catch:{ all -> 0x004b }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x004b }
                r4.close()
                return r5
            L_0x004b:
                r5 = move-exception
                r1 = r4
                goto L_0x0053
            L_0x004e:
                r4.close()
                return r1
            L_0x0052:
                r5 = move-exception
            L_0x0053:
                if (r1 == 0) goto L_0x0058
                r1.close()
            L_0x0058:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: h2.C0672k.a.b(java.lang.String, android.database.sqlite.SQLiteDatabase):java.lang.Integer");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0056, code lost:
            if (r3 == null) goto L_0x005b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List c(android.database.sqlite.SQLiteDatabase r6) {
            /*
                r5 = this;
                java.lang.String r0 = "database"
                kotlin.jvm.internal.o.e(r6, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "SELECT d1.word_id "
                r1.append(r2)
                java.lang.String r2 = "FROM main_dictionary d1 "
                r1.append(r2)
                java.lang.String r2 = "JOIN main_dictionary d2 "
                r1.append(r2)
                java.lang.String r2 = "ON d1.word = d2.word "
                r1.append(r2)
                java.lang.String r2 = "AND d1.language_id = d2.language_id "
                r1.append(r2)
                java.lang.String r2 = "AND d1.word_id > d2.word_id"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "toString(...)"
                kotlin.jvm.internal.o.d(r1, r2)
                r2 = 0
                r3 = 0
                java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ SQLException -> 0x0052 }
                android.database.Cursor r3 = r6.rawQuery(r1, r4)     // Catch:{ SQLException -> 0x0052 }
            L_0x003e:
                boolean r6 = r3.moveToNext()     // Catch:{ SQLException -> 0x0052 }
                if (r6 == 0) goto L_0x0058
                int r6 = r3.getInt(r2)     // Catch:{ SQLException -> 0x0052 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLException -> 0x0052 }
                r0.add(r6)     // Catch:{ SQLException -> 0x0052 }
                goto L_0x003e
            L_0x0050:
                r6 = move-exception
                goto L_0x005c
            L_0x0052:
                r6 = move-exception
                r6.printStackTrace()     // Catch:{ all -> 0x0050 }
                if (r3 == 0) goto L_0x005b
            L_0x0058:
                r3.close()
            L_0x005b:
                return r0
            L_0x005c:
                if (r3 == 0) goto L_0x0061
                r3.close()
            L_0x0061:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: h2.C0672k.a.c(android.database.sqlite.SQLiteDatabase):java.util.List");
        }

        public final List d(List list, int i4, SQLiteDatabase sQLiteDatabase) {
            o.e(list, "words");
            o.e(sQLiteDatabase, "database");
            ArrayList arrayList = new ArrayList();
            Integer[] numArr = {Integer.valueOf(i4)};
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                a aVar = C0672k.f13645b;
                String l4 = gVar.l();
                o.d(l4, "getWord(...)");
                if (!aVar.i(l4, numArr, sQLiteDatabase)) {
                    arrayList.add(gVar);
                }
            }
            return arrayList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006d, code lost:
            if (r2 == null) goto L_0x0072;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Map e(int r4, android.database.sqlite.SQLiteDatabase r5) {
            /*
                r3 = this;
                java.lang.String r0 = "database"
                kotlin.jvm.internal.o.e(r5, r0)
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "SELECT "
                r1.<init>(r2)
                java.lang.String r2 = "word_id"
                r1.append(r2)
                java.lang.String r2 = ", "
                r1.append(r2)
                java.lang.String r2 = "word"
                r1.append(r2)
                java.lang.String r2 = " FROM "
                r1.append(r2)
                java.lang.String r2 = "main_dictionary"
                r1.append(r2)
                java.lang.String r2 = " WHERE "
                r1.append(r2)
                java.lang.String r2 = "language_id"
                r1.append(r2)
                java.lang.String r2 = " = ?"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "toString(...)"
                kotlin.jvm.internal.o.d(r1, r2)
                r2 = 0
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x0069 }
                java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0069 }
                android.database.Cursor r2 = r5.rawQuery(r1, r4)     // Catch:{ SQLiteException -> 0x0069 }
            L_0x004f:
                boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0069 }
                if (r4 == 0) goto L_0x006f
                r4 = 0
                int r4 = r2.getInt(r4)     // Catch:{ SQLiteException -> 0x0069 }
                r5 = 1
                java.lang.String r5 = r2.getString(r5)     // Catch:{ SQLiteException -> 0x0069 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x0069 }
                r0.put(r5, r4)     // Catch:{ SQLiteException -> 0x0069 }
                goto L_0x004f
            L_0x0067:
                r4 = move-exception
                goto L_0x0073
            L_0x0069:
                r4 = move-exception
                r4.printStackTrace()     // Catch:{ all -> 0x0067 }
                if (r2 == 0) goto L_0x0072
            L_0x006f:
                r2.close()
            L_0x0072:
                return r0
            L_0x0073:
                if (r2 == 0) goto L_0x0078
                r2.close()
            L_0x0078:
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: h2.C0672k.a.e(int, android.database.sqlite.SQLiteDatabase):java.util.Map");
        }

        public final Map f(List list, SQLiteDatabase sQLiteDatabase, Object obj) {
            o.e(list, "words");
            o.e(sQLiteDatabase, "writableDatabase");
            o.e(obj, "writableDatabaseLock");
            HashMap hashMap = new HashMap(list.size());
            synchronized (obj) {
                try {
                    sQLiteDatabase.beginTransactionNonExclusive();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        g gVar = (g) it.next();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("word", gVar.l());
                        contentValues.put("frequency", Integer.valueOf(gVar.a()));
                        contentValues.put("wordlist", 1);
                        contentValues.put("typedLowerCase", Integer.valueOf(gVar.i()));
                        contentValues.put("typedTitleCase", Integer.valueOf(gVar.k()));
                        contentValues.put("typedMixedCase", Integer.valueOf(gVar.j()));
                        String m4 = gVar.m();
                        if (m4 != null) {
                            contentValues.put("wordMixedCase", m4);
                        }
                        contentValues.put("language_id", Integer.valueOf(gVar.d()));
                        contentValues.put("language_code", gVar.g());
                        contentValues.put("consider", 1);
                        contentValues.put("version", Integer.valueOf(gVar.h()));
                        hashMap.put(gVar.l(), Integer.valueOf((int) sQLiteDatabase.insertWithOnConflict("main_dictionary", "", contentValues, 4)));
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (SQLException e4) {
                    try {
                        Log.f10572a.e("ImplMainDictionaryDao", "", e4);
                    } catch (Throwable th) {
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                }
                sQLiteDatabase.endTransaction();
                q qVar = q.f14567a;
            }
            return hashMap;
        }

        public final void h(List list, SQLiteDatabase sQLiteDatabase) {
            o.e(list, "ids");
            o.e(sQLiteDatabase, "database");
            C0718m.K(list, 500, new C0671j(sQLiteDatabase));
        }

        public final int j(int i4, SQLiteDatabase sQLiteDatabase) {
            o.e(sQLiteDatabase, "database");
            String str = "SELECT COUNT(*) FROM " + "main_dictionary" + " WHERE " + "language_id=?";
            o.d(str, "toString(...)");
            Cursor cursor = null;
            try {
                Cursor rawQuery = sQLiteDatabase.rawQuery(str, new String[]{String.valueOf(i4)});
                rawQuery.moveToFirst();
                int i5 = rawQuery.getInt(0);
                rawQuery.close();
                return i5;
            } catch (SQLException e4) {
                e4.printStackTrace();
                if (cursor == null) {
                    return -1;
                }
                cursor.close();
                return -1;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        private a() {
        }
    }

    public C0672k(C0489b bVar) {
        o.e(bVar, "databaseHandler");
        this.f13646a = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (r6 != null) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r0.f A(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "word"
            kotlin.jvm.internal.o.e(r6, r0)
            java.lang.String r0 = "language"
            kotlin.jvm.internal.o.e(r7, r0)
            int r0 = r7.length()
            r1 = 0
            if (r0 != 0) goto L_0x0012
            return r1
        L_0x0012:
            c.b r0 = r5.f13646a
            android.database.sqlite.SQLiteDatabase r0 = r0.f7502l
            java.lang.String r2 = "SELECT typedLowerCase, typedMixedCase, typedTitleCase, wordMixedCase FROM main_dictionary WHERE language_code = ? AND word = ? AND consider = 1"
            java.lang.String[] r6 = new java.lang.String[]{r7, r6}     // Catch:{ SQLException -> 0x004f, all -> 0x004d }
            android.database.Cursor r6 = r0.rawQuery(r2, r6)     // Catch:{ SQLException -> 0x004f, all -> 0x004d }
            boolean r7 = r6.moveToFirst()     // Catch:{ SQLException -> 0x0042 }
            if (r7 == 0) goto L_0x0056
            r7 = 0
            int r7 = r6.getInt(r7)     // Catch:{ SQLException -> 0x0042 }
            r0 = 1
            int r0 = r6.getInt(r0)     // Catch:{ SQLException -> 0x0042 }
            r2 = 2
            int r2 = r6.getInt(r2)     // Catch:{ SQLException -> 0x0042 }
            r3 = 3
            java.lang.String r3 = r6.getString(r3)     // Catch:{ SQLException -> 0x0042 }
            if (r3 != 0) goto L_0x0044
            java.lang.String r3 = ""
            goto L_0x0044
        L_0x003f:
            r7 = move-exception
            r1 = r6
            goto L_0x005a
        L_0x0042:
            r7 = move-exception
            goto L_0x0051
        L_0x0044:
            r0.f r4 = new r0.f     // Catch:{ SQLException -> 0x0042 }
            r4.<init>(r2, r0, r7, r3)     // Catch:{ SQLException -> 0x0042 }
            r6.close()
            return r4
        L_0x004d:
            r7 = move-exception
            goto L_0x005a
        L_0x004f:
            r7 = move-exception
            r6 = r1
        L_0x0051:
            r7.printStackTrace()     // Catch:{ all -> 0x003f }
            if (r6 == 0) goto L_0x0059
        L_0x0056:
            r6.close()
        L_0x0059:
            return r1
        L_0x005a:
            if (r1 == 0) goto L_0x005f
            r1.close()
        L_0x005f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C0672k.A(java.lang.String, java.lang.String):r0.f");
    }

    public Map B(List list, int i4) {
        o.e(list, "words");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet<g> linkedHashSet = new LinkedHashSet<>();
        Log.d(Log.f10572a, "ImplMainDictionaryDao", "insertOrFetchAll() :: ... 1", (Throwable) null, 4, (Object) null);
        String str = "SELECT " + "word_id" + " FROM " + "main_dictionary" + " WHERE " + "word" + " = ?" + " AND " + "language_id" + " = ?";
        o.d(str, "toString(...)");
        Object obj = this.f13646a.f7503m;
        o.d(obj, "databaseLock");
        synchronized (obj) {
            SQLiteDatabase sQLiteDatabase = this.f13646a.f7501k;
            Iterator it = list.iterator();
            Cursor cursor = null;
            while (it.hasNext()) {
                g gVar = (g) it.next();
                try {
                    cursor = sQLiteDatabase.rawQuery(str, new String[]{gVar.l(), String.valueOf(i4)});
                    if (cursor.moveToFirst()) {
                        linkedHashMap.put(gVar.l(), Integer.valueOf(cursor.getInt(0)));
                    } else {
                        linkedHashSet.add(gVar);
                    }
                } catch (SQLiteException e4) {
                    try {
                        Log.f10572a.c("ImplMainDictionaryDao", "insertOrFetchAll() :: ... 1", e4);
                        if (cursor == null) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                cursor.close();
            }
            Log.d(Log.f10572a, "ImplMainDictionaryDao", "insertOrFetchAll() :: ... 2", (Throwable) null, 4, (Object) null);
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                for (g gVar2 : linkedHashSet) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("word", gVar2.l());
                    contentValues.put("frequency", Integer.valueOf(gVar2.a()));
                    contentValues.put("wordlist", 1);
                    contentValues.put("typedLowerCase", Integer.valueOf(gVar2.i()));
                    contentValues.put("typedTitleCase", Integer.valueOf(gVar2.k()));
                    contentValues.put("typedMixedCase", Integer.valueOf(gVar2.j()));
                    String m4 = gVar2.m();
                    if (m4 != null) {
                        contentValues.put("wordMixedCase", m4);
                    }
                    contentValues.put("language_id", Integer.valueOf(gVar2.d()));
                    contentValues.put("language_code", gVar2.g());
                    contentValues.put("consider", 1);
                    contentValues.put("version", Integer.valueOf(gVar2.h()));
                    linkedHashMap.put(gVar2.l(), Integer.valueOf((int) sQLiteDatabase.insertWithOnConflict("main_dictionary", "", contentValues, 4)));
                }
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLiteException e5) {
                Log.f10572a.e("ImplMainDictionaryDao", "", e5);
            }
            sQLiteDatabase.endTransaction();
            q qVar = q.f14567a;
        }
        return linkedHashMap;
    }

    public int C(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        o.e(sQLiteDatabase, "db");
        o.e(str, "word");
        o.e(str2, "language");
        String str3 = "SELECT " + "word_id" + " FROM " + "main_dictionary" + " WHERE " + "word" + " =?" + " AND " + "language_code" + " =?";
        o.d(str3, "toString(...)");
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.rawQuery(str3, new String[]{str, str2});
            if (cursor.moveToFirst()) {
                int i4 = cursor.getInt(0);
                cursor.close();
                return i4;
            }
        } catch (SQLException e4) {
            e4.printStackTrace();
            if (cursor == null) {
                return -100;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        cursor.close();
        return -100;
    }

    public int a(String str) {
        o.e(str, "language");
        SQLiteDatabase sQLiteDatabase = this.f13646a.f7502l;
        o.d(sQLiteDatabase, "readableDatabaseConnection");
        Cursor cursor = null;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(word_id) FROM main_dictionary WHERE language_id = (SELECT language_id FROM dictionary_languages WHERE language_code = ?)", new String[]{str});
            if (rawQuery.moveToFirst()) {
                int i4 = rawQuery.getInt(0);
                rawQuery.close();
                return i4;
            }
            rawQuery.close();
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r3 == 0) goto L_0x0045;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b() {
        /*
            r4 = this;
            c.b r0 = r4.f13646a
            android.database.sqlite.SQLiteDatabase r0 = r0.f7502l
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " SELECT MAX(LENGTH("
            r1.append(r2)
            java.lang.String r2 = "word"
            r1.append(r2)
            java.lang.String r2 = "))"
            r1.append(r2)
            java.lang.String r2 = " FROM "
            r1.append(r2)
            java.lang.String r2 = "main_dictionary"
            r1.append(r2)
            r2 = 0
            r3 = 0
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x003c }
            android.database.Cursor r3 = r0.rawQuery(r1, r3)     // Catch:{ Exception -> 0x003c }
            boolean r0 = r3.moveToFirst()     // Catch:{ Exception -> 0x003c }
            if (r0 == 0) goto L_0x0042
            int r0 = r3.getInt(r2)     // Catch:{ Exception -> 0x003c }
            r3.close()
            return r0
        L_0x003a:
            r0 = move-exception
            goto L_0x0046
        L_0x003c:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x003a }
            if (r3 == 0) goto L_0x0045
        L_0x0042:
            r3.close()
        L_0x0045:
            return r2
        L_0x0046:
            if (r3 == 0) goto L_0x004b
            r3.close()
        L_0x004b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C0672k.b():int");
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.String[], android.database.Cursor] */
    public Map c() {
        SQLiteDatabase sQLiteDatabase = this.f13646a.f7502l;
        o.d(sQLiteDatabase, "readableDatabaseConnection");
        String str = "SELECT " + "language_code" + ", SUM(" + "timesTyped" + ")" + " FROM " + "main_dictionary" + " WHERE consider = 1" + " GROUP BY " + "language_code";
        o.d(str, "toString(...)");
        HashMap hashMap = new HashMap();
        ? r32 = 0;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(str, r32);
            while (rawQuery.moveToNext()) {
                hashMap.put(rawQuery.getString(0), Integer.valueOf(rawQuery.getInt(1)));
            }
            rawQuery.close();
            rawQuery.close();
        } catch (SQLException e4) {
            e4.printStackTrace();
            if (r32 != 0) {
                r32.close();
            }
        } catch (Throwable th) {
            if (r32 != 0) {
                r32.close();
            }
            throw th;
        }
        return hashMap;
    }

    /* JADX WARNING: type inference failed for: r3v8, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v9, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0074, code lost:
        if (r3 == 0) goto L_0x0079;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map d() {
        /*
            r4 = this;
            c.b r0 = r4.f13646a
            android.database.sqlite.SQLiteDatabase r0 = r0.f7502l
            java.lang.String r1 = "readableDatabaseConnection"
            kotlin.jvm.internal.o.d(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SELECT "
            r1.append(r2)
            java.lang.String r2 = "language_code"
            r1.append(r2)
            java.lang.String r3 = ", COUNT(*)"
            r1.append(r3)
            java.lang.String r3 = " FROM "
            r1.append(r3)
            java.lang.String r3 = "main_dictionary"
            r1.append(r3)
            java.lang.String r3 = " WHERE consider = 1"
            r1.append(r3)
            java.lang.String r3 = " AND "
            r1.append(r3)
            java.lang.String r3 = "timesTyped"
            r1.append(r3)
            java.lang.String r3 = " > 0"
            r1.append(r3)
            java.lang.String r3 = " GROUP BY "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.o.d(r1, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 0
            android.database.Cursor r3 = r0.rawQuery(r1, r3)     // Catch:{ SQLException -> 0x0070 }
        L_0x0056:
            boolean r0 = r3.moveToNext()     // Catch:{ SQLException -> 0x0070 }
            if (r0 == 0) goto L_0x0076
            r0 = 0
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLException -> 0x0070 }
            r1 = 1
            int r1 = r3.getInt(r1)     // Catch:{ SQLException -> 0x0070 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ SQLException -> 0x0070 }
            r2.put(r0, r1)     // Catch:{ SQLException -> 0x0070 }
            goto L_0x0056
        L_0x006e:
            r0 = move-exception
            goto L_0x007a
        L_0x0070:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x006e }
            if (r3 == 0) goto L_0x0079
        L_0x0076:
            r3.close()
        L_0x0079:
            return r2
        L_0x007a:
            if (r3 == 0) goto L_0x007f
            r3.close()
        L_0x007f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C0672k.d():java.util.Map");
    }

    public void e(SQLiteDatabase sQLiteDatabase) {
        o.e(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("create table if not exists main_dictionary (word_id integer, word text not null, language_id integer, language_code text, wordlist integer not null, frequency integer, lastTyped integer(8) default (cast(strftime('%s', 'now') as integer(8))) not null, timesTyped integer not null default 0, timesCorrected integer not null default 0, timesSuggested integer not null default 0, timesUndone integer not null default 0, typedLowerCase integer not null default 0, typedTitleCase integer not null default 0, typedMixedCase integer not null default 0, wordMixedCase text default null, consider integer, version integer not null default 0, primary key (word_id), foreign key (language_id) references dictionary_languages)");
    }

    public List f() {
        ArrayList arrayList = new ArrayList();
        try {
            String str = "SELECT m2." + "word_id" + " FROM " + "main_dictionary" + " AS m1" + " JOIN " + "main_dictionary" + " AS m2" + " ON m1." + "word" + " = m2." + "word" + " AND m1." + "language_id" + " = m2." + "language_id" + " AND m1." + "word_id" + " < m2." + "word_id";
            o.d(str, "toString(...)");
            Cursor rawQuery = this.f13646a.f7502l.rawQuery(str, new String[0]);
            o.d(rawQuery, "rawQuery(...)");
            while (rawQuery.moveToNext()) {
                arrayList.add(Integer.valueOf(rawQuery.getInt(0)));
            }
            rawQuery.close();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return arrayList;
    }

    public int g(int i4) {
        a aVar = f13645b;
        SQLiteDatabase sQLiteDatabase = this.f13646a.f7502l;
        o.d(sQLiteDatabase, "readableDatabaseConnection");
        return aVar.j(i4, sQLiteDatabase);
    }

    public void h(String str) {
        o.e(str, "word");
        Object obj = this.f13646a.f7503m;
        o.d(obj, "databaseLock");
        synchronized (obj) {
            SQLiteDatabase sQLiteDatabase = this.f13646a.f7501k;
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("UPDATE main_dictionary SET consider = CASE WHEN ((timesTyped + timesSuggested - 2*timesCorrected - 2*timesUndone) >= 3 OR (language_code <> 'user_specific' AND consider > -1)) THEN 1 ELSE consider END  WHERE word = ?", new String[]{str});
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e4) {
                try {
                    e4.printStackTrace();
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase.endTransaction();
            q qVar = q.f14567a;
        }
    }

    public List i(String str, List list, int i4) {
        o.e(str, "start");
        o.e(list, "languages");
        SQLiteDatabase sQLiteDatabase = this.f13646a.f7502l;
        o.d(sQLiteDatabase, "readableDatabaseConnection");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String e4 = C0489b.e(list);
        o.d(e4, "createLanguageInBracketsCondition(...)");
        StringBuilder sb = new StringBuilder("SELECT ");
        sb.append("word");
        sb.append(" FROM ");
        sb.append("main_dictionary");
        sb.append(" WHERE language_code IN ");
        sb.append(e4);
        sb.append(" AND ");
        sb.append("consider");
        sb.append(" = 1 ");
        if (c.l(str)) {
            sb.append(" AND ");
            sb.append("word");
            sb.append(" LIKE ?");
            arrayList2.add(str + '%');
        }
        sb.append(" ORDER BY ");
        sb.append("timesTyped");
        sb.append(" DESC, ");
        sb.append("frequency");
        sb.append(" DESC ");
        sb.append("LIMIT ? ");
        arrayList2.add(String.valueOf(i4));
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) arrayList2.toArray(new String[0]));
            try {
                if (rawQuery.moveToFirst()) {
                    do {
                        String string = rawQuery.getString(0);
                        o.b(string);
                        String lowerCase = string.toLowerCase(Locale.ROOT);
                        o.d(lowerCase, "toLowerCase(...)");
                        arrayList.add(lowerCase);
                    } while (rawQuery.moveToNext());
                }
                q qVar = q.f14567a;
                C0896b.a(rawQuery, (Throwable) null);
            } catch (Throwable th) {
                C0896b.a(rawQuery, th);
                throw th;
            }
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Long j(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "word"
            kotlin.jvm.internal.o.e(r10, r0)
            java.lang.String r0 = "language"
            kotlin.jvm.internal.o.e(r11, r0)
            c.b r0 = r9.f13646a
            android.database.sqlite.SQLiteDatabase r1 = r0.f7502l
            r0 = 0
            java.lang.String r2 = "main_dictionary"
            java.lang.String r3 = "word_id"
            java.lang.String r4 = "timesTyped"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ all -> 0x0040 }
            java.lang.String r4 = "word = ? AND language_code = ?"
            java.lang.String[] r5 = new java.lang.String[]{r10, r11}     // Catch:{ all -> 0x0040 }
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0040 }
            boolean r11 = r10.moveToFirst()     // Catch:{ all -> 0x0039 }
            if (r11 == 0) goto L_0x003c
            r11 = 0
            long r0 = r10.getLong(r11)     // Catch:{ all -> 0x0039 }
            java.lang.Long r11 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0039 }
            r10.close()
            return r11
        L_0x0039:
            r11 = move-exception
            r0 = r10
            goto L_0x0041
        L_0x003c:
            r10.close()
            return r0
        L_0x0040:
            r11 = move-exception
        L_0x0041:
            if (r0 == 0) goto L_0x0046
            r0.close()
        L_0x0046:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C0672k.j(java.lang.String, java.lang.String):java.lang.Long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x012c, code lost:
        if (r3 == null) goto L_0x0131;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List k(java.lang.String r6, int r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.o.e(r6, r0)
            java.lang.String r0 = "language"
            kotlin.jvm.internal.o.e(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SELECT "
            r1.append(r2)
            java.lang.String r2 = "word"
            r1.append(r2)
            java.lang.String r3 = ", "
            r1.append(r3)
            java.lang.String r4 = "wordMixedCase"
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = "typedLowerCase"
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = "typedTitleCase"
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = "typedMixedCase"
            r1.append(r4)
            java.lang.String r4 = " FROM "
            r1.append(r4)
            java.lang.String r4 = "main_dictionary"
            r1.append(r4)
            java.lang.String r4 = " WHERE "
            r1.append(r4)
            java.lang.String r4 = "consider"
            r1.append(r4)
            java.lang.String r4 = " = 1 "
            r1.append(r4)
            java.lang.String r4 = " AND "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = " LIKE ? "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = "language_code"
            r1.append(r2)
            java.lang.String r2 = " = ?"
            r1.append(r2)
            java.lang.String r2 = " ORDER BY "
            r1.append(r2)
            java.lang.String r2 = "timesTyped"
            r1.append(r2)
            java.lang.String r2 = " DESC"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "frequency"
            r1.append(r2)
            java.lang.String r2 = " DESC "
            r1.append(r2)
            java.lang.String r2 = " LIMIT ?"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.o.d(r1, r2)
            c.b r2 = r5.f13646a
            android.database.sqlite.SQLiteDatabase r2 = r2.f7502l
            java.lang.String r3 = "readableDatabaseConnection"
            kotlin.jvm.internal.o.d(r2, r3)
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f4 }
            r4.<init>()     // Catch:{ Exception -> 0x00f4 }
            r4.append(r6)     // Catch:{ Exception -> 0x00f4 }
            r6 = 37
            r4.append(r6)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r6 = r4.toString()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String[] r6 = new java.lang.String[]{r6, r8, r7}     // Catch:{ Exception -> 0x00f4 }
            android.database.Cursor r3 = r2.rawQuery(r1, r6)     // Catch:{ Exception -> 0x00f4 }
            boolean r6 = r3.moveToFirst()     // Catch:{ Exception -> 0x00f4 }
            if (r6 == 0) goto L_0x012e
        L_0x00ca:
            r6 = 0
            java.lang.String r6 = r3.getString(r6)     // Catch:{ Exception -> 0x00f4 }
            r7 = 1
            java.lang.String r8 = r3.getString(r7)     // Catch:{ Exception -> 0x00f4 }
            r1 = 2
            int r1 = r3.getInt(r1)     // Catch:{ Exception -> 0x00f4 }
            r2 = 3
            int r2 = r3.getInt(r2)     // Catch:{ Exception -> 0x00f4 }
            r4 = 4
            int r4 = r3.getInt(r4)     // Catch:{ Exception -> 0x00f4 }
            if (r1 < r2) goto L_0x00f6
            if (r1 < r4) goto L_0x00f6
            kotlin.Pair r7 = new kotlin.Pair     // Catch:{ Exception -> 0x00f4 }
            ch.icoaching.typewise.text.CapsMode r8 = ch.icoaching.typewise.text.CapsMode.LOWER     // Catch:{ Exception -> 0x00f4 }
            r7.<init>(r6, r8)     // Catch:{ Exception -> 0x00f4 }
            r0.add(r7)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x0122
        L_0x00f2:
            r6 = move-exception
            goto L_0x0132
        L_0x00f4:
            r6 = move-exception
            goto L_0x0129
        L_0x00f6:
            if (r2 < r4) goto L_0x0103
            kotlin.Pair r7 = new kotlin.Pair     // Catch:{ Exception -> 0x00f4 }
            ch.icoaching.typewise.text.CapsMode r8 = ch.icoaching.typewise.text.CapsMode.TITLE     // Catch:{ Exception -> 0x00f4 }
            r7.<init>(r6, r8)     // Catch:{ Exception -> 0x00f4 }
            r0.add(r7)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x0122
        L_0x0103:
            if (r8 == 0) goto L_0x0118
            java.lang.String r1 = "null"
            boolean r7 = kotlin.text.o.v(r8, r1, r7)     // Catch:{ Exception -> 0x00f4 }
            if (r7 != 0) goto L_0x0118
            kotlin.Pair r6 = new kotlin.Pair     // Catch:{ Exception -> 0x00f4 }
            ch.icoaching.typewise.text.CapsMode r7 = ch.icoaching.typewise.text.CapsMode.MIXED     // Catch:{ Exception -> 0x00f4 }
            r6.<init>(r8, r7)     // Catch:{ Exception -> 0x00f4 }
            r0.add(r6)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x0122
        L_0x0118:
            kotlin.Pair r7 = new kotlin.Pair     // Catch:{ Exception -> 0x00f4 }
            ch.icoaching.typewise.text.CapsMode r8 = ch.icoaching.typewise.text.CapsMode.LOWER     // Catch:{ Exception -> 0x00f4 }
            r7.<init>(r6, r8)     // Catch:{ Exception -> 0x00f4 }
            r0.add(r7)     // Catch:{ Exception -> 0x00f4 }
        L_0x0122:
            boolean r6 = r3.moveToNext()     // Catch:{ Exception -> 0x00f4 }
            if (r6 != 0) goto L_0x00ca
            goto L_0x012e
        L_0x0129:
            r6.printStackTrace()     // Catch:{ all -> 0x00f2 }
            if (r3 == 0) goto L_0x0131
        L_0x012e:
            r3.close()
        L_0x0131:
            return r0
        L_0x0132:
            if (r3 == 0) goto L_0x0137
            r3.close()
        L_0x0137:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C0672k.k(java.lang.String, int, java.lang.String):java.util.List");
    }

    public void l(String str, int i4, long j4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, String str2) {
        String str3 = str;
        o.e(str, "word");
        if (i11 == 0 || str2 == null) {
            String[] strArr = {String.valueOf(j4 / 1000), String.valueOf(i5), String.valueOf(i6), String.valueOf(i7), String.valueOf(i8), String.valueOf(i9), String.valueOf(i10), str, String.valueOf(i4)};
            Object obj = this.f13646a.f7503m;
            o.d(obj, "databaseLock");
            synchronized (obj) {
                SQLiteDatabase sQLiteDatabase = this.f13646a.f7501k;
                try {
                    sQLiteDatabase.beginTransactionNonExclusive();
                    sQLiteDatabase.execSQL("UPDATE main_dictionary SET lastTyped = ?, timesTyped = timesTyped + ?, timesSuggested = timesSuggested + ?, timesCorrected = timesCorrected + ?, timesUndone = timesUndone + ?, typedLowerCase = typedLowerCase + ?, typedTitleCase = typedTitleCase + ? WHERE word = ? AND language_id = ?", strArr);
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                } catch (SQLException e4) {
                    try {
                        e4.printStackTrace();
                    } finally {
                        sQLiteDatabase.endTransaction();
                    }
                }
                q qVar = q.f14567a;
            }
            return;
        }
        String[] strArr2 = {String.valueOf(j4 / 1000), String.valueOf(i5), String.valueOf(i6), String.valueOf(i7), String.valueOf(i8), String.valueOf(i9), String.valueOf(i10), String.valueOf(i11), str2, str, String.valueOf(i4)};
        Object obj2 = this.f13646a.f7503m;
        o.d(obj2, "databaseLock");
        synchronized (obj2) {
            SQLiteDatabase sQLiteDatabase2 = this.f13646a.f7501k;
            try {
                sQLiteDatabase2.beginTransactionNonExclusive();
                sQLiteDatabase2.execSQL("UPDATE main_dictionary SET lastTyped = ?, timesTyped = timesTyped + ?, timesSuggested = timesSuggested + ?, timesCorrected = timesCorrected + ?, timesUndone = timesUndone + ?, typedLowerCase = typedLowerCase + ?, typedTitleCase = typedTitleCase + ?, typedMixedCase = typedMixedCase + ?, wordMixedCase = ? WHERE word = ? AND language_id = ?", strArr2);
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
            } catch (SQLException e5) {
                try {
                    e5.printStackTrace();
                } finally {
                    sQLiteDatabase2.endTransaction();
                }
            }
            q qVar2 = q.f14567a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008f, code lost:
        if (r2 == null) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u0.C0903a m(int r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = "language"
            kotlin.jvm.internal.o.e(r13, r0)
            c.b r0 = r11.f13646a
            android.database.sqlite.SQLiteDatabase r0 = r0.f7502l
            java.lang.String r1 = "readableDatabaseConnection"
            kotlin.jvm.internal.o.d(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SELECT word, frequency, timesTyped, typedLowerCase, typedTitleCase, typedMixedCase, wordMixedCase "
            r1.append(r2)
            java.lang.String r2 = "FROM main_dictionary "
            r1.append(r2)
            java.lang.String r2 = "WHERE language_id = (SELECT language_id FROM dictionary_languages WHERE language_code = ?) "
            r1.append(r2)
            java.lang.String r2 = "ORDER BY word_id "
            r1.append(r2)
            java.lang.String r2 = "LIMIT 1 OFFSET ?"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.o.d(r1, r2)
            r2 = 0
            java.lang.String r3 = java.lang.String.valueOf(r12)     // Catch:{ SQLException -> 0x007a }
            java.lang.String[] r3 = new java.lang.String[]{r13, r3}     // Catch:{ SQLException -> 0x007a }
            android.database.Cursor r2 = r0.rawQuery(r1, r3)     // Catch:{ SQLException -> 0x007a }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLException -> 0x007a }
            if (r0 == 0) goto L_0x0091
            u0.a r0 = new u0.a     // Catch:{ SQLException -> 0x007a }
            r1 = 0
            java.lang.String r4 = r2.getString(r1)     // Catch:{ SQLException -> 0x007a }
            java.lang.String r1 = "getString(...)"
            kotlin.jvm.internal.o.d(r4, r1)     // Catch:{ SQLException -> 0x007a }
            r1 = 1
            int r5 = r2.getInt(r1)     // Catch:{ SQLException -> 0x007a }
            r1 = 2
            int r6 = r2.getInt(r1)     // Catch:{ SQLException -> 0x007a }
            r1 = 3
            int r7 = r2.getInt(r1)     // Catch:{ SQLException -> 0x007a }
            r1 = 4
            int r8 = r2.getInt(r1)     // Catch:{ SQLException -> 0x007a }
            r1 = 5
            int r9 = r2.getInt(r1)     // Catch:{ SQLException -> 0x007a }
            r1 = 6
            boolean r3 = r2.isNull(r1)     // Catch:{ SQLException -> 0x007a }
            if (r3 == 0) goto L_0x007c
            java.lang.String r1 = ""
        L_0x0076:
            r10 = r1
            goto L_0x0081
        L_0x0078:
            r12 = move-exception
            goto L_0x00b8
        L_0x007a:
            r0 = move-exception
            goto L_0x008c
        L_0x007c:
            java.lang.String r1 = r2.getString(r1)     // Catch:{ SQLException -> 0x007a }
            goto L_0x0076
        L_0x0081:
            kotlin.jvm.internal.o.b(r10)     // Catch:{ SQLException -> 0x007a }
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLException -> 0x007a }
            r2.close()
            return r0
        L_0x008c:
            r0.printStackTrace()     // Catch:{ all -> 0x0078 }
            if (r2 == 0) goto L_0x0094
        L_0x0091:
            r2.close()
        L_0x0094:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "WordProperties not found at position "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = " for language '"
            r1.append(r12)
            r1.append(r13)
            java.lang.String r12 = "'!"
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        L_0x00b8:
            if (r2 == 0) goto L_0x00bd
            r2.close()
        L_0x00bd:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C0672k.m(int, java.lang.String):u0.a");
    }

    public void n(int i4) {
        Object obj = this.f13646a.f7503m;
        o.d(obj, "databaseLock");
        synchronized (obj) {
            SQLiteDatabase sQLiteDatabase = this.f13646a.f7501k;
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("DELETE FROM main_dictionary WHERE word_id = ?", new Integer[]{Integer.valueOf(i4)});
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e4) {
                try {
                    e4.printStackTrace();
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase.endTransaction();
            q qVar = q.f14567a;
        }
    }

    public boolean o(String str, String str2) {
        o.e(str, "word");
        o.e(str2, "language");
        SQLiteDatabase sQLiteDatabase = this.f13646a.f7502l;
        o.d(sQLiteDatabase, "readableDatabaseConnection");
        Cursor cursor = null;
        try {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            o.d(lowerCase, "toLowerCase(...)");
            cursor = sQLiteDatabase.rawQuery("SELECT word_id FROM main_dictionary WHERE word = ? AND language_id = (SELECT language_id FROM dictionary_languages WHERE language_code = ?)", new String[]{lowerCase, str2});
            if (cursor.moveToFirst()) {
                cursor.close();
                return true;
            }
        } catch (SQLException e4) {
            e4.printStackTrace();
            if (cursor == null) {
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        cursor.close();
        return false;
    }

    public long p(String str, int i4, String str2, long j4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, String str3) {
        long j5;
        String str4 = str;
        String str5 = str2;
        o.e(str, "word");
        o.e(str2, "languageCode");
        Object obj = this.f13646a.f7503m;
        o.d(obj, "databaseLock");
        synchronized (obj) {
            SQLiteDatabase sQLiteDatabase = this.f13646a.f7501k;
            j5 = -1;
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                ContentValues contentValues = new ContentValues();
                contentValues.put("word", str);
                contentValues.put("lastTyped", Long.valueOf(j4 / 1000));
                contentValues.put("timesTyped", Integer.valueOf(i5));
                contentValues.put("timesSuggested", Integer.valueOf(i6));
                contentValues.put("timesCorrected", Integer.valueOf(i7));
                contentValues.put("timesUndone", Integer.valueOf(i8));
                contentValues.put("typedLowerCase", Integer.valueOf(i9));
                contentValues.put("typedTitleCase", Integer.valueOf(i10));
                contentValues.put("typedMixedCase", Integer.valueOf(i11));
                contentValues.put("wordMixedCase", str3);
                contentValues.put("language_id", Integer.valueOf(i4));
                contentValues.put("language_code", str2);
                contentValues.put("wordlist", 0);
                contentValues.put("frequency", 0);
                j5 = sQLiteDatabase.insert("main_dictionary", "", contentValues);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLiteException e4) {
                try {
                    Log.f10572a.e("ImplMainDictionaryDao", "", e4);
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase.endTransaction();
            q qVar = q.f14567a;
        }
        return j5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b4, code lost:
        if (r4 == null) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r0.e q(r0.c r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = " AND "
            java.lang.String r1 = " = ?"
            java.lang.String r2 = "singleWord"
            kotlin.jvm.internal.o.e(r12, r2)
            java.lang.String r2 = "language"
            kotlin.jvm.internal.o.e(r13, r2)
            r0.e r2 = new r0.e
            java.lang.String r4 = r12.b()
            java.lang.String r8 = r12.e()
            r6 = 0
            r7 = 0
            r5 = -2
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            int r3 = r13.length()
            if (r3 != 0) goto L_0x0026
            return r2
        L_0x0026:
            c.b r3 = r11.f13646a
            android.database.sqlite.SQLiteDatabase r3 = r3.f7502l
            java.lang.String r4 = "readableDatabaseConnection"
            kotlin.jvm.internal.o.d(r3, r4)
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLException -> 0x00b0 }
            r5.<init>()     // Catch:{ SQLException -> 0x00b0 }
            java.lang.String r6 = "SELECT "
            r5.append(r6)     // Catch:{ SQLException -> 0x00b0 }
            java.lang.String r6 = "frequency"
            r5.append(r6)     // Catch:{ SQLException -> 0x00b0 }
            java.lang.String r6 = ", "
            r5.append(r6)     // Catch:{ SQLException -> 0x00b0 }
            java.lang.String r6 = "timesTyped"
            r5.append(r6)     // Catch:{ SQLException -> 0x00b0 }
            java.lang.String r6 = " FROM "
            r5.append(r6)     // Catch:{ SQLException -> 0x00b0 }
            java.lang.String r6 = "main_dictionary"
            r5.append(r6)     // Catch:{ SQLException -> 0x00b0 }
            java.lang.String r6 = " WHERE "
            r5.append(r6)     // Catch:{ SQLException -> 0x00b0 }
            java.lang.String r6 = "language_code"
            r5.append(r6)     // Catch:{ SQLException -> 0x00b0 }
            r5.append(r1)     // Catch:{ SQLException -> 0x00b0 }
            r5.append(r0)     // Catch:{ SQLException -> 0x00b0 }
            java.lang.String r6 = "word"
            r5.append(r6)     // Catch:{ SQLException -> 0x00b0 }
            r5.append(r1)     // Catch:{ SQLException -> 0x00b0 }
            r5.append(r0)     // Catch:{ SQLException -> 0x00b0 }
            java.lang.String r0 = "consider"
            r5.append(r0)     // Catch:{ SQLException -> 0x00b0 }
            java.lang.String r0 = " = 1 "
            r5.append(r0)     // Catch:{ SQLException -> 0x00b0 }
            java.lang.String r0 = r5.toString()     // Catch:{ SQLException -> 0x00b0 }
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.o.d(r0, r1)     // Catch:{ SQLException -> 0x00b0 }
            java.lang.String r12 = r12.b()     // Catch:{ SQLException -> 0x00b0 }
            java.lang.String[] r12 = new java.lang.String[]{r13, r12}     // Catch:{ SQLException -> 0x00b0 }
            android.database.Cursor r4 = r3.rawQuery(r0, r12)     // Catch:{ SQLException -> 0x00b0 }
            boolean r12 = r4.moveToFirst()     // Catch:{ SQLException -> 0x00b0 }
            if (r12 == 0) goto L_0x00b6
            r0.e r12 = new r0.e     // Catch:{ SQLException -> 0x00b0 }
            java.lang.String r6 = r2.d()     // Catch:{ SQLException -> 0x00b0 }
            r13 = 0
            int r7 = r4.getInt(r13)     // Catch:{ SQLException -> 0x00b0 }
            r13 = 1
            int r8 = r4.getInt(r13)     // Catch:{ SQLException -> 0x00b0 }
            java.lang.String r10 = r2.e()     // Catch:{ SQLException -> 0x00b0 }
            r9 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ SQLException -> 0x00b0 }
            r2 = r12
            goto L_0x00b6
        L_0x00ae:
            r12 = move-exception
            goto L_0x00ba
        L_0x00b0:
            r12 = move-exception
            r12.printStackTrace()     // Catch:{ all -> 0x00ae }
            if (r4 == 0) goto L_0x00b9
        L_0x00b6:
            r4.close()
        L_0x00b9:
            return r2
        L_0x00ba:
            if (r4 == 0) goto L_0x00bf
            r4.close()
        L_0x00bf:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C0672k.q(r0.c, java.lang.String):r0.e");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r3.b r(android.database.sqlite.SQLiteDatabase r5, java.lang.String r6, java.lang.String r7, int r8) {
        /*
            r4 = this;
            java.lang.String r0 = "database"
            kotlin.jvm.internal.o.e(r5, r0)
            java.lang.String r0 = "word"
            kotlin.jvm.internal.o.e(r6, r0)
            java.lang.String r0 = "language"
            kotlin.jvm.internal.o.e(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SELECT "
            r0.append(r1)
            java.lang.String r1 = "timesTyped"
            r0.append(r1)
            java.lang.String r2 = ", "
            r0.append(r2)
            java.lang.String r2 = "wordlist"
            r0.append(r2)
            java.lang.String r3 = " FROM "
            r0.append(r3)
            java.lang.String r3 = "main_dictionary"
            r0.append(r3)
            java.lang.String r3 = " WHERE "
            r0.append(r3)
            java.lang.String r3 = "language_id=?"
            r0.append(r3)
            java.lang.String r3 = " AND "
            r0.append(r3)
            java.lang.String r3 = "word=?"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.o.d(r0, r3)
            r3 = 0
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLException -> 0x008d, all -> 0x008b }
            java.lang.String[] r6 = new java.lang.String[]{r8, r6}     // Catch:{ SQLException -> 0x008d, all -> 0x008b }
            android.database.Cursor r5 = r5.rawQuery(r0, r6)     // Catch:{ SQLException -> 0x008d, all -> 0x008b }
            if (r5 == 0) goto L_0x0085
            int r6 = r5.getCount()     // Catch:{ SQLException -> 0x0083 }
            if (r6 <= 0) goto L_0x0085
            int r6 = r5.getColumnIndex(r1)     // Catch:{ SQLException -> 0x0083 }
            int r8 = r5.getColumnIndex(r2)     // Catch:{ SQLException -> 0x0083 }
            r5.moveToFirst()     // Catch:{ SQLException -> 0x0083 }
            int r6 = r5.getInt(r6)     // Catch:{ SQLException -> 0x0083 }
            int r8 = r5.getInt(r8)     // Catch:{ SQLException -> 0x0083 }
            r3.b r0 = new r3.b     // Catch:{ SQLException -> 0x0083 }
            r0.<init>(r7, r6, r8)     // Catch:{ SQLException -> 0x0083 }
            r5.close()
            return r0
        L_0x0080:
            r6 = move-exception
            r3 = r5
            goto L_0x0098
        L_0x0083:
            r6 = move-exception
            goto L_0x008f
        L_0x0085:
            if (r5 == 0) goto L_0x008a
            r5.close()
        L_0x008a:
            return r3
        L_0x008b:
            r6 = move-exception
            goto L_0x0098
        L_0x008d:
            r6 = move-exception
            r5 = r3
        L_0x008f:
            r6.printStackTrace()     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0097
            r5.close()
        L_0x0097:
            return r3
        L_0x0098:
            if (r3 == 0) goto L_0x009d
            r3.close()
        L_0x009d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C0672k.r(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, int):r3.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        if (r2 == null) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String s(int r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "language"
            kotlin.jvm.internal.o.e(r6, r0)
            c.b r0 = r4.f13646a
            android.database.sqlite.SQLiteDatabase r0 = r0.f7502l
            java.lang.String r1 = "readableDatabaseConnection"
            kotlin.jvm.internal.o.d(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SELECT word "
            r1.append(r2)
            java.lang.String r2 = "FROM main_dictionary "
            r1.append(r2)
            java.lang.String r2 = "WHERE language_id = (SELECT language_id FROM dictionary_languages WHERE language_code = ?) "
            r1.append(r2)
            java.lang.String r2 = "ORDER BY word_id "
            r1.append(r2)
            java.lang.String r2 = "LIMIT 1 OFFSET ?"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.o.d(r1, r2)
            r2 = 0
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ SQLException -> 0x0058 }
            java.lang.String[] r3 = new java.lang.String[]{r6, r3}     // Catch:{ SQLException -> 0x0058 }
            android.database.Cursor r2 = r0.rawQuery(r1, r3)     // Catch:{ SQLException -> 0x0058 }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLException -> 0x0058 }
            if (r0 == 0) goto L_0x005e
            r0 = 0
            java.lang.String r0 = r2.getString(r0)     // Catch:{ SQLException -> 0x0058 }
            java.lang.String r1 = "getString(...)"
            kotlin.jvm.internal.o.d(r0, r1)     // Catch:{ SQLException -> 0x0058 }
            r2.close()
            return r0
        L_0x0056:
            r5 = move-exception
            goto L_0x0085
        L_0x0058:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0061
        L_0x005e:
            r2.close()
        L_0x0061:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Word not found at position "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " for language '"
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = "'!"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x0085:
            if (r2 == 0) goto L_0x008a
            r2.close()
        L_0x008a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C0672k.s(int, java.lang.String):java.lang.String");
    }

    public void t(SQLiteDatabase sQLiteDatabase) {
        o.e(sQLiteDatabase, "db");
        Log.d(Log.f10572a, "ImplMainDictionaryDao", "dictionaryInsertStartOfTextId()", (Throwable) null, 4, (Object) null);
        ContentValues contentValues = new ContentValues();
        contentValues.put("word_id", -1);
        contentValues.put("word", "");
        contentValues.put("wordlist", 0);
        sQLiteDatabase.insertWithOnConflict("main_dictionary", "", contentValues, 4);
    }

    public void u(String str, List list) {
        o.e(str, "language");
        o.e(list, "words");
        Object obj = this.f13646a.f7503m;
        o.d(obj, "databaseLock");
        synchronized (obj) {
            SQLiteDatabase sQLiteDatabase = this.f13646a.f7501k;
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    sQLiteDatabase.execSQL("UPDATE main_dictionary SET typedLowerCase = ?, typedTitleCase = ?, typedMixedCase = ?  WHERE word = ? AND language_code = ?", new String[]{String.valueOf(gVar.i()), String.valueOf(gVar.k()), String.valueOf(gVar.j()), gVar.l(), gVar.g()});
                }
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLiteException e4) {
                try {
                    e4.printStackTrace();
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase.endTransaction();
            q qVar = q.f14567a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        if (r14 != null) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u0.C0903a v(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "word"
            kotlin.jvm.internal.o.e(r13, r0)
            java.lang.String r0 = "language"
            kotlin.jvm.internal.o.e(r14, r0)
            c.b r0 = r12.f13646a
            android.database.sqlite.SQLiteDatabase r0 = r0.f7502l
            java.lang.String r1 = "readableDatabaseConnection"
            kotlin.jvm.internal.o.d(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SELECT frequency, timesTyped, typedLowerCase, typedTitleCase, typedMixedCase, wordMixedCase "
            r1.append(r2)
            java.lang.String r2 = "FROM main_dictionary "
            r1.append(r2)
            java.lang.String r2 = "WHERE word = ? AND language_id = (SELECT language_id FROM dictionary_languages WHERE language_code = ?)"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.o.d(r1, r2)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r4 = r13.toLowerCase(r2)
            java.lang.String r13 = "toLowerCase(...)"
            kotlin.jvm.internal.o.d(r4, r13)
            r13 = 0
            java.lang.String[] r14 = new java.lang.String[]{r4, r14}     // Catch:{ SQLException -> 0x0089, all -> 0x0084 }
            android.database.Cursor r14 = r0.rawQuery(r1, r14)     // Catch:{ SQLException -> 0x0089, all -> 0x0084 }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLException -> 0x0072 }
            if (r0 == 0) goto L_0x0090
            u0.a r0 = new u0.a     // Catch:{ SQLException -> 0x0072 }
            r1 = 0
            int r5 = r14.getInt(r1)     // Catch:{ SQLException -> 0x0072 }
            r1 = 1
            int r6 = r14.getInt(r1)     // Catch:{ SQLException -> 0x0072 }
            r1 = 2
            int r7 = r14.getInt(r1)     // Catch:{ SQLException -> 0x0072 }
            r1 = 3
            int r8 = r14.getInt(r1)     // Catch:{ SQLException -> 0x0072 }
            r1 = 4
            int r9 = r14.getInt(r1)     // Catch:{ SQLException -> 0x0072 }
            r1 = 5
            boolean r2 = r14.isNull(r1)     // Catch:{ SQLException -> 0x0072 }
            if (r2 == 0) goto L_0x0074
            java.lang.String r1 = ""
        L_0x006e:
            r10 = r1
            goto L_0x0079
        L_0x0070:
            r13 = move-exception
            goto L_0x0094
        L_0x0072:
            r0 = move-exception
            goto L_0x008b
        L_0x0074:
            java.lang.String r1 = r14.getString(r1)     // Catch:{ SQLException -> 0x0072 }
            goto L_0x006e
        L_0x0079:
            kotlin.jvm.internal.o.b(r10)     // Catch:{ SQLException -> 0x0072 }
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLException -> 0x0072 }
            r14.close()
            return r0
        L_0x0084:
            r14 = move-exception
            r11 = r14
            r14 = r13
            r13 = r11
            goto L_0x0094
        L_0x0089:
            r0 = move-exception
            r14 = r13
        L_0x008b:
            r0.printStackTrace()     // Catch:{ all -> 0x0070 }
            if (r14 == 0) goto L_0x0093
        L_0x0090:
            r14.close()
        L_0x0093:
            return r13
        L_0x0094:
            if (r14 == 0) goto L_0x0099
            r14.close()
        L_0x0099:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C0672k.v(java.lang.String, java.lang.String):u0.a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r0.f w(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "word"
            kotlin.jvm.internal.o.e(r6, r0)
            java.lang.String r0 = "languageCode"
            kotlin.jvm.internal.o.e(r7, r0)
            c.b r0 = r5.f13646a
            android.database.sqlite.SQLiteDatabase r0 = r0.f7502l
            r1 = 0
            java.lang.String r2 = "SELECT typedTitleCase, typedMixedCase, typedLowerCase, wordMixedCase FROM main_dictionary WHERE word=? AND language_code=?"
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch:{ all -> 0x005a }
            java.lang.String r6 = r6.toLowerCase(r3)     // Catch:{ all -> 0x005a }
            java.lang.String r3 = "toLowerCase(...)"
            kotlin.jvm.internal.o.d(r6, r3)     // Catch:{ all -> 0x005a }
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}     // Catch:{ all -> 0x005a }
            android.database.Cursor r6 = r0.rawQuery(r2, r6)     // Catch:{ all -> 0x005a }
            boolean r7 = r6.moveToFirst()     // Catch:{ all -> 0x0049 }
            if (r7 != 0) goto L_0x002e
            r6.close()
            return r1
        L_0x002e:
            r0.f r7 = new r0.f     // Catch:{ all -> 0x0049 }
            r0 = 0
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x0049 }
            r1 = 1
            int r1 = r6.getInt(r1)     // Catch:{ all -> 0x0049 }
            r2 = 2
            int r2 = r6.getInt(r2)     // Catch:{ all -> 0x0049 }
            r3 = 3
            boolean r4 = r6.isNull(r3)     // Catch:{ all -> 0x0049 }
            if (r4 == 0) goto L_0x004c
            java.lang.String r3 = ""
            goto L_0x0050
        L_0x0049:
            r7 = move-exception
            r1 = r6
            goto L_0x005b
        L_0x004c:
            java.lang.String r3 = r6.getString(r3)     // Catch:{ all -> 0x0049 }
        L_0x0050:
            kotlin.jvm.internal.o.b(r3)     // Catch:{ all -> 0x0049 }
            r7.<init>(r0, r1, r2, r3)     // Catch:{ all -> 0x0049 }
            r6.close()
            return r7
        L_0x005a:
            r7 = move-exception
        L_0x005b:
            if (r1 == 0) goto L_0x0060
            r1.close()
        L_0x0060:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C0672k.w(java.lang.String, java.lang.String):r0.f");
    }

    public void x(SQLiteDatabase sQLiteDatabase) {
        o.e(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("DELETE FROM main_dictionary");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void y(java.lang.String r9, java.util.List r10) {
        /*
            r8 = this;
            java.lang.String r0 = "language"
            kotlin.jvm.internal.o.e(r9, r0)
            java.lang.String r0 = "words"
            kotlin.jvm.internal.o.e(r10, r0)
            c.b r0 = r8.f13646a
            java.lang.Object r0 = r0.f7503m
            java.lang.String r1 = "databaseLock"
            kotlin.jvm.internal.o.d(r0, r1)
            monitor-enter(r0)
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x0079 }
            r1.<init>()     // Catch:{ all -> 0x0079 }
            c.b r2 = r8.f13646a     // Catch:{ all -> 0x0079 }
            android.database.sqlite.SQLiteDatabase r2 = r2.f7501k     // Catch:{ all -> 0x0079 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0079 }
        L_0x0021:
            boolean r3 = r10.hasNext()     // Catch:{ all -> 0x0079 }
            if (r3 == 0) goto L_0x007f
            java.lang.Object r3 = r10.next()     // Catch:{ all -> 0x0079 }
            kotlin.Pair r3 = (kotlin.Pair) r3     // Catch:{ all -> 0x0079 }
            r1.clear()     // Catch:{ SQLException -> 0x0058 }
            java.lang.String r4 = "wordMixedCase"
            java.lang.Object r5 = r3.getSecond()     // Catch:{ SQLException -> 0x0058 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ SQLException -> 0x0058 }
            r1.put(r4, r5)     // Catch:{ SQLException -> 0x0058 }
            r2.beginTransactionNonExclusive()     // Catch:{ SQLException -> 0x0058 }
            java.lang.String r4 = "main_dictionary"
            java.lang.String r5 = "language_code = ? AND word = ?"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLException -> 0x0058 }
            r7 = 0
            r6[r7] = r9     // Catch:{ SQLException -> 0x0058 }
            java.lang.Object r3 = r3.getFirst()     // Catch:{ SQLException -> 0x0058 }
            r7 = 1
            r6[r7] = r3     // Catch:{ SQLException -> 0x0058 }
            r2.update(r4, r1, r5, r6)     // Catch:{ SQLException -> 0x0058 }
            r2.setTransactionSuccessful()     // Catch:{ SQLException -> 0x0058 }
            goto L_0x0075
        L_0x0056:
            r9 = move-exception
            goto L_0x007b
        L_0x0058:
            r3 = move-exception
            ch.icoaching.wrio.logging.Log r4 = ch.icoaching.wrio.logging.Log.f10572a     // Catch:{ all -> 0x0056 }
            java.lang.String r5 = "ImplMainDictionaryDao"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0056 }
            r6.<init>()     // Catch:{ all -> 0x0056 }
            java.lang.String r7 = "Exception in word update: "
            r6.append(r7)     // Catch:{ all -> 0x0056 }
            java.lang.String r7 = r3.getMessage()     // Catch:{ all -> 0x0056 }
            r6.append(r7)     // Catch:{ all -> 0x0056 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0056 }
            r4.e(r5, r6, r3)     // Catch:{ all -> 0x0056 }
        L_0x0075:
            r2.endTransaction()     // Catch:{ all -> 0x0079 }
            goto L_0x0021
        L_0x0079:
            r9 = move-exception
            goto L_0x0083
        L_0x007b:
            r2.endTransaction()     // Catch:{ all -> 0x0079 }
            throw r9     // Catch:{ all -> 0x0079 }
        L_0x007f:
            l2.q r9 = l2.q.f14567a     // Catch:{ all -> 0x0079 }
            monitor-exit(r0)
            return
        L_0x0083:
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C0672k.y(java.lang.String, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x009f, code lost:
        if (r3 == null) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map z(java.lang.String r6, int r7, int r8) {
        /*
            r5 = this;
            java.lang.String r0 = "languageCode"
            kotlin.jvm.internal.o.e(r6, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SELECT "
            r1.append(r2)
            java.lang.String r2 = "word_id"
            r1.append(r2)
            java.lang.String r3 = ", "
            r1.append(r3)
            java.lang.String r3 = "word"
            r1.append(r3)
            java.lang.String r3 = " FROM "
            r1.append(r3)
            java.lang.String r4 = "main_dictionary"
            r1.append(r4)
            java.lang.String r4 = " WHERE "
            r1.append(r4)
            java.lang.String r4 = "language_code"
            r1.append(r4)
            java.lang.String r4 = " = ?"
            r1.append(r4)
            java.lang.String r4 = " AND "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r4 = " NOT IN ("
            r1.append(r4)
            java.lang.String r4 = " SELECT "
            r1.append(r4)
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = "deletes_dictionary"
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r2 = " LIMIT ? OFFSET ?"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.o.d(r1, r2)
            c.b r2 = r5.f13646a
            android.database.sqlite.SQLiteDatabase r2 = r2.f7502l
            r3 = 0
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String[] r6 = new java.lang.String[]{r6, r8, r7}     // Catch:{ SQLiteException -> 0x009b }
            android.database.Cursor r3 = r2.rawQuery(r1, r6)     // Catch:{ SQLiteException -> 0x009b }
        L_0x0081:
            boolean r6 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x009b }
            if (r6 == 0) goto L_0x00a1
            r6 = 0
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x009b }
            r7 = 1
            java.lang.String r7 = r3.getString(r7)     // Catch:{ SQLiteException -> 0x009b }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x009b }
            r0.put(r7, r6)     // Catch:{ SQLiteException -> 0x009b }
            goto L_0x0081
        L_0x0099:
            r6 = move-exception
            goto L_0x00a5
        L_0x009b:
            r6 = move-exception
            r6.printStackTrace()     // Catch:{ all -> 0x0099 }
            if (r3 == 0) goto L_0x00a4
        L_0x00a1:
            r3.close()
        L_0x00a4:
            return r0
        L_0x00a5:
            if (r3 == 0) goto L_0x00aa
            r3.close()
        L_0x00aa:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C0672k.z(java.lang.String, int, int):java.util.Map");
    }

    public void f(SQLiteDatabase sQLiteDatabase) {
        o.e(sQLiteDatabase, "db");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS main_dictionary");
    }

    public void c(String str) {
        o.e(str, "lowercaseWord");
        Object obj = this.f13646a.f7503m;
        o.d(obj, "databaseLock");
        synchronized (obj) {
            SQLiteDatabase sQLiteDatabase = this.f13646a.f7501k;
            try {
                sQLiteDatabase.beginTransactionNonExclusive();
                sQLiteDatabase.execSQL("DELETE FROM main_dictionary WHERE word = ?", new String[]{str});
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e4) {
                try {
                    e4.printStackTrace();
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            sQLiteDatabase.endTransaction();
            q qVar = q.f14567a;
        }
    }
}
