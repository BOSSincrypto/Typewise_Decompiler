package B0;

import E0.f;
import android.content.Context;
import android.content.res.AssetManager;
import ch.icoaching.typewise.c;
import ch.icoaching.typewise.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.util.List;
import kotlin.collections.C0713h;
import kotlin.collections.C0718m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import y0.C0944a;

public final class H {

    /* renamed from: d  reason: collision with root package name */
    public static final a f62d = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f63a;

    /* renamed from: b  reason: collision with root package name */
    private final String f64b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f65c;

    public static final class a {
        private a() {
        }

        public final H a(Context context, String str) {
            List j4;
            Context context2 = context;
            String str2 = str;
            o.e(context2, "context");
            o.e(str2, "language");
            File file = new File(c.f8119a.a(context2), str2);
            String str3 = "v1.3" + "_" + str2 + ".tflite";
            String str4 = "v1.3" + "_" + str2 + ".json";
            e eVar = e.f8233a;
            String str5 = ", ";
            String str6 = "create() :: ";
            e.b(eVar, "ModelAndNormalizer", "create() :: " + str3 + ", " + str4, (Throwable) null, 4, (Object) null);
            File file2 = new File(file, str3);
            if (!file2.exists() || !file2.isFile()) {
                String str7 = "getPath(...)";
                String[] list = context.getAssets().list("models");
                if (list == null || (j4 = C0713h.a0(list)) == null) {
                    j4 = C0718m.j();
                }
                List list2 = j4;
                String str8 = str7;
                e.b(eVar, "ModelAndNormalizer", "assetsFiles = " + list2, (Throwable) null, 4, (Object) null);
                List list3 = list2;
                if (list3.contains(str3)) {
                    e.b(eVar, "ModelAndNormalizer", "create() :: Model and normalizer found in assets.", (Throwable) null, 4, (Object) null);
                    return new H("models/" + str3, "normalizers/" + str4, true, (i) null);
                }
                String a4 = C0944a.a(str);
                String str9 = "v1.3" + "_" + a4 + ".tflite";
                String str10 = "v1.3" + "_" + a4 + ".json";
                String str11 = "models/";
                String str12 = "normalizers/";
                List list4 = list3;
                e.b(eVar, "ModelAndNormalizer", str6 + str9 + str5 + str10, (Throwable) null, 4, (Object) null);
                File file3 = new File(file, str9);
                if (file3.exists() && file3.isFile()) {
                    e.b(eVar, "ModelAndNormalizer", "create() :: Model and normalizer (without locale) found in internal storage.", (Throwable) null, 4, (Object) null);
                    File file4 = new File(file, str10);
                    String path = file3.getPath();
                    String str13 = str8;
                    o.d(path, str13);
                    String path2 = file4.getPath();
                    o.d(path2, str13);
                    return new H(path, path2, false, (i) null);
                } else if (list4.contains(str9)) {
                    e.b(eVar, "ModelAndNormalizer", "create() :: Model and normalizer (without locale) found in assets.", (Throwable) null, 4, (Object) null);
                    return new H(str11 + str9, str12 + str10, true, (i) null);
                } else {
                    e.l(eVar, "ModelAndNormalizer", "create() :: Model and normalizer not found. Using 'en' model and normalizer files as default", (Throwable) null, 4, (Object) null);
                    return new H(str11 + ("v1.3" + "_en.tflite"), str12 + ("v1.3" + "_en.json"), true, (i) null);
                }
            } else {
                String str14 = "getPath(...)";
                e.b(eVar, "ModelAndNormalizer", "create() :: Model and normalizer found in internal storage.", (Throwable) null, 4, (Object) null);
                File file5 = new File(file, str4);
                String path3 = file2.getPath();
                o.d(path3, str14);
                String path4 = file5.getPath();
                o.d(path4, str14);
                return new H(path3, path4, false, (i) null);
            }
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    private H(String str, String str2, boolean z3) {
        this.f63a = str;
        this.f64b = str2;
        this.f65c = z3;
    }

    public final MappedByteBuffer a(Context context) {
        o.e(context, "context");
        if (!this.f65c) {
            return E0.e.a(new File(this.f63a));
        }
        AssetManager assets = context.getAssets();
        o.d(assets, "getAssets(...)");
        return E0.a.d(assets, this.f63a);
    }

    public final String b(Context context) {
        InputStream inputStream;
        o.e(context, "context");
        if (this.f65c) {
            inputStream = context.getAssets().open(this.f64b);
            o.b(inputStream);
        } else {
            inputStream = new FileInputStream(new File(this.f64b));
        }
        String a4 = f.a(inputStream);
        inputStream.close();
        return a4;
    }

    public String toString() {
        String str = this.f63a;
        String str2 = this.f64b;
        boolean z3 = this.f65c;
        return "ModelAndNormalizerUrls(modelPath='" + str + "', normalizerPath='" + str2 + "', isInAssets=" + z3 + ")";
    }

    public /* synthetic */ H(String str, String str2, boolean z3, i iVar) {
        this(str, str2, z3);
    }
}
