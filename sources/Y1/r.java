package Y1;

import a2.C0366h;
import a2.j;
import java.text.ParsePosition;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private String f2069a;

    /* renamed from: b  reason: collision with root package name */
    private ParsePosition f2070b;

    /* renamed from: c  reason: collision with root package name */
    private String f2071c;

    /* renamed from: d  reason: collision with root package name */
    private int f2072d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2073e;

    public static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f2074a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f2075b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f2076c;
    }

    public r(String str, C0366h hVar, ParsePosition parsePosition) {
        if (str == null || parsePosition.getIndex() > str.length()) {
            throw new IllegalArgumentException();
        }
        this.f2069a = str;
        this.f2070b = parsePosition;
        this.f2071c = null;
    }

    private void a(int i4) {
        String str = this.f2071c;
        if (str != null) {
            int i5 = this.f2072d + i4;
            this.f2072d = i5;
            if (i5 == str.length()) {
                this.f2071c = null;
                return;
            }
            return;
        }
        ParsePosition parsePosition = this.f2070b;
        parsePosition.setIndex(parsePosition.getIndex() + i4);
        if (this.f2070b.getIndex() > this.f2069a.length()) {
            this.f2070b.setIndex(this.f2069a.length());
        }
    }

    private int b() {
        String str = this.f2071c;
        if (str != null) {
            return j.b(str, this.f2072d);
        }
        int index = this.f2070b.getIndex();
        if (index < this.f2069a.length()) {
            return j.b(this.f2069a, index);
        }
        return -1;
    }

    public boolean c() {
        if (this.f2071c == null && this.f2070b.getIndex() == this.f2069a.length()) {
            return true;
        }
        return false;
    }

    public String d() {
        String str = this.f2071c;
        if (str != null) {
            return str;
        }
        return this.f2069a;
    }

    public int e() {
        if (this.f2071c != null) {
            return this.f2072d;
        }
        return this.f2070b.getIndex();
    }

    public a f(a aVar) {
        if (aVar == null) {
            aVar = new a();
        }
        String unused = aVar.f2074a = this.f2071c;
        int unused2 = aVar.f2075b = this.f2072d;
        int unused3 = aVar.f2076c = this.f2070b.getIndex();
        return aVar;
    }

    public boolean g() {
        if (this.f2071c != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        return this.f2073e;
    }

    public void i(int i4) {
        if (i4 >= 0) {
            String str = this.f2071c;
            if (str != null) {
                int i5 = this.f2072d + i4;
                this.f2072d = i5;
                if (i5 > str.length()) {
                    throw new IllegalArgumentException();
                } else if (this.f2072d == this.f2071c.length()) {
                    this.f2071c = null;
                }
            } else {
                int index = this.f2070b.getIndex() + i4;
                this.f2070b.setIndex(index);
                if (index > this.f2069a.length()) {
                    throw new IllegalArgumentException();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int j(int i4) {
        int b4;
        this.f2073e = false;
        do {
            b4 = b();
            a(j.d(b4));
            if ((i4 & 4) == 0 || !o.a(b4)) {
            }
            b4 = b();
            a(j.d(b4));
            break;
        } while (!o.a(b4));
        if (b4 != 92 || (i4 & 2) == 0) {
            return b4;
        }
        int n4 = z.n(d(), e());
        if (n4 >= 0) {
            int e4 = z.e(n4);
            i(z.k(n4));
            this.f2073e = true;
            return e4;
        }
        throw new IllegalArgumentException("Invalid escape");
    }

    public void k(a aVar) {
        this.f2071c = aVar.f2074a;
        this.f2070b.setIndex(aVar.f2076c);
        this.f2072d = aVar.f2075b;
    }

    public void l(int i4) {
        if ((i4 & 4) != 0) {
            while (true) {
                int b4 = b();
                if (o.a(b4)) {
                    a(j.d(b4));
                } else {
                    return;
                }
            }
        }
    }

    public String toString() {
        int index = this.f2070b.getIndex();
        return this.f2069a.substring(0, index) + '|' + this.f2069a.substring(index);
    }
}
