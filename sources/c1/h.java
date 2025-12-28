package c1;

import X0.b;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p1.k;

public class h implements b {

    /* renamed from: b  reason: collision with root package name */
    private final i f7549b;

    /* renamed from: c  reason: collision with root package name */
    private final URL f7550c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7551d;

    /* renamed from: e  reason: collision with root package name */
    private String f7552e;

    /* renamed from: f  reason: collision with root package name */
    private URL f7553f;

    /* renamed from: g  reason: collision with root package name */
    private volatile byte[] f7554g;

    /* renamed from: h  reason: collision with root package name */
    private int f7555h;

    public h(URL url) {
        this(url, i.f7557b);
    }

    private byte[] d() {
        if (this.f7554g == null) {
            this.f7554g = c().getBytes(b.f1934a);
        }
        return this.f7554g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f7552e)) {
            String str = this.f7551d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) k.d(this.f7550c)).toString();
            }
            this.f7552e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f7552e;
    }

    private URL g() {
        if (this.f7553f == null) {
            this.f7553f = new URL(f());
        }
        return this.f7553f;
    }

    public void b(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f7551d;
        if (str != null) {
            return str;
        }
        return ((URL) k.d(this.f7550c)).toString();
    }

    public Map e() {
        return this.f7549b.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!c().equals(hVar.c()) || !this.f7549b.equals(hVar.f7549b)) {
            return false;
        }
        return true;
    }

    public URL h() {
        return g();
    }

    public int hashCode() {
        if (this.f7555h == 0) {
            int hashCode = c().hashCode();
            this.f7555h = hashCode;
            this.f7555h = (hashCode * 31) + this.f7549b.hashCode();
        }
        return this.f7555h;
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f7557b);
    }

    public h(URL url, i iVar) {
        this.f7550c = (URL) k.d(url);
        this.f7551d = null;
        this.f7549b = (i) k.d(iVar);
    }

    public h(String str, i iVar) {
        this.f7550c = null;
        this.f7551d = k.b(str);
        this.f7549b = (i) k.d(iVar);
    }
}
