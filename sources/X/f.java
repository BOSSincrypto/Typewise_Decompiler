package X;

import X.e;
import Z.g;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.collections.L;
import kotlin.jvm.internal.o;
import s2.C0896b;

public abstract class f {
    private static final Map a(g gVar, String str) {
        Throwable th;
        boolean z3;
        Cursor l02 = gVar.l0("PRAGMA table_info(`" + str + "`)");
        try {
            if (l02.getColumnCount() <= 0) {
                Map h4 = D.h();
                C0896b.a(l02, (Throwable) null);
                return h4;
            }
            int columnIndex = l02.getColumnIndex("name");
            int columnIndex2 = l02.getColumnIndex("type");
            int columnIndex3 = l02.getColumnIndex("notnull");
            int columnIndex4 = l02.getColumnIndex("pk");
            int columnIndex5 = l02.getColumnIndex("dflt_value");
            Map c4 = D.c();
            while (l02.moveToNext()) {
                String string = l02.getString(columnIndex);
                String string2 = l02.getString(columnIndex2);
                if (l02.getInt(columnIndex3) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z4 = z3;
                int i4 = l02.getInt(columnIndex4);
                String string3 = l02.getString(columnIndex5);
                o.d(string, "name");
                o.d(string2, "type");
                e.a aVar = r11;
                e.a aVar2 = new e.a(string, string2, z4, i4, string3, 2);
                c4.put(string, aVar);
            }
            Map b4 = D.b(c4);
            C0896b.a(l02, (Throwable) null);
            return b4;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            C0896b.a(l02, th);
            throw th3;
        }
    }

    private static final List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List c4 = C0718m.c();
        while (cursor.moveToNext()) {
            int i4 = cursor.getInt(columnIndex);
            int i5 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            o.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            o.d(string2, "cursor.getString(toColumnIndex)");
            c4.add(new e.d(i4, i5, string, string2));
        }
        return C0718m.p0(C0718m.a(c4));
    }

    private static final Set c(g gVar, String str) {
        Cursor l02 = gVar.l0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = l02.getColumnIndex("id");
            int columnIndex2 = l02.getColumnIndex("seq");
            int columnIndex3 = l02.getColumnIndex("table");
            int columnIndex4 = l02.getColumnIndex("on_delete");
            int columnIndex5 = l02.getColumnIndex("on_update");
            List b4 = b(l02);
            l02.moveToPosition(-1);
            Set b5 = L.b();
            while (l02.moveToNext()) {
                if (l02.getInt(columnIndex2) == 0) {
                    int i4 = l02.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<e.d> arrayList3 = new ArrayList<>();
                    for (Object next : b4) {
                        if (((e.d) next).c() == i4) {
                            arrayList3.add(next);
                        }
                    }
                    for (e.d dVar : arrayList3) {
                        arrayList.add(dVar.b());
                        arrayList2.add(dVar.d());
                    }
                    String string = l02.getString(columnIndex3);
                    o.d(string, "cursor.getString(tableColumnIndex)");
                    String string2 = l02.getString(columnIndex4);
                    o.d(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = l02.getString(columnIndex5);
                    o.d(string3, "cursor.getString(onUpdateColumnIndex)");
                    b5.add(new e.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set a4 = L.a(b5);
            C0896b.a(l02, (Throwable) null);
            return a4;
        } catch (Throwable th) {
            C0896b.a(l02, th);
            throw th;
        }
    }

    private static final e.C0038e d(g gVar, String str, boolean z3) {
        String str2;
        Cursor l02 = gVar.l0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = l02.getColumnIndex("seqno");
            int columnIndex2 = l02.getColumnIndex("cid");
            int columnIndex3 = l02.getColumnIndex("name");
            int columnIndex4 = l02.getColumnIndex("desc");
            if (!(columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1)) {
                if (columnIndex4 != -1) {
                    TreeMap treeMap = new TreeMap();
                    TreeMap treeMap2 = new TreeMap();
                    while (l02.moveToNext()) {
                        if (l02.getInt(columnIndex2) >= 0) {
                            int i4 = l02.getInt(columnIndex);
                            String string = l02.getString(columnIndex3);
                            if (l02.getInt(columnIndex4) > 0) {
                                str2 = "DESC";
                            } else {
                                str2 = "ASC";
                            }
                            Integer valueOf = Integer.valueOf(i4);
                            o.d(string, "columnName");
                            treeMap.put(valueOf, string);
                            treeMap2.put(Integer.valueOf(i4), str2);
                        }
                    }
                    Collection values = treeMap.values();
                    o.d(values, "columnsMap.values");
                    List B02 = C0718m.B0(values);
                    Collection values2 = treeMap2.values();
                    o.d(values2, "ordersMap.values");
                    e.C0038e eVar = new e.C0038e(str, z3, B02, C0718m.B0(values2));
                    C0896b.a(l02, (Throwable) null);
                    return eVar;
                }
            }
            C0896b.a(l02, (Throwable) null);
            return null;
        } catch (Throwable th) {
            C0896b.a(l02, th);
            throw th;
        }
    }

    private static final Set e(g gVar, String str) {
        Cursor l02 = gVar.l0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = l02.getColumnIndex("name");
            int columnIndex2 = l02.getColumnIndex("origin");
            int columnIndex3 = l02.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    Set b4 = L.b();
                    while (l02.moveToNext()) {
                        if (o.a("c", l02.getString(columnIndex2))) {
                            String string = l02.getString(columnIndex);
                            boolean z3 = true;
                            if (l02.getInt(columnIndex3) != 1) {
                                z3 = false;
                            }
                            o.d(string, "name");
                            e.C0038e d4 = d(gVar, string, z3);
                            if (d4 == null) {
                                C0896b.a(l02, (Throwable) null);
                                return null;
                            }
                            b4.add(d4);
                        }
                    }
                    Set a4 = L.a(b4);
                    C0896b.a(l02, (Throwable) null);
                    return a4;
                }
            }
            C0896b.a(l02, (Throwable) null);
            return null;
        } catch (Throwable th) {
            C0896b.a(l02, th);
            throw th;
        }
    }

    public static final e f(g gVar, String str) {
        o.e(gVar, "database");
        o.e(str, "tableName");
        return new e(str, a(gVar, str), c(gVar, str), e(gVar, str));
    }
}
