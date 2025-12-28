package a2;

import Y1.h;
import Y1.i;
import com.ibm.icu.impl.CacheValue;
import com.ibm.icu.util.ICUCloneNotSupportedException;
import com.ibm.icu.util.ULocale;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.MissingResourceException;

/* renamed from: a2.a  reason: case insensitive filesystem */
public abstract class C0359a implements Cloneable {

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f2256c = h.a("breakiterator");

    /* renamed from: d  reason: collision with root package name */
    private static final CacheValue[] f2257d = new CacheValue[5];

    /* renamed from: e  reason: collision with root package name */
    private static b f2258e;

    /* renamed from: a  reason: collision with root package name */
    private ULocale f2259a;

    /* renamed from: b  reason: collision with root package name */
    private ULocale f2260b;

    /* renamed from: a2.a$a  reason: collision with other inner class name */
    private static final class C0045a {

        /* renamed from: a  reason: collision with root package name */
        private C0359a f2261a;

        /* renamed from: b  reason: collision with root package name */
        private ULocale f2262b;

        C0045a(ULocale uLocale, C0359a aVar) {
            this.f2262b = uLocale;
            this.f2261a = (C0359a) aVar.clone();
        }

        /* access modifiers changed from: package-private */
        public C0359a a() {
            return (C0359a) this.f2261a.clone();
        }

        /* access modifiers changed from: package-private */
        public ULocale b() {
            return this.f2262b;
        }
    }

    /* renamed from: a2.a$b */
    static abstract class b {
        b() {
        }

        public abstract C0359a a(ULocale uLocale, int i4);
    }

    protected C0359a() {
    }

    public static C0359a d(ULocale uLocale, int i4) {
        C0045a aVar;
        if (uLocale != null) {
            CacheValue[] cacheValueArr = f2257d;
            CacheValue cacheValue = cacheValueArr[i4];
            if (cacheValue != null && (aVar = (C0045a) cacheValue.b()) != null && aVar.b().equals(uLocale)) {
                return aVar.a();
            }
            C0359a a4 = k().a(uLocale, i4);
            cacheValueArr[i4] = CacheValue.c(new C0045a(uLocale, a4));
            return a4;
        }
        throw new NullPointerException("Specified locale is null");
    }

    public static C0359a g() {
        return i(ULocale.getDefault());
    }

    public static C0359a i(ULocale uLocale) {
        return d(uLocale, 0);
    }

    public static C0359a j(ULocale uLocale) {
        return d(uLocale, 3);
    }

    private static b k() {
        if (f2258e == null) {
            Class<C0360b> cls = C0360b.class;
            try {
                i iVar = C0360b.f2263a;
                f2258e = cls.newInstance();
            } catch (MissingResourceException e4) {
                throw e4;
            } catch (Exception e5) {
                if (f2256c) {
                    e5.printStackTrace();
                }
                throw new RuntimeException(e5.getMessage());
            }
        }
        return f2258e;
    }

    public static C0359a n(ULocale uLocale) {
        return d(uLocale, 1);
    }

    public abstract int b();

    public abstract int c(int i4);

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new ICUCloneNotSupportedException((Throwable) e4);
        }
    }

    public abstract CharacterIterator l();

    public abstract int o();

    public abstract int p(int i4);

    public int q(int i4) {
        int c4 = c(i4);
        while (c4 >= i4 && c4 != -1) {
            c4 = r();
        }
        return c4;
    }

    public abstract int r();

    /* access modifiers changed from: package-private */
    public final void s(ULocale uLocale, ULocale uLocale2) {
        boolean z3;
        boolean z4 = false;
        if (uLocale == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (uLocale2 == null) {
            z4 = true;
        }
        if (z3 == z4) {
            this.f2259a = uLocale;
            this.f2260b = uLocale2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void t(String str) {
        u(new StringCharacterIterator(str));
    }

    public abstract void u(CharacterIterator characterIterator);
}
