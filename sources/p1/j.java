package p1;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private Class f15877a;

    /* renamed from: b  reason: collision with root package name */
    private Class f15878b;

    /* renamed from: c  reason: collision with root package name */
    private Class f15879c;

    public j() {
    }

    public void a(Class cls, Class cls2, Class cls3) {
        this.f15877a = cls;
        this.f15878b = cls2;
        this.f15879c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f15877a.equals(jVar.f15877a) && this.f15878b.equals(jVar.f15878b) && l.c(this.f15879c, jVar.f15879c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int hashCode = ((this.f15877a.hashCode() * 31) + this.f15878b.hashCode()) * 31;
        Class cls = this.f15879c;
        if (cls != null) {
            i4 = cls.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f15877a + ", second=" + this.f15878b + '}';
    }

    public j(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }
}
