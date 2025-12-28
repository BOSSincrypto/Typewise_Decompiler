package k2;

import android.content.Context;
import android.content.SharedPreferences;
import ch.icoaching.wrio.logging.Log;
import i2.C0681b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.o;
import u2.l;

/* renamed from: k2.a  reason: case insensitive filesystem */
public final class C0705a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13804a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f13805b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences.Editor f13806c;

    public C0705a(Context context, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        o.e(context, "context");
        o.e(sharedPreferences, "sharedPreferences");
        o.e(editor, "sharedPreferencesEditor");
        this.f13804a = context;
        this.f13805b = sharedPreferences;
        this.f13806c = editor;
    }

    private final boolean b(String str) {
        char[] charArray = str.toCharArray();
        o.d(charArray, "toCharArray(...)");
        for (char U3 : charArray) {
            if (kotlin.text.o.U(" \n&\\+=\\/\\\\-", U3, 0, false, 6, (Object) null) >= 0) {
                Log.p(Log.f10572a, "PreferencesMigration0to1", "containsWordSeparators() :: Removing illegal key: " + str, (Throwable) null, 4, (Object) null);
                return true;
            }
        }
        return false;
    }

    public void a() {
        Log.d(Log.f10572a, "PreferencesMigration0to1", "migrate() :: Start", (Throwable) null, 4, (Object) null);
        Map<String, ?> all = this.f13804a.getSharedPreferences("shortcuts", 0).getAll();
        ArrayList arrayList = new ArrayList(all.keySet());
        C0718m.w(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            String str = (String) next;
            o.b(str);
            if (!b(str)) {
                arrayList2.add(next);
            }
        }
        String Z3 = C0718m.Z(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
        Log log = Log.f10572a;
        Log.d(log, "PreferencesMigration0to1", "migrate() :: Writing shortcuts -> " + Z3, (Throwable) null, 4, (Object) null);
        this.f13806c.putString("shortcuts", Z3);
        for (String next2 : all.keySet()) {
            Log log2 = Log.f10572a;
            Log.d(log2, "PreferencesMigration0to1", "migrate() :: Writing shortcut." + next2 + " -> " + all.get(next2), (Throwable) null, 4, (Object) null);
            SharedPreferences.Editor editor = this.f13806c;
            StringBuilder sb = new StringBuilder();
            sb.append("shortcut.");
            sb.append(next2);
            editor.putString(sb.toString(), String.valueOf(all.get(next2)));
        }
        String string = this.f13805b.getString("langs", "system");
        o.b(string);
        String[] strArr = (String[]) kotlin.text.o.t0(string, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
        this.f13806c.putString("langs", C0718m.Z(C0681b.a(C0718m.m(Arrays.copyOf(strArr, strArr.length))), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        this.f13806c.apply();
        Log.d(Log.f10572a, "PreferencesMigration0to1", "migrate() :: Done", (Throwable) null, 4, (Object) null);
    }
}
