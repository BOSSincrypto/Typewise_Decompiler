package S0;

import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.Pair;
import kotlin.collections.C0713h;
import kotlin.jvm.internal.o;

public abstract class b {
    /* access modifiers changed from: private */
    public static final Pair b(String[] strArr, int i4, int i5, boolean z3, String str) {
        int i6;
        int i7;
        boolean z4;
        LinkedList linkedList = new LinkedList(C0713h.a0(strArr));
        ArrayList arrayList = new ArrayList();
        Object poll = linkedList.poll();
        o.b(poll);
        arrayList.add(poll);
        if (z3) {
            i6 = 0;
            z4 = false;
            i7 = 0;
            while (!linkedList.isEmpty()) {
                Object poll2 = linkedList.poll();
                o.b(poll2);
                String str2 = (String) poll2;
                if (i6 < i4) {
                    i6++;
                    arrayList.add(0, str2);
                    z4 = true;
                } else if (i7 < i5) {
                    i7++;
                    arrayList.add(str2);
                    z4 = false;
                }
                if (!linkedList.isEmpty() && i7 < i5) {
                    i7++;
                    Object poll3 = linkedList.poll();
                    o.b(poll3);
                    arrayList.add(poll3);
                    z4 = false;
                }
            }
        } else {
            i6 = 0;
            z4 = false;
            i7 = 0;
            while (!linkedList.isEmpty()) {
                Object poll4 = linkedList.poll();
                o.b(poll4);
                String str3 = (String) poll4;
                if (i7 < i5) {
                    i7++;
                    arrayList.add(str3);
                    z4 = false;
                } else if (i6 < i4) {
                    i6++;
                    arrayList.add(0, str3);
                    z4 = true;
                }
                if (!linkedList.isEmpty() && i6 < i4) {
                    i6++;
                    Object poll5 = linkedList.poll();
                    o.b(poll5);
                    arrayList.add(0, poll5);
                    z4 = true;
                }
            }
        }
        if (str.length() > 0) {
            if ((!z4 || i5 <= 0) && (z4 || i4 != 0)) {
                if ((z4 && i5 == 0) || (!z4 && i4 > 0)) {
                    if (i6 == i4) {
                        arrayList.set(0, str);
                    } else {
                        i6++;
                        arrayList.add(0, str);
                    }
                }
            } else if (i7 == i5) {
                arrayList.set(arrayList.size() - 1, str);
            } else {
                arrayList.add(str);
            }
        }
        return new Pair(arrayList.toArray(new String[0]), Integer.valueOf(i6));
    }
}
