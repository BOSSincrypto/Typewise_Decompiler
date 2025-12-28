package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C0718m;
import kotlin.collections.D;
import kotlin.collections.L;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

public final class FragmentStrictMode {

    /* renamed from: a  reason: collision with root package name */
    public static final FragmentStrictMode f5905a = new FragmentStrictMode();

    /* renamed from: b  reason: collision with root package name */
    private static b f5906b = b.f5909d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "(Ljava/lang/String;I)V", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface a {
    }

    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        public static final a f5908c = new a((i) null);

        /* renamed from: d  reason: collision with root package name */
        public static final b f5909d = new b(L.e(), (a) null, D.h());

        /* renamed from: a  reason: collision with root package name */
        private final Set f5910a;

        /* renamed from: b  reason: collision with root package name */
        private final Map f5911b;

        public static final class a {
            public /* synthetic */ a(i iVar) {
                this();
            }

            private a() {
            }
        }

        public b(Set set, a aVar, Map map) {
            o.e(set, "flags");
            o.e(map, "allowedViolations");
            this.f5910a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((Class) entry.getKey(), (Set) entry.getValue());
            }
            this.f5911b = linkedHashMap;
        }

        public final Set a() {
            return this.f5910a;
        }

        public final a b() {
            return null;
        }

        public final Map c() {
            return this.f5911b;
        }
    }

    private FragmentStrictMode() {
    }

    private final b b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                q parentFragmentManager = fragment.getParentFragmentManager();
                o.d(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.w0() != null) {
                    b w02 = parentFragmentManager.w0();
                    o.b(w02);
                    o.d(w02, "fragmentManager.strictModePolicy!!");
                    return w02;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f5906b;
    }

    private final void c(b bVar, Violation violation) {
        Fragment fragment = violation.getFragment();
        String name = fragment.getClass().getName();
        if (bVar.a().contains(Flag.PENALTY_LOG)) {
            o.k("Policy violation in ", name);
        }
        bVar.b();
        if (bVar.a().contains(Flag.PENALTY_DEATH)) {
            o(fragment, new R.a(name, violation));
        }
    }

    /* access modifiers changed from: private */
    public static final void d(String str, Violation violation) {
        o.e(violation, "$violation");
        Log.e("FragmentStrictMode", o.k("Policy violation with PENALTY_DEATH in ", str), violation);
        throw violation;
    }

    private final void e(Violation violation) {
        if (q.D0(3)) {
            o.k("StrictMode violation in ", violation.getFragment().getClass().getName());
        }
    }

    public static final void f(Fragment fragment, String str) {
        o.e(fragment, "fragment");
        o.e(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        FragmentStrictMode fragmentStrictMode = f5905a;
        fragmentStrictMode.e(fragmentReuseViolation);
        b b4 = fragmentStrictMode.b(fragment);
        if (b4.a().contains(Flag.DETECT_FRAGMENT_REUSE) && fragmentStrictMode.p(b4, fragment.getClass(), fragmentReuseViolation.getClass())) {
            fragmentStrictMode.c(b4, fragmentReuseViolation);
        }
    }

    public static final void g(Fragment fragment, ViewGroup viewGroup) {
        o.e(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        FragmentStrictMode fragmentStrictMode = f5905a;
        fragmentStrictMode.e(fragmentTagUsageViolation);
        b b4 = fragmentStrictMode.b(fragment);
        if (b4.a().contains(Flag.DETECT_FRAGMENT_TAG_USAGE) && fragmentStrictMode.p(b4, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            fragmentStrictMode.c(b4, fragmentTagUsageViolation);
        }
    }

    public static final void h(Fragment fragment) {
        o.e(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f5905a;
        fragmentStrictMode.e(getRetainInstanceUsageViolation);
        b b4 = fragmentStrictMode.b(fragment);
        if (b4.a().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.p(b4, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.c(b4, getRetainInstanceUsageViolation);
        }
    }

    public static final void i(Fragment fragment) {
        o.e(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f5905a;
        fragmentStrictMode.e(getTargetFragmentRequestCodeUsageViolation);
        b b4 = fragmentStrictMode.b(fragment);
        if (b4.a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.p(b4, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            fragmentStrictMode.c(b4, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    public static final void j(Fragment fragment) {
        o.e(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f5905a;
        fragmentStrictMode.e(getTargetFragmentUsageViolation);
        b b4 = fragmentStrictMode.b(fragment);
        if (b4.a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.p(b4, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.c(b4, getTargetFragmentUsageViolation);
        }
    }

    public static final void k(Fragment fragment) {
        o.e(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = f5905a;
        fragmentStrictMode.e(setRetainInstanceUsageViolation);
        b b4 = fragmentStrictMode.b(fragment);
        if (b4.a().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.p(b4, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.c(b4, setRetainInstanceUsageViolation);
        }
    }

    public static final void l(Fragment fragment, Fragment fragment2, int i4) {
        o.e(fragment, "violatingFragment");
        o.e(fragment2, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(fragment, fragment2, i4);
        FragmentStrictMode fragmentStrictMode = f5905a;
        fragmentStrictMode.e(setTargetFragmentUsageViolation);
        b b4 = fragmentStrictMode.b(fragment);
        if (b4.a().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.p(b4, fragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.c(b4, setTargetFragmentUsageViolation);
        }
    }

    public static final void m(Fragment fragment, boolean z3) {
        o.e(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z3);
        FragmentStrictMode fragmentStrictMode = f5905a;
        fragmentStrictMode.e(setUserVisibleHintViolation);
        b b4 = fragmentStrictMode.b(fragment);
        if (b4.a().contains(Flag.DETECT_SET_USER_VISIBLE_HINT) && fragmentStrictMode.p(b4, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            fragmentStrictMode.c(b4, setUserVisibleHintViolation);
        }
    }

    public static final void n(Fragment fragment, ViewGroup viewGroup) {
        o.e(fragment, "fragment");
        o.e(viewGroup, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
        FragmentStrictMode fragmentStrictMode = f5905a;
        fragmentStrictMode.e(wrongFragmentContainerViolation);
        b b4 = fragmentStrictMode.b(fragment);
        if (b4.a().contains(Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && fragmentStrictMode.p(b4, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            fragmentStrictMode.c(b4, wrongFragmentContainerViolation);
        }
    }

    private final void o(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler g4 = fragment.getParentFragmentManager().q0().g();
            o.d(g4, "fragment.parentFragmentManager.host.handler");
            if (o.a(g4.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                g4.post(runnable);
            }
        } else {
            runnable.run();
        }
    }

    private final boolean p(b bVar, Class cls, Class cls2) {
        Set set = (Set) bVar.c().get(cls);
        if (set == null) {
            return true;
        }
        if (o.a(cls2.getSuperclass(), Violation.class) || !C0718m.L(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
