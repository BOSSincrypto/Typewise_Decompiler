package X;

import Z.g;
import Z.j;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import l2.q;
import s2.C0896b;

public abstract class b {
    public static final void a(g gVar) {
        o.e(gVar, "db");
        List c4 = C0718m.c();
        Cursor l02 = gVar.l0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (l02.moveToNext()) {
            try {
                c4.add(l02.getString(0));
            } catch (Throwable th) {
                C0896b.a(l02, th);
                throw th;
            }
        }
        q qVar = q.f14567a;
        C0896b.a(l02, (Throwable) null);
        for (String str : C0718m.a(c4)) {
            o.d(str, "triggerName");
            if (kotlin.text.o.G(str, "room_fts_content_sync_", false, 2, (Object) null)) {
                gVar.p("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static final Cursor b(RoomDatabase roomDatabase, j jVar, boolean z3, CancellationSignal cancellationSignal) {
        int i4;
        o.e(roomDatabase, "db");
        o.e(jVar, "sqLiteQuery");
        Cursor x3 = roomDatabase.x(jVar, cancellationSignal);
        if (!z3 || !(x3 instanceof AbstractWindowedCursor)) {
            return x3;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) x3;
        int count = abstractWindowedCursor.getCount();
        if (abstractWindowedCursor.hasWindow()) {
            i4 = abstractWindowedCursor.getWindow().getNumRows();
        } else {
            i4 = count;
        }
        if (i4 < count) {
            return a.a(x3);
        }
        return x3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        s2.C0896b.a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int c(java.io.File r8) {
        /*
            java.lang.String r0 = "databaseFile"
            kotlin.jvm.internal.o.e(r8, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r8)
            java.nio.channels.FileChannel r8 = r0.getChannel()
            r0 = 4
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ all -> 0x0033 }
            r4 = 4
            r6 = 1
            r2 = 60
            r1 = r8
            r1.tryLock(r2, r4, r6)     // Catch:{ all -> 0x0033 }
            r1 = 60
            r8.position(r1)     // Catch:{ all -> 0x0033 }
            int r1 = r8.read(r7)     // Catch:{ all -> 0x0033 }
            if (r1 != r0) goto L_0x0035
            r7.rewind()     // Catch:{ all -> 0x0033 }
            int r0 = r7.getInt()     // Catch:{ all -> 0x0033 }
            r1 = 0
            s2.C0896b.a(r8, r1)
            return r0
        L_0x0033:
            r0 = move-exception
            goto L_0x003d
        L_0x0035:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "Bad database header, unable to read 4 bytes at offset 60"
            r0.<init>(r1)     // Catch:{ all -> 0x0033 }
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x003d:
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r1 = move-exception
            s2.C0896b.a(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.b.c(java.io.File):int");
    }
}
