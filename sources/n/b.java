package N;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

abstract class b {

    public interface a {
        void a(Object obj, Rect rect);
    }

    /* renamed from: N.b$b  reason: collision with other inner class name */
    public interface C0014b {
        Object a(Object obj, int i4);

        int b(Object obj);
    }

    private static class c implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f965a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        private final Rect f966b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        private final boolean f967c;

        /* renamed from: d  reason: collision with root package name */
        private final a f968d;

        c(boolean z3, a aVar) {
            this.f967c = z3;
            this.f968d = aVar;
        }

        public int compare(Object obj, Object obj2) {
            Rect rect = this.f965a;
            Rect rect2 = this.f966b;
            this.f968d.a(obj, rect);
            this.f968d.a(obj2, rect2);
            int i4 = rect.top;
            int i5 = rect2.top;
            if (i4 < i5) {
                return -1;
            }
            if (i4 > i5) {
                return 1;
            }
            int i6 = rect.left;
            int i7 = rect2.left;
            if (i6 < i7) {
                if (this.f967c) {
                    return 1;
                }
                return -1;
            } else if (i6 <= i7) {
                int i8 = rect.bottom;
                int i9 = rect2.bottom;
                if (i8 < i9) {
                    return -1;
                }
                if (i8 > i9) {
                    return 1;
                }
                int i10 = rect.right;
                int i11 = rect2.right;
                if (i10 < i11) {
                    if (this.f967c) {
                        return 1;
                    }
                    return -1;
                } else if (i10 <= i11) {
                    return 0;
                } else {
                    if (this.f967c) {
                        return -1;
                    }
                    return 1;
                }
            } else if (this.f967c) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    private static boolean a(int i4, Rect rect, Rect rect2, Rect rect3) {
        boolean b4 = b(i4, rect, rect2);
        if (b(i4, rect, rect3) || !b4) {
            return false;
        }
        if (!j(i4, rect, rect3) || i4 == 17 || i4 == 66) {
            return true;
        }
        if (k(i4, rect, rect2) < m(i4, rect, rect3)) {
            return true;
        }
        return false;
    }

    private static boolean b(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static Object c(Object obj, C0014b bVar, a aVar, Object obj2, Rect rect, int i4) {
        Rect rect2 = new Rect(rect);
        if (i4 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i4 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i4 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i4 == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int b4 = bVar.b(obj);
        Rect rect3 = new Rect();
        Object obj3 = null;
        for (int i5 = 0; i5 < b4; i5++) {
            Object a4 = bVar.a(obj, i5);
            if (a4 != obj2) {
                aVar.a(a4, rect3);
                if (h(i4, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    obj3 = a4;
                }
            }
        }
        return obj3;
    }

    public static Object d(Object obj, C0014b bVar, a aVar, Object obj2, int i4, boolean z3, boolean z4) {
        int b4 = bVar.b(obj);
        ArrayList arrayList = new ArrayList(b4);
        for (int i5 = 0; i5 < b4; i5++) {
            arrayList.add(bVar.a(obj, i5));
        }
        Collections.sort(arrayList, new c(z3, aVar));
        if (i4 == 1) {
            return f(obj2, arrayList, z4);
        }
        if (i4 == 2) {
            return e(obj2, arrayList, z4);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static Object e(Object obj, ArrayList arrayList, boolean z3) {
        int i4;
        int size = arrayList.size();
        if (obj == null) {
            i4 = -1;
        } else {
            i4 = arrayList.lastIndexOf(obj);
        }
        int i5 = i4 + 1;
        if (i5 < size) {
            return arrayList.get(i5);
        }
        if (!z3 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static Object f(Object obj, ArrayList arrayList, boolean z3) {
        int i4;
        int size = arrayList.size();
        if (obj == null) {
            i4 = size;
        } else {
            i4 = arrayList.indexOf(obj);
        }
        int i5 = i4 - 1;
        if (i5 >= 0) {
            return arrayList.get(i5);
        }
        if (!z3 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int g(int i4, int i5) {
        return (i4 * 13 * i4) + (i5 * i5);
    }

    private static boolean h(int i4, Rect rect, Rect rect2, Rect rect3) {
        if (!i(rect, rect2, i4)) {
            return false;
        }
        if (!i(rect, rect3, i4) || a(i4, rect, rect2, rect3)) {
            return true;
        }
        if (!a(i4, rect, rect3, rect2) && g(k(i4, rect, rect2), o(i4, rect, rect2)) < g(k(i4, rect, rect3), o(i4, rect, rect3))) {
            return true;
        }
        return false;
    }

    private static boolean i(Rect rect, Rect rect2, int i4) {
        if (i4 == 17) {
            int i5 = rect.right;
            int i6 = rect2.right;
            if ((i5 > i6 || rect.left >= i6) && rect.left > rect2.left) {
                return true;
            }
            return false;
        } else if (i4 == 33) {
            int i7 = rect.bottom;
            int i8 = rect2.bottom;
            if ((i7 > i8 || rect.top >= i8) && rect.top > rect2.top) {
                return true;
            }
            return false;
        } else if (i4 == 66) {
            int i9 = rect.left;
            int i10 = rect2.left;
            if ((i9 < i10 || rect.right <= i10) && rect.right < rect2.right) {
                return true;
            }
            return false;
        } else if (i4 == 130) {
            int i11 = rect.top;
            int i12 = rect2.top;
            if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    private static boolean j(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    } else if (rect.bottom <= rect2.top) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (rect.right <= rect2.left) {
                    return true;
                } else {
                    return false;
                }
            } else if (rect.top >= rect2.bottom) {
                return true;
            } else {
                return false;
            }
        } else if (rect.left >= rect2.right) {
            return true;
        } else {
            return false;
        }
    }

    private static int k(int i4, Rect rect, Rect rect2) {
        return Math.max(0, l(i4, rect, rect2));
    }

    private static int l(int i4, Rect rect, Rect rect2) {
        int i5;
        int i6;
        if (i4 == 17) {
            i5 = rect.left;
            i6 = rect2.right;
        } else if (i4 == 33) {
            i5 = rect.top;
            i6 = rect2.bottom;
        } else if (i4 == 66) {
            i5 = rect2.left;
            i6 = rect.right;
        } else if (i4 == 130) {
            i5 = rect2.top;
            i6 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i5 - i6;
    }

    private static int m(int i4, Rect rect, Rect rect2) {
        return Math.max(1, n(i4, rect, rect2));
    }

    private static int n(int i4, Rect rect, Rect rect2) {
        int i5;
        int i6;
        if (i4 == 17) {
            i5 = rect.left;
            i6 = rect2.left;
        } else if (i4 == 33) {
            i5 = rect.top;
            i6 = rect2.top;
        } else if (i4 == 66) {
            i5 = rect2.right;
            i6 = rect.right;
        } else if (i4 == 130) {
            i5 = rect2.bottom;
            i6 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i5 - i6;
    }

    private static int o(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
