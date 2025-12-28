package androidx.core.text;

import java.util.Locale;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final o f5144a = new e((c) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final o f5145b = new e((c) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final o f5146c;

    /* renamed from: d  reason: collision with root package name */
    public static final o f5147d;

    /* renamed from: e  reason: collision with root package name */
    public static final o f5148e = new e(a.f5150b, false);

    /* renamed from: f  reason: collision with root package name */
    public static final o f5149f = f.f5155b;

    private static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        static final a f5150b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f5151a;

        private a(boolean z3) {
            this.f5151a = z3;
        }

        public int a(CharSequence charSequence, int i4, int i5) {
            int i6 = i5 + i4;
            boolean z3 = false;
            while (i4 < i6) {
                int a4 = p.a(Character.getDirectionality(charSequence.charAt(i4)));
                if (a4 != 0) {
                    if (a4 != 1) {
                        continue;
                        i4++;
                    } else if (!this.f5151a) {
                        return 1;
                    }
                } else if (this.f5151a) {
                    return 0;
                }
                z3 = true;
                i4++;
            }
            if (z3) {
                return this.f5151a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f5152a = new b();

        private b() {
        }

        public int a(CharSequence charSequence, int i4, int i5) {
            int i6 = i5 + i4;
            int i7 = 2;
            while (i4 < i6 && i7 == 2) {
                i7 = p.b(Character.getDirectionality(charSequence.charAt(i4)));
                i4++;
            }
            return i7;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i4, int i5);
    }

    private static abstract class d implements o {

        /* renamed from: a  reason: collision with root package name */
        private final c f5153a;

        d(c cVar) {
            this.f5153a = cVar;
        }

        private boolean c(CharSequence charSequence, int i4, int i5) {
            int a4 = this.f5153a.a(charSequence, i4, i5);
            if (a4 == 0) {
                return true;
            }
            if (a4 != 1) {
                return b();
            }
            return false;
        }

        public boolean a(CharSequence charSequence, int i4, int i5) {
            if (charSequence == null || i4 < 0 || i5 < 0 || charSequence.length() - i5 < i4) {
                throw new IllegalArgumentException();
            } else if (this.f5153a == null) {
                return b();
            } else {
                return c(charSequence, i4, i5);
            }
        }

        /* access modifiers changed from: protected */
        public abstract boolean b();
    }

    private static class e extends d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f5154b;

        e(c cVar, boolean z3) {
            super(cVar);
            this.f5154b = z3;
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            return this.f5154b;
        }
    }

    private static class f extends d {

        /* renamed from: b  reason: collision with root package name */
        static final f f5155b = new f();

        f() {
            super((c) null);
        }

        /* access modifiers changed from: protected */
        public boolean b() {
            if (q.a(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        b bVar = b.f5152a;
        f5146c = new e(bVar, false);
        f5147d = new e(bVar, true);
    }

    static int a(int i4) {
        if (i4 != 0) {
            return (i4 == 1 || i4 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i4) {
        if (i4 != 0) {
            if (i4 == 1 || i4 == 2) {
                return 0;
            }
            switch (i4) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
