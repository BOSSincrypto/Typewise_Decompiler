package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import v2.C0925a;

/* renamed from: kotlin.collections.a  reason: case insensitive filesystem */
public abstract class C0706a implements Iterator, C0925a {

    /* renamed from: a  reason: collision with root package name */
    private int f13829a;

    /* renamed from: b  reason: collision with root package name */
    private Object f13830b;

    private final boolean e() {
        this.f13829a = 3;
        b();
        if (this.f13829a == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: protected */
    public final void c() {
        this.f13829a = 2;
    }

    /* access modifiers changed from: protected */
    public final void d(Object obj) {
        this.f13830b = obj;
        this.f13829a = 1;
    }

    public boolean hasNext() {
        int i4 = this.f13829a;
        if (i4 == 0) {
            return e();
        }
        if (i4 == 1) {
            return true;
        }
        if (i4 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    public Object next() {
        int i4 = this.f13829a;
        if (i4 == 1) {
            this.f13829a = 0;
            return this.f13830b;
        } else if (i4 == 2 || !e()) {
            throw new NoSuchElementException();
        } else {
            this.f13829a = 0;
            return this.f13830b;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
