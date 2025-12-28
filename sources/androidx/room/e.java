package androidx.room;

import Z.h;
import android.content.Context;
import android.content.Intent;
import androidx.room.RoomDatabase;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6789a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6790b;

    /* renamed from: c  reason: collision with root package name */
    public final h.c f6791c;

    /* renamed from: d  reason: collision with root package name */
    public final RoomDatabase.d f6792d;

    /* renamed from: e  reason: collision with root package name */
    public final List f6793e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6794f;

    /* renamed from: g  reason: collision with root package name */
    public final RoomDatabase.JournalMode f6795g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f6796h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f6797i;

    /* renamed from: j  reason: collision with root package name */
    public final Intent f6798j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f6799k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f6800l;

    /* renamed from: m  reason: collision with root package name */
    private final Set f6801m;

    /* renamed from: n  reason: collision with root package name */
    public final String f6802n;

    /* renamed from: o  reason: collision with root package name */
    public final File f6803o;

    /* renamed from: p  reason: collision with root package name */
    public final Callable f6804p;

    /* renamed from: q  reason: collision with root package name */
    public final List f6805q;

    /* renamed from: r  reason: collision with root package name */
    public final List f6806r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f6807s;

    public e(Context context, String str, h.c cVar, RoomDatabase.d dVar, List list, boolean z3, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, Intent intent, boolean z4, boolean z5, Set set, String str2, File file, Callable callable, RoomDatabase.e eVar, List list2, List list3) {
        RoomDatabase.JournalMode journalMode2 = journalMode;
        Executor executor3 = executor;
        Executor executor4 = executor2;
        Intent intent2 = intent;
        List list4 = list2;
        List list5 = list3;
        o.e(context, "context");
        o.e(cVar, "sqliteOpenHelperFactory");
        o.e(dVar, "migrationContainer");
        o.e(journalMode2, "journalMode");
        o.e(executor3, "queryExecutor");
        o.e(executor4, "transactionExecutor");
        o.e(list4, "typeConverters");
        o.e(list5, "autoMigrationSpecs");
        this.f6789a = context;
        this.f6790b = str;
        this.f6791c = cVar;
        this.f6792d = dVar;
        this.f6793e = list;
        this.f6794f = z3;
        this.f6795g = journalMode2;
        this.f6796h = executor3;
        this.f6797i = executor4;
        this.f6798j = intent2;
        this.f6799k = z4;
        this.f6800l = z5;
        this.f6801m = set;
        this.f6802n = str2;
        this.f6803o = file;
        this.f6804p = callable;
        this.f6805q = list4;
        this.f6806r = list5;
        this.f6807s = intent2 != null;
    }

    public boolean a(int i4, int i5) {
        if ((i4 > i5 && this.f6800l) || !this.f6799k) {
            return false;
        }
        Set set = this.f6801m;
        if (set == null || !set.contains(Integer.valueOf(i4))) {
            return true;
        }
        return false;
    }
}
