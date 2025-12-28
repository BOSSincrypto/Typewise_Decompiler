package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v2.C0925a;

final class a implements Iterator, C0925a {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f13890a;

    /* renamed from: b  reason: collision with root package name */
    private int f13891b;

    public a(Object[] objArr) {
        o.e(objArr, "array");
        this.f13890a = objArr;
    }

    public boolean hasNext() {
        if (this.f13891b < this.f13890a.length) {
            return true;
        }
        return false;
    }

    public Object next() {
        try {
            Object[] objArr = this.f13890a;
            int i4 = this.f13891b;
            this.f13891b = i4 + 1;
            return objArr[i4];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f13891b--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
