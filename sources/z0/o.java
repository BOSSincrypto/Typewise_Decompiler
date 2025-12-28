package Z0;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p1.l;

public class o implements l {

    /* renamed from: d  reason: collision with root package name */
    private static final Bitmap.Config[] f2175d;

    /* renamed from: e  reason: collision with root package name */
    private static final Bitmap.Config[] f2176e;

    /* renamed from: f  reason: collision with root package name */
    private static final Bitmap.Config[] f2177f = {Bitmap.Config.RGB_565};

    /* renamed from: g  reason: collision with root package name */
    private static final Bitmap.Config[] f2178g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h  reason: collision with root package name */
    private static final Bitmap.Config[] f2179h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a  reason: collision with root package name */
    private final c f2180a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final g f2181b = new g();

    /* renamed from: c  reason: collision with root package name */
    private final Map f2182c = new HashMap();

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2183a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2183a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2183a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2183a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2183a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Z0.o.a.<clinit>():void");
        }
    }

    static final class b implements m {

        /* renamed from: a  reason: collision with root package name */
        private final c f2184a;

        /* renamed from: b  reason: collision with root package name */
        int f2185b;

        /* renamed from: c  reason: collision with root package name */
        private Bitmap.Config f2186c;

        public b(c cVar) {
            this.f2184a = cVar;
        }

        public void a() {
            this.f2184a.c(this);
        }

        public void b(int i4, Bitmap.Config config) {
            this.f2185b = i4;
            this.f2186c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f2185b != bVar.f2185b || !l.c(this.f2186c, bVar.f2186c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i4;
            int i5 = this.f2185b * 31;
            Bitmap.Config config = this.f2186c;
            if (config != null) {
                i4 = config.hashCode();
            } else {
                i4 = 0;
            }
            return i5 + i4;
        }

        public String toString() {
            return o.h(this.f2185b, this.f2186c);
        }
    }

    static class c extends c {
        c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public b a() {
            return new b(this);
        }

        public b e(int i4, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.b(i4, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f2175d = configArr;
        f2176e = configArr;
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap j4 = j(bitmap.getConfig());
        Integer num2 = (Integer) j4.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            j4.remove(num);
        } else {
            j4.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private b g(int i4, Bitmap.Config config) {
        b e4 = this.f2180a.e(i4, config);
        Bitmap.Config[] i5 = i(config);
        int length = i5.length;
        int i6 = 0;
        while (i6 < length) {
            Bitmap.Config config2 = i5[i6];
            Integer num = (Integer) j(config2).ceilingKey(Integer.valueOf(i4));
            if (num == null || num.intValue() > i4 * 8) {
                i6++;
            } else {
                if (num.intValue() == i4) {
                    if (config2 == null) {
                        if (config == null) {
                            return e4;
                        }
                    } else if (config2.equals(config)) {
                        return e4;
                    }
                }
                this.f2180a.c(e4);
                return this.f2180a.e(num.intValue(), config2);
            }
        }
        return e4;
    }

    static String h(int i4, Bitmap.Config config) {
        return "[" + i4 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f2176e;
        }
        int i4 = a.f2183a[config.ordinal()];
        if (i4 == 1) {
            return f2175d;
        }
        if (i4 == 2) {
            return f2177f;
        }
        if (i4 == 3) {
            return f2178g;
        }
        if (i4 == 4) {
            return f2179h;
        }
        return new Bitmap.Config[]{config};
    }

    private NavigableMap j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f2182c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f2182c.put(config, treeMap);
        return treeMap;
    }

    public String a(int i4, int i5, Bitmap.Config config) {
        return h(l.f(i4, i5, config), config);
    }

    public int b(Bitmap bitmap) {
        return l.g(bitmap);
    }

    public Bitmap c(int i4, int i5, Bitmap.Config config) {
        b g4 = g(l.f(i4, i5, config), config);
        Bitmap bitmap = (Bitmap) this.f2181b.a(g4);
        if (bitmap != null) {
            f(Integer.valueOf(g4.f2185b), bitmap);
            bitmap.reconfigure(i4, i5, config);
        }
        return bitmap;
    }

    public void d(Bitmap bitmap) {
        b e4 = this.f2180a.e(l.g(bitmap), bitmap.getConfig());
        this.f2181b.d(e4, bitmap);
        NavigableMap j4 = j(bitmap.getConfig());
        Integer num = (Integer) j4.get(Integer.valueOf(e4.f2185b));
        Integer valueOf = Integer.valueOf(e4.f2185b);
        int i4 = 1;
        if (num != null) {
            i4 = 1 + num.intValue();
        }
        j4.put(valueOf, Integer.valueOf(i4));
    }

    public String e(Bitmap bitmap) {
        return h(l.g(bitmap), bitmap.getConfig());
    }

    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f2181b.f();
        if (bitmap != null) {
            f(Integer.valueOf(l.g(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f2181b);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f2182c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f2182c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
