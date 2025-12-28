package D0;

import E0.e;
import android.content.Context;
import android.content.res.AssetManager;
import ch.icoaching.typewise.file_handling.ConfigHolder;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import s0.C0893c;
import y0.C0944a;

public final class f0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f272e = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f273a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f274b;

    /* renamed from: c  reason: collision with root package name */
    private final String f275c;

    /* renamed from: d  reason: collision with root package name */
    private final String f276d;

    public static final class a {
        private a() {
        }

        public final f0 a(ConfigHolder configHolder, String str, List list, List list2) {
            String str2 = str;
            List list3 = list;
            List list4 = list2;
            ConfigHolder configHolder2 = configHolder;
            o.e(configHolder, "configHolder");
            o.e(str, "language");
            o.e(list3, "assetsLanguages");
            o.e(list4, "downloadedLanguages");
            C0893c e4 = configHolder.e();
            if (e4.g().contains(str) && e4.d().keySet().contains(str)) {
                Object obj = e4.d().get(str);
                o.b(obj);
                C0893c.b bVar = (C0893c.b) obj;
                if (list3.contains(str)) {
                    return new f0(str, true, bVar.c(), bVar.b(), (i) null);
                } else if (list4.contains(str)) {
                    return new f0(str, false, bVar.c(), bVar.b(), (i) null);
                }
            }
            String a4 = C0944a.a(str);
            if (!e4.g().contains(a4) || !e4.d().keySet().contains(a4)) {
                return null;
            }
            Object obj2 = e4.d().get(a4);
            o.b(obj2);
            C0893c.b bVar2 = (C0893c.b) obj2;
            if (list3.contains(a4)) {
                return new f0(a4, true, bVar2.c(), bVar2.b(), (i) null);
            }
            if (list4.contains(a4)) {
                return new f0(a4, false, bVar2.c(), bVar2.b(), (i) null);
            }
            ArrayList arrayList = new ArrayList(C0718m.t(list3, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C0944a.a((String) it.next()));
            }
            if (arrayList.contains(a4)) {
                return new f0(a4, true, bVar2.c(), bVar2.b(), (i) null);
            }
            ArrayList arrayList2 = new ArrayList(C0718m.t(list4, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C0944a.a((String) it2.next()));
            }
            if (arrayList2.contains(a4)) {
                return new f0(a4, false, bVar2.c(), bVar2.b(), (i) null);
            }
            return null;
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    private f0(String str, boolean z3, String str2, String str3) {
        this.f273a = str;
        this.f274b = z3;
        this.f275c = str2;
        this.f276d = str3;
    }

    public final ByteBuffer a(Context context, String str) {
        o.e(context, "context");
        o.e(str, "modelPath");
        if (!this.f274b) {
            return e.a(new File(str));
        }
        AssetManager assets = context.getAssets();
        o.d(assets, "getAssets(...)");
        return E0.a.c(assets, str);
    }

    public String toString() {
        String str = this.f273a;
        boolean z3 = this.f274b;
        String str2 = this.f275c;
        String str3 = this.f276d;
        return "ModelAndIndices(language='" + str + "', isInAssets=" + z3 + ", wordCompletionModelName='" + str2 + "', sentenceCompletionModelName='" + str3 + "')";
    }

    public /* synthetic */ f0(String str, boolean z3, String str2, String str3, i iVar) {
        this(str, z3, str2, str3);
    }
}
