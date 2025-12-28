package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.b;
import com.bumptech.glide.i;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class p extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private final a f11180a;

    /* renamed from: b  reason: collision with root package name */
    private final s f11181b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f11182c;

    /* renamed from: d  reason: collision with root package name */
    private i f11183d;

    /* renamed from: e  reason: collision with root package name */
    private p f11184e;

    /* renamed from: f  reason: collision with root package name */
    private Fragment f11185f;

    private class a implements s {
        a() {
        }

        public Set a() {
            Set<p> b4 = p.this.b();
            HashSet hashSet = new HashSet(b4.size());
            for (p pVar : b4) {
                if (pVar.e() != null) {
                    hashSet.add(pVar.e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + p.this + "}";
        }
    }

    public p() {
        this(new a());
    }

    private void a(p pVar) {
        this.f11182c.add(pVar);
    }

    private Fragment d() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return this.f11185f;
    }

    private boolean g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void h(Activity activity) {
        l();
        p q4 = b.c(activity).k().q(activity);
        this.f11184e = q4;
        if (!equals(q4)) {
            this.f11184e.a(this);
        }
    }

    private void i(p pVar) {
        this.f11182c.remove(pVar);
    }

    private void l() {
        p pVar = this.f11184e;
        if (pVar != null) {
            pVar.i(this);
            this.f11184e = null;
        }
    }

    /* access modifiers changed from: package-private */
    public Set b() {
        if (equals(this.f11184e)) {
            return Collections.unmodifiableSet(this.f11182c);
        }
        if (this.f11184e == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (p pVar : this.f11184e.b()) {
            if (g(pVar.getParentFragment())) {
                hashSet.add(pVar);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    public a c() {
        return this.f11180a;
    }

    public i e() {
        return this.f11183d;
    }

    public s f() {
        return this.f11181b;
    }

    /* access modifiers changed from: package-private */
    public void j(Fragment fragment) {
        this.f11185f = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            h(fragment.getActivity());
        }
    }

    public void k(i iVar) {
        this.f11183d = iVar;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            h(activity);
        } catch (IllegalStateException e4) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e4);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f11180a.a();
        l();
    }

    public void onDetach() {
        super.onDetach();
        l();
    }

    public void onStart() {
        super.onStart();
        this.f11180a.b();
    }

    public void onStop() {
        super.onStop();
        this.f11180a.c();
    }

    public String toString() {
        return super.toString() + "{parent=" + d() + "}";
    }

    p(a aVar) {
        this.f11181b = new a();
        this.f11182c = new HashSet();
        this.f11180a = aVar;
    }
}
