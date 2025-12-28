package c1;

import android.text.TextUtils;
import com.silkimen.http.HttpRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class k implements i {

    /* renamed from: c  reason: collision with root package name */
    private final Map f7558c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Map f7559d;

    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        private static final String f7560d;

        /* renamed from: e  reason: collision with root package name */
        private static final Map f7561e;

        /* renamed from: a  reason: collision with root package name */
        private boolean f7562a = true;

        /* renamed from: b  reason: collision with root package name */
        private Map f7563b = f7561e;

        /* renamed from: c  reason: collision with root package name */
        private boolean f7564c = true;

        static {
            String b4 = b();
            f7560d = b4;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b4)) {
                hashMap.put(HttpRequest.HEADER_USER_AGENT, Collections.singletonList(new b(b4)));
            }
            f7561e = Collections.unmodifiableMap(hashMap);
        }

        static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = property.charAt(i4);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public k a() {
            this.f7562a = true;
            return new k(this.f7563b);
        }
    }

    static final class b implements j {

        /* renamed from: a  reason: collision with root package name */
        private final String f7565a;

        b(String str) {
            this.f7565a = str;
        }

        public String a() {
            return this.f7565a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f7565a.equals(((b) obj).f7565a);
            }
            return false;
        }

        public int hashCode() {
            return this.f7565a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f7565a + '\'' + '}';
        }
    }

    k(Map map) {
        this.f7558c = Collections.unmodifiableMap(map);
    }

    private String b(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            String a4 = ((j) list.get(i4)).a();
            if (!TextUtils.isEmpty(a4)) {
                sb.append(a4);
                if (i4 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    private Map c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f7558c.entrySet()) {
            String b4 = b((List) entry.getValue());
            if (!TextUtils.isEmpty(b4)) {
                hashMap.put(entry.getKey(), b4);
            }
        }
        return hashMap;
    }

    public Map a() {
        if (this.f7559d == null) {
            synchronized (this) {
                try {
                    if (this.f7559d == null) {
                        this.f7559d = Collections.unmodifiableMap(c());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f7559d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f7558c.equals(((k) obj).f7558c);
        }
        return false;
    }

    public int hashCode() {
        return this.f7558c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f7558c + '}';
    }
}
