package ch.icoaching.wrio.data.source.local;

public abstract class a {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r1 == 0) goto L_0x003f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(android.database.sqlite.SQLiteDatabase r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.e(r4, r0)
            java.lang.String r0 = "column"
            kotlin.jvm.internal.o.e(r5, r0)
            java.lang.String r0 = "table"
            kotlin.jvm.internal.o.e(r6, r0)
            r0 = 0
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0036 }
            r2.<init>()     // Catch:{ Exception -> 0x0036 }
            java.lang.String r3 = "SELECT * FROM "
            r2.append(r3)     // Catch:{ Exception -> 0x0036 }
            r2.append(r6)     // Catch:{ Exception -> 0x0036 }
            java.lang.String r6 = " LIMIT 0"
            r2.append(r6)     // Catch:{ Exception -> 0x0036 }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x0036 }
            android.database.Cursor r1 = r4.rawQuery(r6, r1)     // Catch:{ Exception -> 0x0036 }
            int r4 = r1.getColumnIndex(r5)     // Catch:{ Exception -> 0x0036 }
            r5 = -1
            if (r4 == r5) goto L_0x003c
            r0 = 1
            goto L_0x003c
        L_0x0034:
            r4 = move-exception
            goto L_0x0040
        L_0x0036:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x003f
        L_0x003c:
            r1.close()
        L_0x003f:
            return r0
        L_0x0040:
            if (r1 == 0) goto L_0x0045
            r1.close()
        L_0x0045:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.icoaching.wrio.data.source.local.a.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):boolean");
    }
}
