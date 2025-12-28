package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.q;
import com.bumptech.glide.b;
import com.bumptech.glide.i;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class v extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private final a f11228a;

    /* renamed from: b  reason: collision with root package name */
    private final s f11229b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f11230c;

    /* renamed from: d  reason: collision with root package name */
    private v f11231d;

    /* renamed from: e  reason: collision with root package name */
    private i f11232e;

    /* renamed from: f  reason: collision with root package name */
    private Fragment f11233f;

    private class a implements s {
        a() {
        }

        public Set a() {
            Set<v> i4 = v.this.i();
            HashSet hashSet = new HashSet(i4.size());
            for (v vVar : i4) {
                if (vVar.l() != null) {
                    hashSet.add(vVar.l());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + v.this + "}";
        }
    }

    public v() {
        this(new a());
    }

    private void h(v vVar) {
        this.f11230c.add(vVar);
    }

    private Fragment k() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return this.f11233f;
    }

    private static q m(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    private boolean n(Fragment fragment) {
        Fragment k4 = k();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(k4)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void o(Context context, q qVar) {
        r();
        v s4 = b.c(context).k().s(qVar);
        this.f11231d = s4;
        if (!equals(s4)) {
            this.f11231d.h(this);
        }
    }

    private void p(v vVar) {
        this.f11230c.remove(vVar);
    }

    private void r() {
        v vVar = this.f11231d;
        if (vVar != null) {
            vVar.p(this);
            this.f11231d = null;
        }
    }

    /* access modifiers changed from: package-private */
    public Set i() {
        v vVar = this.f11231d;
        if (vVar == null) {
            return Collections.emptySet();
        }
        if (equals(vVar)) {
            return Collections.unmodifiableSet(this.f11230c);
        }
        HashSet hashSet = new HashSet();
        for (v vVar2 : this.f11231d.i()) {
            if (n(vVar2.k())) {
                hashSet.add(vVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    public a j() {
        return this.f11228a;
    }

    public i l() {
        return this.f11232e;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        q m4 = m(this);
        if (m4 != null) {
            try {
                o(getContext(), m4);
            } catch (IllegalStateException e4) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e4);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f11228a.a();
        r();
    }

    public void onDetach() {
        super.onDetach();
        this.f11233f = null;
        r();
    }

    public void onStart() {
        super.onStart();
        this.f11228a.b();
    }

    public void onStop() {
        super.onStop();
        this.f11228a.c();
    }

    /* access modifiers changed from: package-private */
    public void q(Fragment fragment) {
        q m4;
        this.f11233f = fragment;
        if (fragment != null && fragment.getContext() != null && (m4 = m(fragment)) != null) {
            o(fragment.getContext(), m4);
        }
    }

    public String toString() {
        return super.toString() + "{parent=" + k() + "}";
    }

    public v(a aVar) {
        this.f11229b = new a();
        this.f11230c = new HashSet();
        this.f11228a = aVar;
    }
}
