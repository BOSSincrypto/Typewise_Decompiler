package androidx.core.util;

public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f5157a;

    /* renamed from: b  reason: collision with root package name */
    private int f5158b;

    public e(int i4) {
        if (i4 > 0) {
            this.f5157a = new Object[i4];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean c(Object obj) {
        for (int i4 = 0; i4 < this.f5158b; i4++) {
            if (this.f5157a[i4] == obj) {
                return true;
            }
        }
        return false;
    }

    public boolean a(Object obj) {
        if (!c(obj)) {
            int i4 = this.f5158b;
            Object[] objArr = this.f5157a;
            if (i4 >= objArr.length) {
                return false;
            }
            objArr[i4] = obj;
            this.f5158b = i4 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public Object b() {
        int i4 = this.f5158b;
        if (i4 <= 0) {
            return null;
        }
        int i5 = i4 - 1;
        Object[] objArr = this.f5157a;
        Object obj = objArr[i5];
        objArr[i5] = null;
        this.f5158b = i4 - 1;
        return obj;
    }
}
