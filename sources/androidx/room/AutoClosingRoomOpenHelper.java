package androidx.room;

import Z.c;
import Z.e;
import Z.f;
import Z.g;
import Z.h;
import Z.j;
import Z.k;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import l2.q;
import u2.l;

public final class AutoClosingRoomOpenHelper implements h, f {

    /* renamed from: a  reason: collision with root package name */
    private final h f6714a;

    /* renamed from: b  reason: collision with root package name */
    public final c f6715b;

    /* renamed from: c  reason: collision with root package name */
    private final AutoClosingSupportSQLiteDatabase f6716c;

    public static final class AutoClosingSupportSQLiteDatabase implements g {

        /* renamed from: a  reason: collision with root package name */
        private final c f6717a;

        public AutoClosingSupportSQLiteDatabase(c cVar) {
            o.e(cVar, "autoCloser");
            this.f6717a = cVar;
        }

        public Cursor J(j jVar) {
            o.e(jVar, "query");
            try {
                return new a(this.f6717a.j().J(jVar), this.f6717a);
            } catch (Throwable th) {
                this.f6717a.e();
                throw th;
            }
        }

        public String K() {
            return (String) this.f6717a.g(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1.INSTANCE);
        }

        public boolean M() {
            if (this.f6717a.h() == null) {
                return false;
            }
            return ((Boolean) this.f6717a.g(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1.INSTANCE)).booleanValue();
        }

        public boolean S() {
            return ((Boolean) this.f6717a.g(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1.INSTANCE)).booleanValue();
        }

        public void V() {
            q qVar;
            g h4 = this.f6717a.h();
            if (h4 != null) {
                h4.V();
                qVar = q.f14567a;
            } else {
                qVar = null;
            }
            if (qVar == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        public void X(String str, Object[] objArr) {
            o.e(str, "sql");
            o.e(objArr, "bindArgs");
            this.f6717a.g(new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$2(str, objArr));
        }

        public void Y() {
            try {
                this.f6717a.j().Y();
            } catch (Throwable th) {
                this.f6717a.e();
                throw th;
            }
        }

        public int Z(String str, int i4, ContentValues contentValues, String str2, Object[] objArr) {
            o.e(str, "table");
            o.e(contentValues, "values");
            return ((Number) this.f6717a.g(new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$update$1(str, i4, contentValues, str2, objArr))).intValue();
        }

        public final void a() {
            this.f6717a.g(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pokeOpen$1.INSTANCE);
        }

        public void close() {
            this.f6717a.d();
        }

        public void i() {
            if (this.f6717a.h() != null) {
                try {
                    g h4 = this.f6717a.h();
                    o.b(h4);
                    h4.i();
                } finally {
                    this.f6717a.e();
                }
            } else {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
        }

        public boolean isOpen() {
            g h4 = this.f6717a.h();
            if (h4 == null) {
                return false;
            }
            return h4.isOpen();
        }

        public void j() {
            try {
                this.f6717a.j().j();
            } catch (Throwable th) {
                this.f6717a.e();
                throw th;
            }
        }

        public List l() {
            return (List) this.f6717a.g(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1.INSTANCE);
        }

        public Cursor l0(String str) {
            o.e(str, "query");
            try {
                return new a(this.f6717a.j().l0(str), this.f6717a);
            } catch (Throwable th) {
                this.f6717a.e();
                throw th;
            }
        }

        public void p(String str) {
            o.e(str, "sql");
            this.f6717a.g(new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$1(str));
        }

        public k u(String str) {
            o.e(str, "sql");
            return new AutoClosingSupportSqliteStatement(str, this.f6717a);
        }

        public Cursor x(j jVar, CancellationSignal cancellationSignal) {
            o.e(jVar, "query");
            try {
                return new a(this.f6717a.j().x(jVar, cancellationSignal), this.f6717a);
            } catch (Throwable th) {
                this.f6717a.e();
                throw th;
            }
        }
    }

    private static final class AutoClosingSupportSqliteStatement implements k {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f6718a;

        /* renamed from: b  reason: collision with root package name */
        private final c f6719b;

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList f6720c = new ArrayList();

        public AutoClosingSupportSqliteStatement(String str, c cVar) {
            o.e(str, "sql");
            o.e(cVar, "autoCloser");
            this.f6718a = str;
            this.f6719b = cVar;
        }

        /* access modifiers changed from: private */
        public final void f(k kVar) {
            Iterator it = this.f6720c.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    C0718m.s();
                }
                Object obj = this.f6720c.get(i4);
                if (obj == null) {
                    kVar.B(i5);
                } else if (obj instanceof Long) {
                    kVar.U(i5, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.E(i5, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.q(i5, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.a0(i5, (byte[]) obj);
                }
                i4 = i5;
            }
        }

        private final Object h(l lVar) {
            return this.f6719b.g(new AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1(this, lVar));
        }

        private final void m(int i4, Object obj) {
            int size;
            int i5 = i4 - 1;
            if (i5 >= this.f6720c.size() && (size = this.f6720c.size()) <= i5) {
                while (true) {
                    this.f6720c.add((Object) null);
                    if (size == i5) {
                        break;
                    }
                    size++;
                }
            }
            this.f6720c.set(i5, obj);
        }

        public void B(int i4) {
            m(i4, (Object) null);
        }

        public void E(int i4, double d4) {
            m(i4, Double.valueOf(d4));
        }

        public void U(int i4, long j4) {
            m(i4, Long.valueOf(j4));
        }

        public void a0(int i4, byte[] bArr) {
            o.e(bArr, "value");
            m(i4, bArr);
        }

        public void close() {
        }

        public long k0() {
            return ((Number) h(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeInsert$1.INSTANCE)).longValue();
        }

        public void q(int i4, String str) {
            o.e(str, "value");
            m(i4, str);
        }

        public int t() {
            return ((Number) h(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeUpdateDelete$1.INSTANCE)).intValue();
        }
    }

    private static final class a implements Cursor {

        /* renamed from: a  reason: collision with root package name */
        private final Cursor f6721a;

        /* renamed from: b  reason: collision with root package name */
        private final c f6722b;

        public a(Cursor cursor, c cVar) {
            o.e(cursor, "delegate");
            o.e(cVar, "autoCloser");
            this.f6721a = cursor;
            this.f6722b = cVar;
        }

        public void close() {
            this.f6721a.close();
            this.f6722b.e();
        }

        public void copyStringToBuffer(int i4, CharArrayBuffer charArrayBuffer) {
            this.f6721a.copyStringToBuffer(i4, charArrayBuffer);
        }

        public void deactivate() {
            this.f6721a.deactivate();
        }

        public byte[] getBlob(int i4) {
            return this.f6721a.getBlob(i4);
        }

        public int getColumnCount() {
            return this.f6721a.getColumnCount();
        }

        public int getColumnIndex(String str) {
            return this.f6721a.getColumnIndex(str);
        }

        public int getColumnIndexOrThrow(String str) {
            return this.f6721a.getColumnIndexOrThrow(str);
        }

        public String getColumnName(int i4) {
            return this.f6721a.getColumnName(i4);
        }

        public String[] getColumnNames() {
            return this.f6721a.getColumnNames();
        }

        public int getCount() {
            return this.f6721a.getCount();
        }

        public double getDouble(int i4) {
            return this.f6721a.getDouble(i4);
        }

        public Bundle getExtras() {
            return this.f6721a.getExtras();
        }

        public float getFloat(int i4) {
            return this.f6721a.getFloat(i4);
        }

        public int getInt(int i4) {
            return this.f6721a.getInt(i4);
        }

        public long getLong(int i4) {
            return this.f6721a.getLong(i4);
        }

        public Uri getNotificationUri() {
            return c.a(this.f6721a);
        }

        public List getNotificationUris() {
            return f.a(this.f6721a);
        }

        public int getPosition() {
            return this.f6721a.getPosition();
        }

        public short getShort(int i4) {
            return this.f6721a.getShort(i4);
        }

        public String getString(int i4) {
            return this.f6721a.getString(i4);
        }

        public int getType(int i4) {
            return this.f6721a.getType(i4);
        }

        public boolean getWantsAllOnMoveCalls() {
            return this.f6721a.getWantsAllOnMoveCalls();
        }

        public boolean isAfterLast() {
            return this.f6721a.isAfterLast();
        }

        public boolean isBeforeFirst() {
            return this.f6721a.isBeforeFirst();
        }

        public boolean isClosed() {
            return this.f6721a.isClosed();
        }

        public boolean isFirst() {
            return this.f6721a.isFirst();
        }

        public boolean isLast() {
            return this.f6721a.isLast();
        }

        public boolean isNull(int i4) {
            return this.f6721a.isNull(i4);
        }

        public boolean move(int i4) {
            return this.f6721a.move(i4);
        }

        public boolean moveToFirst() {
            return this.f6721a.moveToFirst();
        }

        public boolean moveToLast() {
            return this.f6721a.moveToLast();
        }

        public boolean moveToNext() {
            return this.f6721a.moveToNext();
        }

        public boolean moveToPosition(int i4) {
            return this.f6721a.moveToPosition(i4);
        }

        public boolean moveToPrevious() {
            return this.f6721a.moveToPrevious();
        }

        public void registerContentObserver(ContentObserver contentObserver) {
            this.f6721a.registerContentObserver(contentObserver);
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f6721a.registerDataSetObserver(dataSetObserver);
        }

        public boolean requery() {
            return this.f6721a.requery();
        }

        public Bundle respond(Bundle bundle) {
            return this.f6721a.respond(bundle);
        }

        public void setExtras(Bundle bundle) {
            o.e(bundle, "extras");
            e.a(this.f6721a, bundle);
        }

        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f6721a.setNotificationUri(contentResolver, uri);
        }

        public void setNotificationUris(ContentResolver contentResolver, List list) {
            o.e(contentResolver, "cr");
            o.e(list, "uris");
            f.b(this.f6721a, contentResolver, list);
        }

        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f6721a.unregisterContentObserver(contentObserver);
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f6721a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public AutoClosingRoomOpenHelper(h hVar, c cVar) {
        o.e(hVar, "delegate");
        o.e(cVar, "autoCloser");
        this.f6714a = hVar;
        this.f6715b = cVar;
        cVar.k(getDelegate());
        this.f6716c = new AutoClosingSupportSQLiteDatabase(cVar);
    }

    public void close() {
        this.f6716c.close();
    }

    public String getDatabaseName() {
        return this.f6714a.getDatabaseName();
    }

    public h getDelegate() {
        return this.f6714a;
    }

    public g i0() {
        this.f6716c.a();
        return this.f6716c;
    }

    public void setWriteAheadLoggingEnabled(boolean z3) {
        this.f6714a.setWriteAheadLoggingEnabled(z3);
    }
}
