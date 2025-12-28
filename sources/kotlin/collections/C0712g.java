package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import z2.d;

/* renamed from: kotlin.collections.g  reason: case insensitive filesystem */
public final class C0712g extends C0709d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f13861d = new a((i) null);

    /* renamed from: e  reason: collision with root package name */
    private static final Object[] f13862e = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    private int f13863a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f13864b = f13862e;

    /* renamed from: c  reason: collision with root package name */
    private int f13865c;

    /* renamed from: kotlin.collections.g$a */
    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    private final void b(int i4, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f13864b.length;
        while (i4 < length && it.hasNext()) {
            this.f13864b[i4] = it.next();
            i4++;
        }
        int i5 = this.f13863a;
        for (int i6 = 0; i6 < i5 && it.hasNext(); i6++) {
            this.f13864b[i6] = it.next();
        }
        this.f13865c = size() + collection.size();
    }

    private final void c(int i4) {
        Object[] objArr = new Object[i4];
        Object[] objArr2 = this.f13864b;
        C0713h.e(objArr2, objArr, 0, this.f13863a, objArr2.length);
        Object[] objArr3 = this.f13864b;
        int length = objArr3.length;
        int i5 = this.f13863a;
        C0713h.e(objArr3, objArr, length - i5, 0, i5);
        this.f13863a = 0;
        this.f13864b = objArr;
    }

    private final int d(int i4) {
        if (i4 == 0) {
            return C0713h.D(this.f13864b);
        }
        return i4 - 1;
    }

    private final void e(int i4) {
        if (i4 >= 0) {
            Object[] objArr = this.f13864b;
            if (i4 > objArr.length) {
                if (objArr == f13862e) {
                    this.f13864b = new Object[d.b(i4, 10)];
                } else {
                    c(C0707b.Companion.e(objArr.length, i4));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    private final int f(int i4) {
        if (i4 == C0713h.D(this.f13864b)) {
            return 0;
        }
        return i4 + 1;
    }

    private final int g(int i4) {
        if (i4 < 0) {
            return i4 + this.f13864b.length;
        }
        return i4;
    }

    private final void h(int i4, int i5) {
        if (i4 < i5) {
            C0713h.j(this.f13864b, (Object) null, i4, i5);
            return;
        }
        Object[] objArr = this.f13864b;
        C0713h.j(objArr, (Object) null, i4, objArr.length);
        C0713h.j(this.f13864b, (Object) null, 0, i5);
    }

    private final int i(int i4) {
        Object[] objArr = this.f13864b;
        if (i4 >= objArr.length) {
            return i4 - objArr.length;
        }
        return i4;
    }

    private final void j() {
        this.modCount++;
    }

    private final void l(int i4, int i5) {
        int i6 = i(this.f13863a + (i4 - 1));
        int i7 = i(this.f13863a + (i5 - 1));
        while (i4 > 0) {
            int i8 = i6 + 1;
            int min = Math.min(i4, Math.min(i8, i7 + 1));
            Object[] objArr = this.f13864b;
            int i9 = i7 - min;
            int i10 = i6 - min;
            C0713h.e(objArr, objArr, i9 + 1, i10 + 1, i8);
            i6 = g(i10);
            i7 = g(i9);
            i4 -= min;
        }
    }

    private final void m(int i4, int i5) {
        int i6 = i(this.f13863a + i5);
        int i7 = i(this.f13863a + i4);
        int size = size();
        while (true) {
            size -= i5;
            if (size > 0) {
                Object[] objArr = this.f13864b;
                i5 = Math.min(size, Math.min(objArr.length - i6, objArr.length - i7));
                Object[] objArr2 = this.f13864b;
                int i8 = i6 + i5;
                C0713h.e(objArr2, objArr2, i7, i6, i8);
                i6 = i(i8);
                i7 = i(i7 + i5);
            } else {
                return;
            }
        }
    }

    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        o.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        j();
        e(size() + collection.size());
        b(i(this.f13863a + size()), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        j();
        e(size() + 1);
        int d4 = d(this.f13863a);
        this.f13863a = d4;
        this.f13864b[d4] = obj;
        this.f13865c = size() + 1;
    }

    public final void addLast(Object obj) {
        j();
        e(size() + 1);
        this.f13864b[i(this.f13863a + size())] = obj;
        this.f13865c = size() + 1;
    }

    public void clear() {
        if (!isEmpty()) {
            j();
            h(this.f13863a, i(this.f13863a + size()));
        }
        this.f13863a = 0;
        this.f13865c = 0;
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public Object get(int i4) {
        C0707b.Companion.b(i4, size());
        return this.f13864b[i(this.f13863a + i4)];
    }

    public int getSize() {
        return this.f13865c;
    }

    public int indexOf(Object obj) {
        int i4;
        int i5 = i(this.f13863a + size());
        int i6 = this.f13863a;
        if (i6 < i5) {
            while (i6 < i5) {
                if (o.a(obj, this.f13864b[i6])) {
                    i4 = this.f13863a;
                } else {
                    i6++;
                }
            }
            return -1;
        } else if (i6 < i5) {
            return -1;
        } else {
            int length = this.f13864b.length;
            while (true) {
                if (i6 >= length) {
                    int i7 = 0;
                    while (i7 < i5) {
                        if (o.a(obj, this.f13864b[i7])) {
                            i6 = i7 + this.f13864b.length;
                            i4 = this.f13863a;
                        } else {
                            i7++;
                        }
                    }
                    return -1;
                } else if (o.a(obj, this.f13864b[i6])) {
                    i4 = this.f13863a;
                    break;
                } else {
                    i6++;
                }
            }
        }
        return i6 - i4;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object k() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    public int lastIndexOf(Object obj) {
        int i4;
        int i5;
        int i6 = i(this.f13863a + size());
        int i7 = this.f13863a;
        if (i7 < i6) {
            i4 = i6 - 1;
            if (i7 <= i4) {
                while (!o.a(obj, this.f13864b[i4])) {
                    if (i4 != i7) {
                        i4--;
                    }
                }
                i5 = this.f13863a;
            }
            return -1;
        }
        if (i7 > i6) {
            int i8 = i6 - 1;
            while (true) {
                if (-1 >= i8) {
                    int D3 = C0713h.D(this.f13864b);
                    int i9 = this.f13863a;
                    if (i9 <= D3) {
                        while (!o.a(obj, this.f13864b[i4])) {
                            if (i4 != i9) {
                                D3 = i4 - 1;
                            }
                        }
                        i5 = this.f13863a;
                    }
                } else if (o.a(obj, this.f13864b[i8])) {
                    i4 = i8 + this.f13864b.length;
                    i5 = this.f13863a;
                    break;
                } else {
                    i8--;
                }
            }
        }
        return -1;
        return i4 - i5;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.o.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0091
            java.lang.Object[] r0 = r11.f13864b
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0091
        L_0x0013:
            int r0 = r11.f13863a
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.i(r0)
            int r2 = r11.f13863a
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0043
            r5 = r2
        L_0x0025:
            if (r2 >= r0) goto L_0x003d
            java.lang.Object[] r6 = r11.f13864b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 != 0) goto L_0x0039
            java.lang.Object[] r7 = r11.f13864b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003a
        L_0x0039:
            r1 = r4
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x0025
        L_0x003d:
            java.lang.Object[] r12 = r11.f13864b
            kotlin.collections.C0713h.j(r12, r3, r5, r0)
            goto L_0x0083
        L_0x0043:
            java.lang.Object[] r5 = r11.f13864b
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x0048:
            if (r2 >= r5) goto L_0x0062
            java.lang.Object[] r8 = r11.f13864b
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 != 0) goto L_0x005e
            java.lang.Object[] r8 = r11.f13864b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x005f
        L_0x005e:
            r7 = r4
        L_0x005f:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0062:
            int r2 = r11.i(r6)
            r5 = r2
        L_0x0067:
            if (r1 >= r0) goto L_0x0082
            java.lang.Object[] r2 = r11.f13864b
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 != 0) goto L_0x007e
            java.lang.Object[] r2 = r11.f13864b
            r2[r5] = r6
            int r5 = r11.f(r5)
            goto L_0x007f
        L_0x007e:
            r7 = r4
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x0067
        L_0x0082:
            r1 = r7
        L_0x0083:
            if (r1 == 0) goto L_0x0091
            r11.j()
            int r12 = r11.f13863a
            int r5 = r5 - r12
            int r12 = r11.g(r5)
            r11.f13865c = r12
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C0712g.removeAll(java.util.Collection):boolean");
    }

    public Object removeAt(int i4) {
        C0707b.Companion.b(i4, size());
        if (i4 == C0718m.l(this)) {
            return removeLast();
        }
        if (i4 == 0) {
            return removeFirst();
        }
        j();
        int i5 = i(this.f13863a + i4);
        Object obj = this.f13864b[i5];
        if (i4 < (size() >> 1)) {
            int i6 = this.f13863a;
            if (i5 >= i6) {
                Object[] objArr = this.f13864b;
                C0713h.e(objArr, objArr, i6 + 1, i6, i5);
            } else {
                Object[] objArr2 = this.f13864b;
                C0713h.e(objArr2, objArr2, 1, 0, i5);
                Object[] objArr3 = this.f13864b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i7 = this.f13863a;
                C0713h.e(objArr3, objArr3, i7 + 1, i7, objArr3.length - 1);
            }
            Object[] objArr4 = this.f13864b;
            int i8 = this.f13863a;
            objArr4[i8] = null;
            this.f13863a = f(i8);
        } else {
            int i9 = i(this.f13863a + C0718m.l(this));
            if (i5 <= i9) {
                Object[] objArr5 = this.f13864b;
                C0713h.e(objArr5, objArr5, i5, i5 + 1, i9 + 1);
            } else {
                Object[] objArr6 = this.f13864b;
                C0713h.e(objArr6, objArr6, i5, i5 + 1, objArr6.length);
                Object[] objArr7 = this.f13864b;
                objArr7[objArr7.length - 1] = objArr7[0];
                C0713h.e(objArr7, objArr7, 0, 1, i9 + 1);
            }
            this.f13864b[i9] = null;
        }
        this.f13865c = size() - 1;
        return obj;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            j();
            Object[] objArr = this.f13864b;
            int i4 = this.f13863a;
            Object obj = objArr[i4];
            objArr[i4] = null;
            this.f13863a = f(i4);
            this.f13865c = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            j();
            int i4 = i(this.f13863a + C0718m.l(this));
            Object[] objArr = this.f13864b;
            Object obj = objArr[i4];
            objArr[i4] = null;
            this.f13865c = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i4, int i5) {
        C0707b.Companion.d(i4, i5, size());
        int i6 = i5 - i4;
        if (i6 != 0) {
            if (i6 == size()) {
                clear();
            } else if (i6 == 1) {
                remove(i4);
            } else {
                j();
                if (i4 < size() - i5) {
                    l(i4, i5);
                    int i7 = i(this.f13863a + i6);
                    h(this.f13863a, i7);
                    this.f13863a = i7;
                } else {
                    m(i4, i5);
                    int i8 = i(this.f13863a + size());
                    h(g(i8 - i6), i8);
                }
                this.f13865c = size() - i6;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.o.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0091
            java.lang.Object[] r0 = r11.f13864b
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0091
        L_0x0013:
            int r0 = r11.f13863a
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.i(r0)
            int r2 = r11.f13863a
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0043
            r5 = r2
        L_0x0025:
            if (r2 >= r0) goto L_0x003d
            java.lang.Object[] r6 = r11.f13864b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x0039
            java.lang.Object[] r7 = r11.f13864b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003a
        L_0x0039:
            r1 = r4
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x0025
        L_0x003d:
            java.lang.Object[] r12 = r11.f13864b
            kotlin.collections.C0713h.j(r12, r3, r5, r0)
            goto L_0x0083
        L_0x0043:
            java.lang.Object[] r5 = r11.f13864b
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x0048:
            if (r2 >= r5) goto L_0x0062
            java.lang.Object[] r8 = r11.f13864b
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x005e
            java.lang.Object[] r8 = r11.f13864b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x005f
        L_0x005e:
            r7 = r4
        L_0x005f:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0062:
            int r2 = r11.i(r6)
            r5 = r2
        L_0x0067:
            if (r1 >= r0) goto L_0x0082
            java.lang.Object[] r2 = r11.f13864b
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L_0x007e
            java.lang.Object[] r2 = r11.f13864b
            r2[r5] = r6
            int r5 = r11.f(r5)
            goto L_0x007f
        L_0x007e:
            r7 = r4
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x0067
        L_0x0082:
            r1 = r7
        L_0x0083:
            if (r1 == 0) goto L_0x0091
            r11.j()
            int r12 = r11.f13863a
            int r5 = r5 - r12
            int r12 = r11.g(r5)
            r11.f13865c = r12
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C0712g.retainAll(java.util.Collection):boolean");
    }

    public Object set(int i4, Object obj) {
        C0707b.Companion.b(i4, size());
        int i5 = i(this.f13863a + i4);
        Object[] objArr = this.f13864b;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    public Object[] toArray(Object[] objArr) {
        o.e(objArr, "array");
        if (objArr.length < size()) {
            objArr = C0714i.a(objArr, size());
        }
        int i4 = i(this.f13863a + size());
        int i5 = this.f13863a;
        if (i5 < i4) {
            C0713h.g(this.f13864b, objArr, 0, i5, i4, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f13864b;
            C0713h.e(objArr2, objArr, 0, this.f13863a, objArr2.length);
            Object[] objArr3 = this.f13864b;
            C0713h.e(objArr3, objArr, objArr3.length - this.f13863a, 0, i4);
        }
        return C0718m.f(size(), objArr);
    }

    public void add(int i4, Object obj) {
        C0707b.Companion.c(i4, size());
        if (i4 == size()) {
            addLast(obj);
        } else if (i4 == 0) {
            addFirst(obj);
        } else {
            j();
            e(size() + 1);
            int i5 = i(this.f13863a + i4);
            if (i4 < ((size() + 1) >> 1)) {
                int d4 = d(i5);
                int d5 = d(this.f13863a);
                int i6 = this.f13863a;
                if (d4 >= i6) {
                    Object[] objArr = this.f13864b;
                    objArr[d5] = objArr[i6];
                    C0713h.e(objArr, objArr, i6, i6 + 1, d4 + 1);
                } else {
                    Object[] objArr2 = this.f13864b;
                    C0713h.e(objArr2, objArr2, i6 - 1, i6, objArr2.length);
                    Object[] objArr3 = this.f13864b;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C0713h.e(objArr3, objArr3, 0, 1, d4 + 1);
                }
                this.f13864b[d4] = obj;
                this.f13863a = d5;
            } else {
                int i7 = i(this.f13863a + size());
                if (i5 < i7) {
                    Object[] objArr4 = this.f13864b;
                    C0713h.e(objArr4, objArr4, i5 + 1, i5, i7);
                } else {
                    Object[] objArr5 = this.f13864b;
                    C0713h.e(objArr5, objArr5, 1, 0, i7);
                    Object[] objArr6 = this.f13864b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    C0713h.e(objArr6, objArr6, i5 + 1, i5, objArr6.length - 1);
                }
                this.f13864b[i5] = obj;
            }
            this.f13865c = size() + 1;
        }
    }

    public boolean addAll(int i4, Collection collection) {
        o.e(collection, "elements");
        C0707b.Companion.c(i4, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i4 == size()) {
            return addAll(collection);
        }
        j();
        e(size() + collection.size());
        int i5 = i(this.f13863a + size());
        int i6 = i(this.f13863a + i4);
        int size = collection.size();
        if (i4 < ((size() + 1) >> 1)) {
            int i7 = this.f13863a;
            int i8 = i7 - size;
            if (i6 < i7) {
                Object[] objArr = this.f13864b;
                C0713h.e(objArr, objArr, i8, i7, objArr.length);
                if (size >= i6) {
                    Object[] objArr2 = this.f13864b;
                    C0713h.e(objArr2, objArr2, objArr2.length - size, 0, i6);
                } else {
                    Object[] objArr3 = this.f13864b;
                    C0713h.e(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f13864b;
                    C0713h.e(objArr4, objArr4, 0, size, i6);
                }
            } else if (i8 >= 0) {
                Object[] objArr5 = this.f13864b;
                C0713h.e(objArr5, objArr5, i8, i7, i6);
            } else {
                Object[] objArr6 = this.f13864b;
                i8 += objArr6.length;
                int i9 = i6 - i7;
                int length = objArr6.length - i8;
                if (length >= i9) {
                    C0713h.e(objArr6, objArr6, i8, i7, i6);
                } else {
                    C0713h.e(objArr6, objArr6, i8, i7, i7 + length);
                    Object[] objArr7 = this.f13864b;
                    C0713h.e(objArr7, objArr7, 0, this.f13863a + length, i6);
                }
            }
            this.f13863a = i8;
            b(g(i6 - size), collection);
        } else {
            int i10 = i6 + size;
            if (i6 < i5) {
                int i11 = size + i5;
                Object[] objArr8 = this.f13864b;
                if (i11 <= objArr8.length) {
                    C0713h.e(objArr8, objArr8, i10, i6, i5);
                } else if (i10 >= objArr8.length) {
                    C0713h.e(objArr8, objArr8, i10 - objArr8.length, i6, i5);
                } else {
                    int length2 = i5 - (i11 - objArr8.length);
                    C0713h.e(objArr8, objArr8, 0, length2, i5);
                    Object[] objArr9 = this.f13864b;
                    C0713h.e(objArr9, objArr9, i10, i6, length2);
                }
            } else {
                Object[] objArr10 = this.f13864b;
                C0713h.e(objArr10, objArr10, size, 0, i5);
                Object[] objArr11 = this.f13864b;
                if (i10 >= objArr11.length) {
                    C0713h.e(objArr11, objArr11, i10 - objArr11.length, i6, objArr11.length);
                } else {
                    C0713h.e(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f13864b;
                    C0713h.e(objArr12, objArr12, i10, i6, objArr12.length - size);
                }
            }
            b(i6, collection);
        }
        return true;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
