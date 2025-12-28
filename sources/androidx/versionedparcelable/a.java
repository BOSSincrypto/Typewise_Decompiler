package androidx.versionedparcelable;

import android.os.Parcelable;
import e0.C0642a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import y.C0939a;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final C0939a f7046a;

    /* renamed from: b  reason: collision with root package name */
    protected final C0939a f7047b;

    /* renamed from: c  reason: collision with root package name */
    protected final C0939a f7048c;

    public a(C0939a aVar, C0939a aVar2, C0939a aVar3) {
        this.f7046a = aVar;
        this.f7047b = aVar2;
        this.f7048c = aVar3;
    }

    private void N(C0642a aVar) {
        try {
            I(c(aVar.getClass()).getName());
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(aVar.getClass().getSimpleName() + " does not have a Parcelizer", e4);
        }
    }

    private Class c(Class cls) {
        Class cls2 = (Class) this.f7048c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f7048c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) {
        Method method = (Method) this.f7046a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Class<a> cls = a.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f7046a.put(str, declaredMethod);
        return declaredMethod;
    }

    private Method e(Class cls) {
        Method method = (Method) this.f7047b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c4 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c4.getDeclaredMethod("write", new Class[]{cls, a.class});
        this.f7047b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i4) {
        w(i4);
        A(bArr);
    }

    /* access modifiers changed from: protected */
    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i4) {
        w(i4);
        C(charSequence);
    }

    /* access modifiers changed from: protected */
    public abstract void E(int i4);

    public void F(int i4, int i5) {
        w(i5);
        E(i4);
    }

    /* access modifiers changed from: protected */
    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i4) {
        w(i4);
        G(parcelable);
    }

    /* access modifiers changed from: protected */
    public abstract void I(String str);

    public void J(String str, int i4) {
        w(i4);
        I(str);
    }

    /* access modifiers changed from: protected */
    public void K(C0642a aVar, a aVar2) {
        try {
            e(aVar.getClass()).invoke((Object) null, new Object[]{aVar, aVar2});
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        }
    }

    /* access modifiers changed from: protected */
    public void L(C0642a aVar) {
        if (aVar == null) {
            I((String) null);
            return;
        }
        N(aVar);
        a b4 = b();
        K(aVar, b4);
        b4.a();
    }

    public void M(C0642a aVar, int i4) {
        w(i4);
        L(aVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract a b();

    public boolean f() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean g();

    public boolean h(boolean z3, int i4) {
        if (!m(i4)) {
            return z3;
        }
        return g();
    }

    /* access modifiers changed from: protected */
    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i4) {
        if (!m(i4)) {
            return bArr;
        }
        return i();
    }

    /* access modifiers changed from: protected */
    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i4) {
        if (!m(i4)) {
            return charSequence;
        }
        return k();
    }

    /* access modifiers changed from: protected */
    public abstract boolean m(int i4);

    /* access modifiers changed from: protected */
    public C0642a n(String str, a aVar) {
        try {
            return (C0642a) d(str).invoke((Object) null, new Object[]{aVar});
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        }
    }

    /* access modifiers changed from: protected */
    public abstract int o();

    public int p(int i4, int i5) {
        if (!m(i5)) {
            return i4;
        }
        return o();
    }

    /* access modifiers changed from: protected */
    public abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int i4) {
        if (!m(i4)) {
            return parcelable;
        }
        return q();
    }

    /* access modifiers changed from: protected */
    public abstract String s();

    public String t(String str, int i4) {
        if (!m(i4)) {
            return str;
        }
        return s();
    }

    /* access modifiers changed from: protected */
    public C0642a u() {
        String s4 = s();
        if (s4 == null) {
            return null;
        }
        return n(s4, b());
    }

    public C0642a v(C0642a aVar, int i4) {
        if (!m(i4)) {
            return aVar;
        }
        return u();
    }

    /* access modifiers changed from: protected */
    public abstract void w(int i4);

    public void x(boolean z3, boolean z4) {
    }

    /* access modifiers changed from: protected */
    public abstract void y(boolean z3);

    public void z(boolean z3, int i4) {
        w(i4);
        y(z3);
    }
}
