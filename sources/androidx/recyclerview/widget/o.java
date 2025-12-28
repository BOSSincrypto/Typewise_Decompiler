package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

class o {

    /* renamed from: a  reason: collision with root package name */
    final a f6684a;

    interface a {
        void a(a.b bVar);

        a.b b(int i4, int i5, int i6, Object obj);
    }

    o(a aVar) {
        this.f6684a = aVar;
    }

    private int a(List list) {
        boolean z3 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((a.b) list.get(size)).f6495a != 8) {
                z3 = true;
            } else if (z3) {
                return size;
            }
        }
        return -1;
    }

    private void c(List list, int i4, a.b bVar, int i5, a.b bVar2) {
        int i6;
        int i7 = bVar.f6498d;
        int i8 = bVar2.f6496b;
        if (i7 < i8) {
            i6 = -1;
        } else {
            i6 = 0;
        }
        int i9 = bVar.f6496b;
        if (i9 < i8) {
            i6++;
        }
        if (i8 <= i9) {
            bVar.f6496b = i9 + bVar2.f6498d;
        }
        int i10 = bVar2.f6496b;
        if (i10 <= i7) {
            bVar.f6498d = i7 + bVar2.f6498d;
        }
        bVar2.f6496b = i10 + i6;
        list.set(i4, bVar2);
        list.set(i5, bVar);
    }

    private void d(List list, int i4, int i5) {
        a.b bVar = (a.b) list.get(i4);
        a.b bVar2 = (a.b) list.get(i5);
        int i6 = bVar2.f6495a;
        if (i6 == 1) {
            c(list, i4, bVar, i5, bVar2);
        } else if (i6 == 2) {
            e(list, i4, bVar, i5, bVar2);
        } else if (i6 == 4) {
            f(list, i4, bVar, i5, bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(List list) {
        while (true) {
            int a4 = a(list);
            if (a4 != -1) {
                d(list, a4, a4 + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(List list, int i4, a.b bVar, int i5, a.b bVar2) {
        boolean z3;
        int i6 = bVar.f6496b;
        int i7 = bVar.f6498d;
        boolean z4 = false;
        if (i6 < i7) {
            if (bVar2.f6496b == i6 && bVar2.f6498d == i7 - i6) {
                z3 = false;
                z4 = true;
            } else {
                z3 = false;
            }
        } else if (bVar2.f6496b == i7 + 1 && bVar2.f6498d == i6 - i7) {
            z3 = true;
            z4 = true;
        } else {
            z3 = true;
        }
        int i8 = bVar2.f6496b;
        if (i7 < i8) {
            bVar2.f6496b = i8 - 1;
        } else {
            int i9 = bVar2.f6498d;
            if (i7 < i8 + i9) {
                bVar2.f6498d = i9 - 1;
                bVar.f6495a = 2;
                bVar.f6498d = 1;
                if (bVar2.f6498d == 0) {
                    list.remove(i5);
                    this.f6684a.a(bVar2);
                    return;
                }
                return;
            }
        }
        int i10 = bVar.f6496b;
        int i11 = bVar2.f6496b;
        a.b bVar3 = null;
        if (i10 <= i11) {
            bVar2.f6496b = i11 + 1;
        } else {
            int i12 = bVar2.f6498d;
            if (i10 < i11 + i12) {
                bVar3 = this.f6684a.b(2, i10 + 1, (i11 + i12) - i10, (Object) null);
                bVar2.f6498d = bVar.f6496b - bVar2.f6496b;
            }
        }
        if (z4) {
            list.set(i4, bVar2);
            list.remove(i5);
            this.f6684a.a(bVar);
            return;
        }
        if (z3) {
            if (bVar3 != null) {
                int i13 = bVar.f6496b;
                if (i13 > bVar3.f6496b) {
                    bVar.f6496b = i13 - bVar3.f6498d;
                }
                int i14 = bVar.f6498d;
                if (i14 > bVar3.f6496b) {
                    bVar.f6498d = i14 - bVar3.f6498d;
                }
            }
            int i15 = bVar.f6496b;
            if (i15 > bVar2.f6496b) {
                bVar.f6496b = i15 - bVar2.f6498d;
            }
            int i16 = bVar.f6498d;
            if (i16 > bVar2.f6496b) {
                bVar.f6498d = i16 - bVar2.f6498d;
            }
        } else {
            if (bVar3 != null) {
                int i17 = bVar.f6496b;
                if (i17 >= bVar3.f6496b) {
                    bVar.f6496b = i17 - bVar3.f6498d;
                }
                int i18 = bVar.f6498d;
                if (i18 >= bVar3.f6496b) {
                    bVar.f6498d = i18 - bVar3.f6498d;
                }
            }
            int i19 = bVar.f6496b;
            if (i19 >= bVar2.f6496b) {
                bVar.f6496b = i19 - bVar2.f6498d;
            }
            int i20 = bVar.f6498d;
            if (i20 >= bVar2.f6496b) {
                bVar.f6498d = i20 - bVar2.f6498d;
            }
        }
        list.set(i4, bVar2);
        if (bVar.f6496b != bVar.f6498d) {
            list.set(i5, bVar);
        } else {
            list.remove(i5);
        }
        if (bVar3 != null) {
            list.add(i4, bVar3);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.util.List r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f6498d
            int r1 = r13.f6496b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r3
            r13.f6496b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f6498d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r3
            r13.f6498d = r5
            androidx.recyclerview.widget.o$a r0 = r8.f6684a
            int r1 = r11.f6496b
            java.lang.Object r5 = r13.f6497c
            androidx.recyclerview.widget.a$b r0 = r0.b(r2, r1, r3, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r4
        L_0x0021:
            int r1 = r11.f6496b
            int r5 = r13.f6496b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r3
            r13.f6496b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f6498d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.o$a r4 = r8.f6684a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f6497c
            androidx.recyclerview.widget.a$b r4 = r4.b(r2, r1, r5, r3)
            int r1 = r13.f6498d
            int r1 = r1 - r5
            r13.f6498d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f6498d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.o$a r11 = r8.f6684a
            r11.a(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r9.add(r10, r4)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.o.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
