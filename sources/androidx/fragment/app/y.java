package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    private final l f5945a;

    /* renamed from: b  reason: collision with root package name */
    private final ClassLoader f5946b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList f5947c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    int f5948d;

    /* renamed from: e  reason: collision with root package name */
    int f5949e;

    /* renamed from: f  reason: collision with root package name */
    int f5950f;

    /* renamed from: g  reason: collision with root package name */
    int f5951g;

    /* renamed from: h  reason: collision with root package name */
    int f5952h;

    /* renamed from: i  reason: collision with root package name */
    boolean f5953i;

    /* renamed from: j  reason: collision with root package name */
    boolean f5954j = true;

    /* renamed from: k  reason: collision with root package name */
    String f5955k;

    /* renamed from: l  reason: collision with root package name */
    int f5956l;

    /* renamed from: m  reason: collision with root package name */
    CharSequence f5957m;

    /* renamed from: n  reason: collision with root package name */
    int f5958n;

    /* renamed from: o  reason: collision with root package name */
    CharSequence f5959o;

    /* renamed from: p  reason: collision with root package name */
    ArrayList f5960p;

    /* renamed from: q  reason: collision with root package name */
    ArrayList f5961q;

    /* renamed from: r  reason: collision with root package name */
    boolean f5962r = false;

    /* renamed from: s  reason: collision with root package name */
    ArrayList f5963s;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f5964a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f5965b;

        /* renamed from: c  reason: collision with root package name */
        boolean f5966c;

        /* renamed from: d  reason: collision with root package name */
        int f5967d;

        /* renamed from: e  reason: collision with root package name */
        int f5968e;

        /* renamed from: f  reason: collision with root package name */
        int f5969f;

        /* renamed from: g  reason: collision with root package name */
        int f5970g;

        /* renamed from: h  reason: collision with root package name */
        Lifecycle.State f5971h;

        /* renamed from: i  reason: collision with root package name */
        Lifecycle.State f5972i;

        a() {
        }

        a(int i4, Fragment fragment) {
            this.f5964a = i4;
            this.f5965b = fragment;
            this.f5966c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f5971h = state;
            this.f5972i = state;
        }

        a(int i4, Fragment fragment, boolean z3) {
            this.f5964a = i4;
            this.f5965b = fragment;
            this.f5966c = z3;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f5971h = state;
            this.f5972i = state;
        }
    }

    y(l lVar, ClassLoader classLoader) {
        this.f5945a = lVar;
        this.f5946b = classLoader;
    }

    public y b(int i4, Fragment fragment, String str) {
        k(i4, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public y c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public y d(Fragment fragment, String str) {
        k(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar) {
        this.f5947c.add(aVar);
        aVar.f5967d = this.f5948d;
        aVar.f5968e = this.f5949e;
        aVar.f5969f = this.f5950f;
        aVar.f5970g = this.f5951g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    public y j() {
        if (!this.f5953i) {
            this.f5954j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    public void k(int i4, Fragment fragment, String str, int i5) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            FragmentStrictMode.f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 == null || str.equals(str3)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i4 != 0) {
            if (i4 != -1) {
                int i6 = fragment.mFragmentId;
                if (i6 == 0 || i6 == i4) {
                    fragment.mFragmentId = i4;
                    fragment.mContainerId = i4;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i4);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        e(new a(i5, fragment));
    }

    public y l(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public y m(int i4, Fragment fragment) {
        return n(i4, fragment, (String) null);
    }

    public y n(int i4, Fragment fragment, String str) {
        if (i4 != 0) {
            k(i4, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public y o(boolean z3) {
        this.f5962r = z3;
        return this;
    }
}
