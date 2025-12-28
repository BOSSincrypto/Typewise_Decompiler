package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.g;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f5036a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5037b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5038c;

    /* renamed from: d  reason: collision with root package name */
    private final List f5039d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5040e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f5041f;

    public e(String str, String str2, String str3, List list) {
        this.f5036a = (String) g.g(str);
        this.f5037b = (String) g.g(str2);
        this.f5038c = (String) g.g(str3);
        this.f5039d = (List) g.g(list);
        this.f5041f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f5039d;
    }

    public int c() {
        return this.f5040e;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.f5041f;
    }

    public String e() {
        return this.f5036a;
    }

    public String f() {
        return this.f5037b;
    }

    public String g() {
        return this.f5038c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f5036a + ", mProviderPackage: " + this.f5037b + ", mQuery: " + this.f5038c + ", mCertificates:");
        for (int i4 = 0; i4 < this.f5039d.size(); i4++) {
            sb.append(" [");
            List list = (List) this.f5039d.get(i4);
            for (int i5 = 0; i5 < list.size(); i5++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i5), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f5040e);
        return sb.toString();
    }
}
